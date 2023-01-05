public class class330 {
   float field3071;
   float field3072;
   float field3073;

   static {
      new class330(0.0F, 0.0F, 0.0F);
      new class330(1.0F, 1.0F, 1.0F);
      new class330(1.0F, 0.0F, 0.0F);
      new class330(0.0F, 1.0F, 0.0F);
      new class330(0.0F, 0.0F, 1.0F);
   }

   class330(float var1, float var2, float var3) {
      this.field3072 = var1;
      this.field3073 = var2;
      this.field3071 = var3;
   }

   final float method1598() {
      return (float)Math.sqrt((double)(this.field3072 * this.field3072 + this.field3073 * this.field3073 + this.field3071 * this.field3071));
   }

   public String toString() {
      return this.field3072 + ", " + this.field3073 + ", " + this.field3071;
   }
}
