import io.spectralpowered.ObfInfo;
import java.applet.Applet;
import java.net.URL;
import netscape.js.JSObject;

@ObfInfo(
	name = "cu"
)
public class class121 extends class139 {
	@ObfInfo(
		owner = "cu",
		name = "iz",
		desc = "I"
	)
	static int field1046;
	@ObfInfo(
		owner = "cu",
		name = "v",
		desc = "I"
	)
	int field1045;
	@ObfInfo(
		owner = "cu",
		name = "e",
		desc = "I"
	)
	int field1047;
	@ObfInfo(
		owner = "cu",
		name = "h",
		desc = "I"
	)
	int field1048;
	@ObfInfo(
		owner = "cu",
		name = "x",
		desc = "I"
	)
	int field1049;

	@ObfInfo(
		owner = "cu",
		name = "<init>",
		desc = "(IIII)V"
	)
	class121(int var1, int var2, int var3, int var4) {
		this.field1048 = var1;
		this.field1047 = var2;
		this.field1045 = var3;
		this.field1049 = var4;
	}

	@ObfInfo(
		owner = "cu",
		name = "h",
		desc = "(IIIII)V"
	)
	void method514(int var1, int var2, int var3, int var4) {
		this.field1048 = var1;
		this.field1047 = var2;
		this.field1045 = var3;
		this.field1049 = var4;
	}

	@ObfInfo(
		owner = "cu",
		name = "e",
		desc = "(IB)Lqm;"
	)
	public static class11 method515(int var0) {
		class11 var2 = (class11)class11.field60.method394((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class11.field59.method1365(38, var0);
			var2 = new class11();
			if (var3 != null) {
				var2.method63(new class127(var3));
			}

			var2.method64();
			class11.field60.method396(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(
		owner = "cu",
		name = "v",
		desc = "(Ljava/lang/String;ILjava/lang/String;I)Z"
	)
	static boolean method513(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class128.field1074.startsWith("win")) {
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
				Applet var8 = class128.field1073;
				Object[] var6 = new Object[]{(new URL(class128.field1073.getCodeBase(), var0)).toString()};
				Object var4 = JSObject.getWindow(var8).call(var2, var6);
				return var4 != null;
			} catch (Throwable var10) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class128.field1073.getAppletContext().showDocument(new URL(class128.field1073.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class273.method1339(class128.field1073, "loggedout");
			} catch (Throwable var13) {
			}

			try {
				class128.field1073.getAppletContext().showDocument(new URL(class128.field1073.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var12) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(
		owner = "cu",
		name = "bh",
		desc = "(ILbm;ZB)I"
	)
	static int method516(int var0, class461 var1, boolean var2) {
		return 2;
	}
}
