public class class300 {
	public static boolean field3640;
	public static int field3632;
	public static int field3634;
	public static int field3635;
	static class289 field3637;
	static class337 field3631;
	static class337 field3633;
	static class337 field3639;

	static {
		field3632 = 0;
	}

	class300() throws Throwable {
		throw new Error();
	}

	public static boolean method5246(class337 var0, class337 var1, class337 var2, class287 var3) {
		field3633 = var0;
		field3631 = var1;
		field3639 = var2;
		class253.field2963 = var3;
		return true;
	}

	public static void method502(class337 var0, int var1, int var2, int var3, boolean var4) {
		field3632 = 1;
		class312.field3717 = var0;
		class127.field1269 = var1;
		field3635 = var2;
		class468.field4918 = var3;
		class141.field1359 = var4;
		field3634 = 10000;
	}

	public static void method868(int var0) {
		if (field3632 != 0) {
			class468.field4918 = var0;
		} else {
			class253.field2963.method5442(var0);
		}

	}

	public static void method48() {
		class253.field2963.method5385();
		field3632 = 1;
		class312.field3717 = null;
	}

	public static void method6996(int var0) {
		field3632 = 1;
		class312.field3717 = null;
		class127.field1269 = -1;
		field3635 = -1;
		class468.field4918 = 0;
		class141.field1359 = false;
		field3634 = var0;
	}

	public static boolean method2906() {
		return field3632 != 0 ? true : class253.field2963.method5386();
	}
}
