public class class243 {
	static class469 field2900;
	class251 field2899;
	int field2896;
	int field2897;
	String field2898;

	class243(String var1, int var2, int var3, class251 var4) {
		this.field2898 = var1;
		this.field2897 = var2;
		this.field2896 = var3;
		this.field2899 = var4;
	}

	static int method4847(char var0, class340 var1) {
		int var3 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var3 = 1 + (var0 << 4);
		}

		if (var0 == 241 && var1 == class340.field4262) {
			var3 = 1762;
		}

		return var3;
	}

	static final void method4848(class290[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class290 var4 = var0[var3];
			if (null != var4) {
				if (0 == var4.field3536) {
					if (null != var4.field3541) {
						method4848(var4.field3541, var1);
					}

					class102 var5 = (class102)client.field1863.method8177((long)var4.field3492);
					if (var5 != null) {
						client.method6246(var5.field1057, var1);
					}
				}

				class80 var6;
				if (var1 == 0 && var4.field3523 != null) {
					var6 = new class80();
					var6.field733 = var4;
					var6.field735 = var4.field3523;
					class69.method2874(var6);
				}

				if (var1 == 1 && var4.field3524 != null) {
					if (var4.field3400 >= 0) {
						class290 var7 = class180.method2988(var4.field3492);
						if (null == var7 || null == var7.field3541 || var4.field3400 >= var7.field3541.length || var7.field3541[var4.field3400] != var4) {
							continue;
						}
					}

					var6 = new class80();
					var6.field733 = var4;
					var6.field735 = var4.field3524;
					class69.method2874(var6);
				}
			}
		}

	}
}
