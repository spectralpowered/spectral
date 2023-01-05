@ObfInfo(
   name = "om"
)
public class class436 implements class78 {
   @ObfInfo(
      owner = "om",
      name = "e",
      desc = "Lom;"
   )
   static final class436 field3612 = new class436(0, 2);
   @ObfInfo(
      owner = "om",
      name = "v",
      desc = "Lom;"
   )
   static final class436 field3613 = new class436(1, 3);
   @ObfInfo(
      owner = "om",
      name = "x",
      desc = "Lom;"
   )
   static final class436 field3614 = new class436(3, 10);
   @ObfInfo(
      owner = "om",
      name = "h",
      desc = "Lom;"
   )
   static final class436 field3616 = new class436(2, 1);
   @ObfInfo(
      owner = "om",
      name = "m",
      desc = "I"
   )
   final int field3615;
   @ObfInfo(
      owner = "om",
      name = "q",
      desc = "I"
   )
   final int field3617;

   @ObfInfo(
      owner = "om",
      name = "<init>",
      desc = "(II)V"
   )
   class436(int var1, int var2) {
      this.field3615 = var1;
      this.field3617 = var2;
   }

   @ObfInfo(
      owner = "om",
      name = "e",
      desc = "(B)I"
   )
   public int method330() {
      return this.field3617;
   }

   @ObfInfo(
      owner = "om",
      name = "y",
      desc = "(ILbm;ZB)I"
   )
   static int method2166(int var0, class461 var1, boolean var2) {
      String var11;
      if (var0 == 3100) {
         var11 = class386.field3249[--class386.field3250];
         class164.method765(0, "", var11);
         return 1;
      } else if (var0 == 3101) {
         class161.field1227 -= 2;
         class439.method2177(class113.field846, class386.field3248[class161.field1227], class386.field3248[class161.field1227 + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!class386.field3256) {
            class386.field3253 = true;
         }

         return 1;
      } else {
         int var13;
         if (var0 == 3104) {
            var11 = class386.field3249[--class386.field3250];
            var13 = 0;
            if (class154.method715(var11)) {
               var13 = class322.method1651(var11);
            }

            class299 var16 = class480.method2370(class356.field2960, client.field279.field4042);
            var16.field2403.method534(var13);
            client.field279.method2389(var16);
            return 1;
         } else {
            class299 var10;
            if (var0 == 3105) {
               var11 = class386.field3249[--class386.field3250];
               var10 = class480.method2370(class356.field2975, client.field279.field4042);
               var10.field2403.method544(var11.length() + 1);
               var10.field2403.method538(var11, (byte)121);
               client.field279.method2389(var10);
               return 1;
            } else if (var0 == 3106) {
               var11 = class386.field3249[--class386.field3250];
               var10 = class480.method2370(class356.field3008, client.field279.field4042);
               var10.field2403.method544(var11.length() + 1);
               var10.field2403.method538(var11, (byte)112);
               client.field279.method2389(var10);
               return 1;
            } else {
               int var4;
               String var9;
               if (var0 == 3107) {
                  var4 = class386.field3248[--class161.field1227];
                  var9 = class386.field3249[--class386.field3250];
                  class233.method1020(var4, var9);
                  return 1;
               } else if (var0 == 3108) {
                  class161.field1227 -= 3;
                  var4 = class386.field3248[class161.field1227];
                  var13 = class386.field3248[class161.field1227 + 1];
                  int var15 = class386.field3248[class161.field1227 + 2];
                  class120 var17 = class67.method299(var15);
                  class362.method1800(var17, var4, var13);
                  return 1;
               } else if (var0 == 3109) {
                  class161.field1227 -= 2;
                  var4 = class386.field3248[class161.field1227];
                  var13 = class386.field3248[1 + class161.field1227];
                  class120 var14 = var2 ? class108.field822 : class37.field183;
                  class362.method1800(var14, var4, var13);
                  return 1;
               } else if (var0 == 3110) {
                  class151.field1180 = class386.field3248[--class161.field1227] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  class386.field3248[++class161.field1227 - 1] = class50.field574.method2202() ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  class50.field574.method2229(class386.field3248[--class161.field1227] == 1);
                  return 1;
               } else if (var0 == 3113) {
                  var11 = class386.field3249[--class386.field3250];
                  boolean var12 = class386.field3248[--class161.field1227] == 1;
                  class10.method62(var11, var12, false);
                  return 1;
               } else if (var0 == 3115) {
                  var4 = class386.field3248[--class161.field1227];
                  var10 = class480.method2370(class356.field3017, client.field279.field4042);
                  var10.field2403.method533(var4);
                  client.field279.method2389(var10);
                  return 1;
               } else if (var0 == 3116) {
                  var4 = class386.field3248[--class161.field1227];
                  class386.field3250 -= 2;
                  var9 = class386.field3249[class386.field3250];
                  String var6 = class386.field3249[1 + class386.field3250];
                  if (var9.length() > 500) {
                     return 1;
                  } else if (var6.length() > 500) {
                     return 1;
                  } else {
                     class299 var7 = class480.method2370(class356.field2998, client.field279.field4042);
                     var7.field2403.method533(1 + class319.method1614(var9) + class319.method1614(var6));
                     var7.field2403.method568(var4);
                     var7.field2403.method538(var6, (byte)50);
                     var7.field2403.method538(var9, (byte)76);
                     client.field279.method2389(var7);
                     return 1;
                  }
               } else if (var0 == 3117) {
                  client.field384 = class386.field3248[--class161.field1227] == 1;
                  return 1;
               } else if (var0 == 3118) {
                  client.field381 = class386.field3248[--class161.field1227] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  client.field258 = class386.field3248[--class161.field1227] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (class386.field3248[--class161.field1227] == 1) {
                     client.field449 |= 1;
                  } else {
                     client.field449 &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (class386.field3248[--class161.field1227] == 1) {
                     client.field449 |= 2;
                  } else {
                     client.field449 &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (class386.field3248[--class161.field1227] == 1) {
                     client.field449 |= 4;
                  } else {
                     client.field449 &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (class386.field3248[--class161.field1227] == 1) {
                     client.field449 |= 8;
                  } else {
                     client.field449 &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  client.field449 = 0;
                  return 1;
               } else if (var0 == 3125) {
                  client.field252 = class386.field3248[--class161.field1227] == 1;
                  return 1;
               } else if (var0 == 3126) {
                  client.field346 = class386.field3248[--class161.field1227] == 1;
                  return 1;
               } else if (var0 == 3127) {
                  class471.method2328(class386.field3248[--class161.field1227] == 1);
                  return 1;
               } else if (var0 == 3128) {
                  class386.field3248[++class161.field1227 - 1] = class251.method1091() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class161.field1227 -= 2;
                  client.field373 = class386.field3248[class161.field1227];
                  client.field312 = class386.field3248[1 + class161.field1227];
                  return 1;
               } else if (var0 == 3130) {
                  class161.field1227 -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class161.field1227;
                  return 1;
               } else if (var0 == 3132) {
                  class386.field3248[++class161.field1227 - 1] = class427.field3529;
                  class386.field3248[++class161.field1227 - 1] = class476.field4003;
                  return 1;
               } else if (var0 == 3133) {
                  --class161.field1227;
                  return 1;
               } else if (var0 == 3134) {
                  return 1;
               } else if (var0 == 3135) {
                  class161.field1227 -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  client.field504 = 3;
                  client.field396 = class386.field3248[--class161.field1227];
                  return 1;
               } else if (var0 == 3137) {
                  client.field504 = 2;
                  client.field396 = class386.field3248[--class161.field1227];
                  return 1;
               } else if (var0 == 3138) {
                  client.field504 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  client.field504 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  client.field504 = 3;
                  client.field396 = var2 ? class108.field822.field985 : class37.field183.field985;
                  return 1;
               } else {
                  boolean var8;
                  if (var0 == 3141) {
                     var8 = class386.field3248[--class161.field1227] == 1;
                     class50.field574.method2225(var8);
                     return 1;
                  } else if (var0 == 3142) {
                     class386.field3248[++class161.field1227 - 1] = class50.field574.method2203() ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var8 = class386.field3248[--class161.field1227] == 1;
                     client.field268 = var8;
                     if (!var8) {
                        class50.field574.method2214("");
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     class386.field3248[++class161.field1227 - 1] = client.field268 ? 1 : 0;
                     return 1;
                  } else if (var0 == 3145) {
                     return 1;
                  } else if (var0 == 3146) {
                     var8 = class386.field3248[--class161.field1227] == 1;
                     class50.field574.method2223(!var8);
                     return 1;
                  } else if (var0 == 3147) {
                     class386.field3248[++class161.field1227 - 1] = class50.field574.method2213() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     class386.field3248[++class161.field1227 - 1] = class359.field3056;
                     return 1;
                  } else if (var0 == 3154) {
                     class386.field3248[++class161.field1227 - 1] = class339.method1700();
                     return 1;
                  } else if (var0 == 3155) {
                     --class386.field3250;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     class161.field1227 -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class161.field1227;
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class161.field1227;
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --class386.field3250;
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --class161.field1227;
                     class386.field3249[++class386.field3250 - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --class161.field1227;
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     class161.field1227 -= 2;
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     class161.field1227 -= 2;
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class161.field1227 -= 2;
                     class386.field3249[++class386.field3250 - 1] = "";
                     class386.field3249[++class386.field3250 - 1] = "";
                     class386.field3249[++class386.field3250 - 1] = "";
                     class386.field3249[++class386.field3250 - 1] = "";
                     class386.field3249[++class386.field3250 - 1] = "";
                     class386.field3249[++class386.field3250 - 1] = "";
                     class386.field3249[++class386.field3250 - 1] = "";
                     class386.field3249[++class386.field3250 - 1] = "";
                     class386.field3249[++class386.field3250 - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --class161.field1227;
                     return 1;
                  } else if (var0 == 3173) {
                     --class161.field1227;
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --class161.field1227;
                     return 1;
                  } else if (var0 == 3175) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --class386.field3250;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class386.field3250;
                     return 1;
                  } else if (var0 == 3181) {
                     class19.method90(class386.field3248[--class161.field1227]);
                     return 1;
                  } else if (var0 == 3182) {
                     class386.field3248[++class161.field1227 - 1] = class424.method2069();
                     return 1;
                  } else if (var0 == 3189) {
                     var4 = class386.field3248[--class161.field1227];
                     class242 var5 = class271.method1277(var4);
                     if (var5.method1056()) {
                        class359.method1791(var5.field2032);
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

   @ObfInfo(
      owner = "om",
      name = "lr",
      desc = "(Lkd;I)V"
   )
   static final void method2165(class120 var0) {
      int var2 = var0.field993;
      if (var2 == 324) {
         if (client.field505 == -1) {
            client.field505 = var0.field927;
            client.field506 = var0.field990;
         }

         if (1 == client.field264.field2347) {
            var0.field927 = client.field505;
         } else {
            var0.field927 = client.field506;
         }

      } else if (var2 == 325) {
         if (-1 == client.field505) {
            client.field505 = var0.field927;
            client.field506 = var0.field990;
         }

         if (client.field264.field2347 == 1) {
            var0.field927 = client.field506;
         } else {
            var0.field927 = client.field505;
         }

      } else if (var2 == 327) {
         var0.field960 = 150;
         var0.field947 = (int)(Math.sin((double)client.field231 / 40.0D) * 256.0D) & 2047;
         var0.field936 = 5;
         var0.field955 = 0;
      } else if (var2 == 328) {
         var0.field960 = 150;
         var0.field947 = (int)(Math.sin((double)client.field231 / 40.0D) * 256.0D) & 2047;
         var0.field936 = 5;
         var0.field955 = 1;
      }
   }
}
