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
import java.io.File
import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths
import java.util.zip.CRC32

object Gamepack {

    private val vanillaFile = SpectralPaths.GAMEPACKS_DIR.resolve("gamepack.vanilla.jar")
    private val debobFile = SpectralPaths.GAMEPACKS_DIR.resolve("gamepack.deob.jar")
    private val downloadUrl = URL("http://oldschool1.runescape.com/gamepack.jar")

    /**
     * The current gamepack file which we use to run and
     * inject into for Spectral
     */
    val liveFile = vanillaFile

    fun requiresUpdate(): Boolean {
        if(!liveFile.exists()) return true
        val liveCrc = liveFile.crc()
        val remoteCrc = downloadUrl.readBytes().crc()
        return liveCrc != remoteCrc
    }

    fun download() {
        if(liveFile.exists()) {
            liveFile.deleteRecursively()
        }

        val bytes = downloadUrl.readBytes()
        Files.createFile(liveFile.toPath())
        Files.write(liveFile.toPath(), bytes)
    }

    private fun File.crc(): Long {
        val crc = CRC32()
        crc.update(this.readBytes())
        return crc.value
    }

    private fun ByteArray.crc(): Long {
        val crc = CRC32()
        crc.update(this)
        return crc.value
    }
}