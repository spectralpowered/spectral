import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "nc"
)
public class class17 extends class304 {
	@ObfInfo(
		owner = "nc",
		name = "r",
		desc = "I"
	)
	int field88;
	@ObfInfo(
		owner = "nc",
		name = "e",
		desc = "Lqi;"
	)
	final class194 field83;
	@ObfInfo(
		owner = "nc",
		name = "v",
		desc = "Lnn;"
	)
	final class234 field84;
	@ObfInfo(
		owner = "nc",
		name = "q",
		desc = "B"
	)
	public byte field87;
	@ObfInfo(
		owner = "nc",
		name = "f",
		desc = "I"
	)
	public int field86;
	@ObfInfo(
		owner = "nc",
		name = "x",
		desc = "Ljava/lang/String;"
	)
	public String field85;
	@ObfInfo(
		owner = "nc",
		name = "m",
		desc = "Ljava/lang/String;"
	)
	public String field89;

	@ObfInfo(
		owner = "nc",
		name = "<init>",
		desc = "(Lqi;Lnn;)V"
	)
	public class17(class194 var1, class234 var2) {
		super(500);
		this.field85 = null;
		this.field89 = null;
		this.field88 = 1;
		this.field83 = var1;
		this.field84 = var2;
	}

	@ObfInfo(
		owner = "nc",
		name = "h",
		desc = "(B)Lov;"
	)
	class368 method1482() {
		return new class469();
	}

	@ObfInfo(
		owner = "nc",
		name = "e",
		desc = "(II)[Lov;"
	)
	class368[] method1485(int var1) {
		return new class469[var1];
	}

	@ObfInfo(
		owner = "nc",
		name = "v",
		desc = "(Ljava/lang/String;I)V"
	)
	final void method76(String var1) {
		String var4 = class10.method61(class128.method607(var1));
		if (null == var4) {
			var4 = "";
		}

		this.field85 = var4;
	}

	@ObfInfo(
		owner = "nc",
		name = "g",
		desc = "(Ljava/lang/String;B)V"
	)
	final void method77(String var1) {
		String var4 = class10.method61(class128.method607(var1));
		if (var4 == null) {
			var4 = "";
		}

		this.field89 = var4;
	}

	@ObfInfo(
		owner = "nc",
		name = "i",
		desc = "(Lqy;II)V"
	)
	public final void method82(class127 var1, int var2) {
		this.method77(var1.method555());
		long var4 = var1.method598();
		long var7 = var4;
		String var6;
		int var9;
		if (var4 > 0L && var4 < 6582952005840035281L) {
			if (var4 % 37L == 0L) {
				var6 = null;
			} else {
				var9 = 0;

				for (long var15 = var4; var15 != 0L; var15 /= 37L) {
					++var9;
				}

				StringBuilder var17 = new StringBuilder(var9);

				while (var7 != 0L) {
					long var18 = var7;
					var7 /= 37L;
					var17.append(class417.field3429[(int)(var18 - var7 * 37L)]);
				}

				var6 = var17.reverse().toString();
			}
		} else {
			var6 = null;
		}

		this.method76(var6);
		this.field87 = var1.method548();
		short var10;
		if (var2 == 1) {
			var9 = var1.method547();
			var10 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var9 = var1.method605();
			var10 = -1;
		}

		if (var10 != var9) {
			int var11 = var9;
			this.method1466();

			for (int var12 = 0; var12 < var11; ++var12) {
				class469 var13 = (class469)this.method1473(new class257(var1.method555(), this.field83));
				int var14 = var1.method549();
				var13.method303(var14, ++this.field88 - 1);
				var13.field628 = var1.method548();
				var1.method555();
				this.method81(var13);
			}

		}
	}

	@ObfInfo(
		owner = "nc",
		name = "o",
		desc = "(Lqy;B)V"
	)
	public final void method79(class127 var1) {
		class257 var3 = new class257(var1.method555(), this.field83);
		int var4 = var1.method549();
		byte var5 = var1.method548();
		boolean var6 = false;
		if (var5 == -128) {
			var6 = true;
		}

		class469 var7;
		if (var6) {
			if (this.method1467() == 0) {
				return;
			}

			var7 = (class469)this.method1483(var3);
			if (var7 != null && var7.method305() == var4) {
				this.method1472(var7);
			}
		} else {
			var1.method555();
			var7 = (class469)this.method1483(var3);
			if (null == var7) {
				if (this.method1467() > super.field2442) {
					return;
				}

				var7 = (class469)this.method1473(var3);
			}

			var7.method303(var4, ++this.field88 - 1);
			var7.field628 = var5;
			this.method81(var7);
		}

	}

	@ObfInfo(
		owner = "nc",
		name = "n",
		desc = "(I)V"
	)
	public final void method80() {
		for (int var2 = 0; var2 < this.method1467(); ++var2) {
			((class469)this.method1475(var2)).method2295();
		}

	}

	@ObfInfo(
		owner = "nc",
		name = "k",
		desc = "(B)V"
	)
	public final void method83() {
		for (int var2 = 0; var2 < this.method1467(); ++var2) {
			((class469)this.method1475(var2)).method2292();
		}

	}

	@ObfInfo(
		owner = "nc",
		name = "a",
		desc = "(Log;I)V"
	)
	final void method81(class469 var1) {
		if (var1.method1817().equals(this.field84.method1021())) {
			this.field86 = var1.field628;
		}

	}

	@ObfInfo(
		owner = "nc",
		name = "gy",
		desc = "(Lga;IIIB)V"
	)
	static void method84(class242 var0, int var1, int var2, int var3) {
		if (client.field478 < 50 && class50.field574.method2230() != 0) {
			if (var0.field2038 != null && var1 < var0.field2038.length) {
				int var5 = var0.field2038[var1];
				if (var5 != 0) {
					int var8 = var5 >> 8;
					int var9 = var5 >> 4 & 7;
					int var10 = var5 & 15;
					client.field479[client.field478] = var8;
					client.field480[client.field478] = var9;
					client.field508[client.field478] = 0;
					client.field288[client.field478] = null;
					int var11 = (var2 - 64) / 128;
					int var12 = (var3 - 64) / 128;
					client.field334[client.field478] = (var12 << 8) + (var11 << 16) + var10;
					++client.field478;
				}

			}
		}
	}

	@ObfInfo(
		owner = "nc",
		name = "jd",
		desc = "(I)V"
	)
	static void method86() {
		class212.method915();
		client.field375[0] = class177.field1406;
		client.field256[0] = "";
		client.field463[0] = 1006;
		client.field377[0] = false;
		client.field369 = 1;
	}
}
