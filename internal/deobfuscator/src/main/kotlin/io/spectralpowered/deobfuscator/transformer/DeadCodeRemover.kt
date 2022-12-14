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
import io.spectralpowered.asm.owner
import io.spectralpowered.asm.util.isBodyEmpty
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.BasicInterpreter
import org.tinylog.kotlin.Logger

class DeadCodeRemover : Transformer() {

    override fun transformMethod(method: MethodNode) {
        var changed: Boolean
        do {
            changed = false

            val analyzer = Analyzer(BasicInterpreter())
            val frames = analyzer.analyze(method.owner.name, method)

            val it = method.instructions.iterator()
            var i = 0

            for(insn in it) {
                if(frames[i++] != null || insn is LabelNode) {
                    continue
                }

                it.remove()
                changed = true
            }

            changed = changed or method.tryCatchBlocks.removeIf { it.isBodyEmpty() }
        } while(changed)
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed dead-code in methods.")
    }
}