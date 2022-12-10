public final class class70 extends class428 {
	static class355 field604;
	class196 field608;
	class42 field602;
	class42 field607;
	int field594;
	int field595;
	int field596;
	int field597;
	int field598;
	int field599;
	int field600;
	int field601;
	int field603;
	int field606;
	int[] field605;

	static {
		field604 = new class355();
	}

	class70() {
	}

	static void method2233() {
		for (class70 var1 = (class70)field604.method6577(); var1 != null; var1 = (class70)field604.method6579()) {
			if (var1.field602 != null) {
				class76.field694.method1018(var1.field602);
				var1.field602 = null;
			}

			if (var1.field607 != null) {
				class76.field694.method1018(var1.field607);
				var1.field607 = null;
			}
		}

		field604.method6583();
	}

	public static boolean method1403(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var2 = class363.field4351;

				for (int var3 = 0; var3 < var2.length; ++var3) {
					char var4 = var2[var3];
					if (var0 == var4) {
						return true;
					}
				}
			}

			return false;
		}
	}

	void method1397() {
		int var2 = this.field601;
		class196 var3 = this.field608.method3863();
		if (null != var3) {
			this.field601 = var3.field2211;
			this.field603 = var3.field2192 * 128;
			this.field598 = var3.field2209;
			this.field595 = var3.field2210;
			this.field605 = var3.field2171;
		} else {
			this.field601 = -1;
			this.field603 = 0;
			this.field598 = 0;
			this.field595 = 0;
			this.field605 = null;
		}

		if (var2 != this.field601 && this.field602 != null) {
			class76.field694.method1018(this.field602);
			this.field602 = null;
		}

	}
}
