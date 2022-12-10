import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class14 {
	static class411 field82;
	static int field83;
	final int field80;
	final String field84;
	final ThreadFactory field81;
	final ThreadPoolExecutor field85;

	public class14(String var1, int var2, int var3) {
		this.field84 = var1;
		this.field80 = var2;
		this.field81 = new class1(this);
		this.field85 = this.method177(var3);
	}

	final ThreadPoolExecutor method177(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field80), this.field81);
	}

	public class20 method178(class10 var1) {
		if (this.field85.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field85.getCorePoolSize() + " Queue capacity " + this.field80);
			return new class20("Queue full");
		} else {
			class20 var3 = new class20(this.field85.submit(new class3(this, var1)));
			return var3;
		}
	}

	public final void method182() {
		try {
			this.field85.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}

	}

	static final void method179(byte[] var0, int var1, int var2, int var3, int var4, class205[] var5) {
		int var8;
		int var9;
		for (int var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					if (var8 + var1 > 0 && var8 + var1 < 103 && var2 + var9 > 0 && var2 + var9 < 103) {
						int[] var10000 = var5[var7].field2352[var8 + var1];
						var10000[var2 + var9] &= -16777217;
					}
				}
			}
		}

		class467 var13 = new class467(var0);

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (int var10 = 0; var10 < 64; ++var10) {
					int var11 = var1 + var9;
					int var12 = var2 + var10;
					class105.method2114(var13, var8, var11, var12, var11 + var3, var4 + var12, 0);
				}
			}
		}

	}

	static int method183(int var0, class65 var1, boolean var2) {
		class290 var4 = class180.method2988(class69.field579[--class94.field920]);
		if (var0 == CS2Opcodes.IF_GETX) {
			class69.field579[++class94.field920 - 1] = var4.field3412;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETY) {
			class69.field579[++class94.field920 - 1] = var4.field3413;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETWIDTH) {
			class69.field579[++class94.field920 - 1] = var4.field3414;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETHEIGHT) {
			class69.field579[++class94.field920 - 1] = var4.field3474;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETHIDE) {
			class69.field579[++class94.field920 - 1] = var4.field3452 ? 1 : 0;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETLAYER) {
			class69.field579[++class94.field920 - 1] = var4.field3418;
			return 1;
		} else {
			return 2;
		}
	}
}
