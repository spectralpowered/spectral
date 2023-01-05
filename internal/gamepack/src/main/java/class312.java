import java.io.IOException;
import java.io.OutputStream;

public class class312 implements Runnable {
   static boolean field2974;
   boolean field2973;
   byte[] field2969;
   int field2968 = 0;
   int field2970;
   int field2971 = 0;
   IOException field2972;
   OutputStream field2967;
   Thread field2966;

   class312(OutputStream var1, int var2) {
      this.field2967 = var1;
      this.field2970 = var2 + 1;
      this.field2969 = new byte[this.field2970];
      this.field2966 = new Thread(this);
      this.field2966.setDaemon(true);
      this.field2966.start();
   }

   boolean method1514() {
      if (this.field2973) {
         try {
            this.field2967.close();
            if (null == this.field2972) {
               this.field2972 = new IOException("");
            }
         } catch (IOException var3) {
            if (this.field2972 == null) {
               this.field2972 = new IOException(var3);
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
               if (null != this.field2972) {
                  return;
               }

               if (this.field2971 <= this.field2968) {
                  var1 = this.field2968 - this.field2971;
               } else {
                  var1 = this.field2970 - this.field2971 + this.field2968;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field2967.flush();
               } catch (IOException var10) {
                  this.field2972 = var10;
                  return;
               }

               if (this.method1514()) {
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
            if (this.field2971 + var1 <= this.field2970) {
               this.field2967.write(this.field2969, this.field2971, var1);
            } else {
               int var13 = this.field2970 - this.field2971;
               this.field2967.write(this.field2969, this.field2971, var13);
               this.field2967.write(this.field2969, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.field2972 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field2971 = (var1 + this.field2971) % this.field2970;
         }
      } while(!this.method1514());

   }

   void method1516(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if (null != this.field2972) {
               throw new IOException(this.field2972.toString());
            } else {
               int var6;
               if (this.field2971 <= this.field2968) {
                  var6 = this.field2971 + (this.field2970 - this.field2968) - 1;
               } else {
                  var6 = this.field2971 - this.field2968 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + this.field2968 <= this.field2970) {
                     System.arraycopy(var1, var2, this.field2969, this.field2968, var3);
                  } else {
                     int var7 = this.field2970 - this.field2968;
                     System.arraycopy(var1, var2, this.field2969, this.field2968, var7);
                     System.arraycopy(var1, var2 + var7, this.field2969, 0, var3 - var7);
                  }

                  this.field2968 = (var3 + this.field2968) % this.field2970;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method1515() {
      synchronized(this) {
         this.field2973 = true;
         this.notifyAll();
      }

      try {
         this.field2966.join();
      } catch (InterruptedException var4) {
         ;
      }

   }
}
