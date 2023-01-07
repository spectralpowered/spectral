import io.spectralpowered.ObfInfo;
import java.util.Comparator;

@ObfInfo(
	name = "rl"
)
public class class24 implements Comparator {
	@ObfInfo(
		owner = "rl",
		name = "h",
		desc = "Z"
	)
	final boolean field111;

	@ObfInfo(
		owner = "rl",
		name = "<init>",
		desc = "(Z)V"
	)
	public class24(boolean var1) {
		this.field111 = var1;
	}

	@ObfInfo(
		owner = "rl",
		name = "h",
		desc = "(Lov;Lov;I)I"
	)
	int method99(class368 var1, class368 var2) {
		return this.field111 ? var1.method1816(var2) : var2.method1816(var1);
	}

	@ObfInfo(
		owner = "rl",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method99((class368)var1, (class368)var2);
	}

	@ObfInfo(
		owner = "rl",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
