import java.util.HashMap;
import java.util.Map;

public class class183 extends class439 {
	public static class282 field1994;
	public static class282 field1995;
	public static class282 field2008;
	static boolean field2017;
	static class337 field1992;
	static class337 field1993;
	boolean[] field2007;
	int field2000;
	int field2014;
	int[] field2002;
	int[] field2006;
	public boolean field1996;
	public boolean field2013;
	public int field1991;
	public int field1997;
	public int field1999;
	public int field2005;
	public int field2010;
	public int field2011;
	public int field2012;
	public int field2015;
	public int field2016;
	public int[] field2003;
	public int[] field2004;
	public int[] field2009;
	public Map field1998;

	static {
		field2017 = false;
		field1994 = new class282(64);
		field1995 = new class282(100);
		field2008 = new class282(100);
	}

	public static class491[] method3549(class337 var0, int var1, int var2) {
		byte[] var5 = var0.method6374(var1, var2);
		boolean var4;
		if (null == var5) {
			var4 = false;
		} else {
			class165.method2776(var5);
			var4 = true;
		}

		return !var4 ? null : class375.method7033();
	}

	class183() {
		this.field1997 = -1;
		this.field2014 = 0;
		this.field2000 = 0;
		this.field2012 = -1;
		this.field1996 = false;
		this.field2015 = 5;
		this.field2010 = -1;
		this.field2011 = -1;
		this.field2016 = 99;
		this.field2013 = false;
		this.field2005 = -1;
		this.field1999 = -1;
		this.field1991 = 2;
	}

	public static void method4959(class337 var0, class337 var1, class337 var2) {
		field1992 = var0;
		field1993 = var1;
		class122.field1213 = var2;
	}

	void method3500(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method3538(var1, var3);
		}
	}

	void method3538(class467 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method8328();
			this.field2003 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2003[var5] = var1.method8328();
			}

			this.field2009 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2009[var5] = var1.method8328();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2009[var5] += var1.method8328() << 16;
			}
		} else if (var2 == 2) {
			this.field2012 = var1.method8328();
		} else if (var2 == 3) {
			var4 = var1.method8326();
			this.field2006 = new int[var4 + 1];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2006[var5] = var1.method8326();
			}

			this.field2006[var4] = 9999999;
		} else if (var2 == 4) {
			this.field1996 = true;
		} else if (var2 == 5) {
			this.field2015 = var1.method8326();
		} else if (var2 == 6) {
			this.field2010 = var1.method8328();
		} else if (var2 == 7) {
			this.field2011 = var1.method8328();
		} else if (var2 == 8) {
			this.field2016 = var1.method8326();
			this.field2013 = true;
		} else if (var2 == 9) {
			this.field2005 = var1.method8326();
		} else if (var2 == 10) {
			this.field1999 = var1.method8326();
		} else if (var2 == 11) {
			this.field1991 = var1.method8326();
		} else if (var2 == 12) {
			var4 = var1.method8326();
			this.field2002 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2002[var5] = var1.method8328();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2002[var5] += var1.method8328() << 16;
			}
		} else if (var2 == 13) {
			var4 = var1.method8326();
			this.field2004 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2004[var5] = var1.method8330();
			}
		} else if (var2 == 14) {
			this.field1997 = var1.method8480();
		} else if (var2 == 15) {
			var4 = var1.method8328();
			this.field1998 = new HashMap();

			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var1.method8328();
				int var7 = var1.method8330();
				this.field1998.put(var6, var7);
			}
		} else if (var2 == 16) {
			this.field2014 = var1.method8328();
			this.field2000 = var1.method8328();
		} else if (var2 == 17) {
			this.field2007 = new boolean[256];

			for (var4 = 0; var4 < this.field2007.length; ++var4) {
				this.field2007[var4] = false;
			}

			var4 = var1.method8326();

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2007[var1.method8326()] = true;
			}
		}

	}

	void method3501() {
		if (-1 == this.field2005) {
			if (null == this.field2006 && this.field2007 == null) {
				this.field2005 = 0;
			} else {
				this.field2005 = 2;
			}
		}

		if (this.field1999 == -1) {
			if (null == this.field2006 && this.field2007 == null) {
				this.field1999 = 0;
			} else {
				this.field1999 = 2;
			}
		}

	}

	public class216 method3502(class216 var1, int var2) {
		class216 var5;
		if (!this.method3505()) {
			var2 = this.field2009[var2];
			class209 var6 = class90.method1957(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.method4382(true);
			} else {
				var5 = var1.method4382(!var6.method4142(var2));
				var5.method4389(var6, var2);
				return var5;
			}
		} else {
			class153 var4 = class73.method1470(this.field1997);
			if (null == var4) {
				return var1.method4382(true);
			} else {
				var5 = var1.method4382(!var4.method2683());
				var5.method4434(var4, var2);
				return var5;
			}
		}
	}

	class216 method3503(class216 var1, int var2, int var3) {
		class216 var6;
		if (!this.method3505()) {
			var2 = this.field2009[var2];
			class209 var7 = class90.method1957(var2 >> 16);
			var2 &= 65535;
			if (var7 == null) {
				return var1.method4382(true);
			} else {
				var6 = var1.method4382(!var7.method4142(var2));
				var3 &= 3;
				if (var3 == 1) {
					var6.method4478();
				} else if (var3 == 2) {
					var6.method4398();
				} else if (var3 == 3) {
					var6.method4397();
				}

				var6.method4389(var7, var2);
				if (var3 == 1) {
					var6.method4397();
				} else if (var3 == 2) {
					var6.method4398();
				} else if (var3 == 3) {
					var6.method4478();
				}

				return var6;
			}
		} else {
			class153 var5 = class73.method1470(this.field1997);
			if (null == var5) {
				return var1.method4382(true);
			} else {
				var6 = var1.method4382(!var5.method2683());
				var3 &= 3;
				if (var3 == 1) {
					var6.method4478();
				} else if (var3 == 2) {
					var6.method4398();
				} else if (var3 == 3) {
					var6.method4397();
				}

				var6.method4434(var5, var2);
				if (var3 == 1) {
					var6.method4397();
				} else if (var3 == 2) {
					var6.method4398();
				} else if (var3 == 3) {
					var6.method4478();
				}

				return var6;
			}
		}
	}

	class216 method3504(class216 var1, int var2) {
		class216 var5;
		if (!this.method3505()) {
			var2 = this.field2009[var2];
			class209 var6 = class90.method1957(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.method4383(true);
			} else {
				var5 = var1.method4383(!var6.method4142(var2));
				var5.method4389(var6, var2);
				return var5;
			}
		} else {
			class153 var4 = class73.method1470(this.field1997);
			if (null == var4) {
				return var1.method4383(true);
			} else {
				var5 = var1.method4383(!var4.method2683());
				var5.method4434(var4, var2);
				return var5;
			}
		}
	}

	public class216 method3543(class216 var1, int var2, class183 var3, int var4) {
		if (field2017 && !this.method3505() && !var3.method3505()) {
			return this.method3515(var1, var2, var3, var4);
		} else {
			class216 var6 = var1.method4382(false);
			boolean var7 = false;
			class209 var8 = null;
			class222 var9 = null;
			class153 var10;
			if (this.method3505()) {
				var10 = this.method3510();
				if (var10 == null) {
					return var6;
				}

				if (var3.method3505() && null == this.field2007) {
					var6.method4434(var10, var2);
					return var6;
				}

				var9 = var10.field1456;
				var6.method4459(var9, var10, var2, this.field2007, false, !var3.method3505());
			} else {
				var2 = this.field2009[var2];
				var8 = class90.method1957(var2 >> 16);
				var2 &= 65535;
				if (null == var8) {
					return var3.method3502(var1, var4);
				}

				if (!var3.method3505() && (null == this.field2006 || var4 == -1)) {
					var6.method4389(var8, var2);
					return var6;
				}

				if (this.field2006 == null || var4 == -1) {
					var6.method4389(var8, var2);
					return var6;
				}

				var7 = var3.method3505();
				if (!var7) {
					var6.method4395(var8, var2, this.field2006, false);
				}
			}

			if (var3.method3505()) {
				var10 = var3.method3510();
				if (null == var10) {
					return var6;
				}

				if (var9 == null) {
					var9 = var10.field1456;
				}

				var6.method4459(var9, var10, var4, this.field2007, true, true);
			} else {
				var4 = var3.field2009[var4];
				class209 var11 = class90.method1957(var4 >> 16);
				var4 &= 65535;
				if (null == var11) {
					return this.method3502(var1, var2);
				}

				var6.method4395(var11, var4, this.field2006, true);
			}

			if (var7 && null != var8) {
				var6.method4395(var8, var2, this.field2006, false);
			}

			var6.method4469();
			return var6;
		}
	}

	class216 method3515(class216 var1, int var2, class183 var3, int var4) {
		var2 = this.field2009[var2];
		class209 var6 = class90.method1957(var2 >> 16);
		var2 &= 65535;
		if (null == var6) {
			return var3.method3502(var1, var4);
		} else {
			var4 = var3.field2009[var4];
			class209 var7 = class90.method1957(var4 >> 16);
			var4 &= 65535;
			class216 var8;
			if (var7 == null) {
				var8 = var1.method4382(!var6.method4142(var2));
				var8.method4389(var6, var2);
				return var8;
			} else {
				var8 = var1.method4382(!var6.method4142(var2) & !var7.method4142(var4));
				var8.method4405(var6, var2, var7, var4, this.field2006);
				return var8;
			}
		}
	}

	public class216 method3507(class216 var1, int var2) {
		if (!this.method3505()) {
			int var4 = this.field2009[var2];
			class209 var5 = class90.method1957(var4 >> 16);
			var4 &= 65535;
			if (var5 == null) {
				return var1.method4382(true);
			} else {
				class209 var6 = null;
				int var7 = 0;
				if (null != this.field2002 && var2 < this.field2002.length) {
					var7 = this.field2002[var2];
					var6 = class90.method1957(var7 >> 16);
					var7 &= 65535;
				}

				class216 var8;
				if (null != var6 && var7 != 65535) {
					var8 = var1.method4382(!var5.method4142(var4) & !var6.method4142(var7));
					var8.method4389(var5, var4);
					var8.method4389(var6, var7);
					return var8;
				} else {
					var8 = var1.method4382(!var5.method4142(var4));
					var8.method4389(var5, var4);
					return var8;
				}
			}
		} else {
			return this.method3502(var1, var2);
		}
	}

	public boolean method3505() {
		return this.field1997 >= 0;
	}

	public int method3509() {
		return this.field2000 - this.field2014;
	}

	class153 method3510() {
		return this.method3505() ? class73.method1470(this.field1997) : null;
	}
}
