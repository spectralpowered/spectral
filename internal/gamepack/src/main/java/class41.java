import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "jh"
)
public class class41 implements class224 {
	@ObfInfo(
		owner = "jh",
		name = "k",
		desc = "I"
	)
	public static int field217;
	@ObfInfo(
		owner = "jh",
		name = "h",
		desc = "Ljh;"
	)
	public static final class41 field208;
	@ObfInfo(
		owner = "jh",
		name = "v",
		desc = "Ljh;"
	)
	public static final class41 field209;
	@ObfInfo(
		owner = "jh",
		name = "x",
		desc = "Ljh;"
	)
	public static final class41 field211;
	@ObfInfo(
		owner = "jh",
		name = "m",
		desc = "Ljh;"
	)
	public static final class41 field212;
	@ObfInfo(
		owner = "jh",
		name = "bw",
		desc = "Llw;"
	)
	static class493 field210;
	@ObfInfo(
		owner = "jh",
		name = "e",
		desc = "Ljh;"
	)
	static final class41 field213;
	@ObfInfo(
		owner = "jh",
		name = "q",
		desc = "Ljh;"
	)
	static final class41 field216;
	@ObfInfo(
		owner = "jh",
		name = "r",
		desc = "[Ljh;"
	)
	static final class41[] field215;
	@ObfInfo(
		owner = "jh",
		name = "f",
		desc = "I"
	)
	public final int field214;

	static {
		field208 = new class41(14, 0);
		field213 = new class41(15, 4);
		field209 = new class41(16, -2);
		field211 = new class41(18, -2);
		field212 = new class41(19, -2);
		field216 = new class41(27, 0);
		field215 = new class41[32];
		class41[] var0 = class290.method1430();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field215[var0[var1].field214] = var0[var1];
		}

	}

	@ObfInfo(
		owner = "jh",
		name = "<init>",
		desc = "(II)V"
	)
	class41(int var1, int var2) {
		this.field214 = var1;
	}
}
