import java.text.DecimalFormat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class52 {
   static boolean field766;
   static boolean field771;
   static boolean field775;
   static boolean field781;
   static boolean field790;
   static class161 field759;
   static class161 field763;
   static class161 field785;
   static class161[] field758;
   static int field757 = 0;
   static int field760;
   static int field761;
   static int field764;
   static int field774;
   static int field777;
   static int field778;
   static int field780;
   static int field782;
   static int field783;
   static int field784;
   static String field756;
   static String field762;
   static String field765;
   static String field767;
   static String field769;
   static String field772;
   static String field776;
   static String field779;
   static String field787;
   static String field789;
   static String[] field755;
   static String[] field768;
   static String[] field770;
   static String[] field788;
   static long field773;
   static long field786;

   static {
      field777 = field757 + 202;
      field761 = 10;
      field762 = "";
      field760 = -1;
      field764 = 1;
      field780 = 0;
      field767 = "";
      field756 = "";
      field769 = "";
      field789 = "";
      field776 = "";
      field772 = "";
      field774 = 0;
      field755 = new String[8];
      field775 = false;
      field790 = false;
      field766 = true;
      field778 = 0;
      field779 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
      field787 = "1234567890";
      field781 = false;
      field782 = -1;
      field783 = 0;
      field784 = 0;
      new DecimalFormat("##0.00");
      new class177();
      field773 = -1L;
      field786 = -1L;
      field770 = new String[]{"title.jpg"};
      field768 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field788 = new String[]{"logo_speedrunning"};
   }

   public static void method293(int var0, int var1) {
      class465 var4 = (class465)class465.field3868.method161((long)var0);
      class465 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class465.field3867.method892(14, var0);
         var4 = new class465();
         if (null != var5) {
            var4.method2279(new class134(var5));
         }

         class465.field3868.method163(var4, (long)var0);
         var3 = var4;
      }

      int var9 = var3.field3869;
      int var6 = var3.field3870;
      int var7 = var3.field3871;
      int var8 = class484.field3994[var7 - var6];
      if (var1 < 0 || var1 > var8) {
         var1 = 0;
      }

      var8 <<= var6;
      class484.field3992[var9] = class484.field3992[var9] & ~var8 | var1 << var6 & var8;
   }

   static float[] method294(JSONObject var0, String var1) throws JSONException {
      float[] var3 = new float[4];

      try {
         JSONArray var4 = var0.getJSONArray(var1);
         var3[0] = (float)var4.optDouble(0, 0.0D);
         var3[1] = (float)var4.optDouble(1, 0.0D);
         var3[2] = (float)var4.optDouble(2, 1.0D);
         var3[3] = (float)var4.optDouble(3, 1.0D);
      } catch (JSONException var5) {
         var3[0] = 0.0F;
         var3[1] = 0.0F;
         var3[2] = 1.0F;
         var3[3] = 1.0F;
      }

      return var3;
   }

   public static class159 method295(int var0) {
      class159 var2 = (class159)class79.field913.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         class164 var4 = class79.field899;
         class164 var5 = class140.field1509;
         boolean var6 = true;
         byte[] var7 = var4.method875(var0 >> 16 & '\uffff', var0 & '\uffff');
         class159 var3;
         if (var7 == null) {
            var6 = false;
            var3 = null;
         } else {
            int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
            byte[] var9 = var5.method875(var8, 0);
            if (null == var9) {
               var6 = false;
            }

            if (!var6) {
               var3 = null;
            } else {
               try {
                  var3 = new class159(var4, var5, var0, false);
               } catch (Exception var11) {
                  var3 = null;
               }
            }
         }

         if (null != var3) {
            class79.field913.method163(var3, (long)var0);
         }

         return var3;
      }
   }
}
