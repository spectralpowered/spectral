import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

public class class356 implements class343 {
	public static class467 field4309;
	static class338 field4322;
	static int field4318;
	static final class356 field4306;
	static final class356 field4307;
	static final class356 field4308;
	static final class356 field4310;
	static final class356 field4311;
	static final class356 field4312;
	static final class356 field4313;
	static final class356 field4314;
	static final class356 field4315;
	static final class356 field4316;
	static final class356 field4321;
	static final class356 field4323;
	static final class356 field4324;
	final int field4319;
	final Set field4320;

	static {
		field4324 = new class356("", 0, new class349[]{class349.field4286});
		field4306 = new class356("", 1, new class349[]{class349.field4284, class349.field4286});
		field4308 = new class356("", 2, new class349[]{class349.field4284, class349.field4285, class349.field4286});
		field4307 = new class356("", 3, new class349[]{class349.field4284});
		field4310 = new class356("", 4);
		field4311 = new class356("", 5, new class349[]{class349.field4284, class349.field4286});
		field4321 = new class356("", 6, new class349[]{class349.field4286});
		field4313 = new class356("", 8, new class349[]{class349.field4284, class349.field4286});
		field4314 = new class356("", 9, new class349[]{class349.field4284, class349.field4285});
		field4315 = new class356("", 10, new class349[]{class349.field4284});
		field4316 = new class356("", 11, new class349[]{class349.field4284});
		field4323 = new class356("", 12, new class349[]{class349.field4284, class349.field4286});
		field4312 = new class356("", 13, new class349[]{class349.field4284});
	}

	public static void method6604(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class44.field319.startsWith("win") && !var2) {
				class44.method73(var0, 0);
			} else if (class44.field319.startsWith("mac")) {
				class99.method2057(var0, 1, "openjs");
			} else {
				class44.method73(var0, 2);
			}
		} else {
			class44.method73(var0, 3);
		}

	}

	class356(String var1, int var2) {
		this.field4320 = new HashSet();
		this.field4319 = var2;
	}

	class356(String var1, int var2, class349[] var3) {
		this.field4320 = new HashSet();
		this.field4319 = var2;
		class349[] var4 = var3;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class349 var6 = var4[var5];
			this.field4320.add(var6);
		}

	}

	public int method6487() {
		return this.field4319;
	}
}
