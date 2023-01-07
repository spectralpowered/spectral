import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "fo"
)
public class class210 extends class410 {
	@ObfInfo(
		owner = "fo",
		name = "n",
		desc = "[[[I"
	)
	static int[][][] field1819;
	@ObfInfo(
		owner = "fo",
		name = "e",
		desc = "B"
	)
	byte field1816;
	@ObfInfo(
		owner = "fo",
		name = "v",
		desc = "B"
	)
	byte field1818;
	@ObfInfo(
		owner = "fo",
		name = "h",
		desc = "Ljava/lang/String;"
	)
	String field1817;
	// $FF: synthetic field
	@ObfInfo(
		owner = "fo",
		name = "this$0",
		desc = "Led;"
	)
	final class302 this$0;

	@ObfInfo(
		owner = "fo",
		name = "<init>",
		desc = "(Led;)V"
	)
	class210(class302 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(
		owner = "fo",
		name = "h",
		desc = "(Lqy;I)V"
	)
	void method2007(class127 var1) {
		this.field1817 = var1.method554();
		if (this.field1817 != null) {
			var1.method547();
			this.field1816 = var1.method548();
			this.field1818 = var1.method548();
		}

	}

	@ObfInfo(
		owner = "fo",
		name = "e",
		desc = "(Lfn;I)V"
	)
	void method2008(class57 var1) {
		var1.field592 = this.field1817;
		if (null != this.field1817) {
			var1.field593 = this.field1816;
			var1.field595 = this.field1818;
		}

	}

	@ObfInfo(
		owner = "fo",
		name = "v",
		desc = "(IIII)I"
	)
	public static int method912(int var0, int var1, int var2) {
		int var4 = class334.method1681(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	@ObfInfo(
		owner = "fo",
		name = "q",
		desc = "(I)Z"
	)
	public static boolean method911() {
		return class40.field201 != 0 ? true : class230.field1943.method2406();
	}

	@ObfInfo(
		owner = "fo",
		name = "l",
		desc = "(Ljava/lang/String;II)V"
	)
	static final void method910(String var0, int var1) {
		class299 var3 = class480.method2370(class356.field2972, client.field279.field4042);
		var3.field2403.method544(class319.method1614(var0) + 1);
		var3.field2403.method566(var1);
		var3.field2403.method538(var0, (byte)67);
		client.field279.method2389(var3);
	}
}
