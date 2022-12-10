import java.util.Comparator;

public class class126 implements Comparator {
	final boolean field1263;

	public class126(boolean var1) {
		this.field1263 = var1;
	}

	int method2398(class391 var1, class391 var2) {
		return this.field1263 ? var1.field4522 - var2.field4522 : var2.field4522 - var1.field4522;
	}

	public int compare(Object var1, Object var2) {
		return this.method2398((class391)var1, (class391)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static final void method2400(class91 var0) {
		long var2 = 0L;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (var0.field874 == 0) {
			var2 = class33.field194.method4331(var0.field867, var0.field863, var0.field875);
		}

		if (var0.field874 == 1) {
			var2 = class33.field194.method4276(var0.field867, var0.field863, var0.field875);
		}

		if (2 == var0.field874) {
			var2 = class33.field194.method4311(var0.field867, var0.field863, var0.field875);
		}

		if (3 == var0.field874) {
			var2 = class33.field194.method4181(var0.field867, var0.field863, var0.field875);
		}

		if (var2 != 0L) {
			int var7 = class33.field194.method4275(var0.field867, var0.field863, var0.field875, var2);
			var4 = class215.method4664(var2);
			var5 = var7 & 31;
			var6 = var7 >> 6 & 3;
		}

		var0.field866 = var4;
		var0.field869 = var5;
		var0.field878 = var6;
	}
}
