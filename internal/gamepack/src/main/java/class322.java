import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "oz"
)
public class class322 {
	@ObfInfo(
		owner = "oz",
		name = "h",
		desc = "[F"
	)
	float[] field2563;
	@ObfInfo(
		owner = "oz",
		name = "e",
		desc = "I"
	)
	int field2564;

	@ObfInfo(
		owner = "oz",
		name = "<init>",
		desc = "([FI)V"
	)
	class322(float[] var1, int var2) {
		this.field2563 = var1;
		this.field2564 = var2;
	}

	@ObfInfo(
		owner = "oz",
		name = "x",
		desc = "(Ljava/lang/CharSequence;I)I"
	)
	public static int method1651(CharSequence var0) {
		return class361.method1799(var0, 10, true);
	}

	@ObfInfo(
		owner = "oz",
		name = "nl",
		desc = "(II)Lqf;"
	)
	static class213 method1650(int var0) {
		class213 var2 = (class213)client.field512.method394((long)var0);
		if (null == var2) {
			var2 = new class213(class187.field1697, var0);
		}

		return var2;
	}
}
