public class class78 {
	static class491[] field706;
	static class78[] field710;
	static int field707;
	static int field709;
	static int[] field712;
	static int[] field713;
	int field708;
	int field714;
	int field715;
	int field717;
	int field719;
	String field711;
	String field716;

	static {
		field709 = 0;
		field707 = 0;
		field713 = new int[]{1, 1, 1, 1};
		field712 = new int[]{0, 1, 2, 3};
	}

	public static class343 method1584(class343[] var0, int var1) {
		class343[] var3 = var0;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class343 var5 = var3[var4];
			if (var1 == var5.method6487()) {
				return var5;
			}
		}

		return null;
	}

	class78() {
	}

	static void method7901(int var0, boolean var1, int var2, boolean var3) {
		if (null != field710) {
			class241.method4785(0, field710.length - 1, var0, var1, var2, var3);
		}

	}

	static class78 method6071() {
		field707 = 0;
		return class129.method2429();
	}

	boolean method1533() {
		return 0 != (1 & this.field714);
	}

	boolean method1573() {
		return 0 != (2 & this.field714);
	}

	boolean method1535() {
		return 0 != (4 & this.field714);
	}

	boolean method1536() {
		return 0 != (8 & this.field714);
	}

	boolean method1578() {
		return 0 != (536870912 & this.field714);
	}

	boolean method1538() {
		return 0 != (33554432 & this.field714);
	}

	boolean method1594() {
		return 0 != (1073741824 & this.field714);
	}

	boolean method1592() {
		return 0 != (256 & this.field714);
	}

	boolean method1541() {
		return (134217728 & this.field714) != 0;
	}
}
