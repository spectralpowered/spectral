public class class339 {
	class434 field4255;
	class434 field4256;

	public class339() {
		this.field4255 = new class434();
		this.field4255.field4785 = this.field4255;
		this.field4255.field4784 = this.field4255;
	}

	public void method6405(class434 var1) {
		if (var1.field4784 != null) {
			var1.method7971();
		}

		var1.field4784 = this.field4255.field4784;
		var1.field4785 = this.field4255;
		var1.field4784.field4785 = var1;
		var1.field4785.field4784 = var1;
	}

	public class434 method6404() {
		class434 var1 = this.field4255.field4785;
		if (var1 == this.field4255) {
			this.field4256 = null;
			return null;
		} else {
			this.field4256 = var1.field4785;
			return var1;
		}
	}

	public class434 method6406() {
		class434 var1 = this.field4256;
		if (var1 == this.field4255) {
			this.field4256 = null;
			return null;
		} else {
			this.field4256 = var1.field4785;
			return var1;
		}
	}
}
