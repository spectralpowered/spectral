import java.io.IOException;

public class class331 {
	static final class331 field4174;
	static final class331 field4178;
	final int field4175;
	final int field4176;

	static {
		field4178 = new class331(51, 27, 800, 0, 16, 16);
		field4174 = new class331(25, 28, 800, 656, 40, 40);
	}

	static class331[] method4939() {
		return new class331[]{field4178, field4174};
	}

	class331(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field4175 = var5;
		this.field4176 = var6;
	}

	static class86 method6269() {
		class459 var1 = null;
		class86 var2 = new class86();

		try {
			var1 = class94.method2015("", class268.field3153.field4224, false);
			byte[] var3 = new byte[(int)var1.method8194()];

			int var5;
			for (int var4 = 0; var4 < var3.length; var4 += var5) {
				var5 = var1.method8188(var3, var4, var3.length - var4);
				if (var5 == -1) {
					throw new IOException();
				}
			}

			var2 = new class86(new class467(var3));
		} catch (Exception var7) {
		}

		try {
			if (var1 != null) {
				var1.method8185();
			}
		} catch (Exception var6) {
		}

		return var2;
	}
}
