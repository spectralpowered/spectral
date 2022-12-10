import java.util.zip.CRC32;

public class class326 extends class337 {
	static CRC32 field4128;
	boolean field4117;
	boolean field4132;
	class399 field4123;
	class399 field4125;
	int field4119;
	int field4124;
	int field4129;
	int field4131;
	volatile boolean[] field4127;
	volatile int field4130;

	static {
		field4128 = new CRC32();
	}

	public class326(class399 var1, class399 var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5);
		this.field4130 = 0;
		this.field4117 = false;
		this.field4131 = -1;
		this.field4132 = false;
		this.field4125 = var1;
		this.field4123 = var2;
		this.field4124 = var3;
		this.field4117 = var6;
		this.field4132 = var7;
		class307.method6105(this, this.field4124);
	}

	public boolean method6203() {
		return this.field4130 == 1;
	}

	public int method6204() {
		if (1 == this.field4130 || this.field4132 && this.field4130 == 2) {
			return 100;
		} else if (super.field4240 != null) {
			return 99;
		} else {
			int var3 = this.field4124;
			long var4 = (long)(var3 + 16711680);
			int var2;
			if (class198.field2231 != null && class198.field2231.field4773 == var4) {
				var2 = class356.field4309.field4915 * 99 / (class356.field4309.field4917.length - class198.field2231.field3735) + 1;
			} else {
				var2 = 0;
			}

			int var6 = var2;
			if (var2 >= 100) {
				var6 = 99;
			}

			return var6;
		}
	}

	void method6300(int var1) {
		int var3 = this.field4124;
		long var4 = (long)(var1 + (var3 << 16));
		class316 var6 = (class316)class334.field4204.method8177(var4);
		if (var6 != null) {
			class334.field4199.method6475(var6);
		}

	}

	void method6311(int var1) {
		if (null != this.field4125 && this.field4127 != null && this.field4127[var1]) {
			class399 var3 = this.field4125;
			byte[] var5 = null;
			synchronized(class318.field3746) {
				for (class332 var7 = (class332)class318.field3746.method6577(); null != var7; var7 = (class332)class318.field3746.method6579()) {
					if ((long)var1 == var7.field4773 && var7.field4181 == var3 && 0 == var7.field4182) {
						var5 = var7.field4180;
						break;
					}
				}
			}

			if (var5 != null) {
				this.method6210(var3, var1, var5, true);
			} else {
				byte[] var6 = var3.method7400(var1);
				this.method6210(var3, var1, var6, true);
			}
		} else {
			class165.method2768(this, this.field4124, var1, super.field4238[var1], (byte)2, true);
		}

	}

	void method6207() {
		this.field4130 = 2;
		super.field4230 = new int[0];
		super.field4238 = new int[0];
		super.field4231 = new int[0];
		super.field4242 = new int[0];
		super.field4237 = new int[0][];
		super.field4240 = new Object[0];
		super.field4241 = new Object[0][];
	}

	void method6244(int var1, int var2) {
		this.field4129 = var1;
		this.field4119 = var2;
		if (null != this.field4123) {
			int var4 = this.field4124;
			class399 var5 = this.field4123;
			byte[] var7 = null;
			synchronized(class318.field3746) {
				for (class332 var9 = (class332)class318.field3746.method6577(); var9 != null; var9 = (class332)class318.field3746.method6579()) {
					if (var9.field4773 == (long)var4 && var5 == var9.field4181 && var9.field4182 == 0) {
						var7 = var9.field4180;
						break;
					}
				}
			}

			if (var7 != null) {
				this.method6210(var5, var4, var7, true);
			} else {
				byte[] var8 = var5.method7400(var4);
				this.method6210(var5, var4, var8, true);
			}
		} else {
			class165.method2768(this, 255, this.field4124, this.field4129, (byte)0, true);
		}

	}

	void method6237(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4130 == 1) {
				throw new RuntimeException();
			}

			if (this.field4123 != null) {
				int var6 = this.field4124;
				class399 var7 = this.field4123;
				class332 var8 = new class332();
				var8.field4182 = 0;
				var8.field4773 = (long)var6;
				var8.field4180 = var2;
				var8.field4181 = var7;
				synchronized(class318.field3746) {
					class318.field3746.method6572(var8);
				}

				class151.method2669();
			}

			this.method6298(var2);
			this.method6239();
		} else {
			var2[var2.length - 2] = (byte)(super.field4231[var1] >> 8);
			var2[var2.length - 1] = (byte)super.field4231[var1];
			if (null != this.field4125) {
				class399 var12 = this.field4125;
				class332 var17 = new class332();
				var17.field4182 = 0;
				var17.field4773 = (long)var1;
				var17.field4180 = var2;
				var17.field4181 = var12;
				synchronized(class318.field3746) {
					class318.field3746.method6572(var17);
				}

				class151.method2669();
				this.field4127[var1] = true;
			}

			if (var4) {
				Object[] var16 = super.field4240;
				Object var18;
				if (var2 == null) {
					var18 = null;
				} else if (var2.length > 136) {
					class294 var9 = new class294();
					var9.method6114(var2);
					var18 = var9;
				} else {
					var18 = var2;
				}

				var16[var1] = var18;
			}
		}

	}

	public void method6210(class399 var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (var1 == this.field4123) {
			if (1 == this.field4130) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				class165.method2768(this, 255, this.field4124, this.field4129, (byte)0, true);
				return;
			}

			field4128.reset();
			field4128.update(var3, 0, var3.length);
			var6 = (int)field4128.getValue();
			if (var6 != this.field4129) {
				class165.method2768(this, 255, this.field4124, this.field4129, (byte)0, true);
				return;
			}

			class467 var7 = new class467(class237.method4727(var3));
			int var8 = var7.method8326();
			if (var8 != 5 && var8 != 6) {
				throw new RuntimeException(var8 + "," + this.field4124 + "," + var2);
			}

			int var9 = 0;
			if (var8 >= 6) {
				var9 = var7.method8480();
			}

			if (var9 != this.field4119) {
				class165.method2768(this, 255, this.field4124, this.field4129, (byte)0, true);
				return;
			}

			this.method6298(var3);
			this.method6239();
		} else {
			if (!var4 && var2 == this.field4131) {
				this.field4130 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.field4127[var2] = false;
				if (this.field4117 || var4) {
					class165.method2768(this, this.field4124, var2, super.field4238[var2], (byte)2, var4);
				}

				return;
			}

			field4128.reset();
			field4128.update(var3, 0, var3.length - 2);
			var6 = (int)field4128.getValue();
			int var12 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var6 != super.field4238[var2] || var12 != super.field4231[var2]) {
				this.field4127[var2] = false;
				if (this.field4117 || var4) {
					class165.method2768(this, this.field4124, var2, super.field4238[var2], (byte)2, var4);
				}

				return;
			}

			this.field4127[var2] = true;
			if (var4) {
				Object[] var13 = super.field4240;
				Object var10;
				if (var3 == null) {
					var10 = null;
				} else if (var3.length > 136) {
					class294 var11 = new class294();
					var11.method6114(var3);
					var10 = var11;
				} else {
					var10 = var3;
				}

				var13[var2] = var10;
			}
		}

	}

	void method6239() {
		this.field4127 = new boolean[super.field4240.length];

		int var2;
		for (var2 = 0; var2 < this.field4127.length; ++var2) {
			this.field4127[var2] = false;
		}

		if (null == this.field4125) {
			this.field4130 = 1;
		} else {
			this.field4131 = -1;

			for (var2 = 0; var2 < this.field4127.length; ++var2) {
				if (super.field4242[var2] > 0) {
					class318.method5256(var2, this.field4125, this);
					this.field4131 = var2;
				}
			}

			if (-1 == this.field4131) {
				this.field4130 = 1;
			}

		}
	}

	int method6307(int var1) {
		if (null != super.field4240[var1]) {
			return 100;
		} else if (this.field4127[var1]) {
			return 100;
		} else {
			int var4 = this.field4124;
			long var5 = (long)((var4 << 16) + var1);
			int var3;
			if (class198.field2231 != null && var5 == class198.field2231.field4773) {
				var3 = 1 + class356.field4309.field4915 * 99 / (class356.field4309.field4917.length - class198.field2231.field3735);
			} else {
				var3 = 0;
			}

			return var3;
		}
	}

	public boolean method6212(int var1) {
		return this.field4127[var1];
	}

	public boolean method6236(int var1) {
		return this.method6312(var1) != null;
	}

	public int method6230() {
		int var2 = 0;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < super.field4240.length; ++var4) {
			if (super.field4242[var4] > 0) {
				var2 += 100;
				var3 += this.method6307(var4);
			}
		}

		if (var2 == 0) {
			return 100;
		} else {
			var4 = var3 * 100 / var2;
			return var4;
		}
	}

	static final boolean method6214(int var0, int var1) {
		class196 var3 = class165.method2780(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var3.method3821(var1);
	}

	static final void method6243(int var0, int var1) {
		if (null != client.field1814[var0]) {
			if (var1 >= 0 && var1 < client.field1814[var0].method2889()) {
				class135 var3 = (class135)client.field1814[var0].field1614.get(var1);
				if (var3.field1330 == -1) {
					class284 var4 = class152.method2679(class276.field3200, client.field1748.field1105);
					var4.field3321.method8323(3 + class467.method190(var3.field1327.method8771()));
					var4.field3321.method8323(var0);
					var4.field3321.method8310(var1);
					var4.field3321.method8316(var3.field1327.method8771());
					client.field1748.method2173(var4);
				}
			}
		}
	}
}
