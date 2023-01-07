import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "py"
)
public class class307 {
	@ObfInfo(
		owner = "py",
		name = "b",
		desc = "[I"
	)
	static final int[] field2459;
	@ObfInfo(
		owner = "py",
		name = "j",
		desc = "[I"
	)
	static final int[] field2460;

	static {
		field2459 = new int[2048];
		field2460 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field2459[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field2460[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
