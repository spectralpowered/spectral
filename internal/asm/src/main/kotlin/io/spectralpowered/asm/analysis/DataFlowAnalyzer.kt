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

package io.spectralpowered.asm.analysis

import io.spectralpowered.util.collection.UniqueQueue
import org.jgrapht.Graph
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.EdgeReversedGraph
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.MethodNode

abstract class DataFlowAnalyzer<T>(private val method: MethodNode, backwards: Boolean = false) {

    private val graph: Graph<Int, DefaultEdge>
    private val inSets = mutableMapOf<Int, T>()
    private val outSets = mutableMapOf<Int, T>()

    init {
        val forwardsGraph = ControlFlowAnalyzer(method).build()
        graph = if (backwards) {
            EdgeReversedGraph(forwardsGraph)
        } else {
            forwardsGraph
        }
    }

    protected open fun createEntrySet(): T = createInitialSet()
    protected abstract fun createInitialSet(): T
    protected abstract fun join(set1: T, set2: T): T
    protected abstract fun transfer(set: T, insn: AbstractInsnNode): T

    fun getInSet(insn: AbstractInsnNode): T? {
        return getInSet(method.instructions.indexOf(insn))
    }

    fun getInSet(index: Int): T? {
        return inSets[index]
    }

    fun getOutSet(insn: AbstractInsnNode): T? {
        return getOutSet(method.instructions.indexOf(insn))
    }

    fun getOutSet(index: Int): T? {
        return outSets[index]
    }

    fun analyze() {
        val entrySet = createEntrySet()
        val initialSet = createInitialSet()
        val workList = UniqueQueue<Int>()
        workList += graph.vertexSet().filter { vertex -> graph.inDegreeOf(vertex) == 0 }
        while (true) {
            val node = workList.removeFirstOrNull() ?: break
            val predecessors = graph.incomingEdgesOf(node).map { edge ->
                outSets[graph.getEdgeSource(edge)] ?: initialSet
            }
            val inSet = if (predecessors.isEmpty()) {
                entrySet
            } else {
                predecessors.reduce(this::join)
            }
            inSets[node] = inSet
            val outSet = transfer(inSet, method.instructions[node])
            if (outSets[node] != outSet) {
                outSets[node] = outSet
                for (edge in graph.outgoingEdgesOf(node)) {
                    val successor = graph.getEdgeTarget(edge)
                    workList += successor
                }
            }
        }
    }
}