import java.util.concurrent.Callable;

public class class5 implements Callable {
	static class117 field30;
	static int field32;
	// $FF: synthetic field
	final class18 this$0;
	final class24 field31;
	final class467 field35;

	class5(class18 var1, class467 var2, class24 var3) {
		this.this$0 = var1;
		this.field35 = var2;
		this.field31 = var3;
	}

	public Object call() {
		return this.field31.method338(this.field35);
	}

	static final void method41(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		class321 var10001 = (class321)null;
		String var2 = var10000.append(class321.field3934).toString();
		class105.method2785(30, "", var2);
	}

	static void method42(int var0, int var1, int var2) {
		if (class186.field2040.method1788() != 0 && var1 != 0 && client.field1947 < 50) {
			client.field1948[client.field1947] = var0;
			client.field1949[client.field1947] = var1;
			client.field1977[client.field1947] = var2;
			client.field1757[client.field1947] = null;
			client.field1803[client.field1947] = 0;
			++client.field1947;
		}

	}

	static final void method38(class466 var0) {
		for (int var2 = 0; var2 < client.field1746; ++var2) {
			int var3 = client.field1747[var2];
			class85 var4 = client.field1934[var3];
			int var5 = var0.method8326();
			int var6;
			if ((var5 & 1) != 0) {
				var6 = var0.method8326();
				var5 += var6 << 8;
			}

			if (0 != (var5 & 2048)) {
				var6 = var0.method8326();
				var5 += var6 << 16;
			}

			if (0 != (var5 & 131072)) {
				var6 = var0.method8536();
				var4.field958 = 0 != (var6 & 1) ? var0.method8368() : 274326889 * var4.field790.field2385 * 2133129945;
				var4.field1020 = (var6 & 2) != 0 ? var0.method8328() : -634834111 * var4.field790.field2386 * -398107455;
				var4.field956 = (var6 & 4) != 0 ? var0.method8328() : var4.field790.field2387;
				var4.field1017 = 0 != (var6 & 8) ? var0.method8328() : 1430199505 * var4.field790.field2411 * -501040079;
				var4.field974 = (var6 & 16) != 0 ? var0.method8328() : var4.field790.field2407;
				var4.field959 = (var6 & 32) != 0 ? var0.method8306() : 1871825673 * var4.field790.field2390 * 253702969;
				var4.field950 = 0 != (var6 & 64) ? var0.method8367() : -2080788827 * var4.field790.field2389 * 154044717;
				var4.field961 = 0 != (var6 & 128) ? var0.method8306() : 752796561 * var4.field790.field2392 * 1788894577;
				var4.field971 = 0 != (var6 & 256) ? var0.method8306() : 1054411661 * var4.field790.field2393 * 1998925637;
				var4.field963 = 0 != (var6 & 512) ? var0.method8368() : 875795671 * var4.field790.field2394 * -500654361;
				var4.field964 = 0 != (var6 & 1024) ? var0.method8367() : var4.field790.field2395;
				var4.field965 = 0 != (var6 & 2048) ? var0.method8306() : 1152150225 * var4.field790.field2396 * -630313423;
				var4.field996 = (var6 & 4096) != 0 ? var0.method8306() : var4.field790.field2397;
				var4.field967 = 0 != (var6 & 8192) ? var0.method8367() : var4.field790.field2398;
				var4.field953 = 0 != (var6 & 16384) ? var0.method8306() : -499537861 * var4.field790.field2381 * -171249421;
			}

			if (0 != (var5 & 4)) {
				var4.field790 = class119.method2293(var0.method8306());
				class224.method4624(var4);
				var4.method1726();
			}

			if ((var5 & 1024) != 0) {
				var4.field1008 = client.field1700 + var0.method8368();
				var4.field970 = client.field1700 + var0.method8368();
				var4.field1010 = var0.method8494();
				var4.field990 = var0.method8327();
				var4.field1002 = var0.method8494();
				var4.field1013 = (byte)var0.method8357();
			}

			int var8;
			int var9;
			int var10;
			int var11;
			int[] var14;
			short[] var15;
			short[] var16;
			long var17;
			if (0 != (var5 & 512)) {
				var6 = var0.method8357();
				if (1 == (var6 & 1)) {
					var4.method1752();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var0.method8475();
						var14 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var0.method8306();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}

					var15 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (null != var4.field790.field2400) {
							var9 = var4.field790.field2400.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.method8368();
						}
					}

					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.field790.field2402 != null) {
							var10 = var4.field790.field2402.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var0.method8306();
						}
					}

					var17 = (long)(++class85.field787 - 1);
					var4.method1729(new class198(var17, var14, var15, var16));
				}
			}

			if ((var5 & 8192) != 0) {
				var4.field1023 = var0.method8361();
			}

			int var7;
			if (0 != (var5 & 32)) {
				var6 = var0.method8367();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var0.method8326();
				if (var6 == var4.field989 && var6 != -1) {
					var8 = class214.method4351(var6).field1991;
					if (var8 == 1) {
						var4.field980 = 0;
						var4.field991 = 0;
						var4.field992 = var7;
						var4.field993 = 0;
					}

					if (var8 == 2) {
						var4.field993 = 0;
					}
				} else if (var6 == -1 || -1 == var4.field989 || class214.method4351(var6).field2015 >= class214.method4351(var4.field989).field2015) {
					var4.field989 = var6;
					var4.field980 = 0;
					var4.field991 = 0;
					var4.field992 = var7;
					var4.field993 = 0;
					var4.field1022 = var4.field947;
				}
			}

			if ((var5 & 16) != 0) {
				var6 = var0.method8478();
				int var12;
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var9 = -1;
						var10 = -1;
						var11 = -1;
						var8 = var0.method8340();
						if (var8 == 32767) {
							var8 = var0.method8340();
							var10 = var0.method8340();
							var9 = var0.method8340();
							var11 = var0.method8340();
						} else if (var8 != 32766) {
							var10 = var0.method8340();
						} else {
							var8 = -1;
						}

						var12 = var0.method8340();
						var4.method2041(var8, var10, var9, var11, client.field1700, var12);
					}
				}

				var7 = var0.method8326();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var0.method8340();
						var10 = var0.method8340();
						if (var10 != 32767) {
							var11 = var0.method8340();
							var12 = var0.method8478();
							int var13 = var10 > 0 ? var0.method8357() : var12;
							var4.method2044(var9, client.field1700, var10, var11, var12, var13);
						} else {
							var4.method2055(var9);
						}
					}
				}
			}

			if ((var5 & 128) != 0) {
				var4.field968 = var0.method8335();
				var4.field1018 = 100;
			}

			if ((var5 & 4096) != 0) {
				var4.method1716(var0.method8326());
			}

			if ((var5 & 256) != 0) {
				var4.method1758(var0.method8335());
			}

			if (0 != (var5 & 8)) {
				var6 = var0.method8328();
				var7 = var0.method8328();
				var4.field998 = var0.method8326() == 1;
				var8 = var4.field1012 - 64 * (var6 - class151.field1447 - class151.field1447);
				var9 = var4.field948 - 64 * (var7 - class388.field4509 - class388.field4509);
				if (var8 != 0 || var9 != 0) {
					var4.field960 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
				}
			}

			if ((var5 & 32768) != 0) {
				var4.field966 = var0.method8494();
				var4.field955 = var0.method8327();
				var4.field1000 = var0.method8494();
				var4.field983 = var0.method8477();
				var4.field1003 = var0.method8328() + client.field1700;
				var4.field1004 = var0.method8306() + client.field1700;
				var4.field1005 = var0.method8328();
				var4.field947 = 1;
				var4.field1022 = 0;
				var4.field966 += var4.field973[0];
				var4.field955 += var4.field1021[0];
				var4.field1000 += var4.field973[0];
				var4.field983 += var4.field1021[0];
			}

			if (0 != (var5 & 16384)) {
				var6 = var0.method8475();
				if (1 == (var6 & 1)) {
					var4.method1745();
				} else {
					var14 = null;
					if (2 == (var6 & 2)) {
						var8 = var0.method8326();
						var14 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var0.method8367();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}

					var15 = null;
					if (4 == (var6 & 4)) {
						var9 = 0;
						if (var4.field790.field2400 != null) {
							var9 = var4.field790.field2400.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.method8306();
						}
					}

					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (null != var4.field790.field2402) {
							var10 = var4.field790.field2402.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var0.method8367();
						}
					}

					var17 = (long)(++class85.field789 - 1);
					var4.method1727(new class198(var17, var14, var15, var16));
				}
			}

			if (0 != (var5 & 64)) {
				var4.field981 = var0.method8328();
				if (class204.field2336) {
					var4.field981 += var0.method8475() << 16;
					var6 = 16777215;
				} else {
					var6 = 65535;
				}

				if (var6 == var4.field981) {
					var4.field981 = -1;
				}
			}

			if (0 != (var5 & 2)) {
				var4.field994 = var0.method8328();
				var6 = var0.method8361();
				var4.field1016 = var6 >> 16;
				var4.field997 = (var6 & 65535) + client.field1700;
				var4.field995 = 0;
				var4.field984 = 0;
				if (var4.field997 > client.field1700) {
					var4.field995 = -1;
				}

				if (65535 == var4.field994) {
					var4.field994 = -1;
				}
			}

			if ((var5 & 65536) != 0) {
				var6 = var0.method8475();
				var14 = new int[8];
				var15 = new short[8];

				for (var9 = 0; var9 < 8; ++var9) {
					if ((var6 & 1 << var9) != 0) {
						var14[var9] = var0.method8344();
						var15[var9] = (short)var0.method8557();
					} else {
						var14[var9] = -1;
						var15[var9] = -1;
					}
				}

				var4.method1725(var14, var15);
			}
		}

	}
}
