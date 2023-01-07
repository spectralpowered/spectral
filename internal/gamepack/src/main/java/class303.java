import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ia"
)
public class class303 implements class360 {
	@ObfInfo(
		owner = "ia",
		name = "ek",
		desc = "Lln;"
	)
	static class38 field2437;
	@ObfInfo(
		owner = "ia",
		name = "j",
		desc = "I"
	)
	int field2423;
	@ObfInfo(
		owner = "ia",
		name = "e",
		desc = "I"
	)
	int field2424;
	@ObfInfo(
		owner = "ia",
		name = "q",
		desc = "I"
	)
	int field2425;
	@ObfInfo(
		owner = "ia",
		name = "x",
		desc = "I"
	)
	int field2426;
	@ObfInfo(
		owner = "ia",
		name = "m",
		desc = "I"
	)
	int field2427;
	@ObfInfo(
		owner = "ia",
		name = "g",
		desc = "I"
	)
	int field2428;
	@ObfInfo(
		owner = "ia",
		name = "f",
		desc = "I"
	)
	int field2429;
	@ObfInfo(
		owner = "ia",
		name = "h",
		desc = "I"
	)
	int field2430;
	@ObfInfo(
		owner = "ia",
		name = "u",
		desc = "I"
	)
	int field2431;
	@ObfInfo(
		owner = "ia",
		name = "b",
		desc = "I"
	)
	int field2432;
	@ObfInfo(
		owner = "ia",
		name = "r",
		desc = "I"
	)
	int field2433;
	@ObfInfo(
		owner = "ia",
		name = "v",
		desc = "I"
	)
	int field2434;
	@ObfInfo(
		owner = "ia",
		name = "i",
		desc = "I"
	)
	int field2435;
	@ObfInfo(
		owner = "ia",
		name = "o",
		desc = "I"
	)
	int field2436;

	@ObfInfo(
		owner = "ia",
		name = "<init>",
		desc = "()V"
	)
	class303() {
	}

	@ObfInfo(
		owner = "ia",
		name = "h",
		desc = "(Lit;B)V"
	)
	public void method1797(class46 var1) {
		if (var1.field552 > this.field2427) {
			var1.field552 = this.field2427;
		}

		if (var1.field553 < this.field2427) {
			var1.field553 = this.field2427;
		}

		if (var1.field548 > this.field2425) {
			var1.field548 = this.field2425;
		}

		if (var1.field555 < this.field2425) {
			var1.field555 = this.field2425;
		}

	}

	@ObfInfo(
		owner = "ia",
		name = "e",
		desc = "(IIII)Z"
	)
	public boolean method1793(int var1, int var2, int var3) {
		if (var1 >= this.field2430 && var1 < this.field2424 + this.field2430) {
			return var2 >= (this.field2434 << 6) + (this.field2429 << 3) && var2 <= (this.field2434 << 6) + (this.field2431 << 3) + 7 && var3 >= (this.field2433 << 3) + (this.field2426 << 6) && var3 <= (this.field2426 << 6) + (this.field2432 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfInfo(
		owner = "ia",
		name = "v",
		desc = "(IIS)Z"
	)
	public boolean method1792(int var1, int var2) {
		return var1 >= (this.field2427 << 6) + (this.field2423 << 3) && var1 <= 7 + (this.field2435 << 3) + (this.field2427 << 6) && var2 >= (this.field2425 << 6) + (this.field2428 << 3) && var2 <= (this.field2436 << 3) + (this.field2425 << 6) + 7;
	}

	@ObfInfo(
		owner = "ia",
		name = "x",
		desc = "(IIIB)[I"
	)
	public int[] method1794(int var1, int var2, int var3) {
		if (!this.method1793(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2423 * 8 - this.field2429 * 8 + var2 + (this.field2427 * 64 - this.field2434 * 64), this.field2428 * 8 - this.field2433 * 8 + this.field2425 * 64 - this.field2426 * 64 + var3};
			return var5;
		}
	}

	@ObfInfo(
		owner = "ia",
		name = "m",
		desc = "(III)Lky;"
	)
	public class464 method1796(int var1, int var2) {
		if (!this.method1792(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2429 * 8 - this.field2423 * 8 + var1 + (this.field2434 * 64 - this.field2427 * 64);
			int var5 = this.field2433 * 8 - this.field2428 * 8 + var2 + (this.field2426 * 64 - this.field2425 * 64);
			return new class464(this.field2430, var4, var5);
		}
	}

	@ObfInfo(
		owner = "ia",
		name = "q",
		desc = "(Lqy;I)V"
	)
	public void method1795(class127 var1) {
		this.field2430 = var1.method547();
		this.field2424 = var1.method547();
		this.field2434 = var1.method549();
		this.field2429 = var1.method547();
		this.field2431 = var1.method547();
		this.field2426 = var1.method549();
		this.field2433 = var1.method547();
		this.field2432 = var1.method547();
		this.field2427 = var1.method549();
		this.field2423 = var1.method547();
		this.field2435 = var1.method547();
		this.field2425 = var1.method549();
		this.field2428 = var1.method547();
		this.field2436 = var1.method547();
		this.method1463();
	}

	@ObfInfo(
		owner = "ia",
		name = "f",
		desc = "(B)V"
	)
	void method1463() {
	}

	@ObfInfo(
		owner = "ia",
		name = "s",
		desc = "(I)V"
	)
	static void method1465() {
		if (class74.method326()) {
			class359.field3076 = true;
			class359.field3078 = 0;
			class359.field3079 = 0;
		}

	}
}
