import java.io.File;
import java.io.RandomAccessFile;

public class class292 {
	static class337 field3557;

	class292() throws Throwable {
		throw new Error();
	}

	public static int method2150(int var0) {
		return var0 >> 11 & 63;
	}

	public static File method5655(String var0) {
		if (!class176.field1640) {
			throw new RuntimeException("");
		} else {
			File var2 = (File)class176.field1642.get(var0);
			if (null != var2) {
				return var2;
			} else {
				File var3 = new File(class176.field1641, var0);
				RandomAccessFile var4 = null;

				try {
					File var5 = new File(var3.getParent());
					if (!var5.exists()) {
						throw new RuntimeException("");
					} else {
						var4 = new RandomAccessFile(var3, "rw");
						int var6 = var4.read();
						var4.seek(0L);
						var4.write(var6);
						var4.seek(0L);
						var4.close();
						class176.field1642.put(var0, var3);
						return var3;
					}
				} catch (Exception var9) {
					try {
						if (null != var4) {
							var4.close();
							var4 = null;
						}
					} catch (Exception var8) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	static class290 method5660(class290 var0) {
		class290 var3 = var0;
		int var5 = class182.method3010(var0);
		int var4 = var5 >> 17 & 7;
		int var6 = var4;
		class290 var2;
		if (var4 == 0) {
			var2 = null;
		} else {
			int var7 = 0;

			while (true) {
				if (var7 >= var6) {
					var2 = var3;
					break;
				}

				var3 = class180.method2988(var3.field3418);
				if (null == var3) {
					var2 = null;
					break;
				}

				++var7;
			}
		}

		class290 var8 = var2;
		if (null == var2) {
			var8 = var0.field3486;
		}

		return var8;
	}
}
