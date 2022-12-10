public final class class85 extends class98 {
	static int field787;
	static int field789;
	static int field792;
	static int[] field791;
	class198 field786;
	class198 field788;
	class208 field790;
	class468 field785;
	int field784;
	String field783;

	static {
		field787 = 1;
		field789 = 1;
	}

	class85() {
		this.field783 = "";
		this.field784 = 31;
	}

	void method1758(String var1) {
		this.field783 = null == var1 ? "" : var1;
	}

	void method1716(int var1) {
		this.field784 = var1;
	}

	boolean method1761(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field784 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	final String method1720() {
		if (!this.field783.isEmpty()) {
			return this.field783;
		} else {
			class208 var2 = this.field790;
			if (null != var2.field2412) {
				var2 = var2.method4083();
				if (null == var2) {
					var2 = this.field790;
				}
			}

			return var2.field2378;
		}
	}

	final void method1718(int var1, class201 var2) {
		int var4 = super.field973[0];
		int var5 = super.field1021[0];
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

		if (-1 != super.field989 && class214.method4351(super.field989).field1999 == 1) {
			super.field989 = -1;
		}

		if (super.field947 < 9) {
			++super.field947;
		}

		for (int var6 = super.field947; var6 > 0; --var6) {
			super.field973[var6] = super.field973[var6 - 1];
			super.field1021[var6] = super.field1021[var6 - 1];
			super.field1001[var6] = super.field1001[var6 - 1];
		}

		super.field973[0] = var4;
		super.field1021[0] = var5;
		super.field1001[0] = var2;
	}

	final void method1719(int var1, int var2, boolean var3) {
		if (super.field989 != -1 && class214.method4351(super.field989).field1999 == 1) {
			super.field989 = -1;
		}

		if (!var3) {
			int var5 = var1 - super.field973[0];
			int var6 = var2 - super.field1021[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (super.field947 < 9) {
					++super.field947;
				}

				for (int var7 = super.field947; var7 > 0; --var7) {
					super.field973[var7] = super.field973[var7 - 1];
					super.field1021[var7] = super.field1021[var7 - 1];
					super.field1001[var7] = super.field1001[var7 - 1];
				}

				super.field973[0] = var1;
				super.field1021[0] = var2;
				super.field1001[0] = class201.field2309;
				return;
			}
		}

		super.field947 = 0;
		super.field1022 = 0;
		super.field1009 = 0;
		super.field973[0] = var1;
		super.field1021[0] = var2;
		super.field1012 = super.field951 * 64 + 128 * super.field973[0];
		super.field948 = super.field951 * 64 + super.field1021[0] * 128;
	}

	protected final class216 method4625() {
		if (this.field790 == null) {
			return null;
		} else {
			class183 var2 = -1 != super.field989 && super.field992 == 0 ? class214.method4351(super.field989) : null;
			class183 var3 = super.field985 != -1 && (super.field953 != super.field985 || var2 == null) ? class214.method4351(super.field985) : null;
			class216 var4 = this.field790.method4138(var2, super.field980, var3, super.field986, this.field786);
			if (null == var4) {
				return null;
			} else {
				var4.method4412();
				super.field1007 = var4.field2740;
				int var5 = var4.field2607;
				if (super.field994 != -1 && super.field995 != -1) {
					class216 var6 = class146.method2640(super.field994).method3896(super.field995);
					if (var6 != null) {
						var6.method4408(0, -super.field1016, 0);
						class216[] var7 = new class216[]{var4, var6};
						var4 = new class216(var7, 2);
					}
				}

				if (this.field790.field2388 == 1) {
					var4.field2589 = true;
				}

				if (super.field1013 != 0 && client.field1700 >= super.field1008 && client.field1700 < super.field970) {
					var4.field2628 = super.field1010;
					var4.field2629 = super.field990;
					var4.field2630 = super.field1002;
					var4.field2570 = super.field1013;
					var4.field2632 = (short)var5;
				} else {
					var4.field2570 = 0;
				}

				return var4;
			}
		}
	}

	final boolean method2043() {
		return null != this.field790;
	}

	int[] method1731() {
		return null != this.field785 ? this.field785.method8573() : this.field790.method4093();
	}

	short[] method1723() {
		return this.field785 != null ? this.field785.method8575() : this.field790.method4130();
	}

	void method1724(int var1, int var2, short var3) {
		if (null == this.field785) {
			this.field785 = new class468(this.field790);
		}

		this.field785.method8576(var1, var2, var3);
	}

	void method1725(int[] var1, short[] var2) {
		if (this.field785 == null) {
			this.field785 = new class468(this.field790);
		}

		this.field785.method8577(var1, var2);
	}

	void method1726() {
		this.field785 = null;
	}

	void method1727(class198 var1) {
		this.field788 = var1;
	}

	class198 method1728() {
		return this.field788;
	}

	void method1729(class198 var1) {
		this.field786 = var1;
	}

	void method1745() {
		this.field788 = null;
	}

	void method1752() {
		this.field786 = null;
	}

	static int method1715(int var0, class65 var1, boolean var2) {
		int var5 = -1;
		class290 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class69.field579[--class94.field920];
			var4 = class180.method2988(var5);
		} else {
			var4 = var2 ? class187.field2044 : class341.field4273;
		}

		int var11;
		if (var0 == CS2Opcodes.CC_SETSCROLLPOS) {
			class94.field920 -= 2;
			var11 = class69.field579[class94.field920];
			int var7 = class69.field579[1 + class94.field920];
			if (12 == var4.field3536) {
				class295 var8 = var4.method5510();
				if (null != var8 && var8.method5689(var11, var7)) {
					class53.method1040(var4);
				}
			} else {
				var4.field3427 = var11;
				if (var4.field3427 > var4.field3422 - var4.field3414) {
					var4.field3427 = var4.field3422 - var4.field3414;
				}

				if (var4.field3427 < 0) {
					var4.field3427 = 0;
				}

				var4.field3421 = var7;
				if (var4.field3421 > var4.field3423 - var4.field3474) {
					var4.field3421 = var4.field3423 - var4.field3474;
				}

				if (var4.field3421 < 0) {
					var4.field3421 = 0;
				}

				class53.method1040(var4);
			}

			return 1;
		} else if (var0 == CS2Opcodes.CC_SETCOLOUR) {
			var4.field3424 = class69.field579[--class94.field920];
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETFILL) {
			var4.field3428 = class69.field579[--class94.field920] == 1;
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETTRANS) {
			var4.field3533 = class69.field579[--class94.field920];
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETLINEWID) {
			var4.field3432 = class69.field579[--class94.field920];
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETGRAPHIC) {
			var4.field3434 = class69.field579[--class94.field920];
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SET2DANGLE) {
			var4.field3388 = class69.field579[--class94.field920];
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETTILING) {
			var4.field3416 = class69.field579[--class94.field920] == 1;
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETMODEL) {
			var4.field3443 = 1;
			var4.field3462 = class69.field579[--class94.field920];
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETMODELANGLE) {
			class94.field920 -= 6;
			var4.field3449 = class69.field579[class94.field920];
			var4.field3544 = class69.field579[1 + class94.field920];
			var4.field3467 = class69.field579[2 + class94.field920];
			var4.field3454 = class69.field579[class94.field920 + 3];
			var4.field3453 = class69.field579[4 + class94.field920];
			var4.field3382 = class69.field579[class94.field920 + 5];
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETMODELANIM) {
			var11 = class69.field579[--class94.field920];
			if (var11 != var4.field3482) {
				var4.field3482 = var11;
				var4.field3539 = 0;
				var4.field3540 = 0;
				class53.method1040(var4);
			}

			return 1;
		} else if (var0 == CS2Opcodes.CC_SETMODELORTHOG) {
			var4.field3457 = class69.field579[--class94.field920] == 1;
			class53.method1040(var4);
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETTEXT) {
			String var15 = class69.field580[--class69.field581];
			if (!var15.equals(var4.field3461)) {
				var4.field3461 = var15;
				class53.method1040(var4);
			}

			return 1;
		} else {
			class295 var12;
			if (var0 == CS2Opcodes.CC_SETTEXTFONT) {
				var4.field3460 = class69.field579[--class94.field920];
				if (12 == var4.field3536) {
					var12 = var4.method5510();
					if (null != var12) {
						var12.method5696();
					}
				}

				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETTEXTALIGN) {
				class94.field920 -= 3;
				if (12 == var4.field3536) {
					var12 = var4.method5510();
					if (null != var12) {
						var12.method5690(class69.field579[class94.field920], class69.field579[1 + class94.field920]);
						var12.method5691(class69.field579[class94.field920 + 2]);
					}
				} else {
					var4.field3464 = class69.field579[class94.field920];
					var4.field3527 = class69.field579[class94.field920 + 1];
					var4.field3463 = class69.field579[2 + class94.field920];
				}

				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETTEXTSHADOW) {
				var4.field3466 = class69.field579[--class94.field920] == 1;
				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETOUTLINE) {
				var4.field3439 = class69.field579[--class94.field920];
				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETGRAPHICSHADOW) {
				var4.field3504 = class69.field579[--class94.field920];
				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETVFLIP) {
				var4.field3441 = class69.field579[--class94.field920] == 1;
				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETHFLIP) {
				var4.field3554 = class69.field579[--class94.field920] == 1;
				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETSCROLLSIZE) {
				class94.field920 -= 2;
				var4.field3422 = class69.field579[class94.field920];
				var4.field3423 = class69.field579[1 + class94.field920];
				class53.method1040(var4);
				if (var5 != -1 && 0 == var4.field3536) {
					class164.method2766(class72.field625[var5 >> 16], var4, false);
				}

				return 1;
			} else if (var0 == CS2Opcodes.CC_RESUME_PAUSEBUTTON) {
				client.method5352(var4.field3492, var4.field3400);
				client.field1868 = var4;
				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETCLICKMASK) {
				var4.field3497 = class69.field579[--class94.field920];
				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETFILLCOLOUR) {
				var4.field3545 = class69.field579[--class94.field920];
				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETFILLGRADIENT) {
				var4.field3431 = class69.field579[--class94.field920];
				class53.method1040(var4);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETFILLMODE) {
				var11 = class69.field579[--class94.field920];
				class489 var13 = (class489)class78.method1584(class489.method2249(), var11);
				if (null != var13) {
					var4.field3446 = var13;
					class53.method1040(var4);
				}

				return 1;
			} else {
				boolean var6;
				if (var0 == CS2Opcodes.CC_SETLINEDIRECTION) {
					var6 = class69.field579[--class94.field920] == 1;
					var4.field3433 = var6;
					return 1;
				} else if (var0 == CS2Opcodes.CC_SETMODELTRANSPARENT) {
					var6 = class69.field579[--class94.field920] == 1;
					var4.field3458 = var6;
					return 1;
				} else if (var0 == CS2Opcodes.CC_SETHTTPSPRITE) {
					var4.field3436 = class69.field580[--class69.field581];
					class53.method1040(var4);
					return 1;
				} else if (var0 == CS2Opcodes.CC_SETCRM_URL) {
					var4.method5628(class69.field580[--class69.field581], class172.field1625, client.method2670());
					return 1;
				} else if (var0 == CS2Opcodes.CC_SETCRM_TEXTFONT) {
					class94.field920 -= 2;
					var4.method5513(class69.field579[class94.field920], class69.field579[1 + class94.field920]);
					return 1;
				} else if (var0 == CS2Opcodes.CC_SETCRM_SERVERTARGETS) {
					var4.method5505(class69.field580[--class69.field581], class69.field579[--class94.field920]);
					return 1;
				} else {
					class288 var14;
					if (var0 == 1133) {
						--class94.field920;
						var14 = var4.method5636();
						if (null != var14) {
							var14.field3375 = class69.field579[class94.field920];
							class53.method1040(var4);
						}

						return 1;
					} else if (var0 == 1134) {
						--class94.field920;
						var14 = var4.method5636();
						if (var14 != null) {
							var14.field3377 = class69.field579[class94.field920];
							class53.method1040(var4);
						}

						return 1;
					} else if (var0 == 1135) {
						--class69.field581;
						var12 = var4.method5510();
						if (var12 != null) {
							var4.field3502 = class69.field580[class69.field581];
						}

						return 1;
					} else if (var0 == 1136) {
						--class94.field920;
						var14 = var4.method5636();
						if (var14 != null) {
							var14.field3376 = class69.field579[class94.field920];
							class53.method1040(var4);
						}

						return 1;
					} else if (var0 == 1137) {
						--class94.field920;
						var12 = var4.method5510();
						if (null != var12 && var12.method5686(class69.field579[class94.field920])) {
							class53.method1040(var4);
						}

						return 1;
					} else if (var0 == 1138) {
						--class94.field920;
						var12 = var4.method5510();
						if (var12 != null && var12.method5687(class69.field579[class94.field920])) {
							class53.method1040(var4);
						}

						return 1;
					} else if (var0 == 1139) {
						--class94.field920;
						var12 = var4.method5510();
						if (null != var12 && var12.method5688(class69.field579[class94.field920])) {
							class53.method1040(var4);
						}

						return 1;
					} else {
						class295 var10;
						if (var0 == 1140) {
							var6 = class69.field579[--class94.field920] == 1;
							client.field1754.method3552();
							var10 = var4.method5510();
							if (var10 != null && var10.method5680(var6)) {
								if (var6) {
									client.field1754.method3550(var4);
								}

								class53.method1040(var4);
							}

							return 1;
						} else if (var0 == 1141) {
							var6 = class69.field579[--class94.field920] == 1;
							if (!var6 && client.field1754.method3551() == var4) {
								client.field1754.method3552();
								class53.method1040(var4);
							}

							var10 = var4.method5510();
							if (null != var10) {
								var10.method5681(var6);
							}

							return 1;
						} else if (var0 == 1142) {
							class94.field920 -= 2;
							var12 = var4.method5510();
							if (var12 != null && var12.method5704(class69.field579[class94.field920], class69.field579[class94.field920 + 1])) {
								class53.method1040(var4);
							}

							return 1;
						} else if (var0 == 1143) {
							--class94.field920;
							var12 = var4.method5510();
							if (var12 != null && var12.method5704(class69.field579[class94.field920], class69.field579[class94.field920])) {
								class53.method1040(var4);
							}

							return 1;
						} else if (var0 == 1144) {
							--class94.field920;
							var12 = var4.method5510();
							if (null != var12) {
								var12.method5815(class69.field579[class94.field920]);
								class53.method1040(var4);
							}

							return 1;
						} else if (var0 == 1145) {
							--class94.field920;
							var12 = var4.method5510();
							if (null != var12) {
								var12.method5692(class69.field579[class94.field920]);
							}

							return 1;
						} else if (var0 == 1146) {
							--class94.field920;
							var12 = var4.method5510();
							if (var12 != null) {
								var12.method5844(class69.field579[class94.field920]);
							}

							return 1;
						} else if (var0 == 1147) {
							--class94.field920;
							var12 = var4.method5510();
							if (var12 != null) {
								var12.method5741(class69.field579[class94.field920]);
								class53.method1040(var4);
							}

							return 1;
						} else {
							class41 var9;
							if (var0 == 1148) {
								class94.field920 -= 2;
								var9 = var4.method5530();
								if (null != var9) {
									var9.method695(class69.field579[class94.field920], class69.field579[class94.field920 + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								class94.field920 -= 2;
								var9 = var4.method5530();
								if (null != var9) {
									var9.method689((char)class69.field579[class94.field920], class69.field579[class94.field920 + 1]);
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

	static final boolean method1768(class290 var0) {
		int var2 = var0.field3500;
		if (var2 == 205) {
			client.field1749 = 250;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				client.field1733.method6068(var3, var4 == 1);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				client.field1733.method6046(var3, var4 == 1);
			}

			if (var2 == 324) {
				client.field1733.method6047(0);
			}

			if (var2 == 325) {
				client.field1733.method6047(1);
			}

			if (var2 == 326) {
				class284 var5 = class152.method2679(class276.field3195, client.field1748.field1105);
				client.field1733.method6048(var5.field3321);
				client.field1748.method2173(var5);
				return true;
			} else {
				return false;
			}
		}
	}
}
