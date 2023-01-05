import java.util.Iterator;

@ObfInfo(
   name = "qk"
)
public class class449 extends class4 implements class76 {
   @ObfInfo(
      owner = "qk",
      name = "v",
      desc = "Ljj;"
   )
   final class111 field3740 = new class111(64);
   @ObfInfo(
      owner = "qk",
      name = "e",
      desc = "Lly;"
   )
   final class274 field3739;
   @ObfInfo(
      owner = "qk",
      name = "x",
      desc = "I"
   )
   final int field3738;

   @ObfInfo(
      owner = "qk",
      name = "<init>",
      desc = "(Llw;ILmb;Lly;)V"
   )
   public class449(class493 var1, int var2, class476 var3, class274 var4) {
      super(var1, var3, null != var4 ? var4.method1360(var2) : 0);
      this.field3739 = var4;
      this.field3738 = var2;
   }

   @ObfInfo(
      owner = "qk",
      name = "h",
      desc = "(II)Lpv;"
   )
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

   @ObfInfo(
      owner = "qk",
      name = "a",
      desc = "(II)Lpe;"
   )
   class481 method2236(int var1) {
      byte[] var3 = this.field3739.method1365(this.field3738, var1);
      class481 var4 = new class481(var1);
      if (null != var3) {
         var4.method1864(new class127(var3));
      }

      return var4;
   }

   @ObfInfo(
      owner = "qk",
      name = "s",
      desc = "(I)V"
   )
   public void method2235() {
      class111 var2 = this.field3740;
      synchronized(this.field3740) {
         this.field3740.method440();
      }
   }

   @ObfInfo(
      owner = "qk",
      name = "iterator",
      desc = "()Ljava/util/Iterator;"
   )
   public Iterator iterator() {
      return new class279(this);
   }

   @ObfInfo(
      owner = "qk",
      name = "e",
      desc = "([BI)[B"
   )
   public static byte[] method2237(byte[] var0) {
      int var2 = var0.length;
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, 0, var3, 0, var2);
      return var3;
   }
}
