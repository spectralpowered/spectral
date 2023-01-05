import java.io.IOException;
import java.io.OutputStream;

public class class454 implements Runnable {
   static boolean field3773;
   boolean field3772;
   byte[] field3768;
   int field3767 = 0;
   int field3769;
   int field3770 = 0;
   IOException field3771;
   OutputStream field3766;
   Thread field3765;

   class454(OutputStream var1, int var2) {
      this.field3766 = var1;
      this.field3769 = var2 + 1;
      this.field3768 = new byte[this.field3769];
      this.field3765 = new Thread(this);
      this.field3765.setDaemon(true);
      this.field3765.start();
   }

   boolean method2243() {
      if (this.field3772) {
         try {
            this.field3766.close();
            if (null == this.field3771) {
               this.field3771 = new IOException("");
            }
         } catch (IOException var3) {
            if (this.field3771 == null) {
               this.field3771 = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.field3771) {
                  return;
               }

               if (this.field3770 <= this.field3767) {
                  var1 = this.field3767 - this.field3770;
               } else {
                  var1 = this.field3769 - this.field3770 + this.field3767;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field3766.flush();
               } catch (IOException var10) {
                  this.field3771 = var10;
                  return;
               }

               if (this.method2243()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
                  ;
               }
            }
         }

         try {
            if (this.field3770 + var1 <= this.field3769) {
               this.field3766.write(this.field3768, this.field3770, var1);
            } else {
               int var13 = this.field3769 - this.field3770;
               this.field3766.write(this.field3768, this.field3770, var13);
               this.field3766.write(this.field3768, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.field3771 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field3770 = (var1 + this.field3770) % this.field3769;
         }
      } while(!this.method2243());

   }

   void method2245(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if (null != this.field3771) {
               throw new IOException(this.field3771.toString());
            } else {
               int var6;
               if (this.field3770 <= this.field3767) {
                  var6 = this.field3770 + (this.field3769 - this.field3767) - 1;
               } else {
                  var6 = this.field3770 - this.field3767 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + this.field3767 <= this.field3769) {
                     System.arraycopy(var1, var2, this.field3768, this.field3767, var3);
                  } else {
                     int var7 = this.field3769 - this.field3767;
                     System.arraycopy(var1, var2, this.field3768, this.field3767, var7);
                     System.arraycopy(var1, var2 + var7, this.field3768, 0, var3 - var7);
                  }

                  this.field3767 = (var3 + this.field3767) % this.field3769;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method2244() {
      synchronized(this) {
         this.field3772 = true;
         this.notifyAll();
      }

      try {
         this.field3765.join();
      } catch (InterruptedException var4) {
         ;
      }

   }
}
