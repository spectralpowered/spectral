public final class class279 {
   class148 field2761;
   class273 field2765;
   class376 field2763;
   int field2762;
   int field2764;

   public class279(int var1) {
      this(var1, var1);
   }

   public class279(int var1, int var2) {
      this.field2761 = new class148();
      this.field2762 = var1;
      this.field2764 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field2763 = new class376(var3);
   }

   public Object method1309(long var1) {
      class294 var3 = (class294)this.field2763.method1794(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.method1385();
         if (var4 == null) {
            var3.method567();
            var3.method574();
            this.field2764 += var3.field2822;
            return null;
         } else {
            if (var3.method1386()) {
               class439 var5 = new class439(var4, var3.field2822);
               this.field2763.method1793(var5, var3.field1361);
               this.field2761.method786(var5);
               var5.field1370 = 0L;
               var3.method567();
               var3.method574();
            } else {
               this.field2761.method786(var3);
               var3.field1370 = 0L;
            }

            return var4;
         }
      }
   }

   void method1314(long var1) {
      class294 var3 = (class294)this.field2763.method1794(var1);
      this.method1310(var3);
   }

   void method1310(class294 var1) {
      if (var1 != null) {
         var1.method567();
         var1.method574();
         this.field2764 += var1.field2822;
      }

   }

   public void method1311(Object var1, long var2) {
      this.method1312(var1, var2, 1);
   }

   public void method1312(Object var1, long var2, int var4) {
      if (var4 > this.field2762) {
         throw new IllegalStateException();
      } else {
         this.method1314(var2);
         this.field2764 -= var4;

         while(this.field2764 < 0) {
            class294 var5 = (class294)this.field2761.method787();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.method1386()) {
               ;
            }

            this.method1310(var5);
            if (this.field2765 != null) {
               this.field2765.method1300(var5.method1385());
            }
         }

         class439 var6 = new class439(var1, var4);
         this.field2763.method1793(var6, var2);
         this.field2761.method786(var6);
         var6.field1370 = 0L;
      }
   }

   public void method1313(int var1) {
      for(class294 var2 = (class294)this.field2761.method788(); var2 != null; var2 = (class294)this.field2761.method791()) {
         if (var2.method1386()) {
            if (var2.method1385() == null) {
               var2.method567();
               var2.method574();
               this.field2764 += var2.field2822;
            }
         } else if (++var2.field1370 > (long)var1) {
            class186 var3 = new class186(var2.method1385(), var2.field2822);
            this.field2763.method1793(var3, var2.field1361);
            class148.method790(var3, var2);
            var2.method567();
            var2.method574();
         }
      }

   }

   public void method1308() {
      this.field2761.method785();
      this.field2763.method1791();
      this.field2764 = this.field2762;
   }
}
