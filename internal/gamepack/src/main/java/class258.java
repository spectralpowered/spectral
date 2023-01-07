import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "mg"
)
public class class258 {
	@ObfInfo(
		owner = "mg",
		name = "m",
		desc = "Ljava/lang/String;"
	)
	String field2104;
	@ObfInfo(
		owner = "mg",
		name = "x",
		desc = "Ljava/lang/String;"
	)
	String field2107;
	@ObfInfo(
		owner = "mg",
		name = "v",
		desc = "Lmz;"
	)
	public final class324 field2108;
	@ObfInfo(
		owner = "mg",
		name = "h",
		desc = "I"
	)
	public final int field2106;
	@ObfInfo(
		owner = "mg",
		name = "e",
		desc = "J"
	)
	public final long field2105;

	@ObfInfo(
		owner = "mg",
		name = "<init>",
		desc = "(Lqy;BI)V"
	)
	class258(class127 var1, byte var2, int var3) {
		this.field2107 = var1.method555();
		this.field2104 = var1.method555();
		this.field2106 = var1.method549();
		this.field2105 = var1.method598();
		int var4 = var1.method595();
		int var5 = var1.method595();
		this.field2108 = new class324();
		this.field2108.method1659(2);
		this.field2108.method1657(var2);
		this.field2108.field2568 = var4;
		this.field2108.field2569 = var5;
		this.field2108.field2571 = 0;
		this.field2108.field2566 = 0;
		this.field2108.field2567 = var3;
	}

	@ObfInfo(
		owner = "mg",
		name = "h",
		desc = "(I)Ljava/lang/String;"
	)
	public String method1107() {
		return this.field2107;
	}

	@ObfInfo(
		owner = "mg",
		name = "e",
		desc = "(B)Ljava/lang/String;"
	)
	public String method1106() {
		return this.field2104;
	}

	@ObfInfo(
		owner = "mg",
		name = "h",
		desc = "(I)V"
	)
	static void method1105() {
		class71.field637 = 99;
		class71.field638 = new short[4][104][104];
		class419.field3433 = new short[4][104][104];
		class71.field643 = new byte[4][104][104];
		class471.field3958 = new byte[4][104][104];
		class210.field1819 = new int[4][105][105];
		class36.field182 = new byte[4][105][105];
		class71.field640 = new int[105][105];
		class71.field641 = new int[104];
		class233.field1986 = new int[104];
		class71.field648 = new int[104];
		class267.field2214 = new int[104];
		class365.field3099 = new int[104];
	}
}
