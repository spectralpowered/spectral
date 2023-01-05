import java.util.concurrent.Future;

public class class326 {
   static class144 field3047;
   static short[] field3048;
   String field3049;
   Future field3050;

   class326(Future var1) {
      this.field3050 = var1;
   }

   class326(String var1) {
      this.method1574(var1);
   }

   void method1574(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.field3049 = var1;
      if (null != this.field3050) {
         this.field3050.cancel(true);
         this.field3050 = null;
      }

   }

   public final String method1575() {
      return this.field3049;
   }

   public boolean method1577() {
      return null != this.field3049 || this.field3050 == null;
   }

   public final boolean method1576() {
      return this.method1577() ? true : this.field3050.isDone();
   }

   public final class269 method1578() {
      if (this.method1577()) {
         return new class269(this.field3049);
      } else if (!this.method1576()) {
         return null;
      } else {
         try {
            return (class269)this.field3050.get();
         } catch (Exception var4) {
            String var3 = "Error retrieving REST request reply";
            System.err.println(var3 + "\r\n" + var4);
            this.method1574(var3);
            return new class269(var3);
         }
      }
   }

   static final void method1579(class421 var0, int var1) {
      int var3 = var0.field1487;
      class25.field182 = 0;
      class88.method491(var0);
      class36.method182(var0);
      if (var0.field1487 - var3 != var1) {
         throw new RuntimeException(var0.field1487 - var3 + " " + var1);
      }
   }
}
