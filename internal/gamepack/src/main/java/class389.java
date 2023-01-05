public abstract class class389 {
   int field3275;
   int field3276;
   public final class464 field3274;
   public final class464 field3277;

   class389(class464 var1, class464 var2) {
      this.field3274 = var1;
      this.field3277 = var2;
   }

   abstract class23 method1911();

   abstract int method1906();

   abstract int method1912();

   public abstract int method1910();

   boolean method1905(int var1, int var2) {
      if (this.method1908(var1, var2)) {
         return true;
      } else {
         return this.method1907(var1, var2);
      }
   }

   boolean method1909() {
      return this.method1910() >= 0;
   }

   boolean method1908(int var1, int var2) {
      if (!this.method1909()) {
         return false;
      } else {
         class396 var4 = class25.method100(this.method1910());
         int var5 = this.method1906();
         int var6 = this.method1912();
         switch(var4.field3317.field2196) {
         case 0:
            if (var1 < this.field3276 || var1 >= this.field3276 + var5) {
               return false;
            }
            break;
         case 1:
            if (var1 < this.field3276 - var5 / 2 || var1 > this.field3276 + var5 / 2) {
               return false;
            }
            break;
         case 2:
            if (var1 <= this.field3276 - var5 || var1 > this.field3276) {
               return false;
            }
         }

         switch(var4.field3331.field2) {
         case 0:
            if (var2 > this.field3275 - var6 && var2 <= this.field3275) {
               break;
            }

            return false;
         case 1:
            if (var2 >= this.field3275 && var2 < var6 + this.field3275) {
               break;
            }

            return false;
         case 2:
            if (var2 < this.field3275 - var6 / 2 || var2 > var6 / 2 + this.field3275) {
               return false;
            }
         }

         return true;
      }
   }

   boolean method1907(int var1, int var2) {
      class23 var4 = this.method1911();
      if (null == var4) {
         return false;
      } else if (var1 >= this.field3276 - var4.field107 / 2 && var1 <= this.field3276 + var4.field107 / 2) {
         return var2 >= this.field3275 && var2 <= this.field3275 + var4.field106;
      } else {
         return false;
      }
   }
}
