public class class169 extends class439 {
	public static class169[] field1575;
	public static class282 field1577;
	public static class337 field1594;
	public static int field1576;
	byte[] field1597;
	int field1583;
	int field1586;
	int field1590;
	int field1591;
	int field1592;
	int[] field1579;
	int[] field1582;
	public boolean field1585;
	public boolean field1589;
	public class192 field1580;
	public class194 field1595;
	public int field1574;
	public int field1584;
	public int field1596;
	public int field1598;
	public String field1581;
	public String field1588;
	public String[] field1587;
	public final int field1578;

	static {
		field1577 = new class282(256);
	}

	public class169(int var1) {
		this.field1574 = -1;
		this.field1583 = -1;
		this.field1584 = 0;
		this.field1585 = true;
		this.field1589 = false;
		this.field1587 = new String[5];
		this.field1590 = Integer.MAX_VALUE;
		this.field1591 = Integer.MAX_VALUE;
		this.field1592 = Integer.MIN_VALUE;
		this.field1586 = Integer.MIN_VALUE;
		this.field1580 = class192.field2113;
		this.field1595 = class194.field2132;
		this.field1598 = -1;
		this.field1578 = var1;
	}

	public void method2866(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method2867(var1, var3);
		}
	}

	void method2867(class467 var1, int var2) {
		if (var2 == 1) {
			this.field1574 = var1.method8344();
		} else if (var2 == 2) {
			this.field1583 = var1.method8344();
		} else if (var2 == 3) {
			this.field1581 = var1.method8335();
		} else if (var2 == 4) {
			this.field1596 = var1.method8330();
		} else if (var2 == 5) {
			var1.method8330();
		} else if (var2 == 6) {
			this.field1584 = var1.method8326();
		} else {
			int var4;
			if (var2 == 7) {
				var4 = var1.method8326();
				if (0 == (var4 & 1)) {
					this.field1585 = false;
				}

				if ((var4 & 2) == 2) {
					this.field1589 = true;
				}
			} else if (var2 == 8) {
				var1.method8326();
			} else if (var2 >= 10 && var2 <= 14) {
				this.field1587[var2 - 10] = var1.method8335();
			} else if (var2 == 15) {
				var4 = var1.method8326();
				this.field1582 = new int[var4 * 2];

				int var5;
				for (var5 = 0; var5 < var4 * 2; ++var5) {
					this.field1582[var5] = var1.method8329();
				}

				var1.method8480();
				var5 = var1.method8326();
				this.field1579 = new int[var5];

				int var6;
				for (var6 = 0; var6 < this.field1579.length; ++var6) {
					this.field1579[var6] = var1.method8480();
				}

				this.field1597 = new byte[var4];

				for (var6 = 0; var6 < var4; ++var6) {
					this.field1597[var6] = var1.method8327();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.field1588 = var1.method8335();
				} else if (var2 == 18) {
					var1.method8344();
				} else if (var2 == 19) {
					this.field1598 = var1.method8328();
				} else if (var2 == 21) {
					var1.method8480();
				} else if (var2 == 22) {
					var1.method8480();
				} else if (var2 == 23) {
					var1.method8326();
					var1.method8326();
					var1.method8326();
				} else if (var2 == 24) {
					var1.method8329();
					var1.method8329();
				} else if (var2 == 25) {
					var1.method8344();
				} else if (var2 == 28) {
					var1.method8326();
				} else if (var2 == 29) {
					class192[] var7 = new class192[]{class192.field2116, class192.field2113, class192.field2114};
					this.field1580 = (class192)class78.method1584(var7, var1.method8326());
				} else if (var2 == 30) {
					class194[] var8 = new class194[]{class194.field2135, class194.field2134, class194.field2132};
					this.field1595 = (class194)class78.method1584(var8, var1.method8326());
				}
			}
		}

	}

	public void method2868() {
		if (null != this.field1582) {
			for (int var2 = 0; var2 < this.field1582.length; var2 += 2) {
				if (this.field1582[var2] < this.field1590) {
					this.field1590 = this.field1582[var2];
				} else if (this.field1582[var2] > this.field1592) {
					this.field1592 = this.field1582[var2];
				}

				if (this.field1582[var2 + 1] < this.field1591) {
					this.field1591 = this.field1582[var2 + 1];
				} else if (this.field1582[var2 + 1] > this.field1586) {
					this.field1586 = this.field1582[var2 + 1];
				}
			}
		}

	}

	public class491 method2869(boolean var1) {
		int var3 = var1 ? this.field1583 : this.field1574;
		return this.method2870(var3);
	}

	class491 method2870(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			class491 var3 = (class491)field1577.method5356((long)var1);
			if (var3 != null) {
				return var3;
			} else {
				var3 = class125.method2359(field1594, var1, 0);
				if (null != var3) {
					field1577.method5364(var3, (long)var1);
				}

				return var3;
			}
		}
	}

	public int method2871() {
		return this.field1578;
	}
}
