public class class87 {
	static byte[] field813;
	static class201[] field822;
	static class467 field825;
	static class467[] field815;
	static int field812;
	static int field818;
	static int field820;
	static int[] field816;
	static int[] field817;
	static int[] field819;
	static int[] field821;
	static int[] field823;
	static int[] field824;

	static {
		field813 = new byte[2048];
		field822 = new class201[2048];
		field815 = new class467[2048];
		field818 = 0;
		field817 = new int[2048];
		field812 = 0;
		field819 = new int[2048];
		field816 = new int[2048];
		field821 = new int[2048];
		field823 = new int[2048];
		field820 = 0;
		field824 = new int[2048];
		field825 = new class467(new byte[5000]);
	}

	class87() throws Throwable {
		throw new Error();
	}

	public static boolean method1889(int var0) {
		if (class340.field4272[var0]) {
			return true;
		} else if (!class422.field4721.method6305(var0)) {
			return false;
		} else {
			int var2 = class422.field4721.method6330(var0);
			if (var2 == 0) {
				class340.field4272[var0] = true;
				return true;
			} else {
				if (null == class72.field625[var0]) {
					class72.field625[var0] = new class290[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) {
					if (null == class72.field625[var0][var3]) {
						byte[] var4 = class422.field4721.method6374(var0, var3);
						if (null != var4) {
							class72.field625[var0][var3] = new class290();
							class72.field625[var0][var3].field3492 = (var0 << 16) + var3;
							if (-1 == var4[0]) {
								class72.field625[var0][var3].method5522(new class467(var4));
							} else {
								class72.field625[var0][var3].method5495(new class467(var4));
							}
						}
					}
				}

				class340.field4272[var0] = true;
				return true;
			}
		}
	}
}
