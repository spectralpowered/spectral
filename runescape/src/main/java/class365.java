public class class365 {
	class385 field4367;
	int field4364;
	int field4365;

	class365(class385 var1, int var2, int var3) {
		this.field4364 = 0;
		this.field4365 = 0;
		this.field4367 = var1;
		this.field4364 = var2;
		this.field4365 = var3;
	}

	public String method6806() {
		if (this.method6785()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method6803());

			for (int var3 = this.field4364; var3 < this.field4365; ++var3) {
				class380 var4 = this.field4367.method7118(var3);
				var2.append(var4.field4464);
			}

			return var2.toString();
		}
	}

	boolean method6784(int var1) {
		return this.field4367.method7184() == 2 || this.field4367.method7184() == 1 && (!this.field4367.field4497 || this.field4365 - 1 != var1);
	}

	public boolean method6785() {
		return this.field4365 == this.field4364;
	}

	public int method6803() {
		return this.field4365 - this.field4364;
	}

	boolean method6787(class380 var1) {
		if (this.field4367.field4501 == 2) {
			return true;
		} else if (this.field4367.field4501 == 0) {
			return false;
		} else {
			return this.field4367.method7119() != var1;
		}
	}

	int method6804() {
		if (this.method6785()) {
			return 0;
		} else {
			class380 var2 = this.field4367.method7118(this.field4365 - 1);
			if (var2.field4464 == '\n') {
				return 0;
			} else if (this.method6787(var2)) {
				return this.field4367.field4498.field4400[42];
			} else {
				int var3 = this.field4367.field4498.field4400[var2.field4464];
				if (var3 == 0) {
					return var2.field4464 == '\t' ? this.field4367.field4498.field4400[32] * 3 : this.field4367.field4498.field4400[32];
				} else {
					return var3;
				}
			}
		}
	}

	public class423 method6789() {
		if (this.method6785()) {
			return new class423(0, 0);
		} else {
			class380 var2 = this.field4367.method7118(this.field4365 - 1);
			return new class423(var2.field4467 + this.method6804(), var2.field4466);
		}
	}

	public class380 method6790(int var1) {
		return var1 >= 0 && var1 < this.method6803() ? this.field4367.method7118(this.field4364 + var1) : null;
	}
}
