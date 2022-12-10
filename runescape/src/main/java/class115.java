import java.io.IOException;

public class class115 extends class409 {
	static class404 field1161;
	final boolean field1160;

	public class115(boolean var1) {
		this.field1160 = var1;
	}

	int method2201(class391 var1, class391 var2) {
		if (var1.field4520 != 0) {
			if (var2.field4520 == 0) {
				return this.field1160 ? -1 : 1;
			}
		} else if (var2.field4520 != 0) {
			return this.field1160 ? 1 : -1;
		}

		return this.method7584(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.method2201((class391)var1, (class391)var2);
	}

	static void method2200(class337 var0, class337 var1, boolean var2, int var3) {
		if (class73.field647) {
			if (var3 == 4) {
				class73.method113(4);
			}

		} else {
			if (var3 == 0) {
				class120.method2300(var2);
			} else {
				class73.method113(var3);
			}

			class478.method8676();
			byte[] var5 = var0.method6322("title.jpg", "");
			class90.field860 = class47.method6425(var5);
			class2.field12 = class90.field860.method8839();
			int var6 = client.field1777;
			if (0 != (var6 & 536870912)) {
				class73.field631 = class62.method1193(var1, "logo_deadman_mode", "");
			} else if (0 != (var6 & 1073741824)) {
				class73.field631 = class62.method1193(var1, "logo_seasonal_mode", "");
			} else if ((var6 & 256) != 0) {
				class73.field631 = class62.method1193(var1, "logo_speedrunning", "");
			} else {
				class73.field631 = class62.method1193(var1, "logo", "");
			}

			class219.field2653 = class62.method1193(var1, "titlebox", "");
			class209.field2425 = class62.method1193(var1, "titlebutton", "");
			class302.field3652 = class62.method1193(var1, "titlebutton_large", "");
			class156.field1484 = class62.method1193(var1, "play_now_text", "");
			class62.method1193(var1, "titlebutton_wide42,1", "");
			int var8 = var1.method6319("runes");
			int var9 = var1.method6326(var8, "");
			class469[] var7 = class248.method4895(var1, var8, var9);
			class73.field630 = var7;
			var9 = var1.method6319("title_mute");
			int var10 = var1.method6326(var9, "");
			class469[] var12 = class248.method4895(var1, var9, var10);
			class127.field1267 = var12;
			class243.field2900 = class62.method1193(var1, "options_radio_buttons,0", "");
			class73.field661 = class62.method1193(var1, "options_radio_buttons,4", "");
			class92.field882 = class62.method1193(var1, "options_radio_buttons,2", "");
			class73.field639 = class62.method1193(var1, "options_radio_buttons,6", "");
			class114.field1153 = class243.field2900.field4928;
			class241.field2892 = class243.field2900.field4925;
			class151.field1450 = new class93(class73.field630);
			if (var2) {
				class73.field652 = "";
				class73.field648 = "";
				class73.field627 = new String[8];
				class73.field650 = 0;
			}

			class133.field1314 = 0;
			class154.field1469 = "";
			class73.field642 = true;
			class73.field657 = false;
			if (!class186.field2040.method1790()) {
				class326 var13 = class174.field1635;
				var10 = var13.method6319("scape main");
				int var11 = var13.method6326(var10, "");
				class300.field3632 = 1;
				class312.field3717 = var13;
				class127.field1269 = var10;
				class300.field3635 = var11;
				class468.field4918 = 255;
				class141.field1359 = false;
				class300.field3634 = 2;
			} else {
				class300.method6996(2);
			}

			if (null != class334.field4215) {
				try {
					class467 var17 = new class467(4);
					var17.method8323(3);
					var17.method8516(0);
					class334.field4215.method7605(var17.field4917, 0, 4);
				} catch (IOException var16) {
					try {
						class334.field4215.method7609();
					} catch (Exception var15) {
					}

					++class334.field4203;
					class334.field4215 = null;
				}
			}

			class73.field647 = true;
			class73.field629 = (class205.field2337 - 765) / 2;
			class73.field653 = class73.field629 + 202;
			class117.field1174 = class73.field653 + 180;
			class90.field860.method8849(class73.field629, 0);
			class2.field12.method8849(382 + class73.field629, 0);
			class73.field631.method8587(class73.field629 + 382 - class73.field631.field4928 / 2, 18);
		}
	}
}
