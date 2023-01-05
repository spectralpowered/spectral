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
import io.spectralpowered.asm.build
import io.spectralpowered.asm.fromByteArray
import io.spectralpowered.asm.ignored
import io.spectralpowered.deobfuscator.Transformer
import io.spectralpowered.deobfuscator.include.ObfInfo
import org.objectweb.asm.tree.ClassNode
import org.tinylog.kotlin.Logger

class SpectralClassesAdder : Transformer() {

    override fun transformPool(pool: ClassPool) {
        pool.addObfInfoClass()
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Added all additional Spectral classes.")
    }

    private fun ClassPool.addObfInfoClass() {
        val cls = ObfInfo::class.java.getResourceAsStream("/io/spectralpowered/deobfuscator/include/ObfInfo.class")!!
            .readAllBytes().let { ClassNode().also { c -> c.fromByteArray(it) } }
        cls.name = "ObfInfo"
        cls.ignored = true
        cls.visibleAnnotations.clear()
        addClass(cls)
        cls.build()
    }
}