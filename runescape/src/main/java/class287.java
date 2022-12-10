public class class287 extends class27 {
	boolean field3346;
	class293 field3367;
	class299 field3366;
	class310[][] field3348;
	class310[][] field3365;
	class458 field3351;
	int field3353;
	int field3361;
	int field3368;
	int field3369;
	int[] field3347;
	int[] field3349;
	int[] field3350;
	int[] field3352;
	int[] field3354;
	int[] field3355;
	int[] field3356;
	int[] field3357;
	int[] field3358;
	int[] field3359;
	int[] field3360;
	int[] field3362;
	int[] field3363;
	int[] field3364;
	int[] field3372;
	long field3370;
	long field3371;

	public class287() {
		this.field3353 = 256;
		this.field3361 = 1000000;
		this.field3350 = new int[16];
		this.field3354 = new int[16];
		this.field3358 = new int[16];
		this.field3352 = new int[16];
		this.field3372 = new int[16];
		this.field3364 = new int[16];
		this.field3355 = new int[16];
		this.field3356 = new int[16];
		this.field3357 = new int[16];
		this.field3347 = new int[16];
		this.field3359 = new int[16];
		this.field3360 = new int[16];
		this.field3349 = new int[16];
		this.field3362 = new int[16];
		this.field3363 = new int[16];
		this.field3348 = new class310[16][128];
		this.field3365 = new class310[16][128];
		this.field3366 = new class299();
		this.field3367 = new class293(this);
		this.field3351 = new class458(128);
		this.method5472();
	}

	synchronized void method5442(int var1) {
		this.field3353 = var1;
	}

	int method5447() {
		return this.field3353;
	}

	synchronized boolean method5381(class289 var1, class337 var2, class36 var3, int var4) {
		var1.method5485();
		boolean var6 = true;
		int[] var7 = null;
		if (var4 > 0) {
			var7 = new int[]{var4};
		}

		for (class431 var8 = (class431)var1.field3378.method8172(); var8 != null; var8 = (class431)var1.field3378.method8173()) {
			int var9 = (int)var8.field4773;
			class298 var10 = (class298)this.field3351.method8177((long)var9);
			if (null == var10) {
				var10 = class352.method6554(var2, var9);
				if (var10 == null) {
					var6 = false;
					continue;
				}

				this.field3351.method8170(var10, (long)var9);
			}

			if (!var10.method5965(var3, var8.field4776, var7)) {
				var6 = false;
			}
		}

		if (var6) {
			var1.method5492();
		}

		return var6;
	}

	synchronized void method5382() {
		for (class298 var2 = (class298)this.field3351.method8172(); null != var2; var2 = (class298)this.field3351.method8173()) {
			var2.method5966();
		}

	}

	synchronized void method5383() {
		for (class298 var2 = (class298)this.field3351.method8172(); var2 != null; var2 = (class298)this.field3351.method8173()) {
			var2.method7951();
		}

	}

	synchronized void method5462(class289 var1, boolean var2) {
		this.method5385();
		this.field3366.method5976(var1.field3379);
		this.field3346 = var2;
		this.field3370 = 0L;
		int var4 = this.field3366.method5979();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field3366.method5980(var5);
			this.field3366.method6001(var5);
			this.field3366.method5981(var5);
		}

		this.field3368 = this.field3366.method5988();
		this.field3369 = this.field3366.field3625[this.field3368];
		this.field3371 = this.field3366.method6004(this.field3369);
	}

	synchronized void method5385() {
		this.field3366.method5977();
		this.method5472();
	}

	synchronized boolean method5386() {
		return this.field3366.method5978();
	}

	public synchronized void method5387(int var1, int var2) {
		this.method5388(var1, var2);
	}

	void method5388(int var1, int var2) {
		this.field3352[var1] = var2;
		this.field3364[var1] = var2 & -128;
		this.method5389(var1, var2);
	}

	void method5389(int var1, int var2) {
		if (var2 != this.field3372[var1]) {
			this.field3372[var1] = var2;

			for (int var4 = 0; var4 < 128; ++var4) {
				this.field3365[var1][var4] = null;
			}
		}

	}

	void method5390(int var1, int var2, int var3) {
		this.method5422(var1, var2, 64);
		if (0 != (this.field3347[var1] & 2)) {
			for (class310 var5 = (class310)this.field3367.field3561.method6578(); var5 != null; var5 = (class310)this.field3367.field3561.method6590()) {
				if (var1 == var5.field3699 && var5.field3687 < 0) {
					this.field3348[var1][var5.field3691] = null;
					this.field3348[var1][var2] = var5;
					int var6 = var5.field3694 + (var5.field3696 * var5.field3686 >> 12);
					var5.field3694 += var2 - var5.field3691 << 8;
					var5.field3686 = var6 - var5.field3694;
					var5.field3696 = 4096;
					var5.field3691 = var2;
					return;
				}
			}
		}

		class298 var10 = (class298)this.field3351.method8177((long)this.field3372[var1]);
		if (null != var10) {
			class32 var9 = var10.field3609[var2];
			if (null != var9) {
				class310 var7 = new class310();
				var7.field3699 = var1;
				var7.field3689 = var10;
				var7.field3698 = var9;
				var7.field3700 = var10.field3611[var2];
				var7.field3690 = var10.field3614[var2];
				var7.field3691 = var2;
				var7.field3695 = 1024 + var10.field3613[var2] * var3 * var3 * var10.field3612 >> 11;
				var7.field3693 = var10.field3616[var2] & 255;
				var7.field3694 = (var2 << 8) - (var10.field3610[var2] & 32767);
				var7.field3697 = 0;
				var7.field3692 = 0;
				var7.field3688 = 0;
				var7.field3687 = -1;
				var7.field3701 = 0;
				if (this.field3349[var1] == 0) {
					var7.field3704 = class42.method832(var9, this.method5404(var7), this.method5405(var7), this.method5406(var7));
				} else {
					var7.field3704 = class42.method832(var9, this.method5404(var7), 0, this.method5406(var7));
					this.method5434(var7, var10.field3610[var2] < 0);
				}

				if (var10.field3610[var2] < 0) {
					var7.field3704.method727(-1);
				}

				if (var7.field3690 >= 0) {
					class310 var8 = this.field3365[var1][var7.field3690];
					if (var8 != null && var8.field3687 < 0) {
						this.field3348[var1][var8.field3691] = null;
						var8.field3687 = 0;
					}

					this.field3365[var1][var7.field3690] = var7;
				}

				this.field3367.field3561.method6572(var7);
				this.field3348[var1][var2] = var7;
			}
		}
	}

	void method5434(class310 var1, boolean var2) {
		int var4 = var1.field3698.field179.length;
		int var5;
		if (var2 && var1.field3698.field182) {
			int var6 = var4 + var4 - var1.field3698.field180;
			var5 = (int)((long)this.field3349[var1.field3699] * (long)var6 >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.field3704.method733(true);
			}
		} else {
			var5 = (int)((long)var4 * (long)this.field3349[var1.field3699] >> 6);
		}

		var1.field3704.method732(var5);
	}

	void method5422(int var1, int var2, int var3) {
		class310 var5 = this.field3348[var1][var2];
		if (null != var5) {
			this.field3348[var1][var2] = null;
			if ((this.field3347[var1] & 2) != 0) {
				for (class310 var6 = (class310)this.field3367.field3561.method6577(); var6 != null; var6 = (class310)this.field3367.field3561.method6579()) {
					if (var6.field3699 == var5.field3699 && var6.field3687 < 0 && var5 != var6) {
						var5.field3687 = 0;
						break;
					}
				}
			} else {
				var5.field3687 = 0;
			}

		}
	}

	void method5432(int var1, int var2, int var3) {
	}

	void method5464(int var1, int var2) {
	}

	void method5395(int var1, int var2) {
		this.field3355[var1] = var2;
	}

	void method5403(int var1) {
		for (class310 var3 = (class310)this.field3367.field3561.method6577(); null != var3; var3 = (class310)this.field3367.field3561.method6579()) {
			if (var1 < 0 || var3.field3699 == var1) {
				if (var3.field3704 != null) {
					var3.field3704.method737(class50.field363 / 100);
					if (var3.field3704.method783()) {
						this.field3367.field3563.method1017(var3.field3704);
					}

					var3.method6124();
				}

				if (var3.field3687 < 0) {
					this.field3348[var3.field3699][var3.field3691] = null;
				}

				var3.method7951();
			}
		}

	}

	void method5397(int var1) {
		if (var1 >= 0) {
			this.field3350[var1] = 12800;
			this.field3354[var1] = 8192;
			this.field3358[var1] = 16383;
			this.field3355[var1] = 8192;
			this.field3356[var1] = 0;
			this.field3357[var1] = 8192;
			this.method5481(var1);
			this.method5401(var1);
			this.field3347[var1] = 0;
			this.field3359[var1] = 32767;
			this.field3360[var1] = 256;
			this.field3349[var1] = 0;
			this.method5475(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5397(var1);
			}

		}
	}

	void method5398(int var1) {
		for (class310 var3 = (class310)this.field3367.field3561.method6577(); var3 != null; var3 = (class310)this.field3367.field3561.method6579()) {
			if ((var1 < 0 || var3.field3699 == var1) && var3.field3687 < 0) {
				this.field3348[var3.field3699][var3.field3691] = null;
				var3.field3687 = 0;
			}
		}

	}

	void method5472() {
		this.method5403(-1);
		this.method5397(-1);

		int var2;
		for (var2 = 0; var2 < 16; ++var2) {
			this.field3372[var2] = this.field3352[var2];
		}

		for (var2 = 0; var2 < 16; ++var2) {
			this.field3364[var2] = this.field3352[var2] & -128;
		}

	}

	void method5481(int var1) {
		if ((this.field3347[var1] & 2) != 0) {
			for (class310 var3 = (class310)this.field3367.field3561.method6577(); var3 != null; var3 = (class310)this.field3367.field3561.method6579()) {
				if (var1 == var3.field3699 && null == this.field3348[var1][var3.field3691] && var3.field3687 < 0) {
					var3.field3687 = 0;
				}
			}
		}

	}

	void method5401(int var1) {
		if (0 != (this.field3347[var1] & 4)) {
			for (class310 var3 = (class310)this.field3367.field3561.method6577(); var3 != null; var3 = (class310)this.field3367.field3561.method6579()) {
				if (var3.field3699 == var1) {
					var3.field3706 = 0;
				}
			}
		}

	}

	void method5407(int var1) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method5422(var4, var5, var6);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var6 > 0) {
				this.method5390(var4, var5, var6);
			} else {
				this.method5422(var4, var5, 64);
			}

		} else if (var3 == 160) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method5432(var4, var5, var6);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var5 == 0) {
				this.field3364[var4] = (this.field3364[var4] & -2080769) + (var6 << 14);
			}

			if (var5 == 32) {
				this.field3364[var4] = (this.field3364[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 1) {
				this.field3356[var4] = (this.field3356[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 33) {
				this.field3356[var4] = (this.field3356[var4] & -128) + var6;
			}

			if (var5 == 5) {
				this.field3357[var4] = (var6 << 7) + (this.field3357[var4] & -16257);
			}

			if (var5 == 37) {
				this.field3357[var4] = var6 + (this.field3357[var4] & -128);
			}

			if (var5 == 7) {
				this.field3350[var4] = (var6 << 7) + (this.field3350[var4] & -16257);
			}

			if (var5 == 39) {
				this.field3350[var4] = var6 + (this.field3350[var4] & -128);
			}

			if (var5 == 10) {
				this.field3354[var4] = (var6 << 7) + (this.field3354[var4] & -16257);
			}

			if (var5 == 42) {
				this.field3354[var4] = var6 + (this.field3354[var4] & -128);
			}

			if (var5 == 11) {
				this.field3358[var4] = (this.field3358[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 43) {
				this.field3358[var4] = var6 + (this.field3358[var4] & -128);
			}

			int[] var10000;
			if (var5 == 64) {
				if (var6 >= 64) {
					var10000 = this.field3347;
					var10000[var4] |= 1;
				} else {
					var10000 = this.field3347;
					var10000[var4] &= -2;
				}
			}

			if (var5 == 65) {
				if (var6 >= 64) {
					var10000 = this.field3347;
					var10000[var4] |= 2;
				} else {
					this.method5481(var4);
					var10000 = this.field3347;
					var10000[var4] &= -3;
				}
			}

			if (var5 == 99) {
				this.field3359[var4] = (this.field3359[var4] & 127) + (var6 << 7);
			}

			if (var5 == 98) {
				this.field3359[var4] = var6 + (this.field3359[var4] & 16256);
			}

			if (var5 == 101) {
				this.field3359[var4] = (var6 << 7) + 16384 + (this.field3359[var4] & 127);
			}

			if (var5 == 100) {
				this.field3359[var4] = (this.field3359[var4] & 16256) + 16384 + var6;
			}

			if (var5 == 120) {
				this.method5403(var4);
			}

			if (var5 == 121) {
				this.method5397(var4);
			}

			if (var5 == 123) {
				this.method5398(var4);
			}

			int var7;
			if (var5 == 6) {
				var7 = this.field3359[var4];
				if (var7 == 16384) {
					this.field3360[var4] = (this.field3360[var4] & -16257) + (var6 << 7);
				}
			}

			if (var5 == 38) {
				var7 = this.field3359[var4];
				if (var7 == 16384) {
					this.field3360[var4] = var6 + (this.field3360[var4] & -128);
				}
			}

			if (var5 == 16) {
				this.field3349[var4] = (var6 << 7) + (this.field3349[var4] & -16257);
			}

			if (var5 == 48) {
				this.field3349[var4] = var6 + (this.field3349[var4] & -128);
			}

			if (var5 == 81) {
				if (var6 >= 64) {
					var10000 = this.field3347;
					var10000[var4] |= 4;
				} else {
					this.method5401(var4);
					var10000 = this.field3347;
					var10000[var4] &= -5;
				}
			}

			if (var5 == 17) {
				this.method5475(var4, (this.field3362[var4] & -16257) + (var6 << 7));
			}

			if (var5 == 49) {
				this.method5475(var4, var6 + (this.field3362[var4] & -128));
			}

		} else if (var3 == 192) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method5389(var4, this.field3364[var4] + var5);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method5464(var4, var5);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5395(var4, var5);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				this.method5472();
			}
		}
	}

	void method5475(int var1, int var2) {
		this.field3362[var1] = var2;
		this.field3363[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	int method5404(class310 var1) {
		int var3 = var1.field3694 + (var1.field3686 * var1.field3696 >> 12);
		var3 += (this.field3355[var1.field3699] - 8192) * this.field3360[var1.field3699] >> 12;
		class285 var4 = var1.field3700;
		int var5;
		if (var4.field3335 > 0 && (var4.field3334 > 0 || this.field3356[var1.field3699] > 0)) {
			var5 = var4.field3334 << 2;
			int var6 = var4.field3330 << 1;
			if (var1.field3702 < var6) {
				var5 = var5 * var1.field3702 / var6;
			}

			var5 += this.field3356[var1.field3699] >> 7;
			double var7 = Math.sin(0.01227184630308513D * (double)(var1.field3703 & 511));
			var3 += (int)((double)var5 * var7);
		}

		var5 = (int)((double)(var1.field3698.field181 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)class50.field363 + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	int method5405(class310 var1) {
		class285 var3 = var1.field3700;
		int var4 = this.field3350[var1.field3699] * this.field3358[var1.field3699] + 4096 >> 13;
		var4 = 16384 + var4 * var4 >> 15;
		var4 = 16384 + var4 * var1.field3695 >> 15;
		var4 = var4 * this.field3353 + 128 >> 8;
		if (var3.field3331 > 0) {
			var4 = (int)((double)var4 * Math.pow(0.5D, (double)var1.field3697 * 1.953125E-5D * (double)var3.field3331) + 0.5D);
		}

		int var5;
		int var6;
		int var7;
		int var8;
		if (null != var3.field3333) {
			var5 = var1.field3692;
			var6 = var3.field3333[var1.field3688 + 1];
			if (var1.field3688 < var3.field3333.length - 2) {
				var7 = (var3.field3333[var1.field3688] & 255) << 8;
				var8 = (var3.field3333[var1.field3688 + 2] & 255) << 8;
				var6 += (var3.field3333[3 + var1.field3688] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = var6 * var4 + 32 >> 6;
		}

		if (var1.field3687 > 0 && null != var3.field3329) {
			var5 = var1.field3687;
			var6 = var3.field3329[1 + var1.field3701];
			if (var1.field3701 < var3.field3329.length - 2) {
				var7 = (var3.field3329[var1.field3701] & 255) << 8;
				var8 = (var3.field3329[2 + var1.field3701] & 255) << 8;
				var6 += (var5 - var7) * (var3.field3329[var1.field3701 + 3] - var6) / (var8 - var7);
			}

			var4 = 32 + var4 * var6 >> 6;
		}

		return var4;
	}

	int method5406(class310 var1) {
		int var3 = this.field3354[var1.field3699];
		return var3 < 8192 ? var1.field3693 * var3 + 32 >> 6 : 16384 - ((16384 - var3) * (128 - var1.field3693) + 32 >> 6);
	}

	protected synchronized class27 method355() {
		return this.field3367;
	}

	protected synchronized class27 method359() {
		return null;
	}

	protected synchronized int method365() {
		return 0;
	}

	protected synchronized void method356(int[] var1, int var2, int var3) {
		if (this.field3366.method5978()) {
			int var4 = this.field3366.field3618 * this.field3361 / class50.field363;

			do {
				long var5 = (long)var4 * (long)var3 + this.field3370;
				if (this.field3371 - var5 >= 0L) {
					this.field3370 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3371 - this.field3370) - 1L) / (long)var4);
				this.field3370 += (long)var7 * (long)var4;
				this.field3367.method356(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5408();
			} while(this.field3366.method5978());
		}

		this.field3367.method356(var1, var2, var3);
	}

	protected synchronized void method360(int var1) {
		if (this.field3366.method5978()) {
			int var2 = this.field3366.field3618 * this.field3361 / class50.field363;

			do {
				long var3 = (long)var1 * (long)var2 + this.field3370;
				if (this.field3371 - var3 >= 0L) {
					this.field3370 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3371 - this.field3370) - 1L) / (long)var2);
				this.field3370 += (long)var5 * (long)var2;
				this.field3367.method360(var5);
				var1 -= var5;
				this.method5408();
			} while(this.field3366.method5978());
		}

		this.field3367.method360(var1);
	}

	void method5408() {
		int var2 = this.field3368;
		int var3 = this.field3369;

		long var4;
		for (var4 = this.field3371; this.field3369 == var3; var4 = this.field3366.method6004(var3)) {
			while (var3 == this.field3366.field3625[var2]) {
				this.field3366.method5980(var2);
				int var6 = this.field3366.method5984(var2);
				if (var6 == 1) {
					this.field3366.method5982();
					this.field3366.method5981(var2);
					if (this.field3366.method6014()) {
						if (!this.field3346 || var3 == 0) {
							this.method5472();
							this.field3366.method5977();
							return;
						}

						this.field3366.method5990(var4);
					}
					break;
				}

				if (0 != (var6 & 128)) {
					this.method5407(var6);
				}

				this.field3366.method6001(var2);
				this.field3366.method5981(var2);
			}

			var2 = this.field3366.method5988();
			var3 = this.field3366.field3625[var2];
		}

		this.field3368 = var2;
		this.field3369 = var3;
		this.field3371 = var4;
	}

	boolean method5409(class310 var1) {
		if (null == var1.field3704) {
			if (var1.field3687 >= 0) {
				var1.method7951();
				if (var1.field3690 > 0 && this.field3365[var1.field3699][var1.field3690] == var1) {
					this.field3365[var1.field3699][var1.field3690] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	boolean method5410(class310 var1, int[] var2, int var3, int var4) {
		var1.field3705 = class50.field363 / 100;
		if (var1.field3687 < 0 || var1.field3704 != null && !var1.field3704.method740()) {
			int var6 = var1.field3696;
			if (var6 > 0) {
				var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3357[var1.field3699]) + 0.5D);
				if (var6 < 0) {
					var6 = 0;
				}

				var1.field3696 = var6;
			}

			var1.field3704.method738(this.method5404(var1));
			class285 var7 = var1.field3700;
			boolean var8 = false;
			++var1.field3702;
			var1.field3703 += var7.field3335;
			double var9 = (double)((var1.field3691 - 60 << 8) + (var1.field3686 * var1.field3696 >> 12)) * 5.086263020833333E-6D;
			if (var7.field3331 > 0) {
				if (var7.field3328 > 0) {
					var1.field3697 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3328 * var9) + 0.5D);
				} else {
					var1.field3697 += 128;
				}
			}

			if (var7.field3333 != null) {
				if (var7.field3336 > 0) {
					var1.field3692 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3336 * var9) + 0.5D);
				} else {
					var1.field3692 += 128;
				}

				while (var1.field3688 < var7.field3333.length - 2 && var1.field3692 > (var7.field3333[2 + var1.field3688] & 255) << 8) {
					var1.field3688 += 2;
				}

				if (var1.field3688 == var7.field3333.length - 2 && 0 == var7.field3333[var1.field3688 + 1]) {
					var8 = true;
				}
			}

			if (var1.field3687 >= 0 && null != var7.field3329 && (this.field3347[var1.field3699] & 1) == 0 && (var1.field3690 < 0 || this.field3365[var1.field3699][var1.field3690] != var1)) {
				if (var7.field3332 > 0) {
					var1.field3687 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3332 * var9) + 0.5D);
				} else {
					var1.field3687 += 128;
				}

				while (var1.field3701 < var7.field3329.length - 2 && var1.field3687 > (var7.field3329[var1.field3701 + 2] & 255) << 8) {
					var1.field3701 += 2;
				}

				if (var1.field3701 == var7.field3329.length - 2) {
					var8 = true;
				}
			}

			if (var8) {
				var1.field3704.method737(var1.field3705);
				if (null != var2) {
					var1.field3704.method356(var2, var3, var4);
				} else {
					var1.field3704.method360(var4);
				}

				if (var1.field3704.method783()) {
					this.field3367.field3563.method1017(var1.field3704);
				}

				var1.method6124();
				if (var1.field3687 >= 0) {
					var1.method7951();
					if (var1.field3690 > 0 && this.field3365[var1.field3699][var1.field3690] == var1) {
						this.field3365[var1.field3699][var1.field3690] = null;
					}
				}

				return true;
			} else {
				var1.field3704.method736(var1.field3705, this.method5405(var1), this.method5406(var1));
				return false;
			}
		} else {
			var1.method6124();
			var1.method7951();
			if (var1.field3690 > 0 && this.field3365[var1.field3699][var1.field3690] == var1) {
				this.field3365[var1.field3699][var1.field3690] = null;
			}

			return true;
		}
	}
}
