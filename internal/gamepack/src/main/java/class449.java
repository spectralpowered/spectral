import java.awt.Font;
import java.io.IOException;
import java.util.concurrent.Callable;

public class class449 implements Callable {
   public static class179 field3692;
   static class27 field3690;
   static Font field3691;
   // $FF: synthetic field
   final class18 this$0;
   final class201 field3693;

   class449(class18 var1, class201 var2) {
      this.this$0 = var1;
      this.field3693 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field3693.method1014()) {
            class324.method1571(10L);
         }
      } catch (IOException var2) {
         return new class269("Error servicing REST query: " + var2.getMessage());
      }

      return this.field3693.method1015();
   }

   static int method2124(int var0, class472 var1, boolean var2) {
      return 2;
   }

   static void method2125(class79 var0, int var1, int var2, int var3) {
      if (client.field682 < 50 && class111.field1385.method1345() != 0) {
         if (var0.field904 != null && var0.field904.containsKey(var1)) {
            int var5 = ((Integer)var0.field904.get(var1)).intValue();
            if (var5 != 0) {
               int var8 = var5 >> 8;
               int var9 = var5 >> 4 & 7;
               int var10 = var5 & 15;
               client.field683[client.field682] = var8;
               client.field684[client.field682] = var9;
               client.field712[client.field682] = 0;
               client.field492[client.field682] = null;
               int var11 = (var2 - 64) / 128;
               int var12 = (var3 - 64) / 128;
               client.field538[client.field682] = var10 + (var12 << 8) + (var11 << 16);
               ++client.field682;
            }

         }
      }
   }

   static int method2126(int var0, class472 var1, boolean var2) {
      int var4;
      if (var0 == 4200) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1581[++class150.field1582 - 1] = class272.method1294(var4).field3764;
         return 1;
      } else {
         class458 var6;
         int var7;
         if (var0 == 4201) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var7 = class150.field1580[class188.field1989 + 1];
            var6 = class272.method1294(var4);
            if (var7 >= 1 && var7 <= 5 && null != var6.field3762[var7 - 1]) {
               class150.field1581[++class150.field1582 - 1] = var6.field3762[var7 - 1];
            } else {
               class150.field1581[++class150.field1582 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var7 = class150.field1580[1 + class188.field1989];
            var6 = class272.method1294(var4);
            if (var7 >= 1 && var7 <= 5 && null != var6.field3781[var7 - 1]) {
               class150.field1581[++class150.field1582 - 1] = var6.field3781[var7 - 1];
            } else {
               class150.field1581[++class150.field1582 - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var4 = class150.field1580[--class188.field1989];
            class150.field1580[++class188.field1989 - 1] = class272.method1294(var4).field3775;
            return 1;
         } else if (var0 == 4204) {
            var4 = class150.field1580[--class188.field1989];
            class150.field1580[++class188.field1989 - 1] = class272.method1294(var4).field3774 == 1 ? 1 : 0;
            return 1;
         } else {
            class458 var5;
            if (var0 == 4205) {
               var4 = class150.field1580[--class188.field1989];
               var5 = class272.method1294(var4);
               if (-1 == var5.field3798 && var5.field3802 >= 0) {
                  class150.field1580[++class188.field1989 - 1] = var5.field3802;
               } else {
                  class150.field1580[++class188.field1989 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4206) {
               var4 = class150.field1580[--class188.field1989];
               var5 = class272.method1294(var4);
               if (var5.field3798 >= 0 && var5.field3802 >= 0) {
                  class150.field1580[++class188.field1989 - 1] = var5.field3802;
               } else {
                  class150.field1580[++class188.field1989 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4207) {
               var4 = class150.field1580[--class188.field1989];
               class150.field1580[++class188.field1989 - 1] = class272.method1294(var4).field3779 ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var4 = class150.field1580[--class188.field1989];
               var5 = class272.method1294(var4);
               if (var5.field3810 == -1 && var5.field3787 >= 0) {
                  class150.field1580[++class188.field1989 - 1] = var5.field3787;
               } else {
                  class150.field1580[++class188.field1989 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4209) {
               var4 = class150.field1580[--class188.field1989];
               var5 = class272.method1294(var4);
               if (var5.field3810 >= 0 && var5.field3787 >= 0) {
                  class150.field1580[++class188.field1989 - 1] = var5.field3787;
               } else {
                  class150.field1580[++class188.field1989 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4210) {
               String var8 = class150.field1581[--class150.field1582];
               var7 = class150.field1580[--class188.field1989];
               class138.method734(var8, var7 == 1);
               class150.field1580[++class188.field1989 - 1] = class169.field1857;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  class447.field3665 = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var4 = class150.field1580[--class188.field1989];
                  var7 = class272.method1294(var4).method2179();
                  if (var7 == -1) {
                     class150.field1580[++class188.field1989 - 1] = var7;
                  } else {
                     class150.field1580[++class188.field1989 - 1] = var7 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var4 = class150.field1580[--class188.field1989];
                  class150.field1580[++class188.field1989 - 1] = class272.method1294(var4).field3776;
                  return 1;
               } else if (var0 == 4215) {
                  var4 = class150.field1580[--class188.field1989];
                  class150.field1580[++class188.field1989 - 1] = class272.method1294(var4).field3797;
                  return 1;
               } else if (var0 == 4216) {
                  var4 = class150.field1580[--class188.field1989];
                  class150.field1580[++class188.field1989 - 1] = class272.method1294(var4).field3767;
                  return 1;
               } else if (var0 == 4217) {
                  var4 = class150.field1580[--class188.field1989];
                  var5 = class272.method1294(var4);
                  class150.field1580[++class188.field1989 - 1] = var5.field3773;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class326.field3048 != null && class447.field3665 < class169.field1857) {
                  class150.field1580[++class188.field1989 - 1] = class326.field3048[++class447.field3665 - 1] & '\uffff';
               } else {
                  class150.field1580[++class188.field1989 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
