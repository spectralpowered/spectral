import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "fs"
)
public class class459 {
	// $FF: synthetic field
	@ObfInfo(
		owner = "fs",
		name = "this$0",
		desc = "Lfk;"
	)
	final class277 this$0;
	@ObfInfo(
		owner = "fs",
		name = "h",
		desc = "Ldm;"
	)
	public class140 field3805;
	@ObfInfo(
		owner = "fs",
		name = "e",
		desc = "[F"
	)
	public float[] field3806;

	@ObfInfo(
		owner = "fs",
		name = "<init>",
		desc = "(Lfk;)V"
	)
	class459(class277 var1) {
		this.this$0 = var1;
		this.field3806 = new float[4];
	}

	@ObfInfo(
		owner = "fs",
		name = "e",
		desc = "(CLmb;I)C"
	)
	static char method2265(char var0, class476 var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != class476.field4002) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != class476.field4002) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}

	@ObfInfo(
		owner = "fs",
		name = "j",
		desc = "(S)I"
	)
	protected static final int method2264() {
		return class214.field1861.method2140();
	}

	@ObfInfo(
		owner = "fs",
		name = "aq",
		desc = "(ILbm;ZI)I"
	)
	static int method2263(int var0, class461 var1, boolean var2) {
		return 2;
	}
}
