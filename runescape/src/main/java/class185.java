import java.util.Arrays;

public class class185 implements class48 {
	static class491 field2036;
	boolean[] field2025;
	boolean[] field2031;
	boolean[] field2032;
	char[] field2034;
	int field2024;
	int field2027;
	int field2028;
	int field2029;
	int[] field2023;
	int[] field2026;
	public char field2022;
	public int field2033;
	public int field2035;
	public int[] field2030;

	public class185() {
		this.field2034 = new char[128];
		this.field2023 = new int[128];
		this.field2030 = new int[128];
		this.field2033 = 0;
		this.field2026 = new int[128];
		this.field2027 = 0;
		this.field2028 = 0;
		this.field2029 = 0;
		this.field2024 = 0;
		this.field2031 = new boolean[112];
		this.field2032 = new boolean[112];
		this.field2025 = new boolean[112];
	}

	public boolean method928(int var1) {
		this.method3563(var1);
		this.field2031[var1] = true;
		this.field2032[var1] = true;
		this.field2025[var1] = false;
		this.field2030[++this.field2033 - 1] = var1;
		return true;
	}

	public boolean method929(int var1) {
		this.field2031[var1] = false;
		this.field2032[var1] = false;
		this.field2025[var1] = true;
		this.field2026[++this.field2027 - 1] = var1;
		return true;
	}

	public boolean method923(char var1) {
		int var3 = 1 + this.field2029 & 127;
		if (this.field2028 != var3) {
			this.field2023[this.field2029] = -1;
			this.field2034[this.field2029] = var1;
			this.field2029 = var3;
		}

		return false;
	}

	void method3563(int var1) {
		int var3 = 1 + this.field2029 & 127;
		if (var3 != this.field2028) {
			this.field2023[this.field2029] = var1;
			this.field2034[this.field2029] = 0;
			this.field2029 = var3;
		}

	}

	public boolean method924(boolean var1) {
		return false;
	}

	public void method3564() {
		this.field2028 = this.field2024;
		this.field2024 = this.field2029;
		this.field2033 = 0;
		this.field2027 = 0;
		Arrays.fill(this.field2032, false);
		Arrays.fill(this.field2025, false);
	}

	public final boolean method3572() {
		if (this.field2024 == this.field2028) {
			return false;
		} else {
			this.field2035 = this.field2023[this.field2028];
			this.field2022 = this.field2034[this.field2028];
			this.field2028 = this.field2028 + 1 & 127;
			return true;
		}
	}

	public boolean method3587(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2032[var1] : false;
	}

	public boolean method3567(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2031[var1] : false;
	}

	public boolean method3565(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2025[var1] : false;
	}

	public int[] method3569() {
		int[] var2 = new int[this.field2033];

		for (int var3 = 0; var3 < this.field2033; ++var3) {
			var2[var3] = this.field2030[var3];
		}

		return var2;
	}

	public int[] method3570() {
		int[] var2 = new int[this.field2027];

		for (int var3 = 0; var3 < this.field2027; ++var3) {
			var2[var3] = this.field2026[var3];
		}

		return var2;
	}
}
