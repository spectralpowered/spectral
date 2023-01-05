public class class175 extends class305 {
   static class157 field1916;
   static int field1917;
   final boolean field1918;

   public class175(boolean var1) {
      this.field1918 = var1;
   }

   int method932(class185 var1, class185 var2) {
      if (var1.field1978 == client.field599) {
         if (client.field599 != var2.field1978) {
            return this.field1918 ? -1 : 1;
         }
      } else if (var2.field1978 == client.field599) {
         return this.field1918 ? 1 : -1;
      }

      return this.method1440(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method932((class185)var1, (class185)var2);
   }

   static int method933(class376 var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         class258 var4 = (class258)var0.method1794((long)var1);
         return var4 == null ? var2 : var4.field2645;
      }
   }

   static int method934(int var0, class472 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 100) {
         class188.field1989 -= 3;
         var4 = class150.field1580[class188.field1989];
         var5 = class150.field1580[class188.field1989 + 1];
         int var12 = class150.field1580[class188.field1989 + 2];
         if (var5 == 0) {
            throw new RuntimeException();
         } else {
            class210 var7 = class274.method1301(var4);
            if (var7.field2353 == null) {
               var7.field2353 = new class210[var12 + 1];
            }

            if (var7.field2353.length <= var12) {
               class210[] var8 = new class210[var12 + 1];

               for(int var9 = 0; var9 < var7.field2353.length; ++var9) {
                  var8[var9] = var7.field2353[var9];
               }

               var7.field2353 = var8;
            }

            if (var12 > 0 && null == var7.field2353[var12 - 1]) {
               throw new RuntimeException("" + (var12 - 1));
            } else {
               class210 var13 = new class210();
               var13.field2348 = var5;
               var13.field2234 = var13.field2307 = var7.field2307;
               var13.field2217 = var12;
               var13.field2215 = true;
               if (var5 == 12) {
                  var13.method1095();
                  var13.method1076().method2225(new class281(var13));
                  var13.method1076().method2224(new class59(var13));
               }

               var7.field2353[var12] = var13;
               if (var2) {
                  class142.field1544 = var13;
               } else {
                  class425.field3580 = var13;
               }

               class214.method1117(var7);
               return 1;
            }
         }
      } else {
         class210 var10;
         if (var0 == 101) {
            var10 = var2 ? class142.field1544 : class425.field3580;
            class210 var11 = class274.method1301(var10.field2307);
            var11.field2353[var10.field2217] = null;
            class214.method1117(var11);
            return 1;
         } else if (var0 == 102) {
            var10 = class274.method1301(class150.field1580[--class188.field1989]);
            var10.field2353 = null;
            class214.method1117(var10);
            return 1;
         } else if (var0 != 200) {
            if (var0 == 201) {
               var10 = class274.method1301(class150.field1580[--class188.field1989]);
               if (var10 != null) {
                  class150.field1580[++class188.field1989 - 1] = 1;
                  if (var2) {
                     class142.field1544 = var10;
                  } else {
                     class425.field3580 = var10;
                  }
               } else {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            class210 var6 = class34.method169(var4, var5);
            if (var6 != null && var5 != -1) {
               class150.field1580[++class188.field1989 - 1] = 1;
               if (var2) {
                  class142.field1544 = var6;
               } else {
                  class425.field3580 = var6;
               }
            } else {
               class150.field1580[++class188.field1989 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
