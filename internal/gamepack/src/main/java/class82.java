import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "af"
)
public class class82 extends class490 {
	@ObfInfo(
		owner = "af",
		name = "x",
		desc = "I"
	)
	int field667;
	@ObfInfo(
		owner = "af",
		name = "m",
		desc = "Z"
	)
	public boolean field671;
	@ObfInfo(
		owner = "af",
		name = "e",
		desc = "[B"
	)
	public byte[] field668;
	@ObfInfo(
		owner = "af",
		name = "v",
		desc = "I"
	)
	public int field669;
	@ObfInfo(
		owner = "af",
		name = "h",
		desc = "I"
	)
	public int field670;

	@ObfInfo(
		owner = "af",
		name = "<init>",
		desc = "(I[BII)V"
	)
	class82(int var1, byte[] var2, int var3, int var4) {
		this.field670 = var1;
		this.field668 = var2;
		this.field669 = var3;
		this.field667 = var4;
	}

	@ObfInfo(
		owner = "af",
		name = "<init>",
		desc = "(I[BIIZ)V"
	)
	class82(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.field670 = var1;
		this.field668 = var2;
		this.field669 = var3;
		this.field667 = var4;
		this.field671 = var5;
	}

	@ObfInfo(
		owner = "af",
		name = "h",
		desc = "(Lby;)Laf;"
	)
	public class82 method339(class129 var1) {
		this.field668 = var1.method614(this.field668);
		this.field670 = var1.method613(this.field670);
		if (this.field669 == this.field667) {
			this.field669 = this.field667 = var1.method612(this.field669);
		} else {
			this.field669 = var1.method612(this.field669);
			this.field667 = var1.method612(this.field667);
			if (this.field669 == this.field667) {
				--this.field669;
			}
		}

		return this;
	}
}
