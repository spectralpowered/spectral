public class class241 implements class257 {
	static int field2892;
	int field2886;
	int field2887;
	int field2888;
	int field2889;
	int field2890;
	int field2891;

	class241() {
	}

	public void method5078(class254 var1) {
		if (var1.field2971 > this.field2886) {
			var1.field2971 = this.field2886;
		}

		if (var1.field2972 < this.field2886) {
			var1.field2972 = this.field2886;
		}

		if (var1.field2967 > this.field2890) {
			var1.field2967 = this.field2890;
		}

		if (var1.field2974 < this.field2890) {
			var1.field2974 = this.field2890;
		}

	}

	public boolean method5071(int var1, int var2, int var3) {
		if (var1 >= this.field2891 && var1 < this.field2891 + this.field2887) {
			return this.field2888 == var2 >> 6 && var3 >> 6 == this.field2889;
		} else {
			return false;
		}
	}

	public boolean method5070(int var1, int var2) {
		return var1 >> 6 == this.field2886 && this.field2890 == var2 >> 6;
	}

	public int[] method5073(int var1, int var2, int var3) {
		if (!this.method5071(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field2886 * 64 - this.field2888 * 64), this.field2890 * 64 - this.field2889 * 64 + var3};
			return var5;
		}
	}

	public class311 method5076(int var1, int var2) {
		if (!this.method5070(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2888 * 64 - this.field2886 * 64 + var1;
			int var5 = var2 + (this.field2889 * 64 - this.field2890 * 64);
			return new class311(this.field2891, var4, var5);
		}
	}

	public void method5075(class467 var1) {
		this.field2891 = var1.method8326();
		this.field2887 = var1.method8326();
		this.field2888 = var1.method8328();
		this.field2889 = var1.method8328();
		this.field2886 = var1.method8328();
		this.field2890 = var1.method8328();
		this.method4798();
	}

	void method4798() {
	}

	static void method4785(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var0 + var1) / 2;
			int var8 = var0;
			class78 var9 = class78.field710[var7];
			class78.field710[var7] = class78.field710[var1];
			class78.field710[var1] = var9;

			for (int var10 = var0; var10 < var1; ++var10) {
				if (class133.method2478(class78.field710[var10], var9, var2, var3, var4, var5) <= 0) {
					class78 var11 = class78.field710[var10];
					class78.field710[var10] = class78.field710[var8];
					class78.field710[var8++] = var11;
				}
			}

			class78.field710[var1] = class78.field710[var8];
			class78.field710[var8] = var9;
			method4785(var0, var8 - 1, var2, var3, var4, var5);
			method4785(var8 + 1, var1, var2, var3, var4, var5);
		}

	}
}
