import java.util.Locale;

@class347
@class291
public class class340 implements class343 {
	public static int field4263;
	public static final class340 field4257;
	public static final class340 field4259;
	public static final class340 field4262;
	public static final class340[] field4268;
	static boolean[] field4272;
	static final class340 field4258;
	static final class340 field4260;
	static final class340 field4261;
	static final class340 field4266;
	final int field4267;
	final String field4264;
	final String field4265;

	static {
		field4257 = new class340("EN", "en", "English", class356.field4324, 0, "GB");
		field4266 = new class340("DE", "de", "German", class356.field4324, 1, "DE");
		field4259 = new class340("FR", "fr", "French", class356.field4324, 2, "FR");
		field4260 = new class340("PT", "pt", "Portuguese", class356.field4324, 3, "BR");
		field4261 = new class340("NL", "nl", "Dutch", class356.field4307, 4, "NL");
		field4262 = new class340("ES", "es", "Spanish", class356.field4307, 5, "ES");
		field4258 = new class340("ES_MX", "es-mx", "Spanish (Latin American)", class356.field4324, 6, "MX");
		class340[] var0 = new class340[]{field4266, field4262, field4259, field4261, field4258, field4260, field4257};
		field4268 = new class340[var0.length];
		class340[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class340 var4 = var2[var3];
			if (field4268[var4.field4267] != null) {
				throw new IllegalStateException();
			}

			field4268[var4.field4267] = var4;
		}

	}

	class340(String var1, String var2, String var3, class356 var4, int var5, String var6) {
		this.field4264 = var1;
		this.field4265 = var2;
		this.field4267 = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	String method6418() {
		return this.field4265;
	}

	public int method6487() {
		return this.field4267;
	}

	public String toString() {
		return this.method6418().toLowerCase(Locale.ENGLISH);
	}

	static void method6427() {
		class87.field818 = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			class87.field815[var1] = null;
			class87.field822[var1] = class201.field2309;
		}

	}
}
