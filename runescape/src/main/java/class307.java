import java.net.MalformedURLException;
import java.net.URL;

public class class307 {
	class117 field3676;
	class491 field3675;

	class307(String var1, class116 var2) {
		try {
			this.field3676 = var2.method2213(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3676 = null;
		}

	}

	class307(class117 var1) {
		this.field3676 = var1;
	}

	class491 method6100() {
		if (this.field3675 == null && this.field3676 != null && this.field3676.method2242()) {
			if (this.field3676.method2239() != null) {
				this.field3675 = class47.method6425(this.field3676.method2239());
			}

			this.field3676 = null;
		}

		return this.field3675;
	}

	static void method6105(class326 var0, int var1) {
		if (var0.field4132) {
			if (var1 <= class334.field4216) {
				throw new RuntimeException("");
			}

			if (var1 < class334.field4197) {
				class334.field4197 = var1;
			}
		} else {
			if (var1 >= class334.field4197) {
				throw new RuntimeException("");
			}

			if (var1 > class334.field4216) {
				class334.field4216 = var1;
			}
		}

		if (null != class164.field1529) {
			class164.field1529.field4915 = 5 + var1 * 8;
			if (class164.field1529.field4915 >= class164.field1529.field4917.length) {
				if (!var0.field4132) {
					throw new RuntimeException("");
				}

				var0.method6207();
			} else {
				int var3 = class164.field1529.method8480();
				int var4 = class164.field1529.method8480();
				var0.method6244(var3, var4);
			}

		} else {
			class165.method2768((class326)null, 255, 255, 0, (byte)0, true);
			class334.field4211[var1] = var0;
		}
	}

	static final void method6101(class466 var0) {
		for (int var2 = 0; var2 < class87.field820; ++var2) {
			int var3 = class87.field824[var2];
			class88 var4 = client.field1816[var3];
			int var5 = var0.method8326();
			if ((var5 & 64) != 0) {
				var5 += var0.method8326() << 8;
			}

			class192.method3750(var0, var3, var4, var5);
		}

	}

	static int method6106(class290 var0) {
		if (11 != var0.field3536) {
			--class69.field581;
			class69.field579[++class94.field920 - 1] = -1;
			return 1;
		} else {
			String var2 = class69.field580[--class69.field581];
			class69.field579[++class94.field920 - 1] = var0.method5516(var2);
			return 1;
		}
	}
}
