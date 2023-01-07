import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "rh"
)
public class class218 implements class78 {
	@ObfInfo(
		owner = "rh",
		name = "e",
		desc = "Lrh;"
	)
	public static final class218 field1887;
	@ObfInfo(
		owner = "rh",
		name = "h",
		desc = "Lrh;"
	)
	public static final class218 field1894;
	@ObfInfo(
		owner = "rh",
		name = "x",
		desc = "Lrh;"
	)
	static final class218 field1889;
	@ObfInfo(
		owner = "rh",
		name = "v",
		desc = "Lrh;"
	)
	static final class218 field1890;
	@ObfInfo(
		owner = "rh",
		name = "q",
		desc = "Lrh;"
	)
	static final class218 field1891;
	@ObfInfo(
		owner = "rh",
		name = "m",
		desc = "Lrh;"
	)
	static final class218 field1892;
	@ObfInfo(
		owner = "rh",
		name = "f",
		desc = "I"
	)
	final int field1888;
	@ObfInfo(
		owner = "rh",
		name = "r",
		desc = "I"
	)
	final int field1893;

	static {
		field1894 = new class218(1, 0);
		field1887 = new class218(0, 2);
		field1890 = new class218(3, 5);
		field1889 = new class218(4, 6);
		field1892 = new class218(2, 7);
		field1891 = new class218(5, 8);
	}

	@ObfInfo(
		owner = "rh",
		name = "<init>",
		desc = "(II)V"
	)
	class218(int var1, int var2) {
		this.field1888 = var1;
		this.field1893 = var2;
	}

	@ObfInfo(
		owner = "rh",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field1893;
	}

	@ObfInfo(
		owner = "rh",
		name = "h",
		desc = "(I)Z"
	)
	public boolean method963() {
		return field1887 == this;
	}
}
