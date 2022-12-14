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

import io.spectralpowered.asm.identifier
import io.spectralpowered.asm.owner
import io.spectralpowered.asm.util.LabelMap
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.AbstractInsnNode.JUMP_INSN
import org.objectweb.asm.tree.AbstractInsnNode.LABEL
import org.objectweb.asm.tree.AbstractInsnNode.LOOKUPSWITCH_INSN
import org.objectweb.asm.tree.AbstractInsnNode.TABLESWITCH_INSN
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.BasicInterpreter
import org.objectweb.asm.tree.analysis.BasicValue
import java.util.*

class ControlFlowFixer : Transformer() {

    private var count = 0

    override fun transformMethod(method: MethodNode) {
        if(method.tryCatchBlocks.isNotEmpty()) return
        val cfg = ControlFlowGraph(method).also { it.build() }
        val newInsns = InsnList()
        if(cfg.blocks.isNotEmpty()) {
            val labelMap = LabelMap()
            val queue = Stack<Block>()
            val done = hashSetOf<Block>()
            queue.add(cfg.blocks.first())
            while(queue.isNotEmpty()) {
                val block = queue.pop()
                if(block in done) continue
                done.add(block)
                block.branches.forEach { queue.add(it.head) }
                block.next?.let { queue.add(it) }
                for(i in block.startIndex until block.endIndex) {
                    newInsns.add(method.instructions[i].clone(labelMap))
                }
            }
        }
        method.instructions = newInsns
        count += cfg.blocks.size
    }

    private class ControlFlowGraph(private val method: MethodNode) : Analyzer<BasicValue>(BasicInterpreter()) {

        val blocks = mutableListOf<Block>()

        private val head = Block()

        fun build() {
            analyze(method.owner.name, method)
            var id = 0
            blocks.forEach { block ->
                block.id = id++
                for(i in block.startIndex until block.endIndex) {
                    val insn = method.instructions[i]
                    block.instructions.add(insn)
                    if(insn is LineNumberNode) {
                        block.lineNumber = insn.line
                    }
                }
            }

            val orderedBlocks = orderedBlocks()
            blocks.clear()
            blocks.addAll(orderedBlocks)
        }

        override fun init(owner: String, method: MethodNode) {
            val insns = method.instructions.toArray()

            var cur = head
            blocks.add(cur)
            for(i in insns.indices) {
                val insn = insns[i]
                cur.endIndex++
                if(insn.next == null) break
                if(insn.next.type == LABEL ||
                    insn.type == JUMP_INSN ||
                    insn.type == LOOKUPSWITCH_INSN ||
                    insn.type == TABLESWITCH_INSN) {
                    cur = Block()
                    cur.startIndex = i + 1
                    cur.endIndex = i + 1
                    blocks.add(cur)
                }
            }
        }

        override fun newControlFlowEdge(insnIndex: Int, successorIndex: Int) {
            val block1 = blocks.first { insnIndex in it.startIndex until it.endIndex }
            val block2 = blocks.first { successorIndex in it.startIndex until it.endIndex }
            if(block1 != block2) {
                if(insnIndex + 1 == successorIndex) {
                    block1.next = block2
                    block2.prev = block1
                } else {
                    block1.branches.add(block2)
                }
            }
        }

        private fun orderedBlocks(): List<Block> {
            val results = mutableListOf<Block>()
            walk(head, results, hashSetOf())
            return results.asReversed()
        }

        private fun walk(cur: Block, ordered: MutableList<Block>, done: MutableSet<Block>) {
            val next = cur.next
            if (next != null && done.add(next)) {
                walk(cur.next!!, ordered, done)
            }
            val branches = cur.branches
            branches.sort()
            branches.forEach { branch ->
                if(done.add(branch)) {
                    walk(branch, ordered, done)
                }
            }
            ordered.add(cur)
        }

        override fun toString(): String {
            val str = StringBuilder()
            str.append("CFG: ${method.identifier}\n")
            blocks.forEach { block ->
                str.append("\tBLOCK: $block\n")
                block.branches.forEach { branch ->
                    str.append("\t\tBLOCK: $block\n")
                }
            }
            return str.toString()
        }
    }

    private class Block : Comparable<Block> {

        var id = -1
        var prev: Block? = null
        var next: Block? = null

        val branches = mutableListOf<Block>()

        var startIndex: Int = 0
        var endIndex: Int = 0
        var lineNumber = -1

        val instructions = mutableListOf<AbstractInsnNode>()

        val head: Block get() {
            var cur = this
            while(true) {
                if(cur.prev == null) {
                    return cur
                } else {
                    cur = cur.prev!!
                }
            }
        }

        override fun compareTo(other: Block): Int {
            if(lineNumber == other.lineNumber || lineNumber == -1 || other.lineNumber == -1) {
                return 0
            }
            return lineNumber.compareTo(other.lineNumber)
        }

        override fun toString(): String {
            return "$id - LINE: $lineNumber"
        }
    }
}