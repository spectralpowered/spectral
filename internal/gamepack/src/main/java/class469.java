import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "og"
)
public class class469 extends class69 {
	@ObfInfo(
		owner = "og",
		name = "h",
		desc = "Loh;"
	)
	class90 field3887;
	@ObfInfo(
		owner = "og",
		name = "e",
		desc = "Loh;"
	)
	class90 field3888;

	@ObfInfo(
		owner = "og",
		name = "<init>",
		desc = "()V"
	)
	class469() {
		this.field3887 = class90.field766;
		this.field3888 = class90.field766;
	}

	@ObfInfo(
		owner = "og",
		name = "h",
		desc = "(B)V"
	)
	void method2295() {
		this.field3887 = class90.field766;
	}

	@ObfInfo(
		owner = "og",
		name = "v",
		desc = "(I)Z"
	)
	public final boolean method2290() {
		if (class90.field766 == this.field3887) {
			this.method2291();
		}

		return class90.field767 == this.field3887;
	}

	@ObfInfo(
		owner = "og",
		name = "x",
		desc = "(I)V"
	)
	void method2291() {
		this.field3887 = class240.field2021.field38.method1469(super.field3127) ? class90.field767 : class90.field768;
	}

	@ObfInfo(
		owner = "og",
		name = "m",
		desc = "(I)V"
	)
	void method2292() {
		this.field3888 = class90.field766;
	}

	@ObfInfo(
		owner = "og",
		name = "r",
		desc = "(B)Z"
	)
	public final boolean method2294() {
		if (class90.field766 == this.field3888) {
			this.method2293();
		}

		return this.field3888 == class90.field767;
	}

	@ObfInfo(
		owner = "og",
		name = "g",
		desc = "(B)V"
	)
	void method2293() {
		this.field3888 = class240.field2021.field39.method1469(super.field3127) ? class90.field767 : class90.field768;
	}
}
