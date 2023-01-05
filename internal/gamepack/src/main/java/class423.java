import java.util.Date;

public class class423 extends class195 {
   static class274 field3465;
   static class99 field3456 = new class99(50);
   static class99 field3459 = new class99(64);
   static int field3458;
   static int field3502;
   class385 field3501;
   int field3466;
   int field3473;
   int field3488;
   int field3491;
   int field3494;
   int field3495;
   int[] field3462;
   int[] field3464;
   int[] field3500;
   short[] field3457;
   short[] field3481;
   short[] field3483;
   public boolean field3486;
   public boolean field3490;
   public boolean field3496;
   public boolean field3497;
   public boolean field3498;
   public int field3461;
   public int field3463;
   public int field3467;
   public int field3468;
   public int field3469;
   public int field3470;
   public int field3471;
   public int field3472;
   public int field3474;
   public int field3475;
   public int field3476;
   public int field3477;
   public int field3478;
   public int field3479;
   public int field3480;
   public int field3487;
   public int field3489;
   public int field3492;
   public int field3499;
   public int[] field3493;
   public String field3460;
   public String[] field3485;
   public short[] field3482;
   public short[] field3484;

   class423() {
      this.field3460 = class177.field1325;
      this.field3470 = 1;
      this.field3463 = -1;
      this.field3467 = -1;
      this.field3468 = -1;
      this.field3469 = -1;
      this.field3492 = -1;
      this.field3489 = -1;
      this.field3472 = -1;
      this.field3471 = -1;
      this.field3474 = -1;
      this.field3475 = -1;
      this.field3476 = -1;
      this.field3477 = -1;
      this.field3478 = -1;
      this.field3479 = -1;
      this.field3480 = -1;
      this.field3485 = new String[5];
      this.field3486 = true;
      this.field3487 = -1;
      this.field3495 = 128;
      this.field3466 = 128;
      this.field3490 = false;
      this.field3473 = 0;
      this.field3488 = 0;
      this.field3499 = 32;
      this.field3494 = -1;
      this.field3491 = -1;
      this.field3496 = true;
      this.field3497 = true;
      this.field3498 = false;
      this.field3500 = null;
      this.field3457 = null;
   }

   void method2051() {
   }

   void method2065(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         this.method2060(var1, var3);
      }
   }

   void method2060(class127 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method547();
         this.field3464 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3464[var5] = var1.method549();
         }
      } else if (var2 == 2) {
         this.field3460 = var1.method555();
      } else if (var2 == 12) {
         this.field3470 = var1.method547();
      } else if (var2 == 13) {
         this.field3463 = var1.method549();
      } else if (var2 == 14) {
         this.field3469 = var1.method549();
      } else if (var2 == 15) {
         this.field3467 = var1.method549();
      } else if (var2 == 16) {
         this.field3468 = var1.method549();
      } else if (var2 == 17) {
         this.field3469 = var1.method549();
         this.field3492 = var1.method549();
         this.field3489 = var1.method549();
         this.field3472 = var1.method549();
      } else if (var2 == 18) {
         var1.method549();
      } else if (var2 >= 30 && var2 < 35) {
         this.field3485[var2 - 30] = var1.method555();
         if (this.field3485[var2 - 30].equalsIgnoreCase(class177.field1326)) {
            this.field3485[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.method547();
         this.field3481 = new short[var4];
         this.field3482 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3481[var5] = (short)var1.method549();
            this.field3482[var5] = (short)var1.method549();
         }
      } else if (var2 == 41) {
         var4 = var1.method547();
         this.field3483 = new short[var4];
         this.field3484 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3483[var5] = (short)var1.method549();
            this.field3484[var5] = (short)var1.method549();
         }
      } else if (var2 == 60) {
         var4 = var1.method547();
         this.field3462 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3462[var5] = var1.method549();
         }
      } else if (var2 == 93) {
         this.field3486 = false;
      } else if (var2 == 95) {
         this.field3487 = var1.method549();
      } else if (var2 == 97) {
         this.field3495 = var1.method549();
      } else if (var2 == 98) {
         this.field3466 = var1.method549();
      } else if (var2 == 99) {
         this.field3490 = true;
      } else if (var2 == 100) {
         this.field3473 = var1.method548();
      } else if (var2 == 101) {
         this.field3488 = var1.method548() * 5;
      } else {
         int var6;
         if (var2 == 102) {
            if (class375.field3180) {
               this.field3500 = new int[1];
               this.field3457 = new short[1];
               this.field3500[0] = field3458;
               this.field3457[0] = (short)var1.method549();
            } else {
               var4 = var1.method547();
               var5 = 0;

               for(var6 = var4; var6 != 0; var6 >>= 1) {
                  ++var5;
               }

               this.field3500 = new int[var5];
               this.field3457 = new short[var5];

               for(int var7 = 0; var7 < var5; ++var7) {
                  if ((var4 & 1 << var7) == 0) {
                     this.field3500[var7] = -1;
                     this.field3457[var7] = -1;
                  } else {
                     this.field3500[var7] = var1.method560();
                     this.field3457[var7] = (short)var1.method605();
                  }
               }
            }
         } else if (var2 == 103) {
            this.field3499 = var1.method549();
         } else if (var2 != 106 && var2 != 118) {
            if (var2 == 107) {
               this.field3496 = false;
            } else if (var2 == 109) {
               this.field3497 = false;
            } else if (var2 == 111) {
               this.field3498 = true;
            } else if (var2 == 114) {
               this.field3471 = var1.method549();
            } else if (var2 == 115) {
               this.field3471 = var1.method549();
               this.field3474 = var1.method549();
               this.field3475 = var1.method549();
               this.field3476 = var1.method549();
            } else if (var2 == 116) {
               this.field3477 = var1.method549();
            } else if (var2 == 117) {
               this.field3477 = var1.method549();
               this.field3478 = var1.method549();
               this.field3479 = var1.method549();
               this.field3480 = var1.method549();
            } else if (var2 == 249) {
               this.field3501 = class89.method380(var1, this.field3501);
            }
         } else {
            this.field3494 = var1.method549();
            if (65535 == this.field3494) {
               this.field3494 = -1;
            }

            this.field3491 = var1.method549();
            if (65535 == this.field3491) {
               this.field3491 = -1;
            }

            var4 = -1;
            if (var2 == 118) {
               var4 = var1.method549();
               if (var4 == 65535) {
                  var4 = -1;
               }
            }

            var5 = var1.method547();
            this.field3493 = new int[var5 + 2];

            for(var6 = 0; var6 <= var5; ++var6) {
               this.field3493[var6] = var1.method549();
               if (this.field3493[var6] == 65535) {
                  this.field3493[var6] = -1;
               }
            }

            this.field3493[var5 + 1] = var4;
         }
      }

   }

   public final class470 method2066(class242 var1, int var2, class242 var3, int var4, class207 var5) {
      if (null != this.field3493) {
         class423 var12 = this.method2054();
         return var12 == null ? null : var12.method2066(var1, var2, var3, var4, var5);
      } else {
         long var7 = (long)this.field3461;
         if (var5 != null) {
            var7 |= var5.field1787 << 16;
         }

         class470 var9 = (class470)field3456.method394(var7);
         if (null == var9) {
            class26 var10 = this.method2055(this.field3464, var5);
            if (var10 == null) {
               return null;
            }

            var9 = var10.method121(64 + this.field3473, this.field3488 + 850, -30, -50, -30);
            field3456.method396(var9, var7);
         }

         class470 var11;
         if (var1 != null && null != var3) {
            var11 = var1.method1062(var9, var2, var3, var4);
         } else if (var1 != null) {
            var11 = var1.method1053(var9, var2);
         } else if (null != var3) {
            var11 = var3.method1053(var9, var4);
         } else {
            var11 = var9.method2298(true);
         }

         if (this.field3495 != 128 || this.field3466 != 128) {
            var11.method2320(this.field3495, this.field3466, this.field3495);
         }

         return var11;
      }
   }

   public final class26 method2053(class207 var1) {
      if (null != this.field3493) {
         class423 var3 = this.method2054();
         return null == var3 ? null : var3.method2053(var1);
      } else {
         return this.method2055(this.field3462, var1);
      }
   }

   class26 method2055(int[] var1, class207 var2) {
      int[] var4 = var1;
      if (null != var2 && var2.field1783 != null) {
         var4 = var2.field1783;
      }

      if (var4 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var6 = 0; var6 < var4.length; ++var6) {
            if (-1 != var4[var6] && !class276.field2319.method1363(var4[var6], 0)) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         } else {
            class26[] var10 = new class26[var4.length];

            for(int var7 = 0; var7 < var4.length; ++var7) {
               var10[var7] = class26.method103(class276.field2319, var4[var7], 0);
            }

            class26 var11;
            if (var10.length == 1) {
               var11 = var10[0];
               if (var11 == null) {
                  var11 = new class26(var10, var10.length);
               }
            } else {
               var11 = new class26(var10, var10.length);
            }

            short[] var8;
            int var9;
            if (this.field3481 != null) {
               var8 = this.field3482;
               if (null != var2 && var2.field1784 != null) {
                  var8 = var2.field1784;
               }

               for(var9 = 0; var9 < this.field3481.length; ++var9) {
                  var11.method113(this.field3481[var9], var8[var9]);
               }
            }

            if (null != this.field3483) {
               var8 = this.field3484;
               if (null != var2 && null != var2.field1785) {
                  var8 = var2.field1785;
               }

               for(var9 = 0; var9 < this.field3483.length; ++var9) {
                  var11.method114(this.field3483[var9], var8[var9]);
               }
            }

            return var11;
         }
      }
   }

   public final class423 method2054() {
      int var2 = -1;
      if (this.field3494 != -1) {
         var2 = class67.method300(this.field3494);
      } else if (-1 != this.field3491) {
         var2 = class291.field2373[this.field3491];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field3493.length - 1) {
         var3 = this.field3493[var2];
      } else {
         var3 = this.field3493[this.field3493.length - 1];
      }

      return var3 != -1 ? class421.method2049(var3, (byte)92) : null;
   }

   public boolean method2063() {
      if (this.field3493 == null) {
         return true;
      } else {
         int var2 = -1;
         if (-1 != this.field3494) {
            var2 = class67.method300(this.field3494);
         } else if (-1 != this.field3491) {
            var2 = class291.field2373[this.field3491];
         }

         if (var2 >= 0 && var2 < this.field3493.length) {
            return -1 != this.field3493[var2];
         } else {
            return -1 != this.field3493[this.field3493.length - 1];
         }
      }
   }

   public int method2056(int var1, int var2) {
      return class288.method1424(this.field3501, var1, var2);
   }

   public String method2057(int var1, String var2) {
      class385 var5 = this.field3501;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class135 var6 = (class135)var5.method1897((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field1111;
         }
      }

      return var4;
   }

   public boolean method2058() {
      return null != this.field3500 && null != this.field3457;
   }

   public int[] method2061() {
      return this.field3500;
   }

   public int method2052(int var1) {
      return null != this.field3500 && var1 < this.field3500.length ? this.field3500[var1] : -1;
   }

   public short[] method2064() {
      return this.field3457;
   }

   public short method2059(int var1) {
      return this.field3457 != null && var1 < this.field3457.length ? this.field3457[var1] : -1;
   }

   public static class263 method2062(int var0) {
      class263 var2 = (class263)class263.field2188.method394((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class263.field2140.method1365(10, var0);
         var2 = new class263();
         var2.field2168 = var0;
         if (var3 != null) {
            var2.method1198(new class127(var3));
         }

         var2.method1197();
         if (var2.field2181 != -1) {
            var2.method1213(method2062(var2.field2181), method2062(var2.field2185));
         }

         if (-1 != var2.field2169) {
            var2.method1196(method2062(var2.field2169), method2062(var2.field2163));
         }

         if (var2.field2193 != -1) {
            var2.method1212(method2062(var2.field2193), method2062(var2.field2170));
         }

         if (!class203.field1759 && var2.field2162) {
            var2.field2147 = class177.field1435;
            var2.field2190 = false;

            int var4;
            for(var4 = 0; var4 < var2.field2145.length; ++var4) {
               var2.field2145[var4] = null;
            }

            for(var4 = 0; var4 < var2.field2164.length; ++var4) {
               if (var4 != 4) {
                  var2.field2164[var4] = null;
               }
            }

            var2.field2165 = -2;
            var2.field2187 = 0;
            if (null != var2.field2171) {
               boolean var7 = false;

               for(class139 var5 = var2.field2171.method1895(); null != var5; var5 = var2.field2171.method1898()) {
                  class123 var6 = class283.method1395((int)var5.field1134);
                  if (var6.field1058) {
                     var5.method637();
                  } else {
                     var7 = true;
                  }
               }

               if (!var7) {
                  var2.field2171 = null;
               }
            }
         }

         class263.field2188.method396(var2, (long)var0);
         return var2;
      }
   }

   static int method2067(int var0, class461 var1, boolean var2) {
      String var4;
      int var10;
      if (var0 == 4100) {
         var4 = class386.field3249[--class386.field3250];
         var10 = class386.field3248[--class161.field1227];
         class386.field3249[++class386.field3250 - 1] = var4 + var10;
         return 1;
      } else {
         String var5;
         if (var0 == 4101) {
            class386.field3250 -= 2;
            var4 = class386.field3249[class386.field3250];
            var5 = class386.field3249[1 + class386.field3250];
            class386.field3249[++class386.field3250 - 1] = var4 + var5;
            return 1;
         } else if (var0 == 4102) {
            var4 = class386.field3249[--class386.field3250];
            var10 = class386.field3248[--class161.field1227];
            class386.field3249[++class386.field3250 - 1] = var4 + class364.method1810(var10, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = class386.field3249[--class386.field3250];
            class386.field3249[++class386.field3250 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var13;
            if (var0 == 4104) {
               var13 = class386.field3248[--class161.field1227];
               long var16 = ((long)var13 + 11745L) * 86400000L;
               class386.field3245.setTime(new Date(var16));
               var7 = class386.field3245.get(5);
               int var18 = class386.field3245.get(2);
               int var9 = class386.field3245.get(1);
               class386.field3249[++class386.field3250 - 1] = var7 + "-" + class386.field3254[var18] + "-" + var9;
               return 1;
            } else if (var0 != 4105) {
               if (var0 == 4106) {
                  var13 = class386.field3248[--class161.field1227];
                  class386.field3249[++class386.field3250 - 1] = Integer.toString(var13);
                  return 1;
               } else if (var0 == 4107) {
                  class386.field3250 -= 2;
                  class386.field3248[++class161.field1227 - 1] = class463.method2275(class173.method801(class386.field3249[class386.field3250], class386.field3249[1 + class386.field3250], class235.field1995));
                  return 1;
               } else {
                  int var12;
                  byte[] var15;
                  class58 var17;
                  if (var0 == 4108) {
                     var4 = class386.field3249[--class386.field3250];
                     class161.field1227 -= 2;
                     var10 = class386.field3248[class161.field1227];
                     var12 = class386.field3248[1 + class161.field1227];
                     var15 = class471.field3963.method1365(var12, 0);
                     var17 = new class58(var15);
                     class386.field3248[++class161.field1227 - 1] = var17.method2024(var4, var10);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = class386.field3249[--class386.field3250];
                     class161.field1227 -= 2;
                     var10 = class386.field3248[class161.field1227];
                     var12 = class386.field3248[1 + class161.field1227];
                     var15 = class471.field3963.method1365(var12, 0);
                     var17 = new class58(var15);
                     class386.field3248[++class161.field1227 - 1] = var17.method2023(var4, var10);
                     return 1;
                  } else if (var0 == 4110) {
                     class386.field3250 -= 2;
                     var4 = class386.field3249[class386.field3250];
                     var5 = class386.field3249[1 + class386.field3250];
                     if (class386.field3248[--class161.field1227] == 1) {
                        class386.field3249[++class386.field3250 - 1] = var4;
                     } else {
                        class386.field3249[++class386.field3250 - 1] = var5;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var4 = class386.field3249[--class386.field3250];
                     class386.field3249[++class386.field3250 - 1] = class420.method2042(var4);
                     return 1;
                  } else if (var0 == 4112) {
                     var4 = class386.field3249[--class386.field3250];
                     var10 = class386.field3248[--class161.field1227];
                     class386.field3249[++class386.field3250 - 1] = var4 + (char)var10;
                     return 1;
                  } else if (var0 == 4113) {
                     var13 = class386.field3248[--class161.field1227];
                     class386.field3248[++class161.field1227 - 1] = class343.method1744((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var13 = class386.field3248[--class161.field1227];
                     class386.field3248[++class161.field1227 - 1] = class87.method374((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4115) {
                     var13 = class386.field3248[--class161.field1227];
                     class386.field3248[++class161.field1227 - 1] = class105.method418((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var13 = class386.field3248[--class161.field1227];
                     class386.field3248[++class161.field1227 - 1] = class221.method980((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = class386.field3249[--class386.field3250];
                     if (var4 != null) {
                        class386.field3248[++class161.field1227 - 1] = var4.length();
                     } else {
                        class386.field3248[++class161.field1227 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 4118) {
                     var4 = class386.field3249[--class386.field3250];
                     class161.field1227 -= 2;
                     var10 = class386.field3248[class161.field1227];
                     var12 = class386.field3248[1 + class161.field1227];
                     class386.field3249[++class386.field3250 - 1] = var4.substring(var10, var12);
                     return 1;
                  } else if (var0 == 4119) {
                     var4 = class386.field3249[--class386.field3250];
                     StringBuilder var11 = new StringBuilder(var4.length());
                     boolean var14 = false;

                     for(var7 = 0; var7 < var4.length(); ++var7) {
                        char var8 = var4.charAt(var7);
                        if (var8 == '<') {
                           var14 = true;
                        } else if (var8 == '>') {
                           var14 = false;
                        } else if (!var14) {
                           var11.append(var8);
                        }
                     }

                     class386.field3249[++class386.field3250 - 1] = var11.toString();
                     return 1;
                  } else if (var0 == 4120) {
                     var4 = class386.field3249[--class386.field3250];
                     var10 = class386.field3248[--class161.field1227];
                     class386.field3248[++class161.field1227 - 1] = var4.indexOf(var10);
                     return 1;
                  } else if (var0 == 4121) {
                     class386.field3250 -= 2;
                     var4 = class386.field3249[class386.field3250];
                     var5 = class386.field3249[1 + class386.field3250];
                     var12 = class386.field3248[--class161.field1227];
                     class386.field3248[++class161.field1227 - 1] = var4.indexOf(var5, var12);
                     return 1;
                  } else if (var0 == 4122) {
                     var4 = class386.field3249[--class386.field3250];
                     class386.field3249[++class386.field3250 - 1] = var4.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     class386.field3250 -= 3;
                     var4 = class386.field3249[class386.field3250];
                     var5 = class386.field3249[1 + class386.field3250];
                     String var6 = class386.field3249[2 + class386.field3250];
                     if (class113.field846.field3194 == null) {
                        class386.field3249[++class386.field3250 - 1] = var6;
                        return 1;
                     } else {
                        switch(class113.field846.field3194.field2349) {
                        case 0:
                           class386.field3249[++class386.field3250 - 1] = var4;
                           break;
                        case 1:
                           class386.field3249[++class386.field3250 - 1] = var5;
                           break;
                        case 2:
                        default:
                           class386.field3249[++class386.field3250 - 1] = var6;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               class386.field3250 -= 2;
               var4 = class386.field3249[class386.field3250];
               var5 = class386.field3249[1 + class386.field3250];
               if (class113.field846.field3194 != null && 0 != class113.field846.field3194.field2347) {
                  class386.field3249[++class386.field3250 - 1] = var5;
               } else {
                  class386.field3249[++class386.field3250 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }
}
