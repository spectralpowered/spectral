import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "es"
)
public class class467 extends class480 {
	@ObfInfo(
		owner = "es",
		name = "id",
		desc = "[[B"
	)
	static byte[][] field3882;
	@ObfInfo(
		owner = "es",
		name = "f",
		desc = "I"
	)
	static int field3880;
	@ObfInfo(
		owner = "es",
		name = "bg",
		desc = "Ljava/lang/String;"
	)
	static String field3879;
	@ObfInfo(
		owner = "es",
		name = "x",
		desc = "I"
	)
	int field3876;
	@ObfInfo(
		owner = "es",
		name = "e",
		desc = "I"
	)
	int field3877;
	@ObfInfo(
		owner = "es",
		name = "v",
		desc = "I"
	)
	int field3878;
	@ObfInfo(
		owner = "es",
		name = "h",
		desc = "I"
	)
	int field3881;
	// $FF: synthetic field
	@ObfInfo(
		owner = "es",
		name = "this$0",
		desc = "Lem;"
	)
	final class182 this$0;

	@ObfInfo(
		owner = "es",
		name = "<init>",
		desc = "(Lem;)V"
	)
	class467(class182 var1) {
		this.this$0 = var1;
		this.field3881 = -1;
	}

	@ObfInfo(
		owner = "es",
		name = "h",
		desc = "(Lqy;I)V"
	)
	void method2367(class127 var1) {
		this.field3881 = var1.method549();
		this.field3877 = var1.method595();
		this.field3878 = var1.method547();
		this.field3876 = var1.method547();
	}

	@ObfInfo(
		owner = "es",
		name = "e",
		desc = "(Lep;I)V"
	)
	void method2368(class429 var1) {
		var1.method2109(this.field3881, this.field3877, this.field3878, this.field3876);
	}
}
