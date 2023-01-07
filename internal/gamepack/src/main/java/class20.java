import io.spectralpowered.ObfInfo;
import java.io.EOFException;
import java.io.IOException;

@ObfInfo(
	name = "oi"
)
public final class class20 {
	@ObfInfo(
		owner = "oi",
		name = "h",
		desc = "[B"
	)
	static byte[] field102;
	@ObfInfo(
		owner = "oi",
		name = "e",
		desc = "Lqa;"
	)
	class435 field100;
	@ObfInfo(
		owner = "oi",
		name = "v",
		desc = "Lqa;"
	)
	class435 field101;
	@ObfInfo(
		owner = "oi",
		name = "m",
		desc = "I"
	)
	int field103;
	@ObfInfo(
		owner = "oi",
		name = "x",
		desc = "I"
	)
	int field99;

	static {
		field102 = new byte[520];
	}

	@ObfInfo(
		owner = "oi",
		name = "<init>",
		desc = "(ILqa;Lqa;I)V"
	)
	public class20(int var1, class435 var2, class435 var3, int var4) {
		this.field100 = null;
		this.field101 = null;
		this.field103 = 65000;
		this.field99 = var1;
		this.field100 = var2;
		this.field101 = var3;
		this.field103 = var4;
	}

	@ObfInfo(
		owner = "oi",
		name = "h",
		desc = "(II)[B"
	)
	public byte[] method93(int var1) {
		synchronized(this.field100) {
			Object var10000;
			try {
				if (this.field101.method2158() < (long)(var1 * 6 + 6)) {
					var10000 = null;
					return (byte[])var10000;
				}

				this.field101.method2164((long)(var1 * 6));
				this.field101.method2157(field102, 0, 6);
				int var4 = (field102[2] & 255) + ((field102[0] & 255) << 16) + ((field102[1] & 255) << 8);
				int var5 = ((field102[4] & 255) << 8) + ((field102[3] & 255) << 16) + (field102[5] & 255);
				if (var4 < 0 || var4 > this.field103) {
					var10000 = null;
					return (byte[])var10000;
				}

				if (var5 > 0 && (long)var5 <= this.field100.method2158() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;

					while (var7 < var4) {
						if (var5 == 0) {
							var10000 = null;
							return (byte[])var10000;
						}

						this.field100.method2164((long)var5 * 520L);
						int var9 = var4 - var7;
						int var10;
						int var11;
						int var12;
						int var13;
						byte var14;
						if (var1 > 65535) {
							if (var9 > 510) {
								var9 = 510;
							}

							var14 = 10;
							this.field100.method2157(field102, 0, var14 + var9);
							var10 = (field102[3] & 255) + ((field102[2] & 255) << 8) + ((field102[0] & 255) << 24) + ((field102[1] & 255) << 16);
							var11 = ((field102[4] & 255) << 8) + (field102[5] & 255);
							var12 = (field102[8] & 255) + ((field102[7] & 255) << 8) + ((field102[6] & 255) << 16);
							var13 = field102[9] & 255;
						} else {
							if (var9 > 512) {
								var9 = 512;
							}

							var14 = 8;
							this.field100.method2157(field102, 0, var14 + var9);
							var10 = (field102[1] & 255) + ((field102[0] & 255) << 8);
							var11 = ((field102[2] & 255) << 8) + (field102[3] & 255);
							var12 = (field102[6] & 255) + ((field102[4] & 255) << 16) + ((field102[5] & 255) << 8);
							var13 = field102[7] & 255;
						}

						if (var10 == var1 && var11 == var8 && var13 == this.field99) {
							if (var12 >= 0 && (long)var12 <= this.field100.method2158() / 520L) {
								int var15 = var9 + var14;

								for (int var16 = var14; var16 < var15; ++var16) {
									var6[var7++] = field102[var16];
								}

								var5 = var12;
								++var8;
								continue;
							}

							var10000 = null;
							return (byte[])var10000;
						}

						var10000 = null;
						return (byte[])var10000;
					}

					byte[] var21 = var6;
					return var21;
				}

				var10000 = null;
			} catch (IOException var19) {
				return null;
			}

			return (byte[])var10000;
		}
	}

	@ObfInfo(
		owner = "oi",
		name = "e",
		desc = "(I[BII)Z"
	)
	public boolean method95(int var1, byte[] var2, int var3) {
		synchronized(this.field100) {
			if (var3 >= 0 && var3 <= this.field103) {
				boolean var6 = this.method94(var1, var2, var3, true);
				if (!var6) {
					var6 = this.method94(var1, var2, var3, false);
				}

				return var6;
			} else {
				throw new IllegalArgumentException("" + this.field99 + ',' + var1 + ',' + var3);
			}
		}
	}

	@ObfInfo(
		owner = "oi",
		name = "v",
		desc = "(I[BIZI)Z"
	)
	boolean method94(int var1, byte[] var2, int var3, boolean var4) {
		synchronized(this.field100) {
			try {
				int var7;
				boolean var10000;
				if (var4) {
					if (this.field101.method2158() < (long)(6 + var1 * 6)) {
						var10000 = false;
						return var10000;
					}

					this.field101.method2164((long)(var1 * 6));
					this.field101.method2157(field102, 0, 6);
					var7 = (field102[5] & 255) + ((field102[4] & 255) << 8) + ((field102[3] & 255) << 16);
					if (var7 <= 0 || (long)var7 > this.field100.method2158() / 520L) {
						var10000 = false;
						return var10000;
					}
				} else {
					var7 = (int)((this.field100.method2158() + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}

				field102[0] = (byte)(var3 >> 16);
				field102[1] = (byte)(var3 >> 8);
				field102[2] = (byte)var3;
				field102[3] = (byte)(var7 >> 16);
				field102[4] = (byte)(var7 >> 8);
				field102[5] = (byte)var7;
				this.field101.method2164((long)(var1 * 6));
				this.field101.method2162(field102, 0, 6);
				int var8 = 0;
				int var9 = 0;

				while (true) {
					if (var8 < var3) {
						label154: {
							int var10 = 0;
							int var11;
							if (var4) {
								this.field100.method2164((long)var7 * 520L);
								int var12;
								int var13;
								if (var1 > 65535) {
									try {
										this.field100.method2157(field102, 0, 10);
									} catch (EOFException var18) {
										break label154;
									}

									var11 = ((field102[2] & 255) << 8) + ((field102[0] & 255) << 24) + ((field102[1] & 255) << 16) + (field102[3] & 255);
									var12 = ((field102[4] & 255) << 8) + (field102[5] & 255);
									var10 = (field102[8] & 255) + ((field102[6] & 255) << 16) + ((field102[7] & 255) << 8);
									var13 = field102[9] & 255;
								} else {
									try {
										this.field100.method2157(field102, 0, 8);
									} catch (EOFException var17) {
										break label154;
									}

									var11 = (field102[1] & 255) + ((field102[0] & 255) << 8);
									var12 = ((field102[2] & 255) << 8) + (field102[3] & 255);
									var10 = (field102[6] & 255) + ((field102[4] & 255) << 16) + ((field102[5] & 255) << 8);
									var13 = field102[7] & 255;
								}

								if (var1 != var11 || var9 != var12 || this.field99 != var13) {
									var10000 = false;
									return var10000;
								}

								if (var10 < 0 || (long)var10 > this.field100.method2158() / 520L) {
									var10000 = false;
									return var10000;
								}
							}

							if (var10 == 0) {
								var4 = false;
								var10 = (int)((this.field100.method2158() + 519L) / 520L);
								if (var10 == 0) {
									++var10;
								}

								if (var10 == var7) {
									++var10;
								}
							}

							if (var1 > 65535) {
								if (var3 - var8 <= 510) {
									var10 = 0;
								}

								field102[0] = (byte)(var1 >> 24);
								field102[1] = (byte)(var1 >> 16);
								field102[2] = (byte)(var1 >> 8);
								field102[3] = (byte)var1;
								field102[4] = (byte)(var9 >> 8);
								field102[5] = (byte)var9;
								field102[6] = (byte)(var10 >> 16);
								field102[7] = (byte)(var10 >> 8);
								field102[8] = (byte)var10;
								field102[9] = (byte)this.field99;
								this.field100.method2164((long)var7 * 520L);
								this.field100.method2162(field102, 0, 10);
								var11 = var3 - var8;
								if (var11 > 510) {
									var11 = 510;
								}

								this.field100.method2162(var2, var8, var11);
								var8 += var11;
							} else {
								if (var3 - var8 <= 512) {
									var10 = 0;
								}

								field102[0] = (byte)(var1 >> 8);
								field102[1] = (byte)var1;
								field102[2] = (byte)(var9 >> 8);
								field102[3] = (byte)var9;
								field102[4] = (byte)(var10 >> 16);
								field102[5] = (byte)(var10 >> 8);
								field102[6] = (byte)var10;
								field102[7] = (byte)this.field99;
								this.field100.method2164(520L * (long)var7);
								this.field100.method2162(field102, 0, 8);
								var11 = var3 - var8;
								if (var11 > 512) {
									var11 = 512;
								}

								this.field100.method2162(var2, var8, var11);
								var8 += var11;
							}

							var7 = var10;
							++var9;
							continue;
						}
					}

					var10000 = true;
					return var10000;
				}
			} catch (IOException var19) {
				return false;
			}
		}
	}

	@ObfInfo(
		owner = "oi",
		name = "toString",
		desc = "()Ljava/lang/String;"
	)
	public String toString() {
		return "" + this.field99;
	}
}
