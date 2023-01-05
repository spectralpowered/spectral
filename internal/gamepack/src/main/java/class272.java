import java.util.Date;

public class class272 extends class108 {
   static class164 field2715;
   static class31 field2706 = new class31(50);
   static class31 field2709 = new class31(64);
   static int field2708;
   static int field2752;
   class376 field2751;
   int field2716;
   int field2723;
   int field2738;
   int field2741;
   int field2744;
   int field2745;
   int[] field2712;
   int[] field2714;
   int[] field2750;
   short[] field2707;
   short[] field2731;
   short[] field2733;
   public boolean field2736;
   public boolean field2740;
   public boolean field2746;
   public boolean field2747;
   public boolean field2748;
   public int field2711;
   public int field2713;
   public int field2717;
   public int field2718;
   public int field2719;
   public int field2720;
   public int field2721;
   public int field2722;
   public int field2724;
   public int field2725;
   public int field2726;
   public int field2727;
   public int field2728;
   public int field2729;
   public int field2730;
   public int field2737;
   public int field2739;
   public int field2742;
   public int field2749;
   public int[] field2743;
   public String field2710;
   public String[] field2735;
   public short[] field2732;
   public short[] field2734;

   class272() {
      this.field2710 = class96.field1020;
      this.field2720 = 1;
      this.field2713 = -1;
      this.field2717 = -1;
      this.field2718 = -1;
      this.field2719 = -1;
      this.field2742 = -1;
      this.field2739 = -1;
      this.field2722 = -1;
      this.field2721 = -1;
      this.field2724 = -1;
      this.field2725 = -1;
      this.field2726 = -1;
      this.field2727 = -1;
      this.field2728 = -1;
      this.field2729 = -1;
      this.field2730 = -1;
      this.field2735 = new String[5];
      this.field2736 = true;
      this.field2737 = -1;
      this.field2745 = 128;
      this.field2716 = 128;
      this.field2740 = false;
      this.field2723 = 0;
      this.field2738 = 0;
      this.field2749 = 32;
      this.field2744 = -1;
      this.field2741 = -1;
      this.field2746 = true;
      this.field2747 = true;
      this.field2748 = false;
      this.field2750 = null;
      this.field2707 = null;
   }

   void method1283() {
   }

   void method1297(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method1292(var1, var3);
      }
   }

   void method1292(class134 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method669();
         this.field2714 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2714[var5] = var1.method671();
         }
      } else if (var2 == 2) {
         this.field2710 = var1.method677();
      } else if (var2 == 12) {
         this.field2720 = var1.method669();
      } else if (var2 == 13) {
         this.field2713 = var1.method671();
      } else if (var2 == 14) {
         this.field2719 = var1.method671();
      } else if (var2 == 15) {
         this.field2717 = var1.method671();
      } else if (var2 == 16) {
         this.field2718 = var1.method671();
      } else if (var2 == 17) {
         this.field2719 = var1.method671();
         this.field2742 = var1.method671();
         this.field2739 = var1.method671();
         this.field2722 = var1.method671();
      } else if (var2 == 18) {
         var1.method671();
      } else if (var2 >= 30 && var2 < 35) {
         this.field2735[var2 - 30] = var1.method677();
         if (this.field2735[var2 - 30].equalsIgnoreCase(class96.field1021)) {
            this.field2735[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.method669();
         this.field2731 = new short[var4];
         this.field2732 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2731[var5] = (short)var1.method671();
            this.field2732[var5] = (short)var1.method671();
         }
      } else if (var2 == 41) {
         var4 = var1.method669();
         this.field2733 = new short[var4];
         this.field2734 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2733[var5] = (short)var1.method671();
            this.field2734[var5] = (short)var1.method671();
         }
      } else if (var2 == 60) {
         var4 = var1.method669();
         this.field2712 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2712[var5] = var1.method671();
         }
      } else if (var2 == 93) {
         this.field2736 = false;
      } else if (var2 == 95) {
         this.field2737 = var1.method671();
      } else if (var2 == 97) {
         this.field2745 = var1.method671();
      } else if (var2 == 98) {
         this.field2716 = var1.method671();
      } else if (var2 == 99) {
         this.field2740 = true;
      } else if (var2 == 100) {
         this.field2723 = var1.method670();
      } else if (var2 == 101) {
         this.field2738 = var1.method670() * 5;
      } else {
         int var6;
         if (var2 == 102) {
            if (class462.field3850) {
               this.field2750 = new int[1];
               this.field2707 = new short[1];
               this.field2750[0] = field2708;
               this.field2707[0] = (short)var1.method671();
            } else {
               var4 = var1.method669();
               var5 = 0;

               for(var6 = var4; var6 != 0; var6 >>= 1) {
                  ++var5;
               }

               this.field2750 = new int[var5];
               this.field2707 = new short[var5];

               for(int var7 = 0; var7 < var5; ++var7) {
                  if ((var4 & 1 << var7) == 0) {
                     this.field2750[var7] = -1;
                     this.field2707[var7] = -1;
                  } else {
                     this.field2750[var7] = var1.method682();
                     this.field2707[var7] = (short)var1.method727();
                  }
               }
            }
         } else if (var2 == 103) {
            this.field2749 = var1.method671();
         } else if (var2 != 106 && var2 != 118) {
            if (var2 == 107) {
               this.field2746 = false;
            } else if (var2 == 109) {
               this.field2747 = false;
            } else if (var2 == 111) {
               this.field2748 = true;
            } else if (var2 == 114) {
               this.field2721 = var1.method671();
            } else if (var2 == 115) {
               this.field2721 = var1.method671();
               this.field2724 = var1.method671();
               this.field2725 = var1.method671();
               this.field2726 = var1.method671();
            } else if (var2 == 116) {
               this.field2727 = var1.method671();
            } else if (var2 == 117) {
               this.field2727 = var1.method671();
               this.field2728 = var1.method671();
               this.field2729 = var1.method671();
               this.field2730 = var1.method671();
            } else if (var2 == 249) {
               this.field2751 = class479.method2314(var1, this.field2751);
            }
         } else {
            this.field2744 = var1.method671();
            if (65535 == this.field2744) {
               this.field2744 = -1;
            }

            this.field2741 = var1.method671();
            if (65535 == this.field2741) {
               this.field2741 = -1;
            }

            var4 = -1;
            if (var2 == 118) {
               var4 = var1.method671();
               if (var4 == 65535) {
                  var4 = -1;
               }
            }

            var5 = var1.method669();
            this.field2743 = new int[var5 + 2];

            for(var6 = 0; var6 <= var5; ++var6) {
               this.field2743[var6] = var1.method671();
               if (this.field2743[var6] == 65535) {
                  this.field2743[var6] = -1;
               }
            }

            this.field2743[var5 + 1] = var4;
         }
      }

   }

   public final class491 method1298(class79 var1, int var2, class79 var3, int var4, class490 var5) {
      if (null != this.field2743) {
         class272 var12 = this.method1286();
         return var12 == null ? null : var12.method1298(var1, var2, var3, var4, var5);
      } else {
         long var7 = (long)this.field2711;
         if (var5 != null) {
            var7 |= var5.field4041 << 16;
         }

         class491 var9 = (class491)field2706.method161(var7);
         if (null == var9) {
            class311 var10 = this.method1287(this.field2714, var5);
            if (var10 == null) {
               return null;
            }

            var9 = var10.method1507(64 + this.field2723, this.field2738 + 850, -30, -50, -30);
            field2706.method163(var9, var7);
         }

         class491 var11;
         if (var1 != null && null != var3) {
            var11 = var1.method432(var9, var2, var3, var4);
         } else if (var1 != null) {
            var11 = var1.method423(var9, var2);
         } else if (null != var3) {
            var11 = var3.method423(var9, var4);
         } else {
            var11 = var9.method2357(true);
         }

         if (this.field2745 != 128 || this.field2716 != 128) {
            var11.method2379(this.field2745, this.field2716, this.field2745);
         }

         return var11;
      }
   }

   public final class311 method1285(class490 var1) {
      if (null != this.field2743) {
         class272 var3 = this.method1286();
         return null == var3 ? null : var3.method1285(var1);
      } else {
         return this.method1287(this.field2712, var1);
      }
   }

   class311 method1287(int[] var1, class490 var2) {
      int[] var4 = var1;
      if (null != var2 && var2.field4037 != null) {
         var4 = var2.field4037;
      }

      if (var4 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var6 = 0; var6 < var4.length; ++var6) {
            if (-1 != var4[var6] && !class486.field3996.method890(var4[var6], 0)) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         } else {
            class311[] var10 = new class311[var4.length];

            for(int var7 = 0; var7 < var4.length; ++var7) {
               var10[var7] = class311.method1489(class486.field3996, var4[var7], 0);
            }

            class311 var11;
            if (var10.length == 1) {
               var11 = var10[0];
               if (var11 == null) {
                  var11 = new class311(var10, var10.length);
               }
            } else {
               var11 = new class311(var10, var10.length);
            }

            short[] var8;
            int var9;
            if (this.field2731 != null) {
               var8 = this.field2732;
               if (null != var2 && var2.field4038 != null) {
                  var8 = var2.field4038;
               }

               for(var9 = 0; var9 < this.field2731.length; ++var9) {
                  var11.method1499(this.field2731[var9], var8[var9]);
               }
            }

            if (null != this.field2733) {
               var8 = this.field2734;
               if (null != var2 && null != var2.field4039) {
                  var8 = var2.field4039;
               }

               for(var9 = 0; var9 < this.field2733.length; ++var9) {
                  var11.method1500(this.field2733[var9], var8[var9]);
               }
            }

            return var11;
         }
      }
   }

   public final class272 method1286() {
      int var2 = -1;
      if (this.field2744 != -1) {
         var2 = class274.method1302(this.field2744);
      } else if (-1 != this.field2741) {
         var2 = class484.field3992[this.field2741];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field2743.length - 1) {
         var3 = this.field2743[var2];
      } else {
         var3 = this.field2743[this.field2743.length - 1];
      }

      return var3 != -1 ? class190.method984(var3, (byte)92) : null;
   }

   public boolean method1295() {
      if (this.field2743 == null) {
         return true;
      } else {
         int var2 = -1;
         if (-1 != this.field2744) {
            var2 = class274.method1302(this.field2744);
         } else if (-1 != this.field2741) {
            var2 = class484.field3992[this.field2741];
         }

         if (var2 >= 0 && var2 < this.field2743.length) {
            return -1 != this.field2743[var2];
         } else {
            return -1 != this.field2743[this.field2743.length - 1];
         }
      }
   }

   public int method1288(int var1, int var2) {
      return class175.method933(this.field2751, var1, var2);
   }

   public String method1289(int var1, String var2) {
      class376 var5 = this.field2751;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class232 var6 = (class232)var5.method1794((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field2518;
         }
      }

      return var4;
   }

   public boolean method1290() {
      return null != this.field2750 && null != this.field2707;
   }

   public int[] method1293() {
      return this.field2750;
   }

   public int method1284(int var1) {
      return null != this.field2750 && var1 < this.field2750.length ? this.field2750[var1] : -1;
   }

   public short[] method1296() {
      return this.field2707;
   }

   public short method1291(int var1) {
      return this.field2707 != null && var1 < this.field2707.length ? this.field2707[var1] : -1;
   }

   public static class458 method1294(int var0) {
      class458 var2 = (class458)class458.field3805.method161((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class458.field3757.method892(10, var0);
         var2 = new class458();
         var2.field3785 = var0;
         if (var3 != null) {
            var2.method2167(new class134(var3));
         }

         var2.method2166();
         if (var2.field3798 != -1) {
            var2.method2182(method1294(var2.field3798), method1294(var2.field3802));
         }

         if (-1 != var2.field3786) {
            var2.method2165(method1294(var2.field3786), method1294(var2.field3780));
         }

         if (var2.field3810 != -1) {
            var2.method2181(method1294(var2.field3810), method1294(var2.field3787));
         }

         if (!class172.field1862 && var2.field3779) {
            var2.field3764 = class96.field1130;
            var2.field3807 = false;

            int var4;
            for(var4 = 0; var4 < var2.field3762.length; ++var4) {
               var2.field3762[var4] = null;
            }

            for(var4 = 0; var4 < var2.field3781.length; ++var4) {
               if (var4 != 4) {
                  var2.field3781[var4] = null;
               }
            }

            var2.field3782 = -2;
            var2.field3804 = 0;
            if (null != var2.field3788) {
               boolean var7 = false;

               for(class106 var5 = var2.field3788.method1792(); null != var5; var5 = var2.field3788.method1795()) {
                  class295 var6 = class251.method1235((int)var5.field1361);
                  if (var6.field2826) {
                     var5.method567();
                  } else {
                     var7 = true;
                  }
               }

               if (!var7) {
                  var2.field3788 = null;
               }
            }
         }

         class458.field3805.method163(var2, (long)var0);
         return var2;
      }
   }

   static int method1299(int var0, class472 var1, boolean var2) {
      String var4;
      int var10;
      if (var0 == 4100) {
         var4 = class150.field1581[--class150.field1582];
         var10 = class150.field1580[--class188.field1989];
         class150.field1581[++class150.field1582 - 1] = var4 + var10;
         return 1;
      } else {
         String var5;
         if (var0 == 4101) {
            class150.field1582 -= 2;
            var4 = class150.field1581[class150.field1582];
            var5 = class150.field1581[1 + class150.field1582];
            class150.field1581[++class150.field1582 - 1] = var4 + var5;
            return 1;
         } else if (var0 == 4102) {
            var4 = class150.field1581[--class150.field1582];
            var10 = class150.field1580[--class188.field1989];
            class150.field1581[++class150.field1582 - 1] = var4 + class369.method1782(var10, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = class150.field1581[--class150.field1582];
            class150.field1581[++class150.field1582 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var13;
            if (var0 == 4104) {
               var13 = class150.field1580[--class188.field1989];
               long var16 = ((long)var13 + 11745L) * 86400000L;
               class150.field1577.setTime(new Date(var16));
               var7 = class150.field1577.get(5);
               int var18 = class150.field1577.get(2);
               int var9 = class150.field1577.get(1);
               class150.field1581[++class150.field1582 - 1] = var7 + "-" + class150.field1586[var18] + "-" + var9;
               return 1;
            } else if (var0 != 4105) {
               if (var0 == 4106) {
                  var13 = class150.field1580[--class188.field1989];
                  class150.field1581[++class150.field1582 - 1] = Integer.toString(var13);
                  return 1;
               } else if (var0 == 4107) {
                  class150.field1582 -= 2;
                  class150.field1580[++class188.field1989 - 1] = class342.method1639(class316.method1524(class150.field1581[class150.field1582], class150.field1581[1 + class150.field1582], class300.field2886));
                  return 1;
               } else {
                  int var12;
                  byte[] var15;
                  class394 var17;
                  if (var0 == 4108) {
                     var4 = class150.field1581[--class150.field1582];
                     class188.field1989 -= 2;
                     var10 = class150.field1580[class188.field1989];
                     var12 = class150.field1580[1 + class188.field1989];
                     var15 = class307.field2902.method892(var12, 0);
                     var17 = new class394(var15);
                     class150.field1580[++class188.field1989 - 1] = var17.method517(var4, var10);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = class150.field1581[--class150.field1582];
                     class188.field1989 -= 2;
                     var10 = class150.field1580[class188.field1989];
                     var12 = class150.field1580[1 + class188.field1989];
                     var15 = class307.field2902.method892(var12, 0);
                     var17 = new class394(var15);
                     class150.field1580[++class188.field1989 - 1] = var17.method516(var4, var10);
                     return 1;
                  } else if (var0 == 4110) {
                     class150.field1582 -= 2;
                     var4 = class150.field1581[class150.field1582];
                     var5 = class150.field1581[1 + class150.field1582];
                     if (class150.field1580[--class188.field1989] == 1) {
                        class150.field1581[++class150.field1582 - 1] = var4;
                     } else {
                        class150.field1581[++class150.field1582 - 1] = var5;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var4 = class150.field1581[--class150.field1582];
                     class150.field1581[++class150.field1582 - 1] = class93.method535(var4);
                     return 1;
                  } else if (var0 == 4112) {
                     var4 = class150.field1581[--class150.field1582];
                     var10 = class150.field1580[--class188.field1989];
                     class150.field1581[++class150.field1582 - 1] = var4 + (char)var10;
                     return 1;
                  } else if (var0 == 4113) {
                     var13 = class150.field1580[--class188.field1989];
                     class150.field1580[++class188.field1989 - 1] = class45.method232((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var13 = class150.field1580[--class188.field1989];
                     class150.field1580[++class188.field1989 - 1] = class173.method927((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4115) {
                     var13 = class150.field1580[--class188.field1989];
                     class150.field1580[++class188.field1989 - 1] = class245.method1222((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var13 = class150.field1580[--class188.field1989];
                     class150.field1580[++class188.field1989 - 1] = class2.method9((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = class150.field1581[--class150.field1582];
                     if (var4 != null) {
                        class150.field1580[++class188.field1989 - 1] = var4.length();
                     } else {
                        class150.field1580[++class188.field1989 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 4118) {
                     var4 = class150.field1581[--class150.field1582];
                     class188.field1989 -= 2;
                     var10 = class150.field1580[class188.field1989];
                     var12 = class150.field1580[1 + class188.field1989];
                     class150.field1581[++class150.field1582 - 1] = var4.substring(var10, var12);
                     return 1;
                  } else if (var0 == 4119) {
                     var4 = class150.field1581[--class150.field1582];
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

                     class150.field1581[++class150.field1582 - 1] = var11.toString();
                     return 1;
                  } else if (var0 == 4120) {
                     var4 = class150.field1581[--class150.field1582];
                     var10 = class150.field1580[--class188.field1989];
                     class150.field1580[++class188.field1989 - 1] = var4.indexOf(var10);
                     return 1;
                  } else if (var0 == 4121) {
                     class150.field1582 -= 2;
                     var4 = class150.field1581[class150.field1582];
                     var5 = class150.field1581[1 + class150.field1582];
                     var12 = class150.field1580[--class188.field1989];
                     class150.field1580[++class188.field1989 - 1] = var4.indexOf(var5, var12);
                     return 1;
                  } else if (var0 == 4122) {
                     var4 = class150.field1581[--class150.field1582];
                     class150.field1581[++class150.field1582 - 1] = var4.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     class150.field1582 -= 3;
                     var4 = class150.field1581[class150.field1582];
                     var5 = class150.field1581[1 + class150.field1582];
                     String var6 = class150.field1581[2 + class150.field1582];
                     if (class89.field982.field388 == null) {
                        class150.field1581[++class150.field1582 - 1] = var6;
                        return 1;
                     } else {
                        switch(class89.field982.field388.field3451) {
                        case 0:
                           class150.field1581[++class150.field1582 - 1] = var4;
                           break;
                        case 1:
                           class150.field1581[++class150.field1582 - 1] = var5;
                           break;
                        case 2:
                        default:
                           class150.field1581[++class150.field1582 - 1] = var6;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               class150.field1582 -= 2;
               var4 = class150.field1581[class150.field1582];
               var5 = class150.field1581[1 + class150.field1582];
               if (class89.field982.field388 != null && 0 != class89.field982.field388.field3449) {
                  class150.field1581[++class150.field1582 - 1] = var5;
               } else {
                  class150.field1581[++class150.field1582 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }
}
