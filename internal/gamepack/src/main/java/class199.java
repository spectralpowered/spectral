public class class199 implements class445 {
   static final class199 field2039 = new class199(0, 2);
   static final class199 field2040 = new class199(1, 3);
   static final class199 field2041 = new class199(3, 10);
   static final class199 field2043 = new class199(2, 1);
   final int field2042;
   final int field2044;

   class199(int var1, int var2) {
      this.field2042 = var1;
      this.field2044 = var2;
   }

   public int method2118() {
      return this.field2044;
   }

   static int method1009(int var0, class472 var1, boolean var2) {
      String var11;
      if (var0 == 3100) {
         var11 = class150.field1581[--class150.field1582];
         class237.method1197(0, "", var11);
         return 1;
      } else if (var0 == 3101) {
         class188.field1989 -= 2;
         class115.method598(class89.field982, class150.field1580[class188.field1989], class150.field1580[class188.field1989 + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!class150.field1588) {
            class150.field1585 = true;
         }

         return 1;
      } else {
         int var13;
         if (var0 == 3104) {
            var11 = class150.field1581[--class150.field1582];
            var13 = 0;
            if (class427.method2039(var11)) {
               var13 = class244.method1221(var11);
            }

            class81 var16 = class189.method982(class165.field1746, client.field483.field3459);
            var16.field933.method656(var13);
            client.field483.method1920(var16);
            return 1;
         } else {
            class81 var10;
            if (var0 == 3105) {
               var11 = class150.field1581[--class150.field1582];
               var10 = class189.method982(class165.field1761, client.field483.field3459);
               var10.field933.method666(var11.length() + 1);
               var10.field933.method660(var11, (byte)121);
               client.field483.method1920(var10);
               return 1;
            } else if (var0 == 3106) {
               var11 = class150.field1581[--class150.field1582];
               var10 = class189.method982(class165.field1794, client.field483.field3459);
               var10.field933.method666(var11.length() + 1);
               var10.field933.method660(var11, (byte)112);
               client.field483.method1920(var10);
               return 1;
            } else {
               int var4;
               String var9;
               if (var0 == 3107) {
                  var4 = class150.field1580[--class188.field1989];
                  var9 = class150.field1581[--class150.field1582];
                  class157.method835(var4, var9);
                  return 1;
               } else if (var0 == 3108) {
                  class188.field1989 -= 3;
                  var4 = class150.field1580[class188.field1989];
                  var13 = class150.field1580[class188.field1989 + 1];
                  int var15 = class150.field1580[class188.field1989 + 2];
                  class210 var17 = class274.method1301(var15);
                  class304.method1431(var17, var4, var13);
                  return 1;
               } else if (var0 == 3109) {
                  class188.field1989 -= 2;
                  var4 = class150.field1580[class188.field1989];
                  var13 = class150.field1580[1 + class188.field1989];
                  class210 var14 = var2 ? class142.field1544 : class425.field3580;
                  class304.method1431(var14, var4, var13);
                  return 1;
               } else if (var0 == 3110) {
                  class211.field2375 = class150.field1580[--class188.field1989] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  class150.field1580[++class188.field1989 - 1] = class111.field1385.method1317() ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  class111.field1385.method1344(class150.field1580[--class188.field1989] == 1);
                  return 1;
               } else if (var0 == 3113) {
                  var11 = class150.field1581[--class150.field1582];
                  boolean var12 = class150.field1580[--class188.field1989] == 1;
                  class213.method1115(var11, var12, false);
                  return 1;
               } else if (var0 == 3115) {
                  var4 = class150.field1580[--class188.field1989];
                  var10 = class189.method982(class165.field1803, client.field483.field3459);
                  var10.field933.method655(var4);
                  client.field483.method1920(var10);
                  return 1;
               } else if (var0 == 3116) {
                  var4 = class150.field1580[--class188.field1989];
                  class150.field1582 -= 2;
                  var9 = class150.field1581[class150.field1582];
                  String var6 = class150.field1581[1 + class150.field1582];
                  if (var9.length() > 500) {
                     return 1;
                  } else if (var6.length() > 500) {
                     return 1;
                  } else {
                     class81 var7 = class189.method982(class165.field1784, client.field483.field3459);
                     var7.field933.method655(1 + class444.method2117(var9) + class444.method2117(var6));
                     var7.field933.method690(var4);
                     var7.field933.method660(var6, (byte)50);
                     var7.field933.method660(var9, (byte)76);
                     client.field483.method1920(var7);
                     return 1;
                  }
               } else if (var0 == 3117) {
                  client.field588 = class150.field1580[--class188.field1989] == 1;
                  return 1;
               } else if (var0 == 3118) {
                  client.field585 = class150.field1580[--class188.field1989] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  client.field462 = class150.field1580[--class188.field1989] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (class150.field1580[--class188.field1989] == 1) {
                     client.field653 |= 1;
                  } else {
                     client.field653 &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (class150.field1580[--class188.field1989] == 1) {
                     client.field653 |= 2;
                  } else {
                     client.field653 &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (class150.field1580[--class188.field1989] == 1) {
                     client.field653 |= 4;
                  } else {
                     client.field653 &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (class150.field1580[--class188.field1989] == 1) {
                     client.field653 |= 8;
                  } else {
                     client.field653 &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  client.field653 = 0;
                  return 1;
               } else if (var0 == 3125) {
                  client.field456 = class150.field1580[--class188.field1989] == 1;
                  return 1;
               } else if (var0 == 3126) {
                  client.field550 = class150.field1580[--class188.field1989] == 1;
                  return 1;
               } else if (var0 == 3127) {
                  class307.method1442(class150.field1580[--class188.field1989] == 1);
                  return 1;
               } else if (var0 == 3128) {
                  class150.field1580[++class188.field1989 - 1] = class118.method620() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class188.field1989 -= 2;
                  client.field577 = class150.field1580[class188.field1989];
                  client.field516 = class150.field1580[1 + class188.field1989];
                  return 1;
               } else if (var0 == 3130) {
                  class188.field1989 -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class188.field1989;
                  return 1;
               } else if (var0 == 3132) {
                  class150.field1580[++class188.field1989 - 1] = class391.field3440;
                  class150.field1580[++class188.field1989 - 1] = class22.field161;
                  return 1;
               } else if (var0 == 3133) {
                  --class188.field1989;
                  return 1;
               } else if (var0 == 3134) {
                  return 1;
               } else if (var0 == 3135) {
                  class188.field1989 -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  client.field708 = 3;
                  client.field600 = class150.field1580[--class188.field1989];
                  return 1;
               } else if (var0 == 3137) {
                  client.field708 = 2;
                  client.field600 = class150.field1580[--class188.field1989];
                  return 1;
               } else if (var0 == 3138) {
                  client.field708 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  client.field708 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  client.field708 = 3;
                  client.field600 = var2 ? class142.field1544.field2307 : class425.field3580.field2307;
                  return 1;
               } else {
                  boolean var8;
                  if (var0 == 3141) {
                     var8 = class150.field1580[--class188.field1989] == 1;
                     class111.field1385.method1340(var8);
                     return 1;
                  } else if (var0 == 3142) {
                     class150.field1580[++class188.field1989 - 1] = class111.field1385.method1318() ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var8 = class150.field1580[--class188.field1989] == 1;
                     client.field472 = var8;
                     if (!var8) {
                        class111.field1385.method1329("");
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     class150.field1580[++class188.field1989 - 1] = client.field472 ? 1 : 0;
                     return 1;
                  } else if (var0 == 3145) {
                     return 1;
                  } else if (var0 == 3146) {
                     var8 = class150.field1580[--class188.field1989] == 1;
                     class111.field1385.method1338(!var8);
                     return 1;
                  } else if (var0 == 3147) {
                     class150.field1580[++class188.field1989 - 1] = class111.field1385.method1328() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     class150.field1580[++class188.field1989 - 1] = class52.field761;
                     return 1;
                  } else if (var0 == 3154) {
                     class150.field1580[++class188.field1989 - 1] = class378.method1801();
                     return 1;
                  } else if (var0 == 3155) {
                     --class150.field1582;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     class188.field1989 -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class188.field1989;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class188.field1989;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --class150.field1582;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --class188.field1989;
                     class150.field1581[++class150.field1582 - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --class188.field1989;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     class188.field1989 -= 2;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     class188.field1989 -= 2;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class188.field1989 -= 2;
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --class188.field1989;
                     return 1;
                  } else if (var0 == 3173) {
                     --class188.field1989;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --class188.field1989;
                     return 1;
                  } else if (var0 == 3175) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --class150.field1582;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class150.field1582;
                     return 1;
                  } else if (var0 == 3181) {
                     class18.method104(class150.field1580[--class188.field1989]);
                     return 1;
                  } else if (var0 == 3182) {
                     class150.field1580[++class188.field1989 - 1] = class125.method636();
                     return 1;
                  } else if (var0 == 3189) {
                     var4 = class150.field1580[--class188.field1989];
                     class79 var5 = class242.method1218(var4);
                     if (var5.method426()) {
                        class52.method295(var5.field903);
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   static final void method1007(class210 var0) {
      int var2 = var0.field2315;
      if (var2 == 324) {
         if (client.field709 == -1) {
            client.field709 = var0.field2249;
            client.field710 = var0.field2312;
         }

         if (1 == client.field468.field3449) {
            var0.field2249 = client.field709;
         } else {
            var0.field2249 = client.field710;
         }

      } else if (var2 == 325) {
         if (-1 == client.field709) {
            client.field709 = var0.field2249;
            client.field710 = var0.field2312;
         }

         if (client.field468.field3449 == 1) {
            var0.field2249 = client.field710;
         } else {
            var0.field2249 = client.field709;
         }

      } else if (var2 == 327) {
         var0.field2282 = 150;
         var0.field2269 = (int)(Math.sin((double)client.field435 / 40.0D) * 256.0D) & 2047;
         var0.field2258 = 5;
         var0.field2277 = 0;
      } else if (var2 == 328) {
         var0.field2282 = 150;
         var0.field2269 = (int)(Math.sin((double)client.field435 / 40.0D) * 256.0D) & 2047;
         var0.field2258 = 5;
         var0.field2277 = 1;
      }
   }
}
