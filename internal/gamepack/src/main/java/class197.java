import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "bx"
)
public class class197 extends class39 {
	@ObfInfo(
		owner = "bx",
		name = "so",
		desc = "Laz;"
	)
	static class244 field1739;
	@ObfInfo(
		owner = "bx",
		name = "jy",
		desc = "I"
	)
	static int field1740;

	@ObfInfo(
		owner = "bx",
		name = "<init>",
		desc = "()V"
	)
	class197() {
	}

	@ObfInfo(
		owner = "bx",
		name = "h",
		desc = "(IIILgw;I)Z"
	)
	protected boolean method165(int var1, int var2, int var3, class427 var4) {
		return super.field195 == var2 && super.field198 == var3;
	}

	@ObfInfo(
		owner = "bx",
		name = "h",
		desc = "(II)Lfe;"
	)
	public static class198 method875(int var0) {
		class198 var2 = (class198)class198.field1741.method394((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class198.field1743.method1365(19, var0);
			var2 = new class198();
			if (var3 != null) {
				var2.method877(new class127(var3));
			}

			class198.field1741.method396(var2, (long)var0);
			return var2;
		}
	}
}
