import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ov"
)
public class class368 implements Comparable {
	@ObfInfo(
		owner = "ov",
		name = "v",
		desc = "Lrp;"
	)
	class257 field3127;
	@ObfInfo(
		owner = "ov",
		name = "x",
		desc = "Lrp;"
	)
	class257 field3128;

	@ObfInfo(
		owner = "ov",
		name = "<init>",
		desc = "()V"
	)
	class368() {
	}

	@ObfInfo(
		owner = "ov",
		name = "au",
		desc = "(I)Lrp;"
	)
	public class257 method1817() {
		return this.field3127;
	}

	@ObfInfo(
		owner = "ov",
		name = "ar",
		desc = "(B)Ljava/lang/String;"
	)
	public String method1814() {
		return null == this.field3127 ? "" : this.field3127.method1101();
	}

	@ObfInfo(
		owner = "ov",
		name = "at",
		desc = "(B)Ljava/lang/String;"
	)
	public String method1818() {
		return this.field3128 == null ? "" : this.field3128.method1101();
	}

	@ObfInfo(
		owner = "ov",
		name = "ay",
		desc = "(Lrp;Lrp;I)V"
	)
	void method1815(class257 var1, class257 var2) {
		if (null == var1) {
			throw new NullPointerException();
		} else {
			this.field3127 = var1;
			this.field3128 = var2;
		}
	}

	@ObfInfo(
		owner = "ov",
		name = "e",
		desc = "(Lov;I)I"
	)
	public int method1816(class368 var1) {
		return this.field3127.method1104(var1.field3127);
	}

	@ObfInfo(
		owner = "ov",
		name = "compareTo",
		desc = "(Ljava/lang/Object;)I"
	)
	public int compareTo(Object var1) {
		return this.method1816((class368)var1);
	}
}
