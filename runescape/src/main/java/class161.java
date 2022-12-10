import java.io.File;
import java.io.IOException;

public class class161 extends class439 {
	public static class337 field1504;
	static class170 field1505;
	static class170 field1507;
	static class282 field1502;
	static int field1506;
	public boolean field1503;

	static {
		field1502 = new class282(64);
	}

	class161() {
		this.field1503 = false;
	}

	void method2729(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method2730(var1, var3);
		}
	}

	void method2730(class467 var1, int var2) {
		if (var2 == 2) {
			this.field1503 = true;
		}

	}

	public static File method2728(String var0, String var1, int var2) {
		String var4 = var2 == 0 ? "" : "" + var2;
		class163.field1513 = new File(class110.field1118, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
		String var5 = null;
		String var6 = null;
		boolean var7 = false;
		File var23;
		if (class163.field1513.exists()) {
			try {
				class459 var8 = new class459(class163.field1513, "rw", 10000L);

				class467 var9;
				int var10;
				for (var9 = new class467((int)var8.method8194()); var9.field4915 < var9.field4917.length; var9.field4915 += var10) {
					var10 = var8.method8188(var9.field4917, var9.field4915, var9.field4917.length - var9.field4915);
					if (var10 == -1) {
						throw new IOException();
					}
				}

				var9.field4915 = 0;
				var10 = var9.method8326();
				if (var10 < 1 || var10 > 3) {
					throw new IOException("" + var10);
				}

				int var11 = 0;
				if (var10 > 1) {
					var11 = var9.method8326();
				}

				if (var10 <= 2) {
					var5 = var9.method8336();
					if (var11 == 1) {
						var6 = var9.method8336();
					}
				} else {
					var5 = var9.method8487();
					if (var11 == 1) {
						var6 = var9.method8487();
					}
				}

				var8.method8185();
			} catch (IOException var21) {
				var21.printStackTrace();
			}

			if (null != var5) {
				var23 = new File(var5);
				if (!var23.exists()) {
					var5 = null;
				}
			}

			if (null != var5) {
				var23 = new File(var5, "test.dat");
				if (!class251.method4967(var23, true)) {
					var5 = null;
				}
			}
		}

		if (null == var5 && var2 == 0) {
			label124:
			for (int var16 = 0; var16 < class92.field885.length; ++var16) {
				for (int var17 = 0; var17 < class121.field1210.length; ++var17) {
					File var18 = new File(class121.field1210[var17] + class92.field885[var16] + File.separatorChar + var0 + File.separatorChar);
					if (var18.exists() && class251.method4967(new File(var18, "test.dat"), true)) {
						var5 = var18.toString();
						var7 = true;
						break label124;
					}
				}
			}
		}

		if (var5 == null) {
			var5 = class110.field1118 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var7 = true;
		}

		if (var6 != null) {
			File var22 = new File(var6);
			var23 = new File(var5);

			try {
				File[] var24 = var22.listFiles();
				File[] var19 = var24;

				for (int var12 = 0; var12 < var19.length; ++var12) {
					File var13 = var19[var12];
					File var14 = new File(var23, var13.getName());
					boolean var15 = var13.renameTo(var14);
					if (!var15) {
						throw new IOException();
					}
				}
			} catch (Exception var20) {
				var20.printStackTrace();
			}

			var7 = true;
		}

		if (var7) {
			class107.method2141(new File(var5), (File)null);
		}

		return new File(var5);
	}
}
