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

import org.mapleir.context.IRCache
import org.mapleir.ir.cfg.builder.ControlFlowGraphBuilder
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.io.FileOutputStream
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

class ClassPool {

    private val classSet = hashSetOf<ClassNode>()

    val irCache = IRCache { ControlFlowGraphBuilder(it, false).buildImpl() }

    val classes get() = classSet.filter { !it.ignored }.toSet()
    val ignoredClasses get() = classSet.filter { it.ignored }.toSet()
    val allClasses get() = classSet.toSet()

    fun clear() {
        classSet.clear()
    }

    fun addClass(node: ClassNode) {
        classSet.add(node)
        node.init(this)
    }

    fun removeClass(node: ClassNode) {
        classSet.remove(node)
    }

    fun findClass(name: String, includeIgnored: Boolean = false) = allClasses
        .filter { !it.ignored || includeIgnored }
        .firstOrNull { it.name == name }

    fun build() {
        irCache.clear()
        classes.forEach { it.build() }
    }

    fun addJar(file: File) {
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(!entry.name.endsWith(".class")) return@forEach
                val node = ClassNode()
                val reader = ClassReader(jar.getInputStream(entry).readAllBytes())
                reader.accept(node, ClassReader.SKIP_FRAMES)
                addClass(node)
            }
        }
    }

    fun writeJar(file: File) {
        if(file.exists()) file.deleteRecursively()
        JarOutputStream(FileOutputStream(file)).use { jos ->
            allClasses.forEach { cls ->
                val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)
                cls.accept(writer)
                jos.putNextEntry(JarEntry("${cls.name.replace(".", "/")}.class"))
                jos.write(writer.toByteArray())
                jos.closeEntry()
            }
        }
    }
}