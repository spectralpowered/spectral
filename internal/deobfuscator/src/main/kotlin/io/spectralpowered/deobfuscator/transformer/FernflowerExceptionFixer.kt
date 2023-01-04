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
import org.objectweb.asm.Opcodes.NOP
import org.objectweb.asm.tree.InsnNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class FernflowerExceptionFixer : Transformer() {

    private var count = 0

    override fun transformMethod(method: MethodNode) {
        if(method.tryCatchBlocks.any { it.end.nextReal == null }) {
            method.instructions.add(InsnNode(NOP))
            count++
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Inserted $count NOP opcodes to fix FernFlower exceptions.")
    }
}