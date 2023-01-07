import io.spectralpowered.ObfInfo;
import java.io.File;
import java.io.IOException;

@ObfInfo(
	name = "fe"
)
public class class198 extends class195 {
	@ObfInfo(
		owner = "fe",
		name = "h",
		desc = "Lly;"
	)
	public static class274 field1743;
	@ObfInfo(
		owner = "fe",
		name = "a",
		desc = "Lfn;"
	)
	static class57 field1744;
	@ObfInfo(
		owner = "fe",
		name = "sk",
		desc = "Lfn;"
	)
	static class57 field1746;
	@ObfInfo(
		owner = "fe",
		name = "e",
		desc = "Ljv;"
	)
	static class99 field1741;
	@ObfInfo(
		owner = "fe",
		name = "mh",
		desc = "I"
	)
	static int field1745;
	@ObfInfo(
		owner = "fe",
		name = "v",
		desc = "Z"
	)
	public boolean field1742;

	static {
		field1741 = new class99(64);
	}

	@ObfInfo(
		owner = "fe",
		name = "<init>",
		desc = "()V"
	)
	class198() {
		this.field1742 = false;
	}

	@ObfInfo(
		owner = "fe",
		name = "e",
		desc = "(Lqy;I)V"
	)
	void method877(class127 var1) {
		while (true) {
			int var3 = var1.method547();
			if (var3 == 0) {
				return;
			}

			this.method878(var1, var3);
		}
	}

	@ObfInfo(
		owner = "fe",
		name = "v",
		desc = "(Lqy;II)V"
	)
	void method878(class127 var1, int var2) {
		if (var2 == 2) {
			this.field1742 = true;
		}

	}

	@ObfInfo(
		owner = "fe",
		name = "h",
		desc = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;"
	)
	public static File method876(String var0, String var1, int var2) {
		String var4 = var2 == 0 ? "" : "" + var2;
		class25.field114 = new File(class134.field1109, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
		String var5 = null;
		String var6 = null;
		boolean var7 = false;
		File var23;
		if (class25.field114.exists()) {
			try {
				class455 var8 = new class455(class25.field114, "rw", 10000L);

				class127 var9;
				int var10;
				for (var9 = new class127((int)var8.method2251()); var9.field1070 < var9.field1072.length; var9.field1070 += var10) {
					var10 = var8.method2250(var9.field1072, var9.field1070, var9.field1072.length - var9.field1070);
					if (var10 == -1) {
						throw new IOException();
					}
				}

				var9.field1070 = 0;
				var10 = var9.method547();
				if (var10 < 1 || var10 > 3) {
					throw new IOException("" + var10);
				}

				int var11 = 0;
				if (var10 > 1) {
					var11 = var9.method547();
				}

				if (var10 <= 2) {
					var5 = var9.method556();
					if (var11 == 1) {
						var6 = var9.method556();
					}
				} else {
					var5 = var9.method596();
					if (var11 == 1) {
						var6 = var9.method596();
					}
				}

				var8.method2248();
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
				if (!class221.method978(var23, true)) {
					var5 = null;
				}
			}
		}

		if (null == var5 && var2 == 0) {
			label103:
			for (int var16 = 0; var16 < class306.field2457.length; ++var16) {
				for (int var17 = 0; var17 < class293.field2384.length; ++var17) {
					File var18 = new File(class293.field2384[var17] + class306.field2457[var16] + File.separatorChar + var0 + File.separatorChar);
					if (var18.exists() && class221.method978(new File(var18, "test.dat"), true)) {
						var5 = var18.toString();
						var7 = true;
						break label103;
					}
				}
			}
		}

		if (var5 == null) {
			var5 = class134.field1109 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
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
			class145.method691(new File(var5), (File)null);
		}

		return new File(var5);
	}
}
