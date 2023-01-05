public class class376 {
   public int field3182;
   public int field3183;
   public int field3184;
   public int field3185;

   public class376(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public class376(int var1, int var2, int var3, int var4) {
      this.method1854(var1, var2);
      this.method1853(var3, var4);
   }

   public void method1854(int var1, int var2) {
      this.field3184 = var1;
      this.field3183 = var2;
   }

   public void method1853(int var1, int var2) {
      this.field3185 = var1;
      this.field3182 = var2;
   }

   public boolean method1855(int var1, int var2) {
      return var1 >= this.field3184 && var1 < this.field3185 + this.field3184 && var2 >= this.field3183 && var2 < this.field3183 + this.field3182;
   }

   public String toString() {
      return null;
   }

   public void method1860(class376 var1, class376 var2) {
      this.method1856(var1, var2);
      this.method1857(var1, var2);
   }

   void method1856(class376 var1, class376 var2) {
      var2.field3184 = this.field3184;
      var2.field3185 = this.field3185;
      if (this.field3184 < var1.field3184) {
         var2.field3185 = (var2.field3185 * 866368565 - (var1.field3184 * 866368565 - this.field3184 * 866368565)) * -1664174563;
         var2.field3184 = var1.field3184;
      }

      if (var2.method1858() > var1.method1858()) {
         var2.field3185 -= var2.method1858() - var1.method1858();
      }

      if (var2.field3185 < 0) {
         var2.field3185 = 0;
      }

   }

   void method1857(class376 var1, class376 var2) {
      var2.field3183 = this.field3183;
      var2.field3182 = this.field3182;
      if (this.field3183 < var1.field3183) {
         var2.field3182 = (var2.field3182 * 1582333657 - (var1.field3183 * 1582333657 - this.field3183 * 1582333657)) * -1804459671;
         var2.field3183 = var1.field3183;
      }

      if (var2.method1859() > var1.method1859()) {
         var2.field3182 -= var2.method1859() - var1.method1859();
      }

      if (var2.field3182 < 0) {
         var2.field3182 = 0;
      }

   }

   int method1858() {
      return this.field3184 + this.field3185;
   }

   int method1859() {
      return this.field3182 + this.field3183;
   }
}
