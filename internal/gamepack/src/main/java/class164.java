import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "fj"
)
public class class164 extends class195 {
	@ObfInfo(
		owner = "fj",
		name = "h",
		desc = "Lly;"
	)
	public static class274 field1239;
	@ObfInfo(
		owner = "fj",
		name = "e",
		desc = "Lly;"
	)
	public static class274 field1247;
	@ObfInfo(
		owner = "fj",
		name = "vy",
		desc = "Lpb;"
	)
	static class272 field1249;
	@ObfInfo(
		owner = "fj",
		name = "x",
		desc = "Ljv;"
	)
	static class99 field1240;
	@ObfInfo(
		owner = "fj",
		name = "q",
		desc = "[I"
	)
	int[] field1242;
	@ObfInfo(
		owner = "fj",
		name = "j",
		desc = "[I"
	)
	int[] field1243;
	@ObfInfo(
		owner = "fj",
		name = "r",
		desc = "[S"
	)
	short[] field1238;
	@ObfInfo(
		owner = "fj",
		name = "f",
		desc = "[S"
	)
	short[] field1244;
	@ObfInfo(
		owner = "fj",
		name = "u",
		desc = "[S"
	)
	short[] field1245;
	@ObfInfo(
		owner = "fj",
		name = "b",
		desc = "[S"
	)
	short[] field1246;
	@ObfInfo(
		owner = "fj",
		name = "g",
		desc = "Z"
	)
	public boolean field1248;
	@ObfInfo(
		owner = "fj",
		name = "m",
		desc = "I"
	)
	public int field1241;

	static {
		field1240 = new class99(64);
	}

	@ObfInfo(
		owner = "fj",
		name = "<init>",
		desc = "()V"
	)
	class164() {
		this.field1241 = -1;
		this.field1243 = new int[]{-1, -1, -1, -1, -1};
		this.field1248 = false;
	}

	@ObfInfo(
		owner = "fj",
		name = "e",
		desc = "(Lqy;B)V"
	)
	void method768(class127 var1) {
		while (true) {
			int var3 = var1.method547();
			if (var3 == 0) {
				return;
			}

			this.method764(var1, var3);
		}
	}

	@ObfInfo(
		owner = "fj",
		name = "v",
		desc = "(Lqy;IB)V"
	)
	void method764(class127 var1, int var2) {
		if (var2 == 1) {
			this.field1241 = var1.method547();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.method547();
				this.field1242 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1242[var5] = var1.method549();
				}
			} else if (var2 == 3) {
				this.field1248 = true;
			} else if (var2 == 40) {
				var4 = var1.method547();
				this.field1244 = new short[var4];
				this.field1238 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1244[var5] = (short)var1.method549();
					this.field1238[var5] = (short)var1.method549();
				}
			} else if (var2 == 41) {
				var4 = var1.method547();
				this.field1245 = new short[var4];
				this.field1246 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1245[var5] = (short)var1.method549();
					this.field1246[var5] = (short)var1.method549();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.field1243[var2 - 60] = var1.method549();
			}
		}

	}

	@ObfInfo(
		owner = "fj",
		name = "x",
		desc = "(I)Z"
	)
	public boolean method770() {
		if (null == this.field1242) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field1242.length; ++var3) {
				if (!field1247.method1363(this.field1242[var3], 0)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	@ObfInfo(
		owner = "fj",
		name = "m",
		desc = "(B)Lgi;"
	)
	public class26 method769() {
		if (null == this.field1242) {
			return null;
		} else {
			class26[] var2 = new class26[this.field1242.length];

			for (int var3 = 0; var3 < this.field1242.length; ++var3) {
				var2[var3] = class26.method103(field1247, this.field1242[var3], 0);
			}

			class26 var5;
			if (1 == var2.length) {
				var5 = var2[0];
			} else {
				var5 = new class26(var2, var2.length);
			}

			int var4;
			if (null != this.field1244) {
				for (var4 = 0; var4 < this.field1244.length; ++var4) {
					var5.method113(this.field1244[var4], this.field1238[var4]);
				}
			}

			if (null != this.field1245) {
				for (var4 = 0; var4 < this.field1245.length; ++var4) {
					var5.method114(this.field1245[var4], this.field1246[var4]);
				}
			}

			return var5;
		}
	}

	@ObfInfo(
		owner = "fj",
		name = "q",
		desc = "(B)Z"
	)
	public boolean method766() {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.field1243[var3] != -1 && !field1247.method1363(this.field1243[var3], 0)) {
				var2 = false;
			}
		}

		return var2;
	}

	@ObfInfo(
		owner = "fj",
		name = "f",
		desc = "(I)Lgi;"
	)
	public class26 method767() {
		class26[] var2 = new class26[5];
		int var3 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field1243[var4] != -1) {
				var2[var3++] = class26.method103(field1247, this.field1243[var4], 0);
			}
		}

		class26 var6 = new class26(var2, var3);
		int var5;
		if (null != this.field1244) {
			for (var5 = 0; var5 < this.field1244.length; ++var5) {
				var6.method113(this.field1244[var5], this.field1238[var5]);
			}
		}

		if (null != this.field1245) {
			for (var5 = 0; var5 < this.field1245.length; ++var5) {
				var6.method114(this.field1245[var5], this.field1246[var5]);
			}
		}

		return var6;
	}

	@ObfInfo(
		owner = "fj",
		name = "h",
		desc = "(ILjava/lang/String;Ljava/lang/String;I)V"
	)
	static void method765(int var0, String var1, String var2) {
		class65.method296(var0, var1, var2, (String)null);
	}
}
