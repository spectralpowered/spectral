public class class239 {
   class321 field2018;
   int field2016 = 0;
   int field2017 = 0;

   class239(class321 var1, int var2, int var3) {
      this.field2018 = var1;
      this.field2016 = var2;
      this.field2017 = var3;
   }

   public String method1041() {
      if (this.method1035()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method1039());

         for(int var3 = this.field2016; var3 < this.field2017; ++var3) {
            class45 var4 = this.field2018.method1617(var3);
            var2.append(var4.field544);
         }

         return var2.toString();
      }
   }

   boolean method1034(int var1) {
      return this.field2018.method1643() == 2 || this.field2018.method1643() == 1 && (!this.field2018.field2557 || this.field2017 - 1 != var1);
   }

   public boolean method1035() {
      return this.field2017 == this.field2016;
   }

   public int method1039() {
      return this.field2017 - this.field2016;
   }

   boolean method1036(class45 var1) {
      if (this.field2018.field2561 == 2) {
         return true;
      } else if (this.field2018.field2561 == 0) {
         return false;
      } else {
         return this.field2018.method1618() != var1;
      }
   }

   int method1040() {
      if (this.method1035()) {
         return 0;
      } else {
         class45 var2 = this.field2018.method1617(this.field2017 - 1);
         if (var2.field544 == '\n') {
            return 0;
         } else if (this.method1036(var2)) {
            return this.field2018.field2558.field3450[42];
         } else {
            int var3 = this.field2018.field2558.field3450[var2.field544];
            if (var3 == 0) {
               return var2.field544 == '\t' ? this.field2018.field2558.field3450[32] * 3 : this.field2018.field2558.field3450[32];
            } else {
               return var3;
            }
         }
      }
   }

   public class296 method1037() {
      if (this.method1035()) {
         return new class296(Integer.valueOf(0), Integer.valueOf(0));
      } else {
         class45 var2 = this.field2018.method1617(this.field2017 - 1);
         return new class296(var2.field546 + this.method1040(), var2.field545);
      }
   }

   public class45 method1038(int var1) {
      return var1 >= 0 && var1 < this.method1039() ? this.field2018.method1617(this.field2016 + var1) : null;
   }
}
