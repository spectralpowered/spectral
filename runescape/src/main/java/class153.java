public class class153 extends class439 {
	boolean field1459;
	class125[][] field1458;
	int field1460;
	int field1462;
	public class125[][] field1457;
	public class222 field1456;

	public class153(class337 var1, class337 var2, int var3, boolean var4) {
		this.field1457 = (class125[][])null;
		this.field1458 = (class125[][])null;
		this.field1462 = 0;
		this.field1460 = var3;
		byte[] var5 = var1.method6374(this.field1460 >> 16 & 65535, this.field1460 & 65535);
		class467 var6 = new class467(var5);
		int var7 = var6.method8326();
		int var8 = var6.method8328();
		byte[] var9;
		if (var4) {
			var9 = var2.method6309(0, var8);
		} else {
			var9 = var2.method6309(var8, 0);
		}

		this.field1456 = new class222(var8, var9);
		this.method2682(var6, var7);
	}

	void method2682(class467 var1, int var2) {
		var1.method8328();
		var1.method8328();
		this.field1462 = var1.method8326();
		int var4 = var1.method8328();
		this.field1458 = new class125[this.field1456.method4616().method4504()][];
		this.field1457 = new class125[this.field1456.method4620()][];

		for (int var5 = 0; var5 < var4; ++var5) {
			class114 var6 = class114.method6618(var1.method8326());
			int var7 = var1.method8339();
			class130 var8 = class51.method1015(var1.method8326());
			class125 var9 = new class125();
			var9.method2361(var1, var2);
			int var10 = var6.method2187();
			class125[][] var11;
			if (class114.field1147 == var6) {
				var11 = this.field1458;
			} else {
				var11 = this.field1457;
			}

			if (var11[var7] == null) {
				var11[var7] = new class125[var10];
			}

			var11[var7][var8.method2432()] = var9;
			if (class114.field1150 == var6) {
				this.field1459 = true;
			}
		}

	}

	public int method2699() {
		return this.field1462;
	}

	public boolean method2683() {
		return this.field1459;
	}

	public void method2681(int var1, class124 var2, int var3, int var4) {
		class400 var6 = class317.method6176();
		this.method2685(var6, var3, var2, var1);
		this.method2687(var6, var3, var2, var1);
		this.method2686(var6, var3, var2, var1);
		var2.method2332(var6);
		var6.method7431();
	}

	void method2685(class400 var1, int var2, class124 var3, int var4) {
		float[] var6 = var3.method2334(this.field1462);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field1458[var2]) {
			class125 var10 = this.field1458[var2][0];
			class125 var11 = this.field1458[var2][1];
			class125 var12 = this.field1458[var2][2];
			if (null != var10) {
				var7 = var10.method2384(var4);
			}

			if (var11 != null) {
				var8 = var11.method2384(var4);
			}

			if (var12 != null) {
				var9 = var12.method2384(var4);
			}
		}

		class406 var15 = class199.method3913();
		var15.method7526(1.0F, 0.0F, 0.0F, var7);
		class406 var16 = class199.method3913();
		var16.method7526(0.0F, 1.0F, 0.0F, var8);
		class406 var17 = class199.method3913();
		var17.method7526(0.0F, 0.0F, 1.0F, var9);
		class406 var13 = class199.method3913();
		var13.method7528(var17);
		var13.method7528(var15);
		var13.method7528(var16);
		class400 var14 = class317.method6176();
		var14.method7425(var13);
		var1.method7424(var14);
		var15.method7543();
		var16.method7543();
		var17.method7543();
		var13.method7543();
		var14.method7431();
	}

	void method2686(class400 var1, int var2, class124 var3, int var4) {
		float[] var6 = var3.method2335(this.field1462);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field1458[var2]) {
			class125 var10 = this.field1458[var2][3];
			class125 var11 = this.field1458[var2][4];
			class125 var12 = this.field1458[var2][5];
			if (var10 != null) {
				var7 = var10.method2384(var4);
			}

			if (var11 != null) {
				var8 = var11.method2384(var4);
			}

			if (null != var12) {
				var9 = var12.method2384(var4);
			}
		}

		var1.field4563[12] = var7;
		var1.field4563[13] = var8;
		var1.field4563[14] = var9;
	}

	void method2687(class400 var1, int var2, class124 var3, int var4) {
		float[] var6 = var3.method2336(this.field1462);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field1458[var2]) {
			class125 var10 = this.field1458[var2][6];
			class125 var11 = this.field1458[var2][7];
			class125 var12 = this.field1458[var2][8];
			if (null != var10) {
				var7 = var10.method2384(var4);
			}

			if (null != var11) {
				var8 = var11.method2384(var4);
			}

			if (var12 != null) {
				var9 = var12.method2384(var4);
			}
		}

		class400 var13 = class317.method6176();
		var13.method7422(var7, var8, var9);
		var1.method7424(var13);
		var13.method7431();
	}

	static final void method2707() {
		for (int var1 = 0; var1 < client.field1947; ++var1) {
			int var10002 = client.field1977[var1]--;
			if (client.field1977[var1] >= -10) {
				class37 var10 = client.field1757[var1];
				if (var10 == null) {
					class37 var10000 = (class37)null;
					var10 = class37.method481(class235.field2839, client.field1948[var1], 0);
					if (null == var10) {
						continue;
					}

					int[] var13 = client.field1977;
					var13[var1] += var10.method484();
					client.field1757[var1] = var10;
				}

				if (client.field1977[var1] < 0) {
					int var3;
					if (client.field1803[var1] != 0) {
						int var4 = (client.field1803[var1] & 255) * 128;
						int var5 = client.field1803[var1] >> 16 & 255;
						int var6 = 64 + var5 * 128 - class142.field1370.field1012;
						if (var6 < 0) {
							var6 = -var6;
						}

						int var7 = client.field1803[var1] >> 8 & 255;
						int var8 = var7 * 128 + 64 - class142.field1370.field948;
						if (var8 < 0) {
							var8 = -var8;
						}

						int var9 = var8 + var6 - 128;
						if (var9 > var4) {
							client.field1977[var1] = -100;
							continue;
						}

						if (var9 < 0) {
							var9 = 0;
						}

						var3 = (var4 - var9) * class186.field2040.method1868() / var4;
					} else {
						var3 = class186.field2040.method1788();
					}

					if (var3 > 0) {
						class32 var11 = var10.method483().method424(class25.field131);
						class42 var12 = class42.method725(var11, 100, var3);
						var12.method727(client.field1949[var1] - 1);
						class76.field694.method1017(var12);
					}

					client.field1977[var1] = -100;
				}
			} else {
				--client.field1947;

				for (int var2 = var1; var2 < client.field1947; ++var2) {
					client.field1948[var2] = client.field1948[var2 + 1];
					client.field1757[var2] = client.field1757[var2 + 1];
					client.field1949[var2] = client.field1949[var2 + 1];
					client.field1977[var2] = client.field1977[var2 + 1];
					client.field1803[var2] = client.field1803[var2 + 1];
				}

				--var1;
			}
		}

		if (client.field1946 && !class300.method2906()) {
			if (class186.field2040.method1787() != 0 && -1 != client.field1945) {
				class300.method502(class174.field1635, client.field1945, 0, class186.field2040.method1787(), false);
			}

			client.field1946 = false;
		}

	}
}
