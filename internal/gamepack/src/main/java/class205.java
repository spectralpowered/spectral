public final class class205 {
   int field1774;
   int field1775;
   int field1778;
   int field1779;
   int[] field1776 = new int[256];
   int[] field1777 = new int[256];

   public class205(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field1776[var2] = var1[var2];
      }

      this.method898();
   }

   public final int method896() {
      if (0 == this.field1775) {
         this.method895();
         this.field1775 = 256;
      }

      return this.field1776[--this.field1775];
   }

   public final int method897() {
      if (this.field1775 == 0) {
         this.method895();
         this.field1775 = 256;
      }

      return this.field1776[this.field1775 - 1];
   }

   final void method895() {
      this.field1779 += ++this.field1778;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.field1777[var2];
         if ((var2 & 2) == 0) {
            if (0 == (var2 & 1)) {
               this.field1774 ^= this.field1774 << 13;
            } else {
               this.field1774 ^= this.field1774 >>> 6;
            }
         } else if ((var2 & 1) == 0) {
            this.field1774 ^= this.field1774 << 2;
         } else {
            this.field1774 ^= this.field1774 >>> 16;
         }

         this.field1774 += this.field1777[var2 + 128 & 255];
         int var4;
         this.field1777[var2] = var4 = this.field1779 + this.field1774 + this.field1777[(var3 & 1020) >> 2];
         this.field1776[var2] = this.field1779 = this.field1777[(var4 >> 8 & 1020) >> 2] + var3;
      }

   }

   final void method898() {
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
         var3 += this.field1776[var2];
         var4 += this.field1776[var2 + 1];
         var5 += this.field1776[var2 + 2];
         var6 += this.field1776[var2 + 3];
         var7 += this.field1776[var2 + 4];
         var8 += this.field1776[var2 + 5];
         var9 += this.field1776[var2 + 6];
         var10 += this.field1776[var2 + 7];
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
         this.field1777[var2] = var3;
         this.field1777[var2 + 1] = var4;
         this.field1777[var2 + 2] = var5;
         this.field1777[var2 + 3] = var6;
         this.field1777[var2 + 4] = var7;
         this.field1777[var2 + 5] = var8;
         this.field1777[var2 + 6] = var9;
         this.field1777[var2 + 7] = var10;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field1777[var2];
         var4 += this.field1777[var2 + 1];
         var5 += this.field1777[var2 + 2];
         var6 += this.field1777[var2 + 3];
         var7 += this.field1777[var2 + 4];
         var8 += this.field1777[var2 + 5];
         var9 += this.field1777[var2 + 6];
         var10 += this.field1777[var2 + 7];
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
         this.field1777[var2] = var3;
         this.field1777[var2 + 1] = var4;
         this.field1777[var2 + 2] = var5;
         this.field1777[var2 + 3] = var6;
         this.field1777[var2 + 4] = var7;
         this.field1777[var2 + 5] = var8;
         this.field1777[var2 + 6] = var9;
         this.field1777[var2 + 7] = var10;
      }

      this.method895();
      this.field1775 = 256;
   }
}
