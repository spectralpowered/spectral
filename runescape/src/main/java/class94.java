import java.io.File;
import java.io.IOException;

public class class94 implements class343 {
	static class469[] field922;
	static int field912;
	static int field920;
	static final class94 field913;
	static final class94 field915;
	static final class94 field916;
	static final class94 field917;
	static final class94 field921;
	static final class94 field923;
	final int field918;
	final int field919;

	static {
		field917 = new class94(0, -1);
		field913 = new class94(1, 2);
		field923 = new class94(2, 3);
		field915 = new class94(3, 4);
		field916 = new class94(4, 5);
		field921 = new class94(5, 6);
	}

	static class94[] method2862() {
		return new class94[]{field913, field915, field916, field917, field921, field923};
	}

	public static boolean method2018(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	class94(int var1, int var2) {
		this.field918 = var1;
		this.field919 = var2;
	}

	public int method6487() {
		return this.field919;
	}

	public static class197 method2017(int var0) {
		class197 var2 = (class197)class197.field2221.method5356((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class358.field4337.method6374(8, var0);
			var2 = new class197();
			if (var3 != null) {
				var2.method3878(new class467(var3));
			}

			class197.field2221.method5364(var2, (long)var0);
			return var2;
		}
	}

	public static class459 method2015(String var0, String var1, boolean var2) {
		File var4 = new File(class267.field3148, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				class459 var11 = new class459(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
			}
		}

		String var5 = "";
		if (class268.field3160 == 33) {
			var5 = "_rc";
		} else if (class268.field3160 == 34) {
			var5 = "_wip";
		}

		File var6 = new File(class110.field1118, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		class459 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new class459(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
			}
		}

		try {
			var7 = new class459(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}
}
