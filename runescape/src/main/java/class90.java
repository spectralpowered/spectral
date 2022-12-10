import java.util.concurrent.Callable;

public class class90 implements Callable {
	static class491 field860;

	class90() {
	}

	public Object call() {
		return class53.method1041();
	}

	static class209 method1957(int var0) {
		class209 var2 = (class209)class183.field1995.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			class337 var4 = class183.field1993;
			class337 var5 = class122.field1213;
			boolean var6 = true;
			int[] var7 = var4.method6312(var0);

			for (int var8 = 0; var8 < var7.length; ++var8) {
				byte[] var9 = var4.method6309(var0, var7[var8]);
				if (null == var9) {
					var6 = false;
				} else {
					int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
					byte[] var11 = var5.method6309(var10, 0);
					if (var11 == null) {
						var6 = false;
					}
				}
			}

			class209 var3;
			if (!var6) {
				var3 = null;
			} else {
				try {
					var3 = new class209(var4, var5, var0, false);
				} catch (Exception var13) {
					var3 = null;
				}
			}

			if (var3 != null) {
				class183.field1995.method5364(var3, (long)var0);
			}

			return var3;
		}
	}
}
