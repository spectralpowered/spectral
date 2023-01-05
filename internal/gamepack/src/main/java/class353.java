public class class353 {
   static class210 field3188;
   byte[][][] field3187;
   int field3186;

   class353(int var1) {
      this.field3186 = var1;
   }

   void method1690(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field3186 != 0 && null != this.field3187) {
         var8 = this.method1691(var8, var7);
         var7 = this.method1698(var7);
         class362.method1747(var1, var2, var5, var6, var3, var4, this.field3187[var7 - 1][var8], this.field3186, true);
      }
   }

   int method1691(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   int method1698(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   void method1692() {
      if (null == this.field3187) {
         this.field3187 = new byte[8][4][];
         this.method1697();
         this.method1693();
         this.method1701();
         this.method1696();
         this.method1699();
         this.method1700();
         this.method1694();
         this.method1695();
      }
   }

   void method1697() {
      byte[] var2 = new byte[this.field3186 * this.field3186];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[0][0] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[0][1] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[0][2] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[0][3] = var2;
   }

   void method1693() {
      byte[] var2 = new byte[this.field3186 * this.field3186];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[1][0] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var3 >= 0 && var3 < var2.length) {
               if (var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            } else {
               ++var3;
            }
         }
      }

      this.field3187[1][1] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[1][2] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[1][3] = var2;
   }

   void method1701() {
      byte[] var2 = new byte[this.field3186 * this.field3186];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[2][0] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[2][1] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[2][2] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[2][3] = var2;
   }

   void method1696() {
      byte[] var2 = new byte[this.field3186 * this.field3186];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[3][0] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[3][1] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[3][2] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[3][3] = var2;
   }

   void method1699() {
      byte[] var2 = new byte[this.field3186 * this.field3186];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[4][0] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[4][1] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[4][2] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var3 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3187[4][3] = var2;
   }

   void method1700() {
      byte[] var2 = new byte[this.field3186 * this.field3186];
      boolean var3 = false;
      var2 = new byte[this.field3186 * this.field3186];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 <= this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[5][0] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var6 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var4 <= this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[5][1] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var6 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 >= this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[5][2] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var6 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var4 >= this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[5][3] = var2;
   }

   void method1694() {
      byte[] var2 = new byte[this.field3186 * this.field3186];
      boolean var3 = false;
      var2 = new byte[this.field3186 * this.field3186];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 <= var4 - this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[6][0] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var6 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 <= var4 - this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[6][1] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var6 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[6][2] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var6 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[6][3] = var2;
   }

   void method1695() {
      byte[] var2 = new byte[this.field3186 * this.field3186];
      boolean var3 = false;
      var2 = new byte[this.field3186 * this.field3186];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 >= var4 - this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[7][0] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var6 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3186; ++var5) {
            if (var5 >= var4 - this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[7][1] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var6 = 0;

      for(var4 = this.field3186 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[7][2] = var2;
      var2 = new byte[this.field3186 * this.field3186];
      var6 = 0;

      for(var4 = 0; var4 < this.field3186; ++var4) {
         for(var5 = this.field3186 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field3186 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3187[7][3] = var2;
   }
}
