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

import io.spectralpowered.asm.Asm
import io.spectralpowered.asm.tree.ClassPool
import io.spectralpowered.asm.tree.ignored
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.reflect.full.createInstance

fun main(args: Array<String>) {
    if(args.size < 2) error("Usage: deobfuscator <input jar> <output jar>")

    val inputJar = File(args[0])
    val outputJar = File(args[1])
    val runTestClient = args.size == 3 && args[2] == "-t"
    if(!inputJar.exists()) error("Could not find input jar file: ${inputJar.path}.")

    val deobfuscator = Deobfuscator(inputJar, outputJar, runTestClient)
    deobfuscator.run()
}

class Deobfuscator(private val inputJar: File, val outputJar: File, private val runTestClient: Boolean = false) {

    private lateinit var pool: ClassPool

    private val transformers = mutableListOf<Transformer>()

    fun run() {
        Logger.info("Starting deobfuscator.")

        /*
         * Load classes from input jar into a class Pool.
         */
        Logger.info("Loading classes from jar: ${inputJar.path}.")

        pool = Asm.fromJar(inputJar)
        pool.allClasses.forEach { cls ->
            if (cls.name.contains("bouncycastle") || cls.name.contains("org/json")) {
                cls.ignored = true
            }
        }

        Logger.info("Loaded ${pool.classes.size} classes from jar.")

        /*
         * Load transformers
         */
        transformers.clear()

        Logger.info("Found ${transformers.size} registered transformers.")

        /*
         * Run transformers.
         */
        Logger.info("Running transformers.")
        transformers.forEach { transformer ->
            val start = System.currentTimeMillis()
            Logger.info("Running transformer: ${transformer::class.simpleName}.")
            transformer.run(pool)
            Logger.info("Finished transformer in ${System.currentTimeMillis() - start}ms.")
        }
        Logger.info("Completed all transformers.")

        Logger.info("Writing transformed classes to jar: ${outputJar.path}.")
        Asm.toJar(outputJar, pool)
        Logger.info("Successfully saved classes to jar.")

        /*
         * If enabled, run the test client.
         */
        if (runTestClient) {
            Logger.info("Starting test client from output jar.")
            TestClient(outputJar).start()
        }

        Logger.info("Deobfuscator completed successfully.")
    }

    private inline fun <reified T : Transformer> register() {
        transformers.add(T::class.createInstance())
    }

    companion object {

        fun String.isObfuscatedName(): Boolean {
            return (this.length <= 3 && this !in arrayOf("add", "run", "put", "get"))
                    || arrayOf("class", "method", "field", "arg", "var").any { this.startsWith(it) }
        }
    }
}