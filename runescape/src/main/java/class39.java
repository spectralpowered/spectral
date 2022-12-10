import java.net.URL;

public class class39 {
	static int field236;
	static int field247;
	static int[] field250;

	static boolean method507() {
		try {
			if (class5.field30 == null) {
				class5.field30 = class172.field1625.method2213(new URL(class2.field15));
			} else if (class5.field30.method2242()) {
				byte[] var1 = class5.field30.method2239();
				class467 var2 = new class467(var1);
				var2.method8480();
				class78.field709 = var2.method8328();
				class78.field710 = new class78[class78.field709];

				class78 var4;
				for (int var3 = 0; var3 < class78.field709; var4.field719 = var3++) {
					var4 = class78.field710[var3] = new class78();
					var4.field708 = var2.method8328();
					var4.field714 = var2.method8480();
					var4.field716 = var2.method8335();
					var4.field711 = var2.method8335();
					var4.field717 = var2.method8326();
					var4.field715 = var2.method8329();
				}

				class424.method7927(class78.field710, 0, class78.field710.length - 1, class78.field712, class78.field713);
				class5.field30 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			class5.field30 = null;
		}

		return false;
	}

	static class65 method508(int var0, int var1, int var2) {
		int var4 = var0 + (var1 << 8);
		class65 var7 = (class65)class65.field529.method5356((long)(var4 << 16));
		class65 var6;
		if (var7 != null) {
			var6 = var7;
		} else {
			String var14 = String.valueOf(var4);
			int var15 = class72.field619.method6319(var14);
			if (var15 == -1) {
				var6 = null;
			} else {
				label58: {
					byte[] var10 = class72.field619.method6308(var15);
					if (null != var10) {
						if (var10.length <= 1) {
							var6 = null;
							break label58;
						}

						var7 = class61.method1179(var10);
						if (null != var7) {
							class65.field529.method5364(var7, (long)(var4 << 16));
							var6 = var7;
							break label58;
						}
					}

					var6 = null;
				}
			}
		}

		if (null != var6) {
			return var6;
		} else {
			int var8 = (-3 - var2 << 8) + var0;
			class65 var16 = (class65)class65.field529.method5356((long)(var8 << 16));
			class65 var9;
			if (null != var16) {
				var9 = var16;
			} else {
				String var11 = String.valueOf(var8);
				int var12 = class72.field619.method6319(var11);
				if (var12 == -1) {
					var9 = null;
				} else {
					byte[] var13 = class72.field619.method6308(var12);
					if (null != var13) {
						if (var13.length <= 1) {
							var9 = null;
							return null != var9 ? var9 : null;
						}

						var16 = class61.method1179(var13);
						if (null != var16) {
							class65.field529.method5364(var16, (long)(var8 << 16));
							var9 = var16;
							return null != var9 ? var9 : null;
						}
					}

					var9 = null;
				}
			}

			return null != var9 ? var9 : null;
		}
	}

	static {
		field250 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	class39() throws Throwable {
		throw new Error();
	}

	static int method2454(int var0) {
		return field250[var0];
	}

	protected static final void method506() {
		class117.field1177.method3002();

		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			class40.field268[var1] = 0L;
		}

		for (var1 = 0; var1 < 32; ++var1) {
			class40.field266[var1] = 0L;
		}

		class178.field1649 = 0;
	}

	static final void method505() {
		if (class414.field4640) {
			for (int var1 = 0; var1 < class87.field818; ++var1) {
				class88 var2 = client.field1816[class87.field817[var1]];
				var2.method1910();
			}

			class414.field4640 = false;
		}

	}
}
