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

import io.spectralpowered.client.rs.ClientLoader
import io.spectralpowered.client.rs.Gamepack
import io.spectralpowered.client.ui.SplashScreen
import io.spectralpowered.client.ui.UI
import io.spectralpowered.commons.SpectralPaths
import io.spectralpowered.commons.inject
import org.tinylog.kotlin.Logger

class Bootstrap {

    private val clientLoader: ClientLoader by inject()

    fun run() {
        Logger.info("Bootstrapping Spectral client.")

        /*
         * Open the launcher
         */
        UI.openSplashScreen()
        SplashScreen.update("Bootstrapping", 5)

        /*
         * Run all of the client's startup / bootstrap steps.
         */
        checkDirs()
        checkGamepack()

        SplashScreen.update("Starting Old School RuneScape", 80)
        clientLoader.load()

        SplashScreen.update("Client started successfully.", 100)
        UI.closeSplashScreen()

        /*
         * Open Spectral client window.
         */
        UI.openSpectralWindow()
    }

    private fun checkDirs() {
        Logger.debug("Checking required Spectral directories.")
        SplashScreen.update("Checking directories", 10)

        SpectralPaths.allDirs().forEach { dir ->
            if(!dir.exists()) {
                Logger.debug("Creating missing directory: ${dir.path}.")
                dir.mkdirs()
            }
        }
    }

    private fun checkGamepack() {
        Logger.debug("Checking gamepack file.")
        SplashScreen.update("Checking gamepack", 20)

        if(Gamepack.requiresUpdate()) {
            Logger.debug("Downloading latest gamepack.")
            SplashScreen.update("Downloading latest gamepack", 35)

            Gamepack.download()
            Logger.debug("Gamepack successfully downloaded.")
            SplashScreen.update("Gamepack is up-to-date", 40)
        } else {
            Logger.debug("Gamepack version is up-to-date.")
            SplashScreen.update("Gamepack is up-to-date", 40)
        }
    }
}