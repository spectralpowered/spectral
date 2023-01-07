import io.spectralpowered.ObfInfo;
import java.util.Comparator;

@ObfInfo(
	name = "lx"
)
final class class183 implements Comparator {
	@ObfInfo(
		owner = "lx",
		name = "e",
		desc = "I"
	)
	public static int field1682;

	@ObfInfo(
		owner = "lx",
		name = "h",
		desc = "(Lmg;Lmg;B)I"
	)
	int method833(class258 var1, class258 var2) {
		return var1.field2108.field2569 < var2.field2108.field2569 ? -1 : (var2.field2108.field2569 == var1.field2108.field2569 ? 0 : 1);
	}

	@ObfInfo(
		owner = "lx",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method833((class258)var1, (class258)var2);
	}

	@ObfInfo(
		owner = "lx",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(
		owner = "lx",
		name = "j",
		desc = "(Lkd;II)V"
	)
	static final void method834(class120 var0, int var1) {
		if (null == var0.field973) {
			throw new RuntimeException();
		} else {
			if (var0.field1040 == null) {
				var0.field1040 = new int[var0.field973.length];
			}

			var0.field1040[var1] = Integer.MAX_VALUE;
		}
	}
}
