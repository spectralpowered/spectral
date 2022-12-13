package io.spectralpowered.asm.graph

import io.spectralpowered.asm.tree.owner
import org.jgrapht.Graph
import org.jgrapht.alg.cycle.CycleDetector
import org.jgrapht.graph.AsUnmodifiableGraph
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.traverse.TopologicalOrderIterator
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.AbstractInsnNode.JUMP_INSN
import org.objectweb.asm.tree.AbstractInsnNode.LABEL
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.BasicInterpreter
import org.objectweb.asm.tree.analysis.BasicValue

class ControlFlowGraph(private val method: MethodNode) : Analyzer<BasicValue>(BasicInterpreter()) {

    internal val graph = DefaultDirectedGraph<Block, DefaultEdge>(DefaultEdge::class.java)

    private val head = Block()

    override fun init(owner: String, method: MethodNode) {
        val insns = method.instructions.toArray()

        var cur = head
        graph.addVertex(cur)

        for(i in insns.indices) {
            val insn = insns[i]
            cur.endIndex++
            if(insn.next == null) break
            if(insn.next.type == LABEL ||
                    insn.type == JUMP_INSN ||
                    insn.type == LOOKUPSWITCH ||
                    insn.type == TABLESWITCH) {
                cur = Block()
                cur.startIndex = i + 1
                cur.endIndex = i + 1
                graph.addVertex(cur)
            }
        }
    }

    override fun newControlFlowEdge(insnIndex: Int, successorIndex: Int) {
        val block1 = graph.vertexSet().first { insnIndex in it.startIndex until it.endIndex }
        val block2 = graph.vertexSet().first { successorIndex in it.startIndex until it.endIndex }
        if(block1 != block2) {
            block1.next = block2
            block2.prev = block1
        }
    }

    override fun newControlFlowExceptionEdge(insnIndex: Int, successorIndex: Int): Boolean {
        newControlFlowEdge(insnIndex, successorIndex)
        return true
    }

    fun build(): List<Block> {
        val result = mutableListOf<Block>()
        analyze(method.owner.name, method)

        var id = 0
        graph.vertexSet().forEach { block ->
            block.id = id++
            for(i in block.startIndex until block.endIndex) {
                val insn = method.instructions[i]
                block.instructions.add(insn)
                if(insn is LineNumberNode) {
                    block.lineNumber = insn.line
                }
            }
        }

        val cycleDetector = CycleDetector(graph)
        if(cycleDetector.detectCycles()) {
            throw IllegalStateException()
        }

        val itr = TopologicalOrderIterator(graph)
        while(itr.hasNext()) {
            result.add(itr.next())
        }

        return result
    }

    class Block : Comparable<Block> {
        var id: Int = 0

        var prev: Block? = null
        var next: Block? = null

        var startIndex = 0
        var endIndex = 0
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
            return "BLOCK[id=$id, prev=${prev?.id}, next=${next?.id}]"
        }
    }
}