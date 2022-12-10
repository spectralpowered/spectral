public class class61 {
	int field475;
	final class451 field469;
	public final class371 field470;
	public final class374 field471;

	class61(class451 var1) {
		this.field475 = 0;
		this.field469 = var1;
		this.field470 = new class371(var1);
		this.field471 = new class374(var1);
	}

	boolean method1147() {
		return 2 == this.field475;
	}

	final void method1142() {
		this.field475 = 1;
	}

	final void method1131(class467 var1, int var2) {
		this.field470.method6953(var1, var2);
		this.field475 = 2;
		class349.method6509();
	}

	final void method1132() {
		for (class415 var2 = (class415)this.field470.field4423.method6404(); var2 != null; var2 = (class415)this.field470.field4423.method6406()) {
			if ((long)var2.field4641 < class74.method1493() / 1000L - 5L) {
				if (var2.field4643 > 0) {
					class105.method2785(5, "", var2.field4642 + class321.field4032);
				}

				if (var2.field4643 == 0) {
					class105.method2785(5, "", var2.field4642 + class321.field3915);
				}

				var2.method7971();
			}
		}

	}

	final void method1133() {
		this.field475 = 0;
		this.field470.method7290();
		this.field471.method7290();
	}

	final boolean method1134(class483 var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class142.field1370.field840)) {
			return true;
		} else {
			return this.field470.method6963(var1, var2);
		}
	}

	final boolean method1129(class483 var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.field471.method7293(var1);
		}
	}

	final void method1135(String var1) {
		if (var1 != null) {
			class483 var3 = new class483(var1, this.field469);
			if (var3.method8773()) {
				if (this.method1143()) {
					class321 var10000 = (class321)null;
					String var5 = class321.field3818;
					class105.method2785(30, "", var5);
				} else if (class142.field1370.field840.equals(var3)) {
					method4622();
				} else if (this.method1134(var3, false)) {
					class5.method41(var1);
				} else if (this.method1129(var3)) {
					method6194(var1);
				} else {
					class284 var4 = class152.method2679(class276.field3254, client.field1748.field1105);
					var4.field3321.method8323(class467.method190(var1));
					var4.field3321.method8316(var1);
					client.field1748.method2173(var4);
				}
			}
		}
	}

	static final void method1180(class466 var0) {
		int var2 = 0;
		var0.method8275();

		byte[] var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < class87.field818; ++var3) {
			var4 = class87.field817[var3];
			if (0 == (class87.field813[var4] & 1)) {
				if (var2 > 0) {
					--var2;
					var10000 = class87.field813;
					var10000[var4] = (byte)(var10000[var4] | 2);
				} else {
					var5 = var0.method8281(1);
					if (var5 == 0) {
						var2 = class320.method6190(var0);
						var10000 = class87.field813;
						var10000[var4] = (byte)(var10000[var4] | 2);
					} else {
						class159.method2719(var0, var4);
					}
				}
			}
		}

		var0.method8277();
		if (var2 != 0) {
			throw new RuntimeException();
		} else {
			var0.method8275();

			for (var3 = 0; var3 < class87.field818; ++var3) {
				var4 = class87.field817[var3];
				if (0 != (class87.field813[var4] & 1)) {
					if (var2 > 0) {
						--var2;
						var10000 = class87.field813;
						var10000[var4] = (byte)(var10000[var4] | 2);
					} else {
						var5 = var0.method8281(1);
						if (var5 == 0) {
							var2 = class320.method6190(var0);
							var10000 = class87.field813;
							var10000[var4] = (byte)(var10000[var4] | 2);
						} else {
							class159.method2719(var0, var4);
						}
					}
				}
			}

			var0.method8277();
			if (var2 != 0) {
				throw new RuntimeException();
			} else {
				var0.method8275();

				for (var3 = 0; var3 < class87.field812; ++var3) {
					var4 = class87.field819[var3];
					if (0 != (class87.field813[var4] & 1)) {
						if (var2 > 0) {
							--var2;
							var10000 = class87.field813;
							var10000[var4] = (byte)(var10000[var4] | 2);
						} else {
							var5 = var0.method8281(1);
							if (var5 == 0) {
								var2 = class320.method6190(var0);
								var10000 = class87.field813;
								var10000[var4] = (byte)(var10000[var4] | 2);
							} else if (class332.method6273(var0, var4)) {
								var10000 = class87.field813;
								var10000[var4] = (byte)(var10000[var4] | 2);
							}
						}
					}
				}

				var0.method8277();
				if (var2 != 0) {
					throw new RuntimeException();
				} else {
					var0.method8275();

					for (var3 = 0; var3 < class87.field812; ++var3) {
						var4 = class87.field819[var3];
						if (0 == (class87.field813[var4] & 1)) {
							if (var2 > 0) {
								--var2;
								var10000 = class87.field813;
								var10000[var4] = (byte)(var10000[var4] | 2);
							} else {
								var5 = var0.method8281(1);
								if (var5 == 0) {
									var2 = class320.method6190(var0);
									var10000 = class87.field813;
									var10000[var4] = (byte)(var10000[var4] | 2);
								} else if (class332.method6273(var0, var4)) {
									var10000 = class87.field813;
									var10000[var4] = (byte)(var10000[var4] | 2);
								}
							}
						}
					}

					var0.method8277();
					if (var2 != 0) {
						throw new RuntimeException();
					} else {
						class87.field818 = 0;
						class87.field812 = 0;

						for (var3 = 1; var3 < 2048; ++var3) {
							var10000 = class87.field813;
							var10000[var3] = (byte)(var10000[var3] >> 1);
							class88 var6 = client.field1816[var3];
							if (null != var6) {
								class87.field817[++class87.field818 - 1] = var3;
							} else {
								class87.field819[++class87.field812 - 1] = var3;
							}
						}

					}
				}
			}
		}
	}

	static class65 method1179(byte[] var0) {
		class65 var2 = new class65();
		class467 var3 = new class467(var0);
		var3.field4915 = var3.field4917.length - 2;
		int var4 = var3.method8328();
		int var5 = var3.field4917.length - 2 - var4 - 12;
		var3.field4915 = var5;
		int var6 = var3.method8480();
		var2.field526 = var3.method8328();
		var2.field528 = var3.method8328();
		var2.field533 = var3.method8328();
		var2.field527 = var3.method8328();
		int var7 = var3.method8326();
		int var8;
		int var9;
		if (var7 > 0) {
			var2.field531 = var2.method1210(var7);

			for (var8 = 0; var8 < var7; ++var8) {
				var9 = var3.method8328();
				class454 var10 = new class454(var9 > 0 ? class279.method8200(var9) : 1);
				var2.field531[var8] = var10;

				while (var9-- > 0) {
					int var11 = var3.method8480();
					int var12 = var3.method8480();
					var10.method8133(new class429(var12), (long)var11);
				}
			}
		}

		var3.field4915 = 0;
		var2.field523 = var3.method8334();
		var2.field524 = new int[var6];
		var2.field525 = new int[var6];
		var2.field530 = new String[var6];

		for (var8 = 0; var3.field4915 < var5; var2.field524[var8++] = var9) {
			var9 = var3.method8328();
			if (var9 == 3) {
				var2.field530[var8] = var3.method8335();
			} else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
				var2.field525[var8] = var3.method8480();
			} else {
				var2.field525[var8] = var3.method8326();
			}
		}

		return var2;
	}

	static final void method6194(String var0) {
		StringBuilder var10000 = new StringBuilder();
		class321 var10001 = (class321)null;
		var10000 = var10000.append(class321.field3939).append(var0);
		var10001 = (class321)null;
		String var2 = var10000.append(class321.field3940).toString();
		class105.method2785(30, "", var2);
	}

	static final void method4622() {
		class321 var10000 = (class321)null;
		String var1 = class321.field3937;
		class105.method2785(30, "", var1);
	}

	final boolean method1143() {
		return this.field470.method7292() || this.field470.method7291() >= 200 && 1 != client.field1874;
	}

	final void method1156(String var1) {
		if (null != var1) {
			class483 var3 = new class483(var1, this.field469);
			if (var3.method8773()) {
				String var5;
				if (this.method1139()) {
					class321 var6 = (class321)null;
					var5 = class321.field3766;
					class105.method2785(30, "", var5);
				} else if (class142.field1370.field840.equals(var3)) {
					method174();
				} else if (this.method1129(var3)) {
					class328.method6257(var1);
				} else if (this.method1134(var3, false)) {
					StringBuilder var10000 = new StringBuilder();
					class321 var10001 = (class321)null;
					var10000 = var10000.append(class321.field4035).append(var1);
					var10001 = (class321)null;
					var5 = var10000.append(class321.field3942).toString();
					class105.method2785(30, "", var5);
				} else {
					class284 var4 = class152.method2679(class276.field3220, client.field1748.field1105);
					var4.field3321.method8323(class467.method190(var1));
					var4.field3321.method8316(var1);
					client.field1748.method2173(var4);
				}
			}
		}
	}

	static final void method174() {
		class321 var10000 = (class321)null;
		String var1 = class321.field3938;
		class105.method2785(30, "", var1);
	}

	final boolean method1139() {
		return this.field471.method7292() || this.field471.method7291() >= 100 && 1 != client.field1874;
	}

	final void method1140(String var1) {
		if (var1 != null) {
			class483 var3 = new class483(var1, this.field469);
			if (var3.method8773()) {
				if (this.field470.method7354(var3)) {
					client.field1897 = client.field1887;
					class284 var4 = class152.method2679(class276.field3295, client.field1748.field1105);
					var4.field3321.method8323(class467.method190(var1));
					var4.field3321.method8316(var1);
					client.field1748.method2173(var4);
				}

				class349.method6509();
			}
		}
	}

	final void method1128(String var1) {
		if (var1 != null) {
			class483 var3 = new class483(var1, this.field469);
			if (var3.method8773()) {
				if (this.field471.method7354(var3)) {
					client.field1897 = client.field1887;
					class284 var4 = class152.method2679(class276.field3293, client.field1748.field1105);
					var4.field3321.method8323(class467.method190(var1));
					var4.field3321.method8316(var1);
					client.field1748.method2173(var4);
				}

				class248.method4924();
			}
		}
	}

	static final void method2905(String var0, int var1) {
		class284 var3 = class152.method2679(class276.field3234, client.field1748.field1105);
		var3.field3321.method8323(class467.method190(var0) + 1);
		var3.field3321.method8354(var1);
		var3.field3321.method8316(var0);
		client.field1748.method2173(var3);
	}

	static float method1148(class125 var0, float var1, boolean var2) {
		float var4 = 0.0F;
		if (var0 != null && var0.method2365() != 0) {
			float var5 = (float)var0.field1242[0].field1209;
			float var6 = (float)var0.field1242[var0.method2365() - 1].field1209;
			float var7 = var6 - var5;
			if (0.0D == (double)var7) {
				return var0.field1242[0].field1204;
			} else {
				float var8 = 0.0F;
				if (var1 > var6) {
					var8 = (var1 - var6) / var7;
				} else {
					var8 = (var1 - var5) / var7;
				}

				double var9 = (double)((int)var8);
				float var11 = Math.abs((float)((double)var8 - var9));
				float var12 = var11 * var7;
				var9 = Math.abs(var9 + 1.0D);
				double var13 = var9 / 2.0D;
				double var15 = (double)((int)var13);
				var11 = (float)(var13 - var15);
				float var17;
				float var18;
				if (var2) {
					if (var0.field1240 == class120.field1197) {
						if (0.0D != (double)var11) {
							var12 += var5;
						} else {
							var12 = var6 - var12;
						}
					} else if (class120.field1195 != var0.field1240 && var0.field1240 != class120.field1202) {
						if (class120.field1194 == var0.field1240) {
							var12 = var5 - var1;
							var17 = var0.field1242[0].field1203;
							var18 = var0.field1242[0].field1206;
							var4 = var0.field1242[0].field1204;
							if ((double)var17 != 0.0D) {
								var4 -= var18 * var12 / var17;
							}

							return var4;
						}
					} else {
						var12 = var6 - var12;
					}
				} else if (var0.field1241 == class120.field1197) {
					if (0.0D != (double)var11) {
						var12 = var6 - var12;
					} else {
						var12 += var5;
					}
				} else if (var0.field1241 != class120.field1195 && class120.field1202 != var0.field1241) {
					if (class120.field1194 == var0.field1241) {
						var12 = var1 - var6;
						var17 = var0.field1242[var0.method2365() - 1].field1207;
						var18 = var0.field1242[var0.method2365() - 1].field1205;
						var4 = var0.field1242[var0.method2365() - 1].field1204;
						if (0.0D != (double)var17) {
							var4 += var18 * var12 / var17;
						}

						return var4;
					}
				} else {
					var12 += var5;
				}

				var4 = class193.method3751(var0, var12);
				float var19;
				if (var2 && var0.field1240 == class120.field1202) {
					var19 = var0.field1242[var0.method2365() - 1].field1204 - var0.field1242[0].field1204;
					var4 = (float)((double)var4 - var9 * (double)var19);
				} else if (!var2 && var0.field1241 == class120.field1202) {
					var19 = var0.field1242[var0.method2365() - 1].field1204 - var0.field1242[0].field1204;
					var4 = (float)((double)var4 + var9 * (double)var19);
				}

				return var4;
			}
		} else {
			return var4;
		}
	}

	final boolean method1155(class483 var1) {
		class395 var3 = (class395)this.field470.method7314(var1);
		return null != var3 && var3.method7259();
	}

	static final void method1182(class98 var0) {
		if (var0.field1019 != 0) {
			if (-1 != var0.field981) {
				Object var2 = null;
				int var3 = class202.field2320 ? 65536 : 32768;
				if (var0.field981 < var3) {
					var2 = client.field1934[var0.field981];
				} else if (var0.field981 >= var3) {
					var2 = client.field1816[var0.field981 - var3];
				}

				if (var2 != null) {
					int var4 = var0.field1012 - ((class98)var2).field1012;
					int var5 = var0.field948 - ((class98)var2).field948;
					if (var4 != 0 || var5 != 0) {
						var0.field1014 = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
					}
				} else if (var0.field982) {
					var0.field981 = -1;
					var0.field982 = false;
				}
			}

			if (var0.field960 != -1 && (var0.field947 == 0 || var0.field1009 > 0)) {
				var0.field1014 = var0.field960;
				var0.field960 = -1;
			}

			int var6 = var0.field1014 - var0.field962 & 2047;
			if (var6 == 0 && var0.field982) {
				var0.field981 = -1;
				var0.field982 = false;
			}

			if (var6 != 0) {
				++var0.field1015;
				boolean var8;
				if (var6 > 1024) {
					var0.field962 -= var0.field998 ? var6 : var0.field1019;
					var8 = true;
					if (var6 < var0.field1019 || var6 > 2048 - var0.field1019) {
						var0.field962 = var0.field1014;
						var8 = false;
					}

					if (!var0.field998 && var0.field953 == var0.field985 && (var0.field1015 > 25 || var8)) {
						if (-1 != var0.field958) {
							var0.field985 = var0.field958;
						} else {
							var0.field985 = var0.field956;
						}
					}
				} else {
					var0.field962 += var0.field998 ? var6 : var0.field1019;
					var8 = true;
					if (var6 < var0.field1019 || var6 > 2048 - var0.field1019) {
						var0.field962 = var0.field1014;
						var8 = false;
					}

					if (!var0.field998 && var0.field953 == var0.field985 && (var0.field1015 > 25 || var8)) {
						if (var0.field1020 != -1) {
							var0.field985 = var0.field1020;
						} else {
							var0.field985 = var0.field956;
						}
					}
				}

				var0.field962 &= 2047;
				var0.field998 = false;
			} else {
				var0.field1015 = 0;
			}

		}
	}
}
