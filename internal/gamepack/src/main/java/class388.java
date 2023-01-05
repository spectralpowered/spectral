public class class388 extends class203 {
   int field3425;
   public boolean field3429;
   public byte[] field3426;
   public int field3427;
   public int field3428;

   class388(int var1, byte[] var2, int var3, int var4) {
      this.field3428 = var1;
      this.field3426 = var2;
      this.field3427 = var3;
      this.field3425 = var4;
   }

   class388(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field3428 = var1;
      this.field3426 = var2;
      this.field3427 = var3;
      this.field3425 = var4;
      this.field3429 = var5;
   }

   public class388 method1884(class119 var1) {
      this.field3426 = var1.method623(this.field3426);
      this.field3428 = var1.method622(this.field3428);
      if (this.field3427 == this.field3425) {
         this.field3427 = this.field3425 = var1.method621(this.field3427);
      } else {
         this.field3427 = var1.method621(this.field3427);
         this.field3425 = var1.method621(this.field3425);
         if (this.field3427 == this.field3425) {
            --this.field3427;
         }
      }

      return this;
   }
}
