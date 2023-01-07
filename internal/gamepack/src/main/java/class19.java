import io.spectralpowered.ObfInfo;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfInfo(
	name = "n"
)
public class class19 {
	@ObfInfo(
		owner = "n",
		name = "hc",
		desc = "Lou;"
	)
	static class160 field95;
	@ObfInfo(
		owner = "n",
		name = "kn",
		desc = "I"
	)
	static int field96;
	@ObfInfo(
		owner = "n",
		name = "h",
		desc = "I"
	)
	final int field93;
	@ObfInfo(
		owner = "n",
		name = "e",
		desc = "Ljava/lang/String;"
	)
	final String field97;
	@ObfInfo(
		owner = "n",
		name = "v",
		desc = "Ljava/util/concurrent/ThreadFactory;"
	)
	final ThreadFactory field94;
	@ObfInfo(
		owner = "n",
		name = "x",
		desc = "Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	final ThreadPoolExecutor field98;

	@ObfInfo(
		owner = "n",
		name = "<init>",
		desc = "(Ljava/lang/String;II)V"
	)
	public class19(String var1, int var2, int var3) {
		this.field97 = var1;
		this.field93 = var2;
		this.field94 = new class199(this);
		this.field98 = this.method87(var3);
	}

	@ObfInfo(
		owner = "n",
		name = "h",
		desc = "(II)Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	final ThreadPoolExecutor method87(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field93), this.field94);
	}

	@ObfInfo(
		owner = "n",
		name = "e",
		desc = "(Lj;B)Lt;"
	)
	public class3 method88(class192 var1) {
		if (this.field98.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field98.getCorePoolSize() + " Queue capacity " + this.field93);
			return new class3("Queue full");
		} else {
			class3 var3 = new class3(this.field98.submit(new class91(this, var1)));
			return var3;
		}
	}

	@ObfInfo(
		owner = "n",
		name = "v",
		desc = "(I)V"
	)
	public final void method91() {
		try {
			this.field98.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}

	}

	@ObfInfo(
		owner = "n",
		name = "x",
		desc = "([BIIII[Lgw;I)V"
	)
	static final void method89(byte[] var0, int var1, int var2, int var3, int var4, class427[] var5) {
		int var8;
		int var9;
		for (int var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					if (var8 + var1 > 0 && var8 + var1 < 103 && var2 + var9 > 0 && var2 + var9 < 103) {
						int[] var10000 = var5[var7].field3534[var8 + var1];
						var10000[var2 + var9] &= -16777217;
					}
				}
			}
		}

		class127 var13 = new class127(var0);

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (int var10 = 0; var10 < 64; ++var10) {
					int var11 = var1 + var9;
					int var12 = var2 + var10;
					class100.method397(var13, var8, var11, var12, var11 + var3, var4 + var12, 0);
				}
			}
		}

	}

	@ObfInfo(
		owner = "n",
		name = "t",
		desc = "(ILbm;ZB)I"
	)
	static int method92(int var0, class461 var1, boolean var2) {
		class120 var4 = class67.method299(class386.field3248[--class161.field1227]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			class386.field3248[++class161.field1227 - 1] = var4.field906;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			class386.field3248[++class161.field1227 - 1] = var4.field907;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			class386.field3248[++class161.field1227 - 1] = var4.field908;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			class386.field3248[++class161.field1227 - 1] = var4.field967;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			class386.field3248[++class161.field1227 - 1] = var4.field945 ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			class386.field3248[++class161.field1227 - 1] = var4.field912;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(
		owner = "n",
		name = "lq",
		desc = "(II)V"
	)
	static final void method90(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = (float)var0 / 200.0F + 0.5F;
		class229.method998((double)var2);
	}
}
