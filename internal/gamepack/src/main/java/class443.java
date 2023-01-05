import java.io.EOFException;
import java.io.IOException;

public class class443 {
   byte[] field3656;
   byte[] field3658;
   class476 field3653;
   int field3654;
   int field3657 = 0;
   long field3652 = -1L;
   long field3655 = -1L;
   long field3659;
   long field3660;
   long field3661;
   long field3662;

   public class443(class476 var1, int var2, int var3) throws IOException {
      this.field3653 = var1;
      this.field3661 = this.field3660 = var1.method2305();
      this.field3658 = new byte[var2];
      this.field3656 = new byte[var3];
      this.field3659 = 0L;
   }

   public void method2115() throws IOException {
      this.method2113();
      this.field3653.method2302();
   }

   public void method2116(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field3659 = var1;
      }
   }

   public long method2110() {
      return this.field3661;
   }

   public void method2111(byte[] var1) throws IOException {
      this.method2109(var1, 0, var1.length);
   }

   public void method2109(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (-1L != this.field3652 && this.field3659 >= this.field3652 && this.field3659 + (long)var3 <= this.field3652 + (long)this.field3657) {
            System.arraycopy(this.field3656, (int)(this.field3659 - this.field3652), var1, var2, var3);
            this.field3659 += (long)var3;
            return;
         }

         long var5 = this.field3659;
         int var8 = var3;
         int var9;
         if (this.field3659 >= this.field3655 && this.field3659 < (long)this.field3654 + this.field3655) {
            var9 = (int)((long)this.field3654 - (this.field3659 - this.field3655));
            if (var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.field3658, (int)(this.field3659 - this.field3655), var1, var2, var9);
            this.field3659 += (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if (var3 > this.field3658.length) {
            this.field3653.method2300(this.field3659);

            for(this.field3662 = this.field3659; var3 > 0; var3 -= var9) {
               var9 = this.field3653.method2304(var1, var2, var3);
               if (var9 == -1) {
                  break;
               }

               this.field3662 += (long)var9;
               this.field3659 += (long)var9;
               var2 += var9;
            }
         } else if (var3 > 0) {
            this.method2112();
            var9 = var3;
            if (var3 > this.field3654) {
               var9 = this.field3654;
            }

            System.arraycopy(this.field3658, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.field3659 += (long)var9;
         }

         if (-1L != this.field3652) {
            if (this.field3652 > this.field3659 && var3 > 0) {
               var9 = (int)(this.field3652 - this.field3659) + var2;
               if (var9 > var3 + var2) {
                  var9 = var3 + var2;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field3659;
               }
            }

            long var15 = -1L;
            long var11 = -1L;
            if (this.field3652 >= var5 && this.field3652 < var5 + (long)var8) {
               var15 = this.field3652;
            } else if (var5 >= this.field3652 && var5 < (long)this.field3657 + this.field3652) {
               var15 = var5;
            }

            if (this.field3652 + (long)this.field3657 > var5 && (long)this.field3657 + this.field3652 <= (long)var8 + var5) {
               var11 = (long)this.field3657 + this.field3652;
            } else if (var5 + (long)var8 > this.field3652 && (long)var8 + var5 <= this.field3652 + (long)this.field3657) {
               var11 = (long)var8 + var5;
            }

            if (var15 > -1L && var11 > var15) {
               int var13 = (int)(var11 - var15);
               System.arraycopy(this.field3656, (int)(var15 - this.field3652), var1, (int)(var15 - var5) + var2, var13);
               if (var11 > this.field3659) {
                  var3 = (int)((long)var3 - (var11 - this.field3659));
                  this.field3659 = var11;
               }
            }
         }
      } catch (IOException var14) {
         this.field3662 = -1L;
         throw var14;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void method2112() throws IOException {
      this.field3654 = 0;
      if (this.field3662 != this.field3659) {
         this.field3653.method2300(this.field3659);
         this.field3662 = this.field3659;
      }

      int var3;
      for(this.field3655 = this.field3659; this.field3654 < this.field3658.length; this.field3654 += var3) {
         int var2 = this.field3658.length - this.field3654;
         if (var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.field3653.method2304(this.field3658, this.field3654, var2);
         if (var3 == -1) {
            break;
         }

         this.field3662 += (long)var3;
      }

   }

   public void method2114(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field3659 > this.field3661) {
            this.field3661 = this.field3659 + (long)var3;
         }

         if (this.field3652 != -1L && (this.field3659 < this.field3652 || this.field3659 > this.field3652 + (long)this.field3657)) {
            this.method2113();
         }

         if (this.field3652 != -1L && this.field3659 + (long)var3 > (long)this.field3656.length + this.field3652) {
            int var5 = (int)((long)this.field3656.length - (this.field3659 - this.field3652));
            System.arraycopy(var1, var2, this.field3656, (int)(this.field3659 - this.field3652), var5);
            this.field3659 += (long)var5;
            var2 += var5;
            var3 -= var5;
            this.field3657 = this.field3656.length;
            this.method2113();
         }

         if (var3 <= this.field3656.length) {
            if (var3 > 0) {
               if (-1L == this.field3652) {
                  this.field3652 = this.field3659;
               }

               System.arraycopy(var1, var2, this.field3656, (int)(this.field3659 - this.field3652), var3);
               this.field3659 += (long)var3;
               if (this.field3659 - this.field3652 > (long)this.field3657) {
                  this.field3657 = (int)(this.field3659 - this.field3652);
               }

            }
         } else {
            if (this.field3659 != this.field3662) {
               this.field3653.method2300(this.field3659);
               this.field3662 = this.field3659;
            }

            this.field3653.method2301(var1, var2, var3);
            this.field3662 += (long)var3;
            if (this.field3662 > this.field3660) {
               this.field3660 = this.field3662;
            }

            long var11 = -1L;
            long var7 = -1L;
            if (this.field3659 >= this.field3655 && this.field3659 < (long)this.field3654 + this.field3655) {
               var11 = this.field3659;
            } else if (this.field3655 >= this.field3659 && this.field3655 < this.field3659 + (long)var3) {
               var11 = this.field3655;
            }

            if ((long)var3 + this.field3659 > this.field3655 && (long)var3 + this.field3659 <= this.field3655 + (long)this.field3654) {
               var7 = (long)var3 + this.field3659;
            } else if (this.field3655 + (long)this.field3654 > this.field3659 && (long)this.field3654 + this.field3655 <= this.field3659 + (long)var3) {
               var7 = this.field3655 + (long)this.field3654;
            }

            if (var11 > -1L && var7 > var11) {
               int var9 = (int)(var7 - var11);
               System.arraycopy(var1, (int)(var11 + (long)var2 - this.field3659), this.field3658, (int)(var11 - this.field3655), var9);
            }

            this.field3659 += (long)var3;
         }
      } catch (IOException var10) {
         this.field3662 = -1L;
         throw var10;
      }
   }

   void method2113() throws IOException {
      if (this.field3652 != -1L) {
         if (this.field3652 != this.field3662) {
            this.field3653.method2300(this.field3652);
            this.field3662 = this.field3652;
         }

         this.field3653.method2301(this.field3656, 0, this.field3657);
         this.field3662 += (long)this.field3657;
         if (this.field3662 > this.field3660) {
            this.field3660 = this.field3662;
         }

         long var2 = -1L;
         long var4 = -1L;
         if (this.field3652 >= this.field3655 && this.field3652 < this.field3655 + (long)this.field3654) {
            var2 = this.field3652;
         } else if (this.field3655 >= this.field3652 && this.field3655 < (long)this.field3657 + this.field3652) {
            var2 = this.field3655;
         }

         if (this.field3652 + (long)this.field3657 > this.field3655 && (long)this.field3657 + this.field3652 <= this.field3655 + (long)this.field3654) {
            var4 = (long)this.field3657 + this.field3652;
         } else if (this.field3655 + (long)this.field3654 > this.field3652 && (long)this.field3654 + this.field3655 <= (long)this.field3657 + this.field3652) {
            var4 = (long)this.field3654 + this.field3655;
         }

         if (var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.field3656, (int)(var2 - this.field3652), this.field3658, (int)(var2 - this.field3655), var6);
         }

         this.field3652 = -1L;
         this.field3657 = 0;
      }

   }
}
