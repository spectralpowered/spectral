public class class159 extends class152 {
	int field1498;
	long field1497;
	// $FF: synthetic field
	final class143 this$0;

	static void method2719(class466 var0, int var1) {
		boolean var3 = var0.method8281(1) == 1;
		if (var3) {
			class87.field824[++class87.field820 - 1] = var1;
		}

		int var4 = var0.method8281(2);
		class88 var5 = client.field1816[var1];
		if (var4 == 0) {
			if (var3) {
				var5.field838 = false;
			} else if (client.field1817 == var1) {
				throw new RuntimeException();
			} else {
				class87.field816[var1] = (var5.field973[0] + class151.field1447 >> 13 << 14) + (var5.field847 << 28) + (var5.field1021[0] + class388.field4509 >> 13);
				if (var5.field960 != -1) {
					class87.field821[var1] = var5.field960;
				} else {
					class87.field821[var1] = var5.field1014;
				}

				class87.field823[var1] = var5.field981;
				client.field1816[var1] = null;
				if (var0.method8281(1) != 0) {
					class332.method6273(var0, var1);
				}

			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var4 == 1) {
				var6 = var0.method8281(3);
				var7 = var5.field973[0];
				var8 = var5.field1021[0];
				if (var6 == 0) {
					--var7;
					--var8;
				} else if (var6 == 1) {
					--var8;
				} else if (var6 == 2) {
					++var7;
					--var8;
				} else if (var6 == 3) {
					--var7;
				} else if (var6 == 4) {
					++var7;
				} else if (var6 == 5) {
					--var7;
					++var8;
				} else if (var6 == 6) {
					++var8;
				} else if (var6 == 7) {
					++var7;
					++var8;
				}

				if (client.field1817 == var1 && (var5.field1012 < 1536 || var5.field948 < 1536 || var5.field1012 >= 11776 || var5.field948 >= 11776)) {
					var5.method1915(var7, var8);
					var5.field838 = false;
				} else if (var3) {
					var5.field838 = true;
					var5.field852 = var7;
					var5.field854 = var8;
				} else {
					var5.field838 = false;
					var5.method1914(var7, var8, class87.field822[var1]);
				}

			} else if (var4 == 2) {
				var6 = var0.method8281(4);
				var7 = var5.field973[0];
				var8 = var5.field1021[0];
				if (var6 == 0) {
					var7 -= 2;
					var8 -= 2;
				} else if (var6 == 1) {
					--var7;
					var8 -= 2;
				} else if (var6 == 2) {
					var8 -= 2;
				} else if (var6 == 3) {
					++var7;
					var8 -= 2;
				} else if (var6 == 4) {
					var7 += 2;
					var8 -= 2;
				} else if (var6 == 5) {
					var7 -= 2;
					--var8;
				} else if (var6 == 6) {
					var7 += 2;
					--var8;
				} else if (var6 == 7) {
					var7 -= 2;
				} else if (var6 == 8) {
					var7 += 2;
				} else if (var6 == 9) {
					var7 -= 2;
					++var8;
				} else if (var6 == 10) {
					var7 += 2;
					++var8;
				} else if (var6 == 11) {
					var7 -= 2;
					var8 += 2;
				} else if (var6 == 12) {
					--var7;
					var8 += 2;
				} else if (var6 == 13) {
					var8 += 2;
				} else if (var6 == 14) {
					++var7;
					var8 += 2;
				} else if (var6 == 15) {
					var7 += 2;
					var8 += 2;
				}

				if (var1 != client.field1817 || var5.field1012 >= 1536 && var5.field948 >= 1536 && var5.field1012 < 11776 && var5.field948 < 11776) {
					if (var3) {
						var5.field838 = true;
						var5.field852 = var7;
						var5.field854 = var8;
					} else {
						var5.field838 = false;
						var5.method1914(var7, var8, class87.field822[var1]);
					}
				} else {
					var5.method1915(var7, var8);
					var5.field838 = false;
				}

			} else {
				var6 = var0.method8281(1);
				int var9;
				int var10;
				int var11;
				int var12;
				if (var6 == 0) {
					var7 = var0.method8281(12);
					var8 = var7 >> 10;
					var9 = var7 >> 5 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var7 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var5.field973[0] + var9;
					var12 = var10 + var5.field1021[0];
					if (var1 != client.field1817 || var5.field1012 >= 1536 && var5.field948 >= 1536 && var5.field1012 < 11776 && var5.field948 < 11776) {
						if (var3) {
							var5.field838 = true;
							var5.field852 = var11;
							var5.field854 = var12;
						} else {
							var5.field838 = false;
							var5.method1914(var11, var12, class87.field822[var1]);
						}
					} else {
						var5.method1915(var11, var12);
						var5.field838 = false;
					}

					var5.field847 = (byte)(var8 + var5.field847 & 3);
					if (var1 == client.field1817) {
						class384.field4486 = var5.field847;
					}

				} else {
					var7 = var0.method8281(30);
					var8 = var7 >> 28;
					var9 = var7 >> 14 & 16383;
					var10 = var7 & 16383;
					var11 = (var5.field973[0] + class151.field1447 + var9 & 16383) - class151.field1447;
					var12 = (class388.field4509 + var5.field1021[0] + var10 & 16383) - class388.field4509;
					if (client.field1817 != var1 || var5.field1012 >= 1536 && var5.field948 >= 1536 && var5.field1012 < 11776 && var5.field948 < 11776) {
						if (var3) {
							var5.field838 = true;
							var5.field852 = var11;
							var5.field854 = var12;
						} else {
							var5.field838 = false;
							var5.method1914(var11, var12, class87.field822[var1]);
						}
					} else {
						var5.method1915(var11, var12);
						var5.field838 = false;
					}

					var5.field847 = (byte)(var8 + var5.field847 & 3);
					if (client.field1817 == var1) {
						class384.field4486 = var5.field847;
					}

				}
			}
		}
	}

	class159(class143 var1) {
		this.this$0 = var1;
	}

	void method2674(class467 var1) {
		this.field1498 = var1.method8480();
		this.field1497 = var1.method8492();
	}

	void method2677(class146 var1) {
		var1.method2586(this.field1498, this.field1497);
	}
}
