import java.net.MalformedURLException;
import java.net.URL;

public class class102 {
   class140 field802;
   class266 field801;

   class102(String var1, class434 var2) {
      try {
         this.field802 = var2.method2151(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field802 = null;
      }

   }

   class102(class140 var1) {
      this.field802 = var1;
   }

   class266 method408() {
      if (this.field801 == null && this.field802 != null && this.field802.method640()) {
         if (this.field802.method638() != null) {
            this.field801 = class476.method2357(this.field802.method638());
         }

         this.field802 = null;
      }

      return this.field801;
   }

   public static int method413(int var0) {
      return var0 >>> 12;
   }

   static void method411(class38 var0, int var1) {
      if (var0.field194) {
         if (var1 <= class462.field3845) {
            throw new RuntimeException("");
         }

         if (var1 < class462.field3827) {
            class462.field3827 = var1;
         }
      } else {
         if (var1 >= class462.field3827) {
            throw new RuntimeException("");
         }

         if (var1 > class462.field3845) {
            class462.field3845 = var1;
         }
      }

      if (null != class378.field3191) {
         class378.field3191.field1070 = 5 + var1 * 8;
         if (class378.field3191.field1070 >= class378.field3191.field1072.length) {
            if (!var0.field194) {
               throw new RuntimeException("");
            }

            var0.method154();
         } else {
            int var3 = class378.field3191.method595();
            int var4 = class378.field3191.method595();
            var0.method164(var3, var4);
         }

      } else {
         class85.method352((class38)null, 255, 255, 0, (byte)0, true);
         class462.field3840[var1] = var0;
      }
   }

   static final void method409(class6 var0) {
      for(int var2 = 0; var2 < class268.field2223; ++var2) {
         int var3 = class268.field2227[var2];
         class380 var4 = client.field347[var3];
         int var5 = var0.method547();
         if ((var5 & 64) != 0) {
            var5 += var0.method547() << 8;
         }

         class265.method1220(var0, var3, var4, var5);
      }

   }

   static int method412(class120 var0) {
      if (11 != var0.field1026) {
         --class386.field3250;
         class386.field3248[++class161.field1227 - 1] = -1;
         return 1;
      } else {
         String var2 = class386.field3249[--class386.field3250];
         class386.field3248[++class161.field1227 - 1] = var0.method489(var2);
         return 1;
      }
   }

   static int method410(int var0, class461 var1, boolean var2) {
      return 2;
   }
}
