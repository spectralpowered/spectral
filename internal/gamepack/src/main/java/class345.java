import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "dy"
)
public class class345 extends class392 {
	@ObfInfo(
		owner = "dy",
		name = "h",
		desc = "Z"
	)
	final boolean field2760;

	@ObfInfo(
		owner = "dy",
		name = "<init>",
		desc = "(Z)V"
	)
	public class345(boolean var1) {
		this.field2760 = var1;
	}

	@ObfInfo(
		owner = "dy",
		name = "h",
		desc = "(Loa;Loa;I)I"
	)
	int method1751(class69 var1, class69 var2) {
		if (client.field395 == var1.field627 && var2.field627 == client.field395) {
			return this.field2760 ? var1.method1817().method1104(var2.method1817()) : var2.method1817().method1104(var1.method1817());
		} else {
			return this.method1918(var1, var2);
		}
	}

	@ObfInfo(
		owner = "dy",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method1751((class69)var1, (class69)var2);
	}

	@ObfInfo(
		owner = "dy",
		name = "u",
		desc = "(I)Lbz;"
	)
	static class2 method1752() {
		return class2.field9 < class2.field11 ? class2.field12[++class2.field9 - 1] : null;
	}
}
