public class class164 {
	static class467 field1529;
	// $FF: synthetic field
	final class167 this$0;
	public float[] field1524;
	public int field1526;
	public int field1527;
	public int field1528;
	public String field1523;

	class164(class167 var1) {
		this.this$0 = var1;
		this.field1524 = new float[4];
		this.field1527 = 1;
		this.field1528 = 1;
		this.field1526 = 0;
	}

	static void method2767(int var0) {
		if (var0 == -1 && !client.field1946) {
			class300.method48();
		} else if (var0 != -1 && var0 != client.field1945 && class186.field2040.method1787() != 0 && !client.field1946) {
			class326 var2 = class174.field1635;
			int var3 = class186.field2040.method1787();
			class300.field3632 = 1;
			class312.field3717 = var2;
			class127.field1269 = var0;
			class300.field3635 = 0;
			class468.field4918 = var3;
			class141.field1359 = false;
			class300.field3634 = 2;
		}

		client.field1945 = var0;
	}

	static void method2766(class290[] var0, class290 var1, boolean var2) {
		int var4 = var1.field3422 != 0 ? var1.field3422 : var1.field3414;
		int var5 = var1.field3423 != 0 ? var1.field3423 : var1.field3474;
		class81.method1631(var0, var1.field3492, var4, var5, var2);
		if (var1.field3541 != null) {
			class81.method1631(var1.field3541, var1.field3492, var4, var5, var2);
		}

		class102 var6 = (class102)client.field1863.method8177((long)var1.field3492);
		if (null != var6) {
			client.method6942(var6.field1057, var4, var5, var2);
		}

		if (1337 == var1.field3500) {
		}

	}
}
