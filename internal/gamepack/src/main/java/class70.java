import java.util.Calendar;
import java.util.Date;

@ObfInfo(
   name = "gt"
)
public class class70 extends class139 {
   @ObfInfo(
      owner = "gt",
      name = "dj",
      desc = "Z"
   )
   static boolean field634;
   @ObfInfo(
      owner = "gt",
      name = "q",
      desc = "Lkd;"
   )
   public class120 field633;
   @ObfInfo(
      owner = "gt",
      name = "m",
      desc = "I"
   )
   public int field630;
   @ObfInfo(
      owner = "gt",
      name = "x",
      desc = "I"
   )
   public int field631;
   @ObfInfo(
      owner = "gt",
      name = "v",
      desc = "I"
   )
   public int field632;

   @ObfInfo(
      owner = "gt",
      name = "<init>",
      desc = "(IIILkd;)V"
   )
   public class70(int var1, int var2, int var3, class120 var4) {
      this.field630 = var1;
      this.field632 = var2;
      this.field631 = var3;
      this.field633 = var4;
   }

   @ObfInfo(
      owner = "gt",
      name = "v",
      desc = "(III)I"
   )
   static int method309(int var0, int var1) {
      class201 var3 = (class201)class201.field1755.method791((long)var0);
      if (var3 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field1754.length; ++var5) {
            if (var3.field1753[var5] == var1) {
               var4 += var3.field1754[var5];
            }
         }

         return var4;
      }
   }

   @ObfInfo(
      owner = "gt",
      name = "v",
      desc = "([BI)V"
   )
   public static synchronized void method308(byte[] var0) {
      if (100 == var0.length && class355.field2927 < class355.field2922) {
         class355.field2925[++class355.field2927 - 1] = var0;
      } else if (5000 == var0.length && class355.field2919 < class355.field2917) {
         class355.field2926[++class355.field2919 - 1] = var0;
      } else if (var0.length == 10000 && class355.field2920 < class355.field2924) {
         class355.field2918[++class355.field2920 - 1] = var0;
      } else if (30000 == var0.length && class355.field2921 < class355.field2923) {
         class355.field2928[++class355.field2921 - 1] = var0;
      } else {
         if (null != class151.field1173) {
            for(int var2 = 0; var2 < class298.field2394.length; ++var2) {
               if (class298.field2394[var2] == var0.length && class119.field879[var2] < class151.field1173[var2].length) {
                  class151.field1173[var2][class119.field879[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }

   @ObfInfo(
      owner = "gt",
      name = "g",
      desc = "(IIIIIZB)Lrx;"
   )
   public static final class266 method310(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var7 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42);
      class266 var9;
      if (!var5) {
         var9 = (class266)class263.field2144.method394(var7);
         if (null != var9) {
            return var9;
         }
      }

      class263 var10 = class423.method2062(var0);
      if (var1 > 1 && null != var10.field2178) {
         int var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if (var1 >= var10.field2139[var12] && 0 != var10.field2139[var12]) {
               var11 = var10.field2178[var12];
            }
         }

         if (var11 != -1) {
            var10 = class423.method2062(var11);
         }
      }

      class470 var20 = var10.method1201(1);
      if (var20 == null) {
         return null;
      } else {
         class266 var21 = null;
         if (-1 != var10.field2181) {
            var21 = method310(var10.field2185, 10, 1, 0, 0, true);
            if (null == var21) {
               return null;
            }
         } else if (-1 != var10.field2169) {
            var21 = method310(var10.field2163, var1, var2, var3, 0, false);
            if (null == var21) {
               return null;
            }
         } else if (-1 != var10.field2193) {
            var21 = method310(var10.field2170, var1, 0, 0, 0, false);
            if (null == var21) {
               return null;
            }
         }

         int[] var13 = class162.field1233;
         int var14 = class162.field1232;
         int var15 = class162.field1231;
         int[] var16 = new int[4];
         class162.method744(var16);
         var9 = new class266(36, 32);
         class162.method748(var9.field2205, 36, 32);
         class162.method746();
         class341.method1709();
         class341.method1734(16, 16);
         class341.field2732 = false;
         if (var10.field2193 != -1) {
            var21.method1240(0, 0);
         }

         int var17 = var10.field2151;
         if (var5) {
            var17 = (int)((double)var17 * 1.5D);
         } else if (var2 == 2) {
            var17 = (int)((double)var17 * 1.04D);
         }

         int var18 = var17 * class341.field2726[var10.field2152] >> 16;
         int var19 = class341.field2744[var10.field2152] * var17 >> 16;
         var20.method2315();
         var20.method2310(0, var10.field2153, var10.field2160, var10.field2152, var10.field2155, var10.field2141 + var20.field2390 / 2 + var18, var19 + var10.field2141);
         if (var10.field2169 != -1) {
            var21.method1240(0, 0);
         }

         if (var2 >= 1) {
            var9.method1228(1);
         }

         if (var2 >= 2) {
            var9.method1228(16777215);
         }

         if (var3 != 0) {
            var9.method1253(var3);
         }

         class162.method748(var9.field2205, 36, 32);
         if (-1 != var10.field2181) {
            var21.method1240(0, 0);
         }

         if (var4 == 1 || var4 == 2 && 1 == var10.field2157) {
            class439.field3647.method2025(class486.method2388(var1), 0, 9, 16776960, 1);
         }

         if (!var5) {
            class263.field2144.method396(var9, var7);
         }

         class162.method748(var13, var14, var15);
         class162.method745(var16);
         class341.method1709();
         class341.field2732 = true;
         return var9;
      }
   }

   @ObfInfo(
      owner = "gt",
      name = "u",
      desc = "(I)Ljava/util/Date;"
   )
   static Date method307() {
      Calendar var1 = Calendar.getInstance();
      var1.set(2, 0);
      var1.set(5, 1);
      var1.set(1, 1900);
      return var1.getTime();
   }
}
