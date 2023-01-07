import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "eu"
)
public class class312 extends class480 {
	@ObfInfo(
		owner = "eu",
		name = "a",
		desc = "Lco;"
	)
	static class397 field2467;
	@ObfInfo(
		owner = "eu",
		name = "hk",
		desc = "I"
	)
	static int field2465;
	@ObfInfo(
		owner = "eu",
		name = "h",
		desc = "I"
	)
	int field2464;
	@ObfInfo(
		owner = "eu",
		name = "e",
		desc = "I"
	)
	int field2466;
	// $FF: synthetic field
	@ObfInfo(
		owner = "eu",
		name = "this$0",
		desc = "Lem;"
	)
	final class182 this$0;

	@ObfInfo(
		owner = "eu",
		name = "<init>",
		desc = "(Lem;)V"
	)
	class312(class182 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(
		owner = "eu",
		name = "h",
		desc = "(Lqy;I)V"
	)
	void method2367(class127 var1) {
		this.field2464 = var1.method595();
		this.field2466 = var1.method595();
	}

	@ObfInfo(
		owner = "eu",
		name = "e",
		desc = "(Lep;I)V"
	)
	void method2368(class429 var1) {
		var1.method2110(this.field2464, this.field2466);
	}

	@ObfInfo(
		owner = "eu",
		name = "e",
		desc = "(B)V"
	)
	static void method1506() {
		synchronized(class254.field2093) {
			if (0 == class254.field2092) {
				class53.field577 = new Thread(new class254());
				class53.field577.setDaemon(true);
				class53.field577.start();
				class53.field577.setPriority(5);
			}

			class254.field2092 = 600;
		}
	}

	@ObfInfo(
		owner = "eu",
		name = "m",
		desc = "(B)V"
	)
	public static void method1505() {
		class179.field1647.method395();
	}

	@ObfInfo(
		owner = "eu",
		name = "gb",
		desc = "(B)J"
	)
	static long method1507() {
		return client.field350;
	}
}
