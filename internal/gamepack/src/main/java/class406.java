@ObfInfo(
   name = "fw"
)
public class class406 extends class195 {
   @ObfInfo(
      owner = "fw",
      name = "h",
      desc = "Lly;"
   )
   public static class274 field3401;
   @ObfInfo(
      owner = "fw",
      name = "v",
      desc = "Ljv;"
   )
   public static class99 field3396 = new class99(64);
   @ObfInfo(
      owner = "fw",
      name = "e",
      desc = "Lly;"
   )
   static class274 field3393;
   @ObfInfo(
      owner = "fw",
      name = "x",
      desc = "Ljv;"
   )
   static class99 field3395 = new class99(64);
   @ObfInfo(
      owner = "fw",
      name = "pj",
      desc = "I"
   )
   static int field3406;
   @ObfInfo(
      owner = "fw",
      name = "i",
      desc = "I"
   )
   int field3402 = -1;
   @ObfInfo(
      owner = "fw",
      name = "o",
      desc = "I"
   )
   int field3403 = -1;
   @ObfInfo(
      owner = "fw",
      name = "g",
      desc = "I"
   )
   public int field3392 = 70;
   @ObfInfo(
      owner = "fw",
      name = "j",
      desc = "I"
   )
   public int field3394 = 1;
   @ObfInfo(
      owner = "fw",
      name = "r",
      desc = "I"
   )
   public int field3397 = 255;
   @ObfInfo(
      owner = "fw",
      name = "u",
      desc = "I"
   )
   public int field3398 = 255;
   @ObfInfo(
      owner = "fw",
      name = "b",
      desc = "I"
   )
   public int field3399 = -1;
   @ObfInfo(
      owner = "fw",
      name = "m",
      desc = "I"
   )
   public int field3400;
   @ObfInfo(
      owner = "fw",
      name = "n",
      desc = "I"
   )
   public int field3404 = 30;
   @ObfInfo(
      owner = "fw",
      name = "k",
      desc = "I"
   )
   public int field3405 = 0;

   @ObfInfo(
      owner = "fw",
      name = "e",
      desc = "(Lqy;B)V"
   )
   public void method1995(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         this.method1992(var1, var3);
      }
   }

   @ObfInfo(
      owner = "fw",
      name = "v",
      desc = "(Lqy;IB)V"
   )
   void method1992(class127 var1, int var2) {
      if (var2 == 1) {
         var1.method549();
      } else if (var2 == 2) {
         this.field3397 = var1.method547();
      } else if (var2 == 3) {
         this.field3398 = var1.method547();
      } else if (var2 == 4) {
         this.field3399 = 0;
      } else if (var2 == 5) {
         this.field3392 = var1.method549();
      } else if (var2 == 6) {
         var1.method547();
      } else if (var2 == 7) {
         this.field3402 = var1.method560();
      } else if (var2 == 8) {
         this.field3403 = var1.method560();
      } else if (var2 == 11) {
         this.field3399 = var1.method549();
      } else if (var2 == 14) {
         this.field3404 = var1.method547();
      } else if (var2 == 15) {
         this.field3405 = var1.method547();
      }

   }

   @ObfInfo(
      owner = "fw",
      name = "x",
      desc = "(I)Lrx;"
   )
   public class266 method1993() {
      if (this.field3402 < 0) {
         return null;
      } else {
         class266 var2 = (class266)field3395.method394((long)this.field3402);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class84.method341(field3393, this.field3402, 0);
            if (var2 != null) {
               field3395.method396(var2, (long)this.field3402);
            }

            return var2;
         }
      }
   }

   @ObfInfo(
      owner = "fw",
      name = "m",
      desc = "(I)Lrx;"
   )
   public class266 method1994() {
      if (this.field3403 < 0) {
         return null;
      } else {
         class266 var2 = (class266)field3395.method394((long)this.field3403);
         if (null != var2) {
            return var2;
         } else {
            var2 = class84.method341(field3393, this.field3403, 0);
            if (var2 != null) {
               field3395.method396(var2, (long)this.field3403);
            }

            return var2;
         }
      }
   }

   @ObfInfo(
      owner = "fw",
      name = "ky",
      desc = "(Ljava/lang/String;Lkd;I)Ljava/lang/String;"
   )
   static String method1996(String var0, class120 var1) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               String var5 = var0.substring(0, var4);
               int var7 = class339.method1702(var1, var3 - 1);
               String var6;
               if (var7 < 999999999) {
                  var6 = Integer.toString(var7);
               } else {
                  var6 = "*";
               }

               var0 = var5 + var6 + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }
}
