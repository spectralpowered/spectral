public final class class111 {
   class163 field832;
   class385 field830;
   class477 field828;
   int field829;
   int field831;

   public class111(int var1) {
      this(var1, var1);
   }

   public class111(int var1, int var2) {
      this.field828 = new class477();
      this.field829 = var1;
      this.field831 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field830 = new class385(var3);
   }

   public Object method441(long var1) {
      class88 var3 = (class88)this.field830.method1897(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.method375();
         if (var4 == null) {
            var3.method637();
            var3.method870();
            this.field831 += var3.field756;
            return null;
         } else {
            if (var3.method376()) {
               class66 var5 = new class66(var4, var3.field756);
               this.field830.method1896(var5, var3.field1134);
               this.field828.method2360(var5);
               var5.field1736 = 0L;
               var3.method637();
               var3.method870();
            } else {
               this.field828.method2360(var3);
               var3.field1736 = 0L;
            }

            return var4;
         }
      }
   }

   void method446(long var1) {
      class88 var3 = (class88)this.field830.method1897(var1);
      this.method442(var3);
   }

   void method442(class88 var1) {
      if (var1 != null) {
         var1.method637();
         var1.method870();
         this.field831 += var1.field756;
      }

   }

   public void method443(Object var1, long var2) {
      this.method444(var1, var2, 1);
   }

   public void method444(Object var1, long var2, int var4) {
      if (var4 > this.field829) {
         throw new IllegalStateException();
      } else {
         this.method446(var2);
         this.field831 -= var4;

         while(this.field831 < 0) {
            class88 var5 = (class88)this.field828.method2361();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.method376()) {
               ;
            }

            this.method442(var5);
            if (this.field832 != null) {
               this.field832.method763(var5.method375());
            }
         }

         class66 var6 = new class66(var1, var4);
         this.field830.method1896(var6, var2);
         this.field828.method2360(var6);
         var6.field1736 = 0L;
      }
   }

   public void method445(int var1) {
      for(class88 var2 = (class88)this.field828.method2362(); var2 != null; var2 = (class88)this.field828.method2365()) {
         if (var2.method376()) {
            if (var2.method375() == null) {
               var2.method637();
               var2.method870();
               this.field831 += var2.field756;
            }
         } else if (++var2.field1736 > (long)var1) {
            class281 var3 = new class281(var2.method375(), var2.field756);
            this.field830.method1896(var3, var2.field1134);
            class477.method2364(var3, var2);
            var2.method637();
            var2.method870();
         }
      }

   }

   public void method440() {
      this.field828.method2359();
      this.field830.method1894();
      this.field831 = this.field829;
   }
}
