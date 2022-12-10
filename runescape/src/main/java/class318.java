@Deprecated
public class class318 implements Runnable {
	public static class355 field3743;
	public static class355 field3746;
	static int field3744;
	static Object field3745;

	static {
		field3746 = new class355();
		field3743 = new class355();
		field3744 = 0;
		field3745 = new Object();
	}

	class318() {
	}

	static void method5256(int var0, class399 var1, class326 var2) {
		class332 var4 = new class332();
		var4.field4182 = 1;
		var4.field4773 = (long)var0;
		var4.field4181 = var1;
		var4.field4179 = var2;
		synchronized(field3746) {
			field3746.method6572(var4);
		}

		class151.method2669();
	}

	public void run() {
		try {
			while (true) {
				class332 var1;
				synchronized(field3746) {
					var1 = (class332)field3746.method6577();
				}

				if (var1 != null) {
					if (0 == var1.field4182) {
						var1.field4181.method7411((int)var1.field4773, var1.field4180, var1.field4180.length);
						synchronized(field3746) {
							var1.method7951();
						}
					} else if (var1.field4182 == 1) {
						var1.field4180 = var1.field4181.method7400((int)var1.field4773);
						synchronized(field3746) {
							field3743.method6572(var1);
						}
					}

					synchronized(field3745) {
						if (field3744 <= 1) {
							field3744 = 0;
							field3745.notifyAll();
							return;
						}

						field3744 = 600;
					}
				} else {
					class261.method115(100L);
					synchronized(field3745) {
						if (field3744 <= 1) {
							field3744 = 0;
							field3745.notifyAll();
							return;
						}

						--field3744;
					}
				}
			}
		} catch (Exception var13) {
			class150.method2660((String)null, var13);
		}
	}
}
