import java.util.Comparator;

final class class336 implements Comparator {
	public static int field4226;

	class336() {
	}

	int method6287(class345 var1, class345 var2) {
		return var1.field4281.field4359 < var2.field4281.field4359 ? -1 : (var2.field4281.field4359 == var1.field4281.field4359 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6287((class345)var1, (class345)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static final void method6297(class290 var0, int var1) {
		if (null == var0.field3480) {
			throw new RuntimeException();
		} else {
			if (var0.field3550 == null) {
				var0.field3550 = new int[var0.field3480.length];
			}

			var0.field3550[var1] = Integer.MAX_VALUE;
		}
	}
}
