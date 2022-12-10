public class class403 implements class343 {
	static final class403 field4581;
	static final class403 field4582;
	static final class403 field4583;
	static final class403 field4585;
	final int field4584;
	final int field4586;

	static {
		field4585 = new class403(2, 1);
		field4581 = new class403(0, 2);
		field4582 = new class403(1, 3);
		field4583 = new class403(3, 10);
	}

	class403(int var1, int var2) {
		this.field4584 = var1;
		this.field4586 = var2;
	}

	public int method6487() {
		return this.field4586;
	}

	static int method7517(int var0, class65 var1, boolean var2) {
		String var4;
		if (var0 == CS2Opcodes.MES) {
			var4 = class69.field580[--class69.field581];
			class105.method2785(0, "", var4);
			return 1;
		} else if (var0 == CS2Opcodes.ANIM) {
			class94.field920 -= 2;
			class281.method5351(class142.field1370, class69.field579[class94.field920], class69.field579[class94.field920 + 1]);
			return 1;
		} else if (var0 == CS2Opcodes.IF_CLOSE) {
			if (!class69.field587) {
				class69.field584 = true;
			}

			return 1;
		} else {
			int var11;
			if (var0 == CS2Opcodes.RESUME_COUNTDIALOG) {
				var4 = class69.field580[--class69.field581];
				var11 = 0;
				if (class341.method6511(var4)) {
					var11 = class341.method7671(var4);
				}

				class284 var13 = class152.method2679(class276.field3222, client.field1748.field1105);
				var13.field3321.method8312(var11);
				client.field1748.method2173(var13);
				return 1;
			} else {
				class284 var16;
				if (var0 == CS2Opcodes.RESUME_NAMEDIALOG) {
					var4 = class69.field580[--class69.field581];
					var16 = class152.method2679(class276.field3237, client.field1748.field1105);
					var16.field3321.method8323(var4.length() + 1);
					var16.field3321.method8316(var4);
					client.field1748.method2173(var16);
					return 1;
				} else if (var0 == CS2Opcodes.RESUME_STRINGDIALOG) {
					var4 = class69.field580[--class69.field581];
					var16 = class152.method2679(class276.field3270, client.field1748.field1105);
					var16.field3321.method8323(var4.length() + 1);
					var16.field3321.method8316(var4);
					client.field1748.method2173(var16);
					return 1;
				} else {
					int var9;
					String var15;
					if (var0 == CS2Opcodes.OPPLAYER) {
						var9 = class69.field579[--class94.field920];
						var15 = class69.field580[--class69.field581];
						class50.method1009(var9, var15);
						return 1;
					} else if (var0 == CS2Opcodes.IF_DRAGPICKUP) {
						class94.field920 -= 3;
						var9 = class69.field579[class94.field920];
						var11 = class69.field579[class94.field920 + 1];
						int var10 = class69.field579[class94.field920 + 2];
						class290 var14 = class180.method2988(var10);
						class12.method154(var14, var9, var11);
						return 1;
					} else if (var0 == CS2Opcodes.CC_DRAGPICKUP) {
						class94.field920 -= 2;
						var9 = class69.field579[class94.field920];
						var11 = class69.field579[1 + class94.field920];
						class290 var12 = var2 ? class187.field2044 : class341.field4273;
						class12.method154(var12, var9, var11);
						return 1;
					} else if (var0 == CS2Opcodes.SETMOUSECAM) {
						class218.field2651 = class69.field579[--class94.field920] == 1;
						return 1;
					} else if (var0 == CS2Opcodes.GETREMOVEROOFS) {
						class69.field579[++class94.field920 - 1] = class186.field2040.method1774() ? 1 : 0;
						return 1;
					} else if (var0 == CS2Opcodes.SETREMOVEROOFS) {
						class186.field2040.method1848(class69.field579[--class94.field920] == 1);
						return 1;
					} else if (var0 == CS2Opcodes.OPENURL) {
						var4 = class69.field580[--class69.field581];
						boolean var5 = class69.field579[--class94.field920] == 1;
						class356.method6604(var4, var5, false);
						return 1;
					} else if (var0 == CS2Opcodes.RESUME_OBJDIALOG) {
						var9 = class69.field579[--class94.field920];
						var16 = class152.method2679(class276.field3279, client.field1748.field1105);
						var16.field3321.method8310(var9);
						client.field1748.method2173(var16);
						return 1;
					} else if (var0 == CS2Opcodes.BUG_REPORT) {
						var9 = class69.field579[--class94.field920];
						class69.field581 -= 2;
						var15 = class69.field580[class69.field581];
						String var6 = class69.field580[1 + class69.field581];
						if (var15.length() > 500) {
							return 1;
						} else if (var6.length() > 500) {
							return 1;
						} else {
							class284 var7 = class152.method2679(class276.field3260, client.field1748.field1105);
							var7.field3321.method8310(1 + class467.method190(var15) + class467.method190(var6));
							var7.field3321.method8356(var9);
							var7.field3321.method8316(var6);
							var7.field3321.method8316(var15);
							client.field1748.method2173(var7);
							return 1;
						}
					} else if (var0 == CS2Opcodes.SETSHIFTCLICKDROP) {
						client.field1853 = class69.field579[--class94.field920] == 1;
						return 1;
					} else if (var0 == CS2Opcodes.SETSHOWMOUSEOVERTEXT) {
						client.field1850 = class69.field579[--class94.field920] == 1;
						return 1;
					} else if (var0 == CS2Opcodes.RENDERSELF) {
						client.field1727 = class69.field579[--class94.field920] == 1;
						return 1;
					} else if (var0 == CS2Opcodes._3120) {
						if (class69.field579[--class94.field920] == 1) {
							client.field1918 |= 1;
						} else {
							client.field1918 &= -2;
						}

						return 1;
					} else if (var0 == CS2Opcodes._3121) {
						if (class69.field579[--class94.field920] == 1) {
							client.field1918 |= 2;
						} else {
							client.field1918 &= -3;
						}

						return 1;
					} else if (var0 == CS2Opcodes._3122) {
						if (class69.field579[--class94.field920] == 1) {
							client.field1918 |= 4;
						} else {
							client.field1918 &= -5;
						}

						return 1;
					} else if (var0 == CS2Opcodes._3123) {
						if (class69.field579[--class94.field920] == 1) {
							client.field1918 |= 8;
						} else {
							client.field1918 &= -9;
						}

						return 1;
					} else if (var0 == CS2Opcodes._3124) {
						client.field1918 = 0;
						return 1;
					} else if (var0 == CS2Opcodes.SETSHOWMOUSECROSS) {
						client.field1721 = class69.field579[--class94.field920] == 1;
						return 1;
					} else if (var0 == CS2Opcodes.SETSHOWLOADINGMESSAGES) {
						client.field1815 = class69.field579[--class94.field920] == 1;
						return 1;
					} else if (var0 == CS2Opcodes.SETTAPTODROP) {
						client.method6763(class69.field579[--class94.field920] == 1);
						return 1;
					} else if (var0 == CS2Opcodes.GETTAPTODROP) {
						class69.field579[++class94.field920 - 1] = client.method4662() ? 1 : 0;
						return 1;
					} else if (var0 == CS2Opcodes._3129) {
						class94.field920 -= 2;
						client.field1842 = class69.field579[class94.field920];
						client.field1781 = class69.field579[1 + class94.field920];
						return 1;
					} else if (var0 == CS2Opcodes._3130) {
						class94.field920 -= 2;
						return 1;
					} else if (var0 == CS2Opcodes._3131) {
						--class94.field920;
						return 1;
					} else if (var0 == CS2Opcodes.GETCANVASSIZE) {
						class69.field579[++class94.field920 - 1] = class205.field2337;
						class69.field579[++class94.field920 - 1] = class340.field4263;
						return 1;
					} else if (var0 == CS2Opcodes.MOBILE_SETFPS) {
						--class94.field920;
						return 1;
					} else if (var0 == CS2Opcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == CS2Opcodes.MOBILE_OPENSTORECATEGORY) {
						class94.field920 -= 2;
						return 1;
					} else if (var0 == CS2Opcodes._3136) {
						client.field1973 = 3;
						client.field1865 = class69.field579[--class94.field920];
						return 1;
					} else if (var0 == CS2Opcodes._3137) {
						client.field1973 = 2;
						client.field1865 = class69.field579[--class94.field920];
						return 1;
					} else if (var0 == CS2Opcodes._3138) {
						client.field1973 = 0;
						return 1;
					} else if (var0 == CS2Opcodes._3139) {
						client.field1973 = 1;
						return 1;
					} else if (var0 == CS2Opcodes._3140) {
						client.field1973 = 3;
						client.field1865 = var2 ? class187.field2044.field3492 : class341.field4273.field3492;
						return 1;
					} else {
						boolean var17;
						if (var0 == CS2Opcodes.SETHIDEUSERNAME) {
							var17 = class69.field579[--class94.field920] == 1;
							class186.field2040.method1823(var17);
							return 1;
						} else if (var0 == CS2Opcodes.GETHIDEUSERNAME) {
							class69.field579[++class94.field920 - 1] = class186.field2040.method1775() ? 1 : 0;
							return 1;
						} else if (var0 == CS2Opcodes.SETREMEMBERUSERNAME) {
							var17 = class69.field579[--class94.field920] == 1;
							client.field1737 = var17;
							if (!var17) {
								class186.field2040.method1791("");
							}

							return 1;
						} else if (var0 == CS2Opcodes.GETREMEMBERUSERNAME) {
							class69.field579[++class94.field920 - 1] = client.field1737 ? 1 : 0;
							return 1;
						} else if (var0 == CS2Opcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == CS2Opcodes.SETTITLEMUSICDISABLED) {
							var17 = class69.field579[--class94.field920] == 1;
							class186.field2040.method1810(!var17);
							return 1;
						} else if (var0 == CS2Opcodes.GETTITLEMUSICDISABLED) {
							class69.field579[++class94.field920 - 1] = class186.field2040.method1790() ? 0 : 1;
							return 1;
						} else if (var0 == CS2Opcodes._3148) {
							return 1;
						} else if (var0 == CS2Opcodes._3149) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3150) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3151) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3152) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3153) {
							class69.field579[++class94.field920 - 1] = class73.field637;
							return 1;
						} else if (var0 == CS2Opcodes._3154) {
							class69.field579[++class94.field920 - 1] = client.method1224();
							return 1;
						} else if (var0 == CS2Opcodes._3155) {
							--class69.field581;
							return 1;
						} else if (var0 == CS2Opcodes._3156) {
							return 1;
						} else if (var0 == CS2Opcodes._3157) {
							class94.field920 -= 2;
							return 1;
						} else if (var0 == CS2Opcodes._3158) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3159) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3160) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3161) {
							--class94.field920;
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3162) {
							--class94.field920;
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3163) {
							--class69.field581;
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3164) {
							--class94.field920;
							class69.field580[++class69.field581 - 1] = "";
							return 1;
						} else if (var0 == CS2Opcodes._3165) {
							--class94.field920;
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3166) {
							class94.field920 -= 2;
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3167) {
							class94.field920 -= 2;
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3168) {
							class94.field920 -= 2;
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							return 1;
						} else if (var0 == CS2Opcodes._3169) {
							return 1;
						} else if (var0 == CS2Opcodes.LOCAL_NOTIFICATION) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3171) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3172) {
							--class94.field920;
							return 1;
						} else if (var0 == CS2Opcodes._3173) {
							--class94.field920;
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3174) {
							--class94.field920;
							return 1;
						} else if (var0 == CS2Opcodes._3175) {
							class69.field579[++class94.field920 - 1] = 0;
							return 1;
						} else if (var0 == CS2Opcodes._3176) {
							return 1;
						} else if (var0 == CS2Opcodes._3177) {
							return 1;
						} else if (var0 == CS2Opcodes._3178) {
							--class69.field581;
							return 1;
						} else if (var0 == CS2Opcodes._3179) {
							return 1;
						} else if (var0 == CS2Opcodes._3180) {
							--class69.field581;
							return 1;
						} else if (var0 == CS2Opcodes.SETBRIGHTNESS) {
							client.method181(class69.field579[--class94.field920]);
							return 1;
						} else if (var0 == CS2Opcodes.GETBRIGHTNESS) {
							class69.field579[++class94.field920 - 1] = class283.method5368();
							return 1;
						} else if (var0 == CS2Opcodes._3189) {
							var9 = class69.field579[--class94.field920];
							class183 var8 = class214.method4351(var9);
							if (var8.method3505()) {
								class73.method1470(var8.field1997);
							}

							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	static final void method7516(class290 var0) {
		int var2 = var0.field3500;
		if (var2 == 324) {
			if (client.field1974 == -1) {
				client.field1974 = var0.field3434;
				client.field1975 = var0.field3497;
			}

			if (1 == client.field1733.field3644) {
				var0.field3434 = client.field1974;
			} else {
				var0.field3434 = client.field1975;
			}

		} else if (var2 == 325) {
			if (-1 == client.field1974) {
				client.field1974 = var0.field3434;
				client.field1975 = var0.field3497;
			}

			if (client.field1733.field3644 == 1) {
				var0.field3434 = client.field1975;
			} else {
				var0.field3434 = client.field1974;
			}

		} else if (var2 == 327) {
			var0.field3467 = 150;
			var0.field3454 = (int)(Math.sin((double)client.field1700 / 40.0D) * 256.0D) & 2047;
			var0.field3443 = 5;
			var0.field3462 = 0;
		} else if (var2 == 328) {
			var0.field3467 = 150;
			var0.field3454 = (int)(Math.sin((double)client.field1700 / 40.0D) * 256.0D) & 2047;
			var0.field3443 = 5;
			var0.field3462 = 1;
		}
	}
}
