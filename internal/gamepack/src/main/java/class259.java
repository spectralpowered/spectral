import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "hu"
)
public class class259 {
	@ObfInfo(
		owner = "hu",
		name = "e",
		desc = "(II)I"
	)
	public static int method1108(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = (var0 >>> 4) + var0 & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
