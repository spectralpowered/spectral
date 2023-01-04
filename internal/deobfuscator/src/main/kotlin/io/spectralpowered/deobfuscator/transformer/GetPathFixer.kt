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
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.POP
import org.objectweb.asm.tree.InsnNode
import org.objectweb.asm.tree.LdcInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.tinylog.kotlin.Logger

class GetPathFixer : Transformer() {

    private var count = 0

    override fun transformPool(pool: ClassPool) {
        var seenCount = 0
        pool.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                val insns = method.instructions.toArray()
                for(insn in insns) {
                    if(insn !is MethodInsnNode) continue
                    if(insn.name != "getPath") continue
                    if(++seenCount == 2) {
                        val pop = InsnNode(POP)
                        val ldc = LdcInsnNode("")
                        method.instructions.insert(insn, pop)
                        method.instructions.insert(pop, ldc)
                        method.instructions.remove(insn)
                        count++
                        break
                    }
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Fixed $count invalid 'getPath()' method calls")
    }
}