import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "px"
)
public class class83 {
	@ObfInfo(
		owner = "px",
		name = "m",
		desc = "[I"
	)
	static final int[] field672;
	@ObfInfo(
		owner = "px",
		name = "q",
		desc = "[I"
	)
	static final int[] field673;

	static {
		field672 = new int[16384];
		field673 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field672[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field673[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
