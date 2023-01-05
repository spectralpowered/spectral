public class class181 {
   float field1937;
   float field1938;
   float field1939;
   float field1940;
   float field1941;
   float field1942;
   float field1943;
   float field1944;
   float field1945;
   float field1946;
   float field1947;
   float field1948;

   static {
      new class181();
   }

   class181() {
      this.method949();
   }

   void method949() {
      this.field1940 = 0.0F;
      this.field1947 = 0.0F;
      this.field1948 = 0.0F;
      this.field1944 = 0.0F;
      this.field1943 = 0.0F;
      this.field1942 = 0.0F;
      this.field1946 = 0.0F;
      this.field1939 = 0.0F;
      this.field1938 = 0.0F;
      this.field1937 = 1.0F;
      this.field1941 = 1.0F;
      this.field1945 = 1.0F;
   }

   void method947(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.field1938;
      float var6 = this.field1941;
      float var7 = this.field1944;
      float var8 = this.field1947;
      this.field1938 = var5 * var3 - var4 * this.field1939;
      this.field1939 = var3 * this.field1939 + var5 * var4;
      this.field1941 = var3 * var6 - var4 * this.field1942;
      this.field1942 = var6 * var4 + this.field1942 * var3;
      this.field1944 = var3 * var7 - this.field1937 * var4;
      this.field1937 = var7 * var4 + this.field1937 * var3;
      this.field1947 = var8 * var3 - var4 * this.field1940;
      this.field1940 = var3 * this.field1940 + var4 * var8;
   }

   void method948(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.field1945;
      float var6 = this.field1946;
      float var7 = this.field1943;
      float var8 = this.field1948;
      this.field1945 = var4 * this.field1939 + var5 * var3;
      this.field1939 = var3 * this.field1939 - var5 * var4;
      this.field1946 = var4 * this.field1942 + var3 * var6;
      this.field1942 = this.field1942 * var3 - var6 * var4;
      this.field1943 = var4 * this.field1937 + var7 * var3;
      this.field1937 = var3 * this.field1937 - var4 * var7;
      this.field1948 = this.field1940 * var4 + var8 * var3;
      this.field1940 = this.field1940 * var3 - var8 * var4;
   }

   void method951(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.field1945;
      float var6 = this.field1946;
      float var7 = this.field1943;
      float var8 = this.field1948;
      this.field1945 = var5 * var3 - var4 * this.field1938;
      this.field1938 = var5 * var4 + this.field1938 * var3;
      this.field1946 = var6 * var3 - var4 * this.field1941;
      this.field1941 = var6 * var4 + this.field1941 * var3;
      this.field1943 = var7 * var3 - this.field1944 * var4;
      this.field1944 = var3 * this.field1944 + var4 * var7;
      this.field1948 = var3 * var8 - this.field1947 * var4;
      this.field1947 = var8 * var4 + this.field1947 * var3;
   }

   void method950(float var1, float var2, float var3) {
      this.field1948 += var1;
      this.field1947 += var2;
      this.field1940 += var3;
   }

   public String toString() {
      return this.field1945 + "," + this.field1946 + "," + this.field1943 + "," + this.field1948 + "\n" + this.field1938 + "," + this.field1941 + "," + this.field1944 + "," + this.field1947 + "\n" + this.field1939 + "," + this.field1942 + "," + this.field1937 + "," + this.field1940;
   }
}
