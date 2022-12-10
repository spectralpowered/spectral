import java.io.File;
import java.io.IOException;

public class class107 extends class409 {
	final boolean field1094;

	public class107(boolean var1) {
		this.field1094 = var1;
	}

	int method2135(class391 var1, class391 var2) {
		if (0 != var1.field4520 && 0 != var2.field4520) {
			return this.field1094 ? var1.field4522 - var2.field4522 : var2.field4522 - var1.field4522;
		} else {
			return this.method7584(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2135((class391)var1, (class391)var2);
	}

	static boolean method2142(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	static void method2141(File var0, File var1) {
		try {
			class459 var3 = new class459(class163.field1513, "rw", 10000L);
			class467 var4 = new class467(500);
			var4.method8323(3);
			var4.method8323(null != var1 ? 1 : 0);
			var4.method8318(var0.getPath());
			if (null != var1) {
				var4.method8318("");
			}

			var3.method8184(var4.field4917, 0, var4.field4915);
			var3.method8185();
		} catch (IOException var5) {
			var5.printStackTrace();
		}

	}
}
