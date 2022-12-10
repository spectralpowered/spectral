public class class63 extends class226 {
	class183 field514;
	int field507;
	int field508;
	int field509;
	int field510;
	int field512;
	int field513;
	int field515;
	int field516;

	static final class454 method1199(class467 var0, class454 var1) {
		int var3 = var0.method8326();
		int var4;
		if (var1 == null) {
			var4 = class279.method8200(var3);
			var1 = new class454(var4);
		}

		for (var4 = 0; var4 < var3; ++var4) {
			boolean var5 = var0.method8326() == 1;
			int var6 = var0.method8330();
			Object var7;
			if (var5) {
				var7 = new class426(var0.method8335());
			} else {
				var7 = new class429(var0.method8480());
			}

			var1.method8133((class428)var7, (long)var6);
		}

		return var1;
	}

	class63(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class226 var9) {
		this.field513 = var1;
		this.field508 = var2;
		this.field509 = var3;
		this.field510 = var4;
		this.field507 = var5;
		this.field512 = var6;
		if (var7 != -1) {
			this.field514 = class214.method4351(var7);
			this.field516 = 0;
			this.field515 = client.field1700 - 1;
			if (this.field514.field1991 == 0 && null != var9 && var9 instanceof class63) {
				class63 var10 = (class63)var9;
				if (this.field514 == var10.field514) {
					this.field516 = var10.field516;
					this.field515 = var10.field515;
					return;
				}
			}

			if (var8 && this.field514.field2012 != -1) {
				if (!this.field514.method3505()) {
					this.field516 = (int)(Math.random() * (double)this.field514.field2009.length);
					this.field515 -= (int)(Math.random() * (double)this.field514.field2003[this.field516]);
				} else {
					this.field516 = (int)(Math.random() * (double)this.field514.method3509());
				}
			}
		}

	}

	protected final class216 method4625() {
		int var3;
		if (null != this.field514) {
			int var2 = client.field1700 - this.field515;
			if (var2 > 100 && this.field514.field2012 > 0) {
				var2 = 100;
			}

			if (this.field514.method3505()) {
				var3 = this.field514.method3509();
				this.field516 += var2;
				var2 = 0;
				if (this.field516 >= var3) {
					this.field516 = var3 - this.field514.field2012;
					if (this.field516 < 0 || this.field516 > var3) {
						this.field514 = null;
					}
				}
			} else {
				label80: {
					do {
						do {
							if (var2 <= this.field514.field2003[this.field516]) {
								break label80;
							}

							var2 -= this.field514.field2003[this.field516];
							++this.field516;
						} while(this.field516 < this.field514.field2009.length);

						this.field516 -= this.field514.field2012;
					} while(this.field516 >= 0 && this.field516 < this.field514.field2009.length);

					this.field514 = null;
				}
			}

			this.field515 = client.field1700 - var2;
		}

		class196 var13 = class165.method2780(this.field513);
		if (null != var13.field2204) {
			var13 = var13.method3863();
		}

		if (var13 == null) {
			return null;
		} else {
			int var4;
			if (this.field509 != 1 && this.field509 != 3) {
				var3 = var13.field2178;
				var4 = var13.field2179;
			} else {
				var3 = var13.field2179;
				var4 = var13.field2178;
			}

			int var5 = this.field507 + (var3 >> 1);
			int var6 = (var3 + 1 >> 1) + this.field507;
			int var7 = this.field512 + (var4 >> 1);
			int var8 = this.field512 + (var4 + 1 >> 1);
			int[][] var9 = class84.field765[this.field510];
			int var10 = var9[var6][var8] + var9[var5][var7] + var9[var6][var7] + var9[var5][var8] >> 2;
			int var11 = (var3 << 6) + (this.field507 << 7);
			int var12 = (var4 << 6) + (this.field512 << 7);
			return var13.method3818(this.field508, this.field509, var9, var11, var10, var12, this.field514, this.field516);
		}
	}

	static int method1200(int var0) {
		class74 var2 = (class74)class105.field1084.method8135((long)var0);
		if (null == var2) {
			return -1;
		} else {
			return var2.field4796 == class105.field1082.field4290 ? -1 : ((class74)var2.field4796).field671;
		}
	}
}
