public class class89 extends class295 {
   class242 field763;
   int field757;
   int field758;
   int field759;
   int field760;
   int field761;
   int field762;
   int field764;
   int field765;

   class89(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class295 var9) {
      this.field762 = var1;
      this.field758 = var2;
      this.field759 = var3;
      this.field760 = var4;
      this.field757 = var5;
      this.field761 = var6;
      if (var7 != -1) {
         this.field763 = class271.method1277(var7);
         this.field765 = 0;
         this.field764 = client.field231 - 1;
         if (this.field763.field2026 == 0 && null != var9 && var9 instanceof class89) {
            class89 var10 = (class89)var9;
            if (this.field763 == var10.field763) {
               this.field765 = var10.field765;
               this.field764 = var10.field764;
               return;
            }
         }

         if (var8 && this.field763.field2046 != -1) {
            if (!this.field763.method1056()) {
               this.field765 = (int)(Math.random() * (double)this.field763.field2043.length);
               this.field764 -= (int)(Math.random() * (double)this.field763.field2037[this.field765]);
            } else {
               this.field765 = (int)(Math.random() * (double)this.field763.method1058());
            }
         }
      }

   }

   protected final class470 method1438() {
      int var3;
      if (null != this.field763) {
         int var2 = client.field231 - this.field764;
         if (var2 > 100 && this.field763.field2046 > 0) {
            var2 = 100;
         }

         if (this.field763.method1056()) {
            var3 = this.field763.method1058();
            this.field765 += var2;
            var2 = 0;
            if (this.field765 >= var3) {
               this.field765 = var3 - this.field763.field2046;
               if (this.field765 < 0 || this.field765 > var3) {
                  this.field763 = null;
               }
            }
         } else {
            label68: {
               do {
                  do {
                     if (var2 <= this.field763.field2037[this.field765]) {
                        break label68;
                     }

                     var2 -= this.field763.field2037[this.field765];
                     ++this.field765;
                  } while(this.field765 < this.field763.field2043.length);

                  this.field765 -= this.field763.field2046;
               } while(this.field765 >= 0 && this.field765 < this.field763.field2043.length);

               this.field763 = null;
            }
         }

         this.field764 = client.field231 - var2;
      }

      class87 var13 = class85.method356(this.field762);
      if (null != var13.field745) {
         var13 = var13.method372();
      }

      if (var13 == null) {
         return null;
      } else {
         int var4;
         if (this.field759 != 1 && this.field759 != 3) {
            var3 = var13.field720;
            var4 = var13.field721;
         } else {
            var3 = var13.field721;
            var4 = var13.field720;
         }

         int var5 = this.field757 + (var3 >> 1);
         int var6 = (var3 + 1 >> 1) + this.field757;
         int var7 = this.field761 + (var4 >> 1);
         int var8 = this.field761 + (var4 + 1 >> 1);
         int[][] var9 = class71.field636[this.field760];
         int var10 = var9[var6][var8] + var9[var5][var7] + var9[var6][var7] + var9[var5][var8] >> 2;
         int var11 = (var3 << 6) + (this.field757 << 7);
         int var12 = (var4 << 6) + (this.field761 << 7);
         return var13.method361(this.field758, this.field759, var9, var11, var10, var12, this.field763, this.field765);
      }
   }

   static final class385 method380(class127 var0, class385 var1) {
      int var3 = var0.method547();
      int var4;
      if (var1 == null) {
         var4 = class455.method2252(var3);
         var1 = new class385(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.method547() == 1;
         int var6 = var0.method551();
         Object var7;
         if (var5) {
            var7 = new class135(var0.method555());
         } else {
            var7 = new class245(var0.method595());
         }

         var1.method1896((class139)var7, (long)var6);
      }

      return var1;
   }

   static int method381(int var0) {
      class152 var2 = (class152)class100.field795.method1897((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return var2.field1735 == class100.field793.field4010 ? -1 : ((class152)var2.field1735).field1184;
      }
   }

   static void method379(int var0) {
      class201 var2 = (class201)class201.field1755.method791((long)var0);
      if (null != var2) {
         var2.method637();
      }
   }

   static class120 method378(int var0, class120 var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      class120 var9 = new class120();
      var9.field1026 = var0;
      var9.field912 = var1.field985;
      var9.field895 = var2;
      var9.field893 = true;
      var9.field940 = var3;
      var9.field1036 = var4;
      var9.field899 = var5;
      var9.field901 = var6;
      var9.field902 = (int)((float)var1.field908 * var7[0]);
      var9.field903 = (int)(var7[1] * (float)var1.field967);
      var9.field904 = (int)(var7[2] * (float)var1.field908);
      var9.field922 = (int)(var7[3] * (float)var1.field967);
      return var9;
   }
}
