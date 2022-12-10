import java.util.Comparator;
import java.util.Map.Entry;

class class12 implements Comparator {
	public static class337 field70;
	// $FF: synthetic field
	final class10 this$0;

	public static int method166(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	public static int method169(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	static int method167(int var0, int var1) {
		class81 var3 = (class81)class81.field749.method8177((long)var0);
		if (null == var3) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var3.field747.length ? var3.field747[var1] : -1;
		}
	}

	class12(class10 var1) {
		this.this$0 = var1;
	}

	int method157(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method157((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static final void method168(class290 var0, int var1, byte[] var2, byte[] var3) {
		if (null == var0.field3480) {
			if (null == var2) {
				return;
			}

			var0.field3480 = new byte[11][];
			var0.field3481 = new byte[11][];
			var0.field3488 = new int[11];
			var0.field3483 = new int[11];
		}

		var0.field3480[var1] = var2;
		if (var2 != null) {
			var0.field3479 = true;
		} else {
			var0.field3479 = false;

			for (int var5 = 0; var5 < var0.field3480.length; ++var5) {
				if (var0.field3480[var5] != null) {
					var0.field3479 = true;
					break;
				}
			}
		}

		var0.field3481[var1] = var3;
	}

	static final void method154(class290 var0, int var1, int var2) {
		if (client.field1875 == null && !client.field1837) {
			if (var0 != null && class292.method5660(var0) != null) {
				client.field1875 = var0;
				client.field1876 = class292.method5660(var0);
				client.field1877 = var1;
				client.field1878 = var2;
				class94.field912 = 0;
				client.field1886 = false;
				int var4 = client.field1838 - 1;
				if (var4 != -1) {
					client.method425(var4);
				}

			}
		}
	}
}
