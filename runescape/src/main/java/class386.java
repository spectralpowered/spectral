public final class class386 extends class369 {
	public class386(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public class386(byte[] var1) {
		super(var1);
	}

	final void method6869(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * class478.field5011;
		int var8 = class478.field5011 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < class478.field5013) {
			var11 = class478.field5013 - var3;
			var5 -= var11;
			var3 = class478.field5013;
			var10 += var11 * var4;
			var7 += var11 * class478.field5011;
		}

		if (var3 + var5 > class478.field5014) {
			var5 -= var3 + var5 - class478.field5014;
		}

		if (var2 < class478.field5015) {
			var11 = class478.field5015 - var2;
			var4 -= var11;
			var2 = class478.field5015;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var2 + var4 > class478.field5016) {
			var11 = var2 + var4 - class478.field5016;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			method6872(class478.field5012, var1, var6, var10, var7, var4, var5, var8, var9);
		}
	}

	final void method6870(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * class478.field5011;
		int var9 = class478.field5011 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < class478.field5013) {
			var12 = class478.field5013 - var3;
			var5 -= var12;
			var3 = class478.field5013;
			var11 += var12 * var4;
			var8 += var12 * class478.field5011;
		}

		if (var3 + var5 > class478.field5014) {
			var5 -= var3 + var5 - class478.field5014;
		}

		if (var2 < class478.field5015) {
			var12 = class478.field5015 - var2;
			var4 -= var12;
			var2 = class478.field5015;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if (var2 + var4 > class478.field5016) {
			var12 = var2 + var4 - class478.field5016;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			method6898(class478.field5012, var1, var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
}
