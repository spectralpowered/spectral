public class class179 extends class439 {
	public static class282 field1659;
	public static class337 field1665;
	static class282 field1658;
	static class337 field1656;
	static int field1670;
	int field1666;
	int field1667;
	public int field1655;
	public int field1657;
	public int field1661;
	public int field1662;
	public int field1663;
	public int field1664;
	public int field1668;
	public int field1669;

	public class179() {
		this.field1661 = 255;
		this.field1662 = 255;
		this.field1663 = -1;
		this.field1657 = 1;
		this.field1655 = 70;
		this.field1666 = -1;
		this.field1667 = -1;
		this.field1668 = 30;
		this.field1669 = 0;
	}

	static {
		field1659 = new class282(64);
		field1658 = new class282(64);
	}

	public static void method2198(class337 var0, class337 var1) {
		field1665 = var0;
		field1656 = var1;
	}

	public void method2977(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method2974(var1, var3);
		}
	}

	void method2974(class467 var1, int var2) {
		if (var2 == 1) {
			var1.method8328();
		} else if (var2 == 2) {
			this.field1661 = var1.method8326();
		} else if (var2 == 3) {
			this.field1662 = var1.method8326();
		} else if (var2 == 4) {
			this.field1663 = 0;
		} else if (var2 == 5) {
			this.field1655 = var1.method8328();
		} else if (var2 == 6) {
			var1.method8326();
		} else if (var2 == 7) {
			this.field1666 = var1.method8344();
		} else if (var2 == 8) {
			this.field1667 = var1.method8344();
		} else if (var2 == 11) {
			this.field1663 = var1.method8328();
		} else if (var2 == 14) {
			this.field1668 = var1.method8326();
		} else if (var2 == 15) {
			this.field1669 = var1.method8326();
		}

	}

	public class491 method2975() {
		if (this.field1666 < 0) {
			return null;
		} else {
			class491 var2 = (class491)field1658.method5356((long)this.field1666);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class125.method2359(field1656, this.field1666, 0);
				if (var2 != null) {
					field1658.method5364(var2, (long)this.field1666);
				}

				return var2;
			}
		}
	}

	public class491 method2976() {
		if (this.field1667 < 0) {
			return null;
		} else {
			class491 var2 = (class491)field1658.method5356((long)this.field1667);
			if (null != var2) {
				return var2;
			} else {
				var2 = class125.method2359(field1656, this.field1667, 0);
				if (var2 != null) {
					field1658.method5364(var2, (long)this.field1667);
				}

				return var2;
			}
		}
	}

	public static void method4148() {
		field1659.method5357();
		field1658.method5357();
	}

	static String method2985(String var0, class290 var1) {
		if (var0.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; ++var3) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					String var5 = var0.substring(0, var4);
					int var7 = class66.method1228(var1, var3 - 1);
					String var6;
					if (var7 < 999999999) {
						var6 = Integer.toString(var7);
					} else {
						var6 = "*";
					}

					var0 = var5 + var6 + var0.substring(var4 + 2);
				}
			}
		}

		return var0;
	}
}
