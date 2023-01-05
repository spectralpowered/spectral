public class class446 {
   static final void method2119(boolean var0, class421 var1) {
      client.field696 = 0;
      client.field481 = 0;
      var1.method2022();
      int var3 = var1.method2024(8);
      int var4;
      if (var3 < client.field479) {
         for(var4 = var3; var4 < client.field479; ++var4) {
            client.field558[++client.field696 - 1] = client.field635[var4];
         }
      }

      if (var3 > client.field479) {
         throw new RuntimeException("");
      } else {
         client.field479 = 0;

         int var5;
         int var8;
         int var9;
         int var10;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = client.field635[var4];
            class53 var6 = client.field669[var5];
            int var7 = var1.method2024(1);
            if (var7 == 0) {
               client.field635[++client.field479 - 1] = var5;
               var6.field291 = client.field435;
            } else {
               var8 = var1.method2024(2);
               if (var8 == 0) {
                  client.field635[++client.field479 - 1] = var5;
                  var6.field291 = client.field435;
                  client.field482[++client.field481 - 1] = var5;
               } else if (var8 == 1) {
                  client.field635[++client.field479 - 1] = var5;
                  var6.field291 = client.field435;
                  var9 = var1.method2024(3);
                  var6.method298(var9, class156.field1620);
                  var10 = var1.method2024(1);
                  if (var10 == 1) {
                     client.field482[++client.field481 - 1] = var5;
                  }
               } else if (var8 == 2) {
                  client.field635[++client.field479 - 1] = var5;
                  var6.field291 = client.field435;
                  if (var1.method2024(1) == 1) {
                     var9 = var1.method2024(3);
                     var6.method298(var9, class156.field1622);
                     var10 = var1.method2024(3);
                     var6.method298(var10, class156.field1622);
                  } else {
                     var9 = var1.method2024(3);
                     var6.method298(var9, class156.field1621);
                  }

                  var9 = var1.method2024(1);
                  if (var9 == 1) {
                     client.field482[++client.field481 - 1] = var5;
                  }
               } else if (var8 == 3) {
                  client.field558[++client.field696 - 1] = var5;
               }
            }
         }

         while(true) {
            var3 = class295.field2829 ? 16 : 15;
            var4 = 1 << var3;
            if (var1.method2026(client.field483.field3464) < var3 + 12) {
               break;
            }

            var5 = var1.method2024(var3);
            if (var5 == var4 - 1) {
               break;
            }

            boolean var14 = false;
            if (client.field669[var5] == null) {
               client.field669[var5] = new class53();
               var14 = true;
            }

            class53 var15 = client.field669[var5];
            client.field635[++client.field479 - 1] = var5;
            var15.field291 = client.field435;
            int var11;
            boolean var12;
            int var13;
            if (class295.field2829) {
               var11 = client.field562[var1.method2024(3)];
               if (var14) {
                  var15.field299 = var15.field247 = var11;
               }

               var15.field798 = class190.method984(var1.method2024(14), (byte)27);
               if (var0) {
                  var10 = var1.method2024(8);
                  if (var10 > 127) {
                     var10 -= 256;
                  }
               } else {
                  var10 = var1.method2024(5);
                  if (var10 > 15) {
                     var10 -= 32;
                  }
               }

               var8 = var1.method2024(1);
               if (var0) {
                  var9 = var1.method2024(8);
                  if (var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.method2024(5);
                  if (var9 > 15) {
                     var9 -= 32;
                  }
               }

               var12 = var1.method2024(1) == 1;
               if (var12) {
                  var1.method2024(32);
               }

               var13 = var1.method2024(1);
               if (var13 == 1) {
                  client.field482[++client.field481 - 1] = var5;
               }
            } else {
               if (var0) {
                  var10 = var1.method2024(8);
                  if (var10 > 127) {
                     var10 -= 256;
                  }
               } else {
                  var10 = var1.method2024(5);
                  if (var10 > 15) {
                     var10 -= 32;
                  }
               }

               var11 = var1.method2024(1);
               if (var11 == 1) {
                  client.field482[++client.field481 - 1] = var5;
               }

               var12 = var1.method2024(1) == 1;
               if (var12) {
                  var1.method2024(32);
               }

               var15.field798 = class190.method984(var1.method2024(14), (byte)104);
               if (var0) {
                  var9 = var1.method2024(8);
                  if (var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.method2024(5);
                  if (var9 > 15) {
                     var9 -= 32;
                  }
               }

               var8 = var1.method2024(1);
               var13 = client.field562[var1.method2024(3)];
               if (var14) {
                  var15.field299 = var15.field247 = var13;
               }
            }

            class323.method1567(var15);
            var15.method299(var9 + class89.field982.field258[0], class89.field982.field306[0] + var10, var8 == 1);
         }

         var1.method2023();
         class123.method629(var1);

         for(var3 = 0; var3 < client.field696; ++var3) {
            var4 = client.field558[var3];
            if (client.field669[var4].field291 != client.field435) {
               client.field669[var4].field798 = null;
               client.field669[var4] = null;
            }
         }

         if (client.field483.field3464 != var1.field1487) {
            throw new RuntimeException(var1.field1487 + class389.field3431 + client.field483.field3464);
         } else {
            for(var3 = 0; var3 < client.field479; ++var3) {
               if (client.field669[client.field635[var3]] == null) {
                  throw new RuntimeException(var3 + class389.field3431 + client.field479);
               }
            }

         }
      }
   }
}
