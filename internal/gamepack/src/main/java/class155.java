import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "lb"
)
public class class155 {
	@ObfInfo(
		owner = "lb",
		name = "jq",
		desc = "(ZLqx;B)V"
	)
	static final void method718(boolean var0, class6 var1) {
		client.field492 = 0;
		client.field277 = 0;
		var1.method33();
		int var3 = var1.method35(8);
		int var4;
		if (var3 < client.field275) {
			for (var4 = var3; var4 < client.field275; ++var4) {
				client.field354[++client.field492 - 1] = client.field431[var4];
			}
		}

		if (var3 > client.field275) {
			throw new RuntimeException("");
		} else {
			client.field275 = 0;

			int var5;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = client.field431[var4];
				class267 var6 = client.field465[var5];
				int var7 = var1.method35(1);
				if (var7 == 0) {
					client.field431[++client.field275 - 1] = var5;
					var6.field2666 = client.field231;
				} else {
					var8 = var1.method35(2);
					if (var8 == 0) {
						client.field431[++client.field275 - 1] = var5;
						var6.field2666 = client.field231;
						client.field278[++client.field277 - 1] = var5;
					} else if (var8 == 1) {
						client.field431[++client.field275 - 1] = var5;
						var6.field2666 = client.field231;
						var9 = var1.method35(3);
						var6.method1257(var9, class294.field2386);
						var10 = var1.method35(1);
						if (var10 == 1) {
							client.field278[++client.field277 - 1] = var5;
						}
					} else if (var8 == 2) {
						client.field431[++client.field275 - 1] = var5;
						var6.field2666 = client.field231;
						if (var1.method35(1) == 1) {
							var9 = var1.method35(3);
							var6.method1257(var9, class294.field2388);
							var10 = var1.method35(3);
							var6.method1257(var10, class294.field2388);
						} else {
							var9 = var1.method35(3);
							var6.method1257(var9, class294.field2387);
						}

						var9 = var1.method35(1);
						if (var9 == 1) {
							client.field278[++client.field277 - 1] = var5;
						}
					} else if (var8 == 3) {
						client.field354[++client.field492 - 1] = var5;
					}
				}
			}

			while (true) {
				var3 = class123.field1061 ? 16 : 15;
				var4 = 1 << var3;
				if (var1.method37(client.field279.field4047) < var3 + 12) {
					break;
				}

				var5 = var1.method35(var3);
				if (var5 == var4 - 1) {
					break;
				}

				boolean var14 = false;
				if (client.field465[var5] == null) {
					client.field465[var5] = new class267();
					var14 = true;
				}

				class267 var15 = client.field465[var5];
				client.field431[++client.field275 - 1] = var5;
				var15.field2666 = client.field231;
				int var11;
				boolean var12;
				int var13;
				if (class123.field1061) {
					var11 = client.field358[var1.method35(3)];
					if (var14) {
						var15.field2674 = var15.field2622 = var11;
					}

					var15.field2213 = class421.method2049(var1.method35(14), (byte)27);
					if (var0) {
						var10 = var1.method35(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var1.method35(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					var8 = var1.method35(1);
					if (var0) {
						var9 = var1.method35(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.method35(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					var12 = var1.method35(1) == 1;
					if (var12) {
						var1.method35(32);
					}

					var13 = var1.method35(1);
					if (var13 == 1) {
						client.field278[++client.field277 - 1] = var5;
					}
				} else {
					if (var0) {
						var10 = var1.method35(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var1.method35(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					var11 = var1.method35(1);
					if (var11 == 1) {
						client.field278[++client.field277 - 1] = var5;
					}

					var12 = var1.method35(1) == 1;
					if (var12) {
						var1.method35(32);
					}

					var15.field2213 = class421.method2049(var1.method35(14), (byte)104);
					if (var0) {
						var9 = var1.method35(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.method35(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					var8 = var1.method35(1);
					var13 = client.field358[var1.method35(3)];
					if (var14) {
						var15.field2674 = var15.field2622 = var13;
					}
				}

				class211.method914(var15);
				var15.method1258(var9 + class113.field846.field2633[0], class113.field846.field2681[0] + var10, var8 == 1);
			}

			var1.method34();
			class338.method1697(var1);

			for (var3 = 0; var3 < client.field492; ++var3) {
				var4 = client.field354[var3];
				if (client.field465[var4].field2666 != client.field231) {
					client.field465[var4].field2213 = null;
					client.field465[var4] = null;
				}
			}

			if (client.field279.field4047 != var1.field1070) {
				throw new RuntimeException(var1.field1070 + class442.field3659 + client.field279.field4047);
			} else {
				for (var3 = 0; var3 < client.field275; ++var3) {
					if (client.field465[client.field431[var3]] == null) {
						throw new RuntimeException(var3 + class442.field3659 + client.field275);
					}
				}

			}
		}
	}
}
