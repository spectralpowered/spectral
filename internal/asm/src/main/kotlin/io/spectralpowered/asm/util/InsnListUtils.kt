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

package io.spectralpowered.asm.util

import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LabelNode

private val ANY_INSN = { _: AbstractInsnNode -> true }

fun getExpression(
    last: AbstractInsnNode,
    filter: (AbstractInsnNode) -> Boolean = ANY_INSN
): List<AbstractInsnNode>? {

    val expr = mutableListOf<AbstractInsnNode>()
    var height = 0
    var insn: AbstractInsnNode? = last

    do {
        val (pops, pushes) = insn!!.stackMetadata
        if (insn !== last) {
            expr.add(insn)
            height -= pushes
        }
        height += pops
        if (height == 0) {
            return expr.asReversed()
        }
        insn = insn.previous
    } while (insn != null && insn.isSequential && filter(insn))

    return null
}

fun InsnList.replaceExpression(
    last: AbstractInsnNode,
    replacement: AbstractInsnNode,
    filter: (AbstractInsnNode) -> Boolean = ANY_INSN
): Boolean {
    val expr = getExpression(last, filter) ?: return false
    expr.forEach(this::remove)
    this[last] = replacement
    return true
}

fun InsnList.deleteExpression(
    last: AbstractInsnNode,
    filter: (AbstractInsnNode) -> Boolean = ANY_INSN
): Boolean {
    val expr = getExpression(last, filter) ?: return false
    expr.forEach(this::remove)
    remove(last)
    return true
}

fun InsnList.clone(labels: Map<LabelNode, LabelNode>): InsnList {
    val copy = InsnList()
    for (insn in this) {
        copy.add(insn.clone(labels))
    }
    return copy
}

fun InsnList.append(previous: AbstractInsnNode, vararg insns: AbstractInsnNode) {
    check(contains(previous))
    insns.reversed().forEach { insert(previous, it) }
}

fun InsnList.prepend(next: AbstractInsnNode, vararg insns: AbstractInsnNode) {
    check(contains(next))
    insns.forEach { insertBefore(next, it) }
}

fun InsnList.delete(vararg insns: AbstractInsnNode) {
    insns.forEach {
        check(contains(it))
        remove(it)
    }
}

fun InsnList.replace(old: AbstractInsnNode, replacement: AbstractInsnNode) {
    check(contains(old))
    set(old, replacement)
}