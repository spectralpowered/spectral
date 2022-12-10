public class class238 implements class257 {
	static byte[][] field2862;
	int field2852;
	int field2853;
	int field2854;
	int field2855;
	int field2856;
	int field2857;
	int field2858;
	int field2859;
	int field2860;
	int field2861;

	class238() {
	}

	public void method5078(class254 var1) {
		if (var1.field2971 > this.field2860) {
			var1.field2971 = this.field2860;
		}

		if (var1.field2972 < this.field2860) {
			var1.field2972 = this.field2860;
		}

		if (var1.field2967 > this.field2856) {
			var1.field2967 = this.field2856;
		}

		if (var1.field2974 < this.field2856) {
			var1.field2974 = this.field2856;
		}

	}

	public boolean method5071(int var1, int var2, int var3) {
		if (var1 >= this.field2858 && var1 < this.field2858 + this.field2853) {
			return var2 >= (this.field2854 << 6) + (this.field2859 << 3) && var2 <= (this.field2854 << 6) + (this.field2859 << 3) + 7 && var3 >= (this.field2852 << 6) + (this.field2855 << 3) && var3 <= 7 + (this.field2855 << 3) + (this.field2852 << 6);
		} else {
			return false;
		}
	}

	public boolean method5070(int var1, int var2) {
		return var1 >= (this.field2860 << 6) + (this.field2857 << 3) && var1 <= 7 + (this.field2860 << 6) + (this.field2857 << 3) && var2 >= (this.field2861 << 3) + (this.field2856 << 6) && var2 <= (this.field2861 << 3) + (this.field2856 << 6) + 7;
	}

	public int[] method5073(int var1, int var2, int var3) {
		if (!this.method5071(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2857 * 8 - this.field2859 * 8 + this.field2860 * 64 - this.field2854 * 64 + var2, var3 + (this.field2856 * 64 - this.field2852 * 64) + (this.field2861 * 8 - this.field2855 * 8)};
			return var5;
		}
	}

	public class311 method5076(int var1, int var2) {
		if (!this.method5070(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2854 * 64 - this.field2860 * 64 + var1 + (this.field2859 * 8 - this.field2857 * 8);
			int var5 = this.field2855 * 8 - this.field2861 * 8 + var2 + (this.field2852 * 64 - this.field2856 * 64);
			return new class311(this.field2858, var4, var5);
		}
	}

	public void method5075(class467 var1) {
		this.field2858 = var1.method8326();
		this.field2853 = var1.method8326();
		this.field2854 = var1.method8328();
		this.field2859 = var1.method8326();
		this.field2852 = var1.method8328();
		this.field2855 = var1.method8326();
		this.field2860 = var1.method8328();
		this.field2857 = var1.method8326();
		this.field2856 = var1.method8328();
		this.field2861 = var1.method8326();
		this.method4735();
	}

	void method4735() {
	}

	public static void method4752() {
		if (null != class334.field4215) {
			class334.field4215.method7609();
		}

	}
}
