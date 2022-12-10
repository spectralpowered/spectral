public class class192 implements class343 {
	static final class192 field2113;
	static final class192 field2114;
	static final class192 field2116;
	final int field2117;
	public final int field2115;

	static {
		field2114 = new class192(2, 0);
		field2113 = new class192(1, 1);
		field2116 = new class192(0, 2);
	}

	class192(int var1, int var2) {
		this.field2115 = var1;
		this.field2117 = var2;
	}

	public int method6487() {
		return this.field2117;
	}

	static final void method3750(class466 var0, int var1, class88 var2, int var3) {
		byte var5 = class201.field2308.field2312;
		if (0 != (var3 & 8192)) {
			var2.field966 = var0.method8477();
			var2.field955 = var0.method8327();
			var2.field1000 = var0.method8477();
			var2.field983 = var0.method8360();
			var2.field1003 = var0.method8306() + client.field1700;
			var2.field1004 = var0.method8367() + client.field1700;
			var2.field1005 = var0.method8328();
			if (var2.field838) {
				var2.field966 += var2.field852;
				var2.field955 += var2.field854;
				var2.field1000 += var2.field852;
				var2.field983 += var2.field854;
				var2.field947 = 0;
			} else {
				var2.field966 += var2.field973[0];
				var2.field955 += var2.field1021[0];
				var2.field1000 += var2.field973[0];
				var2.field983 += var2.field1021[0];
				var2.field947 = 1;
			}

			var2.field1022 = 0;
		}

		if (0 != (var3 & 32)) {
			var2.field968 = var0.method8335();
			if (var2.field968.charAt(0) == '~') {
				var2.field968 = var2.field968.substring(1);
				class105.method2785(2, var2.field840.method8771(), var2.field968);
			} else if (var2 == class142.field1370) {
				class105.method2785(2, var2.field840.method8771(), var2.field968);
			}

			var2.field969 = false;
			var2.field972 = 0;
			var2.field999 = 0;
			var2.field1018 = 150;
		}

		int var6;
		if ((var3 & 4096) != 0) {
			var2.field994 = var0.method8328();
			var6 = var0.method8380();
			var2.field1016 = var6 >> 16;
			var2.field997 = (var6 & 65535) + client.field1700;
			var2.field995 = 0;
			var2.field984 = 0;
			if (var2.field997 > client.field1700) {
				var2.field995 = -1;
			}

			if (65535 == var2.field994) {
				var2.field994 = -1;
			}
		}

		int var7;
		if ((var3 & 8) != 0) {
			var6 = var0.method8367();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var0.method8326();
			class281.method5351(var2, var6, var7);
		}

		if ((var3 & 256) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				var2.field850[var6] = var0.method8335();
			}
		}

		if (0 != (var3 & 16)) {
			var2.field981 = var0.method8368();
			if (class202.field2320) {
				var2.field981 += var0.method8326() << 16;
				var6 = 16777215;
			} else {
				var6 = 65535;
			}

			if (var6 == var2.field981) {
				var2.field981 = -1;
			}
		}

		if (0 != (var3 & 16384)) {
			var2.field1008 = client.field1700 + var0.method8367();
			var2.field970 = client.field1700 + var0.method8306();
			var2.field1010 = var0.method8494();
			var2.field990 = var0.method8494();
			var2.field1002 = var0.method8327();
			var2.field1013 = (byte)var0.method8357();
		}

		if (0 != (var3 & 128)) {
			var2.field960 = var0.method8368();
			if (0 == var2.field947) {
				var2.field1014 = var2.field960;
				var2.field960 = -1;
			}
		}

		if (0 != (var3 & 4)) {
			var6 = var0.method8475();
			byte[] var14 = new byte[var6];
			class467 var8 = new class467(var14);
			var0.method8381(var14, 0, var6);
			class87.field815[var1] = var8;
			var2.method1926(var8);
		}

		if ((var3 & 1024) != 0) {
			var5 = var0.method8327();
		}

		int var9;
		int var10;
		int var13;
		if (0 != (var3 & 2)) {
			var6 = var0.method8368();
			class329 var20 = (class329)class78.method1584(class329.method2501(), var0.method8475());
			boolean var15 = var0.method8475() == 1;
			var9 = var0.method8357();
			var10 = var0.field4915;
			if (var2.field840 != null && null != var2.field827) {
				boolean var11 = false;
				if (var20.field4165 && class405.field4602.method1129(var2.field840)) {
					var11 = true;
				}

				if (!var11 && client.field1873 == 0 && !var2.field846) {
					class87.field825.field4915 = 0;
					var0.method8381(class87.field825.field4917, 0, var9);
					class87.field825.field4915 = 0;
					String var12 = class369.method6886(class203.method4001(class134.method2481(class87.field825)));
					var2.field968 = var12.trim();
					var2.field972 = var6 >> 8;
					var2.field999 = var6 & 255;
					var2.field1018 = 150;
					var2.field969 = var15;
					var2.field957 = class142.field1370 != var2 && var20.field4165 && client.field1926 != "" && var12.toLowerCase().indexOf(client.field1926) == -1;
					if (var20.field4151) {
						var13 = var15 ? 91 : 1;
					} else {
						var13 = var15 ? 90 : 2;
					}

					if (-1 != var20.field4163) {
						class105.method2785(var13, class79.method8214(var20.field4163) + var2.field840.method8771(), var12);
					} else {
						class105.method2785(var13, var2.field840.method8771(), var12);
					}
				}
			}

			var0.field4915 = var10 + var9;
		}

		if ((var3 & 1) != 0) {
			var6 = var0.method8326();
			int var16;
			int var19;
			int var22;
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var9 = -1;
					var10 = -1;
					var19 = -1;
					var22 = var0.method8340();
					if (var22 == 32767) {
						var22 = var0.method8340();
						var10 = var0.method8340();
						var9 = var0.method8340();
						var19 = var0.method8340();
					} else if (var22 != 32766) {
						var10 = var0.method8340();
					} else {
						var22 = -1;
					}

					var16 = var0.method8340();
					var2.method2041(var22, var10, var9, var19, client.field1700, var16);
				}
			}

			var7 = var0.method8475();
			if (var7 > 0) {
				for (var22 = 0; var22 < var7; ++var22) {
					var9 = var0.method8340();
					var10 = var0.method8340();
					if (var10 != 32767) {
						var19 = var0.method8340();
						var16 = var0.method8357();
						var13 = var10 > 0 ? var0.method8326() : var16;
						var2.method2044(var9, client.field1700, var10, var19, var16, var13);
					} else {
						var2.method2055(var9);
					}
				}
			}
		}

		if (0 != (var3 & 2048)) {
			class201[] var17 = class87.field822;
			class201[] var18 = new class201[]{class201.field2310, class201.field2308, class201.field2311, class201.field2309};
			var17[var1] = (class201)class78.method1584(var18, var0.method8327());
		}

		if (var2.field838) {
			if (var5 == 127) {
				var2.method1915(var2.field852, var2.field854);
			} else {
				class201 var23;
				if (var5 != class201.field2308.field2312) {
					class201[] var21 = new class201[]{class201.field2310, class201.field2308, class201.field2311, class201.field2309};
					var23 = (class201)class78.method1584(var21, var5);
				} else {
					var23 = class87.field822[var1];
				}

				var2.method1914(var2.field852, var2.field854, var23);
			}
		}

	}
}
