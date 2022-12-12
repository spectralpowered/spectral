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

import net.miginfocom.swing.MigLayout
import org.intellij.lang.annotations.JdkConstants.FontStyle
import java.awt.Color
import java.awt.Dimension
import java.awt.Font
import java.awt.Font.BOLD
import java.awt.GridBagLayout
import java.awt.RenderingHints
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import javax.swing.BorderFactory
import javax.swing.Box
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JProgressBar
import javax.swing.SwingUtilities

class SplashScreen : JFrame("Spectral") {

    private lateinit var progressBar: JProgressBar
    private lateinit var progressLabel: JLabel

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        iconImages = UI.windowIcons
        size = Dimension(500, 375)
        preferredSize = size
        minimumSize = size
        isResizable = false
        isUndecorated = true
        rootPane.border = BorderFactory.createMatteBorder(5, 5, 5, 5, Color(33, 37, 43))
        setLocationRelativeTo(null)
        initComponents()
    }

    fun open() {
        isVisible = true
    }

    private fun initComponents() {
        val panel = JPanel()
        panel.layout = MigLayout("fillx")
        add(panel)

        /*
         * === LOGO IMAGE ===
         */
        val logoImage = ImageIcon((SplashScreen::class.java.getResourceAsStream("/images/spectral-transparent.png") ?: return)
            .readAllBytes())
            .resize(128, 128)
        val logo = JLabel(logoImage)
        panel.add(logo, "wrap, align center, gapy 32")

        /*
         * === SPECTRAL LABEL ===
         */
        val spectralLabel = JLabel("S P E C T R A L")
        spectralLabel.font = Font(spectralLabel.font.name, Font.PLAIN, 32)
        panel.add(spectralLabel, "wrap, align center, gapy 8")

        /*
         * === PROGRESS BAR ===
         */
        progressBar = JProgressBar(JProgressBar.HORIZONTAL)
        progressBar.maximumSize = Dimension(400, 8)
        progressBar.size = progressBar.maximumSize
        progressBar.preferredSize = progressBar.maximumSize
        progressBar.value = 5
        progressBar.maximum = 100
        panel.add(progressBar, "wrap, align center, gapy 48")

        /*
         * === PROGRESS LABEL ===
         */
        progressLabel = JLabel("Loading...")
        progressLabel.font = Font(Font.DIALOG, Font.PLAIN, 14)
        panel.add(progressLabel, "wrap, align center, gapy 8")
    }

    private fun ImageIcon.resize(width: Int, height: Int): ImageIcon {
        val resizedImage = BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)
        val g = resizedImage.createGraphics()

        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR)
        g.drawImage(this.image, 0, 0, width, height, null)
        g.dispose()

        return ImageIcon(resizedImage)
    }

    companion object{

        var progress: Int = 0
            set(value) {
                field = value
                SwingUtilities.invokeLater {
                    UI.splashScreen.progressBar.value = value
                }
            }

        var status: String = "Loading..."
            set(value) {
                field = value
                SwingUtilities.invokeLater {
                    UI.splashScreen.progressLabel.text = value
                }
            }
    }
}