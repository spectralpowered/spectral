public class class240 extends class106 {
   boolean field2579 = false;
   int field2578;
   int field2580;

   static final void method1215(boolean var0) {
      if (var0) {
         client.field457 = class52.field766 ? class23.field174 : class23.field171;
      } else {
         client.field457 = class111.field1385.method1335(class52.field776) ? class23.field169 : class23.field170;
      }

   }

   static final void method1214(boolean var0, class421 var1) {
      client.field494 = var0;
      int var3;
      int var4;
      int var6;
      int var7;
      int var8;
      if (!client.field494) {
         var3 = var1.method653();
         var4 = var1.method697();
         int var5 = var1.method671();
         class297.field2858 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class297.field2858[var6][var7] = var1.method717();
            }
         }

         class63.field833 = new int[var5];
         client.field699 = new int[var5];
         class270.field2704 = new int[var5];
         class243.field2596 = new byte[var5][];
         class315.field2995 = new byte[var5][];
         var5 = 0;

         for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
            for(var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
               var8 = (var6 << 8) + var7;
               class63.field833[var5] = var8;
               client.field699[var5] = class42.field375.method883("m" + var6 + "_" + var7);
               class270.field2704[var5] = class42.field375.method883("l" + var6 + "_" + var7);
               ++var5;
            }
         }

         class103.method556(var3, var4, true);
      } else {
         var3 = var1.method697();
         var4 = var1.method697();
         boolean var16 = var1.method691() == 1;
         var6 = var1.method671();
         var1.method2022();

         int var9;
         int var10;
         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = var1.method2024(1);
                  if (var10 == 1) {
                     client.field495[var7][var8][var9] = var1.method2024(26);
                  } else {
                     client.field495[var7][var8][var9] = -1;
                  }
               }
            }
         }

         var1.method2023();
         class297.field2858 = new int[var6][4];

         for(var7 = 0; var7 < var6; ++var7) {
            for(var8 = 0; var8 < 4; ++var8) {
               class297.field2858[var7][var8] = var1.method717();
            }
         }

         class63.field833 = new int[var6];
         client.field699 = new int[var6];
         class270.field2704 = new int[var6];
         class243.field2596 = new byte[var6][];
         class315.field2995 = new byte[var6][];
         var6 = 0;

         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = client.field495[var7][var8][var9];
                  if (var10 != -1) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = var12 / 8 + (var11 / 8 << 8);

                     int var14;
                     for(var14 = 0; var14 < var6; ++var14) {
                        if (class63.field833[var14] == var13) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        class63.field833[var6] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        client.field699[var6] = class42.field375.method883("m" + var14 + "_" + var15);
                        class270.field2704[var6] = class42.field375.method883("l" + var14 + "_" + var15);
                        ++var6;
                     }
                  }
               }
            }
         }

         class103.method556(var3, var4, !var16);
      }

   }
}
