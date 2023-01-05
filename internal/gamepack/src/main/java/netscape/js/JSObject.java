package netscape.js;

import java.applet.Applet;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * <p>
 * Allows Java code to manipulate JavaScript objects.
 * </p>
 *
 * <p>
 * When a JavaScript object is passed or returned to Java code, it
 * is wrapped in an instance of {@code JSObject}. When a
 * {@code JSObject} instance is passed to the JavaScript engine,
 * it is unwrapped back to its original JavaScript object. The
 * {@code JSObject} class provides a way to invoke JavaScript
 * methods and examine JavaScript properties.
 * </p>
 *
 * <p> Any data returned from the JavaScript engine to Java is
 * converted to Java data types. Certain data passed to the JavaScript
 * engine is converted to JavaScript data types.
 * </p>
 *
 */
@SuppressWarnings("deprecation")
public abstract class JSObject {
	/**
	 * Constructs a new JSObject. Users should neither call this method nor
	 * subclass JSObject.
	 */
	protected JSObject()  {
	}

	/**
	 * Calls a JavaScript method. Equivalent to
	 * "this.methodName(args[0], args[1], ...)" in JavaScript.
	 *
	 * @param methodName The name of the JavaScript method to be invoked.
	 * @param args the Java objects passed as arguments to the method.
	 * @return Result of the method.
	 * @throws netscape.js.JSException when an error is reported from the browser or
	 * JavaScript engine.
	 */
	public abstract Object call(String methodName, Object... args) throws netscape.js.JSException;

	/**
	 * Evaluates a JavaScript expression. The expression is a string of
	 * JavaScript source code which will be evaluated in the context given by
	 * "this".
	 *
	 * @param s The JavaScript expression.
	 * @return Result of the JavaScript evaluation.
	 * @throws netscape.js.JSException when an error is reported from the browser or
	 * JavaScript engine.
	 */
	public abstract Object eval(String s) throws netscape.js.JSException;

	/**
	 * Retrieves a named member of a JavaScript object. Equivalent to
	 * "this.name" in JavaScript.
	 *
	 * @param name The name of the JavaScript property to be accessed.
	 * @return The value of the propery.
	 * @throws netscape.js.JSException when an error is reported from the browser or
	 * JavaScript engine.
	 */
	public abstract Object getMember(String name) throws netscape.js.JSException;

	/**
	 * Sets a named member of a JavaScript object. Equivalent to
	 * "this.name = value" in JavaScript.
	 *
	 * @param name The name of the JavaScript property to be accessed.
	 * @param value The value of the propery.
	 * @throws netscape.js.JSException when an error is reported from the browser or
	 * JavaScript engine.
	 */
	public abstract void setMember(String name, Object value) throws netscape.js.JSException;

	/**
	 * Removes a named member of a JavaScript object. Equivalent
	 * to "delete this.name" in JavaScript.
	 *
	 * @param name The name of the JavaScript property to be removed.
	 * @throws netscape.js.JSException when an error is reported from the browser or
	 * JavaScript engine.
	 */
	public abstract void removeMember(String name) throws netscape.js.JSException;

	/**
	 * Retrieves an indexed member of a JavaScript object. Equivalent to
	 * "this[index]" in JavaScript.
	 *
	 * @param index The index of the array to be accessed.
	 * @return The value of the indexed member.
	 * @throws netscape.js.JSException when an error is reported from the browser or
	 * JavaScript engine.
	 */
	public abstract Object getSlot(int index) throws netscape.js.JSException;

	/**
	 * Sets an indexed member of a JavaScript object. Equivalent to
	 * "this[index] = value" in JavaScript.
	 *
	 * @param index The index of the array to be accessed.
	 * @param value The value to set
	 * @throws netscape.js.JSException when an error is reported from the browser or
	 * JavaScript engine.
	 */
	public abstract void setSlot(int index, Object value) throws netscape.js.JSException;

	/**
	 * Returns a JSObject for the window containing the given applet. This
	 * method only works when the Java code is running in a browser as an
	 * applet. The object returned may be used to access the HTML DOM directly.
	 *
	 * @param applet The applet.
	 * @return JSObject representing the window containing the given applet or
	 * {@code null} if we are not connected to a browser.
	 * @throws netscape.js.JSException when an error is reported from the browser or
	 * JavaScript engine or if applet is {@code null}
	 *
	 * @deprecated  The Applet API is deprecated. See the
	 * <a href="{@docRoot}/java.desktop/java/applet/package-summary.html">
	 * java.applet package documentation</a> for further information.
	 */

	@SuppressWarnings("exports")
	public static JSObject getWindow(Applet applet) throws JSException {
		return ProviderLoader.callGetWindow(applet);
	}

	private static class ProviderLoader {
		private static final JSObjectProvider provider;

		static {
			provider = AccessController.doPrivileged(
					(PrivilegedAction<JSObjectProvider>) () -> {
						Iterator<JSObjectProvider> providers =
								ServiceLoader.loadInstalled(JSObjectProvider.class).iterator();
						if (providers.hasNext()) {
							return providers.next();
						}
						return null;
					}
			);
		}

		private static JSObject callGetWindow(Applet applet) {
			if (provider != null) {
				return provider.getWindow(applet);
			}
			return null;
		}
	}
}