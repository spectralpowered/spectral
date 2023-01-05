public class class424 {
   class202 field3579;
   int field3577 = 0;
   int field3578 = 0;

   class424(class202 var1, int var2, int var3) {
      this.field3579 = var1;
      this.field3577 = var2;
      this.field3578 = var3;
   }

   public String method2037() {
      if (this.method2031()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method2035());

         for(int var3 = this.field3577; var3 < this.field3578; ++var3) {
            class314 var4 = this.field3579.method1017(var3);
            var2.append(var4.field2982);
         }

         return var2.toString();
      }
   }

   boolean method2030(int var1) {
      return this.field3579.method1043() == 2 || this.field3579.method1043() == 1 && (!this.field3579.field2173 || this.field3578 - 1 != var1);
   }

   public boolean method2031() {
      return this.field3578 == this.field3577;
   }

   public int method2035() {
      return this.field3578 - this.field3577;
   }

   boolean method2032(class314 var1) {
      if (this.field3579.field2177 == 2) {
         return true;
      } else if (this.field3579.field2177 == 0) {
         return false;
      } else {
         return this.field3579.method1018() != var1;
      }
   }

   int method2036() {
      if (this.method2031()) {
         return 0;
      } else {
         class314 var2 = this.field3579.method1017(this.field3578 - 1);
         if (var2.field2982 == '\n') {
            return 0;
         } else if (this.method2032(var2)) {
            return this.field3579.field2174.field1007[42];
         } else {
            int var3 = this.field3579.field2174.field1007[var2.field2982];
            if (var3 == 0) {
               return var2.field2982 == '\t' ? this.field3579.field2174.field1007[32] * 3 : this.field3579.field2174.field1007[32];
            } else {
               return var3;
            }
         }
      }
   }

   public class28 method2033() {
      if (this.method2031()) {
         return new class28(Integer.valueOf(0), Integer.valueOf(0));
      } else {
         class314 var2 = this.field3579.method1017(this.field3578 - 1);
         return new class28(var2.field2984 + this.method2036(), var2.field2983);
      }
   }

   public class314 method2034(int var1) {
      return var1 >= 0 && var1 < this.method2035() ? this.field3579.method1017(this.field3577 + var1) : null;
   }
}
