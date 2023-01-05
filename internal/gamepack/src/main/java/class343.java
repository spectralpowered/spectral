@ObfInfo(
   name = "en"
)
public class class343 extends class410 {
   @ObfInfo(
      owner = "en",
      name = "v",
      desc = "B"
   )
   byte field2751;
   @ObfInfo(
      owner = "en",
      name = "e",
      desc = "I"
   )
   int field2749;
   @ObfInfo(
      owner = "en",
      name = "h",
      desc = "Ljava/lang/String;"
   )
   String field2750;
   // $FF: synthetic field
   @ObfInfo(
      owner = "en",
      name = "this$0",
      desc = "Led;"
   )
   final class302 this$0;

   @ObfInfo(
      owner = "en",
      name = "<init>",
      desc = "(Led;)V"
   )
   class343(class302 var1) {
      this.this$0 = var1;
      this.field2750 = null;
   }

   @ObfInfo(
      owner = "en",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method2007(class127 var1) {
      if (var1.method547() != 255) {
         --var1.field1070;
         var1.method598();
      }

      this.field2750 = var1.method554();
      this.field2749 = var1.method549();
      this.field2751 = var1.method548();
      var1.method598();
   }

   @ObfInfo(
      owner = "en",
      name = "e",
      desc = "(Lfn;I)V"
   )
   void method2008(class57 var1) {
      class49 var3 = new class49();
      var3.field567 = new class257(this.field2750);
      var3.field568 = this.field2749;
      var3.field569 = this.field2751;
      var1.method273(var3);
   }

   @ObfInfo(
      owner = "en",
      name = "a",
      desc = "(CI)Z"
   )
   public static boolean method1744(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }
}
