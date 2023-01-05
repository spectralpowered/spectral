import java.util.HashMap;

public class class491 extends class236 {
   static boolean field4103 = true;
   static boolean[] field4081 = new boolean[6500];
   static boolean[] field4082 = new boolean[6500];
   static byte[] field4044 = new byte[1];
   static byte[] field4046 = new byte[1];
   static char[] field4096 = new char[6000];
   static char[][] field4061 = new char[6000][512];
   static class343 field4047 = new class343();
   static class343 field4048 = new class343();
   static class343 field4049 = new class343();
   static class491 field4104 = new class491();
   static class491 field4106 = new class491();
   static int field4045;
   static int field4100;
   static int field4101;
   static int[] field4043 = new int[10];
   static int[] field4051 = new int[6500];
   static int[] field4052 = new int[6500];
   static int[] field4053 = new int[12];
   static int[] field4056;
   static int[] field4064;
   static int[] field4066 = new int[12];
   static int[] field4084 = new int[6500];
   static int[] field4085;
   static int[] field4086 = new int[6500];
   static int[] field4087 = new int[6500];
   static int[] field4088 = new int[10];
   static int[] field4093 = new int[6500];
   static int[] field4094 = new int[2000];
   static int[] field4095 = new int[2000];
   static int[] field4097 = new int[10];
   static int[] field4105;
   static int[][] field4110 = new int[12][2000];
   byte field4065 = 0;
   byte[] field4078;
   byte[] field4090;
   byte[] field4102;
   int field4050 = 0;
   int field4059;
   int field4062;
   int field4075;
   int field4076;
   int field4079;
   int field4098 = 0;
   int[] field4054;
   int[] field4057;
   int[] field4058;
   int[] field4060;
   int[] field4063;
   int[] field4067;
   int[] field4068;
   int[] field4069;
   int[] field4077;
   int[] field4083;
   int[] field4092;
   int[] field4099;
   int[][] field4070;
   int[][] field4071;
   int[][] field4072;
   int[][] field4073;
   HashMap field4080 = new HashMap();
   short[] field4089;
   public boolean field4074 = false;
   public byte field4055;
   public byte field4107;
   public byte field4108;
   public byte field4109;
   public int field4091 = 0;
   public short field4111;

   static {
      field4085 = class234.field2526;
      field4105 = class234.field2544;
      field4056 = class234.field2540;
      field4064 = class234.field2542;
   }

   class491() {
   }

   public class491(class491[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.field4050 = 0;
      this.field4091 = 0;
      this.field4098 = 0;
      this.field4065 = -1;

      int var7;
      class491 var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            this.field4050 += var8.field4050;
            this.field4091 += var8.field4091;
            this.field4098 += var8.field4098;
            if (var8.field4102 != null) {
               var3 = true;
            } else {
               if (this.field4065 == -1) {
                  this.field4065 = var8.field4065;
               }

               if (this.field4065 != var8.field4065) {
                  var3 = true;
               }
            }

            var4 |= var8.field4090 != null;
            var5 |= var8.field4089 != null;
            var6 |= var8.field4078 != null;
         }
      }

      this.field4077 = new int[this.field4050];
      this.field4083 = new int[this.field4050];
      this.field4099 = new int[this.field4050];
      this.field4067 = new int[this.field4091];
      this.field4063 = new int[this.field4091];
      this.field4057 = new int[this.field4091];
      this.field4058 = new int[this.field4091];
      this.field4092 = new int[this.field4091];
      this.field4060 = new int[this.field4091];
      if (var3) {
         this.field4102 = new byte[this.field4091];
      }

      if (var4) {
         this.field4090 = new byte[this.field4091];
      }

      if (var5) {
         this.field4089 = new short[this.field4091];
      }

      if (var6) {
         this.field4078 = new byte[this.field4091];
      }

      if (this.field4098 > 0) {
         this.field4054 = new int[this.field4098];
         this.field4068 = new int[this.field4098];
         this.field4069 = new int[this.field4098];
      }

      this.field4050 = 0;
      this.field4091 = 0;
      this.field4098 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.field4091; ++var9) {
               this.field4067[this.field4091] = var8.field4067[var9] + this.field4050;
               this.field4063[this.field4091] = var8.field4063[var9] + this.field4050;
               this.field4057[this.field4091] = var8.field4057[var9] + this.field4050;
               this.field4058[this.field4091] = var8.field4058[var9];
               this.field4092[this.field4091] = var8.field4092[var9];
               this.field4060[this.field4091] = var8.field4060[var9];
               if (var3) {
                  if (var8.field4102 != null) {
                     this.field4102[this.field4091] = var8.field4102[var9];
                  } else {
                     this.field4102[this.field4091] = var8.field4065;
                  }
               }

               if (var4 && var8.field4090 != null) {
                  this.field4090[this.field4091] = var8.field4090[var9];
               }

               if (var5) {
                  if (var8.field4089 != null) {
                     this.field4089[this.field4091] = var8.field4089[var9];
                  } else {
                     this.field4089[this.field4091] = -1;
                  }
               }

               if (var6) {
                  if (var8.field4078 != null && var8.field4078[var9] != -1) {
                     this.field4078[this.field4091] = (byte)(var8.field4078[var9] + this.field4098);
                  } else {
                     this.field4078[this.field4091] = -1;
                  }
               }

               ++this.field4091;
            }

            for(var9 = 0; var9 < var8.field4098; ++var9) {
               this.field4054[this.field4098] = var8.field4054[var9] + this.field4050;
               this.field4068[this.field4098] = var8.field4068[var9] + this.field4050;
               this.field4069[this.field4098] = var8.field4069[var9] + this.field4050;
               ++this.field4098;
            }

            for(var9 = 0; var9 < var8.field4050; ++var9) {
               this.field4077[this.field4050] = var8.field4077[var9];
               this.field4083[this.field4050] = var8.field4083[var9];
               this.field4099[this.field4050] = var8.field4099[var9];
               ++this.field4050;
            }
         }
      }

   }

   public class491 method2356(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2374();
      int var7 = var2 - this.field4059;
      int var8 = var2 + this.field4059;
      int var9 = var4 - this.field4059;
      int var10 = var4 + this.field4059;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class491 var11;
            if (var5) {
               var11 = new class491();
               var11.field4050 = this.field4050;
               var11.field4091 = this.field4091;
               var11.field4098 = this.field4098;
               var11.field4077 = this.field4077;
               var11.field4099 = this.field4099;
               var11.field4067 = this.field4067;
               var11.field4063 = this.field4063;
               var11.field4057 = this.field4057;
               var11.field4058 = this.field4058;
               var11.field4092 = this.field4092;
               var11.field4060 = this.field4060;
               var11.field4102 = this.field4102;
               var11.field4090 = this.field4090;
               var11.field4078 = this.field4078;
               var11.field4089 = this.field4089;
               var11.field4065 = this.field4065;
               var11.field4054 = this.field4054;
               var11.field4068 = this.field4068;
               var11.field4069 = this.field4069;
               var11.field4070 = this.field4070;
               var11.field4071 = this.field4071;
               var11.field4074 = this.field4074;
               var11.field4083 = new int[var11.field4050];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field4050; ++var12) {
                  var13 = this.field4077[var12] + var2;
                  var14 = this.field4099[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field4083[var12] = this.field4083[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field4050; ++var12) {
                  var13 = (-this.field4083[var12] << 16) / super.field2554;
                  if (var13 < var6) {
                     var14 = this.field4077[var12] + var2;
                     var15 = this.field4099[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field4083[var12] = this.field4083[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method2384();
            return var11;
         }
      } else {
         return this;
      }
   }

   public class491 method2357(boolean var1) {
      if (!var1 && field4044.length < this.field4091) {
         field4044 = new byte[this.field4091 + 100];
      }

      return this.method2377(var1, field4104, field4044);
   }

   public class491 method2358(boolean var1) {
      if (!var1 && field4046.length < this.field4091) {
         field4046 = new byte[this.field4091 + 100];
      }

      return this.method2377(var1, field4106, field4046);
   }

   class491 method2377(boolean var1, class491 var2, byte[] var3) {
      var2.field4050 = this.field4050;
      var2.field4091 = this.field4091;
      var2.field4098 = this.field4098;
      if (var2.field4077 == null || var2.field4077.length < this.field4050) {
         var2.field4077 = new int[this.field4050 + 100];
         var2.field4083 = new int[this.field4050 + 100];
         var2.field4099 = new int[this.field4050 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field4050; ++var4) {
         var2.field4077[var4] = this.field4077[var4];
         var2.field4083[var4] = this.field4083[var4];
         var2.field4099[var4] = this.field4099[var4];
      }

      if (var1) {
         var2.field4090 = this.field4090;
      } else {
         var2.field4090 = var3;
         if (this.field4090 == null) {
            for(var4 = 0; var4 < this.field4091; ++var4) {
               var2.field4090[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field4091; ++var4) {
               var2.field4090[var4] = this.field4090[var4];
            }
         }
      }

      var2.field4067 = this.field4067;
      var2.field4063 = this.field4063;
      var2.field4057 = this.field4057;
      var2.field4058 = this.field4058;
      var2.field4092 = this.field4092;
      var2.field4060 = this.field4060;
      var2.field4102 = this.field4102;
      var2.field4078 = this.field4078;
      var2.field4089 = this.field4089;
      var2.field4065 = this.field4065;
      var2.field4054 = this.field4054;
      var2.field4068 = this.field4068;
      var2.field4069 = this.field4069;
      var2.field4070 = this.field4070;
      var2.field4071 = this.field4071;
      var2.field4072 = this.field4072;
      var2.field4073 = this.field4073;
      var2.field4074 = this.field4074;
      var2.method2384();
      var2.field4055 = 0;
      return var2;
   }

   void method2386(int var1) {
      if (!this.field4080.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field4105[var1];
         int var9 = field4085[var1];

         for(int var10 = 0; var10 < this.field4050; ++var10) {
            int var11 = class234.method1174(this.field4077[var10], this.field4099[var10], var8, var9);
            int var12 = this.field4083[var10];
            int var13 = class234.method1184(this.field4077[var10], this.field4099[var10], var8, var9);
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         class242 var14 = new class242((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var15 = true;
         if (var14.field2587 < 32) {
            var14.field2587 = 32;
         }

         if (var14.field2584 < 32) {
            var14.field2584 = 32;
         }

         if (this.field4074) {
            boolean var16 = true;
            var14.field2587 += 8;
            var14.field2584 += 8;
         }

         this.field4080.put(var1, var14);
      }
   }

   public void method2374() {
      if (this.field4075 != 1) {
         this.field4075 = 1;
         super.field2554 = 0;
         this.field4076 = 0;
         this.field4059 = 0;

         for(int var1 = 0; var1 < this.field4050; ++var1) {
            int var2 = this.field4077[var1];
            int var3 = this.field4083[var1];
            int var4 = this.field4099[var1];
            if (-var3 > super.field2554) {
               super.field2554 = -var3;
            }

            if (var3 > this.field4076) {
               this.field4076 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field4059) {
               this.field4059 = var5;
            }
         }

         this.field4059 = (int)(Math.sqrt((double)this.field4059) + 0.99D);
         this.field4079 = (int)(Math.sqrt((double)(this.field4059 * this.field4059 + super.field2554 * super.field2554)) + 0.99D);
         this.field4062 = this.field4079 + (int)(Math.sqrt((double)(this.field4059 * this.field4059 + this.field4076 * this.field4076)) + 0.99D);
      }
   }

   void method2359() {
      if (this.field4075 != 2) {
         this.field4075 = 2;
         this.field4059 = 0;

         for(int var1 = 0; var1 < this.field4050; ++var1) {
            int var2 = this.field4077[var1];
            int var3 = this.field4083[var1];
            int var4 = this.field4099[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.field4059) {
               this.field4059 = var5;
            }
         }

         this.field4059 = (int)(Math.sqrt((double)this.field4059) + 0.99D);
         this.field4079 = this.field4059;
         this.field4062 = this.field4059 + this.field4059;
      }
   }

   public int method2360() {
      this.method2374();
      return this.field4059;
   }

   public void method2384() {
      this.field4075 = 0;
      this.field4080.clear();
   }

   public void method2361(class405 var1, int var2) {
      if (this.field4070 != null) {
         if (var2 != -1) {
            class149 var3 = var1.field3531[var2];
            class268 var4 = var3.field1570;
            field4100 = 0;
            field4101 = 0;
            field4045 = 0;

            for(int var5 = 0; var5 < var3.field1571; ++var5) {
               int var6 = var3.field1572[var5];
               this.method2364(var4.field2696[var6], var4.field2697[var6], var3.field1566[var5], var3.field1574[var5], var3.field1575[var5]);
            }

            this.method2384();
         }
      }
   }

   public void method2378(class159 var1, int var2) {
      class268 var3 = var1.field1648;
      class348 var4 = var3.method1273();
      if (var4 != null) {
         var3.method1273().method1671(var1, var2);
         this.method2363(var3.method1273(), var1.method844());
      }

      if (var1.method839()) {
         this.method2362(var1, var2);
      }

      this.method2384();
   }

   void method2362(class159 var1, int var2) {
      class268 var3 = var1.field1648;

      for(int var4 = 0; var4 < var3.field2695; ++var4) {
         int var5 = var3.field2696[var4];
         if (var5 == 5 && var1.field1649 != null && var1.field1649[var4] != null && var1.field1649[var4][0] != null && this.field4071 != null && this.field4090 != null) {
            class360 var6 = var1.field1649[var4][0];
            int[] var7 = var3.field2697[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.field4071.length) {
                  int[] var11 = this.field4071[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.field4090[var13] & 255) + var6.method1722(var2) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.field4090[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void method2363(class348 var1, int var2) {
      this.method2375(var1, var2);
   }

   public void method2370(class405 var1, int var2, class405 var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            class149 var6 = var1.field3531[var2];
            class149 var7 = var3.field3531[var4];
            class268 var8 = var6.field1570;
            field4100 = 0;
            field4101 = 0;
            field4045 = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field1571; ++var11) {
               for(var12 = var6.field1572[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if (var12 != var10 || var8.field2696[var12] == 0) {
                  this.method2364(var8.field2696[var12], var8.field2697[var12], var6.field1566[var11], var6.field1574[var11], var6.field1575[var11]);
               }
            }

            field4100 = 0;
            field4101 = 0;
            field4045 = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.field1571; ++var11) {
               for(var12 = var7.field1572[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if (var12 == var10 || var8.field2696[var12] == 0) {
                  this.method2364(var8.field2696[var12], var8.field2697[var12], var7.field1566[var11], var7.field1574[var11], var7.field1575[var11]);
               }
            }

            this.method2384();
         } else {
            this.method2361(var1, var2);
         }
      }
   }

   public void method2383(class268 var1, class159 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class348 var7 = var1.method1273();
      if (var7 != null) {
         var7.method1673(var2, var3, var4, var5);
         if (var6) {
            this.method2363(var7, var2.method844());
         }
      }

      if (!var5 && var2.method839()) {
         this.method2362(var2, var3);
      }

   }

   public void method2365(class405 var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.method2361(var1, var2);
      } else {
         class149 var5 = var1.field3531[var2];
         class268 var6 = var5.field1570;
         byte var7 = 0;
         int var11 = var7 + 1;
         int var8 = var3[var7];
         field4100 = 0;
         field4101 = 0;
         field4045 = 0;

         for(int var9 = 0; var9 < var5.field1571; ++var9) {
            int var10;
            for(var10 = var5.field1572[var9]; var10 > var8; var8 = var3[var11++]) {
               ;
            }

            if (var4) {
               if (var10 == var8 || var6.field2696[var10] == 0) {
                  this.method2364(var6.field2696[var10], var6.field2697[var10], var5.field1566[var9], var5.field1574[var9], var5.field1575[var9]);
               }
            } else if (var10 != var8 || var6.field2696[var10] == 0) {
               this.method2364(var6.field2696[var10], var6.field2697[var10], var5.field1566[var9], var5.field1574[var9], var5.field1575[var9]);
            }
         }

      }
   }

   void method2364(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         field4100 = 0;
         field4101 = 0;
         field4045 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.field4070.length) {
               int[] var19 = this.field4070[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  field4100 += this.field4077[var12];
                  field4101 += this.field4083[var12];
                  field4045 += this.field4099[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            field4100 = field4100 / var7 + var3;
            field4101 = field4101 / var7 + var4;
            field4045 = field4045 / var7 + var5;
         } else {
            field4100 = var3;
            field4101 = var4;
            field4045 = var5;
         }

      } else {
         int[] var9;
         int var10;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field4070.length) {
                  var9 = this.field4070[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field4077[var11] += var3;
                     this.field4083[var11] += var4;
                     this.field4099[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field4070.length) {
                  var9 = this.field4070[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field4077[var11] -= field4100;
                     this.field4083[var11] -= field4101;
                     this.field4099[var11] -= field4045;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = field4085[var14];
                        var16 = field4105[var14];
                        var17 = this.field4083[var11] * var15 + this.field4077[var11] * var16 >> 16;
                        this.field4083[var11] = this.field4083[var11] * var16 - this.field4077[var11] * var15 >> 16;
                        this.field4077[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field4085[var12];
                        var16 = field4105[var12];
                        var17 = this.field4083[var11] * var16 - this.field4099[var11] * var15 >> 16;
                        this.field4099[var11] = this.field4083[var11] * var15 + this.field4099[var11] * var16 >> 16;
                        this.field4083[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field4085[var13];
                        var16 = field4105[var13];
                        var17 = this.field4099[var11] * var15 + this.field4077[var11] * var16 >> 16;
                        this.field4099[var11] = this.field4099[var11] * var16 - this.field4077[var11] * var15 >> 16;
                        this.field4077[var11] = var17;
                     }

                     this.field4077[var11] += field4100;
                     this.field4083[var11] += field4101;
                     this.field4099[var11] += field4045;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field4070.length) {
                  var9 = this.field4070[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field4077[var11] -= field4100;
                     this.field4083[var11] -= field4101;
                     this.field4099[var11] -= field4045;
                     this.field4077[var11] = this.field4077[var11] * var3 / 128;
                     this.field4083[var11] = this.field4083[var11] * var4 / 128;
                     this.field4099[var11] = this.field4099[var11] * var5 / 128;
                     this.field4077[var11] += field4100;
                     this.field4083[var11] += field4101;
                     this.field4099[var11] += field4045;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.field4071 != null && this.field4090 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.field4071.length) {
                     var9 = this.field4071[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.field4090[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.field4090[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   public void method2366() {
      for(int var1 = 0; var1 < this.field4050; ++var1) {
         int var2 = this.field4077[var1];
         this.field4077[var1] = this.field4099[var1];
         this.field4099[var1] = -var2;
      }

      this.method2384();
   }

   public void method2367() {
      for(int var1 = 0; var1 < this.field4050; ++var1) {
         this.field4077[var1] = -this.field4077[var1];
         this.field4099[var1] = -this.field4099[var1];
      }

      this.method2384();
   }

   public void method2385() {
      for(int var1 = 0; var1 < this.field4050; ++var1) {
         int var2 = this.field4099[var1];
         this.field4099[var1] = this.field4077[var1];
         this.field4077[var1] = -var2;
      }

      this.method2384();
   }

   public void method2380(int var1) {
      int var2 = field4085[var1];
      int var3 = field4105[var1];

      for(int var4 = 0; var4 < this.field4050; ++var4) {
         int var5 = this.field4083[var4] * var3 - this.field4099[var4] * var2 >> 16;
         this.field4099[var4] = this.field4083[var4] * var2 + this.field4099[var4] * var3 >> 16;
         this.field4083[var4] = var5;
      }

      this.method2384();
   }

   public void method2372(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field4050; ++var4) {
         this.field4077[var4] += var1;
         this.field4083[var4] += var2;
         this.field4099[var4] += var3;
      }

      this.method2384();
   }

   public void method2379(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field4050; ++var4) {
         this.field4077[var4] = this.field4077[var4] * var1 / 128;
         this.field4083[var4] = this.field4083[var4] * var2 / 128;
         this.field4099[var4] = this.field4099[var4] * var3 / 128;
      }

      this.method2384();
   }

   public final void method2369(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.field4075 != 2 && this.field4075 != 1) {
         this.method2359();
      }

      int var8 = class234.field2531;
      int var9 = class234.field2543;
      int var10 = field4085[var1];
      int var11 = field4105[var1];
      int var12 = field4085[var2];
      int var13 = field4105[var2];
      int var14 = field4085[var3];
      int var15 = field4105[var3];
      int var16 = field4085[var4];
      int var17 = field4105[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.field4050; ++var19) {
         int var20 = this.field4077[var19];
         int var21 = this.field4083[var19];
         int var22 = this.field4099[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field4051[var19] = var22 - var18;
         field4093[var19] = var8 + var20 * class234.field2530 / var22;
         field4084[var19] = var9 + var23 * class234.field2530 / var22;
         if (this.field4098 > 0) {
            field4086[var19] = var20;
            field4087[var19] = var23;
            field4052[var19] = var22;
         }
      }

      try {
         this.method2371(false, false, false, 0L);
      } catch (Exception var24) {
         ;
      }

   }

   public final void method2376(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field4075 != 2 && this.field4075 != 1) {
         this.method2359();
      }

      int var9 = class234.field2531;
      int var10 = class234.field2543;
      int var11 = field4085[var1];
      int var12 = field4105[var1];
      int var13 = field4085[var2];
      int var14 = field4105[var2];
      int var15 = field4085[var3];
      int var16 = field4105[var3];
      int var17 = field4085[var4];
      int var18 = field4105[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.field4050; ++var20) {
         int var21 = this.field4077[var20];
         int var22 = this.field4083[var20];
         int var23 = this.field4099[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field4051[var20] = var23 - var19;
         field4093[var20] = var9 + var21 * class234.field2530 / var8;
         field4084[var20] = var10 + var24 * class234.field2530 / var8;
         if (this.field4098 > 0) {
            field4086[var20] = var21;
            field4087[var20] = var24;
            field4052[var20] = var23;
         }
      }

      try {
         this.method2371(false, false, false, 0L);
      } catch (Exception var25) {
         ;
      }

   }

   void method1195(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.field4075 != 1) {
         this.method2374();
      }

      this.method2386(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.field4059 * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.field4059) * class234.field2530;
         if (var16 / var14 < class234.field2536) {
            int var17 = (var15 + this.field4059) * class234.field2530;
            if (var17 / var14 > class234.field2524) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.field4059 * var2 >> 16;
               int var20 = var19 + (this.field4076 * var3 >> 16);
               int var21 = (var18 + var20) * class234.field2530;
               if (var21 / var14 > class234.field2537) {
                  int var22 = var19 + (super.field2554 * var3 >> 16);
                  int var23 = (var18 - var22) * class234.field2530;
                  if (var23 / var14 < class234.field2538) {
                     int var24 = var13 + (super.field2554 * var2 >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.field4098 > 0;
                     int var28 = class245.field2600;
                     int var30 = class245.field2607;
                     boolean var32 = class194.method1002();
                     boolean var33 = var9 != 0L && !class456.method2160(var9);
                     boolean var35 = false;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var53;
                     int var54;
                     int var55;
                     if (var33 && var32) {
                        boolean var36 = false;
                        if (field4103) {
                           boolean var37;
                           if (!class194.method1002()) {
                              var37 = false;
                           } else {
                              int var45;
                              int var46;
                              int var47;
                              int var48;
                              if (!class245.field2602) {
                                 var39 = class12.field65;
                                 var40 = class12.field87;
                                 var41 = class12.field85;
                                 var42 = class12.field86;
                                 byte var43 = 50;
                                 short var44 = 3500;
                                 var45 = var43 * (class245.field2600 - class234.field2531) / class234.field2530;
                                 var46 = (class245.field2607 - class234.field2543) * var43 / class234.field2530;
                                 var47 = var44 * (class245.field2600 - class234.field2531) / class234.field2530;
                                 var48 = (class245.field2607 - class234.field2543) * var44 / class234.field2530;
                                 int var49 = class234.method1183(var46, var43, var40, var39);
                                 var54 = class234.method1187(var46, var43, var40, var39);
                                 var46 = var49;
                                 var49 = class234.method1183(var48, var44, var40, var39);
                                 var55 = class234.method1187(var48, var44, var40, var39);
                                 var48 = var49;
                                 var49 = class234.method1185(var45, var54, var42, var41);
                                 var54 = class234.method1186(var45, var54, var42, var41);
                                 var45 = var49;
                                 var49 = class234.method1185(var47, var55, var42, var41);
                                 var55 = class234.method1186(var47, var55, var42, var41);
                                 class307.field2900 = (var49 + var45) / 2;
                                 class245.field2603 = (var48 + var46) / 2;
                                 class243.field2594 = (var54 + var55) / 2;
                                 class291.field2796 = (var49 - var45) / 2;
                                 class363.field3251 = (var48 - var46) / 2;
                                 class245.field2604 = (var55 - var54) / 2;
                                 class245.field2605 = Math.abs(class291.field2796);
                                 class346.field3167 = Math.abs(class363.field3251);
                                 class245.field2599 = Math.abs(class245.field2604);
                              }

                              class242 var52 = (class242)this.field4080.get(var1);
                              var40 = var6 + var52.field2589;
                              var41 = var52.field2585 + var7;
                              var42 = var8 + var52.field2586;
                              var54 = var52.field2587;
                              var55 = var52.field2588;
                              var45 = var52.field2584;
                              var46 = class307.field2900 - var40;
                              var47 = class245.field2603 - var41;
                              var48 = class243.field2594 - var42;
                              if (Math.abs(var46) > var54 + class245.field2605) {
                                 var37 = false;
                              } else if (Math.abs(var47) > var55 + class346.field3167) {
                                 var37 = false;
                              } else if (Math.abs(var48) > var45 + class245.field2599) {
                                 var37 = false;
                              } else if (Math.abs(class363.field3251 * var48 - class245.field2604 * var47) > var45 * class346.field3167 + var55 * class245.field2599) {
                                 var37 = false;
                              } else if (Math.abs(class245.field2604 * var46 - var48 * class291.field2796) > var54 * class245.field2599 + var45 * class245.field2605) {
                                 var37 = false;
                              } else if (Math.abs(class291.field2796 * var47 - var46 * class363.field3251) > class346.field3167 * var54 + class245.field2605 * var55) {
                                 var37 = false;
                              } else {
                                 var37 = true;
                              }
                           }

                           var36 = var37;
                        } else {
                           var53 = var12 - var13;
                           if (var53 <= 50) {
                              var53 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var53;
                           } else {
                              var17 /= var14;
                              var16 /= var53;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var53;
                           } else {
                              var21 /= var14;
                              var23 /= var53;
                           }

                           var38 = var28 - class234.field2531;
                           var39 = var30 - class234.field2543;
                           if (var38 > var16 && var38 < var17 && var39 > var23 && var39 < var21) {
                              var36 = true;
                           }
                        }

                        if (var36) {
                           if (this.field4074) {
                              class418.method2010(var9);
                           } else {
                              var35 = true;
                           }
                        }
                     }

                     int var51 = class234.field2531;
                     var53 = class234.field2543;
                     var38 = 0;
                     var39 = 0;
                     if (var1 != 0) {
                        var38 = field4085[var1];
                        var39 = field4105[var1];
                     }

                     for(var40 = 0; var40 < this.field4050; ++var40) {
                        var41 = this.field4077[var40];
                        var42 = this.field4083[var40];
                        var54 = this.field4099[var40];
                        if (var1 != 0) {
                           var55 = var54 * var38 + var41 * var39 >> 16;
                           var54 = var54 * var39 - var41 * var38 >> 16;
                           var41 = var55;
                        }

                        var41 += var6;
                        var42 += var7;
                        var54 += var8;
                        var55 = var54 * var4 + var41 * var5 >> 16;
                        var54 = var54 * var5 - var41 * var4 >> 16;
                        var41 = var55;
                        var55 = var42 * var3 - var54 * var2 >> 16;
                        var54 = var42 * var2 + var54 * var3 >> 16;
                        field4051[var40] = var54 - var12;
                        if (var54 >= 50) {
                           field4093[var40] = var51 + var41 * class234.field2530 / var54;
                           field4084[var40] = var53 + var55 * class234.field2530 / var54;
                        } else {
                           field4093[var40] = -5000;
                           var25 = true;
                        }

                        if (var27) {
                           field4086[var40] = var41;
                           field4087[var40] = var55;
                           field4052[var40] = var54;
                        }
                     }

                     try {
                        this.method2371(var25, var35, this.field4074, var9);
                     } catch (Exception var50) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   final void method2371(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field4062 < 6000) {
         int var6;
         for(var6 = 0; var6 < this.field4062; ++var6) {
            field4096[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(char var7 = 0; var7 < this.field4091; ++var7) {
            if (this.field4060[var7] != -2) {
               var8 = this.field4067[var7];
               var9 = this.field4063[var7];
               var10 = this.field4057[var7];
               var11 = field4093[var8];
               var12 = field4093[var9];
               var13 = field4093[var10];
               int var14;
               if (!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
                  if (var2 && class72.method398(field4084[var8], field4084[var9], field4084[var10], var11, var12, var13, var6)) {
                     class418.method2010(var4);
                     var2 = false;
                  }

                  if ((var11 - var12) * (field4084[var10] - field4084[var9]) - (field4084[var8] - field4084[var9]) * (var13 - var12) > 0) {
                     field4082[var7] = false;
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class234.field2533 && var12 <= class234.field2533 && var13 <= class234.field2533) {
                        field4081[var7] = false;
                     } else {
                        field4081[var7] = true;
                     }

                     var14 = (field4051[var8] + field4051[var9] + field4051[var10]) / 3 + this.field4079;
                     field4061[var14][field4096[var14]++] = var7;
                  }
               } else {
                  var14 = field4086[var8];
                  var15 = field4086[var9];
                  var16 = field4086[var10];
                  int var17 = field4087[var8];
                  var18 = field4087[var9];
                  int var19 = field4087[var10];
                  int var20 = field4052[var8];
                  int var21 = field4052[var9];
                  int var22 = field4052[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field4082[var7] = true;
                     int var26 = (field4051[var8] + field4051[var9] + field4051[var10]) / 3 + this.field4079;
                     field4061[var26][field4096[var26]++] = var7;
                  }
               }
            }
         }

         int var27;
         char var28;
         char[] var29;
         if (this.field4102 == null) {
            for(var27 = this.field4062 - 1; var27 >= 0; --var27) {
               var28 = field4096[var27];
               if (var28 > 0) {
                  var29 = field4061[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     this.method2368(var29[var10]);
                  }
               }
            }

         } else {
            for(var27 = 0; var27 < 12; ++var27) {
               field4053[var27] = 0;
               field4066[var27] = 0;
            }

            for(var27 = this.field4062 - 1; var27 >= 0; --var27) {
               var28 = field4096[var27];
               if (var28 > 0) {
                  var29 = field4061[var27];

                  for(var10 = 0; var10 < var28; ++var10) {
                     char var30 = var29[var10];
                     byte var31 = this.field4102[var30];
                     var13 = field4053[var31]++;
                     field4110[var31][var13] = var30;
                     if (var31 < 10) {
                        field4066[var31] += var27;
                     } else if (var31 == 10) {
                        field4094[var13] = var27;
                     } else {
                        field4095[var13] = var27;
                     }
                  }
               }
            }

            var27 = 0;
            if (field4053[1] > 0 || field4053[2] > 0) {
               var27 = (field4066[1] + field4066[2]) / (field4053[1] + field4053[2]);
            }

            var8 = 0;
            if (field4053[3] > 0 || field4053[4] > 0) {
               var8 = (field4066[3] + field4066[4]) / (field4053[3] + field4053[4]);
            }

            var9 = 0;
            if (field4053[6] > 0 || field4053[8] > 0) {
               var9 = (field4066[6] + field4066[8]) / (field4053[6] + field4053[8]);
            }

            var11 = 0;
            var12 = field4053[10];
            int[] var32 = field4110[10];
            int[] var33 = field4094;
            if (var11 == var12) {
               var11 = 0;
               var12 = field4053[11];
               var32 = field4110[11];
               var33 = field4095;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var27) {
                  this.method2368(var32[var11++]);
                  if (var11 == var12 && var32 != field4110[11]) {
                     var11 = 0;
                     var12 = field4053[11];
                     var32 = field4110[11];
                     var33 = field4095;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method2368(var32[var11++]);
                  if (var11 == var12 && var32 != field4110[11]) {
                     var11 = 0;
                     var12 = field4053[11];
                     var32 = field4110[11];
                     var33 = field4095;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method2368(var32[var11++]);
                  if (var11 == var12 && var32 != field4110[11]) {
                     var11 = 0;
                     var12 = field4053[11];
                     var32 = field4110[11];
                     var33 = field4095;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field4053[var15];
               int[] var34 = field4110[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method2368(var34[var18]);
               }
            }

            while(var10 != -1000) {
               this.method2368(var32[var11++]);
               if (var11 == var12 && var32 != field4110[11]) {
                  var11 = 0;
                  var32 = field4110[11];
                  var12 = field4053[11];
                  var33 = field4095;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   final void method2368(int var1) {
      if (field4082[var1]) {
         this.method2355(var1);
      } else {
         int var2 = this.field4067[var1];
         int var3 = this.field4063[var1];
         int var4 = this.field4057[var1];
         class234.field2539 = field4081[var1];
         if (this.field4090 == null) {
            class234.field2527 = 0;
         } else {
            class234.field2527 = this.field4090[var1] & 255;
         }

         this.method2381(var1, field4084[var2], field4084[var3], field4084[var4], field4093[var2], field4093[var3], field4093[var4], this.field4058[var1], this.field4092[var1], this.field4060[var1]);
      }
   }

   boolean method2382(int var1) {
      return this.field4055 > 0 && var1 < this.field4111;
   }

   final void method2381(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (this.field4089 != null && this.field4089[var1] != -1) {
         int var12;
         int var13;
         int var15;
         if (this.field4078 != null && this.field4078[var1] != -1) {
            int var14 = this.field4078[var1] & 255;
            var15 = this.field4054[var14];
            var12 = this.field4068[var14];
            var13 = this.field4069[var14];
         } else {
            var15 = this.field4067[var1];
            var12 = this.field4063[var1];
            var13 = this.field4057[var1];
         }

         if (this.field4060[var1] == -1) {
            class234.method1180(var2, var3, var4, var5, var6, var7, var8, var8, var8, field4086[var15], field4086[var12], field4086[var13], field4087[var15], field4087[var12], field4087[var13], field4052[var15], field4052[var12], field4052[var13], this.field4089[var1]);
         } else {
            class234.method1180(var2, var3, var4, var5, var6, var7, var8, var9, var10, field4086[var15], field4086[var12], field4086[var13], field4087[var15], field4087[var12], field4087[var13], field4052[var15], field4052[var12], field4052[var13], this.field4089[var1]);
         }
      } else {
         boolean var11 = this.method2382(var1);
         if (this.field4060[var1] == -1 && var11) {
            class234.method1178(var2, var3, var4, var5, var6, var7, field4056[this.field4058[var1]], this.field4107, this.field4108, this.field4109, this.field4055);
         } else if (this.field4060[var1] == -1) {
            class234.method1177(var2, var3, var4, var5, var6, var7, field4056[this.field4058[var1]]);
         } else if (var11) {
            class234.method1175(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.field4107, this.field4108, this.field4109, this.field4055);
         } else {
            class234.method1188(var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      }

   }

   final void method2355(int var1) {
      int var2 = class234.field2531;
      int var3 = class234.field2543;
      int var4 = 0;
      int var5 = this.field4067[var1];
      int var6 = this.field4063[var1];
      int var7 = this.field4057[var1];
      int var8 = field4052[var5];
      int var9 = field4052[var6];
      int var10 = field4052[var7];
      if (this.field4090 == null) {
         class234.field2527 = 0;
      } else {
         class234.field2527 = this.field4090[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field4097[var4] = field4093[var5];
         field4043[var4] = field4084[var5];
         field4088[var4++] = this.field4058[var1];
      } else {
         var11 = field4086[var5];
         var12 = field4087[var5];
         var13 = this.field4058[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * field4064[var10 - var8];
            field4097[var4] = var2 + (var11 + ((field4086[var7] - var11) * var14 >> 16)) * class234.field2530 / 50;
            field4043[var4] = var3 + (var12 + ((field4087[var7] - var12) * var14 >> 16)) * class234.field2530 / 50;
            field4088[var4++] = var13 + ((this.field4060[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * field4064[var9 - var8];
            field4097[var4] = var2 + (var11 + ((field4086[var6] - var11) * var14 >> 16)) * class234.field2530 / 50;
            field4043[var4] = var3 + (var12 + ((field4087[var6] - var12) * var14 >> 16)) * class234.field2530 / 50;
            field4088[var4++] = var13 + ((this.field4092[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field4097[var4] = field4093[var6];
         field4043[var4] = field4084[var6];
         field4088[var4++] = this.field4092[var1];
      } else {
         var11 = field4086[var6];
         var12 = field4087[var6];
         var13 = this.field4092[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * field4064[var8 - var9];
            field4097[var4] = var2 + (var11 + ((field4086[var5] - var11) * var14 >> 16)) * class234.field2530 / 50;
            field4043[var4] = var3 + (var12 + ((field4087[var5] - var12) * var14 >> 16)) * class234.field2530 / 50;
            field4088[var4++] = var13 + ((this.field4058[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * field4064[var10 - var9];
            field4097[var4] = var2 + (var11 + ((field4086[var7] - var11) * var14 >> 16)) * class234.field2530 / 50;
            field4043[var4] = var3 + (var12 + ((field4087[var7] - var12) * var14 >> 16)) * class234.field2530 / 50;
            field4088[var4++] = var13 + ((this.field4060[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field4097[var4] = field4093[var7];
         field4043[var4] = field4084[var7];
         field4088[var4++] = this.field4060[var1];
      } else {
         var11 = field4086[var7];
         var12 = field4087[var7];
         var13 = this.field4060[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * field4064[var9 - var10];
            field4097[var4] = var2 + (var11 + ((field4086[var6] - var11) * var14 >> 16)) * class234.field2530 / 50;
            field4043[var4] = var3 + (var12 + ((field4087[var6] - var12) * var14 >> 16)) * class234.field2530 / 50;
            field4088[var4++] = var13 + ((this.field4092[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * field4064[var8 - var10];
            field4097[var4] = var2 + (var11 + ((field4086[var5] - var11) * var14 >> 16)) * class234.field2530 / 50;
            field4043[var4] = var3 + (var12 + ((field4087[var5] - var12) * var14 >> 16)) * class234.field2530 / 50;
            field4088[var4++] = var13 + ((this.field4058[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field4097[0];
      var12 = field4097[1];
      var13 = field4097[2];
      var14 = field4043[0];
      int var15 = field4043[1];
      int var16 = field4043[2];
      class234.field2539 = false;
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class234.field2533 || var12 > class234.field2533 || var13 > class234.field2533) {
            class234.field2539 = true;
         }

         this.method2381(var1, var14, var15, var16, var11, var12, var13, field4088[0], field4088[1], field4088[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class234.field2533 || var12 > class234.field2533 || var13 > class234.field2533 || field4097[3] < 0 || field4097[3] > class234.field2533) {
            class234.field2539 = true;
         }

         int var18;
         if (this.field4089 != null && this.field4089[var1] != -1) {
            int var19;
            int var21;
            if (this.field4078 != null && this.field4078[var1] != -1) {
               int var20 = this.field4078[var1] & 255;
               var21 = this.field4054[var20];
               var18 = this.field4068[var20];
               var19 = this.field4069[var20];
            } else {
               var21 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var22 = this.field4089[var1];
            if (this.field4060[var1] == -1) {
               class234.method1180(var14, var15, var16, var11, var12, var13, this.field4058[var1], this.field4058[var1], this.field4058[var1], field4086[var21], field4086[var18], field4086[var19], field4087[var21], field4087[var18], field4087[var19], field4052[var21], field4052[var18], field4052[var19], var22);
               class234.method1180(var14, var16, field4043[3], var11, var13, field4097[3], this.field4058[var1], this.field4058[var1], this.field4058[var1], field4086[var21], field4086[var18], field4086[var19], field4087[var21], field4087[var18], field4087[var19], field4052[var21], field4052[var18], field4052[var19], var22);
            } else {
               class234.method1180(var14, var15, var16, var11, var12, var13, field4088[0], field4088[1], field4088[2], field4086[var21], field4086[var18], field4086[var19], field4087[var21], field4087[var18], field4087[var19], field4052[var21], field4052[var18], field4052[var19], var22);
               class234.method1180(var14, var16, field4043[3], var11, var13, field4097[3], field4088[0], field4088[2], field4088[3], field4086[var21], field4086[var18], field4086[var19], field4087[var21], field4087[var18], field4087[var19], field4052[var21], field4052[var18], field4052[var19], var22);
            }
         } else {
            boolean var17 = this.method2382(var1);
            if (this.field4060[var1] == -1 && var17) {
               var18 = field4056[this.field4058[var1]];
               class234.method1178(var14, var15, var16, var11, var12, var13, var18, this.field4107, this.field4108, this.field4109, this.field4055);
               class234.method1178(var14, var16, field4043[3], var11, var13, field4097[3], var18, this.field4107, this.field4108, this.field4109, this.field4055);
            } else if (this.field4060[var1] == -1) {
               var18 = field4056[this.field4058[var1]];
               class234.method1177(var14, var15, var16, var11, var12, var13, var18);
               class234.method1177(var14, var16, field4043[3], var11, var13, field4097[3], var18);
            } else if (var17) {
               class234.method1175(var14, var15, var16, var11, var12, var13, field4088[0], field4088[1], field4088[2], this.field4107, this.field4109, this.field4108, this.field4055);
               class234.method1175(var14, var16, field4043[3], var11, var13, field4097[3], field4088[0], field4088[2], field4088[3], this.field4107, this.field4109, this.field4108, this.field4055);
            } else {
               class234.method1188(var14, var15, var16, var11, var12, var13, field4088[0], field4088[1], field4088[2]);
               class234.method1188(var14, var16, field4043[3], var11, var13, field4097[3], field4088[0], field4088[2], field4088[3]);
            }
         }
      }

   }

   void method2373(int var1, class343 var2) {
      float var3 = (float)this.field4077[var1];
      float var4 = (float)(-this.field4083[var1]);
      float var5 = (float)(-this.field4099[var1]);
      float var6 = 1.0F;
      this.field4077[var1] = (int)(var2.field3152[0] * var3 + var2.field3152[4] * var4 + var2.field3152[8] * var5 + var2.field3152[12] * var6);
      this.field4083[var1] = -((int)(var2.field3152[1] * var3 + var2.field3152[5] * var4 + var2.field3152[9] * var5 + var2.field3152[13] * var6));
      this.field4099[var1] = -((int)(var2.field3152[2] * var3 + var2.field3152[6] * var4 + var2.field3152[10] * var5 + var2.field3152[14] * var6));
   }

   void method2375(class348 var1, int var2) {
      if (this.field4072 != null) {
         for(int var3 = 0; var3 < this.field4050; ++var3) {
            int[] var4 = this.field4072[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field4073[var3];
               field4047.method1644();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  class292 var8 = var1.method1670(var7);
                  if (var8 != null) {
                     field4048.method1646((float)var5[var6] / 255.0F);
                     field4049.method1645(var8.method1372(var2));
                     field4049.method1648(field4048);
                     field4047.method1655(field4049);
                  }
               }

               this.method2373(var3, field4047);
            }
         }

      }
   }
}
