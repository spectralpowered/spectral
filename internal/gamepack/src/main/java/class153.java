public class class153 extends class428 {
   final class133 field1605;
   final int field1606;
   final int field1607;
   final int field1608;

   class153(class308 var1, class308 var2, int var3, class133 var4) {
      super(var1, var2);
      this.field1608 = var3;
      this.field1605 = var4;
      class194 var5 = class143.method776(this.method2047());
      class319 var6 = var5.method998(false);
      if (null != var6) {
         this.field1606 = var6.field3014;
         this.field1607 = var6.field3013;
      } else {
         this.field1606 = 0;
         this.field1607 = 0;
      }

   }

   public int method2047() {
      return this.field1608;
   }

   class133 method2048() {
      return this.field1605;
   }

   int method2043() {
      return this.field1606;
   }

   int method2049() {
      return this.field1607;
   }

   static class320[] method805() {
      return new class320[]{class320.field3023, class320.field3020};
   }

   static final int method800(int var0, int var1) {
      int var3 = var1 * 57 + var0;
      var3 ^= var3 << 13;
      int var4 = (15731 * var3 * var3 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }
}
