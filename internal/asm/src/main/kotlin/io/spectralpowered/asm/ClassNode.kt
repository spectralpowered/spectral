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

import io.spectralpowered.asm.util.IrClass
import io.spectralpowered.util.field
import io.spectralpowered.util.nullField
import org.mapleir.asm.ClassHelper
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import java.lang.reflect.Modifier

internal fun ClassNode.init(pool: ClassPool) {
    this.pool = pool
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

fun ClassNode.build() {
    methods.forEach { it.build() }
    fields.forEach { it.build() }

    superClass = pool.findClass(superName, true)
    superClass?.children?.add(this)
    interfaces.mapNotNull { pool.findClass(it, true) }.forEach {
        interfaceClasses.add(it)
        it.children.add(this)
    }
}

internal fun ClassNode.clean() {
    superClass = null
    children.clear()
    interfaceClasses.clear()
    methods.forEach { it.clean() }
    fields.forEach { it.clean() }
}

var ClassNode.pool: ClassPool by field()
var ClassNode.ignored: Boolean by field { false }

var ClassNode.superClass: ClassNode? by nullField()
val ClassNode.interfaceClasses: HashSet<ClassNode> by field { hashSetOf() }
val ClassNode.children: HashSet<ClassNode> by field { hashSetOf() }

val ClassNode.identifier get() = name
val ClassNode.type get() = Type.getObjectType(name)

val ClassNode.irNode: IrClass get() = ClassHelper.create(this)

fun ClassNode.isAbstract() = Modifier.isAbstract(access)
fun ClassNode.isInterface() = Modifier.isInterface(access)

fun ClassNode.findMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.findField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }

val ClassNode.superClassAndInterfaceClasses: List<ClassNode> get() {
    val cls = superClass
    return if(cls != null) {
        listOf(cls).plus(interfaceClasses)
    } else {
        interfaceClasses.toList()
    }
}

fun ClassNode.isOverride(name: String, desc: String): Boolean {
    val superClass = this.superClass
    if(superClass != null) {
        if(superClass.findMethod(name, desc) != null) {
            return true
        }
        if(superClass.isOverride(name, desc)) {
            return true
        }
    }
    for(superInterfaceClass in interfaceClasses) {
        if(superInterfaceClass.findMethod(name, desc) != null) {
            return true
        }
        if(superInterfaceClass.isOverride(name, desc)) {
            return true
        }
    }
    return false
}

fun ClassNode.isAssignableFrom(other: ClassNode): Boolean {
    return this == other || this.isSuperClassOf(other) || this.isSuperInterfaceOf(other)
}

fun ClassNode.toByteArray(): ByteArray {
    val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)
    this.accept(writer)
    return writer.toByteArray()
}

fun ClassNode.fromByteArray(bytes: ByteArray) {
    val reader = ClassReader(bytes)
    reader.accept(this, ClassReader.SKIP_FRAMES)
}

private tailrec fun ClassNode.isSuperClassOf(other: ClassNode): Boolean {
    val superClass = other.superClass ?: return false
    if(superClass == this) {
        return true
    }
    return this.isSuperClassOf(superClass)
}

private fun ClassNode.isSuperInterfaceOf(other: ClassNode): Boolean {
    for(superInterface in other.interfaceClasses) {
        if(superInterface == this || this.isSuperInterfaceOf(superInterface)) {
            return true
        }
    }
    return false
}