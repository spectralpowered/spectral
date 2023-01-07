import io.spectralpowered.ObfInfo;
import java.util.Arrays;

@ObfInfo(
	name = "ao"
)
public class class109 {
	@ObfInfo(
		owner = "ao",
		name = "f",
		desc = "[I"
	)
	int[] field823;
	@ObfInfo(
		owner = "ao",
		name = "r",
		desc = "[I"
	)
	int[] field824;

	@ObfInfo(
		owner = "ao",
		name = "<init>",
		desc = "()V"
	)
	public class109() {
		this.field823 = new int[112];
		this.field824 = new int[192];
		Arrays.fill(this.field823, 3);
		Arrays.fill(this.field824, 3);
	}

	@ObfInfo(
		owner = "ao",
		name = "h",
		desc = "(III)V"
	)
	public void method431(int var1, int var2) {
		if (this.method433(var1) && this.method434(var2)) {
			this.field823[var1] = var2;
		}

	}

	@ObfInfo(
		owner = "ao",
		name = "e",
		desc = "(CII)V"
	)
	public void method428(char var1, int var2) {
		if (this.method435(var1, (byte)-1) && this.method434(var2)) {
			this.field824[var1] = var2;
		}

	}

	@ObfInfo(
		owner = "ao",
		name = "v",
		desc = "(IB)I"
	)
	public int method427(int var1) {
		return this.method433(var1) ? this.field823[var1] : 0;
	}

	@ObfInfo(
		owner = "ao",
		name = "x",
		desc = "(CI)I"
	)
	public int method429(char var1) {
		return this.method435(var1, (byte)-1) ? this.field824[var1] : 0;
	}

	@ObfInfo(
		owner = "ao",
		name = "m",
		desc = "(II)Z"
	)
	public boolean method437(int var1) {
		return this.method433(var1) && (1 == this.field823[var1] || this.field823[var1] == 3);
	}

	@ObfInfo(
		owner = "ao",
		name = "q",
		desc = "(CI)Z"
	)
	public boolean method430(char var1) {
		return this.method435(var1, (byte)-1) && (1 == this.field824[var1] || 3 == this.field824[var1]);
	}

	@ObfInfo(
		owner = "ao",
		name = "f",
		desc = "(II)Z"
	)
	public boolean method432(int var1) {
		return this.method433(var1) && (2 == this.field823[var1] || this.field823[var1] == 3);
	}

	@ObfInfo(
		owner = "ao",
		name = "r",
		desc = "(CB)Z"
	)
	public boolean method436(char var1) {
		return this.method435(var1, (byte)-1) && (2 == this.field824[var1] || 3 == this.field824[var1]);
	}

	@ObfInfo(
		owner = "ao",
		name = "u",
		desc = "(IB)Z"
	)
	boolean method433(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfInfo(
		owner = "ao",
		name = "b",
		desc = "(CB)Z"
	)
	boolean method435(char var1, byte var2) {
		if (var1 >= 0) {
			if (var2 != -1) {
				throw new IllegalStateException();
			}

			if (var1 < 192) {
				return true;
			}

			if (var2 != -1) {
				throw new IllegalStateException();
			}
		}

		System.out.println("Invalid keychar: " + var1);
		return false;
	}

	@ObfInfo(
		owner = "ao",
		name = "j",
		desc = "(II)Z"
	)
	boolean method434(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfInfo(
		owner = "ao",
		name = "e",
		desc = "(Ldu;FI)F"
	)
	static float method438(class84 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var3;
			if (var0.field680 == var1) {
				var3 = 0.0F;
			} else if (var1 == var0.field681) {
				var3 = 1.0F;
			} else {
				var3 = (var1 - var0.field680) / (var0.field681 - var0.field680);
			}

			float var4;
			if (var0.field694) {
				var4 = var3;
			} else {
				class186.field1693[3] = var0.field685;
				class186.field1693[2] = var0.field674;
				class186.field1693[1] = var0.field696;
				class186.field1693[0] = var0.field682 - var3;
				class186.field1696[0] = 0.0F;
				class186.field1696[1] = 0.0F;
				class186.field1696[2] = 0.0F;
				class186.field1696[3] = 0.0F;
				class186.field1696[4] = 0.0F;
				int var5 = class222.method986(class186.field1693, 3, 0.0F, true, 1.0F, true, class186.field1696);
				if (var5 == 1) {
					var4 = class186.field1696[0];
				} else {
					var4 = 0.0F;
				}
			}

			return var0.field686 + var4 * (var0.field687 + (var4 * var0.field689 + var0.field688) * var4);
		}
	}
}
