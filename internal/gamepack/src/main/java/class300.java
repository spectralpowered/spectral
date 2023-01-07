import io.spectralpowered.ObfInfo;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfInfo(
	name = "fp"
)
public class class300 implements Runnable {
	@ObfInfo(
		owner = "fp",
		name = "e",
		desc = "Ljava/lang/String;"
	)
	public static String field2406;
	@ObfInfo(
		owner = "fp",
		name = "h",
		desc = "Ljava/lang/String;"
	)
	public static String field2408;
	@ObfInfo(
		owner = "fp",
		name = "ha",
		desc = "Ldl;"
	)
	static class434 field2410;
	@ObfInfo(
		owner = "fp",
		name = "q",
		desc = "Z"
	)
	boolean field2411;
	@ObfInfo(
		owner = "fp",
		name = "x",
		desc = "Lfl;"
	)
	class92 field2407;
	@ObfInfo(
		owner = "fp",
		name = "v",
		desc = "Lfl;"
	)
	class92 field2412;
	@ObfInfo(
		owner = "fp",
		name = "m",
		desc = "Ljava/lang/Thread;"
	)
	Thread field2409;

	@ObfInfo(
		owner = "fp",
		name = "<init>",
		desc = "()V"
	)
	public class300() {
		this.field2412 = null;
		this.field2407 = null;
		this.field2411 = false;
		field2408 = "Unknown";
		field2406 = "1.6";

		try {
			field2408 = System.getProperty("java.vendor");
			field2406 = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.field2411 = false;
		this.field2409 = new Thread(this);
		this.field2409.setPriority(10);
		this.field2409.setDaemon(true);
		this.field2409.start();
	}

	@ObfInfo(
		owner = "fp",
		name = "h",
		desc = "(I)V"
	)
	public final void method1447() {
		synchronized(this) {
			this.field2411 = true;
			this.notifyAll();
		}

		try {
			this.field2409.join();
		} catch (InterruptedException var4) {
		}

	}

	@ObfInfo(
		owner = "fp",
		name = "run",
		desc = "()V"
	)
	public final void run() {
		while (true) {
			class92 var1;
			synchronized(this) {
				while (true) {
					if (this.field2411) {
						return;
					}

					if (null != this.field2412) {
						var1 = this.field2412;
						this.field2412 = this.field2412.field776;
						if (this.field2412 == null) {
							this.field2407 = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.field774;
				if (var5 == 1) {
					var1.field779 = new Socket(InetAddress.getByName((String)var1.field778), var1.field777);
				} else if (var5 == 2) {
					Thread var3 = new Thread((Runnable)var1.field778);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.field777);
					var1.field779 = var3;
				} else if (var5 == 4) {
					var1.field779 = new DataInputStream(((URL)var1.field778).openStream());
				}

				var1.field775 = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.field775 = 2;
			}
		}
	}

	@ObfInfo(
		owner = "fp",
		name = "e",
		desc = "(IIILjava/lang/Object;B)Lfl;"
	)
	final class92 method1450(int var1, int var2, int var3, Object var4) {
		class92 var6 = new class92();
		var6.field774 = var1;
		var6.field777 = var2;
		var6.field778 = var4;
		synchronized(this) {
			if (this.field2407 != null) {
				this.field2407.field776 = var6;
				this.field2407 = var6;
			} else {
				this.field2407 = this.field2412 = var6;
			}

			this.notify();
			return var6;
		}
	}

	@ObfInfo(
		owner = "fp",
		name = "v",
		desc = "(Ljava/lang/String;IB)Lfl;"
	)
	public final class92 method1448(String var1, int var2) {
		return this.method1450(1, var2, 0, var1);
	}

	@ObfInfo(
		owner = "fp",
		name = "x",
		desc = "(Ljava/lang/Runnable;IS)Lfl;"
	)
	public final class92 method1449(Runnable var1, int var2) {
		return this.method1450(2, var2, 0, var1);
	}

	@ObfInfo(
		owner = "fp",
		name = "k",
		desc = "(Ljava/lang/CharSequence;B)Ljava/lang/String;"
	)
	public static String method1453(CharSequence var0) {
		return class431.method2126('*', var0.length());
	}

	@ObfInfo(
		owner = "fp",
		name = "n",
		desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
	)
	static void method1452(String var0, String var1, String var2) {
		class359.field3051 = var0;
		class359.field3064 = var1;
		class359.field3084 = var2;
	}

	@ObfInfo(
		owner = "fp",
		name = "mf",
		desc = "(I)Z"
	)
	public static boolean method1451() {
		return client.field481 >= 2;
	}
}
