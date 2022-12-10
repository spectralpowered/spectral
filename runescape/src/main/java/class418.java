import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class418 {
	static final class436 field4657;
	static final class436 field4658;
	static final class436 field4667;
	boolean field4681;
	boolean field4692;
	boolean field4698;
	class239 field4650;
	class254 field4664;
	class254 field4665;
	class254 field4666;
	class311 field4704;
	class337 field4654;
	class337 field4655;
	class337 field4656;
	class386 field4660;
	class419 field4668;
	class469[] field4700;
	class491 field4662;
	float field4673;
	float field4680;
	int field4651;
	int field4659;
	int field4669;
	int field4671;
	int field4672;
	int field4674;
	int field4675;
	int field4676;
	int field4677;
	int field4678;
	int field4683;
	int field4684;
	int field4686;
	int field4687;
	int field4688;
	int field4690;
	int field4691;
	int field4694;
	int field4699;
	int field4703;
	int field4707;
	int field4708;
	int field4709;
	HashMap field4661;
	HashMap field4663;
	HashSet field4670;
	HashSet field4682;
	HashSet field4685;
	HashSet field4695;
	HashSet field4696;
	HashSet field4697;
	Iterator field4702;
	List field4701;
	long field4689;
	final int[] field4710;
	public boolean field4705;

	public class418() {
		this.field4671 = -1;
		this.field4672 = -1;
		this.field4675 = -1;
		this.field4676 = -1;
		this.field4674 = -1;
		this.field4678 = -1;
		this.field4677 = 3;
		this.field4690 = 50;
		this.field4681 = false;
		this.field4682 = null;
		this.field4683 = -1;
		this.field4684 = -1;
		this.field4687 = -1;
		this.field4686 = -1;
		this.field4708 = -1;
		this.field4688 = -1;
		this.field4692 = true;
		this.field4685 = new HashSet();
		this.field4670 = new HashSet();
		this.field4696 = new HashSet();
		this.field4697 = new HashSet();
		this.field4698 = false;
		this.field4699 = 0;
		this.field4710 = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field4695 = new HashSet();
		this.field4704 = null;
		this.field4705 = false;
		this.field4709 = -1;
		this.field4651 = -1;
		this.field4694 = -1;
	}

	static {
		field4657 = class436.field4789;
		field4658 = class436.field4790;
		field4667 = class436.field4786;
	}

	public void method7674(class337 var1, class337 var2, class337 var3, class386 var4, HashMap var5, class469[] var6) {
		this.field4700 = var6;
		this.field4654 = var1;
		this.field4655 = var2;
		this.field4656 = var3;
		this.field4660 = var4;
		this.field4661 = new HashMap();
		this.field4661.put(class251.field2950, var5.get(field4657));
		this.field4661.put(class251.field2949, var5.get(field4658));
		this.field4661.put(class251.field2951, var5.get(field4667));
		this.field4668 = new class419(var1);
		int var8 = this.field4654.method6319(class237.field2851.field2849);
		int[] var9 = this.field4654.method6312(var8);
		this.field4663 = new HashMap(var9.length);

		for (int var10 = 0; var10 < var9.length; ++var10) {
			class467 var11 = new class467(this.field4654.method6374(var8, var9[var10]));
			class254 var12 = new class254();
			var12.method4976(var11, var9[var10]);
			this.field4663.put(var12.method4985(), var12);
			if (var12.method5014()) {
				this.field4664 = var12;
			}
		}

		this.method7688(this.field4664);
		this.field4666 = null;
	}

	public void method7675() {
		class259.field3006.method5295(5);
	}

	public void method7676(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.field4668.method7882()) {
			this.method7838();
			this.method7730();
			if (var3) {
				int var9 = (int)Math.ceil((double)((float)var6 / this.field4673));
				int var10 = (int)Math.ceil((double)((float)var7 / this.field4673));
				List var11 = this.field4650.method4759(this.field4669 - var9 / 2 - 1, this.field4659 - var10 / 2 - 1, this.field4669 + var9 / 2 + 1, 1 + var10 / 2 + this.field4659, var4, var5, var6, var7, var1, var2);
				HashSet var12 = new HashSet();

				Iterator var13;
				class258 var14;
				class80 var15;
				class271 var16;
				for (var13 = var11.iterator(); var13.hasNext(); class69.method2874(var15)) {
					var14 = (class258)var13.next();
					var12.add(var14);
					var15 = new class80();
					var16 = new class271(var14.method5105(), var14.field2997, var14.field3000);
					var15.method1603(new Object[]{var16, var1, var2});
					if (this.field4695.contains(var14)) {
						var15.method1604(17);
					} else {
						var15.method1604(15);
					}
				}

				var13 = this.field4695.iterator();

				while (var13.hasNext()) {
					var14 = (class258)var13.next();
					if (!var12.contains(var14)) {
						var15 = new class80();
						var16 = new class271(var14.method5105(), var14.field2997, var14.field3000);
						var15.method1603(new Object[]{var16, var1, var2});
						var15.method1604(16);
						class69.method2874(var15);
					}
				}

				this.field4695 = var12;
			}
		}
	}

	public void method7677(int var1, int var2, boolean var3, boolean var4) {
		long var6 = class74.method1493();
		this.method7678(var1, var2, var4, var6);
		if (!this.method7683() && (var4 || var3) && !class217.method4524()) {
			if (var4) {
				this.field4708 = var1;
				this.field4688 = var2;
				this.field4687 = this.field4669;
				this.field4686 = this.field4659;
			}

			if (-1 != this.field4687) {
				int var8 = var1 - this.field4708;
				int var9 = var2 - this.field4688;
				this.method7681(this.field4687 - (int)((float)var8 / this.field4680), (int)((float)var9 / this.field4680) + this.field4686, false);
			}
		} else {
			this.method7682();
		}

		if (var4) {
			this.field4689 = var6;
			this.field4703 = var1;
			this.field4691 = var2;
		}

	}

	void method7678(int var1, int var2, boolean var3, long var4) {
		if (null != this.field4665) {
			int var6 = (int)((float)this.field4669 + ((float)(var1 - this.field4674) - (float)this.method7709() * this.field4673 / 2.0F) / this.field4673);
			int var7 = (int)((float)this.field4659 - ((float)(var2 - this.field4678) - (float)this.method7710() * this.field4673 / 2.0F) / this.field4673);
			this.field4704 = this.field4665.method4981(var6 + this.field4665.method5001() * 64, var7 + this.field4665.method4991() * 64);
			if (null != this.field4704 && var3) {
				class185 var8 = client.field1929;
				int var11;
				int var12;
				if (class172.method2923() && var8.method3567(82) && var8.method3567(81)) {
					int var15 = this.field4704.field3709;
					var11 = this.field4704.field3710;
					var12 = this.field4704.field3708;
					class284 var13 = class152.method2679(class276.field3265, client.field1748.field1105);
					var13.field3321.method8383(var11);
					var13.field3321.method8354(var12);
					var13.field3321.method8364(var15);
					var13.field3321.method8377(0);
					client.field1748.method2173(var13);
				} else {
					boolean var10 = true;
					if (this.field4692) {
						var11 = var1 - this.field4703;
						var12 = var2 - this.field4691;
						if (var4 - this.field4689 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						class284 var14 = class152.method2679(class276.field3253, client.field1748.field1105);
						var14.field3321.method8312(this.field4704.method6132());
						client.field1748.method2173(var14);
						this.field4689 = 0L;
					}
				}
			}
		} else {
			this.field4704 = null;
		}

	}

	void method7838() {
		if (null != class40.field285) {
			this.field4673 = this.field4680;
		} else {
			if (this.field4673 < this.field4680) {
				this.field4673 = Math.min(this.field4680, this.field4673 + this.field4673 / 30.0F);
			}

			if (this.field4673 > this.field4680) {
				this.field4673 = Math.max(this.field4680, this.field4673 - this.field4673 / 30.0F);
			}

		}
	}

	void method7730() {
		if (this.method7683()) {
			int var2 = this.field4671 - this.field4669;
			int var3 = this.field4672 - this.field4659;
			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			if (var3 != 0) {
				var3 /= Math.min(8, Math.abs(var3));
			}

			this.method7681(var2 + this.field4669, this.field4659 + var3, true);
			if (this.field4671 == this.field4669 && this.field4672 == this.field4659) {
				this.field4671 = -1;
				this.field4672 = -1;
			}

		}
	}

	final void method7681(int var1, int var2, boolean var3) {
		this.field4669 = var1;
		this.field4659 = var2;
		class74.method1493();
		if (var3) {
			this.method7682();
		}

	}

	final void method7682() {
		this.field4688 = -1;
		this.field4708 = -1;
		this.field4686 = -1;
		this.field4687 = -1;
	}

	boolean method7683() {
		return this.field4671 != -1 && this.field4672 != -1;
	}

	public class254 method7684(int var1, int var2, int var3) {
		Iterator var5 = this.field4663.values().iterator();

		class254 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (class254)var5.next();
		} while(!var6.method5022(var1, var2, var3));

		return var6;
	}

	public void method7685(int var1, int var2, int var3, boolean var4) {
		class254 var6 = this.method7684(var1, var2, var3);
		if (var6 == null) {
			if (!var4) {
				return;
			}

			var6 = this.field4664;
		}

		boolean var7 = false;
		if (var6 != this.field4666 || var4) {
			this.field4666 = var6;
			this.method7688(var6);
			var7 = true;
		}

		if (var7 || var4) {
			this.method7691(var1, var2, var3);
		}

	}

	public void method7686(int var1) {
		class254 var3 = this.method7702(var1);
		if (null != var3) {
			this.method7688(var3);
		}

	}

	public int method7822() {
		return this.field4665 == null ? -1 : this.field4665.method4983();
	}

	public class254 method7687() {
		return this.field4665;
	}

	void method7688(class254 var1) {
		if (this.field4665 == null || this.field4665 != var1) {
			this.method7689(var1);
			this.method7691(-1, -1, -1);
		}
	}

	void method7689(class254 var1) {
		this.field4665 = var1;
		this.field4650 = new class239(this.field4700, this.field4661, this.field4655, this.field4656);
		this.field4668.method7880(this.field4665.method4985());
	}

	public void method7732(class254 var1, class311 var2, class311 var3, boolean var4) {
		if (var1 != null) {
			if (this.field4665 == null || var1 != this.field4665) {
				this.method7689(var1);
			}

			if (!var4 && this.field4665.method5022(var2.field3708, var2.field3709, var2.field3710)) {
				this.method7691(var2.field3708, var2.field3709, var2.field3710);
			} else {
				this.method7691(var3.field3708, var3.field3709, var3.field3710);
			}

		}
	}

	void method7691(int var1, int var2, int var3) {
		if (null != this.field4665) {
			int[] var5 = this.field4665.method5013(var1, var2, var3);
			if (null == var5) {
				var5 = this.field4665.method5013(this.field4665.method5035(), this.field4665.method4993(), this.field4665.method4995());
			}

			this.method7681(var5[0] - this.field4665.method5001() * 64, var5[1] - this.field4665.method4991() * 64, true);
			this.field4671 = -1;
			this.field4672 = -1;
			this.field4673 = this.method7698(this.field4665.method4988());
			this.field4680 = this.field4673;
			this.field4701 = null;
			this.field4702 = null;
			this.field4650.method4755();
		}
	}

	public void method7692(int var1, int var2, int var3, int var4, int var5) {
		int[] var7 = new int[4];
		class478.method8674(var7);
		class478.method8672(var1, var2, var3 + var1, var2 + var4);
		class478.method8680(var1, var2, var3, var4, -16777216);
		int var8 = this.field4668.method7879();
		if (var8 < 100) {
			this.method7697(var1, var2, var3, var4, var8);
		} else {
			if (!this.field4650.method4761()) {
				this.field4650.method4781(this.field4654, this.field4665.method4985(), client.field1691);
				if (!this.field4650.method4761()) {
					return;
				}
			}

			if (this.field4682 != null) {
				++this.field4684;
				if (this.field4684 % this.field4690 == 0) {
					this.field4684 = 0;
					++this.field4683;
				}

				if (this.field4683 >= this.field4677 && !this.field4681) {
					this.field4682 = null;
				}
			}

			int var9 = (int)Math.ceil((double)((float)var3 / this.field4673));
			int var10 = (int)Math.ceil((double)((float)var4 / this.field4673));
			class248.field2932 = client.field1697 >= 209;
			this.field4650.method4756(this.field4669 - var9 / 2, this.field4659 - var10 / 2, var9 / 2 + this.field4669, var10 / 2 + this.field4659, var1, var2, var3 + var1, var4 + var2);
			if (!this.field4698) {
				boolean var11 = false;
				if (var5 - this.field4699 > 100) {
					this.field4699 = var5;
					var11 = true;
				}

				this.field4650.method4757(this.field4669 - var9 / 2, this.field4659 - var10 / 2, this.field4669 + var9 / 2, this.field4659 + var10 / 2, var1, var2, var3 + var1, var4 + var2, this.field4697, this.field4682, this.field4684, this.field4690, var11);
			}

			this.method7719(var1, var2, var3, var4, var9, var10);
			if (class172.method2923() && this.field4705 && this.field4704 != null) {
				this.field4660.method6854("Coord: " + this.field4704, class478.field5015 + 10, class478.field5013 + 20, 16776960, -1);
			}

			this.field4675 = var9;
			this.field4676 = var10;
			this.field4674 = var1;
			this.field4678 = var2;
			class478.method8675(var7);
		}
	}

	boolean method7758(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.field4662 == null) {
			return true;
		} else if (this.field4662.field5057 == var1 && this.field4662.field5056 == var2) {
			if (this.field4707 != this.field4650.field2879) {
				return true;
			} else if (client.field1983 != this.field4694) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var1 + var3 < var5 || var4 + var2 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	void method7719(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class40.field285 != null) {
			int var8 = 512 / (this.field4650.field2879 * 2);
			int var9 = var3 + 512;
			int var10 = var4 + 512;
			float var11 = 1.0F;
			var9 = (int)((float)var9 / var11);
			var10 = (int)((float)var10 / var11);
			int var12 = this.method7773() - var5 / 2 - var8;
			int var13 = this.method7707() - var6 / 2 - var8;
			int var14 = var1 - this.field4650.field2879 * (var12 + var8 - this.field4709);
			int var15 = var2 - (var8 - (var13 - this.field4651)) * this.field4650.field2879;
			if (this.method7758(var9, var10, var14, var15, var3, var4)) {
				if (this.field4662 != null && var9 == this.field4662.field5057 && var10 == this.field4662.field5056) {
					Arrays.fill(this.field4662.field5067, 0);
				} else {
					this.field4662 = new class491(var9, var10);
				}

				this.field4709 = this.method7773() - var5 / 2 - var8;
				this.field4651 = this.method7707() - var6 / 2 - var8;
				this.field4707 = this.field4650.field2879;
				class40.field285.method6624(this.field4709, this.field4651, this.field4662, (float)this.field4707 / var11);
				this.field4694 = client.field1983;
				var14 = var1 - this.field4650.field2879 * (var8 + var12 - this.field4709);
				var15 = var2 - this.field4650.field2879 * (var8 - (var13 - this.field4651));
			}

			class478.method8731(var1, var2, var3, var4, 0, 128);
			if (var11 == 1.0F) {
				this.field4662.method8860(var14, var15, 192);
			} else {
				this.field4662.method8862(var14, var15, (int)(var11 * (float)var9), (int)((float)var10 * var11), 192);
			}
		}

	}

	public void method7723(int var1, int var2, int var3, int var4) {
		if (this.field4668.method7882()) {
			if (!this.field4650.method4761()) {
				this.field4650.method4781(this.field4654, this.field4665.method4985(), client.field1691);
				if (!this.field4650.method4761()) {
					return;
				}
			}

			this.field4650.method4758(var1, var2, var3, var4, this.field4682, this.field4684, this.field4690);
		}
	}

	public void method7696(int var1) {
		this.field4680 = this.method7698(var1);
	}

	void method7697(int var1, int var2, int var3, int var4, int var5) {
		byte var7 = 20;
		int var8 = var1 + var3 / 2;
		int var9 = var4 / 2 + var2 - 18 - var7;
		class478.method8680(var1, var2, var3, var4, -16777216);
		class478.method8671(var8 - 152, var9, 304, 34, -65536);
		class478.method8680(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
		this.field4660.method6857(class321.field4075, var8, var7 + var9, -1, -1);
	}

	float method7698(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	public int method7699() {
		if ((double)this.field4680 == 1.0D) {
			return 25;
		} else if (1.5D == (double)this.field4680) {
			return 37;
		} else if ((double)this.field4680 == 2.0D) {
			return 50;
		} else if ((double)this.field4680 == 3.0D) {
			return 75;
		} else {
			return (double)this.field4680 == 4.0D ? 100 : 200;
		}
	}

	public void method7700() {
		this.field4668.method7885();
	}

	public boolean method7827() {
		return this.field4668.method7882();
	}

	public class254 method7702(int var1) {
		Iterator var3 = this.field4663.values().iterator();

		class254 var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (class254)var3.next();
		} while(var4.method4983() != var1);

		return var4;
	}

	public void method7762(int var1, int var2) {
		if (null != this.field4665 && this.field4665.method4984(var1, var2)) {
			this.field4671 = var1 - this.field4665.method5001() * 64;
			this.field4672 = var2 - this.field4665.method4991() * 64;
		}
	}

	public void method7704(int var1, int var2) {
		if (this.field4665 != null) {
			this.method7681(var1 - this.field4665.method5001() * 64, var2 - this.field4665.method4991() * 64, true);
			this.field4671 = -1;
			this.field4672 = -1;
		}
	}

	public void method7703(int var1, int var2, int var3) {
		if (null != this.field4665) {
			int[] var5 = this.field4665.method5013(var1, var2, var3);
			if (var5 != null) {
				this.method7762(var5[0], var5[1]);
			}

		}
	}

	public void method7790(int var1, int var2, int var3) {
		if (this.field4665 != null) {
			int[] var5 = this.field4665.method5013(var1, var2, var3);
			if (null != var5) {
				this.method7704(var5[0], var5[1]);
			}

		}
	}

	public int method7773() {
		return this.field4665 == null ? -1 : this.field4669 + this.field4665.method5001() * 64;
	}

	public int method7707() {
		return this.field4665 == null ? -1 : this.field4659 + this.field4665.method4991() * 64;
	}

	public class311 method7857() {
		return this.field4665 == null ? null : this.field4665.method4981(this.method7773(), this.method7707());
	}

	public int method7709() {
		return this.field4675;
	}

	public int method7710() {
		return this.field4676;
	}

	public void method7711(int var1) {
		if (var1 >= 1) {
			this.field4677 = var1;
		}

	}

	public void method7712() {
		this.field4677 = 3;
	}

	public void method7803(int var1) {
		if (var1 >= 1) {
			this.field4690 = var1;
		}

	}

	public void method7841() {
		this.field4690 = 50;
	}

	public void method7715(boolean var1) {
		this.field4681 = var1;
	}

	public void method7716(int var1) {
		this.field4682 = new HashSet();
		this.field4682.add(var1);
		this.field4683 = 0;
		this.field4684 = 0;
	}

	public void method7717(int var1) {
		this.field4682 = new HashSet();
		this.field4683 = 0;
		this.field4684 = 0;

		for (int var3 = 0; var3 < class169.field1576; ++var3) {
			if (class163.method2762(var3) != null && class163.method2762(var3).field1598 == var1) {
				this.field4682.add(class163.method2762(var3).field1578);
			}
		}

	}

	public void method7718() {
		this.field4682 = null;
	}

	public void method7680(boolean var1) {
		this.field4698 = !var1;
	}

	public void method7720(int var1, boolean var2) {
		if (!var2) {
			this.field4685.add(var1);
		} else {
			this.field4685.remove(var1);
		}

		this.method7725();
	}

	public void method7721(int var1, boolean var2) {
		if (!var2) {
			this.field4670.add(var1);
		} else {
			this.field4670.remove(var1);
		}

		for (int var4 = 0; var4 < class169.field1576; ++var4) {
			if (class163.method2762(var4) != null && class163.method2762(var4).field1598 == var1) {
				int var5 = class163.method2762(var4).field1578;
				if (!var2) {
					this.field4696.add(var5);
				} else {
					this.field4696.remove(var5);
				}
			}
		}

		this.method7725();
	}

	public boolean method7722() {
		return !this.field4698;
	}

	public boolean method7861(int var1) {
		return !this.field4685.contains(var1);
	}

	public boolean method7784(int var1) {
		return !this.field4670.contains(var1);
	}

	void method7725() {
		this.field4697.clear();
		this.field4697.addAll(this.field4685);
		this.field4697.addAll(this.field4696);
	}

	public void method7726(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.field4668.method7882()) {
			int var8 = (int)Math.ceil((double)((float)var3 / this.field4673));
			int var9 = (int)Math.ceil((double)((float)var4 / this.field4673));
			List var10 = this.field4650.method4759(this.field4669 - var8 / 2 - 1, this.field4659 - var9 / 2 - 1, var8 / 2 + this.field4669 + 1, 1 + var9 / 2 + this.field4659, var1, var2, var3, var4, var5, var6);
			if (!var10.isEmpty()) {
				Iterator var11 = var10.iterator();

				boolean var14;
				do {
					if (!var11.hasNext()) {
						return;
					}

					class258 var12 = (class258)var11.next();
					class169 var13 = class163.method2762(var12.method5105());
					var14 = false;

					for (int var15 = this.field4710.length - 1; var15 >= 0; --var15) {
						if (var13.field1587[var15] != null) {
							client.method1404(var13.field1587[var15], var13.field1588, this.field4710[var15], var12.method5105(), var12.field2997.method6132(), var12.field3000.method6132());
							var14 = true;
						}
					}
				} while(!var14);

			}
		}
	}

	public class311 method7727(int var1, class311 var2) {
		if (!this.field4668.method7882()) {
			return null;
		} else if (!this.field4650.method4761()) {
			return null;
		} else if (!this.field4665.method4984(var2.field3709, var2.field3710)) {
			return null;
		} else {
			HashMap var4 = this.field4650.method4762();
			List var5 = (List)var4.get(var1);
			if (var5 != null && !var5.isEmpty()) {
				class258 var6 = null;
				int var7 = -1;
				Iterator var8 = var5.iterator();

				while (true) {
					class258 var9;
					int var12;
					do {
						if (!var8.hasNext()) {
							return var6.field3000;
						}

						var9 = (class258)var8.next();
						int var10 = var9.field3000.field3709 - var2.field3709;
						int var11 = var9.field3000.field3710 - var2.field3710;
						var12 = var10 * var10 + var11 * var11;
						if (var12 == 0) {
							return var9.field3000;
						}
					} while(var12 >= var7 && var6 != null);

					var6 = var9;
					var7 = var12;
				}
			} else {
				return null;
			}
		}
	}

	public void method7823(int var1, int var2, class311 var3, class311 var4) {
		class80 var6 = new class80();
		class271 var7 = new class271(var2, var3, var4);
		var6.method1603(new Object[]{var7});
		switch(var1) {
		case 1008:
			var6.method1604(10);
			break;
		case 1009:
			var6.method1604(11);
			break;
		case 1010:
			var6.method1604(12);
			break;
		case 1011:
			var6.method1604(13);
			break;
		case 1012:
			var6.method1604(14);
		}

		class69.method2874(var6);
	}

	public class258 method7729() {
		if (!this.field4668.method7882()) {
			return null;
		} else if (!this.field4650.method4761()) {
			return null;
		} else {
			HashMap var2 = this.field4650.method4762();
			this.field4701 = new LinkedList();
			Iterator var3 = var2.values().iterator();

			while (var3.hasNext()) {
				List var4 = (List)var3.next();
				this.field4701.addAll(var4);
			}

			this.field4702 = this.field4701.iterator();
			return this.method7819();
		}
	}

	public class258 method7819() {
		if (this.field4702 == null) {
			return null;
		} else {
			class258 var2;
			do {
				if (!this.field4702.hasNext()) {
					return null;
				}

				var2 = (class258)this.field4702.next();
			} while(var2.method5105() == -1);

			return var2;
		}
	}
}
