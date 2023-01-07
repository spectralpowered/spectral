import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "el"
)
public class class113 extends class480 {
	@ObfInfo(
		owner = "el",
		name = "dh",
		desc = "Z"
	)
	static boolean field842;
	@ObfInfo(
		owner = "el",
		name = "lo",
		desc = "Lcj;"
	)
	static class380 field846;
	@ObfInfo(
		owner = "el",
		name = "tg",
		desc = "I"
	)
	static int field844;
	@ObfInfo(
		owner = "el",
		name = "fq",
		desc = "I"
	)
	static int field845;
	@ObfInfo(
		owner = "el",
		name = "h",
		desc = "I"
	)
	int field843;
	// $FF: synthetic field
	@ObfInfo(
		owner = "el",
		name = "this$0",
		desc = "Lem;"
	)
	final class182 this$0;

	@ObfInfo(
		owner = "el",
		name = "<init>",
		desc = "(Lem;)V"
	)
	class113(class182 var1) {
		this.this$0 = var1;
		this.field843 = -1;
	}

	@ObfInfo(
		owner = "el",
		name = "h",
		desc = "(Lqy;I)V"
	)
	void method2367(class127 var1) {
		this.field843 = var1.method549();
	}

	@ObfInfo(
		owner = "el",
		name = "e",
		desc = "(Lep;I)V"
	)
	void method2368(class429 var1) {
		var1.method2108(this.field843);
	}
}
