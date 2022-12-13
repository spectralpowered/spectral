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

package io.spectralpowered.asm.tree

import io.spectralpowered.util.field
import org.mapleir.asm.ClassHelper
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

internal fun ClassNode.init(pool: ClassPool) {
    this.pool = pool
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

var ClassNode.pool: ClassPool by field()
var ClassNode.ignored: Boolean by field { false }

val ClassNode.id get() = name
val ClassNode.type get() = Type.getObjectType(name)
val ClassNode.ir get() = ClassHelper.create(this)

fun ClassNode.getMethod(name: String, desc: String): MethodNode? {
    return methods.firstOrNull { it.name == name && it.desc == desc }
}

fun ClassNode.getField(name: String, desc: String): FieldNode? {
    return fields.firstOrNull { it.name == name && it.desc == desc }
}
