import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class172 implements Runnable {
	public static String field1620;
	public static String field1623;
	static class116 field1625;
	boolean field1626;
	class168 field1622;
	class168 field1627;
	Thread field1624;

	public class172() {
		this.field1627 = null;
		this.field1622 = null;
		this.field1626 = false;
		field1623 = "Unknown";
		field1620 = "1.6";

		try {
			field1623 = System.getProperty("java.vendor");
			field1620 = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.field1626 = false;
		this.field1624 = new Thread(this);
		this.field1624.setPriority(10);
		this.field1624.setDaemon(true);
		this.field1624.start();
	}

	public final void method2909() {
		synchronized(this) {
			this.field1626 = true;
			this.notifyAll();
		}

		try {
			this.field1624.join();
		} catch (InterruptedException var4) {
		}

	}

	public final void run() {
		while (true) {
			class168 var1;
			synchronized(this) {
				while (true) {
					if (this.field1626) {
						return;
					}

					if (null != this.field1627) {
						var1 = this.field1627;
						this.field1627 = this.field1627.field1570;
						if (this.field1627 == null) {
							this.field1622 = null;
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
				int var5 = var1.field1566;
				if (var5 == 1) {
					var1.field1573 = new Socket(InetAddress.getByName((String)var1.field1572), var1.field1571);
				} else if (var5 == 2) {
					Thread var3 = new Thread((Runnable)var1.field1572);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.field1571);
					var1.field1573 = var3;
				} else if (var5 == 4) {
					var1.field1573 = new DataInputStream(((URL)var1.field1572).openStream());
				}

				var1.field1569 = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.field1569 = 2;
			}
		}
	}

	final class168 method2917(int var1, int var2, int var3, Object var4) {
		class168 var6 = new class168();
		var6.field1566 = var1;
		var6.field1571 = var2;
		var6.field1572 = var4;
		synchronized(this) {
			if (this.field1622 != null) {
				this.field1622.field1570 = var6;
				this.field1622 = var6;
			} else {
				this.field1622 = this.field1627 = var6;
			}

			this.notify();
			return var6;
		}
	}

	public final class168 method2912(String var1, int var2) {
		return this.method2917(1, var2, 0, var1);
	}

	public final class168 method2913(Runnable var1, int var2) {
		return this.method2917(2, var2, 0, var1);
	}

	public static boolean method2923() {
		return client.field1950 >= 2;
	}
}
