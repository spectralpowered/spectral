@ObfInfo(
   name = "bi"
)
public class class9 {
   @ObfInfo(
      owner = "bi",
      name = "f",
      desc = "I"
   )
   int field40 = 0;
   @ObfInfo(
      owner = "bi",
      name = "x",
      desc = "Lqi;"
   )
   final class194 field37;
   @ObfInfo(
      owner = "bi",
      name = "m",
      desc = "Lng;"
   )
   public final class27 field38;
   @ObfInfo(
      owner = "bi",
      name = "q",
      desc = "Lnj;"
   )
   public final class314 field39;

   @ObfInfo(
      owner = "bi",
      name = "<init>",
      desc = "(Lqi;)V"
   )
   class9(class194 var1) {
      this.field37 = var1;
      this.field38 = new class27(var1);
      this.field39 = new class314(var1);
   }

   @ObfInfo(
      owner = "bi",
      name = "h",
      desc = "(I)Z"
   )
   boolean method52() {
      return 2 == this.field40;
   }

   @ObfInfo(
      owner = "bi",
      name = "e",
      desc = "(B)V"
   )
   final void method50() {
      this.field40 = 1;
   }

   @ObfInfo(
      owner = "bi",
      name = "v",
      desc = "(Lqy;IB)V"
   )
   final void method42(class127 var1, int var2) {
      this.field38.method129(var1, var2);
      this.field40 = 2;
      class206.method899();
   }

   @ObfInfo(
      owner = "bi",
      name = "x",
      desc = "(I)V"
   )
   final void method43() {
      for(class326 var2 = (class326)this.field38.field159.method67(); var2 != null; var2 = (class326)this.field38.field159.method69()) {
         if ((long)var2.field2576 < class152.method711() / 1000L - 5L) {
            if (var2.field2578 > 0) {
               class164.method765(5, "", var2.field2577 + class177.field1601);
            }

            if (var2.field2578 == 0) {
               class164.method765(5, "", var2.field2577 + class177.field1484);
            }

            var2.method1514();
         }
      }

   }

   @ObfInfo(
      owner = "bi",
      name = "m",
      desc = "(B)V"
   )
   final void method44() {
      this.field40 = 0;
      this.field38.method1466();
      this.field39.method1466();
   }

   @ObfInfo(
      owner = "bi",
      name = "q",
      desc = "(Lrp;ZI)Z"
   )
   final boolean method45(class257 var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(class113.field846.field3207)) {
         return true;
      } else {
         return this.field38.method131(var1, var2);
      }
   }

   @ObfInfo(
      owner = "bi",
      name = "f",
      desc = "(Lrp;B)Z"
   )
   final boolean method41(class257 var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.field39.method1469(var1);
      }
   }

   @ObfInfo(
      owner = "bi",
      name = "r",
      desc = "(Ljava/lang/String;I)V"
   )
   final void method46(String var1) {
      if (var1 != null) {
         class257 var3 = new class257(var1, this.field37);
         if (var3.method1103()) {
            if (this.method51()) {
               class177 var10000 = (class177)null;
               String var5 = class177.field1387;
               class164.method765(30, "", var5);
            } else if (class113.field846.field3207.equals(var3)) {
               class176.method812();
            } else if (this.method45(var3, false)) {
               class338.method1698(var1);
            } else if (this.method41(var3)) {
               class394.method1931(var1);
            } else {
               class299 var4 = class480.method2370(class356.field2992, client.field279.field4042);
               var4.field2403.method544(class319.method1614(var1));
               var4.field2403.method538(var1, (byte)83);
               client.field279.method2389(var4);
            }
         }
      }
   }

   @ObfInfo(
      owner = "bi",
      name = "g",
      desc = "(I)Z"
   )
   final boolean method51() {
      return this.field38.method1468() || this.field38.method1467() >= 200 && 1 != client.field405;
   }

   @ObfInfo(
      owner = "bi",
      name = "i",
      desc = "(Ljava/lang/String;B)V"
   )
   final void method55(String var1) {
      if (null != var1) {
         class257 var3 = new class257(var1, this.field37);
         if (var3.method1103()) {
            String var5;
            if (this.method48()) {
               class177 var6 = (class177)null;
               var5 = class177.field1335;
               class164.method765(30, "", var5);
            } else if (class113.field846.field3207.equals(var3)) {
               class440.method2179();
            } else if (this.method41(var3)) {
               class116.method453(var1);
            } else if (this.method45(var3, false)) {
               StringBuilder var10000 = new StringBuilder();
               class177 var10001 = (class177)null;
               var10000 = var10000.append(class177.field1604).append(var1);
               var10001 = (class177)null;
               var5 = var10000.append(class177.field1511).toString();
               class164.method765(30, "", var5);
            } else {
               class299 var4 = class480.method2370(class356.field2958, client.field279.field4042);
               var4.field2403.method544(class319.method1614(var1));
               var4.field2403.method538(var1, (byte)42);
               client.field279.method2389(var4);
            }
         }
      }
   }

   @ObfInfo(
      owner = "bi",
      name = "k",
      desc = "(I)Z"
   )
   final boolean method48() {
      return this.field39.method1468() || this.field39.method1467() >= 100 && 1 != client.field405;
   }

   @ObfInfo(
      owner = "bi",
      name = "a",
      desc = "(Ljava/lang/String;I)V"
   )
   final void method49(String var1) {
      if (var1 != null) {
         class257 var3 = new class257(var1, this.field37);
         if (var3.method1103()) {
            if (this.field38.method1488(var3)) {
               client.field428 = client.field418;
               class299 var4 = class480.method2370(class356.field3033, client.field279.field4042);
               var4.field2403.method544(class319.method1614(var1));
               var4.field2403.method538(var1, (byte)117);
               client.field279.method2389(var4);
            }

            class206.method899();
         }
      }
   }

   @ObfInfo(
      owner = "bi",
      name = "s",
      desc = "(Ljava/lang/String;I)V"
   )
   final void method40(String var1) {
      if (var1 != null) {
         class257 var3 = new class257(var1, this.field37);
         if (var3.method1103()) {
            if (this.field39.method1488(var3)) {
               client.field428 = client.field418;
               class299 var4 = class480.method2370(class356.field3031, client.field279.field4042);
               var4.field2403.method544(class319.method1614(var1));
               var4.field2403.method538(var1, (byte)11);
               client.field279.method2389(var4);
            }

            class400.method1982();
         }
      }
   }

   @ObfInfo(
      owner = "bi",
      name = "t",
      desc = "(Lrp;I)Z"
   )
   final boolean method54(class257 var1) {
      class336 var3 = (class336)this.field38.method1484(var1);
      return null != var3 && var3.method304();
   }

   @ObfInfo(
      owner = "bi",
      name = "v",
      desc = "(Lqx;I)V"
   )
   static final void method57(class6 var0) {
      int var2 = 0;
      var0.method33();

      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < class268.field2221; ++var3) {
         var4 = class268.field2220[var3];
         if (0 == (class268.field2217[var4] & 1)) {
            if (var2 > 0) {
               --var2;
               class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
            } else {
               var5 = var0.method35(1);
               if (var5 == 0) {
                  var2 = class68.method302(var0);
                  class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
               } else {
                  class97.method392(var0, var4);
               }
            }
         }
      }

      var0.method34();
      if (var2 != 0) {
         throw new RuntimeException();
      } else {
         var0.method33();

         for(var3 = 0; var3 < class268.field2221; ++var3) {
            var4 = class268.field2220[var3];
            if (0 != (class268.field2217[var4] & 1)) {
               if (var2 > 0) {
                  --var2;
                  class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
               } else {
                  var5 = var0.method35(1);
                  if (var5 == 0) {
                     var2 = class68.method302(var0);
                     class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
                  } else {
                     class97.method392(var0, var4);
                  }
               }
            }
         }

         var0.method34();
         if (var2 != 0) {
            throw new RuntimeException();
         } else {
            var0.method33();

            for(var3 = 0; var3 < class268.field2216; ++var3) {
               var4 = class268.field2222[var3];
               if (0 != (class268.field2217[var4] & 1)) {
                  if (var2 > 0) {
                     --var2;
                     class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
                  } else {
                     var5 = var0.method35(1);
                     if (var5 == 0) {
                        var2 = class68.method302(var0);
                        class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
                     } else if (class42.method198(var0, var4)) {
                        class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
                     }
                  }
               }
            }

            var0.method34();
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.method33();

               for(var3 = 0; var3 < class268.field2216; ++var3) {
                  var4 = class268.field2222[var3];
                  if (0 == (class268.field2217[var4] & 1)) {
                     if (var2 > 0) {
                        --var2;
                        class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
                     } else {
                        var5 = var0.method35(1);
                        if (var5 == 0) {
                           var2 = class68.method302(var0);
                           class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
                        } else if (class42.method198(var0, var4)) {
                           class268.field2217[var4] = (byte)(class268.field2217[var4] | 2);
                        }
                     }
                  }
               }

               var0.method34();
               if (var2 != 0) {
                  throw new RuntimeException();
               } else {
                  class268.field2221 = 0;
                  class268.field2216 = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     class268.field2217[var3] = (byte)(class268.field2217[var3] >> 1);
                     class380 var6 = client.field347[var3];
                     if (null != var6) {
                        class268.field2220[++class268.field2221 - 1] = var3;
                     } else {
                        class268.field2222[++class268.field2216 - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }

   @ObfInfo(
      owner = "bi",
      name = "v",
      desc = "([BI)Lbm;"
   )
   static class461 method56(byte[] var0) {
      class461 var2 = new class461();
      class127 var3 = new class127(var0);
      var3.field1070 = var3.field1072.length - 2;
      int var4 = var3.method549();
      int var5 = var3.field1072.length - 2 - var4 - 12;
      var3.field1070 = var5;
      int var6 = var3.method595();
      var2.field3818 = var3.method549();
      var2.field3820 = var3.method549();
      var2.field3824 = var3.method549();
      var2.field3819 = var3.method549();
      int var7 = var3.method547();
      int var8;
      int var9;
      if (var7 > 0) {
         var2.field3823 = var2.method2270(var7);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.method549();
            class385 var10 = new class385(var9 > 0 ? class455.method2252(var9) : 1);
            var2.field3823[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.method595();
               int var12 = var3.method595();
               var10.method1896(new class245(var12), (long)var11);
            }
         }
      }

      var3.field1070 = 0;
      var2.field3815 = var3.method554();
      var2.field3816 = new int[var6];
      var2.field3817 = new int[var6];
      var2.field3822 = new String[var6];

      for(var8 = 0; var3.field1070 < var5; var2.field3816[var8++] = var9) {
         var9 = var3.method549();
         if (var9 == 3) {
            var2.field3822[var8] = var3.method555();
         } else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
            var2.field3817[var8] = var3.method595();
         } else {
            var2.field3817[var8] = var3.method547();
         }
      }

      return var2;
   }

   @ObfInfo(
      owner = "bi",
      name = "x",
      desc = "(Ldu;FZI)F"
   )
   static float method53(class84 var0, float var1, boolean var2) {
      float var4 = 0.0F;
      if (var0 != null && var0.method347() != 0) {
         float var5 = (float)var0.field678[0].field2383;
         float var6 = (float)var0.field678[var0.method347() - 1].field2383;
         float var7 = var6 - var5;
         if (0.0D == (double)var7) {
            return var0.field678[0].field2378;
         } else {
            float var8 = 0.0F;
            if (var1 > var6) {
               var8 = (var1 - var6) / var7;
            } else {
               var8 = (var1 - var5) / var7;
            }

            double var9 = (double)((int)var8);
            float var11 = Math.abs((float)((double)var8 - var9));
            float var12 = var11 * var7;
            var9 = Math.abs(var9 + 1.0D);
            double var13 = var9 / 2.0D;
            double var15 = (double)((int)var13);
            var11 = (float)(var13 - var15);
            float var17;
            float var18;
            if (var2) {
               if (var0.field676 == class301.field2416) {
                  if (0.0D != (double)var11) {
                     var12 += var5;
                  } else {
                     var12 = var6 - var12;
                  }
               } else if (class301.field2414 != var0.field676 && var0.field676 != class301.field2419) {
                  if (class301.field2413 == var0.field676) {
                     var12 = var5 - var1;
                     var17 = var0.field678[0].field2377;
                     var18 = var0.field678[0].field2380;
                     var4 = var0.field678[0].field2378;
                     if ((double)var17 != 0.0D) {
                        var4 -= var18 * var12 / var17;
                     }

                     return var4;
                  }
               } else {
                  var12 = var6 - var12;
               }
            } else if (var0.field677 == class301.field2416) {
               if (0.0D != (double)var11) {
                  var12 = var6 - var12;
               } else {
                  var12 += var5;
               }
            } else if (var0.field677 != class301.field2414 && class301.field2419 != var0.field677) {
               if (class301.field2413 == var0.field677) {
                  var12 = var1 - var6;
                  var17 = var0.field678[var0.method347() - 1].field2381;
                  var18 = var0.field678[var0.method347() - 1].field2379;
                  var4 = var0.field678[var0.method347() - 1].field2378;
                  if (0.0D != (double)var17) {
                     var4 += var18 * var12 / var17;
                  }

                  return var4;
               }
            } else {
               var12 += var5;
            }

            var4 = class179.method813(var0, var12);
            float var19;
            if (var2 && var0.field676 == class301.field2419) {
               var19 = var0.field678[var0.method347() - 1].field2378 - var0.field678[0].field2378;
               var4 = (float)((double)var4 - var9 * (double)var19);
            } else if (!var2 && var0.field677 == class301.field2419) {
               var19 = var0.field678[var0.method347() - 1].field2378 - var0.field678[0].field2378;
               var4 = (float)((double)var4 + var9 * (double)var19);
            }

            return var4;
         }
      } else {
         return var4;
      }
   }

   @ObfInfo(
      owner = "bi",
      name = "hy",
      desc = "(Lct;I)V"
   )
   static final void method58(class334 var0) {
      if (var0.field2679 != 0) {
         if (-1 != var0.field2641) {
            Object var2 = null;
            int var3 = class70.field634 ? 65536 : '耀';
            if (var0.field2641 < var3) {
               var2 = client.field465[var0.field2641];
            } else if (var0.field2641 >= var3) {
               var2 = client.field347[var0.field2641 - var3];
            }

            if (var2 != null) {
               int var4 = var0.field2672 - ((class334)var2).field2672;
               int var5 = var0.field2608 - ((class334)var2).field2608;
               if (var4 != 0 || var5 != 0) {
                  var0.field2674 = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
               }
            } else if (var0.field2642) {
               var0.field2641 = -1;
               var0.field2642 = false;
            }
         }

         if (var0.field2620 != -1 && (var0.field2607 == 0 || var0.field2669 > 0)) {
            var0.field2674 = var0.field2620;
            var0.field2620 = -1;
         }

         int var6 = var0.field2674 - var0.field2622 & 2047;
         if (var6 == 0 && var0.field2642) {
            var0.field2641 = -1;
            var0.field2642 = false;
         }

         if (var6 != 0) {
            ++var0.field2675;
            boolean var7;
            if (var6 > 1024) {
               var0.field2622 -= var0.field2658 ? var6 : var0.field2679;
               var7 = true;
               if (var6 < var0.field2679 || var6 > 2048 - var0.field2679) {
                  var0.field2622 = var0.field2674;
                  var7 = false;
               }

               if (!var0.field2658 && var0.field2613 == var0.field2645 && (var0.field2675 > 25 || var7)) {
                  if (-1 != var0.field2618) {
                     var0.field2645 = var0.field2618;
                  } else {
                     var0.field2645 = var0.field2616;
                  }
               }
            } else {
               var0.field2622 += var0.field2658 ? var6 : var0.field2679;
               var7 = true;
               if (var6 < var0.field2679 || var6 > 2048 - var0.field2679) {
                  var0.field2622 = var0.field2674;
                  var7 = false;
               }

               if (!var0.field2658 && var0.field2613 == var0.field2645 && (var0.field2675 > 25 || var7)) {
                  if (var0.field2680 != -1) {
                     var0.field2645 = var0.field2680;
                  } else {
                     var0.field2645 = var0.field2616;
                  }
               }
            }

            var0.field2622 &= 2047;
            var0.field2658 = false;
         } else {
            var0.field2675 = 0;
         }

      }
   }

   @ObfInfo(
      owner = "bi",
      name = "mo",
      desc = "(Lkd;I)Z"
   )
   static boolean method47(class120 var0) {
      return var0.field945;
   }
}
