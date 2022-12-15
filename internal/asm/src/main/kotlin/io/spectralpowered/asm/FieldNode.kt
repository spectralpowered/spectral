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

import io.spectralpowered.asm.util.IrField
import io.spectralpowered.util.field
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import java.lang.reflect.Modifier

internal fun FieldNode.init(owner: ClassNode) {
    this.owner = owner
}

fun FieldNode.build() {
    irNode = IrField(this, owner.irNode)
}

var FieldNode.owner: ClassNode by field()
var FieldNode.irNode: IrField by field()

val FieldNode.identifier get() = "${owner.identifier}.$name"
val FieldNode.type get() = Type.getType(desc)

fun FieldNode.isStatic() = Modifier.isStatic(access)
fun FieldNode.isPrivate() = Modifier.isPrivate(access)

val FieldNode.virtualFields: List<FieldNode> get() {
    val ret = mutableListOf<FieldNode>()
    if(isStatic()) {
        ret.add(this)
        return ret
    }
    findBaseFields(mutableListOf(), owner, name, desc).forEach {
        findInheritedFields(ret, mutableSetOf(), it.owner, it.name, it.desc)
    }
    return ret
}

private fun findBaseFields(fields: MutableList<FieldNode>, cls: ClassNode?, name: String, desc: String): MutableList<FieldNode> {
    if(cls == null) {
        return fields
    }

    val f = cls.findField(name, desc)
    if(f != null && !f.isStatic()) {
        fields.add(f)
    }

    val parentFields = findBaseFields(mutableListOf(), cls.superClass, name, desc)
    cls.interfaceClasses.forEach { parentFields.addAll(findBaseFields(mutableListOf(), it, name, desc)) }

    return if(parentFields.isEmpty()) fields else parentFields
}

private fun findInheritedFields(
    fields: MutableList<FieldNode>,
    visited: MutableSet<ClassNode>,
    cls: ClassNode?,
    name: String,
    desc: String
) {
    if(cls == null || visited.contains(cls)) {
        return
    }
    visited.add(cls)

    val f = cls.findField(name, desc)
    if(f != null && !f.isStatic()) {
        fields.add(f)
    }

    mutableListOf<ClassNode>().also {
        it.addAll(cls.children)
    }.forEach {
        findInheritedFields(fields, visited, it, name, desc)
    }
}