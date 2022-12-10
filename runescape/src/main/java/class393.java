public class class393 {
	float field4526;
	float field4527;
	float field4528;
	float field4529;
	float field4530;
	float field4531;
	float field4532;
	float field4533;
	float field4534;
	float field4535;
	float field4536;
	float field4537;

	static {
		new class393();
	}

	class393() {
		this.method7274();
	}

	void method7274() {
		this.field4529 = 0.0F;
		this.field4536 = 0.0F;
		this.field4537 = 0.0F;
		this.field4533 = 0.0F;
		this.field4532 = 0.0F;
		this.field4531 = 0.0F;
		this.field4535 = 0.0F;
		this.field4528 = 0.0F;
		this.field4527 = 0.0F;
		this.field4526 = 1.0F;
		this.field4530 = 1.0F;
		this.field4534 = 1.0F;
	}

	void method7272(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4527;
		float var6 = this.field4530;
		float var7 = this.field4533;
		float var8 = this.field4536;
		this.field4527 = var5 * var3 - var4 * this.field4528;
		this.field4528 = var3 * this.field4528 + var5 * var4;
		this.field4530 = var3 * var6 - var4 * this.field4531;
		this.field4531 = var6 * var4 + this.field4531 * var3;
		this.field4533 = var3 * var7 - this.field4526 * var4;
		this.field4526 = var7 * var4 + this.field4526 * var3;
		this.field4536 = var8 * var3 - var4 * this.field4529;
		this.field4529 = var3 * this.field4529 + var4 * var8;
	}

	void method7273(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4534;
		float var6 = this.field4535;
		float var7 = this.field4532;
		float var8 = this.field4537;
		this.field4534 = var4 * this.field4528 + var5 * var3;
		this.field4528 = var3 * this.field4528 - var5 * var4;
		this.field4535 = var4 * this.field4531 + var3 * var6;
		this.field4531 = this.field4531 * var3 - var6 * var4;
		this.field4532 = var4 * this.field4526 + var7 * var3;
		this.field4526 = var3 * this.field4526 - var4 * var7;
		this.field4537 = this.field4529 * var4 + var8 * var3;
		this.field4529 = this.field4529 * var3 - var8 * var4;
	}

	void method7277(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4534;
		float var6 = this.field4535;
		float var7 = this.field4532;
		float var8 = this.field4537;
		this.field4534 = var5 * var3 - var4 * this.field4527;
		this.field4527 = var5 * var4 + this.field4527 * var3;
		this.field4535 = var6 * var3 - var4 * this.field4530;
		this.field4530 = var6 * var4 + this.field4530 * var3;
		this.field4532 = var7 * var3 - this.field4533 * var4;
		this.field4533 = var3 * this.field4533 + var4 * var7;
		this.field4537 = var3 * var8 - this.field4536 * var4;
		this.field4536 = var8 * var4 + this.field4536 * var3;
	}

	void method7275(float var1, float var2, float var3) {
		this.field4537 += var1;
		this.field4536 += var2;
		this.field4529 += var3;
	}

	public String toString() {
		return this.field4534 + "," + this.field4535 + "," + this.field4532 + "," + this.field4537 + "\n" + this.field4527 + "," + this.field4530 + "," + this.field4533 + "," + this.field4536 + "\n" + this.field4528 + "," + this.field4531 + "," + this.field4526 + "," + this.field4529;
	}
}
