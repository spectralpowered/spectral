import io.spectralpowered.ObfInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(
	name = "ch"
)
public class class446 {
	@ObfInfo(
		owner = "ch",
		name = "eg",
		desc = "Lln;"
	)
	static class38 field3678;
	@ObfInfo(
		owner = "ch",
		name = "m",
		desc = "Z"
	)
	boolean field3677;
	@ObfInfo(
		owner = "ch",
		name = "q",
		desc = "Z"
	)
	boolean field3679;
	@ObfInfo(
		owner = "ch",
		name = "f",
		desc = "Z"
	)
	boolean field3680;
	@ObfInfo(
		owner = "ch",
		name = "r",
		desc = "Z"
	)
	boolean field3681;
	@ObfInfo(
		owner = "ch",
		name = "b",
		desc = "D"
	)
	double field3690;
	@ObfInfo(
		owner = "ch",
		name = "u",
		desc = "I"
	)
	int field3683;
	@ObfInfo(
		owner = "ch",
		name = "j",
		desc = "I"
	)
	int field3684;
	@ObfInfo(
		owner = "ch",
		name = "g",
		desc = "I"
	)
	int field3685;
	@ObfInfo(
		owner = "ch",
		name = "i",
		desc = "I"
	)
	int field3686;
	@ObfInfo(
		owner = "ch",
		name = "o",
		desc = "I"
	)
	int field3687;
	@ObfInfo(
		owner = "ch",
		name = "k",
		desc = "I"
	)
	int field3689;
	@ObfInfo(
		owner = "ch",
		name = "n",
		desc = "Ljava/lang/String;"
	)
	String field3688;
	@ObfInfo(
		owner = "ch",
		name = "a",
		desc = "Ljava/util/Map;"
	)
	final Map field3682;

	@ObfInfo(
		owner = "ch",
		name = "<init>",
		desc = "()V"
	)
	class446() {
		this.field3679 = false;
		this.field3681 = false;
		this.field3690 = 0.8D;
		this.field3684 = 127;
		this.field3685 = 127;
		this.field3686 = 127;
		this.field3687 = -1;
		this.field3688 = null;
		this.field3689 = 1;
		this.field3682 = new LinkedHashMap();
		this.method2200(true);
	}

	@ObfInfo(
		owner = "ch",
		name = "<init>",
		desc = "(Lqy;)V"
	)
	class446(class127 var1) {
		this.field3679 = false;
		this.field3681 = false;
		this.field3690 = 0.8D;
		this.field3684 = 127;
		this.field3685 = 127;
		this.field3686 = 127;
		this.field3687 = -1;
		this.field3688 = null;
		this.field3689 = 1;
		this.field3682 = new LinkedHashMap();
		if (null != var1 && var1.field1072 != null) {
			int var2 = var1.method547();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.method547() == 1) {
					this.field3677 = true;
				}

				if (var2 > 1) {
					this.field3680 = var1.method547() == 1;
				}

				if (var2 > 3) {
					this.field3689 = var1.method547();
				}

				if (var2 > 2) {
					int var3 = var1.method547();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.method595();
						int var6 = var1.method595();
						this.field3682.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.field3688 = var1.method554();
				}

				if (var2 > 5) {
					this.field3679 = var1.method553();
				}

				if (var2 > 6) {
					this.field3690 = (double)var1.method547() / 100.0D;
					this.field3684 = var1.method547();
					this.field3685 = var1.method547();
					this.field3686 = var1.method547();
				}

				if (var2 > 7) {
					this.field3687 = var1.method547();
				}

				if (var2 > 8) {
					this.field3681 = var1.method547() == 1;
				}

				if (var2 > 9) {
					this.field3683 = var1.method595();
				}
			} else {
				this.method2200(true);
			}
		} else {
			this.method2200(true);
		}

	}

	@ObfInfo(
		owner = "ch",
		name = "h",
		desc = "(ZB)V"
	)
	void method2200(boolean var1) {
	}

	@ObfInfo(
		owner = "ch",
		name = "e",
		desc = "(I)Lqy;"
	)
	class127 method2201() {
		class127 var2 = new class127(417, true);
		var2.method544(10);
		var2.method544(this.field3677 ? 1 : 0);
		var2.method544(this.field3680 ? 1 : 0);
		var2.method544(this.field3689);
		var2.method544(this.field3682.size());
		Iterator var3 = this.field3682.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var2.method534((Integer)var4.getKey());
			var2.method534((Integer)var4.getValue());
		}

		var2.method538(null != this.field3688 ? this.field3688 : "", (byte)116);
		var2.method537(this.field3679);
		var2.method544((int)(this.field3690 * 100.0D));
		var2.method544(this.field3684);
		var2.method544(this.field3685);
		var2.method544(this.field3686);
		var2.method544(this.field3687);
		var2.method544(this.field3681 ? 1 : 0);
		var2.method534(this.field3683);
		return var2;
	}

	@ObfInfo(
		owner = "ch",
		name = "m",
		desc = "(ZI)V"
	)
	void method2229(boolean var1) {
		this.field3677 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "q",
		desc = "(I)Z"
	)
	boolean method2202() {
		return this.field3677;
	}

	@ObfInfo(
		owner = "ch",
		name = "f",
		desc = "(ZB)V"
	)
	void method2225(boolean var1) {
		this.field3679 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "r",
		desc = "(I)Z"
	)
	boolean method2203() {
		return this.field3679;
	}

	@ObfInfo(
		owner = "ch",
		name = "u",
		desc = "(ZB)V"
	)
	void method2223(boolean var1) {
		this.field3680 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "b",
		desc = "(B)Z"
	)
	boolean method2213() {
		return this.field3680;
	}

	@ObfInfo(
		owner = "ch",
		name = "j",
		desc = "(ZS)V"
	)
	void method2226(boolean var1) {
		this.field3681 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "g",
		desc = "(I)V"
	)
	void method2217() {
		this.method2226(!this.field3681);
	}

	@ObfInfo(
		owner = "ch",
		name = "i",
		desc = "(I)Z"
	)
	boolean method2205() {
		return this.field3681;
	}

	@ObfInfo(
		owner = "ch",
		name = "o",
		desc = "(IB)V"
	)
	void method2206(int var1) {
		this.field3683 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "n",
		desc = "(I)I"
	)
	int method2207() {
		return this.field3683;
	}

	@ObfInfo(
		owner = "ch",
		name = "k",
		desc = "(D)V"
	)
	void method2228(double var1) {
		this.field3690 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "a",
		desc = "(I)D"
	)
	double method2208() {
		return this.field3690;
	}

	@ObfInfo(
		owner = "ch",
		name = "s",
		desc = "(IS)V"
	)
	void method2204(int var1) {
		this.field3684 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "l",
		desc = "(S)I"
	)
	int method2210() {
		return this.field3684;
	}

	@ObfInfo(
		owner = "ch",
		name = "t",
		desc = "(IB)V"
	)
	void method2227(int var1) {
		this.field3685 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "c",
		desc = "(I)I"
	)
	int method2211() {
		return this.field3685;
	}

	@ObfInfo(
		owner = "ch",
		name = "p",
		desc = "(II)V"
	)
	void method2212(int var1) {
		this.field3686 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "d",
		desc = "(I)I"
	)
	int method2230() {
		return this.field3686;
	}

	@ObfInfo(
		owner = "ch",
		name = "y",
		desc = "(Ljava/lang/String;I)V"
	)
	void method2214(String var1) {
		this.field3688 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "z",
		desc = "(B)Ljava/lang/String;"
	)
	String method2215() {
		return this.field3688;
	}

	@ObfInfo(
		owner = "ch",
		name = "w",
		desc = "(II)V"
	)
	void method2216(int var1) {
		this.field3687 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "as",
		desc = "(I)I"
	)
	int method2209() {
		return this.field3687;
	}

	@ObfInfo(
		owner = "ch",
		name = "ad",
		desc = "(IS)V"
	)
	void method2224(int var1) {
		this.field3689 = var1;
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "ao",
		desc = "(I)I"
	)
	int method2218() {
		return this.field3689;
	}

	@ObfInfo(
		owner = "ch",
		name = "am",
		desc = "(Ljava/lang/String;II)V"
	)
	void method2219(String var1, int var2) {
		int var4 = this.method2222(var1);
		if (this.field3682.size() >= 10 && !this.field3682.containsKey(var4)) {
			Iterator var5 = this.field3682.entrySet().iterator();
			var5.next();
			var5.remove();
		}

		this.field3682.put(var4, var2);
		class438.method2174();
	}

	@ObfInfo(
		owner = "ch",
		name = "av",
		desc = "(Ljava/lang/String;I)Z"
	)
	boolean method2220(String var1) {
		int var3 = this.method2222(var1);
		return this.field3682.containsKey(var3);
	}

	@ObfInfo(
		owner = "ch",
		name = "au",
		desc = "(Ljava/lang/String;I)I"
	)
	int method2221(String var1) {
		int var3 = this.method2222(var1);
		return !this.field3682.containsKey(var3) ? 0 : (Integer)this.field3682.get(var3);
	}

	@ObfInfo(
		owner = "ch",
		name = "ar",
		desc = "(Ljava/lang/String;B)I"
	)
	int method2222(String var1) {
		String var4 = var1.toLowerCase();
		int var5 = var4.length();
		int var6 = 0;

		for (int var7 = 0; var7 < var5; ++var7) {
			var6 = (var6 << 5) - var6 + var4.charAt(var7);
		}

		return var6;
	}

	@ObfInfo(
		owner = "ch",
		name = "e",
		desc = "(III)I"
	)
	static int method2232(int var0, int var1) {
		class201 var3 = (class201)class201.field1755.method791((long)var0);
		if (var3 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.field1754.length ? var3.field1754[var1] : 0;
		}
	}

	@ObfInfo(
		owner = "ch",
		name = "iz",
		desc = "(Lct;II)V"
	)
	static final void method2231(class334 var0, int var1) {
		class241.method1043(var0.field2672, var0.field2608, var1);
	}
}
