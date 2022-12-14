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

package io.spectralpowered.deobfuscator.include

import java.io.File
import java.nio.file.Files
import kotlin.reflect.KClass

object ReflectionPatcher {

    private const val ENABLE_DEBUG_LOGGING = true

    private val classes = hashMapOf<String, KClass<*>>()

    init {
        try {
            val resources = ClassLoader.getSystemResources("")
            while(resources.hasMoreElements()) {
                val url = resources.nextElement()
                val path = File(url.toURI()).toPath()
                Files.walk(path).filter { Files.isRegularFile(it) }.forEach { f ->
                    val className = f.getName(f.nameCount - 1).toString().replace(".class", "")
                    try {
                        val clazz = Class.forName(className)
                        val obfInfo = clazz.getAnnotation(ObfInfo::class.java)
                        if(obfInfo != null) {
                            classes[obfInfo.name] = clazz.kotlin
                        }
                    } catch (e: Exception) { /* Do Nothing */ }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}