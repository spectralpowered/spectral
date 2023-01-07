import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "gl"
)
public class class1 implements class78 {
	@ObfInfo(
		owner = "gl",
		name = "fc",
		desc = "Lln;"
	)
	static class38 field7;
	@ObfInfo(
		owner = "gl",
		name = "hm",
		desc = "J"
	)
	static long field6;
	@ObfInfo(
		owner = "gl",
		name = "e",
		desc = "Lgl;"
	)
	static final class1 field1;
	@ObfInfo(
		owner = "gl",
		name = "v",
		desc = "Lgl;"
	)
	static final class1 field3;
	@ObfInfo(
		owner = "gl",
		name = "h",
		desc = "Lgl;"
	)
	static final class1 field4;
	@ObfInfo(
		owner = "gl",
		name = "m",
		desc = "I"
	)
	final int field5;
	@ObfInfo(
		owner = "gl",
		name = "x",
		desc = "I"
	)
	public final int field2;

	static {
		field4 = new class1(0, 0);
		field1 = new class1(2, 1);
		field3 = new class1(1, 2);
	}

	@ObfInfo(
		owner = "gl",
		name = "<init>",
		desc = "(II)V"
	)
	class1(int var1, int var2) {
		this.field2 = var1;
		this.field5 = var2;
	}

	@ObfInfo(
		owner = "gl",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field5;
	}

	@ObfInfo(
		owner = "gl",
		name = "e",
		desc = "(Lrx;IIII)V"
	)
	static void method1(class266 var0, int var1, int var2, int var3) {
		class111 var5 = class144.field1152;
		long var7 = (long)(var3 << 16 | var1 << 8 | var2);
		var5.method444(var0, var7, var0.field2205.length * 4);
	}
}
