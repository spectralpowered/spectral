public class class101 extends class437 {
   static class120 field800;
   class141 field797 = new class141();
   class244 field799 = new class244();
   class491 field798;

   class101(class491 var1) {
      this.field798 = var1;
   }

   protected class437 method2168() {
      class458 var1 = (class458)this.field797.method646();
      if (null == var1) {
         return null;
      } else {
         return (class437)(null != var1.field3802 ? var1.field3802 : this.method2171());
      }
   }

   protected class437 method2171() {
      class458 var1;
      do {
         var1 = (class458)this.field797.method648();
         if (var1 == null) {
            return null;
         }
      } while(null == var1.field3802);

      return var1.field3802;
   }

   protected int method2173() {
      return 0;
   }

   protected void method2169(int[] var1, int var2, int var3) {
      this.field799.method2169(var1, var2, var3);

      for(class458 var6 = (class458)this.field797.method646(); null != var6; var6 = (class458)this.field797.method648()) {
         if (!this.field798.method2421(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field3803) {
                  this.method406(var6, var1, var4, var5, var4 + var5);
                  var6.field3803 -= var5;
                  break;
               }

               this.method406(var6, var1, var4, var6.field3803, var5 + var4);
               var4 += var6.field3803;
               var5 -= var6.field3803;
            } while(!this.field798.method2422(var6, var1, var4, var5));
         }
      }

   }

   protected void method2172(int var1) {
      this.field799.method2172(var1);

      for(class458 var3 = (class458)this.field797.method646(); null != var3; var3 = (class458)this.field797.method648()) {
         if (!this.field798.method2421(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field3803) {
                  this.method404(var3, var2);
                  var3.field3803 -= var2;
                  break;
               }

               this.method404(var3, var3.field3803);
               var2 -= var3.field3803;
            } while(!this.field798.method2422(var3, (int[])null, 0, var2));
         }
      }

   }

   void method406(class458 var1, int[] var2, int var3, int var4, int var5) {
      if ((this.field798.field4083[var1.field3797] & 4) != 0 && var1.field3785 < 0) {
         int var7 = this.field798.field4099[var1.field3797] / class233.field1985;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field3804) / var7;
            if (var8 > var4) {
               var1.field3804 += var4 * var7;
               break;
            }

            var1.field3802.method2169(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field3804 += var8 * var7 - 1048576;
            int var9 = class233.field1985 / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            class316 var11 = var1.field3802;
            if (0 == this.field798.field4085[var1.field3797]) {
               var1.field3802 = class316.method1560(var1.field3796, var11.method1529(), var11.method1552(), var11.method1531());
            } else {
               var1.field3802 = class316.method1560(var1.field3796, var11.method1529(), 0, var11.method1531());
               this.field798.method2425(var1, var1.field3787.field3378[var1.field3789] < 0);
               var1.field3802.method1525(var9, var11.method1552());
            }

            if (var1.field3787.field3378[var1.field3789] < 0) {
               var1.field3802.method1518(-1);
            }

            var11.method1527(var9);
            var11.method2169(var2, var3, var5 - var3);
            if (var11.method1554()) {
               this.field799.method1065(var11);
            }
         }
      }

      var1.field3802.method2169(var2, var3, var4);
   }

   void method404(class458 var1, int var2) {
      if ((this.field798.field4083[var1.field3797] & 4) != 0 && var1.field3785 < 0) {
         int var4 = this.field798.field4099[var1.field3797] / class233.field1985;
         int var5 = (var4 + 1048575 - var1.field3804) / var4;
         var1.field3804 = var2 * var4 + var1.field3804 & 1048575;
         if (var5 <= var2) {
            if (0 == this.field798.field4085[var1.field3797]) {
               var1.field3802 = class316.method1560(var1.field3796, var1.field3802.method1529(), var1.field3802.method1552(), var1.field3802.method1531());
            } else {
               var1.field3802 = class316.method1560(var1.field3796, var1.field3802.method1529(), 0, var1.field3802.method1531());
               this.field798.method2425(var1, var1.field3787.field3378[var1.field3789] < 0);
            }

            if (var1.field3787.field3378[var1.field3789] < 0) {
               var1.field3802.method1518(-1);
            }

            var2 = var1.field3804 / var4;
         }
      }

      var1.field3802.method2172(var2);
   }

   static int method407(int var0, int var1) {
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

   static int method401(int var0, class461 var1, boolean var2) {
      class120 var4 = var2 ? class108.field822 : class37.field183;
      if (var0 == 1700) {
         class386.field3248[++class161.field1227 - 1] = var4.field898;
         return 1;
      } else if (var0 == 1701) {
         if (var4.field898 != -1) {
            class386.field3248[++class161.field1227 - 1] = var4.field1028;
         } else {
            class386.field3248[++class161.field1227 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         class386.field3248[++class161.field1227 - 1] = var4.field895;
         return 1;
      } else if (var0 == 1707) {
         class386.field3248[++class161.field1227 - 1] = var4.method488() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return class102.method412(var4);
      } else {
         return var0 == 1709 ? class397.method1958(var4) : 2;
      }
   }
}
