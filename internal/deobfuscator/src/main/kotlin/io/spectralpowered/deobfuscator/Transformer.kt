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

package io.spectralpowered.deobfuscator

import io.spectralpowered.asm.ClassPool
import me.tongfei.progressbar.ProgressBarBuilder
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

abstract class Transformer {

    open fun run(pool: ClassPool) {
        /*
         * Setup CLI progress
         */

        preTransform(pool)

        val progress = ProgressBarBuilder()
            .setTaskName("Deobfuscating")
            .setInitialMax(pool.classes.size.toLong())
            .setUpdateIntervalMillis(10)
            .build()

        pool.classes.forEach { cls ->
            transformClass(cls)
            cls.methods.forEach { method ->
                transformMethod(method)
            }
            cls.fields.forEach { field ->
                transformField(field)
            }
            progress.step()
        }

        progress.close()

        postTransform(pool)
    }

    open fun preTransform(pool: ClassPool) {}

    open fun postTransform(pool: ClassPool) {}

    open fun transformClass(cls: ClassNode) {}

    open fun transformMethod(method: MethodNode) {}

    open fun transformField(field: FieldNode) {}
}