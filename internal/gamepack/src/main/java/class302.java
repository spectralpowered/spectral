import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ed"
)
public class class302 {
	@ObfInfo(
		owner = "ed",
		name = "v",
		desc = "Lmv;"
	)
	class395 field2421;
	@ObfInfo(
		owner = "ed",
		name = "e",
		desc = "J"
	)
	long field2420;
	@ObfInfo(
		owner = "ed",
		name = "h",
		desc = "J"
	)
	long field2422;

	@ObfInfo(
		owner = "ed",
		name = "<init>",
		desc = "(Lqy;)V"
	)
	public class302(class127 var1) {
		this.field2420 = -1L;
		this.field2421 = new class395();
		this.method1457(var1);
	}

	@ObfInfo(
		owner = "ed",
		name = "h",
		desc = "(Lqy;I)V"
	)
	void method1457(class127 var1) {
		this.field2422 = var1.method598();
		this.field2420 = var1.method598();

		for (int var3 = var1.method547(); var3 != 0; var3 = var1.method547()) {
			Object var4;
			if (var3 == 1) {
				var4 = new class343(this);
			} else if (var3 == 4) {
				var4 = new class210(this);
			} else if (var3 == 3) {
				var4 = new class409(this);
			} else if (var3 == 2) {
				var4 = new class168(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}

				var4 = new class283(this);
			}

			((class410)var4).method2007(var1);
			this.field2421.method1939((class139)var4);
		}

	}

	@ObfInfo(
		owner = "ed",
		name = "e",
		desc = "(Lfn;I)V"
	)
	public void method1455(class57 var1) {
		if (var1.field1134 == this.field2422 && this.field2420 == var1.field591) {
			for (class410 var3 = (class410)this.field2421.method1941(); var3 != null; var3 = (class410)this.field2421.method1935()) {
				var3.method2008(var1);
			}

			++var1.field591;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfInfo(
		owner = "ed",
		name = "v",
		desc = "(Lqy;I)Ljava/lang/String;"
	)
	public static String method1456(class127 var0) {
		String var2;
		try {
			int var3 = var0.method559();
			if (var3 > 32767) {
				var3 = 32767;
			}

			byte[] var4 = new byte[var3];
			var0.field1070 += class243.field2052.method1809(var0.field1072, var0.field1070, var4, 0, var3);
			String var5 = class356.method1777(var4, 0, var3);
			var2 = var5;
		} catch (Exception var7) {
			var2 = "Cabbage";
		}

		return var2;
	}
}
