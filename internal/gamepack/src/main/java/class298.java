import java.util.Iterator;

public class class298 {
   static class318 field2877;
   static class420 field2878;
   static int field2875;
   class161[] field2863;
   int field2860 = 0;
   int field2862 = 0;
   int field2866 = 0;
   int field2867 = 0;
   int field2873 = 0;
   int field2876 = 0;
   int[] field2861;
   int[] field2864;
   int[] field2865 = new int[256];
   int[] field2868;
   int[] field2869;
   int[] field2870;
   int[] field2871;
   int[] field2872;
   int[] field2874;

   class298(class161[] var1) {
      this.field2863 = var1;
      this.method1404();
   }

   void method1404() {
      this.field2869 = new int[256];

      int var2;
      for(var2 = 0; var2 < 64; ++var2) {
         this.field2869[var2] = var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2869[var2 + 64] = var2 * 1024 + 16711680;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2869[var2 + 128] = 16776960 + var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2869[var2 + 192] = 16777215;
      }

      this.field2864 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2864[var2] = var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2864[var2 + 64] = var2 * 4 + '\uff00';
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2864[var2 + 128] = '\uffff' + var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2864[var2 + 192] = 16777215;
      }

      this.field2861 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2861[var2] = var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2861[var2 + 64] = var2 * 262144 + 255;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2861[var2 + 128] = 16711935 + var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field2861[var2 + 192] = 16777215;
      }

      this.field2874 = new int[256];
      this.field2860 = 0;
      this.field2870 = new int['耀'];
      this.field2871 = new int['耀'];
      this.method1409((class161)null);
      this.field2868 = new int['耀'];
      this.field2872 = new int['耀'];
   }

   void method1411() {
      this.field2869 = null;
      this.field2864 = null;
      this.field2861 = null;
      this.field2874 = null;
      this.field2870 = null;
      this.field2871 = null;
      this.field2868 = null;
      this.field2872 = null;
      this.field2860 = 0;
      this.field2873 = 0;
   }

   void method1406(int var1, int var2) {
      if (this.field2868 == null) {
         this.method1404();
      }

      if (this.field2866 == 0) {
         this.field2866 = var2;
      }

      int var4 = var2 - this.field2866;
      if (var4 >= 256) {
         var4 = 0;
      }

      this.field2866 = var2;
      if (var4 > 0) {
         this.method1407(var4);
      }

      this.method1405(var1);
   }

   final void method1407(int var1) {
      this.field2860 += var1 * 128;
      int var3;
      if (this.field2860 > this.field2870.length) {
         this.field2860 -= this.field2870.length;
         var3 = (int)(Math.random() * 12.0D);
         this.method1409(this.field2863[var3]);
      }

      var3 = 0;
      int var4 = var1 * 128;
      int var5 = (256 - var1) * 128;

      int var7;
      for(int var6 = 0; var6 < var5; ++var6) {
         var7 = this.field2868[var4 + var3] - var1 * this.field2870[var3 + this.field2860 & this.field2870.length - 1] / 6;
         if (var7 < 0) {
            var7 = 0;
         }

         this.field2868[var3++] = var7;
      }

      byte var16 = 10;
      var7 = 128 - var16;

      int var8;
      int var11;
      for(var8 = 256 - var1; var8 < 256; ++var8) {
         int var9 = var8 * 128;

         for(int var10 = 0; var10 < 128; ++var10) {
            var11 = (int)(Math.random() * 100.0D);
            if (var11 < 50 && var10 > var16 && var10 < var7) {
               this.field2868[var10 + var9] = 255;
            } else {
               this.field2868[var9 + var10] = 0;
            }
         }
      }

      if (this.field2876 > 0) {
         this.field2876 -= var1 * 4;
      }

      if (this.field2867 > 0) {
         this.field2867 -= var1 * 4;
      }

      if (this.field2876 == 0 && 0 == this.field2867) {
         var8 = (int)(Math.random() * (double)(2000 / var1));
         if (var8 == 0) {
            this.field2876 = 1024;
         }

         if (var8 == 1) {
            this.field2867 = 1024;
         }
      }

      for(var8 = 0; var8 < 256 - var1; ++var8) {
         this.field2865[var8] = this.field2865[var1 + var8];
      }

      for(var8 = 256 - var1; var8 < 256; ++var8) {
         this.field2865[var8] = (int)(Math.sin((double)this.field2862 / 14.0D) * 16.0D + Math.sin((double)this.field2862 / 15.0D) * 14.0D + Math.sin((double)this.field2862 / 16.0D) * 12.0D);
         ++this.field2862;
      }

      this.field2873 += var1;
      var8 = ((client.field435 & 1) + var1) / 2;
      if (var8 > 0) {
         short var17 = 128;
         byte var18 = 2;
         var11 = 128 - var18 - var18;

         int var12;
         int var13;
         int var14;
         for(var12 = 0; var12 < this.field2873 * 100; ++var12) {
            var13 = (int)(Math.random() * (double)var11) + var18;
            var14 = (int)(Math.random() * (double)var17) + var17;
            this.field2868[var13 + (var14 << 7)] = 192;
         }

         this.field2873 = 0;

         int var15;
         for(var12 = 0; var12 < 256; ++var12) {
            var13 = 0;
            var14 = var12 * 128;

            for(var15 = -var8; var15 < 128; ++var15) {
               if (var15 + var8 < 128) {
                  var13 += this.field2868[var8 + var14 + var15];
               }

               if (var15 - (var8 + 1) >= 0) {
                  var13 -= this.field2868[var14 + var15 - (var8 + 1)];
               }

               if (var15 >= 0) {
                  this.field2872[var15 + var14] = var13 / (var8 * 2 + 1);
               }
            }
         }

         for(var12 = 0; var12 < 128; ++var12) {
            var13 = 0;

            for(var14 = -var8; var14 < 256; ++var14) {
               var15 = var14 * 128;
               if (var8 + var14 < 256) {
                  var13 += this.field2872[var12 + var15 + var8 * 128];
               }

               if (var14 - (var8 + 1) >= 0) {
                  var13 -= this.field2872[var12 + var15 - (var8 + 1) * 128];
               }

               if (var14 >= 0) {
                  this.field2868[var15 + var12] = var13 / (var8 * 2 + 1);
               }
            }
         }
      }

   }

   final int method1414(int var1, int var2, int var3) {
      int var5 = 256 - var3;
      return (var5 * (var1 & 16711935) + (var2 & 16711935) * var3 & -16711936) + (var3 * (var2 & '\uff00') + (var1 & '\uff00') * var5 & 16711680) >> 8;
   }

   final void method1405(int var1) {
      int var3 = this.field2874.length;
      if (this.field2876 > 0) {
         this.method1408(this.field2876, this.field2864);
      } else if (this.field2867 > 0) {
         this.method1408(this.field2867, this.field2861);
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.field2874[var4] = this.field2869[var4];
         }
      }

      this.method1413(var1);
   }

   final void method1408(int var1, int[] var2) {
      int var4 = this.field2874.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         if (var1 > 768) {
            this.field2874[var5] = this.method1414(this.field2869[var5], var2[var5], 1024 - var1);
         } else if (var1 > 256) {
            this.field2874[var5] = var2[var5];
         } else {
            this.field2874[var5] = this.method1414(var2[var5], this.field2869[var5], 256 - var1);
         }
      }

   }

   final void method1413(int var1) {
      int var3 = 0;

      for(int var4 = 1; var4 < 255; ++var4) {
         int var5 = (256 - var4) * this.field2865[var4] / 256;
         int var6 = var1 + var5;
         int var7 = 0;
         int var8 = 128;
         if (var6 < 0) {
            var7 = -var6;
            var6 = 0;
         }

         if (var6 + 128 >= class204.field2184.field2193) {
            var8 = class204.field2184.field2193 - var6;
         }

         int var9 = var6 + (var4 + 8) * class204.field2184.field2193;
         var3 += var7;

         for(int var10 = var7; var10 < var8; ++var10) {
            int var11 = this.field2868[var3++];
            int var12 = var9 % class362.field3242;
            if (var11 != 0 && var12 >= class362.field3246 && var12 < class362.field3247) {
               int var13 = var11;
               int var14 = 256 - var11;
               var11 = this.field2874[var11];
               int var15 = class204.field2184.field2192[var9];
               class204.field2184.field2192[var9++] = -16777216 | ((var11 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var15 & '\uff00') * var14 + var13 * (var11 & '\uff00') & 16711680) >> 8;
            } else {
               ++var9;
            }
         }

         var3 += 128 - var8;
      }

   }

   final void method1409(class161 var1) {
      int var3;
      for(var3 = 0; var3 < this.field2870.length; ++var3) {
         this.field2870[var3] = 0;
      }

      int var4;
      for(var3 = 0; var3 < 5000; ++var3) {
         var4 = (int)(Math.random() * 128.0D * 256.0D);
         this.field2870[var4] = (int)(Math.random() * 256.0D);
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var4 = 1; var4 < 255; ++var4) {
            for(var5 = 1; var5 < 127; ++var5) {
               var6 = (var4 << 7) + var5;
               this.field2871[var6] = (this.field2870[var6 + 128] + this.field2870[var6 - 128] + this.field2870[var6 + 1] + this.field2870[var6 - 1]) / 4;
            }
         }

         int[] var9 = this.field2870;
         this.field2870 = this.field2871;
         this.field2871 = var9;
      }

      if (var1 != null) {
         var3 = 0;

         for(var4 = 0; var4 < var1.field1665; ++var4) {
            for(var5 = 0; var5 < var1.field1668; ++var5) {
               if (var1.field1662[var3++] != 0) {
                  var6 = var1.field1664 + var5 + 16;
                  int var7 = var1.field1667 + var4 + 16;
                  int var8 = var6 + (var7 << 7);
                  this.field2870[var8] = 0;
               }
            }
         }
      }

   }

   static String method1412() {
      StringBuilder var1 = new StringBuilder();

      class154 var3;
      for(Iterator var2 = class58.field815.iterator(); var2.hasNext(); var1.append(var3.field1616).append('\n')) {
         var3 = (class154)var2.next();
         if (null != var3.field1614 && !var3.field1614.isEmpty()) {
            var1.append(var3.field1614).append(':');
         }
      }

      return var1.toString();
   }

   static int method1410(class210 var0) {
      if (var0.field2348 != 11) {
         class150.field1581[class150.field1582 - 1] = "";
         return 1;
      } else {
         String var2 = class150.field1581[--class150.field1582];
         class150.field1581[++class150.field1582 - 1] = var0.method1078(var2);
         return 1;
      }
   }

   static class466 method1415(int var0) {
      class466 var2 = (class466)client.field641.method161((long)var0);
      if (null == var2) {
         var2 = new class466(class423.field3575, class36.method186(var0), class301.method1425(var0));
         client.field641.method163(var2, (long)var0);
      }

      return var2;
   }
}
