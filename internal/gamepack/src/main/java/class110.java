import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ob"
)
public class class110 implements class311 {
	@ObfInfo(
		owner = "ob",
		name = "m",
		desc = "[I"
	)
	public static int[] field826;
	@ObfInfo(
		owner = "ob",
		name = "jb",
		desc = "I"
	)
	static int field825;
	@ObfInfo(
		owner = "ob",
		name = "h",
		desc = "Lqn;"
	)
	public final class264 field827;

	@ObfInfo(
		owner = "ob",
		name = "<init>",
		desc = "(Lor;)V"
	)
	public class110(class4 var1) {
		this(new class333(var1));
	}

	@ObfInfo(
		owner = "ob",
		name = "<init>",
		desc = "(Lqc;)V"
	)
	class110(class333 var1) {
		this.field827 = var1;
	}

	@ObfInfo(
		owner = "ob",
		name = "h",
		desc = "(IB)I"
	)
	public int method439(int var1) {
		return this.field827.method1216(var1);
	}
}
