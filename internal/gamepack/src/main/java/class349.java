public class class349 {
   public int field3175;
   public int field3176;
   public int field3177;
   public int field3178;

   public class349(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public class349(int var1, int var2, int var3, int var4) {
      this.method1676(var1, var2);
      this.method1675(var3, var4);
   }

   public void method1676(int var1, int var2) {
      this.field3177 = var1;
      this.field3176 = var2;
   }

   public void method1675(int var1, int var2) {
      this.field3178 = var1;
      this.field3175 = var2;
   }

   public boolean method1677(int var1, int var2) {
      return var1 >= this.field3177 && var1 < this.field3178 + this.field3177 && var2 >= this.field3176 && var2 < this.field3176 + this.field3175;
   }

   public String toString() {
      return null;
   }

   public void method1682(class349 var1, class349 var2) {
      this.method1678(var1, var2);
      this.method1679(var1, var2);
   }

   void method1678(class349 var1, class349 var2) {
      var2.field3177 = this.field3177;
      var2.field3178 = this.field3178;
      if (this.field3177 < var1.field3177) {
         var2.field3178 = (var2.field3178 * 866368565 - (var1.field3177 * 866368565 - this.field3177 * 866368565)) * -1664174563;
         var2.field3177 = var1.field3177;
      }

      if (var2.method1680() > var1.method1680()) {
         var2.field3178 -= var2.method1680() - var1.method1680();
      }

      if (var2.field3178 < 0) {
         var2.field3178 = 0;
      }

   }

   void method1679(class349 var1, class349 var2) {
      var2.field3176 = this.field3176;
      var2.field3175 = this.field3175;
      if (this.field3176 < var1.field3176) {
         var2.field3175 = (var2.field3175 * 1582333657 - (var1.field3176 * 1582333657 - this.field3176 * 1582333657)) * -1804459671;
         var2.field3176 = var1.field3176;
      }

      if (var2.method1681() > var1.method1681()) {
         var2.field3175 -= var2.method1681() - var1.method1681();
      }

      if (var2.field3175 < 0) {
         var2.field3175 = 0;
      }

   }

   int method1680() {
      return this.field3177 + this.field3178;
   }

   int method1681() {
      return this.field3175 + this.field3176;
   }
}
