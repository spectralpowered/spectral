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

package io.spectralpowered.deobfuscator.transformer

import io.spectralpowered.asm.ClassPool
import io.spectralpowered.asm.identifier
import io.spectralpowered.asm.owner
import io.spectralpowered.asm.util.InheritanceGraph
import io.spectralpowered.asm.virtualFields
import io.spectralpowered.asm.virtualMethods
import io.spectralpowered.deobfuscator.Deobfuscator.Companion.isObfuscatedName
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.commons.SimpleRemapper
import org.tinylog.kotlin.Logger

class Renamer : Transformer() {

    private var classCount = 0
    private var methodCount = 0
    private var fieldCount = 0

    private val mappings = hashMapOf<String, String>()

    override fun preTransform(pool: ClassPool) {
        generateMappings(pool)
        applyMappings(pool)
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Renamed $classCount classes.")
        Logger.info("Renamed $methodCount methods.")
        Logger.info("Renamed $fieldCount fields.")
    }

    private fun generateMappings(pool: ClassPool) {
        Logger.info("Generating mappings.")

        val inheritanceGraph = InheritanceGraph(pool)

        // Generate class names
        pool.classes.forEach classLoop@ { cls ->
            if(!cls.name.isObfuscatedName()) return@classLoop
            val newName = "class${++classCount}"
            mappings[cls.identifier] = newName
        }

        // Generate Method Names
        pool.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if(!method.name.isObfuscatedName() || mappings.containsKey(method.identifier)) return@methodLoop
                val newName = "method${++methodCount}"
                mappings[method.identifier] = newName
                inheritanceGraph[method.owner.name]!!.children.forEach { child ->
                    mappings["${child.name}.${method.name}${method.desc}"] = newName
                }
            }
        }

        // Generate Field Names
        pool.classes.forEach { cls ->
            cls.fields.forEach fieldLoop@ { field ->
                if(!field.name.isObfuscatedName() || mappings.containsKey(field.identifier)) return@fieldLoop
                val newName = "field${++fieldCount}"
                mappings[field.identifier] = newName
                inheritanceGraph[field.owner.name]!!.children.forEach { child ->
                    mappings["${child.name}.${field.name}"] = newName
                }
            }
        }
    }

    private fun applyMappings(pool: ClassPool) {
        Logger.info("Applying mappings.")
        pool.remap(SimpleRemapper(mappings))
    }
}