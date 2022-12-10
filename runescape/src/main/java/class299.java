public class class299 {
	static final byte[] field3619;
	class467 field3626;
	int field3617;
	int field3618;
	int[] field3621;
	int[] field3622;
	int[] field3625;
	int[] field3627;
	long field3623;

	static {
		field3619 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	class299() {
		this.field3626 = new class467((byte[])null);
	}

	class299(byte[] var1) {
		this.field3626 = new class467((byte[])null);
		this.method5976(var1);
	}

	void method5976(byte[] var1) {
		this.field3626.field4917 = var1;
		this.field3626.field4915 = 10;
		int var2 = this.field3626.method8328();
		this.field3618 = this.field3626.method8328();
		this.field3617 = 500000;
		this.field3621 = new int[var2];

		class467 var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.field4915 += var5) {
			int var4 = this.field3626.method8480();
			var5 = this.field3626.method8480();
			if (var4 == 1297379947) {
				this.field3621[var3] = this.field3626.field4915;
				++var3;
			}

			var10000 = this.field3626;
		}

		this.field3623 = 0L;
		this.field3627 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field3627[var3] = this.field3621[var3];
		}

		this.field3625 = new int[var2];
		this.field3622 = new int[var2];
	}

	void method5977() {
		this.field3626.field4917 = null;
		this.field3621 = null;
		this.field3627 = null;
		this.field3625 = null;
		this.field3622 = null;
	}

	boolean method5978() {
		return this.field3626.field4917 != null;
	}

	int method5979() {
		return this.field3627.length;
	}

	void method5980(int var1) {
		this.field3626.field4915 = this.field3627[var1];
	}

	void method5981(int var1) {
		this.field3627[var1] = this.field3626.field4915;
	}

	void method5982() {
		this.field3626.field4915 = -1;
	}

	void method6001(int var1) {
		int var2 = this.field3626.method8416();
		int[] var10000 = this.field3625;
		var10000[var1] += var2;
	}

	int method5984(int var1) {
		int var2 = this.method5985(var1);
		return var2;
	}

	int method5985(int var1) {
		byte var2 = this.field3626.field4917[this.field3626.field4915];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field3622[var1] = var5;
			++this.field3626.field4915;
		} else {
			var5 = this.field3622[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method6009(var1, var5);
		} else {
			int var3 = this.field3626.method8416();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.field3626.field4917[this.field3626.field4915] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.field3626.field4915;
					this.field3622[var1] = var4;
					return this.method6009(var1, var4);
				}
			}

			class467 var10000 = this.field3626;
			var10000.field4915 += var3;
			return 0;
		}
	}

	int method6009(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.field3626.method8326();
			var4 = this.field3626.method8416();
			class467 var10000;
			if (var7 == 47) {
				var10000 = this.field3626;
				var10000.field4915 += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.field3626.method8330();
				var4 -= 3;
				int var6 = this.field3625[var1];
				this.field3623 += (long)var6 * (long)(this.field3617 - var5);
				this.field3617 = var5;
				var10000 = this.field3626;
				var10000.field4915 += var4;
				return 2;
			} else {
				var10000 = this.field3626;
				var10000.field4915 += var4;
				return 3;
			}
		} else {
			byte var3 = field3619[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.field3626.method8326() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.field3626.method8326() << 16;
			}

			return var4;
		}
	}

	long method6004(int var1) {
		return this.field3623 + (long)var1 * (long)this.field3617;
	}

	int method5988() {
		int var1 = this.field3627.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.field3627[var4] >= 0 && this.field3625[var4] < var3) {
				var2 = var4;
				var3 = this.field3625[var4];
			}
		}

		return var2;
	}

	boolean method6014() {
		int var1 = this.field3627.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.field3627[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	void method5990(long var1) {
		this.field3623 = var1;
		int var3 = this.field3627.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field3625[var4] = 0;
			this.field3622[var4] = 0;
			this.field3626.field4915 = this.field3621[var4];
			this.method6001(var4);
			this.field3627[var4] = this.field3626.field4915;
		}

	}
}
