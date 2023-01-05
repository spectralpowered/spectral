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

import java.io.File
import java.net.URISyntaxException
import java.nio.file.Files
import kotlin.io.path.name
import kotlin.reflect.KClass

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

object Reflection {

    private const val DEBUG = false

    private val classes = hashMapOf<String, KClass<*>>()

    init {
        val sysResources = ClassLoader.getSystemResources("")
        while(sysResources.hasMoreElements()) {
            val url = sysResources.nextElement()
            val path = try {
                File(url.toURI()).toPath()
            } catch (e: URISyntaxException) {
                File(url.path).toPath()
            }

            Files.walk(path).filter { Files.isRegularFile(it) }.forEach { file ->
                val className = file.getName(file.nameCount - 1).toString().replace(".class", "")
                try {
                    val klass = Class.forName(className)
                } catch(e: ClassNotFoundException) { /* Do Nothing */ }
            }
        }
    }
}