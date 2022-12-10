import java.util.ArrayList;
import java.util.Calendar;

public class class69 {
	static boolean field584;
	static boolean field587;
	static class64[] field583;
	static int field581;
	static int field582;
	static int field593;
	static int[] field577;
	static int[] field579;
	static int[] field589;
	static int[][] field578;
	static String[] field580;
	static ArrayList field586;
	static Calendar field575;
	static final double field590;
	static final String[] field585;

	static int method1364(int var0, int var1) {
		class193 var4 = (class193)class193.field2120.method5356((long)var0);
		class193 var3;
		if (null != var4) {
			var3 = var4;
		} else {
			byte[] var11 = class193.field2119.method6374(4, var0);
			var4 = new class193();
			if (null != var11) {
				var4.method3753(new class467(var11), var0);
			}

			var4.method3752();
			class193.field2120.method5364(var4, (long)var0);
			var3 = var4;
		}

		if (null == var3) {
			return var1;
		} else if (var3.field2124 >= 0) {
			return var3.field2124 | -16777216;
		} else if (var3.field2122 >= 0) {
			int var5 = class293.method5669(class221.field2672.method4673(var3.field2122), 96);
			return class221.field2685[var5] | -16777216;
		} else if (var3.field2121 == 16711935) {
			return var1;
		} else {
			int var6 = var3.field2127;
			int var7 = var3.field2125;
			int var8 = var3.field2126;
			if (var8 > 179) {
				var7 /= 2;
			}

			if (var8 > 192) {
				var7 /= 2;
			}

			if (var8 > 217) {
				var7 /= 2;
			}

			if (var8 > 243) {
				var7 /= 2;
			}

			int var9 = var8 / 2 + (var6 / 4 << 10) + (var7 / 32 << 7);
			int var10 = class293.method5669(var9, 96);
			return class221.field2685[var10] | -16777216;
		}
	}

	static {
		field577 = new int[5];
		field578 = new int[5][5000];
		field579 = new int[1000];
		field580 = new String[1000];
		field582 = 0;
		field583 = new class64[50];
		field575 = Calendar.getInstance();
		field585 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field584 = false;
		field587 = false;
		field586 = new ArrayList();
		field593 = 0;
		field590 = Math.log(2.0D);
	}

	class69() throws Throwable {
		throw new Error();
	}

	public static void method2874(class80 var0) {
		class125.method2388(var0, 500000, 475000);
	}

	static int method25(int var0, class65 var1, boolean var2) {
		return 2;
	}

	static int method2092(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	static int method6266(int var0) {
		return (int)((Math.log((double)var0) / field590 - 7.0D) * 256.0D);
	}

	static int method6104(int var0, class65 var1, boolean var2) {
		return 2;
	}

	static int method2945(int var0, class65 var1, boolean var2) {
		return 2;
	}

	static int method3560(int var0, class65 var1, boolean var2) {
		return 2;
	}

	static int method2062(int var0, class65 var1, boolean var2) {
		return 2;
	}

	static void method2090(int var0, class311 var1, boolean var2) {
		class254 var4 = client.method3499().method7702(var0);
		int var5 = class142.field1370.field847;
		int var6 = class151.field1447 + (class142.field1370.field1012 >> 7);
		int var7 = class388.field4509 + (class142.field1370.field948 >> 7);
		class311 var8 = new class311(var5, var6, var7);
		client.method3499().method7732(var4, var8, var1, var2);
	}

	static Object method6514(class460 var0) {
		if (null == var0) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field4889) {
			case 0:
				return field579[--class94.field920];
			case 1:
				return field580[--field581];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	static Object method2709(int var0) {
		return method6514((class460)class78.method1584(class460.method8211(), var0));
	}
}
