import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "io"
)
public class class450 extends class389 {
	@ObfInfo(
		owner = "io",
		name = "e",
		desc = "Lii;"
	)
	final class23 field3741;
	@ObfInfo(
		owner = "io",
		name = "v",
		desc = "I"
	)
	final int field3742;
	@ObfInfo(
		owner = "io",
		name = "x",
		desc = "I"
	)
	final int field3743;
	@ObfInfo(
		owner = "io",
		name = "h",
		desc = "I"
	)
	final int field3744;

	@ObfInfo(
		owner = "io",
		name = "<init>",
		desc = "(Lky;Lky;ILii;)V"
	)
	class450(class464 var1, class464 var2, int var3, class23 var4) {
		super(var1, var2);
		this.field3744 = var3;
		this.field3741 = var4;
		class396 var5 = class25.method100(this.method1910());
		class266 var6 = var5.method1946(false);
		if (null != var6) {
			this.field3742 = var6.field2200;
			this.field3743 = var6.field2199;
		} else {
			this.field3742 = 0;
			this.field3743 = 0;
		}

	}

	@ObfInfo(
		owner = "io",
		name = "e",
		desc = "(I)I"
	)
	public int method1910() {
		return this.field3744;
	}

	@ObfInfo(
		owner = "io",
		name = "v",
		desc = "(I)Lii;"
	)
	class23 method1911() {
		return this.field3741;
	}

	@ObfInfo(
		owner = "io",
		name = "x",
		desc = "(I)I"
	)
	int method1906() {
		return this.field3742;
	}

	@ObfInfo(
		owner = "io",
		name = "m",
		desc = "(I)I"
	)
	int method1912() {
		return this.field3743;
	}

	@ObfInfo(
		owner = "io",
		name = "h",
		desc = "(I)[Lls;"
	)
	static class159[] method2239() {
		return new class159[]{class159.field1219, class159.field1216};
	}

	@ObfInfo(
		owner = "io",
		name = "a",
		desc = "(III)I"
	)
	static final int method2238(int var0, int var1) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = (15731 * var3 * var3 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 255;
	}
}
