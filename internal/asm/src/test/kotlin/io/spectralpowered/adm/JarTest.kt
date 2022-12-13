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

package io.spectralpowered.adm

import io.spectralpowered.asm.Asm
import io.spectralpowered.asm.tree.getMethod
import io.spectralpowered.asm.tree.info
import java.io.File

object JarTest {

    @JvmStatic
    fun main(args: Array<String>) {
        val pool = Asm.fromJar(File("gamepack.jar"))

        val cls = pool.findClass("client")!!
        val method = cls.getMethod("init", "()V")!!

        val exprs = method.info.tree().get()
        println()
    }
}