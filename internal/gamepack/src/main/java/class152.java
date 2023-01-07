import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "bv"
)
public class class152 extends class195 {
	@ObfInfo(
		owner = "bv",
		name = "m",
		desc = "Lrp;"
	)
	class257 field1185;
	@ObfInfo(
		owner = "bv",
		name = "q",
		desc = "Loh;"
	)
	class90 field1181;
	@ObfInfo(
		owner = "bv",
		name = "f",
		desc = "Loh;"
	)
	class90 field1182;
	@ObfInfo(
		owner = "bv",
		name = "v",
		desc = "I"
	)
	int field1183;
	@ObfInfo(
		owner = "bv",
		name = "h",
		desc = "I"
	)
	int field1184;
	@ObfInfo(
		owner = "bv",
		name = "e",
		desc = "I"
	)
	int field1189;
	@ObfInfo(
		owner = "bv",
		name = "x",
		desc = "Ljava/lang/String;"
	)
	String field1186;
	@ObfInfo(
		owner = "bv",
		name = "r",
		desc = "Ljava/lang/String;"
	)
	String field1187;
	@ObfInfo(
		owner = "bv",
		name = "u",
		desc = "Ljava/lang/String;"
	)
	String field1188;

	@ObfInfo(
		owner = "bv",
		name = "<init>",
		desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class152(int var1, String var2, String var3, String var4) {
		this.field1181 = class90.field766;
		this.field1182 = class90.field766;
		this.method709(var1, var2, var3, var4);
	}

	@ObfInfo(
		owner = "bv",
		name = "h",
		desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
	)
	void method709(int var1, String var2, String var3, String var4) {
		int var6 = ++class100.field794 - 1;
		this.field1184 = var6;
		this.field1189 = client.field231;
		this.field1183 = var1;
		this.field1186 = var2;
		this.method708();
		this.field1187 = var3;
		this.field1188 = var4;
		this.method710();
		this.method705();
	}

	@ObfInfo(
		owner = "bv",
		name = "e",
		desc = "(B)V"
	)
	void method710() {
		this.field1181 = class90.field766;
	}

	@ObfInfo(
		owner = "bv",
		name = "v",
		desc = "(B)Z"
	)
	final boolean method703() {
		if (this.field1181 == class90.field766) {
			this.method704();
		}

		return this.field1181 == class90.field767;
	}

	@ObfInfo(
		owner = "bv",
		name = "x",
		desc = "(I)V"
	)
	void method704() {
		this.field1181 = class240.field2021.field38.method1469(this.field1185) ? class90.field767 : class90.field768;
	}

	@ObfInfo(
		owner = "bv",
		name = "m",
		desc = "(B)V"
	)
	void method705() {
		this.field1182 = class90.field766;
	}

	@ObfInfo(
		owner = "bv",
		name = "q",
		desc = "(I)Z"
	)
	final boolean method706() {
		if (this.field1182 == class90.field766) {
			this.method707();
		}

		return this.field1182 == class90.field767;
	}

	@ObfInfo(
		owner = "bv",
		name = "f",
		desc = "(B)V"
	)
	void method707() {
		this.field1182 = class240.field2021.field39.method1469(this.field1185) ? class90.field767 : class90.field768;
	}

	@ObfInfo(
		owner = "bv",
		name = "r",
		desc = "(I)V"
	)
	final void method708() {
		if (null != this.field1186) {
			this.field1185 = new class257(class196.method871(this.field1186), class63.field619);
		} else {
			this.field1185 = null;
		}

	}

	@ObfInfo(
		owner = "bv",
		name = "h",
		desc = "(B)J"
	)
	public static final synchronized long method711() {
		long var1 = System.currentTimeMillis();
		if (var1 < class148.field1165) {
			class196.field1738 += class148.field1165 - var1;
		}

		class148.field1165 = var1;
		return class196.field1738 + var1;
	}

	@ObfInfo(
		owner = "bv",
		name = "hg",
		desc = "(B)I"
	)
	static int method713() {
		return client.field453 ? 2 : 1;
	}

	@ObfInfo(
		owner = "bv",
		name = "aw",
		desc = "(ILbm;ZI)I"
	)
	static int method712(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.LC_NAME) {
			int var4 = class386.field3248[--class161.field1227];
			class87 var5 = class85.method356(var4);
			class386.field3249[++class386.field3250 - 1] = var5 != null ? var5.field715 : "";
			return 1;
		} else {
			return 2;
		}
	}
}
