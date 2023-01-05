@ObfInfo(
   name = "em"
)
public class class182 {
   @ObfInfo(
      owner = "em",
      name = "iv",
      desc = "Lrx;"
   )
   static class266 field1681;
   @ObfInfo(
      owner = "em",
      name = "fu",
      desc = "Ljava/lang/String;"
   )
   static String field1677;
   @ObfInfo(
      owner = "em",
      name = "v",
      desc = "Lmv;"
   )
   class395 field1679 = new class395();
   @ObfInfo(
      owner = "em",
      name = "e",
      desc = "I"
   )
   int field1678 = -1;
   @ObfInfo(
      owner = "em",
      name = "h",
      desc = "J"
   )
   long field1680;

   @ObfInfo(
      owner = "em",
      name = "<init>",
      desc = "(Lqy;)V"
   )
   public class182(class127 var1) {
      this.method831(var1);
   }

   @ObfInfo(
      owner = "em",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method831(class127 var1) {
      this.field1680 = var1.method598();
      this.field1678 = var1.method595();

      for(int var3 = var1.method547(); var3 != 0; var3 = var1.method547()) {
         Object var4;
         if (var3 == 3) {
            var4 = new class381(this);
         } else if (var3 == 1) {
            var4 = new class416(this);
         } else if (var3 == 13) {
            var4 = new class188(this);
         } else if (var3 == 4) {
            var4 = new class398(this);
         } else if (var3 == 6) {
            var4 = new class332(this);
         } else if (var3 == 5) {
            var4 = new class456(this);
         } else if (var3 == 2) {
            var4 = new class261(this);
         } else if (var3 == 7) {
            var4 = new class467(this);
         } else if (var3 == 14) {
            var4 = new class15(this);
         } else if (var3 == 8) {
            var4 = new class312(this);
         } else if (var3 == 9) {
            var4 = new class97(this);
         } else if (var3 == 10) {
            var4 = new class114(this);
         } else if (var3 == 11) {
            var4 = new class60(this);
         } else if (var3 == 12) {
            var4 = new class463(this);
         } else {
            if (var3 != 15) {
               throw new RuntimeException("");
            }

            var4 = new class113(this);
         }

         ((class480)var4).method2367(var1);
         this.field1679.method1939((class139)var4);
      }

   }

   @ObfInfo(
      owner = "em",
      name = "e",
      desc = "(Lep;I)V"
   )
   public void method832(class429 var1) {
      if (this.field1680 == var1.field3546 && var1.field3567 == this.field1678) {
         for(class480 var3 = (class480)this.field1679.method1941(); null != var3; var3 = (class480)this.field1679.method1935()) {
            var3.method2368(var1);
         }

         ++var1.field3567;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfInfo(
      owner = "em",
      name = "u",
      desc = "([BIILhc;[Lgw;B)V"
   )
   static final void method830(byte[] var0, int var1, int var2, class318 var3, class427[] var4) {
      class127 var6 = new class127(var0);
      int var7 = -1;

      while(true) {
         int var8 = var6.method601();
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var10 = var6.method559();
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.method547();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var1 + var12;
            int var18 = var11 + var2;
            if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
               int var19 = var13;
               if (2 == (class71.field644[1][var17][var18] & 2)) {
                  var19 = var13 - 1;
               }

               class427 var20 = null;
               if (var19 >= 0) {
                  var20 = var4[var19];
               }

               class434.method2156(var13, var17, var18, var7, var16, var15, var3, var20);
            }
         }
      }
   }
}
