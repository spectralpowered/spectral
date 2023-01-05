import java.io.EOFException;
import java.io.IOException;

@ObfInfo(
   name = "qa"
)
public class class435 {
   @ObfInfo(
      owner = "qa",
      name = "q",
      desc = "[B"
   )
   byte[] field3605;
   @ObfInfo(
      owner = "qa",
      name = "v",
      desc = "[B"
   )
   byte[] field3607;
   @ObfInfo(
      owner = "qa",
      name = "e",
      desc = "Lqq;"
   )
   class455 field3602;
   @ObfInfo(
      owner = "qa",
      name = "m",
      desc = "I"
   )
   int field3603;
   @ObfInfo(
      owner = "qa",
      name = "r",
      desc = "I"
   )
   int field3606 = 0;
   @ObfInfo(
      owner = "qa",
      name = "f",
      desc = "J"
   )
   long field3601 = -1L;
   @ObfInfo(
      owner = "qa",
      name = "x",
      desc = "J"
   )
   long field3604 = -1L;
   @ObfInfo(
      owner = "qa",
      name = "u",
      desc = "J"
   )
   long field3608;
   @ObfInfo(
      owner = "qa",
      name = "b",
      desc = "J"
   )
   long field3609;
   @ObfInfo(
      owner = "qa",
      name = "j",
      desc = "J"
   )
   long field3610;
   @ObfInfo(
      owner = "qa",
      name = "g",
      desc = "J"
   )
   long field3611;

   @ObfInfo(
      owner = "qa",
      name = "<init>",
      desc = "(Lqq;II)V"
   )
   public class435(class455 var1, int var2, int var3) throws IOException {
      this.field3602 = var1;
      this.field3610 = this.field3609 = var1.method2251();
      this.field3607 = new byte[var2];
      this.field3605 = new byte[var3];
      this.field3608 = 0L;
   }

   @ObfInfo(
      owner = "qa",
      name = "h",
      desc = "(I)V"
   )
   public void method2163() throws IOException {
      this.method2161();
      this.field3602.method2248();
   }

   @ObfInfo(
      owner = "qa",
      name = "e",
      desc = "(J)V"
   )
   public void method2164(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field3608 = var1;
      }
   }

   @ObfInfo(
      owner = "qa",
      name = "v",
      desc = "(B)J"
   )
   public long method2158() {
      return this.field3610;
   }

   @ObfInfo(
      owner = "qa",
      name = "x",
      desc = "([BB)V"
   )
   public void method2159(byte[] var1) throws IOException {
      this.method2157(var1, 0, var1.length);
   }

   @ObfInfo(
      owner = "qa",
      name = "m",
      desc = "([BIII)V"
   )
   public void method2157(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (-1L != this.field3601 && this.field3608 >= this.field3601 && this.field3608 + (long)var3 <= this.field3601 + (long)this.field3606) {
            System.arraycopy(this.field3605, (int)(this.field3608 - this.field3601), var1, var2, var3);
            this.field3608 += (long)var3;
            return;
         }

         long var5 = this.field3608;
         int var8 = var3;
         int var9;
         if (this.field3608 >= this.field3604 && this.field3608 < (long)this.field3603 + this.field3604) {
            var9 = (int)((long)this.field3603 - (this.field3608 - this.field3604));
            if (var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.field3607, (int)(this.field3608 - this.field3604), var1, var2, var9);
            this.field3608 += (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if (var3 > this.field3607.length) {
            this.field3602.method2246(this.field3608);

            for(this.field3611 = this.field3608; var3 > 0; var3 -= var9) {
               var9 = this.field3602.method2250(var1, var2, var3);
               if (var9 == -1) {
                  break;
               }

               this.field3611 += (long)var9;
               this.field3608 += (long)var9;
               var2 += var9;
            }
         } else if (var3 > 0) {
            this.method2160();
            var9 = var3;
            if (var3 > this.field3603) {
               var9 = this.field3603;
            }

            System.arraycopy(this.field3607, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.field3608 += (long)var9;
         }

         if (-1L != this.field3601) {
            if (this.field3601 > this.field3608 && var3 > 0) {
               var9 = (int)(this.field3601 - this.field3608) + var2;
               if (var9 > var3 + var2) {
                  var9 = var3 + var2;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field3608;
               }
            }

            long var15 = -1L;
            long var11 = -1L;
            if (this.field3601 >= var5 && this.field3601 < var5 + (long)var8) {
               var15 = this.field3601;
            } else if (var5 >= this.field3601 && var5 < (long)this.field3606 + this.field3601) {
               var15 = var5;
            }

            if (this.field3601 + (long)this.field3606 > var5 && (long)this.field3606 + this.field3601 <= (long)var8 + var5) {
               var11 = (long)this.field3606 + this.field3601;
            } else if (var5 + (long)var8 > this.field3601 && (long)var8 + var5 <= this.field3601 + (long)this.field3606) {
               var11 = (long)var8 + var5;
            }

            if (var15 > -1L && var11 > var15) {
               int var13 = (int)(var11 - var15);
               System.arraycopy(this.field3605, (int)(var15 - this.field3601), var1, (int)(var15 - var5) + var2, var13);
               if (var11 > this.field3608) {
                  var3 = (int)((long)var3 - (var11 - this.field3608));
                  this.field3608 = var11;
               }
            }
         }
      } catch (IOException var14) {
         this.field3611 = -1L;
         throw var14;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfInfo(
      owner = "qa",
      name = "q",
      desc = "(I)V"
   )
   void method2160() throws IOException {
      this.field3603 = 0;
      if (this.field3611 != this.field3608) {
         this.field3602.method2246(this.field3608);
         this.field3611 = this.field3608;
      }

      int var3;
      for(this.field3604 = this.field3608; this.field3603 < this.field3607.length; this.field3603 += var3) {
         int var2 = this.field3607.length - this.field3603;
         if (var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.field3602.method2250(this.field3607, this.field3603, var2);
         if (var3 == -1) {
            break;
         }

         this.field3611 += (long)var3;
      }

   }

   @ObfInfo(
      owner = "qa",
      name = "f",
      desc = "([BIII)V"
   )
   public void method2162(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field3608 > this.field3610) {
            this.field3610 = this.field3608 + (long)var3;
         }

         if (this.field3601 != -1L && (this.field3608 < this.field3601 || this.field3608 > this.field3601 + (long)this.field3606)) {
            this.method2161();
         }

         if (this.field3601 != -1L && this.field3608 + (long)var3 > (long)this.field3605.length + this.field3601) {
            int var5 = (int)((long)this.field3605.length - (this.field3608 - this.field3601));
            System.arraycopy(var1, var2, this.field3605, (int)(this.field3608 - this.field3601), var5);
            this.field3608 += (long)var5;
            var2 += var5;
            var3 -= var5;
            this.field3606 = this.field3605.length;
            this.method2161();
         }

         if (var3 <= this.field3605.length) {
            if (var3 > 0) {
               if (-1L == this.field3601) {
                  this.field3601 = this.field3608;
               }

               System.arraycopy(var1, var2, this.field3605, (int)(this.field3608 - this.field3601), var3);
               this.field3608 += (long)var3;
               if (this.field3608 - this.field3601 > (long)this.field3606) {
                  this.field3606 = (int)(this.field3608 - this.field3601);
               }

            }
         } else {
            if (this.field3608 != this.field3611) {
               this.field3602.method2246(this.field3608);
               this.field3611 = this.field3608;
            }

            this.field3602.method2247(var1, var2, var3);
            this.field3611 += (long)var3;
            if (this.field3611 > this.field3609) {
               this.field3609 = this.field3611;
            }

            long var11 = -1L;
            long var7 = -1L;
            if (this.field3608 >= this.field3604 && this.field3608 < (long)this.field3603 + this.field3604) {
               var11 = this.field3608;
            } else if (this.field3604 >= this.field3608 && this.field3604 < this.field3608 + (long)var3) {
               var11 = this.field3604;
            }

            if ((long)var3 + this.field3608 > this.field3604 && (long)var3 + this.field3608 <= this.field3604 + (long)this.field3603) {
               var7 = (long)var3 + this.field3608;
            } else if (this.field3604 + (long)this.field3603 > this.field3608 && (long)this.field3603 + this.field3604 <= this.field3608 + (long)var3) {
               var7 = this.field3604 + (long)this.field3603;
            }

            if (var11 > -1L && var7 > var11) {
               int var9 = (int)(var7 - var11);
               System.arraycopy(var1, (int)(var11 + (long)var2 - this.field3608), this.field3607, (int)(var11 - this.field3604), var9);
            }

            this.field3608 += (long)var3;
         }
      } catch (IOException var10) {
         this.field3611 = -1L;
         throw var10;
      }
   }

   @ObfInfo(
      owner = "qa",
      name = "r",
      desc = "(I)V"
   )
   void method2161() throws IOException {
      if (this.field3601 != -1L) {
         if (this.field3601 != this.field3611) {
            this.field3602.method2246(this.field3601);
            this.field3611 = this.field3601;
         }

         this.field3602.method2247(this.field3605, 0, this.field3606);
         this.field3611 += (long)this.field3606;
         if (this.field3611 > this.field3609) {
            this.field3609 = this.field3611;
         }

         long var2 = -1L;
         long var4 = -1L;
         if (this.field3601 >= this.field3604 && this.field3601 < this.field3604 + (long)this.field3603) {
            var2 = this.field3601;
         } else if (this.field3604 >= this.field3601 && this.field3604 < (long)this.field3606 + this.field3601) {
            var2 = this.field3604;
         }

         if (this.field3601 + (long)this.field3606 > this.field3604 && (long)this.field3606 + this.field3601 <= this.field3604 + (long)this.field3603) {
            var4 = (long)this.field3606 + this.field3601;
         } else if (this.field3604 + (long)this.field3603 > this.field3601 && (long)this.field3603 + this.field3604 <= (long)this.field3606 + this.field3601) {
            var4 = (long)this.field3603 + this.field3604;
         }

         if (var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.field3605, (int)(var2 - this.field3601), this.field3607, (int)(var2 - this.field3604), var6);
         }

         this.field3601 = -1L;
         this.field3606 = 0;
      }

   }
}
