import io.spectralpowered.ObfInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfInfo(
	name = "iy"
)
public class class144 {
	@ObfInfo(
		owner = "iy",
		name = "m",
		desc = "Ljj;"
	)
	public static class111 field1152;
	@ObfInfo(
		owner = "iy",
		name = "r",
		desc = "Lhd;"
	)
	class35 field1153;
	@ObfInfo(
		owner = "iy",
		name = "j",
		desc = "I"
	)
	int field1149;
	@ObfInfo(
		owner = "iy",
		name = "q",
		desc = "I"
	)
	int field1150;
	@ObfInfo(
		owner = "iy",
		name = "b",
		desc = "I"
	)
	int field1155;
	@ObfInfo(
		owner = "iy",
		name = "f",
		desc = "I"
	)
	int field1157;
	@ObfInfo(
		owner = "iy",
		name = "i",
		desc = "Ljava/util/HashMap;"
	)
	HashMap field1151;
	@ObfInfo(
		owner = "iy",
		name = "u",
		desc = "Ljava/util/LinkedList;"
	)
	LinkedList field1154;
	@ObfInfo(
		owner = "iy",
		name = "g",
		desc = "Ljava/util/List;"
	)
	List field1156;
	@ObfInfo(
		owner = "iy",
		name = "o",
		desc = "Ljava/util/HashMap;"
	)
	final HashMap field1158;

	static {
		field1152 = new class111(37748736, 256);
	}

	@ObfInfo(
		owner = "iy",
		name = "<init>",
		desc = "(IIILjava/util/HashMap;)V"
	)
	class144(int var1, int var2, int var3, HashMap var4) {
		this.field1150 = var1;
		this.field1157 = var2;
		this.field1154 = new LinkedList();
		this.field1156 = new LinkedList();
		this.field1151 = new HashMap();
		this.field1155 = var3 | -16777216;
		this.field1158 = var4;
	}

	@ObfInfo(
		owner = "iy",
		name = "v",
		desc = "(IIIB)V"
	)
	void method656(int var1, int var2, int var3) {
		class266 var5 = class447.method2233(this.field1150, this.field1157, this.field1149);
		if (null != var5) {
			if (var3 == this.field1149 * 64) {
				var5.method1229(var1, var2);
			} else {
				var5.method1243(var1, var2, var3, var3);
			}

		}
	}

	@ObfInfo(
		owner = "iy",
		name = "x",
		desc = "(Lhd;Ljava/util/List;I)V"
	)
	void method657(class35 var1, List var2) {
		this.field1151.clear();
		this.field1153 = var1;
		this.method660(var2);
	}

	@ObfInfo(
		owner = "iy",
		name = "m",
		desc = "(Ljava/util/HashSet;Ljava/util/List;B)V"
	)
	void method685(HashSet var1, List var2) {
		this.field1151.clear();
		Iterator var4 = var1.iterator();

		while (var4.hasNext()) {
			class468 var5 = (class468)var4.next();
			if (var5.method1979() == this.field1150 && var5.method1981() == this.field1157) {
				this.field1154.add(var5);
			}
		}

		this.method660(var2);
	}

	@ObfInfo(
		owner = "iy",
		name = "q",
		desc = "(IIIILin;I)V"
	)
	void method658(int var1, int var2, int var3, int var4, class400 var5) {
		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			label44:
			for (int var8 = var2; var8 < var2 + var4; ++var8) {
				for (int var9 = 0; var9 < var5.field3365; ++var9) {
					class387[] var10 = var5.field3366[var9][var7][var8];
					if (var10 != null && var10.length != 0) {
						class387[] var11 = var10;

						for (int var12 = 0; var12 < var11.length; ++var12) {
							class387 var13 = var11[var12];
							class87 var14 = class85.method356(var13.field3262);
							if (class122.method521(var14)) {
								this.method659(var14, var9, var7, var8, var5);
								continue label44;
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "f",
		desc = "(Lgn;IIILin;I)V"
	)
	void method659(class87 var1, int var2, int var3, int var4, class400 var5) {
		class464 var7 = new class464(var2, var3 + this.field1150 * 64, var4 + this.field1157 * 64);
		class464 var8 = null;
		if (null != this.field1153) {
			var8 = new class464(var2 + this.field1153.field3372, this.field1153.field3364 * 64 + var3, var4 + this.field1153.field3361 * 64);
		} else {
			class468 var9 = (class468)var5;
			var8 = new class464(var9.field3372 + var2, var9.field3364 * 64 + var3 + var9.method2285() * 8, var4 + var9.field3361 * 64 + var9.method2286() * 8);
		}

		class396 var10;
		Object var11;
		if (var1.field745 != null) {
			var11 = new class166(var8, var7, var1.field712, this);
		} else {
			var10 = class25.method100(var1.field733);
			var11 = new class450(var8, var7, var10.field3315, this.method689(var10));
		}

		var10 = class25.method100(((class389)var11).method1910());
		if (var10.field3322) {
			this.field1151.put(new class464(0, var3, var4), var11);
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "r",
		desc = "(I)V"
	)
	void method665() {
		Iterator var2 = this.field1151.values().iterator();

		while (var2.hasNext()) {
			class389 var3 = (class389)var2.next();
			if (var3 instanceof class166) {
				((class166)var3).method773();
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "u",
		desc = "(Ljava/util/List;B)V"
	)
	void method660(List var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			class450 var4 = (class450)var3.next();
			if (class25.method100(var4.field3744).field3322 && var4.field3277.field3852 >> 6 == this.field1150 && this.field1157 == var4.field3277.field3853 >> 6) {
				class450 var5 = new class450(var4.field3277, var4.field3277, var4.field3744, this.method677(var4.field3744));
				this.field1156.add(var5);
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "b",
		desc = "(I)V"
	)
	void method688() {
		if (this.field1153 != null) {
			this.field1153.method1980();
		} else {
			Iterator var2 = this.field1154.iterator();

			while (var2.hasNext()) {
				class468 var3 = (class468)var2.next();
				var3.method1980();
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "j",
		desc = "(Lly;B)Z"
	)
	boolean method661(class274 var1, byte var2) {
		this.field1151.clear();
		if (null != this.field1153) {
			if (var2 <= -1) {
				throw new IllegalStateException();
			} else {
				this.field1153.method1974(var1);
				if (this.field1153.method1973()) {
					if (var2 <= -1) {
						throw new IllegalStateException();
					} else {
						this.method658(0, 0, 64, 64, this.field1153);
						return true;
					}
				} else {
					return false;
				}
			}
		} else {
			boolean var3 = true;

			Iterator var4;
			class468 var5;
			for (var4 = this.field1154.iterator(); var4.hasNext(); var3 &= var5.method1973()) {
				if (var2 <= -1) {
					throw new IllegalStateException();
				}

				var5 = (class468)var4.next();
				var5.method1974(var1);
			}

			if (var3) {
				if (var2 <= -1) {
					throw new IllegalStateException();
				}

				var4 = this.field1154.iterator();

				while (var4.hasNext()) {
					if (var2 <= -1) {
						throw new IllegalStateException();
					}

					var5 = (class468)var4.next();
					this.method658(var5.method2287() * 8, var5.method2284() * 8, 8, 8, var5);
				}
			}

			return var3;
		}
	}

	@ObfInfo(
		owner = "iy",
		name = "g",
		desc = "(ILih;[Lra;Lly;Lly;B)V"
	)
	void method662(int var1, class393 var2, class344[] var3, class274 var4, class274 var5) {
		this.field1149 = var1;
		if (this.field1153 != null || !this.field1154.isEmpty()) {
			if (class447.method2233(this.field1150, this.field1157, var1) == null) {
				boolean var7 = true;
				var7 &= this.method661(var4, (byte)21);
				int var9;
				if (null != this.field1153) {
					var9 = this.field1153.field3360;
				} else {
					var9 = ((class400)this.field1154.getFirst()).field3360;
				}

				var7 &= var5.method1344(var9);
				if (var7) {
					byte[] var8 = var5.method1347(var9);
					class104 var10;
					if (var8 == null) {
						var10 = new class104();
					} else {
						var10 = new class104(class476.method2357(var8).field2205);
					}

					class266 var12 = new class266(this.field1149 * 64, this.field1149 * 64);
					var12.method1233();
					if (null != this.field1153) {
						this.method664(var2, var3, var10);
					} else {
						this.method681(var2, var3, var10);
					}

					class1.method1(var12, this.field1150, this.field1157, this.field1149);
					this.method688();
				}
			}
		}
	}

	@ObfInfo(
		owner = "iy",
		name = "i",
		desc = "(IIILjava/util/HashSet;S)V"
	)
	void method663(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.method671(var1, var2, var4, var3);
		this.method675(var1, var2, var4, var3);
	}

	@ObfInfo(
		owner = "iy",
		name = "o",
		desc = "(Ljava/util/HashSet;III)V"
	)
	void method676(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field1151.values().iterator();

		while (var5.hasNext()) {
			class389 var6 = (class389)var5.next();
			if (var6.method1909()) {
				int var7 = var6.method1910();
				if (var1.contains(var7)) {
					class396 var8 = class25.method100(var7);
					this.method673(var8, var6.field3276, var6.field3275, var2, var3);
				}
			}
		}

		this.method682(var1, var2, var3);
	}

	@ObfInfo(
		owner = "iy",
		name = "n",
		desc = "(Lih;[Lra;Lir;B)V"
	)
	void method664(class393 var1, class344[] var2, class104 var3) {
		int var5;
		int var6;
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method667(var5, var6, this.field1153, var1, var3);
				this.method668(var5, var6, this.field1153, var1);
			}
		}

		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method666(var5, var6, this.field1153, var1, var2);
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "k",
		desc = "(Lih;[Lra;Lir;B)V"
	)
	void method681(class393 var1, class344[] var2, class104 var3) {
		Iterator var5 = this.field1154.iterator();

		class468 var6;
		int var7;
		int var8;
		while (var5.hasNext()) {
			var6 = (class468)var5.next();

			for (var7 = var6.method2287() * 8; var7 < var6.method2287() * 8 + 8; ++var7) {
				for (var8 = var6.method2284() * 8; var8 < var6.method2284() * 8 + 8; ++var8) {
					this.method667(var7, var8, var6, var1, var3);
					this.method668(var7, var8, var6, var1);
				}
			}
		}

		var5 = this.field1154.iterator();

		while (var5.hasNext()) {
			var6 = (class468)var5.next();

			for (var7 = var6.method2287() * 8; var7 < var6.method2287() * 8 + 8; ++var7) {
				for (var8 = var6.method2284() * 8; var8 < var6.method2284() * 8 + 8; ++var8) {
					this.method666(var7, var8, var6, var1, var2);
				}
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "a",
		desc = "(IILin;Lih;[Lra;I)V"
	)
	void method666(int var1, int var2, class400 var3, class393 var4, class344[] var5) {
		this.method670(var1, var2, var3);
		this.method678(var1, var2, var3, var5);
	}

	@ObfInfo(
		owner = "iy",
		name = "s",
		desc = "(IILin;Lih;Lir;I)V"
	)
	void method667(int var1, int var2, class400 var3, class393 var4, class104 var5) {
		int var7 = var3.field3369[0][var1][var2] - 1;
		int var8 = var3.field3363[0][var1][var2] - 1;
		if (var7 == -1 && var8 == -1) {
			class162.method749(var1 * this.field1149, this.field1149 * (63 - var2), this.field1149, this.field1149, this.field1155);
		}

		int var9 = 16711935;
		if (var8 != -1) {
			var9 = class386.method1901(var8, this.field1155);
		}

		if (var8 > -1 && 0 == var3.field3370[0][var1][var2]) {
			class162.method749(this.field1149 * var1, (63 - var2) * this.field1149, this.field1149, this.field1149, var9);
		} else {
			int var10 = this.method669(var1, var2, var3, var5);
			if (var8 == -1) {
				class162.method749(var1 * this.field1149, this.field1149 * (63 - var2), this.field1149, this.field1149, var10);
			} else {
				var4.method1919(this.field1149 * var1, (63 - var2) * this.field1149, var10, var9, this.field1149, this.field1149, var3.field3370[0][var1][var2], var3.field3371[0][var1][var2]);
			}
		}
	}

	@ObfInfo(
		owner = "iy",
		name = "l",
		desc = "(IILin;Lih;I)V"
	)
	void method668(int var1, int var2, class400 var3, class393 var4) {
		for (int var6 = 1; var6 < var3.field3365; ++var6) {
			int var7 = var3.field3363[var6][var1][var2] - 1;
			if (var7 > -1) {
				int var8 = class386.method1901(var7, this.field1155);
				if (var3.field3370[var6][var1][var2] == 0) {
					class162.method749(this.field1149 * var1, (63 - var2) * this.field1149, this.field1149, this.field1149, var8);
				} else {
					var4.method1919(this.field1149 * var1, (63 - var2) * this.field1149, 0, var8, this.field1149, this.field1149, var3.field3370[var6][var1][var2], var3.field3371[var6][var1][var2]);
				}
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "t",
		desc = "(IILin;Lir;I)I"
	)
	int method669(int var1, int var2, class400 var3, class104 var4) {
		return 0 == var3.field3369[0][var1][var2] ? this.field1155 : var4.method416(var1, var2);
	}

	@ObfInfo(
		owner = "iy",
		name = "c",
		desc = "(IILin;[Lra;B)V"
	)
	void method678(int var1, int var2, class400 var3, class344[] var4) {
		for (int var6 = 0; var6 < var3.field3365; ++var6) {
			class387[] var7 = var3.field3366[var6][var1][var2];
			if (var7 != null && var7.length != 0) {
				class387[] var8 = var7;

				for (int var9 = 0; var9 < var8.length; ++var9) {
					class387 var10 = var8[var9];
					int var12 = var10.field3261;
					boolean var11 = var12 >= class394.field3304.field3307 && var12 <= class394.field3305.field3307;
					if (var11 || class332.method1675(var10.field3261)) {
						class87 var13 = class85.method356(var10.field3262);
						if (-1 != var13.field725) {
							if (46 != var13.field725 && var13.field725 != 52) {
								var4[var13.field725].method1750(var1 * this.field1149, this.field1149 * (63 - var2), this.field1149 * 2, this.field1149 * 2);
							} else {
								var4[var13.field725].method1750(this.field1149 * var1, (63 - var2) * this.field1149, this.field1149 * 2 + 1, this.field1149 * 2 + 1);
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "p",
		desc = "(IILin;I)V"
	)
	void method670(int var1, int var2, class400 var3) {
		for (int var5 = 0; var5 < var3.field3365; ++var5) {
			class387[] var6 = var3.field3366[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				class387[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					class387 var9 = var7[var8];
					int var11 = var9.field3261;
					boolean var10 = var11 >= class394.field3285.field3307 && var11 <= class394.field3293.field3307 || var11 == class394.field3299.field3307;
					if (var10) {
						class87 var12 = class85.method356(var9.field3262);
						int var13 = var12.field724 != 0 ? -3407872 : -3355444;
						if (class394.field3285.field3307 == var9.field3261) {
							this.method680(var1, var2, var9.field3260, var13);
						}

						if (var9.field3261 == class394.field3287.field3307) {
							this.method680(var1, var2, var9.field3260, -3355444);
							this.method680(var1, var2, 1 + var9.field3260, var13);
						}

						if (class394.field3293.field3307 == var9.field3261) {
							if (0 == var9.field3260) {
								class162.method752(this.field1149 * var1, (63 - var2) * this.field1149, 1, var13);
							}

							if (var9.field3260 == 1) {
								class162.method752(var1 * this.field1149 + this.field1149 - 1, this.field1149 * (63 - var2), 1, var13);
							}

							if (2 == var9.field3260) {
								class162.method752(this.field1149 + var1 * this.field1149 - 1, this.field1149 + (63 - var2) * this.field1149 - 1, 1, var13);
							}

							if (var9.field3260 == 3) {
								class162.method752(var1 * this.field1149, this.field1149 * (63 - var2) + this.field1149 - 1, 1, var13);
							}
						}

						if (var9.field3261 == class394.field3299.field3307) {
							int var14 = var9.field3260 % 2;
							int var15;
							if (var14 == 0) {
								for (var15 = 0; var15 < this.field1149; ++var15) {
									class162.method752(var15 + this.field1149 * var1, (64 - var2) * this.field1149 - 1 - var15, 1, var13);
								}
							} else {
								for (var15 = 0; var15 < this.field1149; ++var15) {
									class162.method752(var15 + var1 * this.field1149, var15 + (63 - var2) * this.field1149, 1, var13);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "d",
		desc = "(IILjava/util/HashSet;II)V"
	)
	void method671(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		float var7 = var6 / 2.0F;
		Iterator var8 = this.field1151.entrySet().iterator();

		while (var8.hasNext()) {
			Entry var9 = (Entry)var8.next();
			class464 var10 = (class464)var9.getKey();
			int var11 = (int)((float)var10.field3852 * var6 + (float)var1 - var7);
			int var12 = (int)((float)(var2 + var4) - var6 * (float)var10.field3853 - var7);
			class389 var13 = (class389)var9.getValue();
			if (var13 != null && var13.method1909()) {
				var13.field3276 = var11;
				var13.field3275 = var12;
				class396 var14 = class25.method100(var13.method1910());
				if (!var3.contains(var14.method1948())) {
					this.method684(var13, var11, var12, var6);
				}
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "y",
		desc = "(Ljava/util/HashSet;III)V"
	)
	void method682(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field1156.iterator();

		while (var5.hasNext()) {
			class389 var6 = (class389)var5.next();
			if (var6.method1909()) {
				class396 var7 = class25.method100(var6.method1910());
				if (var7 != null && var1.contains(var7.method1948())) {
					this.method673(var7, var6.field3276, var6.field3275, var2, var3);
				}
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "z",
		desc = "(Lfm;IIIIB)V"
	)
	void method673(class396 var1, int var2, int var3, int var4, int var5) {
		class266 var7 = var1.method1946(false);
		if (null != var7) {
			var7.method1240(var2 - var7.field2200 / 2, var3 - var7.field2199 / 2);
			if (var4 % var5 < var5 / 2) {
				class162.method740(var2, var3, 15, 16776960, 128);
				class162.method740(var2, var3, 7, 16777215, 256);
			}

		}
	}

	@ObfInfo(
		owner = "iy",
		name = "w",
		desc = "(Lix;IIFI)V"
	)
	void method684(class389 var1, int var2, int var3, float var4) {
		class396 var6 = class25.method100(var1.method1910());
		this.method687(var6, var2, var3);
		this.method674(var1, var6, var2, var3, var4);
	}

	@ObfInfo(
		owner = "iy",
		name = "as",
		desc = "(Lfm;III)V"
	)
	void method687(class396 var1, int var2, int var3) {
		class266 var5 = var1.method1946(false);
		if (null != var5) {
			int var6 = this.method686(var5, var1.field3317);
			int var7 = this.method672(var5, var1.field3331);
			var5.method1240(var6 + var2, var7 + var3);
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "ad",
		desc = "(Lix;Lfm;IIFI)V"
	)
	void method674(class389 var1, class396 var2, int var3, int var4, float var5) {
		class23 var7 = var1.method1911();
		if (null != var7) {
			if (var7.field109.method979(var5)) {
				class58 var8 = (class58)this.field1158.get(var7.field109);
				var8.method2028(var7.field108, var3 - var7.field107 / 2, var4, var7.field107, var7.field106, -16777216 | var2.field3332, 0, 1, 0, var8.field3442 / 2);
			}
		}
	}

	@ObfInfo(
		owner = "iy",
		name = "ao",
		desc = "(IILjava/util/HashSet;IB)V"
	)
	void method675(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		Iterator var7 = this.field1156.iterator();

		while (var7.hasNext()) {
			class389 var8 = (class389)var7.next();
			if (var8.method1909()) {
				int var9 = var8.field3277.field3852 % 64;
				int var10 = var8.field3277.field3853 % 64;
				var8.field3276 = (int)((float)var1 + var6 * (float)var9);
				var8.field3275 = (int)((float)(63 - var10) * var6 + (float)var2);
				if (!var3.contains(var8.method1910())) {
					this.method684(var8, var8.field3276, var8.field3275, var6);
				}
			}
		}

	}

	@ObfInfo(
		owner = "iy",
		name = "am",
		desc = "(Lrx;Lgj;I)I"
	)
	int method686(class266 var1, class265 var2) {
		switch(var2.field2196) {
		case 1:
			return -var1.field2200 / 2;
		case 2:
			return 0;
		default:
			return -var1.field2200;
		}
	}

	@ObfInfo(
		owner = "iy",
		name = "av",
		desc = "(Lrx;Lgl;B)I"
	)
	int method672(class266 var1, class1 var2) {
		switch(var2.field2) {
		case 0:
			return 0;
		case 2:
			return -var1.field2199 / 2;
		default:
			return -var1.field2199;
		}
	}

	@ObfInfo(
		owner = "iy",
		name = "ar",
		desc = "(II)Lii;"
	)
	class23 method677(int var1) {
		class396 var3 = class25.method100(var1);
		return this.method689(var3);
	}

	@ObfInfo(
		owner = "iy",
		name = "at",
		desc = "(Lfm;I)Lii;"
	)
	class23 method689(class396 var1) {
		if (var1.field3318 != null && this.field1158 != null && this.field1158.get(class221.field1903) != null) {
			int var4 = var1.field3321;
			class221[] var5 = class221.method976();
			int var6 = 0;

			class221 var3;
			while (true) {
				if (var6 >= var5.length) {
					var3 = null;
					break;
				}

				class221 var7 = var5[var6];
				if (var4 == var7.field1905) {
					var3 = var7;
					break;
				}

				++var6;
			}

			if (null == var3) {
				return null;
			} else {
				class58 var15 = (class58)this.field1158.get(var3);
				if (var15 == null) {
					return null;
				} else {
					int var16 = var15.method2024(var1.field3318, 1000000);
					String[] var8 = new String[var16];
					var15.method2022(var1.field3318, (int[])null, var8);
					int var9 = var8.length * var15.field3442 / 2;
					int var10 = 0;
					String[] var11 = var8;

					for (int var12 = 0; var12 < var11.length; ++var12) {
						String var13 = var11[var12];
						int var14 = var15.method2045(var13);
						if (var14 > var10) {
							var10 = var14;
						}
					}

					return new class23(var1.field3318, var10, var9, var3);
				}
			}
		} else {
			return null;
		}
	}

	@ObfInfo(
		owner = "iy",
		name = "ay",
		desc = "(IIIIIS)Ljava/util/List;"
	)
	List method683(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var1 + var3 && var5 < var2 + var3) {
				Iterator var8 = this.field1151.values().iterator();

				class389 var9;
				while (var8.hasNext()) {
					var9 = (class389)var8.next();
					if (var9.method1909() && var9.method1905(var4, var5)) {
						var7.add(var9);
					}
				}

				var8 = this.field1156.iterator();

				while (var8.hasNext()) {
					var9 = (class389)var8.next();
					if (var9.method1909() && var9.method1905(var4, var5)) {
						var7.add(var9);
					}
				}

				return var7;
			} else {
				return var7;
			}
		} else {
			return var7;
		}
	}

	@ObfInfo(
		owner = "iy",
		name = "an",
		desc = "(B)Ljava/util/List;"
	)
	List method679() {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.field1156);
		var2.addAll(this.field1151.values());
		return var2;
	}

	@ObfInfo(
		owner = "iy",
		name = "ab",
		desc = "(IIIII)V"
	)
	void method680(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			class162.method753(var1 * this.field1149, this.field1149 * (63 - var2), this.field1149, var4);
		}

		if (var3 == 1) {
			class162.method752(this.field1149 * var1, this.field1149 * (63 - var2), this.field1149, var4);
		}

		if (var3 == 2) {
			class162.method753(this.field1149 + var1 * this.field1149 - 1, (63 - var2) * this.field1149, this.field1149, var4);
		}

		if (var3 == 3) {
			class162.method752(this.field1149 * var1, (63 - var2) * this.field1149 + this.field1149 - 1, this.field1149, var4);
		}

	}
}
