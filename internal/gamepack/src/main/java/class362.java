import io.spectralpowered.ObfInfo;
import java.util.Comparator;
import java.util.Map.Entry;

@ObfInfo(
	name = "l"
)
class class362 implements Comparator {
	@ObfInfo(
		owner = "l",
		name = "h",
		desc = "Lly;"
	)
	public static class274 field3086;
	// $FF: synthetic field
	@ObfInfo(
		owner = "l",
		name = "this$0",
		desc = "Lj;"
	)
	final class192 this$0;

	@ObfInfo(
		owner = "l",
		name = "<init>",
		desc = "(Lj;)V"
	)
	class362(class192 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(
		owner = "l",
		name = "h",
		desc = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I"
	)
	int method1801(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	@ObfInfo(
		owner = "l",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method1801((Entry)var1, (Entry)var2);
	}

	@ObfInfo(
		owner = "l",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(
		owner = "l",
		name = "h",
		desc = "(IIIB)I"
	)
	public static int method1803(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfInfo(
		owner = "l",
		name = "h",
		desc = "(IB)I"
	)
	public static int method1806(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfInfo(
		owner = "l",
		name = "h",
		desc = "(III)I"
	)
	static int method1804(int var0, int var1) {
		class201 var3 = (class201)class201.field1755.method791((long)var0);
		if (null == var3) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var3.field1753.length ? var3.field1753[var1] : -1;
		}
	}

	@ObfInfo(
		owner = "l",
		name = "u",
		desc = "(Lkd;I[B[BB)V"
	)
	static final void method1805(class120 var0, int var1, byte[] var2, byte[] var3) {
		if (null == var0.field973) {
			if (null == var2) {
				return;
			}

			var0.field973 = new byte[11][];
			var0.field974 = new byte[11][];
			var0.field981 = new int[11];
			var0.field976 = new int[11];
		}

		var0.field973[var1] = var2;
		if (var2 != null) {
			var0.field972 = true;
		} else {
			var0.field972 = false;

			for (int var5 = 0; var5 < var0.field973.length; ++var5) {
				if (var0.field973[var5] != null) {
					var0.field972 = true;
					break;
				}
			}
		}

		var0.field974[var1] = var3;
	}

	@ObfInfo(
		owner = "l",
		name = "gh",
		desc = "(Lln;Ljava/lang/String;I)V"
	)
	static void method1802(class38 var0, String var1) {
		class193 var3 = new class193(var0, var1);
		client.field515.add(var3);
		client.field517 += var3.field1723;
	}

	@ObfInfo(
		owner = "l",
		name = "lg",
		desc = "(Lkd;III)V"
	)
	static final void method1800(class120 var0, int var1, int var2) {
		if (client.field406 == null && !client.field368) {
			if (var0 != null && class328.method1669(var0) != null) {
				client.field406 = var0;
				client.field407 = class328.method1669(var0);
				client.field408 = var1;
				client.field409 = var2;
				class161.field1220 = 0;
				client.field417 = false;
				int var4 = client.field369 - 1;
				if (var4 != -1) {
					class408.method1998(var4);
				}

			}
		}
	}

	@ObfInfo(
		owner = "l",
		name = "ly",
		desc = "(II)V"
	)
	static final void method1807(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class50.field574.method2212(var0);
	}
}
