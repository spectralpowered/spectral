public final class class378 extends class236 {
   boolean field3315 = false;
   class79 field3318;
   int field3311;
   int field3312;
   int field3313;
   int field3314;
   int field3316;
   int field3317 = 0;
   int field3319 = 0;
   int field3320;

   class378(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field3311 = var1;
      this.field3313 = var2;
      this.field3314 = var3;
      this.field3320 = var4;
      this.field3316 = var5;
      this.field3312 = var6 + var7;
      int var8 = class27.method148(this.field3311).field1999;
      if (var8 != -1) {
         this.field3315 = false;
         this.field3318 = class242.method1218(var8);
      } else {
         this.field3315 = true;
      }

   }

   final void method1805(int var1) {
      if (!this.field3315) {
         this.field3319 += var1;
         if (!this.field3318.method426()) {
            while(this.field3319 > this.field3318.field908[this.field3317]) {
               this.field3319 -= this.field3318.field908[this.field3317];
               ++this.field3317;
               if (this.field3317 >= this.field3318.field914.length) {
                  this.field3315 = true;
                  break;
               }
            }
         } else {
            this.field3317 += var1;
            if (this.field3317 >= this.field3318.method428()) {
               this.field3315 = true;
            }
         }

      }
   }

   protected final class491 method1194() {
      class192 var2 = class27.method148(this.field3311);
      class491 var3;
      if (!this.field3315) {
         var3 = var2.method988(this.field3317);
      } else {
         var3 = var2.method988(-1);
      }

      return var3 == null ? null : var3;
   }

   static class199[] method1806() {
      return new class199[]{class199.field2041, class199.field2040, class199.field2039, class199.field2043};
   }

   static int method1801() {
      if (null != client.field719 && client.field647 < client.field719.size()) {
         int var1 = 0;

         for(int var2 = 0; var2 <= client.field647; ++var2) {
            var1 += ((class97)client.field719.get(var2)).field1341;
         }

         return var1 * 10000 / client.field721;
      } else {
         return 10000;
      }
   }

   static int method1802() {
      return class52.field780;
   }

   static boolean method1804() {
      return (client.field653 & 8) != 0;
   }

   static final int method1803(class210 var0, int var1) {
      if (var0.field2207 != null && var1 < var0.field2207.length) {
         try {
            int[] var3 = var0.field2207[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if (var7 == 0) {
                  return var4;
               }

               if (var7 == 1) {
                  var8 = client.field497[var3[var5++]];
               }

               if (var7 == 2) {
                  var8 = client.field569[var3[var5++]];
               }

               if (var7 == 3) {
                  var8 = client.field570[var3[var5++]];
               }

               int var10;
               class210 var11;
               int var12;
               int var13;
               if (var7 == 4) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class274.method1301(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class272.method1294(var12).field3779 || client.field426)) {
                     for(var13 = 0; var13 < var11.field2209.length; ++var13) {
                        if (var12 + 1 == var11.field2209[var13]) {
                           var8 += var11.field2253[var13];
                        }
                     }
                  }
               }

               if (var7 == 5) {
                  var8 = class484.field3992[var3[var5++]];
               }

               if (var7 == 6) {
                  var8 = class166.field1827[client.field569[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = class484.field3992[var3[var5++]] * 100 / '뜛';
               }

               if (var7 == 8) {
                  var8 = class89.field982.field392;
               }

               if (var7 == 9) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if (class166.field1826[var10]) {
                        var8 += client.field569[var10];
                     }
                  }
               }

               if (var7 == 10) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class274.method1301(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class272.method1294(var12).field3779 || client.field426)) {
                     for(var13 = 0; var13 < var11.field2209.length; ++var13) {
                        if (var11.field2209[var13] == var12 + 1) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var7 == 11) {
                  var8 = client.field546;
               }

               if (var7 == 12) {
                  var8 = client.field605;
               }

               if (var7 == 13) {
                  var10 = class484.field3992[var3[var5++]];
                  int var15 = var3[var5++];
                  var8 = 0 != (var10 & 1 << var15) ? 1 : 0;
               }

               if (var7 == 14) {
                  var10 = var3[var5++];
                  var8 = class274.method1302(var10);
               }

               if (var7 == 15) {
                  var9 = 1;
               }

               if (var7 == 16) {
                  var9 = 2;
               }

               if (var7 == 17) {
                  var9 = 3;
               }

               if (var7 == 18) {
                  var8 = class381.field3325 + (class89.field982.field297 >> 7);
               }

               if (var7 == 19) {
                  var8 = class345.field3166 + (class89.field982.field233 >> 7);
               }

               if (var7 == 20) {
                  var8 = var3[var5++];
               }

               if (var9 == 0) {
                  if (var6 == 0) {
                     var4 += var8;
                  }

                  if (var6 == 1) {
                     var4 -= var8;
                  }

                  if (var6 == 2 && var8 != 0) {
                     var4 /= var8;
                  }

                  if (var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }
}
