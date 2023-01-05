import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class157 implements Runnable {
   byte[] field1208;
   int field1205 = 0;
   int field1207;
   int field1211 = 0;
   IOException field1210;
   InputStream field1206;
   Thread field1209;

   class157(InputStream var1, int var2) {
      this.field1206 = var1;
      this.field1207 = var2 + 1;
      this.field1208 = new byte[this.field1207];
      this.field1209 = new Thread(this);
      this.field1209.setDaemon(true);
      this.field1209.start();
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field1210 != null) {
                  return;
               }

               if (0 == this.field1205) {
                  var1 = this.field1207 - this.field1211 - 1;
               } else if (this.field1205 <= this.field1211) {
                  var1 = this.field1207 - this.field1211;
               } else {
                  var1 = this.field1205 - this.field1211 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  ;
               }
            }
         }

         int var2;
         try {
            var2 = this.field1206.read(this.field1208, this.field1211, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.field1210 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field1211 = (var2 + this.field1211) % this.field1207;
         }
      }
   }

   boolean method722(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.field1207) {
         synchronized(this) {
            int var4;
            if (this.field1205 <= this.field1211) {
               var4 = this.field1211 - this.field1205;
            } else {
               var4 = this.field1211 + (this.field1207 - this.field1205);
            }

            if (var4 < var1) {
               if (this.field1210 != null) {
                  throw new IOException(this.field1210.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method724() throws IOException {
      synchronized(this) {
         int var3;
         if (this.field1205 <= this.field1211) {
            var3 = this.field1211 - this.field1205;
         } else {
            var3 = this.field1211 + (this.field1207 - this.field1205);
         }

         if (var3 <= 0 && this.field1210 != null) {
            throw new IOException(this.field1210.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   int method723() throws IOException {
      synchronized(this) {
         if (this.field1205 == this.field1211) {
            if (null != this.field1210) {
               throw new IOException(this.field1210.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.field1208[this.field1205] & 255;
            this.field1205 = (this.field1205 + 1) % this.field1207;
            this.notifyAll();
            return var3;
         }
      }
   }

   int method726(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var6;
            if (this.field1205 <= this.field1211) {
               var6 = this.field1211 - this.field1205;
            } else {
               var6 = this.field1207 - this.field1205 + this.field1211;
            }

            if (var3 > var6) {
               var3 = var6;
            }

            if (var3 == 0 && this.field1210 != null) {
               throw new IOException(this.field1210.toString());
            } else {
               if (var3 + this.field1205 <= this.field1207) {
                  System.arraycopy(this.field1208, this.field1205, var1, var2, var3);
               } else {
                  int var7 = this.field1207 - this.field1205;
                  System.arraycopy(this.field1208, this.field1205, var1, var2, var7);
                  System.arraycopy(this.field1208, 0, var1, var2 + var7, var3 - var7);
               }

               this.field1205 = (var3 + this.field1205) % this.field1207;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method725() {
      synchronized(this) {
         if (this.field1210 == null) {
            this.field1210 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field1209.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public static int method727(class127 var0, String var1) {
      int var3 = var0.field1070;
      int var5 = var1.length();
      byte[] var6 = new byte[var5];

      for(int var7 = 0; var7 < var5; ++var7) {
         char var8 = var1.charAt(var7);
         if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if (var8 == 8364) {
               var6[var7] = -128;
            } else if (var8 == 8218) {
               var6[var7] = -126;
            } else if (var8 == 402) {
               var6[var7] = -125;
            } else if (var8 == 8222) {
               var6[var7] = -124;
            } else if (var8 == 8230) {
               var6[var7] = -123;
            } else if (var8 == 8224) {
               var6[var7] = -122;
            } else if (var8 == 8225) {
               var6[var7] = -121;
            } else if (var8 == 710) {
               var6[var7] = -120;
            } else if (var8 == 8240) {
               var6[var7] = -119;
            } else if (var8 == 352) {
               var6[var7] = -118;
            } else if (var8 == 8249) {
               var6[var7] = -117;
            } else if (var8 == 338) {
               var6[var7] = -116;
            } else if (var8 == 381) {
               var6[var7] = -114;
            } else if (var8 == 8216) {
               var6[var7] = -111;
            } else if (var8 == 8217) {
               var6[var7] = -110;
            } else if (var8 == 8220) {
               var6[var7] = -109;
            } else if (var8 == 8221) {
               var6[var7] = -108;
            } else if (var8 == 8226) {
               var6[var7] = -107;
            } else if (var8 == 8211) {
               var6[var7] = -106;
            } else if (var8 == 8212) {
               var6[var7] = -105;
            } else if (var8 == 732) {
               var6[var7] = -104;
            } else if (var8 == 8482) {
               var6[var7] = -103;
            } else if (var8 == 353) {
               var6[var7] = -102;
            } else if (var8 == 8250) {
               var6[var7] = -101;
            } else if (var8 == 339) {
               var6[var7] = -100;
            } else if (var8 == 382) {
               var6[var7] = -98;
            } else if (var8 == 376) {
               var6[var7] = -97;
            } else {
               var6[var7] = 63;
            }
         } else {
            var6[var7] = (byte)var8;
         }
      }

      var0.method545(var6.length);
      var0.field1070 += class243.field2052.method1808(var6, 0, var6.length, var0.field1072, var0.field1070);
      return var0.field1070 - var3;
   }
}
