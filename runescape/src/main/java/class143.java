public class class143 {
	static class491 field1379;
	static String field1371;
	class360 field1373;
	int field1372;
	long field1378;

	public class143(class467 var1) {
		this.field1372 = -1;
		this.field1373 = new class360();
		this.method2558(var1);
	}

	void method2558(class467 var1) {
		this.field1378 = var1.method8492();
		this.field1372 = var1.method8480();

		for (int var3 = var1.method8326(); var3 != 0; var3 = var1.method8326()) {
			Object var4;
			if (var3 == 3) {
				var4 = new class157(this);
			} else if (var3 == 1) {
				var4 = new class145(this);
			} else if (var3 == 13) {
				var4 = new class136(this);
			} else if (var3 == 4) {
				var4 = new class133(this);
			} else if (var3 == 6) {
				var4 = new class156(this);
			} else if (var3 == 5) {
				var4 = new class138(this);
			} else if (var3 == 2) {
				var4 = new class131(this);
			} else if (var3 == 7) {
				var4 = new class149(this);
			} else if (var3 == 14) {
				var4 = new class147(this);
			} else if (var3 == 8) {
				var4 = new class151(this);
			} else if (var3 == 9) {
				var4 = new class159(this);
			} else if (var3 == 10) {
				var4 = new class140(this);
			} else if (var3 == 11) {
				var4 = new class154(this);
			} else if (var3 == 12) {
				var4 = new class141(this);
			} else {
				if (var3 != 15) {
					throw new RuntimeException("");
				}

				var4 = new class142(this);
			}

			((class152)var4).method2674(var1);
			this.field1373.method6672((class428)var4);
		}

	}

	public void method2559(class146 var1) {
		if (this.field1378 == var1.field1390 && var1.field1413 == this.field1372) {
			for (class152 var3 = (class152)this.field1373.method6705(); null != var3; var3 = (class152)this.field1373.method6665()) {
				var3.method2677(var1);
			}

			++var1.field1413;
		} else {
			throw new RuntimeException("");
		}
	}

	static final void method2552(byte[] var0, int var1, int var2, class211 var3, class205[] var4) {
		class467 var6 = new class467(var0);
		int var7 = -1;

		while (true) {
			int var8 = var6.method8508();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;

			while (true) {
				int var10 = var6.method8340();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 63;
				int var12 = var9 >> 6 & 63;
				int var13 = var9 >> 12;
				int var14 = var6.method8326();
				int var15 = var14 >> 2;
				int var16 = var14 & 3;
				int var17 = var1 + var12;
				int var18 = var11 + var2;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if (2 == (class84.field773[1][var17][var18] & 2)) {
						var19 = var13 - 1;
					}

					class205 var20 = null;
					if (var19 >= 0) {
						var20 = var4[var19];
					}

					class116.method2236(var13, var17, var18, var7, var16, var15, var3, var20);
				}
			}
		}
	}
}
