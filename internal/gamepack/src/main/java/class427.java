import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "gw"
)
public class class427 {
	@ObfInfo(
		owner = "gw",
		name = "p",
		desc = "I"
	)
	public static int field3529;
	@ObfInfo(
		owner = "gw",
		name = "an",
		desc = "I"
	)
	int field3530;
	@ObfInfo(
		owner = "gw",
		name = "at",
		desc = "I"
	)
	int field3531;
	@ObfInfo(
		owner = "gw",
		name = "ay",
		desc = "I"
	)
	int field3532;
	@ObfInfo(
		owner = "gw",
		name = "ab",
		desc = "I"
	)
	int field3533;
	@ObfInfo(
		owner = "gw",
		name = "al",
		desc = "[[I"
	)
	public int[][] field3534;

	@ObfInfo(
		owner = "gw",
		name = "<init>",
		desc = "(II)V"
	)
	public class427(int var1, int var2) {
		this.field3531 = 0;
		this.field3532 = 0;
		this.field3530 = var1;
		this.field3533 = var2;
		this.field3534 = new int[this.field3530][this.field3533];
		this.method2082();
	}

	@ObfInfo(
		owner = "gw",
		name = "h",
		desc = "(I)V"
	)
	public void method2082() {
		for (int var2 = 0; var2 < this.field3530; ++var2) {
			for (int var3 = 0; var3 < this.field3533; ++var3) {
				if (var2 != 0 && var3 != 0 && var2 < this.field3530 - 5 && var3 < this.field3533 - 5) {
					this.field3534[var2][var3] = 16777216;
				} else {
					this.field3534[var2][var3] = 16777215;
				}
			}
		}

	}

	@ObfInfo(
		owner = "gw",
		name = "e",
		desc = "(IIIIZI)V"
	)
	public void method2083(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field3531;
		var2 -= this.field3532;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method2087(var1, var2, 128);
				this.method2087(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method2087(var1, var2, 2);
				this.method2087(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method2087(var1, var2, 8);
				this.method2087(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method2087(var1, var2, 32);
				this.method2087(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method2087(var1, var2, 1);
				this.method2087(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method2087(var1, var2, 4);
				this.method2087(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method2087(var1, var2, 16);
				this.method2087(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method2087(var1, var2, 64);
				this.method2087(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method2087(var1, var2, 130);
				this.method2087(var1 - 1, var2, 8);
				this.method2087(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method2087(var1, var2, 10);
				this.method2087(var1, var2 + 1, 32);
				this.method2087(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method2087(var1, var2, 40);
				this.method2087(var1 + 1, var2, 128);
				this.method2087(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method2087(var1, var2, 160);
				this.method2087(var1, var2 - 1, 2);
				this.method2087(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method2087(var1, var2, 65536);
					this.method2087(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method2087(var1, var2, 1024);
					this.method2087(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method2087(var1, var2, 4096);
					this.method2087(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method2087(var1, var2, 16384);
					this.method2087(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method2087(var1, var2, 512);
					this.method2087(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method2087(var1, var2, 2048);
					this.method2087(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method2087(var1, var2, 8192);
					this.method2087(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method2087(var1, var2, 32768);
					this.method2087(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method2087(var1, var2, 66560);
					this.method2087(var1 - 1, var2, 4096);
					this.method2087(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method2087(var1, var2, 5120);
					this.method2087(var1, var2 + 1, 16384);
					this.method2087(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method2087(var1, var2, 20480);
					this.method2087(var1 + 1, var2, 65536);
					this.method2087(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method2087(var1, var2, 81920);
					this.method2087(var1, var2 - 1, 1024);
					this.method2087(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfInfo(
		owner = "gw",
		name = "v",
		desc = "(IIIIZI)V"
	)
	public void method2093(int var1, int var2, int var3, int var4, boolean var5) {
		int var7 = 256;
		if (var5) {
			var7 += 131072;
		}

		var1 -= this.field3531;
		var2 -= this.field3532;

		for (int var8 = var1; var8 < var1 + var3; ++var8) {
			if (var8 >= 0 && var8 < this.field3530) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.field3533) {
						this.method2087(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "gw",
		name = "x",
		desc = "(IIB)V"
	)
	public void method2084(int var1, int var2) {
		var1 -= this.field3531;
		var2 -= this.field3532;
		int[] var10000 = this.field3534[var1];
		var10000[var2] |= 2097152;
	}

	@ObfInfo(
		owner = "gw",
		name = "m",
		desc = "(III)V"
	)
	public void method2085(int var1, int var2) {
		var1 -= this.field3531;
		var2 -= this.field3532;
		int[] var10000 = this.field3534[var1];
		var10000[var2] |= 262144;
	}

	@ObfInfo(
		owner = "gw",
		name = "q",
		desc = "(IIIB)V"
	)
	void method2087(int var1, int var2, int var3) {
		int[] var10000 = this.field3534[var1];
		var10000[var2] |= var3;
	}

	@ObfInfo(
		owner = "gw",
		name = "f",
		desc = "(IIIIZB)V"
	)
	public void method2086(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field3531;
		var2 -= this.field3532;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method2090(var1, var2, 128);
				this.method2090(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method2090(var1, var2, 2);
				this.method2090(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method2090(var1, var2, 8);
				this.method2090(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method2090(var1, var2, 32);
				this.method2090(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method2090(var1, var2, 1);
				this.method2090(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method2090(var1, var2, 4);
				this.method2090(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method2090(var1, var2, 16);
				this.method2090(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method2090(var1, var2, 64);
				this.method2090(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method2090(var1, var2, 130);
				this.method2090(var1 - 1, var2, 8);
				this.method2090(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method2090(var1, var2, 10);
				this.method2090(var1, var2 + 1, 32);
				this.method2090(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method2090(var1, var2, 40);
				this.method2090(var1 + 1, var2, 128);
				this.method2090(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method2090(var1, var2, 160);
				this.method2090(var1, var2 - 1, 2);
				this.method2090(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method2090(var1, var2, 65536);
					this.method2090(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method2090(var1, var2, 1024);
					this.method2090(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method2090(var1, var2, 4096);
					this.method2090(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method2090(var1, var2, 16384);
					this.method2090(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method2090(var1, var2, 512);
					this.method2090(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method2090(var1, var2, 2048);
					this.method2090(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method2090(var1, var2, 8192);
					this.method2090(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method2090(var1, var2, 32768);
					this.method2090(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method2090(var1, var2, 66560);
					this.method2090(var1 - 1, var2, 4096);
					this.method2090(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method2090(var1, var2, 5120);
					this.method2090(var1, var2 + 1, 16384);
					this.method2090(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method2090(var1, var2, 20480);
					this.method2090(var1 + 1, var2, 65536);
					this.method2090(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method2090(var1, var2, 81920);
					this.method2090(var1, var2 - 1, 1024);
					this.method2090(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfInfo(
		owner = "gw",
		name = "r",
		desc = "(IIIIIZB)V"
	)
	public void method2089(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var8 = 256;
		if (var6) {
			var8 += 131072;
		}

		var1 -= this.field3531;
		var2 -= this.field3532;
		int var9;
		if (var5 == 1 || var5 == 3) {
			var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (var9 = var1; var9 < var1 + var3; ++var9) {
			if (var9 >= 0 && var9 < this.field3530) {
				for (int var10 = var2; var10 < var4 + var2; ++var10) {
					if (var10 >= 0 && var10 < this.field3533) {
						this.method2090(var9, var10, var8);
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "gw",
		name = "u",
		desc = "(IIII)V"
	)
	void method2090(int var1, int var2, int var3) {
		int[] var10000 = this.field3534[var1];
		var10000[var2] &= ~var3;
	}

	@ObfInfo(
		owner = "gw",
		name = "b",
		desc = "(III)V"
	)
	public void method2091(int var1, int var2) {
		var1 -= this.field3531;
		var2 -= this.field3532;
		int[] var10000 = this.field3534[var1];
		var10000[var2] &= -262145;
	}

	@ObfInfo(
		owner = "gw",
		name = "if",
		desc = "(B)V"
	)
	static final void method2092(byte var0) {
		client.field404 = 0;
		int var1 = (class113.field846.field2672 >> 7) + class312.field2465;
		int var2 = class325.field2575 + (class113.field846.field2608 >> 7);
		if (var1 >= 3053) {
			if (var0 >= -1) {
				throw new IllegalStateException();
			}

			if (var1 <= 3156 && var2 >= 3056) {
				if (var0 >= -1) {
					throw new IllegalStateException();
				}

				if (var2 <= 3136) {
					client.field404 = 1;
				}
			}
		}

		if (var1 >= 3072 && var1 <= 3118) {
			if (var0 >= -1) {
				throw new IllegalStateException();
			}

			if (var2 >= 9492) {
				if (var0 >= -1) {
					throw new IllegalStateException();
				}

				if (var2 <= 9535) {
					if (var0 >= -1) {
						return;
					}

					client.field404 = 1;
				}
			}
		}

		if (client.field404 == 1) {
			if (var0 >= -1) {
				throw new IllegalStateException();
			}

			if (var1 >= 3139) {
				if (var0 >= -1) {
					throw new IllegalStateException();
				}

				if (var1 <= 3199) {
					if (var0 >= -1) {
						throw new IllegalStateException();
					}

					if (var2 >= 3008) {
						if (var0 >= -1) {
							throw new IllegalStateException();
						}

						if (var2 <= 3062) {
							if (var0 >= -1) {
								throw new IllegalStateException();
							}

							client.field404 = 0;
						}
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "gw",
		name = "nx",
		desc = "(I)V"
	)
	static void method2088() {
		if (client.field306 == 1) {
			client.field242 = true;
		}

	}
}
