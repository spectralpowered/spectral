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
import io.spectralpowered.asm.util.InsnModifier
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.INVOKESTATIC
import org.objectweb.asm.Opcodes.INVOKEVIRTUAL
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class ReflectionCheckPatcher : Transformer() {

    private var count = 0

    override fun transformMethod(method: MethodNode) {
        val modifier = InsnModifier()

        for(insn in method.instructions) {
            patchFindClass(insn)
            patchGetMethodName(insn, modifier)
            patchGetMethodArgTypes(insn, modifier)
            patchFindField(insn, modifier)
            patchGetInt(insn, modifier)
            patchSetInt(insn, modifier)
            patchInvoke(insn, modifier)
        }

        modifier.apply(method)
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Patched $count reflection checks.")
    }

    private fun patchFindClass(insn: AbstractInsnNode) {
        if(insn.opcode != INVOKESTATIC) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/Class" && insn.name == "forName") {
            insn.owner = "io/spectralpowered/Reflection"
            insn.name = "findClass"
            insn.desc = "(Ljava/lang/String;)Ljava/lang/Class;"
            count++
        }
    }

    private fun patchGetMethodName(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Method" && insn.name == "getName") {
            val newInsn = MethodInsnNode(
                INVOKESTATIC,
                "io/spectralpowered/Reflection",
                "getMethodName",
                "(Ljava/lang/reflect/Method;)Ljava/lang/String;"
            )
            modifier.replace(insn, newInsn)
            count++
        }
    }

    private fun patchGetMethodArgTypes(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Method" && insn.name == "getParameterTypes") {
            val newInsn = MethodInsnNode(
                INVOKESTATIC,
                "io/spectralpowered/Reflection",
                "getMethodArgTypes",
                "(Ljava/lang/reflect/Method;)[Ljava/lang/Class;"
            )
            modifier.replace(insn, newInsn)
            count++
        }
    }

    private fun patchFindField(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/Class" && insn.name == "getDeclaredField") {
            val newInsn = MethodInsnNode(
                INVOKESTATIC,
                "io/spectralpowered/Reflection",
                "findField",
                "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;"
            )
            modifier.replace(insn, newInsn)
            count++
        }
    }

    private fun patchSetInt(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Field" && insn.name == "setInt") {
            val newInsn = MethodInsnNode(
                INVOKESTATIC,
                "io/spectralpowered/Reflection",
                "setInt",
                "(Ljava/lang/reflect/Field;Ljava/lang/Object;I)V"
            )
            modifier.replace(insn, newInsn)
            count++
        }
    }

    private fun patchGetInt(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Field" && insn.name == "getInt") {
            val newInsn = MethodInsnNode(
                INVOKESTATIC,
                "io/spectralpowered/Reflection",
                "getInt",
                "(Ljava/lang/reflect/Field;Ljava/lang/Object;)I"
            )
            modifier.replace(insn, newInsn)
            count++
        }
    }

    private fun patchInvoke(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Method" && insn.name == "invoke") {
            val newInsn = MethodInsnNode(
                INVOKESTATIC,
                "io/spectralpowered/Reflection",
                "invoke",
                "(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;"
            )
            modifier.replace(insn, newInsn)
            count++
        }
    }
}