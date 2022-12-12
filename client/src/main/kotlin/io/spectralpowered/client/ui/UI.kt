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

package io.spectralpowered.client.ui

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme
import io.spectralpowered.commons.inject
import org.tinylog.kotlin.Logger
import javax.swing.ImageIcon
import javax.swing.JDialog
import javax.swing.JFrame

object UI {

    init {
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)
        FlatAtomOneDarkContrastIJTheme.setup()
    }


    internal val splashScreen = SplashScreen()
    private val spectralWindow: SpectralWindow by inject()

    fun openSplashScreen() {
        Logger.debug("Opening splash-screen UI.")

        SplashScreen.progress = 0
        SplashScreen.status = ""
        splashScreen.open()
    }

    fun closeSplashScreen() {
        Logger.debug("Closing splash-screen UI.")
        splashScreen.isVisible = false
    }

    fun openSpectralWindow() {
        Logger.debug("Opening Spectral client UI.")
        spectralWindow.isVisible = true
    }

    fun closeSpectralWindow() {
        Logger.debug("Closing Spectral client UI.")
        spectralWindow.isVisible = false
    }

    internal val windowIcons = listOf(
        "spectral-app-512.png",
        "spectral-app-256.png",
        "spectral-app-128.png",
        "spectral-app-64.png"
    ).map { ImageIcon(UI::class.java.getResourceAsStream("/images/$it")!!.readAllBytes()).image }
}