public class class222 extends class428 {
	static class228 field2700;
	class217 field2698;
	int field2694;
	int field2695;
	int[] field2696;
	int[][] field2697;

	public class222(int var1, byte[] var2) {
		this.field2694 = var1;
		class467 var3 = new class467(var2);
		this.field2695 = var3.method8326();
		this.field2696 = new int[this.field2695];
		this.field2697 = new int[this.field2695][];

		int var4;
		for (var4 = 0; var4 < this.field2695; ++var4) {
			this.field2696[var4] = var3.method8326();
		}

		for (var4 = 0; var4 < this.field2695; ++var4) {
			this.field2697[var4] = new int[var3.method8326()];
		}

		for (var4 = 0; var4 < this.field2695; ++var4) {
			for (int var5 = 0; var5 < this.field2697[var4].length; ++var5) {
				this.field2697[var4][var5] = var3.method8326();
			}
		}

		if (var3.field4915 < var3.field4917.length) {
			var4 = var3.method8328();
			if (var4 > 0) {
				this.field2698 = new class217(var3, var4);
			}
		}

	}

	public int method4620() {
		return this.field2695;
	}

	public class217 method4616() {
		return this.field2698;
	}
}
