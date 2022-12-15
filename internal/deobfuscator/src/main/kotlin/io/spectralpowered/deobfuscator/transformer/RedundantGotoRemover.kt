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
import io.spectralpowered.asm.util.nextReal
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.GOTO
import org.objectweb.asm.tree.JumpInsnNode
import org.objectweb.asm.tree.LabelNode
import org.tinylog.kotlin.Logger
import kotlin.concurrent.thread

class RedundantGotoRemover : Transformer() {

    private var count = 0

    override fun preTransform(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                for(insn in method.instructions) {
                    if(insn.opcode == GOTO) {
                        insn as JumpInsnNode
                        if(insn.nextReal == insn.label.nextReal) {
                            method.instructions.remove(insn)
                            count++
                        }
                    }
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count redundant GOTO instructions.")
    }
}