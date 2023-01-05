public class class306 extends class189 {
   String field2895;
   long field2896;
   // $FF: synthetic field
   final class105 this$0;

   class306(class105 var1) {
      this.this$0 = var1;
      this.field2896 = -1L;
      this.field2895 = null;
   }

   void method979(class134 var1) {
      if (var1.method669() != 255) {
         --var1.field1487;
         this.field2896 = var1.method720();
      }

      this.field2895 = var1.method676();
   }

   void method980(class27 var1) {
      var1.method147(this.field2896, this.field2895, 0);
   }

   static int method1441(class164 var0, class164 var1) {
      int var3 = 0;
      String[] var4 = class52.field770;

      int var5;
      String var6;
      for(var5 = 0; var5 < var4.length; ++var5) {
         var6 = var4[var5];
         if (var0.method885(var6, "")) {
            ++var3;
         }
      }

      var4 = class52.field768;

      for(var5 = 0; var5 < var4.length; ++var5) {
         var6 = var4[var5];
         if (var1.method885(var6, "")) {
            ++var3;
         }
      }

      var4 = class52.field788;

      for(var5 = 0; var5 < var4.length; ++var5) {
         var6 = var4[var5];
         if (var1.method883(var6) != -1 && var1.method885(var6, "")) {
            ++var3;
         }
      }

      return var3;
   }
}
