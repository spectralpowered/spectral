import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "js"
)
public class class28 {
	@ObfInfo(
		owner = "js",
		name = "h",
		desc = "[I"
	)
	static int[] field162;

	static {
		new Object();
		field162 = new int[33];
		field162[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field162[var1] = var0 - 1;
			var0 += var0;
		}

	}
}
