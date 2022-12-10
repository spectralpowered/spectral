public class class217 {
	static class427 field2637;
	class124[] field2634;
	int field2639;

	class217(class467 var1, int var2) {
		this.field2634 = new class124[var2];
		this.field2639 = var1.method8326();

		for (int var3 = 0; var3 < this.field2634.length; ++var3) {
			class124 var4 = new class124(this.field2639, var1, false);
			this.field2634[var3] = var4;
		}

		this.method4503();
	}

	void method4503() {
		class124[] var2 = this.field2634;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class124 var4 = var2[var3];
			if (var4.field1227 >= 0) {
				var4.field1224 = this.field2634[var4.field1227];
			}
		}

	}

	public int method4504() {
		return this.field2634.length;
	}

	class124 method4505(int var1) {
		return var1 >= this.method4504() ? null : this.field2634[var1];
	}

	class124[] method4516() {
		return this.field2634;
	}

	void method4507(class153 var1, int var2) {
		this.method4518(var1, var2, (boolean[])null, false);
	}

	void method4518(class153 var1, int var2, boolean[] var3, boolean var4) {
		int var6 = var1.method2699();
		int var7 = 0;
		class124[] var8 = this.method4516();

		for (int var9 = 0; var9 < var8.length; ++var9) {
			class124 var10 = var8[var9];
			if (var3 == null || var4 == var3[var7]) {
				var1.method2681(var2, var10, var7, var6);
			}

			++var7;
		}

	}

	public static boolean method4524() {
		return client.field1875 != null;
	}
}
