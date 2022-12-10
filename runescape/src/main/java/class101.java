public class class101 {
	public static void method2076(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			short var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					short var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method2076(var0, var1, var2, var6 - 1);
			method2076(var0, var1, var6 + 1, var3);
		}

	}

	class101() throws Throwable {
		throw new Error();
	}

	static int method2075(int var0, class65 var1, boolean var2) {
		int var4;
		if (var0 == CS2Opcodes.CAM_FORCEANGLE) {
			class94.field920 -= 2;
			var4 = class69.field579[class94.field920];
			int var5 = class69.field579[class94.field920 + 1];
			if (!client.field1953) {
				client.field1769 = var4;
				client.field1770 = var5;
			}

			return 1;
		} else if (var0 == CS2Opcodes.CAM_GETANGLE_XA) {
			class69.field579[++class94.field920 - 1] = client.field1769;
			return 1;
		} else if (var0 == CS2Opcodes.CAM_GETANGLE_YA) {
			class69.field579[++class94.field920 - 1] = client.field1770;
			return 1;
		} else if (var0 == CS2Opcodes.CAM_SETFOLLOWHEIGHT) {
			var4 = class69.field579[--class94.field920];
			if (var4 < 0) {
				var4 = 0;
			}

			client.field1931 = var4;
			return 1;
		} else if (var0 == CS2Opcodes.CAM_GETFOLLOWHEIGHT) {
			class69.field579[++class94.field920 - 1] = client.field1931;
			return 1;
		} else {
			return 2;
		}
	}
}
