import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ek"
)
public class class463 extends class480 {
	@ObfInfo(
		owner = "ek",
		name = "j",
		desc = "Z"
	)
	public static boolean field3847;
	@ObfInfo(
		owner = "ek",
		name = "q",
		desc = "I"
	)
	public static int field3848;
	@ObfInfo(
		owner = "ek",
		name = "jz",
		desc = "I"
	)
	static int field3850;
	@ObfInfo(
		owner = "ek",
		name = "h",
		desc = "Ljava/lang/String;"
	)
	String field3849;
	// $FF: synthetic field
	@ObfInfo(
		owner = "ek",
		name = "this$0",
		desc = "Lem;"
	)
	final class182 this$0;

	@ObfInfo(
		owner = "ek",
		name = "<init>",
		desc = "(Lem;)V"
	)
	class463(class182 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(
		owner = "ek",
		name = "h",
		desc = "(Lqy;I)V"
	)
	void method2367(class127 var1) {
		this.field3849 = var1.method555();
		var1.method595();
	}

	@ObfInfo(
		owner = "ek",
		name = "e",
		desc = "(Lep;I)V"
	)
	void method2368(class429 var1) {
		var1.field3548 = this.field3849;
	}

	@ObfInfo(
		owner = "ek",
		name = "s",
		desc = "(II)I"
	)
	public static int method2275(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
