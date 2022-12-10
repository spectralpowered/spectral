import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class class50 {
	public static int field363;
	static class49 field352;
	static int[] field364;
	static List field371;
	boolean field365;
	class27 field354;
	class27[] field359;
	class27[] field368;
	int field350;
	int field355;
	int field357;
	int field358;
	int field361;
	int field362;
	int field366;
	int field367;
	long field353;
	long field356;
	long field360;
	protected int[] field370;

	protected class50() {
		this.field355 = 32;
		this.field353 = class74.method1493();
		this.field360 = 0L;
		this.field361 = 0;
		this.field362 = 0;
		this.field367 = 0;
		this.field356 = 0L;
		this.field365 = true;
		this.field366 = 0;
		this.field359 = new class27[8];
		this.field368 = new class27[8];
	}

	public static final class50 method1202(class172 var0, int var1, int var2) {
		if (0 == field363) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				class50 var4 = class3.field24.method410();
				var4.field370 = new int[256 * (class300.field3640 ? 2 : 1)];
				var4.field358 = var2;
				var4.method955();
				var4.field357 = 1024 + (var2 & -1024);
				if (var4.field357 > 16384) {
					var4.field357 = 16384;
				}

				var4.method998(var4.field357);
				if (class51.field381 > 0 && field352 == null) {
					field352 = new class49();
					class7.field45 = Executors.newScheduledThreadPool(1);
					class7.field45.scheduleAtFixedRate(field352, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (null != field352) {
					if (null != field352.field349[var1]) {
						throw new IllegalArgumentException();
					}

					field352.field349[var1] = var4;
				}

				return var4;
			} catch (Throwable var5) {
				return new class50();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public final synchronized void method949(class27 var1) {
		this.field354 = var1;
	}

	public final synchronized void method995() {
		if (this.field370 != null) {
			long var2 = class74.method1493();

			try {
				if (0L != this.field360) {
					if (var2 < this.field360) {
						return;
					}

					this.method998(this.field357);
					this.field360 = 0L;
					this.field365 = true;
				}

				int var4 = this.method957();
				if (this.field367 - var4 > this.field361) {
					this.field361 = this.field367 - var4;
				}

				int var5 = this.field350 + this.field358;
				if (var5 + 256 > 16384) {
					var5 = 16128;
				}

				if (var5 + 256 > this.field357) {
					this.field357 += 1024;
					if (this.field357 > 16384) {
						this.field357 = 16384;
					}

					this.method959();
					this.method998(this.field357);
					var4 = 0;
					this.field365 = true;
					if (var5 + 256 > this.field357) {
						var5 = this.field357 - 256;
						this.field350 = var5 - this.field358;
					}
				}

				while (var4 < var5) {
					this.method953(this.field370, 256);
					this.method958();
					var4 += 256;
				}

				if (var2 > this.field356) {
					if (!this.field365) {
						if (0 == this.field361 && 0 == this.field362) {
							this.method959();
							this.field360 = var2 + 2000L;
							return;
						}

						this.field350 = Math.min(this.field362, this.field361);
						this.field362 = this.field361;
					} else {
						this.field365 = false;
					}

					this.field361 = 0;
					this.field356 = var2 + 2000L;
				}

				this.field367 = var4;
			} catch (Exception var8) {
				this.method959();
				this.field360 = var2 + 2000L;
			}

			try {
				if (var2 > 500000L + this.field353) {
					var2 = this.field353;
				}

				while (var2 > 5000L + this.field353) {
					this.method952(256);
					this.field353 += (long)(256000 / field363);
				}
			} catch (Exception var7) {
				this.field353 = var2;
			}

		}
	}

	public final void method970() {
		this.field365 = true;
	}

	public final synchronized void method950() {
		this.field365 = true;

		try {
			this.method960();
		} catch (Exception var3) {
			this.method959();
			this.field360 = class74.method1493() + 2000L;
		}

	}

	public final synchronized void method951() {
		if (null != field352) {
			boolean var2 = true;

			for (int var3 = 0; var3 < 2; ++var3) {
				if (this == field352.field349[var3]) {
					field352.field349[var3] = null;
				}

				if (null != field352.field349[var3]) {
					var2 = false;
				}
			}

			if (var2) {
				class7.field45.shutdownNow();
				class7.field45 = null;
				field352 = null;
			}
		}

		this.method959();
		this.field370 = null;
	}

	final void method952(int var1) {
		this.field366 -= var1;
		if (this.field366 < 0) {
			this.field366 = 0;
		}

		if (this.field354 != null) {
			this.field354.method360(var1);
		}

	}

	final void method953(int[] var1, int var2) {
		int var3 = var2;
		if (class300.field3640) {
			var3 = var2 << 1;
		}

		class376.method7044(var1, 0, var3);
		this.field366 -= var2;
		if (null != this.field354 && this.field366 <= 0) {
			this.field366 += field363 >> 4;
			class330.method6264(this.field354);
			this.method954(this.field354, this.field354.method354());
			int var4 = 0;
			int var5 = 255;

			int var6;
			class27 var10;
			label103:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if (0 != (var9 & 1)) {
						var5 &= ~(1 << var7);
						var10 = null;
						class27 var11 = this.field359[var7];

						label97:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label97;
								}

								class55 var12 = var11.field144;
								if (null != var12 && var12.field408 > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.field145;
								} else {
									var11.field146 = true;
									int var13 = var11.method365();
									var4 += var13;
									if (null != var12) {
										var12.field408 += var13;
									}

									if (var4 >= this.field355) {
										break label103;
									}

									class27 var14 = var11.method355();
									if (var14 != null) {
										for (int var15 = var11.field147; var14 != null; var14 = var11.method359()) {
											this.method954(var14, var15 * var14.method354() >> 8);
										}
									}

									class27 var18 = var11.field145;
									var11.field145 = null;
									if (null == var10) {
										this.field359[var7] = var18;
									} else {
										var10.field145 = var18;
									}

									if (null == var18) {
										this.field368[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				class27 var16 = this.field359[var6];
				class27[] var17 = this.field359;
				this.field368[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.field145;
					var16.field145 = null;
				}
			}
		}

		if (this.field366 < 0) {
			this.field366 = 0;
		}

		if (this.field354 != null) {
			this.field354.method356(var1, 0, var2);
		}

		this.field353 = class74.method1493();
	}

	final void method954(class27 var1, int var2) {
		int var4 = var2 >> 5;
		class27 var5 = this.field368[var4];
		if (null == var5) {
			this.field359[var4] = var1;
		} else {
			var5.field145 = var1;
		}

		this.field368[var4] = var1;
		var1.field147 = var2;
	}

	protected void method955() throws Exception {
	}

	protected void method998(int var1) throws Exception {
	}

	protected int method957() throws Exception {
		return this.field357;
	}

	protected void method958() throws Exception {
	}

	protected void method959() {
	}

	protected void method960() throws Exception {
	}

	static void method1009(int var0, String var1) {
		int var3 = class87.field818;
		int[] var4 = class87.field817;
		boolean var5 = false;
		class483 var6 = new class483(var1, class54.field404);

		for (int var7 = 0; var7 < var3; ++var7) {
			class88 var8 = client.field1816[var4[var7]];
			if (null != var8 && var8 != class142.field1370 && null != var8.field840 && var8.field840.equals(var6)) {
				class284 var9;
				if (var0 == 1) {
					var9 = class152.method2679(class276.field3236, client.field1748.field1105);
					var9.field3321.method8323(0);
					var9.field3321.method8310(var4[var7]);
					client.field1748.method2173(var9);
				} else if (var0 == 4) {
					var9 = class152.method2679(class276.field3192, client.field1748.field1105);
					var9.field3321.method8310(var4[var7]);
					var9.field3321.method8356(0);
					client.field1748.method2173(var9);
				} else if (var0 == 6) {
					var9 = class152.method2679(class276.field3211, client.field1748.field1105);
					var9.field3321.method8356(0);
					var9.field3321.method8310(var4[var7]);
					client.field1748.method2173(var9);
				} else if (var0 == 7) {
					var9 = class152.method2679(class276.field3250, client.field1748.field1105);
					var9.field3321.method8365(var4[var7]);
					var9.field3321.method8356(0);
					client.field1748.method2173(var9);
				}

				var5 = true;
				break;
			}
		}

		if (!var5) {
			class105.method2785(4, "", class321.field3916 + var1);
		}

	}
}
