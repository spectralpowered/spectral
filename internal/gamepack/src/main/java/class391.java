import io.spectralpowered.ObfInfo;
import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

@ObfInfo(
	name = "s"
)
class class391 implements SSLSession {
	@ObfInfo(
		owner = "s",
		name = "hw",
		desc = "I"
	)
	static int field3279;
	@ObfInfo(
		owner = "s",
		name = "ge",
		desc = "Ljava/lang/String;"
	)
	static String field3280;
	// $FF: synthetic field
	@ObfInfo(
		owner = "s",
		name = "this$1",
		desc = "Li;"
	)
	final class286 this$1;

	@ObfInfo(
		owner = "s",
		name = "<init>",
		desc = "(Li;)V"
	)
	class391(class286 var1) {
		this.this$1 = var1;
	}

	@ObfInfo(
		owner = "s",
		name = "getApplicationBufferSize",
		desc = "()I"
	)
	public int getApplicationBufferSize() {
		return 0;
	}

	@ObfInfo(
		owner = "s",
		name = "getCipherSuite",
		desc = "()Ljava/lang/String;"
	)
	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getCreationTime",
		desc = "()J"
	)
	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getId",
		desc = "()[B"
	)
	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getLastAccessedTime",
		desc = "()J"
	)
	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getLocalCertificates",
		desc = "()[Ljava/security/cert/Certificate;"
	)
	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getLocalPrincipal",
		desc = "()Ljava/security/Principal;"
	)
	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getPacketBufferSize",
		desc = "()I"
	)
	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getPeerCertificateChain",
		desc = "()[Ljavax/security/cert/X509Certificate;"
	)
	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfInfo(
		owner = "s",
		name = "getPeerCertificates",
		desc = "()[Ljava/security/cert/Certificate;"
	)
	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field2365;
	}

	@ObfInfo(
		owner = "s",
		name = "getPeerHost",
		desc = "()Ljava/lang/String;"
	)
	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getPeerPort",
		desc = "()I"
	)
	public int getPeerPort() {
		return 0;
	}

	@ObfInfo(
		owner = "s",
		name = "getPeerPrincipal",
		desc = "()Ljava/security/Principal;"
	)
	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfInfo(
		owner = "s",
		name = "getProtocol",
		desc = "()Ljava/lang/String;"
	)
	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getSessionContext",
		desc = "()Ljavax/net/ssl/SSLSessionContext;"
	)
	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getValue",
		desc = "(Ljava/lang/String;)Ljava/lang/Object;"
	)
	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "getValueNames",
		desc = "()[Ljava/lang/String;"
	)
	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "invalidate",
		desc = "()V"
	)
	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "isValid",
		desc = "()Z"
	)
	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "putValue",
		desc = "(Ljava/lang/String;Ljava/lang/Object;)V"
	)
	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "removeValue",
		desc = "(Ljava/lang/String;)V"
	)
	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(
		owner = "s",
		name = "u",
		desc = "(S)V"
	)
	public static final void method1916() {
		class105.field809 = false;
		class105.field816 = 0;
	}

	@ObfInfo(
		owner = "s",
		name = "kl",
		desc = "(IIIII)V"
	)
	static final void method1915(int var0, int var1, int var2, int var3) {
		if (0 == client.field386 && !client.field388) {
			class156.method721(class177.field1491, "", 23, 0, var0 - var2, var1 - var3);
		}

		long var5 = -1L;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = class105.field816;
			if (var9 >= var11) {
				if (-1L != var5) {
					var9 = class49.method251(var5);
					int var10 = (int)(var5 >>> 7 & 127L);
					class380 var12 = client.field347[client.field359];
					class346.method1753(var12, client.field359, var9, var10);
				}

				return;
			}

			long var27 = class105.field814[var9];
			if (var7 != var27) {
				label306: {
					var7 = var27;
					int var16 = class306.method1492(var9);
					long var19 = class105.field814[var9];
					int var18 = (int)(var19 >>> 7 & 127L);
					var18 = var18;
					int var29 = class104.method417(var9);
					int var20 = class208.method905(var9);
					int var24;
					if (var29 == 2 && class408.field3415.method1607(class347.field2878, var16, var18, var27) >= 0) {
						class87 var21 = class85.method356(var20);
						if (var21.field745 != null) {
							var21 = var21.method372();
						}

						if (null == var21) {
							break label306;
						}

						class138 var22 = null;

						for (class138 var23 = (class138)client.field450.method646(); var23 != null; var23 = (class138)client.field450.method648()) {
							if (class347.field2878 == var23.field1122 && var16 == var23.field1118 && var18 == var23.field1129 && var23.field1125 == var20) {
								var22 = var23;
								break;
							}
						}

						if (1 == client.field386) {
							class156.method721(class177.field1486, client.field483 + " " + class442.field3664 + " " + class238.method1032(65535) + var21.field715, 1, var20, var16, var18);
						} else if (client.field388) {
							if ((class32.field177 & 4) == 4) {
								class156.method721(client.field391, client.field510 + " " + class442.field3664 + " " + class238.method1032(65535) + var21.field715, 2, var20, var16, var18);
							}
						} else {
							String[] var37 = var21.field732;
							if (var37 != null) {
								for (var24 = 4; var24 >= 0; --var24) {
									if ((null == var22 || var22.method635(var24)) && var37[var24] != null) {
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

										class156.method721(var37[var24], class238.method1032(65535) + var21.field715, var32, var20, var16, var18);
									}
								}
							}

							class156.method721(class177.field1538, class238.method1032(65535) + var21.field715, 1002, var21.field712, var16, var18);
						}
					}

					class380 var25;
					int var30;
					class267 var38;
					int[] var39;
					if (var29 == 1) {
						class267 var33 = client.field465[var20];
						if (null == var33) {
							break label306;
						}

						if (1 == var33.field2213.field3470 && 64 == (var33.field2672 & 127) && (var33.field2608 & 127) == 64) {
							for (var30 = 0; var30 < client.field275; ++var30) {
								var38 = client.field465[client.field431[var30]];
								if (null != var38 && var38 != var33 && 1 == var38.field2213.field3470 && var38.field2672 == var33.field2672 && var33.field2608 == var38.field2608) {
									class408.method2000(var38, client.field431[var30], var16, var18);
								}
							}

							var30 = class268.field2221;
							var39 = class268.field2220;

							for (var24 = 0; var24 < var30; ++var24) {
								var25 = client.field347[var39[var24]];
								if (var25 != null && var25.field2672 == var33.field2672 && var33.field2608 == var25.field2608) {
									class346.method1753(var25, var39[var24], var16, var18);
								}
							}
						}

						class408.method2000(var33, var20, var16, var18);
					}

					if (var29 == 0) {
						class380 var34 = client.field347[var20];
						if (null == var34) {
							break label306;
						}

						if (64 == (var34.field2672 & 127) && (var34.field2608 & 127) == 64) {
							for (var30 = 0; var30 < client.field275; ++var30) {
								var38 = client.field465[client.field431[var30]];
								if (null != var38 && var38.field2213.field3470 == 1 && var34.field2672 == var38.field2672 && var34.field2608 == var38.field2608) {
									class408.method2000(var38, client.field431[var30], var16, var18);
								}
							}

							var30 = class268.field2221;
							var39 = class268.field2220;

							for (var24 = 0; var24 < var30; ++var24) {
								var25 = client.field347[var39[var24]];
								if (var25 != null && var25 != var34 && var34.field2672 == var25.field2672 && var25.field2608 == var34.field2608) {
									class346.method1753(var25, var39[var24], var16, var18);
								}
							}
						}

						if (client.field359 != var20) {
							class346.method1753(var34, var20, var16, var18);
						} else {
							var5 = var27;
						}
					}

					if (var29 == 3) {
						class141 var35 = client.field360[class347.field2878][var16][var18];
						if (null != var35) {
							for (class402 var36 = (class402)var35.method647(); var36 != null; var36 = (class402)var35.method650()) {
								class263 var40 = class423.method2062(var36.field3387);
								if (1 == client.field386) {
									class156.method721(class177.field1486, client.field483 + " " + class442.field3664 + " " + class238.method1032(16748608) + var40.field2147, 16, var36.field3387, var16, var18);
								} else if (client.field388) {
									if ((class32.field177 & 1) == 1) {
										class156.method721(client.field391, client.field510 + " " + class442.field3664 + " " + class238.method1032(16748608) + var40.field2147, 17, var36.field3387, var16, var18);
									}
								} else {
									String[] var31 = var40.field2145;

									for (int var41 = 4; var41 >= 0; --var41) {
										if (var36.method1986(var41)) {
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

												class156.method721(var31[var41], class238.method1032(16748608) + var40.field2147, var26, var36.field3387, var16, var18);
											} else if (var41 == 2) {
												class156.method721(class177.field1571, class238.method1032(16748608) + var40.field2147, 20, var36.field3387, var16, var18);
											}
										}
									}

									class156.method721(class177.field1538, class238.method1032(16748608) + var40.field2147, 1004, var36.field3387, var16, var18);
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
