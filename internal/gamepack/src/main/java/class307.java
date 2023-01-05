public class class307 {
   public static final char[] field2898 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   static byte[][][] field2897;
   static class230 field2902;
   static class319[] field2901;
   static int field2899;
   static int field2900;

   static int method1444(int var0, class472 var1, boolean var2) {
      int var4;
      if (var0 == 3903) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = client.field633[var4].method152();
         return 1;
      } else if (var0 == 3904) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = client.field633[var4].field227;
         return 1;
      } else if (var0 == 3905) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = client.field633[var4].field228;
         return 1;
      } else if (var0 == 3906) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = client.field633[var4].field229;
         return 1;
      } else if (var0 == 3907) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = client.field633[var4].field231;
         return 1;
      } else if (var0 == 3908) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = client.field633[var4].field226;
         return 1;
      } else {
         int var14;
         if (var0 == 3910) {
            var4 = class150.field1580[--class188.field1989];
            var14 = client.field633[var4].method150();
            class150.field1580[++class188.field1989 - 1] = var14 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var4 = class150.field1580[--class188.field1989];
            var14 = client.field633[var4].method150();
            class150.field1580[++class188.field1989 - 1] = var14 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var4 = class150.field1580[--class188.field1989];
            var14 = client.field633[var4].method150();
            class150.field1580[++class188.field1989 - 1] = var14 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var4 = class150.field1580[--class188.field1989];
            var14 = client.field633[var4].method150();
            class150.field1580[++class188.field1989 - 1] = var14 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == 3914) {
               var12 = class150.field1580[--class188.field1989] == 1;
               if (class233.field2523 != null) {
                  class233.field2523.method1161(class231.field2515, var12);
               }

               return 1;
            } else if (var0 == 3915) {
               var12 = class150.field1580[--class188.field1989] == 1;
               if (null != class233.field2523) {
                  class233.field2523.method1161(class231.field2513, var12);
               }

               return 1;
            } else if (var0 == 3916) {
               class188.field1989 -= 2;
               var12 = class150.field1580[class188.field1989] == 1;
               boolean var13 = class150.field1580[1 + class188.field1989] == 1;
               if (class233.field2523 != null) {
                  client.field713.field2892 = var13;
                  class233.field2523.method1161(client.field713, var12);
               }

               return 1;
            } else if (var0 == 3917) {
               var12 = class150.field1580[--class188.field1989] == 1;
               if (null != class233.field2523) {
                  class233.field2523.method1161(class231.field2517, var12);
               }

               return 1;
            } else if (var0 == 3918) {
               var12 = class150.field1580[--class188.field1989] == 1;
               if (class233.field2523 != null) {
                  class233.field2523.method1161(class231.field2516, var12);
               }

               return 1;
            } else if (var0 == 3919) {
               class150.field1580[++class188.field1989 - 1] = null == class233.field2523 ? 0 : class233.field2523.field2514.size();
               return 1;
            } else {
               class87 var5;
               if (var0 == 3920) {
                  var4 = class150.field1580[--class188.field1989];
                  var5 = (class87)class233.field2523.field2514.get(var4);
                  class150.field1580[++class188.field1989 - 1] = var5.field971;
                  return 1;
               } else if (var0 == 3921) {
                  var4 = class150.field1580[--class188.field1989];
                  var5 = (class87)class233.field2523.field2514.get(var4);
                  class150.field1581[++class150.field1582 - 1] = var5.method473();
                  return 1;
               } else if (var0 == 3922) {
                  var4 = class150.field1580[--class188.field1989];
                  var5 = (class87)class233.field2523.field2514.get(var4);
                  class150.field1581[++class150.field1582 - 1] = var5.method472();
                  return 1;
               } else if (var0 == 3923) {
                  var4 = class150.field1580[--class188.field1989];
                  var5 = (class87)class233.field2523.field2514.get(var4);
                  long var6 = class154.method814() - class2.field7 - var5.field970;
                  int var8 = (int)(var6 / 3600000L);
                  int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                  int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * '\uea60')) / 1000L);
                  String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                  class150.field1581[++class150.field1582 - 1] = var11;
                  return 1;
               } else if (var0 == 3924) {
                  var4 = class150.field1580[--class188.field1989];
                  var5 = (class87)class233.field2523.field2514.get(var4);
                  class150.field1580[++class188.field1989 - 1] = var5.field973.field229;
                  return 1;
               } else if (var0 == 3925) {
                  var4 = class150.field1580[--class188.field1989];
                  var5 = (class87)class233.field2523.field2514.get(var4);
                  class150.field1580[++class188.field1989 - 1] = var5.field973.field228;
                  return 1;
               } else if (var0 == 3926) {
                  var4 = class150.field1580[--class188.field1989];
                  var5 = (class87)class233.field2523.field2514.get(var4);
                  class150.field1580[++class188.field1989 - 1] = var5.field973.field227;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static final void method1443(int var0, int var1) {
      class397 var3 = client.field564[class195.field2036][var0][var1];
      if (var3 == null) {
         class13.field126.method47(class195.field2036, var0, var1);
      } else {
         long var4 = -99999999L;
         class327 var6 = null;

         class327 var7;
         for(var7 = (class327)var3.method1934(); null != var7; var7 = (class327)var3.method1936()) {
            class458 var8 = class272.method1294(var7.field3053);
            long var9 = (long)var8.field3775;
            if (1 == var8.field3774) {
               var9 *= (long)(var7.field3051 + 1);
            }

            if (var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if (null == var6) {
            class13.field126.method47(class195.field2036, var0, var1);
         } else {
            var3.method1931(var6);
            class327 var12 = null;
            class327 var13 = null;

            for(var7 = (class327)var3.method1934(); var7 != null; var7 = (class327)var3.method1936()) {
               if (var6.field3053 != var7.field3053) {
                  if (var12 == null) {
                     var12 = var7;
                  }

                  if (var12.field3053 != var7.field3053 && var13 == null) {
                     var13 = var7;
                  }
               }
            }

            long var10 = class141.method764(var0, var1, 3, false, 0);
            class13.field126.method36(class195.field2036, var0, var1, class192.method991(var0 * 128 + 64, 64 + var1 * 128, class195.field2036), var6, var10, var12, var13);
         }
      }
   }

   static void method1442(boolean var0) {
      client.field584 = var0;
   }
}
