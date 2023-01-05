@ObfInfo(
   name = "cx"
)
public class class415 extends class139 {
   @ObfInfo(
      owner = "cx",
      name = "v",
      desc = "Z"
   )
   boolean field3425 = false;
   @ObfInfo(
      owner = "cx",
      name = "e",
      desc = "I"
   )
   int field3424;
   @ObfInfo(
      owner = "cx",
      name = "h",
      desc = "I"
   )
   int field3426;

   @ObfInfo(
      owner = "cx",
      name = "gw",
      desc = "(ZB)V"
   )
   static final void method2014(boolean var0) {
      if (var0) {
         client.field253 = class359.field3061 ? class445.field3676 : class445.field3673;
      } else {
         client.field253 = class50.field574.method2220(class359.field3071) ? class445.field3671 : class445.field3672;
      }

   }

   @ObfInfo(
      owner = "cx",
      name = "is",
      desc = "(ZLqx;I)V"
   )
   static final void method2013(boolean var0, class6 var1) {
      client.field290 = var0;
      int var3;
      int var4;
      int var6;
      int var7;
      int var8;
      if (!client.field290) {
         var3 = var1.method531();
         var4 = var1.method575();
         int var5 = var1.method549();
         class252.field2084 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class252.field2084[var6][var7] = var1.method595();
            }
         }

         class474.field3996 = new int[var5];
         client.field495 = new int[var5];
         class191.field1711 = new int[var5];
         class467.field3882 = new byte[var5][];
         class388.field3273 = new byte[var5][];
         var5 = 0;

         for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
            for(var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
               var8 = (var6 << 8) + var7;
               class474.field3996[var5] = var8;
               client.field495[var5] = class440.field3648.method1356("m" + var6 + "_" + var7);
               class191.field1711[var5] = class440.field3648.method1356("l" + var6 + "_" + var7);
               ++var5;
            }
         }

         class228.method992(var3, var4, true);
      } else {
         var3 = var1.method575();
         var4 = var1.method575();
         boolean var16 = var1.method569() == 1;
         var6 = var1.method549();
         var1.method33();

         int var9;
         int var10;
         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = var1.method35(1);
                  if (var10 == 1) {
                     client.field291[var7][var8][var9] = var1.method35(26);
                  } else {
                     client.field291[var7][var8][var9] = -1;
                  }
               }
            }
         }

         var1.method34();
         class252.field2084 = new int[var6][4];

         for(var7 = 0; var7 < var6; ++var7) {
            for(var8 = 0; var8 < 4; ++var8) {
               class252.field2084[var7][var8] = var1.method595();
            }
         }

         class474.field3996 = new int[var6];
         client.field495 = new int[var6];
         class191.field1711 = new int[var6];
         class467.field3882 = new byte[var6][];
         class388.field3273 = new byte[var6][];
         var6 = 0;

         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = client.field291[var7][var8][var9];
                  if (var10 != -1) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = var12 / 8 + (var11 / 8 << 8);

                     int var14;
                     for(var14 = 0; var14 < var6; ++var14) {
                        if (class474.field3996[var14] == var13) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        class474.field3996[var6] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        client.field495[var6] = class440.field3648.method1356("m" + var14 + "_" + var15);
                        class191.field1711[var6] = class440.field3648.method1356("l" + var14 + "_" + var15);
                        ++var6;
                     }
                  }
               }
            }
         }

         class228.method992(var3, var4, !var16);
      }

   }
}
