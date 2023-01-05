@ObfInfo(
   name = "ex"
)
public class class60 extends class480 {
   @ObfInfo(
      owner = "ex",
      name = "bb",
      desc = "Ljava/lang/String;"
   )
   static String field603;
   @ObfInfo(
      owner = "ex",
      name = "x",
      desc = "I"
   )
   int field599;
   @ObfInfo(
      owner = "ex",
      name = "v",
      desc = "I"
   )
   int field600;
   @ObfInfo(
      owner = "ex",
      name = "e",
      desc = "I"
   )
   int field601;
   @ObfInfo(
      owner = "ex",
      name = "h",
      desc = "I"
   )
   int field602;
   // $FF: synthetic field
   @ObfInfo(
      owner = "ex",
      name = "this$0",
      desc = "Lem;"
   )
   final class182 this$0;

   @ObfInfo(
      owner = "ex",
      name = "<init>",
      desc = "(Lem;)V"
   )
   class60(class182 var1) {
      this.this$0 = var1;
   }

   @ObfInfo(
      owner = "ex",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method2367(class127 var1) {
      this.field602 = var1.method595();
      this.field599 = var1.method595();
      this.field601 = var1.method547();
      this.field600 = var1.method547();
   }

   @ObfInfo(
      owner = "ex",
      name = "e",
      desc = "(Lep;I)V"
   )
   void method2368(class429 var1) {
      var1.method2111(this.field602, this.field599, this.field601, this.field600);
   }

   @ObfInfo(
      owner = "ex",
      name = "ai",
      desc = "(ILbm;ZB)I"
   )
   static int method278(int var0, class461 var1, boolean var2) {
      if (var0 == 6500) {
         class386.field3248[++class161.field1227 - 1] = class74.method326() ? 1 : 0;
         return 1;
      } else {
         class2 var9;
         if (var0 == 6501) {
            var9 = class284.method1408();
            if (null != var9) {
               class386.field3248[++class161.field1227 - 1] = var9.field10;
               class386.field3248[++class161.field1227 - 1] = var9.field16;
               class386.field3249[++class386.field3250 - 1] = var9.field13;
               class386.field3248[++class161.field1227 - 1] = var9.field19;
               class386.field3248[++class161.field1227 - 1] = var9.field17;
               class386.field3249[++class386.field3250 - 1] = var9.field18;
            } else {
               class386.field3248[++class161.field1227 - 1] = -1;
               class386.field3248[++class161.field1227 - 1] = 0;
               class386.field3249[++class386.field3250 - 1] = "";
               class386.field3248[++class161.field1227 - 1] = 0;
               class386.field3248[++class161.field1227 - 1] = 0;
               class386.field3249[++class386.field3250 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            var9 = class345.method1752();
            if (null != var9) {
               class386.field3248[++class161.field1227 - 1] = var9.field10;
               class386.field3248[++class161.field1227 - 1] = var9.field16;
               class386.field3249[++class386.field3250 - 1] = var9.field13;
               class386.field3248[++class161.field1227 - 1] = var9.field19;
               class386.field3248[++class161.field1227 - 1] = var9.field17;
               class386.field3249[++class386.field3250 - 1] = var9.field18;
            } else {
               class386.field3248[++class161.field1227 - 1] = -1;
               class386.field3248[++class161.field1227 - 1] = 0;
               class386.field3249[++class386.field3250 - 1] = "";
               class386.field3248[++class161.field1227 - 1] = 0;
               class386.field3248[++class161.field1227 - 1] = 0;
               class386.field3249[++class386.field3250 - 1] = "";
            }

            return 1;
         } else {
            int var4;
            class2 var5;
            int var11;
            if (var0 == 6506) {
               var4 = class386.field3248[--class161.field1227];
               var5 = null;

               for(var11 = 0; var11 < class2.field11; ++var11) {
                  if (var4 == class2.field12[var11].field10) {
                     var5 = class2.field12[var11];
                     break;
                  }
               }

               if (var5 != null) {
                  class386.field3248[++class161.field1227 - 1] = var5.field10;
                  class386.field3248[++class161.field1227 - 1] = var5.field16;
                  class386.field3249[++class386.field3250 - 1] = var5.field13;
                  class386.field3248[++class161.field1227 - 1] = var5.field19;
                  class386.field3248[++class161.field1227 - 1] = var5.field17;
                  class386.field3249[++class386.field3250 - 1] = var5.field18;
               } else {
                  class386.field3248[++class161.field1227 - 1] = -1;
                  class386.field3248[++class161.field1227 - 1] = 0;
                  class386.field3249[++class386.field3250 - 1] = "";
                  class386.field3248[++class161.field1227 - 1] = 0;
                  class386.field3248[++class161.field1227 - 1] = 0;
                  class386.field3249[++class386.field3250 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               class161.field1227 -= 4;
               var4 = class386.field3248[class161.field1227];
               boolean var10 = 1 == class386.field3248[1 + class161.field1227];
               var11 = class386.field3248[2 + class161.field1227];
               boolean var7 = class386.field3248[3 + class161.field1227] == 1;
               class481.method2372(var4, var10, var11, var7);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  client.field378 = class386.field3248[--class161.field1227] == 1;
                  return 1;
               } else {
                  class123 var6;
                  int var8;
                  if (var0 == 6513) {
                     class161.field1227 -= 2;
                     var4 = class386.field3248[class161.field1227];
                     var8 = class386.field3248[class161.field1227 + 1];
                     var6 = class283.method1395(var8);
                     if (var6.method524()) {
                        class386.field3249[++class386.field3250 - 1] = class421.method2049(var4, (byte)103).method2057(var8, var6.field1057);
                     } else {
                        class386.field3248[++class161.field1227 - 1] = class421.method2049(var4, (byte)121).method2056(var8, var6.field1059);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     class161.field1227 -= 2;
                     var4 = class386.field3248[class161.field1227];
                     var8 = class386.field3248[class161.field1227 + 1];
                     var6 = class283.method1395(var8);
                     if (var6.method524()) {
                        class386.field3249[++class386.field3250 - 1] = class85.method356(var4).method370(var8, var6.field1057);
                     } else {
                        class386.field3248[++class161.field1227 - 1] = class85.method356(var4).method369(var8, var6.field1059);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     class161.field1227 -= 2;
                     var4 = class386.field3248[class161.field1227];
                     var8 = class386.field3248[class161.field1227 + 1];
                     var6 = class283.method1395(var8);
                     if (var6.method524()) {
                        class386.field3249[++class386.field3250 - 1] = class423.method2062(var4).method1208(var8, var6.field1057);
                     } else {
                        class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).method1207(var8, var6.field1059);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     class161.field1227 -= 2;
                     var4 = class386.field3248[class161.field1227];
                     var8 = class386.field3248[class161.field1227 + 1];
                     var6 = class283.method1395(var8);
                     if (var6.method524()) {
                        class386.field3249[++class386.field3250 - 1] = class134.method628(var4).method254(var8, var6.field1057);
                     } else {
                        class386.field3248[++class161.field1227 - 1] = class134.method628(var4).method253(var8, var6.field1059);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     class386.field3248[++class161.field1227 - 1] = client.field461 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6519) {
                     class386.field3248[++class161.field1227 - 1] = client.field315;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class386.field3250;
                     --class161.field1227;
                     return 1;
                  } else if (var0 == 6523) {
                     --class386.field3250;
                     --class161.field1227;
                     return 1;
                  } else if (var0 == 6524) {
                     class386.field3248[++class161.field1227 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     class386.field3248[++class161.field1227 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     class386.field3248[++class161.field1227 - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     class386.field3248[++class161.field1227 - 1] = client.field411;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = class386.field3248[--class161.field1227];
               if (var4 >= 0 && var4 < class2.field11) {
                  var5 = class2.field12[var4];
                  class386.field3248[++class161.field1227 - 1] = var5.field10;
                  class386.field3248[++class161.field1227 - 1] = var5.field16;
                  class386.field3249[++class386.field3250 - 1] = var5.field13;
                  class386.field3248[++class161.field1227 - 1] = var5.field19;
                  class386.field3248[++class161.field1227 - 1] = var5.field17;
                  class386.field3249[++class386.field3250 - 1] = var5.field18;
               } else {
                  class386.field3248[++class161.field1227 - 1] = -1;
                  class386.field3248[++class161.field1227 - 1] = 0;
                  class386.field3249[++class386.field3250 - 1] = "";
                  class386.field3248[++class161.field1227 - 1] = 0;
                  class386.field3248[++class161.field1227 - 1] = 0;
                  class386.field3249[++class386.field3250 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
