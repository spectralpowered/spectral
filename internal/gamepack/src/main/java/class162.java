@ObfInfo(
   name = "rj"
)
public class class162 extends class195 {
   @ObfInfo(
      owner = "rj",
      name = "am",
      desc = "I"
   )
   public static int field1231;
   @ObfInfo(
      owner = "rj",
      name = "ao",
      desc = "I"
   )
   public static int field1232;
   @ObfInfo(
      owner = "rj",
      name = "av",
      desc = "I"
   )
   public static int field1234 = 0;
   @ObfInfo(
      owner = "rj",
      name = "au",
      desc = "I"
   )
   public static int field1235 = 0;
   @ObfInfo(
      owner = "rj",
      name = "ar",
      desc = "I"
   )
   public static int field1236 = 0;
   @ObfInfo(
      owner = "rj",
      name = "at",
      desc = "I"
   )
   public static int field1237 = 0;
   @ObfInfo(
      owner = "rj",
      name = "ad",
      desc = "[I"
   )
   public static int[] field1233;

   @ObfInfo(
      owner = "rj",
      name = "cr",
      desc = "([III)V"
   )
   public static void method748(int[] var0, int var1, int var2) {
      field1233 = var0;
      field1232 = var1;
      field1231 = var2;
      method742(0, 0, var1, var2);
   }

   @ObfInfo(
      owner = "rj",
      name = "cd",
      desc = "()V"
   )
   public static void method758() {
      field1236 = 0;
      field1234 = 0;
      field1237 = field1232;
      field1235 = field1231;
   }

   @ObfInfo(
      owner = "rj",
      name = "ck",
      desc = "(IIII)V"
   )
   public static void method742(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > field1232) {
         var2 = field1232;
      }

      if (var3 > field1231) {
         var3 = field1231;
      }

      field1236 = var0;
      field1234 = var1;
      field1237 = var2;
      field1235 = var3;
   }

   @ObfInfo(
      owner = "rj",
      name = "ci",
      desc = "(IIII)V"
   )
   public static void method743(int var0, int var1, int var2, int var3) {
      if (field1236 < var0) {
         field1236 = var0;
      }

      if (field1234 < var1) {
         field1234 = var1;
      }

      if (field1237 > var2) {
         field1237 = var2;
      }

      if (field1235 > var3) {
         field1235 = var3;
      }

   }

   @ObfInfo(
      owner = "rj",
      name = "dh",
      desc = "([I)V"
   )
   public static void method744(int[] var0) {
      var0[0] = field1236;
      var0[1] = field1234;
      var0[2] = field1237;
      var0[3] = field1235;
   }

   @ObfInfo(
      owner = "rj",
      name = "dn",
      desc = "([I)V"
   )
   public static void method745(int[] var0) {
      field1236 = var0[0];
      field1234 = var0[1];
      field1237 = var0[2];
      field1235 = var0[3];
   }

   @ObfInfo(
      owner = "rj",
      name = "da",
      desc = "()V"
   )
   public static void method746() {
      int var0 = 0;

      int var1;
      for(var1 = field1232 * field1231 - 7; var0 < var1; field1233[var0++] = 0) {
         field1233[var0++] = 0;
         field1233[var0++] = 0;
         field1233[var0++] = 0;
         field1233[var0++] = 0;
         field1233[var0++] = 0;
         field1233[var0++] = 0;
         field1233[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field1233[var0++] = 0) {
         ;
      }

   }

   @ObfInfo(
      owner = "rj",
      name = "de",
      desc = "(IIII)V"
   )
   static void method747(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         method761(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < field1234) {
            var4 = field1234;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > field1235) {
            var5 = field1235;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if (var12 < field1236) {
               var12 = field1236;
            }

            var13 = var0 + var8;
            if (var13 > field1237) {
               var13 = field1237;
            }

            var14 = var12 + var6 * field1232;

            for(var15 = var12; var15 < var13; ++var15) {
               field1233[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if (var12 < field1236) {
               var12 = field1236;
            }

            var13 = var0 + var8;
            if (var13 > field1237 - 1) {
               var13 = field1237 - 1;
            }

            var14 = var12 + var6 * field1232;

            for(var15 = var12; var15 <= var13; ++var15) {
               field1233[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   @ObfInfo(
      owner = "rj",
      name = "dl",
      desc = "(IIIII)V"
   )
   public static void method740(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            method747(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < field1234) {
               var12 = field1234;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > field1235) {
               var13 = field1235;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < field1236) {
                  var20 = field1236;
               }

               var21 = var0 + var16;
               if (var21 > field1237) {
                  var21 = field1237;
               }

               var22 = var20 + var14 * field1232;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (field1233[var22] >> 16 & 255) * var5;
                  var10 = (field1233[var22] >> 8 & 255) * var5;
                  var11 = (field1233[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  field1233[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < field1236) {
                  var20 = field1236;
               }

               var21 = var0 + var16;
               if (var21 > field1237 - 1) {
                  var21 = field1237 - 1;
               }

               var22 = var20 + var14 * field1232;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (field1233[var22] >> 16 & 255) * var5;
                  var10 = (field1233[var22] >> 8 & 255) * var5;
                  var11 = (field1233[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  field1233[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   @ObfInfo(
      owner = "rj",
      name = "dw",
      desc = "(IIIIII)V"
   )
   public static void method762(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < field1236) {
         var2 -= field1236 - var0;
         var0 = field1236;
      }

      if (var1 < field1234) {
         var3 -= field1234 - var1;
         var1 = field1234;
      }

      if (var0 + var2 > field1237) {
         var2 = field1237 - var0;
      }

      if (var1 + var3 > field1235) {
         var3 = field1235 - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = field1232 - var2;
      int var8 = var0 + var1 * field1232;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field1233[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            field1233[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   @ObfInfo(
      owner = "rj",
      name = "dm",
      desc = "(IIIII)V"
   )
   public static void method749(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < field1236) {
         var2 -= field1236 - var0;
         var0 = field1236;
      }

      if (var1 < field1234) {
         var3 -= field1234 - var1;
         var1 = field1234;
      }

      if (var0 + var2 > field1237) {
         var2 = field1237 - var0;
      }

      if (var1 + var3 > field1235) {
         var3 = field1235 - var1;
      }

      int var5 = field1232 - var2;
      int var6 = var0 + var1 * field1232;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field1233[var6++] = var4;
         }

         var6 += var5;
      }

   }

   @ObfInfo(
      owner = "rj",
      name = "dv",
      desc = "(IIIIII)V"
   )
   public static void method750(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < field1236) {
            var2 -= field1236 - var0;
            var0 = field1236;
         }

         if (var1 < field1234) {
            var6 += (field1234 - var1) * var7;
            var3 -= field1234 - var1;
            var1 = field1234;
         }

         if (var0 + var2 > field1237) {
            var2 = field1237 - var0;
         }

         if (var1 + var3 > field1235) {
            var3 = field1235 - var1;
         }

         int var8 = field1232 - var2;
         int var9 = var0 + var1 * field1232;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field1233[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   @ObfInfo(
      owner = "rj",
      name = "ds",
      desc = "(IIIIIIII)V"
   )
   public static void method751(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < field1236) {
            var2 -= field1236 - var0;
            var0 = field1236;
         }

         if (var1 < field1234) {
            var8 += (field1234 - var1) * var9;
            var3 -= field1234 - var1;
            var1 = field1234;
         }

         if (var0 + var2 > field1237) {
            var2 = field1237 - var0;
         }

         if (var1 + var3 > field1235) {
            var3 = field1235 - var1;
         }

         int var10 = field1232 - var2;
         int var11 = var0 + var1 * field1232;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += field1232;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = field1233[var11];
                  if (var20 == 0) {
                     field1233[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     field1233[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   @ObfInfo(
      owner = "rj",
      name = "dc",
      desc = "(IIIIII[BIZ)V"
   )
   public static void method757(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < field1232 && var1 < field1231) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > field1232) {
               var2 = field1232 - var0;
            }

            if (var1 + var3 > field1231) {
               var3 = field1231 - var1;
            }

            int var11 = var6.length / var7;
            int var12 = field1232 - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var8 && (var13 != 255 || var14 != 255)) {
               var15 = (var1 + var10) * field1232 + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = field1233[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     field1233[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * field1232 + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        field1233[var15++] = var5;
                     } else {
                        field1233[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   @ObfInfo(
      owner = "rj",
      name = "dk",
      desc = "(IIIII)V"
   )
   public static void method741(int var0, int var1, int var2, int var3, int var4) {
      method752(var0, var1, var2, var4);
      method752(var0, var1 + var3 - 1, var2, var4);
      method753(var0, var1, var3, var4);
      method753(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfInfo(
      owner = "rj",
      name = "df",
      desc = "(IIIIII)V"
   )
   public static void method756(int var0, int var1, int var2, int var3, int var4, int var5) {
      method760(var0, var1, var2, var4, var5);
      method760(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method754(var0, var1 + 1, var3 - 2, var4, var5);
         method754(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   @ObfInfo(
      owner = "rj",
      name = "dy",
      desc = "(IIII)V"
   )
   public static void method752(int var0, int var1, int var2, int var3) {
      if (var1 >= field1234 && var1 < field1235) {
         if (var0 < field1236) {
            var2 -= field1236 - var0;
            var0 = field1236;
         }

         if (var0 + var2 > field1237) {
            var2 = field1237 - var0;
         }

         int var4 = var0 + var1 * field1232;

         for(int var5 = 0; var5 < var2; ++var5) {
            field1233[var4 + var5] = var3;
         }

      }
   }

   @ObfInfo(
      owner = "rj",
      name = "dx",
      desc = "(IIIII)V"
   )
   static void method760(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field1234 && var1 < field1235) {
         if (var0 < field1236) {
            var2 -= field1236 - var0;
            var0 = field1236;
         }

         if (var0 + var2 > field1237) {
            var2 = field1237 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field1232;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field1233[var12] >> 16 & 255) * var5;
            int var10 = (field1233[var12] >> 8 & 255) * var5;
            int var11 = (field1233[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field1233[var12++] = var14;
         }

      }
   }

   @ObfInfo(
      owner = "rj",
      name = "dr",
      desc = "(IIII)V"
   )
   public static void method753(int var0, int var1, int var2, int var3) {
      if (var0 >= field1236 && var0 < field1237) {
         if (var1 < field1234) {
            var2 -= field1234 - var1;
            var1 = field1234;
         }

         if (var1 + var2 > field1235) {
            var2 = field1235 - var1;
         }

         int var4 = var0 + var1 * field1232;

         for(int var5 = 0; var5 < var2; ++var5) {
            field1233[var4 + var5 * field1232] = var3;
         }

      }
   }

   @ObfInfo(
      owner = "rj",
      name = "dd",
      desc = "(IIIII)V"
   )
   static void method754(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field1236 && var0 < field1237) {
         if (var1 < field1234) {
            var2 -= field1234 - var1;
            var1 = field1234;
         }

         if (var1 + var2 > field1235) {
            var2 = field1235 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field1232;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field1233[var12] >> 16 & 255) * var5;
            int var10 = (field1233[var12] >> 8 & 255) * var5;
            int var11 = (field1233[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field1233[var12] = var14;
            var12 += field1232;
         }

      }
   }

   @ObfInfo(
      owner = "rj",
      name = "dg",
      desc = "(IIIII)V"
   )
   public static void method759(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            method752(var0, var1, var2 + 1, var4);
         } else {
            method752(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            method753(var0, var1, var3 + 1, var4);
         } else {
            method753(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if (var0 < field1236) {
               var1 += var5 * (field1236 - var0);
               var0 = field1236;
            }

            if (var2 >= field1237) {
               var2 = field1237 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= field1234 && var6 < field1235) {
                  field1233[var0 + var6 * field1232] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < field1234) {
               var0 += var5 * (field1234 - var1);
               var1 = field1234;
            }

            if (var3 >= field1235) {
               var3 = field1235 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= field1236 && var6 < field1237) {
                  field1233[var6 + var1 * field1232] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   @ObfInfo(
      owner = "rj",
      name = "dq",
      desc = "(III)V"
   )
   static void method761(int var0, int var1, int var2) {
      if (var0 >= field1236 && var1 >= field1234 && var0 < field1237 && var1 < field1235) {
         field1233[var0 + var1 * field1232] = var2;
      }
   }

   @ObfInfo(
      owner = "rj",
      name = "db",
      desc = "(III[I[I)V"
   )
   public static void method755(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field1232;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field1233[var6++] = var2;
         }

         var5 += field1232;
      }

   }
}
