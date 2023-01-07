import io.spectralpowered.ObfInfo;
import java.io.IOException;

@ObfInfo(
	name = "ou"
)
public abstract class class160 {
	@ObfInfo(
		owner = "ou",
		name = "<init>",
		desc = "()V"
	)
	class160() {
	}

	@ObfInfo(
		owner = "ou",
		name = "h",
		desc = "(II)Z"
	)
	public abstract boolean method735(int var1) throws IOException;

	@ObfInfo(
		owner = "ou",
		name = "x",
		desc = "([BIII)I"
	)
	public abstract int method730(byte[] var1, int var2, int var3) throws IOException;

	@ObfInfo(
		owner = "ou",
		name = "e",
		desc = "(B)I"
	)
	public abstract int method732() throws IOException;

	@ObfInfo(
		owner = "ou",
		name = "v",
		desc = "(I)I"
	)
	public abstract int method733() throws IOException;

	@ObfInfo(
		owner = "ou",
		name = "m",
		desc = "([BIIB)V"
	)
	public abstract void method731(byte[] var1, int var2, int var3) throws IOException;

	@ObfInfo(
		owner = "ou",
		name = "q",
		desc = "(I)V"
	)
	public abstract void method734();

	@ObfInfo(
		owner = "ou",
		name = "h",
		desc = "(II)Lfj;"
	)
	public static class164 method736(int var0) {
		class164 var2 = (class164)class164.field1240.method394((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class164.field1239.method1365(3, var0);
			var2 = new class164();
			if (var3 != null) {
				var2.method768(new class127(var3));
			}

			class164.field1240.method396(var2, (long)var0);
			return var2;
		}
	}
}
