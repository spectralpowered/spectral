import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class408 extends class139 {
   static class318 field3415;
   byte[][][] field3407;
   int field3409;
   int field3413;
   int[] field3408;
   int[] field3410;
   int[] field3412;
   Field[] field3411;
   Method[] field3414;

   static final void method2001(int var0, int var1, int var2, int var3) {
      for(int var5 = 0; var5 < client.field442; ++var5) {
         if (client.field447[var5] + client.field435[var5] > var0 && client.field447[var5] < var0 + var2 && client.field448[var5] + client.field247[var5] > var1 && client.field448[var5] < var1 + var3) {
            client.field444[var5] = true;
         }
      }

   }

   static final void method2000(class267 var0, int var1, int var2, int var3) {
      class423 var5 = var0.field2213;
      if (client.field369 < 400) {
         if (var5.field3493 != null) {
            var5 = var5.method2054();
         }

         if (null != var5) {
            if (var5.field3496) {
               if (!var5.field3498 || var1 == client.field413) {
                  String var6 = var0.method1259();
                  int var7;
                  if (0 != var5.field3487 && var0.field2683 != 0) {
                     var7 = var0.field2683 != -1 ? var0.field2683 : var5.field3487;
                     var6 = var6 + class84.method351(var7, class113.field846.field3198) + " " + class442.field3658 + class177.field1492 + var7 + class442.field3662;
                  }

                  if (var5.field3498 && client.field378) {
                     class156.method721(class177.field1538, class238.method1032(16776960) + var6, 1003, var1, var2, var3);
                  }

                  if (client.field386 == 1) {
                     class156.method721(class177.field1486, client.field483 + " " + class442.field3664 + " " + class238.method1032(16776960) + var6, 7, var1, var2, var3);
                  } else if (client.field388) {
                     if (2 == (class32.field177 & 2)) {
                        class156.method721(client.field391, client.field510 + " " + class442.field3664 + " " + class238.method1032(16776960) + var6, 8, var1, var2, var3);
                     }
                  } else {
                     var7 = var5.field3498 && client.field378 ? 2000 : 0;
                     String[] var8 = var5.field3485;
                     int var9;
                     int var10;
                     if (null != var8) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.method1273(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class177.field1488)) {
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

                              class156.method721(var8[var9], class238.method1032(16776960) + var6, var10, var1, var2, var3);
                           }
                        }
                     }

                     if (null != var8) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.method1273(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase(class177.field1488)) {
                              short var11 = 0;
                              if (class483.field4024 != client.field467) {
                                 if (class483.field4022 == client.field467 || client.field467 == class483.field4028 && var5.field3487 > class113.field846.field3198) {
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

                                 class156.method721(var8[var9], class238.method1032(16776960) + var6, var10, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var5.field3498 || !client.field378) {
                        class156.method721(class177.field1538, class238.method1032(16776960) + var6, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   static void method1998(int var0) {
      class138.field1119 = new class365();
      class138.field1119.field3100 = client.field370[var0];
      class138.field1119.field3096 = client.field363[var0];
      class138.field1119.field3094 = client.field463[var0];
      class138.field1119.field3095 = client.field333[var0];
      class138.field1119.field3098 = client.field374[var0];
      class138.field1119.field3097 = client.field375[var0];
      class138.field1119.field3093 = client.field256[var0];
   }

   static final void method1999(String var0) {
      if (null != class228.field1933) {
         class299 var2 = class480.method2370(class356.field2973, client.field279.field4042);
         var2.field2403.method544(class319.method1614(var0));
         var2.field2403.method538(var0, (byte)11);
         client.field279.method2389(var2);
      }
   }
}
