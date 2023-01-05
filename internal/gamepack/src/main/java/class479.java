public class class479 extends class236 {
   class79 field3978;
   int field3972;
   int field3973;
   int field3974;
   int field3975;
   int field3976;
   int field3977;
   int field3979;
   int field3980;

   class479(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class236 var9) {
      this.field3977 = var1;
      this.field3973 = var2;
      this.field3974 = var3;
      this.field3975 = var4;
      this.field3972 = var5;
      this.field3976 = var6;
      if (var7 != -1) {
         this.field3978 = class242.method1218(var7);
         this.field3980 = 0;
         this.field3979 = client.field435 - 1;
         if (this.field3978.field897 == 0 && null != var9 && var9 instanceof class479) {
            class479 var10 = (class479)var9;
            if (this.field3978 == var10.field3978) {
               this.field3980 = var10.field3980;
               this.field3979 = var10.field3979;
               return;
            }
         }

         if (var8 && this.field3978.field917 != -1) {
            if (!this.field3978.method426()) {
               this.field3980 = (int)(Math.random() * (double)this.field3978.field914.length);
               this.field3979 -= (int)(Math.random() * (double)this.field3978.field908[this.field3980]);
            } else {
               this.field3980 = (int)(Math.random() * (double)this.field3978.method428());
            }
         }
      }

   }

   protected final class491 method1194() {
      int var3;
      if (null != this.field3978) {
         int var2 = client.field435 - this.field3979;
         if (var2 > 100 && this.field3978.field917 > 0) {
            var2 = 100;
         }

         if (this.field3978.method426()) {
            var3 = this.field3978.method428();
            this.field3980 += var2;
            var2 = 0;
            if (this.field3980 >= var3) {
               this.field3980 = var3 - this.field3978.field917;
               if (this.field3980 < 0 || this.field3980 > var3) {
                  this.field3978 = null;
               }
            }
         } else {
            label68: {
               do {
                  do {
                     if (var2 <= this.field3978.field908[this.field3980]) {
                        break label68;
                     }

                     var2 -= this.field3978.field908[this.field3980];
                     ++this.field3980;
                  } while(this.field3980 < this.field3978.field914.length);

                  this.field3980 -= this.field3978.field917;
               } while(this.field3980 >= 0 && this.field3980 < this.field3978.field914.length);

               this.field3978 = null;
            }
         }

         this.field3979 = client.field435 - var2;
      }

      class173 var13 = class212.method1110(this.field3977);
      if (null != var13.field1903) {
         var13 = var13.method925();
      }

      if (var13 == null) {
         return null;
      } else {
         int var4;
         if (this.field3974 != 1 && this.field3974 != 3) {
            var3 = var13.field1878;
            var4 = var13.field1879;
         } else {
            var3 = var13.field1879;
            var4 = var13.field1878;
         }

         int var5 = this.field3972 + (var3 >> 1);
         int var6 = (var3 + 1 >> 1) + this.field3972;
         int var7 = this.field3976 + (var4 >> 1);
         int var8 = this.field3976 + (var4 + 1 >> 1);
         int[][] var9 = class74.field858[this.field3975];
         int var10 = var9[var6][var8] + var9[var5][var7] + var9[var6][var7] + var9[var5][var8] >> 2;
         int var11 = (var3 << 6) + (this.field3972 << 7);
         int var12 = (var4 << 6) + (this.field3976 << 7);
         return var13.method914(this.field3973, this.field3974, var9, var11, var10, var12, this.field3978, this.field3980);
      }
   }

   static final class376 method2314(class134 var0, class376 var1) {
      int var3 = var0.method669();
      int var4;
      if (var1 == null) {
         var4 = class476.method2306(var3);
         var1 = new class376(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.method669() == 1;
         int var6 = var0.method673();
         Object var7;
         if (var5) {
            var7 = new class232(var0.method677());
         } else {
            var7 = new class258(var0.method717());
         }

         var1.method1793((class106)var7, (long)var6);
      }

      return var1;
   }

   static int method2315(int var0) {
      class154 var2 = (class154)class58.field815.method1794((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return var2.field1369 == class58.field813.field1564 ? -1 : ((class154)var2.field1369).field1612;
      }
   }

   static void method2313(int var0) {
      class233 var2 = (class233)class233.field2522.method545((long)var0);
      if (null != var2) {
         var2.method567();
      }
   }

   static class210 method2312(int var0, class210 var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      class210 var9 = new class210();
      var9.field2348 = var0;
      var9.field2234 = var1.field2307;
      var9.field2217 = var2;
      var9.field2215 = true;
      var9.field2262 = var3;
      var9.field2358 = var4;
      var9.field2221 = var5;
      var9.field2223 = var6;
      var9.field2224 = (int)((float)var1.field2230 * var7[0]);
      var9.field2225 = (int)(var7[1] * (float)var1.field2289);
      var9.field2226 = (int)(var7[2] * (float)var1.field2230);
      var9.field2244 = (int)(var7[3] * (float)var1.field2289);
      return var9;
   }
}
