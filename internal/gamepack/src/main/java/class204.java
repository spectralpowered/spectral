import io.spectralpowered.ObfInfo;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

@ObfInfo(
	name = "jn"
)
public class class204 {
	@ObfInfo(
		owner = "jn",
		name = "b",
		desc = "Ljn;"
	)
	public static final class204 field1760;
	@ObfInfo(
		owner = "jn",
		name = "e",
		desc = "Ljn;"
	)
	public static final class204 field1761;
	@ObfInfo(
		owner = "jn",
		name = "v",
		desc = "Ljn;"
	)
	public static final class204 field1762;
	@ObfInfo(
		owner = "jn",
		name = "g",
		desc = "Ljn;"
	)
	public static final class204 field1763;
	@ObfInfo(
		owner = "jn",
		name = "m",
		desc = "Ljn;"
	)
	public static final class204 field1764;
	@ObfInfo(
		owner = "jn",
		name = "o",
		desc = "Ljn;"
	)
	public static final class204 field1765;
	@ObfInfo(
		owner = "jn",
		name = "r",
		desc = "Ljn;"
	)
	public static final class204 field1766;
	@ObfInfo(
		owner = "jn",
		name = "u",
		desc = "Ljn;"
	)
	public static final class204 field1767;
	@ObfInfo(
		owner = "jn",
		name = "q",
		desc = "Ljn;"
	)
	public static final class204 field1768;
	@ObfInfo(
		owner = "jn",
		name = "j",
		desc = "Ljn;"
	)
	public static final class204 field1769;
	@ObfInfo(
		owner = "jn",
		name = "f",
		desc = "Ljn;"
	)
	public static final class204 field1770;
	@ObfInfo(
		owner = "jn",
		name = "i",
		desc = "Ljn;"
	)
	public static final class204 field1771;
	@ObfInfo(
		owner = "jn",
		name = "h",
		desc = "Ljn;"
	)
	public static final class204 field1772;
	@ObfInfo(
		owner = "jn",
		name = "x",
		desc = "Ljn;"
	)
	public static final class204 field1773;

	static {
		field1772 = new class204(4);
		field1761 = new class204(5);
		field1762 = new class204(6);
		field1773 = new class204(15);
		field1764 = new class204(4);
		field1768 = new class204(2);
		field1770 = new class204(7);
		field1766 = new class204(16);
		field1767 = new class204(8);
		field1760 = new class204(5);
		field1769 = new class204(14);
		field1763 = new class204(5);
		field1771 = new class204(7);
		field1765 = new class204(14);
	}

	@ObfInfo(
		owner = "jn",
		name = "<init>",
		desc = "(I)V"
	)
	class204(int var1) {
	}

	@ObfInfo(
		owner = "jn",
		name = "ah",
		desc = "(I)I"
	)
	protected static int method894() {
		int var1 = 0;
		if (class208.field1814 == null || !class208.field1814.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
					if (var3.isValid()) {
						class208.field1814 = var3;
						class214.field1873 = -1L;
						class214.field1871 = -1L;
					}
				}
			} catch (Throwable var12) {
			}
		}

		if (class208.field1814 != null) {
			long var10 = class152.method711();
			long var4 = class208.field1814.getCollectionTime();
			if (class214.field1871 != -1L) {
				long var6 = var4 - class214.field1871;
				long var8 = var10 - class214.field1873;
				if (0L != var8) {
					var1 = (int)(var6 * 100L / var8);
				}
			}

			class214.field1871 = var4;
			class214.field1873 = var10;
		}

		return var1;
	}

	@ObfInfo(
		owner = "jn",
		name = "jf",
		desc = "(Lbs;IIB)V"
	)
	static final void method893(class365 var0, int var1, int var2) {
		if (var0 != null) {
			class35.method147(var0.field3100, var0.field3096, var0.field3094, var0.field3095, var0.field3098, var0.field3097, var0.field3093, var1, var2);
		}

	}
}
