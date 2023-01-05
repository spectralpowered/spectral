import java.util.Iterator;

public class class407 extends class14 implements class217 {
   final class164 field3542;
   final class279 field3543 = new class279(64);
   final int field3541;

   public class407(class340 var1, int var2, class22 var3, class164 var4) {
      super(var1, var3, null != var4 ? var4.method887(var2) : 0);
      this.field3542 = var4;
      this.field3541 = var2;
   }

   protected class419 method89(int var1) {
      class279 var4 = this.field3543;
      synchronized(this.field3543) {
         class436 var3 = (class436)this.field3543.method1309((long)var1);
         if (var3 == null) {
            var3 = this.method1991(var1);
            this.field3543.method1311(var3, (long)var1);
         }

         return var3;
      }
   }

   class436 method1991(int var1) {
      byte[] var3 = this.field3542.method892(this.field3541, var1);
      class436 var4 = new class436(var1);
      if (null != var3) {
         var4.method2011(new class134(var3));
      }

      return var4;
   }

   public void method1990() {
      class279 var2 = this.field3543;
      synchronized(this.field3543) {
         this.field3543.method1308();
      }
   }

   public Iterator iterator() {
      return new class471(this);
   }

   public static byte[] method1992(byte[] var0) {
      int var2 = var0.length;
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, 0, var3, 0, var2);
      return var3;
   }
}
