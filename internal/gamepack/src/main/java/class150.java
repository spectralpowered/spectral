import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "lk"
)
public class class150 {
	@ObfInfo(
		owner = "lk",
		name = "v",
		desc = "[I"
	)
	public static int[] field1171;
	@ObfInfo(
		owner = "lk",
		name = "e",
		desc = "[Z"
	)
	public static final boolean[] field1170;

	static {
		field1170 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		field1171 = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			field1171[var1] = var0 / 4;
		}

	}

	@ObfInfo(
		owner = "lk",
		name = "h",
		desc = "(I)[Lf;"
	)
	public static class403[] method700() {
		return new class403[]{class403.field3390};
	}
}
