import io.spectralpowered.ObfInfo;
import java.util.Comparator;

@ObfInfo(
	name = "la"
)
final class class350 implements Comparator {
	@ObfInfo(
		owner = "la",
		name = "h",
		desc = "(Lmg;Lmg;I)I"
	)
	int method1766(class258 var1, class258 var2) {
		return var1.method1107().compareTo(var2.method1107());
	}

	@ObfInfo(
		owner = "la",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method1766((class258)var1, (class258)var2);
	}

	@ObfInfo(
		owner = "la",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
