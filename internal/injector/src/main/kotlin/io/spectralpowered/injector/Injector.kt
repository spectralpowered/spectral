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
import io.spectralpowered.injector.asm.getAnnotationType
import io.spectralpowered.injector.asm.getValueOrDefault
import io.spectralpowered.injector.transformer.AbstractTransformer
import io.spectralpowered.injector.transformer.OverwriteTransformer
import org.objectweb.asm.tree.ClassNode
import org.tinylog.kotlin.Logger
import java.io.File
import java.io.FileNotFoundException

open class Injector(
    internal var targetJar: File,
    internal var mixinJar: File,
    internal var outputJar: File
) {

    /**
     * Internal use only constructor for making Companion object appear as invisible to Injector
     */
    internal constructor() : this(File(""), File(""), File(""))

    val targetPool = ClassPool()
    val mixinPool = ClassPool()

    private val mixinPairs = mutableListOf<Pair<ClassNode, ClassNode>>()
    private val transformers = mutableListOf<AbstractTransformer>()

    init {
        transformers.add(OverwriteTransformer())
    }

    fun run() {
        Logger.info("Running Spectral gamepack injector.")

        /*
         * Load classes from both target and mixin jars into their
         * respective pools
         */

        Logger.info("Loading classes from target jar.")
        targetPool.addJar(targetJar)
        targetPool.build()
        Logger.info("Successfully loaded ${targetPool.classes.size} classes into pool.")

        Logger.info("Loading classes from mixin jar.")
        mixinPool.addJar(mixinJar)
        mixinPool.build()
        Logger.info("Successfully loaded ${mixinPool.classes.size} classes into pool")

        /*
         * Scan mixin class pool for any class which is annotated with @Mixin.
         * From here we can resolve the associated target class as a MixinPair.
         */

        Logger.info("Searching for Mixin classes.")
        mixinPool.classes.forEach { mixinCls ->
            val annotationNode = mixinCls.visibleAnnotations.getAnnotationType(Mixin::class) ?: return@forEach
            val annotation = annotationNode.getValueOrDefault<String>("value", null)?.let { Mixin(it) } ?: return@forEach

            val targetCls = targetPool.findClass(annotation.value)
                ?: throw ClassNotFoundException("Could not find target class: ${annotation.value} for mixin class ${mixinCls.name}.")

            mixinPairs.add(targetCls to mixinCls)
        }
        Logger.info("Found ${mixinPairs.size} mixin classes to inject.")

        /*
         * Apply all of the injector transformers to each paired mixin class.
         */

        Logger.info("Injecting mixin classes.")
        mixinPairs.forEach {
            val targetCls = it.first
            val mixinCls = it.second

            Logger.info("Injecting mixin class: ${mixinCls.name}.")
            transformers.forEach { transformer ->
                transformer.transform(this, targetCls, mixinCls)
            }
        }
        Logger.info("Successfully injected mixin classes.")
    }

    companion object : Injector() {

        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 3) {
                throw IllegalArgumentException("Usage: injector.jar <target/gamepack> <mixin> <output>")
            }

            val targetJar = File(args[0])
            val mixinJar = File(args[1])
            val outputJar = File(args[2])

            if(!targetJar.exists()) {
                throw FileNotFoundException("Target jar file does not exist.")
            }

            if(!mixinJar.exists()) {
                throw FileNotFoundException("Mixin jar file does not exist.")
            }

            this.targetJar = targetJar
            this.mixinJar = mixinJar
            this.outputJar = outputJar

            this.run()
        }
    }
}