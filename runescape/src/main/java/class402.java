import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class402 implements Runnable {
	byte[] field4574;
	int field4571;
	int field4573;
	int field4577;
	IOException field4576;
	InputStream field4572;
	Thread field4575;

	public static int method7515(class467 var0, String var1) {
		int var3 = var0.field4915;
		int var5 = var1.length();
		byte[] var6 = new byte[var5];

		for (int var7 = 0; var7 < var5; ++var7) {
			char var8 = var1.charAt(var7);
			if (var8 > 0 && var8 < 128 || var8 >= 160 && var8 <= 255) {
				var6[var7] = (byte)var8;
			} else if (var8 == 8364) {
				var6[var7] = -128;
			} else if (var8 == 8218) {
				var6[var7] = -126;
			} else if (var8 == 402) {
				var6[var7] = -125;
			} else if (var8 == 8222) {
				var6[var7] = -124;
			} else if (var8 == 8230) {
				var6[var7] = -123;
			} else if (var8 == 8224) {
				var6[var7] = -122;
			} else if (var8 == 8225) {
				var6[var7] = -121;
			} else if (var8 == 710) {
				var6[var7] = -120;
			} else if (var8 == 8240) {
				var6[var7] = -119;
			} else if (var8 == 352) {
				var6[var7] = -118;
			} else if (var8 == 8249) {
				var6[var7] = -117;
			} else if (var8 == 338) {
				var6[var7] = -116;
			} else if (var8 == 381) {
				var6[var7] = -114;
			} else if (var8 == 8216) {
				var6[var7] = -111;
			} else if (var8 == 8217) {
				var6[var7] = -110;
			} else if (var8 == 8220) {
				var6[var7] = -109;
			} else if (var8 == 8221) {
				var6[var7] = -108;
			} else if (var8 == 8226) {
				var6[var7] = -107;
			} else if (var8 == 8211) {
				var6[var7] = -106;
			} else if (var8 == 8212) {
				var6[var7] = -105;
			} else if (var8 == 732) {
				var6[var7] = -104;
			} else if (var8 == 8482) {
				var6[var7] = -103;
			} else if (var8 == 353) {
				var6[var7] = -102;
			} else if (var8 == 8250) {
				var6[var7] = -101;
			} else if (var8 == 339) {
				var6[var7] = -100;
			} else if (var8 == 382) {
				var6[var7] = -98;
			} else if (var8 == 376) {
				var6[var7] = -97;
			} else {
				var6[var7] = 63;
			}
		}

		var0.method8324(var6.length);
		var0.field4915 += class297.field3606.method6081(var6, 0, var6.length, var0.field4917, var0.field4915);
		return var0.field4915 - var3;
	}

	class402(InputStream var1, int var2) {
		this.field4571 = 0;
		this.field4577 = 0;
		this.field4572 = var1;
		this.field4573 = var2 + 1;
		this.field4574 = new byte[this.field4573];
		this.field4575 = new Thread(this);
		this.field4575.setDaemon(true);
		this.field4575.start();
	}

	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.field4576 != null) {
						return;
					}

					if (0 == this.field4571) {
						var1 = this.field4573 - this.field4577 - 1;
					} else if (this.field4571 <= this.field4577) {
						var1 = this.field4573 - this.field4577;
					} else {
						var1 = this.field4571 - this.field4577 - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var10) {
					}
				}
			}

			int var7;
			try {
				var7 = this.field4572.read(this.field4574, this.field4577, var1);
				if (var7 == -1) {
					throw new EOFException();
				}
			} catch (IOException var11) {
				IOException var3 = var11;
				synchronized(this) {
					this.field4576 = var3;
					return;
				}
			}

			synchronized(this) {
				this.field4577 = (var7 + this.field4577) % this.field4573;
			}
		}
	}

	boolean method7498(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.field4573) {
			synchronized(this) {
				int var4;
				if (this.field4571 <= this.field4577) {
					var4 = this.field4577 - this.field4571;
				} else {
					var4 = this.field4577 + (this.field4573 - this.field4571);
				}

				if (var4 < var1) {
					if (this.field4576 != null) {
						throw new IOException(this.field4576.toString());
					} else {
						this.notifyAll();
						return false;
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	int method7501() throws IOException {
		synchronized(this) {
			int var3;
			if (this.field4571 <= this.field4577) {
				var3 = this.field4577 - this.field4571;
			} else {
				var3 = this.field4577 + (this.field4573 - this.field4571);
			}

			if (var3 <= 0 && this.field4576 != null) {
				throw new IOException(this.field4576.toString());
			} else {
				this.notifyAll();
				return var3;
			}
		}
	}

	int method7500() throws IOException {
		synchronized(this) {
			if (this.field4571 == this.field4577) {
				if (null != this.field4576) {
					throw new IOException(this.field4576.toString());
				} else {
					return -1;
				}
			} else {
				int var3 = this.field4574[this.field4571] & 255;
				this.field4571 = (this.field4571 + 1) % this.field4573;
				this.notifyAll();
				return var3;
			}
		}
	}

	int method7510(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				int var6;
				if (this.field4571 <= this.field4577) {
					var6 = this.field4577 - this.field4571;
				} else {
					var6 = this.field4573 - this.field4571 + this.field4577;
				}

				if (var3 > var6) {
					var3 = var6;
				}

				if (var3 == 0 && this.field4576 != null) {
					throw new IOException(this.field4576.toString());
				} else {
					if (var3 + this.field4571 <= this.field4573) {
						System.arraycopy(this.field4574, this.field4571, var1, var2, var3);
					} else {
						int var7 = this.field4573 - this.field4571;
						System.arraycopy(this.field4574, this.field4571, var1, var2, var7);
						System.arraycopy(this.field4574, 0, var1, var2 + var7, var3 - var7);
					}

					this.field4571 = (var3 + this.field4571) % this.field4573;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method7502() {
		synchronized(this) {
			if (this.field4576 == null) {
				this.field4576 = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.field4575.join();
		} catch (InterruptedException var4) {
		}

	}
}
