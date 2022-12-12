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

package io.spectralpowered.client

import io.spectralpowered.commons.get
import io.spectralpowered.commons.inject
import org.koin.core.context.startKoin
import org.tinylog.kotlin.Logger

private val DI_MODULES = listOf(
    SpectralModule
)

fun main() {
    Logger.info("Initializing.")

    /*
     * Start Dependency injector.
     */
    startKoin {
        modules(DI_MODULES)
    }

    /*
     * Start Spectral main.
     */
    get<Spectral>().start()
}

class Spectral {

    private val bootstrap: Bootstrap by inject()

    fun start() {
        Logger.info("Starting Spectral client.")

        /*
         * Run Spectral client bootstrapper.
         */
        bootstrap.run()

        /*
         * Spectral client is now running.
         */
        Logger.info("Spectral client is now running.")
    }

    fun stop() {

    }
}