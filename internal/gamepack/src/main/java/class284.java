@ObfInfo(
   name = "ko"
)
public class class284 {
   @ObfInfo(
      owner = "ko",
      name = "n",
      desc = "Ljv;"
   )
   static class99 field2354 = new class99(260);
   @ObfInfo(
      owner = "ko",
      name = "o",
      desc = "[I"
   )
   static final int[] field2353 = new int[]{8, 11, 4, 6, 9, 7, 10};
   @ObfInfo(
      owner = "ko",
      name = "u",
      desc = "Z"
   )
   boolean field2346 = false;
   @ObfInfo(
      owner = "ko",
      name = "r",
      desc = "[Lfx;"
   )
   class67[] field2351;
   @ObfInfo(
      owner = "ko",
      name = "e",
      desc = "[I"
   )
   int[] field2345;
   @ObfInfo(
      owner = "ko",
      name = "h",
      desc = "[I"
   )
   int[] field2352;
   @ObfInfo(
      owner = "ko",
      name = "q",
      desc = "J"
   )
   long field2348;
   @ObfInfo(
      owner = "ko",
      name = "f",
      desc = "J"
   )
   long field2350;
   @ObfInfo(
      owner = "ko",
      name = "m",
      desc = "I"
   )
   public int field2344;
   @ObfInfo(
      owner = "ko",
      name = "x",
      desc = "I"
   )
   public int field2347 = 0;
   @ObfInfo(
      owner = "ko",
      name = "v",
      desc = "I"
   )
   public int field2349 = -1;

   @ObfInfo(
      owner = "ko",
      name = "h",
      desc = "([I[Lfx;Z[IIIII)V"
   )
   public void method1405(int[] var1, class67[] var2, boolean var3, int[] var4, int var5, int var6, int var7) {
      this.field2351 = var2;
      this.field2346 = var3;
      this.field2349 = var7;
      this.method1398(var1, var4, var5, var6);
   }

   @ObfInfo(
      owner = "ko",
      name = "e",
      desc = "([I[IIIB)V"
   )
   public void method1398(int[] var1, int[] var2, int var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var6 = 0; var6 < 7; ++var6) {
            for(int var7 = 0; var7 < class329.field2598; ++var7) {
               class164 var8 = class160.method736(var7);
               if (var8 != null && !var8.field1248 && var8.field1241 == var6 + (var3 == 1 ? 7 : 0)) {
                  var1[field2353[var6]] = var7 + 256;
                  break;
               }
            }
         }
      }

      this.field2352 = var1;
      this.field2345 = var2;
      this.field2347 = var3;
      this.field2344 = var4;
      this.method1402();
   }

   @ObfInfo(
      owner = "ko",
      name = "v",
      desc = "(IZB)V"
   )
   public void method1407(int var1, boolean var2) {
      if (var1 != 1 || 1 != this.field2347) {
         int var4 = this.field2352[field2353[var1]];
         if (var4 != 0) {
            var4 -= 256;

            class164 var5;
            do {
               if (!var2) {
                  --var4;
                  if (var4 < 0) {
                     var4 = class329.field2598 - 1;
                  }
               } else {
                  ++var4;
                  if (var4 >= class329.field2598) {
                     var4 = 0;
                  }
               }

               var5 = class160.method736(var4);
            } while(var5 == null || var5.field1248 || var5.field1241 != (this.field2347 == 1 ? 7 : 0) + var1);

            this.field2352[field2353[var1]] = var4 + 256;
            this.method1402();
         }
      }
   }

   @ObfInfo(
      owner = "ko",
      name = "x",
      desc = "(IZI)V"
   )
   public void method1399(int var1, boolean var2) {
      int var4 = this.field2345[var1];
      if (!var2) {
         do {
            --var4;
            if (var4 < 0) {
               var4 = class90.field769[var1].length - 1;
            }
         } while(!class145.method692(var1, var4));
      } else {
         do {
            ++var4;
            if (var4 >= class90.field769[var1].length) {
               var4 = 0;
            }
         } while(!class145.method692(var1, var4));
      }

      this.field2345[var1] = var4;
      this.method1402();
   }

   @ObfInfo(
      owner = "ko",
      name = "m",
      desc = "(II)V"
   )
   public void method1400(int var1) {
      if (this.field2347 != var1) {
         this.method1398((int[])null, this.field2345, var1, -1);
      }
   }

   @ObfInfo(
      owner = "ko",
      name = "q",
      desc = "(Lqy;B)V"
   )
   public void method1401(class127 var1) {
      var1.method544(this.field2347);

      int var3;
      for(var3 = 0; var3 < 7; ++var3) {
         int var4 = this.field2352[field2353[var3]];
         if (var4 == 0) {
            var1.method544(-1);
         } else {
            var1.method544(var4 - 256);
         }
      }

      for(var3 = 0; var3 < 5; ++var3) {
         var1.method544(this.field2345[var3]);
      }

   }

   @ObfInfo(
      owner = "ko",
      name = "f",
      desc = "(S)V"
   )
   void method1402() {
      long var2 = this.field2348;
      int var4 = this.field2352[5];
      int var5 = this.field2352[9];
      this.field2352[5] = var5;
      this.field2352[9] = var4;
      this.field2348 = 0L;

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         this.field2348 <<= 4;
         if (this.field2352[var6] >= 256) {
            this.field2348 += (long)(this.field2352[var6] - 256);
         }
      }

      if (this.field2352[0] >= 256) {
         this.field2348 += (long)(this.field2352[0] - 256 >> 4);
      }

      if (this.field2352[1] >= 256) {
         this.field2348 += (long)(this.field2352[1] - 256 >> 8);
      }

      for(var6 = 0; var6 < 5; ++var6) {
         this.field2348 <<= 3;
         this.field2348 += (long)this.field2345[var6];
      }

      this.field2348 <<= 1;
      this.field2348 += (long)this.field2347;
      this.field2352[5] = var4;
      this.field2352[9] = var5;
      if (var2 != 0L && var2 != this.field2348 || this.field2346) {
         field2354.method393(var2);
      }

   }

   @ObfInfo(
      owner = "ko",
      name = "r",
      desc = "(Lga;ILga;II)Lhh;"
   )
   public class470 method1397(class242 var1, int var2, class242 var3, int var4) {
      if (this.field2344 != -1) {
         return class421.method2049(this.field2344, (byte)119).method2066(var1, var2, var3, var4, (class207)null);
      } else {
         long var6 = this.field2348;
         int[] var8 = this.field2352;
         if (var1 != null && (var1.field2044 >= 0 || var1.field2045 >= 0)) {
            var8 = new int[12];

            for(int var9 = 0; var9 < 12; ++var9) {
               var8[var9] = this.field2352[var9];
            }

            if (var1.field2044 >= 0) {
               var6 += (long)(var1.field2044 - this.field2352[5] << 40);
               var8[5] = var1.field2044;
            }

            if (var1.field2045 >= 0) {
               var6 += (long)(var1.field2045 - this.field2352[3] << 48);
               var8[3] = var1.field2045;
            }
         }

         class470 var19 = (class470)field2354.method394(var6);
         if (var19 == null) {
            boolean var10 = false;

            int var12;
            for(int var11 = 0; var11 < 12; ++var11) {
               var12 = var8[var11];
               if (var12 >= 256 && var12 < 512 && !class160.method736(var12 - 256).method770()) {
                  var10 = true;
               }

               if (var12 >= 512 && !class423.method2062(var12 - 512).method1203(this.field2347)) {
                  var10 = true;
               }
            }

            if (var10) {
               if (-1L != this.field2350) {
                  var19 = (class470)field2354.method394(this.field2350);
               }

               if (null == var19) {
                  return null;
               }
            }

            if (var19 == null) {
               class26[] var21 = new class26[12];
               var12 = 0;

               int var14;
               for(int var13 = 0; var13 < 12; ++var13) {
                  var14 = var8[var13];
                  if (var14 >= 256 && var14 < 512) {
                     class26 var15 = class160.method736(var14 - 256).method769();
                     if (null != var15) {
                        var21[var12++] = var15;
                     }
                  }

                  if (var14 >= 512) {
                     class263 var23 = class423.method2062(var14 - 512);
                     class26 var16 = var23.method1204(this.field2347);
                     if (null != var16) {
                        if (null != this.field2351) {
                           class67 var17 = this.field2351[var13];
                           if (var17 != null) {
                              int var18;
                              if (null != var17.field625 && null != var23.field2186 && var17.field625.length == var23.field2148.length) {
                                 for(var18 = 0; var18 < var23.field2186.length; ++var18) {
                                    var16.method113(var23.field2148[var18], var17.field625[var18]);
                                 }
                              }

                              if (null != var17.field626 && null != var23.field2149 && var23.field2192.length == var17.field626.length) {
                                 for(var18 = 0; var18 < var23.field2149.length; ++var18) {
                                    var16.method114(var23.field2192[var18], var17.field626[var18]);
                                 }
                              }
                           }
                        }

                        var21[var12++] = var16;
                     }
                  }
               }

               class26 var22 = new class26(var21, var12);

               for(var14 = 0; var14 < 5; ++var14) {
                  if (this.field2345[var14] < class90.field769[var14].length) {
                     var22.method113(class112.field840[var14], class90.field769[var14][this.field2345[var14]]);
                  }

                  if (this.field2345[var14] < class291.field2374[var14].length) {
                     var22.method113(class207.field1786[var14], class291.field2374[var14][this.field2345[var14]]);
                  }
               }

               var19 = var22.method121(64, 850, -30, -50, -30);
               field2354.method396(var19, var6);
               this.field2350 = var6;
            }
         }

         class470 var20;
         if (var1 == null && null == var3) {
            var20 = var19.method2298(true);
         } else if (null != var1 && null != var3) {
            var20 = var1.method1062(var19, var2, var3, var4);
         } else if (var1 != null) {
            var20 = var1.method1053(var19, var2);
         } else {
            var20 = var3.method1053(var19, var4);
         }

         return var20;
      }
   }

   @ObfInfo(
      owner = "ko",
      name = "u",
      desc = "(B)Lgi;"
   )
   class26 method1406() {
      if (-1 != this.field2344) {
         return class421.method2049(this.field2344, (byte)82).method2053((class207)null);
      } else {
         boolean var2 = false;

         int var4;
         for(int var3 = 0; var3 < 12; ++var3) {
            var4 = this.field2352[var3];
            if (var4 >= 256 && var4 < 512 && !class160.method736(var4 - 256).method766()) {
               var2 = true;
            }

            if (var4 >= 512 && !class423.method2062(var4 - 512).method1205(this.field2347)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            class26[] var8 = new class26[12];
            var4 = 0;

            int var6;
            for(int var5 = 0; var5 < 12; ++var5) {
               var6 = this.field2352[var5];
               class26 var7;
               if (var6 >= 256 && var6 < 512) {
                  var7 = class160.method736(var6 - 256).method767();
                  if (null != var7) {
                     var8[var4++] = var7;
                  }
               }

               if (var6 >= 512) {
                  var7 = class423.method2062(var6 - 512).method1206(this.field2347);
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }
            }

            class26 var9 = new class26(var8, var4);

            for(var6 = 0; var6 < 5; ++var6) {
               if (this.field2345[var6] < class90.field769[var6].length) {
                  var9.method113(class112.field840[var6], class90.field769[var6][this.field2345[var6]]);
               }

               if (this.field2345[var6] < class291.field2374[var6].length) {
                  var9.method113(class207.field1786[var6], class291.field2374[var6][this.field2345[var6]]);
               }
            }

            return var9;
         }
      }
   }

   @ObfInfo(
      owner = "ko",
      name = "b",
      desc = "(I)I"
   )
   public int method1404() {
      return -1 == this.field2344 ? this.field2352[1] + (this.field2352[8] << 10) + (this.field2352[0] << 15) + (this.field2345[0] << 25) + (this.field2345[4] << 20) + (this.field2352[11] << 5) : 305419896 + class421.method2049(this.field2344, (byte)114).field3461;
   }

   @ObfInfo(
      owner = "ko",
      name = "r",
      desc = "(I)Lbz;"
   )
   static class2 method1408() {
      class2.field9 = 0;
      return class345.method1752();
   }

   @ObfInfo(
      owner = "ko",
      name = "ga",
      desc = "(II)V"
   )
   static final void method1403(int var0) {
      class380.method1887();
      switch(var0) {
      case 1:
         class330.method1672();
         break;
      case 2:
         class286.method1419(24);
         class300.method1452(class177.field1381, class177.field1569, class177.field1570);
      }

   }
}
