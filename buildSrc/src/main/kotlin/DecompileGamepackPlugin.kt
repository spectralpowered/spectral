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

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.register
import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler

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

open class DecompileGamepackPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.register<DecompileTask>("decompileGamepack") {
            dependsOn(project.tasks.getByName("jar"))
            group = "spectral"
        }
    }

    @CacheableTask
    open class DecompileTask : DefaultTask() {

        @Input
        @Optional
        var inputJar: String? = null

        @Input
        @Optional
        var outputDir: String? = null

        @InputFile
        @PathSensitive(PathSensitivity.ABSOLUTE)
        var inputJarFile = project.file(inputJar ?: "${project.buildDir.resolve("bin/gamepack.deob.jar")}")

        @OutputDirectory
        var outputDirFile = project.file(outputDir ?: "${project.buildDir.resolve("/decompiled")}")

        @TaskAction
        fun run() {
            if(outputDirFile.exists()) {
                outputDirFile.deleteRecursively()
            }
            outputDirFile.mkdirs()
            val args = listOf(inputJarFile.toString(), outputDirFile.toString())
            ConsoleDecompiler.main(args.toTypedArray())
        }
    }
}