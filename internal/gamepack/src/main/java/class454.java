import io.spectralpowered.ObfInfo;
import java.io.IOException;
import java.io.OutputStream;

@ObfInfo(
	name = "ox"
)
public class class454 implements Runnable {
	@ObfInfo(
		owner = "ox",
		name = "sn",
		desc = "Z"
	)
	static boolean field3773;
	@ObfInfo(
		owner = "ox",
		name = "r",
		desc = "Z"
	)
	boolean field3772;
	@ObfInfo(
		owner = "ox",
		name = "x",
		desc = "[B"
	)
	byte[] field3768;
	@ObfInfo(
		owner = "ox",
		name = "q",
		desc = "I"
	)
	int field3767;
	@ObfInfo(
		owner = "ox",
		name = "v",
		desc = "I"
	)
	int field3769;
	@ObfInfo(
		owner = "ox",
		name = "m",
		desc = "I"
	)
	int field3770;
	@ObfInfo(
		owner = "ox",
		name = "f",
		desc = "Ljava/io/IOException;"
	)
	IOException field3771;
	@ObfInfo(
		owner = "ox",
		name = "e",
		desc = "Ljava/io/OutputStream;"
	)
	OutputStream field3766;
	@ObfInfo(
		owner = "ox",
		name = "h",
		desc = "Ljava/lang/Thread;"
	)
	Thread field3765;

	@ObfInfo(
		owner = "ox",
		name = "<init>",
		desc = "(Ljava/io/OutputStream;I)V"
	)
	class454(OutputStream var1, int var2) {
		this.field3770 = 0;
		this.field3767 = 0;
		this.field3766 = var1;
		this.field3769 = var2 + 1;
		this.field3768 = new byte[this.field3769];
		this.field3765 = new Thread(this);
		this.field3765.setDaemon(true);
		this.field3765.start();
	}

	@ObfInfo(
		owner = "ox",
		name = "h",
		desc = "(I)Z"
	)
	boolean method2243() {
		if (this.field3772) {
			try {
				this.field3766.close();
				if (null == this.field3771) {
					this.field3771 = new IOException("");
				}
			} catch (IOException var3) {
				if (this.field3771 == null) {
					this.field3771 = new IOException(var3);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(
		owner = "ox",
		name = "run",
		desc = "()V"
	)
	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (null != this.field3771) {
						return;
					}

					if (this.field3770 <= this.field3767) {
						var1 = this.field3767 - this.field3770;
					} else {
						var1 = this.field3769 - this.field3770 + this.field3767;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.field3766.flush();
					} catch (IOException var11) {
						this.field3771 = var11;
						return;
					}

					if (this.method2243()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var12) {
					}
				}
			}

			try {
				if (this.field3770 + var1 <= this.field3769) {
					this.field3766.write(this.field3768, this.field3770, var1);
				} else {
					int var7 = this.field3769 - this.field3770;
					this.field3766.write(this.field3768, this.field3770, var7);
					this.field3766.write(this.field3768, 0, var1 - var7);
				}
			} catch (IOException var10) {
				IOException var2 = var10;
				synchronized(this) {
					this.field3771 = var2;
					return;
				}
			}

			synchronized(this) {
				this.field3770 = (var1 + this.field3770) % this.field3769;
			}
		} while(!this.method2243());

	}

	@ObfInfo(
		owner = "ox",
		name = "e",
		desc = "([BIII)V"
	)
	void method2245(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized(this) {
				if (null != this.field3771) {
					throw new IOException(this.field3771.toString());
				} else {
					int var6;
					if (this.field3770 <= this.field3767) {
						var6 = this.field3770 + (this.field3769 - this.field3767) - 1;
					} else {
						var6 = this.field3770 - this.field3767 - 1;
					}

					if (var6 < var3) {
						throw new IOException("");
					} else {
						if (var3 + this.field3767 <= this.field3769) {
							System.arraycopy(var1, var2, this.field3768, this.field3767, var3);
						} else {
							int var7 = this.field3769 - this.field3767;
							System.arraycopy(var1, var2, this.field3768, this.field3767, var7);
							System.arraycopy(var1, var2 + var7, this.field3768, 0, var3 - var7);
						}

						this.field3767 = (var3 + this.field3767) % this.field3769;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfInfo(
		owner = "ox",
		name = "v",
		desc = "(B)V"
	)
	void method2244() {
		synchronized(this) {
			this.field3772 = true;
			this.notifyAll();
		}

		try {
			this.field3765.join();
		} catch (InterruptedException var4) {
		}

	}
}
