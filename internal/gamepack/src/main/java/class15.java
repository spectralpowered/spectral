public class class15 extends class187 {
   static int[][][] field132;
   byte field129;
   byte field131;
   String field130;
   // $FF: synthetic field
   final class124 this$0;

   class15(class124 var1) {
      this.this$0 = var1;
   }

   void method972(class134 var1) {
      this.field130 = var1.method676();
      if (this.field130 != null) {
         var1.method669();
         this.field129 = var1.method670();
         this.field131 = var1.method670();
      }

   }

   void method973(class112 var1) {
      var1.field1392 = this.field130;
      if (null != this.field130) {
         var1.field1393 = this.field129;
         var1.field1395 = this.field131;
      }

   }

   public static int method95(int var0, int var1, int var2) {
      int var4 = class30.method159(var2 - var1 + 1);
      var4 <<= var1;
      return var0 & ~var4;
   }

   public static boolean method94() {
      return class126.field1458 != 0 ? true : class158.field1647.method2327();
   }

   static final void method93(String var0, int var1) {
      class81 var3 = class189.method982(class165.field1758, client.field483.field3459);
      var3.field933.method666(class444.method2117(var0) + 1);
      var3.field933.method688(var1);
      var3.field933.method660(var0, (byte)67);
      client.field483.method1920(var3);
   }
}
