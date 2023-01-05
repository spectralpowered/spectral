public class class179 extends class195 {
   public static class274 field1646;
   public static class99 field1647 = new class99(64);
   public boolean field1650 = true;
   public int field1648 = 0;
   public int field1649 = -1;
   public int field1651 = -1;
   public int field1652;
   public int field1653;
   public int field1654;
   public int field1655;
   public int field1656;
   public int field1657;

   public void method814() {
      if (-1 != this.field1651) {
         this.method817(this.field1651);
         this.field1655 = this.field1654;
         this.field1656 = this.field1652;
         this.field1657 = this.field1653;
      }

      this.method817(this.field1648);
   }

   public void method815(class127 var1, int var2) {
      while(true) {
         int var4 = var1.method547();
         if (var4 == 0) {
            return;
         }

         this.method816(var1, var4, var2);
      }
   }

   void method816(class127 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field1648 = var1.method551();
      } else if (var2 == 2) {
         this.field1649 = var1.method547();
      } else if (var2 == 5) {
         this.field1650 = false;
      } else if (var2 == 7) {
         this.field1651 = var1.method551();
      } else if (var2 == 8) {
         ;
      }

   }

   void method817(int var1) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var5 = (double)(var1 >> 8 & 255) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var9 + var11) / 2.0D;
      if (var9 != var11) {
         if (var17 < 0.5D) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if (var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var11 == var5) {
            var13 = 2.0D + (var7 - var3) / (var11 - var9);
         } else if (var7 == var11) {
            var13 = (var3 - var5) / (var11 - var9) + 4.0D;
         }
      }

      var13 /= 6.0D;
      this.field1654 = (int)(var13 * 256.0D);
      this.field1652 = (int)(var15 * 256.0D);
      this.field1653 = (int)(var17 * 256.0D);
      if (this.field1652 < 0) {
         this.field1652 = 0;
      } else if (this.field1652 > 255) {
         this.field1652 = 255;
      }

      if (this.field1653 < 0) {
         this.field1653 = 0;
      } else if (this.field1653 > 255) {
         this.field1653 = 255;
      }

   }

   static float method813(class84 var0, float var1) {
      if (var0 != null && var0.method347() != 0) {
         if (var1 < (float)var0.field678[0].field2383) {
            return class301.field2418 == var0.field676 ? var0.field678[0].field2378 : class9.method53(var0, var1, true);
         } else if (var1 > (float)var0.field678[var0.method347() - 1].field2383) {
            return class301.field2418 == var0.field677 ? var0.field678[var0.method347() - 1].field2378 : class9.method53(var0, var1, false);
         } else if (var0.field675) {
            return var0.field678[0].field2378;
         } else {
            class293 var3 = var0.method348(var1);
            boolean var4 = false;
            boolean var5 = false;
            if (var3 == null) {
               return 0.0F;
            } else {
               if ((double)var3.field2381 == 0.0D && 0.0D == (double)var3.field2379) {
                  var4 = true;
               } else if (var3.field2381 == Float.MAX_VALUE && var3.field2379 == Float.MAX_VALUE) {
                  var5 = true;
               } else if (var3.field2382 != null) {
                  if (var0.field690) {
                     float var6 = (float)var3.field2383;
                     float var10 = var3.field2378;
                     float var7 = var6 + var3.field2381 * 0.33333334F;
                     float var11 = var3.field2379 * 0.33333334F + var10;
                     float var9 = (float)var3.field2382.field2383;
                     float var13 = var3.field2382.field2378;
                     float var8 = var9 - var3.field2382.field2377 * 0.33333334F;
                     float var12 = var13 - var3.field2382.field2380 * 0.33333334F;
                     if (var0.field684) {
                        float var16 = var11;
                        float var17 = var12;
                        if (var0 != null) {
                           float var18 = var9 - var6;
                           if ((double)var18 != 0.0D) {
                              float var19 = var7 - var6;
                              float var20 = var8 - var6;
                              float[] var21 = new float[]{var19 / var18, var20 / var18};
                              var0.field694 = var21[0] == 0.33333334F && 0.6666667F == var21[1];
                              float var22 = var21[0];
                              float var23 = var21[1];
                              if ((double)var21[0] < 0.0D) {
                                 var21[0] = 0.0F;
                              }

                              if ((double)var21[1] > 1.0D) {
                                 var21[1] = 1.0F;
                              }

                              float var24;
                              float var25;
                              float var26;
                              float var27;
                              float var28;
                              if ((double)var21[0] > 1.0D || var21[1] < -1.0F) {
                                 var21[1] = 1.0F - var21[1];
                                 if (var21[0] < 0.0F) {
                                    var21[0] = 0.0F;
                                 }

                                 if (var21[1] < 0.0F) {
                                    var21[1] = 0.0F;
                                 }

                                 if (var21[0] > 1.0F || var21[1] > 1.0F) {
                                    var24 = (float)(1.0D + (double)(var21[0] * (var21[0] - 2.0F + var21[1])) + ((double)var21[1] - 2.0D) * (double)var21[1]);
                                    if (var24 + class186.field1694 > 0.0F) {
                                       if (class186.field1694 + var21[0] < 1.3333334F) {
                                          var25 = var21[0] - 2.0F;
                                          var26 = var21[0] - 1.0F;
                                          var27 = (float)Math.sqrt((double)(var25 * var25 - var26 * 4.0F * var26));
                                          var28 = (-var25 + var27) * 0.5F;
                                          if (var21[1] + class186.field1694 > var28) {
                                             var21[1] = var28 - class186.field1694;
                                          } else {
                                             var28 = 0.5F * (-var25 - var27);
                                             if (var21[1] < var28 + class186.field1694) {
                                                var21[1] = var28 + class186.field1694;
                                             }
                                          }
                                       } else {
                                          var21[0] = 1.3333334F - class186.field1694;
                                          var21[1] = 0.33333334F - class186.field1694;
                                       }
                                    }
                                 }

                                 var21[1] = 1.0F - var21[1];
                              }

                              if (var22 != var21[0]) {
                                 float var10000 = var6 + var18 * var21[0];
                                 if (0.0D != (double)var22) {
                                    var16 = var10 + var21[0] * (var11 - var10) / var22;
                                 }
                              }

                              if (var21[1] != var23) {
                                 float var15 = var21[1] * var18 + var6;
                                 if ((double)var23 != 1.0D) {
                                    var17 = (float)((double)var13 - (1.0D - (double)var21[1]) * (double)(var13 - var12) / (1.0D - (double)var23));
                                 }
                              }

                              var0.field680 = var6;
                              var0.field681 = var9;
                              var24 = var21[0];
                              var25 = var21[1];
                              var26 = var24 - 0.0F;
                              var27 = var25 - var24;
                              var28 = 1.0F - var25;
                              float var29 = var27 - var26;
                              var0.field685 = var28 - var27 - var29;
                              var0.field674 = var29 + var29 + var29;
                              var0.field696 = var26 + var26 + var26;
                              var0.field682 = 0.0F;
                              var26 = var16 - var10;
                              var27 = var17 - var16;
                              var28 = var13 - var17;
                              var29 = var27 - var26;
                              var0.field689 = var28 - var27 - var29;
                              var0.field688 = var29 + var29 + var29;
                              var0.field687 = var26 + var26 + var26;
                              var0.field686 = var10;
                           }
                        }
                     } else {
                        class485.method2378(var0, var6, var7, var8, var9, var10, var11, var12, var13);
                     }

                     var0.field690 = false;
                  }
               } else {
                  var4 = true;
               }

               if (var4) {
                  return var3.field2378;
               } else if (var5) {
                  return var1 != (float)var3.field2383 && var3.field2382 != null ? var3.field2382.field2378 : var3.field2378;
               } else {
                  return var0.field684 ? class109.method438(var0, var1) : class292.method1434(var0, var1);
               }
            }
         }
      } else {
         return 0.0F;
      }
   }
}
