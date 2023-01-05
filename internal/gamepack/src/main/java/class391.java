public class class391 {
   public static int field3440;
   int field3441;
   int field3442 = 0;
   int field3443 = 0;
   int field3444;
   public int[][] field3445;

   public class391(int var1, int var2) {
      this.field3441 = var1;
      this.field3444 = var2;
      this.field3445 = new int[this.field3441][this.field3444];
      this.method1886();
   }

   public void method1886() {
      for(int var2 = 0; var2 < this.field3441; ++var2) {
         for(int var3 = 0; var3 < this.field3444; ++var3) {
            if (var2 != 0 && var3 != 0 && var2 < this.field3441 - 5 && var3 < this.field3444 - 5) {
               this.field3445[var2][var3] = 16777216;
            } else {
               this.field3445[var2][var3] = 16777215;
            }
         }
      }

   }

   public void method1887(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field3442;
      var2 -= this.field3443;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method1891(var1, var2, 128);
            this.method1891(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method1891(var1, var2, 2);
            this.method1891(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method1891(var1, var2, 8);
            this.method1891(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method1891(var1, var2, 32);
            this.method1891(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method1891(var1, var2, 1);
            this.method1891(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method1891(var1, var2, 4);
            this.method1891(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method1891(var1, var2, 16);
            this.method1891(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method1891(var1, var2, 64);
            this.method1891(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method1891(var1, var2, 130);
            this.method1891(var1 - 1, var2, 8);
            this.method1891(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method1891(var1, var2, 10);
            this.method1891(var1, var2 + 1, 32);
            this.method1891(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method1891(var1, var2, 40);
            this.method1891(var1 + 1, var2, 128);
            this.method1891(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method1891(var1, var2, 160);
            this.method1891(var1, var2 - 1, 2);
            this.method1891(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method1891(var1, var2, 65536);
               this.method1891(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method1891(var1, var2, 1024);
               this.method1891(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method1891(var1, var2, 4096);
               this.method1891(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method1891(var1, var2, 16384);
               this.method1891(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method1891(var1, var2, 512);
               this.method1891(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method1891(var1, var2, 2048);
               this.method1891(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method1891(var1, var2, 8192);
               this.method1891(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method1891(var1, var2, 32768);
               this.method1891(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method1891(var1, var2, 66560);
               this.method1891(var1 - 1, var2, 4096);
               this.method1891(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method1891(var1, var2, 5120);
               this.method1891(var1, var2 + 1, 16384);
               this.method1891(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method1891(var1, var2, 20480);
               this.method1891(var1 + 1, var2, 65536);
               this.method1891(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method1891(var1, var2, 81920);
               this.method1891(var1, var2 - 1, 1024);
               this.method1891(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method1897(int var1, int var2, int var3, int var4, boolean var5) {
      int var7 = 256;
      if (var5) {
         var7 += 131072;
      }

      var1 -= this.field3442;
      var2 -= this.field3443;

      for(int var8 = var1; var8 < var1 + var3; ++var8) {
         if (var8 >= 0 && var8 < this.field3441) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.field3444) {
                  this.method1891(var8, var9, var7);
               }
            }
         }
      }

   }

   public void method1888(int var1, int var2) {
      var1 -= this.field3442;
      var2 -= this.field3443;
      this.field3445[var1][var2] |= 2097152;
   }

   public void method1889(int var1, int var2) {
      var1 -= this.field3442;
      var2 -= this.field3443;
      this.field3445[var1][var2] |= 262144;
   }

   void method1891(int var1, int var2, int var3) {
      this.field3445[var1][var2] |= var3;
   }

   public void method1890(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field3442;
      var2 -= this.field3443;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method1894(var1, var2, 128);
            this.method1894(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method1894(var1, var2, 2);
            this.method1894(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method1894(var1, var2, 8);
            this.method1894(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method1894(var1, var2, 32);
            this.method1894(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method1894(var1, var2, 1);
            this.method1894(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method1894(var1, var2, 4);
            this.method1894(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method1894(var1, var2, 16);
            this.method1894(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method1894(var1, var2, 64);
            this.method1894(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method1894(var1, var2, 130);
            this.method1894(var1 - 1, var2, 8);
            this.method1894(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method1894(var1, var2, 10);
            this.method1894(var1, var2 + 1, 32);
            this.method1894(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method1894(var1, var2, 40);
            this.method1894(var1 + 1, var2, 128);
            this.method1894(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method1894(var1, var2, 160);
            this.method1894(var1, var2 - 1, 2);
            this.method1894(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method1894(var1, var2, 65536);
               this.method1894(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method1894(var1, var2, 1024);
               this.method1894(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method1894(var1, var2, 4096);
               this.method1894(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method1894(var1, var2, 16384);
               this.method1894(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method1894(var1, var2, 512);
               this.method1894(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method1894(var1, var2, 2048);
               this.method1894(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method1894(var1, var2, 8192);
               this.method1894(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method1894(var1, var2, 32768);
               this.method1894(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method1894(var1, var2, 66560);
               this.method1894(var1 - 1, var2, 4096);
               this.method1894(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method1894(var1, var2, 5120);
               this.method1894(var1, var2 + 1, 16384);
               this.method1894(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method1894(var1, var2, 20480);
               this.method1894(var1 + 1, var2, 65536);
               this.method1894(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method1894(var1, var2, 81920);
               this.method1894(var1, var2 - 1, 1024);
               this.method1894(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method1893(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var8 = 256;
      if (var6) {
         var8 += 131072;
      }

      var1 -= this.field3442;
      var2 -= this.field3443;
      int var9;
      if (var5 == 1 || var5 == 3) {
         var9 = var3;
         var3 = var4;
         var4 = var9;
      }

      for(var9 = var1; var9 < var1 + var3; ++var9) {
         if (var9 >= 0 && var9 < this.field3441) {
            for(int var10 = var2; var10 < var4 + var2; ++var10) {
               if (var10 >= 0 && var10 < this.field3444) {
                  this.method1894(var9, var10, var8);
               }
            }
         }
      }

   }

   void method1894(int var1, int var2, int var3) {
      this.field3445[var1][var2] &= ~var3;
   }

   public void method1895(int var1, int var2) {
      var1 -= this.field3442;
      var2 -= this.field3443;
      this.field3445[var1][var2] &= -262145;
   }

   static final void method1896(byte var0) {
      client.field608 = 0;
      int var1 = (class89.field982.field297 >> 7) + class381.field3325;
      int var2 = class345.field3166 + (class89.field982.field233 >> 7);
      if (var1 >= 3053) {
         if (var0 >= -1) {
            throw new IllegalStateException();
         }

         if (var1 <= 3156 && var2 >= 3056) {
            if (var0 >= -1) {
               throw new IllegalStateException();
            }

            if (var2 <= 3136) {
               client.field608 = 1;
            }
         }
      }

      if (var1 >= 3072 && var1 <= 3118) {
         if (var0 >= -1) {
            throw new IllegalStateException();
         }

         if (var2 >= 9492) {
            if (var0 >= -1) {
               throw new IllegalStateException();
            }

            if (var2 <= 9535) {
               if (var0 >= -1) {
                  return;
               }

               client.field608 = 1;
            }
         }
      }

      if (client.field608 == 1) {
         if (var0 >= -1) {
            throw new IllegalStateException();
         }

         if (var1 >= 3139) {
            if (var0 >= -1) {
               throw new IllegalStateException();
            }

            if (var1 <= 3199) {
               if (var0 >= -1) {
                  throw new IllegalStateException();
               }

               if (var2 >= 3008) {
                  if (var0 >= -1) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= 3062) {
                     if (var0 >= -1) {
                        throw new IllegalStateException();
                     }

                     client.field608 = 0;
                  }
               }
            }
         }
      }

   }

   static void method1892() {
      if (client.field510 == 1) {
         client.field446 = true;
      }

   }
}
