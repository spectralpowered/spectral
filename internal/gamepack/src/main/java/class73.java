@ObfInfo(
   name = "aj"
)
public class class73 {
   @ObfInfo(
      owner = "aj",
      name = "g",
      desc = "I"
   )
   static int field653;
   @ObfInfo(
      owner = "aj",
      name = "x",
      desc = "Lqp;"
   )
   class170 field656 = new class170(256);
   @ObfInfo(
      owner = "aj",
      name = "v",
      desc = "Lqp;"
   )
   class170 field657 = new class170(256);
   @ObfInfo(
      owner = "aj",
      name = "e",
      desc = "Lly;"
   )
   class274 field654;
   @ObfInfo(
      owner = "aj",
      name = "h",
      desc = "Lly;"
   )
   class274 field655;

   @ObfInfo(
      owner = "aj",
      name = "<init>",
      desc = "(Lly;Lly;)V"
   )
   public class73(class274 var1, class274 var2) {
      this.field655 = var1;
      this.field654 = var2;
   }

   @ObfInfo(
      owner = "aj",
      name = "h",
      desc = "(II[IB)Laf;"
   )
   class82 method316(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5;
      class82 var8 = (class82)this.field656.method791(var6);
      if (var8 != null) {
         return var8;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class351 var9 = class351.method1767(this.field655, var1, var2);
         if (null == var9) {
            return null;
         } else {
            var8 = var9.method1768();
            this.field656.method788(var8, var6);
            if (var3 != null) {
               var3[0] -= var8.field668.length;
            }

            return var8;
         }
      }
   }

   @ObfInfo(
      owner = "aj",
      name = "e",
      desc = "(II[II)Laf;"
   )
   class82 method318(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      class82 var8 = (class82)this.field656.method791(var6);
      if (null != var8) {
         return var8;
      } else if (null != var3 && var3[0] <= 0) {
         return null;
      } else {
         class370 var9 = (class370)this.field657.method791(var6);
         if (var9 == null) {
            var9 = class370.method1830(this.field654, var1, var2);
            if (var9 == null) {
               return null;
            }

            this.field657.method788(var9, var6);
         }

         var8 = var9.method1831(var3);
         if (null == var8) {
            return null;
         } else {
            var9.method637();
            this.field656.method788(var8, var6);
            return var8;
         }
      }
   }

   @ObfInfo(
      owner = "aj",
      name = "v",
      desc = "(I[II)Laf;"
   )
   public class82 method317(int var1, int[] var2) {
      if (this.field655.method1353() == 1) {
         return this.method316(0, var1, var2);
      } else if (this.field655.method1360(var1) == 1) {
         return this.method316(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfInfo(
      owner = "aj",
      name = "x",
      desc = "(I[II)Laf;"
   )
   public class82 method319(int var1, int[] var2) {
      if (this.field654.method1353() == 1) {
         return this.method318(0, var1, var2);
      } else if (this.field654.method1360(var1) == 1) {
         return this.method318(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfInfo(
      owner = "aj",
      name = "as",
      desc = "(ILbm;ZI)I"
   )
   static int method321(int var0, class461 var1, boolean var2) {
      int var4;
      int var5;
      int var7;
      if (var0 == 3400) {
         class161.field1227 -= 2;
         var4 = class386.field3248[class161.field1227];
         var5 = class386.field3248[1 + class161.field1227];
         class236 var11 = class161.method738(var4);
         if (var11.field1998 != 's') {
            ;
         }

         for(var7 = 0; var7 < var11.field2001; ++var7) {
            if (var5 == var11.field1996[var7]) {
               class386.field3249[++class386.field3250 - 1] = var11.field2003[var7];
               var11 = null;
               break;
            }
         }

         if (null != var11) {
            class386.field3249[++class386.field3250 - 1] = var11.field1999;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var4 = class386.field3248[--class161.field1227];
            class236 var10 = class161.method738(var4);
            class386.field3248[++class161.field1227 - 1] = var10.method1028();
            return 1;
         } else {
            return 2;
         }
      } else {
         class161.field1227 -= 4;
         var4 = class386.field3248[class161.field1227];
         var5 = class386.field3248[1 + class161.field1227];
         int var6 = class386.field3248[2 + class161.field1227];
         var7 = class386.field3248[3 + class161.field1227];
         class236 var8 = class161.method738(var6);
         if (var4 == var8.field1997 && var8.field1998 == var5) {
            for(int var9 = 0; var9 < var8.field2001; ++var9) {
               if (var7 == var8.field1996[var9]) {
                  if (var5 == 115) {
                     class386.field3249[++class386.field3250 - 1] = var8.field2003[var9];
                  } else {
                     class386.field3248[++class161.field1227 - 1] = var8.field2004[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if (var8 != null) {
               if (var5 == 115) {
                  class386.field3249[++class386.field3250 - 1] = var8.field1999;
               } else {
                  class386.field3248[++class161.field1227 - 1] = var8.field2000;
               }
            }

            return 1;
         } else {
            if (var5 == 115) {
               class386.field3249[++class386.field3250 - 1] = class177.field1325;
            } else {
               class386.field3248[++class161.field1227 - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfInfo(
      owner = "aj",
      name = "io",
      desc = "(B)Z"
   )
   static boolean method320(byte var0) {
      boolean var10000;
      if ((client.field449 & 1) != 0) {
         if (var0 != -1) {
            throw new IllegalStateException();
         }

         var10000 = true;
      } else {
         var10000 = false;
      }

      return var10000;
   }

   @ObfInfo(
      owner = "aj",
      name = "mg",
      desc = "(Lkd;IIII)V"
   )
   static final void method322(class120 var0, int var1, int var2, int var3) {
      class226 var5 = var0.method483(false);
      if (null != var5) {
         if (client.field296 < 3) {
            class432.field3591.method1236(var1, var2, var5.field1926, var5.field1927, 25, 25, client.field301, 256, var5.field1928, var5.field1925);
         } else {
            class162.method755(var1, var2, 0, var5.field1928, var5.field1925);
         }

      }
   }
}
