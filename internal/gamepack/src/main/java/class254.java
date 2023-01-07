import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "lf"
)
public class class254 implements Runnable {
	@ObfInfo(
		owner = "lf",
		name = "e",
		desc = "Lmq;"
	)
	public static class141 field2091;
	@ObfInfo(
		owner = "lf",
		name = "h",
		desc = "Lmq;"
	)
	public static class141 field2094;
	@ObfInfo(
		owner = "lf",
		name = "v",
		desc = "I"
	)
	static int field2092;
	@ObfInfo(
		owner = "lf",
		name = "x",
		desc = "Ljava/lang/Object;"
	)
	static Object field2093;

	static {
		field2094 = new class141();
		field2091 = new class141();
		field2092 = 0;
		field2093 = new Object();
	}

	@ObfInfo(
		owner = "lf",
		name = "<init>",
		desc = "()V"
	)
	class254() {
	}

	@ObfInfo(
		owner = "lf",
		name = "run",
		desc = "()V"
	)
	public void run() {
		try {
			while (true) {
				class42 var1;
				synchronized(field2094) {
					var1 = (class42)field2094.method646();
				}

				if (var1 != null) {
					if (0 == var1.field525) {
						var1.field524.method95((int)var1.field1134, var1.field523, var1.field523.length);
						synchronized(field2094) {
							var1.method637();
						}
					} else if (var1.field525 == 1) {
						var1.field523 = var1.field524.method93((int)var1.field1134);
						synchronized(field2094) {
							field2091.method642(var1);
						}
					}

					synchronized(field2093) {
						if (field2092 <= 1) {
							field2092 = 0;
							field2093.notifyAll();
							return;
						}

						field2092 = 600;
					}
				} else {
					class286.method1421(100L);
					synchronized(field2093) {
						if (field2092 <= 1) {
							field2092 = 0;
							field2093.notifyAll();
							return;
						}

						--field2092;
					}
				}
			}
		} catch (Exception var13) {
			class445.method2199((String)null, var13);
		}
	}
}
