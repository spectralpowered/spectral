import java.util.Arrays;

public class class41 {
	int[] field289;
	int[] field290;

	public class41() {
		this.field289 = new int[112];
		this.field290 = new int[192];
		Arrays.fill(this.field289, 3);
		Arrays.fill(this.field290, 3);
	}

	public void method695(int var1, int var2) {
		if (this.method697(var1) && this.method698(var2)) {
			this.field289[var1] = var2;
		}

	}

	public void method689(char var1, int var2) {
		if (this.method705(var1) && this.method698(var2)) {
			this.field290[var1] = var2;
		}

	}

	public int method688(int var1) {
		return this.method697(var1) ? this.field289[var1] : 0;
	}

	public int method691(char var1) {
		return this.method705(var1) ? this.field290[var1] : 0;
	}

	public boolean method717(int var1) {
		return this.method697(var1) && (1 == this.field289[var1] || this.field289[var1] == 3);
	}

	public boolean method693(char var1) {
		return this.method705(var1) && (1 == this.field290[var1] || 3 == this.field290[var1]);
	}

	public boolean method696(int var1) {
		return this.method697(var1) && (2 == this.field289[var1] || this.field289[var1] == 3);
	}

	public boolean method706(char var1) {
		return this.method705(var1) && (2 == this.field290[var1] || 3 == this.field290[var1]);
	}

	boolean method697(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	boolean method705(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	boolean method698(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	static float method720(class125 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var3;
			if (var0.field1244 == var1) {
				var3 = 0.0F;
			} else if (var1 == var0.field1245) {
				var3 = 1.0F;
			} else {
				var3 = (var1 - var0.field1244) / (var0.field1245 - var0.field1244);
			}

			float var4;
			if (var0.field1258) {
				var4 = var3;
			} else {
				class106.field1087[3] = var0.field1249;
				class106.field1087[2] = var0.field1238;
				class106.field1087[1] = var0.field1260;
				class106.field1087[0] = var0.field1246 - var3;
				class106.field1091[0] = 0.0F;
				class106.field1091[1] = 0.0F;
				class106.field1091[2] = 0.0F;
				class106.field1091[3] = 0.0F;
				class106.field1091[4] = 0.0F;
				int var5 = class419.method7893(class106.field1087, 3, 0.0F, true, 1.0F, true, class106.field1091);
				if (var5 == 1) {
					var4 = class106.field1091[0];
				} else {
					var4 = 0.0F;
				}
			}

			return var0.field1250 + var4 * (var0.field1251 + (var4 * var0.field1253 + var0.field1252) * var4);
		}
	}
}
