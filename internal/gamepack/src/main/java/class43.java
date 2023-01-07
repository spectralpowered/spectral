import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "oc"
)
public class class43 {
	@ObfInfo(
		owner = "oc",
		name = "u",
		desc = "F"
	)
	float field526;
	@ObfInfo(
		owner = "oc",
		name = "e",
		desc = "F"
	)
	float field527;
	@ObfInfo(
		owner = "oc",
		name = "v",
		desc = "F"
	)
	float field528;
	@ObfInfo(
		owner = "oc",
		name = "g",
		desc = "F"
	)
	float field529;
	@ObfInfo(
		owner = "oc",
		name = "m",
		desc = "F"
	)
	float field530;
	@ObfInfo(
		owner = "oc",
		name = "q",
		desc = "F"
	)
	float field531;
	@ObfInfo(
		owner = "oc",
		name = "f",
		desc = "F"
	)
	float field532;
	@ObfInfo(
		owner = "oc",
		name = "r",
		desc = "F"
	)
	float field533;
	@ObfInfo(
		owner = "oc",
		name = "h",
		desc = "F"
	)
	float field534;
	@ObfInfo(
		owner = "oc",
		name = "x",
		desc = "F"
	)
	float field535;
	@ObfInfo(
		owner = "oc",
		name = "j",
		desc = "F"
	)
	float field536;
	@ObfInfo(
		owner = "oc",
		name = "b",
		desc = "F"
	)
	float field537;

	static {
		new class43();
	}

	@ObfInfo(
		owner = "oc",
		name = "<init>",
		desc = "()V"
	)
	class43() {
		this.method201();
	}

	@ObfInfo(
		owner = "oc",
		name = "h",
		desc = "(B)V"
	)
	void method201() {
		this.field529 = 0.0F;
		this.field536 = 0.0F;
		this.field537 = 0.0F;
		this.field533 = 0.0F;
		this.field532 = 0.0F;
		this.field531 = 0.0F;
		this.field535 = 0.0F;
		this.field528 = 0.0F;
		this.field527 = 0.0F;
		this.field526 = 1.0F;
		this.field530 = 1.0F;
		this.field534 = 1.0F;
	}

	@ObfInfo(
		owner = "oc",
		name = "e",
		desc = "(FB)V"
	)
	void method199(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field527;
		float var6 = this.field530;
		float var7 = this.field533;
		float var8 = this.field536;
		this.field527 = var5 * var3 - var4 * this.field528;
		this.field528 = var3 * this.field528 + var5 * var4;
		this.field530 = var3 * var6 - var4 * this.field531;
		this.field531 = var6 * var4 + this.field531 * var3;
		this.field533 = var3 * var7 - this.field526 * var4;
		this.field526 = var7 * var4 + this.field526 * var3;
		this.field536 = var8 * var3 - var4 * this.field529;
		this.field529 = var3 * this.field529 + var4 * var8;
	}

	@ObfInfo(
		owner = "oc",
		name = "v",
		desc = "(FB)V"
	)
	void method200(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field534;
		float var6 = this.field535;
		float var7 = this.field532;
		float var8 = this.field537;
		this.field534 = var4 * this.field528 + var5 * var3;
		this.field528 = var3 * this.field528 - var5 * var4;
		this.field535 = var4 * this.field531 + var3 * var6;
		this.field531 = this.field531 * var3 - var6 * var4;
		this.field532 = var4 * this.field526 + var7 * var3;
		this.field526 = var3 * this.field526 - var4 * var7;
		this.field537 = this.field529 * var4 + var8 * var3;
		this.field529 = this.field529 * var3 - var8 * var4;
	}

	@ObfInfo(
		owner = "oc",
		name = "x",
		desc = "(FI)V"
	)
	void method203(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field534;
		float var6 = this.field535;
		float var7 = this.field532;
		float var8 = this.field537;
		this.field534 = var5 * var3 - var4 * this.field527;
		this.field527 = var5 * var4 + this.field527 * var3;
		this.field535 = var6 * var3 - var4 * this.field530;
		this.field530 = var6 * var4 + this.field530 * var3;
		this.field532 = var7 * var3 - this.field533 * var4;
		this.field533 = var3 * this.field533 + var4 * var7;
		this.field537 = var3 * var8 - this.field536 * var4;
		this.field536 = var8 * var4 + this.field536 * var3;
	}

	@ObfInfo(
		owner = "oc",
		name = "m",
		desc = "(FFFB)V"
	)
	void method202(float var1, float var2, float var3) {
		this.field537 += var1;
		this.field536 += var2;
		this.field529 += var3;
	}

	@ObfInfo(
		owner = "oc",
		name = "toString",
		desc = "()Ljava/lang/String;"
	)
	public String toString() {
		return this.field534 + "," + this.field535 + "," + this.field532 + "," + this.field537 + "\n" + this.field527 + "," + this.field530 + "," + this.field533 + "," + this.field536 + "\n" + this.field528 + "," + this.field531 + "," + this.field526 + "," + this.field529;
	}
}
