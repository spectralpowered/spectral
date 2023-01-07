import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "nv"
)
public final class class58 extends class420 {
	@ObfInfo(
		owner = "nv",
		name = "<init>",
		desc = "([B[I[I[I[I[I[[B)V"
	)
	public class58(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	@ObfInfo(
		owner = "nv",
		name = "<init>",
		desc = "([B)V"
	)
	public class58(byte[] var1) {
		super(var1);
	}

	@ObfInfo(
		owner = "nv",
		name = "h",
		desc = "([BIIIII)V"
	)
	final void method2035(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * class162.field1232;
		int var8 = class162.field1232 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < class162.field1234) {
			var11 = class162.field1234 - var3;
			var5 -= var11;
			var3 = class162.field1234;
			var10 += var11 * var4;
			var7 += var11 * class162.field1232;
		}

		if (var3 + var5 > class162.field1235) {
			var5 -= var3 + var5 - class162.field1235;
		}

		if (var2 < class162.field1236) {
			var11 = class162.field1236 - var2;
			var4 -= var11;
			var2 = class162.field1236;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var2 + var4 > class162.field1237) {
			var11 = var2 + var4 - class162.field1237;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			method2038(class162.field1233, var1, var6, var10, var7, var4, var5, var8, var9);
		}
	}

	@ObfInfo(
		owner = "nv",
		name = "e",
		desc = "([BIIIIII)V"
	)
	final void method2036(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * class162.field1232;
		int var9 = class162.field1232 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < class162.field1234) {
			var12 = class162.field1234 - var3;
			var5 -= var12;
			var3 = class162.field1234;
			var11 += var12 * var4;
			var8 += var12 * class162.field1232;
		}

		if (var3 + var5 > class162.field1235) {
			var5 -= var3 + var5 - class162.field1235;
		}

		if (var2 < class162.field1236) {
			var12 = class162.field1236 - var2;
			var4 -= var12;
			var2 = class162.field1236;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if (var2 + var4 > class162.field1237) {
			var12 = var2 + var4 - class162.field1237;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			method2043(class162.field1233, var1, var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
}
