public class class108 extends class409 {
	static int field1098;
	final boolean field1097;

	public class108(boolean var1) {
		this.field1097 = var1;
	}

	int method2143(class391 var1, class391 var2) {
		if (var1.field4520 != 0 && 0 != var2.field4520) {
			return this.field1097 ? var1.method7628().method8779(var2.method7628()) : var2.method7628().method8779(var1.method7628());
		} else {
			return this.method7584(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2143((class391)var1, (class391)var2);
	}

	static void method2149(class78 var0) {
		if (var0.method1533() != client.field1691) {
			client.field1691 = var0.method1533();
			class200.method6510(var0.method1533());
		}

		if (client.field1777 != var0.field714) {
			class326 var2 = class86.field798;
			int var3 = var0.field714;
			if ((var3 & 536870912) != 0) {
				class73.field631 = class62.method1193(var2, "logo_deadman_mode", "");
			} else if ((var3 & 1073741824) != 0) {
				class73.field631 = class62.method1193(var2, "logo_seasonal_mode", "");
			} else if (0 != (var3 & 256)) {
				class73.field631 = class62.method1193(var2, "logo_speedrunning", "");
			} else {
				class73.field631 = class62.method1193(var2, "logo", "");
			}
		}

		class143.field1371 = var0.field716;
		client.field1864 = var0.field708;
		client.field1777 = var0.field714;
		class170.field1603 = 0 == client.field1690 ? 43594 : 40000 + var0.field708;
		class147.field1417 = client.field1690 == 0 ? 443 : var0.field708 + 50000;
		class47.field342 = class170.field1603;
	}
}
