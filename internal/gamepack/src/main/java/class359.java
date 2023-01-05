import java.io.File;
import java.io.IOException;

public class class359 extends class108 {
   public static class164 field3206;
   static class112 field3207;
   static class112 field3209;
   static class31 field3204 = new class31(64);
   static int field3208;
   public boolean field3205 = false;

   void method1711(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method1712(var1, var3);
      }
   }

   void method1712(class134 var1, int var2) {
      if (var2 == 2) {
         this.field3205 = true;
      }

   }

   public static File method1710(String var0, String var1, int var2) {
      String var4 = var2 == 0 ? "" : "" + var2;
      class143.field1547 = new File(class131.field1474, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
      String var5 = null;
      String var6 = null;
      boolean var7 = false;
      File var20;
      if (class143.field1547.exists()) {
         try {
            class476 var8 = new class476(class143.field1547, "rw", 10000L);

            class134 var9;
            int var10;
            for(var9 = new class134((int)var8.method2305()); var9.field1487 < var9.field1489.length; var9.field1487 += var10) {
               var10 = var8.method2304(var9.field1489, var9.field1487, var9.field1489.length - var9.field1487);
               if (var10 == -1) {
                  throw new IOException();
               }
            }

            var9.field1487 = 0;
            var10 = var9.method669();
            if (var10 < 1 || var10 > 3) {
               throw new IOException("" + var10);
            }

            int var11 = 0;
            if (var10 > 1) {
               var11 = var9.method669();
            }

            if (var10 <= 2) {
               var5 = var9.method678();
               if (var11 == 1) {
                  var6 = var9.method678();
               }
            } else {
               var5 = var9.method718();
               if (var11 == 1) {
                  var6 = var9.method718();
               }
            }

            var8.method2302();
         } catch (IOException var17) {
            var17.printStackTrace();
         }

         if (null != var5) {
            var20 = new File(var5);
            if (!var20.exists()) {
               var5 = null;
            }
         }

         if (null != var5) {
            var20 = new File(var5, "test.dat");
            if (!class2.method7(var20, true)) {
               var5 = null;
            }
         }
      }

      if (null == var5 && var2 == 0) {
         label103:
         for(int var18 = 0; var18 < class137.field1497.length; ++var18) {
            for(int var21 = 0; var21 < class109.field1379.length; ++var21) {
               File var22 = new File(class109.field1379[var21] + class137.field1497[var18] + File.separatorChar + var0 + File.separatorChar);
               if (var22.exists() && class2.method7(new File(var22, "test.dat"), true)) {
                  var5 = var22.toString();
                  var7 = true;
                  break label103;
               }
            }
         }
      }

      if (var5 == null) {
         var5 = class131.field1474 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var7 = true;
      }

      if (var6 != null) {
         File var19 = new File(var6);
         var20 = new File(var5);

         try {
            File[] var23 = var19.listFiles();
            File[] var24 = var23;

            for(int var12 = 0; var12 < var24.length; ++var12) {
               File var13 = var24[var12];
               File var14 = new File(var20, var13.getName());
               boolean var15 = var13.renameTo(var14);
               if (!var15) {
                  throw new IOException();
               }
            }
         } catch (Exception var16) {
            var16.printStackTrace();
         }

         var7 = true;
      }

      if (var7) {
         class264.method1261(new File(var5), (File)null);
      }

      return new File(var5);
   }
}
