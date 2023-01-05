import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class107 implements Runnable {
   byte[] field1365;
   int field1362 = 0;
   int field1364;
   int field1368 = 0;
   IOException field1367;
   InputStream field1363;
   Thread field1366;

   class107(InputStream var1, int var2) {
      this.field1363 = var1;
      this.field1364 = var2 + 1;
      this.field1365 = new byte[this.field1364];
      this.field1366 = new Thread(this);
      this.field1366.setDaemon(true);
      this.field1366.start();
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field1367 != null) {
                  return;
               }

               if (0 == this.field1362) {
                  var1 = this.field1364 - this.field1368 - 1;
               } else if (this.field1362 <= this.field1368) {
                  var1 = this.field1364 - this.field1368;
               } else {
                  var1 = this.field1362 - this.field1368 - 1;
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
            var2 = this.field1363.read(this.field1365, this.field1368, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.field1367 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field1368 = (var2 + this.field1368) % this.field1364;
         }
      }
   }

   boolean method568(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.field1364) {
         synchronized(this) {
            int var4;
            if (this.field1362 <= this.field1368) {
               var4 = this.field1368 - this.field1362;
            } else {
               var4 = this.field1368 + (this.field1364 - this.field1362);
            }

            if (var4 < var1) {
               if (this.field1367 != null) {
                  throw new IOException(this.field1367.toString());
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

   int method570() throws IOException {
      synchronized(this) {
         int var3;
         if (this.field1362 <= this.field1368) {
            var3 = this.field1368 - this.field1362;
         } else {
            var3 = this.field1368 + (this.field1364 - this.field1362);
         }

         if (var3 <= 0 && this.field1367 != null) {
            throw new IOException(this.field1367.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   int method569() throws IOException {
      synchronized(this) {
         if (this.field1362 == this.field1368) {
            if (null != this.field1367) {
               throw new IOException(this.field1367.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.field1365[this.field1362] & 255;
            this.field1362 = (this.field1362 + 1) % this.field1364;
            this.notifyAll();
            return var3;
         }
      }
   }

   int method572(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var6;
            if (this.field1362 <= this.field1368) {
               var6 = this.field1368 - this.field1362;
            } else {
               var6 = this.field1364 - this.field1362 + this.field1368;
            }

            if (var3 > var6) {
               var3 = var6;
            }

            if (var3 == 0 && this.field1367 != null) {
               throw new IOException(this.field1367.toString());
            } else {
               if (var3 + this.field1362 <= this.field1364) {
                  System.arraycopy(this.field1365, this.field1362, var1, var2, var3);
               } else {
                  int var7 = this.field1364 - this.field1362;
                  System.arraycopy(this.field1365, this.field1362, var1, var2, var7);
                  System.arraycopy(this.field1365, 0, var1, var2 + var7, var3 - var7);
               }

               this.field1362 = (var3 + this.field1362) % this.field1364;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method571() {
      synchronized(this) {
         if (this.field1367 == null) {
            this.field1367 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field1366.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public static int method573(class134 var0, String var1) {
      int var3 = var0.field1487;
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

      var0.method667(var6.length);
      var0.field1487 += class223.field2435.method1780(var6, 0, var6.length, var0.field1489, var0.field1487);
      return var0.field1487 - var3;
   }
}
