public class class200 extends class439 {
	public static class282 field2255;
	public static class282 field2256;
	public static class282 field2301;
	public static int field2292;
	static class337 field2252;
	class454 field2284;
	int field2249;
	int field2258;
	int field2274;
	int field2276;
	int field2278;
	int field2279;
	int field2280;
	int field2282;
	int field2285;
	int field2286;
	int field2287;
	int field2288;
	int field2289;
	int field2290;
	int field2295;
	int field2296;
	int field2297;
	int field2302;
	int field2305;
	int[] field2250;
	int[] field2291;
	public boolean field2275;
	public boolean field2303;
	public int field2253;
	public int field2254;
	public int field2263;
	public int field2264;
	public int field2265;
	public int field2266;
	public int field2267;
	public int field2268;
	public int field2269;
	public int field2270;
	public int field2271;
	public int field2272;
	public int field2273;
	public int field2281;
	public int field2283;
	public int field2293;
	public int field2294;
	public int field2298;
	public int field2300;
	public int field2307;
	public String field2259;
	public String[] field2257;
	public String[] field2277;
	public short[] field2261;
	public short[] field2262;
	public short[] field2299;
	public short[] field2306;

	public static int method3985(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (1 == (var5 & 1)) {
			int var7 = var3;
			var3 = var4;
			var4 = var7;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	static {
		field2301 = new class282(64);
		field2255 = new class282(50);
		field2256 = new class282(200);
	}

	class200() {
		this.field2259 = class321.field3756;
		this.field2264 = 2000;
		this.field2265 = 0;
		this.field2266 = 0;
		this.field2273 = 0;
		this.field2268 = 0;
		this.field2253 = 0;
		this.field2270 = 0;
		this.field2271 = 1;
		this.field2272 = -1;
		this.field2293 = -1;
		this.field2263 = -1;
		this.field2275 = false;
		this.field2257 = new String[]{null, null, class321.field4002, null, null};
		this.field2277 = new String[]{null, null, null, null, class321.field4069};
		this.field2278 = -2;
		this.field2279 = -1;
		this.field2280 = -1;
		this.field2302 = 0;
		this.field2258 = -1;
		this.field2274 = -1;
		this.field2249 = 0;
		this.field2285 = -1;
		this.field2286 = -1;
		this.field2287 = -1;
		this.field2288 = -1;
		this.field2289 = -1;
		this.field2290 = -1;
		this.field2298 = -1;
		this.field2294 = -1;
		this.field2295 = 128;
		this.field2296 = 128;
		this.field2297 = 128;
		this.field2254 = 0;
		this.field2267 = 0;
		this.field2300 = 0;
		this.field2269 = 0;
		this.field2303 = false;
		this.field2276 = -1;
		this.field2282 = -1;
		this.field2283 = -1;
		this.field2307 = -1;
	}

	public static void method6515(class337 var0, class337 var1, boolean var2, class386 var3) {
		field2252 = var0;
		class292.field3557 = var1;
		class182.field1681 = var2;
		field2292 = field2252.method6330(10);
		class281.field3307 = var3;
	}

	void method3915() {
		if (1 == this.field2270) {
			this.field2269 = 0;
		}

	}

	void method3916(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method3917(var1, var3);
		}
	}

	void method3917(class467 var1, int var2) {
		if (var2 == 1) {
			this.field2305 = var1.method8328();
		} else if (var2 == 2) {
			this.field2259 = var1.method8335();
		} else if (var2 == 4) {
			this.field2264 = var1.method8328();
		} else if (var2 == 5) {
			this.field2265 = var1.method8328();
		} else if (var2 == 6) {
			this.field2266 = var1.method8328();
		} else if (var2 == 7) {
			this.field2268 = var1.method8328();
			if (this.field2268 > 32767) {
				this.field2268 -= 65536;
			}
		} else if (var2 == 8) {
			this.field2253 = var1.method8328();
			if (this.field2253 > 32767) {
				this.field2253 -= 65536;
			}
		} else if (var2 == 9) {
			var1.method8335();
		} else if (var2 == 11) {
			this.field2270 = 1;
		} else if (var2 == 12) {
			this.field2271 = var1.method8480();
		} else if (var2 == 13) {
			this.field2272 = var1.method8326();
		} else if (var2 == 14) {
			this.field2293 = var1.method8326();
		} else if (var2 == 16) {
			this.field2275 = true;
		} else if (var2 == 23) {
			this.field2279 = var1.method8328();
			this.field2302 = var1.method8326();
		} else if (var2 == 24) {
			this.field2280 = var1.method8328();
		} else if (var2 == 25) {
			this.field2258 = var1.method8328();
			this.field2249 = var1.method8326();
		} else if (var2 == 26) {
			this.field2274 = var1.method8328();
		} else if (var2 == 27) {
			this.field2263 = var1.method8326();
		} else if (var2 >= 30 && var2 < 35) {
			this.field2257[var2 - 30] = var1.method8335();
			if (this.field2257[var2 - 30].equalsIgnoreCase(class321.field3757)) {
				this.field2257[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.field2277[var2 - 35] = var1.method8335();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method8326();
				this.field2299 = new short[var4];
				this.field2261 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2299[var5] = (short)var1.method8328();
					this.field2261[var5] = (short)var1.method8328();
				}
			} else if (var2 == 41) {
				var4 = var1.method8326();
				this.field2262 = new short[var4];
				this.field2306 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2262[var5] = (short)var1.method8328();
					this.field2306[var5] = (short)var1.method8328();
				}
			} else if (var2 == 42) {
				this.field2278 = var1.method8327();
			} else if (var2 == 65) {
				this.field2303 = true;
			} else if (var2 == 75) {
				this.field2269 = var1.method8329();
			} else if (var2 == 78) {
				this.field2285 = var1.method8328();
			} else if (var2 == 79) {
				this.field2286 = var1.method8328();
			} else if (var2 == 90) {
				this.field2287 = var1.method8328();
			} else if (var2 == 91) {
				this.field2289 = var1.method8328();
			} else if (var2 == 92) {
				this.field2288 = var1.method8328();
			} else if (var2 == 93) {
				this.field2290 = var1.method8328();
			} else if (var2 == 94) {
				var1.method8328();
			} else if (var2 == 95) {
				this.field2273 = var1.method8328();
			} else if (var2 == 97) {
				this.field2298 = var1.method8328();
			} else if (var2 == 98) {
				this.field2294 = var1.method8328();
			} else if (var2 >= 100 && var2 < 110) {
				if (null == this.field2291) {
					this.field2291 = new int[10];
					this.field2250 = new int[10];
				}

				this.field2291[var2 - 100] = var1.method8328();
				this.field2250[var2 - 100] = var1.method8328();
			} else if (var2 == 110) {
				this.field2295 = var1.method8328();
			} else if (var2 == 111) {
				this.field2296 = var1.method8328();
			} else if (var2 == 112) {
				this.field2297 = var1.method8328();
			} else if (var2 == 113) {
				this.field2254 = var1.method8327();
			} else if (var2 == 114) {
				this.field2267 = var1.method8327() * 5;
			} else if (var2 == 115) {
				this.field2300 = var1.method8326();
			} else if (var2 == 139) {
				this.field2276 = var1.method8328();
			} else if (var2 == 140) {
				this.field2282 = var1.method8328();
			} else if (var2 == 148) {
				this.field2283 = var1.method8328();
			} else if (var2 == 149) {
				this.field2307 = var1.method8328();
			} else if (var2 == 249) {
				this.field2284 = class63.method1199(var1, this.field2284);
			}
		}

	}

	void method3956(class200 var1, class200 var2) {
		this.field2305 = var1.field2305;
		this.field2264 = var1.field2264;
		this.field2265 = var1.field2265;
		this.field2266 = var1.field2266;
		this.field2273 = var1.field2273;
		this.field2268 = var1.field2268;
		this.field2253 = var1.field2253;
		this.field2299 = var1.field2299;
		this.field2261 = var1.field2261;
		this.field2262 = var1.field2262;
		this.field2306 = var1.field2306;
		this.field2259 = var2.field2259;
		this.field2275 = var2.field2275;
		this.field2271 = var2.field2271;
		this.field2270 = 1;
	}

	void method3914(class200 var1, class200 var2) {
		this.field2305 = var1.field2305;
		this.field2264 = var1.field2264;
		this.field2265 = var1.field2265;
		this.field2266 = var1.field2266;
		this.field2273 = var1.field2273;
		this.field2268 = var1.field2268;
		this.field2253 = var1.field2253;
		this.field2299 = var2.field2299;
		this.field2261 = var2.field2261;
		this.field2262 = var2.field2262;
		this.field2306 = var2.field2306;
		this.field2259 = var2.field2259;
		this.field2275 = var2.field2275;
		this.field2270 = var2.field2270;
		this.field2272 = var2.field2272;
		this.field2293 = var2.field2293;
		this.field2263 = var2.field2263;
		this.field2279 = var2.field2279;
		this.field2280 = var2.field2280;
		this.field2285 = var2.field2285;
		this.field2258 = var2.field2258;
		this.field2274 = var2.field2274;
		this.field2286 = var2.field2286;
		this.field2287 = var2.field2287;
		this.field2288 = var2.field2288;
		this.field2289 = var2.field2289;
		this.field2290 = var2.field2290;
		this.field2300 = var2.field2300;
		this.field2257 = var2.field2257;
		this.field2269 = var2.field2269;
		this.field2277 = new String[5];
		if (var2.field2277 != null) {
			for (int var4 = 0; var4 < 4; ++var4) {
				this.field2277[var4] = var2.field2277[var4];
			}
		}

		this.field2277[4] = class321.field4012;
		this.field2271 = 0;
	}

	void method3955(class200 var1, class200 var2) {
		this.field2305 = var1.field2305;
		this.field2264 = var1.field2264;
		this.field2265 = var1.field2265;
		this.field2266 = var1.field2266;
		this.field2273 = var1.field2273;
		this.field2268 = var1.field2268;
		this.field2253 = var1.field2253;
		this.field2299 = var1.field2299;
		this.field2261 = var1.field2261;
		this.field2262 = var1.field2262;
		this.field2306 = var1.field2306;
		this.field2270 = var1.field2270;
		this.field2259 = var2.field2259;
		this.field2271 = 0;
		this.field2275 = false;
		this.field2303 = false;
	}

	public final class191 method3921(int var1) {
		int var4;
		if (this.field2291 != null && var1 > 1) {
			int var3 = -1;

			for (var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field2250[var4] && this.field2250[var4] != 0) {
					var3 = this.field2291[var4];
				}
			}

			if (var3 != -1) {
				return class208.method4105(var3).method3921(1);
			}
		}

		class191 var5 = class191.method3645(class292.field3557, this.field2305, 0);
		if (null == var5) {
			return null;
		} else {
			if (this.field2295 != 128 || this.field2296 != 128 || this.field2297 != 128) {
				var5.method3663(this.field2295, this.field2296, this.field2297);
			}

			if (null != this.field2299) {
				for (var4 = 0; var4 < this.field2299.length; ++var4) {
					var5.method3660(this.field2299[var4], this.field2261[var4]);
				}
			}

			if (this.field2262 != null) {
				for (var4 = 0; var4 < this.field2262.length; ++var4) {
					var5.method3661(this.field2262[var4], this.field2306[var4]);
				}
			}

			return var5;
		}
	}

	public final class216 method3922(int var1) {
		if (null != this.field2291 && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field2250[var4] && 0 != this.field2250[var4]) {
					var3 = this.field2291[var4];
				}
			}

			if (var3 != -1) {
				return class208.method4105(var3).method3922(1);
			}
		}

		class216 var6 = (class216)field2255.method5356((long)this.field2281);
		if (null != var6) {
			return var6;
		} else {
			class191 var7 = class191.method3645(class292.field3557, this.field2305, 0);
			if (var7 == null) {
				return null;
			} else {
				if (128 != this.field2295 || this.field2296 != 128 || 128 != this.field2297) {
					var7.method3663(this.field2295, this.field2296, this.field2297);
				}

				int var5;
				if (null != this.field2299) {
					for (var5 = 0; var5 < this.field2299.length; ++var5) {
						var7.method3660(this.field2299[var5], this.field2261[var5]);
					}
				}

				if (null != this.field2262) {
					for (var5 = 0; var5 < this.field2262.length; ++var5) {
						var7.method3661(this.field2262[var5], this.field2306[var5]);
					}
				}

				var6 = var7.method3668(this.field2254 + 64, 768 + this.field2267, -50, -10, -50);
				var6.field2589 = true;
				field2255.method5364(var6, (long)this.field2281);
				return var6;
			}
		}
	}

	public class200 method3923(int var1) {
		if (null != this.field2291 && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field2250[var4] && 0 != this.field2250[var4]) {
					var3 = this.field2291[var4];
				}
			}

			if (var3 != -1) {
				return class208.method4105(var3);
			}
		}

		return this;
	}

	public final boolean method3924(int var1) {
		int var3 = this.field2279;
		int var4 = this.field2280;
		int var5 = this.field2285;
		if (var1 == 1) {
			var3 = this.field2258;
			var4 = this.field2274;
			var5 = this.field2286;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!class292.field3557.method6366(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !class292.field3557.method6366(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !class292.field3557.method6366(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	public final class191 method3925(int var1) {
		int var3 = this.field2279;
		int var4 = this.field2280;
		int var5 = this.field2285;
		if (var1 == 1) {
			var3 = this.field2258;
			var4 = this.field2274;
			var5 = this.field2286;
		}

		if (var3 == -1) {
			return null;
		} else {
			class191 var6 = class191.method3645(class292.field3557, var3, 0);
			if (var4 != -1) {
				class191 var7 = class191.method3645(class292.field3557, var4, 0);
				if (var5 != -1) {
					class191 var8 = class191.method3645(class292.field3557, var5, 0);
					class191[] var9 = new class191[]{var6, var7, var8};
					var6 = new class191(var9, 3);
				} else {
					class191[] var11 = new class191[]{var6, var7};
					var6 = new class191(var11, 2);
				}
			}

			if (var1 == 0 && 0 != this.field2302) {
				var6.method3659(0, this.field2302, 0);
			}

			if (var1 == 1 && 0 != this.field2249) {
				var6.method3659(0, this.field2249, 0);
			}

			int var10;
			if (null != this.field2299) {
				for (var10 = 0; var10 < this.field2299.length; ++var10) {
					var6.method3660(this.field2299[var10], this.field2261[var10]);
				}
			}

			if (this.field2262 != null) {
				for (var10 = 0; var10 < this.field2262.length; ++var10) {
					var6.method3661(this.field2262[var10], this.field2306[var10]);
				}
			}

			return var6;
		}
	}

	public final boolean method3926(int var1) {
		int var3 = this.field2287;
		int var4 = this.field2288;
		if (var1 == 1) {
			var3 = this.field2289;
			var4 = this.field2290;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!class292.field3557.method6366(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !class292.field3557.method6366(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	public final class191 method3927(int var1) {
		int var3 = this.field2287;
		int var4 = this.field2288;
		if (var1 == 1) {
			var3 = this.field2289;
			var4 = this.field2290;
		}

		if (var3 == -1) {
			return null;
		} else {
			class191 var5 = class191.method3645(class292.field3557, var3, 0);
			if (var4 != -1) {
				class191 var6 = class191.method3645(class292.field3557, var4, 0);
				class191[] var7 = new class191[]{var5, var6};
				var5 = new class191(var7, 2);
			}

			int var8;
			if (null != this.field2299) {
				for (var8 = 0; var8 < this.field2299.length; ++var8) {
					var5.method3660(this.field2299[var8], this.field2261[var8]);
				}
			}

			if (null != this.field2262) {
				for (var8 = 0; var8 < this.field2262.length; ++var8) {
					var5.method3661(this.field2262[var8], this.field2306[var8]);
				}
			}

			return var5;
		}
	}

	public int method3928(int var1, int var2) {
		return class123.method2323(this.field2284, var1, var2);
	}

	public String method3929(int var1, String var2) {
		class454 var5 = this.field2284;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class426 var6 = (class426)var5.method8135((long)var1);
			if (null == var6) {
				var4 = var2;
			} else {
				var4 = (String)var6.field4735;
			}
		}

		return var4;
	}

	public int method3939() {
		if (this.field2278 != -1 && null != this.field2277) {
			if (this.field2278 >= 0) {
				return this.field2277[this.field2278] != null ? this.field2278 : -1;
			} else {
				return class321.field4069.equalsIgnoreCase(this.field2277[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	public static void method6510(boolean var0) {
		if (class182.field1681 != var0) {
			field2301.method5357();
			field2255.method5357();
			field2256.method5357();
			class182.field1681 = var0;
		}

	}

	boolean method3954() {
		return null != this.field2261;
	}

	boolean method3932() {
		return this.field2306 != null;
	}
}
