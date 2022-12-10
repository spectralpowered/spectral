public class class83 extends class428 {
	static class326 field760;
	class179 field759;
	class360 field761;

	class83(class179 var1) {
		this.field761 = new class360();
		this.field759 = var1;
	}

	void method1637(int var1, int var2, int var3, int var4) {
		class99 var6 = null;
		int var7 = 0;

		for (class99 var8 = (class99)this.field761.method6705(); null != var8; var8 = (class99)this.field761.method6665()) {
			++var7;
			if (var8.field1029 == var1) {
				var8.method2058(var1, var2, var3, var4);
				return;
			}

			if (var8.field1029 <= var1) {
				var6 = var8;
			}
		}

		if (null == var6) {
			if (var7 < 4) {
				this.field761.method6662(new class99(var1, var2, var3, var4));
			}

		} else {
			class360.method6727(new class99(var1, var2, var3, var4), var6);
			if (var7 >= 4) {
				this.field761.method6705().method7951();
			}

		}
	}

	class99 method1639(int var1) {
		class99 var3 = (class99)this.field761.method6705();
		if (null != var3 && var3.field1029 <= var1) {
			for (class99 var4 = (class99)this.field761.method6665(); var4 != null && var4.field1029 <= var1; var4 = (class99)this.field761.method6665()) {
				var3.method7951();
				var3 = var4;
			}

			if (var3.field1033 + var3.field1029 + this.field759.field1655 > var1) {
				return var3;
			} else {
				var3.method7951();
				return null;
			}
		} else {
			return null;
		}
	}

	static void method1648() {
		for (class70 var1 = (class70)class70.field604.method6577(); null != var1; var1 = (class70)class70.field604.method6579()) {
			if (null != var1.field608) {
				var1.method1397();
			}
		}

	}

	boolean method1640() {
		return this.field761.method6667();
	}

	static String method1647(char var0, int var1) {
		char[] var3 = new char[var1];

		for (int var4 = 0; var4 < var1; ++var4) {
			var3[var4] = var0;
		}

		return new String(var3);
	}

	static final void method1641(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class87.method1889(var0)) {
			class28.field173 = null;
			class51.method1013(class72.field625[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (null != class28.field173) {
				class51.method1013(class28.field173, -1412584499, var1, var2, var3, var4, class148.field1427, class179.field1670, var7);
				class28.field173 = null;
			}

		} else {
			if (var7 != -1) {
				client.field1913[var7] = true;
			} else {
				for (int var9 = 0; var9 < 100; ++var9) {
					client.field1913[var9] = true;
				}
			}

		}
	}
}
