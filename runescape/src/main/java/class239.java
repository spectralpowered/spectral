import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class239 {
	boolean field2868;
	boolean field2876;
	class246 field2866;
	class259[][] field2869;
	class469[] field2864;
	class491 field2867;
	int field2873;
	int field2875;
	int field2877;
	int field2878;
	HashMap field2870;
	HashMap field2871;
	final class337 field2865;
	final class337 field2872;
	final HashMap field2874;
	public int field2879;

	public class239(class469[] var1, HashMap var2, class337 var3, class337 var4) {
		this.field2868 = false;
		this.field2876 = false;
		this.field2870 = new HashMap();
		this.field2879 = 0;
		this.field2864 = var1;
		this.field2874 = var2;
		this.field2872 = var3;
		this.field2865 = var4;
	}

	public void method4781(class337 var1, String var2, boolean var3) {
		if (!this.field2876) {
			this.field2868 = false;
			this.field2876 = true;
			System.nanoTime();
			int var5 = var1.method6319(class237.field2851.field2849);
			int var6 = var1.method6326(var5, var2);
			class467 var7 = new class467(var1.method6322(class237.field2851.field2849, var2));
			class467 var8 = new class467(var1.method6322(class237.field2846.field2849, var2));
			System.nanoTime();
			System.nanoTime();
			this.field2866 = new class246();

			try {
				this.field2866.method4884(var7, var8, var6, var3);
			} catch (IllegalStateException var20) {
				return;
			}

			this.field2866.method4993();
			this.field2866.method5035();
			this.field2866.method4995();
			this.field2875 = this.field2866.method5001() * 64;
			this.field2873 = this.field2866.method4991() * 64;
			this.field2877 = (this.field2866.method4990() - this.field2866.method5001() + 1) * 64;
			this.field2878 = (this.field2866.method4992() - this.field2866.method4991() + 1) * 64;
			int var17 = this.field2866.method4990() - this.field2866.method5001() + 1;
			int var10 = this.field2866.method4992() - this.field2866.method4991() + 1;
			System.nanoTime();
			System.nanoTime();
			class259.field3006.method5279();
			this.field2869 = new class259[var17][var10];
			Iterator var11 = this.field2866.field2909.iterator();

			while (var11.hasNext()) {
				class212 var12 = (class212)var11.next();
				int var13 = var12.field2921;
				int var14 = var12.field2927;
				int var15 = var13 - this.field2866.method5001();
				int var16 = var14 - this.field2866.method4991();
				this.field2869[var15][var16] = new class259(var13, var14, this.field2866.method4994(), this.field2874);
				this.field2869[var15][var16].method5121(var12, this.field2866.field2911);
			}

			for (int var18 = 0; var18 < var17; ++var18) {
				for (int var19 = 0; var19 < var10; ++var19) {
					if (this.field2869[var18][var19] == null) {
						this.field2869[var18][var19] = new class259(this.field2866.method5001() + var18, this.field2866.method4991() + var19, this.field2866.method4994(), this.field2874);
						this.field2869[var18][var19].method5212(this.field2866.field2910, this.field2866.field2911);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.method6358(class237.field2850.field2849, var2)) {
				byte[] var21 = var1.method6322(class237.field2850.field2849, var2);
				this.field2867 = class47.method6425(var21);
			}

			System.nanoTime();
			var1.method6313();
			var1.method6375();
			this.field2868 = true;
		}
	}

	public final void method4755() {
		this.field2871 = null;
	}

	public final void method4756(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var10 = class478.field5012;
		int var11 = class478.field5011;
		int var12 = class478.field5010;
		int[] var13 = new int[4];
		class478.method8674(var13);
		class240 var14 = this.method4760(var1, var2, var3, var4);
		float var15 = this.method4771(var7 - var5, var3 - var1);
		int var16 = (int)Math.ceil((double)var15);
		this.field2879 = var16;
		if (!this.field2870.containsKey(var16)) {
			class242 var17 = new class242(var16);
			var17.method4814();
			this.field2870.put(var16, var17);
		}

		int var24 = var14.field2880 + var14.field2882 - 1;
		int var18 = var14.field2883 + var14.field2885 - 1;

		int var19;
		int var20;
		for (var19 = var14.field2880; var19 <= var24; ++var19) {
			for (var20 = var14.field2883; var20 <= var18; ++var20) {
				this.field2869[var19][var20].method5129(var16, (class242)this.field2870.get(var16), this.field2864, this.field2872, this.field2865);
			}
		}

		class478.method8679(var10, var11, var12);
		class478.method8675(var13);
		var19 = (int)(var15 * 64.0F);
		var20 = this.field2875 + var1;
		int var21 = var2 + this.field2873;

		for (int var22 = var14.field2880; var22 < var14.field2882 + var14.field2880; ++var22) {
			for (int var23 = var14.field2883; var23 < var14.field2885 + var14.field2883; ++var23) {
				this.field2869[var22][var23].method5120(var19 * (this.field2869[var22][var23].field3004 * 64 - var20) / 64 + var5, var8 - (64 + (this.field2869[var22][var23].field3012 * 64 - var21)) * var19 / 64, var19);
			}
		}

	}

	public final void method4757(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		class240 var15 = this.method4760(var1, var2, var3, var4);
		float var16 = this.method4771(var7 - var5, var3 - var1);
		int var17 = (int)(var16 * 64.0F);
		int var18 = var1 + this.field2875;
		int var19 = var2 + this.field2873;

		int var20;
		int var21;
		for (var20 = var15.field2880; var20 < var15.field2880 + var15.field2882; ++var20) {
			for (var21 = var15.field2883; var21 < var15.field2883 + var15.field2885; ++var21) {
				if (var13) {
					this.field2869[var20][var21].method5133();
				}

				this.field2869[var20][var21].method5130(var5 + (this.field2869[var20][var21].field3004 * 64 - var18) * var17 / 64, var8 - (this.field2869[var20][var21].field3012 * 64 - var19 + 64) * var17 / 64, var17, var9);
			}
		}

		if (null != var10 && var11 > 0) {
			for (var20 = var15.field2880; var20 < var15.field2880 + var15.field2882; ++var20) {
				for (var21 = var15.field2883; var21 < var15.field2885 + var15.field2883; ++var21) {
					this.field2869[var20][var21].method5147(var10, var11, var12);
				}
			}
		}

	}

	public void method4758(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (null != this.field2867) {
			this.field2867.method8852(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (this.field2871 == null) {
					this.method4763();
				}

				Iterator var9 = var5.iterator();

				while (true) {
					List var11;
					do {
						if (!var9.hasNext()) {
							return;
						}

						int var10 = (Integer)var9.next();
						var11 = (List)this.field2871.get(var10);
					} while(null == var11);

					Iterator var12 = var11.iterator();

					while (var12.hasNext()) {
						class258 var13 = (class258)var12.next();
						int var14 = (var13.field3000.field3709 - this.field2875) * var3 / this.field2877;
						int var15 = var4 - var4 * (var13.field3000.field3710 - this.field2873) / this.field2878;
						class478.method8670(var14 + var1, var2 + var15, 2, 16776960, 256);
					}
				}
			}
		}
	}

	public List method4759(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var12 = new LinkedList();
		if (!this.field2868) {
			return var12;
		} else {
			class240 var13 = this.method4760(var1, var2, var3, var4);
			float var14 = this.method4771(var7, var3 - var1);
			int var15 = (int)(var14 * 64.0F);
			int var16 = this.field2875 + var1;
			int var17 = this.field2873 + var2;

			for (int var18 = var13.field2880; var18 < var13.field2882 + var13.field2880; ++var18) {
				for (int var19 = var13.field2883; var19 < var13.field2885 + var13.field2883; ++var19) {
					List var20 = this.field2869[var18][var19].method5179(var5 + var15 * (this.field2869[var18][var19].field3004 * 64 - var16) / 64, var6 + var8 - (64 + (this.field2869[var18][var19].field3012 * 64 - var17)) * var15 / 64, var15, var9, var10);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}

			return var12;
		}
	}

	class240 method4760(int var1, int var2, int var3, int var4) {
		class240 var6 = new class240(this);
		int var7 = this.field2875 + var1;
		int var8 = var2 + this.field2873;
		int var9 = this.field2875 + var3;
		int var10 = this.field2873 + var4;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.field2882 = var13 - var11 + 1;
		var6.field2885 = var14 - var12 + 1;
		var6.field2880 = var11 - this.field2866.method5001();
		var6.field2883 = var12 - this.field2866.method4991();
		if (var6.field2880 < 0) {
			var6.field2882 += var6.field2880;
			var6.field2880 = 0;
		}

		if (var6.field2880 > this.field2869.length - var6.field2882) {
			var6.field2882 = this.field2869.length - var6.field2880;
		}

		if (var6.field2883 < 0) {
			var6.field2885 += var6.field2883;
			var6.field2883 = 0;
		}

		if (var6.field2883 > this.field2869[0].length - var6.field2885) {
			var6.field2885 = this.field2869[0].length - var6.field2883;
		}

		var6.field2882 = Math.min(var6.field2882, this.field2869.length);
		var6.field2885 = Math.min(var6.field2885, this.field2869[0].length);
		return var6;
	}

	public boolean method4761() {
		return this.field2868;
	}

	public HashMap method4762() {
		this.method4763();
		return this.field2871;
	}

	void method4763() {
		if (null == this.field2871) {
			this.field2871 = new HashMap();
		}

		this.field2871.clear();

		for (int var2 = 0; var2 < this.field2869.length; ++var2) {
			for (int var3 = 0; var3 < this.field2869[var2].length; ++var3) {
				List var4 = this.field2869[var2][var3].method5151();
				Iterator var5 = var4.iterator();

				while (var5.hasNext()) {
					class258 var6 = (class258)var5.next();
					if (var6.method5103()) {
						int var7 = var6.method5105();
						if (!this.field2871.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.field2871.put(var7, var8);
						} else {
							List var9 = (List)this.field2871.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}

	}

	float method4771(int var1, int var2) {
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
