import io.spectralpowered.ObfInfo;
import java.io.File;
import java.util.Hashtable;

@ObfInfo(
	name = "ft"
)
public class class229 {
	@ObfInfo(
		owner = "ft",
		name = "h",
		desc = "Z"
	)
	static boolean field1936;
	@ObfInfo(
		owner = "ft",
		name = "e",
		desc = "Ljava/io/File;"
	)
	static File field1937;
	@ObfInfo(
		owner = "ft",
		name = "v",
		desc = "Ljava/util/Hashtable;"
	)
	static Hashtable field1938;
	@ObfInfo(
		owner = "ft",
		name = "ea",
		desc = "J"
	)
	static long field1939;

	static {
		field1936 = false;
		field1938 = new Hashtable(16);
	}

	@ObfInfo(
		owner = "ft",
		name = "ad",
		desc = "(ILbm;ZI)I"
	)
	static int method997(int var0, class461 var1, boolean var2) {
		int var4;
		if (var0 == ScriptOpcodes.KEYHELD) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = client.field460.method2132(var4) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.KEYPRESSED) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = client.field460.method2137(var4) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.KEYRELEASED) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = client.field460.method2131(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(
		owner = "ft",
		name = "lf",
		desc = "(D)V"
	)
	static final void method998(double var0) {
		class341.method1708(var0);
		((class251)class341.field2728).method1085(var0);
		class263.field2144.method395();
		class50.field574.method2228(var0);
	}
}
