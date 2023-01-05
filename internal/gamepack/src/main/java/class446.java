import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class446 {
   static class38 field3678;
   boolean field3677;
   boolean field3679 = false;
   boolean field3680;
   boolean field3681 = false;
   double field3690 = 0.8D;
   int field3683;
   int field3684 = 127;
   int field3685 = 127;
   int field3686 = 127;
   int field3687 = -1;
   int field3689 = 1;
   String field3688 = null;
   final Map field3682 = new LinkedHashMap();

   class446() {
      this.method2200(true);
   }

   class446(class127 var1) {
      if (null != var1 && var1.field1072 != null) {
         int var2 = var1.method547();
         if (var2 >= 0 && var2 <= 10) {
            if (var1.method547() == 1) {
               this.field3677 = true;
            }

            if (var2 > 1) {
               this.field3680 = var1.method547() == 1;
            }

            if (var2 > 3) {
               this.field3689 = var1.method547();
            }

            if (var2 > 2) {
               int var3 = var1.method547();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method595();
                  int var6 = var1.method595();
                  this.field3682.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field3688 = var1.method554();
            }

            if (var2 > 5) {
               this.field3679 = var1.method553();
            }

            if (var2 > 6) {
               this.field3690 = (double)var1.method547() / 100.0D;
               this.field3684 = var1.method547();
               this.field3685 = var1.method547();
               this.field3686 = var1.method547();
            }

            if (var2 > 7) {
               this.field3687 = var1.method547();
            }

            if (var2 > 8) {
               this.field3681 = var1.method547() == 1;
            }

            if (var2 > 9) {
               this.field3683 = var1.method595();
            }
         } else {
            this.method2200(true);
         }
      } else {
         this.method2200(true);
      }

   }

   void method2200(boolean var1) {
   }

   class127 method2201() {
      class127 var2 = new class127(417, true);
      var2.method544(10);
      var2.method544(this.field3677 ? 1 : 0);
      var2.method544(this.field3680 ? 1 : 0);
      var2.method544(this.field3689);
      var2.method544(this.field3682.size());
      Iterator var3 = this.field3682.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var2.method534(((Integer)var4.getKey()).intValue());
         var2.method534(((Integer)var4.getValue()).intValue());
      }

      var2.method538(null != this.field3688 ? this.field3688 : "", (byte)116);
      var2.method537(this.field3679);
      var2.method544((int)(this.field3690 * 100.0D));
      var2.method544(this.field3684);
      var2.method544(this.field3685);
      var2.method544(this.field3686);
      var2.method544(this.field3687);
      var2.method544(this.field3681 ? 1 : 0);
      var2.method534(this.field3683);
      return var2;
   }

   void method2229(boolean var1) {
      this.field3677 = var1;
      class438.method2174();
   }

   boolean method2202() {
      return this.field3677;
   }

   void method2225(boolean var1) {
      this.field3679 = var1;
      class438.method2174();
   }

   boolean method2203() {
      return this.field3679;
   }

   void method2223(boolean var1) {
      this.field3680 = var1;
      class438.method2174();
   }

   boolean method2213() {
      return this.field3680;
   }

   void method2226(boolean var1) {
      this.field3681 = var1;
      class438.method2174();
   }

   void method2217() {
      this.method2226(!this.field3681);
   }

   boolean method2205() {
      return this.field3681;
   }

   void method2206(int var1) {
      this.field3683 = var1;
      class438.method2174();
   }

   int method2207() {
      return this.field3683;
   }

   void method2228(double var1) {
      this.field3690 = var1;
      class438.method2174();
   }

   double method2208() {
      return this.field3690;
   }

   void method2204(int var1) {
      this.field3684 = var1;
      class438.method2174();
   }

   int method2210() {
      return this.field3684;
   }

   void method2227(int var1) {
      this.field3685 = var1;
      class438.method2174();
   }

   int method2211() {
      return this.field3685;
   }

   void method2212(int var1) {
      this.field3686 = var1;
      class438.method2174();
   }

   int method2230() {
      return this.field3686;
   }

   void method2214(String var1) {
      this.field3688 = var1;
      class438.method2174();
   }

   String method2215() {
      return this.field3688;
   }

   void method2216(int var1) {
      this.field3687 = var1;
      class438.method2174();
   }

   int method2209() {
      return this.field3687;
   }

   void method2224(int var1) {
      this.field3689 = var1;
      class438.method2174();
   }

   int method2218() {
      return this.field3689;
   }

   void method2219(String var1, int var2) {
      int var4 = this.method2222(var1);
      if (this.field3682.size() >= 10 && !this.field3682.containsKey(var4)) {
         Iterator var5 = this.field3682.entrySet().iterator();
         var5.next();
         var5.remove();
      }

      this.field3682.put(var4, var2);
      class438.method2174();
   }

   boolean method2220(String var1) {
      int var3 = this.method2222(var1);
      return this.field3682.containsKey(var3);
   }

   int method2221(String var1) {
      int var3 = this.method2222(var1);
      return !this.field3682.containsKey(var3) ? 0 : ((Integer)this.field3682.get(var3)).intValue();
   }

   int method2222(String var1) {
      String var4 = var1.toLowerCase();
      int var5 = var4.length();
      int var6 = 0;

      for(int var7 = 0; var7 < var5; ++var7) {
         var6 = (var6 << 5) - var6 + var4.charAt(var7);
      }

      return var6;
   }

   static int method2232(int var0, int var1) {
      class201 var3 = (class201)class201.field1755.method791((long)var0);
      if (var3 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var3.field1754.length ? var3.field1754[var1] : 0;
      }
   }

   static final void method2231(class334 var0, int var1) {
      class241.method1043(var0.field2672, var0.field2608, var1);
   }
}
