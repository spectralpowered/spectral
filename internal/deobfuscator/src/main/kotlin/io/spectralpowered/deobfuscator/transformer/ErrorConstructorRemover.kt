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
import io.spectralpowered.asm.isConstructor
import io.spectralpowered.asm.isStatic
import io.spectralpowered.asm.type
import io.spectralpowered.asm.util.InsnMatcher
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class ErrorConstructorRemover : Transformer() {

    private var count = 0

    override fun transformClass(cls: ClassNode) {
        val toRemove = mutableListOf<MethodNode>()

        cls.methods.forEach { method ->
            if(method.isConstructor()) {
                for(match in PATTERN.match(method).filter { checkPattern(method, it) }) {
                    toRemove.add(method)
                    count++
                    return@forEach
                }
            }
        }

        cls.methods.removeAll(toRemove)
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count error constructor methods.")
    }

    private fun checkPattern(method: MethodNode, insns: List<AbstractInsnNode>): Boolean {
        val invoke = insns[2] as MethodInsnNode
        if(invoke.owner != "java/lang/Error" || invoke.name != "<init>" || invoke.desc != "()V") return false
        return true
    }

    companion object {

        private val PATTERN = InsnMatcher.compile(
            """
                (NEW)
                (DUP)
                (INVOKESPECIAL)
                (ATHROW)
            """.trimIndent()
        )
    }
}