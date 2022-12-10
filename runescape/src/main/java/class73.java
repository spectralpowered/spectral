import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class class73 {
	static boolean field642;
	static boolean field647;
	static boolean field651;
	static boolean field657;
	static boolean field667;
	static class469 field631;
	static class469 field639;
	static class469 field661;
	static class469[] field630;
	static int field629;
	static int field636;
	static int field637;
	static int field640;
	static int field650;
	static int field653;
	static int field654;
	static int field656;
	static int field658;
	static int field659;
	static int field660;
	static String field628;
	static String field638;
	static String field641;
	static String field643;
	static String field645;
	static String field648;
	static String field652;
	static String field655;
	static String field664;
	static String field666;
	static String[] field627;
	static String[] field644;
	static String[] field646;
	static String[] field665;
	static long field649;
	static long field662;

	static {
		field629 = 0;
		field653 = field629 + 202;
		field637 = 10;
		field638 = "";
		field636 = -1;
		field640 = 1;
		field656 = 0;
		field643 = "";
		field628 = "";
		field645 = "";
		field666 = "";
		field652 = "";
		field648 = "";
		field650 = 0;
		field627 = new String[8];
		field651 = false;
		field667 = false;
		field642 = true;
		field654 = 0;
		field655 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field664 = "1234567890";
		field657 = false;
		field658 = -1;
		field659 = 0;
		field660 = 0;
		new DecimalFormat("##0.00");
		new class113();
		field649 = -1L;
		field662 = -1L;
		field646 = new String[]{"title.jpg"};
		field644 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field665 = new String[]{"logo_speedrunning"};
	}

	public static void method1439(int var0, int var1) {
		class203 var4 = (class203)class203.field2322.method5356((long)var0);
		class203 var3;
		if (null != var4) {
			var3 = var4;
		} else {
			byte[] var9 = class203.field2321.method6374(14, var0);
			var4 = new class203();
			if (null != var9) {
				var4.method3995(new class467(var9));
			}

			class203.field2322.method5364(var4, (long)var0);
			var3 = var4;
		}

		int var5 = var3.field2323;
		int var6 = var3.field2324;
		int var7 = var3.field2325;
		int var8 = class305.field3664[var7 - var6];
		if (var1 < 0 || var1 > var8) {
			var1 = 0;
		}

		var8 <<= var6;
		class305.field3661[var5] = class305.field3661[var5] & ~var8 | var1 << var6 & var8;
	}

	class73() throws Throwable {
		throw new Error();
	}

	public static class153 method1470(int var0) {
		class153 var2 = (class153)class183.field2008.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			class337 var4 = class183.field1993;
			class337 var5 = class122.field1213;
			boolean var6 = true;
			byte[] var7 = var4.method6309(var0 >> 16 & 65535, var0 & 65535);
			class153 var3;
			if (var7 == null) {
				var6 = false;
				var3 = null;
			} else {
				int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
				byte[] var9 = var5.method6309(var8, 0);
				if (null == var9) {
					var6 = false;
				}

				if (!var6) {
					var3 = null;
				} else {
					try {
						var3 = new class153(var4, var5, var0, false);
					} catch (Exception var11) {
						var3 = null;
					}
				}
			}

			if (null != var3) {
				class183.field2008.method5364(var3, (long)var0);
			}

			return var3;
		}
	}

	static boolean method7469(Date var0) {
		Date var2 = method3991();
		return var0.after(var2);
	}

	static Date method3991() {
		Calendar var1 = Calendar.getInstance();
		var1.set(2, 0);
		var1.set(5, 1);
		var1.set(1, 1900);
		return var1.getTime();
	}

	static void method1945(String var0, String var1, String var2) {
		method113(7);
		method2926(var0, var1, var2);
	}

	static void method2926(String var0, String var1, String var2) {
		field628 = var0;
		field645 = var1;
		field666 = var2;
	}

	static void method349(int var0) {
		method113(14);
		field636 = var0;
	}

	static void method4720() {
		if (class39.method507()) {
			field657 = true;
			field659 = 0;
			field660 = 0;
		}

	}

	static void method7224() {
		method113(24);
		method2926(class321.field3991, class321.field4003, class321.field3960);
	}

	static void method113(int var0) {
		if (var0 != field656) {
			field656 = var0;
		}
	}

	static int method1227() {
		return field656;
	}
}
