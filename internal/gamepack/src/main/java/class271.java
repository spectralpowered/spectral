import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "hf"
)
public class class271 {
	@ObfInfo(
		owner = "hf",
		name = "q",
		desc = "I"
	)
	int field2233;
	@ObfInfo(
		owner = "hf",
		name = "e",
		desc = "I"
	)
	int field2234;
	@ObfInfo(
		owner = "hf",
		name = "v",
		desc = "I"
	)
	int field2235;
	@ObfInfo(
		owner = "hf",
		name = "x",
		desc = "I"
	)
	int field2236;
	@ObfInfo(
		owner = "hf",
		name = "m",
		desc = "I"
	)
	int field2237;
	@ObfInfo(
		owner = "hf",
		name = "h",
		desc = "I"
	)
	int field2238;

	@ObfInfo(
		owner = "hf",
		name = "<init>",
		desc = "(IIIIII)V"
	)
	class271(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2238 = var1;
		this.field2234 = var2;
		this.field2235 = var3;
		this.field2236 = var4;
		this.field2237 = var5;
		this.field2233 = var6;
	}

	@ObfInfo(
		owner = "hf",
		name = "e",
		desc = "(II)Lga;"
	)
	public static class242 method1277(int var0) {
		class242 var2 = (class242)class242.field2029.method394((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class242.field2027.method1365(12, var0);
			var2 = new class242();
			if (var3 != null) {
				var2.method1051(new class127(var3));
			}

			var2.method1052();
			class242.field2029.method396(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(
		owner = "hf",
		name = "id",
		desc = "(B)Lmq;"
	)
	public static class141 method1278() {
		return client.field295;
	}
}
