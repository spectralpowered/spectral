import io.spectralpowered.ObfInfo;
import java.util.zip.CRC32;

@ObfInfo(
	name = "ln"
)
public class class38 extends class274 {
	@ObfInfo(
		owner = "ln",
		name = "g",
		desc = "Ljava/util/zip/CRC32;"
	)
	static CRC32 field190;
	@ObfInfo(
		owner = "ln",
		name = "b",
		desc = "Z"
	)
	boolean field184;
	@ObfInfo(
		owner = "ln",
		name = "k",
		desc = "Z"
	)
	boolean field194;
	@ObfInfo(
		owner = "ln",
		name = "f",
		desc = "Loi;"
	)
	class20 field186;
	@ObfInfo(
		owner = "ln",
		name = "q",
		desc = "Loi;"
	)
	class20 field188;
	@ObfInfo(
		owner = "ln",
		name = "o",
		desc = "I"
	)
	int field185;
	@ObfInfo(
		owner = "ln",
		name = "r",
		desc = "I"
	)
	int field187;
	@ObfInfo(
		owner = "ln",
		name = "i",
		desc = "I"
	)
	int field191;
	@ObfInfo(
		owner = "ln",
		name = "n",
		desc = "I"
	)
	int field193;
	@ObfInfo(
		owner = "ln",
		name = "j",
		desc = "[Z"
	)
	volatile boolean[] field189;
	@ObfInfo(
		owner = "ln",
		name = "u",
		desc = "I"
	)
	volatile int field192;

	static {
		field190 = new CRC32();
	}

	@ObfInfo(
		owner = "ln",
		name = "<init>",
		desc = "(Loi;Loi;IZZZZ)V"
	)
	public class38(class20 var1, class20 var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5);
		this.field192 = 0;
		this.field184 = false;
		this.field193 = -1;
		this.field194 = false;
		this.field188 = var1;
		this.field186 = var2;
		this.field187 = var3;
		this.field184 = var6;
		this.field194 = var7;
		class102.method411(this, this.field187);
	}

	@ObfInfo(
		owner = "ln",
		name = "h",
		desc = "(I)Z"
	)
	public boolean method150() {
		return this.field192 == 1;
	}

	@ObfInfo(
		owner = "ln",
		name = "e",
		desc = "(I)I"
	)
	public int method151() {
		if (1 != this.field192 && (!this.field194 || this.field192 != 2)) {
			if (super.field2303 != null) {
				return 99;
			} else {
				int var3 = this.field187;
				long var4 = (long)(var3 + 16711680);
				int var2;
				if (class207.field1788 != null && class207.field1788.field1134 == var4) {
					var2 = class10.field44.field1070 * 99 / (class10.field44.field1072.length - class207.field1788.field3089) + 1;
				} else {
					var2 = 0;
				}

				int var6 = var2;
				if (var2 >= 100) {
					var6 = 99;
				}

				return var6;
			}
		} else {
			return 100;
		}
	}

	@ObfInfo(
		owner = "ln",
		name = "v",
		desc = "(IB)V"
	)
	void method1341(int var1) {
		int var3 = this.field187;
		long var4 = (long)(var1 + (var3 << 16));
		class363 var6 = (class363)class462.field3834.method791(var4);
		if (var6 != null) {
			class462.field3829.method859(var6);
		}

	}

	@ObfInfo(
		owner = "ln",
		name = "x",
		desc = "(IB)V"
	)
	void method1350(int var1) {
		if (null != this.field188 && this.field189 != null && this.field189[var1]) {
			class20 var3 = this.field188;
			byte[] var5 = null;
			synchronized(class254.field2094) {
				for (class42 var7 = (class42)class254.field2094.method646(); null != var7; var7 = (class42)class254.field2094.method648()) {
					if ((long)var1 == var7.field1134 && var7.field524 == var3 && 0 == var7.field525) {
						var5 = var7.field523;
						break;
					}
				}
			}

			if (var5 != null) {
				this.method156(var3, var1, var5, true);
			} else {
				byte[] var6 = var3.method93(var1);
				this.method156(var3, var1, var6, true);
			}
		} else {
			class85.method352(this, this.field187, var1, super.field2301[var1], (byte)2, true);
		}

	}

	@ObfInfo(
		owner = "ln",
		name = "m",
		desc = "(I)V"
	)
	void method154() {
		this.field192 = 2;
		super.field2295 = new int[0];
		super.field2301 = new int[0];
		super.field2296 = new int[0];
		super.field2305 = new int[0];
		super.field2300 = new int[0][];
		super.field2303 = new Object[0];
		super.field2304 = new Object[0][];
	}

	@ObfInfo(
		owner = "ln",
		name = "q",
		desc = "(III)V"
	)
	void method164(int var1, int var2) {
		this.field191 = var1;
		this.field185 = var2;
		if (null != this.field186) {
			int var4 = this.field187;
			class20 var5 = this.field186;
			byte[] var7 = null;
			synchronized(class254.field2094) {
				for (class42 var9 = (class42)class254.field2094.method646(); var9 != null; var9 = (class42)class254.field2094.method648()) {
					if (var9.field1134 == (long)var4 && var5 == var9.field524 && var9.field525 == 0) {
						var7 = var9.field523;
						break;
					}
				}
			}

			if (var7 != null) {
				this.method156(var5, var4, var7, true);
			} else {
				byte[] var8 = var5.method93(var4);
				this.method156(var5, var4, var8, true);
			}
		} else {
			class85.method352(this, 255, this.field187, this.field191, (byte)0, true);
		}

	}

	@ObfInfo(
		owner = "ln",
		name = "f",
		desc = "(I[BZZI)V"
	)
	void method161(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field192 == 1) {
				throw new RuntimeException();
			}

			if (this.field186 != null) {
				int var6 = this.field187;
				class20 var7 = this.field186;
				class42 var8 = new class42();
				var8.field525 = 0;
				var8.field1134 = (long)var6;
				var8.field523 = var2;
				var8.field524 = var7;
				synchronized(class254.field2094) {
					class254.field2094.method642(var8);
				}

				class312.method1506();
			}

			this.method1340(var2);
			this.method162();
		} else {
			var2[var2.length - 2] = (byte)(super.field2296[var1] >> 8);
			var2[var2.length - 1] = (byte)super.field2296[var1];
			if (null != this.field188) {
				class20 var12 = this.field188;
				class42 var17 = new class42();
				var17.field525 = 0;
				var17.field1134 = (long)var1;
				var17.field523 = var2;
				var17.field524 = var12;
				synchronized(class254.field2094) {
					class254.field2094.method642(var17);
				}

				class312.method1506();
				this.field189[var1] = true;
			}

			if (var4) {
				Object[] var16 = super.field2303;
				Object var18;
				if (var2 == null) {
					var18 = null;
				} else if (var2.length > 136) {
					class47 var9 = new class47();
					var9.method261(var2);
					var18 = var9;
				} else {
					var18 = var2;
				}

				var16[var1] = var18;
			}
		}

	}

	@ObfInfo(
		owner = "ln",
		name = "r",
		desc = "(Loi;I[BZI)V"
	)
	public void method156(class20 var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (var1 == this.field186) {
			if (1 == this.field192) {
				throw new RuntimeException();
			} else if (var3 == null) {
				class85.method352(this, 255, this.field187, this.field191, (byte)0, true);
			} else {
				field190.reset();
				field190.update(var3, 0, var3.length);
				var6 = (int)field190.getValue();
				if (var6 != this.field191) {
					class85.method352(this, 255, this.field187, this.field191, (byte)0, true);
				} else {
					class127 var7 = new class127(class430.method2120(var3));
					int var8 = var7.method547();
					if (var8 != 5 && var8 != 6) {
						throw new RuntimeException(var8 + "," + this.field187 + "," + var2);
					} else {
						int var9 = 0;
						if (var8 >= 6) {
							var9 = var7.method595();
						}

						if (var9 != this.field185) {
							class85.method352(this, 255, this.field187, this.field191, (byte)0, true);
						} else {
							this.method1340(var3);
							this.method162();
						}
					}
				}
			}
		} else {
			if (!var4 && var2 == this.field193) {
				this.field192 = 1;
			}

			if (var3 != null && var3.length > 2) {
				field190.reset();
				field190.update(var3, 0, var3.length - 2);
				var6 = (int)field190.getValue();
				int var12 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				if (var6 == super.field2301[var2] && var12 == super.field2296[var2]) {
					this.field189[var2] = true;
					if (var4) {
						Object[] var13 = super.field2303;
						Object var10;
						if (var3 == null) {
							var10 = null;
						} else if (var3.length > 136) {
							class47 var11 = new class47();
							var11.method261(var3);
							var10 = var11;
						} else {
							var10 = var3;
						}

						var13[var2] = var10;
					}

				} else {
					this.field189[var2] = false;
					if (this.field184 || var4) {
						class85.method352(this, this.field187, var2, super.field2301[var2], (byte)2, var4);
					}

				}
			} else {
				this.field189[var2] = false;
				if (this.field184 || var4) {
					class85.method352(this, this.field187, var2, super.field2301[var2], (byte)2, var4);
				}

			}
		}
	}

	@ObfInfo(
		owner = "ln",
		name = "u",
		desc = "(I)V"
	)
	void method162() {
		this.field189 = new boolean[super.field2303.length];

		int var2;
		for (var2 = 0; var2 < this.field189.length; ++var2) {
			this.field189[var2] = false;
		}

		if (null == this.field188) {
			this.field192 = 1;
		} else {
			this.field193 = -1;

			for (var2 = 0; var2 < this.field189.length; ++var2) {
				if (super.field2305[var2] > 0) {
					class405.method1991(var2, this.field188, this);
					this.field193 = var2;
				}
			}

			if (-1 == this.field193) {
				this.field192 = 1;
			}

		}
	}

	@ObfInfo(
		owner = "ln",
		name = "b",
		desc = "(II)I"
	)
	int method1346(int var1) {
		if (null != super.field2303[var1]) {
			return 100;
		} else if (this.field189[var1]) {
			return 100;
		} else {
			int var4 = this.field187;
			long var5 = (long)((var4 << 16) + var1);
			int var3;
			if (class207.field1788 != null && var5 == class207.field1788.field1134) {
				var3 = 1 + class10.field44.field1070 * 99 / (class10.field44.field1072.length - class207.field1788.field3089);
			} else {
				var3 = 0;
			}

			return var3;
		}
	}

	@ObfInfo(
		owner = "ln",
		name = "j",
		desc = "(II)Z"
	)
	public boolean method157(int var1) {
		return this.field189[var1];
	}

	@ObfInfo(
		owner = "ln",
		name = "g",
		desc = "(II)Z"
	)
	public boolean method160(int var1) {
		return this.method1351(var1) != null;
	}

	@ObfInfo(
		owner = "ln",
		name = "i",
		desc = "(B)I"
	)
	public int method159() {
		int var2 = 0;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < super.field2303.length; ++var4) {
			if (super.field2305[var4] > 0) {
				var2 += 100;
				var3 += this.method1346(var4);
			}
		}

		if (var2 == 0) {
			return 100;
		} else {
			var4 = var3 * 100 / var2;
			return var4;
		}
	}

	@ObfInfo(
		owner = "ln",
		name = "c",
		desc = "(III)Z"
	)
	static final boolean method158(int var0, int var1) {
		class87 var3 = class85.method356(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var3.method364(var1);
	}

	@ObfInfo(
		owner = "ln",
		name = "mq",
		desc = "(III)V"
	)
	static final void method163(int var0, int var1) {
		if (null != client.field345[var0]) {
			if (var1 >= 0 && var1 < client.field345[var0].method270()) {
				class49 var3 = (class49)client.field345[var0].field597.get(var1);
				if (var3.field569 == -1) {
					class299 var4 = class480.method2370(class356.field2938, client.field279.field4042);
					var4.field2403.method544(3 + class319.method1614(var3.field567.method1101()));
					var4.field2403.method544(var0);
					var4.field2403.method533(var1);
					var4.field2403.method538(var3.field567.method1101(), (byte)127);
					client.field279.method2389(var4);
				}
			}
		}
	}
}
