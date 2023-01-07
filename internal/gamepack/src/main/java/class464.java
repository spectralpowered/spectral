import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ky"
)
public class class464 {
	@ObfInfo(
		owner = "ky",
		name = "ju",
		desc = "[Lra;"
	)
	static class344[] field3854;
	@ObfInfo(
		owner = "ky",
		name = "h",
		desc = "I"
	)
	public int field3851;
	@ObfInfo(
		owner = "ky",
		name = "e",
		desc = "I"
	)
	public int field3852;
	@ObfInfo(
		owner = "ky",
		name = "v",
		desc = "I"
	)
	public int field3853;

	@ObfInfo(
		owner = "ky",
		name = "<init>",
		desc = "(III)V"
	)
	public class464(int var1, int var2, int var3) {
		this.field3851 = var1;
		this.field3852 = var2;
		this.field3853 = var3;
	}

	@ObfInfo(
		owner = "ky",
		name = "<init>",
		desc = "(Lky;)V"
	)
	public class464(class464 var1) {
		this.field3851 = var1.field3851;
		this.field3852 = var1.field3852;
		this.field3853 = var1.field3853;
	}

	@ObfInfo(
		owner = "ky",
		name = "<init>",
		desc = "(I)V"
	)
	public class464(int var1) {
		if (var1 == -1) {
			this.field3851 = -1;
		} else {
			this.field3851 = var1 >> 28 & 3;
			this.field3852 = var1 >> 14 & 16383;
			this.field3853 = var1 & 16383;
		}

	}

	@ObfInfo(
		owner = "ky",
		name = "h",
		desc = "(B)I"
	)
	public int method2278() {
		return class261.method1114(this.field3851, this.field3852, this.field3853);
	}

	@ObfInfo(
		owner = "ky",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else {
			return !(var1 instanceof class464) ? false : this.method2277((class464)var1);
		}
	}

	@ObfInfo(
		owner = "ky",
		name = "v",
		desc = "(Lky;I)Z"
	)
	boolean method2277(class464 var1) {
		if (this.field3851 != var1.field3851) {
			return false;
		} else if (this.field3852 != var1.field3852) {
			return false;
		} else {
			return this.field3853 == var1.field3853;
		}
	}

	@ObfInfo(
		owner = "ky",
		name = "hashCode",
		desc = "()I"
	)
	public int hashCode() {
		return this.method2278();
	}

	@ObfInfo(
		owner = "ky",
		name = "toString",
		desc = "()Ljava/lang/String;"
	)
	public String toString() {
		return this.method2279(",");
	}

	@ObfInfo(
		owner = "ky",
		name = "x",
		desc = "(Ljava/lang/String;B)Ljava/lang/String;"
	)
	String method2279(String var1) {
		return this.field3851 + var1 + (this.field3852 >> 6) + var1 + (this.field3853 >> 6) + var1 + (this.field3852 & 63) + var1 + (this.field3853 & 63);
	}
}
