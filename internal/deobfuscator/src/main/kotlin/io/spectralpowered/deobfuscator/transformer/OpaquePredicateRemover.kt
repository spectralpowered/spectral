package io.spectralpowered.deobfuscator.transformer

import io.spectralpowered.asm.InsnMatcher
import io.spectralpowered.asm.tree.ClassPool
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.GOTO
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.JumpInsnNode
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode
import org.tinylog.kotlin.Logger

class OpaquePredicateRemover : Transformer() {

    private var count = 0

    override fun transformCode(method: MethodNode) {
        OPAQUE_PATTERNS.forEach { pattern ->
            for(match in pattern.match(method).filter { isOpaquePredicateCheck(method, it) }) {
                val jump = match[2] as JumpInsnNode
                val goto = JumpInsnNode(GOTO, LabelNode(jump.label.label))
                method.instructions.insert(jump, goto)
                match.forEach(method.instructions::remove)
                count++
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count opaque-predicate checks.")
    }

    private fun isOpaquePredicateCheck(method: MethodNode, insns: List<AbstractInsnNode>): Boolean {
        return true
    }

    companion object {

        private val EXCEPTION_PATTERN = InsnMatcher.compile("""
            ILOAD
            (ICONST | LdcInsnNode | IntInsnNode)
            JumpInsnNode
            NEW
            DUP
            INVOKESPECIAL
            ATHROW
        """.trimIndent())
    }

    private val OPAQUE_PATTERNS = listOf(EXCEPTION_PATTERN)

}