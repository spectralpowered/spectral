public class class140 extends class305 {
   public static client field1508;
   static class164 field1509;
   final boolean field1510;

   public class140(boolean var1) {
      this.field1510 = var1;
   }

   int method735(class185 var1, class185 var2) {
      if (var2.field1979 != var1.field1979) {
         return this.field1510 ? var1.field1979 - var2.field1979 : var2.field1979 - var1.field1979;
      } else {
         return this.method1440(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method735((class185)var1, (class185)var2);
   }

   static final void method736(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (client.field478 && var0 != class195.field2036) {
            return;
         }

         long var8 = 0L;
         boolean var10 = true;
         boolean var11 = false;
         boolean var12 = false;
         if (var1 == 0) {
            var8 = class13.field126.method83(var0, var2, var3);
         }

         if (var1 == 1) {
            var8 = class13.field126.method78(var0, var2, var3);
         }

         if (var1 == 2) {
            var8 = class13.field126.method81(var0, var2, var3);
         }

         if (var1 == 3) {
            var8 = class13.field126.method51(var0, var2, var3);
         }

         int var13;
         if (0L != var8) {
            var13 = class13.field126.method77(var0, var2, var3, var8);
            int var36 = class7.method24(var8);
            int var37 = var13 & 31;
            int var38 = var13 >> 6 & 3;
            class173 var14;
            if (var1 == 0) {
               class13.field126.method75(var0, var2, var3);
               var14 = class212.method1110(var36);
               if (0 != var14.field1875) {
                  client.field493[var0].method1890(var2, var3, var37, var38, var14.field1888);
               }
            }

            if (var1 == 1) {
               class13.field126.method80(var0, var2, var3);
            }

            if (var1 == 2) {
               class13.field126.method71(var0, var2, var3);
               var14 = class212.method1110(var36);
               if (var2 + var14.field1878 > 103 || var14.field1878 + var3 > 103 || var2 + var14.field1879 > 103 || var14.field1879 + var3 > 103) {
                  return;
               }

               if (var14.field1875 != 0) {
                  client.field493[var0].method1893(var2, var3, var14.field1878, var14.field1879, var38, var14.field1888);
               }
            }

            if (var1 == 3) {
               class13.field126.method46(var0, var2, var3);
               var14 = class212.method1110(var36);
               if (1 == var14.field1875) {
                  client.field493[var0].method1895(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var13 = var0;
            if (var0 < 3 && (class74.field866[1][var2][var3] & 2) == 2) {
               var13 = var0 + 1;
            }

            class12 var39 = class13.field126;
            class391 var15 = client.field493[var0];
            class173 var16 = class212.method1110(var4);
            int var17;
            int var18;
            if (var5 != 1 && var5 != 3) {
               var17 = var16.field1878;
               var18 = var16.field1879;
            } else {
               var17 = var16.field1879;
               var18 = var16.field1878;
            }

            int var19;
            int var20;
            if (var17 + var2 <= 104) {
               var19 = var2 + (var17 >> 1);
               var20 = var2 + (var17 + 1 >> 1);
            } else {
               var19 = var2;
               var20 = var2 + 1;
            }

            int var21;
            int var22;
            if (var18 + var3 <= 104) {
               var21 = (var18 >> 1) + var3;
               var22 = var3 + (var18 + 1 >> 1);
            } else {
               var21 = var3;
               var22 = var3 + 1;
            }

            int[][] var23 = class74.field858[var13];
            int var24 = var23[var20][var22] + var23[var19][var21] + var23[var20][var21] + var23[var19][var22] >> 2;
            int var25 = (var2 << 7) + (var17 << 6);
            int var26 = (var18 << 6) + (var3 << 7);
            long var27 = class141.method764(var2, var3, 2, 0 == var16.field1882, var4);
            int var29 = var6 + (var5 << 6);
            if (var16.field1902 == 1) {
               var29 += 256;
            }

            Object var30;
            if (var6 == 22) {
               if (-1 == var16.field1886 && var16.field1903 == null) {
                  var30 = var16.method920(22, var5, var23, var25, var24, var26);
               } else {
                  var30 = new class479(var4, 22, var5, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
               }

               var39.method35(var0, var2, var3, var24, (class236)var30, var27, var29);
               if (var16.field1875 == 1) {
                  var15.method1889(var2, var3);
               }
            } else if (var6 != 10 && var6 != 11) {
               if (var6 >= 12) {
                  if (var16.field1886 == -1 && null == var16.field1903) {
                     var30 = var16.method920(var6, var5, var23, var25, var24, var26);
                  } else {
                     var30 = new class479(var4, var6, var5, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                  }

                  var39.method39(var0, var2, var3, var24, 1, 1, (class236)var30, 0, var27, var29);
                  if (0 != var16.field1875) {
                     var15.method1897(var2, var3, var17, var18, var16.field1888);
                  }
               } else if (var6 == 0) {
                  if (var16.field1886 == -1 && null == var16.field1903) {
                     var30 = var16.method920(0, var5, var23, var25, var24, var26);
                  } else {
                     var30 = new class479(var4, 0, var5, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                  }

                  var39.method37(var0, var2, var3, var24, (class236)var30, (class236)null, class74.field864[var5], 0, var27, var29);
                  if (var16.field1875 != 0) {
                     var15.method1887(var2, var3, var6, var5, var16.field1888);
                  }
               } else if (var6 == 1) {
                  if (var16.field1886 == -1 && null == var16.field1903) {
                     var30 = var16.method920(1, var5, var23, var25, var24, var26);
                  } else {
                     var30 = new class479(var4, 1, var5, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                  }

                  var39.method37(var0, var2, var3, var24, (class236)var30, (class236)null, class74.field868[var5], 0, var27, var29);
                  if (0 != var16.field1875) {
                     var15.method1887(var2, var3, var6, var5, var16.field1888);
                  }
               } else {
                  int var42;
                  if (var6 == 2) {
                     var42 = var5 + 1 & 3;
                     Object var31;
                     Object var32;
                     if (-1 == var16.field1886 && null == var16.field1903) {
                        var31 = var16.method920(2, var5 + 4, var23, var25, var24, var26);
                        var32 = var16.method920(2, var42, var23, var25, var24, var26);
                     } else {
                        var31 = new class479(var4, 2, var5 + 4, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                        var32 = new class479(var4, 2, var42, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                     }

                     var39.method37(var0, var2, var3, var24, (class236)var31, (class236)var32, class74.field864[var5], class74.field864[var42], var27, var29);
                     if (var16.field1875 != 0) {
                        var15.method1887(var2, var3, var6, var5, var16.field1888);
                     }
                  } else if (var6 == 3) {
                     if (var16.field1886 == -1 && var16.field1903 == null) {
                        var30 = var16.method920(3, var5, var23, var25, var24, var26);
                     } else {
                        var30 = new class479(var4, 3, var5, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                     }

                     var39.method37(var0, var2, var3, var24, (class236)var30, (class236)null, class74.field868[var5], 0, var27, var29);
                     if (var16.field1875 != 0) {
                        var15.method1887(var2, var3, var6, var5, var16.field1888);
                     }
                  } else if (var6 == 9) {
                     if (var16.field1886 == -1 && var16.field1903 == null) {
                        var30 = var16.method920(var6, var5, var23, var25, var24, var26);
                     } else {
                        var30 = new class479(var4, var6, var5, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                     }

                     var39.method39(var0, var2, var3, var24, 1, 1, (class236)var30, 0, var27, var29);
                     if (var16.field1875 != 0) {
                        var15.method1897(var2, var3, var17, var18, var16.field1888);
                     }
                  } else if (var6 == 4) {
                     if (-1 == var16.field1886 && null == var16.field1903) {
                        var30 = var16.method920(4, var5, var23, var25, var24, var26);
                     } else {
                        var30 = new class479(var4, 4, var5, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                     }

                     var39.method38(var0, var2, var3, var24, (class236)var30, (class236)null, class74.field864[var5], 0, 0, 0, var27, var29);
                  } else {
                     Object var33;
                     long var40;
                     if (var6 == 5) {
                        var42 = 16;
                        var40 = var39.method83(var0, var2, var3);
                        if (var40 != 0L) {
                           var42 = class212.method1110(class7.method24(var40)).field1887;
                        }

                        if (var16.field1886 == -1 && null == var16.field1903) {
                           var33 = var16.method920(4, var5, var23, var25, var24, var26);
                        } else {
                           var33 = new class479(var4, 4, var5, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                        }

                        var39.method38(var0, var2, var3, var24, (class236)var33, (class236)null, class74.field864[var5], 0, class74.field867[var5] * var42, class74.field861[var5] * var42, var27, var29);
                     } else if (var6 == 6) {
                        var42 = 8;
                        var40 = var39.method83(var0, var2, var3);
                        if (var40 != 0L) {
                           var42 = class212.method1110(class7.method24(var40)).field1887 / 2;
                        }

                        if (var16.field1886 == -1 && null == var16.field1903) {
                           var33 = var16.method920(4, var5 + 4, var23, var25, var24, var26);
                        } else {
                           var33 = new class479(var4, 4, var5 + 4, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                        }

                        var39.method38(var0, var2, var3, var24, (class236)var33, (class236)null, 256, var5, class74.field869[var5] * var42, class74.field857[var5] * var42, var27, var29);
                     } else if (var6 == 7) {
                        int var41 = var5 + 2 & 3;
                        if (-1 == var16.field1886 && var16.field1903 == null) {
                           var30 = var16.method920(4, var41 + 4, var23, var25, var24, var26);
                        } else {
                           var30 = new class479(var4, 4, var41 + 4, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                        }

                        var39.method38(var0, var2, var3, var24, (class236)var30, (class236)null, 256, var41, 0, 0, var27, var29);
                     } else if (var6 == 8) {
                        var42 = 8;
                        var40 = var39.method83(var0, var2, var3);
                        if (0L != var40) {
                           var42 = class212.method1110(class7.method24(var40)).field1887 / 2;
                        }

                        int var35 = var5 + 2 & 3;
                        Object var34;
                        if (var16.field1886 == -1 && null == var16.field1903) {
                           var33 = var16.method920(4, var5 + 4, var23, var25, var24, var26);
                           var34 = var16.method920(4, var35 + 4, var23, var25, var24, var26);
                        } else {
                           var33 = new class479(var4, 4, var5 + 4, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                           var34 = new class479(var4, 4, var35 + 4, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
                        }

                        var39.method38(var0, var2, var3, var24, (class236)var33, (class236)var34, 256, var5, class74.field869[var5] * var42, var42 * class74.field857[var5], var27, var29);
                     }
                  }
               }
            } else {
               if (var16.field1886 == -1 && var16.field1903 == null) {
                  var30 = var16.method920(10, var5, var23, var25, var24, var26);
               } else {
                  var30 = new class479(var4, 10, var5, var13, var2, var3, var16.field1886, var16.field1895, (class236)null);
               }

               if (null != var30) {
                  var39.method39(var0, var2, var3, var24, var17, var18, (class236)var30, var6 == 11 ? 256 : 0, var27, var29);
               }

               if (0 != var16.field1875) {
                  var15.method1897(var2, var3, var17, var18, var16.field1888);
               }
            }
         }
      }

   }
}
