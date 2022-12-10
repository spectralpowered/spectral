public class class413 {
	float field4629;
	float field4630;
	float field4631;

	static {
		new class413(0.0F, 0.0F, 0.0F);
		new class413(1.0F, 1.0F, 1.0F);
		new class413(1.0F, 0.0F, 0.0F);
		new class413(0.0F, 1.0F, 0.0F);
		new class413(0.0F, 0.0F, 1.0F);
	}

	class413(float var1, float var2, float var3) {
		this.field4630 = var1;
		this.field4631 = var2;
		this.field4629 = var3;
	}

	final float method7645() {
		return (float)Math.sqrt((double)(this.field4630 * this.field4630 + this.field4631 * this.field4631 + this.field4629 * this.field4629));
	}

	public String toString() {
		return this.field4630 + ", " + this.field4631 + ", " + this.field4629;
	}
}
