import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class18 {
   static class429 field139;
   static int field140;
   final int field137;
   final String field141;
   final ThreadFactory field138;
   final ThreadPoolExecutor field142;

   public class18(String var1, int var2, int var3) {
      this.field141 = var1;
      this.field137 = var2;
      this.field138 = new class457(this);
      this.field142 = this.method101(var3);
   }

   final ThreadPoolExecutor method101(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field137), this.field138);
   }

   public class326 method102(class201 var1) {
      if (this.field142.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field142.getCorePoolSize() + " Queue capacity " + this.field137);
         return new class326("Queue full");
      } else {
         class326 var3 = new class326(this.field142.submit(new class449(this, var1)));
         return var3;
      }
   }

   public final void method105() {
      try {
         this.field142.shutdown();
      } catch (Exception var3) {
         System.err.println("Error shutting down RestRequestService\r\n" + var3);
      }

   }

   static final void method103(byte[] var0, int var1, int var2, int var3, int var4, class391[] var5) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var8 + var1 > 0 && var8 + var1 < 103 && var2 + var9 > 0 && var2 + var9 < 103) {
                  var5[var7].field3445[var8 + var1][var2 + var9] &= -16777217;
               }
            }
         }
      }

      class134 var13 = new class134(var0);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               int var11 = var1 + var9;
               int var12 = var2 + var10;
               class58.method335(var13, var8, var11, var12, var11 + var3, var4 + var12, 0);
            }
         }
      }

   }

   static int method106(int var0, class472 var1, boolean var2) {
      class210 var4 = class274.method1301(class150.field1580[--class188.field1989]);
      if (var0 == 2500) {
         class150.field1580[++class188.field1989 - 1] = var4.field2228;
         return 1;
      } else if (var0 == 2501) {
         class150.field1580[++class188.field1989 - 1] = var4.field2229;
         return 1;
      } else if (var0 == 2502) {
         class150.field1580[++class188.field1989 - 1] = var4.field2230;
         return 1;
      } else if (var0 == 2503) {
         class150.field1580[++class188.field1989 - 1] = var4.field2289;
         return 1;
      } else if (var0 == 2504) {
         class150.field1580[++class188.field1989 - 1] = var4.field2267 ? 1 : 0;
         return 1;
      } else if (var0 == 2505) {
         class150.field1580[++class188.field1989 - 1] = var4.field2234;
         return 1;
      } else {
         return 2;
      }
   }

   static final void method104(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var2 = (float)var0 / 200.0F + 0.5F;
      class51.method292((double)var2);
   }
}
