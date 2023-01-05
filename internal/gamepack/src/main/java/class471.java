public class class471 {
   public static final char[] field3959 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   static byte[][][] field3958;
   static class266[] field3962;
   static class38 field3963;
   static int field3960;
   static int field3961;

   static int method2330(int var0, class461 var1, boolean var2) {
      int var4;
      if (var0 == 3903) {
         var4 = class386.field3248[--class161.field1227];
         class386.field3248[++class161.field1227 - 1] = client.field429[var4].method1658();
         return 1;
      } else if (var0 == 3904) {
         var4 = class386.field3248[--class161.field1227];
         class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2567;
         return 1;
      } else if (var0 == 3905) {
         var4 = class386.field3248[--class161.field1227];
         class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2568;
         return 1;
      } else if (var0 == 3906) {
         var4 = class386.field3248[--class161.field1227];
         class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2569;
         return 1;
      } else if (var0 == 3907) {
         var4 = class386.field3248[--class161.field1227];
         class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2571;
         return 1;
      } else if (var0 == 3908) {
         var4 = class386.field3248[--class161.field1227];
         class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2566;
         return 1;
      } else {
         int var14;
         if (var0 == 3910) {
            var4 = class386.field3248[--class161.field1227];
            var14 = client.field429[var4].method1656();
            class386.field3248[++class161.field1227 - 1] = var14 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var4 = class386.field3248[--class161.field1227];
            var14 = client.field429[var4].method1656();
            class386.field3248[++class161.field1227 - 1] = var14 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var4 = class386.field3248[--class161.field1227];
            var14 = client.field429[var4].method1656();
            class386.field3248[++class161.field1227 - 1] = var14 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var4 = class386.field3248[--class161.field1227];
            var14 = client.field429[var4].method1656();
            class386.field3248[++class161.field1227 - 1] = var14 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == 3914) {
               var12 = class386.field3248[--class161.field1227] == 1;
               if (class201.field1756 != null) {
                  class201.field1756.method1756(class348.field2881, var12);
               }

               return 1;
            } else if (var0 == 3915) {
               var12 = class386.field3248[--class161.field1227] == 1;
               if (null != class201.field1756) {
                  class201.field1756.method1756(class348.field2879, var12);
               }

               return 1;
            } else if (var0 == 3916) {
               class161.field1227 -= 2;
               var12 = class386.field3248[class161.field1227] == 1;
               boolean var13 = class386.field3248[1 + class161.field1227] == 1;
               if (class201.field1756 != null) {
                  client.field509.field2371 = var13;
                  class201.field1756.method1756(client.field509, var12);
               }

               return 1;
            } else if (var0 == 3917) {
               var12 = class386.field3248[--class161.field1227] == 1;
               if (null != class201.field1756) {
                  class201.field1756.method1756(class348.field2883, var12);
               }

               return 1;
            } else if (var0 == 3918) {
               var12 = class386.field3248[--class161.field1227] == 1;
               if (class201.field1756 != null) {
                  class201.field1756.method1756(class348.field2882, var12);
               }

               return 1;
            } else if (var0 == 3919) {
               class386.field3248[++class161.field1227 - 1] = null == class201.field1756 ? 0 : class201.field1756.field2880.size();
               return 1;
            } else {
               class258 var5;
               if (var0 == 3920) {
                  var4 = class386.field3248[--class161.field1227];
                  var5 = (class258)class201.field1756.field2880.get(var4);
                  class386.field3248[++class161.field1227 - 1] = var5.field2106;
                  return 1;
               } else if (var0 == 3921) {
                  var4 = class386.field3248[--class161.field1227];
                  var5 = (class258)class201.field1756.field2880.get(var4);
                  class386.field3249[++class386.field3250 - 1] = var5.method1107();
                  return 1;
               } else if (var0 == 3922) {
                  var4 = class386.field3248[--class161.field1227];
                  var5 = (class258)class201.field1756.field2880.get(var4);
                  class386.field3249[++class386.field3250 - 1] = var5.method1106();
                  return 1;
               } else if (var0 == 3923) {
                  var4 = class386.field3248[--class161.field1227];
                  var5 = (class258)class201.field1756.field2880.get(var4);
                  long var6 = class152.method711() - class221.field1901 - var5.field2105;
                  int var8 = (int)(var6 / 3600000L);
                  int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                  int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * '\uea60')) / 1000L);
                  String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                  class386.field3249[++class386.field3250 - 1] = var11;
                  return 1;
               } else if (var0 == 3924) {
                  var4 = class386.field3248[--class161.field1227];
                  var5 = (class258)class201.field1756.field2880.get(var4);
                  class386.field3248[++class161.field1227 - 1] = var5.field2108.field2569;
                  return 1;
               } else if (var0 == 3925) {
                  var4 = class386.field3248[--class161.field1227];
                  var5 = (class258)class201.field1756.field2880.get(var4);
                  class386.field3248[++class161.field1227 - 1] = var5.field2108.field2568;
                  return 1;
               } else if (var0 == 3926) {
                  var4 = class386.field3248[--class161.field1227];
                  var5 = (class258)class201.field1756.field2880.get(var4);
                  class386.field3248[++class161.field1227 - 1] = var5.field2108.field2567;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static final void method2329(int var0, int var1) {
      class141 var3 = client.field360[class347.field2878][var0][var1];
      if (var3 == null) {
         class408.field3415.method1577(class347.field2878, var0, var1);
      } else {
         long var4 = -99999999L;
         class402 var6 = null;

         class402 var7;
         for(var7 = (class402)var3.method646(); null != var7; var7 = (class402)var3.method648()) {
            class263 var8 = class423.method2062(var7.field3387);
            long var9 = (long)var8.field2158;
            if (1 == var8.field2157) {
               var9 *= (long)(var7.field3385 + 1);
            }

            if (var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if (null == var6) {
            class408.field3415.method1577(class347.field2878, var0, var1);
         } else {
            var3.method643(var6);
            class402 var12 = null;
            class402 var13 = null;

            for(var7 = (class402)var3.method646(); var7 != null; var7 = (class402)var3.method648()) {
               if (var6.field3387 != var7.field3387) {
                  if (var12 == null) {
                     var12 = var7;
                  }

                  if (var12.field3387 != var7.field3387 && var13 == null) {
                     var13 = var7;
                  }
               }
            }

            long var10 = class214.method949(var0, var1, 3, false, 0);
            class408.field3415.method1566(class347.field2878, var0, var1, class327.method1666(var0 * 128 + 64, 64 + var1 * 128, class347.field2878), var6, var10, var12, var13);
         }
      }
   }

   static void method2328(boolean var0) {
      client.field380 = var0;
   }
}
