public class class100 {
	static class469 field1042;
	int field1034;
	int field1036;
	int field1037;
	int field1041;

	class100(int var1, int var2, int var3, int var4) {
		this.field1041 = var1;
		this.field1034 = var2;
		this.field1036 = var3;
		this.field1037 = var4;
	}

	int method2064() {
		return this.field1041;
	}

	int method2065() {
		return this.field1034;
	}

	int method2066() {
		return this.field1036;
	}

	int method2071() {
		return this.field1037;
	}

	static boolean method2074(class196 var0) {
		if (var0.field2204 != null) {
			int[] var2 = var0.field2204;

			for (int var3 = 0; var3 < var2.length; ++var3) {
				int var4 = var2[var3];
				class196 var5 = class165.method2780(var4);
				if (-1 != var5.field2191) {
					return true;
				}
			}
		} else if (var0.field2191 != -1) {
			return true;
		}

		return false;
	}
}
