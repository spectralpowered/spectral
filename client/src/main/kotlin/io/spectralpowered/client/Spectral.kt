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

import io.spectralpowered.commons.inject
import org.koin.core.context.startKoin
import org.tinylog.kotlin.Logger

class Spectral {

    fun start() {
        Logger.info("Starting Spectral client.")

    }

    fun stop() {
        Logger.info("Stopping Spectral client.")
    }

    companion object {

        private val spectral: Spectral by inject()

        private val DI_MODULES = listOf(
            SpectralModule
        )

        @JvmStatic
        fun main(args: Array<String>) {
           Logger.info("Initializing.")

            /*
             * Start Koin
             */
            startKoin {
                modules(DI_MODULES)
            }

            spectral.start()
        }
    }
}