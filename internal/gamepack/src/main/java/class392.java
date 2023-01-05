public class class392 {
   static class31 field3456 = new class31(260);
   static final int[] field3455 = new int[]{8, 11, 4, 6, 9, 7, 10};
   boolean field3448 = false;
   class274[] field3453;
   int[] field3447;
   int[] field3454;
   long field3450;
   long field3452;
   public int field3446;
   public int field3449 = 0;
   public int field3451 = -1;

   public void method1906(int[] var1, class274[] var2, boolean var3, int[] var4, int var5, int var6, int var7) {
      this.field3453 = var2;
      this.field3448 = var3;
      this.field3451 = var7;
      this.method1899(var1, var4, var5, var6);
   }

   public void method1899(int[] var1, int[] var2, int var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var6 = 0; var6 < 7; ++var6) {
            for(int var7 = 0; var7 < class71.field851; ++var7) {
               class237 var8 = class429.method2056(var7);
               if (var8 != null && !var8.field2565 && var8.field2558 == var6 + (var3 == 1 ? 7 : 0)) {
                  var1[field3455[var6]] = var7 + 256;
                  break;
               }
            }
         }
      }

      this.field3454 = var1;
      this.field3447 = var2;
      this.field3449 = var3;
      this.field3446 = var4;
      this.method1903();
   }

   public void method1908(int var1, boolean var2) {
      if (var1 != 1 || 1 != this.field3449) {
         int var4 = this.field3454[field3455[var1]];
         if (var4 != 0) {
            var4 -= 256;

            class237 var5;
            do {
               if (!var2) {
                  --var4;
                  if (var4 < 0) {
                     var4 = class71.field851 - 1;
                  }
               } else {
                  ++var4;
                  if (var4 >= class71.field851) {
                     var4 = 0;
                  }
               }

               var5 = class429.method2056(var4);
            } while(var5 == null || var5.field2565 || var5.field2558 != (this.field3449 == 1 ? 7 : 0) + var1);

            this.field3454[field3455[var1]] = var4 + 256;
            this.method1903();
         }
      }
   }

   public void method1900(int var1, boolean var2) {
      int var4 = this.field3447[var1];
      if (!var2) {
         do {
            --var4;
            if (var4 < 0) {
               var4 = class253.field2638[var1].length - 1;
            }
         } while(!class264.method1262(var1, var4));
      } else {
         do {
            ++var4;
            if (var4 >= class253.field2638[var1].length) {
               var4 = 0;
            }
         } while(!class264.method1262(var1, var4));
      }

      this.field3447[var1] = var4;
      this.method1903();
   }

   public void method1901(int var1) {
      if (this.field3449 != var1) {
         this.method1899((int[])null, this.field3447, var1, -1);
      }
   }

   public void method1902(class134 var1) {
      var1.method666(this.field3449);

      int var3;
      for(var3 = 0; var3 < 7; ++var3) {
         int var4 = this.field3454[field3455[var3]];
         if (var4 == 0) {
            var1.method666(-1);
         } else {
            var1.method666(var4 - 256);
         }
      }

      for(var3 = 0; var3 < 5; ++var3) {
         var1.method666(this.field3447[var3]);
      }

   }

   void method1903() {
      long var2 = this.field3450;
      int var4 = this.field3454[5];
      int var5 = this.field3454[9];
      this.field3454[5] = var5;
      this.field3454[9] = var4;
      this.field3450 = 0L;

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         this.field3450 <<= 4;
         if (this.field3454[var6] >= 256) {
            this.field3450 += (long)(this.field3454[var6] - 256);
         }
      }

      if (this.field3454[0] >= 256) {
         this.field3450 += (long)(this.field3454[0] - 256 >> 4);
      }

      if (this.field3454[1] >= 256) {
         this.field3450 += (long)(this.field3454[1] - 256 >> 8);
      }

      for(var6 = 0; var6 < 5; ++var6) {
         this.field3450 <<= 3;
         this.field3450 += (long)this.field3447[var6];
      }

      this.field3450 <<= 1;
      this.field3450 += (long)this.field3449;
      this.field3454[5] = var4;
      this.field3454[9] = var5;
      if (var2 != 0L && var2 != this.field3450 || this.field3448) {
         field3456.method160(var2);
      }

   }

   public class491 method1898(class79 var1, int var2, class79 var3, int var4) {
      if (this.field3446 != -1) {
         return class190.method984(this.field3446, (byte)119).method1298(var1, var2, var3, var4, (class490)null);
      } else {
         long var6 = this.field3450;
         int[] var8 = this.field3454;
         if (var1 != null && (var1.field915 >= 0 || var1.field916 >= 0)) {
            var8 = new int[12];

            for(int var9 = 0; var9 < 12; ++var9) {
               var8[var9] = this.field3454[var9];
            }

            if (var1.field915 >= 0) {
               var6 += (long)(var1.field915 - this.field3454[5] << 40);
               var8[5] = var1.field915;
            }

            if (var1.field916 >= 0) {
               var6 += (long)(var1.field916 - this.field3454[3] << 48);
               var8[3] = var1.field916;
            }
         }

         class491 var19 = (class491)field3456.method161(var6);
         if (var19 == null) {
            boolean var10 = false;

            int var12;
            for(int var11 = 0; var11 < 12; ++var11) {
               var12 = var8[var11];
               if (var12 >= 256 && var12 < 512 && !class429.method2056(var12 - 256).method1202()) {
                  var10 = true;
               }

               if (var12 >= 512 && !class272.method1294(var12 - 512).method2172(this.field3449)) {
                  var10 = true;
               }
            }

            if (var10) {
               if (-1L != this.field3452) {
                  var19 = (class491)field3456.method161(this.field3452);
               }

               if (null == var19) {
                  return null;
               }
            }

            if (var19 == null) {
               class311[] var21 = new class311[12];
               var12 = 0;

               int var14;
               for(int var13 = 0; var13 < 12; ++var13) {
                  var14 = var8[var13];
                  if (var14 >= 256 && var14 < 512) {
                     class311 var15 = class429.method2056(var14 - 256).method1201();
                     if (null != var15) {
                        var21[var12++] = var15;
                     }
                  }

                  if (var14 >= 512) {
                     class458 var23 = class272.method1294(var14 - 512);
                     class311 var16 = var23.method2173(this.field3449);
                     if (null != var16) {
                        if (null != this.field3453) {
                           class274 var17 = this.field3453[var13];
                           if (var17 != null) {
                              int var18;
                              if (null != var17.field2753 && null != var23.field3803 && var17.field2753.length == var23.field3765.length) {
                                 for(var18 = 0; var18 < var23.field3803.length; ++var18) {
                                    var16.method1499(var23.field3765[var18], var17.field2753[var18]);
                                 }
                              }

                              if (null != var17.field2754 && null != var23.field3766 && var23.field3809.length == var17.field2754.length) {
                                 for(var18 = 0; var18 < var23.field3766.length; ++var18) {
                                    var16.method1500(var23.field3809[var18], var17.field2754[var18]);
                                 }
                              }
                           }
                        }

                        var21[var12++] = var16;
                     }
                  }
               }

               class311 var22 = new class311(var21, var12);

               for(var14 = 0; var14 < 5; ++var14) {
                  if (this.field3447[var14] < class253.field2638[var14].length) {
                     var22.method1499(class235.field2552[var14], class253.field2638[var14][this.field3447[var14]]);
                  }

                  if (this.field3447[var14] < class484.field3993[var14].length) {
                     var22.method1499(class490.field4040[var14], class484.field3993[var14][this.field3447[var14]]);
                  }
               }

               var19 = var22.method1507(64, 850, -30, -50, -30);
               field3456.method163(var19, var6);
               this.field3452 = var6;
            }
         }

         class491 var20;
         if (var1 == null && null == var3) {
            var20 = var19.method2357(true);
         } else if (null != var1 && null != var3) {
            var20 = var1.method432(var19, var2, var3, var4);
         } else if (var1 != null) {
            var20 = var1.method423(var19, var2);
         } else {
            var20 = var3.method423(var19, var4);
         }

         return var20;
      }
   }

   class311 method1907() {
      if (-1 != this.field3446) {
         return class190.method984(this.field3446, (byte)82).method1285((class490)null);
      } else {
         boolean var2 = false;

         int var4;
         for(int var3 = 0; var3 < 12; ++var3) {
            var4 = this.field3454[var3];
            if (var4 >= 256 && var4 < 512 && !class429.method2056(var4 - 256).method1198()) {
               var2 = true;
            }

            if (var4 >= 512 && !class272.method1294(var4 - 512).method2174(this.field3449)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            class311[] var8 = new class311[12];
            var4 = 0;

            int var6;
            for(int var5 = 0; var5 < 12; ++var5) {
               var6 = this.field3454[var5];
               class311 var7;
               if (var6 >= 256 && var6 < 512) {
                  var7 = class429.method2056(var6 - 256).method1199();
                  if (null != var7) {
                     var8[var4++] = var7;
                  }
               }

               if (var6 >= 512) {
                  var7 = class272.method1294(var6 - 512).method2175(this.field3449);
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }
            }

            class311 var9 = new class311(var8, var4);

            for(var6 = 0; var6 < 5; ++var6) {
               if (this.field3447[var6] < class253.field2638[var6].length) {
                  var9.method1499(class235.field2552[var6], class253.field2638[var6][this.field3447[var6]]);
               }

               if (this.field3447[var6] < class484.field3993[var6].length) {
                  var9.method1499(class490.field4040[var6], class484.field3993[var6][this.field3447[var6]]);
               }
            }

            return var9;
         }
      }
   }

   public int method1905() {
      return -1 == this.field3446 ? this.field3454[1] + (this.field3454[8] << 10) + (this.field3454[0] << 15) + (this.field3447[0] << 25) + (this.field3447[4] << 20) + (this.field3454[11] << 5) : 305419896 + class190.method984(this.field3446, (byte)114).field2711;
   }

   static class296 method1909() {
      class296.field2831 = 0;
      return class382.method1814();
   }

   static final void method1904(int var0) {
      class47.method255();
      switch(var0) {
      case 1:
         class442.method2108();
         break;
      case 2:
         class324.method1569(24);
         class20.method113(class96.field1076, class96.field1264, class96.field1265);
      }

   }
}
