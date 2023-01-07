import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "qd"
)
final class class31 implements class250 {
	@ObfInfo(
		owner = "qd",
		name = "b",
		desc = "(Ljava/lang/Integer;Lqy;I)V"
	)
	void method135(Integer var1, class127 var2) {
		var2.method534(var1);
	}

	@ObfInfo(
		owner = "qd",
		name = "e",
		desc = "(Lqy;I)Ljava/lang/Object;"
	)
	public Object method1082(class127 var1) {
		return var1.method595();
	}

	@ObfInfo(
		owner = "qd",
		name = "h",
		desc = "(Ljava/lang/Object;Lqy;I)V"
	)
	public void method1081(Object var1, class127 var2) {
		this.method135((Integer)var1, var2);
	}
}
