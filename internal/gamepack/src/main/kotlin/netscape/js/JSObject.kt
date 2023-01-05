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

package netscape.js

import netscape.javascript.JSException
import netscape.javascript.JSObject
import java.applet.Applet
import java.security.AccessController
import java.security.PrivilegedAction
import java.util.*

abstract class JSObject protected constructor() {

    @Throws(JSException::class)
    abstract fun call(methodName: String?, vararg args: Any?): Any?

    @Throws(JSException::class)
    abstract fun eval(s: String?): Any?

    @Throws(JSException::class)
    abstract fun getMember(name: String?): Any?

    @Throws(JSException::class)
    abstract fun setMember(name: String?, value: Any?)

    @Throws(JSException::class)
    abstract fun removeMember(name: String?)

    @Throws(JSException::class)
    abstract fun getSlot(index: Int): Any?

    @Throws(JSException::class)
    abstract fun setSlot(index: Int, value: Any?)

    private object ProviderLoader {

        private var provider: JSObjectProvider? = null

        init {
            provider = AccessController.doPrivileged(PrivilegedAction {
                val providers: Iterator<JSObjectProvider> = ServiceLoader.loadInstalled(
                    JSObjectProvider::class.java
                ).iterator()
                if (providers.hasNext()) {
                    providers.next()
                } else null
            })
        }

        fun callGetWindow(applet: Applet): JSObject? {
            return provider?.getWindow(applet)
        }
    }

    companion object {

        @Throws(JSException::class)
        fun getWindow(applet: Applet): JSObject? {
            return ProviderLoader.callGetWindow(applet)
        }
    }
}