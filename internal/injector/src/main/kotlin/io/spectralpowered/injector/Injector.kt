/*
 *     Spectral Powered
 *     Copyright (C) 2022 <Kyle Escobar>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.spectralpowered.injector

import io.spectralpowered.asm.ClassPool
import io.spectralpowered.injector.annotation.Mixin
import io.spectralpowered.injector.transformer.AbstractTransformer
import io.spectralpowered.injector.transformer.MixinTransformer
import io.spectralpowered.injector.util.target
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.tinylog.kotlin.Logger
import java.io.File
import java.io.FileNotFoundException

class Injector private constructor(
    private val targetJar: File,
    private val mixinJar: File,
    private val outputJar: File
) {

    private val targetPool = ClassPool()
    private val mixinPool = ClassPool()

    private val pairings = mutableListOf<Pair<ClassNode, ClassNode>>()
    private val transformers = mutableListOf<AbstractTransformer>()

    init {
        transformers.add(MixinTransformer())
    }

    private fun run() {
        Logger.info("Starting Spectral injector.")

        /*
         * Load classes from jars into respective pools.
         */
        Logger.info("Loading classes from target jar.")
        targetPool.addJar(targetJar)
        targetPool.build()
        Logger.info("Loaded ${targetPool.classes.size} classes.")

        Logger.info("Loading classes from mixin jar.")
        mixinPool.addJar(mixinJar)
        mixinPool.build()
        Logger.info("Loaded ${mixinPool.classes.size} classes.")

        /*
         * Scan for @Mixin annotations and store the associated class pairs.
         */
        mixinPool.classes.forEach { mixinCls ->
            val target = mixinCls.target<Mixin>() ?: return@forEach
            targetPool.classes.forEach { targetCls ->
                if(target == targetCls.name) {
                    pairings.add(targetCls to mixinCls)
                }
            }
        }
        Logger.info("Found ${pairings.size} registered mixin classes.")

        Logger.info("Applying injection transforms.")
        pairings.forEach {
            runTransformers(it.first, it.second)
        }
        Logger.info("Successfully applied all transforms.")

        /*
         * Save the injected classes from the target pool to output jar.
         */
        Logger.info("Saving injected classes to output jar.")

        if(outputJar.exists()) outputJar.deleteRecursively()
        targetPool.writeJar(outputJar)

        Logger.info("Successfully completed injection.")
    }

    private fun runTransformers(targetCls: ClassNode, mixinCls: ClassNode) {
        transformers.forEach { transformer ->
            transformer.run(mixinCls, targetCls)
        }
    }

    companion object {

        fun inject(targetJar: File, mixinJar: File, outputJar: File) {
            val injector = Injector(targetJar, mixinJar, outputJar)
            injector.run()
        }

        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 3) {
                throw IllegalArgumentException("Usage: injector.jar <target-jar> <mixin-jar> <output-jar>")
            }

            val targetJar = File(args[0])
            val mixinJar = File(args[1])
            val outputJar = File(args[2])

            if(!targetJar.exists()) throw FileNotFoundException("Target jar: ${targetJar.path} does not exist.")
            if(!mixinJar.exists()) throw FileNotFoundException("Mixin jar: ${mixinJar.path} does not exist.")

            val injector = Injector(targetJar, mixinJar, outputJar)
            injector.run()
        }
    }
}