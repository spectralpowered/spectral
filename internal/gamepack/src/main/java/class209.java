import io.spectralpowered.ObfInfo;
import java.util.Comparator;

@ObfInfo(
	name = "mt"
)
final class class209 implements Comparator {
	@ObfInfo(
		owner = "mt",
		name = "h",
		desc = "Lly;"
	)
	static class274 field1815;

	@ObfInfo(
		owner = "mt",
		name = "h",
		desc = "(Lmg;Lmg;I)I"
	)
	int method907(class258 var1, class258 var2) {
		return var1.field2106 < var2.field2106 ? -1 : (var1.field2106 == var2.field2106 ? 0 : 1);
	}

	@ObfInfo(
		owner = "mt",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method907((class258)var1, (class258)var2);
	}

	@ObfInfo(
		owner = "mt",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
