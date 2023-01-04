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
import io.spectralpowered.asm.pool
import io.spectralpowered.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.GETSTATIC
import org.objectweb.asm.Opcodes.PUTSTATIC
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger
import java.lang.reflect.Modifier

class StaticFieldMover : Transformer() {

    private var count = 0

    private lateinit var resolver: FieldOwnerResolver

    override fun transformPool(pool: ClassPool) {
        resolver = FieldOwnerResolver(pool)
    }

    override fun transformMethod(method: MethodNode) {
        method.instructions.iterator().forEach { insn ->
            if(insn is FieldInsnNode) {
                val opcode = insn.opcode
                val prevOwner = insn.owner
                val isStatic = opcode in listOf(GETSTATIC, PUTSTATIC)
                insn.owner = resolver.getOwner(insn.owner, insn.name, insn.desc, isStatic)
                val newOwner = insn.owner
                if(prevOwner != newOwner) {
                    count++
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Moved $count static fields.")
    }

    private class FieldOwnerResolver(private val pool: ClassPool) {

        private val classNames = pool.allClasses.associateBy { it.name }

        fun getOwner(owner: String, name: String, desc: String, isStatic: Boolean): String {
            var cls = classNames[owner] ?: return owner
            while(true) {
                if(cls.containsField(name, desc, isStatic)) {
                    return cls.name
                }
                cls = classNames[cls.superName] ?: return cls.superName
            }
        }

        private fun ClassNode.containsField(name: String, desc: String, isStatic: Boolean): Boolean {
            return fields.any { it.name == name && it.desc == desc && Modifier.isStatic(it.access) == isStatic }
        }
    }
}