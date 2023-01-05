import java.util.concurrent.Future;

public class class3 {
   static class92 field21;
   static short[] field22;
   String field23;
   Future field24;

   class3(Future var1) {
      this.field24 = var1;
   }

   class3(String var1) {
      this.method14(var1);
   }

   void method14(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.field23 = var1;
      if (null != this.field24) {
         this.field24.cancel(true);
         this.field24 = null;
      }

   }

   public final String method15() {
      return this.field23;
   }

   public boolean method17() {
      return null != this.field23 || this.field24 == null;
   }

   public final boolean method16() {
      return this.method17() ? true : this.field24.isDone();
   }

   public final class32 method18() {
      if (this.method17()) {
         return new class32(this.field23);
      } else if (!this.method16()) {
         return null;
      } else {
         try {
            return (class32)this.field24.get();
         } catch (Exception var4) {
            String var3 = "Error retrieving REST request reply";
            System.err.println(var3 + "\r\n" + var4);
            this.method14(var3);
            return new class32(var3);
         }
      }
   }

   static final void method19(class6 var0, int var1) {
      int var3 = var0.field1070;
      class268.field2223 = 0;
      class9.method57(var0);
      class102.method409(var0);
      if (var0.field1070 - var3 != var1) {
         throw new RuntimeException(var0.field1070 - var3 + " " + var1);
      }
   }
}
