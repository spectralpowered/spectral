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

package io.spectralpowered.launcher

import io.github.classgraph.ClassGraph
import io.spectralpowered.client.ClientModule
import io.spectralpowered.client.SpectralClient
import io.spectralpowered.commons.get
import io.spectralpowered.injector.InjectionManager
import io.spectralpowered.injector.annotations.Mixin
import io.spectralpowered.injector.mixinstranslator.MixinsTranslator
import io.spectralpowered.injector.utils.tree.BasicClassProvider
import org.koin.core.context.startKoin
import org.tinylog.kotlin.Logger
import java.lang.instrument.Instrumentation

object Launcher {

    @JvmStatic
    fun premain(args: String?, instrumentation: Instrumentation) {
        val injectionManager = InjectionManager(BasicClassProvider())
        injectionManager.addTransformerPreprocessor(MixinsTranslator())
        ClassGraph().enableAnnotationInfo().enableClassInfo().acceptPackages("io.spectralpowered.mixin").scan().use {
            it.getClassesWithAnnotation(Mixin::class.java).forEach { classInfo ->
                injectionManager.addTransformer(classInfo.name)
            }
        }
        injectionManager.hookInstrumentation(instrumentation)
    }

    @JvmStatic
    fun main(args: Array<String>) {
       Logger.info("Launching Spectral client.")

        /*
         * Start dependency injector
         */
        startKoin { modules(ClientModule) }

        /*
         * Launch Spectral Client
         */
        get<SpectralClient>().start()
    }
}