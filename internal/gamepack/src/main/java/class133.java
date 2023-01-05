public class class133 {
   float field1106;
   float field1107;
   float field1108;

   static {
      new class133(0.0F, 0.0F, 0.0F);
      new class133(1.0F, 1.0F, 1.0F);
      new class133(1.0F, 0.0F, 0.0F);
      new class133(0.0F, 1.0F, 0.0F);
      new class133(0.0F, 0.0F, 1.0F);
   }

   class133(float var1, float var2, float var3) {
      this.field1107 = var1;
      this.field1108 = var2;
      this.field1106 = var3;
   }

   final float method626() {
      return (float)Math.sqrt((double)(this.field1107 * this.field1107 + this.field1108 * this.field1108 + this.field1106 * this.field1106));
   }

   public String toString() {
      return this.field1107 + ", " + this.field1108 + ", " + this.field1106;
   }
}
