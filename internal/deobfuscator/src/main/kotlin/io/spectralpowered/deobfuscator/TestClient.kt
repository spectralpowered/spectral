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

package io.spectralpowered.deobfuscator

import java.applet.Applet
import java.applet.AppletContext
import java.applet.AppletStub
import java.awt.Color
import java.awt.Dimension
import java.awt.GridLayout
import java.io.File
import java.net.URL
import java.net.URLClassLoader
import javax.swing.JFrame

class TestClient(private val jar: File) {

    private lateinit var applet: Applet

    private val params = hashMapOf<String, String>()

    fun start() {
        /*
         * Fetch jav_config params.
         */
        val lines = URL("http://oldschool1.runescape.com/jav_config.ws").readText().split("\n")
        lines.forEach {
            var line = it
            if(line.startsWith("param=")) {
                line = line.substring(6)
            }
            val idx = line.indexOf("=")
            if(idx > 0) {
                params[line.substring(0, idx)] = line.substring(idx + 1)
            }
        }

        val main = params["initial_class"]!!.replace(".class", "")
        val classLoader = URLClassLoader(arrayOf(jar.toURI().toURL()))
        val applet = classLoader.loadClass(main).newInstance() as Applet

        applet.background = Color.BLACK
        applet.layout = null
        applet.size = Dimension(params["applet_minwidth"]!!.toInt(), params["applet_minheight"]!!.toInt())
        applet.preferredSize = applet.size
        applet.setStub(applet.appletStub)
        applet.isVisible = true
        applet.init()

        val frame = JFrame("Test Client")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.layout = GridLayout(1, 0)
        frame.add(applet)
        frame.pack()
        frame.minimumSize = frame.size
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
    }

    private val Applet.appletStub get() = object : AppletStub {
        override fun isActive(): Boolean = true
        override fun getAppletContext(): AppletContext? = null
        override fun getParameter(name: String): String? = params[name]
        override fun getDocumentBase(): URL = URL(params["codebase"])
        override fun getCodeBase(): URL = URL(params["codebase"])
        override fun appletResize(width: Int, height: Int) { applet.setSize(width, height) }
    }
}