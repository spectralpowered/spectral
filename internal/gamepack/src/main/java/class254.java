import java.io.IOException;

public class class254 extends class305 {
   static class32 field2640;
   final boolean field2639;

   public class254(boolean var1) {
      this.field2639 = var1;
   }

   int method1238(class185 var1, class185 var2) {
      if (var1.field1978 != 0) {
         if (var2.field1978 == 0) {
            return this.field2639 ? -1 : 1;
         }
      } else if (var2.field1978 != 0) {
         return this.field2639 ? 1 : -1;
      }

      return this.method1440(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method1238((class185)var1, (class185)var2);
   }

   static void method1237(class164 var0, class164 var1, boolean var2, int var3) {
      if (class52.field771) {
         if (var3 == 4) {
            class324.method1569(4);
         }

      } else {
         if (var3 == 0) {
            class313.method1518(var2);
         } else {
            class324.method1569(var3);
         }

         class362.method1736();
         byte[] var5 = var0.method884("title.jpg", "");
         class335.field3107 = class22.method119(var5);
         class328.field3060 = class335.field3107.method1530();
         int var6 = client.field512;
         if (0 != (var6 & 536870912)) {
            class52.field759 = class260.method1256(var1, "logo_deadman_mode", "");
         } else if (0 != (var6 & 1073741824)) {
            class52.field759 = class260.method1256(var1, "logo_seasonal_mode", "");
         } else if ((var6 & 256) != 0) {
            class52.field759 = class260.method1256(var1, "logo_speedrunning", "");
         } else {
            class52.field759 = class260.method1256(var1, "logo", "");
         }

         class83.field951 = class260.method1256(var1, "titlebox", "");
         class405.field3530 = class260.method1256(var1, "titlebutton", "");
         class291.field2795 = class260.method1256(var1, "titlebutton_large", "");
         class374.field3300 = class260.method1256(var1, "play_now_text", "");
         class260.method1256(var1, "titlebutton_wide42,1", "");
         int var8 = var1.method883("runes");
         int var9 = var1.method886(var8, "");
         class161[] var7 = class441.method2097(var1, var8, var9);
         class52.field758 = var7;
         var9 = var1.method883("title_mute");
         int var10 = var1.method886(var9, "");
         class161[] var14 = class441.method2097(var1, var9, var10);
         class329.field3068 = var14;
         class133.field1485 = class260.method1256(var1, "options_radio_buttons,0", "");
         class52.field785 = class260.method1256(var1, "options_radio_buttons,4", "");
         class137.field1495 = class260.method1256(var1, "options_radio_buttons,2", "");
         class52.field763 = class260.method1256(var1, "options_radio_buttons,6", "");
         class293.field2818 = class133.field1485.field1668;
         class62.field826 = class133.field1485.field1665;
         class381.field3327 = new class298(class52.field758);
         if (var2) {
            class52.field776 = "";
            class52.field772 = "";
            class52.field755 = new String[8];
            class52.field774 = 0;
         }

         class250.field2621 = 0;
         class492.field4116 = "";
         class52.field766 = true;
         class52.field781 = false;
         if (!class111.field1385.method1328()) {
            class230 var15 = class417.field3564;
            var10 = var15.method883("scape main");
            int var11 = var15.method886(var10, "");
            class126.field1458 = 1;
            class371.field3293 = var15;
            class329.field3069 = var10;
            class126.field1461 = var11;
            class219.field2420 = 255;
            class342.field3145 = false;
            class126.field1460 = 2;
         } else {
            class473.method2289(2);
         }

         if (null != class475.field3962) {
            try {
               class134 var16 = new class134(4);
               var16.method666(3);
               var16.method724(0);
               class475.field3962.method2051(var16.field1489, 0, 4);
            } catch (IOException var13) {
               try {
                  class475.field3962.method2054();
               } catch (Exception var12) {
                  ;
               }

               ++class475.field3951;
               class475.field3962 = null;
            }
         }

         class52.field771 = true;
         class52.field757 = (class391.field3440 - 765) / 2;
         class52.field777 = class52.field757 + 202;
         class432.field3605 = class52.field777 + 180;
         class335.field3107.method1537(class52.field757, 0);
         class328.field3060.method1537(382 + class52.field757, 0);
         class52.field759.method849(class52.field757 + 382 - class52.field759.field1668 / 2, 18);
      }
   }
}
