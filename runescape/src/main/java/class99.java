import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

public class class99 extends class428 {
	static int field1027;
	int field1026;
	int field1028;
	int field1029;
	int field1033;

	class99(int var1, int var2, int var3, int var4) {
		this.field1029 = var1;
		this.field1028 = var2;
		this.field1026 = var3;
		this.field1033 = var4;
	}

	void method2058(int var1, int var2, int var3, int var4) {
		this.field1029 = var1;
		this.field1028 = var2;
		this.field1026 = var3;
		this.field1033 = var4;
	}

	public static class455 method2059(int var0) {
		class455 var2 = (class455)class455.field4873.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class455.field4872.method6374(38, var0);
			var2 = new class455();
			if (var3 != null) {
				var2.method8139(new class467(var3));
			}

			var2.method8142();
			class455.field4873.method5364(var2, (long)var0);
			return var2;
		}
	}

	static boolean method2057(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class44.field319.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var5 = 0; var5 < var0.length(); ++var5) {
						if (var14.indexOf(var0.charAt(var5)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var8 = class44.field318;
				Object[] var6 = new Object[]{(new URL(class44.field318.getCodeBase(), var0)).toString()};
				Object var4 = JSObject.getWindow(var8).call(var2, var6);
				return var4 != null;
			} catch (Throwable var10) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class44.field318.getAppletContext().showDocument(new URL(class44.field318.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class30.method420(class44.field318, "loggedout");
			} catch (Throwable var13) {
			}

			try {
				class44.field318.getAppletContext().showDocument(new URL(class44.field318.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var12) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
