public class class144 extends class139 {
	byte field1382;
	int field1380;
	String field1381;
	// $FF: synthetic field
	final class134 this$0;

	class144(class134 var1) {
		this.this$0 = var1;
		this.field1381 = null;
	}

	void method2518(class467 var1) {
		if (var1.method8326() != 255) {
			--var1.field4915;
			var1.method8492();
		}

		this.field1381 = var1.method8334();
		this.field1380 = var1.method8328();
		this.field1382 = var1.method8327();
		var1.method8492();
	}

	void method2519(class170 var1) {
		class135 var3 = new class135();
		var3.field1327 = new class483(this.field1381);
		var3.field1329 = this.field1380;
		var3.field1330 = this.field1382;
		var1.method2896(var3);
	}

	public static boolean method2560(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
