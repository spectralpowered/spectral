public class class416 {
	float[] field4646;
	int field4648;

	class416(float[] var1, int var2) {
		this.field4646 = var1;
		this.field4648 = var2;
	}

	static float method1055(float[] var0, int var1, float var2) {
		float var4 = var0[var1];

		for (int var5 = var1 - 1; var5 >= 0; --var5) {
			var4 = var0[var5] + var4 * var2;
		}

		return var4;
	}

	static class448 method7667(int var0) {
		class448 var2 = (class448)client.field1981.method5356((long)var0);
		if (null == var2) {
			var2 = new class448(class407.field4611, var0);
		}

		return var2;
	}
}
