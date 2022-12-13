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

package io.spectralpowered.asm.tree

import org.objectweb.asm.tree.ClassNode

class ClassPool {

    private val classMap = hashMapOf<String, ClassNode>()

    val classes get() = classMap.values.filter { !it.ignored }.toList()
    val ignoredClasses get() = classMap.values.filter { it.ignored }.toList()
    val allClasses get() = classMap.values.toList()

    fun addClass(node: ClassNode) {
        classMap[node.name] = node
        node.init(this)
    }

    fun removeClass(node: ClassNode) {
        classMap.remove(node.name)
    }

    fun getClass(name: String) = classMap.filterValues { !it.ignored }[name]
    fun getIgnoredClass(name: String) = classMap.filterValues { it.ignored }[name]
    fun findClass(name: String) = classMap[name]

    fun clear() {
        classMap.clear()
    }

}