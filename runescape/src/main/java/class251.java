import java.io.File;
import java.io.RandomAccessFile;

public class class251 {
	public static final class251 field2949;
	public static final class251 field2950;
	public static final class251 field2951;
	static long field2948;
	final int field2952;
	final int field2953;
	final int field2954;

	static {
		field2950 = new class251(2, 0, 4);
		field2949 = new class251(0, 1, 2);
		field2951 = new class251(1, 2, 0);
	}

	static class251[] method4960() {
		return new class251[]{field2949, field2951, field2950};
	}

	class251(int var1, int var2, int var3) {
		this.field2953 = var1;
		this.field2952 = var2;
		this.field2954 = var3;
	}

	boolean method4968(float var1) {
		return var1 >= (float)this.field2954;
	}

	public static boolean method4969(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	public static boolean method4967(File var0, boolean var1) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var5) {
			return false;
		}
	}

	static int method4961(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.CLIENTVARP_MOUSEBUTTONMODE) {
			boolean var4 = class69.field579[--class94.field920] == 1;
			client.method4075(var4);
			return 1;
		} else {
			return 2;
		}
	}
}
