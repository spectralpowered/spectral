public class class2 implements class343 {
	public static final class2 field17;
	public static final class2 field7;
	static class326 field21;
	static class491 field12;
	static String field15;
	static final class2 field10;
	static final class2 field16;
	static final class2 field9;
	boolean field14;
	boolean field8;
	int field19;
	String field11;

	static {
		field17 = new class2(0, "POST", true, true);
		field7 = new class2(1, "GET", true, false);
		field16 = new class2(2, "PUT", false, true);
		field9 = new class2(3, "PATCH", false, true);
		field10 = new class2(4, "DELETE", false, true);
	}

	class2(int var1, String var2, boolean var3, boolean var4) {
		this.field19 = var1;
		this.field11 = var2;
		this.field8 = var3;
		this.field14 = var4;
	}

	public static class460 method20(int var0) {
		int var2 = class452.field4861[var0];
		if (var2 == 1) {
			return class460.field4891;
		} else if (var2 == 2) {
			return class460.field4888;
		} else {
			return var2 == 3 ? class460.field4887 : null;
		}
	}

	boolean method7() {
		return this.field8;
	}

	public String method8() {
		return this.field11;
	}

	boolean method9() {
		return this.field14;
	}

	public int method6487() {
		return this.field19;
	}

	static void method15(int var0, int var1) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var6 = 0; var6 < 4; ++var6) {
			if (var0 != class78.field712[var6]) {
				var3[var5] = class78.field712[var6];
				var4[var5] = class78.field713[var6];
				++var5;
			}
		}

		class78.field712 = var3;
		class78.field713 = var4;
		class424.method7927(class78.field710, 0, class78.field710.length - 1, class78.field712, class78.field713);
	}

	static final void method17(class290 var0, int var1, int var2, int var3) {
		if (null == var0.field3488) {
			throw new RuntimeException();
		} else {
			var0.field3488[var1] = var2;
			var0.field3483[var1] = var3;
		}
	}

	static final void method18() {
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		if (client.field1775 == 0) {
			var1 = class142.field1370.field1012;
			var2 = class142.field1370.field948;
			if (class39.field236 - var1 < -500 || class39.field236 - var1 > 500 || class14.field83 - var2 < -500 || class14.field83 - var2 > 500) {
				class39.field236 = var1;
				class14.field83 = var2;
			}

			if (class39.field236 != var1) {
				class39.field236 += (var1 - class39.field236) / 16;
			}

			if (var2 != class14.field83) {
				class14.field83 += (var2 - class14.field83) / 16;
			}

			var3 = class39.field236 >> 7;
			var4 = class14.field83 >> 7;
			var5 = class199.method3912(class39.field236, class14.field83, class384.field4486);
			var6 = 0;
			int var7;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
						int var9 = class384.field4486;
						if (var9 < 3 && 2 == (class84.field773[1][var7][var8] & 2)) {
							++var9;
						}

						int var10 = var5 - class84.field765[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			var7 = var6 * 192;
			if (var7 > 98048) {
				var7 = 98048;
			}

			if (var7 < 32768) {
				var7 = 32768;
			}

			if (var7 > client.field1786) {
				client.field1786 += (var7 - client.field1786) / 24;
			} else if (var7 < client.field1786) {
				client.field1786 += (var7 - client.field1786) / 80;
			}

			class76.field695 = class199.method3912(class142.field1370.field1012, class142.field1370.field948, class384.field4486) - client.field1931;
		} else if (1 == client.field1775) {
			if (client.field1711 && class142.field1370 != null) {
				var1 = class142.field1370.field973[0];
				var2 = class142.field1370.field1021[0];
				if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
					class39.field236 = class142.field1370.field1012;
					var3 = class199.method3912(class142.field1370.field1012, class142.field1370.field948, class384.field4486) - client.field1931;
					if (var3 < class76.field695) {
						class76.field695 = var3;
					}

					class14.field83 = class142.field1370.field948;
					client.field1711 = false;
				}
			}

			short var11 = -1;
			if (client.field1929.method3567(33)) {
				var11 = 0;
			} else if (client.field1929.method3567(49)) {
				var11 = 1024;
			}

			if (client.field1929.method3567(48)) {
				if (var11 == 0) {
					var11 = 1792;
				} else if (var11 == 1024) {
					var11 = 1280;
				} else {
					var11 = 1536;
				}
			} else if (client.field1929.method3567(50)) {
				if (var11 == 0) {
					var11 = 256;
				} else if (var11 == 1024) {
					var11 = 768;
				} else {
					var11 = 512;
				}
			}

			byte var12 = 0;
			if (client.field1929.method3567(35)) {
				var12 = -1;
			} else if (client.field1929.method3567(51)) {
				var12 = 1;
			}

			var3 = 0;
			if (var11 >= 0 || var12 != 0) {
				var3 = client.field1929.method3567(81) ? client.field1781 : client.field1842;
				var3 *= 16;
				client.field1778 = var11;
				client.field1779 = var12;
			}

			if (client.field1820 < var3) {
				client.field1820 += var3 / 8;
				if (client.field1820 > var3) {
					client.field1820 = var3;
				}
			} else if (client.field1820 > var3) {
				client.field1820 = client.field1820 * 9 / 10;
			}

			if (client.field1820 > 0) {
				var4 = client.field1820 / 16;
				if (client.field1778 >= 0) {
					var1 = client.field1778 - class113.field1145 & 2047;
					var5 = class221.field2667[var1];
					var6 = class221.field2690[var1];
					class39.field236 += var5 * var4 / 65536;
					class14.field83 += var6 * var4 / 65536;
				}

				if (0 != client.field1779) {
					class76.field695 += client.field1779 * var4;
					if (class76.field695 > 0) {
						class76.field695 = 0;
					}
				}
			} else {
				client.field1778 = -1;
				client.field1779 = -1;
			}

			if (client.field1929.method3567(13)) {
				client.field1748.method2173(class152.method2679(class276.field3218, client.field1748.field1105));
				client.field1775 = 0;
			}
		}

		if (class28.field157 == 4 && class218.field2651) {
			var1 = class28.field153 - client.field1774;
			client.field1845 = var1 * 2;
			client.field1774 = var1 != -1 && var1 != 1 ? (client.field1774 + class28.field153) / 2 : class28.field153;
			var2 = client.field1773 - class28.field158;
			client.field1771 = var2 * 2;
			client.field1773 = var2 != -1 && var2 != 1 ? (class28.field158 + client.field1773) / 2 : class28.field158;
		} else {
			if (client.field1929.method3567(96)) {
				client.field1771 += (-24 - client.field1771) / 2;
			} else if (client.field1929.method3567(97)) {
				client.field1771 += (24 - client.field1771) / 2;
			} else {
				client.field1771 /= 2;
			}

			if (client.field1929.method3567(98)) {
				client.field1845 += (12 - client.field1845) / 2;
			} else if (client.field1929.method3567(99)) {
				client.field1845 += (-12 - client.field1845) / 2;
			} else {
				client.field1845 /= 2;
			}

			client.field1774 = class28.field153;
			client.field1773 = class28.field158;
		}

		client.field1770 = client.field1770 + client.field1771 / 2 & 2047;
		client.field1769 += client.field1845 / 2;
		if (client.field1769 < 128) {
			client.field1769 = 128;
		}

		if (client.field1769 > 383) {
			client.field1769 = 383;
		}

	}

	static final void method19(class102 var0, boolean var1) {
		int var3 = var0.field1057;
		int var4 = (int)var0.field4773;
		var0.method7951();
		if (var1) {
			class195.method3804(var3);
		}

		class165.method2778(var3);
		class290 var5 = class180.method2988(var4);
		if (null != var5) {
			class53.method1040(var5);
		}

		if (-1 != client.field1862) {
			client.method6246(client.field1862, 1);
		}

	}
}
