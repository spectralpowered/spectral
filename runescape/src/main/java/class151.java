public class class151 extends class152 {
	static class93 field1450;
	static int field1447;
	int field1446;
	int field1449;
	// $FF: synthetic field
	final class143 this$0;

	static void method2669() {
		synchronized(class318.field3745) {
			if (0 == class318.field3744) {
				class309.field3685 = new Thread(new class318());
				class309.field3685.setDaemon(true);
				class309.field3685.start();
				class309.field3685.setPriority(5);
			}

			class318.field3744 = 600;
		}
	}

	class151(class143 var1) {
		this.this$0 = var1;
	}

	void method2674(class467 var1) {
		this.field1446 = var1.method8480();
		this.field1449 = var1.method8480();
	}

	void method2677(class146 var1) {
		var1.method2584(this.field1446, this.field1449);
	}
}
