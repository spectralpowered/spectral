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

package io.spectralpowered.injector.util

import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

inline fun <reified T : Annotation> ClassNode.target(): String? {
    val types = visibleAnnotations.filter { it.desc == Type.getDescriptor(T::class.java) }
        .map { it.values }
        .filter { it.size == 2 }
        .map { it[1] }
        .map {
            if(it is Type) it.internalName
            else it.toString()
        }.toList()
    if(types.size != 1) return null
    return types[0].replace(".", "/")
}

inline fun <reified T : Annotation> MethodNode.target(): String? {
    if(visibleAnnotations == null) {
        return null
    }

    val types = visibleAnnotations.filter { it.desc == Type.getDescriptor(T::class.java) }
        .map { it.values }
        .filter { it.size == 2 }
        .map { it[1] }
        .map {
            if(it is Type) it.internalName
            else it.toString()
        }.toList()
    if(types.size != 1) return null
    return types[0].replace(".", "/")
}