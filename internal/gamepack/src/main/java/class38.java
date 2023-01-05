import java.util.Calendar;
import java.util.Date;

public class class38 extends class106 {
   static boolean field363;
   public class210 field362;
   public int field359;
   public int field360;
   public int field361;

   public class38(int var1, int var2, int var3, class210 var4) {
      this.field359 = var1;
      this.field361 = var2;
      this.field360 = var3;
      this.field362 = var4;
   }

   static int method213(int var0, int var1) {
      class233 var3 = (class233)class233.field2522.method545((long)var0);
      if (var3 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field2521.length; ++var5) {
            if (var3.field2520[var5] == var1) {
               var4 += var3.field2521[var5];
            }
         }

         return var4;
      }
   }

   public static synchronized void method212(byte[] var0) {
      if (100 == var0.length && class461.field3847 < class461.field3842) {
         class461.field3845[++class461.field3847 - 1] = var0;
      } else if (5000 == var0.length && class461.field3839 < class461.field3837) {
         class461.field3846[++class461.field3839 - 1] = var0;
      } else if (var0.length == 10000 && class461.field3840 < class461.field3844) {
         class461.field3838[++class461.field3840 - 1] = var0;
      } else if (30000 == var0.length && class461.field3841 < class461.field3843) {
         class461.field3848[++class461.field3841 - 1] = var0;
      } else {
         if (null != class211.field2368) {
            for(int var2 = 0; var2 < class405.field3529.length; ++var2) {
               if (class405.field3529[var2] == var0.length && class83.field952[var2] < class211.field2368[var2].length) {
                  class211.field2368[var2][class83.field952[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }

   public static final class319 method214(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var7 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42);
      class319 var9;
      if (!var5) {
         var9 = (class319)class458.field3761.method161(var7);
         if (null != var9) {
            return var9;
         }
      }

      class458 var10 = class272.method1294(var0);
      if (var1 > 1 && null != var10.field3795) {
         int var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if (var1 >= var10.field3756[var12] && 0 != var10.field3756[var12]) {
               var11 = var10.field3795[var12];
            }
         }

         if (var11 != -1) {
            var10 = class272.method1294(var11);
         }
      }

      class491 var20 = var10.method2170(1);
      if (var20 == null) {
         return null;
      } else {
         class319 var21 = null;
         if (-1 != var10.field3798) {
            var21 = method214(var10.field3802, 10, 1, 0, 0, true);
            if (null == var21) {
               return null;
            }
         } else if (-1 != var10.field3786) {
            var21 = method214(var10.field3780, var1, var2, var3, 0, false);
            if (null == var21) {
               return null;
            }
         } else if (-1 != var10.field3810) {
            var21 = method214(var10.field3787, var1, 0, 0, 0, false);
            if (null == var21) {
               return null;
            }
         }

         int[] var13 = class362.field3243;
         int var14 = class362.field3242;
         int var15 = class362.field3241;
         int[] var16 = new int[4];
         class362.method1734(var16);
         var9 = new class319(36, 32);
         class362.method1738(var9.field3019, 36, 32);
         class362.method1736();
         class234.method1167();
         class234.method1192(16, 16);
         class234.field2532 = false;
         if (var10.field3810 != -1) {
            var21.method1548(0, 0);
         }

         int var17 = var10.field3768;
         if (var5) {
            var17 = (int)((double)var17 * 1.5D);
         } else if (var2 == 2) {
            var17 = (int)((double)var17 * 1.04D);
         }

         int var18 = var17 * class234.field2526[var10.field3769] >> 16;
         int var19 = class234.field2544[var10.field3769] * var17 >> 16;
         var20.method2374();
         var20.method2369(0, var10.field3770, var10.field3777, var10.field3769, var10.field3772, var10.field3758 + var20.field2554 / 2 + var18, var19 + var10.field3758);
         if (var10.field3786 != -1) {
            var21.method1548(0, 0);
         }

         if (var2 >= 1) {
            var9.method1536(1);
         }

         if (var2 >= 2) {
            var9.method1536(16777215);
         }

         if (var3 != 0) {
            var9.method1561(var3);
         }

         class362.method1738(var9.field3019, 36, 32);
         if (-1 != var10.field3798) {
            var21.method1548(0, 0);
         }

         if (var4 == 1 || var4 == 2 && 1 == var10.field3774) {
            class115.field1411.method518(class393.method1919(var1), 0, 9, 16776960, 1);
         }

         if (!var5) {
            class458.field3761.method163(var9, var7);
         }

         class362.method1738(var13, var14, var15);
         class362.method1735(var16);
         class234.method1167();
         class234.field2532 = true;
         return var9;
      }
   }

   static Date method211() {
      Calendar var1 = Calendar.getInstance();
      var1.set(2, 0);
      var1.set(5, 1);
      var1.set(1, 1900);
      return var1.getTime();
   }
}
