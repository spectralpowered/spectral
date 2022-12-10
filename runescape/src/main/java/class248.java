import java.util.Iterator;
import java.util.LinkedList;

public abstract class class248 {
	public static boolean field2932;
	static class386 field2935;
	boolean field2933;
	boolean field2934;
	byte[][][] field2929;
	byte[][][] field2930;
	class260[][][][] field2925;
	int field2919;
	int field2920;
	int field2921;
	int field2923;
	int field2924;
	int field2926;
	int field2927;
	int field2931;
	short[][][] field2922;
	short[][][] field2928;

	static {
		field2932 = true;
	}

	public static class469[] method4895(class337 var0, int var1, int var2) {
		byte[] var5 = var0.method6374(var1, var2);
		boolean var4;
		if (null == var5) {
			var4 = false;
		} else {
			class165.method2776(var5);
			var4 = true;
		}

		return !var4 ? null : class263.method5259();
	}

	class248() {
		this.field2919 = -1;
		this.field2926 = -1;
		new LinkedList();
		this.field2933 = false;
		this.field2934 = false;
	}

	boolean method4896() {
		return this.field2933 && this.field2934;
	}

	void method4898(class337 var1) {
		if (!this.method4896()) {
			byte[] var3 = var1.method6374(this.field2919, this.field2926);
			if (var3 != null) {
				this.method4902(new class467(var3));
				this.field2933 = true;
				this.field2934 = true;
			}

		}
	}

	void method4907() {
		this.field2928 = (short[][][])null;
		this.field2922 = (short[][][])null;
		this.field2929 = (byte[][][])null;
		this.field2930 = (byte[][][])null;
		this.field2925 = (class260[][][][])null;
		this.field2933 = false;
		this.field2934 = false;
	}

	void method4899(int var1, int var2, class467 var3) {
		int var5 = var3.method8326();
		if (var5 != 0) {
			if (0 != (var5 & 1)) {
				this.method4900(var1, var2, var3, var5);
			} else {
				this.method4901(var1, var2, var3, var5);
			}

		}
	}

	void method4900(int var1, int var2, class467 var3, int var4) {
		boolean var6 = (var4 & 2) != 0;
		if (var6) {
			this.field2922[0][var1][var2] = field2932 ? (short)var3.method8328() : (short)var3.method8326();
		}

		this.field2928[0][var1][var2] = field2932 ? (short)var3.method8328() : (short)var3.method8326();
	}

	void method4901(int var1, int var2, class467 var3, int var4) {
		int var6 = ((var4 & 24) >> 3) + 1;
		boolean var7 = (var4 & 2) != 0;
		boolean var8 = 0 != (var4 & 4);
		this.field2928[0][var1][var2] = field2932 ? (short)var3.method8328() : (short)var3.method8326();
		int var9;
		int var10;
		int var12;
		if (var7) {
			var9 = var3.method8326();

			for (var10 = 0; var10 < var9; ++var10) {
				int var11 = field2932 ? var3.method8328() : var3.method8326();
				if (var11 != 0) {
					this.field2922[var10][var1][var2] = (short)var11;
					var12 = var3.method8326();
					this.field2929[var10][var1][var2] = (byte)(var12 >> 2);
					this.field2930[var10][var1][var2] = (byte)(var12 & 3);
				}
			}
		}

		if (var8) {
			for (var9 = 0; var9 < var6; ++var9) {
				var10 = var3.method8326();
				if (var10 != 0) {
					class260[] var15 = this.field2925[var9][var1][var2] = new class260[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						int var13 = var3.method8344();
						int var14 = var3.method8326();
						var15[var12] = new class260(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}

	}

	int method4906() {
		return this.field2921;
	}

	int method4914() {
		return this.field2927;
	}

	static final void method4924() {
		Iterator var1 = class105.field1084.iterator();

		while (var1.hasNext()) {
			class74 var2 = (class74)var1.next();
			var2.method1476();
		}

		if (class267.field3147 != null) {
			class267.field3147.method6834();
		}

	}

	abstract void method4902(class467 var1);
}
