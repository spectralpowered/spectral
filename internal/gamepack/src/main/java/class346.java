public class class346 {
   static int field3167;
   class164 field3168;
   class164 field3169;
   class95 field3170 = new class95(256);
   class95 field3171 = new class95(256);

   public class346(class164 var1, class164 var2) {
      this.field3169 = var1;
      this.field3168 = var2;
   }

   class388 method1660(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5;
      class388 var8 = (class388)this.field3170.method545(var6);
      if (var8 != null) {
         return var8;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class136 var9 = class136.method728(this.field3169, var1, var2);
         if (null == var9) {
            return null;
         } else {
            var8 = var9.method729();
            this.field3170.method542(var8, var6);
            if (var3 != null) {
               var3[0] -= var8.field3426.length;
            }

            return var8;
         }
      }
   }

   class388 method1662(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      class388 var8 = (class388)this.field3170.method545(var6);
      if (null != var8) {
         return var8;
      } else if (null != var3 && var3[0] <= 0) {
         return null;
      } else {
         class453 var9 = (class453)this.field3171.method545(var6);
         if (var9 == null) {
            var9 = class453.method2156(this.field3168, var1, var2);
            if (var9 == null) {
               return null;
            }

            this.field3171.method542(var9, var6);
         }

         var8 = var9.method2157(var3);
         if (null == var8) {
            return null;
         } else {
            var9.method567();
            this.field3170.method542(var8, var6);
            return var8;
         }
      }
   }

   public class388 method1661(int var1, int[] var2) {
      if (this.field3169.method880() == 1) {
         return this.method1660(0, var1, var2);
      } else if (this.field3169.method887(var1) == 1) {
         return this.method1660(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   public class388 method1663(int var1, int[] var2) {
      if (this.field3168.method880() == 1) {
         return this.method1662(0, var1, var2);
      } else if (this.field3168.method887(var1) == 1) {
         return this.method1662(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   static int method1665(int var0, class472 var1, boolean var2) {
      int var4;
      int var5;
      int var7;
      if (var0 == 3400) {
         class188.field1989 -= 2;
         var4 = class150.field1580[class188.field1989];
         var5 = class150.field1580[1 + class188.field1989];
         class438 var11 = class188.method977(var4);
         if (var11.field3625 != 's') {
            ;
         }

         for(var7 = 0; var7 < var11.field3628; ++var7) {
            if (var5 == var11.field3623[var7]) {
               class150.field1581[++class150.field1582 - 1] = var11.field3630[var7];
               var11 = null;
               break;
            }
         }

         if (null != var11) {
            class150.field1581[++class150.field1582 - 1] = var11.field3626;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var4 = class150.field1580[--class188.field1989];
            class438 var10 = class188.method977(var4);
            class150.field1580[++class188.field1989 - 1] = var10.method2092();
            return 1;
         } else {
            return 2;
         }
      } else {
         class188.field1989 -= 4;
         var4 = class150.field1580[class188.field1989];
         var5 = class150.field1580[1 + class188.field1989];
         int var6 = class150.field1580[2 + class188.field1989];
         var7 = class150.field1580[3 + class188.field1989];
         class438 var8 = class188.method977(var6);
         if (var4 == var8.field3624 && var8.field3625 == var5) {
            for(int var9 = 0; var9 < var8.field3628; ++var9) {
               if (var7 == var8.field3623[var9]) {
                  if (var5 == 115) {
                     class150.field1581[++class150.field1582 - 1] = var8.field3630[var9];
                  } else {
                     class150.field1580[++class188.field1989 - 1] = var8.field3631[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if (var8 != null) {
               if (var5 == 115) {
                  class150.field1581[++class150.field1582 - 1] = var8.field3626;
               } else {
                  class150.field1580[++class188.field1989 - 1] = var8.field3627;
               }
            }

            return 1;
         } else {
            if (var5 == 115) {
               class150.field1581[++class150.field1582 - 1] = class96.field1020;
            } else {
               class150.field1580[++class188.field1989 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static boolean method1664(byte var0) {
      boolean var10000;
      if ((client.field653 & 1) != 0) {
         if (var0 != -1) {
            throw new IllegalStateException();
         }

         var10000 = true;
      } else {
         var10000 = false;
      }

      return var10000;
   }

   static final void method1666(class210 var0, int var1, int var2, int var3) {
      class400 var5 = var0.method1074(false);
      if (null != var5) {
         if (client.field500 < 3) {
            class463.field3866.method1544(var1, var2, var5.field3511, var5.field3512, 25, 25, client.field505, 256, var5.field3513, var5.field3510);
         } else {
            class362.method1745(var1, var2, 0, var5.field3513, var5.field3510);
         }

      }
   }
}
