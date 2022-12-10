import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class247 implements class343 {
	static final class247 field2912;
	static final class247 field2913;
	static final class247 field2914;
	static final class247 field2918;
	final byte field2917;
	final int field2916;

	static {
		field2914 = new class247(2, (byte)0);
		field2913 = new class247(3, (byte)1);
		field2912 = new class247(0, (byte)2);
		field2918 = new class247(1, (byte)3);
	}

	class247(int var1, byte var2) {
		this.field2916 = var1;
		this.field2917 = var2;
	}

	public int method6487() {
		return this.field2917;
	}

	public static void method4894() {
		try {
			File var1 = new File(class110.field1118, "random.dat");
			int var3;
			if (var1.exists()) {
				class163.field1515 = new class443(new class459(var1, "rw", 25L), 24, 0);
			} else {
				label38:
				for (int var2 = 0; var2 < class92.field885.length; ++var2) {
					for (var3 = 0; var3 < class121.field1210.length; ++var3) {
						File var4 = new File(class121.field1210[var3] + class92.field885[var2] + File.separatorChar + "random.dat");
						if (var4.exists()) {
							class163.field1515 = new class443(new class459(var4, "rw", 25L), 24, 0);
							break label38;
						}
					}
				}
			}

			if (null == class163.field1515) {
				RandomAccessFile var5 = new RandomAccessFile(var1, "rw");
				var3 = var5.read();
				var5.seek(0L);
				var5.write(var3);
				var5.seek(0L);
				var5.close();
				class163.field1515 = new class443(new class459(var1, "rw", 25L), 24, 0);
			}
		} catch (IOException var6) {
		}

	}

	static final int method4891(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	static final void method4893() {
		class284 var1 = class152.method2679(class276.field3244, client.field1748.field1105);
		client.field1748.method2173(var1);
		class69.field587 = true;

		for (class102 var2 = (class102)client.field1863.method8172(); var2 != null; var2 = (class102)client.field1863.method8173()) {
			if (0 == var2.field1052 || 3 == var2.field1052) {
				class2.method19(var2, true);
			}
		}

		if (client.field1868 != null) {
			class53.method1040(client.field1868);
			client.field1868 = null;
		}

		class69.field587 = false;
	}
}
