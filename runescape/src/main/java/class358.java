import java.util.Comparator;

final class class358 implements Comparator {
	static class337 field4337;

	class358() {
	}

	int method6631(class345 var1, class345 var2) {
		return var1.field4279 < var2.field4279 ? -1 : (var1.field4279 == var2.field4279 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6631((class345)var1, (class345)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
