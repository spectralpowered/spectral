public final class class282 {
	class351 field3313;
	class439 field3311;
	class454 field3312;
	int field3309;
	int field3310;

	public class282(int var1) {
		this.field3311 = new class439();
		this.field3313 = new class351();
		this.field3310 = var1;
		this.field3309 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}

		this.field3312 = new class454(var2);
	}

	public class439 method5356(long var1) {
		class439 var3 = (class439)this.field3312.method8135(var1);
		if (var3 != null) {
			this.field3313.method6518(var3);
		}

		return var3;
	}

	public void method5355(long var1) {
		class439 var3 = (class439)this.field3312.method8135(var1);
		if (var3 != null) {
			var3.method7951();
			var3.method7996();
			++this.field3309;
		}

	}

	public void method5364(class439 var1, long var2) {
		if (this.field3309 == 0) {
			class439 var4 = this.field3313.method6520();
			var4.method7951();
			var4.method7996();
			if (var4 == this.field3311) {
				var4 = this.field3313.method6520();
				var4.method7951();
				var4.method7996();
			}
		} else {
			--this.field3309;
		}

		this.field3312.method8133(var1, var2);
		this.field3313.method6518(var1);
	}

	public void method5357() {
		this.field3313.method6517();
		this.field3312.method8122();
		this.field3311 = new class439();
		this.field3309 = this.field3310;
	}
}
