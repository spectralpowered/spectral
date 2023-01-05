public class class492 extends class189 {
   static String field4116;
   int field4112;
   int field4113;
   int field4114;
   int field4115;
   // $FF: synthetic field
   final class105 this$0;

   class492(class105 var1) {
      this.this$0 = var1;
   }

   void method979(class134 var1) {
      this.field4115 = var1.method717();
      this.field4112 = var1.method717();
      this.field4114 = var1.method669();
      this.field4113 = var1.method669();
   }

   void method980(class27 var1) {
      var1.method140(this.field4115, this.field4112, this.field4114, this.field4113);
   }

   static int method2387(int var0, class472 var1, boolean var2) {
      if (var0 == 6500) {
         class150.field1580[++class188.field1989 - 1] = class377.method1799() ? 1 : 0;
         return 1;
      } else {
         class296 var9;
         if (var0 == 6501) {
            var9 = class392.method1909();
            if (null != var9) {
               class150.field1580[++class188.field1989 - 1] = var9.field2832;
               class150.field1580[++class188.field1989 - 1] = var9.field2838;
               class150.field1581[++class150.field1582 - 1] = var9.field2835;
               class150.field1580[++class188.field1989 - 1] = var9.field2841;
               class150.field1580[++class188.field1989 - 1] = var9.field2839;
               class150.field1581[++class150.field1582 - 1] = var9.field2840;
            } else {
               class150.field1580[++class188.field1989 - 1] = -1;
               class150.field1580[++class188.field1989 - 1] = 0;
               class150.field1581[++class150.field1582 - 1] = "";
               class150.field1580[++class188.field1989 - 1] = 0;
               class150.field1580[++class188.field1989 - 1] = 0;
               class150.field1581[++class150.field1582 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            var9 = class382.method1814();
            if (null != var9) {
               class150.field1580[++class188.field1989 - 1] = var9.field2832;
               class150.field1580[++class188.field1989 - 1] = var9.field2838;
               class150.field1581[++class150.field1582 - 1] = var9.field2835;
               class150.field1580[++class188.field1989 - 1] = var9.field2841;
               class150.field1580[++class188.field1989 - 1] = var9.field2839;
               class150.field1581[++class150.field1582 - 1] = var9.field2840;
            } else {
               class150.field1580[++class188.field1989 - 1] = -1;
               class150.field1580[++class188.field1989 - 1] = 0;
               class150.field1581[++class150.field1582 - 1] = "";
               class150.field1580[++class188.field1989 - 1] = 0;
               class150.field1580[++class188.field1989 - 1] = 0;
               class150.field1581[++class150.field1582 - 1] = "";
            }

            return 1;
         } else {
            int var4;
            class296 var5;
            int var11;
            if (var0 == 6506) {
               var4 = class150.field1580[--class188.field1989];
               var5 = null;

               for(var11 = 0; var11 < class296.field2833; ++var11) {
                  if (var4 == class296.field2834[var11].field2832) {
                     var5 = class296.field2834[var11];
                     break;
                  }
               }

               if (var5 != null) {
                  class150.field1580[++class188.field1989 - 1] = var5.field2832;
                  class150.field1580[++class188.field1989 - 1] = var5.field2838;
                  class150.field1581[++class150.field1582 - 1] = var5.field2835;
                  class150.field1580[++class188.field1989 - 1] = var5.field2841;
                  class150.field1580[++class188.field1989 - 1] = var5.field2839;
                  class150.field1581[++class150.field1582 - 1] = var5.field2840;
               } else {
                  class150.field1580[++class188.field1989 - 1] = -1;
                  class150.field1580[++class188.field1989 - 1] = 0;
                  class150.field1581[++class150.field1582 - 1] = "";
                  class150.field1580[++class188.field1989 - 1] = 0;
                  class150.field1580[++class188.field1989 - 1] = 0;
                  class150.field1581[++class150.field1582 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               class188.field1989 -= 4;
               var4 = class150.field1580[class188.field1989];
               boolean var10 = 1 == class150.field1580[1 + class188.field1989];
               var11 = class150.field1580[2 + class188.field1989];
               boolean var7 = class150.field1580[3 + class188.field1989] == 1;
               class436.method2087(var4, var10, var11, var7);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  client.field582 = class150.field1580[--class188.field1989] == 1;
                  return 1;
               } else {
                  class295 var6;
                  int var8;
                  if (var0 == 6513) {
                     class188.field1989 -= 2;
                     var4 = class150.field1580[class188.field1989];
                     var8 = class150.field1580[class188.field1989 + 1];
                     var6 = class251.method1235(var8);
                     if (var6.method1389()) {
                        class150.field1581[++class150.field1582 - 1] = class190.method984(var4, (byte)103).method1289(var8, var6.field2825);
                     } else {
                        class150.field1580[++class188.field1989 - 1] = class190.method984(var4, (byte)121).method1288(var8, var6.field2827);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     class188.field1989 -= 2;
                     var4 = class150.field1580[class188.field1989];
                     var8 = class150.field1580[class188.field1989 + 1];
                     var6 = class251.method1235(var8);
                     if (var6.method1389()) {
                        class150.field1581[++class150.field1582 - 1] = class212.method1110(var4).method923(var8, var6.field2825);
                     } else {
                        class150.field1580[++class188.field1989 - 1] = class212.method1110(var4).method922(var8, var6.field2827);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     class188.field1989 -= 2;
                     var4 = class150.field1580[class188.field1989];
                     var8 = class150.field1580[class188.field1989 + 1];
                     var6 = class251.method1235(var8);
                     if (var6.method1389()) {
                        class150.field1581[++class150.field1582 - 1] = class272.method1294(var4).method2177(var8, var6.field2825);
                     } else {
                        class150.field1580[++class188.field1989 - 1] = class272.method1294(var4).method2176(var8, var6.field2827);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     class188.field1989 -= 2;
                     var4 = class150.field1580[class188.field1989];
                     var8 = class150.field1580[class188.field1989 + 1];
                     var6 = class251.method1235(var8);
                     if (var6.method1389()) {
                        class150.field1581[++class150.field1582 - 1] = class131.method645(var4).method580(var8, var6.field2825);
                     } else {
                        class150.field1580[++class188.field1989 - 1] = class131.method645(var4).method579(var8, var6.field2827);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     class150.field1580[++class188.field1989 - 1] = client.field665 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6519) {
                     class150.field1580[++class188.field1989 - 1] = client.field519;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class150.field1582;
                     --class188.field1989;
                     return 1;
                  } else if (var0 == 6523) {
                     --class150.field1582;
                     --class188.field1989;
                     return 1;
                  } else if (var0 == 6524) {
                     class150.field1580[++class188.field1989 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     class150.field1580[++class188.field1989 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     class150.field1580[++class188.field1989 - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     class150.field1580[++class188.field1989 - 1] = client.field615;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = class150.field1580[--class188.field1989];
               if (var4 >= 0 && var4 < class296.field2833) {
                  var5 = class296.field2834[var4];
                  class150.field1580[++class188.field1989 - 1] = var5.field2832;
                  class150.field1580[++class188.field1989 - 1] = var5.field2838;
                  class150.field1581[++class150.field1582 - 1] = var5.field2835;
                  class150.field1580[++class188.field1989 - 1] = var5.field2841;
                  class150.field1580[++class188.field1989 - 1] = var5.field2839;
                  class150.field1581[++class150.field1582 - 1] = var5.field2840;
               } else {
                  class150.field1580[++class188.field1989 - 1] = -1;
                  class150.field1580[++class188.field1989 - 1] = 0;
                  class150.field1581[++class150.field1582 - 1] = "";
                  class150.field1580[++class188.field1989 - 1] = 0;
                  class150.field1580[++class188.field1989 - 1] = 0;
                  class150.field1581[++class150.field1582 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
