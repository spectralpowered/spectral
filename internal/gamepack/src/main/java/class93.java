import io.spectralpowered.ObfInfo;
import java.util.Comparator;

@ObfInfo(
	name = "ry"
)
public class class93 implements Comparator {
	@ObfInfo(
		owner = "ry",
		name = "h",
		desc = "Z"
	)
	final boolean field780;

	@ObfInfo(
		owner = "ry",
		name = "<init>",
		desc = "(Z)V"
	)
	public class93(boolean var1) {
		this.field780 = var1;
	}

	@ObfInfo(
		owner = "ry",
		name = "h",
		desc = "(Lov;Lov;I)I"
	)
	int method385(class368 var1, class368 var2) {
		return this.field780 ? var1.method1817().method1104(var2.method1817()) : var2.method1817().method1104(var1.method1817());
	}

	@ObfInfo(
		owner = "ry",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method385((class368)var1, (class368)var2);
	}

	@ObfInfo(
		owner = "ry",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
