public class class45 extends class187 {
   byte field381;
   int field379;
   String field380;
   // $FF: synthetic field
   final class124 this$0;

   class45(class124 var1) {
      this.this$0 = var1;
      this.field380 = null;
   }

   void method972(class134 var1) {
      if (var1.method669() != 255) {
         --var1.field1487;
         var1.method720();
      }

      this.field380 = var1.method676();
      this.field379 = var1.method671();
      this.field381 = var1.method670();
      var1.method720();
   }

   void method973(class112 var1) {
      class278 var3 = new class278();
      var3.field2757 = new class174(this.field380);
      var3.field2758 = this.field379;
      var3.field2759 = this.field381;
      var1.method590(var3);
   }

   public static boolean method232(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }
}
