public class class82 extends class490 {
   int field667;
   public boolean field671;
   public byte[] field668;
   public int field669;
   public int field670;

   class82(int var1, byte[] var2, int var3, int var4) {
      this.field670 = var1;
      this.field668 = var2;
      this.field669 = var3;
      this.field667 = var4;
   }

   class82(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field670 = var1;
      this.field668 = var2;
      this.field669 = var3;
      this.field667 = var4;
      this.field671 = var5;
   }

   public class82 method339(class129 var1) {
      this.field668 = var1.method614(this.field668);
      this.field670 = var1.method613(this.field670);
      if (this.field669 == this.field667) {
         this.field669 = this.field667 = var1.method612(this.field669);
      } else {
         this.field669 = var1.method612(this.field669);
         this.field667 = var1.method612(this.field667);
         if (this.field669 == this.field667) {
            --this.field669;
         }
      }

      return this;
   }
}
