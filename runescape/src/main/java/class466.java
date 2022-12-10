public class class466 extends class467 {
	protected static boolean field4911;
	static final int[] field4910;
	class475 field4909;
	int field4908;

	static {
		field4910 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public class466(int var1) {
		super(var1);
	}

	public void method8270(int[] var1) {
		this.field4909 = new class475(var1);
	}

	public void method8269(class475 var1) {
		this.field4909 = var1;
	}

	public void method8274(int var1) {
		super.field4917[++super.field4915 - 1] = (byte)(var1 + this.field4909.method8632());
	}

	public int method8271() {
		return super.field4917[++super.field4915 - 1] - this.field4909.method8632() & 255;
	}

	public boolean method8272() {
		int var2 = super.field4917[super.field4915] - this.field4909.method8633() & 255;
		return var2 >= 128;
	}

	public int method8282() {
		int var2 = super.field4917[++super.field4915 - 1] - this.field4909.method8632() & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field4917[++super.field4915 - 1] - this.field4909.method8632() & 255);
	}

	public void method8268(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3; ++var5) {
			var1[var5 + var2] = (byte)(super.field4917[++super.field4915 - 1] - this.field4909.method8632());
		}

	}

	public void method8275() {
		this.field4908 = super.field4915 * 8;
	}

	public int method8281(int var1) {
		int var3 = this.field4908 >> 3;
		int var4 = 8 - (this.field4908 & 7);
		int var5 = 0;

		for (this.field4908 += var1; var1 > var4; var4 = 8) {
			var5 += (super.field4917[var3++] & field4910[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += super.field4917[var3] & field4910[var4];
		} else {
			var5 += super.field4917[var3] >> var4 - var1 & field4910[var1];
		}

		return var5;
	}

	public void method8277() {
		super.field4915 = (7 + this.field4908) / 8;
	}

	public int method8287(int var1) {
		return var1 * 8 - this.field4908;
	}
}
