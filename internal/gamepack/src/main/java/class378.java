@ObfInfo(
   name = "fh"
)
public class class378 {
   @ObfInfo(
      owner = "fh",
      name = "t",
      desc = "Lqy;"
   )
   static class127 field3191;
   // $FF: synthetic field
   @ObfInfo(
      owner = "fh",
      name = "this$0",
      desc = "Lfk;"
   )
   final class277 this$0;
   @ObfInfo(
      owner = "fh",
      name = "m",
      desc = "[F"
   )
   public float[] field3187;
   @ObfInfo(
      owner = "fh",
      name = "r",
      desc = "I"
   )
   public int field3188;
   @ObfInfo(
      owner = "fh",
      name = "q",
      desc = "I"
   )
   public int field3189;
   @ObfInfo(
      owner = "fh",
      name = "f",
      desc = "I"
   )
   public int field3190;
   @ObfInfo(
      owner = "fh",
      name = "x",
      desc = "Ljava/lang/String;"
   )
   public String field3186;

   @ObfInfo(
      owner = "fh",
      name = "<init>",
      desc = "(Lfk;)V"
   )
   class378(class277 var1) {
      this.this$0 = var1;
      this.field3187 = new float[4];
      this.field3189 = 1;
      this.field3190 = 1;
      this.field3188 = 0;
   }

   @ObfInfo(
      owner = "fh",
      name = "hx",
      desc = "(IB)V"
   )
   static void method1863(int var0) {
      if (var0 == -1 && !client.field477) {
         class403.method1988();
      } else if (var0 != -1 && var0 != client.field476 && class50.field574.method2210() != 0 && !client.field477) {
         class38 var2 = class317.field2494;
         int var3 = class50.field574.method2210();
         class40.field201 = 1;
         class253.field2089 = var2;
         class342.field2747 = var0;
         class40.field204 = 0;
         class489.field4078 = var3;
         class463.field3847 = false;
         class40.field203 = 2;
      }

      client.field476 = var0;
   }

   @ObfInfo(
      owner = "fh",
      name = "ku",
      desc = "([Lkd;Lkd;ZI)V"
   )
   static void method1862(class120[] var0, class120 var1, boolean var2) {
      int var4 = var1.field915 != 0 ? var1.field915 : var1.field908;
      int var5 = var1.field916 != 0 ? var1.field916 : var1.field967;
      class201.method886(var0, var1.field985, var4, var5, var2);
      if (var1.field1031 != null) {
         class201.method886(var1.field1031, var1.field985, var4, var5, var2);
      }

      class415 var6 = (class415)client.field394.method791((long)var1.field985);
      if (null != var6) {
         class355.method1774(var6.field3426, var4, var5, var2);
      }

      if (1337 == var1.field993) {
         ;
      }

   }

   @ObfInfo(
      owner = "fh",
      name = "me",
      desc = "(B)V"
   )
   static final void method1861() {
      for(int var1 = 0; var1 < class268.field2221; ++var1) {
         class380 var2 = client.field347[class268.field2220[var1]];
         var2.method1877();
      }

   }
}
