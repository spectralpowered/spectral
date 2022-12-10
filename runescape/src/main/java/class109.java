import java.io.IOException;

public class class109 {
	boolean field1111;
	class266 field1107;
	class266 field1112;
	class266 field1113;
	class266 field1114;
	class360 field1109;
	class411 field1117;
	class466 field1106;
	class467 field1115;
	int field1101;
	int field1103;
	int field1108;
	int field1110;
	public class475 field1105;

	class109() {
		this.field1109 = new class360();
		this.field1103 = 0;
		this.field1115 = new class467(5000);
		this.field1106 = new class466(40000);
		this.field1107 = null;
		this.field1110 = 0;
		this.field1111 = true;
		this.field1101 = 0;
		this.field1108 = 0;
	}

	final void method2151() {
		this.field1109.method6661();
		this.field1103 = 0;
	}

	final void method2164() throws IOException {
		if (null != this.field1117 && this.field1103 > 0) {
			this.field1115.field4915 = 0;

			while (true) {
				class284 var2 = (class284)this.field1109.method6705();
				if (var2 == null || var2.field3320 > this.field1115.field4917.length - this.field1115.field4915) {
					this.field1117.method7605(this.field1115.field4917, 0, this.field1115.field4915);
					this.field1108 = 0;
					break;
				}

				this.field1115.method8319(var2.field3321.field4917, 0, var2.field3320);
				this.field1103 -= var2.field3320;
				var2.method7951();
				var2.field3321.method8308();
				var2.method5372();
			}
		}

	}

	public final void method2173(class284 var1) {
		this.field1109.method6672(var1);
		var1.field3320 = var1.field3321.field4915;
		var1.field3321.field4915 = 0;
		this.field1103 += var1.field3320;
	}

	void method2154(class411 var1) {
		this.field1117 = var1;
	}

	void method2155() {
		if (null != this.field1117) {
			this.field1117.method7609();
			this.field1117 = null;
		}

	}

	void method2156() {
		this.field1117 = null;
	}

	class411 method2157() {
		return this.field1117;
	}

	static final String method2171(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + class321.field3931 + "</col>" : "<col=00ff80>" + var0 / 1000000 + class321.field3929 + "</col>";
		}
	}
}
