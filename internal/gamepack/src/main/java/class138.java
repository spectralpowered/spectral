import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "cm"
)
public final class class138 extends class139 {
	@ObfInfo(
		owner = "cm",
		name = "ns",
		desc = "Lbs;"
	)
	static class365 field1119;
	@ObfInfo(
		owner = "cm",
		name = "v",
		desc = "I"
	)
	int field1118;
	@ObfInfo(
		owner = "cm",
		name = "i",
		desc = "I"
	)
	int field1120;
	@ObfInfo(
		owner = "cm",
		name = "m",
		desc = "I"
	)
	int field1121;
	@ObfInfo(
		owner = "cm",
		name = "h",
		desc = "I"
	)
	int field1122;
	@ObfInfo(
		owner = "cm",
		name = "g",
		desc = "I"
	)
	int field1123;
	@ObfInfo(
		owner = "cm",
		name = "f",
		desc = "I"
	)
	int field1124;
	@ObfInfo(
		owner = "cm",
		name = "r",
		desc = "I"
	)
	int field1125;
	@ObfInfo(
		owner = "cm",
		name = "u",
		desc = "I"
	)
	int field1126;
	@ObfInfo(
		owner = "cm",
		name = "b",
		desc = "I"
	)
	int field1127;
	@ObfInfo(
		owner = "cm",
		name = "e",
		desc = "I"
	)
	int field1128;
	@ObfInfo(
		owner = "cm",
		name = "x",
		desc = "I"
	)
	int field1129;
	@ObfInfo(
		owner = "cm",
		name = "o",
		desc = "I"
	)
	int field1130;
	@ObfInfo(
		owner = "cm",
		name = "q",
		desc = "I"
	)
	int field1131;

	@ObfInfo(
		owner = "cm",
		name = "<init>",
		desc = "()V"
	)
	class138() {
		this.field1123 = 31;
		this.field1120 = 0;
		this.field1130 = -1;
	}

	@ObfInfo(
		owner = "cm",
		name = "h",
		desc = "(IB)V"
	)
	void method634(int var1) {
		this.field1123 = var1;
	}

	@ObfInfo(
		owner = "cm",
		name = "e",
		desc = "(II)Z"
	)
	boolean method635(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return 0 != (this.field1123 & 1 << var1);
		} else {
			return true;
		}
	}
}
