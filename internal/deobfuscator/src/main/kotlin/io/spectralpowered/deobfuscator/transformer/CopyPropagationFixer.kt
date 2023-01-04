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

import io.spectralpowered.asm.ClassPool
import io.spectralpowered.asm.analysis.DataFlowAnalyzer
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.IincInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode
import org.tinylog.kotlin.Logger
import java.util.*

class CopyPropagationFixer : Transformer() {

    private var count = 0

    override fun transformMethod(method: MethodNode) {
        val analyzer = CopyPropagationAnalyzer(method).also { it.analyze() }

        for(insn in method.instructions) {
            if(insn !is VarInsnNode || !setOf(ILOAD, LLOAD, FLOAD, DLOAD, ALOAD).contains(insn.opcode)) {
                continue
            }

            val set = analyzer.getInSet(insn) ?: continue
            val assignment = set.singleOrNull { it.destination == insn.`var` } ?: continue
            insn.`var` = assignment.source
            count++
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Propagated $count local variables.")
    }

    private class CopyPropagationAnalyzer(method: MethodNode) :
        DataFlowAnalyzer<Set<CopyAssignment>>(method) {

        private val allAssignments = mutableSetOf<CopyAssignment>()

        init {
            for (insn in method.instructions) {
                if (insn !is VarInsnNode || !STORE_OPCODES.contains(insn.opcode)) {
                    continue
                }

                val previous = insn.previous
                if (previous !is VarInsnNode || !LOAD_OPCODES.contains(previous.opcode)) {
                    continue
                }

                allAssignments += CopyAssignment(insn.`var`, previous.`var`)
            }
        }

        override fun createEntrySet(): Set<CopyAssignment> {
            return Collections.emptySet()
        }

        override fun createInitialSet(): Set<CopyAssignment> {
            return allAssignments
        }

        override fun join(set1: Set<CopyAssignment>, set2: Set<CopyAssignment>): Set<CopyAssignment> {
            return set1 intersect set2
        }

        override fun transfer(set: Set<CopyAssignment>, insn: AbstractInsnNode): Set<CopyAssignment> {
            return when {
                insn is VarInsnNode && STORE_OPCODES.contains(insn.opcode) -> {
                    val newSet = set.minusKilledByAssignmentTo(insn.`var`)

                    val previous = insn.previous
                    if (previous is VarInsnNode && LOAD_OPCODES.contains(previous.opcode)) {
                        newSet.plus(CopyAssignment(insn.`var`, previous.`var`))
                    } else {
                        newSet
                    }
                }

                insn is IincInsnNode -> set.minusKilledByAssignmentTo(insn.`var`)
                else -> set
            }
        }

        private fun Set<CopyAssignment>.minusKilledByAssignmentTo(index: Int): Set<CopyAssignment> {
            return filterTo(mutableSetOf()) { it.source != index && it.destination != index }
        }

        private companion object {

            private val LOAD_OPCODES = setOf(
                ILOAD,
                LSTORE,
                FLOAD,
                DLOAD,
                ALOAD
            )

            private val STORE_OPCODES = setOf(
                ISTORE,
                LSTORE,
                FSTORE,
                DSTORE,
                ASTORE
            )
        }
    }

    data class CopyAssignment(val destination: Int, val source: Int)
}