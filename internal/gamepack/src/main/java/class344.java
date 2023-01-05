public final class class344 {
   public static byte[][] field3162;
   static class161[] field3160;
   int field3155;
   int field3156;
   int field3159;
   int field3161;
   public class236 field3157;
   public long field3158;

   static final void method1658(class30 var0, int var1) {
      class79 var4;
      int var5;
      class79 var12;
      int var13;
      int var14;
      if (var0.field288 >= client.field435) {
         class125.method637(var0);
      } else {
         int var6;
         int var8;
         int var9;
         if (var0.field289 >= client.field435) {
            boolean var3 = client.field435 == var0.field289 || var0.field274 == -1 || var0.field277 != 0;
            if (!var3) {
               var4 = class242.method1218(var0.field274);
               if (null != var4 && !var4.method426()) {
                  var3 = 1 + var0.field276 > var4.field908[var0.field265];
               } else {
                  var3 = true;
               }
            }

            if (var3) {
               var13 = var0.field289 - var0.field288;
               var5 = client.field435 - var0.field288;
               var6 = var0.field236 * -31241280 + var0.field251 * -600195968;
               int var7 = var0.field236 * -31241280 + var0.field240 * 221025152;
               var8 = var0.field236 * -31241280 + var0.field285 * -2082827392;
               var9 = var0.field268 * -1434588800 + var0.field236 * -31241280;
               var0.field297 = (var8 * var5 + (var13 - var5) * var6) / var13;
               var0.field233 = (var9 * var5 + (var13 - var5) * var7) / var13;
            }

            var0.field294 = 0;
            var0.field299 = var0.field290;
            var0.field247 = var0.field299;
         } else {
            var0.field270 = var0.field238;
            if (var0.field232 == 0) {
               var0.field294 = 0;
            } else {
               label496: {
                  if (-1 != var0.field274 && var0.field277 == 0) {
                     var12 = class242.method1218(var0.field274);
                     if (var0.field307 > 0 && 0 == var12.field910) {
                        ++var0.field294;
                        break label496;
                     }

                     if (var0.field307 <= 0 && var12.field905 == 0) {
                        ++var0.field294;
                        break label496;
                     }
                  }

                  var14 = var0.field297;
                  var13 = var0.field233;
                  var5 = var0.field236 * -31241280 + var0.field258[var0.field232 - 1] * 128;
                  var6 = var0.field306[var0.field232 - 1] * 128 + var0.field236 * -31241280;
                  if (var14 < var5) {
                     if (var13 < var6) {
                        var0.field299 = 1280;
                     } else if (var13 > var6) {
                        var0.field299 = 1792;
                     } else {
                        var0.field299 = 1536;
                     }
                  } else if (var14 > var5) {
                     if (var13 < var6) {
                        var0.field299 = 768;
                     } else if (var13 > var6) {
                        var0.field299 = 256;
                     } else {
                        var0.field299 = 512;
                     }
                  } else if (var13 < var6) {
                     var0.field299 = 1024;
                  } else if (var13 > var6) {
                     var0.field299 = 0;
                  }

                  class156 var15 = var0.field286[var0.field232 - 1];
                  if (var5 - var14 <= 256 && var5 - var14 >= -256 && var6 - var13 <= 256 && var6 - var13 >= -256) {
                     var8 = var0.field299 - var0.field247 & 2047;
                     if (var8 > 1024) {
                        var8 -= 2048;
                     }

                     var9 = var0.field302;
                     if (var8 >= -256 && var8 <= 256) {
                        var9 = var0.field241;
                     } else if (var8 >= 256 && var8 < 768) {
                        var9 = var0.field244;
                     } else if (var8 >= -768 && var8 <= -256) {
                        var9 = var0.field259;
                     }

                     if (var9 == -1) {
                        var9 = var0.field241;
                     }

                     var0.field270 = var9;
                     int var10 = 4;
                     boolean var11 = true;
                     if (var0 instanceof class53) {
                        var11 = ((class53)var0).field798.field2747;
                     }

                     if (var11) {
                        if (var0.field247 != var0.field299 && -1 == var0.field266 && 0 != var0.field304) {
                           var10 = 2;
                        }

                        if (var0.field232 > 2) {
                           var10 = 6;
                        }

                        if (var0.field232 > 3) {
                           var10 = 8;
                        }

                        if (var0.field294 > 0 && var0.field232 > 1) {
                           var10 = 8;
                           --var0.field294;
                        }
                     } else {
                        if (var0.field232 > 1) {
                           var10 = 6;
                        }

                        if (var0.field232 > 2) {
                           var10 = 8;
                        }

                        if (var0.field294 > 0 && var0.field232 > 1) {
                           var10 = 8;
                           --var0.field294;
                        }
                     }

                     if (class156.field1622 == var15) {
                        var10 <<= 1;
                     } else if (class156.field1621 == var15) {
                        var10 >>= 1;
                     }

                     if (var10 >= 8) {
                        if (var0.field270 == var0.field241 && -1 != var0.field235) {
                           var0.field270 = var0.field235;
                        } else if (var0.field270 == var0.field302 && -1 != var0.field246) {
                           var0.field270 = var0.field246;
                        } else if (var0.field259 == var0.field270 && var0.field256 != -1) {
                           var0.field270 = var0.field256;
                        } else if (var0.field244 == var0.field270 && -1 != var0.field248) {
                           var0.field270 = var0.field248;
                        }
                     } else if (var10 <= 1) {
                        if (var0.field241 == var0.field270 && var0.field249 != -1) {
                           var0.field270 = var0.field249;
                        } else if (var0.field270 == var0.field302 && -1 != var0.field250) {
                           var0.field270 = var0.field250;
                        } else if (var0.field270 == var0.field259 && -1 != var0.field281) {
                           var0.field270 = var0.field281;
                        } else if (var0.field270 == var0.field244 && -1 != var0.field252) {
                           var0.field270 = var0.field252;
                        }
                     }

                     if (var5 != var14 || var13 != var6) {
                        if (var14 < var5) {
                           var0.field297 += var10;
                           if (var0.field297 > var5) {
                              var0.field297 = var5;
                           }
                        } else if (var14 > var5) {
                           var0.field297 -= var10;
                           if (var0.field297 < var5) {
                              var0.field297 = var5;
                           }
                        }

                        if (var13 < var6) {
                           var0.field233 += var10;
                           if (var0.field233 > var6) {
                              var0.field233 = var6;
                           }
                        } else if (var13 > var6) {
                           var0.field233 -= var10;
                           if (var0.field233 < var6) {
                              var0.field233 = var6;
                           }
                        }
                     }

                     if (var5 == var0.field297 && var0.field233 == var6) {
                        --var0.field232;
                        if (var0.field307 > 0) {
                           --var0.field307;
                        }
                     }
                  } else {
                     var0.field297 = var5;
                     var0.field233 = var6;
                     --var0.field232;
                     if (var0.field307 > 0) {
                        --var0.field307;
                     }
                  }
               }
            }
         }
      }

      if (var0.field297 < 128 || var0.field233 < 128 || var0.field297 >= 13184 || var0.field233 >= 13184) {
         var0.field274 = -1;
         var0.field279 = -1;
         var0.field288 = 0;
         var0.field289 = 0;
         var0.field297 = var0.field258[0] * 128 + var0.field236 * -31241280;
         var0.field233 = var0.field306[0] * 128 + var0.field236 * -31241280;
         var0.method155();
      }

      if (class89.field982 == var0 && (var0.field297 < 1536 || var0.field233 < 1536 || var0.field297 >= 11776 || var0.field233 >= 11776)) {
         var0.field274 = -1;
         var0.field279 = -1;
         var0.field288 = 0;
         var0.field289 = 0;
         var0.field297 = 128 * var0.field258[0] + var0.field236 * -31241280;
         var0.field233 = var0.field306[0] * 128 + var0.field236 * -31241280;
         var0.method155();
      }

      class88.method492(var0);
      var0.field234 = false;
      if (var0.field270 != -1) {
         var12 = class242.method1218(var0.field270);
         if (var12 != null) {
            if (!var12.method426() && null != var12.field914) {
               ++var0.field272;
               if (var0.field271 < var12.field914.length && var0.field272 > var12.field908[var0.field271]) {
                  var0.field272 = 1;
                  ++var0.field271;
                  class85.method467(var12, var0.field271, var0.field297, var0.field233);
               }

               if (var0.field271 >= var12.field914.length) {
                  if (var12.field917 > 0) {
                     var0.field271 -= var12.field917;
                     if (var12.field918) {
                        ++var0.field273;
                     }

                     if (var0.field271 < 0 || var0.field271 >= var12.field914.length || var12.field918 && var0.field273 >= var12.field921) {
                        var0.field272 = 0;
                        var0.field271 = 0;
                        var0.field273 = 0;
                     }
                  } else {
                     var0.field272 = 0;
                     var0.field271 = 0;
                  }

                  class85.method467(var12, var0.field271, var0.field297, var0.field233);
               }
            } else if (var12.method426()) {
               ++var0.field271;
               var13 = var12.method428();
               if (var0.field271 < var13) {
                  class449.method2125(var12, var0.field271, var0.field297, var0.field233);
               } else {
                  if (var12.field917 > 0) {
                     var0.field271 -= var12.field917;
                     if (var12.field918) {
                        ++var0.field273;
                     }

                     if (var0.field271 < 0 || var0.field271 >= var13 || var12.field918 && var0.field273 >= var12.field921) {
                        var0.field271 = 0;
                        var0.field272 = 0;
                        var0.field273 = 0;
                     }
                  } else {
                     var0.field272 = 0;
                     var0.field271 = 0;
                  }

                  class449.method2125(var12, var0.field271, var0.field297, var0.field233);
               }
            } else {
               var0.field270 = -1;
            }
         } else {
            var0.field270 = -1;
         }
      }

      if (-1 != var0.field279 && client.field435 >= var0.field282) {
         if (var0.field280 < 0) {
            var0.field280 = 0;
         }

         var14 = class27.method148(var0.field279).field1999;
         if (var14 != -1) {
            var4 = class242.method1218(var14);
            if (var4 != null && var4.field914 != null && !var4.method426()) {
               ++var0.field269;
               if (var0.field280 < var4.field914.length && var0.field269 > var4.field908[var0.field280]) {
                  var0.field269 = 1;
                  ++var0.field280;
                  class85.method467(var4, var0.field280, var0.field297, var0.field233);
               }

               if (var0.field280 >= var4.field914.length && (var0.field280 < 0 || var0.field280 >= var4.field914.length)) {
                  var0.field279 = -1;
               }
            } else if (var4.method426()) {
               ++var0.field280;
               var5 = var4.method428();
               if (var0.field280 < var5) {
                  class449.method2125(var4, var0.field280, var0.field297, var0.field233);
               } else if (var0.field280 < 0 || var0.field280 >= var5) {
                  var0.field279 = -1;
               }
            } else {
               var0.field279 = -1;
            }
         } else {
            var0.field279 = -1;
         }
      }

      if (var0.field274 != -1 && var0.field277 <= 1) {
         var12 = class242.method1218(var0.field274);
         if (1 == var12.field910 && var0.field307 > 0 && var0.field288 <= client.field435 && var0.field289 < client.field435) {
            var0.field277 = 1;
            return;
         }
      }

      if (-1 != var0.field274 && 0 == var0.field277) {
         var12 = class242.method1218(var0.field274);
         if (null == var12) {
            var0.field274 = -1;
         } else if (!var12.method426() && null != var12.field914) {
            ++var0.field276;
            if (var0.field265 < var12.field914.length && var0.field276 > var12.field908[var0.field265]) {
               var0.field276 = 1;
               ++var0.field265;
               class85.method467(var12, var0.field265, var0.field297, var0.field233);
            }

            if (var0.field265 >= var12.field914.length) {
               var0.field265 -= var12.field917;
               ++var0.field278;
               if (var0.field278 >= var12.field921) {
                  var0.field274 = -1;
               } else if (var0.field265 >= 0 && var0.field265 < var12.field914.length) {
                  class85.method467(var12, var0.field265, var0.field297, var0.field233);
               } else {
                  var0.field274 = -1;
               }
            }

            var0.field234 = var12.field902;
         } else if (var12.method426()) {
            ++var0.field265;
            var13 = var12.method428();
            if (var0.field265 < var13) {
               class449.method2125(var12, var0.field265, var0.field297, var0.field233);
            } else {
               var0.field265 -= var12.field917;
               ++var0.field278;
               if (var0.field278 >= var12.field921) {
                  var0.field274 = -1;
               } else if (var0.field265 >= 0 && var0.field265 < var13) {
                  class449.method2125(var12, var0.field265, var0.field297, var0.field233);
               } else {
                  var0.field274 = -1;
               }
            }
         } else {
            var0.field274 = -1;
         }
      }

      if (var0.field277 > 0) {
         --var0.field277;
      }

   }

   static class204 method1657(int var0, int var1) {
      client.field722.field2180 = var0;
      client.field722.field2183 = var1;
      client.field722.field2181 = 1579007973;
      client.field722.field2182 = -1169949035;
      return client.field722;
   }
}
