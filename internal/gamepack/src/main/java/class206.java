import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "mk"
)
public class class206 {
	@ObfInfo(
		owner = "mk",
		name = "e",
		desc = "Lmk;"
	)
	static final class206 field1780;
	@ObfInfo(
		owner = "mk",
		name = "h",
		desc = "Lmk;"
	)
	static final class206 field1781;
	@ObfInfo(
		owner = "mk",
		name = "v",
		desc = "Lmk;"
	)
	static final class206 field1782;

	static {
		field1781 = new class206();
		field1780 = new class206();
		field1782 = new class206();
	}

	@ObfInfo(
		owner = "mk",
		name = "<init>",
		desc = "()V"
	)
	class206() {
	}

	@ObfInfo(
		owner = "mk",
		name = "c",
		desc = "(ZI)V"
	)
	public static void method900(boolean var0) {
		if (class203.field1759 != var0) {
			class263.field2188.method395();
			class263.field2143.method395();
			class263.field2144.method395();
			class203.field1759 = var0;
		}

	}

	@ObfInfo(
		owner = "mk",
		name = "ms",
		desc = "(S)V"
	)
	static final void method899() {
		for (int var1 = 0; var1 < class268.field2221; ++var1) {
			class380 var2 = client.field347[class268.field2220[var1]];
			var2.method1870();
		}

		class433.method2146();
		if (null != class228.field1933) {
			class228.field1933.method80();
		}

	}
}
