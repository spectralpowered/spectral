import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "lc"
)
public class class55 implements class78 {
	@ObfInfo(
		owner = "lc",
		name = "x",
		desc = "Llc;"
	)
	public static final class55 field584;
	@ObfInfo(
		owner = "lc",
		name = "h",
		desc = "Llc;"
	)
	static final class55 field582;
	@ObfInfo(
		owner = "lc",
		name = "e",
		desc = "Llc;"
	)
	static final class55 field583;
	@ObfInfo(
		owner = "lc",
		name = "v",
		desc = "Llc;"
	)
	static final class55 field585;
	@ObfInfo(
		owner = "lc",
		name = "m",
		desc = "Llc;"
	)
	static final class55 field586;
	@ObfInfo(
		owner = "lc",
		name = "q",
		desc = "I"
	)
	final int field587;

	static {
		field582 = new class55(0);
		field583 = new class55(1);
		field585 = new class55(2);
		field584 = new class55(3);
		field586 = new class55(4);
	}

	@ObfInfo(
		owner = "lc",
		name = "<init>",
		desc = "(I)V"
	)
	class55(int var1) {
		this.field587 = var1;
	}

	@ObfInfo(
		owner = "lc",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field587;
	}

	@ObfInfo(
		owner = "lc",
		name = "u",
		desc = "(II)I"
	)
	static int method266(int var0) {
		class152 var2 = (class152)class100.field795.method1897((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return class100.field793.field4010 == var2.field1737 ? -1 : ((class152)var2.field1737).field1184;
		}
	}
}
