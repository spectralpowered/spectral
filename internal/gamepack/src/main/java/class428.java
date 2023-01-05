public abstract class class428 {
   int field3584;
   int field3585;
   public final class308 field3583;
   public final class308 field3586;

   class428(class308 var1, class308 var2) {
      this.field3583 = var1;
      this.field3586 = var2;
   }

   abstract class133 method2048();

   abstract int method2043();

   abstract int method2049();

   public abstract int method2047();

   boolean method2042(int var1, int var2) {
      if (this.method2045(var1, var2)) {
         return true;
      } else {
         return this.method2044(var1, var2);
      }
   }

   boolean method2046() {
      return this.method2047() >= 0;
   }

   boolean method2045(int var1, int var2) {
      if (!this.method2046()) {
         return false;
      } else {
         class194 var4 = class143.method776(this.method2047());
         int var5 = this.method2043();
         int var6 = this.method2049();
         switch(var4.field2018.field3331) {
         case 0:
            if (var1 < this.field3585 || var1 >= this.field3585 + var5) {
               return false;
            }
            break;
         case 1:
            if (var1 < this.field3585 - var5 / 2 || var1 > this.field3585 + var5 / 2) {
               return false;
            }
            break;
         case 2:
            if (var1 <= this.field3585 - var5 || var1 > this.field3585) {
               return false;
            }
         }

         switch(var4.field2032.field2186) {
         case 0:
            if (var2 > this.field3584 - var6 && var2 <= this.field3584) {
               break;
            }

            return false;
         case 1:
            if (var2 >= this.field3584 && var2 < var6 + this.field3584) {
               break;
            }

            return false;
         case 2:
            if (var2 < this.field3584 - var6 / 2 || var2 > var6 / 2 + this.field3584) {
               return false;
            }
         }

         return true;
      }
   }

   boolean method2044(int var1, int var2) {
      class133 var4 = this.method2048();
      if (null == var4) {
         return false;
      } else if (var1 >= this.field3585 - var4.field1482 / 2 && var1 <= this.field3585 + var4.field1482 / 2) {
         return var2 >= this.field3584 && var2 <= this.field3584 + var4.field1481;
      } else {
         return false;
      }
   }
}
