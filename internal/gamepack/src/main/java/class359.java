import java.text.DecimalFormat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class359 {
   static boolean field3061;
   static boolean field3066;
   static boolean field3070;
   static boolean field3076;
   static boolean field3085;
   static class344 field3054;
   static class344 field3058;
   static class344 field3080;
   static class344[] field3053;
   static int field3052 = 0;
   static int field3055;
   static int field3056;
   static int field3059;
   static int field3069;
   static int field3072;
   static int field3073;
   static int field3075;
   static int field3077;
   static int field3078;
   static int field3079;
   static String field3051;
   static String field3057;
   static String field3060;
   static String field3062;
   static String field3064;
   static String field3067;
   static String field3071;
   static String field3074;
   static String field3082;
   static String field3084;
   static String[] field3050;
   static String[] field3063;
   static String[] field3065;
   static String[] field3083;
   static long field3068;
   static long field3081;

   static {
      field3072 = field3052 + 202;
      field3056 = 10;
      field3057 = "";
      field3055 = -1;
      field3059 = 1;
      field3075 = 0;
      field3062 = "";
      field3051 = "";
      field3064 = "";
      field3084 = "";
      field3071 = "";
      field3067 = "";
      field3069 = 0;
      field3050 = new String[8];
      field3070 = false;
      field3085 = false;
      field3061 = true;
      field3073 = 0;
      field3074 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
      field3082 = "1234567890";
      field3076 = false;
      field3077 = -1;
      field3078 = 0;
      field3079 = 0;
      new DecimalFormat("##0.00");
      new class22();
      field3068 = -1L;
      field3081 = -1L;
      field3065 = new String[]{"title.jpg"};
      field3063 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field3083 = new String[]{"logo_speedrunning"};
   }

   public static void method1789(int var0, int var1) {
      class457 var4 = (class457)class457.field3779.method394((long)var0);
      class457 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class457.field3778.method1365(14, var0);
         var4 = new class457();
         if (null != var5) {
            var4.method2256(new class127(var5));
         }

         class457.field3779.method396(var4, (long)var0);
         var3 = var4;
      }

      int var9 = var3.field3780;
      int var6 = var3.field3781;
      int var7 = var3.field3782;
      int var8 = class291.field2375[var7 - var6];
      if (var1 < 0 || var1 > var8) {
         var1 = 0;
      }

      var8 <<= var6;
      class291.field2373[var9] = class291.field2373[var9] & ~var8 | var1 << var6 & var8;
   }

   static float[] method1790(JSONObject var0, String var1) throws JSONException {
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

   public static class357 method1791(int var0) {
      class357 var2 = (class357)class242.field2042.method394((long)var0);
      if (null != var2) {
         return var2;
      } else {
         class274 var4 = class242.field2028;
         class274 var5 = class309.field2462;
         boolean var6 = true;
         byte[] var7 = var4.method1348(var0 >> 16 & '\uffff', var0 & '\uffff');
         class357 var3;
         if (var7 == null) {
            var6 = false;
            var3 = null;
         } else {
            int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
            byte[] var9 = var5.method1348(var8, 0);
            if (null == var9) {
               var6 = false;
            }

            if (!var6) {
               var3 = null;
            } else {
               try {
                  var3 = new class357(var4, var5, var0, false);
               } catch (Exception var11) {
                  var3 = null;
               }
            }
         }

         if (null != var3) {
            class242.field2042.method396(var3, (long)var0);
         }

         return var3;
      }
   }
}
