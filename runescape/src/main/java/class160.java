public class class160 extends class182 {
	long field1500;

	public class160() {
		this.field1500 = System.nanoTime();
	}

	public void method3002() {
		this.field1500 = System.nanoTime();
	}

	public int method3003(int var1, int var2) {
		long var4 = 1000000L * (long)var2;
		long var6 = this.field1500 - System.nanoTime();
		if (var6 < var4) {
			var6 = var4;
		}

		class261.method115(var6 / 1000000L);
		long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; var10 < 10 && (var10 < 1 || this.field1500 < var8); this.field1500 += (long)var1 * 1000000L) {
			++var10;
		}

		if (this.field1500 < var8) {
			this.field1500 = var8;
		}

		return var10;
	}
}
