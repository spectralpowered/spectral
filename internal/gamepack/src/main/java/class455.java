import io.spectralpowered.ObfInfo;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfInfo(
	name = "qq"
)
public final class class455 {
	@ObfInfo(
		owner = "qq",
		name = "h",
		desc = "Ljava/io/RandomAccessFile;"
	)
	RandomAccessFile field3774;
	@ObfInfo(
		owner = "qq",
		name = "v",
		desc = "J"
	)
	long field3776;
	@ObfInfo(
		owner = "qq",
		name = "e",
		desc = "J"
	)
	final long field3775;

	@ObfInfo(
		owner = "qq",
		name = "<init>",
		desc = "(Ljava/io/File;Ljava/lang/String;J)V"
	)
	public class455(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.field3774 = new RandomAccessFile(var1, var2);
		this.field3775 = var3;
		this.field3776 = 0L;
		int var5 = this.field3774.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.field3774.seek(0L);
			this.field3774.write(var5);
		}

		this.field3774.seek(0L);
	}

	@ObfInfo(
		owner = "qq",
		name = "h",
		desc = "(J)V"
	)
	final void method2246(long var1) throws IOException {
		this.field3774.seek(var1);
		this.field3776 = var1;
	}

	@ObfInfo(
		owner = "qq",
		name = "e",
		desc = "([BIII)V"
	)
	public final void method2247(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.field3776 > this.field3775) {
			this.field3774.seek(this.field3775);
			this.field3774.write(1);
			throw new EOFException();
		} else {
			this.field3774.write(var1, var2, var3);
			this.field3776 += (long)var3;
		}
	}

	@ObfInfo(
		owner = "qq",
		name = "v",
		desc = "(I)V"
	)
	public final void method2248() throws IOException {
		this.method2249(false);
	}

	@ObfInfo(
		owner = "qq",
		name = "x",
		desc = "(ZB)V"
	)
	public final void method2249(boolean var1) throws IOException {
		if (this.field3774 != null) {
			if (var1) {
				try {
					this.field3774.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}

			this.field3774.close();
			this.field3774 = null;
		}

	}

	@ObfInfo(
		owner = "qq",
		name = "m",
		desc = "(I)J"
	)
	public final long method2251() throws IOException {
		return this.field3774.length();
	}

	@ObfInfo(
		owner = "qq",
		name = "q",
		desc = "([BIII)I"
	)
	public final int method2250(byte[] var1, int var2, int var3) throws IOException {
		int var5 = this.field3774.read(var1, var2, var3);
		if (var5 > 0) {
			this.field3776 += (long)var5;
		}

		return var5;
	}

	@ObfInfo(
		owner = "qq",
		name = "finalize",
		desc = "()V"
	)
	protected void finalize() throws Throwable {
		if (null != this.field3774) {
			System.out.println("");
			this.method2248();
		}

	}

	@ObfInfo(
		owner = "qq",
		name = "m",
		desc = "(II)I"
	)
	public static int method2252(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}
}
