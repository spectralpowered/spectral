import io.spectralpowered.ObfInfo;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfInfo(
	name = "a"
)
public class class199 implements ThreadFactory {
	// $FF: synthetic field
	@ObfInfo(
		owner = "a",
		name = "this$0",
		desc = "Ln;"
	)
	final class19 this$0;
	@ObfInfo(
		owner = "a",
		name = "h",
		desc = "Ljava/lang/ThreadGroup;"
	)
	final ThreadGroup field1748;
	@ObfInfo(
		owner = "a",
		name = "e",
		desc = "Ljava/util/concurrent/atomic/AtomicInteger;"
	)
	final AtomicInteger field1747;

	@ObfInfo(
		owner = "a",
		name = "<init>",
		desc = "(Ln;)V"
	)
	class199(class19 var1) {
		this.this$0 = var1;
		this.field1747 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field1748 = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	@ObfInfo(
		owner = "a",
		name = "newThread",
		desc = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field1748, var1, this.this$0.field97 + "-rest-request-" + this.field1747.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfInfo(
		owner = "a",
		name = "e",
		desc = "(II)Llz;"
	)
	public static class353 method880(int var0) {
		class353[] var2 = class456.method2255();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class353 var4 = var2[var3];
			if (var4.field2903 == var0) {
				return var4;
			}
		}

		return null;
	}

	@ObfInfo(
		owner = "a",
		name = "ho",
		desc = "(IIB)V"
	)
	static void method879(int var0, int var1) {
		if (class50.field574.method2210() != 0 && var0 != -1) {
			class74.method323(class32.field176, var0, 0, class50.field574.method2210(), false);
			client.field477 = true;
		}

	}
}
