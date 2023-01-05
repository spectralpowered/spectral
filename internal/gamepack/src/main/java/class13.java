import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class13 extends class106 {
   static class12 field126;
   byte[][][] field118;
   int field120;
   int field124;
   int[] field119;
   int[] field121;
   int[] field123;
   Field[] field122;
   Method[] field125;

   static final void method87(int var0, int var1, int var2, int var3) {
      for(int var5 = 0; var5 < client.field646; ++var5) {
         if (client.field651[var5] + client.field639[var5] > var0 && client.field651[var5] < var0 + var2 && client.field652[var5] + client.field451[var5] > var1 && client.field652[var5] < var1 + var3) {
            client.field648[var5] = true;
         }
      }

   }

   static final void method86(class53 var0, int var1, int var2, int var3) {
      class272 var5 = var0.field798;
      if (client.field573 < 400) {
         if (var5.field2743 != null) {
            var5 = var5.method1286();
         }

         if (null != var5) {
            if (var5.field2746) {
               if (!var5.field2748 || var1 == client.field617) {
                  String var6 = var0.method300();
                  int var7;
                  if (0 != var5.field2737 && var0.field308 != 0) {
                     var7 = var0.field308 != -1 ? var0.field308 : var5.field2737;
                     var6 = var6 + class360.method1724(var7, class89.field982.field392) + " " + class389.field3430 + class96.field1187 + var7 + class389.field3434;
                  }

                  if (var5.field2748 && client.field582) {
                     class82.method442(class96.field1233, class334.method1616(16776960) + var6, 1003, var1, var2, var3);
                  }

                  if (client.field590 == 1) {
                     class82.method442(class96.field1181, client.field687 + " " + class389.field3436 + " " + class334.method1616(16776960) + var6, 7, var1, var2, var3);
                  } else if (client.field592) {
                     if (2 == (class269.field2703 & 2)) {
                        class82.method442(client.field595, client.field714 + " " + class389.field3436 + " " + class334.method1616(16776960) + var6, 8, var1, var2, var3);
                     }
                  } else {
                     var7 = var5.field2748 && client.field582 ? 2000 : 0;
                     String[] var8 = var5.field2735;
                     int var9;
                     int var10;
                     if (null != var8) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.method313(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class96.field1183)) {
                              var10 = 0;
                              if (var9 == 0) {
                                 var10 = var7 + 9;
                              }

                              if (var9 == 1) {
                                 var10 = var7 + 10;
                              }

                              if (var9 == 2) {
                                 var10 = var7 + 11;
                              }

                              if (var9 == 3) {
                                 var10 = var7 + 12;
                              }

                              if (var9 == 4) {
                                 var10 = var7 + 13;
                              }

                              class82.method442(var8[var9], class334.method1616(16776960) + var6, var10, var1, var2, var3);
                           }
                        }
                     }

                     if (null != var8) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.method313(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase(class96.field1183)) {
                              short var11 = 0;
                              if (class34.field331 != client.field671) {
                                 if (class34.field329 == client.field671 || client.field671 == class34.field335 && var5.field2737 > class89.field982.field392) {
                                    var11 = 2000;
                                 }

                                 var10 = 0;
                                 if (var9 == 0) {
                                    var10 = var11 + 9;
                                 }

                                 if (var9 == 1) {
                                    var10 = var11 + 10;
                                 }

                                 if (var9 == 2) {
                                    var10 = var11 + 11;
                                 }

                                 if (var9 == 3) {
                                    var10 = var11 + 12;
                                 }

                                 if (var9 == 4) {
                                    var10 = var11 + 13;
                                 }

                                 class82.method442(var8[var9], class334.method1616(16776960) + var6, var10, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var5.field2748 || !client.field582) {
                        class82.method442(class96.field1233, class334.method1616(16776960) + var6, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   static void method84(int var0) {
      class474.field3931 = new class387();
      class474.field3931.field3424 = client.field574[var0];
      class474.field3931.field3420 = client.field567[var0];
      class474.field3931.field3418 = client.field667[var0];
      class474.field3931.field3419 = client.field537[var0];
      class474.field3931.field3422 = client.field578[var0];
      class474.field3931.field3421 = client.field579[var0];
      class474.field3931.field3417 = client.field460[var0];
   }

   static final void method85(String var0) {
      if (null != class103.field1350) {
         class81 var2 = class189.method982(class165.field1759, client.field483.field3459);
         var2.field933.method666(class444.method2117(var0));
         var2.field933.method660(var0, (byte)11);
         client.field483.method1920(var2);
      }
   }
}
