import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "id"
)
public class class388 implements class360 {
	@ObfInfo(
		owner = "id",
		name = "ik",
		desc = "[[B"
	)
	static byte[][] field3273;
	@ObfInfo(
		owner = "id",
		name = "x",
		desc = "I"
	)
	int field3263;
	@ObfInfo(
		owner = "id",
		name = "e",
		desc = "I"
	)
	int field3264;
	@ObfInfo(
		owner = "id",
		name = "v",
		desc = "I"
	)
	int field3265;
	@ObfInfo(
		owner = "id",
		name = "r",
		desc = "I"
	)
	int field3266;
	@ObfInfo(
		owner = "id",
		name = "q",
		desc = "I"
	)
	int field3267;
	@ObfInfo(
		owner = "id",
		name = "u",
		desc = "I"
	)
	int field3268;
	@ObfInfo(
		owner = "id",
		name = "h",
		desc = "I"
	)
	int field3269;
	@ObfInfo(
		owner = "id",
		name = "f",
		desc = "I"
	)
	int field3270;
	@ObfInfo(
		owner = "id",
		name = "m",
		desc = "I"
	)
	int field3271;
	@ObfInfo(
		owner = "id",
		name = "b",
		desc = "I"
	)
	int field3272;

	@ObfInfo(
		owner = "id",
		name = "<init>",
		desc = "()V"
	)
	class388() {
	}

	@ObfInfo(
		owner = "id",
		name = "h",
		desc = "(Lit;B)V"
	)
	public void method1797(class46 var1) {
		if (var1.field552 > this.field3271) {
			var1.field552 = this.field3271;
		}

		if (var1.field553 < this.field3271) {
			var1.field553 = this.field3271;
		}

		if (var1.field548 > this.field3267) {
			var1.field548 = this.field3267;
		}

		if (var1.field555 < this.field3267) {
			var1.field555 = this.field3267;
		}

	}

	@ObfInfo(
		owner = "id",
		name = "e",
		desc = "(IIII)Z"
	)
	public boolean method1793(int var1, int var2, int var3) {
		if (var1 >= this.field3269 && var1 < this.field3269 + this.field3264) {
			return var2 >= (this.field3265 << 6) + (this.field3270 << 3) && var2 <= (this.field3265 << 6) + (this.field3270 << 3) + 7 && var3 >= (this.field3263 << 6) + (this.field3266 << 3) && var3 <= 7 + (this.field3266 << 3) + (this.field3263 << 6);
		} else {
			return false;
		}
	}

	@ObfInfo(
		owner = "id",
		name = "v",
		desc = "(IIS)Z"
	)
	public boolean method1792(int var1, int var2) {
		return var1 >= (this.field3271 << 6) + (this.field3268 << 3) && var1 <= 7 + (this.field3271 << 6) + (this.field3268 << 3) && var2 >= (this.field3272 << 3) + (this.field3267 << 6) && var2 <= (this.field3272 << 3) + (this.field3267 << 6) + 7;
	}

	@ObfInfo(
		owner = "id",
		name = "x",
		desc = "(IIIB)[I"
	)
	public int[] method1794(int var1, int var2, int var3) {
		if (!this.method1793(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field3268 * 8 - this.field3270 * 8 + this.field3271 * 64 - this.field3265 * 64 + var2, var3 + (this.field3267 * 64 - this.field3263 * 64) + (this.field3272 * 8 - this.field3266 * 8)};
			return var5;
		}
	}

	@ObfInfo(
		owner = "id",
		name = "m",
		desc = "(III)Lky;"
	)
	public class464 method1796(int var1, int var2) {
		if (!this.method1792(var1, var2)) {
			return null;
		} else {
			int var4 = this.field3265 * 64 - this.field3271 * 64 + var1 + (this.field3270 * 8 - this.field3268 * 8);
			int var5 = this.field3266 * 8 - this.field3272 * 8 + var2 + (this.field3263 * 64 - this.field3267 * 64);
			return new class464(this.field3269, var4, var5);
		}
	}

	@ObfInfo(
		owner = "id",
		name = "q",
		desc = "(Lqy;I)V"
	)
	public void method1795(class127 var1) {
		this.field3269 = var1.method547();
		this.field3264 = var1.method547();
		this.field3265 = var1.method549();
		this.field3270 = var1.method547();
		this.field3263 = var1.method549();
		this.field3266 = var1.method547();
		this.field3271 = var1.method549();
		this.field3268 = var1.method547();
		this.field3267 = var1.method549();
		this.field3272 = var1.method547();
		this.method1903();
	}

	@ObfInfo(
		owner = "id",
		name = "f",
		desc = "(I)V"
	)
	void method1903() {
	}

	@ObfInfo(
		owner = "id",
		name = "x",
		desc = "(B)V"
	)
	public static void method1904() {
		if (null != class462.field3844) {
			class462.field3844.method734();
		}

	}
}
