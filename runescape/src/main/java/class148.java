public class class148 extends class139 {
	static int field1427;
	byte field1426;
	int field1423;
	int field1425;
	String field1424;
	// $FF: synthetic field
	final class134 this$0;

	class148(class134 var1) {
		this.this$0 = var1;
		this.field1423 = -1;
	}

	void method2518(class467 var1) {
		this.field1423 = var1.method8328();
		this.field1426 = var1.method8327();
		this.field1425 = var1.method8328();
		var1.method8492();
		this.field1424 = var1.method8335();
	}

	void method2519(class170 var1) {
		class135 var3 = (class135)var1.field1614.get(this.field1423);
		var3.field1330 = this.field1426;
		var3.field1329 = this.field1425;
		var3.field1327 = new class483(this.field1424);
	}
}
