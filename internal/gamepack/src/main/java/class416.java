import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "eo"
)
public class class416 extends class480 {
	@ObfInfo(
		owner = "eo",
		name = "e",
		desc = "Ljava/lang/String;"
	)
	String field3427;
	@ObfInfo(
		owner = "eo",
		name = "h",
		desc = "J"
	)
	long field3428;
	// $FF: synthetic field
	@ObfInfo(
		owner = "eo",
		name = "this$0",
		desc = "Lem;"
	)
	final class182 this$0;

	@ObfInfo(
		owner = "eo",
		name = "<init>",
		desc = "(Lem;)V"
	)
	class416(class182 var1) {
		this.this$0 = var1;
		this.field3428 = -1L;
		this.field3427 = null;
	}

	@ObfInfo(
		owner = "eo",
		name = "h",
		desc = "(Lqy;I)V"
	)
	void method2367(class127 var1) {
		if (var1.method547() != 255) {
			--var1.field1070;
			this.field3428 = var1.method598();
		}

		this.field3427 = var1.method554();
	}

	@ObfInfo(
		owner = "eo",
		name = "e",
		desc = "(Lep;I)V"
	)
	void method2368(class429 var1) {
		var1.method2118(this.field3428, this.field3427, 0);
	}

	@ObfInfo(
		owner = "eo",
		name = "h",
		desc = "(Lly;Lly;I)I"
	)
	static int method2016(class274 var0, class274 var1) {
		int var3 = 0;
		String[] var4 = class359.field3065;

		int var5;
		String var6;
		for (var5 = 0; var5 < var4.length; ++var5) {
			var6 = var4[var5];
			if (var0.method1358(var6, "")) {
				++var3;
			}
		}

		var4 = class359.field3063;

		for (var5 = 0; var5 < var4.length; ++var5) {
			var6 = var4[var5];
			if (var1.method1358(var6, "")) {
				++var3;
			}
		}

		var4 = class359.field3083;

		for (var5 = 0; var5 < var4.length; ++var5) {
			var6 = var4[var5];
			if (var1.method1356(var6) != -1 && var1.method1358(var6, "")) {
				++var3;
			}
		}

		return var3;
	}
}
