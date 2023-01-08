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

package io.spectralpowered.injector.asm

import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import kotlin.reflect.KClass

@Suppress("UNCHECKED_CAST")
fun <T> AnnotationNode.getValueOrDefault(key: Any, defaultValue: T?): T? {
    val values = values.toMutableList()
    var i = 0
    while(i < values.size) {
        if(values[i] == key) {
            return values[i + 1] as T
        }
        i += 2
    }
    return defaultValue
}

fun Iterable<AnnotationNode>.getAnnotationType(annotationType: KClass<*>): AnnotationNode? {
    this.forEach { annotation ->
        if(Type.getType(annotationType.java) == Type.getType(annotation.desc)) {
            return annotation
        }
    }
    return null
}