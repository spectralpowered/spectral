import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "qx"
)
public class class6 extends class127 {
	@ObfInfo(
		owner = "qx",
		name = "aw",
		desc = "Z"
	)
	protected static boolean field30;
	@ObfInfo(
		owner = "qx",
		name = "e",
		desc = "[I"
	)
	static final int[] field29;
	@ObfInfo(
		owner = "qx",
		name = "h",
		desc = "Lrg;"
	)
	class205 field28;
	@ObfInfo(
		owner = "qx",
		name = "v",
		desc = "I"
	)
	int field27;

	static {
		field29 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	@ObfInfo(
		owner = "qx",
		name = "<init>",
		desc = "(I)V"
	)
	public class6(int var1) {
		super(var1);
	}

	@ObfInfo(
		owner = "qx",
		name = "h",
		desc = "([II)V"
	)
	public void method29(int[] var1) {
		this.field28 = new class205(var1);
	}

	@ObfInfo(
		owner = "qx",
		name = "e",
		desc = "(Lrg;I)V"
	)
	public void method28(class205 var1) {
		this.field28 = var1;
	}

	@ObfInfo(
		owner = "qx",
		name = "v",
		desc = "(II)V"
	)
	public void method32(int var1) {
		super.field1072[++super.field1070 - 1] = (byte)(var1 + this.field28.method896());
	}

	@ObfInfo(
		owner = "qx",
		name = "x",
		desc = "(B)I"
	)
	public int method30() {
		return super.field1072[++super.field1070 - 1] - this.field28.method896() & 255;
	}

	@ObfInfo(
		owner = "qx",
		name = "m",
		desc = "(I)Z"
	)
	public boolean method31() {
		int var2 = super.field1072[super.field1070] - this.field28.method897() & 255;
		return var2 >= 128;
	}

	@ObfInfo(
		owner = "qx",
		name = "q",
		desc = "(B)I"
	)
	public int method36() {
		int var2 = super.field1072[++super.field1070 - 1] - this.field28.method896() & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field1072[++super.field1070 - 1] - this.field28.method896() & 255);
	}

	@ObfInfo(
		owner = "qx",
		name = "f",
		desc = "([BIIB)V"
	)
	public void method27(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3; ++var5) {
			var1[var5 + var2] = (byte)(super.field1072[++super.field1070 - 1] - this.field28.method896());
		}

	}

	@ObfInfo(
		owner = "qx",
		name = "r",
		desc = "(I)V"
	)
	public void method33() {
		this.field27 = super.field1070 * 8;
	}

	@ObfInfo(
		owner = "qx",
		name = "u",
		desc = "(II)I"
	)
	public int method35(int var1) {
		int var3 = this.field27 >> 3;
		int var4 = 8 - (this.field27 & 7);
		int var5 = 0;

		for (this.field27 += var1; var1 > var4; var4 = 8) {
			var5 += (super.field1072[var3++] & field29[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += super.field1072[var3] & field29[var4];
		} else {
			var5 += super.field1072[var3] >> var4 - var1 & field29[var1];
		}

		return var5;
	}

	@ObfInfo(
		owner = "qx",
		name = "b",
		desc = "(I)V"
	)
	public void method34() {
		super.field1070 = (7 + this.field27) / 8;
	}

	@ObfInfo(
		owner = "qx",
		name = "j",
		desc = "(II)I"
	)
	public int method37(int var1) {
		return var1 * 8 - this.field27;
	}
}
