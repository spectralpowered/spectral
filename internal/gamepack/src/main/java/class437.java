@ObfInfo(
   name = "aa"
)
public abstract class class437 extends class139 {
   @ObfInfo(
      owner = "aa",
      name = "k",
      desc = "Laa;"
   )
   class437 field3619;
   @ObfInfo(
      owner = "aa",
      name = "s",
      desc = "Lbc;"
   )
   class490 field3618;
   @ObfInfo(
      owner = "aa",
      name = "a",
      desc = "I"
   )
   int field3621;
   @ObfInfo(
      owner = "aa",
      name = "l",
      desc = "Z"
   )
   volatile boolean field3620 = true;

   @ObfInfo(
      owner = "aa",
      name = "q",
      desc = "()Laa;"
   )
   protected abstract class437 method2168();

   @ObfInfo(
      owner = "aa",
      name = "f",
      desc = "()Laa;"
   )
   protected abstract class437 method2171();

   @ObfInfo(
      owner = "aa",
      name = "r",
      desc = "()I"
   )
   protected abstract int method2173();

   @ObfInfo(
      owner = "aa",
      name = "u",
      desc = "([III)V"
   )
   protected abstract void method2169(int[] var1, int var2, int var3);

   @ObfInfo(
      owner = "aa",
      name = "j",
      desc = "(I)V"
   )
   protected abstract void method2172(int var1);

   @ObfInfo(
      owner = "aa",
      name = "af",
      desc = "()I"
   )
   int method2167() {
      return 255;
   }

   @ObfInfo(
      owner = "aa",
      name = "fb",
      desc = "([III)V"
   )
   final void method2170(int[] var1, int var2, int var3) {
      if (this.field3620) {
         this.method2169(var1, var2, var3);
      } else {
         this.method2172(var3);
      }

   }
}
