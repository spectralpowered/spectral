public final class class406 {
	static class406[] field4604;
	static int field4605;
	static int field4607;
	float field4603;
	float field4606;
	float field4608;
	float field4609;

	static {
		field4604 = new class406[0];
		field4605 = 100;
		field4604 = new class406[100];
		field4607 = 0;
		new class406();
	}

	public void method7543() {
		synchronized(field4604) {
			if (field4607 < field4605 - 1) {
				field4604[++field4607 - 1] = this;
			}

		}
	}

	class406() {
		this.method7531();
	}

	void method7525(float var1, float var2, float var3, float var4) {
		this.field4606 = var1;
		this.field4603 = var2;
		this.field4608 = var3;
		this.field4609 = var4;
	}

	public void method7526(float var1, float var2, float var3, float var4) {
		float var6 = (float)Math.sin((double)(var4 * 0.5F));
		float var7 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4606 = var6 * var1;
		this.field4603 = var6 * var2;
		this.field4608 = var3 * var6;
		this.field4609 = var7;
	}

	final void method7531() {
		this.field4608 = 0.0F;
		this.field4603 = 0.0F;
		this.field4606 = 0.0F;
		this.field4609 = 1.0F;
	}

	public final void method7528(class406 var1) {
		this.method7525(this.field4608 * var1.field4603 + this.field4606 * var1.field4609 + var1.field4606 * this.field4609 - this.field4603 * var1.field4608, this.field4609 * var1.field4603 + (var1.field4609 * this.field4603 - var1.field4606 * this.field4608) + var1.field4608 * this.field4606, this.field4603 * var1.field4606 + var1.field4609 * this.field4608 - var1.field4603 * this.field4606 + this.field4609 * var1.field4608, var1.field4609 * this.field4609 - this.field4606 * var1.field4606 - var1.field4603 * this.field4603 - this.field4608 * var1.field4608);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class406)) {
			return false;
		} else {
			class406 var2 = (class406)var1;
			return this.field4606 == var2.field4606 && this.field4603 == var2.field4603 && var2.field4608 == this.field4608 && this.field4609 == var2.field4609;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4606 + var2 * 31.0F;
		var2 = this.field4603 + var2 * 31.0F;
		var2 = var2 * 31.0F + this.field4608;
		var2 = this.field4609 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4606 + "," + this.field4603 + "," + this.field4608 + "," + this.field4609;
	}
}
