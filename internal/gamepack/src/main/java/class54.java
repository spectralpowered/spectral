import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "rm"
)
public abstract class class54 {
	@ObfInfo(
		owner = "rm",
		name = "n",
		desc = "I"
	)
	static int field581;
	@ObfInfo(
		owner = "rm",
		name = "x",
		desc = "I"
	)
	public int field579;
	@ObfInfo(
		owner = "rm",
		name = "m",
		desc = "I"
	)
	public int field580;
	@ObfInfo(
		owner = "rm",
		name = "v",
		desc = "[I"
	)
	public int[] field578;

	@ObfInfo(
		owner = "rm",
		name = "<init>",
		desc = "()V"
	)
	protected class54() {
	}

	@ObfInfo(
		owner = "rm",
		name = "v",
		desc = "(IIIIB)V"
	)
	public abstract void method262(int var1, int var2, int var3, int var4);

	@ObfInfo(
		owner = "rm",
		name = "e",
		desc = "(IIB)V"
	)
	public abstract void method263(int var1, int var2);

	@ObfInfo(
		owner = "rm",
		name = "k",
		desc = "(I)V"
	)
	public final void method264() {
		class162.method748(this.field578, this.field579, this.field580);
	}
}
