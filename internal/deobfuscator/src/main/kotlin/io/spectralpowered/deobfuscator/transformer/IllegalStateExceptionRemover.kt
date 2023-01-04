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
import io.spectralpowered.asm.isStatic
import io.spectralpowered.asm.util.InsnMatcher
import io.spectralpowered.asm.util.intConstant
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.GOTO
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.JumpInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TypeInsnNode
import org.objectweb.asm.tree.VarInsnNode
import org.tinylog.kotlin.Logger

class IllegalStateExceptionRemover : Transformer() {

    private var count = 0

    override fun transformMethod(method: MethodNode) {
        for(match in EXCEPTION_PATTERN.match(method).filter { checkExceptionPattern(method, it) }) {
            method.removeMatchedInsns(match)
            continue
        }

        for(match in RETURN_PATTERN.match(method).filter { checkReturnPattern(method, it) }) {
            method.removeMatchedInsns(match)
            continue
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count 'IllegalStateException' try-catch blocks.")
    }

    private fun MethodNode.removeMatchedInsns(insns: List<AbstractInsnNode>) {
        val jump = insns[2] as JumpInsnNode
        val goto = JumpInsnNode(GOTO, jump.label)
        instructions.insert(insns.last(), goto)
        insns.forEach(instructions::remove)
        count++
    }

    private fun checkExceptionPattern(method: MethodNode, insns: List<AbstractInsnNode>): Boolean {
        val load = insns[0] as VarInsnNode
        val cst = insns[1]
        val new = insns[3] as TypeInsnNode
        if(load.`var` != method.lastArgIndex) return false
        if(cst.intConstant == null) return false
        if(new.desc == "java/lang/IllegalStateMachine") return false
        return true
    }

    private fun checkReturnPattern(method: MethodNode, insns: List<AbstractInsnNode>): Boolean {
        val load = insns[0] as VarInsnNode
        val cst = insns[1]
        if(load.`var` != method.lastArgIndex) return false
        if(cst.intConstant == null) return false
        return true
    }

    private val MethodNode.lastArgIndex: Int get() {
        val offset = if(isStatic()) 1 else 0
        return (Type.getArgumentsAndReturnSizes(desc) shr 2) - offset - 1
    }

    companion object {

        private val EXCEPTION_PATTERN = InsnMatcher.compile(
            """
                (ILOAD)
                ([ICONST_0-LDC])
                ([IF_ICMPEQ-IF_ACMPNE])
                (NEW)
                (DUP)
                (INVOKESPECIAL)
                (ATHROW)
            """.trimIndent()
        )

        private val RETURN_PATTERN = InsnMatcher.compile(
            """
                (ILOAD)
                ([ICONST_0-LDC])
                ([IF_ICMPEQ-IF_ACMPNE])
                ([IRETURN-RETURN])
            """.trimIndent()
        )
    }
}