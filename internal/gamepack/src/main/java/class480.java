import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ev"
)
public abstract class class480 extends class139 {
	@ObfInfo(
		owner = "ev",
		name = "<init>",
		desc = "()V"
	)
	class480() {
	}

	@ObfInfo(
		owner = "ev",
		name = "h",
		desc = "(Lqy;I)V"
	)
	abstract void method2367(class127 var1);

	@ObfInfo(
		owner = "ev",
		name = "e",
		desc = "(Lep;I)V"
	)
	abstract void method2368(class429 var1);

	@ObfInfo(
		owner = "ev",
		name = "v",
		desc = "(II)Z"
	)
	public static boolean method2371(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfInfo(
		owner = "ev",
		name = "e",
		desc = "(Ljp;Lrg;B)Ljx;"
	)
	public static class299 method2370(class356 var0, class205 var1) {
		class299 var3 = class342.method1739();
		var3.field2405 = var0;
		var3.field2400 = var0.field3039;
		if (-1 == var3.field2400) {
			var3.field2403 = new class6(260);
		} else if (var3.field2400 == -2) {
			var3.field2403 = new class6(10000);
		} else if (var3.field2400 <= 18) {
			var3.field2403 = new class6(20);
		} else if (var3.field2400 <= 98) {
			var3.field2403 = new class6(100);
		} else {
			var3.field2403 = new class6(260);
		}

		var3.field2403.method28(var1);
		var3.field2403.method32(var3.field2405.field3038);
		var3.field2402 = 0;
		return var3;
	}

	@ObfInfo(
		owner = "ev",
		name = "lh",
		desc = "(S)V"
	)
	static void method2369() {
		for (class415 var1 = (class415)client.field394.method789(); null != var1; var1 = (class415)client.field394.method790()) {
			int var2 = var1.field3426;
			if (class268.method1275(var2)) {
				boolean var3 = true;
				class120[] var4 = class329.field2600[var2];

				int var5;
				for (var5 = 0; var5 < var4.length; ++var5) {
					if (var4[var5] != null) {
						var3 = var4[var5].field893;
						break;
					}
				}

				if (!var3) {
					var5 = (int)var1.field1134;
					class120 var6 = class67.method299(var5);
					if (var6 != null) {
						class184.method836(var6);
					}
				}
			}
		}

	}
}
