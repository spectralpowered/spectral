public class class23 {
   static class344 field110;
   class221 field109;
   int field106;
   int field107;
   String field108;

   class23(String var1, int var2, int var3, class221 var4) {
      this.field108 = var1;
      this.field107 = var2;
      this.field106 = var3;
      this.field109 = var4;
   }

   static int method97(char var0, class476 var1) {
      int var3 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = 1 + (var0 << 4);
      }

      if (var0 == 241 && var1 == class476.field4002) {
         var3 = 1762;
      }

      return var3;
   }

   static final void method98(class120[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class120 var4 = var0[var3];
         if (null != var4) {
            if (0 == var4.field1026) {
               if (null != var4.field1031) {
                  method98(var4.field1031, var1);
               }

               class415 var5 = (class415)client.field394.method791((long)var4.field985);
               if (var5 != null) {
                  class452.method2240(var5.field3426, var1);
               }
            }

            class488 var6;
            if (var1 == 0 && var4.field1014 != null) {
               var6 = new class488();
               var6.field4067 = var4;
               var6.field4069 = var4.field1014;
               class396.method1949(var6);
            }

            if (var1 == 1 && var4.field1015 != null) {
               if (var4.field895 >= 0) {
                  class120 var7 = class67.method299(var4.field985);
                  if (null == var7 || null == var7.field1031 || var4.field895 >= var7.field1031.length || var7.field1031[var4.field895] != var4) {
                     continue;
                  }
               }

               var6 = new class488();
               var6.field4067 = var4;
               var6.field4069 = var4.field1015;
               class396.method1949(var6);
            }
         }
      }

   }
}
