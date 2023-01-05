import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class457 implements ThreadFactory {
   // $FF: synthetic field
   final class18 this$0;
   final ThreadGroup field3754;
   final AtomicInteger field3753;

   class457(class18 var1) {
      this.this$0 = var1;
      this.field3753 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field3754 = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(this.field3754, var1, this.this$0.field141 + "-rest-request-" + this.field3753.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   public static class121 method2164(int var0) {
      class121[] var2 = class54.method317();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class121 var4 = var2[var3];
         if (var4.field1443 == var0) {
            return var4;
         }
      }

      return null;
   }

   static void method2163(int var0, int var1) {
      if (class111.field1385.method1325() != 0 && var0 != -1) {
         class377.method1796(class269.field2702, var0, 0, class111.field1385.method1325(), false);
         client.field681 = true;
      }

   }
}
