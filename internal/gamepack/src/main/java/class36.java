import java.net.MalformedURLException;
import java.net.URL;

public class class36 {
   class319 field351;
   class432 field352;

   class36(String var1, class163 var2) {
      try {
         this.field352 = var2.method861(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field352 = null;
      }

   }

   class36(class432 var1) {
      this.field352 = var1;
   }

   class319 method181() {
      if (this.field351 == null && this.field352 != null && this.field352.method2081()) {
         if (this.field352.method2079() != null) {
            this.field351 = class22.method119(this.field352.method2079());
         }

         this.field352 = null;
      }

      return this.field351;
   }

   public static int method186(int var0) {
      return var0 >>> 12;
   }

   static void method184(class230 var0, int var1) {
      if (var0.field2512) {
         if (var1 <= class475.field3963) {
            throw new RuntimeException("");
         }

         if (var1 < class475.field3945) {
            class475.field3945 = var1;
         }
      } else {
         if (var1 >= class475.field3945) {
            throw new RuntimeException("");
         }

         if (var1 > class475.field3963) {
            class475.field3963 = var1;
         }
      }

      if (null != class357.field3202) {
         class357.field3202.field1487 = 5 + var1 * 8;
         if (class357.field3202.field1487 >= class357.field3202.field1489.length) {
            if (!var0.field2512) {
               throw new RuntimeException("");
            }

            var0.method1150();
         } else {
            int var3 = class357.field3202.method717();
            int var4 = class357.field3202.method717();
            var0.method1159(var3, var4);
         }

      } else {
         class212.method1106((class230)null, 255, 255, 0, (byte)0, true);
         class475.field3958[var1] = var0;
      }
   }

   static final void method182(class421 var0) {
      for(int var2 = 0; var2 < class25.field182; ++var2) {
         int var3 = class25.field186[var2];
         class47 var4 = client.field551[var3];
         int var5 = var0.method669();
         if ((var5 & 64) != 0) {
            var5 += var0.method669() << 8;
         }

         class383.method1819(var0, var3, var4, var5);
      }

   }

   static int method185(class210 var0) {
      if (11 != var0.field2348) {
         --class150.field1582;
         class150.field1580[++class188.field1989 - 1] = -1;
         return 1;
      } else {
         String var2 = class150.field1581[--class150.field1582];
         class150.field1580[++class188.field1989 - 1] = var0.method1080(var2);
         return 1;
      }
   }

   static int method183(int var0, class472 var1, boolean var2) {
      return 2;
   }
}
