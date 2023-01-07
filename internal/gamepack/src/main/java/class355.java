import io.spectralpowered.ObfInfo;
import java.util.ArrayList;
import java.util.HashMap;

@ObfInfo(
	name = "nf"
)
public class class355 {
	@ObfInfo(
		owner = "nf",
		name = "t",
		desc = "Ljava/util/ArrayList;"
	)
	public static ArrayList field2929;
	@ObfInfo(
		owner = "nf",
		name = "n",
		desc = "[[B"
	)
	static byte[][] field2918;
	@ObfInfo(
		owner = "nf",
		name = "i",
		desc = "[[B"
	)
	static byte[][] field2925;
	@ObfInfo(
		owner = "nf",
		name = "o",
		desc = "[[B"
	)
	static byte[][] field2926;
	@ObfInfo(
		owner = "nf",
		name = "k",
		desc = "[[B"
	)
	static byte[][] field2928;
	@ObfInfo(
		owner = "nf",
		name = "b",
		desc = "I"
	)
	static int field2917;
	@ObfInfo(
		owner = "nf",
		name = "q",
		desc = "I"
	)
	static int field2919;
	@ObfInfo(
		owner = "nf",
		name = "f",
		desc = "I"
	)
	static int field2920;
	@ObfInfo(
		owner = "nf",
		name = "r",
		desc = "I"
	)
	static int field2921;
	@ObfInfo(
		owner = "nf",
		name = "u",
		desc = "I"
	)
	static int field2922;
	@ObfInfo(
		owner = "nf",
		name = "g",
		desc = "I"
	)
	static int field2923;
	@ObfInfo(
		owner = "nf",
		name = "j",
		desc = "I"
	)
	static int field2924;
	@ObfInfo(
		owner = "nf",
		name = "m",
		desc = "I"
	)
	static int field2927;

	static {
		field2927 = 0;
		field2919 = 0;
		field2920 = 0;
		field2921 = 0;
		field2922 = 1000;
		field2917 = 250;
		field2924 = 100;
		field2923 = 50;
		field2925 = new byte[1000][];
		field2926 = new byte[250][];
		field2918 = new byte[100][];
		field2928 = new byte[50][];
		field2929 = new ArrayList();
		field2929.clear();
		field2929.add(100);
		field2929.add(5000);
		field2929.add(10000);
		field2929.add(30000);
		new HashMap();
	}

	@ObfInfo(
		owner = "nf",
		name = "h",
		desc = "(IZB)[B"
	)
	public static synchronized byte[] method1775(int var0, boolean var1) {
		byte[] var3;
		if ((var0 == 100 || var0 < 100 && var1) && field2927 > 0) {
			var3 = field2925[--field2927];
			field2925[field2927] = null;
			return var3;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && field2919 > 0) {
			var3 = field2926[--field2919];
			field2926[field2919] = null;
			return var3;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && field2920 > 0) {
			var3 = field2918[--field2920];
			field2918[field2920] = null;
			return var3;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field2921 > 0) {
			var3 = field2928[--field2921];
			field2928[field2921] = null;
			return var3;
		} else {
			int var5;
			if (null != class151.field1173) {
				for (var5 = 0; var5 < class298.field2394.length; ++var5) {
					if ((var0 == class298.field2394[var5] || var0 < class298.field2394[var5] && var1) && class119.field879[var5] > 0) {
						byte[] var4 = class151.field1173[var5][--class119.field879[var5]];
						class151.field1173[var5][class119.field879[var5]] = null;
						return var4;
					}
				}
			}

			if (var1 && null != class298.field2394) {
				for (var5 = 0; var5 < class298.field2394.length; ++var5) {
					if (var0 <= class298.field2394[var5] && class119.field879[var5] < class151.field1173[var5].length) {
						return new byte[class298.field2394[var5]];
					}
				}
			}

			return new byte[var0];
		}
	}

	@ObfInfo(
		owner = "nf",
		name = "kt",
		desc = "(IIIZB)V"
	)
	static final void method1774(int var0, int var1, int var2, boolean var3) {
		if (class268.method1275(var0)) {
			class201.method886(class329.field2600[var0], -1, var1, var2, var3);
		}
	}
}
