import java.io.IOException;
import java.io.OutputStream;

public class class414 implements Runnable {
	static boolean field4640;
	boolean field4639;
	byte[] field4635;
	int field4634;
	int field4636;
	int field4637;
	IOException field4638;
	OutputStream field4633;
	Thread field4632;

	class414(OutputStream var1, int var2) {
		this.field4637 = 0;
		this.field4634 = 0;
		this.field4633 = var1;
		this.field4636 = var2 + 1;
		this.field4635 = new byte[this.field4636];
		this.field4632 = new Thread(this);
		this.field4632.setDaemon(true);
		this.field4632.start();
	}

	boolean method7651() {
		if (this.field4639) {
			try {
				this.field4633.close();
				if (null == this.field4638) {
					this.field4638 = new IOException("");
				}
			} catch (IOException var3) {
				if (this.field4638 == null) {
					this.field4638 = new IOException(var3);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (null != this.field4638) {
						return;
					}

					if (this.field4637 <= this.field4634) {
						var1 = this.field4634 - this.field4637;
					} else {
						var1 = this.field4636 - this.field4637 + this.field4634;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.field4633.flush();
					} catch (IOException var11) {
						this.field4638 = var11;
						return;
					}

					if (this.method7651()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var12) {
					}
				}
			}

			try {
				if (this.field4637 + var1 <= this.field4636) {
					this.field4633.write(this.field4635, this.field4637, var1);
				} else {
					int var7 = this.field4636 - this.field4637;
					this.field4633.write(this.field4635, this.field4637, var7);
					this.field4633.write(this.field4635, 0, var1 - var7);
				}
			} catch (IOException var10) {
				IOException var2 = var10;
				synchronized(this) {
					this.field4638 = var2;
					return;
				}
			}

			synchronized(this) {
				this.field4637 = (var1 + this.field4637) % this.field4636;
			}
		} while(!this.method7651());

	}

	void method7662(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized(this) {
				if (null != this.field4638) {
					throw new IOException(this.field4638.toString());
				} else {
					int var6;
					if (this.field4637 <= this.field4634) {
						var6 = this.field4637 + (this.field4636 - this.field4634) - 1;
					} else {
						var6 = this.field4637 - this.field4634 - 1;
					}

					if (var6 < var3) {
						throw new IOException("");
					} else {
						if (var3 + this.field4634 <= this.field4636) {
							System.arraycopy(var1, var2, this.field4635, this.field4634, var3);
						} else {
							int var7 = this.field4636 - this.field4634;
							System.arraycopy(var1, var2, this.field4635, this.field4634, var7);
							System.arraycopy(var1, var2 + var7, this.field4635, 0, var3 - var7);
						}

						this.field4634 = (var3 + this.field4634) % this.field4636;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method7653() {
		synchronized(this) {
			this.field4639 = true;
			this.notifyAll();
		}

		try {
			this.field4632.join();
		} catch (InterruptedException var4) {
		}

	}
}
