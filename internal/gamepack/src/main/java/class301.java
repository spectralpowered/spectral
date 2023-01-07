import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "dp"
)
public class class301 implements class78 {
	@ObfInfo(
		owner = "dp",
		name = "e",
		desc = "Ldp;"
	)
	static final class301 field2413;
	@ObfInfo(
		owner = "dp",
		name = "v",
		desc = "Ldp;"
	)
	static final class301 field2414;
	@ObfInfo(
		owner = "dp",
		name = "m",
		desc = "Ldp;"
	)
	static final class301 field2416;
	@ObfInfo(
		owner = "dp",
		name = "h",
		desc = "Ldp;"
	)
	static final class301 field2418;
	@ObfInfo(
		owner = "dp",
		name = "x",
		desc = "Ldp;"
	)
	static final class301 field2419;
	@ObfInfo(
		owner = "dp",
		name = "f",
		desc = "I"
	)
	final int field2415;
	@ObfInfo(
		owner = "dp",
		name = "q",
		desc = "I"
	)
	final int field2417;

	static {
		field2418 = new class301(0, 0);
		field2413 = new class301(1, 1);
		field2414 = new class301(2, 2);
		field2419 = new class301(3, 3);
		field2416 = new class301(4, 4);
	}

	@ObfInfo(
		owner = "dp",
		name = "<init>",
		desc = "(II)V"
	)
	class301(int var1, int var2) {
		this.field2417 = var1;
		this.field2415 = var2;
	}

	@ObfInfo(
		owner = "dp",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field2415;
	}

	@ObfInfo(
		owner = "dp",
		name = "i",
		desc = "(ZI)V"
	)
	static void method1454(boolean var0) {
		byte var2 = 0;
		boolean var3 = class50.field574.method2209() >= client.field224;
		if (!var3) {
			var2 = 12;
		} else if (class309.field2461.method169() || class309.field2461.method170()) {
			var2 = 10;
		}

		class286.method1419(var2);
		if (var0) {
			class359.field3071 = "";
			class359.field3067 = "";
			class398.field3358 = 0;
			class60.field603 = "";
		}

		class211.method913();
		class492.method2437();
	}
}
