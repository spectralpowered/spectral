public abstract class class189 {
	public static class481 field2059;
	public int field2055;
	public int field2056;
	public int field2057;
	public int field2058;

	protected class189() {
	}

	public static final boolean method3627(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class196.method3876(var0)) {
			return true;
		} else {
			char[] var2 = class462.field4901;

			int var3;
			char var4;
			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var4 == var0) {
					return true;
				}
			}

			var2 = class462.field4900;

			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var0 == var4) {
					return true;
				}
			}

			return false;
		}
	}

	static final void method3626(int var0, int var1) {
		if (client.field1707 == 2) {
			class64.method1201((client.field1710 - class151.field1447 << 7) + client.field1713, (client.field1751 - class388.field4509 << 7) + client.field1808, client.field1712 * 2);
			if (client.field1905 > -1 && client.field1700 % 20 < 10) {
				class363.field4354[0].method8866(var0 + client.field1905 - 12, var1 + client.field1726 - 28);
			}

		}
	}

	protected abstract boolean method3624(int var1, int var2, int var3, class205 var4);
}
