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

import io.spectralpowered.asm.util.IrMethod
import io.spectralpowered.util.field
import org.mapleir.ir.cfg.builder.ControlFlowGraphBuilder
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode
import java.lang.reflect.Modifier

fun MethodNode.init(owner: ClassNode) {
    this.owner = owner
}

fun MethodNode.build() {}
internal fun MethodNode.clean() {}

var MethodNode.owner: ClassNode by field()

val MethodNode.pool get() = owner.pool
val MethodNode.identifier get() = "${owner.identifier}.$name$desc"
val MethodNode.type get() = Type.getMethodType(desc)
val MethodNode.irNode get() = IrMethod(this, owner.irNode)

fun MethodNode.cfg() = ControlFlowGraphBuilder(irNode, false)

fun MethodNode.isStatic() = Modifier.isStatic(access)
fun MethodNode.isAbstract() = Modifier.isAbstract(access)

fun MethodNode.isConstructor() = name == "<init>"
fun MethodNode.isInitializer() = name == "<clinit>"

val MethodNode.virtualMethods: List<MethodNode> get() {
    val ret = mutableListOf<MethodNode>()
    if(isStatic()) {
        ret.add(this)
        return ret
    }
    findBaseMethods(mutableListOf(), owner, name, desc).forEach {
        findInheritedMethods(ret, mutableSetOf(), it.owner, it.name, it.desc)
    }
    return ret
}

private fun findBaseMethods(methods: MutableList<MethodNode>, cls: ClassNode?, name: String, desc: String): MutableList<MethodNode> {
    if(cls == null) {
        return methods
    }

    val m = cls.findMethod(name, desc)
    if(m != null && !m.isStatic()) {
        methods.add(m)
    }

    val parentMethods = findBaseMethods(mutableListOf(), cls.superClass, name, desc)
    cls.interfaceClasses.forEach { parentMethods.addAll(findBaseMethods(mutableListOf(), it, name, desc)) }

    return if(parentMethods.isEmpty()) methods else parentMethods
}

private fun findInheritedMethods(
    methods: MutableList<MethodNode>,
    visited: MutableSet<ClassNode>,
    cls: ClassNode? ,
    name: String,
    desc: String
) {
    if(cls == null || visited.contains(cls)) {
        return
    }
    visited.add(cls)

    val m = cls.findMethod(name, desc)
    if(m != null && !m.isStatic()) {
        methods.add(m)
    }

    mutableListOf<ClassNode>().also {
        it.addAll(cls.children)
        it.addAll(cls.interfaceClasses)
    }.forEach {
        findInheritedMethods(methods, visited, it, name, desc)
    }
}