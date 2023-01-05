public class class152 extends class108 {
   public static class164 field1593;
   public static class31 field1594 = new class31(64);
   public boolean field1597 = true;
   public int field1595 = 0;
   public int field1596 = -1;
   public int field1598 = -1;
   public int field1599;
   public int field1600;
   public int field1601;
   public int field1602;
   public int field1603;
   public int field1604;

   public void method796() {
      if (-1 != this.field1598) {
         this.method799(this.field1598);
         this.field1602 = this.field1601;
         this.field1603 = this.field1599;
         this.field1604 = this.field1600;
      }

      this.method799(this.field1595);
   }

   public void method797(class134 var1, int var2) {
      while(true) {
         int var4 = var1.method669();
         if (var4 == 0) {
            return;
         }

         this.method798(var1, var4, var2);
      }
   }

   void method798(class134 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field1595 = var1.method673();
      } else if (var2 == 2) {
         this.field1596 = var1.method669();
      } else if (var2 == 5) {
         this.field1597 = false;
      } else if (var2 == 7) {
         this.field1598 = var1.method673();
      } else if (var2 == 8) {
         ;
      }

   }

   void method799(int var1) {
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
      this.field1601 = (int)(var13 * 256.0D);
      this.field1599 = (int)(var15 * 256.0D);
      this.field1600 = (int)(var17 * 256.0D);
      if (this.field1599 < 0) {
         this.field1599 = 0;
      } else if (this.field1599 > 255) {
         this.field1599 = 255;
      }

      if (this.field1600 < 0) {
         this.field1600 = 0;
      } else if (this.field1600 > 255) {
         this.field1600 = 255;
      }

   }

   static float method795(class360 var0, float var1) {
      if (var0 != null && var0.method1720() != 0) {
         if (var1 < (float)var0.field3214[0].field1378) {
            return class313.field2980 == var0.field3212 ? var0.field3214[0].field1373 : class88.method487(var0, var1, true);
         } else if (var1 > (float)var0.field3214[var0.method1720() - 1].field1378) {
            return class313.field2980 == var0.field3213 ? var0.field3214[var0.method1720() - 1].field1373 : class88.method487(var0, var1, false);
         } else if (var0.field3211) {
            return var0.field3214[0].field1373;
         } else {
            class109 var3 = var0.method1721(var1);
            boolean var4 = false;
            boolean var5 = false;
            if (var3 == null) {
               return 0.0F;
            } else {
               if ((double)var3.field1376 == 0.0D && 0.0D == (double)var3.field1374) {
                  var4 = true;
               } else if (var3.field1376 == Float.MAX_VALUE && var3.field1374 == Float.MAX_VALUE) {
                  var5 = true;
               } else if (var3.field1377 != null) {
                  if (var0.field3226) {
                     float var6 = (float)var3.field1378;
                     float var10 = var3.field1373;
                     float var7 = var6 + var3.field1376 * 0.33333334F;
                     float var11 = var3.field1374 * 0.33333334F + var10;
                     float var9 = (float)var3.field1377.field1378;
                     float var13 = var3.field1377.field1373;
                     float var8 = var9 - var3.field1377.field1372 * 0.33333334F;
                     float var12 = var13 - var3.field1377.field1375 * 0.33333334F;
                     if (var0.field3220) {
                        float var16 = var11;
                        float var17 = var12;
                        if (var0 != null) {
                           float var18 = var9 - var6;
                           if ((double)var18 != 0.0D) {
                              float var19 = var7 - var6;
                              float var20 = var8 - var6;
                              float[] var21 = new float[]{var19 / var18, var20 / var18};
                              var0.field3230 = var21[0] == 0.33333334F && 0.6666667F == var21[1];
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
                                    if (var24 + class257.field2642 > 0.0F) {
                                       if (class257.field2642 + var21[0] < 1.3333334F) {
                                          var25 = var21[0] - 2.0F;
                                          var26 = var21[0] - 1.0F;
                                          var27 = (float)Math.sqrt((double)(var25 * var25 - var26 * 4.0F * var26));
                                          var28 = (-var25 + var27) * 0.5F;
                                          if (var21[1] + class257.field2642 > var28) {
                                             var21[1] = var28 - class257.field2642;
                                          } else {
                                             var28 = 0.5F * (-var25 - var27);
                                             if (var21[1] < var28 + class257.field2642) {
                                                var21[1] = var28 + class257.field2642;
                                             }
                                          }
                                       } else {
                                          var21[0] = 1.3333334F - class257.field2642;
                                          var21[1] = 0.33333334F - class257.field2642;
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

                              var0.field3216 = var6;
                              var0.field3217 = var9;
                              var24 = var21[0];
                              var25 = var21[1];
                              var26 = var24 - 0.0F;
                              var27 = var25 - var24;
                              var28 = 1.0F - var25;
                              float var29 = var27 - var26;
                              var0.field3221 = var28 - var27 - var29;
                              var0.field3210 = var29 + var29 + var29;
                              var0.field3232 = var26 + var26 + var26;
                              var0.field3218 = 0.0F;
                              var26 = var16 - var10;
                              var27 = var17 - var16;
                              var28 = var13 - var17;
                              var29 = var27 - var26;
                              var0.field3225 = var28 - var27 - var29;
                              var0.field3224 = var29 + var29 + var29;
                              var0.field3223 = var26 + var26 + var26;
                              var0.field3222 = var10;
                           }
                        }
                     } else {
                        class171.method909(var0, var6, var7, var8, var9, var10, var11, var12, var13);
                     }

                     var0.field3226 = false;
                  }
               } else {
                  var4 = true;
               }

               if (var4) {
                  return var3.field1373;
               } else if (var5) {
                  return var1 != (float)var3.field1378 && var3.field1377 != null ? var3.field1377.field1373 : var3.field1373;
               } else {
                  return var0.field3220 ? class402.method1973(var0, var1) : class59.method338(var0, var1);
               }
            }
         }
      } else {
         return 0.0F;
      }
   }
}
