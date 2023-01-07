import io.spectralpowered.ObfInfo;
import java.io.File;
import java.io.RandomAccessFile;

@ObfInfo(
	name = "iq"
)
public class class221 {
	@ObfInfo(
		owner = "iq",
		name = "e",
		desc = "Liq;"
	)
	public static final class221 field1902;
	@ObfInfo(
		owner = "iq",
		name = "h",
		desc = "Liq;"
	)
	public static final class221 field1903;
	@ObfInfo(
		owner = "iq",
		name = "v",
		desc = "Liq;"
	)
	public static final class221 field1904;
	@ObfInfo(
		owner = "iq",
		name = "vf",
		desc = "J"
	)
	static long field1901;
	@ObfInfo(
		owner = "iq",
		name = "m",
		desc = "I"
	)
	final int field1905;
	@ObfInfo(
		owner = "iq",
		name = "x",
		desc = "I"
	)
	final int field1906;
	@ObfInfo(
		owner = "iq",
		name = "q",
		desc = "I"
	)
	final int field1907;

	static {
		field1903 = new class221(2, 0, 4);
		field1902 = new class221(0, 1, 2);
		field1904 = new class221(1, 2, 0);
	}

	@ObfInfo(
		owner = "iq",
		name = "<init>",
		desc = "(III)V"
	)
	class221(int var1, int var2, int var3) {
		this.field1906 = var1;
		this.field1905 = var2;
		this.field1907 = var3;
	}

	@ObfInfo(
		owner = "iq",
		name = "e",
		desc = "(FI)Z"
	)
	boolean method979(float var1) {
		return var1 >= (float)this.field1907;
	}

	@ObfInfo(
		owner = "iq",
		name = "h",
		desc = "(I)[Liq;"
	)
	static class221[] method976() {
		return new class221[]{field1902, field1904, field1903};
	}

	@ObfInfo(
		owner = "iq",
		name = "j",
		desc = "(CI)Z"
	)
	public static boolean method980(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfInfo(
		owner = "iq",
		name = "v",
		desc = "(Ljava/io/File;ZI)Z"
	)
	public static boolean method978(File var0, boolean var1) {
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

	@ObfInfo(
		owner = "iq",
		name = "ae",
		desc = "(ILbm;ZB)I"
	)
	static int method977(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTVARP_MOUSEBUTTONMODE) {
			boolean var4 = class386.field3248[--class161.field1227] == 1;
			class447.method2234(var4);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(
		owner = "iq",
		name = "lw",
		desc = "(III)V"
	)
	static void method981(int var0, int var1) {
		class204.method893(class138.field1119, var0, var1);
		class138.field1119 = null;
	}
}
