import java.util.LinkedList;
import java.util.List;

public abstract class class438 implements class265 {
	class460 field4795;

	class438(int var1) {
	}

	public void method7983(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			class403 var4 = (class403)class78.method1584(class66.method1231(), var3);
			if (var4 != null) {
				switch(var4.field4584) {
				case 0:
					class317[] var6 = new class317[]{class317.field3737, class317.field3740, class317.field3738, class317.field3741};
					class78.method1584(var6, var1.method8326());
					break;
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 2:
					int var5 = var1.method8326();
					this.field4795 = class2.method20(var5);
					if (null != this.field4795) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 3:
					var1.method8336();
				}
			} else {
				this.method7984(var1, var3);
			}
		}
	}

	boolean method7985() {
		return null != this.field4795;
	}

	Object method7986() {
		if (class460.field4891 == this.field4795) {
			return 0;
		} else if (class460.field4887 == this.field4795) {
			return -1L;
		} else {
			return this.field4795 == class460.field4888 ? "" : null;
		}
	}

	static int method7995(int var0, class65 var1, boolean var2) {
		int var4;
		Object var5;
		int var6;
		class448 var7;
		int var8;
		if (var0 != CS2Opcodes.DB_FIND_WITH_COUNT && var0 != CS2Opcodes.DB_FIND) {
			if (var0 != CS2Opcodes.DB_FINDNEXT) {
				int var20;
				int var21;
				if (var0 == CS2Opcodes.DB_GETFIELD) {
					class94.field920 -= 3;
					var4 = class69.field579[class94.field920];
					var20 = class69.field579[class94.field920 + 1];
					var6 = class69.field579[class94.field920 + 2];
					var21 = class444.method6107(var20);
					var8 = class444.method8232(var20);
					int var9 = class444.method2859(var20);
					class455 var26 = class99.method2059(var4);
					class461 var27 = class140.method2534(var21);
					int[] var28 = var27.field4898[var8];
					int var13 = 0;
					int var14 = var28.length;
					if (var9 >= 0) {
						if (var9 >= var14) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var9 + ", Max: " + var14);
						}

						var13 = var9;
						var14 = var9 + 1;
					}

					Object[] var15 = var26.method8144(var8);
					if (var15 == null && null != var27.field4895) {
						var15 = var27.field4895[var8];
					}

					int var16;
					int var17;
					if (null == var15) {
						for (var16 = var13; var16 < var14; ++var16) {
							var17 = var28[var16];
							class460 var18 = class2.method20(var17);
							if (var18 == class460.field4888) {
								class69.field580[++class69.field581 - 1] = "";
							} else {
								class69.field579[++class94.field920 - 1] = class12.method169(var17);
							}
						}

						return 1;
					} else {
						var16 = var15.length / var28.length;
						if (var6 >= 0 && var6 < var16) {
							for (var17 = var13; var17 < var14; ++var17) {
								int var22 = var6 * var28.length + var17;
								class460 var19 = class2.method20(var28[var17]);
								if (class460.field4888 == var19) {
									class69.field580[++class69.field581 - 1] = (String)var15[var22];
								} else {
									class69.field579[++class94.field920 - 1] = (Integer)var15[var22];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == CS2Opcodes.DB_GETFIELDCOUNT) {
					class94.field920 -= 2;
					var4 = class69.field579[class94.field920];
					var20 = class69.field579[class94.field920 + 1];
					var6 = 0;
					var21 = class444.method6107(var20);
					var8 = class444.method8232(var20);
					class455 var29 = class99.method2059(var4);
					class461 var10 = class140.method2534(var21);
					int[] var11 = var10.field4898[var8];
					Object[] var12 = var29.method8144(var8);
					if (var12 == null && var10.field4895 != null) {
						var12 = var10.field4895[var8];
					}

					if (null != var12) {
						var6 = var12.length / var11.length;
					}

					class69.field579[++class94.field920 - 1] = var6;
					return 1;
				} else if (var0 != CS2Opcodes.DB_FINDALL_WITH_COUNT && var0 != CS2Opcodes.DB_FIND_FILTER) {
					if (var0 == CS2Opcodes.DB_GETROWTABLE) {
						var4 = class69.field579[--class94.field920];
						class455 var25 = class99.method2059(var4);
						class69.field579[++class94.field920 - 1] = var25.field4874;
						return 1;
					} else if (var0 == CS2Opcodes.DB_GETROW) {
						var4 = class69.field579[--class94.field920];
						var20 = -1;
						if (class50.field371 != null && var4 >= 0 && var4 < class50.field371.size()) {
							var20 = (Integer)class50.field371.get(var4);
						}

						class69.field579[++class94.field920 - 1] = var20;
						return 1;
					} else if (var0 != CS2Opcodes.DB_FIND_FILTER_WITH_COUNT && var0 != CS2Opcodes.DB_FINDALL) {
						return 2;
					} else {
						var4 = class69.field579[--class94.field920];
						var5 = class69.method2709(var4);
						var6 = class69.field579[--class94.field920];
						var7 = class93.method2008(var6);
						if (null == var7) {
							throw new RuntimeException();
						} else if (class444.method6107(var6) != client.field1982) {
							throw new RuntimeException();
						} else if (null == class50.field371 && class50.field371.isEmpty()) {
							throw new RuntimeException();
						} else {
							var8 = class444.method2859(var6);
							List var23 = var7.method8074(var5, var8);
							class50.field371 = new LinkedList(class50.field371);
							if (null != var23) {
								class50.field371.retainAll(var23);
							} else {
								class50.field371.clear();
							}

							class372.field4437 = class50.field371.iterator();
							if (var0 == CS2Opcodes.DB_FIND_FILTER_WITH_COUNT) {
								class69.field579[++class94.field920 - 1] = class50.field371.size();
							}

							return 1;
						}
					}
				} else {
					--class94.field920;
					var4 = class69.field579[class94.field920];
					class448 var24 = class416.method7667(var4);
					if (null == var24) {
						throw new RuntimeException();
					} else {
						class50.field371 = var24.method8074(0, 0);
						var6 = 0;
						if (class50.field371 != null) {
							client.field1982 = var4;
							class372.field4437 = class50.field371.iterator();
							var6 = class50.field371.size();
						}

						if (var0 == CS2Opcodes.DB_FINDALL_WITH_COUNT) {
							class69.field579[++class94.field920 - 1] = var6;
						}

						return 1;
					}
				}
			} else {
				if (class372.field4437 != null && class372.field4437.hasNext()) {
					class69.field579[++class94.field920 - 1] = (Integer)class372.field4437.next();
				} else {
					class69.field579[++class94.field920 - 1] = -1;
				}

				return 1;
			}
		} else {
			var4 = class69.field579[--class94.field920];
			var5 = class69.method2709(var4);
			var6 = class69.field579[--class94.field920];
			var7 = class93.method2008(var6);
			if (var7 == null) {
				throw new RuntimeException();
			} else {
				var8 = class444.method2859(var6);
				class50.field371 = var7.method8074(var5, var8);
				if (null != class50.field371) {
					client.field1982 = class444.method6107(var6);
					class372.field4437 = class50.field371.iterator();
					if (var0 == CS2Opcodes.DB_FIND_WITH_COUNT) {
						class69.field579[++class94.field920 - 1] = class50.field371.size();
					}
				} else {
					client.field1982 = -1;
					class372.field4437 = null;
					if (var0 == CS2Opcodes.DB_FIND_WITH_COUNT) {
						class69.field579[++class94.field920 - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	abstract void method7984(class467 var1, int var2);
}
