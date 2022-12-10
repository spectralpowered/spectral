public class class95 {
	int field924;
	final class326 field925;
	final int field926;

	class95(class326 var1, String var2) {
		this.field924 = 0;
		this.field925 = var1;
		this.field926 = var1.method6314();
	}

	boolean method2024() {
		this.field924 = 0;

		for (int var2 = 0; var2 < this.field926; ++var2) {
			if (!this.field925.method6236(var2) || this.field925.method6212(var2)) {
				++this.field924;
			}
		}

		return this.field924 >= this.field926;
	}

	static String method2023(class290 var0) {
		if (class292.method2150(class182.method3010(var0)) == 0) {
			return null;
		} else {
			return var0.field3490 != null && var0.field3490.trim().length() != 0 ? var0.field3490 : null;
		}
	}
}
