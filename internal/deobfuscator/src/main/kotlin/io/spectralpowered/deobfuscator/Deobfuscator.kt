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

package io.spectralpowered.deobfuscator

import io.spectralpowered.asm.ClassPool
import io.spectralpowered.asm.ignored
import io.spectralpowered.deobfuscator.transformer.ScriptInterpreterCleaner
import io.spectralpowered.deobfuscator.transformer.ControlFlowFixer
import io.spectralpowered.deobfuscator.transformer.CopyPropagationFixer
import io.spectralpowered.deobfuscator.transformer.DeadCodeRemover
import io.spectralpowered.deobfuscator.transformer.ErrorConstructorRemover
import io.spectralpowered.deobfuscator.transformer.FernflowerExceptionFixer
import io.spectralpowered.deobfuscator.transformer.LocalVariableExprFixer
import io.spectralpowered.deobfuscator.transformer.FieldSorter
import io.spectralpowered.deobfuscator.transformer.GetPathFixer
import io.spectralpowered.deobfuscator.transformer.IllegalStateExceptionRemover
import io.spectralpowered.deobfuscator.transformer.MethodSorter
import io.spectralpowered.deobfuscator.transformer.MultiplierRemover
import io.spectralpowered.deobfuscator.transformer.RedundantGotoRemover
import io.spectralpowered.deobfuscator.transformer.RedundantLocalVariableRemover
import io.spectralpowered.deobfuscator.transformer.ReflectionCheckPatcher
import io.spectralpowered.deobfuscator.transformer.Renamer
import io.spectralpowered.deobfuscator.transformer.RuntimeExceptionRemover
import io.spectralpowered.deobfuscator.transformer.SpectralClassesAdder
import io.spectralpowered.deobfuscator.transformer.StackFrameFixer
import io.spectralpowered.deobfuscator.transformer.StaticFieldMover
import io.spectralpowered.deobfuscator.transformer.StaticMethodMover
import io.spectralpowered.deobfuscator.transformer.UnusedArgumentRemover
import io.spectralpowered.deobfuscator.transformer.UnusedFieldRemover
import io.spectralpowered.deobfuscator.transformer.UnusedMethodRemover
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.reflect.full.createInstance

class Deobfuscator(
    val inputJar: File,
    val outputJar: File,
    val addObfAnnotations: Boolean = false,
    val runTestClient: Boolean = false,
) {

    private val pool = ClassPool()
    private val transformers = mutableListOf<Transformer>()

    private fun init() {
        Logger.info("Loading classes from input jar.")

        pool.clear()
        pool.addJar(inputJar)
        pool.classes.forEach {
            if(it.name.contains("org/")) it.ignored = true
        }
        pool.build()
        Logger.info("Successfully loaded ${pool.classes.size} classes from archive.")

        /**
         * ===== REGISTER TRANSFORMERS =====
         */
        transformers.clear()

        register<RuntimeExceptionRemover>()
        register<DeadCodeRemover>()
        register<IllegalStateExceptionRemover>()
        register<DeadCodeRemover>()
        register<ControlFlowFixer>()
        register<ErrorConstructorRemover>()
        register<RedundantGotoRemover>()
        register<UnusedFieldRemover>()
        register<UnusedMethodRemover>()
        register<Renamer>()
        register<UnusedArgumentRemover>()
        register<CopyPropagationFixer>()
        register<MethodSorter>()
        register<FieldSorter>()
        register<LocalVariableExprFixer>()
        register<MultiplierRemover>()
        register<StackFrameFixer>()
        register<RedundantLocalVariableRemover>()
        register<FernflowerExceptionFixer>()
        register<StaticFieldMover>()
        register<StaticMethodMover>()
        register<GetPathFixer>()
        register<ScriptInterpreterCleaner>()
        register<ReflectionCheckPatcher>()
        register<StackFrameFixer>()
        register<SpectralClassesAdder>()

        Logger.info("Found ${transformers.size} registered transformers.")
    }

    fun run() {
        Logger.info("Running deobfuscator.")
        this.init()

        transformers.forEach { transformer ->
            Logger.info("Running transformer: ${transformer::class.simpleName}.")
            val start = System.currentTimeMillis()
            transformer.run(pool)
            val delta = System.currentTimeMillis() - start
            Logger.info("Finished transformer in ${delta}ms.")
        }

        Logger.info("Writing transformed classes to jar: ${outputJar.path}.")
        pool.writeJar(outputJar)
        Logger.info("Deobfuscator has finished successfully.")

        if(runTestClient) {
            Logger.info("Starting test Old School RuneScape client.")
            TestClient(outputJar).start()
        }
    }

    private inline fun <reified T : Transformer> register() {
        transformers.add(T::class.createInstance())
    }

    companion object {

        internal lateinit var INSTANCE: Deobfuscator private set

        fun String.isObfuscatedName(): Boolean {
            if(this.length <= 3) {
                return this != "run" && this != "add"
            }
            return arrayOf("class", "method", "field").any { this.startsWith(it) }
        }

        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size < 2) error("Usage: <input jar> <output jar> [-t]")

            val inputJar = File(args[0])
            val outputJar = File(args[1])
            val addObfAnnotations = args.size > 2 && args.any { it == "-a" }
            val runTestClient = args.size > 2 && args.any { it == "-t" }

            INSTANCE = Deobfuscator(inputJar, outputJar, addObfAnnotations, runTestClient)
            INSTANCE.run()
        }
    }
}