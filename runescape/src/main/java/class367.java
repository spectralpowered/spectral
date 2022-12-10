public class class367 extends class394 {
	int field4377;
	final class378 field4371;
	final class451 field4370;
	public byte field4375;
	public int field4374;
	public String field4373;
	public String field4379;

	public class367(class451 var1, class378 var2) {
		super(500);
		this.field4373 = null;
		this.field4379 = null;
		this.field4377 = 1;
		this.field4370 = var1;
		this.field4371 = var2;
	}

	class412 method7309() {
		return new class397();
	}

	class412[] method7316(int var1) {
		return new class397[var1];
	}

	final void method6814(String var1) {
		String var4 = class361.method6603(class44.method861(var1));
		if (null == var4) {
			var4 = "";
		}

		this.field4373 = var4;
	}

	final void method6815(String var1) {
		String var4 = class361.method6603(class44.method861(var1));
		if (var4 == null) {
			var4 = "";
		}

		this.field4379 = var4;
	}

	public final void method6824(class467 var1, int var2) {
		this.method6815(var1.method8335());
		long var4 = var1.method8492();
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
					var17.append(class361.field4343[(int)(var18 - var7 * 37L)]);
				}

				var6 = var17.reverse().toString();
			}
		} else {
			var6 = null;
		}

		this.method6814(var6);
		this.field4375 = var1.method8327();
		short var10;
		if (var2 == 1) {
			var9 = var1.method8326();
			var10 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var9 = var1.method8557();
			var10 = -1;
		}

		if (var10 != var9) {
			int var11 = var9;
			this.method7290();

			for (int var12 = 0; var12 < var11; ++var12) {
				class397 var13 = (class397)this.method7299(new class483(var1.method8335(), this.field4370));
				int var14 = var1.method8328();
				var13.method7258(var14, ++this.field4377 - 1);
				var13.field4521 = var1.method8327();
				var1.method8335();
				this.method6820(var13);
			}

		}
	}

	public final void method6817(class467 var1) {
		class483 var3 = new class483(var1.method8335(), this.field4370);
		int var4 = var1.method8328();
		byte var5 = var1.method8327();
		boolean var6 = false;
		if (var5 == -128) {
			var6 = true;
		}

		class397 var7;
		if (var6) {
			if (this.method7291() == 0) {
				return;
			}

			var7 = (class397)this.method7311(var3);
			if (var7 != null && var7.method7264() == var4) {
				this.method7298(var7);
			}
		} else {
			var1.method8335();
			var7 = (class397)this.method7311(var3);
			if (null == var7) {
				if (this.method7291() > super.field4543) {
					return;
				}

				var7 = (class397)this.method7299(var3);
			}

			var7.method7258(var4, ++this.field4377 - 1);
			var7.field4521 = var5;
			this.method6820(var7);
		}

	}

	public final void method6818() {
		for (int var2 = 0; var2 < this.method7291(); ++var2) {
			((class397)this.method7301(var2)).method7396();
		}

	}

	public final void method6834() {
		for (int var2 = 0; var2 < this.method7291(); ++var2) {
			((class397)this.method7301(var2)).method7377();
		}

	}

	final void method6820(class397 var1) {
		if (var1.method7628().equals(this.field4371.method7105())) {
			this.field4374 = var1.field4521;
		}

	}

	static void method6839(class183 var0, int var1, int var2, int var3) {
		if (client.field1947 < 50 && class186.field2040.method1868() != 0) {
			if (var0.field2004 != null && var1 < var0.field2004.length) {
				int var5 = var0.field2004[var1];
				if (var5 != 0) {
					int var8 = var5 >> 8;
					int var9 = var5 >> 4 & 7;
					int var10 = var5 & 15;
					client.field1948[client.field1947] = var8;
					client.field1949[client.field1947] = var9;
					client.field1977[client.field1947] = 0;
					client.field1757[client.field1947] = null;
					int var11 = (var2 - 64) / 128;
					int var12 = (var3 - 64) / 128;
					client.field1803[client.field1947] = (var12 << 8) + (var11 << 16) + var10;
					++client.field1947;
				}

			}
		}
	}
}
