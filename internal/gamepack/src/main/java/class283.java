@ObfInfo(
   name = "eg"
)
public class class283 extends class410 {
   @ObfInfo(
      owner = "eg",
      name = "e",
      desc = "B"
   )
   byte field2340;
   @ObfInfo(
      owner = "eg",
      name = "h",
      desc = "I"
   )
   int field2341;
   @ObfInfo(
      owner = "eg",
      name = "v",
      desc = "I"
   )
   int field2342;
   @ObfInfo(
      owner = "eg",
      name = "x",
      desc = "Ljava/lang/String;"
   )
   String field2343;
   // $FF: synthetic field
   @ObfInfo(
      owner = "eg",
      name = "this$0",
      desc = "Led;"
   )
   final class302 this$0;

   @ObfInfo(
      owner = "eg",
      name = "<init>",
      desc = "(Led;)V"
   )
   class283(class302 var1) {
      this.this$0 = var1;
      this.field2341 = -1;
   }

   @ObfInfo(
      owner = "eg",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method2007(class127 var1) {
      var1.method547();
      this.field2341 = var1.method549();
      this.field2340 = var1.method548();
      this.field2342 = var1.method549();
      var1.method598();
      this.field2343 = var1.method555();
      var1.method547();
   }

   @ObfInfo(
      owner = "eg",
      name = "e",
      desc = "(Lfn;I)V"
   )
   void method2008(class57 var1) {
      class49 var3 = (class49)var1.field597.get(this.field2341);
      var3.field569 = this.field2340;
      var3.field568 = this.field2342;
      var3.field567 = new class257(this.field2343);
   }

   @ObfInfo(
      owner = "eg",
      name = "e",
      desc = "(II)Lgv;"
   )
   public static class123 method1395(int var0) {
      class123 var2 = (class123)class123.field1056.method394((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class123.field1060.method1365(11, var0);
         var2 = new class123();
         if (var3 != null) {
            var2.method522(new class127(var3));
         }

         var2.method525();
         class123.field1056.method396(var2, (long)var0);
         return var2;
      }
   }

   @ObfInfo(
      owner = "eg",
      name = "h",
      desc = "(I)[Llq;"
   )
   public static class425[] method1394() {
      return new class425[]{class425.field3508, class425.field3513, class425.field3506, class425.field3507, class425.field3519, class425.field3505, class425.field3515, class425.field3514, class425.field3522, class425.field3511, class425.field3503, class425.field3512, class425.field3504, class425.field3510, class425.field3516, class425.field3517, class425.field3518};
   }

   @ObfInfo(
      owner = "eg",
      name = "q",
      desc = "(B)V"
   )
   public static void method1396() {
      class327.field2581.method395();
      class327.field2582.method395();
   }
}
