import java.math.BigInteger;

public class class134 extends class106 {
   static int[] field1488 = new int[256];
   static long[] field1486;
   public byte[] field1489;
   public int field1487;

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field1488[var1] = var0;
      }

      field1486 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if (1L == (var4 & 1L)) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field1486[var2] = var4;
      }

   }

   public class134(int var1) {
      this.field1489 = class233.method1163(var1);
      this.field1487 = 0;
   }

   public class134(int var1, boolean var2) {
      this.field1489 = class461.method2265(var1, var2);
   }

   public class134(byte[] var1) {
      this.field1489 = var1;
      this.field1487 = 0;
   }

   public void method654() {
      if (null != this.field1489) {
         class38.method212(this.field1489);
      }

      this.field1489 = null;
   }

   public void method666(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)var1;
   }

   public void method655(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 8);
      this.field1489[++this.field1487 - 1] = (byte)var1;
   }

   public void method724(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 16);
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 8);
      this.field1489[++this.field1487 - 1] = (byte)var1;
   }

   public void method656(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 24);
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 16);
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 8);
      this.field1489[++this.field1487 - 1] = (byte)var1;
   }

   public void method657(long var1) {
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 40));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 32));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 24));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 16));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 8));
      this.field1489[++this.field1487 - 1] = (byte)((int)var1);
   }

   public void method658(long var1) {
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 56));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 48));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 40));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 32));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 24));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 16));
      this.field1489[++this.field1487 - 1] = (byte)((int)(var1 >> 8));
      this.field1489[++this.field1487 - 1] = (byte)((int)var1);
   }

   public void method659(boolean var1) {
      this.method666(var1 ? 1 : 0);
   }

   public void method660(String var1, byte var2) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         if (var2 <= -1) {
            throw new IllegalStateException();
         } else {
            throw new IllegalArgumentException("");
         }
      } else {
         this.field1487 += class316.method1521(var1, 0, var1.length(), this.field1489, this.field1487);
         this.field1489[++this.field1487 - 1] = 0;
      }
   }

   public void method726(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field1489[++this.field1487 - 1] = 0;
         this.field1487 += class316.method1521(var1, 0, var1.length(), this.field1489, this.field1487);
         this.field1489[++this.field1487 - 1] = 0;
      }
   }

   public void method661(CharSequence var1) {
      int var3 = class414.method2002(var1);
      this.field1489[++this.field1487 - 1] = 0;
      this.method711(var3);
      this.field1487 += class111.method581(this.field1489, this.field1487, var1);
   }

   public void method662(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var2 + var3; ++var5) {
         this.field1489[++this.field1487 - 1] = var1[var5];
      }

   }

   public void method663(class134 var1) {
      this.method662(var1.field1489, 0, var1.field1487);
   }

   public void method664(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.field1489[this.field1487 - var1 - 4] = (byte)(var1 >> 24);
         this.field1489[this.field1487 - var1 - 3] = (byte)(var1 >> 16);
         this.field1489[this.field1487 - var1 - 2] = (byte)(var1 >> 8);
         this.field1489[this.field1487 - var1 - 1] = (byte)var1;
      }
   }

   public void method665(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.field1489[this.field1487 - var1 - 2] = (byte)(var1 >> 8);
         this.field1489[this.field1487 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method708(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.field1489[this.field1487 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method667(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.method666(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.method655(var1 + '耀');
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method711(int var1) {
      if (0 != (var1 & -128)) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.method666(var1 >>> 28 | 128);
               }

               this.method666(var1 >>> 21 | 128);
            }

            this.method666(var1 >>> 14 | 128);
         }

         this.method666(var1 >>> 7 | 128);
      }

      this.method666(var1 & 127);
   }

   public int method669() {
      return this.field1489[++this.field1487 - 1] & 255;
   }

   public byte method670() {
      return this.field1489[++this.field1487 - 1];
   }

   public int method671() {
      this.field1487 += 2;
      return (this.field1489[this.field1487 - 1] & 255) + ((this.field1489[this.field1487 - 2] & 255) << 8);
   }

   public int method672() {
      this.field1487 += 2;
      int var2 = ((this.field1489[this.field1487 - 2] & 255) << 8) + (this.field1489[this.field1487 - 1] & 255);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method673() {
      this.field1487 += 3;
      return (this.field1489[this.field1487 - 1] & 255) + ((this.field1489[this.field1487 - 2] & 255) << 8) + ((this.field1489[this.field1487 - 3] & 255) << 16);
   }

   public int method717() {
      this.field1487 += 4;
      return ((this.field1489[this.field1487 - 2] & 255) << 8) + ((this.field1489[this.field1487 - 4] & 255) << 24) + ((this.field1489[this.field1487 - 3] & 255) << 16) + (this.field1489[this.field1487 - 1] & 255);
   }

   public long method720() {
      long var2 = (long)this.method717() & 4294967295L;
      long var4 = (long)this.method717() & 4294967295L;
      return (var2 << 32) + var4;
   }

   public float method674() {
      return Float.intBitsToFloat(this.method717());
   }

   public boolean method675() {
      return (this.method669() & 1) == 1;
   }

   public String method676() {
      if (0 == this.field1489[this.field1487]) {
         ++this.field1487;
         return null;
      } else {
         return this.method677();
      }
   }

   public String method677() {
      int var2 = this.field1487;

      while(this.field1489[++this.field1487 - 1] != 0) {
         ;
      }

      int var3 = this.field1487 - var2 - 1;
      return var3 == 0 ? "" : class165.method896(this.field1489, var2, var3);
   }

   public String method678() {
      byte var2 = this.field1489[++this.field1487 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.field1487;

         while(this.field1489[++this.field1487 - 1] != 0) {
            ;
         }

         int var4 = this.field1487 - var3 - 1;
         return var4 == 0 ? "" : class165.method896(this.field1489, var3, var4);
      }
   }

   public String method718() {
      byte var2 = this.field1489[++this.field1487 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.method710();
         if (this.field1487 + var3 > this.field1489.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var5 = this.field1489;
            int var6 = this.field1487;
            char[] var7 = new char[var3];
            int var8 = 0;
            int var9 = var6;

            int var12;
            for(int var10 = var3 + var6; var9 < var10; var7[var8++] = (char)var12) {
               int var11 = var5[var9++] & 255;
               if (var11 < 128) {
                  if (var11 == 0) {
                     var12 = 65533;
                  } else {
                     var12 = var11;
                  }
               } else if (var11 < 192) {
                  var12 = 65533;
               } else if (var11 < 224) {
                  if (var9 < var10 && (var5[var9] & 192) == 128) {
                     var12 = (var11 & 31) << 6 | var5[var9++] & 63;
                     if (var12 < 128) {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else if (var11 < 240) {
                  if (var9 + 1 < var10 && 128 == (var5[var9] & 192) && (var5[var9 + 1] & 192) == 128) {
                     var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                     if (var12 < 2048) {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else if (var11 < 248) {
                  if (var9 + 2 < var10 && (var5[var9] & 192) == 128 && 128 == (var5[var9 + 1] & 192) && 128 == (var5[var9 + 2] & 192)) {
                     var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                     if (var12 >= 65536 && var12 <= 1114111) {
                        var12 = 65533;
                     } else {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else {
                  var12 = 65533;
               }
            }

            String var4 = new String(var7, 0, var8);
            this.field1487 += var3;
            return var4;
         }
      }
   }

   public void method679(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.field1489[++this.field1487 - 1];
      }

   }

   public int method680() {
      int var2 = this.field1489[this.field1487] & 255;
      return var2 < 128 ? this.method669() - 64 : this.method671() - '쀀';
   }

   public int method681() {
      int var2 = this.field1489[this.field1487] & 255;
      return var2 < 128 ? this.method669() : this.method671() - '耀';
   }

   public int method727() {
      int var2 = this.field1489[this.field1487] & 255;
      return var2 < 128 ? this.method669() - 1 : this.method671() - '老';
   }

   public int method723() {
      int var2 = 0;

      int var3;
      for(var3 = this.method681(); var3 == 32767; var3 = this.method681()) {
         var2 += 32767;
      }

      var2 += var3;
      return var2;
   }

   public int method707() {
      return this.field1489[this.field1487] < 0 ? this.method717() & Integer.MAX_VALUE : this.method671();
   }

   public int method682() {
      if (this.field1489[this.field1487] < 0) {
         return this.method717() & Integer.MAX_VALUE;
      } else {
         int var2 = this.method671();
         return var2 == 32767 ? -1 : var2;
      }
   }

   public int method710() {
      byte var2 = this.field1489[++this.field1487 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.field1489[++this.field1487 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public int method683() {
      int var3 = 0;
      int var4 = 0;

      int var2;
      do {
         var2 = this.method669();
         var3 |= (var2 & 127) << var4;
         var4 += 7;
      } while(var2 > 127);

      return var3;
   }

   public void method713(int[] var1) {
      int var3 = this.field1487 / 8;
      this.field1487 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method717();
         int var6 = this.method717();
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
            var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.field1487 -= 8;
         this.method656(var5);
         this.method656(var6);
      }

   }

   public void method684(int[] var1) {
      int var3 = this.field1487 / 8;
      this.field1487 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method717();
         int var6 = this.method717();
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
            var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
            var7 -= var8;
         }

         this.field1487 -= 8;
         this.method656(var5);
         this.method656(var6);
      }

   }

   public void method722(int[] var1, int var2, int var3) {
      int var5 = this.field1487;
      this.field1487 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method717();
         int var9 = this.method717();
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var10 + var1[var10 >>> 11 & 3]) {
            var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
            var10 += var11;
         }

         this.field1487 -= 8;
         this.method656(var8);
         this.method656(var9);
      }

      this.field1487 = var5;
   }

   public void method719(int[] var1, int var2, int var3) {
      int var5 = this.field1487;
      this.field1487 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method717();
         int var9 = this.method717();
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var1[var10 & 3] + var10) {
            var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
            var10 -= var11;
         }

         this.field1487 -= 8;
         this.method656(var8);
         this.method656(var9);
      }

      this.field1487 = var5;
   }

   public void method685(BigInteger var1, BigInteger var2) {
      int var4 = this.field1487;
      this.field1487 = 0;
      byte[] var5 = new byte[var4];
      this.method679(var5, 0, var4);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var1, var2);
      byte[] var8 = var7.toByteArray();
      this.field1487 = 0;
      this.method655(var8.length);
      this.method662(var8, 0, var8.length);
   }

   public int method686(int var1) {
      int var3 = class238.method1210(this.field1489, var1, this.field1487);
      this.method656(var3);
      return var3;
   }

   public boolean method687() {
      this.field1487 -= 4;
      byte[] var3 = this.field1489;
      int var4 = this.field1487;
      int var5 = -1;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field1488[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      var6 = this.method717();
      return var5 == var6;
   }

   public void method688(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(var1 + 128);
   }

   public void method689(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(0 - var1);
   }

   public void method690(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(128 - var1);
   }

   public int method691() {
      return this.field1489[++this.field1487 - 1] - 128 & 255;
   }

   public int method716() {
      return 0 - this.field1489[++this.field1487 - 1] & 255;
   }

   public int method714() {
      return 128 - this.field1489[++this.field1487 - 1] & 255;
   }

   public byte method692() {
      return (byte)(this.field1489[++this.field1487 - 1] - 128);
   }

   public byte method721() {
      return (byte)(0 - this.field1489[++this.field1487 - 1]);
   }

   public byte method715() {
      return (byte)(128 - this.field1489[++this.field1487 - 1]);
   }

   public void method706(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)var1;
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 8);
   }

   public void method694(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 8);
      this.field1489[++this.field1487 - 1] = (byte)(var1 + 128);
   }

   public void method695(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(var1 + 128);
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 8);
   }

   public int method653() {
      this.field1487 += 2;
      return (this.field1489[this.field1487 - 2] & 255) + ((this.field1489[this.field1487 - 1] & 255) << 8);
   }

   public int method696() {
      this.field1487 += 2;
      return (this.field1489[this.field1487 - 1] - 128 & 255) + ((this.field1489[this.field1487 - 2] & 255) << 8);
   }

   public int method697() {
      this.field1487 += 2;
      return ((this.field1489[this.field1487 - 1] & 255) << 8) + (this.field1489[this.field1487 - 2] - 128 & 255);
   }

   public int method698() {
      this.field1487 += 2;
      int var2 = (this.field1489[this.field1487 - 1] - 128 & 255) + ((this.field1489[this.field1487 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method699() {
      this.field1487 += 3;
      return (this.field1489[this.field1487 - 3] & 255) + ((this.field1489[this.field1487 - 1] & 255) << 16) + ((this.field1489[this.field1487 - 2] & 255) << 8);
   }

   public int method700() {
      this.field1487 += 3;
      return ((this.field1489[this.field1487 - 1] & 255) << 8) + ((this.field1489[this.field1487 - 3] & 255) << 16) + (this.field1489[this.field1487 - 2] & 255);
   }

   public int method709() {
      this.field1487 += 3;
      return (this.field1489[this.field1487 - 1] & 255) + ((this.field1489[this.field1487 - 2] & 255) << 16) + ((this.field1489[this.field1487 - 3] & 255) << 8);
   }

   public int method668() {
      this.field1487 += 3;
      int var2 = ((this.field1489[this.field1487 - 3] & 255) << 16) + ((this.field1489[this.field1487 - 1] & 255) << 8) + (this.field1489[this.field1487 - 2] & 255);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public int method712() {
      this.field1487 += 3;
      int var2 = ((this.field1489[this.field1487 - 3] & 255) << 8) + ((this.field1489[this.field1487 - 2] & 255) << 16) + (this.field1489[this.field1487 - 1] & 255);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public void method701(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)var1;
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 8);
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 16);
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 24);
   }

   public void method702(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 8);
      this.field1489[++this.field1487 - 1] = (byte)var1;
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 24);
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 16);
   }

   public void method703(int var1) {
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 16);
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 24);
      this.field1489[++this.field1487 - 1] = (byte)var1;
      this.field1489[++this.field1487 - 1] = (byte)(var1 >> 8);
   }

   public int method725() {
      this.field1487 += 4;
      return ((this.field1489[this.field1487 - 2] & 255) << 16) + ((this.field1489[this.field1487 - 1] & 255) << 24) + ((this.field1489[this.field1487 - 3] & 255) << 8) + (this.field1489[this.field1487 - 4] & 255);
   }

   public int method693() {
      this.field1487 += 4;
      return (this.field1489[this.field1487 - 3] & 255) + ((this.field1489[this.field1487 - 1] & 255) << 16) + ((this.field1489[this.field1487 - 2] & 255) << 24) + ((this.field1489[this.field1487 - 4] & 255) << 8);
   }

   public int method704() {
      this.field1487 += 4;
      return ((this.field1489[this.field1487 - 1] & 255) << 8) + ((this.field1489[this.field1487 - 3] & 255) << 24) + ((this.field1489[this.field1487 - 4] & 255) << 16) + (this.field1489[this.field1487 - 2] & 255);
   }

   public void method705(byte[] var1, int var2, int var3) {
      for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
         var1[var5] = this.field1489[++this.field1487 - 1];
      }

   }
}
