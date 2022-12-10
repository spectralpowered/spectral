public class class355 {
	class428 field4304;
	public class428 field4305;

	public class355() {
		this.field4305 = new class428();
		this.field4305.field4771 = this.field4305;
		this.field4305.field4772 = this.field4305;
	}

	public void method6583() {
		while (true) {
			class428 var1 = this.field4305.field4771;
			if (var1 == this.field4305) {
				this.field4304 = null;
				return;
			}

			var1.method7951();
		}
	}

	public void method6572(class428 var1) {
		if (var1.field4772 != null) {
			var1.method7951();
		}

		var1.field4772 = this.field4305.field4772;
		var1.field4771 = this.field4305;
		var1.field4772.field4771 = var1;
		var1.field4771.field4772 = var1;
	}

	public void method6573(class428 var1) {
		if (var1.field4772 != null) {
			var1.method7951();
		}

		var1.field4772 = this.field4305;
		var1.field4771 = this.field4305.field4771;
		var1.field4772.field4771 = var1;
		var1.field4771.field4772 = var1;
	}

	public static void method6574(class428 var0, class428 var1) {
		if (var0.field4772 != null) {
			var0.method7951();
		}

		var0.field4772 = var1.field4772;
		var0.field4771 = var1;
		var0.field4772.field4771 = var0;
		var0.field4771.field4772 = var0;
	}

	public class428 method6575() {
		class428 var1 = this.field4305.field4771;
		if (var1 == this.field4305) {
			return null;
		} else {
			var1.method7951();
			return var1;
		}
	}

	public class428 method6598() {
		class428 var1 = this.field4305.field4772;
		if (var1 == this.field4305) {
			return null;
		} else {
			var1.method7951();
			return var1;
		}
	}

	public class428 method6577() {
		class428 var1 = this.field4305.field4771;
		if (var1 == this.field4305) {
			this.field4304 = null;
			return null;
		} else {
			this.field4304 = var1.field4771;
			return var1;
		}
	}

	public class428 method6578() {
		class428 var1 = this.field4305.field4772;
		if (var1 == this.field4305) {
			this.field4304 = null;
			return null;
		} else {
			this.field4304 = var1.field4772;
			return var1;
		}
	}

	public class428 method6579() {
		class428 var1 = this.field4304;
		if (var1 == this.field4305) {
			this.field4304 = null;
			return null;
		} else {
			this.field4304 = var1.field4771;
			return var1;
		}
	}

	public class428 method6590() {
		class428 var1 = this.field4304;
		if (var1 == this.field4305) {
			this.field4304 = null;
			return null;
		} else {
			this.field4304 = var1.field4772;
			return var1;
		}
	}
}
