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
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import java.lang.reflect.Modifier

internal fun ClassNode.init(pool: ClassPool) {
    this.pool = pool
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

fun ClassNode.build() {
    irNode = ClassHelper.create(this)
    methods.forEach { it.build() }
    fields.forEach { it.build() }

    superClass = pool.findClass(superName, true)
    superClass?.children?.add(this)
    interfaces.mapNotNull { pool.findClass(it, true) }.forEach {
        it.children.add(this)
    }
}

var ClassNode.pool: ClassPool by field()
var ClassNode.ignored: Boolean by field { false }
var ClassNode.irNode: IrClass by field()

var ClassNode.superClass: ClassNode? by nullField()
val ClassNode.interfaceClasses: HashSet<ClassNode> by field { hashSetOf() }
val ClassNode.children: HashSet<ClassNode> by field { hashSetOf() }

val ClassNode.identifier get() = name
val ClassNode.type get() = Type.getObjectType(name)

fun ClassNode.isAbstract() = Modifier.isAbstract(access)
fun ClassNode.isInterface() = Modifier.isInterface(access)

fun ClassNode.findMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.findField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }