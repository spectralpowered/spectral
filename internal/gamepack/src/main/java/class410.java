import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ei"
)
public abstract class class410 extends class139 {
	@ObfInfo(
		owner = "ei",
		name = "<init>",
		desc = "()V"
	)
	class410() {
	}

	@ObfInfo(
		owner = "ei",
		name = "h",
		desc = "(Lqy;I)V"
	)
	abstract void method2007(class127 var1);

	@ObfInfo(
		owner = "ei",
		name = "e",
		desc = "(Lfn;I)V"
	)
	abstract void method2008(class57 var1);

	@ObfInfo(
		owner = "ei",
		name = "hn",
		desc = "(Ljava/lang/String;I)V"
	)
	static final void method2009(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class50.field574.method2229(!class50.field574.method2202());
			if (class50.field574.method2202()) {
				class164.method765(99, "", "Roofs are now all hidden");
			} else {
				class164.method765(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class50.field574.method2217();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			client.field258 = !client.field258;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			client.field381 = !client.field381;
		}

		if (client.field481 >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class164.field1249.field2290 = !class164.field1249.field2290;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class50.field574.method2226(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class50.field574.method2226(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class149.method698();
			}
		}

		class299 var2 = class480.method2370(class356.field2967, client.field279.field4042);
		var2.field2403.method544(var0.length() + 1);
		var2.field2403.method538(var0, (byte)3);
		client.field279.method2389(var2);
	}
}
