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

package io.spectralpowered.asm

import io.spectralpowered.asm.tree.ClassPool
import org.objectweb.asm.ClassWriter

class AsmClassWriter(private val pool: ClassPool, private val flags: Int) : ClassWriter(flags) {

    override fun getCommonSuperClass(type1: String, type2: String): String {
        try {
            return super.getCommonSuperClass(type1, type2)
        } catch (e: Exception) {
            if(pool.findClass(type1) != null && pool.findClass(type2) != null) {
                val super1 = pool.findClass(type1)?.superName
                val super2 = pool.findClass(type2)?.superName
                if(super1 == super2) {
                    return super1!!
                }
            }
            return "java/lang/Object"
        }
    }
}