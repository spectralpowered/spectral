public class class196 extends class439 {
	public static class282 field2165;
	public static class282 field2167;
	public static class282 field2168;
	public static class282 field2194;
	static boolean field2176;
	static class191[] field2169;
	static class337 field2164;
	boolean field2184;
	boolean field2193;
	boolean field2198;
	class454 field2189;
	int field2163;
	int field2166;
	int field2180;
	int field2181;
	int field2196;
	int field2197;
	int field2200;
	int field2205;
	int field2206;
	int field2212;
	int field2214;
	int[] field2172;
	int[] field2213;
	short[] field2174;
	short[] field2177;
	short[] field2185;
	short[] field2207;
	public boolean field2188;
	public boolean field2195;
	public boolean field2199;
	public boolean field2201;
	public boolean field2208;
	public int field2170;
	public int field2175;
	public int field2178;
	public int field2179;
	public int field2182;
	public int field2183;
	public int field2186;
	public int field2187;
	public int field2191;
	public int field2192;
	public int field2203;
	public int field2209;
	public int field2210;
	public int field2211;
	public int[] field2171;
	public int[] field2204;
	public String field2173;
	public String[] field2190;

	static {
		field2176 = false;
		field2165 = new class282(4096);
		field2194 = new class282(500);
		field2167 = new class282(30);
		field2168 = new class282(30);
		field2169 = new class191[4];
	}

	class196() {
		this.field2173 = class321.field3756;
		this.field2178 = 1;
		this.field2179 = 1;
		this.field2175 = 2;
		this.field2188 = true;
		this.field2182 = -1;
		this.field2163 = -1;
		this.field2184 = false;
		this.field2199 = false;
		this.field2186 = -1;
		this.field2187 = 16;
		this.field2181 = 0;
		this.field2212 = 0;
		this.field2190 = new String[5];
		this.field2191 = -1;
		this.field2183 = -1;
		this.field2193 = false;
		this.field2208 = true;
		this.field2214 = 128;
		this.field2196 = 128;
		this.field2197 = 128;
		this.field2180 = 0;
		this.field2166 = 0;
		this.field2200 = 0;
		this.field2201 = false;
		this.field2198 = false;
		this.field2203 = -1;
		this.field2205 = -1;
		this.field2206 = -1;
		this.field2211 = -1;
		this.field2192 = 0;
		this.field2209 = 0;
		this.field2210 = 0;
		this.field2195 = true;
	}

	public static void method2234(class337 var0, class337 var1, boolean var2) {
		field2164 = var0;
		class49.field347 = var1;
		field2176 = var2;
	}

	void method3822() {
		if (this.field2182 == -1) {
			this.field2182 = 0;
			if (this.field2213 != null && (this.field2172 == null || 10 == this.field2172[0])) {
				this.field2182 = 1;
			}

			for (int var2 = 0; var2 < 5; ++var2) {
				if (this.field2190[var2] != null) {
					this.field2182 = 1;
				}
			}
		}

		if (-1 == this.field2203) {
			this.field2203 = 0 != this.field2175 ? 1 : 0;
		}

	}

	void method3819(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method3820(var1, var3);
		}
	}

	void method3820(class467 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method8326();
			if (var4 > 0) {
				if (null != this.field2213 && !field2176) {
					var1.field4915 += var4 * 3;
				} else {
					this.field2172 = new int[var4];
					this.field2213 = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.field2213[var5] = var1.method8328();
						this.field2172[var5] = var1.method8326();
					}
				}
			}
		} else if (var2 == 2) {
			this.field2173 = var1.method8335();
		} else if (var2 == 5) {
			var4 = var1.method8326();
			if (var4 > 0) {
				if (this.field2213 != null && !field2176) {
					var1.field4915 += var4 * 2;
				} else {
					this.field2172 = null;
					this.field2213 = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.field2213[var5] = var1.method8328();
					}
				}
			}
		} else if (var2 == 14) {
			this.field2178 = var1.method8326();
		} else if (var2 == 15) {
			this.field2179 = var1.method8326();
		} else if (var2 == 17) {
			this.field2175 = 0;
			this.field2188 = false;
		} else if (var2 == 18) {
			this.field2188 = false;
		} else if (var2 == 19) {
			this.field2182 = var1.method8326();
		} else if (var2 == 21) {
			this.field2163 = 0;
		} else if (var2 == 22) {
			this.field2184 = true;
		} else if (var2 == 23) {
			this.field2199 = true;
		} else if (var2 == 24) {
			this.field2186 = var1.method8328();
			if (this.field2186 == 65535) {
				this.field2186 = -1;
			}
		} else if (var2 == 27) {
			this.field2175 = 1;
		} else if (var2 == 28) {
			this.field2187 = var1.method8326();
		} else if (var2 == 29) {
			this.field2181 = var1.method8327();
		} else if (var2 == 39) {
			this.field2212 = var1.method8327() * 25;
		} else if (var2 >= 30 && var2 < 35) {
			this.field2190[var2 - 30] = var1.method8335();
			if (this.field2190[var2 - 30].equalsIgnoreCase(class321.field3757)) {
				this.field2190[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method8326();
			this.field2174 = new short[var4];
			this.field2185 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2174[var5] = (short)var1.method8328();
				this.field2185[var5] = (short)var1.method8328();
			}
		} else if (var2 == 41) {
			var4 = var1.method8326();
			this.field2207 = new short[var4];
			this.field2177 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2207[var5] = (short)var1.method8328();
				this.field2177[var5] = (short)var1.method8328();
			}
		} else if (var2 == 61) {
			var1.method8328();
		} else if (var2 == 62) {
			this.field2193 = true;
		} else if (var2 == 64) {
			this.field2208 = false;
		} else if (var2 == 65) {
			this.field2214 = var1.method8328();
		} else if (var2 == 66) {
			this.field2196 = var1.method8328();
		} else if (var2 == 67) {
			this.field2197 = var1.method8328();
		} else if (var2 == 68) {
			this.field2183 = var1.method8328();
		} else if (var2 == 69) {
			var1.method8326();
		} else if (var2 == 70) {
			this.field2180 = var1.method8329();
		} else if (var2 == 71) {
			this.field2166 = var1.method8329();
		} else if (var2 == 72) {
			this.field2200 = var1.method8329();
		} else if (var2 == 73) {
			this.field2201 = true;
		} else if (var2 == 74) {
			this.field2198 = true;
		} else if (var2 == 75) {
			this.field2203 = var1.method8326();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.field2211 = var1.method8328();
				this.field2192 = var1.method8326();
			} else if (var2 == 79) {
				this.field2209 = var1.method8328();
				this.field2210 = var1.method8328();
				this.field2192 = var1.method8326();
				var4 = var1.method8326();
				this.field2171 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2171[var5] = var1.method8328();
				}
			} else if (var2 == 81) {
				this.field2163 = var1.method8326() * 256;
			} else if (var2 == 82) {
				this.field2191 = var1.method8328();
			} else if (var2 == 89) {
				this.field2195 = false;
			} else if (var2 == 249) {
				this.field2189 = class63.method1199(var1, this.field2189);
			}
		} else {
			this.field2205 = var1.method8328();
			if (this.field2205 == 65535) {
				this.field2205 = -1;
			}

			this.field2206 = var1.method8328();
			if (65535 == this.field2206) {
				this.field2206 = -1;
			}

			var4 = -1;
			if (var2 == 92) {
				var4 = var1.method8328();
				if (var4 == 65535) {
					var4 = -1;
				}
			}

			var5 = var1.method8326();
			this.field2204 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field2204[var6] = var1.method8328();
				if (this.field2204[var6] == 65535) {
					this.field2204[var6] = -1;
				}
			}

			this.field2204[var5 + 1] = var4;
		}

	}

	public static boolean method3876(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	public final boolean method3821(int var1) {
		if (null != this.field2172) {
			for (int var5 = 0; var5 < this.field2172.length; ++var5) {
				if (this.field2172[var5] == var1) {
					return class49.field347.method6366(this.field2213[var5] & 65535, 0);
				}
			}

			return true;
		} else if (this.field2213 == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var3 = true;

			for (int var4 = 0; var4 < this.field2213.length; ++var4) {
				var3 &= class49.field347.method6366(this.field2213[var4] & 65535, 0);
			}

			return var3;
		}
	}

	public final boolean method3869() {
		if (null == this.field2213) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field2213.length; ++var3) {
				var2 &= class49.field347.method6366(this.field2213[var3] & 65535, 0);
			}

			return var2;
		}
	}

	public final class226 method3823(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (null == this.field2172) {
			var8 = (long)((this.field2170 << 10) + var2);
		} else {
			var8 = (long)(var2 + (var1 << 3) + (this.field2170 << 10));
		}

		Object var10 = (class226)field2167.method5356(var8);
		if (var10 == null) {
			class191 var11 = this.method3826(var1, var2);
			if (null == var11) {
				return null;
			}

			if (!this.field2184) {
				var10 = var11.method3668(64 + this.field2181, this.field2212 + 768, -50, -10, -50);
			} else {
				var11.field2100 = (short)(this.field2181 + 64);
				var11.field2108 = (short)(768 + this.field2212);
				var11.method3664();
				var10 = var11;
			}

			field2167.method5364((class439)var10, var8);
		}

		if (this.field2184) {
			var10 = ((class191)var10).method3650();
		}

		if (this.field2163 >= 0) {
			if (var10 instanceof class216) {
				var10 = ((class216)var10).method4381(var3, var4, var5, var6, true, this.field2163);
			} else if (var10 instanceof class191) {
				var10 = ((class191)var10).method3653(var3, var4, var5, var6, true, this.field2163);
			}
		}

		return (class226)var10;
	}

	public final class216 method3824(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (this.field2172 == null) {
			var8 = (long)((this.field2170 << 10) + var2);
		} else {
			var8 = (long)(var2 + (this.field2170 << 10) + (var1 << 3));
		}

		class216 var10 = (class216)field2168.method5356(var8);
		if (var10 == null) {
			class191 var11 = this.method3826(var1, var2);
			if (null == var11) {
				return null;
			}

			var10 = var11.method3668(this.field2181 + 64, 768 + this.field2212, -50, -10, -50);
			field2168.method5364(var10, var8);
		}

		if (this.field2163 >= 0) {
			var10 = var10.method4381(var3, var4, var5, var6, true, this.field2163);
		}

		return var10;
	}

	public final class216 method3818(int var1, int var2, int[][] var3, int var4, int var5, int var6, class183 var7, int var8) {
		long var10;
		if (this.field2172 == null) {
			var10 = (long)((this.field2170 << 10) + var2);
		} else {
			var10 = (long)(var2 + (var1 << 3) + (this.field2170 << 10));
		}

		class216 var12 = (class216)field2168.method5356(var10);
		if (null == var12) {
			class191 var13 = this.method3826(var1, var2);
			if (var13 == null) {
				return null;
			}

			var12 = var13.method3668(this.field2181 + 64, 768 + this.field2212, -50, -10, -50);
			field2168.method5364(var12, var10);
		}

		if (var7 == null && this.field2163 == -1) {
			return var12;
		} else {
			if (null != var7) {
				var12 = var7.method3503(var12, var8, var2);
			} else {
				var12 = var12.method4382(true);
			}

			if (this.field2163 >= 0) {
				var12 = var12.method4381(var3, var4, var5, var6, false, this.field2163);
			}

			return var12;
		}
	}

	final class191 method3826(int var1, int var2) {
		class191 var4 = null;
		boolean var5;
		int var6;
		int var8;
		if (null == this.field2172) {
			if (var1 != 10) {
				return null;
			}

			if (null == this.field2213) {
				return null;
			}

			var5 = this.field2193;
			if (var1 == 2 && var2 > 3) {
				var5 = !var5;
			}

			var6 = this.field2213.length;

			for (int var7 = 0; var7 < var6; ++var7) {
				var8 = this.field2213[var7];
				if (var5) {
					var8 += 65536;
				}

				var4 = (class191)field2194.method5356((long)var8);
				if (null == var4) {
					var4 = class191.method3645(class49.field347, var8 & 65535, 0);
					if (var4 == null) {
						return null;
					}

					if (var5) {
						var4.method3662();
					}

					field2194.method5364(var4, (long)var8);
				}

				if (var6 > 1) {
					field2169[var7] = var4;
				}
			}

			if (var6 > 1) {
				var4 = new class191(field2169, var6);
			}
		} else {
			int var10 = -1;

			for (var6 = 0; var6 < this.field2172.length; ++var6) {
				if (var1 == this.field2172[var6]) {
					var10 = var6;
					break;
				}
			}

			if (var10 == -1) {
				return null;
			}

			var6 = this.field2213[var10];
			boolean var11 = this.field2193 ^ var2 > 3;
			if (var11) {
				var6 += 65536;
			}

			var4 = (class191)field2194.method5356((long)var6);
			if (var4 == null) {
				var4 = class191.method3645(class49.field347, var6 & 65535, 0);
				if (null == var4) {
					return null;
				}

				if (var11) {
					var4.method3662();
				}

				field2194.method5364(var4, (long)var6);
			}
		}

		if (this.field2214 == 128 && this.field2196 == 128 && 128 == this.field2197) {
			var5 = false;
		} else {
			var5 = true;
		}

		boolean var12;
		if (0 == this.field2180 && this.field2166 == 0 && this.field2200 == 0) {
			var12 = false;
		} else {
			var12 = true;
		}

		class191 var9 = new class191(var4, var2 == 0 && !var5 && !var12, null == this.field2174, null == this.field2207, true);
		if (var1 == 4 && var2 > 3) {
			var9.method3658(256);
			var9.method3659(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var9.method3655();
		} else if (var2 == 2) {
			var9.method3694();
		} else if (var2 == 3) {
			var9.method3657();
		}

		if (this.field2174 != null) {
			for (var8 = 0; var8 < this.field2174.length; ++var8) {
				var9.method3660(this.field2174[var8], this.field2185[var8]);
			}
		}

		if (this.field2207 != null) {
			for (var8 = 0; var8 < this.field2207.length; ++var8) {
				var9.method3661(this.field2207[var8], this.field2177[var8]);
			}
		}

		if (var5) {
			var9.method3663(this.field2214, this.field2196, this.field2197);
		}

		if (var12) {
			var9.method3659(this.field2180, this.field2166, this.field2200);
		}

		return var9;
	}

	public final class196 method3863() {
		int var2 = -1;
		if (-1 != this.field2205) {
			var2 = class180.method2989(this.field2205);
		} else if (-1 != this.field2206) {
			var2 = class305.field3661[this.field2206];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2204.length - 1) {
			var3 = this.field2204[var2];
		} else {
			var3 = this.field2204[this.field2204.length - 1];
		}

		return var3 != -1 ? class165.method2780(var3) : null;
	}

	public int method3828(int var1, int var2) {
		return class123.method2323(this.field2189, var1, var2);
	}

	public String method3829(int var1, String var2) {
		class454 var5 = this.field2189;
		String var4;
		if (null == var5) {
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

	public boolean method3830() {
		if (null == this.field2204) {
			return this.field2211 != -1 || this.field2171 != null;
		} else {
			for (int var2 = 0; var2 < this.field2204.length; ++var2) {
				if (this.field2204[var2] != -1) {
					class196 var3 = class165.method2780(this.field2204[var2]);
					if (var3.field2211 != -1 || null != var3.field2171) {
						return true;
					}
				}
			}

			return false;
		}
	}
}
