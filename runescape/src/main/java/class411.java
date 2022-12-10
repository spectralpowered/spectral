import java.io.IOException;

public abstract class class411 {
	class411() {
	}

	public static class166 method7618(int var0) {
		class166 var2 = (class166)class166.field1539.method5356((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class166.field1538.method6374(3, var0);
			var2 = new class166();
			if (var3 != null) {
				var2.method2789(new class467(var3));
			}

			class166.field1539.method5364(var2, (long)var0);
			return var2;
		}
	}

	public abstract int method7604(byte[] var1, int var2, int var3) throws IOException;

	public abstract void method7605(byte[] var1, int var2, int var3) throws IOException;

	public abstract int method7606() throws IOException;

	public abstract int method7608() throws IOException;

	public abstract void method7609();

	public abstract boolean method7616(int var1) throws IOException;
}
