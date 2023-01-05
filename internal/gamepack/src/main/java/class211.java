public final class class211 {
   public static byte[][][] field2368;
   static boolean field2375;
   boolean field2372 = true;
   int field2367;
   int field2369;
   int field2370;
   int field2371;
   int field2373;
   int field2374;

   class211(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field2374 = var1;
      this.field2373 = var2;
      this.field2369 = var3;
      this.field2370 = var4;
      this.field2371 = var5;
      this.field2367 = var6;
      this.field2372 = var7;
   }

   public static class420 method1105(int var0) {
      class420[] var2 = new class420[]{class420.field3567, class420.field3569, class420.field3566};
      class420[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class420 var5 = var3[var4];
         if (var5.field3568 == var0) {
            return var5;
         }
      }

      return null;
   }

   static int method1104(int var0, class472 var1, boolean var2) {
      if (var0 == 3800) {
         if (null != class449.field3690) {
            class150.field1580[++class188.field1989 - 1] = 1;
            class293.field2821 = class449.field3690;
         } else {
            class150.field1580[++class188.field1989 - 1] = 0;
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3801) {
            var4 = class150.field1580[--class188.field1989];
            if (client.field670[var4] != null) {
               class150.field1580[++class188.field1989 - 1] = 1;
               class293.field2821 = client.field670[var4];
            } else {
               class150.field1580[++class188.field1989 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            class150.field1581[++class150.field1582 - 1] = class293.field2821.field204;
            return 1;
         } else if (var0 == 3803) {
            class150.field1580[++class188.field1989 - 1] = class293.field2821.field206 ? 1 : 0;
            return 1;
         } else if (var0 == 3804) {
            class150.field1580[++class188.field1989 - 1] = class293.field2821.field207;
            return 1;
         } else if (var0 == 3805) {
            class150.field1580[++class188.field1989 - 1] = class293.field2821.field208;
            return 1;
         } else if (var0 == 3806) {
            class150.field1580[++class188.field1989 - 1] = class293.field2821.field211;
            return 1;
         } else if (var0 == 3807) {
            class150.field1580[++class188.field1989 - 1] = class293.field2821.field209;
            return 1;
         } else if (var0 == 3809) {
            class150.field1580[++class188.field1989 - 1] = class293.field2821.field210;
            return 1;
         } else if (var0 == 3810) {
            var4 = class150.field1580[--class188.field1989];
            class150.field1581[++class150.field1582 - 1] = class293.field2821.field214[var4];
            return 1;
         } else if (var0 == 3811) {
            var4 = class150.field1580[--class188.field1989];
            class150.field1580[++class188.field1989 - 1] = class293.field2821.field220[var4];
            return 1;
         } else if (var0 == 3812) {
            class150.field1580[++class188.field1989 - 1] = class293.field2821.field218;
            return 1;
         } else if (var0 == 3813) {
            var4 = class150.field1580[--class188.field1989];
            class150.field1581[++class150.field1582 - 1] = class293.field2821.field219[var4];
            return 1;
         } else {
            int var6;
            int var7;
            if (var0 == 3814) {
               class188.field1989 -= 3;
               var4 = class150.field1580[class188.field1989];
               var7 = class150.field1580[class188.field1989 + 1];
               var6 = class150.field1580[2 + class188.field1989];
               class150.field1580[++class188.field1989 - 1] = class293.field2821.method131(var4, var7, var6, (byte)43);
               return 1;
            } else if (var0 == 3815) {
               class150.field1580[++class188.field1989 - 1] = class293.field2821.field216;
               return 1;
            } else if (var0 == 3816) {
               class150.field1580[++class188.field1989 - 1] = class293.field2821.field217;
               return 1;
            } else if (var0 == 3817) {
               class150.field1580[++class188.field1989 - 1] = class293.field2821.method128(class150.field1581[--class150.field1582]);
               return 1;
            } else if (var0 == 3818) {
               class150.field1580[class188.field1989 - 1] = class293.field2821.method146()[class150.field1580[class188.field1989 - 1]];
               return 1;
            } else if (var0 == 3819) {
               class188.field1989 -= 2;
               var4 = class150.field1580[class188.field1989];
               var7 = class150.field1580[class188.field1989 + 1];
               class230.method1158(var7, var4);
               return 1;
            } else if (var0 == 3820) {
               var4 = class150.field1580[--class188.field1989];
               class150.field1580[++class188.field1989 - 1] = class293.field2821.field199[var4];
               return 1;
            } else {
               if (var0 == 3821) {
                  class188.field1989 -= 3;
                  var4 = class150.field1580[class188.field1989];
                  boolean var5 = 1 == class150.field1580[1 + class188.field1989];
                  var6 = class150.field1580[2 + class188.field1989];
                  class380.method1809(var6, var4, var5);
               }

               if (var0 == 3822) {
                  var4 = class150.field1580[--class188.field1989];
                  class150.field1580[++class188.field1989 - 1] = class293.field2821.field203[var4] ? 1 : 0;
                  return 1;
               } else if (var0 == 3850) {
                  if (null != class359.field3209) {
                     class150.field1580[++class188.field1989 - 1] = 1;
                     class359.field3207 = class359.field3209;
                  } else {
                     class150.field1580[++class188.field1989 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3851) {
                  var4 = class150.field1580[--class188.field1989];
                  if (client.field549[var4] != null) {
                     class150.field1580[++class188.field1989 - 1] = 1;
                     class359.field3207 = client.field549[var4];
                     class444.field3663 = var4;
                  } else {
                     class150.field1580[++class188.field1989 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  class150.field1581[++class150.field1582 - 1] = class359.field3207.field1392;
                  return 1;
               } else if (var0 == 3853) {
                  class150.field1580[++class188.field1989 - 1] = class359.field3207.field1395;
                  return 1;
               } else if (var0 == 3854) {
                  class150.field1580[++class188.field1989 - 1] = class359.field3207.field1393;
                  return 1;
               } else if (var0 == 3855) {
                  class150.field1580[++class188.field1989 - 1] = class359.field3207.method587();
                  return 1;
               } else if (var0 == 3856) {
                  var4 = class150.field1580[--class188.field1989];
                  class150.field1581[++class150.field1582 - 1] = ((class278)class359.field3207.field1397.get(var4)).field2757.method928();
                  return 1;
               } else if (var0 == 3857) {
                  var4 = class150.field1580[--class188.field1989];
                  class150.field1580[++class188.field1989 - 1] = ((class278)class359.field3207.field1397.get(var4)).field2759;
                  return 1;
               } else if (var0 == 3858) {
                  var4 = class150.field1580[--class188.field1989];
                  class150.field1580[++class188.field1989 - 1] = ((class278)class359.field3207.field1397.get(var4)).field2758;
                  return 1;
               } else if (var0 == 3859) {
                  var4 = class150.field1580[--class188.field1989];
                  class69.method391(class444.field3663, var4);
                  return 1;
               } else if (var0 == 3860) {
                  class150.field1580[++class188.field1989 - 1] = class359.field3207.method588(class150.field1581[--class150.field1582]);
                  return 1;
               } else if (var0 == 3861) {
                  class150.field1580[class188.field1989 - 1] = class359.field3207.method585()[class150.field1580[class188.field1989 - 1]];
                  return 1;
               } else if (var0 == 3890) {
                  class150.field1580[++class188.field1989 - 1] = null != class298.field2877 ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
