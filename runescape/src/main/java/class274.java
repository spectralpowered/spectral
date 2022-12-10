import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class class274 {
	public static final class274 field3172;
	public static final class274 field3173;
	public static final class274 field3174;
	public static final class274 field3175;
	public static final class274 field3176;
	public static final class274 field3178;
	public static final class274 field3179;
	public static final class274 field3180;
	public static final class274 field3181;
	public static final class274 field3182;
	public static final class274 field3183;
	public static final class274 field3184;
	public static final class274 field3185;
	public static final class274 field3186;

	static {
		field3185 = new class274();
		field3173 = new class274();
		field3174 = new class274();
		field3186 = new class274();
		field3176 = new class274();
		field3181 = new class274();
		field3183 = new class274();
		field3179 = new class274();
		field3180 = new class274();
		field3172 = new class274();
		field3182 = new class274();
		field3175 = new class274();
		field3184 = new class274();
		field3178 = new class274();
	}

	public static class274[] method3894() {
		return new class274[]{field3185, field3173, field3174, field3186, field3176, field3181, field3183, field3179, field3180, field3172, field3182, field3175, field3184, field3178};
	}

	class274() {
	}

	protected static int method5312() {
		int var1 = 0;
		if (class62.field505 == null || !class62.field505.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
					if (var3.isValid()) {
						class62.field505 = var3;
						class40.field284 = -1L;
						class40.field282 = -1L;
					}
				}
			} catch (Throwable var12) {
			}
		}

		if (class62.field505 != null) {
			long var10 = class74.method1493();
			long var4 = class62.field505.getCollectionTime();
			if (class40.field282 != -1L) {
				long var6 = var4 - class40.field282;
				long var8 = var10 - class40.field284;
				if (0L != var8) {
					var1 = (int)(var6 * 100L / var8);
				}
			}

			class40.field282 = var4;
			class40.field284 = var10;
		}

		return var1;
	}
}
