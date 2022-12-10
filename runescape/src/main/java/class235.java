public class class235 implements class257 {
	static class326 field2839;
	int field2825;
	int field2826;
	int field2827;
	int field2828;
	int field2829;
	int field2830;
	int field2831;
	int field2832;
	int field2833;
	int field2834;
	int field2835;
	int field2836;
	int field2837;
	int field2838;

	class235() {
	}

	public void method5078(class254 var1) {
		if (var1.field2971 > this.field2829) {
			var1.field2971 = this.field2829;
		}

		if (var1.field2972 < this.field2829) {
			var1.field2972 = this.field2829;
		}

		if (var1.field2967 > this.field2827) {
			var1.field2967 = this.field2827;
		}

		if (var1.field2974 < this.field2827) {
			var1.field2974 = this.field2827;
		}

	}

	public boolean method5071(int var1, int var2, int var3) {
		if (var1 >= this.field2832 && var1 < this.field2826 + this.field2832) {
			return var2 >= (this.field2836 << 6) + (this.field2831 << 3) && var2 <= (this.field2836 << 6) + (this.field2833 << 3) + 7 && var3 >= (this.field2835 << 3) + (this.field2828 << 6) && var3 <= (this.field2828 << 6) + (this.field2834 << 3) + 7;
		} else {
			return false;
		}
	}

	public boolean method5070(int var1, int var2) {
		return var1 >= (this.field2829 << 6) + (this.field2825 << 3) && var1 <= 7 + (this.field2837 << 3) + (this.field2829 << 6) && var2 >= (this.field2827 << 6) + (this.field2830 << 3) && var2 <= (this.field2838 << 3) + (this.field2827 << 6) + 7;
	}

	public int[] method5073(int var1, int var2, int var3) {
		if (!this.method5071(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2825 * 8 - this.field2831 * 8 + var2 + (this.field2829 * 64 - this.field2836 * 64), this.field2830 * 8 - this.field2835 * 8 + this.field2827 * 64 - this.field2828 * 64 + var3};
			return var5;
		}
	}

	public class311 method5076(int var1, int var2) {
		if (!this.method5070(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2831 * 8 - this.field2825 * 8 + var1 + (this.field2836 * 64 - this.field2829 * 64);
			int var5 = this.field2835 * 8 - this.field2830 * 8 + var2 + (this.field2828 * 64 - this.field2827 * 64);
			return new class311(this.field2832, var4, var5);
		}
	}

	public void method5075(class467 var1) {
		this.field2832 = var1.method8326();
		this.field2826 = var1.method8326();
		this.field2836 = var1.method8328();
		this.field2831 = var1.method8326();
		this.field2833 = var1.method8326();
		this.field2828 = var1.method8328();
		this.field2835 = var1.method8326();
		this.field2834 = var1.method8326();
		this.field2829 = var1.method8328();
		this.field2825 = var1.method8326();
		this.field2837 = var1.method8326();
		this.field2827 = var1.method8328();
		this.field2830 = var1.method8326();
		this.field2838 = var1.method8326();
		this.method4704();
	}

	void method4704() {
	}
}
