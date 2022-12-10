public class class166 extends class439 {
	public static class337 field1538;
	public static class337 field1546;
	static class282 field1539;
	static class418 field1548;
	int[] field1541;
	int[] field1542;
	short[] field1537;
	short[] field1543;
	short[] field1544;
	short[] field1545;
	public boolean field1547;
	public int field1540;

	static {
		field1539 = new class282(64);
	}

	class166() {
		this.field1540 = -1;
		this.field1542 = new int[]{-1, -1, -1, -1, -1};
		this.field1547 = false;
	}

	void method2789(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method2783(var1, var3);
		}
	}

	void method2783(class467 var1, int var2) {
		if (var2 == 1) {
			this.field1540 = var1.method8326();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.method8326();
				this.field1541 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1541[var5] = var1.method8328();
				}
			} else if (var2 == 3) {
				this.field1547 = true;
			} else if (var2 == 40) {
				var4 = var1.method8326();
				this.field1543 = new short[var4];
				this.field1537 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1543[var5] = (short)var1.method8328();
					this.field1537[var5] = (short)var1.method8328();
				}
			} else if (var2 == 41) {
				var4 = var1.method8326();
				this.field1544 = new short[var4];
				this.field1545 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1544[var5] = (short)var1.method8328();
					this.field1545[var5] = (short)var1.method8328();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.field1542[var2 - 60] = var1.method8328();
			}
		}

	}

	public boolean method2802() {
		if (null == this.field1541) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field1541.length; ++var3) {
				if (!field1546.method6366(this.field1541[var3], 0)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	public class191 method2799() {
		if (null == this.field1541) {
			return null;
		} else {
			class191[] var2 = new class191[this.field1541.length];

			for (int var3 = 0; var3 < this.field1541.length; ++var3) {
				var2[var3] = class191.method3645(field1546, this.field1541[var3], 0);
			}

			class191 var5;
			if (1 == var2.length) {
				var5 = var2[0];
			} else {
				var5 = new class191(var2, var2.length);
			}

			int var4;
			if (null != this.field1543) {
				for (var4 = 0; var4 < this.field1543.length; ++var4) {
					var5.method3660(this.field1543[var4], this.field1537[var4]);
				}
			}

			if (null != this.field1544) {
				for (var4 = 0; var4 < this.field1544.length; ++var4) {
					var5.method3661(this.field1544[var4], this.field1545[var4]);
				}
			}

			return var5;
		}
	}

	public boolean method2786() {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.field1542[var3] != -1 && !field1546.method6366(this.field1542[var3], 0)) {
				var2 = false;
			}
		}

		return var2;
	}

	public class191 method2787() {
		class191[] var2 = new class191[5];
		int var3 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field1542[var4] != -1) {
				var2[var3++] = class191.method3645(field1546, this.field1542[var4], 0);
			}
		}

		class191 var6 = new class191(var2, var3);
		int var5;
		if (null != this.field1543) {
			for (var5 = 0; var5 < this.field1543.length; ++var5) {
				var6.method3660(this.field1543[var5], this.field1537[var5]);
			}
		}

		if (null != this.field1544) {
			for (var5 = 0; var5 < this.field1544.length; ++var5) {
				var6.method3661(this.field1544[var5], this.field1545[var5]);
			}
		}

		return var6;
	}

	public static void method1207() {
		field1539.method5357();
	}
}
