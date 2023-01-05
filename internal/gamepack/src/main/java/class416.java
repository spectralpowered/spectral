import java.io.EOFException;
import java.io.IOException;

public final class class416 {
   static byte[] field3561 = new byte[520];
   class443 field3559 = null;
   class443 field3560 = null;
   int field3558;
   int field3562 = 65000;

   public class416(int var1, class443 var2, class443 var3, int var4) {
      this.field3558 = var1;
      this.field3559 = var2;
      this.field3560 = var3;
      this.field3562 = var4;
   }

   public byte[] method2006(int var1) {
      class443 var3 = this.field3559;
      synchronized(this.field3559) {
         Object var10000;
         try {
            if (this.field3560.method2110() < (long)(var1 * 6 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.field3560.method2116((long)(var1 * 6));
            this.field3560.method2109(field3561, 0, 6);
            int var4 = (field3561[2] & 255) + ((field3561[0] & 255) << 16) + ((field3561[1] & 255) << 8);
            int var5 = ((field3561[4] & 255) << 8) + ((field3561[3] & 255) << 16) + (field3561[5] & 255);
            if (var4 < 0 || var4 > this.field3562) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var5 > 0 && (long)var5 <= this.field3559.method2110() / 520L) {
               byte[] var6 = new byte[var4];
               int var7 = 0;
               int var8 = 0;

               while(var7 < var4) {
                  if (var5 == 0) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.field3559.method2116((long)var5 * 520L);
                  int var9 = var4 - var7;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  byte var14;
                  if (var1 > 65535) {
                     if (var9 > 510) {
                        var9 = 510;
                     }

                     var14 = 10;
                     this.field3559.method2109(field3561, 0, var14 + var9);
                     var10 = (field3561[3] & 255) + ((field3561[2] & 255) << 8) + ((field3561[0] & 255) << 24) + ((field3561[1] & 255) << 16);
                     var11 = ((field3561[4] & 255) << 8) + (field3561[5] & 255);
                     var12 = (field3561[8] & 255) + ((field3561[7] & 255) << 8) + ((field3561[6] & 255) << 16);
                     var13 = field3561[9] & 255;
                  } else {
                     if (var9 > 512) {
                        var9 = 512;
                     }

                     var14 = 8;
                     this.field3559.method2109(field3561, 0, var14 + var9);
                     var10 = (field3561[1] & 255) + ((field3561[0] & 255) << 8);
                     var11 = ((field3561[2] & 255) << 8) + (field3561[3] & 255);
                     var12 = (field3561[6] & 255) + ((field3561[4] & 255) << 16) + ((field3561[5] & 255) << 8);
                     var13 = field3561[7] & 255;
                  }

                  if (var10 == var1 && var11 == var8 && var13 == this.field3558) {
                     if (var12 >= 0 && (long)var12 <= this.field3559.method2110() / 520L) {
                        int var15 = var9 + var14;

                        for(int var16 = var14; var16 < var15; ++var16) {
                           var6[var7++] = field3561[var16];
                        }

                        var5 = var12;
                        ++var8;
                        continue;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }

               byte[] var20 = var6;
               return var20;
            }

            var10000 = null;
         } catch (IOException var18) {
            return null;
         }

         return (byte[])var10000;
      }
   }

   public boolean method2008(int var1, byte[] var2, int var3) {
      class443 var5 = this.field3559;
      synchronized(this.field3559) {
         if (var3 >= 0 && var3 <= this.field3562) {
            boolean var6 = this.method2007(var1, var2, var3, true);
            if (!var6) {
               var6 = this.method2007(var1, var2, var3, false);
            }

            return var6;
         } else {
            throw new IllegalArgumentException("" + this.field3558 + ',' + var1 + ',' + var3);
         }
      }
   }

   boolean method2007(int var1, byte[] var2, int var3, boolean var4) {
      class443 var6 = this.field3559;
      synchronized(this.field3559) {
         try {
            int var7;
            boolean var10000;
            if (var4) {
               if (this.field3560.method2110() < (long)(6 + var1 * 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field3560.method2116((long)(var1 * 6));
               this.field3560.method2109(field3561, 0, 6);
               var7 = (field3561[5] & 255) + ((field3561[4] & 255) << 8) + ((field3561[3] & 255) << 16);
               if (var7 <= 0 || (long)var7 > this.field3559.method2110() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var7 = (int)((this.field3559.method2110() + 519L) / 520L);
               if (var7 == 0) {
                  var7 = 1;
               }
            }

            field3561[0] = (byte)(var3 >> 16);
            field3561[1] = (byte)(var3 >> 8);
            field3561[2] = (byte)var3;
            field3561[3] = (byte)(var7 >> 16);
            field3561[4] = (byte)(var7 >> 8);
            field3561[5] = (byte)var7;
            this.field3560.method2116((long)(var1 * 6));
            this.field3560.method2114(field3561, 0, 6);
            int var8 = 0;
            int var9 = 0;

            while(true) {
               if (var8 < var3) {
                  label154: {
                     int var10 = 0;
                     int var11;
                     if (var4) {
                        this.field3559.method2116((long)var7 * 520L);
                        int var12;
                        int var13;
                        if (var1 > 65535) {
                           try {
                              this.field3559.method2109(field3561, 0, 10);
                           } catch (EOFException var17) {
                              break label154;
                           }

                           var11 = ((field3561[2] & 255) << 8) + ((field3561[0] & 255) << 24) + ((field3561[1] & 255) << 16) + (field3561[3] & 255);
                           var12 = ((field3561[4] & 255) << 8) + (field3561[5] & 255);
                           var10 = (field3561[8] & 255) + ((field3561[6] & 255) << 16) + ((field3561[7] & 255) << 8);
                           var13 = field3561[9] & 255;
                        } else {
                           try {
                              this.field3559.method2109(field3561, 0, 8);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var11 = (field3561[1] & 255) + ((field3561[0] & 255) << 8);
                           var12 = ((field3561[2] & 255) << 8) + (field3561[3] & 255);
                           var10 = (field3561[6] & 255) + ((field3561[4] & 255) << 16) + ((field3561[5] & 255) << 8);
                           var13 = field3561[7] & 255;
                        }

                        if (var1 != var11 || var9 != var12 || this.field3558 != var13) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var10 < 0 || (long)var10 > this.field3559.method2110() / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var10 == 0) {
                        var4 = false;
                        var10 = (int)((this.field3559.method2110() + 519L) / 520L);
                        if (var10 == 0) {
                           ++var10;
                        }

                        if (var10 == var7) {
                           ++var10;
                        }
                     }

                     if (var1 > 65535) {
                        if (var3 - var8 <= 510) {
                           var10 = 0;
                        }

                        field3561[0] = (byte)(var1 >> 24);
                        field3561[1] = (byte)(var1 >> 16);
                        field3561[2] = (byte)(var1 >> 8);
                        field3561[3] = (byte)var1;
                        field3561[4] = (byte)(var9 >> 8);
                        field3561[5] = (byte)var9;
                        field3561[6] = (byte)(var10 >> 16);
                        field3561[7] = (byte)(var10 >> 8);
                        field3561[8] = (byte)var10;
                        field3561[9] = (byte)this.field3558;
                        this.field3559.method2116((long)var7 * 520L);
                        this.field3559.method2114(field3561, 0, 10);
                        var11 = var3 - var8;
                        if (var11 > 510) {
                           var11 = 510;
                        }

                        this.field3559.method2114(var2, var8, var11);
                        var8 += var11;
                     } else {
                        if (var3 - var8 <= 512) {
                           var10 = 0;
                        }

                        field3561[0] = (byte)(var1 >> 8);
                        field3561[1] = (byte)var1;
                        field3561[2] = (byte)(var9 >> 8);
                        field3561[3] = (byte)var9;
                        field3561[4] = (byte)(var10 >> 16);
                        field3561[5] = (byte)(var10 >> 8);
                        field3561[6] = (byte)var10;
                        field3561[7] = (byte)this.field3558;
                        this.field3559.method2116(520L * (long)var7);
                        this.field3559.method2114(field3561, 0, 8);
                        var11 = var3 - var8;
                        if (var11 > 512) {
                           var11 = 512;
                        }

                        this.field3559.method2114(var2, var8, var11);
                        var8 += var11;
                     }

                     var7 = var10;
                     ++var9;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var18) {
            return false;
         }
      }
   }

   public String toString() {
      return "" + this.field3558;
   }
}
