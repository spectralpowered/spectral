public class class97 extends class480 {
   int field785;
   long field784;
   // $FF: synthetic field
   final class182 this$0;

   class97(class182 var1) {
      this.this$0 = var1;
   }

   void method2367(class127 var1) {
      this.field785 = var1.method595();
      this.field784 = var1.method598();
   }

   void method2368(class429 var1) {
      var1.method2112(this.field785, this.field784);
   }

   static void method392(class6 var0, int var1) {
      boolean var3 = var0.method35(1) == 1;
      if (var3) {
         class268.field2227[++class268.field2223 - 1] = var1;
      }

      int var4 = var0.method35(2);
      class380 var5 = client.field347[var1];
      if (var4 == 0) {
         if (var3) {
            var5.field3205 = false;
         } else if (client.field348 == var1) {
            throw new RuntimeException();
         } else {
            class268.field2219[var1] = (var5.field2633[0] + class312.field2465 >> 13 << 14) + (var5.field3214 << 28) + (var5.field2681[0] + class325.field2575 >> 13);
            if (var5.field2620 != -1) {
               class268.field2224[var1] = var5.field2620;
            } else {
               class268.field2224[var1] = var5.field2674;
            }

            class268.field2226[var1] = var5.field2641;
            client.field347[var1] = null;
            if (var0.method35(1) != 0) {
               class42.method198(var0, var1);
            }

         }
      } else {
         int var6;
         int var7;
         int var8;
         if (var4 == 1) {
            var6 = var0.method35(3);
            var7 = var5.field2633[0];
            var8 = var5.field2681[0];
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

            if (client.field348 == var1 && (var5.field2672 < 1536 || var5.field2608 < 1536 || var5.field2672 >= 11776 || var5.field2608 >= 11776)) {
               var5.method1879(var7, var8);
               var5.field3205 = false;
            } else if (var3) {
               var5.field3205 = true;
               var5.field3219 = var7;
               var5.field3221 = var8;
            } else {
               var5.field3205 = false;
               var5.method1878(var7, var8, class268.field2225[var1]);
            }

         } else if (var4 == 2) {
            var6 = var0.method35(4);
            var7 = var5.field2633[0];
            var8 = var5.field2681[0];
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

            if (var1 != client.field348 || var5.field2672 >= 1536 && var5.field2608 >= 1536 && var5.field2672 < 11776 && var5.field2608 < 11776) {
               if (var3) {
                  var5.field3205 = true;
                  var5.field3219 = var7;
                  var5.field3221 = var8;
               } else {
                  var5.field3205 = false;
                  var5.method1878(var7, var8, class268.field2225[var1]);
               }
            } else {
               var5.method1879(var7, var8);
               var5.field3205 = false;
            }

         } else {
            var6 = var0.method35(1);
            int var9;
            int var10;
            int var11;
            int var12;
            if (var6 == 0) {
               var7 = var0.method35(12);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = var5.field2633[0] + var9;
               var12 = var10 + var5.field2681[0];
               if (var1 != client.field348 || var5.field2672 >= 1536 && var5.field2608 >= 1536 && var5.field2672 < 11776 && var5.field2608 < 11776) {
                  if (var3) {
                     var5.field3205 = true;
                     var5.field3219 = var11;
                     var5.field3221 = var12;
                  } else {
                     var5.field3205 = false;
                     var5.method1878(var11, var12, class268.field2225[var1]);
                  }
               } else {
                  var5.method1879(var11, var12);
                  var5.field3205 = false;
               }

               var5.field3214 = (byte)(var8 + var5.field3214 & 3);
               if (var1 == client.field348) {
                  class347.field2878 = var5.field3214;
               }

            } else {
               var7 = var0.method35(30);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (var5.field2633[0] + class312.field2465 + var9 & 16383) - class312.field2465;
               var12 = (class325.field2575 + var5.field2681[0] + var10 & 16383) - class325.field2575;
               if (client.field348 == var1 && (var5.field2672 < 1536 || var5.field2608 < 1536 || var5.field2672 >= 11776 || var5.field2608 >= 11776)) {
                  var5.method1879(var11, var12);
                  var5.field3205 = false;
               } else if (var3) {
                  var5.field3205 = true;
                  var5.field3219 = var11;
                  var5.field3221 = var12;
               } else {
                  var5.field3205 = false;
                  var5.method1878(var11, var12, class268.field2225[var1]);
               }

               var5.field3214 = (byte)(var8 + var5.field3214 & 3);
               if (client.field348 == var1) {
                  class347.field2878 = var5.field3214;
               }

            }
         }
      }
   }
}
