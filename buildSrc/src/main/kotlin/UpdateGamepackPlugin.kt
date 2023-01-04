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
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.register

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

open class UpdateGamepackPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.register<UpdateTask>("updateGamepack") {
            dependsOn(project.tasks.getByName("jar"))
            group = "spectral"
        }
    }

    @CacheableTask
    open class UpdateTask : DefaultTask() {

        @Input
        @Optional
        var downloadUrlStr: String = "http://oldschool.runescape.com/gamepack.jar"

        private val binDir = project.buildDir.resolve("bin/")
        private val gamepackFile = binDir.resolve("gamepack.jar")
        private val gamepackDeobFile = binDir.resolve("gamepack.deob.jar")

        @TaskAction
        fun run() {
            if(binDir.exists()) binDir.deleteRecursively()
            binDir.mkdirs()
        }
    }
}