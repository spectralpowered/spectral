public class class405 {
	public static class61 field4602;
	static final class405 field4599;
	final int field4600;

	static {
		field4599 = new class405(3);
	}

	class405(int var1) {
		this.field4600 = var1;
	}

	static float method7523(class416 var0, float var1, float var2, float var3) {
		float var5 = class416.method1055(var0.field4646, var0.field4648, var1);
		if (Math.abs(var5) < class106.field1088) {
			return var1;
		} else {
			float var6 = class416.method1055(var0.field4646, var0.field4648, var2);
			if (Math.abs(var6) < class106.field1088) {
				return var2;
			} else {
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var9 = 0.0F;
				float var14 = 0.0F;
				boolean var15 = true;
				boolean var16 = false;

				do {
					var16 = false;
					if (var15) {
						var7 = var1;
						var14 = var5;
						var8 = var2 - var1;
						var9 = var8;
						var15 = false;
					}

					if (Math.abs(var14) < Math.abs(var6)) {
						var1 = var2;
						var2 = var7;
						var7 = var1;
						var5 = var6;
						var6 = var14;
						var14 = var5;
					}

					float var17 = class106.field1089 * Math.abs(var2) + var3 * 0.5F;
					float var18 = 0.5F * (var7 - var2);
					boolean var19 = Math.abs(var18) > var17 && 0.0F != var6;
					if (var19) {
						if (Math.abs(var9) >= var17 && Math.abs(var5) > Math.abs(var6)) {
							float var13 = var6 / var5;
							float var10;
							float var11;
							if (var7 == var1) {
								var10 = var18 * 2.0F * var13;
								var11 = 1.0F - var13;
							} else {
								var11 = var5 / var14;
								float var12 = var6 / var14;
								var10 = var13 * (var18 * 2.0F * var11 * (var11 - var12) - (var2 - var1) * (var12 - 1.0F));
								var11 = (var13 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
							}

							if ((double)var10 > 0.0D) {
								var11 = -var11;
							} else {
								var10 = -var10;
							}

							var13 = var9;
							var9 = var8;
							if (var10 * 2.0F < var18 * 3.0F * var11 - Math.abs(var17 * var11) && var10 < Math.abs(var13 * 0.5F * var11)) {
								var8 = var10 / var11;
							} else {
								var8 = var18;
								var9 = var18;
							}
						} else {
							var8 = var18;
							var9 = var18;
						}

						var1 = var2;
						var5 = var6;
						if (Math.abs(var8) > var17) {
							var2 += var8;
						} else if ((double)var18 > 0.0D) {
							var2 += var17;
						} else {
							var2 -= var17;
						}

						var6 = class416.method1055(var0.field4646, var0.field4648, var2);
						if ((double)(var6 * (var14 / Math.abs(var14))) > 0.0D) {
							var15 = true;
							var16 = true;
						} else {
							var16 = true;
						}
					}
				} while(var16);

				return var2;
			}
		}
	}
}
