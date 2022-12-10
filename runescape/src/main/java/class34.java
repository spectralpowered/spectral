public class class34 {
	int field196;
	int field199;
	int field200;
	int field201;
	int field202;
	int field203;
	int field204;
	int field205;
	int field206;
	int[] field197;
	int[] field198;

	class34() {
		this.field205 = 2;
		this.field197 = new int[2];
		this.field198 = new int[2];
		this.field197[0] = 0;
		this.field197[1] = 65535;
		this.field198[0] = 0;
		this.field198[1] = 65535;
	}

	final void method434(class467 var1) {
		this.field206 = var1.method8326();
		this.field199 = var1.method8480();
		this.field200 = var1.method8480();
		this.method431(var1);
	}

	final void method431(class467 var1) {
		this.field205 = var1.method8326();
		this.field197 = new int[this.field205];
		this.field198 = new int[this.field205];

		for (int var2 = 0; var2 < this.field205; ++var2) {
			this.field197[var2] = var1.method8328();
			this.field198[var2] = var1.method8328();
		}

	}

	final void method432() {
		this.field202 = 0;
		this.field196 = 0;
		this.field204 = 0;
		this.field201 = 0;
		this.field203 = 0;
	}

	final int method430(int var1) {
		if (this.field203 >= this.field202) {
			this.field201 = this.field198[this.field196++] << 15;
			if (this.field196 >= this.field205) {
				this.field196 = this.field205 - 1;
			}

			this.field202 = (int)((double)this.field197[this.field196] / 65536.0D * (double)var1);
			if (this.field202 > this.field203) {
				this.field204 = ((this.field198[this.field196] << 15) - this.field201) / (this.field202 - this.field203);
			}
		}

		this.field201 += this.field204;
		++this.field203;
		return this.field201 - this.field204 >> 15;
	}
}
