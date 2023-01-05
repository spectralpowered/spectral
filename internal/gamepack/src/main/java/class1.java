public final class class1 {
   int field1;
   int field2;
   int field5;
   int field6;
   int[] field3 = new int[256];
   int[] field4 = new int[256];

   public class1(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field3[var2] = var1[var2];
      }

      this.method4();
   }

   public final int method2() {
      if (0 == this.field2) {
         this.method1();
         this.field2 = 256;
      }

      return this.field3[--this.field2];
   }

   public final int method3() {
      if (this.field2 == 0) {
         this.method1();
         this.field2 = 256;
      }

      return this.field3[this.field2 - 1];
   }

   final void method1() {
      this.field6 += ++this.field5;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.field4[var2];
         if ((var2 & 2) == 0) {
            if (0 == (var2 & 1)) {
               this.field1 ^= this.field1 << 13;
            } else {
               this.field1 ^= this.field1 >>> 6;
            }
         } else if ((var2 & 1) == 0) {
            this.field1 ^= this.field1 << 2;
         } else {
            this.field1 ^= this.field1 >>> 16;
         }

         this.field1 += this.field4[var2 + 128 & 255];
         int var4;
         this.field4[var2] = var4 = this.field6 + this.field1 + this.field4[(var3 & 1020) >> 2];
         this.field3[var2] = this.field6 = this.field4[(var4 >> 8 & 1020) >> 2] + var3;
      }

   }

   final void method4() {
      int var10 = -1640531527;
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field3[var2];
         var4 += this.field3[var2 + 1];
         var5 += this.field3[var2 + 2];
         var6 += this.field3[var2 + 3];
         var7 += this.field3[var2 + 4];
         var8 += this.field3[var2 + 5];
         var9 += this.field3[var2 + 6];
         var10 += this.field3[var2 + 7];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.field4[var2] = var3;
         this.field4[var2 + 1] = var4;
         this.field4[var2 + 2] = var5;
         this.field4[var2 + 3] = var6;
         this.field4[var2 + 4] = var7;
         this.field4[var2 + 5] = var8;
         this.field4[var2 + 6] = var9;
         this.field4[var2 + 7] = var10;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field4[var2];
         var4 += this.field4[var2 + 1];
         var5 += this.field4[var2 + 2];
         var6 += this.field4[var2 + 3];
         var7 += this.field4[var2 + 4];
         var8 += this.field4[var2 + 5];
         var9 += this.field4[var2 + 6];
         var10 += this.field4[var2 + 7];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.field4[var2] = var3;
         this.field4[var2 + 1] = var4;
         this.field4[var2 + 2] = var5;
         this.field4[var2 + 3] = var6;
         this.field4[var2 + 4] = var7;
         this.field4[var2 + 5] = var8;
         this.field4[var2 + 6] = var9;
         this.field4[var2 + 7] = var10;
      }

      this.method1();
      this.field2 = 256;
   }
}
