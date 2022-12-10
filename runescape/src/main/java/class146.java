public class class146 {
	boolean field1388;
	boolean field1389;
	class454 field1412;
	int field1393;
	int field1413;
	int[] field1402;
	int[] field1403;
	long field1390;
	long[] field1405;
	long[] field1411;
	public boolean field1394;
	public boolean[] field1391;
	public byte field1395;
	public byte field1396;
	public byte field1398;
	public byte field1401;
	public byte[] field1410;
	public int field1399;
	public int field1406;
	public int field1407;
	public int field1408;
	public int[] field1387;
	public String field1392;
	public String[] field1404;
	public String[] field1409;

	public static class199 method2640(int var0) {
		class199 var2 = (class199)class199.field2234.method5356((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class199.field2233.method6374(13, var0);
			var2 = new class199();
			var2.field2245 = var0;
			if (var3 != null) {
				var2.method3897(new class467(var3));
			}

			class199.field2234.method5364(var2, (long)var0);
			return var2;
		}
	}

	public class146(class467 var1) {
		this.field1413 = 0;
		this.field1392 = null;
		this.field1393 = 0;
		this.field1406 = -1;
		this.field1407 = -1;
		this.method2588(var1);
	}

	void method2570(int var1) {
		if (this.field1388) {
			if (this.field1411 != null) {
				System.arraycopy(this.field1411, 0, this.field1411 = new long[var1], 0, this.field1399);
			} else {
				this.field1411 = new long[var1];
			}
		}

		if (this.field1389) {
			if (null != this.field1404) {
				System.arraycopy(this.field1404, 0, this.field1404 = new String[var1], 0, this.field1399);
			} else {
				this.field1404 = new String[var1];
			}
		}

		if (this.field1410 != null) {
			System.arraycopy(this.field1410, 0, this.field1410 = new byte[var1], 0, this.field1399);
		} else {
			this.field1410 = new byte[var1];
		}

		if (this.field1403 != null) {
			System.arraycopy(this.field1403, 0, this.field1403 = new int[var1], 0, this.field1399);
		} else {
			this.field1403 = new int[var1];
		}

		if (this.field1387 != null) {
			System.arraycopy(this.field1387, 0, this.field1387 = new int[var1], 0, this.field1399);
		} else {
			this.field1387 = new int[var1];
		}

		if (this.field1391 != null) {
			System.arraycopy(this.field1391, 0, this.field1391 = new boolean[var1], 0, this.field1399);
		} else {
			this.field1391 = new boolean[var1];
		}

	}

	void method2571(int var1) {
		if (this.field1388) {
			if (this.field1405 != null) {
				System.arraycopy(this.field1405, 0, this.field1405 = new long[var1], 0, this.field1408);
			} else {
				this.field1405 = new long[var1];
			}
		}

		if (this.field1389) {
			if (null != this.field1409) {
				System.arraycopy(this.field1409, 0, this.field1409 = new String[var1], 0, this.field1408);
			} else {
				this.field1409 = new String[var1];
			}
		}

	}

	public int method2569(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var3 = 0; var3 < this.field1399; ++var3) {
				if (this.field1404[var3].equals(var1)) {
					return var3;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	public int method2572(int var1, int var2, int var3) {
		int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1403[var1] & var5) >>> var2;
	}

	public Integer method2573(int var1) {
		if (null == this.field1412) {
			return null;
		} else {
			class428 var3 = this.field1412.method8135((long)var1);
			return var3 != null && var3 instanceof class429 ? new Integer(((class429)var3).field4774) : null;
		}
	}

	public int[] method2600() {
		if (null == this.field1402) {
			String[] var2 = new String[this.field1399];
			this.field1402 = new int[this.field1399];

			for (int var3 = 0; var3 < this.field1399; this.field1402[var3] = var3++) {
				var2[var3] = this.field1404[var3];
				if (var2[var3] != null) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}

			class81.method1623(var2, this.field1402);
		}

		return this.field1402;
	}

	void method2615(long var1, String var3, int var4) {
		if (null != var3 && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field1388) {
			throw new RuntimeException("");
		} else if (this.field1389 != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field1411 == null || this.field1399 >= this.field1411.length) || null != var3 && (this.field1404 == null || this.field1399 >= this.field1404.length)) {
				this.method2570(5 + this.field1399);
			}

			if (null != this.field1411) {
				this.field1411[this.field1399] = var1;
			}

			if (null != this.field1404) {
				this.field1404[this.field1399] = var3;
			}

			if (this.field1406 == -1) {
				this.field1406 = this.field1399;
				this.field1410[this.field1399] = 126;
			} else {
				this.field1410[this.field1399] = 0;
			}

			this.field1403[this.field1399] = 0;
			this.field1387[this.field1399] = var4;
			this.field1391[this.field1399] = false;
			++this.field1399;
			this.field1402 = null;
		}
	}

	void method2576(int var1) {
		if (var1 >= 0 && var1 < this.field1399) {
			--this.field1399;
			this.field1402 = null;
			if (0 == this.field1399) {
				this.field1411 = null;
				this.field1404 = null;
				this.field1410 = null;
				this.field1403 = null;
				this.field1387 = null;
				this.field1391 = null;
				this.field1406 = -1;
				this.field1407 = -1;
			} else {
				System.arraycopy(this.field1410, var1 + 1, this.field1410, var1, this.field1399 - var1);
				System.arraycopy(this.field1403, var1 + 1, this.field1403, var1, this.field1399 - var1);
				System.arraycopy(this.field1387, var1 + 1, this.field1387, var1, this.field1399 - var1);
				System.arraycopy(this.field1391, var1 + 1, this.field1391, var1, this.field1399 - var1);
				if (this.field1411 != null) {
					System.arraycopy(this.field1411, var1 + 1, this.field1411, var1, this.field1399 - var1);
				}

				if (null != this.field1404) {
					System.arraycopy(this.field1404, var1 + 1, this.field1404, var1, this.field1399 - var1);
				}

				this.method2577();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method2577() {
		if (0 == this.field1399) {
			this.field1406 = -1;
			this.field1407 = -1;
		} else {
			this.field1406 = -1;
			this.field1407 = -1;
			int var2 = 0;
			byte var3 = this.field1410[0];

			for (int var4 = 1; var4 < this.field1399; ++var4) {
				if (this.field1410[var4] > var3) {
					if (var3 == 125) {
						this.field1407 = var2;
					}

					var2 = var4;
					var3 = this.field1410[var4];
				} else if (-1 == this.field1407 && this.field1410[var4] == 125) {
					this.field1407 = var4;
				}
			}

			this.field1406 = var2;
			if (-1 != this.field1406) {
				this.field1410[this.field1406] = 126;
			}

		}
	}

	void method2579(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field1388) {
			throw new RuntimeException("");
		} else if (this.field1389 != (null != var3)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field1405 == null || this.field1408 >= this.field1405.length) || var3 != null && (null == this.field1409 || this.field1408 >= this.field1409.length)) {
				this.method2571(5 + this.field1408);
			}

			if (null != this.field1405) {
				this.field1405[this.field1408] = var1;
			}

			if (this.field1409 != null) {
				this.field1409[this.field1408] = var3;
			}

			++this.field1408;
		}
	}

	void method2594(int var1) {
		--this.field1408;
		if (this.field1408 == 0) {
			this.field1405 = null;
			this.field1409 = null;
		} else {
			if (this.field1405 != null) {
				System.arraycopy(this.field1405, var1 + 1, this.field1405, var1, this.field1408 - var1);
			}

			if (null != this.field1409) {
				System.arraycopy(this.field1409, var1 + 1, this.field1409, var1, this.field1408 - var1);
			}
		}

	}

	int method2580(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.field1406 == var1 && (this.field1407 == -1 || this.field1410[this.field1407] < 125)) {
				return -1;
			} else if (var2 == this.field1410[var1]) {
				return -1;
			} else {
				this.field1410[var1] = var2;
				this.method2577();
				return var1;
			}
		} else {
			return -1;
		}
	}

	boolean method2581(int var1) {
		if (var1 != this.field1406 && 126 != this.field1410[var1]) {
			this.field1410[this.field1406] = 125;
			this.field1407 = this.field1406;
			this.field1410[var1] = 126;
			this.field1406 = var1;
			return true;
		} else {
			return false;
		}
	}

	int method2593(int var1, boolean var2) {
		if (var2 == this.field1391[var1]) {
			return -1;
		} else {
			this.field1391[var1] = var2;
			return var1;
		}
	}

	int method2583(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		int var9 = this.field1403[var1];
		if (var2 == (var9 & var8)) {
			return -1;
		} else {
			var9 &= ~var8;
			this.field1403[var1] = var9 | var2;
			return var1;
		}
	}

	boolean method2584(int var1, int var2) {
		if (this.field1412 != null) {
			class428 var4 = this.field1412.method8135((long)var1);
			if (var4 != null) {
				if (var4 instanceof class429) {
					class429 var5 = (class429)var4;
					if (var5.field4774 == var2) {
						return false;
					}

					var5.field4774 = var2;
					return true;
				}

				var4.method7951();
			}
		} else {
			this.field1412 = new class454(4);
		}

		this.field1412.method8133(new class429(var2), (long)var1);
		return true;
	}

	boolean method2585(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		if (null != this.field1412) {
			class428 var9 = this.field1412.method8135((long)var1);
			if (var9 != null) {
				if (var9 instanceof class429) {
					class429 var10 = (class429)var9;
					if (var2 == (var10.field4774 & var8)) {
						return false;
					}

					var10.field4774 &= ~var8;
					var10.field4774 |= var2;
					return true;
				}

				var9.method7951();
			}
		} else {
			this.field1412 = new class454(4);
		}

		this.field1412.method8133(new class429(var2), (long)var1);
		return true;
	}

	boolean method2586(int var1, long var2) {
		if (null != this.field1412) {
			class428 var4 = this.field1412.method8135((long)var1);
			if (null != var4) {
				if (var4 instanceof class432) {
					class432 var5 = (class432)var4;
					if (var2 == var5.field4777) {
						return false;
					}

					var5.field4777 = var2;
					return true;
				}

				var4.method7951();
			}
		} else {
			this.field1412 = new class454(4);
		}

		this.field1412.method8133(new class432(var2), (long)var1);
		return true;
	}

	boolean method2587(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.field1412 != null) {
			class428 var4 = this.field1412.method8135((long)var1);
			if (null != var4) {
				if (var4 instanceof class426) {
					class426 var5 = (class426)var4;
					if (var5.field4735 instanceof String) {
						if (var2.equals(var5.field4735)) {
							return false;
						}

						var5.method7951();
						this.field1412.method8133(new class426(var2), var5.field4773);
						return true;
					}
				}

				var4.method7951();
			}
		} else {
			this.field1412 = new class454(4);
		}

		this.field1412.method8133(new class426(var2), (long)var1);
		return true;
	}

	void method2588(class467 var1) {
		int var3 = var1.method8326();
		if (var3 >= 1 && var3 <= 6) {
			int var4 = var1.method8326();
			if ((var4 & 1) != 0) {
				this.field1388 = true;
			}

			if ((var4 & 2) != 0) {
				this.field1389 = true;
			}

			if (!this.field1388) {
				this.field1411 = null;
				this.field1405 = null;
			}

			if (!this.field1389) {
				this.field1404 = null;
				this.field1409 = null;
			}

			this.field1413 = var1.method8480();
			this.field1393 = var1.method8480();
			if (var3 <= 3 && 0 != this.field1393) {
				this.field1393 += 16912800;
			}

			this.field1399 = var1.method8328();
			this.field1408 = var1.method8326();
			this.field1392 = var1.method8335();
			if (var3 >= 4) {
				var1.method8480();
			}

			this.field1394 = var1.method8326() == 1;
			this.field1395 = var1.method8327();
			this.field1396 = var1.method8327();
			this.field1401 = var1.method8327();
			this.field1398 = var1.method8327();
			int var5;
			if (this.field1399 > 0) {
				if (this.field1388 && (this.field1411 == null || this.field1411.length < this.field1399)) {
					this.field1411 = new long[this.field1399];
				}

				if (this.field1389 && (this.field1404 == null || this.field1404.length < this.field1399)) {
					this.field1404 = new String[this.field1399];
				}

				if (null == this.field1410 || this.field1410.length < this.field1399) {
					this.field1410 = new byte[this.field1399];
				}

				if (null == this.field1403 || this.field1403.length < this.field1399) {
					this.field1403 = new int[this.field1399];
				}

				if (this.field1387 == null || this.field1387.length < this.field1399) {
					this.field1387 = new int[this.field1399];
				}

				if (null == this.field1391 || this.field1391.length < this.field1399) {
					this.field1391 = new boolean[this.field1399];
				}

				for (var5 = 0; var5 < this.field1399; ++var5) {
					if (this.field1388) {
						this.field1411[var5] = var1.method8492();
					}

					if (this.field1389) {
						this.field1404[var5] = var1.method8334();
					}

					this.field1410[var5] = var1.method8327();
					if (var3 >= 2) {
						this.field1403[var5] = var1.method8480();
					}

					if (var3 >= 5) {
						this.field1387[var5] = var1.method8328();
					} else {
						this.field1387[var5] = 0;
					}

					if (var3 >= 6) {
						this.field1391[var5] = var1.method8326() == 1;
					} else {
						this.field1391[var5] = false;
					}
				}

				this.method2577();
			}

			if (this.field1408 > 0) {
				if (this.field1388 && (this.field1405 == null || this.field1405.length < this.field1408)) {
					this.field1405 = new long[this.field1408];
				}

				if (this.field1389 && (null == this.field1409 || this.field1409.length < this.field1408)) {
					this.field1409 = new String[this.field1408];
				}

				for (var5 = 0; var5 < this.field1408; ++var5) {
					if (this.field1388) {
						this.field1405[var5] = var1.method8492();
					}

					if (this.field1389) {
						this.field1409[var5] = var1.method8334();
					}
				}
			}

			if (var3 >= 3) {
				var5 = var1.method8328();
				if (var5 > 0) {
					this.field1412 = new class454(var5 < 16 ? class279.method8200(var5) : 16);

					while (var5-- > 0) {
						int var6 = var1.method8480();
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.method8480();
							this.field1412.method8133(new class429(var9), (long)var7);
						} else if (var8 == 1) {
							long var12 = var1.method8492();
							this.field1412.method8133(new class432(var12), (long)var7);
						} else if (var8 == 2) {
							String var11 = var1.method8335();
							this.field1412.method8133(new class426(var11), (long)var7);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var3);
		}
	}
}
