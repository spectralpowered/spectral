public class class77 extends class305 {
   final boolean field896;

   public class77(boolean var1) {
      this.field896 = var1;
   }

   int method416(class185 var1, class185 var2) {
      if (var1.field1978 == client.field599 && var2.field1978 == client.field599) {
         return this.field896 ? var1.field1980 - var2.field1980 : var2.field1980 - var1.field1980;
      } else {
         return this.method1440(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method416((class185)var1, (class185)var2);
   }

   public static boolean method418(int var0) {
      return 0 != (var0 >> 31 & 1);
   }

   static final void method417(class210[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class210 var4 = var0[var3];
         if (null != var4 && var4.field2234 == var1 && (!var4.field2215 || !class88.method481(var4))) {
            int var6;
            if (var4.field2348 == 0) {
               if (!var4.field2215 && class88.method481(var4) && var4 != class353.field3188) {
                  continue;
               }

               method417(var0, var4.field2307);
               if (var4.field2353 != null) {
                  method417(var4.field2353, var4.field2307);
               }

               class240 var5 = (class240)client.field598.method545((long)var4.field2307);
               if (null != var5) {
                  var6 = var5.field2580;
                  if (class25.method126(var6)) {
                     method417(class71.field853[var6], -1);
                  }
               }
            }

            if (var4.field2348 == 6) {
               if (-1 != var4.field2297 || var4.field2263 != -1) {
                  boolean var9 = class117.method611(var4);
                  if (var9) {
                     var6 = var4.field2263;
                  } else {
                     var6 = var4.field2297;
                  }

                  if (var6 != -1) {
                     class79 var7 = class242.method1218(var6);
                     if (!var7.method426()) {
                        for(var4.field2352 += client.field480; var4.field2352 > var7.field908[var4.field2351]; class214.method1117(var4)) {
                           var4.field2352 -= var7.field908[var4.field2351];
                           ++var4.field2351;
                           if (var4.field2351 >= var7.field914.length) {
                              var4.field2351 -= var7.field917;
                              if (var4.field2351 < 0 || var4.field2351 >= var7.field914.length) {
                                 var4.field2351 = 0;
                              }
                           }
                        }
                     } else {
                        var4.field2351 += client.field480;
                        int var8 = var7.method428();
                        if (var4.field2351 >= var8) {
                           var4.field2351 -= var7.field917;
                           if (var4.field2351 < 0 || var4.field2351 >= var8) {
                              var4.field2351 = 0;
                           }
                        }

                        class214.method1117(var4);
                     }
                  }
               }

               if (0 != var4.field2271 && !var4.field2215) {
                  int var10 = var4.field2271 >> 16;
                  var6 = var4.field2271 << 16 >> 16;
                  var10 *= client.field480;
                  var6 *= client.field480;
                  var4.field2282 = var10 + var4.field2282 & 2047;
                  var4.field2269 = var6 + var4.field2269 & 2047;
                  class214.method1117(var4);
               }
            }
         }
      }

   }
}
