public abstract class class152 extends class428 {
	public static boolean method2680(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	public static class284 method2679(class276 var0, class475 var1) {
		class284 var3 = class127.method2407();
		var3.field3323 = var0;
		var3.field3318 = var0.field3301;
		if (-1 == var3.field3318) {
			var3.field3321 = new class466(260);
		} else if (var3.field3318 == -2) {
			var3.field3321 = new class466(10000);
		} else if (var3.field3318 <= 18) {
			var3.field3321 = new class466(20);
		} else if (var3.field3318 <= 98) {
			var3.field3321 = new class466(100);
		} else {
			var3.field3321 = new class466(260);
		}

		var3.field3321.method8269(var1);
		var3.field3321.method8274(var3.field3323.field3300);
		var3.field3320 = 0;
		return var3;
	}

	class152() {
	}

	static void method2678() {
		for (class102 var1 = (class102)client.field1863.method8172(); null != var1; var1 = (class102)client.field1863.method8173()) {
			int var2 = var1.field1057;
			if (class87.method1889(var2)) {
				boolean var3 = true;
				class290[] var4 = class72.field625[var2];

				int var5;
				for (var5 = 0; var5 < var4.length; ++var5) {
					if (var4[var5] != null) {
						var3 = var4[var5].field3398;
						break;
					}
				}

				if (!var3) {
					var5 = (int)var1.field4773;
					class290 var6 = class180.method2988(var5);
					if (var6 != null) {
						class53.method1040(var6);
					}
				}
			}
		}

	}

	abstract void method2674(class467 var1);

	abstract void method2677(class146 var1);
}
