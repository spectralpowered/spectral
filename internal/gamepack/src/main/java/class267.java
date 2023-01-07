import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "cg"
)
public final class class267 extends class334 {
	@ObfInfo(
		owner = "cg",
		name = "f",
		desc = "I"
	)
	static int field2210;
	@ObfInfo(
		owner = "cg",
		name = "u",
		desc = "I"
	)
	static int field2212;
	@ObfInfo(
		owner = "cg",
		name = "mw",
		desc = "I"
	)
	static int field2215;
	@ObfInfo(
		owner = "cg",
		name = "i",
		desc = "[I"
	)
	static int[] field2214;
	@ObfInfo(
		owner = "cg",
		name = "q",
		desc = "Lgp;"
	)
	class207 field2209;
	@ObfInfo(
		owner = "cg",
		name = "r",
		desc = "Lgp;"
	)
	class207 field2211;
	@ObfInfo(
		owner = "cg",
		name = "h",
		desc = "Lgz;"
	)
	class423 field2213;
	@ObfInfo(
		owner = "cg",
		name = "m",
		desc = "Lqz;"
	)
	class489 field2208;
	@ObfInfo(
		owner = "cg",
		name = "x",
		desc = "I"
	)
	int field2207;
	@ObfInfo(
		owner = "cg",
		name = "e",
		desc = "Ljava/lang/String;"
	)
	String field2206;

	static {
		field2210 = 1;
		field2212 = 1;
	}

	@ObfInfo(
		owner = "cg",
		name = "<init>",
		desc = "()V"
	)
	class267() {
		this.field2206 = "";
		this.field2207 = 31;
	}

	@ObfInfo(
		owner = "cg",
		name = "h",
		desc = "(Ljava/lang/String;I)V"
	)
	void method1272(String var1) {
		this.field2206 = null == var1 ? "" : var1;
	}

	@ObfInfo(
		owner = "cg",
		name = "m",
		desc = "(II)V"
	)
	void method1256(int var1) {
		this.field2207 = var1;
	}

	@ObfInfo(
		owner = "cg",
		name = "q",
		desc = "(II)Z"
	)
	boolean method1273(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field2207 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfInfo(
		owner = "cg",
		name = "f",
		desc = "(I)Ljava/lang/String;"
	)
	final String method1259() {
		if (!this.field2206.isEmpty()) {
			return this.field2206;
		} else {
			class423 var2 = this.field2213;
			if (null != var2.field3493) {
				var2 = var2.method2054();
				if (null == var2) {
					var2 = this.field2213;
				}
			}

			return var2.field3460;
		}
	}

	@ObfInfo(
		owner = "cg",
		name = "r",
		desc = "(ILgs;B)V"
	)
	final void method1257(int var1, class294 var2) {
		int var4 = super.field2633[0];
		int var5 = super.field2681[0];
		if (var1 == 0) {
			--var4;
			++var5;
		}

		if (var1 == 1) {
			++var5;
		}

		if (var1 == 2) {
			++var4;
			++var5;
		}

		if (var1 == 3) {
			--var4;
		}

		if (var1 == 4) {
			++var4;
		}

		if (var1 == 5) {
			--var4;
			--var5;
		}

		if (var1 == 6) {
			--var5;
		}

		if (var1 == 7) {
			++var4;
			--var5;
		}

		if (-1 != super.field2649 && class271.method1277(super.field2649).field2034 == 1) {
			super.field2649 = -1;
		}

		if (super.field2607 < 9) {
			++super.field2607;
		}

		for (int var6 = super.field2607; var6 > 0; --var6) {
			super.field2633[var6] = super.field2633[var6 - 1];
			super.field2681[var6] = super.field2681[var6 - 1];
			super.field2661[var6] = super.field2661[var6 - 1];
		}

		super.field2633[0] = var4;
		super.field2681[0] = var5;
		super.field2661[0] = var2;
	}

	@ObfInfo(
		owner = "cg",
		name = "u",
		desc = "(IIZI)V"
	)
	final void method1258(int var1, int var2, boolean var3) {
		if (super.field2649 != -1 && class271.method1277(super.field2649).field2034 == 1) {
			super.field2649 = -1;
		}

		if (!var3) {
			int var5 = var1 - super.field2633[0];
			int var6 = var2 - super.field2681[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (super.field2607 < 9) {
					++super.field2607;
				}

				for (int var7 = super.field2607; var7 > 0; --var7) {
					super.field2633[var7] = super.field2633[var7 - 1];
					super.field2681[var7] = super.field2681[var7 - 1];
					super.field2661[var7] = super.field2661[var7 - 1];
				}

				super.field2633[0] = var1;
				super.field2681[0] = var2;
				super.field2661[0] = class294.field2386;
				return;
			}
		}

		super.field2607 = 0;
		super.field2682 = 0;
		super.field2669 = 0;
		super.field2633[0] = var1;
		super.field2681[0] = var2;
		super.field2672 = super.field2611 * 64 + 128 * super.field2633[0];
		super.field2608 = super.field2611 * 64 + super.field2681[0] * 128;
	}

	@ObfInfo(
		owner = "cg",
		name = "e",
		desc = "(I)Lhh;"
	)
	protected final class470 method1438() {
		if (this.field2213 == null) {
			return null;
		} else {
			class242 var2 = -1 != super.field2649 && super.field2652 == 0 ? class271.method1277(super.field2649) : null;
			class242 var3 = super.field2645 != -1 && (super.field2613 != super.field2645 || var2 == null) ? class271.method1277(super.field2645) : null;
			class470 var4 = this.field2213.method2066(var2, super.field2640, var3, super.field2646, this.field2209);
			if (null == var4) {
				return null;
			} else {
				var4.method2315();
				super.field2667 = var4.field2390;
				int var5 = var4.field3937;
				if (super.field2654 != -1 && super.field2655 != -1) {
					class470 var6 = class429.method2119(super.field2654).method1663(super.field2655);
					if (var6 != null) {
						var6.method2313(0, -super.field2676, 0);
						class470[] var7 = new class470[]{var4, var6};
						var4 = new class470(var7, 2);
					}
				}

				if (this.field2213.field3470 == 1) {
					var4.field3920 = true;
				}

				if (super.field2673 != 0 && client.field231 >= super.field2668 && client.field231 < super.field2630) {
					var4.field3953 = super.field2670;
					var4.field3954 = super.field2650;
					var4.field3955 = super.field2662;
					var4.field3901 = super.field2673;
					var4.field3957 = (short)var5;
				} else {
					var4.field3901 = 0;
				}

				return var4;
			}
		}
	}

	@ObfInfo(
		owner = "cg",
		name = "s",
		desc = "(I)Z"
	)
	final boolean method1678() {
		return null != this.field2213;
	}

	@ObfInfo(
		owner = "cg",
		name = "b",
		desc = "(B)[I"
	)
	int[] method1267() {
		return null != this.field2208 ? this.field2208.method2397() : this.field2213.method2061();
	}

	@ObfInfo(
		owner = "cg",
		name = "j",
		desc = "(B)[S"
	)
	short[] method1260() {
		return this.field2208 != null ? this.field2208.method2398() : this.field2213.method2064();
	}

	@ObfInfo(
		owner = "cg",
		name = "g",
		desc = "(IISI)V"
	)
	void method1261(int var1, int var2, short var3) {
		if (null == this.field2208) {
			this.field2208 = new class489(this.field2213);
		}

		this.field2208.method2399(var1, var2, var3);
	}

	@ObfInfo(
		owner = "cg",
		name = "i",
		desc = "([I[SI)V"
	)
	void method1262(int[] var1, short[] var2) {
		if (this.field2208 == null) {
			this.field2208 = new class489(this.field2213);
		}

		this.field2208.method2400(var1, var2);
	}

	@ObfInfo(
		owner = "cg",
		name = "o",
		desc = "(B)V"
	)
	void method1263() {
		this.field2208 = null;
	}

	@ObfInfo(
		owner = "cg",
		name = "n",
		desc = "(Lgp;I)V"
	)
	void method1264(class207 var1) {
		this.field2211 = var1;
	}

	@ObfInfo(
		owner = "cg",
		name = "k",
		desc = "(I)Lgp;"
	)
	class207 method1265() {
		return this.field2211;
	}

	@ObfInfo(
		owner = "cg",
		name = "a",
		desc = "(Lgp;I)V"
	)
	void method1266(class207 var1) {
		this.field2209 = var1;
	}

	@ObfInfo(
		owner = "cg",
		name = "l",
		desc = "(I)V"
	)
	void method1268() {
		this.field2211 = null;
	}

	@ObfInfo(
		owner = "cg",
		name = "t",
		desc = "(I)V"
	)
	void method1269() {
		this.field2209 = null;
	}

	@ObfInfo(
		owner = "cg",
		name = "q",
		desc = "(ILbm;ZI)I"
	)
	static int method1255(int var0, class461 var1, boolean var2) {
		int var5 = -1;
		class120 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class386.field3248[--class161.field1227];
			var4 = class67.method299(var5);
		} else {
			var4 = var2 ? class108.field822 : class37.field183;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class161.field1227 -= 2;
			var11 = class386.field3248[class161.field1227];
			int var7 = class386.field3248[1 + class161.field1227];
			if (12 == var4.field1026) {
				class262 var8 = var4.method485();
				if (null != var8 && var8.method1126(var11, var7)) {
					class184.method836(var4);
				}
			} else {
				var4.field920 = var11;
				if (var4.field920 > var4.field915 - var4.field908) {
					var4.field920 = var4.field915 - var4.field908;
				}

				if (var4.field920 < 0) {
					var4.field920 = 0;
				}

				var4.field914 = var7;
				if (var4.field914 > var4.field916 - var4.field967) {
					var4.field914 = var4.field916 - var4.field967;
				}

				if (var4.field914 < 0) {
					var4.field914 = 0;
				}

				class184.method836(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var4.field917 = class386.field3248[--class161.field1227];
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var4.field921 = class386.field3248[--class161.field1227] == 1;
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var4.field1024 = class386.field3248[--class161.field1227];
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var4.field925 = class386.field3248[--class161.field1227];
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var4.field927 = class386.field3248[--class161.field1227];
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var4.field883 = class386.field3248[--class161.field1227];
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var4.field910 = class386.field3248[--class161.field1227] == 1;
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var4.field936 = 1;
			var4.field955 = class386.field3248[--class161.field1227];
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class161.field1227 -= 6;
			var4.field942 = class386.field3248[class161.field1227];
			var4.field1034 = class386.field3248[1 + class161.field1227];
			var4.field960 = class386.field3248[2 + class161.field1227];
			var4.field947 = class386.field3248[class161.field1227 + 3];
			var4.field946 = class386.field3248[4 + class161.field1227];
			var4.field882 = class386.field3248[class161.field1227 + 5];
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var11 = class386.field3248[--class161.field1227];
			if (var11 != var4.field975) {
				var4.field975 = var11;
				var4.field1029 = 0;
				var4.field1030 = 0;
				class184.method836(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var4.field950 = class386.field3248[--class161.field1227] == 1;
			class184.method836(var4);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
			String var15 = class386.field3249[--class386.field3250];
			if (!var15.equals(var4.field954)) {
				var4.field954 = var15;
				class184.method836(var4);
			}

			return 1;
		} else {
			class262 var12;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var4.field953 = class386.field3248[--class161.field1227];
				if (12 == var4.field1026) {
					var12 = var4.method485();
					if (null != var12) {
						var12.method1131();
					}
				}

				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				class161.field1227 -= 3;
				if (12 == var4.field1026) {
					var12 = var4.method485();
					if (null != var12) {
						var12.method1127(class386.field3248[class161.field1227], class386.field3248[1 + class161.field1227]);
						var12.method1128(class386.field3248[class161.field1227 + 2]);
					}
				} else {
					var4.field957 = class386.field3248[class161.field1227];
					var4.field1018 = class386.field3248[class161.field1227 + 1];
					var4.field956 = class386.field3248[2 + class161.field1227];
				}

				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var4.field959 = class386.field3248[--class161.field1227] == 1;
				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var4.field932 = class386.field3248[--class161.field1227];
				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var4.field997 = class386.field3248[--class161.field1227];
				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var4.field934 = class386.field3248[--class161.field1227] == 1;
				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var4.field1044 = class386.field3248[--class161.field1227] == 1;
				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				class161.field1227 -= 2;
				var4.field915 = class386.field3248[class161.field1227];
				var4.field916 = class386.field3248[1 + class161.field1227];
				class184.method836(var4);
				if (var5 != -1 && 0 == var4.field1026) {
					class378.method1862(class329.field2600[var5 >> 16], var4, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class439.method2178(var4.field985, var4.field895);
				client.field399 = var4;
				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETCLICKMASK) {
				var4.field990 = class386.field3248[--class161.field1227];
				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var4.field1035 = class386.field3248[--class161.field1227];
				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLGRADIENT) {
				var4.field924 = class386.field3248[--class161.field1227];
				class184.method836(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) {
				var11 = class386.field3248[--class161.field1227];
				class7 var13 = (class7)class2.method10(class140.method641(), var11);
				if (null != var13) {
					var4.field939 = var13;
					class184.method836(var4);
				}

				return 1;
			} else {
				boolean var6;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var6 = class386.field3248[--class161.field1227] == 1;
					var4.field926 = var6;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var6 = class386.field3248[--class161.field1227] == 1;
					var4.field951 = var6;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHTTPSPRITE) {
					var4.field929 = class386.field3249[--class386.field3250];
					class184.method836(var4);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETCRM_URL) {
					var4.method507(class386.field3249[--class386.field3250], class300.field2410, class312.method1507());
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETCRM_TEXTFONT) {
					class161.field1227 -= 2;
					var4.method486(class386.field3248[class161.field1227], class386.field3248[1 + class161.field1227]);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETCRM_SERVERTARGETS) {
					var4.method481(class386.field3249[--class386.field3250], class386.field3248[--class161.field1227]);
					return 1;
				} else {
					class146 var14;
					if (var0 == 1133) {
						--class161.field1227;
						var14 = var4.method509();
						if (null != var14) {
							var14.field1160 = class386.field3248[class161.field1227];
							class184.method836(var4);
						}

						return 1;
					} else if (var0 == 1134) {
						--class161.field1227;
						var14 = var4.method509();
						if (var14 != null) {
							var14.field1162 = class386.field3248[class161.field1227];
							class184.method836(var4);
						}

						return 1;
					} else if (var0 == 1135) {
						--class386.field3250;
						var12 = var4.method485();
						if (var12 != null) {
							var4.field995 = class386.field3249[class386.field3250];
						}

						return 1;
					} else if (var0 == 1136) {
						--class161.field1227;
						var14 = var4.method509();
						if (var14 != null) {
							var14.field1161 = class386.field3248[class161.field1227];
							class184.method836(var4);
						}

						return 1;
					} else if (var0 == 1137) {
						--class161.field1227;
						var12 = var4.method485();
						if (null != var12 && var12.method1123(class386.field3248[class161.field1227])) {
							class184.method836(var4);
						}

						return 1;
					} else if (var0 == 1138) {
						--class161.field1227;
						var12 = var4.method485();
						if (var12 != null && var12.method1124(class386.field3248[class161.field1227])) {
							class184.method836(var4);
						}

						return 1;
					} else if (var0 == 1139) {
						--class161.field1227;
						var12 = var4.method485();
						if (null != var12 && var12.method1125(class386.field3248[class161.field1227], (byte)-54)) {
							class184.method836(var4);
						}

						return 1;
					} else {
						class262 var10;
						if (var0 == 1140) {
							var6 = class386.field3248[--class161.field1227] == 1;
							client.field285.method456();
							var10 = var4.method485();
							if (var10 != null && var10.method1118(var6)) {
								if (var6) {
									client.field285.method454(var4);
								}

								class184.method836(var4);
							}

							return 1;
						} else if (var0 == 1141) {
							var6 = class386.field3248[--class161.field1227] == 1;
							if (!var6 && client.field285.method455() == var4) {
								client.field285.method456();
								class184.method836(var4);
							}

							var10 = var4.method485();
							if (null != var10) {
								var10.method1119(var6);
							}

							return 1;
						} else if (var0 == 1142) {
							class161.field1227 -= 2;
							var12 = var4.method485();
							if (var12 != null && var12.method1139(class386.field3248[class161.field1227], class386.field3248[class161.field1227 + 1])) {
								class184.method836(var4);
							}

							return 1;
						} else if (var0 == 1143) {
							--class161.field1227;
							var12 = var4.method485();
							if (var12 != null && var12.method1139(class386.field3248[class161.field1227], class386.field3248[class161.field1227])) {
								class184.method836(var4);
							}

							return 1;
						} else if (var0 == 1144) {
							--class161.field1227;
							var12 = var4.method485();
							if (null != var12) {
								var12.method1180(class386.field3248[class161.field1227]);
								class184.method836(var4);
							}

							return 1;
						} else if (var0 == 1145) {
							--class161.field1227;
							var12 = var4.method485();
							if (null != var12) {
								var12.method1129(class386.field3248[class161.field1227]);
							}

							return 1;
						} else if (var0 == 1146) {
							--class161.field1227;
							var12 = var4.method485();
							if (var12 != null) {
								var12.method1186(class386.field3248[class161.field1227]);
							}

							return 1;
						} else if (var0 == 1147) {
							--class161.field1227;
							var12 = var4.method485();
							if (var12 != null) {
								var12.method1167(class386.field3248[class161.field1227]);
								class184.method836(var4);
							}

							return 1;
						} else {
							class109 var9;
							if (var0 == 1148) {
								class161.field1227 -= 2;
								var9 = var4.method498();
								if (null != var9) {
									var9.method431(class386.field3248[class161.field1227], class386.field3248[class161.field1227 + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								class161.field1227 -= 2;
								var9 = var4.method498();
								if (null != var9) {
									var9.method428((char)class386.field3248[class161.field1227], class386.field3248[class161.field1227 + 1]);
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
	}

	@ObfInfo(
		owner = "cg",
		name = "mn",
		desc = "(Lkd;I)Z"
	)
	static final boolean method1274(class120 var0) {
		int var2 = var0.field993;
		if (var2 == 205) {
			client.field280 = 250;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				client.field264.method1407(var3, var4 == 1);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				client.field264.method1399(var3, var4 == 1);
			}

			if (var2 == 324) {
				client.field264.method1400(0);
			}

			if (var2 == 325) {
				client.field264.method1400(1);
			}

			if (var2 == 326) {
				class299 var5 = class480.method2370(class356.field2933, client.field279.field4042);
				client.field264.method1401(var5.field2403);
				client.field279.method2389(var5);
				return true;
			} else {
				return false;
			}
		}
	}
}
