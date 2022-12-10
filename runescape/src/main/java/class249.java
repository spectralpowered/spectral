public class class249 extends class258 {
	final class243 field2937;
	final int field2938;
	final int field2939;
	final int field2940;

	class249(class311 var1, class311 var2, int var3, class243 var4) {
		super(var1, var2);
		this.field2940 = var3;
		this.field2937 = var4;
		class169 var5 = class163.method2762(this.method5105());
		class491 var6 = var5.method2869(false);
		if (null != var6) {
			this.field2938 = var6.field5057;
			this.field2939 = var6.field5056;
		} else {
			this.field2938 = 0;
			this.field2939 = 0;
		}

	}

	public int method5105() {
		return this.field2940;
	}

	class243 method5113() {
		return this.field2937;
	}

	int method5093() {
		return this.field2938;
	}

	int method5118() {
		return this.field2939;
	}
}
