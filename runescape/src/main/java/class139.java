public abstract class class139 extends class428 {
	class139() {
	}

	static final void method2526(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class186.field2040.method1848(!class186.field2040.method1774());
			if (class186.field2040.method1774()) {
				class105.method2785(99, "", "Roofs are now all hidden");
			} else {
				class105.method2785(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class186.field2040.method1795();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			client.field1727 = !client.field1727;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			client.field1850 = !client.field1850;
		}

		if (client.field1950 >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class166.field1548.field4705 = !class166.field1548.field4705;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class186.field2040.method1832(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class186.field2040.method1832(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				client.method4692();
			}
		}

		class284 var2 = class152.method2679(class276.field3229, client.field1748.field1105);
		var2.field3321.method8323(var0.length() + 1);
		var2.field3321.method8316(var0);
		client.field1748.method2173(var2);
	}

	abstract void method2518(class467 var1);

	abstract void method2519(class170 var1);
}
