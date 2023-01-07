import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "mw"
)
public final class class417 {
	@ObfInfo(
		owner = "mw",
		name = "h",
		desc = "[C"
	)
	public static final char[] field3429;
	@ObfInfo(
		owner = "mw",
		name = "e",
		desc = "[J"
	)
	static long[] field3430;

	static {
		field3429 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field3430 = new long[12];

		for (int var0 = 0; var0 < field3430.length; ++var0) {
			field3430[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}
}
