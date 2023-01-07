import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "dj"
)
public class class223 implements class78 {
	@ObfInfo(
		owner = "dj",
		name = "k",
		desc = "Lep;"
	)
	static class429 field1922;
	@ObfInfo(
		owner = "dj",
		name = "ba",
		desc = "I"
	)
	static int field1919;
	@ObfInfo(
		owner = "dj",
		name = "q",
		desc = "Ldj;"
	)
	static final class223 field1912;
	@ObfInfo(
		owner = "dj",
		name = "e",
		desc = "Ldj;"
	)
	static final class223 field1913;
	@ObfInfo(
		owner = "dj",
		name = "x",
		desc = "Ldj;"
	)
	static final class223 field1914;
	@ObfInfo(
		owner = "dj",
		name = "h",
		desc = "Ldj;"
	)
	static final class223 field1915;
	@ObfInfo(
		owner = "dj",
		name = "m",
		desc = "Ldj;"
	)
	static final class223 field1916;
	@ObfInfo(
		owner = "dj",
		name = "v",
		desc = "Ldj;"
	)
	static final class223 field1917;
	@ObfInfo(
		owner = "dj",
		name = "f",
		desc = "I"
	)
	final int field1918;
	@ObfInfo(
		owner = "dj",
		name = "r",
		desc = "I"
	)
	final int field1920;
	@ObfInfo(
		owner = "dj",
		name = "u",
		desc = "I"
	)
	final int field1921;

	static {
		field1915 = new class223(0, 0, (String)null, 0);
		field1913 = new class223(1, 1, (String)null, 9);
		field1917 = new class223(2, 2, (String)null, 3);
		field1914 = new class223(3, 3, (String)null, 6);
		field1916 = new class223(4, 4, (String)null, 1);
		field1912 = new class223(5, 5, (String)null, 3);
	}

	@ObfInfo(
		owner = "dj",
		name = "<init>",
		desc = "(IILjava/lang/String;I)V"
	)
	class223(int var1, int var2, String var3, int var4) {
		this.field1918 = var1;
		this.field1920 = var2;
		this.field1921 = var4;
	}

	@ObfInfo(
		owner = "dj",
		name = "v",
		desc = "(I)I"
	)
	int method987() {
		return this.field1921;
	}

	@ObfInfo(
		owner = "dj",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field1920;
	}

	@ObfInfo(
		owner = "dj",
		name = "h",
		desc = "(Lly;Lly;I)V"
	)
	public static void method988(class274 var0, class274 var1) {
		class406.field3401 = var0;
		class406.field3393 = var1;
	}

	@ObfInfo(
		owner = "dj",
		name = "ax",
		desc = "(ILbm;ZI)I"
	)
	static int method989(int var0, class461 var1, boolean var2) {
		int var4;
		if (var0 == ScriptOpcodes._6600) {
			var4 = class347.field2878;
			int var10 = class312.field2465 + (class113.field846.field2672 >> 7);
			int var6 = class325.field2575 + (class113.field846.field2608 >> 7);
			client.method197().method1289(var4, var10, var6, true);
			return 1;
		} else {
			class46 var12;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var4 = class386.field3248[--class161.field1227];
				String var17 = "";
				var12 = client.method197().method1301(var4);
				if (var12 != null) {
					var17 = var12.method239();
				}

				class386.field3249[++class386.field3250 - 1] = var17;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var4 = class386.field3248[--class161.field1227];
				client.method197().method1290(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				class386.field3248[++class161.field1227 - 1] = client.method197().method1299();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var4 = class386.field3248[--class161.field1227];
				client.method197().method1296(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				class386.field3248[++class161.field1227 - 1] = client.method197().method1333() ? 1 : 0;
				return 1;
			} else {
				class464 var16;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var16 = new class464(class386.field3248[--class161.field1227]);
					client.method197().method1325(var16.field3852, var16.field3853);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var16 = new class464(class386.field3248[--class161.field1227]);
					client.method197().method1303(var16.field3852, var16.field3853);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var16 = new class464(class386.field3248[--class161.field1227]);
					client.method197().method1302(var16.field3851, var16.field3852, var16.field3853);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var16 = new class464(class386.field3248[--class161.field1227]);
					client.method197().method1328(var16.field3851, var16.field3852, var16.field3853);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					class386.field3248[++class161.field1227 - 1] = client.method197().method1326();
					class386.field3248[++class161.field1227 - 1] = client.method197().method1304();
					return 1;
				} else {
					class46 var14;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var4 = class386.field3248[--class161.field1227];
						var14 = client.method197().method1301(var4);
						if (null == var14) {
							class386.field3248[++class161.field1227 - 1] = 0;
						} else {
							class386.field3248[++class161.field1227 - 1] = var14.method228().method2278();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var4 = class386.field3248[--class161.field1227];
						var14 = client.method197().method1301(var4);
						if (var14 == null) {
							class386.field3248[++class161.field1227 - 1] = 0;
							class386.field3248[++class161.field1227 - 1] = 0;
						} else {
							class386.field3248[++class161.field1227 - 1] = (var14.method230() - var14.method236() + 1) * 64;
							class386.field3248[++class161.field1227 - 1] = (var14.method232() - var14.method231() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var4 = class386.field3248[--class161.field1227];
						var14 = client.method197().method1301(var4);
						if (null == var14) {
							class386.field3248[++class161.field1227 - 1] = 0;
							class386.field3248[++class161.field1227 - 1] = 0;
							class386.field3248[++class161.field1227 - 1] = 0;
							class386.field3248[++class161.field1227 - 1] = 0;
						} else {
							class386.field3248[++class161.field1227 - 1] = var14.method236() * 64;
							class386.field3248[++class161.field1227 - 1] = var14.method231() * 64;
							class386.field3248[++class161.field1227 - 1] = var14.method230() * 64 + 64 - 1;
							class386.field3248[++class161.field1227 - 1] = var14.method232() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var4 = class386.field3248[--class161.field1227];
						var14 = client.method197().method1301(var4);
						if (null == var14) {
							class386.field3248[++class161.field1227 - 1] = -1;
						} else {
							class386.field3248[++class161.field1227 - 1] = var14.method229();
						}

						return 1;
					} else if (var0 == ScriptOpcodes._6615) {
						var16 = client.method197().method1336();
						if (null == var16) {
							class386.field3248[++class161.field1227 - 1] = -1;
							class386.field3248[++class161.field1227 - 1] = -1;
						} else {
							class386.field3248[++class161.field1227 - 1] = var16.field3852;
							class386.field3248[++class161.field1227 - 1] = var16.field3853;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						class386.field3248[++class161.field1227 - 1] = client.method197().method1331();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var16 = new class464(class386.field3248[--class161.field1227]);
						var14 = client.method197().method1291();
						if (null == var14) {
							class386.field3248[++class161.field1227 - 1] = -1;
							class386.field3248[++class161.field1227 - 1] = -1;
							return 1;
						} else {
							int[] var15 = var14.method237(var16.field3851, var16.field3852, var16.field3853);
							if (null == var15) {
								class386.field3248[++class161.field1227 - 1] = -1;
								class386.field3248[++class161.field1227 - 1] = -1;
							} else {
								class386.field3248[++class161.field1227 - 1] = var15[0];
								class386.field3248[++class161.field1227 - 1] = var15[1];
							}

							return 1;
						}
					} else {
						class464 var8;
						if (var0 == ScriptOpcodes._6618) {
							var16 = new class464(class386.field3248[--class161.field1227]);
							var14 = client.method197().method1291();
							if (var14 == null) {
								class386.field3248[++class161.field1227 - 1] = -1;
								class386.field3248[++class161.field1227 - 1] = -1;
								return 1;
							} else {
								var8 = var14.method223(var16.field3852, var16.field3853);
								if (var8 == null) {
									class386.field3248[++class161.field1227 - 1] = -1;
								} else {
									class386.field3248[++class161.field1227 - 1] = var8.method2278();
								}

								return 1;
							}
						} else {
							class464 var13;
							if (var0 == ScriptOpcodes._6619) {
								class161.field1227 -= 2;
								var4 = class386.field3248[class161.field1227];
								var13 = new class464(class386.field3248[1 + class161.field1227]);
								class483.method2376(var4, var13, false);
								return 1;
							} else if (var0 == ScriptOpcodes._6620) {
								class161.field1227 -= 2;
								var4 = class386.field3248[class161.field1227];
								var13 = new class464(class386.field3248[class161.field1227 + 1]);
								class483.method2376(var4, var13, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class161.field1227 -= 2;
								var4 = class386.field3248[class161.field1227];
								var13 = new class464(class386.field3248[1 + class161.field1227]);
								var12 = client.method197().method1301(var4);
								if (null == var12) {
									class386.field3248[++class161.field1227 - 1] = 0;
									return 1;
								} else {
									class386.field3248[++class161.field1227 - 1] = var12.method240(var13.field3851, var13.field3852, var13.field3853) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								class386.field3248[++class161.field1227 - 1] = client.method197().method1305();
								class386.field3248[++class161.field1227 - 1] = client.method197().method1306();
								return 1;
							} else if (var0 == ScriptOpcodes._6623) {
								var16 = new class464(class386.field3248[--class161.field1227]);
								var14 = client.method197().method1288(var16.field3851, var16.field3852, var16.field3853);
								if (null == var14) {
									class386.field3248[++class161.field1227 - 1] = -1;
								} else {
									class386.field3248[++class161.field1227 - 1] = var14.method225();
								}

								return 1;
							} else if (var0 == ScriptOpcodes._6624) {
								client.method197().method1307(class386.field3248[--class161.field1227]);
								return 1;
							} else if (var0 == ScriptOpcodes._6625) {
								client.method197().method1308();
								return 1;
							} else if (var0 == ScriptOpcodes._6626) {
								client.method197().method1329(class386.field3248[--class161.field1227]);
								return 1;
							} else if (var0 == ScriptOpcodes._6627) {
								client.method197().method1335();
								return 1;
							} else {
								boolean var11;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var11 = class386.field3248[--class161.field1227] == 1;
									client.method197().method1309(var11);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var4 = class386.field3248[--class161.field1227];
									client.method197().method1310(var4);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var4 = class386.field3248[--class161.field1227];
									client.method197().method1311(var4);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									client.method197().method1312();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var11 = class386.field3248[--class161.field1227] == 1;
									client.method197().method1284(var11);
									return 1;
								} else {
									boolean var5;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class161.field1227 -= 2;
										var4 = class386.field3248[class161.field1227];
										var5 = class386.field3248[class161.field1227 + 1] == 1;
										client.method197().method1314(var4, var5);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class161.field1227 -= 2;
										var4 = class386.field3248[class161.field1227];
										var5 = 1 == class386.field3248[1 + class161.field1227];
										client.method197().method1315(var4, var5);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										class386.field3248[++class161.field1227 - 1] = client.method197().method1316() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var4 = class386.field3248[--class161.field1227];
										class386.field3248[++class161.field1227 - 1] = client.method197().method1337(var4) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var4 = class386.field3248[--class161.field1227];
										class386.field3248[++class161.field1227 - 1] = client.method197().method1327(var4) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes._6638) {
										class161.field1227 -= 2;
										var4 = class386.field3248[class161.field1227];
										var13 = new class464(class386.field3248[class161.field1227 + 1]);
										var8 = client.method197().method1320(var4, var13);
										if (null == var8) {
											class386.field3248[++class161.field1227 - 1] = -1;
										} else {
											class386.field3248[++class161.field1227 - 1] = var8.method2278();
										}

										return 1;
									} else {
										class389 var9;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var9 = client.method197().method1321();
											if (null == var9) {
												class386.field3248[++class161.field1227 - 1] = -1;
												class386.field3248[++class161.field1227 - 1] = -1;
											} else {
												class386.field3248[++class161.field1227 - 1] = var9.method1910();
												class386.field3248[++class161.field1227 - 1] = var9.field3277.method2278();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var9 = client.method197().method1330();
											if (var9 == null) {
												class386.field3248[++class161.field1227 - 1] = -1;
												class386.field3248[++class161.field1227 - 1] = -1;
											} else {
												class386.field3248[++class161.field1227 - 1] = var9.method1910();
												class386.field3248[++class161.field1227 - 1] = var9.field3277.method2278();
											}

											return 1;
										} else {
											class396 var7;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var4 = class386.field3248[--class161.field1227];
												var7 = class25.method100(var4);
												if (var7.field3318 == null) {
													class386.field3249[++class386.field3250 - 1] = "";
												} else {
													class386.field3249[++class386.field3250 - 1] = var7.field3318;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var4 = class386.field3248[--class161.field1227];
												var7 = class25.method100(var4);
												class386.field3248[++class161.field1227 - 1] = var7.field3321;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var4 = class386.field3248[--class161.field1227];
												var7 = class25.method100(var4);
												if (var7 == null) {
													class386.field3248[++class161.field1227 - 1] = -1;
												} else {
													class386.field3248[++class161.field1227 - 1] = var7.field3334;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var4 = class386.field3248[--class161.field1227];
												var7 = class25.method100(var4);
												if (var7 == null) {
													class386.field3248[++class161.field1227 - 1] = -1;
												} else {
													class386.field3248[++class161.field1227 - 1] = var7.field3311;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												class386.field3248[++class161.field1227 - 1] = class375.field3181.field3420;
												return 1;
											} else if (var0 == ScriptOpcodes._6698) {
												class386.field3248[++class161.field1227 - 1] = class375.field3181.field3418.method2278();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												class386.field3248[++class161.field1227 - 1] = class375.field3181.field3419.method2278();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
