@ObfInfo(
   name = "du"
)
public class class84 {
   @ObfInfo(
      owner = "du",
      name = "ir",
      desc = "I"
   )
   static int field697;
   @ObfInfo(
      owner = "du",
      name = "e",
      desc = "Z"
   )
   boolean field675;
   @ObfInfo(
      owner = "du",
      name = "h",
      desc = "Z"
   )
   boolean field684;
   @ObfInfo(
      owner = "du",
      name = "a",
      desc = "Z"
   )
   boolean field690 = true;
   @ObfInfo(
      owner = "du",
      name = "q",
      desc = "Z"
   )
   boolean field694;
   @ObfInfo(
      owner = "du",
      name = "m",
      desc = "[Ldq;"
   )
   class293[] field678;
   @ObfInfo(
      owner = "du",
      name = "v",
      desc = "Ldp;"
   )
   class301 field676;
   @ObfInfo(
      owner = "du",
      name = "x",
      desc = "Ldp;"
   )
   class301 field677;
   @ObfInfo(
      owner = "du",
      name = "j",
      desc = "F"
   )
   float field674;
   @ObfInfo(
      owner = "du",
      name = "f",
      desc = "F"
   )
   float field680;
   @ObfInfo(
      owner = "du",
      name = "r",
      desc = "F"
   )
   float field681;
   @ObfInfo(
      owner = "du",
      name = "u",
      desc = "F"
   )
   float field682;
   @ObfInfo(
      owner = "du",
      name = "g",
      desc = "F"
   )
   float field685;
   @ObfInfo(
      owner = "du",
      name = "i",
      desc = "F"
   )
   float field686;
   @ObfInfo(
      owner = "du",
      name = "o",
      desc = "F"
   )
   float field687;
   @ObfInfo(
      owner = "du",
      name = "n",
      desc = "F"
   )
   float field688;
   @ObfInfo(
      owner = "du",
      name = "k",
      desc = "F"
   )
   float field689;
   @ObfInfo(
      owner = "du",
      name = "d",
      desc = "F"
   )
   float field691;
   @ObfInfo(
      owner = "du",
      name = "p",
      desc = "F"
   )
   float field695;
   @ObfInfo(
      owner = "du",
      name = "b",
      desc = "F"
   )
   float field696;
   @ObfInfo(
      owner = "du",
      name = "l",
      desc = "[F"
   )
   float[] field683;
   @ObfInfo(
      owner = "du",
      name = "t",
      desc = "I"
   )
   int field679;
   @ObfInfo(
      owner = "du",
      name = "c",
      desc = "I"
   )
   int field692;
   @ObfInfo(
      owner = "du",
      name = "s",
      desc = "I"
   )
   int field693 = 0;

   @ObfInfo(
      owner = "du",
      name = "h",
      desc = "(Lqy;II)I"
   )
   int method343(class127 var1, int var2) {
      int var4 = var1.method549();
      class34.method144(var1.method547());
      int var6 = var1.method547();
      class301 var7 = (class301)class2.method10(class491.method2426(), var6);
      if (var7 == null) {
         var7 = class301.field2418;
      }

      this.field676 = var7;
      int var8 = var1.method547();
      class301 var9 = (class301)class2.method10(class491.method2426(), var8);
      if (null == var9) {
         var9 = class301.field2418;
      }

      this.field677 = var9;
      this.field684 = var1.method547() != 0;
      this.field678 = new class293[var4];
      class293 var12 = null;

      int var10;
      for(var10 = 0; var10 < var4; ++var10) {
         class293 var11 = new class293();
         var11.method1435(var1, var2);
         this.field678[var10] = var11;
         if (null != var12) {
            var12.field2382 = var11;
         }

         var12 = var11;
      }

      this.field679 = this.field678[0].field2383;
      this.field692 = this.field678[this.method347() - 1].field2383;
      this.field683 = new float[this.method344() + 1];

      for(var10 = this.method346(); var10 <= this.method342(); ++var10) {
         this.field683[var10 - this.method346()] = class179.method813(this, (float)var10);
      }

      this.field678 = null;
      this.field695 = class179.method813(this, (float)(this.method346() - 1));
      this.field691 = class179.method813(this, (float)(this.method342() + 1));
      return var4;
   }

   @ObfInfo(
      owner = "du",
      name = "e",
      desc = "(IB)F"
   )
   public float method349(int var1) {
      if (var1 < this.method346()) {
         return this.field695;
      } else {
         return var1 > this.method342() ? this.field691 : this.field683[var1 - this.method346()];
      }
   }

   @ObfInfo(
      owner = "du",
      name = "v",
      desc = "(B)I"
   )
   int method346() {
      return this.field679;
   }

   @ObfInfo(
      owner = "du",
      name = "x",
      desc = "(I)I"
   )
   int method342() {
      return this.field692;
   }

   @ObfInfo(
      owner = "du",
      name = "m",
      desc = "(I)I"
   )
   int method344() {
      return this.method342() - this.method346();
   }

   @ObfInfo(
      owner = "du",
      name = "q",
      desc = "(FI)I"
   )
   int method345(float var1) {
      if (this.field693 < 0 || (float)this.field678[this.field693].field2383 > var1 || null != this.field678[this.field693].field2382 && (float)this.field678[this.field693].field2382.field2383 <= var1) {
         if (var1 >= (float)this.method346() && var1 <= (float)this.method342()) {
            int var3 = this.method347();
            int var4 = this.field693;
            if (var3 > 0) {
               int var5 = 0;
               int var6 = var3 - 1;

               do {
                  int var7 = var6 + var5 >> 1;
                  if (var1 < (float)this.field678[var7].field2383) {
                     if (var1 > (float)this.field678[var7 - 1].field2383) {
                        var4 = var7 - 1;
                        break;
                     }

                     var6 = var7 - 1;
                  } else {
                     if (var1 <= (float)this.field678[var7].field2383) {
                        var4 = var7;
                        break;
                     }

                     if (var1 < (float)this.field678[var7 + 1].field2383) {
                        var4 = var7;
                        break;
                     }

                     var5 = var7 + 1;
                  }
               } while(var5 <= var6);
            }

            if (this.field693 != var4) {
               this.field693 = var4;
               this.field690 = true;
            }

            return this.field693;
         } else {
            return -1;
         }
      } else {
         return this.field693;
      }
   }

   @ObfInfo(
      owner = "du",
      name = "f",
      desc = "(FI)Ldq;"
   )
   class293 method348(float var1) {
      int var3 = this.method345(var1);
      return var3 >= 0 && var3 < this.field678.length ? this.field678[var3] : null;
   }

   @ObfInfo(
      owner = "du",
      name = "r",
      desc = "(I)I"
   )
   int method347() {
      return this.field678 == null ? 0 : this.field678.length;
   }

   @ObfInfo(
      owner = "du",
      name = "v",
      desc = "(Lly;III)Lrx;"
   )
   public static class266 method341(class274 var0, int var1, int var2) {
      byte[] var5 = var0.method1365(var1, var2);
      boolean var4;
      if (var5 == null) {
         var4 = false;
      } else {
         class85.method354(var5);
         var4 = true;
      }

      return !var4 ? null : class37.method149();
   }

   @ObfInfo(
      owner = "du",
      name = "e",
      desc = "(Lcb;III)V"
   )
   static void method350(class488 var0, int var1, int var2) {
      Object[] var4 = var0.field4069;
      class461 var5;
      int var26;
      if (class161.method739(var0.field4075)) {
         class375.field3181 = (class413)var4[0];
         class396 var6 = class25.method100(class375.field3181.field3420);
         var5 = class74.method327(var0.field4075, var6.field3315, var6.field3334);
      } else {
         var26 = ((Integer)var4[0]).intValue();
         var5 = class457.method2259(var26);
      }

      if (null != var5) {
         class161.field1227 = 0;
         class386.field3250 = 0;
         var26 = -1;
         int[] var7 = var5.field3816;
         int[] var8 = var5.field3817;
         byte var9 = -1;
         class386.field3251 = 0;
         class386.field3253 = false;
         boolean var10 = false;
         int var11 = 0;
         boolean var23 = false;

         label873: {
            label874: {
               try {
                  int var14;
                  try {
                     var23 = true;
                     class386.field3257 = new int[var5.field3818];
                     int var12 = 0;
                     class4.field26 = new String[var5.field3820];
                     int var29 = 0;

                     int var15;
                     String var39;
                     for(var14 = 1; var14 < var4.length; ++var14) {
                        if (var4[var14] instanceof Integer) {
                           var15 = ((Integer)var4[var14]).intValue();
                           if (var15 == -2147483647) {
                              var15 = var0.field4065;
                           }

                           if (var15 == -2147483646) {
                              var15 = var0.field4071;
                           }

                           if (var15 == -2147483645) {
                              var15 = null != var0.field4067 ? var0.field4067.field985 : -1;
                           }

                           if (var15 == -2147483644) {
                              var15 = var0.field4070;
                           }

                           if (var15 == -2147483643) {
                              var15 = null != var0.field4067 ? -915599827 * var0.field4067.field895 * 1271165349 : -1;
                           }

                           if (var15 == -2147483642) {
                              var15 = var0.field4077 != null ? var0.field4077.field985 : -1;
                           }

                           if (var15 == -2147483641) {
                              var15 = var0.field4077 != null ? var0.field4077.field895 : -1;
                           }

                           if (var15 == -2147483640) {
                              var15 = var0.field4068;
                           }

                           if (var15 == -2147483639) {
                              var15 = var0.field4072;
                           }

                           class386.field3257[var12++] = var15;
                        } else if (var4[var14] instanceof String) {
                           var39 = (String)var4[var14];
                           if (var39.equals("event_opbase")) {
                              var39 = var0.field4073;
                           }

                           class4.field26[var29++] = var39;
                        }
                     }

                     class386.field3259 = var0.field4074;

                     while(true) {
                        ++var11;
                        if (var11 > var1) {
                           throw new RuntimeException();
                        }

                        ++var26;
                        int var27 = var7[var26];
                        if (var27 >= 100) {
                           boolean var38;
                           if (var5.field3817[var26] == 1) {
                              var38 = true;
                           } else {
                              var38 = false;
                           }

                           var15 = class63.method294(var27, var5, var38);
                           switch(var15) {
                           case 0:
                              var23 = false;
                              break label873;
                           case 1:
                           default:
                              break;
                           case 2:
                              throw new IllegalStateException();
                           }
                        } else if (var27 == 0) {
                           class386.field3248[++class161.field1227 - 1] = var8[var26];
                        } else if (var27 == 1) {
                           var14 = var8[var26];
                           class386.field3248[++class161.field1227 - 1] = class291.field2373[var14];
                        } else if (var27 == 2) {
                           var14 = var8[var26];
                           class291.field2373[var14] = class386.field3248[--class161.field1227];
                           class238.method1033(var14);
                        } else if (var27 == 3) {
                           class386.field3249[++class386.field3250 - 1] = var5.field3822[var26];
                        } else if (var27 == 6) {
                           var26 += var8[var26];
                        } else if (var27 == 7) {
                           class161.field1227 -= 2;
                           if (class386.field3248[1 + class161.field1227] != class386.field3248[class161.field1227]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 8) {
                           class161.field1227 -= 2;
                           if (class386.field3248[class161.field1227] == class386.field3248[class161.field1227 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 9) {
                           class161.field1227 -= 2;
                           if (class386.field3248[class161.field1227] < class386.field3248[class161.field1227 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 10) {
                           class161.field1227 -= 2;
                           if (class386.field3248[class161.field1227] > class386.field3248[class161.field1227 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 21) {
                           if (0 == class386.field3251) {
                              var23 = false;
                              break;
                           }

                           class241 var37 = class386.field3252[--class386.field3251];
                           var5 = var37.field2024;
                           var7 = var5.field3816;
                           var8 = var5.field3817;
                           var26 = var37.field2023;
                           class386.field3257 = var37.field2022;
                           class4.field26 = var37.field2025;
                        } else if (var27 == 25) {
                           var14 = var8[var26];
                           class386.field3248[++class161.field1227 - 1] = class67.method300(var14);
                        } else if (var27 == 27) {
                           var14 = var8[var26];
                           class359.method1789(var14, class386.field3248[--class161.field1227]);
                        } else if (var27 == 31) {
                           class161.field1227 -= 2;
                           if (class386.field3248[class161.field1227] <= class386.field3248[1 + class161.field1227]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 32) {
                           class161.field1227 -= 2;
                           if (class386.field3248[class161.field1227] >= class386.field3248[class161.field1227 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 33) {
                           class386.field3248[++class161.field1227 - 1] = class386.field3257[var8[var26]];
                        } else if (var27 == 34) {
                           class386.field3257[var8[var26]] = class386.field3248[--class161.field1227];
                        } else if (var27 == 35) {
                           class386.field3249[++class386.field3250 - 1] = class4.field26[var8[var26]];
                        } else if (var27 == 36) {
                           class4.field26[var8[var26]] = class386.field3249[--class386.field3250];
                        } else if (var27 == 37) {
                           var14 = var8[var26];
                           class386.field3250 -= var14;
                           var39 = class438.method2175(class386.field3249, class386.field3250, var14);
                           class386.field3249[++class386.field3250 - 1] = var39;
                        } else if (var27 == 38) {
                           --class161.field1227;
                        } else if (var27 == 39) {
                           --class386.field3250;
                        } else {
                           int var18;
                           if (var27 != 40) {
                              if (var27 == 42) {
                                 class386.field3248[++class161.field1227 - 1] = class46.field560.method974(var8[var26]);
                              } else if (var27 == 43) {
                                 class46.field560.method965(var8[var26], class386.field3248[--class161.field1227]);
                              } else if (var27 == 44) {
                                 var14 = var8[var26] >> 16;
                                 var15 = var8[var26] & '\uffff';
                                 int var30 = class386.field3248[--class161.field1227];
                                 if (var30 < 0 || var30 > 5000) {
                                    throw new RuntimeException();
                                 }

                                 class386.field3246[var14] = var30;
                                 byte var33 = -1;
                                 if (var15 == 105) {
                                    var33 = 0;
                                 }

                                 for(var18 = 0; var18 < var30; ++var18) {
                                    class386.field3247[var14][var18] = var33;
                                 }
                              } else if (var27 == 45) {
                                 var14 = var8[var26];
                                 var15 = class386.field3248[--class161.field1227];
                                 if (var15 < 0 || var15 >= class386.field3246[var14]) {
                                    throw new RuntimeException();
                                 }

                                 class386.field3248[++class161.field1227 - 1] = class386.field3247[var14][var15];
                              } else if (var27 == 46) {
                                 var14 = var8[var26];
                                 class161.field1227 -= 2;
                                 var15 = class386.field3248[class161.field1227];
                                 if (var15 < 0 || var15 >= class386.field3246[var14]) {
                                    throw new RuntimeException();
                                 }

                                 class386.field3247[var14][var15] = class386.field3248[class161.field1227 + 1];
                              } else {
                                 String var31;
                                 if (var27 == 47) {
                                    var31 = class46.field560.method969(var8[var26]);
                                    if (null == var31) {
                                       var31 = class177.field1325;
                                    }

                                    class386.field3249[++class386.field3250 - 1] = var31;
                                 } else if (var27 == 48) {
                                    class46.field560.method968(var8[var26], class386.field3249[--class386.field3250]);
                                 } else if (var27 == 49) {
                                    var31 = class46.field560.method967(var8[var26]);
                                    class386.field3249[++class386.field3250 - 1] = var31;
                                 } else if (var27 == 50) {
                                    class46.field560.method966(var8[var26], class386.field3249[--class386.field3250]);
                                 } else if (var27 == 60) {
                                    class385 var34 = var5.field3823[var8[var26]];
                                    class245 var42 = (class245)var34.method1897((long)class386.field3248[--class161.field1227]);
                                    if (null != var42) {
                                       var26 += var42.field2057;
                                    }
                                 } else {
                                    Integer var35;
                                    if (var27 == 74) {
                                       var35 = class223.field1922.method2103(var8[var26]);
                                       if (null == var35) {
                                          class386.field3248[++class161.field1227 - 1] = -1;
                                       } else {
                                          class386.field3248[++class161.field1227 - 1] = var35.intValue();
                                       }
                                    } else {
                                       if (var27 != 76) {
                                          throw new IllegalStateException();
                                       }

                                       var35 = class397.field3352.method439(var8[var26]);
                                       if (var35 == null) {
                                          class386.field3248[++class161.field1227 - 1] = -1;
                                       } else {
                                          class386.field3248[++class161.field1227 - 1] = var35.intValue();
                                       }
                                    }
                                 }
                              }
                           } else {
                              var14 = var8[var26];
                              class461 var41 = class457.method2259(var14);
                              int[] var16 = new int[var41.field3818];
                              String[] var17 = new String[var41.field3820];

                              for(var18 = 0; var18 < var41.field3824; ++var18) {
                                 var16[var18] = class386.field3248[var18 + (class161.field1227 - var41.field3824)];
                              }

                              for(var18 = 0; var18 < var41.field3819; ++var18) {
                                 var17[var18] = class386.field3249[var18 + (class386.field3250 - var41.field3819)];
                              }

                              class161.field1227 -= var41.field3824;
                              class386.field3250 -= var41.field3819;
                              class241 var36 = new class241();
                              var36.field2024 = var5;
                              var36.field2023 = var26;
                              var36.field2022 = class386.field3257;
                              var36.field2025 = class4.field26;
                              class386.field3252[++class386.field3251 - 1] = var36;
                              var5 = var41;
                              var7 = var41.field3816;
                              var8 = var41.field3817;
                              var26 = -1;
                              class386.field3257 = var16;
                              class4.field26 = var17;
                           }
                        }
                     }
                  } catch (Exception var24) {
                     var10 = true;
                     StringBuilder var13 = new StringBuilder(30);
                     var13.append("").append(var5.field1134).append(" ");

                     for(var14 = class386.field3251 - 1; var14 >= 0; --var14) {
                        var13.append("").append(class386.field3252[var14].field2024.field1134).append(" ");
                     }

                     var13.append("").append(var9);
                     class445.method2199(var13.toString(), var24);
                     var23 = false;
                     break label874;
                  }
               } finally {
                  if (var23) {
                     while(class386.field3255.size() > 0) {
                        class122 var20 = (class122)class386.field3255.remove(0);
                        class119.method473(var20.method517(), var20.method518(), var20.method519(), var20.method520(), "");
                     }

                     if (class386.field3253) {
                        class386.field3253 = false;
                        class212.method918();
                     }

                     if (!var10 && var2 > 0 && var11 >= var2) {
                        class445.method2199("Warning: Script " + var5.field3815 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
                     }

                  }
               }

               while(class386.field3255.size() > 0) {
                  class122 var40 = (class122)class386.field3255.remove(0);
                  class119.method473(var40.method517(), var40.method518(), var40.method519(), var40.method520(), "");
               }

               if (class386.field3253) {
                  class386.field3253 = false;
                  class212.method918();
               }

               if (!var10 && var2 > 0 && var11 >= var2) {
                  class445.method2199("Warning: Script " + var5.field3815 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
               }

               return;
            }

            while(class386.field3255.size() > 0) {
               class122 var28 = (class122)class386.field3255.remove(0);
               class119.method473(var28.method517(), var28.method518(), var28.method519(), var28.method520(), "");
            }

            if (class386.field3253) {
               class386.field3253 = false;
               class212.method918();
            }

            if (!var10 && var2 > 0 && var11 >= var2) {
               class445.method2199("Warning: Script " + var5.field3815 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
            }

            return;
         }

         while(class386.field3255.size() > 0) {
            class122 var32 = (class122)class386.field3255.remove(0);
            class119.method473(var32.method517(), var32.method518(), var32.method519(), var32.method520(), "");
         }

         if (class386.field3253) {
            class386.field3253 = false;
            class212.method918();
         }

         if (!var10 && var2 > 0 && var11 >= var2) {
            class445.method2199("Warning: Script " + var5.field3815 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
         }

      }
   }

   @ObfInfo(
      owner = "du",
      name = "q",
      desc = "(Lqy;II)V"
   )
   public static void method340(class127 var0, int var1) {
      if (null != class25.field115) {
         try {
            class25.field115.method2164(0L);
            class25.field115.method2162(var0.field1072, var1, 24);
         } catch (Exception var4) {
            ;
         }
      }

   }

   @ObfInfo(
      owner = "du",
      name = "kx",
      desc = "(IIB)Ljava/lang/String;"
   )
   static final String method351(int var0, int var1) {
      int var3 = var1 - var0;
      if (var3 < -9) {
         return class238.method1032(16711680);
      } else if (var3 < -6) {
         return class238.method1032(16723968);
      } else if (var3 < -3) {
         return class238.method1032(16740352);
      } else if (var3 < 0) {
         return class238.method1032(16756736);
      } else if (var3 > 9) {
         return class238.method1032(65280);
      } else if (var3 > 6) {
         return class238.method1032(4259584);
      } else if (var3 > 3) {
         return class238.method1032(8453888);
      } else {
         return var3 > 0 ? class238.method1032(12648192) : class238.method1032(16776960);
      }
   }
}
