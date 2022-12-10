public class class228 implements class231 {
	static int field2757;
	class232[] field2755;
	class337 field2750;
	class355 field2751;
	double field2754;
	int field2752;
	int field2753;
	int field2756;

	public class228(class337 var1, class337 var2, int var3, double var4, int var6) {
		this.field2751 = new class355();
		this.field2753 = 0;
		this.field2754 = 1.0D;
		this.field2752 = 128;
		this.field2750 = var2;
		this.field2756 = var3;
		this.field2753 = this.field2756;
		this.field2754 = var4;
		this.field2752 = var6;
		int[] var7 = var1.method6312(0);
		int var8 = var7.length;
		this.field2755 = new class232[var1.method6330(0)];

		for (int var9 = 0; var9 < var8; ++var9) {
			class467 var10 = new class467(var1.method6374(0, var7[var9]));
			this.field2755[var7[var9]] = new class232(var10);
		}

	}

	public int method4634() {
		int var2 = 0;
		int var3 = 0;
		class232[] var4 = this.field2755;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class232 var6 = var4[var5];
			if (null != var6 && var6.field2786 != null) {
				var2 += var6.field2786.length;
				int[] var7 = var6.field2786;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					int var9 = var7[var8];
					if (this.field2750.method6346(var9)) {
						++var3;
					}
				}
			}
		}

		if (var2 == 0) {
			return 0;
		} else {
			return var3 * 100 / var2;
		}
	}

	public void method4635(double var1) {
		this.field2754 = var1;
		this.method4633();
	}

	public int[] method4670(int var1) {
		class232 var3 = this.field2755[var1];
		if (var3 != null) {
			if (null != var3.field2781) {
				this.field2751.method6573(var3);
				var3.field2794 = true;
				return var3.field2781;
			}

			boolean var4 = var3.method4683(this.field2754, this.field2752, this.field2750);
			if (var4) {
				if (0 == this.field2753) {
					class232 var5 = (class232)this.field2751.method6598();
					var5.method4687();
				} else {
					--this.field2753;
				}

				this.field2751.method6573(var3);
				var3.field2794 = true;
				return var3.field2781;
			}
		}

		return null;
	}

	public int method4673(int var1) {
		return this.field2755[var1] != null ? this.field2755[var1].field2785 : 0;
	}

	public boolean method4668(int var1) {
		return this.field2755[var1].field2791;
	}

	public boolean method4666(int var1) {
		return this.field2752 == 64;
	}

	public void method4633() {
		for (int var2 = 0; var2 < this.field2755.length; ++var2) {
			if (null != this.field2755[var2]) {
				this.field2755[var2].method4687();
			}
		}

		this.field2751 = new class355();
		this.field2753 = this.field2756;
	}

	public void method4655(int var1) {
		for (int var3 = 0; var3 < this.field2755.length; ++var3) {
			class232 var4 = this.field2755[var3];
			if (var4 != null && var4.field2783 != 0 && var4.field2794) {
				var4.method4682(var1);
				var4.field2794 = false;
			}
		}

	}
}
