public class class114 implements class343 {
	static class146 field1157;
	static int field1153;
	static final class114 field1146;
	static final class114 field1147;
	static final class114 field1148;
	static final class114 field1149;
	static final class114 field1150;
	static final class114 field1151;
	final int field1152;
	final int field1154;
	final int field1155;

	static {
		field1149 = new class114(0, 0, (String)null, 0);
		field1147 = new class114(1, 1, (String)null, 9);
		field1151 = new class114(2, 2, (String)null, 3);
		field1148 = new class114(3, 3, (String)null, 6);
		field1150 = new class114(4, 4, (String)null, 1);
		field1146 = new class114(5, 5, (String)null, 3);
	}

	class114(int var1, int var2, String var3, int var4) {
		this.field1152 = var1;
		this.field1154 = var2;
		this.field1155 = var4;
	}

	static class114 method6618(int var0) {
		class114[] var2 = new class114[]{field1149, field1147, field1151, field1148, field1150, field1146};
		class114 var3 = (class114)class78.method1584(var2, var0);
		if (null == var3) {
			var3 = field1149;
		}

		return var3;
	}

	int method2187() {
		return this.field1155;
	}

	public int method6487() {
		return this.field1154;
	}

	static int method2199(int var0, class65 var1, boolean var2) {
		int var4;
		if (var0 == CS2Opcodes._6600) {
			var4 = class384.field4486;
			int var10 = class151.field1447 + (class142.field1370.field1012 >> 7);
			int var6 = class388.field4509 + (class142.field1370.field948 >> 7);
			client.method3499().method7685(var4, var10, var6, true);
			return 1;
		} else {
			class254 var12;
			if (var0 == CS2Opcodes.WORLDMAP_GETMAPNAME) {
				var4 = class69.field579[--class94.field920];
				String var17 = "";
				var12 = client.method3499().method7702(var4);
				if (var12 != null) {
					var17 = var12.method5015();
				}

				class69.field580[++class69.field581 - 1] = var17;
				return 1;
			} else if (var0 == CS2Opcodes.WORLDMAP_SETMAP) {
				var4 = class69.field579[--class94.field920];
				client.method3499().method7686(var4);
				return 1;
			} else if (var0 == CS2Opcodes.WORLDMAP_GETZOOM) {
				class69.field579[++class94.field920 - 1] = client.method3499().method7699();
				return 1;
			} else if (var0 == CS2Opcodes.WORLDMAP_SETZOOM) {
				var4 = class69.field579[--class94.field920];
				client.method3499().method7696(var4);
				return 1;
			} else if (var0 == CS2Opcodes.WORLDMAP_ISLOADED) {
				class69.field579[++class94.field920 - 1] = client.method3499().method7827() ? 1 : 0;
				return 1;
			} else {
				class311 var16;
				if (var0 == CS2Opcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var16 = new class311(class69.field579[--class94.field920]);
					client.method3499().method7762(var16.field3709, var16.field3710);
					return 1;
				} else if (var0 == CS2Opcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var16 = new class311(class69.field579[--class94.field920]);
					client.method3499().method7704(var16.field3709, var16.field3710);
					return 1;
				} else if (var0 == CS2Opcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var16 = new class311(class69.field579[--class94.field920]);
					client.method3499().method7703(var16.field3708, var16.field3709, var16.field3710);
					return 1;
				} else if (var0 == CS2Opcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var16 = new class311(class69.field579[--class94.field920]);
					client.method3499().method7790(var16.field3708, var16.field3709, var16.field3710);
					return 1;
				} else if (var0 == CS2Opcodes.WORLDMAP_GETDISPLAYPOSITION) {
					class69.field579[++class94.field920 - 1] = client.method3499().method7773();
					class69.field579[++class94.field920 - 1] = client.method3499().method7707();
					return 1;
				} else {
					class254 var14;
					if (var0 == CS2Opcodes.WORLDMAP_GETCONFIGORIGIN) {
						var4 = class69.field579[--class94.field920];
						var14 = client.method3499().method7702(var4);
						if (null == var14) {
							class69.field579[++class94.field920 - 1] = 0;
						} else {
							class69.field579[++class94.field920 - 1] = var14.method4986().method6132();
						}

						return 1;
					} else if (var0 == CS2Opcodes.WORLDMAP_GETCONFIGSIZE) {
						var4 = class69.field579[--class94.field920];
						var14 = client.method3499().method7702(var4);
						if (var14 == null) {
							class69.field579[++class94.field920 - 1] = 0;
							class69.field579[++class94.field920 - 1] = 0;
						} else {
							class69.field579[++class94.field920 - 1] = (var14.method4990() - var14.method5001() + 1) * 64;
							class69.field579[++class94.field920 - 1] = (var14.method4992() - var14.method4991() + 1) * 64;
						}

						return 1;
					} else if (var0 == CS2Opcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var4 = class69.field579[--class94.field920];
						var14 = client.method3499().method7702(var4);
						if (null == var14) {
							class69.field579[++class94.field920 - 1] = 0;
							class69.field579[++class94.field920 - 1] = 0;
							class69.field579[++class94.field920 - 1] = 0;
							class69.field579[++class94.field920 - 1] = 0;
						} else {
							class69.field579[++class94.field920 - 1] = var14.method5001() * 64;
							class69.field579[++class94.field920 - 1] = var14.method4991() * 64;
							class69.field579[++class94.field920 - 1] = var14.method4990() * 64 + 64 - 1;
							class69.field579[++class94.field920 - 1] = var14.method4992() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == CS2Opcodes.WORLDMAP_GETCONFIGZOOM) {
						var4 = class69.field579[--class94.field920];
						var14 = client.method3499().method7702(var4);
						if (null == var14) {
							class69.field579[++class94.field920 - 1] = -1;
						} else {
							class69.field579[++class94.field920 - 1] = var14.method4988();
						}

						return 1;
					} else if (var0 == CS2Opcodes._6615) {
						var16 = client.method3499().method7857();
						if (null == var16) {
							class69.field579[++class94.field920 - 1] = -1;
							class69.field579[++class94.field920 - 1] = -1;
						} else {
							class69.field579[++class94.field920 - 1] = var16.field3709;
							class69.field579[++class94.field920 - 1] = var16.field3710;
						}

						return 1;
					} else if (var0 == CS2Opcodes.WORLDMAP_GETCURRENTMAP) {
						class69.field579[++class94.field920 - 1] = client.method3499().method7822();
						return 1;
					} else if (var0 == CS2Opcodes.WORLDMAP_GETDISPLAYCOORD) {
						var16 = new class311(class69.field579[--class94.field920]);
						var14 = client.method3499().method7687();
						if (null == var14) {
							class69.field579[++class94.field920 - 1] = -1;
							class69.field579[++class94.field920 - 1] = -1;
							return 1;
						} else {
							int[] var15 = var14.method5013(var16.field3708, var16.field3709, var16.field3710);
							if (null == var15) {
								class69.field579[++class94.field920 - 1] = -1;
								class69.field579[++class94.field920 - 1] = -1;
							} else {
								class69.field579[++class94.field920 - 1] = var15[0];
								class69.field579[++class94.field920 - 1] = var15[1];
							}

							return 1;
						}
					} else {
						class311 var8;
						if (var0 == CS2Opcodes._6618) {
							var16 = new class311(class69.field579[--class94.field920]);
							var14 = client.method3499().method7687();
							if (var14 == null) {
								class69.field579[++class94.field920 - 1] = -1;
								class69.field579[++class94.field920 - 1] = -1;
								return 1;
							} else {
								var8 = var14.method4981(var16.field3709, var16.field3710);
								if (var8 == null) {
									class69.field579[++class94.field920 - 1] = -1;
								} else {
									class69.field579[++class94.field920 - 1] = var8.method6132();
								}

								return 1;
							}
						} else {
							class311 var13;
							if (var0 == CS2Opcodes._6619) {
								class94.field920 -= 2;
								var4 = class69.field579[class94.field920];
								var13 = new class311(class69.field579[1 + class94.field920]);
								class69.method2090(var4, var13, false);
								return 1;
							} else if (var0 == CS2Opcodes._6620) {
								class94.field920 -= 2;
								var4 = class69.field579[class94.field920];
								var13 = new class311(class69.field579[class94.field920 + 1]);
								class69.method2090(var4, var13, true);
								return 1;
							} else if (var0 == CS2Opcodes.WORLDMAP_COORDINMAP) {
								class94.field920 -= 2;
								var4 = class69.field579[class94.field920];
								var13 = new class311(class69.field579[1 + class94.field920]);
								var12 = client.method3499().method7702(var4);
								if (null == var12) {
									class69.field579[++class94.field920 - 1] = 0;
									return 1;
								} else {
									class69.field579[++class94.field920 - 1] = var12.method5022(var13.field3708, var13.field3709, var13.field3710) ? 1 : 0;
									return 1;
								}
							} else if (var0 == CS2Opcodes.WORLDMAP_GETSIZE) {
								class69.field579[++class94.field920 - 1] = client.method3499().method7709();
								class69.field579[++class94.field920 - 1] = client.method3499().method7710();
								return 1;
							} else if (var0 == CS2Opcodes._6623) {
								var16 = new class311(class69.field579[--class94.field920]);
								var14 = client.method3499().method7684(var16.field3708, var16.field3709, var16.field3710);
								if (null == var14) {
									class69.field579[++class94.field920 - 1] = -1;
								} else {
									class69.field579[++class94.field920 - 1] = var14.method4983();
								}

								return 1;
							} else if (var0 == CS2Opcodes._6624) {
								client.method3499().method7711(class69.field579[--class94.field920]);
								return 1;
							} else if (var0 == CS2Opcodes._6625) {
								client.method3499().method7712();
								return 1;
							} else if (var0 == CS2Opcodes._6626) {
								client.method3499().method7803(class69.field579[--class94.field920]);
								return 1;
							} else if (var0 == CS2Opcodes._6627) {
								client.method3499().method7841();
								return 1;
							} else {
								boolean var11;
								if (var0 == CS2Opcodes.WORLDMAP_PERPETUALFLASH) {
									var11 = class69.field579[--class94.field920] == 1;
									client.method3499().method7715(var11);
									return 1;
								} else if (var0 == CS2Opcodes.WORLDMAP_FLASHELEMENT) {
									var4 = class69.field579[--class94.field920];
									client.method3499().method7716(var4);
									return 1;
								} else if (var0 == CS2Opcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var4 = class69.field579[--class94.field920];
									client.method3499().method7717(var4);
									return 1;
								} else if (var0 == CS2Opcodes.WORLDMAP_STOPCURRENTFLASHES) {
									client.method3499().method7718();
									return 1;
								} else if (var0 == CS2Opcodes.WORLDMAP_DISABLEELEMENTS) {
									var11 = class69.field579[--class94.field920] == 1;
									client.method3499().method7680(var11);
									return 1;
								} else {
									boolean var5;
									if (var0 == CS2Opcodes.WORLDMAP_DISABLEELEMENT) {
										class94.field920 -= 2;
										var4 = class69.field579[class94.field920];
										var5 = class69.field579[class94.field920 + 1] == 1;
										client.method3499().method7720(var4, var5);
										return 1;
									} else if (var0 == CS2Opcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class94.field920 -= 2;
										var4 = class69.field579[class94.field920];
										var5 = 1 == class69.field579[1 + class94.field920];
										client.method3499().method7721(var4, var5);
										return 1;
									} else if (var0 == CS2Opcodes.WORLDMAP_GETDISABLEELEMENTS) {
										class69.field579[++class94.field920 - 1] = client.method3499().method7722() ? 1 : 0;
										return 1;
									} else if (var0 == CS2Opcodes.WORLDMAP_GETDISABLEELEMENT) {
										var4 = class69.field579[--class94.field920];
										class69.field579[++class94.field920 - 1] = client.method3499().method7861(var4) ? 1 : 0;
										return 1;
									} else if (var0 == CS2Opcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var4 = class69.field579[--class94.field920];
										class69.field579[++class94.field920 - 1] = client.method3499().method7784(var4) ? 1 : 0;
										return 1;
									} else if (var0 == CS2Opcodes._6638) {
										class94.field920 -= 2;
										var4 = class69.field579[class94.field920];
										var13 = new class311(class69.field579[class94.field920 + 1]);
										var8 = client.method3499().method7727(var4, var13);
										if (null == var8) {
											class69.field579[++class94.field920 - 1] = -1;
										} else {
											class69.field579[++class94.field920 - 1] = var8.method6132();
										}

										return 1;
									} else {
										class258 var9;
										if (var0 == CS2Opcodes.WORLDMAP_LISTELEMENT_START) {
											var9 = client.method3499().method7729();
											if (null == var9) {
												class69.field579[++class94.field920 - 1] = -1;
												class69.field579[++class94.field920 - 1] = -1;
											} else {
												class69.field579[++class94.field920 - 1] = var9.method5105();
												class69.field579[++class94.field920 - 1] = var9.field3000.method6132();
											}

											return 1;
										} else if (var0 == CS2Opcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var9 = client.method3499().method7819();
											if (var9 == null) {
												class69.field579[++class94.field920 - 1] = -1;
												class69.field579[++class94.field920 - 1] = -1;
											} else {
												class69.field579[++class94.field920 - 1] = var9.method5105();
												class69.field579[++class94.field920 - 1] = var9.field3000.method6132();
											}

											return 1;
										} else {
											class169 var7;
											if (var0 == CS2Opcodes.MEC_TEXT) {
												var4 = class69.field579[--class94.field920];
												var7 = class163.method2762(var4);
												if (var7.field1581 == null) {
													class69.field580[++class69.field581 - 1] = "";
												} else {
													class69.field580[++class69.field581 - 1] = var7.field1581;
												}

												return 1;
											} else if (var0 == CS2Opcodes.MEC_TEXTSIZE) {
												var4 = class69.field579[--class94.field920];
												var7 = class163.method2762(var4);
												class69.field579[++class94.field920 - 1] = var7.field1584;
												return 1;
											} else if (var0 == CS2Opcodes.MEC_CATEGORY) {
												var4 = class69.field579[--class94.field920];
												var7 = class163.method2762(var4);
												if (var7 == null) {
													class69.field579[++class94.field920 - 1] = -1;
												} else {
													class69.field579[++class94.field920 - 1] = var7.field1598;
												}

												return 1;
											} else if (var0 == CS2Opcodes.MEC_SPRITE) {
												var4 = class69.field579[--class94.field920];
												var7 = class163.method2762(var4);
												if (var7 == null) {
													class69.field579[++class94.field920 - 1] = -1;
												} else {
													class69.field579[++class94.field920 - 1] = var7.field1574;
												}

												return 1;
											} else if (var0 == CS2Opcodes.WORLDMAP_ELEMENT) {
												class69.field579[++class94.field920 - 1] = class362.field4348.field3169;
												return 1;
											} else if (var0 == CS2Opcodes._6698) {
												class69.field579[++class94.field920 - 1] = class362.field4348.field3167.method6132();
												return 1;
											} else if (var0 == CS2Opcodes.WORLDMAP_ELEMENTCOORD) {
												class69.field579[++class94.field920 - 1] = class362.field4348.field3168.method6132();
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
