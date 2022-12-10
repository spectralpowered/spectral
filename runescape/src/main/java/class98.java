public abstract class class98 extends class226 {
	boolean field949;
	boolean field957;
	boolean field969;
	boolean field982;
	boolean field998;
	byte field1002;
	byte field1010;
	byte field1013;
	byte field954;
	byte field990;
	class201[] field1001;
	class360 field1011;
	int field1000;
	int field1003;
	int field1004;
	int field1005;
	int field1006;
	int field1007;
	int field1008;
	int field1009;
	int field1012;
	int field1014;
	int field1015;
	int field1016;
	int field1017;
	int field1018;
	int field1019;
	int field1020;
	int field1022;
	int field1023;
	int field947;
	int field948;
	int field950;
	int field951;
	int field952;
	int field953;
	int field955;
	int field956;
	int field958;
	int field959;
	int field960;
	int field961;
	int field962;
	int field963;
	int field964;
	int field965;
	int field966;
	int field967;
	int field970;
	int field971;
	int field972;
	int field974;
	int field980;
	int field981;
	int field983;
	int field984;
	int field985;
	int field986;
	int field987;
	int field988;
	int field989;
	int field991;
	int field992;
	int field993;
	int field994;
	int field995;
	int field996;
	int field997;
	int field999;
	int[] field1021;
	int[] field973;
	int[] field975;
	int[] field976;
	int[] field977;
	int[] field978;
	int[] field979;
	String field968;

	class98() {
		this.field949 = false;
		this.field951 = 1;
		this.field953 = -1;
		this.field958 = -1;
		this.field1020 = -1;
		this.field956 = -1;
		this.field1017 = -1;
		this.field974 = -1;
		this.field959 = -1;
		this.field950 = -1;
		this.field961 = -1;
		this.field971 = -1;
		this.field963 = -1;
		this.field964 = -1;
		this.field965 = -1;
		this.field996 = -1;
		this.field967 = -1;
		this.field968 = null;
		this.field957 = false;
		this.field1018 = 100;
		this.field972 = 0;
		this.field999 = 0;
		this.field954 = 0;
		this.field975 = new int[4];
		this.field976 = new int[4];
		this.field977 = new int[4];
		this.field978 = new int[4];
		this.field979 = new int[4];
		this.field1011 = new class360();
		this.field981 = -1;
		this.field982 = false;
		this.field960 = -1;
		this.field985 = -1;
		this.field986 = 0;
		this.field987 = 0;
		this.field988 = 0;
		this.field989 = -1;
		this.field980 = 0;
		this.field991 = 0;
		this.field992 = 0;
		this.field993 = 0;
		this.field994 = -1;
		this.field995 = 0;
		this.field984 = 0;
		this.field1006 = 0;
		this.field1007 = 200;
		this.field1008 = -1;
		this.field970 = -1;
		this.field1015 = 0;
		this.field1019 = 32;
		this.field947 = 0;
		this.field973 = new int[10];
		this.field1021 = new int[10];
		this.field1001 = new class201[10];
		this.field1009 = 0;
		this.field1022 = 0;
		this.field1023 = -1;
	}

	final void method2042() {
		this.field947 = 0;
		this.field1022 = 0;
	}

	boolean method2043() {
		return false;
	}

	final void method2041(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var8 = true;
		boolean var9 = true;

		int var10;
		for (var10 = 0; var10 < 4; ++var10) {
			if (this.field977[var10] > var5) {
				var8 = false;
			} else {
				var9 = false;
			}
		}

		var10 = -1;
		int var11 = -1;
		int var12 = 0;
		if (var1 >= 0) {
			class195 var13 = class366.method6810(var1);
			var11 = var13.field2157;
			var12 = var13.field2143;
		}

		int var15;
		if (var9) {
			if (var11 == -1) {
				return;
			}

			var10 = 0;
			var15 = 0;
			if (var11 == 0) {
				var15 = this.field977[0];
			} else if (var11 == 1) {
				var15 = this.field976[0];
			}

			for (int var14 = 1; var14 < 4; ++var14) {
				if (var11 == 0) {
					if (this.field977[var14] < var15) {
						var10 = var14;
						var15 = this.field977[var14];
					}
				} else if (var11 == 1 && this.field976[var14] < var15) {
					var10 = var14;
					var15 = this.field976[var14];
				}
			}

			if (var11 == 1 && var15 >= var2) {
				return;
			}
		} else {
			if (var8) {
				this.field954 = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) {
				byte var16 = this.field954;
				this.field954 = (byte)((this.field954 + 1) % 4);
				if (this.field977[var16] <= var5) {
					var10 = var16;
					break;
				}
			}
		}

		if (var10 >= 0) {
			this.field975[var10] = var1;
			this.field976[var10] = var2;
			this.field978[var10] = var3;
			this.field979[var10] = var4;
			this.field977[var10] = var6 + var12 + var5;
		}
	}

	final void method2044(int var1, int var2, int var3, int var4, int var5, int var6) {
		class179 var9 = (class179)class179.field1659.method5356((long)var1);
		class179 var8;
		if (null != var9) {
			var8 = var9;
		} else {
			byte[] var10 = class179.field1665.method6374(33, var1);
			var9 = new class179();
			if (null != var10) {
				var9.method2977(new class467(var10));
			}

			class179.field1659.method5364(var9, (long)var1);
			var8 = var9;
		}

		var9 = var8;
		class83 var15 = null;
		class83 var11 = null;
		int var12 = var8.field1662;
		int var13 = 0;

		class83 var14;
		for (var14 = (class83)this.field1011.method6705(); var14 != null; var14 = (class83)this.field1011.method6665()) {
			++var13;
			if (var14.field759.field1664 == var9.field1664) {
				var14.method1637(var2 + var4, var5, var6, var3);
				return;
			}

			if (var14.field759.field1661 <= var9.field1661) {
				var15 = var14;
			}

			if (var14.field759.field1662 > var12) {
				var11 = var14;
				var12 = var14.field759.field1662;
			}
		}

		if (var11 != null || var13 < 4) {
			var14 = new class83(var9);
			if (null == var15) {
				this.field1011.method6662(var14);
			} else {
				class360.method6727(var14, var15);
			}

			var14.method1637(var4 + var2, var5, var6, var3);
			if (var13 >= 4) {
				var11.method7951();
			}

		}
	}

	final void method2055(int var1) {
		class179 var4 = (class179)class179.field1659.method5356((long)var1);
		class179 var3;
		if (null != var4) {
			var3 = var4;
		} else {
			byte[] var5 = class179.field1665.method6374(33, var1);
			var4 = new class179();
			if (null != var5) {
				var4.method2977(new class467(var5));
			}

			class179.field1659.method5364(var4, (long)var1);
			var3 = var4;
		}

		var4 = var3;

		for (class83 var6 = (class83)this.field1011.method6705(); var6 != null; var6 = (class83)this.field1011.method6665()) {
			if (var6.field759 == var4) {
				var6.method7951();
				return;
			}
		}

	}
}
