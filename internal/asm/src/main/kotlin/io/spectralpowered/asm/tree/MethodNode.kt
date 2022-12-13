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
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FrameNode
import org.objectweb.asm.tree.IincInsnNode
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.BasicInterpreter
import java.lang.reflect.Modifier

internal fun MethodNode.init(owner: ClassNode) {
    this.owner = owner
}

var MethodNode.owner: ClassNode by field()
val MethodNode.pool get() = owner.pool

val MethodNode.id get() = "${owner.id}.$name$desc"
val MethodNode.type get() = Type.getMethodType(desc)

fun MethodNode.isStatic() = Modifier.isStatic(access)
fun MethodNode.isAbstract() = Modifier.isAbstract(access)

fun MethodNode.isConstructor() = name == "<init>"
fun MethodNode.isInitializer() = name == "<clinit>"

private fun localIndex(access: Int, argTypes: Array<Type>, argIndex: Int): Int {
    var localIndex = 0
    if (access and Opcodes.ACC_STATIC == 0) {
        localIndex++
    }
    for (i in 0 until argIndex) {
        localIndex += argTypes[i].size
    }
    return localIndex
}

private fun remap(i: Int, argType: Type, localIndex: Int, newLocalIndex: Int): Int {
    return when {
        i > localIndex -> i - argType.size
        i == localIndex -> newLocalIndex
        else -> i
    }
}

private fun remapAll(indexes: List<Int>, argType: Type, localIndex: Int, newLocalIndex: Int): MutableList<Int> {
    return indexes.mapTo(mutableListOf()) { remap(it, argType, localIndex, newLocalIndex) }
}

fun MethodNode.removeArgument(argIndex: Int) {
    // remove argument from the descriptor
    val type = Type.getType(desc)
    val argType = type.argumentTypes[argIndex]
    val argTypes = type.argumentTypes.filterIndexed { index, _ -> index != argIndex }.toTypedArray()
    desc = Type.getMethodDescriptor(type.returnType, *argTypes)
    // the client doesn't use signatures so don't bother with them
    if (signature != null) {
        throw UnsupportedOperationException("Signatures unsupported")
    }
    parameters?.removeAt(argIndex)
    // remove annotations
    if (visibleAnnotableParameterCount != 0) {
        throw UnsupportedOperationException("Non-zero visibleAnnotableParameterCount unsupported")
    }
    if (visibleParameterAnnotations != null) {
        visibleParameterAnnotations =
            visibleParameterAnnotations.filterIndexed { index, _ -> index != argIndex }.toTypedArray()
    }
    if (invisibleAnnotableParameterCount != 0) {
        throw UnsupportedOperationException("Non-zero invisibleAnnotableParameterCount unsupported")
    }
    if (invisibleParameterAnnotations != null) {
        invisibleParameterAnnotations =
            invisibleParameterAnnotations.filterIndexed { index, _ -> index != argIndex }.toTypedArray()
    }
    // remap locals
    val localIndex = localIndex(access, argTypes, argIndex)
    val newLocalIndex = maxLocals - argType.size
    if (localVariables != null) {
        for (v in localVariables) {
            v.index = remap(v.index, argType, localIndex, newLocalIndex)
        }
    }
    if (visibleLocalVariableAnnotations != null) {
        for (annotation in visibleLocalVariableAnnotations) {
            annotation.index = remapAll(annotation.index, argType, localIndex, newLocalIndex)
        }
    }
    if (invisibleLocalVariableAnnotations != null) {
        for (annotation in invisibleLocalVariableAnnotations) {
            annotation.index = remapAll(annotation.index, argType, localIndex, newLocalIndex)
        }
    }
    var newLocalIndexUsed = false
    for (insn in instructions) {
        when (insn) {
            is VarInsnNode -> {
                insn.`var` = remap(insn.`var`, argType, localIndex, newLocalIndex)
                if (insn.`var` == newLocalIndex) {
                    newLocalIndexUsed = true
                }
            }
            is IincInsnNode -> {
                insn.`var` = remap(insn.`var`, argType, localIndex, newLocalIndex)
                if (insn.`var` == newLocalIndex) {
                    newLocalIndexUsed = true
                }
            }
            is FrameNode -> throw UnsupportedOperationException("SKIP_FRAMES and COMPUTE_FRAMES must be used")
        }
    }
    if (newLocalIndexUsed) {
        return
    }
    maxLocals -= argType.size
    if (localVariables != null) {
        localVariables.removeIf { it.index == newLocalIndex }
    }
    if (visibleLocalVariableAnnotations != null) {
        visibleLocalVariableAnnotations.removeIf { newLocalIndex in it.index }
    }
    if (invisibleLocalVariableAnnotations != null) {
        invisibleLocalVariableAnnotations.removeIf { newLocalIndex in it.index }
    }
}

fun MethodNode.removeDeadCode(owner: String) {
    var changed: Boolean
    do {
        changed = false
        val analyzer = Analyzer(BasicInterpreter())
        val frames = analyzer.analyze(owner, this)
        val it = instructions.iterator()
        var i = 0
        for (insn in it) {
            if (frames[i++] != null || insn is LabelNode) {
                continue
            }
            it.remove()
            changed = true
        }
        changed = changed or tryCatchBlocks.removeIf { it.isBodyEmpty() }
    } while (changed)
}

val MethodNode.hasCode: Boolean
    get() = access and (Opcodes.ACC_NATIVE or Opcodes.ACC_ABSTRACT) == 0

fun MethodNode.copy(): MethodNode {
    val copy = MethodNode(
        access,
        name,
        desc,
        signature,
        exceptions?.toTypedArray()
    )
    accept(copy)
    return copy
}