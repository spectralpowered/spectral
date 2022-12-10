public class class56 {
	class74[] field413;
	int field411;

	class56() {
		this.field413 = new class74[100];
	}

	class74 method1057(int var1, String var2, String var3, String var4) {
		class74 var6 = this.field413[99];

		for (int var7 = this.field411; var7 > 0; --var7) {
			if (var7 != 100) {
				this.field413[var7] = this.field413[var7 - 1];
			}
		}

		if (var6 == null) {
			var6 = new class74(var1, var2, var4, var3);
		} else {
			var6.method7951();
			var6.method7996();
			var6.method1483(var1, var2, var4, var3);
		}

		this.field413[0] = var6;
		if (this.field411 < 100) {
			++this.field411;
		}

		return var6;
	}

	class74 method1056(int var1) {
		return var1 >= 0 && var1 < this.field411 ? this.field413[var1] : null;
	}

	int method1058() {
		return this.field411;
	}
}
