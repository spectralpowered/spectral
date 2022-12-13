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

import io.spectralpowered.asm.tree.ClassPool
import io.spectralpowered.asm.tree.owner
import io.spectralpowered.asm.tree.removeDeadCode
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class DeadCodeRemover : Transformer() {

    private var count = 0

    override fun transformCode(method: MethodNode) {
        val origSize = method.instructions.size()
        method.removeDeadCode(method.owner.name)
        val newSize = method.instructions.size()
        count += (origSize - newSize)
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count dead method instructions.")
    }
}