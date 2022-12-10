import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class116 implements Runnable {
	int field1165;
	Queue field1167;
	final Thread field1168;
	volatile boolean field1166;

	class116(int var1) {
		this.field1167 = new LinkedList();
		this.field1168 = new Thread(this);
		this.field1168.setPriority(1);
		this.field1168.start();
		this.field1165 = var1;
	}

	public void run() {
		while (!this.field1166) {
			try {
				class117 var1;
				synchronized(this) {
					var1 = (class117)this.field1167.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.method2210(var1);
			} catch (Exception var7) {
				class150.method2660((String)null, var7);
			}
		}

	}

	void method2211(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1165);
	}

	void method2218(URLConnection var1, class117 var2) {
		DataInputStream var4 = null;

		try {
			int var6 = var1.getContentLength();
			var4 = new DataInputStream(var1.getInputStream());
			byte[] var5;
			if (var6 >= 0) {
				var5 = new byte[var6];
				var4.readFully(var5);
			} else {
				var5 = new byte[0];
				byte[] var7 = class370.method1620(5000);

				byte[] var9;
				for (int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
					var9 = new byte[var8 + var5.length];
					System.arraycopy(var5, 0, var9, 0, var5.length);
					System.arraycopy(var7, 0, var9, var5.length, var8);
				}

				class202.method3992(var7);
			}

			var2.field1172 = var5;
		} catch (IOException var11) {
		}

		if (null != var4) {
			try {
				var4.close();
			} catch (IOException var10) {
			}
		}

	}

	public class117 method2213(URL var1) {
		class117 var3 = new class117(var1);
		synchronized(this) {
			this.field1167.add(var3);
			this.notify();
			return var3;
		}
	}

	public void method2229() {
		this.field1166 = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.field1168.join();
		} catch (InterruptedException var5) {
		}

	}

	static final void method2236(int var0, int var1, int var2, int var3, int var4, int var5, class211 var6, class205 var7) {
		if (!client.field1743 || 0 != (class84.field773[0][var1][var2] & 2) || 0 == (class84.field773[var0][var1][var2] & 16)) {
			if (var0 < class84.field766) {
				class84.field766 = var0;
			}

			class196 var9 = class165.method2780(var3);
			int var10;
			int var11;
			if (var4 != 1 && var4 != 3) {
				var10 = var9.field2178;
				var11 = var9.field2179;
			} else {
				var10 = var9.field2179;
				var11 = var9.field2178;
			}

			int var12;
			int var13;
			if (var10 + var1 <= 104) {
				var12 = var1 + (var10 >> 1);
				var13 = var1 + (var10 + 1 >> 1);
			} else {
				var12 = var1;
				var13 = var1 + 1;
			}

			int var14;
			int var15;
			if (var11 + var2 <= 104) {
				var14 = var2 + (var11 >> 1);
				var15 = (var11 + 1 >> 1) + var2;
			} else {
				var14 = var2;
				var15 = var2 + 1;
			}

			int[][] var16 = class84.field765[var0];
			int var17 = var16[var12][var15] + var16[var13][var14] + var16[var12][var14] + var16[var13][var15] >> 2;
			int var18 = (var1 << 7) + (var10 << 6);
			int var19 = (var2 << 7) + (var11 << 6);
			long var20 = class40.method601(var1, var2, 2, 0 == var9.field2182, var3);
			int var22 = (var4 << 6) + var5;
			if (1 == var9.field2203) {
				var22 += 256;
			}

			int var24;
			int var25;
			if (var9.method3830()) {
				class70 var23 = new class70();
				var23.field600 = var0;
				var23.field596 = var1 * 128;
				var23.field594 = var2 * 128;
				var24 = var9.field2178;
				var25 = var9.field2179;
				if (var4 == 1 || var4 == 3) {
					var24 = var9.field2179;
					var25 = var9.field2178;
				}

				var23.field597 = (var24 + var1) * 128;
				var23.field599 = (var25 + var2) * 128;
				var23.field601 = var9.field2211;
				var23.field603 = var9.field2192 * 128;
				var23.field598 = var9.field2209;
				var23.field595 = var9.field2210;
				var23.field605 = var9.field2171;
				if (null != var9.field2204) {
					var23.field608 = var9;
					var23.method1397();
				}

				class70.field604.method6572(var23);
				if (null != var23.field605) {
					var23.field606 = var23.field598 + (int)(Math.random() * (double)(var23.field595 - var23.field598));
				}
			}

			Object var35;
			if (var5 == 22) {
				if (!client.field1743 || var9.field2182 != 0 || var9.field2175 == 1 || var9.field2201) {
					if (-1 == var9.field2186 && var9.field2204 == null) {
						var35 = var9.method3823(22, var4, var16, var18, var17, var19);
					} else {
						var35 = new class63(var3, 22, var4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
					}

					var6.method4158(var0, var1, var2, var17, (class226)var35, var20, var22);
					if (1 == var9.field2175 && var7 != null) {
						var7.method4031(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) {
				int[] var10000;
				if (var5 >= 12) {
					if (var9.field2186 == -1 && var9.field2204 == null) {
						var35 = var9.method3823(var5, var4, var16, var18, var17, var19);
					} else {
						var35 = new class63(var3, var5, var4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
					}

					var6.method4162(var0, var1, var2, var17, 1, 1, (class226)var35, 0, var20, var22);
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
						var10000 = class171.field1618[var0][var1];
						var10000[var2] |= 2340;
					}

					if (0 != var9.field2175 && null != var7) {
						var7.method4063(var1, var2, var10, var11, var9.field2188);
					}

				} else if (var5 == 0) {
					if (var9.field2186 == -1 && var9.field2204 == null) {
						var35 = var9.method3823(0, var4, var16, var18, var17, var19);
					} else {
						var35 = new class63(var3, 0, var4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
					}

					var6.method4160(var0, var1, var2, var17, (class226)var35, (class226)null, class84.field771[var4], 0, var20, var22);
					if (var4 == 0) {
						if (var9.field2208) {
							class26.field141[var0][var1][var2] = 50;
							class26.field141[var0][var1][var2 + 1] = 50;
						}

						if (var9.field2199) {
							var10000 = class171.field1618[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var9.field2208) {
							class26.field141[var0][var1][var2 + 1] = 50;
							class26.field141[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var9.field2199) {
							var10000 = class171.field1618[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) {
						if (var9.field2208) {
							class26.field141[var0][var1 + 1][var2] = 50;
							class26.field141[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var9.field2199) {
							var10000 = class171.field1618[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var9.field2208) {
							class26.field141[var0][var1][var2] = 50;
							class26.field141[var0][var1 + 1][var2] = 50;
						}

						if (var9.field2199) {
							var10000 = class171.field1618[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (0 != var9.field2175 && var7 != null) {
						var7.method4028(var1, var2, var5, var4, var9.field2188);
					}

					if (var9.field2187 != 16) {
						var6.method4168(var0, var1, var2, var9.field2187);
					}

				} else if (var5 == 1) {
					if (-1 == var9.field2186 && var9.field2204 == null) {
						var35 = var9.method3823(1, var4, var16, var18, var17, var19);
					} else {
						var35 = new class63(var3, 1, var4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
					}

					var6.method4160(var0, var1, var2, var17, (class226)var35, (class226)null, class84.field775[var4], 0, var20, var22);
					if (var9.field2208) {
						if (var4 == 0) {
							class26.field141[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) {
							class26.field141[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) {
							class26.field141[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) {
							class26.field141[var0][var1][var2] = 50;
						}
					}

					if (0 != var9.field2175 && null != var7) {
						var7.method4028(var1, var2, var5, var4, var9.field2188);
					}

				} else {
					int var29;
					if (var5 == 2) {
						var29 = var4 + 1 & 3;
						Object var30;
						Object var31;
						if (-1 == var9.field2186 && null == var9.field2204) {
							var30 = var9.method3823(2, var4 + 4, var16, var18, var17, var19);
							var31 = var9.method3823(2, var29, var16, var18, var17, var19);
						} else {
							var30 = new class63(var3, 2, var4 + 4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
							var31 = new class63(var3, 2, var29, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
						}

						var6.method4160(var0, var1, var2, var17, (class226)var30, (class226)var31, class84.field771[var4], class84.field771[var29], var20, var22);
						if (var9.field2199) {
							if (var4 == 0) {
								var10000 = class171.field1618[var0][var1];
								var10000[var2] |= 585;
								var10000 = class171.field1618[var0][var1];
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) {
								var10000 = class171.field1618[var0][var1];
								var10000[var2 + 1] |= 1170;
								var10000 = class171.field1618[var0][var1 + 1];
								var10000[var2] |= 585;
							} else if (var4 == 2) {
								var10000 = class171.field1618[var0][var1 + 1];
								var10000[var2] |= 585;
								var10000 = class171.field1618[var0][var1];
								var10000[var2] |= 1170;
							} else if (var4 == 3) {
								var10000 = class171.field1618[var0][var1];
								var10000[var2] |= 1170;
								var10000 = class171.field1618[var0][var1];
								var10000[var2] |= 585;
							}
						}

						if (var9.field2175 != 0 && null != var7) {
							var7.method4028(var1, var2, var5, var4, var9.field2188);
						}

						if (var9.field2187 != 16) {
							var6.method4168(var0, var1, var2, var9.field2187);
						}

					} else if (var5 == 3) {
						if (-1 == var9.field2186 && null == var9.field2204) {
							var35 = var9.method3823(3, var4, var16, var18, var17, var19);
						} else {
							var35 = new class63(var3, 3, var4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
						}

						var6.method4160(var0, var1, var2, var17, (class226)var35, (class226)null, class84.field775[var4], 0, var20, var22);
						if (var9.field2208) {
							if (var4 == 0) {
								class26.field141[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class26.field141[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class26.field141[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class26.field141[var0][var1][var2] = 50;
							}
						}

						if (0 != var9.field2175 && var7 != null) {
							var7.method4028(var1, var2, var5, var4, var9.field2188);
						}

					} else if (var5 == 9) {
						if (var9.field2186 == -1 && var9.field2204 == null) {
							var35 = var9.method3823(var5, var4, var16, var18, var17, var19);
						} else {
							var35 = new class63(var3, var5, var4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
						}

						var6.method4162(var0, var1, var2, var17, 1, 1, (class226)var35, 0, var20, var22);
						if (0 != var9.field2175 && null != var7) {
							var7.method4063(var1, var2, var10, var11, var9.field2188);
						}

						if (16 != var9.field2187) {
							var6.method4168(var0, var1, var2, var9.field2187);
						}

					} else if (var5 == 4) {
						if (var9.field2186 == -1 && var9.field2204 == null) {
							var35 = var9.method3823(4, var4, var16, var18, var17, var19);
						} else {
							var35 = new class63(var3, 4, var4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
						}

						var6.method4161(var0, var1, var2, var17, (class226)var35, (class226)null, class84.field771[var4], 0, 0, 0, var20, var22);
					} else {
						long var32;
						Object var34;
						if (var5 == 5) {
							var29 = 16;
							var32 = var6.method4331(var0, var1, var2);
							if (var32 != 0L) {
								var29 = class165.method2780(class215.method4664(var32)).field2187;
							}

							if (-1 == var9.field2186 && var9.field2204 == null) {
								var34 = var9.method3823(4, var4, var16, var18, var17, var19);
							} else {
								var34 = new class63(var3, 4, var4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
							}

							var6.method4161(var0, var1, var2, var17, (class226)var34, (class226)null, class84.field771[var4], 0, var29 * class84.field774[var4], var29 * class84.field768[var4], var20, var22);
						} else if (var5 == 6) {
							var29 = 8;
							var32 = var6.method4331(var0, var1, var2);
							if (0L != var32) {
								var29 = class165.method2780(class215.method4664(var32)).field2187 / 2;
							}

							if (-1 == var9.field2186 && var9.field2204 == null) {
								var34 = var9.method3823(4, var4 + 4, var16, var18, var17, var19);
							} else {
								var34 = new class63(var3, 4, var4 + 4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
							}

							var6.method4161(var0, var1, var2, var17, (class226)var34, (class226)null, 256, var4, var29 * class84.field776[var4], var29 * class84.field764[var4], var20, var22);
						} else if (var5 == 7) {
							var24 = var4 + 2 & 3;
							if (var9.field2186 == -1 && var9.field2204 == null) {
								var35 = var9.method3823(4, var24 + 4, var16, var18, var17, var19);
							} else {
								var35 = new class63(var3, 4, var24 + 4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
							}

							var6.method4161(var0, var1, var2, var17, (class226)var35, (class226)null, 256, var24, 0, 0, var20, var22);
						} else if (var5 == 8) {
							var29 = 8;
							var32 = var6.method4331(var0, var1, var2);
							if (0L != var32) {
								var29 = class165.method2780(class215.method4664(var32)).field2187 / 2;
							}

							int var28 = var4 + 2 & 3;
							Object var27;
							if (var9.field2186 == -1 && var9.field2204 == null) {
								var34 = var9.method3823(4, var4 + 4, var16, var18, var17, var19);
								var27 = var9.method3823(4, var28 + 4, var16, var18, var17, var19);
							} else {
								var34 = new class63(var3, 4, var4 + 4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
								var27 = new class63(var3, 4, var28 + 4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
							}

							var6.method4161(var0, var1, var2, var17, (class226)var34, (class226)var27, 256, var4, class84.field776[var4] * var29, var29 * class84.field764[var4], var20, var22);
						}
					}
				}
			} else {
				if (-1 == var9.field2186 && null == var9.field2204) {
					var35 = var9.method3823(10, var4, var16, var18, var17, var19);
				} else {
					var35 = new class63(var3, 10, var4, var0, var1, var2, var9.field2186, var9.field2195, (class226)null);
				}

				if (null != var35 && var6.method4162(var0, var1, var2, var17, var10, var11, (class226)var35, var5 == 11 ? 256 : 0, var20, var22) && var9.field2208) {
					var24 = 15;
					if (var35 instanceof class216) {
						var24 = ((class216)var35).method4387() / 4;
						if (var24 > 30) {
							var24 = 30;
						}
					}

					for (var25 = 0; var25 <= var10; ++var25) {
						for (int var26 = 0; var26 <= var11; ++var26) {
							if (var24 > class26.field141[var0][var1 + var25][var26 + var2]) {
								class26.field141[var0][var1 + var25][var2 + var26] = (byte)var24;
							}
						}
					}
				}

				if (0 != var9.field2175 && null != var7) {
					var7.method4063(var1, var2, var10, var11, var9.field2188);
				}

			}
		}
	}

	static void method2212(String var0) {
		class149.field1432 = var0;

		try {
			String var2 = class122.field1212.getParameter(Integer.toString(18));
			String var3 = class122.field1212.getParameter(Integer.toString(13));
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			if (var0.length() == 0) {
				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var4 = var4 + "; Expires=" + class296.method2763(class74.method1493() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			class30.method419(class122.field1212, "document.cookie=\"" + var4 + "\"");
		} catch (Throwable var5) {
		}

	}

	abstract void method2210(class117 var1) throws IOException;
}
