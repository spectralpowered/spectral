import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ow"
)
public class class133 {
	@ObfInfo(
		owner = "ow",
		name = "v",
		desc = "F"
	)
	float field1106;
	@ObfInfo(
		owner = "ow",
		name = "h",
		desc = "F"
	)
	float field1107;
	@ObfInfo(
		owner = "ow",
		name = "e",
		desc = "F"
	)
	float field1108;

	static {
		new class133(0.0F, 0.0F, 0.0F);
		new class133(1.0F, 1.0F, 1.0F);
		new class133(1.0F, 0.0F, 0.0F);
		new class133(0.0F, 1.0F, 0.0F);
		new class133(0.0F, 0.0F, 1.0F);
	}

	@ObfInfo(
		owner = "ow",
		name = "<init>",
		desc = "(FFF)V"
	)
	class133(float var1, float var2, float var3) {
		this.field1107 = var1;
		this.field1108 = var2;
		this.field1106 = var3;
	}

	@ObfInfo(
		owner = "ow",
		name = "h",
		desc = "(B)F"
	)
	final float method626() {
		return (float)Math.sqrt((double)(this.field1107 * this.field1107 + this.field1108 * this.field1108 + this.field1106 * this.field1106));
	}

	@ObfInfo(
		owner = "ow",
		name = "toString",
		desc = "()Ljava/lang/String;"
	)
	public String toString() {
		return this.field1107 + ", " + this.field1108 + ", " + this.field1106;
	}
}
