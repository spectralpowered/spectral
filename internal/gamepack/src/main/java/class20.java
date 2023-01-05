import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class20 implements Runnable {
   public static String field147;
   public static String field149;
   static class163 field151;
   boolean field152 = false;
   class144 field148 = null;
   class144 field153 = null;
   Thread field150;

   public class20() {
      field149 = "Unknown";
      field147 = "1.6";

      try {
         field149 = System.getProperty("java.vendor");
         field147 = System.getProperty("java.version");
      } catch (Exception var2) {
         ;
      }

      this.field152 = false;
      this.field150 = new Thread(this);
      this.field150.setPriority(10);
      this.field150.setDaemon(true);
      this.field150.start();
   }

   public final void method108() {
      synchronized(this) {
         this.field152 = true;
         this.notifyAll();
      }

      try {
         this.field150.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public final void run() {
      while(true) {
         class144 var1;
         synchronized(this) {
            while(true) {
               if (this.field152) {
                  return;
               }

               if (null != this.field153) {
                  var1 = this.field153;
                  this.field153 = this.field153.field1552;
                  if (this.field153 == null) {
                     this.field148 = null;
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
            int var2 = var1.field1550;
            if (var2 == 1) {
               var1.field1555 = new Socket(InetAddress.getByName((String)var1.field1554), var1.field1553);
            } else if (var2 == 2) {
               Thread var3 = new Thread((Runnable)var1.field1554);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field1553);
               var1.field1555 = var3;
            } else if (var2 == 4) {
               var1.field1555 = new DataInputStream(((URL)var1.field1554).openStream());
            }

            var1.field1551 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field1551 = 2;
         }
      }
   }

   final class144 method111(int var1, int var2, int var3, Object var4) {
      class144 var6 = new class144();
      var6.field1550 = var1;
      var6.field1553 = var2;
      var6.field1554 = var4;
      synchronized(this) {
         if (this.field148 != null) {
            this.field148.field1552 = var6;
            this.field148 = var6;
         } else {
            this.field148 = this.field153 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final class144 method109(String var1, int var2) {
      return this.method111(1, var2, 0, var1);
   }

   public final class144 method110(Runnable var1, int var2) {
      return this.method111(2, var2, 0, var1);
   }

   public static String method114(CharSequence var0) {
      return class44.method227('*', var0.length());
   }

   static void method113(String var0, String var1, String var2) {
      class52.field756 = var0;
      class52.field769 = var1;
      class52.field789 = var2;
   }

   public static boolean method112() {
      return client.field685 >= 2;
   }
}
