public class class134 {
	class360 field1319;
	long field1318;
	long field1322;

	public class134(class467 var1) {
		this.field1318 = -1L;
		this.field1319 = new class360();
		this.method2487(var1);
	}

	void method2487(class467 var1) {
		this.field1322 = var1.method8492();
		this.field1318 = var1.method8492();

		for (int var3 = var1.method8326(); var3 != 0; var3 = var1.method8326()) {
			Object var4;
			if (var3 == 1) {
				var4 = new class144(this);
			} else if (var3 == 4) {
				var4 = new class171(this);
			} else if (var3 == 3) {
				var4 = new class132(this);
			} else if (var3 == 2) {
				var4 = new class148(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}

				var4 = new class137(this);
			}

			((class139)var4).method2518(var1);
			this.field1319.method6672((class428)var4);
		}

	}

	public void method2480(class170 var1) {
		if (var1.field4773 == this.field1322 && this.field1318 == var1.field1605) {
			for (class139 var3 = (class139)this.field1319.method6705(); var3 != null; var3 = (class139)this.field1319.method6665()) {
				var3.method2519(var1);
			}

			++var1.field1605;
		} else {
			throw new RuntimeException("");
		}
	}

	public static String method2481(class467 var0) {
		String var2;
		try {
			int var3 = var0.method8340();
			if (var3 > 32767) {
				var3 = 32767;
			}

			byte[] var4 = new byte[var3];
			var0.field4915 += class297.field3606.method6082(var0.field4917, var0.field4915, var4, 0, var3);
			String var5 = class276.method5316(var4, 0, var3);
			var2 = var5;
		} catch (Exception var7) {
			var2 = "Cabbage";
		}

		return var2;
	}
}
