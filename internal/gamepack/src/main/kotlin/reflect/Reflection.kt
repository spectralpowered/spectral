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

package reflect/*
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

import ObfInfo
import java.io.File
import java.lang.reflect.Field
import java.lang.reflect.Method
import java.lang.reflect.Modifier.PRIVATE
import java.net.URISyntaxException
import java.nio.file.Files

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

    private const val DEBUG = true

    private val classes = hashMapOf<String, Class<*>>()

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
                    val annotation = klass.getAnnotation(ObfInfo::class.java)
                    if(annotation != null) {
                        classes[annotation.name] = klass
                    }
                } catch(e: ClassNotFoundException) { /* Do Nothing */ }
            }
        }
    }

    fun findClass(name: String): Class<*> {
        val klass = classes[name]
        if(klass != null) return klass
        if(DEBUG) {
            println("[ReflectionCheck] Class: $name")
        }
        return Class.forName(name)
    }

    fun findField(cls: Class<*>, name: String): Field {
        if(DEBUG) {
            println("[ReflectionCheck] Field: ${cls.simpleName}.$name")
        }
        cls.declaredFields.forEach { field ->
            val annotation = field.getAnnotation(ObfInfo::class.java)
            if((annotation != null) && annotation.name == name) {
                return field
            }
        }
        if(DEBUG) {
            println("[ReflectionCheck] Dummy Field: ${cls.simpleName}.$name")
        }
        return cls.getDeclaredField(name)
    }

    fun getMethodName(method: Method): String {
        val annotation = method.getAnnotation(ObfInfo::class.java)
        if(annotation != null) {
            return annotation.name
        }
        return method.name
    }

    fun getMethodArgTypes(method: Method): Array<Class<*>?> {
        val annotation = method.getAnnotation(ObfInfo::class.java)
        val argTypes = method.parameterTypes

        if(annotation == null) {
            return argTypes
        }

        val desc = annotation.desc
        val index = desc.lastIndexOf(')')
        val typeChar = desc[index - 1]

        val lastType = when(typeChar) {
            'B' -> Byte::class
            'I' -> Int::class
            'S' -> Short::class
            else -> throw IllegalStateException()
        }

        val newArgTypes = argTypes.copyOf(argTypes.size + 1)
        newArgTypes[newArgTypes.size - 1] = lastType.java
        return newArgTypes
    }

    fun invoke(method: Method, instance: Any?, args: Array<Any?>): Any? {
        if(DEBUG) {
            println("[ReflectionCheck] Invoke: ${method.name}")
        }
        try {
            return method.invoke(instance, args)
        } catch(e: Exception) {
            if(DEBUG) {
                e.printStackTrace()
            }
            throw e
        }
    }

    fun getInt(field: Field, instance: Any?): Int {
        if(DEBUG) {
            println("[ReflectionCheck] Getter: ${field.name}")
        }

        var unset = false
        if((field.modifiers and PRIVATE) == 0) {
            field.isAccessible = true
            unset = true
        }

        val value = try {
            field.getInt(instance)
        } catch (e: Exception) {
            if(DEBUG) {
                e.printStackTrace()
            }
            throw e
        } finally {
            if(unset) {
                field.isAccessible = false
            }
        }
        return value
    }

    fun setInt(field: Field, instance: Any?, value: Int) {
        if(DEBUG) {
            println("[ReflectionCheck] Setter: $field => $value")
        }

        var unset = false
        if((field.modifiers and PRIVATE) == 0) {
            field.isAccessible = true
            unset = true
        }

        try {
            field.setInt(instance, value)
        } finally {
            if(unset) {
                field.isAccessible = false
            }
        }
    }
}