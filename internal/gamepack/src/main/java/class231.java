import java.util.Random;

public class class231 {
   static int[] field1944;
   static int[] field1949 = new int['耀'];
   static int[] field1954;
   static int[] field1962;
   static int[] field1964;
   static int[] field1965;
   static int[] field1966;
   static int[] field1968;
   class428 field1956;
   class487 field1945;
   class487 field1946;
   class487 field1947;
   class487 field1948;
   class487 field1950;
   class487 field1957;
   class487 field1960;
   class487 field1961;
   class487 field1963;
   int field1955 = 0;
   int field1958 = 500;
   int field1959 = 0;
   int field1967 = 100;
   int[] field1951 = new int[]{0, 0, 0, 0, 0};
   int[] field1952 = new int[]{0, 0, 0, 0, 0};
   int[] field1953 = new int[]{0, 0, 0, 0, 0};

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field1949[var1] = (var0.nextInt() & 2) - 1;
      }

      field1962 = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field1962[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1954 = new int[220500];
      field1964 = new int[5];
      field1965 = new int[5];
      field1944 = new int[5];
      field1966 = new int[5];
      field1968 = new int[5];
   }

   final int[] method1002(int var1, int var2) {
      class165.method772(field1954, 0, var1);
      if (var2 < 10) {
         return field1954;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field1961.method2392();
         this.field1945.method2392();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field1946 != null) {
            this.field1946.method2392();
            this.field1947.method2392();
            var5 = (int)((double)(this.field1946.field4058 - this.field1946.field4057) * 32.768D / var3);
            var6 = (int)((double)this.field1946.field4057 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field1948 != null) {
            this.field1948.method2392();
            this.field1960.method2392();
            var8 = (int)((double)(this.field1948.field4058 - this.field1948.field4057) * 32.768D / var3);
            var9 = (int)((double)this.field1948.field4057 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field1951[var11] != 0) {
               field1964[var11] = 0;
               field1965[var11] = (int)((double)this.field1953[var11] * var3);
               field1944[var11] = (this.field1951[var11] << 14) / 100;
               field1966[var11] = (int)((double)(this.field1961.field4058 - this.field1961.field4057) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1952[var11]) / var3);
               field1968[var11] = (int)((double)this.field1961.field4057 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field1961.method2390(var1);
            var13 = this.field1945.method2390(var1);
            if (this.field1946 != null) {
               var14 = this.field1946.method2390(var1);
               var15 = this.field1947.method2390(var1);
               var12 += this.method1000(var7, var15, this.field1946.field4064) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.field1948 != null) {
               var14 = this.field1948.method2390(var1);
               var15 = this.field1960.method2390(var1);
               var13 = var13 * ((this.method1000(var10, var15, this.field1948.field4064) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field1951[var14] != 0) {
                  var15 = var11 + field1965[var14];
                  if (var15 < var1) {
                     field1954[var15] += this.method1000(field1964[var14], var13 * field1944[var14] >> 15, this.field1961.field4064);
                     field1964[var14] += (var12 * field1966[var14] >> 16) + field1968[var14];
                  }
               }
            }
         }

         int var16;
         if (this.field1950 != null) {
            this.field1950.method2392();
            this.field1963.method2392();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field1950.method2390(var1);
               var16 = this.field1963.method2390(var1);
               if (var20) {
                  var12 = this.field1950.field4057 + ((this.field1950.field4058 - this.field1950.field4057) * var15 >> 8);
               } else {
                  var12 = this.field1950.field4057 + ((this.field1950.field4058 - this.field1950.field4057) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  field1954[var14] = 0;
               }
            }
         }

         if (this.field1955 > 0 && this.field1967 > 0) {
            var11 = (int)((double)this.field1955 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field1954[var12] += field1954[var12 - var11] * this.field1967 / 100;
            }
         }

         if (this.field1956.field3540[0] > 0 || this.field1956.field3540[1] > 0) {
            this.field1957.method2392();
            var11 = this.field1957.method2390(var1 + 1);
            var12 = this.field1956.method2095(0, (float)var11 / 65536.0F);
            var13 = this.field1956.method2095(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field1954[var14 + var12] * (long)class428.field3535 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field1954[var14 + var12 - 1 - var17] * (long)class428.field3536[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field1954[var14 - 1 - var17] * (long)class428.field3536[1][var17] >> 16);
                  }

                  field1954[var14] = var16;
                  var11 = this.field1957.method2390(var1 + 1);
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
                     var17 = (int)((long)field1954[var14 + var12] * (long)class428.field3535 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field1954[var14 + var12 - 1 - var18] * (long)class428.field3536[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field1954[var14 - 1 - var18] * (long)class428.field3536[1][var18] >> 16);
                     }

                     field1954[var14] = var17;
                     var11 = this.field1957.method2390(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field1954[var14 + var12 - 1 - var18] * (long)class428.field3536[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field1954[var14 - 1 - var18] * (long)class428.field3536[1][var18] >> 16);
                        }

                        field1954[var14] = var17;
                        this.field1957.method2390(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field1956.method2095(0, (float)var11 / 65536.0F);
                  var13 = this.field1956.method2095(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field1954[var11] < -32768) {
               field1954[var11] = -32768;
            }

            if (field1954[var11] > 32767) {
               field1954[var11] = 32767;
            }
         }

         return field1954;
      }
   }

   final int method1000(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field1962[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field1949[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void method1001(class127 var1) {
      this.field1961 = new class487();
      this.field1961.method2393(var1);
      this.field1945 = new class487();
      this.field1945.method2393(var1);
      int var2 = var1.method547();
      if (var2 != 0) {
         --var1.field1070;
         this.field1946 = new class487();
         this.field1946.method2393(var1);
         this.field1947 = new class487();
         this.field1947.method2393(var1);
      }

      var2 = var1.method547();
      if (var2 != 0) {
         --var1.field1070;
         this.field1948 = new class487();
         this.field1948.method2393(var1);
         this.field1960 = new class487();
         this.field1960.method2393(var1);
      }

      var2 = var1.method547();
      if (var2 != 0) {
         --var1.field1070;
         this.field1950 = new class487();
         this.field1950.method2393(var1);
         this.field1963 = new class487();
         this.field1963.method2393(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method559();
         if (var4 == 0) {
            break;
         }

         this.field1951[var3] = var4;
         this.field1952[var3] = var1.method558();
         this.field1953[var3] = var1.method559();
      }

      this.field1955 = var1.method559();
      this.field1967 = var1.method559();
      this.field1958 = var1.method549();
      this.field1959 = var1.method549();
      this.field1956 = new class428();
      this.field1957 = new class487();
      this.field1956.method2097(var1, this.field1957);
   }
}
