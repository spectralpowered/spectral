public abstract class class437 extends class139 {
   class437 field3619;
   class490 field3618;
   int field3621;
   volatile boolean field3620 = true;

   protected abstract class437 method2168();

   protected abstract class437 method2171();

   protected abstract int method2173();

   protected abstract void method2169(int[] var1, int var2, int var3);

   protected abstract void method2172(int var1);

   int method2167() {
      return 255;
   }

   final void method2170(int[] var1, int var2, int var3) {
      if (this.field3620) {
         this.method2169(var1, var2, var3);
      } else {
         this.method2172(var3);
      }

   }
}
