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

import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

public data class MemberDesc(val name: String, val desc: String) {
    public constructor(field: FieldNode) : this(field.name, field.desc)
    public constructor(method: MethodNode) : this(method.name, method.desc)
    public constructor(fieldInsn: FieldInsnNode) : this(fieldInsn.name, fieldInsn.desc)
    public constructor(methodInsn: MethodInsnNode) : this(methodInsn.name, methodInsn.desc)
    public constructor(memberRef: MemberRef) : this(memberRef.name, memberRef.desc)
    override fun toString(): String {
        return "$name $desc"
    }
}