public class class136 extends class152 {
	static class386 field1339;
	static class401 field1337;
	int field1335;
	String field1334;
	long field1341;
	// $FF: synthetic field
	final class143 this$0;

	class136(class143 var1) {
		this.this$0 = var1;
		this.field1341 = -1L;
		this.field1334 = null;
		this.field1335 = 0;
	}

	void method2674(class467 var1) {
		if (var1.method8326() != 255) {
			--var1.field4915;
			this.field1341 = var1.method8492();
		}

		this.field1334 = var1.method8334();
		this.field1335 = var1.method8328();
	}

	void method2677(class146 var1) {
		var1.method2615(this.field1341, this.field1334, this.field1335);
	}
}
