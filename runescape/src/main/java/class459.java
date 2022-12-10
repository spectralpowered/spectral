import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class459 {
	RandomAccessFile field4883;
	long field4885;
	final long field4884;

	public class459(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.field4883 = new RandomAccessFile(var1, var2);
		this.field4884 = var3;
		this.field4885 = 0L;
		int var5 = this.field4883.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.field4883.seek(0L);
			this.field4883.write(var5);
		}

		this.field4883.seek(0L);
	}

	final void method8183(long var1) throws IOException {
		this.field4883.seek(var1);
		this.field4885 = var1;
	}

	public final void method8184(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.field4885 > this.field4884) {
			this.field4883.seek(this.field4884);
			this.field4883.write(1);
			throw new EOFException();
		} else {
			this.field4883.write(var1, var2, var3);
			this.field4885 += (long)var3;
		}
	}

	public final void method8185() throws IOException {
		this.method8186(false);
	}

	public final void method8186(boolean var1) throws IOException {
		if (this.field4883 != null) {
			if (var1) {
				try {
					this.field4883.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}

			this.field4883.close();
			this.field4883 = null;
		}

	}

	public final long method8194() throws IOException {
		return this.field4883.length();
	}

	public final int method8188(byte[] var1, int var2, int var3) throws IOException {
		int var5 = this.field4883.read(var1, var2, var3);
		if (var5 > 0) {
			this.field4885 += (long)var5;
		}

		return var5;
	}

	protected void finalize() throws Throwable {
		if (null != this.field4883) {
			System.out.println("");
			this.method8185();
		}

	}
}
