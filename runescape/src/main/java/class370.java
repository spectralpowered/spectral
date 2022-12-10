import java.util.ArrayList;
import java.util.HashMap;

public class class370 {
	public static ArrayList field4421;
	static byte[][] field4407;
	static byte[][] field4417;
	static byte[][] field4418;
	static byte[][] field4420;
	static int field4406;
	static int field4410;
	static int field4411;
	static int field4412;
	static int field4413;
	static int field4414;
	static int field4415;
	static int field4419;

	static {
		field4419 = 0;
		field4410 = 0;
		field4411 = 0;
		field4412 = 0;
		field4413 = 1000;
		field4406 = 250;
		field4415 = 100;
		field4414 = 50;
		field4417 = new byte[1000][];
		field4418 = new byte[250][];
		field4407 = new byte[100][];
		field4420 = new byte[50][];
		field4421 = new ArrayList();
		field4421.clear();
		field4421.add(100);
		field4421.add(5000);
		field4421.add(10000);
		field4421.add(30000);
		new HashMap();
	}

	class370() throws Throwable {
		throw new Error();
	}

	public static synchronized byte[] method6943(int var0, boolean var1) {
		byte[] var3;
		if ((var0 == 100 || var0 < 100 && var1) && field4419 > 0) {
			var3 = field4417[--field4419];
			field4417[field4419] = null;
			return var3;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && field4410 > 0) {
			var3 = field4418[--field4410];
			field4418[field4410] = null;
			return var3;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && field4411 > 0) {
			var3 = field4407[--field4411];
			field4407[field4411] = null;
			return var3;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4412 > 0) {
			var3 = field4420[--field4412];
			field4420[field4412] = null;
			return var3;
		} else {
			int var5;
			if (null != class218.field2643) {
				for (var5 = 0; var5 < class209.field2424.length; ++var5) {
					if ((var0 == class209.field2424[var5] || var0 < class209.field2424[var5] && var1) && class219.field2656[var5] > 0) {
						byte[] var4 = class218.field2643[var5][--class219.field2656[var5]];
						class218.field2643[var5][class219.field2656[var5]] = null;
						return var4;
					}
				}
			}

			if (var1 && null != class209.field2424) {
				for (var5 = 0; var5 < class209.field2424.length; ++var5) {
					if (var0 <= class209.field2424[var5] && class219.field2656[var5] < class218.field2643[var5].length) {
						return new byte[class209.field2424[var5]];
					}
				}
			}

			return new byte[var0];
		}
	}

	public static synchronized byte[] method1620(int var0) {
		return method6943(var0, false);
	}
}
