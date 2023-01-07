import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "rv"
)
public class class7 implements class78 {
	@ObfInfo(
		owner = "rv",
		name = "p",
		desc = "Ljava/lang/String;"
	)
	public static String field36;
	@ObfInfo(
		owner = "rv",
		name = "h",
		desc = "Lrv;"
	)
	public static final class7 field32;
	@ObfInfo(
		owner = "rv",
		name = "v",
		desc = "Lrv;"
	)
	static final class7 field33;
	@ObfInfo(
		owner = "rv",
		name = "e",
		desc = "Lrv;"
	)
	static final class7 field34;
	@ObfInfo(
		owner = "rv",
		name = "m",
		desc = "I"
	)
	final int field35;
	@ObfInfo(
		owner = "rv",
		name = "x",
		desc = "I"
	)
	public final int field31;

	static {
		field32 = new class7(0, 0);
		field34 = new class7(1, 1);
		field33 = new class7(2, 2);
	}

	@ObfInfo(
		owner = "rv",
		name = "<init>",
		desc = "(II)V"
	)
	class7(int var1, int var2) {
		this.field31 = var1;
		this.field35 = var2;
	}

	@ObfInfo(
		owner = "rv",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field35;
	}
}
