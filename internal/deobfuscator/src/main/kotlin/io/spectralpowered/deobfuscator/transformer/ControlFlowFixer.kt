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
import io.spectralpowered.asm.tree.ir
import io.spectralpowered.asm.tree.owner
import io.spectralpowered.deobfuscator.Transformer
import org.mapleir.context.IRCache
import org.mapleir.ir.algorithms.BoissinotDestructor
import org.mapleir.ir.algorithms.LocalsReallocator
import org.mapleir.ir.codegen.ControlFlowGraphDumper
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class ControlFlowFixer : Transformer() {

    private var count = 0
    private lateinit var irCache: IRCache

    override fun transformClass(cls: ClassNode) {
        irCache = IRCache()
    }

    override fun transformCode(method: MethodNode) {
        if(method.tryCatchBlocks.isNotEmpty()) return
        val irMethod = method.owner.ir.methods.firstOrNull { it.name == method.name && it.desc == method.desc }
        val cfg = irCache.getFor(irMethod)

        val insns = method.instructions.toArray()
        method.instructions.clear()

        cfg.allExprStream().forEach {

        }
        count += cfg.size()
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Reordered $count methdo control-flow blocks.")
    }
}