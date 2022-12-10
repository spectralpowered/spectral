public final class class91 extends class428 {
	static class71 field864;
	int field863;
	int field865;
	int field866;
	int field867;
	int field868;
	int field869;
	int field870;
	int field871;
	int field872;
	int field874;
	int field875;
	int field876;
	int field878;

	class91() {
		this.field868 = 31;
		this.field865 = 0;
		this.field876 = -1;
	}

	void method1959(int var1) {
		this.field868 = var1;
	}

	boolean method1962(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return 0 != (this.field868 & 1 << var1);
		} else {
			return true;
		}
	}
}
