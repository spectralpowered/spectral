public class class75 extends class189 {
   int field874;
   long field873;
   // $FF: synthetic field
   final class105 this$0;

   class75(class105 var1) {
      this.this$0 = var1;
   }

   void method979(class134 var1) {
      this.field874 = var1.method717();
      this.field873 = var1.method720();
   }

   void method980(class27 var1) {
      var1.method141(this.field874, this.field873);
   }

   static void method412(class421 var0, int var1) {
      boolean var3 = var0.method2024(1) == 1;
      if (var3) {
         class25.field186[++class25.field182 - 1] = var1;
      }

      int var4 = var0.method2024(2);
      class47 var5 = client.field551[var1];
      if (var4 == 0) {
         if (var3) {
            var5.field399 = false;
         } else if (client.field552 == var1) {
            throw new RuntimeException();
         } else {
            class25.field178[var1] = (var5.field258[0] + class381.field3325 >> 13 << 14) + (var5.field408 << 28) + (var5.field306[0] + class345.field3166 >> 13);
            if (var5.field245 != -1) {
               class25.field183[var1] = var5.field245;
            } else {
               class25.field183[var1] = var5.field299;
            }

            class25.field185[var1] = var5.field266;
            client.field551[var1] = null;
            if (var0.method2024(1) != 0) {
               class19.method107(var0, var1);
            }

         }
      } else {
         int var6;
         int var7;
         int var8;
         if (var4 == 1) {
            var6 = var0.method2024(3);
            var7 = var5.field258[0];
            var8 = var5.field306[0];
            if (var6 == 0) {
               --var7;
               --var8;
            } else if (var6 == 1) {
               --var8;
            } else if (var6 == 2) {
               ++var7;
               --var8;
            } else if (var6 == 3) {
               --var7;
            } else if (var6 == 4) {
               ++var7;
            } else if (var6 == 5) {
               --var7;
               ++var8;
            } else if (var6 == 6) {
               ++var8;
            } else if (var6 == 7) {
               ++var7;
               ++var8;
            }

            if (client.field552 == var1 && (var5.field297 < 1536 || var5.field233 < 1536 || var5.field297 >= 11776 || var5.field233 >= 11776)) {
               var5.method247(var7, var8);
               var5.field399 = false;
            } else if (var3) {
               var5.field399 = true;
               var5.field413 = var7;
               var5.field415 = var8;
            } else {
               var5.field399 = false;
               var5.method246(var7, var8, class25.field184[var1]);
            }

         } else if (var4 == 2) {
            var6 = var0.method2024(4);
            var7 = var5.field258[0];
            var8 = var5.field306[0];
            if (var6 == 0) {
               var7 -= 2;
               var8 -= 2;
            } else if (var6 == 1) {
               --var7;
               var8 -= 2;
            } else if (var6 == 2) {
               var8 -= 2;
            } else if (var6 == 3) {
               ++var7;
               var8 -= 2;
            } else if (var6 == 4) {
               var7 += 2;
               var8 -= 2;
            } else if (var6 == 5) {
               var7 -= 2;
               --var8;
            } else if (var6 == 6) {
               var7 += 2;
               --var8;
            } else if (var6 == 7) {
               var7 -= 2;
            } else if (var6 == 8) {
               var7 += 2;
            } else if (var6 == 9) {
               var7 -= 2;
               ++var8;
            } else if (var6 == 10) {
               var7 += 2;
               ++var8;
            } else if (var6 == 11) {
               var7 -= 2;
               var8 += 2;
            } else if (var6 == 12) {
               --var7;
               var8 += 2;
            } else if (var6 == 13) {
               var8 += 2;
            } else if (var6 == 14) {
               ++var7;
               var8 += 2;
            } else if (var6 == 15) {
               var7 += 2;
               var8 += 2;
            }

            if (var1 != client.field552 || var5.field297 >= 1536 && var5.field233 >= 1536 && var5.field297 < 11776 && var5.field233 < 11776) {
               if (var3) {
                  var5.field399 = true;
                  var5.field413 = var7;
                  var5.field415 = var8;
               } else {
                  var5.field399 = false;
                  var5.method246(var7, var8, class25.field184[var1]);
               }
            } else {
               var5.method247(var7, var8);
               var5.field399 = false;
            }

         } else {
            var6 = var0.method2024(1);
            int var9;
            int var10;
            int var11;
            int var12;
            if (var6 == 0) {
               var7 = var0.method2024(12);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = var5.field258[0] + var9;
               var12 = var10 + var5.field306[0];
               if (var1 != client.field552 || var5.field297 >= 1536 && var5.field233 >= 1536 && var5.field297 < 11776 && var5.field233 < 11776) {
                  if (var3) {
                     var5.field399 = true;
                     var5.field413 = var11;
                     var5.field415 = var12;
                  } else {
                     var5.field399 = false;
                     var5.method246(var11, var12, class25.field184[var1]);
                  }
               } else {
                  var5.method247(var11, var12);
                  var5.field399 = false;
               }

               var5.field408 = (byte)(var8 + var5.field408 & 3);
               if (var1 == client.field552) {
                  class195.field2036 = var5.field408;
               }

            } else {
               var7 = var0.method2024(30);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (var5.field258[0] + class381.field3325 + var9 & 16383) - class381.field3325;
               var12 = (class345.field3166 + var5.field306[0] + var10 & 16383) - class345.field3166;
               if (client.field552 == var1 && (var5.field297 < 1536 || var5.field233 < 1536 || var5.field297 >= 11776 || var5.field233 >= 11776)) {
                  var5.method247(var11, var12);
                  var5.field399 = false;
               } else if (var3) {
                  var5.field399 = true;
                  var5.field413 = var11;
                  var5.field415 = var12;
               } else {
                  var5.field399 = false;
                  var5.method246(var11, var12, class25.field184[var1]);
               }

               var5.field408 = (byte)(var8 + var5.field408 & 3);
               if (client.field552 == var1) {
                  class195.field2036 = var5.field408;
               }

            }
         }
      }
   }
}
