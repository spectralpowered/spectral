@ObfInfo(
   name = "fi"
)
public class class85 extends class195 {
   @ObfInfo(
      owner = "fi",
      name = "h",
      desc = "Lly;"
   )
   public static class274 field699;
   @ObfInfo(
      owner = "fi",
      name = "e",
      desc = "I"
   )
   public static int field701;
   @ObfInfo(
      owner = "fi",
      name = "el",
      desc = "Lln;"
   )
   static class38 field702;
   @ObfInfo(
      owner = "fi",
      name = "v",
      desc = "Ljv;"
   )
   static class99 field700 = new class99(64);
   @ObfInfo(
      owner = "fi",
      name = "x",
      desc = "I"
   )
   public int field698 = 0;

   @ObfInfo(
      owner = "fi",
      name = "e",
      desc = "(Lqy;B)V"
   )
   void method353(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         this.method357(var1, var3);
      }
   }

   @ObfInfo(
      owner = "fi",
      name = "v",
      desc = "(Lqy;II)V"
   )
   void method357(class127 var1, int var2) {
      if (var2 == 5) {
         this.field698 = var1.method549();
      }

   }

   @ObfInfo(
      owner = "fi",
      name = "e",
      desc = "(II)Lgn;"
   )
   public static class87 method356(int var0) {
      class87 var2 = (class87)class87.field707.method394((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class87.field706.method1365(6, var0);
         var2 = new class87();
         var2.field712 = var0;
         if (var3 != null) {
            var2.method362(new class127(var3));
         }

         var2.method365();
         if (var2.field740) {
            var2.field717 = 0;
            var2.field730 = false;
         }

         class87.field707.method396(var2, (long)var0);
         return var2;
      }
   }

   @ObfInfo(
      owner = "fi",
      name = "u",
      desc = "([BI)V"
   )
   public static void method354(byte[] var0) {
      class127 var2 = new class127(var0);
      var2.field1070 = var0.length - 2;
      class18.field91 = var2.method549();
      class18.field92 = new int[class18.field91];
      class110.field826 = new int[class18.field91];
      class418.field3431 = new int[class18.field91];
      class50.field576 = new int[class18.field91];
      class340.field2723 = new byte[class18.field91][];
      var2.field1070 = var0.length - 7 - class18.field91 * 8;
      class183.field1682 = var2.method549();
      class18.field90 = var2.method549();
      int var3 = (var2.method547() & 255) + 1;

      int var4;
      for(var4 = 0; var4 < class18.field91; ++var4) {
         class18.field92[var4] = var2.method549();
      }

      for(var4 = 0; var4 < class18.field91; ++var4) {
         class110.field826[var4] = var2.method549();
      }

      for(var4 = 0; var4 < class18.field91; ++var4) {
         class418.field3431[var4] = var2.method549();
      }

      for(var4 = 0; var4 < class18.field91; ++var4) {
         class50.field576[var4] = var2.method549();
      }

      var2.field1070 = var0.length - 7 - class18.field91 * 8 - 3 * (var3 - 1);
      class413.field3422 = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         class413.field3422[var4] = var2.method551();
         if (0 == class413.field3422[var4]) {
            class413.field3422[var4] = 1;
         }
      }

      var2.field1070 = 0;

      for(var4 = 0; var4 < class18.field91; ++var4) {
         int var5 = class418.field3431[var4];
         int var6 = class50.field576[var4];
         int var7 = var6 * var5;
         byte[] var8 = new byte[var7];
         class340.field2723[var4] = var8;
         int var9 = var2.method547();
         int var10;
         if (var9 == 0) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.method548();
            }
         } else if (var9 == 1) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var10 + var5 * var11] = var2.method548();
               }
            }
         }
      }

   }

   @ObfInfo(
      owner = "fi",
      name = "v",
      desc = "(Lln;IIIBZB)V"
   )
   static void method352(class38 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var7 = (long)(var2 + (var1 << 16));
      class363 var9 = (class363)class462.field3837.method791(var7);
      if (var9 == null) {
         var9 = (class363)class462.field3831.method791(var7);
         if (null == var9) {
            var9 = (class363)class462.field3834.method791(var7);
            if (null != var9) {
               if (var5) {
                  var9.method870();
                  class462.field3837.method788(var9, var7);
                  --class462.field3835;
                  ++class462.field3830;
               }

            } else {
               if (!var5) {
                  var9 = (class363)class462.field3836.method791(var7);
                  if (null != var9) {
                     return;
                  }
               }

               var9 = new class363();
               var9.field3087 = var0;
               var9.field3088 = var3;
               var9.field3089 = var4;
               if (var5) {
                  class462.field3837.method788(var9, var7);
                  ++class462.field3830;
               } else {
                  class462.field3829.method858(var9);
                  class462.field3834.method788(var9, var7);
                  ++class462.field3835;
               }

            }
         }
      }
   }

   @ObfInfo(
      owner = "fi",
      name = "mv",
      desc = "(II)V"
   )
   static void method355(int var0) {
      for(class245 var2 = (class245)client.field271.method789(); null != var2; var2 = (class245)client.field271.method790()) {
         if ((var2.field1134 >> 48 & 65535L) == (long)var0) {
            var2.method637();
         }
      }

   }
}
