public class class215 extends class183 {
   static class210 field2405;
   class396 field2404 = new class396();
   class397 field2402 = new class397();
   class489 field2403;

   class215(class489 var1) {
      this.field2403 = var1;
   }

   protected class183 method955() {
      class76 var1 = (class76)this.field2402.method1934();
      if (null == var1) {
         return null;
      } else {
         return (class183)(null != var1.field893 ? var1.field893 : this.method958());
      }
   }

   protected class183 method958() {
      class76 var1;
      do {
         var1 = (class76)this.field2402.method1936();
         if (var1 == null) {
            return null;
         }
      } while(null == var1.field893);

      return var1.field893;
   }

   protected int method960() {
      return 0;
   }

   protected void method956(int[] var1, int var2, int var3) {
      this.field2404.method956(var1, var2, var3);

      for(class76 var6 = (class76)this.field2402.method1934(); null != var6; var6 = (class76)this.field2402.method1936()) {
         if (!this.field2403.method2342(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field894) {
                  this.method1121(var6, var1, var4, var5, var4 + var5);
                  var6.field894 -= var5;
                  break;
               }

               this.method1121(var6, var1, var4, var6.field894, var5 + var4);
               var4 += var6.field894;
               var5 -= var6.field894;
            } while(!this.field2403.method2343(var6, var1, var4, var5));
         }
      }

   }

   protected void method959(int var1) {
      this.field2404.method959(var1);

      for(class76 var3 = (class76)this.field2402.method1934(); null != var3; var3 = (class76)this.field2402.method1936()) {
         if (!this.field2403.method2342(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field894) {
                  this.method1120(var3, var2);
                  var3.field894 -= var2;
                  break;
               }

               this.method1120(var3, var3.field894);
               var2 -= var3.field894;
            } while(!this.field2403.method2343(var3, (int[])null, 0, var2));
         }
      }

   }

   void method1121(class76 var1, int[] var2, int var3, int var4, int var5) {
      if ((this.field2403.field4011[var1.field888] & 4) != 0 && var1.field876 < 0) {
         int var7 = this.field2403.field4027[var1.field888] / class157.field1636;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field895) / var7;
            if (var8 > var4) {
               var1.field895 += var4 * var7;
               break;
            }

            var1.field893.method956(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field895 += var8 * var7 - 1048576;
            int var9 = class157.field1636 / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            class310 var11 = var1.field893;
            if (0 == this.field2403.field4013[var1.field888]) {
               var1.field893 = class310.method1488(var1.field887, var11.method1461(), var11.method1480(), var11.method1463());
            } else {
               var1.field893 = class310.method1488(var1.field887, var11.method1461(), 0, var11.method1463());
               this.field2403.method2346(var1, var1.field878.field2424[var1.field880] < 0);
               var1.field893.method1457(var9, var11.method1480());
            }

            if (var1.field878.field2424[var1.field880] < 0) {
               var1.field893.method1451(-1);
            }

            var11.method1459(var9);
            var11.method956(var2, var3, var5 - var3);
            if (var11.method1482()) {
               this.field2404.method1923(var11);
            }
         }
      }

      var1.field893.method956(var2, var3, var4);
   }

   void method1120(class76 var1, int var2) {
      if ((this.field2403.field4011[var1.field888] & 4) != 0 && var1.field876 < 0) {
         int var4 = this.field2403.field4027[var1.field888] / class157.field1636;
         int var5 = (var4 + 1048575 - var1.field895) / var4;
         var1.field895 = var2 * var4 + var1.field895 & 1048575;
         if (var5 <= var2) {
            if (0 == this.field2403.field4013[var1.field888]) {
               var1.field893 = class310.method1488(var1.field887, var1.field893.method1461(), var1.field893.method1480(), var1.field893.method1463());
            } else {
               var1.field893 = class310.method1488(var1.field887, var1.field893.method1461(), 0, var1.field893.method1463());
               this.field2403.method2346(var1, var1.field878.field2424[var1.field880] < 0);
            }

            if (var1.field878.field2424[var1.field880] < 0) {
               var1.field893.method1451(-1);
            }

            var2 = var1.field895 / var4;
         }
      }

      var1.field893.method959(var2);
   }

   static int method1122(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 'ﾀ');
      }
   }

   static int method1119(int var0, class472 var1, boolean var2) {
      class210 var4 = var2 ? class142.field1544 : class425.field3580;
      if (var0 == 1700) {
         class150.field1580[++class188.field1989 - 1] = var4.field2220;
         return 1;
      } else if (var0 == 1701) {
         if (var4.field2220 != -1) {
            class150.field1580[++class188.field1989 - 1] = var4.field2350;
         } else {
            class150.field1580[++class188.field1989 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         class150.field1580[++class188.field1989 - 1] = var4.field2217;
         return 1;
      } else if (var0 == 1707) {
         class150.field1580[++class188.field1989 - 1] = var4.method1079() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return class36.method185(var4);
      } else {
         return var0 == 1709 ? class298.method1410(var4) : 2;
      }
   }
}
