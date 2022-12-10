public class class255 implements class257 {
	int field2981;
	int field2982;
	int field2983;
	int field2984;
	int field2985;
	int field2986;
	int field2987;
	int field2988;
	int field2989;
	int field2990;

	class255() {
	}

	public static boolean method5066(int var0) {
		return (var0 >> 30 & 1) != 0;
	}

	public void method5078(class254 var1) {
		if (var1.field2971 > this.field2987) {
			var1.field2971 = this.field2987;
		}

		if (var1.field2972 < this.field2983) {
			var1.field2972 = this.field2983;
		}

		if (var1.field2967 > this.field2986) {
			var1.field2967 = this.field2986;
		}

		if (var1.field2974 < this.field2990) {
			var1.field2974 = this.field2990;
		}

	}

	public boolean method5071(int var1, int var2, int var3) {
		if (var1 >= this.field2984 && var1 < this.field2982 + this.field2984) {
			return var2 >> 6 >= this.field2981 && var2 >> 6 <= this.field2985 && var3 >> 6 >= this.field2988 && var3 >> 6 <= this.field2989;
		} else {
			return false;
		}
	}

	public boolean method5070(int var1, int var2) {
		return var1 >> 6 >= this.field2987 && var1 >> 6 <= this.field2983 && var2 >> 6 >= this.field2986 && var2 >> 6 <= this.field2990;
	}

	public int[] method5073(int var1, int var2, int var3) {
		if (!this.method5071(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2987 * 64 - this.field2981 * 64 + var2, var3 + (this.field2986 * 64 - this.field2988 * 64)};
			return var5;
		}
	}

	public class311 method5076(int var1, int var2) {
		if (!this.method5070(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field2981 * 64 - this.field2987 * 64);
			int var5 = this.field2988 * 64 - this.field2986 * 64 + var2;
			return new class311(this.field2984, var4, var5);
		}
	}

	public void method5075(class467 var1) {
		this.field2984 = var1.method8326();
		this.field2982 = var1.method8326();
		this.field2981 = var1.method8328();
		this.field2988 = var1.method8328();
		this.field2985 = var1.method8328();
		this.field2989 = var1.method8328();
		this.field2987 = var1.method8328();
		this.field2986 = var1.method8328();
		this.field2983 = var1.method8328();
		this.field2990 = var1.method8328();
		this.method5048();
	}

	void method5048() {
	}

	static int method5064(int var0, class65 var1, boolean var2) {
		class290 var4 = class180.method2988(class69.field579[--class94.field920]);
		if (var0 == CS2Opcodes.IF_GETTARGETMASK) {
			class69.field579[++class94.field920 - 1] = class292.method2150(class182.method3010(var4));
			return 1;
		} else if (var0 != CS2Opcodes.IF_GETOP) {
			if (var0 == CS2Opcodes.IF_GETOPBASE) {
				if (var4.field3399 == null) {
					class69.field580[++class69.field581 - 1] = "";
				} else {
					class69.field580[++class69.field581 - 1] = var4.field3399;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = class69.field579[--class94.field920];
			--var5;
			if (null != var4.field3485 && var5 < var4.field3485.length && var4.field3485[var5] != null) {
				class69.field580[++class69.field581 - 1] = var4.field3485[var5];
			} else {
				class69.field580[++class69.field581 - 1] = "";
			}

			return 1;
		}
	}
}
