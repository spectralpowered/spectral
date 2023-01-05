public class class244 extends class437 {
   class141 field2054 = new class141();
   class141 field2055 = new class141();
   int field2053 = 0;
   int field2056 = -1;

   public final synchronized void method1065(class437 var1) {
      this.field2055.method643(var1);
   }

   public final synchronized void method1066(class437 var1) {
      var1.method637();
   }

   void method1074() {
      if (this.field2053 > 0) {
         for(class320 var1 = (class320)this.field2054.method646(); var1 != null; var1 = (class320)this.field2054.method648()) {
            var1.field2553 -= this.field2053;
         }

         this.field2056 -= this.field2053;
         this.field2053 = 0;
      }

   }

   void method1068(class139 var1, class320 var2) {
      while(var1 != this.field2054.field1141 && ((class320)var1).field2553 <= var2.field2553) {
         var1 = var1.field1132;
      }

      class141.method644(var2, var1);
      this.field2056 = ((class320)this.field2054.field1141.field1132).field2553;
   }

   void method1069(class320 var1) {
      var1.method637();
      var1.method1615();
      class139 var2 = this.field2054.field1141.field1132;
      if (var2 == this.field2054.field1141) {
         this.field2056 = -1;
      } else {
         this.field2056 = ((class320)var2).field2553;
      }

   }

   protected class437 method2168() {
      return (class437)this.field2055.method646();
   }

   protected class437 method2171() {
      return (class437)this.field2055.method648();
   }

   protected int method2173() {
      return 0;
   }

   public final synchronized void method2169(int[] var1, int var2, int var3) {
      do {
         if (this.field2056 < 0) {
            this.method1072(var1, var2, var3);
            return;
         }

         if (this.field2053 + var3 < this.field2056) {
            this.field2053 += var3;
            this.method1072(var1, var2, var3);
            return;
         }

         int var4 = this.field2056 - this.field2053;
         this.method1072(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field2053 += var4;
         this.method1074();
         class320 var5 = (class320)this.field2054.method646();
         synchronized(var5) {
            int var7 = var5.method1616(this);
            if (var7 < 0) {
               var5.field2553 = 0;
               this.method1069(var5);
            } else {
               var5.field2553 = var7;
               this.method1068(var5.field1132, var5);
            }
         }
      } while(var3 != 0);

   }

   void method1072(int[] var1, int var2, int var3) {
      for(class437 var4 = (class437)this.field2055.method646(); var4 != null; var4 = (class437)this.field2055.method648()) {
         var4.method2170(var1, var2, var3);
      }

   }

   public final synchronized void method2172(int var1) {
      do {
         if (this.field2056 < 0) {
            this.method1075(var1);
            return;
         }

         if (this.field2053 + var1 < this.field2056) {
            this.field2053 += var1;
            this.method1075(var1);
            return;
         }

         int var2 = this.field2056 - this.field2053;
         this.method1075(var2);
         var1 -= var2;
         this.field2053 += var2;
         this.method1074();
         class320 var3 = (class320)this.field2054.method646();
         synchronized(var3) {
            int var5 = var3.method1616(this);
            if (var5 < 0) {
               var3.field2553 = 0;
               this.method1069(var3);
            } else {
               var3.field2553 = var5;
               this.method1068(var3.field1132, var3);
            }
         }
      } while(var1 != 0);

   }

   void method1075(int var1) {
      for(class437 var2 = (class437)this.field2055.method646(); var2 != null; var2 = (class437)this.field2055.method648()) {
         var2.method2172(var1);
      }

   }
}
