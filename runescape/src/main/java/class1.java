import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class1 implements ThreadFactory {
	// $FF: synthetic field
	final class14 this$0;
	final ThreadGroup field2;
	final AtomicInteger field1;

	public static class338 method5(int var0) {
		class338[] var2 = class338.method2516();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class338 var4 = var2[var3];
			if (var4.field4254 == var0) {
				return var4;
			}
		}

		return null;
	}

	class1(class14 var1) {
		this.this$0 = var1;
		this.field1 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field2 = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field2, var1, this.this$0.field84 + "-rest-request-" + this.field1.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	static void method4(int var0, int var1) {
		if (class186.field2040.method1787() != 0 && var0 != -1) {
			class300.method502(class16.field98, var0, 0, class186.field2040.method1787(), false);
			client.field1946 = true;
		}

	}
}
