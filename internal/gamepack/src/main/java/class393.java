public class class393 {
   static class120 field3284;
   byte[][][] field3283;
   int field3282;

   class393(int var1) {
      this.field3282 = var1;
   }

   void method1919(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field3282 != 0 && null != this.field3283) {
         var8 = this.method1920(var8, var7);
         var7 = this.method1927(var7);
         class162.method757(var1, var2, var5, var6, var3, var4, this.field3283[var7 - 1][var8], this.field3282, true);
      }
   }

   int method1920(int var1, int var2) {
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

   int method1927(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   void method1921() {
      if (null == this.field3283) {
         this.field3283 = new byte[8][4][];
         this.method1926();
         this.method1922();
         this.method1930();
         this.method1925();
         this.method1928();
         this.method1929();
         this.method1923();
         this.method1924();
      }
   }

   void method1926() {
      byte[] var2 = new byte[this.field3282 * this.field3282];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[0][0] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[0][1] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[0][2] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[0][3] = var2;
   }

   void method1922() {
      byte[] var2 = new byte[this.field3282 * this.field3282];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[1][0] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
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

      this.field3283[1][1] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[1][2] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[1][3] = var2;
   }

   void method1930() {
      byte[] var2 = new byte[this.field3282 * this.field3282];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[2][0] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[2][1] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[2][2] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[2][3] = var2;
   }

   void method1925() {
      byte[] var2 = new byte[this.field3282 * this.field3282];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[3][0] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[3][1] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[3][2] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[3][3] = var2;
   }

   void method1928() {
      byte[] var2 = new byte[this.field3282 * this.field3282];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[4][0] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[4][1] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[4][2] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var3 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field3283[4][3] = var2;
   }

   void method1929() {
      byte[] var2 = new byte[this.field3282 * this.field3282];
      boolean var3 = false;
      var2 = new byte[this.field3282 * this.field3282];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 <= this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[5][0] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var6 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var4 <= this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[5][1] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var6 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 >= this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[5][2] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var6 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var4 >= this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[5][3] = var2;
   }

   void method1923() {
      byte[] var2 = new byte[this.field3282 * this.field3282];
      boolean var3 = false;
      var2 = new byte[this.field3282 * this.field3282];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 <= var4 - this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[6][0] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var6 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 <= var4 - this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[6][1] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var6 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[6][2] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var6 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[6][3] = var2;
   }

   void method1924() {
      byte[] var2 = new byte[this.field3282 * this.field3282];
      boolean var3 = false;
      var2 = new byte[this.field3282 * this.field3282];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 >= var4 - this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[7][0] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var6 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field3282; ++var5) {
            if (var5 >= var4 - this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[7][1] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var6 = 0;

      for(var4 = this.field3282 - 1; var4 >= 0; --var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[7][2] = var2;
      var2 = new byte[this.field3282 * this.field3282];
      var6 = 0;

      for(var4 = 0; var4 < this.field3282; ++var4) {
         for(var5 = this.field3282 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field3282 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field3283[7][3] = var2;
   }
}
