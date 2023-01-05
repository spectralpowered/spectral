import java.util.Random;

public class class162 {
   static int[] field1670;
   static int[] field1675 = new int['耀'];
   static int[] field1680;
   static int[] field1688;
   static int[] field1690;
   static int[] field1691;
   static int[] field1692;
   static int[] field1694;
   class113 field1671;
   class113 field1672;
   class113 field1673;
   class113 field1674;
   class113 field1676;
   class113 field1683;
   class113 field1686;
   class113 field1687;
   class113 field1689;
   class403 field1682;
   int field1681 = 0;
   int field1684 = 500;
   int field1685 = 0;
   int field1693 = 100;
   int[] field1677 = new int[]{0, 0, 0, 0, 0};
   int[] field1678 = new int[]{0, 0, 0, 0, 0};
   int[] field1679 = new int[]{0, 0, 0, 0, 0};

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field1675[var1] = (var0.nextInt() & 2) - 1;
      }

      field1688 = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field1688[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1680 = new int[220500];
      field1690 = new int[5];
      field1691 = new int[5];
      field1670 = new int[5];
      field1692 = new int[5];
      field1694 = new int[5];
   }

   final int[] method857(int var1, int var2) {
      class364.method1760(field1680, 0, var1);
      if (var2 < 10) {
         return field1680;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field1687.method593();
         this.field1671.method593();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field1672 != null) {
            this.field1672.method593();
            this.field1673.method593();
            var5 = (int)((double)(this.field1672.field1402 - this.field1672.field1401) * 32.768D / var3);
            var6 = (int)((double)this.field1672.field1401 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field1674 != null) {
            this.field1674.method593();
            this.field1686.method593();
            var8 = (int)((double)(this.field1674.field1402 - this.field1674.field1401) * 32.768D / var3);
            var9 = (int)((double)this.field1674.field1401 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field1677[var11] != 0) {
               field1690[var11] = 0;
               field1691[var11] = (int)((double)this.field1679[var11] * var3);
               field1670[var11] = (this.field1677[var11] << 14) / 100;
               field1692[var11] = (int)((double)(this.field1687.field1402 - this.field1687.field1401) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1678[var11]) / var3);
               field1694[var11] = (int)((double)this.field1687.field1401 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field1687.method591(var1);
            var13 = this.field1671.method591(var1);
            if (this.field1672 != null) {
               var14 = this.field1672.method591(var1);
               var15 = this.field1673.method591(var1);
               var12 += this.method855(var7, var15, this.field1672.field1408) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.field1674 != null) {
               var14 = this.field1674.method591(var1);
               var15 = this.field1686.method591(var1);
               var13 = var13 * ((this.method855(var10, var15, this.field1674.field1408) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field1677[var14] != 0) {
                  var15 = var11 + field1691[var14];
                  if (var15 < var1) {
                     field1680[var15] += this.method855(field1690[var14], var13 * field1670[var14] >> 15, this.field1687.field1408);
                     field1690[var14] += (var12 * field1692[var14] >> 16) + field1694[var14];
                  }
               }
            }
         }

         int var16;
         if (this.field1676 != null) {
            this.field1676.method593();
            this.field1689.method593();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field1676.method591(var1);
               var16 = this.field1689.method591(var1);
               if (var20) {
                  var12 = this.field1676.field1401 + ((this.field1676.field1402 - this.field1676.field1401) * var15 >> 8);
               } else {
                  var12 = this.field1676.field1401 + ((this.field1676.field1402 - this.field1676.field1401) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  field1680[var14] = 0;
               }
            }
         }

         if (this.field1681 > 0 && this.field1693 > 0) {
            var11 = (int)((double)this.field1681 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field1680[var12] += field1680[var12 - var11] * this.field1693 / 100;
            }
         }

         if (this.field1682.field3523[0] > 0 || this.field1682.field3523[1] > 0) {
            this.field1683.method593();
            var11 = this.field1683.method591(var1 + 1);
            var12 = this.field1682.method1975(0, (float)var11 / 65536.0F);
            var13 = this.field1682.method1975(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field1680[var14 + var12] * (long)class403.field3518 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field1680[var14 + var12 - 1 - var17] * (long)class403.field3519[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field1680[var14 - 1 - var17] * (long)class403.field3519[1][var17] >> 16);
                  }

                  field1680[var14] = var16;
                  var11 = this.field1683.method591(var1 + 1);
                  ++var14;
               }

               boolean var21 = true;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field1680[var14 + var12] * (long)class403.field3518 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field1680[var14 + var12 - 1 - var18] * (long)class403.field3519[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field1680[var14 - 1 - var18] * (long)class403.field3519[1][var18] >> 16);
                     }

                     field1680[var14] = var17;
                     var11 = this.field1683.method591(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field1680[var14 + var12 - 1 - var18] * (long)class403.field3519[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field1680[var14 - 1 - var18] * (long)class403.field3519[1][var18] >> 16);
                        }

                        field1680[var14] = var17;
                        this.field1683.method591(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field1682.method1975(0, (float)var11 / 65536.0F);
                  var13 = this.field1682.method1975(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field1680[var11] < -32768) {
               field1680[var11] = -32768;
            }

            if (field1680[var11] > 32767) {
               field1680[var11] = 32767;
            }
         }

         return field1680;
      }
   }

   final int method855(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field1688[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field1675[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void method856(class134 var1) {
      this.field1687 = new class113();
      this.field1687.method594(var1);
      this.field1671 = new class113();
      this.field1671.method594(var1);
      int var2 = var1.method669();
      if (var2 != 0) {
         --var1.field1487;
         this.field1672 = new class113();
         this.field1672.method594(var1);
         this.field1673 = new class113();
         this.field1673.method594(var1);
      }

      var2 = var1.method669();
      if (var2 != 0) {
         --var1.field1487;
         this.field1674 = new class113();
         this.field1674.method594(var1);
         this.field1686 = new class113();
         this.field1686.method594(var1);
      }

      var2 = var1.method669();
      if (var2 != 0) {
         --var1.field1487;
         this.field1676 = new class113();
         this.field1676.method594(var1);
         this.field1689 = new class113();
         this.field1689.method594(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method681();
         if (var4 == 0) {
            break;
         }

         this.field1677[var3] = var4;
         this.field1678[var3] = var1.method680();
         this.field1679[var3] = var1.method681();
      }

      this.field1681 = var1.method681();
      this.field1693 = var1.method681();
      this.field1684 = var1.method671();
      this.field1685 = var1.method671();
      this.field1682 = new class403();
      this.field1683 = new class113();
      this.field1682.method1977(var1, this.field1683);
   }
}
