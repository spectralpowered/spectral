@ObfInfo(
   name = "ds"
)
public class class288 extends class392 {
   @ObfInfo(
      owner = "ds",
      name = "tu",
      desc = "Lax;"
   )
   static class233 field2367;
   @ObfInfo(
      owner = "ds",
      name = "fi",
      desc = "I"
   )
   static int field2368;
   @ObfInfo(
      owner = "ds",
      name = "h",
      desc = "Z"
   )
   final boolean field2369;

   @ObfInfo(
      owner = "ds",
      name = "<init>",
      desc = "(Z)V"
   )
   public class288(boolean var1) {
      this.field2369 = var1;
   }

   @ObfInfo(
      owner = "ds",
      name = "h",
      desc = "(Loa;Loa;B)I"
   )
   int method1423(class69 var1, class69 var2) {
      if (var1.field627 == client.field395) {
         if (client.field395 != var2.field627) {
            return this.field2369 ? -1 : 1;
         }
      } else if (var2.field627 == client.field395) {
         return this.field2369 ? 1 : -1;
      }

      return this.method1918(var1, var2);
   }

   @ObfInfo(
      owner = "ds",
      name = "compare",
      desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
   )
   public int compare(Object var1, Object var2) {
      return this.method1423((class69)var1, (class69)var2);
   }

   @ObfInfo(
      owner = "ds",
      name = "e",
      desc = "(Lql;III)I"
   )
   static int method1424(class385 var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         class245 var4 = (class245)var0.method1897((long)var1);
         return var4 == null ? var2 : var4.field2057;
      }
   }

   @ObfInfo(
      owner = "ds",
      name = "x",
      desc = "(ILbm;ZI)I"
   )
   static int method1425(int var0, class461 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 100) {
         class161.field1227 -= 3;
         var4 = class386.field3248[class161.field1227];
         var5 = class386.field3248[class161.field1227 + 1];
         int var12 = class386.field3248[class161.field1227 + 2];
         if (var5 == 0) {
            throw new RuntimeException();
         } else {
            class120 var7 = class67.method299(var4);
            if (var7.field1031 == null) {
               var7.field1031 = new class120[var12 + 1];
            }

            if (var7.field1031.length <= var12) {
               class120[] var8 = new class120[var12 + 1];

               for(int var9 = 0; var9 < var7.field1031.length; ++var9) {
                  var8[var9] = var7.field1031[var9];
               }

               var7.field1031 = var8;
            }

            if (var12 > 0 && null == var7.field1031[var12 - 1]) {
               throw new RuntimeException("" + (var12 - 1));
            } else {
               class120 var13 = new class120();
               var13.field1026 = var5;
               var13.field912 = var13.field985 = var7.field985;
               var13.field895 = var12;
               var13.field893 = true;
               if (var5 == 12) {
                  var13.method504();
                  var13.method485().method1157(new class249(var13));
                  var13.method485().method1156(new class292(var13));
               }

               var7.field1031[var12] = var13;
               if (var2) {
                  class108.field822 = var13;
               } else {
                  class37.field183 = var13;
               }

               class184.method836(var7);
               return 1;
            }
         }
      } else {
         class120 var10;
         if (var0 == 101) {
            var10 = var2 ? class108.field822 : class37.field183;
            class120 var11 = class67.method299(var10.field985);
            var11.field1031[var10.field895] = null;
            class184.method836(var11);
            return 1;
         } else if (var0 == 102) {
            var10 = class67.method299(class386.field3248[--class161.field1227]);
            var10.field1031 = null;
            class184.method836(var10);
            return 1;
         } else if (var0 != 200) {
            if (var0 == 201) {
               var10 = class67.method299(class386.field3248[--class161.field1227]);
               if (var10 != null) {
                  class386.field3248[++class161.field1227 - 1] = 1;
                  if (var2) {
                     class108.field822 = var10;
                  } else {
                     class37.field183 = var10;
                  }
               } else {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class161.field1227 -= 2;
            var4 = class386.field3248[class161.field1227];
            var5 = class386.field3248[1 + class161.field1227];
            class120 var6 = class483.method2375(var4, var5);
            if (var6 != null && var5 != -1) {
               class386.field3248[++class161.field1227 - 1] = 1;
               if (var2) {
                  class108.field822 = var6;
               } else {
                  class37.field183 = var6;
               }
            } else {
               class386.field3248[++class161.field1227 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
