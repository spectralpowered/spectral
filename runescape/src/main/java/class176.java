import java.io.File;
import java.util.Hashtable;

public class class176 {
	static boolean field1640;
	static File field1641;
	static Hashtable field1642;
	static long field1643;

	static {
		field1640 = false;
		field1642 = new Hashtable(16);
	}

	class176() throws Throwable {
		throw new Error();
	}

	static int method2955(int var0, class65 var1, boolean var2) {
		int var4;
		if (var0 == CS2Opcodes.KEYHELD) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = client.field1929.method3567(var4) ? 1 : 0;
			return 1;
		} else if (var0 == CS2Opcodes.KEYPRESSED) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = client.field1929.method3587(var4) ? 1 : 0;
			return 1;
		} else if (var0 == CS2Opcodes.KEYRELEASED) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = client.field1929.method3565(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
