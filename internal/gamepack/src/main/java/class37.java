import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "mc"
)
@class451
public final class class37 {
	@ObfInfo(
		owner = "mc",
		name = "o",
		desc = "Lkd;"
	)
	static class120 field183;

	@ObfInfo(
		owner = "mc",
		name = "r",
		desc = "(I)Lrx;"
	)
	static class266 method149() {
		class266 var1 = new class266();
		var1.field2203 = class183.field1682;
		var1.field2204 = class18.field90;
		var1.field2201 = class18.field92[0];
		var1.field2202 = class110.field826[0];
		var1.field2200 = class418.field3431[0];
		var1.field2199 = class50.field576[0];
		int var2 = var1.field2199 * var1.field2200;
		byte[] var3 = class340.field2723[0];
		var1.field2205 = new int[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var1.field2205[var4] = class413.field3422[var3[var4] & 255];
		}

		class18.field92 = null;
		class110.field826 = null;
		class418.field3431 = null;
		class50.field576 = null;
		class413.field3422 = null;
		class340.field2723 = (byte[][])null;
		return var1;
	}
}
