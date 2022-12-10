import java.io.EOFException;
import java.io.IOException;

public class class443 {
	byte[] field4822;
	byte[] field4824;
	class459 field4818;
	int field4819;
	int field4823;
	long field4817;
	long field4820;
	long field4825;
	long field4826;
	long field4827;
	long field4828;

	public class443(class459 var1, int var2, int var3) throws IOException {
		this.field4820 = -1L;
		this.field4817 = -1L;
		this.field4823 = 0;
		this.field4818 = var1;
		this.field4827 = this.field4826 = var1.method8194();
		this.field4824 = new byte[var2];
		this.field4822 = new byte[var3];
		this.field4825 = 0L;
	}

	public void method8028() throws IOException {
		this.method8017();
		this.field4818.method8185();
	}

	public void method8029(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.field4825 = var1;
		}
	}

	public long method8012() {
		return this.field4827;
	}

	public void method8013(byte[] var1) throws IOException {
		this.method8010(var1, 0, var1.length);
	}

	public void method8010(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
			}

			if (-1L != this.field4817 && this.field4825 >= this.field4817 && this.field4825 + (long)var3 <= this.field4817 + (long)this.field4823) {
				System.arraycopy(this.field4822, (int)(this.field4825 - this.field4817), var1, var2, var3);
				this.field4825 += (long)var3;
				return;
			}

			long var5 = this.field4825;
			int var8 = var3;
			int var9;
			if (this.field4825 >= this.field4820 && this.field4825 < (long)this.field4819 + this.field4820) {
				var9 = (int)((long)this.field4819 - (this.field4825 - this.field4820));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(this.field4824, (int)(this.field4825 - this.field4820), var1, var2, var9);
				this.field4825 += (long)var9;
				var2 += var9;
				var3 -= var9;
			}

			if (var3 > this.field4824.length) {
				this.field4818.method8183(this.field4825);

				for (this.field4828 = this.field4825; var3 > 0; var3 -= var9) {
					var9 = this.field4818.method8188(var1, var2, var3);
					if (var9 == -1) {
						break;
					}

					this.field4828 += (long)var9;
					this.field4825 += (long)var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				this.method8015();
				var9 = var3;
				if (var3 > this.field4819) {
					var9 = this.field4819;
				}

				System.arraycopy(this.field4824, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				this.field4825 += (long)var9;
			}

			if (-1L != this.field4817) {
				if (this.field4817 > this.field4825 && var3 > 0) {
					var9 = (int)(this.field4817 - this.field4825) + var2;
					if (var9 > var3 + var2) {
						var9 = var3 + var2;
					}

					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						++this.field4825;
					}
				}

				long var14 = -1L;
				long var11 = -1L;
				if (this.field4817 >= var5 && this.field4817 < var5 + (long)var8) {
					var14 = this.field4817;
				} else if (var5 >= this.field4817 && var5 < (long)this.field4823 + this.field4817) {
					var14 = var5;
				}

				if (this.field4817 + (long)this.field4823 > var5 && (long)this.field4823 + this.field4817 <= (long)var8 + var5) {
					var11 = (long)this.field4823 + this.field4817;
				} else if (var5 + (long)var8 > this.field4817 && (long)var8 + var5 <= this.field4817 + (long)this.field4823) {
					var11 = (long)var8 + var5;
				}

				if (var14 > -1L && var11 > var14) {
					int var13 = (int)(var11 - var14);
					System.arraycopy(this.field4822, (int)(var14 - this.field4817), var1, (int)(var14 - var5) + var2, var13);
					if (var11 > this.field4825) {
						var3 = (int)((long)var3 - (var11 - this.field4825));
						this.field4825 = var11;
					}
				}
			}
		} catch (IOException var17) {
			this.field4828 = -1L;
			throw var17;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	void method8015() throws IOException {
		this.field4819 = 0;
		if (this.field4828 != this.field4825) {
			this.field4818.method8183(this.field4825);
			this.field4828 = this.field4825;
		}

		int var3;
		for (this.field4820 = this.field4825; this.field4819 < this.field4824.length; this.field4819 += var3) {
			int var2 = this.field4824.length - this.field4819;
			if (var2 > 200000000) {
				var2 = 200000000;
			}

			var3 = this.field4818.method8188(this.field4824, this.field4819, var2);
			if (var3 == -1) {
				break;
			}

			this.field4828 += (long)var3;
		}

	}

	public void method8027(byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((long)var3 + this.field4825 > this.field4827) {
				this.field4827 = this.field4825 + (long)var3;
			}

			if (this.field4817 != -1L && (this.field4825 < this.field4817 || this.field4825 > this.field4817 + (long)this.field4823)) {
				this.method8017();
			}

			if (this.field4817 != -1L && this.field4825 + (long)var3 > (long)this.field4822.length + this.field4817) {
				int var5 = (int)((long)this.field4822.length - (this.field4825 - this.field4817));
				System.arraycopy(var1, var2, this.field4822, (int)(this.field4825 - this.field4817), var5);
				this.field4825 += (long)var5;
				var2 += var5;
				var3 -= var5;
				this.field4823 = this.field4822.length;
				this.method8017();
			}

			if (var3 <= this.field4822.length) {
				if (var3 > 0) {
					if (-1L == this.field4817) {
						this.field4817 = this.field4825;
					}

					System.arraycopy(var1, var2, this.field4822, (int)(this.field4825 - this.field4817), var3);
					this.field4825 += (long)var3;
					if (this.field4825 - this.field4817 > (long)this.field4823) {
						this.field4823 = (int)(this.field4825 - this.field4817);
					}

				}
			} else {
				if (this.field4825 != this.field4828) {
					this.field4818.method8183(this.field4825);
					this.field4828 = this.field4825;
				}

				this.field4818.method8184(var1, var2, var3);
				this.field4828 += (long)var3;
				if (this.field4828 > this.field4826) {
					this.field4826 = this.field4828;
				}

				long var10 = -1L;
				long var7 = -1L;
				if (this.field4825 >= this.field4820 && this.field4825 < (long)this.field4819 + this.field4820) {
					var10 = this.field4825;
				} else if (this.field4820 >= this.field4825 && this.field4820 < this.field4825 + (long)var3) {
					var10 = this.field4820;
				}

				if ((long)var3 + this.field4825 > this.field4820 && (long)var3 + this.field4825 <= this.field4820 + (long)this.field4819) {
					var7 = (long)var3 + this.field4825;
				} else if (this.field4820 + (long)this.field4819 > this.field4825 && (long)this.field4819 + this.field4820 <= this.field4825 + (long)var3) {
					var7 = this.field4820 + (long)this.field4819;
				}

				if (var10 > -1L && var7 > var10) {
					int var9 = (int)(var7 - var10);
					System.arraycopy(var1, (int)(var10 + (long)var2 - this.field4825), this.field4824, (int)(var10 - this.field4820), var9);
				}

				this.field4825 += (long)var3;
			}
		} catch (IOException var13) {
			this.field4828 = -1L;
			throw var13;
		}
	}

	void method8017() throws IOException {
		if (this.field4817 != -1L) {
			if (this.field4817 != this.field4828) {
				this.field4818.method8183(this.field4817);
				this.field4828 = this.field4817;
			}

			this.field4818.method8184(this.field4822, 0, this.field4823);
			this.field4828 += (long)this.field4823;
			if (this.field4828 > this.field4826) {
				this.field4826 = this.field4828;
			}

			long var2 = -1L;
			long var4 = -1L;
			if (this.field4817 >= this.field4820 && this.field4817 < this.field4820 + (long)this.field4819) {
				var2 = this.field4817;
			} else if (this.field4820 >= this.field4817 && this.field4820 < (long)this.field4823 + this.field4817) {
				var2 = this.field4820;
			}

			if (this.field4817 + (long)this.field4823 > this.field4820 && (long)this.field4823 + this.field4817 <= this.field4820 + (long)this.field4819) {
				var4 = (long)this.field4823 + this.field4817;
			} else if (this.field4820 + (long)this.field4819 > this.field4817 && (long)this.field4819 + this.field4820 <= (long)this.field4823 + this.field4817) {
				var4 = (long)this.field4819 + this.field4820;
			}

			if (var2 > -1L && var4 > var2) {
				int var6 = (int)(var4 - var2);
				System.arraycopy(this.field4822, (int)(var2 - this.field4817), this.field4824, (int)(var2 - this.field4820), var6);
			}

			this.field4817 = -1L;
			this.field4823 = 0;
		}

	}
}
