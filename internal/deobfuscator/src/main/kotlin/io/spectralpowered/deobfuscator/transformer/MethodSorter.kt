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
import io.spectralpowered.asm.isInitializer
import io.spectralpowered.asm.isStatic
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.ACC_STATIC
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger
import java.lang.reflect.Modifier

class MethodSorter : Transformer() {

    private var count = 0

    override fun transformClass(cls: ClassNode) {
        count += cls.methods.size
        cls.methods = cls.methods.sortedWith(compareBy<MethodNode> { !it.isInitializer() }
            .thenBy { !it.isConstructor() }
            .thenBy { it.isStatic() }
            .thenBy { it.lineNumber }
            .thenBy { Modifier.toString(it.access and Modifier.methodModifiers()) }
            .thenBy { Type.getMethodType(it.desc).returnType.className }
            .thenBy { it.name }
        )
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Sorted $count methods.")
    }

    private companion object {

        private val MethodNode.lineNumber: Int? get() {
            for(insn in instructions) {
                if(insn is LineNumberNode) {
                    return insn.line
                }
            }
            return null
        }
    }
}