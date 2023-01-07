import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "go"
)
public class class236 extends class195 {
	@ObfInfo(
		owner = "go",
		name = "e",
		desc = "Ljv;"
	)
	static class99 field2002;
	@ObfInfo(
		owner = "go",
		name = "fe",
		desc = "Ljava/lang/String;"
	)
	static String field2005;
	@ObfInfo(
		owner = "go",
		name = "v",
		desc = "C"
	)
	public char field1997;
	@ObfInfo(
		owner = "go",
		name = "x",
		desc = "C"
	)
	public char field1998;
	@ObfInfo(
		owner = "go",
		name = "q",
		desc = "I"
	)
	public int field2000;
	@ObfInfo(
		owner = "go",
		name = "f",
		desc = "I"
	)
	public int field2001;
	@ObfInfo(
		owner = "go",
		name = "r",
		desc = "[I"
	)
	public int[] field1996;
	@ObfInfo(
		owner = "go",
		name = "u",
		desc = "[I"
	)
	public int[] field2004;
	@ObfInfo(
		owner = "go",
		name = "m",
		desc = "Ljava/lang/String;"
	)
	public String field1999;
	@ObfInfo(
		owner = "go",
		name = "b",
		desc = "[Ljava/lang/String;"
	)
	public String[] field2003;

	static {
		field2002 = new class99(64);
	}

	@ObfInfo(
		owner = "go",
		name = "<init>",
		desc = "()V"
	)
	class236() {
		this.field1999 = class177.field1325;
		this.field2001 = 0;
	}

	@ObfInfo(
		owner = "go",
		name = "v",
		desc = "(Lqy;I)V"
	)
	void method1026(class127 var1) {
		while (true) {
			int var3 = var1.method547();
			if (var3 == 0) {
				return;
			}

			this.method1027(var1, var3);
		}
	}

	@ObfInfo(
		owner = "go",
		name = "x",
		desc = "(Lqy;IS)V"
	)
	void method1027(class127 var1, int var2) {
		if (var2 == 1) {
			this.field1997 = (char)var1.method547();
		} else if (var2 == 2) {
			this.field1998 = (char)var1.method547();
		} else if (var2 == 3) {
			this.field1999 = var1.method555();
		} else if (var2 == 4) {
			this.field2000 = var1.method595();
		} else {
			int var4;
			if (var2 == 5) {
				this.field2001 = var1.method549();
				this.field1996 = new int[this.field2001];
				this.field2003 = new String[this.field2001];

				for (var4 = 0; var4 < this.field2001; ++var4) {
					this.field1996[var4] = var1.method595();
					this.field2003[var4] = var1.method555();
				}
			} else if (var2 == 6) {
				this.field2001 = var1.method549();
				this.field1996 = new int[this.field2001];
				this.field2004 = new int[this.field2001];

				for (var4 = 0; var4 < this.field2001; ++var4) {
					this.field1996[var4] = var1.method595();
					this.field2004[var4] = var1.method595();
				}
			}
		}

	}

	@ObfInfo(
		owner = "go",
		name = "m",
		desc = "(I)I"
	)
	public int method1028() {
		return this.field2001;
	}

	@ObfInfo(
		owner = "go",
		name = "h",
		desc = "([BI)Ljava/lang/String;"
	)
	public static String method1029(byte[] var0) {
		int var3 = var0.length;
		StringBuilder var4 = new StringBuilder();

		for (int var5 = 0; var5 < var3 + 0; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(class158.field1212[var6 >>> 2]);
			if (var5 < var3 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(class158.field1212[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var3 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(class158.field1212[(var7 & 15) << 2 | var8 >>> 6]).append(class158.field1212[var8 & 63]);
				} else {
					var4.append(class158.field1212[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(class158.field1212[(var6 & 3) << 4]).append("==");
			}
		}

		String var2 = var4.toString();
		return var2;
	}

	@ObfInfo(
		owner = "go",
		name = "h",
		desc = "(I)[Ljf;"
	)
	public static class346[] method1030() {
		return new class346[]{class346.field2796, class346.field2795, class346.field2872, class346.field2764, class346.field2775, class346.field2766, class346.field2763, class346.field2768, class346.field2769, class346.field2786, class346.field2771, class346.field2772, class346.field2773, class346.field2840, class346.field2849, class346.field2776, class346.field2777, class346.field2778, class346.field2779, class346.field2808, class346.field2774, class346.field2782, class346.field2852, class346.field2784, class346.field2850, class346.field2761, class346.field2787, class346.field2788, class346.field2789, class346.field2790, class346.field2783, class346.field2792, class346.field2780, class346.field2848, class346.field2765, class346.field2858, class346.field2797, class346.field2791, class346.field2799, class346.field2800, class346.field2801, class346.field2802, class346.field2829, class346.field2804, class346.field2805, class346.field2762, class346.field2807, class346.field2820, class346.field2809, class346.field2810, class346.field2770, class346.field2835, class346.field2813, class346.field2814, class346.field2815, class346.field2834, class346.field2794, class346.field2818, class346.field2819, class346.field2817, class346.field2821, class346.field2822, class346.field2823, class346.field2824, class346.field2825, class346.field2844, class346.field2863, class346.field2812, class346.field2827, class346.field2803, class346.field2831, class346.field2832, class346.field2833, class346.field2785, class346.field2826, class346.field2836, class346.field2842, class346.field2838, class346.field2839, class346.field2877, class346.field2841, class346.field2816, class346.field2843, class346.field2837, class346.field2845, class346.field2846, class346.field2847, class346.field2864, class346.field2781, class346.field2793, class346.field2865, class346.field2806, class346.field2853, class346.field2854, class346.field2855, class346.field2856, class346.field2857, class346.field2851, class346.field2859, class346.field2860, class346.field2861, class346.field2862, class346.field2830, class346.field2811, class346.field2828, class346.field2866, class346.field2867, class346.field2868, class346.field2869, class346.field2870, class346.field2871, class346.field2767, class346.field2873, class346.field2874, class346.field2875};
	}
}
