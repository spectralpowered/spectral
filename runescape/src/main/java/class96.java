public final class class96 extends class226 {
	static class50 field938;
	int field929;
	int field931;
	int field937;

	class96() {
		this.field931 = 31;
	}

	void method2026(int var1) {
		this.field931 = var1;
	}

	boolean method2027(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field931 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	protected final class216 method4625() {
		return class208.method4105(this.field937).method3922(this.field929);
	}
}
