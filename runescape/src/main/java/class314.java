public class class314 {
	class314() throws Throwable {
		throw new Error();
	}

	static final void method6166(boolean var0, class466 var1) {
		client.field1961 = 0;
		client.field1746 = 0;
		var1.method8275();
		int var3 = var1.method8281(8);
		int var4;
		if (var3 < client.field1744) {
			for (var4 = var3; var4 < client.field1744; ++var4) {
				client.field1823[++client.field1961 - 1] = client.field1900[var4];
			}
		}

		if (var3 > client.field1744) {
			throw new RuntimeException("");
		} else {
			client.field1744 = 0;

			int var5;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = client.field1900[var4];
				class85 var6 = client.field1934[var5];
				int var7 = var1.method8281(1);
				if (var7 == 0) {
					client.field1900[++client.field1744 - 1] = var5;
					var6.field1006 = client.field1700;
				} else {
					var8 = var1.method8281(2);
					if (var8 == 0) {
						client.field1900[++client.field1744 - 1] = var5;
						var6.field1006 = client.field1700;
						client.field1747[++client.field1746 - 1] = var5;
					} else if (var8 == 1) {
						client.field1900[++client.field1744 - 1] = var5;
						var6.field1006 = client.field1700;
						var9 = var1.method8281(3);
						var6.method1718(var9, class201.field2309);
						var10 = var1.method8281(1);
						if (var10 == 1) {
							client.field1747[++client.field1746 - 1] = var5;
						}
					} else if (var8 == 2) {
						client.field1900[++client.field1744 - 1] = var5;
						var6.field1006 = client.field1700;
						if (var1.method8281(1) == 1) {
							var9 = var1.method8281(3);
							var6.method1718(var9, class201.field2311);
							var10 = var1.method8281(3);
							var6.method1718(var10, class201.field2311);
						} else {
							var9 = var1.method8281(3);
							var6.method1718(var9, class201.field2310);
						}

						var9 = var1.method8281(1);
						if (var9 == 1) {
							client.field1747[++client.field1746 - 1] = var5;
						}
					} else if (var8 == 3) {
						client.field1823[++client.field1961 - 1] = var5;
					}
				}
			}

			while (true) {
				var3 = class204.field2336 ? 16 : 15;
				var4 = 1 << var3;
				if (var1.method8287(client.field1748.field1110) < var3 + 12) {
					break;
				}

				var5 = var1.method8281(var3);
				if (var5 == var4 - 1) {
					break;
				}

				boolean var14 = false;
				if (client.field1934[var5] == null) {
					client.field1934[var5] = new class85();
					var14 = true;
				}

				class85 var15 = client.field1934[var5];
				client.field1900[++client.field1744 - 1] = var5;
				var15.field1006 = client.field1700;
				int var11;
				boolean var12;
				int var13;
				if (class204.field2336) {
					var11 = client.field1827[var1.method8281(3)];
					if (var14) {
						var15.field1014 = var15.field962 = var11;
					}

					var15.field790 = class119.method2293(var1.method8281(14));
					if (var0) {
						var10 = var1.method8281(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var1.method8281(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					var8 = var1.method8281(1);
					if (var0) {
						var9 = var1.method8281(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.method8281(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					var12 = var1.method8281(1) == 1;
					if (var12) {
						var1.method8281(32);
					}

					var13 = var1.method8281(1);
					if (var13 == 1) {
						client.field1747[++client.field1746 - 1] = var5;
					}
				} else {
					if (var0) {
						var10 = var1.method8281(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var1.method8281(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					var11 = var1.method8281(1);
					if (var11 == 1) {
						client.field1747[++client.field1746 - 1] = var5;
					}

					var12 = var1.method8281(1) == 1;
					if (var12) {
						var1.method8281(32);
					}

					var15.field790 = class119.method2293(var1.method8281(14));
					if (var0) {
						var9 = var1.method8281(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.method8281(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					var8 = var1.method8281(1);
					var13 = client.field1827[var1.method8281(3)];
					if (var14) {
						var15.field1014 = var15.field962 = var13;
					}
				}

				class224.method4624(var15);
				var15.method1719(var9 + class142.field1370.field973[0], class142.field1370.field1021[0] + var10, var8 == 1);
			}

			var1.method8277();
			class5.method38(var1);

			for (var3 = 0; var3 < client.field1961; ++var3) {
				var4 = client.field1823[var3];
				if (client.field1934[var4].field1006 != client.field1700) {
					client.field1934[var4].field790 = null;
					client.field1934[var4] = null;
				}
			}

			if (client.field1748.field1110 != var1.field4915) {
				throw new RuntimeException(var1.field4915 + class79.field723 + client.field1748.field1110);
			} else {
				for (var3 = 0; var3 < client.field1744; ++var3) {
					if (client.field1934[client.field1900[var3]] == null) {
						throw new RuntimeException(var3 + class79.field723 + client.field1744);
					}
				}

			}
		}
	}
}
