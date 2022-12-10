import java.util.Comparator;

final class class327 implements Comparator {
	class327() {
	}

	int method6254(class345 var1, class345 var2) {
		return var1.field4278 < var2.field4278 ? -1 : (var2.field4278 == var1.field4278 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6254((class345)var1, (class345)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
