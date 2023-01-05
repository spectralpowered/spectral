import java.io.IOException;

public class class202 extends class392 {
   static class305 field1758;
   final boolean field1757;

   public class202(boolean var1) {
      this.field1757 = var1;
   }

   int method888(class69 var1, class69 var2) {
      if (var1.field627 != 0) {
         if (var2.field627 == 0) {
            return this.field1757 ? -1 : 1;
         }
      } else if (var2.field627 != 0) {
         return this.field1757 ? 1 : -1;
      }

      return this.method1918(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method888((class69)var1, (class69)var2);
   }

   static void method887(class274 var0, class274 var1, boolean var2, int var3) {
      if (class359.field3066) {
         if (var3 == 4) {
            class286.method1419(4);
         }

      } else {
         if (var3 == 0) {
            class301.method1454(var2);
         } else {
            class286.method1419(var3);
         }

         class162.method746();
         byte[] var5 = var0.method1357("title.jpg", "");
         class287.field2366 = class476.method2357(var5);
         class374.field3173 = class287.field2366.method1222();
         int var6 = client.field308;
         if (0 != (var6 & 536870912)) {
            class359.field3054 = class208.method906(var1, "logo_deadman_mode", "");
         } else if (0 != (var6 & 1073741824)) {
            class359.field3054 = class208.method906(var1, "logo_seasonal_mode", "");
         } else if ((var6 & 256) != 0) {
            class359.field3054 = class208.method906(var1, "logo_speedrunning", "");
         } else {
            class359.field3054 = class208.method906(var1, "logo", "");
         }

         class119.field878 = class208.method906(var1, "titlebox", "");
         class298.field2395 = class208.method906(var1, "titlebutton", "");
         class72.field651 = class208.method906(var1, "titlebutton_large", "");
         class332.field2604 = class208.method906(var1, "play_now_text", "");
         class208.method906(var1, "titlebutton_wide42,1", "");
         int var8 = var1.method1356("runes");
         int var9 = var1.method1359(var8, "");
         class344[] var7 = class400.method1972(var1, var8, var9);
         class359.field3053 = var7;
         var9 = var1.method1356("title_mute");
         int var10 = var1.method1359(var9, "");
         class344[] var14 = class400.method1972(var1, var9, var10);
         class342.field2746 = var14;
         class23.field110 = class208.method906(var1, "options_radio_buttons,0", "");
         class359.field3080 = class208.method906(var1, "options_radio_buttons,4", "");
         class306.field2455 = class208.method906(var1, "options_radio_buttons,2", "");
         class359.field3058 = class208.method906(var1, "options_radio_buttons,6", "");
         class223.field1919 = class23.field110.field2758;
         class349.field2890 = class23.field110.field2755;
         class312.field2467 = new class397(class359.field3053);
         if (var2) {
            class359.field3071 = "";
            class359.field3067 = "";
            class359.field3050 = new String[8];
            class359.field3069 = 0;
         }

         class398.field3358 = 0;
         class60.field603 = "";
         class359.field3061 = true;
         class359.field3076 = false;
         if (!class50.field574.method2213()) {
            class38 var15 = class317.field2494;
            var10 = var15.method1356("scape main");
            int var11 = var15.method1359(var10, "");
            class40.field201 = 1;
            class253.field2089 = var15;
            class342.field2747 = var10;
            class40.field204 = var11;
            class489.field4078 = 255;
            class463.field3847 = false;
            class40.field203 = 2;
         } else {
            class255.method1093(2);
         }

         if (null != class462.field3844) {
            try {
               class127 var16 = new class127(4);
               var16.method544(3);
               var16.method602(0);
               class462.field3844.method731(var16.field1072, 0, 4);
            } catch (IOException var13) {
               try {
                  class462.field3844.method734();
               } catch (Exception var12) {
                  ;
               }

               ++class462.field3833;
               class462.field3844 = null;
            }
         }

         class359.field3066 = true;
         class359.field3052 = (class427.field3529 - 765) / 2;
         class359.field3072 = class359.field3052 + 202;
         class140.field1136 = class359.field3072 + 180;
         class287.field2366.method1229(class359.field3052, 0);
         class374.field3173.method1229(382 + class359.field3052, 0);
         class359.field3054.method1745(class359.field3052 + 382 - class359.field3054.field2758 / 2, 18);
      }
   }
}
