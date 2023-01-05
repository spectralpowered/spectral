public class class421 extends class134 {
   protected static boolean field3573;
   static final int[] field3572 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   class1 field3571;
   int field3570;

   public class421(int var1) {
      super(var1);
   }

   public void method2018(int[] var1) {
      this.field3571 = new class1(var1);
   }

   public void method2017(class1 var1) {
      this.field3571 = var1;
   }

   public void method2021(int var1) {
      super.field1489[++super.field1487 - 1] = (byte)(var1 + this.field3571.method2());
   }

   public int method2019() {
      return super.field1489[++super.field1487 - 1] - this.field3571.method2() & 255;
   }

   public boolean method2020() {
      int var2 = super.field1489[super.field1487] - this.field3571.method3() & 255;
      return var2 >= 128;
   }

   public int method2025() {
      int var2 = super.field1489[++super.field1487 - 1] - this.field3571.method2() & 255;
      return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field1489[++super.field1487 - 1] - this.field3571.method2() & 255);
   }

   public void method2016(byte[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var5 + var2] = (byte)(super.field1489[++super.field1487 - 1] - this.field3571.method2());
      }

   }

   public void method2022() {
      this.field3570 = super.field1487 * 8;
   }

   public int method2024(int var1) {
      int var3 = this.field3570 >> 3;
      int var4 = 8 - (this.field3570 & 7);
      int var5 = 0;

      for(this.field3570 += var1; var1 > var4; var4 = 8) {
         var5 += (super.field1489[var3++] & field3572[var4]) << var1 - var4;
         var1 -= var4;
      }

      if (var4 == var1) {
         var5 += super.field1489[var3] & field3572[var4];
      } else {
         var5 += super.field1489[var3] >> var4 - var1 & field3572[var1];
      }

      return var5;
   }

   public void method2023() {
      super.field1487 = (7 + this.field3570) / 8;
   }

   public int method2026(int var1) {
      return var1 * 8 - this.field3570;
   }
}
