import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class300 implements Runnable {
   public static String field2406;
   public static String field2408;
   static class434 field2410;
   boolean field2411 = false;
   class92 field2407 = null;
   class92 field2412 = null;
   Thread field2409;

   public class300() {
      field2408 = "Unknown";
      field2406 = "1.6";

      try {
         field2408 = System.getProperty("java.vendor");
         field2406 = System.getProperty("java.version");
      } catch (Exception var2) {
         ;
      }

      this.field2411 = false;
      this.field2409 = new Thread(this);
      this.field2409.setPriority(10);
      this.field2409.setDaemon(true);
      this.field2409.start();
   }

   public final void method1447() {
      synchronized(this) {
         this.field2411 = true;
         this.notifyAll();
      }

      try {
         this.field2409.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public final void run() {
      while(true) {
         class92 var1;
         synchronized(this) {
            while(true) {
               if (this.field2411) {
                  return;
               }

               if (null != this.field2412) {
                  var1 = this.field2412;
                  this.field2412 = this.field2412.field776;
                  if (this.field2412 == null) {
                     this.field2407 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
                  ;
               }
            }
         }

         try {
            int var2 = var1.field774;
            if (var2 == 1) {
               var1.field779 = new Socket(InetAddress.getByName((String)var1.field778), var1.field777);
            } else if (var2 == 2) {
               Thread var3 = new Thread((Runnable)var1.field778);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field777);
               var1.field779 = var3;
            } else if (var2 == 4) {
               var1.field779 = new DataInputStream(((URL)var1.field778).openStream());
            }

            var1.field775 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field775 = 2;
         }
      }
   }

   final class92 method1450(int var1, int var2, int var3, Object var4) {
      class92 var6 = new class92();
      var6.field774 = var1;
      var6.field777 = var2;
      var6.field778 = var4;
      synchronized(this) {
         if (this.field2407 != null) {
            this.field2407.field776 = var6;
            this.field2407 = var6;
         } else {
            this.field2407 = this.field2412 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final class92 method1448(String var1, int var2) {
      return this.method1450(1, var2, 0, var1);
   }

   public final class92 method1449(Runnable var1, int var2) {
      return this.method1450(2, var2, 0, var1);
   }

   public static String method1453(CharSequence var0) {
      return class431.method2126('*', var0.length());
   }

   static void method1452(String var0, String var1, String var2) {
      class359.field3051 = var0;
      class359.field3064 = var1;
      class359.field3084 = var2;
   }

   public static boolean method1451() {
      return client.field481 >= 2;
   }
}
