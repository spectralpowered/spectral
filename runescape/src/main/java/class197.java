public class class197 extends class439 {
	static class282 field2221;
	static String field2224;
	public char field2216;
	public char field2217;
	public int field2219;
	public int field2220;
	public int[] field2215;
	public int[] field2223;
	public String field2218;
	public String[] field2222;

	static {
		field2221 = new class282(64);
	}

	class197() {
		this.field2218 = class321.field3756;
		this.field2220 = 0;
	}

	public static void method4958(class337 var0) {
		class358.field4337 = var0;
	}

	void method3878(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method3880(var1, var3);
		}
	}

	void method3880(class467 var1, int var2) {
		if (var2 == 1) {
			this.field2216 = (char)var1.method8326();
		} else if (var2 == 2) {
			this.field2217 = (char)var1.method8326();
		} else if (var2 == 3) {
			this.field2218 = var1.method8335();
		} else if (var2 == 4) {
			this.field2219 = var1.method8480();
		} else {
			int var4;
			if (var2 == 5) {
				this.field2220 = var1.method8328();
				this.field2215 = new int[this.field2220];
				this.field2222 = new String[this.field2220];

				for (var4 = 0; var4 < this.field2220; ++var4) {
					this.field2215[var4] = var1.method8480();
					this.field2222[var4] = var1.method8335();
				}
			} else if (var2 == 6) {
				this.field2220 = var1.method8328();
				this.field2215 = new int[this.field2220];
				this.field2223 = new int[this.field2220];

				for (var4 = 0; var4 < this.field2220; ++var4) {
					this.field2215[var4] = var1.method8480();
					this.field2223[var4] = var1.method8480();
				}
			}
		}

	}

	public static String method3890(byte[] var0) {
		int var3 = var0.length;
		StringBuilder var4 = new StringBuilder();

		for (int var5 = 0; var5 < var3 + 0; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(class354.field4300[var6 >>> 2]);
			if (var5 < var3 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(class354.field4300[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var3 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(class354.field4300[(var7 & 15) << 2 | var8 >>> 6]).append(class354.field4300[var8 & 63]);
				} else {
					var4.append(class354.field4300[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(class354.field4300[(var6 & 3) << 4]).append("==");
			}
		}

		String var2 = var4.toString();
		return var2;
	}

	public int method3883() {
		return this.field2220;
	}

	public static class266[] method3891() {
		return new class266[]{class266.field3057, class266.field3056, class266.field3133, class266.field3025, class266.field3036, class266.field3027, class266.field3024, class266.field3029, class266.field3030, class266.field3047, class266.field3032, class266.field3033, class266.field3034, class266.field3101, class266.field3110, class266.field3037, class266.field3038, class266.field3039, class266.field3040, class266.field3069, class266.field3035, class266.field3043, class266.field3113, class266.field3045, class266.field3111, class266.field3022, class266.field3048, class266.field3049, class266.field3050, class266.field3051, class266.field3044, class266.field3053, class266.field3041, class266.field3109, class266.field3026, class266.field3119, class266.field3058, class266.field3052, class266.field3060, class266.field3061, class266.field3062, class266.field3063, class266.field3090, class266.field3065, class266.field3066, class266.field3023, class266.field3068, class266.field3081, class266.field3070, class266.field3071, class266.field3031, class266.field3096, class266.field3074, class266.field3075, class266.field3076, class266.field3095, class266.field3055, class266.field3079, class266.field3080, class266.field3078, class266.field3082, class266.field3083, class266.field3084, class266.field3085, class266.field3086, class266.field3105, class266.field3124, class266.field3073, class266.field3088, class266.field3064, class266.field3092, class266.field3093, class266.field3094, class266.field3046, class266.field3087, class266.field3097, class266.field3103, class266.field3099, class266.field3100, class266.field3138, class266.field3102, class266.field3077, class266.field3104, class266.field3098, class266.field3106, class266.field3107, class266.field3108, class266.field3125, class266.field3042, class266.field3054, class266.field3126, class266.field3067, class266.field3114, class266.field3115, class266.field3116, class266.field3117, class266.field3118, class266.field3112, class266.field3120, class266.field3121, class266.field3122, class266.field3123, class266.field3091, class266.field3072, class266.field3089, class266.field3127, class266.field3128, class266.field3129, class266.field3130, class266.field3131, class266.field3132, class266.field3028, class266.field3134, class266.field3135, class266.field3136};
	}
}
