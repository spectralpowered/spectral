public class class458 extends class108 {
   public static class31 field3760 = new class31(50);
   public static class31 field3761 = new class31(200);
   public static class31 field3805 = new class31(64);
   public static int field3796;
   static class164 field3757;
   class376 field3788;
   int field3755;
   int field3763;
   int field3778;
   int field3780;
   int field3782;
   int field3783;
   int field3784;
   int field3786;
   int field3789;
   int field3790;
   int field3791;
   int field3792;
   int field3793;
   int field3794;
   int field3799;
   int field3800;
   int field3801;
   int field3806;
   int field3808;
   int[] field3756;
   int[] field3795;
   public boolean field3779;
   public boolean field3807;
   public int field3758;
   public int field3759;
   public int field3767;
   public int field3768;
   public int field3769;
   public int field3770;
   public int field3771;
   public int field3772;
   public int field3773;
   public int field3774;
   public int field3775;
   public int field3776;
   public int field3777;
   public int field3785;
   public int field3787;
   public int field3797;
   public int field3798;
   public int field3802;
   public int field3804;
   public int field3810;
   public String field3764;
   public String[] field3762;
   public String[] field3781;
   public short[] field3765;
   public short[] field3766;
   public short[] field3803;
   public short[] field3809;

   class458() {
      this.field3764 = class96.field1020;
      this.field3768 = 2000;
      this.field3769 = 0;
      this.field3770 = 0;
      this.field3777 = 0;
      this.field3772 = 0;
      this.field3758 = 0;
      this.field3774 = 0;
      this.field3775 = 1;
      this.field3776 = -1;
      this.field3797 = -1;
      this.field3767 = -1;
      this.field3779 = false;
      this.field3762 = new String[]{null, null, class96.field1266, null, null};
      this.field3781 = new String[]{null, null, null, null, class96.field1333};
      this.field3782 = -2;
      this.field3783 = -1;
      this.field3784 = -1;
      this.field3806 = 0;
      this.field3763 = -1;
      this.field3778 = -1;
      this.field3755 = 0;
      this.field3789 = -1;
      this.field3790 = -1;
      this.field3791 = -1;
      this.field3792 = -1;
      this.field3793 = -1;
      this.field3794 = -1;
      this.field3802 = -1;
      this.field3798 = -1;
      this.field3799 = 128;
      this.field3800 = 128;
      this.field3801 = 128;
      this.field3759 = 0;
      this.field3771 = 0;
      this.field3804 = 0;
      this.field3773 = 0;
      this.field3807 = false;
      this.field3780 = -1;
      this.field3786 = -1;
      this.field3787 = -1;
      this.field3810 = -1;
   }

   void method2166() {
      if (1 == this.field3774) {
         this.field3773 = 0;
      }

   }

   void method2167(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method2168(var1, var3);
      }
   }

   void method2168(class134 var1, int var2) {
      if (var2 == 1) {
         this.field3808 = var1.method671();
      } else if (var2 == 2) {
         this.field3764 = var1.method677();
      } else if (var2 == 4) {
         this.field3768 = var1.method671();
      } else if (var2 == 5) {
         this.field3769 = var1.method671();
      } else if (var2 == 6) {
         this.field3770 = var1.method671();
      } else if (var2 == 7) {
         this.field3772 = var1.method671();
         if (this.field3772 > 32767) {
            this.field3772 -= 65536;
         }
      } else if (var2 == 8) {
         this.field3758 = var1.method671();
         if (this.field3758 > 32767) {
            this.field3758 -= 65536;
         }
      } else if (var2 == 9) {
         var1.method677();
      } else if (var2 == 11) {
         this.field3774 = 1;
      } else if (var2 == 12) {
         this.field3775 = var1.method717();
      } else if (var2 == 13) {
         this.field3776 = var1.method669();
      } else if (var2 == 14) {
         this.field3797 = var1.method669();
      } else if (var2 == 16) {
         this.field3779 = true;
      } else if (var2 == 23) {
         this.field3783 = var1.method671();
         this.field3806 = var1.method669();
      } else if (var2 == 24) {
         this.field3784 = var1.method671();
      } else if (var2 == 25) {
         this.field3763 = var1.method671();
         this.field3755 = var1.method669();
      } else if (var2 == 26) {
         this.field3778 = var1.method671();
      } else if (var2 == 27) {
         this.field3767 = var1.method669();
      } else if (var2 >= 30 && var2 < 35) {
         this.field3762[var2 - 30] = var1.method677();
         if (this.field3762[var2 - 30].equalsIgnoreCase(class96.field1021)) {
            this.field3762[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.field3781[var2 - 35] = var1.method677();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.method669();
            this.field3803 = new short[var4];
            this.field3765 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3803[var5] = (short)var1.method671();
               this.field3765[var5] = (short)var1.method671();
            }
         } else if (var2 == 41) {
            var4 = var1.method669();
            this.field3766 = new short[var4];
            this.field3809 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3766[var5] = (short)var1.method671();
               this.field3809[var5] = (short)var1.method671();
            }
         } else if (var2 == 42) {
            this.field3782 = var1.method670();
         } else if (var2 == 65) {
            this.field3807 = true;
         } else if (var2 == 75) {
            this.field3773 = var1.method672();
         } else if (var2 == 78) {
            this.field3789 = var1.method671();
         } else if (var2 == 79) {
            this.field3790 = var1.method671();
         } else if (var2 == 90) {
            this.field3791 = var1.method671();
         } else if (var2 == 91) {
            this.field3793 = var1.method671();
         } else if (var2 == 92) {
            this.field3792 = var1.method671();
         } else if (var2 == 93) {
            this.field3794 = var1.method671();
         } else if (var2 == 94) {
            var1.method671();
         } else if (var2 == 95) {
            this.field3777 = var1.method671();
         } else if (var2 == 97) {
            this.field3802 = var1.method671();
         } else if (var2 == 98) {
            this.field3798 = var1.method671();
         } else if (var2 >= 100 && var2 < 110) {
            if (null == this.field3795) {
               this.field3795 = new int[10];
               this.field3756 = new int[10];
            }

            this.field3795[var2 - 100] = var1.method671();
            this.field3756[var2 - 100] = var1.method671();
         } else if (var2 == 110) {
            this.field3799 = var1.method671();
         } else if (var2 == 111) {
            this.field3800 = var1.method671();
         } else if (var2 == 112) {
            this.field3801 = var1.method671();
         } else if (var2 == 113) {
            this.field3759 = var1.method670();
         } else if (var2 == 114) {
            this.field3771 = var1.method670() * 5;
         } else if (var2 == 115) {
            this.field3804 = var1.method669();
         } else if (var2 == 139) {
            this.field3780 = var1.method671();
         } else if (var2 == 140) {
            this.field3786 = var1.method671();
         } else if (var2 == 148) {
            this.field3787 = var1.method671();
         } else if (var2 == 149) {
            this.field3810 = var1.method671();
         } else if (var2 == 249) {
            this.field3788 = class479.method2314(var1, this.field3788);
         }
      }

   }

   void method2182(class458 var1, class458 var2) {
      this.field3808 = var1.field3808;
      this.field3768 = var1.field3768;
      this.field3769 = var1.field3769;
      this.field3770 = var1.field3770;
      this.field3777 = var1.field3777;
      this.field3772 = var1.field3772;
      this.field3758 = var1.field3758;
      this.field3803 = var1.field3803;
      this.field3765 = var1.field3765;
      this.field3766 = var1.field3766;
      this.field3809 = var1.field3809;
      this.field3764 = var2.field3764;
      this.field3779 = var2.field3779;
      this.field3775 = var2.field3775;
      this.field3774 = 1;
   }

   void method2165(class458 var1, class458 var2) {
      this.field3808 = var1.field3808;
      this.field3768 = var1.field3768;
      this.field3769 = var1.field3769;
      this.field3770 = var1.field3770;
      this.field3777 = var1.field3777;
      this.field3772 = var1.field3772;
      this.field3758 = var1.field3758;
      this.field3803 = var2.field3803;
      this.field3765 = var2.field3765;
      this.field3766 = var2.field3766;
      this.field3809 = var2.field3809;
      this.field3764 = var2.field3764;
      this.field3779 = var2.field3779;
      this.field3774 = var2.field3774;
      this.field3776 = var2.field3776;
      this.field3797 = var2.field3797;
      this.field3767 = var2.field3767;
      this.field3783 = var2.field3783;
      this.field3784 = var2.field3784;
      this.field3789 = var2.field3789;
      this.field3763 = var2.field3763;
      this.field3778 = var2.field3778;
      this.field3790 = var2.field3790;
      this.field3791 = var2.field3791;
      this.field3792 = var2.field3792;
      this.field3793 = var2.field3793;
      this.field3794 = var2.field3794;
      this.field3804 = var2.field3804;
      this.field3762 = var2.field3762;
      this.field3773 = var2.field3773;
      this.field3781 = new String[5];
      if (var2.field3781 != null) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.field3781[var4] = var2.field3781[var4];
         }
      }

      this.field3781[4] = class96.field1276;
      this.field3775 = 0;
   }

   void method2181(class458 var1, class458 var2) {
      this.field3808 = var1.field3808;
      this.field3768 = var1.field3768;
      this.field3769 = var1.field3769;
      this.field3770 = var1.field3770;
      this.field3777 = var1.field3777;
      this.field3772 = var1.field3772;
      this.field3758 = var1.field3758;
      this.field3803 = var1.field3803;
      this.field3765 = var1.field3765;
      this.field3766 = var1.field3766;
      this.field3809 = var1.field3809;
      this.field3774 = var1.field3774;
      this.field3764 = var2.field3764;
      this.field3775 = 0;
      this.field3779 = false;
      this.field3807 = false;
   }

   public final class311 method2169(int var1) {
      int var4;
      if (this.field3795 != null && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field3756[var4] && this.field3756[var4] != 0) {
               var3 = this.field3795[var4];
            }
         }

         if (var3 != -1) {
            return class272.method1294(var3).method2169(1);
         }
      }

      class311 var5 = class311.method1489(class61.field819, this.field3808, 0);
      if (null == var5) {
         return null;
      } else {
         if (this.field3799 != 128 || this.field3800 != 128 || this.field3801 != 128) {
            var5.method1502(this.field3799, this.field3800, this.field3801);
         }

         if (null != this.field3803) {
            for(var4 = 0; var4 < this.field3803.length; ++var4) {
               var5.method1499(this.field3803[var4], this.field3765[var4]);
            }
         }

         if (this.field3766 != null) {
            for(var4 = 0; var4 < this.field3766.length; ++var4) {
               var5.method1500(this.field3766[var4], this.field3809[var4]);
            }
         }

         return var5;
      }
   }

   public final class491 method2170(int var1) {
      if (null != this.field3795 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field3756[var4] && 0 != this.field3756[var4]) {
               var3 = this.field3795[var4];
            }
         }

         if (var3 != -1) {
            return class272.method1294(var3).method2170(1);
         }
      }

      class491 var6 = (class491)field3760.method161((long)this.field3785);
      if (null != var6) {
         return var6;
      } else {
         class311 var7 = class311.method1489(class61.field819, this.field3808, 0);
         if (var7 == null) {
            return null;
         } else {
            if (128 != this.field3799 || this.field3800 != 128 || 128 != this.field3801) {
               var7.method1502(this.field3799, this.field3800, this.field3801);
            }

            int var5;
            if (null != this.field3803) {
               for(var5 = 0; var5 < this.field3803.length; ++var5) {
                  var7.method1499(this.field3803[var5], this.field3765[var5]);
               }
            }

            if (null != this.field3766) {
               for(var5 = 0; var5 < this.field3766.length; ++var5) {
                  var7.method1500(this.field3766[var5], this.field3809[var5]);
               }
            }

            var6 = var7.method1507(this.field3759 + 64, 768 + this.field3771, -50, -10, -50);
            var6.field4074 = true;
            field3760.method163(var6, (long)this.field3785);
            return var6;
         }
      }
   }

   public class458 method2171(int var1) {
      if (null != this.field3795 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field3756[var4] && 0 != this.field3756[var4]) {
               var3 = this.field3795[var4];
            }
         }

         if (var3 != -1) {
            return class272.method1294(var3);
         }
      }

      return this;
   }

   public final boolean method2172(int var1) {
      int var3 = this.field3783;
      int var4 = this.field3784;
      int var5 = this.field3789;
      if (var1 == 1) {
         var3 = this.field3763;
         var4 = this.field3778;
         var5 = this.field3790;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if (!class61.field819.method890(var3, 0)) {
            var6 = false;
         }

         if (var4 != -1 && !class61.field819.method890(var4, 0)) {
            var6 = false;
         }

         if (var5 != -1 && !class61.field819.method890(var5, 0)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final class311 method2173(int var1) {
      int var3 = this.field3783;
      int var4 = this.field3784;
      int var5 = this.field3789;
      if (var1 == 1) {
         var3 = this.field3763;
         var4 = this.field3778;
         var5 = this.field3790;
      }

      if (var3 == -1) {
         return null;
      } else {
         class311 var6 = class311.method1489(class61.field819, var3, 0);
         if (var4 != -1) {
            class311 var7 = class311.method1489(class61.field819, var4, 0);
            if (var5 != -1) {
               class311 var8 = class311.method1489(class61.field819, var5, 0);
               class311[] var9 = new class311[]{var6, var7, var8};
               var6 = new class311(var9, 3);
            } else {
               class311[] var11 = new class311[]{var6, var7};
               var6 = new class311(var11, 2);
            }
         }

         if (var1 == 0 && 0 != this.field3806) {
            var6.method1498(0, this.field3806, 0);
         }

         if (var1 == 1 && 0 != this.field3755) {
            var6.method1498(0, this.field3755, 0);
         }

         int var10;
         if (null != this.field3803) {
            for(var10 = 0; var10 < this.field3803.length; ++var10) {
               var6.method1499(this.field3803[var10], this.field3765[var10]);
            }
         }

         if (this.field3766 != null) {
            for(var10 = 0; var10 < this.field3766.length; ++var10) {
               var6.method1500(this.field3766[var10], this.field3809[var10]);
            }
         }

         return var6;
      }
   }

   public final boolean method2174(int var1) {
      int var3 = this.field3791;
      int var4 = this.field3792;
      if (var1 == 1) {
         var3 = this.field3793;
         var4 = this.field3794;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!class61.field819.method890(var3, 0)) {
            var5 = false;
         }

         if (var4 != -1 && !class61.field819.method890(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final class311 method2175(int var1) {
      int var3 = this.field3791;
      int var4 = this.field3792;
      if (var1 == 1) {
         var3 = this.field3793;
         var4 = this.field3794;
      }

      if (var3 == -1) {
         return null;
      } else {
         class311 var5 = class311.method1489(class61.field819, var3, 0);
         if (var4 != -1) {
            class311 var6 = class311.method1489(class61.field819, var4, 0);
            class311[] var7 = new class311[]{var5, var6};
            var5 = new class311(var7, 2);
         }

         int var8;
         if (null != this.field3803) {
            for(var8 = 0; var8 < this.field3803.length; ++var8) {
               var5.method1499(this.field3803[var8], this.field3765[var8]);
            }
         }

         if (null != this.field3766) {
            for(var8 = 0; var8 < this.field3766.length; ++var8) {
               var5.method1500(this.field3766[var8], this.field3809[var8]);
            }
         }

         return var5;
      }
   }

   public int method2176(int var1, int var2) {
      return class175.method933(this.field3788, var1, var2);
   }

   public String method2177(int var1, String var2) {
      class376 var5 = this.field3788;
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

   public int method2179() {
      if (this.field3782 != -1 && null != this.field3781) {
         if (this.field3782 >= 0) {
            return this.field3781[this.field3782] != null ? this.field3782 : -1;
         } else {
            return class96.field1333.equalsIgnoreCase(this.field3781[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   boolean method2180() {
      return null != this.field3765;
   }

   boolean method2178() {
      return this.field3809 != null;
   }

   public static int method2183(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (1 == (var5 & 1)) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return var1;
      } else {
         return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
      }
   }
}
