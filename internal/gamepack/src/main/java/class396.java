public class class396 extends class183 {
   class397 field3480 = new class397();
   class397 field3481 = new class397();
   int field3479 = 0;
   int field3482 = -1;

   public final synchronized void method1923(class183 var1) {
      this.field3481.method1931(var1);
   }

   public final synchronized void method1924(class183 var1) {
      var1.method567();
   }

   void method1928() {
      if (this.field3479 > 0) {
         for(class17 var1 = (class17)this.field3480.method1934(); var1 != null; var1 = (class17)this.field3480.method1936()) {
            var1.field136 -= this.field3479;
         }

         this.field3482 -= this.field3479;
         this.field3479 = 0;
      }

   }

   void method1925(class106 var1, class17 var2) {
      while(var1 != this.field3480.field3484 && ((class17)var1).field136 <= var2.field136) {
         var1 = var1.field1359;
      }

      class397.method1932(var2, var1);
      this.field3482 = ((class17)this.field3480.field3484.field1359).field136;
   }

   void method1926(class17 var1) {
      var1.method567();
      var1.method99();
      class106 var2 = this.field3480.field3484.field1359;
      if (var2 == this.field3480.field3484) {
         this.field3482 = -1;
      } else {
         this.field3482 = ((class17)var2).field136;
      }

   }

   protected class183 method955() {
      return (class183)this.field3481.method1934();
   }

   protected class183 method958() {
      return (class183)this.field3481.method1936();
   }

   protected int method960() {
      return 0;
   }

   public final synchronized void method956(int[] var1, int var2, int var3) {
      do {
         if (this.field3482 < 0) {
            this.method1927(var1, var2, var3);
            return;
         }

         if (this.field3479 + var3 < this.field3482) {
            this.field3479 += var3;
            this.method1927(var1, var2, var3);
            return;
         }

         int var4 = this.field3482 - this.field3479;
         this.method1927(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field3479 += var4;
         this.method1928();
         class17 var5 = (class17)this.field3480.method1934();
         synchronized(var5) {
            int var7 = var5.method100(this);
            if (var7 < 0) {
               var5.field136 = 0;
               this.method1926(var5);
            } else {
               var5.field136 = var7;
               this.method1925(var5.field1359, var5);
            }
         }
      } while(var3 != 0);

   }

   void method1927(int[] var1, int var2, int var3) {
      for(class183 var4 = (class183)this.field3481.method1934(); var4 != null; var4 = (class183)this.field3481.method1936()) {
         var4.method957(var1, var2, var3);
      }

   }

   public final synchronized void method959(int var1) {
      do {
         if (this.field3482 < 0) {
            this.method1929(var1);
            return;
         }

         if (this.field3479 + var1 < this.field3482) {
            this.field3479 += var1;
            this.method1929(var1);
            return;
         }

         int var2 = this.field3482 - this.field3479;
         this.method1929(var2);
         var1 -= var2;
         this.field3479 += var2;
         this.method1928();
         class17 var3 = (class17)this.field3480.method1934();
         synchronized(var3) {
            int var5 = var3.method100(this);
            if (var5 < 0) {
               var3.field136 = 0;
               this.method1926(var3);
            } else {
               var3.field136 = var5;
               this.method1925(var3.field1359, var3);
            }
         }
      } while(var1 != 0);

   }

   void method1929(int var1) {
      for(class183 var2 = (class183)this.field3481.method1934(); var2 != null; var2 = (class183)this.field3481.method1936()) {
         var2.method959(var1);
      }

   }
}
