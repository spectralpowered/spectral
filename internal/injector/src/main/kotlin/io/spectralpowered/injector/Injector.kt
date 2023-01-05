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

package io.spectralpowered.injector

import io.spectralpowered.injector.mixinstranslator.MixinsTranslator
import io.spectralpowered.injector.utils.loader.InjectionClassLoader
import io.spectralpowered.injector.utils.tree.BasicClassProvider
import org.tinylog.kotlin.Logger

object Injector {

    val transformerManager = TransformerManager(BasicClassProvider())
    lateinit var classLoader: InjectionClassLoader private set

    inline fun <reified T> addMixin() {
        val className = T::class.qualifiedName
        transformerManager.addTransformer(className)
    }

    fun init() {
        transformerManager.addTransformerPreprocessor(MixinsTranslator())
    }

    fun inject() {
        Logger.info("Injecting mixins into gamepack classes.")
        classLoader = InjectionClassLoader(transformerManager, Injector::class.java.protectionDomain.codeSource.location)
    }
}