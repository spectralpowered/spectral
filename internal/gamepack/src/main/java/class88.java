public class class88 {
   int field977 = 0;
   final class468 field974;
   public final class241 field975;
   public final class372 field976;

   class88(class468 var1) {
      this.field974 = var1;
      this.field975 = new class241(var1);
      this.field976 = new class372(var1);
   }

   boolean method486() {
      return 2 == this.field977;
   }

   final void method484() {
      this.field977 = 1;
   }

   final void method476(class134 var1, int var2) {
      this.field975.method1216(var1, var2);
      this.field977 = 2;
      class193.method993();
   }

   final void method477() {
      for(class470 var2 = (class470)this.field975.field2581.method1304(); var2 != null; var2 = (class470)this.field975.field2581.method1306()) {
         if ((long)var2.field3908 < class154.method814() / 1000L - 5L) {
            if (var2.field3910 > 0) {
               class237.method1197(5, "", var2.field3909 + class96.field1296);
            }

            if (var2.field3910 == 0) {
               class237.method1197(5, "", var2.field3909 + class96.field1179);
            }

            var2.method219();
         }
      }

   }

   final void method478() {
      this.field977 = 0;
      this.field975.method187();
      this.field976.method187();
   }

   final boolean method479(class174 var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(class89.field982.field401)) {
         return true;
      } else {
         return this.field975.method1217(var1, var2);
      }
   }

   final boolean method475(class174 var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.field976.method190(var1);
      }
   }

   final void method480(String var1) {
      if (var1 != null) {
         class174 var3 = new class174(var1, this.field974);
         if (var3.method930()) {
            if (this.method485()) {
               class96 var10000 = (class96)null;
               String var5 = class96.field1082;
               class237.method1197(30, "", var5);
            } else if (class89.field982.field401.equals(var3)) {
               class268.method1275();
            } else if (this.method479(var3, false)) {
               class123.method630(var1);
            } else if (this.method475(var3)) {
               class366.method1766(var1);
            } else {
               class81 var4 = class189.method982(class165.field1778, client.field483.field3459);
               var4.field933.method666(class444.method2117(var1));
               var4.field933.method660(var1, (byte)83);
               client.field483.method1920(var4);
            }
         }
      }
   }

   final boolean method485() {
      return this.field975.method189() || this.field975.method188() >= 200 && 1 != client.field609;
   }

   final void method489(String var1) {
      if (null != var1) {
         class174 var3 = new class174(var1, this.field974);
         if (var3.method930()) {
            String var5;
            if (this.method482()) {
               class96 var6 = (class96)null;
               var5 = class96.field1030;
               class237.method1197(30, "", var5);
            } else if (class89.field982.field401.equals(var3)) {
               class42.method220();
            } else if (this.method475(var3)) {
               class8.method27(var1);
            } else if (this.method479(var3, false)) {
               StringBuilder var10000 = new StringBuilder();
               class96 var10001 = (class96)null;
               var10000 = var10000.append(class96.field1299).append(var1);
               var10001 = (class96)null;
               var5 = var10000.append(class96.field1206).toString();
               class237.method1197(30, "", var5);
            } else {
               class81 var4 = class189.method982(class165.field1744, client.field483.field3459);
               var4.field933.method666(class444.method2117(var1));
               var4.field933.method660(var1, (byte)42);
               client.field483.method1920(var4);
            }
         }
      }
   }

   final boolean method482() {
      return this.field976.method189() || this.field976.method188() >= 100 && 1 != client.field609;
   }

   final void method483(String var1) {
      if (var1 != null) {
         class174 var3 = new class174(var1, this.field974);
         if (var3.method930()) {
            if (this.field975.method209(var3)) {
               client.field632 = client.field622;
               class81 var4 = class189.method982(class165.field1819, client.field483.field3459);
               var4.field933.method666(class444.method2117(var1));
               var4.field933.method660(var1, (byte)117);
               client.field483.method1920(var4);
            }

            class193.method993();
         }
      }
   }

   final void method474(String var1) {
      if (var1 != null) {
         class174 var3 = new class174(var1, this.field974);
         if (var3.method930()) {
            if (this.field976.method209(var3)) {
               client.field632 = client.field622;
               class81 var4 = class189.method982(class165.field1817, client.field483.field3459);
               var4.field933.method666(class444.method2117(var1));
               var4.field933.method660(var1, (byte)11);
               client.field483.method1920(var4);
            }

            class441.method2107();
         }
      }
   }

   final boolean method488(class174 var1) {
      class317 var3 = (class317)this.field975.method205(var1);
      return null != var3 && var3.method967();
   }

   static final void method491(class421 var0) {
      int var2 = 0;
      var0.method2022();

      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < class25.field180; ++var3) {
         var4 = class25.field179[var3];
         if (0 == (class25.field176[var4] & 1)) {
            if (var2 > 0) {
               --var2;
               class25.field176[var4] = (byte)(class25.field176[var4] | 2);
            } else {
               var5 = var0.method2024(1);
               if (var5 == 0) {
                  var2 = class70.method395(var0);
                  class25.field176[var4] = (byte)(class25.field176[var4] | 2);
               } else {
                  class75.method412(var0, var4);
               }
            }
         }
      }

      var0.method2023();
      if (var2 != 0) {
         throw new RuntimeException();
      } else {
         var0.method2022();

         for(var3 = 0; var3 < class25.field180; ++var3) {
            var4 = class25.field179[var3];
            if (0 != (class25.field176[var4] & 1)) {
               if (var2 > 0) {
                  --var2;
                  class25.field176[var4] = (byte)(class25.field176[var4] | 2);
               } else {
                  var5 = var0.method2024(1);
                  if (var5 == 0) {
                     var2 = class70.method395(var0);
                     class25.field176[var4] = (byte)(class25.field176[var4] | 2);
                  } else {
                     class75.method412(var0, var4);
                  }
               }
            }
         }

         var0.method2023();
         if (var2 != 0) {
            throw new RuntimeException();
         } else {
            var0.method2022();

            for(var3 = 0; var3 < class25.field175; ++var3) {
               var4 = class25.field181[var3];
               if (0 != (class25.field176[var4] & 1)) {
                  if (var2 > 0) {
                     --var2;
                     class25.field176[var4] = (byte)(class25.field176[var4] | 2);
                  } else {
                     var5 = var0.method2024(1);
                     if (var5 == 0) {
                        var2 = class70.method395(var0);
                        class25.field176[var4] = (byte)(class25.field176[var4] | 2);
                     } else if (class19.method107(var0, var4)) {
                        class25.field176[var4] = (byte)(class25.field176[var4] | 2);
                     }
                  }
               }
            }

            var0.method2023();
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.method2022();

               for(var3 = 0; var3 < class25.field175; ++var3) {
                  var4 = class25.field181[var3];
                  if (0 == (class25.field176[var4] & 1)) {
                     if (var2 > 0) {
                        --var2;
                        class25.field176[var4] = (byte)(class25.field176[var4] | 2);
                     } else {
                        var5 = var0.method2024(1);
                        if (var5 == 0) {
                           var2 = class70.method395(var0);
                           class25.field176[var4] = (byte)(class25.field176[var4] | 2);
                        } else if (class19.method107(var0, var4)) {
                           class25.field176[var4] = (byte)(class25.field176[var4] | 2);
                        }
                     }
                  }
               }

               var0.method2023();
               if (var2 != 0) {
                  throw new RuntimeException();
               } else {
                  class25.field180 = 0;
                  class25.field175 = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     class25.field176[var3] = (byte)(class25.field176[var3] >> 1);
                     class47 var6 = client.field551[var3];
                     if (null != var6) {
                        class25.field179[++class25.field180 - 1] = var3;
                     } else {
                        class25.field181[++class25.field175 - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }

   static class472 method490(byte[] var0) {
      class472 var2 = new class472();
      class134 var3 = new class134(var0);
      var3.field1487 = var3.field1489.length - 2;
      int var4 = var3.method671();
      int var5 = var3.field1489.length - 2 - var4 - 12;
      var3.field1487 = var5;
      int var6 = var3.method717();
      var2.field3915 = var3.method671();
      var2.field3917 = var3.method671();
      var2.field3921 = var3.method671();
      var2.field3916 = var3.method671();
      int var7 = var3.method669();
      int var8;
      int var9;
      if (var7 > 0) {
         var2.field3920 = var2.method2286(var7);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.method671();
            class376 var10 = new class376(var9 > 0 ? class476.method2306(var9) : 1);
            var2.field3920[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.method717();
               int var12 = var3.method717();
               var10.method1793(new class258(var12), (long)var11);
            }
         }
      }

      var3.field1487 = 0;
      var2.field3912 = var3.method676();
      var2.field3913 = new int[var6];
      var2.field3914 = new int[var6];
      var2.field3919 = new String[var6];

      for(var8 = 0; var3.field1487 < var5; var2.field3913[var8++] = var9) {
         var9 = var3.method671();
         if (var9 == 3) {
            var2.field3919[var8] = var3.method677();
         } else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
            var2.field3914[var8] = var3.method717();
         } else {
            var2.field3914[var8] = var3.method669();
         }
      }

      return var2;
   }

   static float method487(class360 var0, float var1, boolean var2) {
      float var4 = 0.0F;
      if (var0 != null && var0.method1720() != 0) {
         float var5 = (float)var0.field3214[0].field1378;
         float var6 = (float)var0.field3214[var0.method1720() - 1].field1378;
         float var7 = var6 - var5;
         if (0.0D == (double)var7) {
            return var0.field3214[0].field1373;
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
               if (var0.field3212 == class313.field2978) {
                  if (0.0D != (double)var11) {
                     var12 += var5;
                  } else {
                     var12 = var6 - var12;
                  }
               } else if (class313.field2976 != var0.field3212 && var0.field3212 != class313.field2981) {
                  if (class313.field2975 == var0.field3212) {
                     var12 = var5 - var1;
                     var17 = var0.field3214[0].field1372;
                     var18 = var0.field3214[0].field1375;
                     var4 = var0.field3214[0].field1373;
                     if ((double)var17 != 0.0D) {
                        var4 -= var18 * var12 / var17;
                     }

                     return var4;
                  }
               } else {
                  var12 = var6 - var12;
               }
            } else if (var0.field3213 == class313.field2978) {
               if (0.0D != (double)var11) {
                  var12 = var6 - var12;
               } else {
                  var12 += var5;
               }
            } else if (var0.field3213 != class313.field2976 && class313.field2981 != var0.field3213) {
               if (class313.field2975 == var0.field3213) {
                  var12 = var1 - var6;
                  var17 = var0.field3214[var0.method1720() - 1].field1376;
                  var18 = var0.field3214[var0.method1720() - 1].field1374;
                  var4 = var0.field3214[var0.method1720() - 1].field1373;
                  if (0.0D != (double)var17) {
                     var4 += var18 * var12 / var17;
                  }

                  return var4;
               }
            } else {
               var12 += var5;
            }

            var4 = class152.method795(var0, var12);
            float var19;
            if (var2 && var0.field3212 == class313.field2981) {
               var19 = var0.field3214[var0.method1720() - 1].field1373 - var0.field3214[0].field1373;
               var4 = (float)((double)var4 - var9 * (double)var19);
            } else if (!var2 && var0.field3213 == class313.field2981) {
               var19 = var0.field3214[var0.method1720() - 1].field1373 - var0.field3214[0].field1373;
               var4 = (float)((double)var4 + var9 * (double)var19);
            }

            return var4;
         }
      } else {
         return var4;
      }
   }

   static final void method492(class30 var0) {
      if (var0.field304 != 0) {
         if (-1 != var0.field266) {
            Object var2 = null;
            int var3 = class38.field363 ? 65536 : '耀';
            if (var0.field266 < var3) {
               var2 = client.field669[var0.field266];
            } else if (var0.field266 >= var3) {
               var2 = client.field551[var0.field266 - var3];
            }

            if (var2 != null) {
               int var4 = var0.field297 - ((class30)var2).field297;
               int var5 = var0.field233 - ((class30)var2).field233;
               if (var4 != 0 || var5 != 0) {
                  var0.field299 = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
               }
            } else if (var0.field267) {
               var0.field266 = -1;
               var0.field267 = false;
            }
         }

         if (var0.field245 != -1 && (var0.field232 == 0 || var0.field294 > 0)) {
            var0.field299 = var0.field245;
            var0.field245 = -1;
         }

         int var6 = var0.field299 - var0.field247 & 2047;
         if (var6 == 0 && var0.field267) {
            var0.field266 = -1;
            var0.field267 = false;
         }

         if (var6 != 0) {
            ++var0.field300;
            boolean var7;
            if (var6 > 1024) {
               var0.field247 -= var0.field283 ? var6 : var0.field304;
               var7 = true;
               if (var6 < var0.field304 || var6 > 2048 - var0.field304) {
                  var0.field247 = var0.field299;
                  var7 = false;
               }

               if (!var0.field283 && var0.field238 == var0.field270 && (var0.field300 > 25 || var7)) {
                  if (-1 != var0.field243) {
                     var0.field270 = var0.field243;
                  } else {
                     var0.field270 = var0.field241;
                  }
               }
            } else {
               var0.field247 += var0.field283 ? var6 : var0.field304;
               var7 = true;
               if (var6 < var0.field304 || var6 > 2048 - var0.field304) {
                  var0.field247 = var0.field299;
                  var7 = false;
               }

               if (!var0.field283 && var0.field238 == var0.field270 && (var0.field300 > 25 || var7)) {
                  if (var0.field305 != -1) {
                     var0.field270 = var0.field305;
                  } else {
                     var0.field270 = var0.field241;
                  }
               }
            }

            var0.field247 &= 2047;
            var0.field283 = false;
         } else {
            var0.field300 = 0;
         }

      }
   }

   static boolean method481(class210 var0) {
      return var0.field2267;
   }
}
