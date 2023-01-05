import java.util.Iterator;

public class class449 extends class4 implements class76 {
   final class111 field3740 = new class111(64);
   final class274 field3739;
   final int field3738;

   public class449(class493 var1, int var2, class476 var3, class274 var4) {
      super(var1, var3, null != var4 ? var4.method1360(var2) : 0);
      this.field3739 = var4;
      this.field3738 = var2;
   }

   protected class379 method22(int var1) {
      class111 var4 = this.field3740;
      synchronized(this.field3740) {
         class481 var3 = (class481)this.field3740.method441((long)var1);
         if (var3 == null) {
            var3 = this.method2236(var1);
            this.field3740.method443(var3, (long)var1);
         }

         return var3;
      }
   }

   class481 method2236(int var1) {
      byte[] var3 = this.field3739.method1365(this.field3738, var1);
      class481 var4 = new class481(var1);
      if (null != var3) {
         var4.method1864(new class127(var3));
      }

      return var4;
   }

   public void method2235() {
      class111 var2 = this.field3740;
      synchronized(this.field3740) {
         this.field3740.method440();
      }
   }

   public Iterator iterator() {
      return new class279(this);
   }

   public static byte[] method2237(byte[] var0) {
      int var2 = var0.length;
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, 0, var3, 0, var2);
      return var3;
   }
}
