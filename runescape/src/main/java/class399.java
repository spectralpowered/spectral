import java.io.EOFException;
import java.io.IOException;

public final class class399 {
	static byte[] field4557;
	class443 field4555;
	class443 field4556;
	int field4554;
	int field4558;

	static {
		field4557 = new byte[520];
	}

	public class399(int var1, class443 var2, class443 var3, int var4) {
		this.field4555 = null;
		this.field4556 = null;
		this.field4558 = 65000;
		this.field4554 = var1;
		this.field4555 = var2;
		this.field4556 = var3;
		this.field4558 = var4;
	}

	public byte[] method7400(int var1) {
		synchronized(this.field4555) {
			try {
				Object var10000;
				if (this.field4556.method8012() < (long)(var1 * 6 + 6)) {
					var10000 = null;
					return (byte[])var10000;
				} else {
					this.field4556.method8029((long)(var1 * 6));
					this.field4556.method8010(field4557, 0, 6);
					int var4 = (field4557[2] & 255) + ((field4557[0] & 255) << 16) + ((field4557[1] & 255) << 8);
					int var5 = ((field4557[4] & 255) << 8) + ((field4557[3] & 255) << 16) + (field4557[5] & 255);
					if (var4 < 0 || var4 > this.field4558) {
						var10000 = null;
						return (byte[])var10000;
					} else if (var5 <= 0 || (long)var5 > this.field4555.method8012() / 520L) {
						var10000 = null;
						return (byte[])var10000;
					} else {
						byte[] var6 = new byte[var4];
						int var7 = 0;

						for (int var8 = 0; var7 < var4; ++var8) {
							if (var5 == 0) {
								var10000 = null;
								return (byte[])var10000;
							}

							this.field4555.method8029((long)var5 * 520L);
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
								this.field4555.method8010(field4557, 0, var14 + var9);
								var10 = (field4557[3] & 255) + ((field4557[2] & 255) << 8) + ((field4557[0] & 255) << 24) + ((field4557[1] & 255) << 16);
								var11 = ((field4557[4] & 255) << 8) + (field4557[5] & 255);
								var12 = (field4557[8] & 255) + ((field4557[7] & 255) << 8) + ((field4557[6] & 255) << 16);
								var13 = field4557[9] & 255;
							} else {
								if (var9 > 512) {
									var9 = 512;
								}

								var14 = 8;
								this.field4555.method8010(field4557, 0, var14 + var9);
								var10 = (field4557[1] & 255) + ((field4557[0] & 255) << 8);
								var11 = ((field4557[2] & 255) << 8) + (field4557[3] & 255);
								var12 = (field4557[6] & 255) + ((field4557[4] & 255) << 16) + ((field4557[5] & 255) << 8);
								var13 = field4557[7] & 255;
							}

							if (var10 != var1 || var11 != var8 || var13 != this.field4554) {
								var10000 = null;
								return (byte[])var10000;
							}

							if (var12 < 0 || (long)var12 > this.field4555.method8012() / 520L) {
								var10000 = null;
								return (byte[])var10000;
							}

							int var15 = var9 + var14;

							for (int var16 = var14; var16 < var15; ++var16) {
								var6[var7++] = field4557[var16];
							}

							var5 = var12;
						}

						byte[] var21 = var6;
						return var21;
					}
				}
			} catch (IOException var19) {
				return null;
			}
		}
	}

	public boolean method7411(int var1, byte[] var2, int var3) {
		synchronized(this.field4555) {
			if (var3 >= 0 && var3 <= this.field4558) {
				boolean var6 = this.method7401(var1, var2, var3, true);
				if (!var6) {
					var6 = this.method7401(var1, var2, var3, false);
				}

				return var6;
			} else {
				throw new IllegalArgumentException("" + this.field4554 + ',' + var1 + ',' + var3);
			}
		}
	}

	boolean method7401(int var1, byte[] var2, int var3, boolean var4) {
		synchronized(this.field4555) {
			try {
				int var7;
				boolean var10000;
				if (var4) {
					if (this.field4556.method8012() < (long)(6 + var1 * 6)) {
						var10000 = false;
						return var10000;
					}

					this.field4556.method8029((long)(var1 * 6));
					this.field4556.method8010(field4557, 0, 6);
					var7 = (field4557[5] & 255) + ((field4557[4] & 255) << 8) + ((field4557[3] & 255) << 16);
					if (var7 <= 0 || (long)var7 > this.field4555.method8012() / 520L) {
						var10000 = false;
						return var10000;
					}
				} else {
					var7 = (int)((this.field4555.method8012() + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}

				field4557[0] = (byte)(var3 >> 16);
				field4557[1] = (byte)(var3 >> 8);
				field4557[2] = (byte)var3;
				field4557[3] = (byte)(var7 >> 16);
				field4557[4] = (byte)(var7 >> 8);
				field4557[5] = (byte)var7;
				this.field4556.method8029((long)(var1 * 6));
				this.field4556.method8027(field4557, 0, 6);
				int var8 = 0;
				int var9 = 0;

				while (true) {
					if (var8 < var3) {
						label170: {
							int var10 = 0;
							int var11;
							if (var4) {
								this.field4555.method8029((long)var7 * 520L);
								int var12;
								int var13;
								if (var1 > 65535) {
									try {
										this.field4555.method8010(field4557, 0, 10);
									} catch (EOFException var18) {
										break label170;
									}

									var11 = ((field4557[2] & 255) << 8) + ((field4557[0] & 255) << 24) + ((field4557[1] & 255) << 16) + (field4557[3] & 255);
									var12 = ((field4557[4] & 255) << 8) + (field4557[5] & 255);
									var10 = (field4557[8] & 255) + ((field4557[6] & 255) << 16) + ((field4557[7] & 255) << 8);
									var13 = field4557[9] & 255;
								} else {
									try {
										this.field4555.method8010(field4557, 0, 8);
									} catch (EOFException var17) {
										break label170;
									}

									var11 = (field4557[1] & 255) + ((field4557[0] & 255) << 8);
									var12 = ((field4557[2] & 255) << 8) + (field4557[3] & 255);
									var10 = (field4557[6] & 255) + ((field4557[4] & 255) << 16) + ((field4557[5] & 255) << 8);
									var13 = field4557[7] & 255;
								}

								if (var1 != var11 || var9 != var12 || this.field4554 != var13) {
									var10000 = false;
									return var10000;
								}

								if (var10 < 0 || (long)var10 > this.field4555.method8012() / 520L) {
									var10000 = false;
									return var10000;
								}
							}

							if (var10 == 0) {
								var4 = false;
								var10 = (int)((this.field4555.method8012() + 519L) / 520L);
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

								field4557[0] = (byte)(var1 >> 24);
								field4557[1] = (byte)(var1 >> 16);
								field4557[2] = (byte)(var1 >> 8);
								field4557[3] = (byte)var1;
								field4557[4] = (byte)(var9 >> 8);
								field4557[5] = (byte)var9;
								field4557[6] = (byte)(var10 >> 16);
								field4557[7] = (byte)(var10 >> 8);
								field4557[8] = (byte)var10;
								field4557[9] = (byte)this.field4554;
								this.field4555.method8029((long)var7 * 520L);
								this.field4555.method8027(field4557, 0, 10);
								var11 = var3 - var8;
								if (var11 > 510) {
									var11 = 510;
								}

								this.field4555.method8027(var2, var8, var11);
								var8 += var11;
							} else {
								if (var3 - var8 <= 512) {
									var10 = 0;
								}

								field4557[0] = (byte)(var1 >> 8);
								field4557[1] = (byte)var1;
								field4557[2] = (byte)(var9 >> 8);
								field4557[3] = (byte)var9;
								field4557[4] = (byte)(var10 >> 16);
								field4557[5] = (byte)(var10 >> 8);
								field4557[6] = (byte)var10;
								field4557[7] = (byte)this.field4554;
								this.field4555.method8029(520L * (long)var7);
								this.field4555.method8027(field4557, 0, 8);
								var11 = var3 - var8;
								if (var11 > 512) {
									var11 = 512;
								}

								this.field4555.method8027(var2, var8, var11);
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

	public String toString() {
		return "" + this.field4554;
	}
}
