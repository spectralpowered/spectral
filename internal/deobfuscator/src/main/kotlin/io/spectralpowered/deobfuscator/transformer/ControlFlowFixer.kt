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

import io.spectralpowered.asm.LabelMap
import io.spectralpowered.asm.graph.ControlFlowGraph
import io.spectralpowered.asm.tree.ClassPool

import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class ControlFlowFixer : Transformer() {

    private var count = 0

    override fun transformCode(method: MethodNode) {
        //if(method.tryCatchBlocks.isNotEmpty()) return
        val cfg = ControlFlowGraph(method)
        val blocks = cfg.build()
        val newInsns = InsnList()

        if(blocks.isNotEmpty()) {
            val labelMap = LabelMap()
            blocks.forEach { block ->
                for(i in block.startIndex until block.endIndex) {
                    newInsns.add(method.instructions[i].clone(labelMap))
                }
            }
            method.instructions = newInsns
            count += blocks.size
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Reordered $count method control-flows.")
    }
}