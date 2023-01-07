import io.spectralpowered.ObfInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(
	name = "ie"
)
public final class class181 {
	@ObfInfo(
		owner = "ie",
		name = "h",
		desc = "Z"
	)
	boolean field1665;
	@ObfInfo(
		owner = "ie",
		name = "e",
		desc = "Z"
	)
	boolean field1673;
	@ObfInfo(
		owner = "ie",
		name = "q",
		desc = "[[Liy;"
	)
	class144[][] field1666;
	@ObfInfo(
		owner = "ie",
		name = "v",
		desc = "Lil;"
	)
	class200 field1663;
	@ObfInfo(
		owner = "ie",
		name = "x",
		desc = "Lrx;"
	)
	class266 field1664;
	@ObfInfo(
		owner = "ie",
		name = "r",
		desc = "[Lra;"
	)
	class344[] field1661;
	@ObfInfo(
		owner = "ie",
		name = "i",
		desc = "I"
	)
	int field1670;
	@ObfInfo(
		owner = "ie",
		name = "g",
		desc = "I"
	)
	int field1672;
	@ObfInfo(
		owner = "ie",
		name = "o",
		desc = "I"
	)
	int field1674;
	@ObfInfo(
		owner = "ie",
		name = "n",
		desc = "I"
	)
	int field1675;
	@ObfInfo(
		owner = "ie",
		name = "f",
		desc = "Ljava/util/HashMap;"
	)
	HashMap field1667;
	@ObfInfo(
		owner = "ie",
		name = "m",
		desc = "Ljava/util/HashMap;"
	)
	HashMap field1668;
	@ObfInfo(
		owner = "ie",
		name = "b",
		desc = "Lly;"
	)
	final class274 field1662;
	@ObfInfo(
		owner = "ie",
		name = "u",
		desc = "Lly;"
	)
	final class274 field1669;
	@ObfInfo(
		owner = "ie",
		name = "j",
		desc = "Ljava/util/HashMap;"
	)
	final HashMap field1671;
	@ObfInfo(
		owner = "ie",
		name = "k",
		desc = "I"
	)
	public int field1676;

	@ObfInfo(
		owner = "ie",
		name = "<init>",
		desc = "([Lra;Ljava/util/HashMap;Lly;Lly;)V"
	)
	public class181(class344[] var1, HashMap var2, class274 var3, class274 var4) {
		this.field1665 = false;
		this.field1673 = false;
		this.field1667 = new HashMap();
		this.field1676 = 0;
		this.field1661 = var1;
		this.field1671 = var2;
		this.field1669 = var3;
		this.field1662 = var4;
	}

	@ObfInfo(
		owner = "ie",
		name = "h",
		desc = "(Lly;Ljava/lang/String;ZB)V"
	)
	public void method829(class274 var1, String var2, boolean var3) {
		if (!this.field1673) {
			this.field1665 = false;
			this.field1673 = true;
			System.nanoTime();
			int var5 = var1.method1356(class430.field3573.field3571);
			int var6 = var1.method1359(var5, var2);
			class127 var7 = new class127(var1.method1357(class430.field3573.field3571, var2));
			class127 var8 = new class127(var1.method1357(class430.field3569.field3571, var2));
			System.nanoTime();
			System.nanoTime();
			this.field1663 = new class200();

			try {
				this.field1663.method882(var7, var8, var6, var3);
			} catch (IllegalStateException var20) {
				return;
			}

			this.field1663.method233();
			this.field1663.method242();
			this.field1663.method235();
			this.field1672 = this.field1663.method236() * 64;
			this.field1670 = this.field1663.method231() * 64;
			this.field1674 = (this.field1663.method230() - this.field1663.method236() + 1) * 64;
			this.field1675 = (this.field1663.method232() - this.field1663.method231() + 1) * 64;
			int var17 = this.field1663.method230() - this.field1663.method236() + 1;
			int var10 = this.field1663.method232() - this.field1663.method231() + 1;
			System.nanoTime();
			System.nanoTime();
			class144.field1152.method440();
			this.field1666 = new class144[var17][var10];
			Iterator var11 = this.field1663.field1749.iterator();

			while (var11.hasNext()) {
				class35 var12 = (class35)var11.next();
				int var13 = var12.field3362;
				int var14 = var12.field3368;
				int var15 = var13 - this.field1663.method236();
				int var16 = var14 - this.field1663.method231();
				this.field1666[var15][var16] = new class144(var13, var14, this.field1663.method234(), this.field1671);
				this.field1666[var15][var16].method657(var12, this.field1663.field1751);
			}

			for (int var18 = 0; var18 < var17; ++var18) {
				for (int var19 = 0; var19 < var10; ++var19) {
					if (this.field1666[var18][var19] == null) {
						this.field1666[var18][var19] = new class144(this.field1663.method236() + var18, this.field1663.method231() + var19, this.field1663.method234(), this.field1671);
						this.field1666[var18][var19].method685(this.field1663.field1750, this.field1663.field1751);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.method1362(class430.field3572.field3571, var2)) {
				byte[] var21 = var1.method1357(class430.field3572.field3571, var2);
				this.field1664 = class476.method2357(var21);
			}

			System.nanoTime();
			var1.method1352();
			var1.method1366();
			this.field1665 = true;
		}
	}

	@ObfInfo(
		owner = "ie",
		name = "e",
		desc = "(I)V"
	)
	public final void method819() {
		this.field1668 = null;
	}

	@ObfInfo(
		owner = "ie",
		name = "v",
		desc = "(IIIIIIIII)V"
	)
	public final void method820(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var10 = class162.field1233;
		int var11 = class162.field1232;
		int var12 = class162.field1231;
		int[] var13 = new int[4];
		class162.method744(var13);
		class75 var14 = this.method824(var1, var2, var3, var4);
		float var15 = this.method828(var7 - var5, var3 - var1);
		int var16 = (int)Math.ceil((double)var15);
		this.field1676 = var16;
		if (!this.field1667.containsKey(var16)) {
			class393 var17 = new class393(var16);
			var17.method1921();
			this.field1667.put(var16, var17);
		}

		int var24 = var14.field661 + var14.field662 - 1;
		int var18 = var14.field663 + var14.field664 - 1;

		int var19;
		int var20;
		for (var19 = var14.field661; var19 <= var24; ++var19) {
			for (var20 = var14.field663; var20 <= var18; ++var20) {
				this.field1666[var19][var20].method662(var16, (class393)this.field1667.get(var16), this.field1661, this.field1669, this.field1662);
			}
		}

		class162.method748(var10, var11, var12);
		class162.method745(var13);
		var19 = (int)(var15 * 64.0F);
		var20 = this.field1672 + var1;
		int var21 = var2 + this.field1670;

		for (int var22 = var14.field661; var22 < var14.field662 + var14.field661; ++var22) {
			for (int var23 = var14.field663; var23 < var14.field664 + var14.field663; ++var23) {
				this.field1666[var22][var23].method656(var19 * (this.field1666[var22][var23].field1150 * 64 - var20) / 64 + var5, var8 - (64 + (this.field1666[var22][var23].field1157 * 64 - var21)) * var19 / 64, var19);
			}
		}

	}

	@ObfInfo(
		owner = "ie",
		name = "x",
		desc = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V"
	)
	public final void method821(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		class75 var15 = this.method824(var1, var2, var3, var4);
		float var16 = this.method828(var7 - var5, var3 - var1);
		int var17 = (int)(var16 * 64.0F);
		int var18 = var1 + this.field1672;
		int var19 = var2 + this.field1670;

		int var20;
		int var21;
		for (var20 = var15.field661; var20 < var15.field661 + var15.field662; ++var20) {
			for (var21 = var15.field663; var21 < var15.field663 + var15.field664; ++var21) {
				if (var13) {
					this.field1666[var20][var21].method665();
				}

				this.field1666[var20][var21].method663(var5 + (this.field1666[var20][var21].field1150 * 64 - var18) * var17 / 64, var8 - (this.field1666[var20][var21].field1157 * 64 - var19 + 64) * var17 / 64, var17, var9);
			}
		}

		if (null != var10 && var11 > 0) {
			for (var20 = var15.field661; var20 < var15.field661 + var15.field662; ++var20) {
				for (var21 = var15.field663; var21 < var15.field664 + var15.field663; ++var21) {
					this.field1666[var20][var21].method676(var10, var11, var12);
				}
			}
		}

	}

	@ObfInfo(
		owner = "ie",
		name = "m",
		desc = "(IIIILjava/util/HashSet;IIB)V"
	)
	public void method822(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (null != this.field1664) {
			this.field1664.method1231(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (this.field1668 == null) {
					this.method827();
				}

				Iterator var9 = var5.iterator();

				while (true) {
					List var11;
					do {
						if (!var9.hasNext()) {
							return;
						}

						int var10 = (Integer)var9.next();
						var11 = (List)this.field1668.get(var10);
					} while(null == var11);

					Iterator var12 = var11.iterator();

					while (var12.hasNext()) {
						class389 var13 = (class389)var12.next();
						int var14 = (var13.field3277.field3852 - this.field1672) * var3 / this.field1674;
						int var15 = var4 - var4 * (var13.field3277.field3853 - this.field1670) / this.field1675;
						class162.method740(var14 + var1, var2 + var15, 2, 16776960, 256);
					}
				}
			}
		}
	}

	@ObfInfo(
		owner = "ie",
		name = "q",
		desc = "(IIIIIIIIIIB)Ljava/util/List;"
	)
	public List method823(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var12 = new LinkedList();
		if (!this.field1665) {
			return var12;
		} else {
			class75 var13 = this.method824(var1, var2, var3, var4);
			float var14 = this.method828(var7, var3 - var1);
			int var15 = (int)(var14 * 64.0F);
			int var16 = this.field1672 + var1;
			int var17 = this.field1670 + var2;

			for (int var18 = var13.field661; var18 < var13.field662 + var13.field661; ++var18) {
				for (int var19 = var13.field663; var19 < var13.field664 + var13.field663; ++var19) {
					List var20 = this.field1666[var18][var19].method683(var5 + var15 * (this.field1666[var18][var19].field1150 * 64 - var16) / 64, var6 + var8 - (64 + (this.field1666[var18][var19].field1157 * 64 - var17)) * var15 / 64, var15, var9, var10);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}

			return var12;
		}
	}

	@ObfInfo(
		owner = "ie",
		name = "f",
		desc = "(IIIII)Lif;"
	)
	class75 method824(int var1, int var2, int var3, int var4) {
		class75 var6 = new class75(this);
		int var7 = this.field1672 + var1;
		int var8 = var2 + this.field1670;
		int var9 = this.field1672 + var3;
		int var10 = this.field1670 + var4;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.field662 = var13 - var11 + 1;
		var6.field664 = var14 - var12 + 1;
		var6.field661 = var11 - this.field1663.method236();
		var6.field663 = var12 - this.field1663.method231();
		if (var6.field661 < 0) {
			var6.field662 += var6.field661;
			var6.field661 = 0;
		}

		if (var6.field661 > this.field1666.length - var6.field662) {
			var6.field662 = this.field1666.length - var6.field661;
		}

		if (var6.field663 < 0) {
			var6.field664 += var6.field663;
			var6.field663 = 0;
		}

		if (var6.field663 > this.field1666[0].length - var6.field664) {
			var6.field664 = this.field1666[0].length - var6.field663;
		}

		var6.field662 = Math.min(var6.field662, this.field1666.length);
		var6.field664 = Math.min(var6.field664, this.field1666[0].length);
		return var6;
	}

	@ObfInfo(
		owner = "ie",
		name = "r",
		desc = "(B)Z"
	)
	public boolean method825() {
		return this.field1665;
	}

	@ObfInfo(
		owner = "ie",
		name = "u",
		desc = "(B)Ljava/util/HashMap;"
	)
	public HashMap method826() {
		this.method827();
		return this.field1668;
	}

	@ObfInfo(
		owner = "ie",
		name = "b",
		desc = "(I)V"
	)
	void method827() {
		if (null == this.field1668) {
			this.field1668 = new HashMap();
		}

		this.field1668.clear();

		for (int var2 = 0; var2 < this.field1666.length; ++var2) {
			for (int var3 = 0; var3 < this.field1666[var2].length; ++var3) {
				List var4 = this.field1666[var2][var3].method679();
				Iterator var5 = var4.iterator();

				while (var5.hasNext()) {
					class389 var6 = (class389)var5.next();
					if (var6.method1909()) {
						int var7 = var6.method1910();
						if (!this.field1668.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.field1668.put(var7, var8);
						} else {
							List var9 = (List)this.field1668.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "ie",
		name = "j",
		desc = "(III)F"
	)
	float method828(int var1, int var2) {
		float var4 = (float)var1 / (float)var2;
		if (var4 > 8.0F) {
			return 8.0F;
		} else if (var4 < 1.0F) {
			return 1.0F;
		} else {
			int var5 = Math.round(var4);
			return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
		}
	}
}
