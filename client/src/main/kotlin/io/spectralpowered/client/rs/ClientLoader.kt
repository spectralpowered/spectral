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

package io.spectralpowered.client.rs

import io.spectralpowered.commons.SpectralPaths
import org.tinylog.kotlin.Logger
import java.applet.Applet
import java.applet.AppletContext
import java.applet.AppletStub
import java.awt.Color
import java.awt.Dimension
import java.net.URL
import java.net.URLClassLoader

class ClientLoader {

    internal lateinit var applet: Applet private set

    private val params = hashMapOf<String, String>()

    fun load() {
        Logger.debug("Loading client.")

        /*
         * Fetch Jav_config params.
         */
        fetchConfig()

        /*
         * Load the client from the gamepack.jar
         */
        val main = params["initial_class"]!!.replace(".class", "")
        val classLoader = URLClassLoader(arrayOf(Gamepack.liveFile.toURI().toURL()))
        applet = classLoader.loadClass(main).newInstance() as Applet

        /*
         * Setup the applet style.
         */
        applet.background = Color.BLACK
        applet.size = Dimension(params["applet_minwidth"]!!.toInt(), params["applet_minheight"]!!.toInt())
        applet.preferredSize = applet.size
        applet.layout = null
        applet.setStub(appletStub)
        applet.init()

        Logger.debug("Client applet started.")
    }

    private fun fetchConfig() {
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
    }

    private val appletStub: AppletStub get() = object : AppletStub {
        override fun isActive(): Boolean = true
        override fun getAppletContext(): AppletContext? = null
        override fun getDocumentBase(): URL = URL(params["codebase"])
        override fun getCodeBase(): URL = URL(params["codebase"])
        override fun getParameter(name: String): String? = params[name]
        override fun appletResize(width: Int, height: Int) { applet.setSize(width, height) }
    }
}