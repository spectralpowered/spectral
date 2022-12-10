public final class class458 {
	class428 field4880;
	class428 field4882;
	class428[] field4879;
	int field4878;
	int field4881;

	public class458(int var1) {
		this.field4878 = 0;
		this.field4881 = var1;
		this.field4879 = new class428[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class428 var3 = this.field4879[var2] = new class428();
			var3.field4771 = var3;
			var3.field4772 = var3;
		}

	}

	public class428 method8177(long var1) {
		class428 var3 = this.field4879[(int)(var1 & (long)(this.field4881 - 1))];

		for (this.field4880 = var3.field4771; this.field4880 != var3; this.field4880 = this.field4880.field4771) {
			if (this.field4880.field4773 == var1) {
				class428 var4 = this.field4880;
				this.field4880 = this.field4880.field4771;
				return var4;
			}
		}

		this.field4880 = null;
		return null;
	}

	public void method8170(class428 var1, long var2) {
		if (var1.field4772 != null) {
			var1.method7951();
		}

		class428 var4 = this.field4879[(int)(var2 & (long)(this.field4881 - 1))];
		var1.field4772 = var4.field4772;
		var1.field4771 = var4;
		var1.field4772.field4771 = var1;
		var1.field4771.field4772 = var1;
		var1.field4773 = var2;
	}

	public class428 method8172() {
		this.field4878 = 0;
		return this.method8173();
	}

	public class428 method8173() {
		class428 var1;
		if (this.field4878 > 0 && this.field4882 != this.field4879[this.field4878 - 1]) {
			var1 = this.field4882;
			this.field4882 = var1.field4771;
			return var1;
		} else {
			do {
				if (this.field4878 >= this.field4881) {
					return null;
				}

				var1 = this.field4879[this.field4878++].field4771;
			} while(var1 == this.field4879[this.field4878 - 1]);

			this.field4882 = var1.field4771;
			return var1;
		}
	}
}
