public class class38 {
	public static class360 field234;

	static {
		field234 = new class360();
	}

	class38() throws Throwable {
		throw new Error();
	}

	public static boolean method492() {
		try {
			if (2 == class300.field3632) {
				if (class300.field3637 == null) {
					class300.field3637 = class289.method5490(class312.field3717, class127.field1269, class300.field3635);
					if (class300.field3637 == null) {
						return false;
					}
				}

				if (null == class81.field746) {
					class81.field746 = new class36(class300.field3639, class300.field3631);
				}

				if (class253.field2963.method5381(class300.field3637, class300.field3633, class81.field746, 22050)) {
					class253.field2963.method5382();
					class253.field2963.method5442(class468.field4918);
					class253.field2963.method5462(class300.field3637, class141.field1359);
					class300.field3632 = 0;
					class300.field3637 = null;
					class81.field746 = null;
					class312.field3717 = null;
					return true;
				}
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			class253.field2963.method5385();
			class300.field3632 = 0;
			class300.field3637 = null;
			class81.field746 = null;
			class312.field3717 = null;
		}

		return false;
	}

	static final void method497(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!client.field1837) {
			if (client.field1838 < 500) {
				client.field1844[client.field1838] = var0;
				client.field1725[client.field1838] = var1;
				client.field1932[client.field1838] = var2;
				client.field1802[client.field1838] = var3;
				client.field1839[client.field1838] = var4;
				client.field1832[client.field1838] = var5;
				client.field1843[client.field1838] = var6;
				client.field1846[client.field1838] = var7;
				++client.field1838;
			}

		}
	}

	static void method500(int var0) {
		if (var0 != client.field1689) {
			client.field1689 = var0;
		}
	}
}
