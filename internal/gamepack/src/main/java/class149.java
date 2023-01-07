import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "hz"
)
public class class149 {
	@ObfInfo(
		owner = "hz",
		name = "e",
		desc = "I"
	)
	int field1167;
	@ObfInfo(
		owner = "hz",
		name = "h",
		desc = "I"
	)
	int field1168;
	@ObfInfo(
		owner = "hz",
		name = "v",
		desc = "I"
	)
	int field1169;

	@ObfInfo(
		owner = "hz",
		name = "<init>",
		desc = "()V"
	)
	class149() {
	}

	@ObfInfo(
		owner = "hz",
		name = "ae",
		desc = "(Ljava/lang/String;B)I"
	)
	public static int method697(String var0) {
		return var0.length() + 2;
	}

	@ObfInfo(
		owner = "hz",
		name = "gc",
		desc = "(I)V"
	)
	static final void method698() {
		if (client.field280 > 0) {
			class380.method1887();
		} else {
			client.field225.method1689();
			class261.method1113(40);
			class19.field95 = client.field279.method2384();
			client.field279.method2383();
		}
	}

	@ObfInfo(
		owner = "hz",
		name = "mu",
		desc = "(IIZI)V"
	)
	static final void method699(int var0, int var1, boolean var2) {
		if (client.field345[var0] != null) {
			if (var1 >= 0 && var1 < client.field345[var0].method270()) {
				class49 var4 = (class49)client.field345[var0].field597.get(var1);
				class299 var5 = class480.method2370(class356.field2961, client.field279.field4042);
				var5.field2403.method544(4 + class319.method1614(var4.field567.method1101()));
				var5.field2403.method544(var0);
				var5.field2403.method533(var1);
				var5.field2403.method537(var2);
				var5.field2403.method538(var4.field567.method1101(), (byte)41);
				client.field279.method2389(var5);
			}
		}
	}
}
