public class class52 extends class27 {
	class355 field386;
	class355 field387;
	int field385;
	int field388;

	public class52() {
		this.field387 = new class355();
		this.field386 = new class355();
		this.field385 = 0;
		this.field388 = -1;
	}

	public final synchronized void method1017(class27 var1) {
		this.field387.method6573(var1);
	}

	public final synchronized void method1018(class27 var1) {
		var1.method7951();
	}

	void method1023() {
		if (this.field385 > 0) {
			for (class67 var1 = (class67)this.field386.method6577(); var1 != null; var1 = (class67)this.field386.method6579()) {
				var1.field546 -= this.field385;
			}

			this.field388 -= this.field385;
			this.field385 = 0;
		}

	}

	void method1019(class428 var1, class67 var2) {
		while (var1 != this.field386.field4305 && ((class67)var1).field546 <= var2.field546) {
			var1 = var1.field4771;
		}

		class355.method6574(var2, var1);
		this.field388 = ((class67)this.field386.field4305.field4771).field546;
	}

	void method1020(class67 var1) {
		var1.method7951();
		var1.method1233();
		class428 var2 = this.field386.field4305.field4771;
		if (var2 == this.field386.field4305) {
			this.field388 = -1;
		} else {
			this.field388 = ((class67)var2).field546;
		}

	}

	protected class27 method355() {
		return (class27)this.field387.method6577();
	}

	protected class27 method359() {
		return (class27)this.field387.method6579();
	}

	protected int method365() {
		return 0;
	}

	public final synchronized void method356(int[] var1, int var2, int var3) {
		do {
			if (this.field388 < 0) {
				this.method1022(var1, var2, var3);
				return;
			}

			if (this.field385 + var3 < this.field388) {
				this.field385 += var3;
				this.method1022(var1, var2, var3);
				return;
			}

			int var4 = this.field388 - this.field385;
			this.method1022(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field385 += var4;
			this.method1023();
			class67 var5 = (class67)this.field386.method6577();
			synchronized(var5) {
				int var7 = var5.method1235(this);
				if (var7 < 0) {
					var5.field546 = 0;
					this.method1020(var5);
				} else {
					var5.field546 = var7;
					this.method1019(var5.field4771, var5);
				}
			}
		} while(var3 != 0);

	}

	void method1022(int[] var1, int var2, int var3) {
		for (class27 var4 = (class27)this.field387.method6577(); var4 != null; var4 = (class27)this.field387.method6579()) {
			var4.method358(var1, var2, var3);
		}

	}

	public final synchronized void method360(int var1) {
		do {
			if (this.field388 < 0) {
				this.method1027(var1);
				return;
			}

			if (this.field385 + var1 < this.field388) {
				this.field385 += var1;
				this.method1027(var1);
				return;
			}

			int var2 = this.field388 - this.field385;
			this.method1027(var2);
			var1 -= var2;
			this.field385 += var2;
			this.method1023();
			class67 var3 = (class67)this.field386.method6577();
			synchronized(var3) {
				int var5 = var3.method1235(this);
				if (var5 < 0) {
					var3.field546 = 0;
					this.method1020(var3);
				} else {
					var3.field546 = var5;
					this.method1019(var3.field4771, var3);
				}
			}
		} while(var1 != 0);

	}

	void method1027(int var1) {
		for (class27 var2 = (class27)this.field387.method6577(); var2 != null; var2 = (class27)this.field387.method6579()) {
			var2.method360(var1);
		}

	}
}
