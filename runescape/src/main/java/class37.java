public class class37 {
	class68[] field228;
	int field227;
	int field230;

	public static class37 method481(class337 var0, int var1, int var2) {
		byte[] var3 = var0.method6374(var1, var2);
		return var3 == null ? null : new class37(new class467(var3));
	}

	class37(class467 var1) {
		this.field228 = new class68[10];

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.method8326();
			if (var3 != 0) {
				--var1.field4915;
				this.field228[var2] = new class68();
				this.field228[var2].method1239(var1);
			}
		}

		this.field227 = var1.method8328();
		this.field230 = var1.method8328();
	}

	public class32 method483() {
		byte[] var1 = this.method485();
		return new class32(22050, var1, this.field227 * 22050 / 1000, this.field230 * 22050 / 1000);
	}

	public final int method484() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field228[var2] != null && this.field228[var2].field563 / 20 < var1) {
				var1 = this.field228[var2].field563 / 20;
			}
		}

		if (this.field227 < this.field230 && this.field227 / 20 < var1) {
			var1 = this.field227 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.field228[var2] != null) {
					class68 var10000 = this.field228[var2];
					var10000.field563 -= var1 * 20;
				}
			}

			if (this.field227 < this.field230) {
				this.field227 -= var1 * 20;
				this.field230 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	final byte[] method485() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field228[var2] != null && this.field228[var2].field562 + this.field228[var2].field563 > var1) {
				var1 = this.field228[var2].field562 + this.field228[var2].field563;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];

			for (int var4 = 0; var4 < 10; ++var4) {
				if (this.field228[var4] != null) {
					int var5 = this.field228[var4].field562 * 22050 / 1000;
					int var6 = this.field228[var4].field563 * 22050 / 1000;
					int[] var7 = this.field228[var4].method1249(var5, this.field228[var4].field562);

					for (int var8 = 0; var8 < var5; ++var8) {
						int var9 = var3[var8 + var6] + (var7[var8] >> 8);
						if ((var9 + 128 & -256) != 0) {
							var9 = var9 >> 31 ^ 127;
						}

						var3[var8 + var6] = (byte)var9;
					}
				}
			}

			return var3;
		}
	}
}
