import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

class class19 implements SSLSession {
	static int field113;
	static String field114;
	// $FF: synthetic field
	final class9 this$1;

	class19(class9 var1) {
		this.this$1 = var1;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field55;
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public int getPeerPort() {
		return 0;
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	static final void method251(int var0, int var1, int var2, int var3) {
		if (0 == client.field1855 && !client.field1857) {
			client.method1404(class321.field3922, "", 23, 0, var0 - var2, var1 - var3);
		}

		long var5 = -1L;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = class215.field2555;
			if (var9 >= var11) {
				if (-1L != var5) {
					var9 = class215.method2488(var5);
					int var10 = (int)(var5 >>> 7 & 127L);
					class88 var12 = client.field1816[client.field1828];
					class266.method5267(var12, client.field1828, var9, var10);
				}

				return;
			}

			long var27 = class215.field2552[var9];
			if (var7 != var27) {
				label369: {
					var7 = var27;
					int var16 = class215.method1969(var9);
					long var19 = class215.field2552[var9];
					int var18 = (int)(var19 >>> 7 & 127L);
					var18 = var18;
					int var29 = class215.method4973(var9);
					int var20 = class62.method1192(var9);
					int var24;
					if (var29 == 2 && class33.field194.method4275(class384.field4486, var16, var18, var27) >= 0) {
						class196 var21 = class165.method2780(var20);
						if (var21.field2204 != null) {
							var21 = var21.method3863();
						}

						if (null == var21) {
							break label369;
						}

						class91 var22 = null;

						for (class91 var23 = (class91)client.field1919.method6577(); var23 != null; var23 = (class91)client.field1919.method6579()) {
							if (class384.field4486 == var23.field867 && var16 == var23.field863 && var18 == var23.field875 && var23.field870 == var20) {
								var22 = var23;
								break;
							}
						}

						if (1 == client.field1855) {
							client.method1404(class321.field3917, client.field1952 + " " + class79.field728 + " " + class79.method2039(65535) + var21.field2173, 1, var20, var16, var18);
						} else if (client.field1857) {
							if ((class16.field99 & 4) == 4) {
								client.method1404(client.field1860, client.field1979 + " " + class79.field728 + " " + class79.method2039(65535) + var21.field2173, 2, var20, var16, var18);
							}
						} else {
							String[] var37 = var21.field2190;
							if (var37 != null) {
								for (var24 = 4; var24 >= 0; --var24) {
									if ((null == var22 || var22.method1962(var24)) && var37[var24] != null) {
										short var32 = 0;
										if (var24 == 0) {
											var32 = 3;
										}

										if (var24 == 1) {
											var32 = 4;
										}

										if (var24 == 2) {
											var32 = 5;
										}

										if (var24 == 3) {
											var32 = 6;
										}

										if (var24 == 4) {
											var32 = 1001;
										}

										client.method1404(var37[var24], class79.method2039(65535) + var21.field2173, var32, var20, var16, var18);
									}
								}
							}

							client.method1404(class321.field3969, class79.method2039(65535) + var21.field2173, 1002, var21.field2170, var16, var18);
						}
					}

					class88 var25;
					int var30;
					class85 var38;
					int[] var39;
					if (var29 == 1) {
						class85 var33 = client.field1934[var20];
						if (null == var33) {
							break label369;
						}

						if (1 == var33.field790.field2388 && 64 == (var33.field1012 & 127) && (var33.field948 & 127) == 64) {
							for (var30 = 0; var30 < client.field1744; ++var30) {
								var38 = client.field1934[client.field1900[var30]];
								if (null != var38 && var38 != var33 && 1 == var38.field790.field2388 && var38.field1012 == var33.field1012 && var33.field948 == var38.field948) {
									class33.method427(var38, client.field1900[var30], var16, var18);
								}
							}

							var30 = class87.field818;
							var39 = class87.field817;

							for (var24 = 0; var24 < var30; ++var24) {
								var25 = client.field1816[var39[var24]];
								if (var25 != null && var25.field1012 == var33.field1012 && var33.field948 == var25.field948) {
									class266.method5267(var25, var39[var24], var16, var18);
								}
							}
						}

						class33.method427(var33, var20, var16, var18);
					}

					if (var29 == 0) {
						class88 var34 = client.field1816[var20];
						if (null == var34) {
							break label369;
						}

						if (64 == (var34.field1012 & 127) && (var34.field948 & 127) == 64) {
							for (var30 = 0; var30 < client.field1744; ++var30) {
								var38 = client.field1934[client.field1900[var30]];
								if (null != var38 && var38.field790.field2388 == 1 && var34.field1012 == var38.field1012 && var34.field948 == var38.field948) {
									class33.method427(var38, client.field1900[var30], var16, var18);
								}
							}

							var30 = class87.field818;
							var39 = class87.field817;

							for (var24 = 0; var24 < var30; ++var24) {
								var25 = client.field1816[var39[var24]];
								if (var25 != null && var25 != var34 && var34.field1012 == var25.field1012 && var25.field948 == var34.field948) {
									class266.method5267(var25, var39[var24], var16, var18);
								}
							}
						}

						if (client.field1828 != var20) {
							class266.method5267(var34, var20, var16, var18);
						} else {
							var5 = var27;
						}
					}

					if (var29 == 3) {
						class355 var35 = client.field1829[class384.field4486][var16][var18];
						if (null != var35) {
							for (class96 var36 = (class96)var35.method6578(); var36 != null; var36 = (class96)var35.method6590()) {
								class200 var40 = class208.method4105(var36.field937);
								if (1 == client.field1855) {
									client.method1404(class321.field3917, client.field1952 + " " + class79.field728 + " " + class79.method2039(16748608) + var40.field2259, 16, var36.field937, var16, var18);
								} else if (client.field1857) {
									if ((class16.field99 & 1) == 1) {
										client.method1404(client.field1860, client.field1979 + " " + class79.field728 + " " + class79.method2039(16748608) + var40.field2259, 17, var36.field937, var16, var18);
									}
								} else {
									String[] var31 = var40.field2257;

									for (int var41 = 4; var41 >= 0; --var41) {
										if (var36.method2027(var41)) {
											if (var31 != null && null != var31[var41]) {
												byte var26 = 0;
												if (var41 == 0) {
													var26 = 18;
												}

												if (var41 == 1) {
													var26 = 19;
												}

												if (var41 == 2) {
													var26 = 20;
												}

												if (var41 == 3) {
													var26 = 21;
												}

												if (var41 == 4) {
													var26 = 22;
												}

												client.method1404(var31[var41], class79.method2039(16748608) + var40.field2259, var26, var36.field937, var16, var18);
											} else if (var41 == 2) {
												client.method1404(class321.field4002, class79.method2039(16748608) + var40.field2259, 20, var36.field937, var16, var18);
											}
										}
									}

									client.method1404(class321.field3969, class79.method2039(16748608) + var40.field2259, 1004, var36.field937, var16, var18);
								}
							}
						}
					}
				}
			}

			++var9;
		}
	}
}
