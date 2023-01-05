public final class class336 {
   static class336[] field3109 = new class336[0];
   static int field3110 = 100;
   static int field3112;
   float field3108;
   float field3111;
   float field3113;
   float field3114;

   static {
      field3109 = new class336[100];
      field3112 = 0;
      new class336();
   }

   class336() {
      this.method1622();
   }

   public void method1623() {
      class336[] var2 = field3109;
      synchronized(field3109) {
         if (field3112 < field3110 - 1) {
            field3109[++field3112 - 1] = this;
         }

      }
   }

   void method1619(float var1, float var2, float var3, float var4) {
      this.field3111 = var1;
      this.field3108 = var2;
      this.field3113 = var3;
      this.field3114 = var4;
   }

   public void method1620(float var1, float var2, float var3, float var4) {
      float var6 = (float)Math.sin((double)(var4 * 0.5F));
      float var7 = (float)Math.cos((double)(var4 * 0.5F));
      this.field3111 = var6 * var1;
      this.field3108 = var6 * var2;
      this.field3113 = var3 * var6;
      this.field3114 = var7;
   }

   final void method1622() {
      this.field3113 = 0.0F;
      this.field3108 = 0.0F;
      this.field3111 = 0.0F;
      this.field3114 = 1.0F;
   }

   public final void method1621(class336 var1) {
      this.method1619(this.field3113 * var1.field3108 + this.field3111 * var1.field3114 + var1.field3111 * this.field3114 - this.field3108 * var1.field3113, this.field3114 * var1.field3108 + (var1.field3114 * this.field3108 - var1.field3111 * this.field3113) + var1.field3113 * this.field3111, this.field3108 * var1.field3111 + var1.field3114 * this.field3113 - var1.field3108 * this.field3111 + this.field3114 * var1.field3113, var1.field3114 * this.field3114 - this.field3111 * var1.field3111 - var1.field3108 * this.field3108 - this.field3113 * var1.field3113);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class336)) {
         return false;
      } else {
         class336 var2 = (class336)var1;
         return this.field3111 == var2.field3111 && this.field3108 == var2.field3108 && var2.field3113 == this.field3113 && this.field3114 == var2.field3114;
      }
   }

   public int hashCode() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.field3111 + var2 * 31.0F;
      var2 = this.field3108 + var2 * 31.0F;
      var2 = var2 * 31.0F + this.field3113;
      var2 = this.field3114 + var2 * 31.0F;
      return (int)var2;
   }

   public String toString() {
      return this.field3111 + "," + this.field3108 + "," + this.field3113 + "," + this.field3114;
   }
}
