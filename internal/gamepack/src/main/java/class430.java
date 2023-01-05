@ObfInfo(
   name = "ic"
)
public class class430 {
   @ObfInfo(
      owner = "ic",
      name = "m",
      desc = "Lic;"
   )
   public static final class430 field3568 = new class430("labels");
   @ObfInfo(
      owner = "ic",
      name = "e",
      desc = "Lic;"
   )
   public static final class430 field3569 = new class430("compositemap");
   @ObfInfo(
      owner = "ic",
      name = "v",
      desc = "Lic;"
   )
   public static final class430 field3572 = new class430("compositetexture");
   @ObfInfo(
      owner = "ic",
      name = "h",
      desc = "Lic;"
   )
   public static final class430 field3573 = new class430("details");
   @ObfInfo(
      owner = "ic",
      name = "x",
      desc = "Lic;"
   )
   static final class430 field3570 = new class430("area");
   @ObfInfo(
      owner = "ic",
      name = "q",
      desc = "Ljava/lang/String;"
   )
   public final String field3571;

   @ObfInfo(
      owner = "ic",
      name = "<init>",
      desc = "(Ljava/lang/String;)V"
   )
   class430(String var1) {
      this.field3571 = var1;
   }

   @ObfInfo(
      owner = "ic",
      name = "ba",
      desc = "([BI)[B"
   )
   static final byte[] method2120(byte[] var0) {
      class127 var2 = new class127(var0);
      int var3 = var2.method547();
      int var4 = var2.method595();
      if (var4 >= 0 && (class274.field2309 == 0 || var4 <= class274.field2309)) {
         if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method557(var7, 0, var4);
            return var7;
         } else {
            int var5 = var2.method595();
            if (var5 < 0 || class274.field2309 != 0 && var5 > class274.field2309) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var5];
               if (var3 == 1) {
                  class118.method464(var6, var5, var0, var4, 9);
               } else {
                  class274.field2311.method386(var2, var6);
               }

               return var6;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfInfo(
      owner = "ic",
      name = "ao",
      desc = "(ILbm;ZI)I"
   )
   static int method2121(int var0, class461 var1, boolean var2) {
      if (var0 == 3600) {
         if (0 == class240.field2021.field40) {
            class386.field3248[++class161.field1227 - 1] = -2;
         } else if (1 == class240.field2021.field40) {
            class386.field3248[++class161.field1227 - 1] = -1;
         } else {
            class386.field3248[++class161.field1227 - 1] = class240.field2021.field38.method1467();
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3601) {
            var4 = class386.field3248[--class161.field1227];
            if (class240.field2021.method52() && var4 >= 0 && var4 < class240.field2021.field38.method1467()) {
               class336 var8 = (class336)class240.field2021.field38.method1475(var4);
               class386.field3249[++class386.field3250 - 1] = var8.method1814();
               class386.field3249[++class386.field3250 - 1] = var8.method1818();
            } else {
               class386.field3249[++class386.field3250 - 1] = "";
               class386.field3249[++class386.field3250 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var4 = class386.field3248[--class161.field1227];
            if (class240.field2021.method52() && var4 >= 0 && var4 < class240.field2021.field38.method1467()) {
               class386.field3248[++class161.field1227 - 1] = ((class69)class240.field2021.field38.method1475(var4)).field627;
            } else {
               class386.field3248[++class161.field1227 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3603) {
            var4 = class386.field3248[--class161.field1227];
            if (class240.field2021.method52() && var4 >= 0 && var4 < class240.field2021.field38.method1467()) {
               class386.field3248[++class161.field1227 - 1] = ((class69)class240.field2021.field38.method1475(var4)).field628;
            } else {
               class386.field3248[++class161.field1227 - 1] = 0;
            }

            return 1;
         } else {
            String var9;
            if (var0 == 3604) {
               var9 = class386.field3249[--class386.field3250];
               int var7 = class386.field3248[--class161.field1227];
               class210.method910(var9, var7);
               return 1;
            } else if (var0 == 3605) {
               var9 = class386.field3249[--class386.field3250];
               class240.field2021.method46(var9);
               return 1;
            } else if (var0 == 3606) {
               var9 = class386.field3249[--class386.field3250];
               class240.field2021.method49(var9);
               return 1;
            } else if (var0 == 3607) {
               var9 = class386.field3249[--class386.field3250];
               class240.field2021.method55(var9);
               return 1;
            } else if (var0 == 3608) {
               var9 = class386.field3249[--class386.field3250];
               class240.field2021.method40(var9);
               return 1;
            } else if (var0 == 3609) {
               var9 = class386.field3249[--class386.field3250];
               var9 = class196.method871(var9);
               class386.field3248[++class161.field1227 - 1] = class240.field2021.method45(new class257(var9, class63.field619), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (class228.field1933 != null) {
                  class386.field3249[++class386.field3250 - 1] = class228.field1933.field85;
               } else {
                  class386.field3249[++class386.field3250 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (class228.field1933 != null) {
                  class386.field3248[++class161.field1227 - 1] = class228.field1933.method1467();
               } else {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var4 = class386.field3248[--class161.field1227];
               if (null != class228.field1933 && var4 < class228.field1933.method1467()) {
                  class386.field3249[++class386.field3250 - 1] = class228.field1933.method1475(var4).method1817().method1101();
               } else {
                  class386.field3249[++class386.field3250 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var4 = class386.field3248[--class161.field1227];
               if (null != class228.field1933 && var4 < class228.field1933.method1467()) {
                  class386.field3248[++class161.field1227 - 1] = ((class69)class228.field1933.method1475(var4)).method305();
               } else {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3615) {
               var4 = class386.field3248[--class161.field1227];
               if (null != class228.field1933 && var4 < class228.field1933.method1467()) {
                  class386.field3248[++class161.field1227 - 1] = ((class69)class228.field1933.method1475(var4)).field628;
               } else {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3616) {
               class386.field3248[++class161.field1227 - 1] = class228.field1933 != null ? class228.field1933.field87 : 0;
               return 1;
            } else if (var0 == 3617) {
               var9 = class386.field3249[--class386.field3250];
               class408.method1999(var9);
               return 1;
            } else if (var0 == 3618) {
               class386.field3248[++class161.field1227 - 1] = class228.field1933 != null ? class228.field1933.field86 : 0;
               return 1;
            } else if (var0 == 3619) {
               var9 = class386.field3249[--class386.field3250];
               class336.method1687(var9);
               return 1;
            } else if (var0 == 3620) {
               class472.method2338();
               return 1;
            } else if (var0 == 3621) {
               if (!class240.field2021.method52()) {
                  class386.field3248[++class161.field1227 - 1] = -1;
               } else {
                  class386.field3248[++class161.field1227 - 1] = class240.field2021.field39.method1467();
               }

               return 1;
            } else if (var0 == 3622) {
               var4 = class386.field3248[--class161.field1227];
               if (class240.field2021.method52() && var4 >= 0 && var4 < class240.field2021.field39.method1467()) {
                  class187 var5 = (class187)class240.field2021.field39.method1475(var4);
                  class386.field3249[++class386.field3250 - 1] = var5.method1814();
                  class386.field3249[++class386.field3250 - 1] = var5.method1818();
               } else {
                  class386.field3249[++class386.field3250 - 1] = "";
                  class386.field3249[++class386.field3250 - 1] = "";
               }

               return 1;
            } else if (var0 == 3623) {
               var9 = class386.field3249[--class386.field3250];
               var9 = class196.method871(var9);
               class386.field3248[++class161.field1227 - 1] = class240.field2021.method41(new class257(var9, class63.field619)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var4 = class386.field3248[--class161.field1227];
               if (null != class228.field1933 && var4 < class228.field1933.method1467() && class228.field1933.method1475(var4).method1817().equals(class113.field846.field3207)) {
                  class386.field3248[++class161.field1227 - 1] = 1;
               } else {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3625) {
               if (null != class228.field1933 && class228.field1933.field89 != null) {
                  class386.field3249[++class386.field3250 - 1] = class228.field1933.field89;
               } else {
                  class386.field3249[++class386.field3250 - 1] = "";
               }

               return 1;
            } else if (var0 == 3626) {
               var4 = class386.field3248[--class161.field1227];
               if (null != class228.field1933 && var4 < class228.field1933.method1467() && ((class469)class228.field1933.method1475(var4)).method2290()) {
                  class386.field3248[++class161.field1227 - 1] = 1;
               } else {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }

               return 1;
            } else if (var0 != 3627) {
               if (var0 == 3628) {
                  class240.field2021.field38.method1470();
                  return 1;
               } else {
                  boolean var6;
                  if (var0 == 3629) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class24(var6));
                     return 1;
                  } else if (var0 == 3630) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class93(var6));
                     return 1;
                  } else if (var0 == 3631) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class134(var6));
                     return 1;
                  } else if (var0 == 3632) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class443(var6));
                     return 1;
                  } else if (var0 == 3633) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class202(var6));
                     return 1;
                  } else if (var0 == 3634) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class61(var6));
                     return 1;
                  } else if (var0 == 3635) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class145(var6));
                     return 1;
                  } else if (var0 == 3636) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class288(var6));
                     return 1;
                  } else if (var0 == 3637) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class345(var6));
                     return 1;
                  } else if (var0 == 3638) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class81(var6));
                     return 1;
                  } else if (var0 == 3639) {
                     class240.field2021.field38.method1487();
                     return 1;
                  } else if (var0 == 3640) {
                     class240.field2021.field39.method1470();
                     return 1;
                  } else if (var0 == 3641) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field39.method1489(new class24(var6));
                     return 1;
                  } else if (var0 == 3642) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field39.method1489(new class93(var6));
                     return 1;
                  } else if (var0 == 3643) {
                     class240.field2021.field39.method1487();
                     return 1;
                  } else if (var0 == 3644) {
                     if (class228.field1933 != null) {
                        class228.field1933.method1470();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (null != class228.field1933) {
                        class228.field1933.method1489(new class24(var6));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (class228.field1933 != null) {
                        class228.field1933.method1489(new class93(var6));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (null != class228.field1933) {
                        class228.field1933.method1489(new class134(var6));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (class228.field1933 != null) {
                        class228.field1933.method1489(new class443(var6));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (null != class228.field1933) {
                        class228.field1933.method1489(new class202(var6));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (null != class228.field1933) {
                        class228.field1933.method1489(new class61(var6));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (null != class228.field1933) {
                        class228.field1933.method1489(new class145(var6));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (null != class228.field1933) {
                        class228.field1933.method1489(new class288(var6));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (null != class228.field1933) {
                        class228.field1933.method1489(new class345(var6));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (null != class228.field1933) {
                        class228.field1933.method1489(new class81(var6));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (class228.field1933 != null) {
                        class228.field1933.method1487();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     class240.field2021.field38.method1489(new class309(var6));
                     return 1;
                  } else if (var0 == 3657) {
                     var6 = class386.field3248[--class161.field1227] == 1;
                     if (class228.field1933 != null) {
                        class228.field1933.method1489(new class309(var6));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = class386.field3248[--class161.field1227];
               if (class228.field1933 != null && var4 < class228.field1933.method1467() && ((class469)class228.field1933.method1475(var4)).method2294()) {
                  class386.field3248[++class161.field1227 - 1] = 1;
               } else {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
