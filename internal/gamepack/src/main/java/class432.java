import io.spectralpowered.ObfInfo;
import java.util.Arrays;

@ObfInfo(
	name = "gc"
)
public class class432 implements class310 {
	@ObfInfo(
		owner = "gc",
		name = "is",
		desc = "Lrx;"
	)
	static class266 field3591;
	@ObfInfo(
		owner = "gc",
		name = "g",
		desc = "[Z"
	)
	boolean[] field3580;
	@ObfInfo(
		owner = "gc",
		name = "b",
		desc = "[Z"
	)
	boolean[] field3586;
	@ObfInfo(
		owner = "gc",
		name = "j",
		desc = "[Z"
	)
	boolean[] field3587;
	@ObfInfo(
		owner = "gc",
		name = "h",
		desc = "[C"
	)
	char[] field3589;
	@ObfInfo(
		owner = "gc",
		name = "u",
		desc = "I"
	)
	int field3579;
	@ObfInfo(
		owner = "gc",
		name = "q",
		desc = "I"
	)
	int field3582;
	@ObfInfo(
		owner = "gc",
		name = "f",
		desc = "I"
	)
	int field3583;
	@ObfInfo(
		owner = "gc",
		name = "r",
		desc = "I"
	)
	int field3584;
	@ObfInfo(
		owner = "gc",
		name = "e",
		desc = "[I"
	)
	int[] field3578;
	@ObfInfo(
		owner = "gc",
		name = "m",
		desc = "[I"
	)
	int[] field3581;
	@ObfInfo(
		owner = "gc",
		name = "i",
		desc = "C"
	)
	public char field3577;
	@ObfInfo(
		owner = "gc",
		name = "x",
		desc = "I"
	)
	public int field3588;
	@ObfInfo(
		owner = "gc",
		name = "o",
		desc = "I"
	)
	public int field3590;
	@ObfInfo(
		owner = "gc",
		name = "v",
		desc = "[I"
	)
	public int[] field3585;

	@ObfInfo(
		owner = "gc",
		name = "<init>",
		desc = "()V"
	)
	public class432() {
		this.field3589 = new char[128];
		this.field3578 = new int[128];
		this.field3585 = new int[128];
		this.field3588 = 0;
		this.field3581 = new int[128];
		this.field3582 = 0;
		this.field3583 = 0;
		this.field3584 = 0;
		this.field3579 = 0;
		this.field3586 = new boolean[112];
		this.field3587 = new boolean[112];
		this.field3580 = new boolean[112];
	}

	@ObfInfo(
		owner = "gc",
		name = "h",
		desc = "(II)Z"
	)
	public boolean method1501(int var1) {
		this.method2129(var1);
		this.field3586[var1] = true;
		this.field3587[var1] = true;
		this.field3580[var1] = false;
		this.field3585[++this.field3588 - 1] = var1;
		return true;
	}

	@ObfInfo(
		owner = "gc",
		name = "e",
		desc = "(II)Z"
	)
	public boolean method1502(int var1) {
		this.field3586[var1] = false;
		this.field3587[var1] = false;
		this.field3580[var1] = true;
		this.field3581[++this.field3582 - 1] = var1;
		return true;
	}

	@ObfInfo(
		owner = "gc",
		name = "v",
		desc = "(CI)Z"
	)
	public boolean method1499(char var1) {
		int var3 = 1 + this.field3584 & 127;
		if (this.field3583 != var3) {
			this.field3578[this.field3584] = -1;
			this.field3589[this.field3584] = var1;
			this.field3584 = var3;
		}

		return false;
	}

	@ObfInfo(
		owner = "gc",
		name = "a",
		desc = "(IB)V"
	)
	void method2129(int var1) {
		int var3 = 1 + this.field3584 & 127;
		if (var3 != this.field3583) {
			this.field3578[this.field3584] = var1;
			this.field3589[this.field3584] = 0;
			this.field3584 = var3;
		}

	}

	@ObfInfo(
		owner = "gc",
		name = "x",
		desc = "(ZI)Z"
	)
	public boolean method1500(boolean var1) {
		return false;
	}

	@ObfInfo(
		owner = "gc",
		name = "s",
		desc = "(B)V"
	)
	public void method2130() {
		this.field3583 = this.field3579;
		this.field3579 = this.field3584;
		this.field3588 = 0;
		this.field3582 = 0;
		Arrays.fill(this.field3587, false);
		Arrays.fill(this.field3580, false);
	}

	@ObfInfo(
		owner = "gc",
		name = "l",
		desc = "(B)Z"
	)
	public final boolean method2136() {
		if (this.field3579 == this.field3583) {
			return false;
		} else {
			this.field3590 = this.field3578[this.field3583];
			this.field3577 = this.field3589[this.field3583];
			this.field3583 = this.field3583 + 1 & 127;
			return true;
		}
	}

	@ObfInfo(
		owner = "gc",
		name = "t",
		desc = "(II)Z"
	)
	public boolean method2137(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3587[var1] : false;
	}

	@ObfInfo(
		owner = "gc",
		name = "c",
		desc = "(IB)Z"
	)
	public boolean method2132(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3586[var1] : false;
	}

	@ObfInfo(
		owner = "gc",
		name = "p",
		desc = "(II)Z"
	)
	public boolean method2131(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3580[var1] : false;
	}

	@ObfInfo(
		owner = "gc",
		name = "d",
		desc = "(B)[I"
	)
	public int[] method2133() {
		int[] var2 = new int[this.field3588];

		for (int var3 = 0; var3 < this.field3588; ++var3) {
			var2[var3] = this.field3585[var3];
		}

		return var2;
	}

	@ObfInfo(
		owner = "gc",
		name = "y",
		desc = "(I)[I"
	)
	public int[] method2134() {
		int[] var2 = new int[this.field3582];

		for (int var3 = 0; var3 < this.field3582; ++var3) {
			var2[var3] = this.field3581[var3];
		}

		return var2;
	}

	@ObfInfo(
		owner = "gc",
		name = "h",
		desc = "(DDD)I"
	)
	public static final int method2135(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (var2 + 1.0D) * var4;
			} else {
				var12 = var4 + var2 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = 6.0D * (var12 - var14) * var16 + var14;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = var14 + 6.0D * (0.6666666666666666D - var16) * (var12 - var14);
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var0 * 6.0D * (var12 - var14) + var14;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14);
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = 6.0D * (var12 - var14) * var20 + var14;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0D);
		int var13 = (int)(var8 * 256.0D);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}
}
