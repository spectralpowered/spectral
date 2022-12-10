public class class106 {
	public static final float field1088;
	public static final float field1089;
	static float[] field1087;
	static float[] field1091;

	static {
		field1088 = Math.ulp(1.0F);
		field1089 = field1088 * 2.0F;
		field1087 = new float[4];
		field1091 = new float[5];
	}

	class106() throws Throwable {
		throw new Error();
	}

	static void method6201(class125 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (null != var0) {
			var0.field1244 = var1;
			float var10 = var4 - var1;
			float var11 = var8 - var5;
			float var12 = var2 - var1;
			float var13 = 0.0F;
			float var14 = 0.0F;
			if (0.0D != (double)var12) {
				var13 = (var6 - var5) / var12;
			}

			var12 = var4 - var3;
			if ((double)var12 != 0.0D) {
				var14 = (var8 - var7) / var12;
			}

			float var15 = 1.0F / (var10 * var10);
			float var16 = var13 * var10;
			float var17 = var14 * var10;
			var0.field1246 = (var17 + var16 - var11 - var11) * var15 / var10;
			var0.field1260 = var15 * (var11 + var11 + var11 - var16 - var16 - var17);
			var0.field1238 = var13;
			var0.field1249 = var5;
		}
	}
}
