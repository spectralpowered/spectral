public class class332 extends class428 {
	int field4182;
	public byte[] field4180;
	public class326 field4179;
	public class399 field4181;

	class332() {
	}

	static boolean method6273(class466 var0, int var1) {
		int var3 = var0.method8281(2);
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) {
			if (var0.method8281(1) != 0) {
				method6273(var0, var1);
			}

			var4 = var0.method8281(13);
			var5 = var0.method8281(13);
			boolean var13 = var0.method8281(1) == 1;
			if (var13) {
				class87.field824[++class87.field820 - 1] = var1;
			}

			if (null != client.field1816[var1]) {
				throw new RuntimeException();
			} else {
				class88 var7 = client.field1816[var1] = new class88();
				var7.field848 = var1;
				if (null != class87.field815[var1]) {
					var7.method1926(class87.field815[var1]);
				}

				var7.field1014 = class87.field821[var1];
				var7.field981 = class87.field823[var1];
				var8 = class87.field816[var1];
				var9 = var8 >> 28;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				var7.field1001[0] = class87.field822[var1];
				var7.field847 = (byte)var9;
				var7.method1915(var4 + (var10 << 13) - class151.field1447, var5 + (var11 << 13) - class388.field4509);
				var7.field838 = false;
				return true;
			}
		} else if (var3 == 1) {
			var4 = var0.method8281(2);
			var5 = class87.field816[var1];
			class87.field816[var1] = (var5 & 268435455) + ((var4 + (var5 >> 28) & 3) << 28);
			return false;
		} else {
			int var6;
			int var12;
			if (var3 == 2) {
				var4 = var0.method8281(5);
				var5 = var4 >> 3;
				var6 = var4 & 7;
				var12 = class87.field816[var1];
				var8 = (var12 >> 28) + var5 & 3;
				var9 = var12 >> 14 & 255;
				var10 = var12 & 255;
				if (var6 == 0) {
					--var9;
					--var10;
				}

				if (var6 == 1) {
					--var10;
				}

				if (var6 == 2) {
					++var9;
					--var10;
				}

				if (var6 == 3) {
					--var9;
				}

				if (var6 == 4) {
					++var9;
				}

				if (var6 == 5) {
					--var9;
					++var10;
				}

				if (var6 == 6) {
					++var10;
				}

				if (var6 == 7) {
					++var9;
					++var10;
				}

				class87.field816[var1] = var10 + (var9 << 14) + (var8 << 28);
				return false;
			} else {
				var4 = var0.method8281(18);
				var5 = var4 >> 16;
				var6 = var4 >> 8 & 255;
				var12 = var4 & 255;
				var8 = class87.field816[var1];
				var9 = (var8 >> 28) + var5 & 3;
				var10 = (var8 >> 14) + var6 & 255;
				var11 = var12 + var8 & 255;
				class87.field816[var1] = (var9 << 28) + (var10 << 14) + var11;
				return false;
			}
		}
	}
}
