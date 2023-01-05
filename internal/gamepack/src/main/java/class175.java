public final class class175 {
   static class175[] field1311 = new class175[0];
   static int field1312 = 100;
   static int field1314;
   float field1310;
   float field1313;
   float field1315;
   float field1316;

   static {
      field1311 = new class175[100];
      field1314 = 0;
      new class175();
   }

   class175() {
      this.method808();
   }

   public void method809() {
      class175[] var2 = field1311;
      synchronized(field1311) {
         if (field1314 < field1312 - 1) {
            field1311[++field1314 - 1] = this;
         }

      }
   }

   void method805(float var1, float var2, float var3, float var4) {
      this.field1313 = var1;
      this.field1310 = var2;
      this.field1315 = var3;
      this.field1316 = var4;
   }

   public void method806(float var1, float var2, float var3, float var4) {
      float var6 = (float)Math.sin((double)(var4 * 0.5F));
      float var7 = (float)Math.cos((double)(var4 * 0.5F));
      this.field1313 = var6 * var1;
      this.field1310 = var6 * var2;
      this.field1315 = var3 * var6;
      this.field1316 = var7;
   }

   final void method808() {
      this.field1315 = 0.0F;
      this.field1310 = 0.0F;
      this.field1313 = 0.0F;
      this.field1316 = 1.0F;
   }

   public final void method807(class175 var1) {
      this.method805(this.field1315 * var1.field1310 + this.field1313 * var1.field1316 + var1.field1313 * this.field1316 - this.field1310 * var1.field1315, this.field1316 * var1.field1310 + (var1.field1316 * this.field1310 - var1.field1313 * this.field1315) + var1.field1315 * this.field1313, this.field1310 * var1.field1313 + var1.field1316 * this.field1315 - var1.field1310 * this.field1313 + this.field1316 * var1.field1315, var1.field1316 * this.field1316 - this.field1313 * var1.field1313 - var1.field1310 * this.field1310 - this.field1315 * var1.field1315);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class175)) {
         return false;
      } else {
         class175 var2 = (class175)var1;
         return this.field1313 == var2.field1313 && this.field1310 == var2.field1310 && var2.field1315 == this.field1315 && this.field1316 == var2.field1316;
      }
   }

   public int hashCode() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.field1313 + var2 * 31.0F;
      var2 = this.field1310 + var2 * 31.0F;
      var2 = var2 * 31.0F + this.field1315;
      var2 = this.field1316 + var2 * 31.0F;
      return (int)var2;
   }

   public String toString() {
      return this.field1313 + "," + this.field1310 + "," + this.field1315 + "," + this.field1316;
   }
}
