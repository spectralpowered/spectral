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

package io.spectralpowered.asm

import io.spectralpowered.asm.tree.ClassPool
import io.spectralpowered.asm.tree.pool
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.io.FileOutputStream
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

object Asm {

    fun fromBytes(data: ByteArray): ClassNode {
        val node = ClassNode()
        val reader = ClassReader(data)
        reader.accept(node, ClassReader.SKIP_FRAMES)
        return node
    }

    fun toBytes(node: ClassNode): ByteArray {
        val writer = AsmClassWriter(node.pool, ClassWriter.COMPUTE_FRAMES)
        node.accept(writer)
        return writer.toByteArray()
    }

    fun fromJar(file: File): ClassPool {
        val pool = ClassPool()
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(!entry.name.endsWith(".class")) return@forEach
                val node = fromBytes(jar.getInputStream(entry).readAllBytes())
                pool.addClass(node)
            }
        }
        return pool
    }

    fun toJar(file: File, pool: ClassPool) {
        if(file.exists()) {
            file.deleteRecursively()
        }

        JarOutputStream(FileOutputStream(file)).use { jos ->
            pool.allClasses.forEach { cls ->
                jos.putNextEntry(JarEntry("${cls.name}.class"))
                jos.write(toBytes(cls))
                jos.closeEntry()
            }
        }
    }

}