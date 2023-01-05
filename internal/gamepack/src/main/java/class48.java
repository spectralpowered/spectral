public class class48 {
   public static final class48 field416 = new class48("labels");
   public static final class48 field417 = new class48("compositemap");
   public static final class48 field420 = new class48("compositetexture");
   public static final class48 field421 = new class48("details");
   static final class48 field418 = new class48("area");
   public final String field419;

   class48(String var1) {
      this.field419 = var1;
   }

   static final byte[] method258(byte[] var0) {
      class134 var2 = new class134(var0);
      int var3 = var2.method669();
      int var4 = var2.method717();
      if (var4 >= 0 && (class164.field1713 == 0 || var4 <= class164.field1713)) {
         if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method679(var7, 0, var4);
            return var7;
         } else {
            int var5 = var2.method717();
            if (var5 < 0 || class164.field1713 != 0 && var5 > class164.field1713) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var5];
               if (var3 == 1) {
                  class266.method1265(var6, var5, var0, var4, 9);
               } else {
                  class164.field1715.method1994(var2, var6);
               }

               return var6;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   static int method259(int var0, class472 var1, boolean var2) {
      if (var0 == 3600) {
         if (0 == class321.field3026.field977) {
            class150.field1580[++class188.field1989 - 1] = -2;
         } else if (1 == class321.field3026.field977) {
            class150.field1580[++class188.field1989 - 1] = -1;
         } else {
            class150.field1580[++class188.field1989 - 1] = class321.field3026.field975.method188();
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3601) {
            var4 = class150.field1580[--class188.field1989];
            if (class321.field3026.method486() && var4 >= 0 && var4 < class321.field3026.field975.method188()) {
               class317 var8 = (class317)class321.field3026.field975.method196(var4);
               class150.field1581[++class150.field1582 - 1] = var8.method1060();
               class150.field1581[++class150.field1582 - 1] = var8.method1064();
            } else {
               class150.field1581[++class150.field1582 - 1] = "";
               class150.field1581[++class150.field1582 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var4 = class150.field1580[--class188.field1989];
            if (class321.field3026.method486() && var4 >= 0 && var4 < class321.field3026.field975.method188()) {
               class150.field1580[++class188.field1989 - 1] = ((class185)class321.field3026.field975.method196(var4)).field1978;
            } else {
               class150.field1580[++class188.field1989 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3603) {
            var4 = class150.field1580[--class188.field1989];
            if (class321.field3026.method486() && var4 >= 0 && var4 < class321.field3026.field975.method188()) {
               class150.field1580[++class188.field1989 - 1] = ((class185)class321.field3026.field975.method196(var4)).field1979;
            } else {
               class150.field1580[++class188.field1989 - 1] = 0;
            }

            return 1;
         } else {
            String var9;
            if (var0 == 3604) {
               var9 = class150.field1581[--class150.field1582];
               int var7 = class150.field1580[--class188.field1989];
               class15.method93(var9, var7);
               return 1;
            } else if (var0 == 3605) {
               var9 = class150.field1581[--class150.field1582];
               class321.field3026.method480(var9);
               return 1;
            } else if (var0 == 3606) {
               var9 = class150.field1581[--class150.field1582];
               class321.field3026.method483(var9);
               return 1;
            } else if (var0 == 3607) {
               var9 = class150.field1581[--class150.field1582];
               class321.field3026.method489(var9);
               return 1;
            } else if (var0 == 3608) {
               var9 = class150.field1581[--class150.field1582];
               class321.field3026.method474(var9);
               return 1;
            } else if (var0 == 3609) {
               var9 = class150.field1581[--class150.field1582];
               var9 = class247.method1224(var9);
               class150.field1580[++class188.field1989 - 1] = class321.field3026.method479(new class174(var9, class170.field1860), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (class103.field1350 != null) {
                  class150.field1581[++class150.field1582 - 1] = class103.field1350.field964;
               } else {
                  class150.field1581[++class150.field1582 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (class103.field1350 != null) {
                  class150.field1580[++class188.field1989 - 1] = class103.field1350.method188();
               } else {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var4 = class150.field1580[--class188.field1989];
               if (null != class103.field1350 && var4 < class103.field1350.method188()) {
                  class150.field1581[++class150.field1582 - 1] = class103.field1350.method196(var4).method1063().method928();
               } else {
                  class150.field1581[++class150.field1582 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var4 = class150.field1580[--class188.field1989];
               if (null != class103.field1350 && var4 < class103.field1350.method188()) {
                  class150.field1580[++class188.field1989 - 1] = ((class185)class103.field1350.method196(var4)).method968();
               } else {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3615) {
               var4 = class150.field1580[--class188.field1989];
               if (null != class103.field1350 && var4 < class103.field1350.method188()) {
                  class150.field1580[++class188.field1989 - 1] = ((class185)class103.field1350.method196(var4)).field1979;
               } else {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3616) {
               class150.field1580[++class188.field1989 - 1] = class103.field1350 != null ? class103.field1350.field966 : 0;
               return 1;
            } else if (var0 == 3617) {
               var9 = class150.field1581[--class150.field1582];
               class13.method85(var9);
               return 1;
            } else if (var0 == 3618) {
               class150.field1580[++class188.field1989 - 1] = class103.field1350 != null ? class103.field1350.field965 : 0;
               return 1;
            } else if (var0 == 3619) {
               var9 = class150.field1581[--class150.field1582];
               class317.method1527(var9);
               return 1;
            } else if (var0 == 3620) {
               class285.method1363();
               return 1;
            } else if (var0 == 3621) {
               if (!class321.field3026.method486()) {
                  class150.field1580[++class188.field1989 - 1] = -1;
               } else {
                  class150.field1580[++class188.field1989 - 1] = class321.field3026.field976.method188();
               }

               return 1;
            } else if (var0 == 3622) {
               var4 = class150.field1580[--class188.field1989];
               if (class321.field3026.method486() && var4 >= 0 && var4 < class321.field3026.field976.method188()) {
                  class423 var5 = (class423)class321.field3026.field976.method196(var4);
                  class150.field1581[++class150.field1582 - 1] = var5.method1060();
                  class150.field1581[++class150.field1582 - 1] = var5.method1064();
               } else {
                  class150.field1581[++class150.field1582 - 1] = "";
                  class150.field1581[++class150.field1582 - 1] = "";
               }

               return 1;
            } else if (var0 == 3623) {
               var9 = class150.field1581[--class150.field1582];
               var9 = class247.method1224(var9);
               class150.field1580[++class188.field1989 - 1] = class321.field3026.method475(new class174(var9, class170.field1860)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var4 = class150.field1580[--class188.field1989];
               if (null != class103.field1350 && var4 < class103.field1350.method188() && class103.field1350.method196(var4).method1063().equals(class89.field982.field401)) {
                  class150.field1580[++class188.field1989 - 1] = 1;
               } else {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3625) {
               if (null != class103.field1350 && class103.field1350.field968 != null) {
                  class150.field1581[++class150.field1582 - 1] = class103.field1350.field968;
               } else {
                  class150.field1581[++class150.field1582 - 1] = "";
               }

               return 1;
            } else if (var0 == 3626) {
               var4 = class150.field1580[--class188.field1989];
               if (null != class103.field1350 && var4 < class103.field1350.method188() && ((class221)class103.field1350.method196(var4)).method1133()) {
                  class150.field1580[++class188.field1989 - 1] = 1;
               } else {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            } else if (var0 != 3627) {
               if (var0 == 3628) {
                  class321.field3026.field975.method191();
                  return 1;
               } else {
                  boolean var6;
                  if (var0 == 3629) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class390(var6));
                     return 1;
                  } else if (var0 == 3630) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class197(var6));
                     return 1;
                  } else if (var0 == 3631) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class131(var6));
                     return 1;
                  } else if (var0 == 3632) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class265(var6));
                     return 1;
                  } else if (var0 == 3633) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class254(var6));
                     return 1;
                  } else if (var0 == 3634) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class447(var6));
                     return 1;
                  } else if (var0 == 3635) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class264(var6));
                     return 1;
                  } else if (var0 == 3636) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class175(var6));
                     return 1;
                  } else if (var0 == 3637) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class382(var6));
                     return 1;
                  } else if (var0 == 3638) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class77(var6));
                     return 1;
                  } else if (var0 == 3639) {
                     class321.field3026.field975.method208();
                     return 1;
                  } else if (var0 == 3640) {
                     class321.field3026.field976.method191();
                     return 1;
                  } else if (var0 == 3641) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field976.method210(new class390(var6));
                     return 1;
                  } else if (var0 == 3642) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field976.method210(new class197(var6));
                     return 1;
                  } else if (var0 == 3643) {
                     class321.field3026.field976.method208();
                     return 1;
                  } else if (var0 == 3644) {
                     if (class103.field1350 != null) {
                        class103.field1350.method191();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (null != class103.field1350) {
                        class103.field1350.method210(new class390(var6));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (class103.field1350 != null) {
                        class103.field1350.method210(new class197(var6));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (null != class103.field1350) {
                        class103.field1350.method210(new class131(var6));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (class103.field1350 != null) {
                        class103.field1350.method210(new class265(var6));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (null != class103.field1350) {
                        class103.field1350.method210(new class254(var6));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (null != class103.field1350) {
                        class103.field1350.method210(new class447(var6));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (null != class103.field1350) {
                        class103.field1350.method210(new class264(var6));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (null != class103.field1350) {
                        class103.field1350.method210(new class175(var6));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (null != class103.field1350) {
                        class103.field1350.method210(new class382(var6));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (null != class103.field1350) {
                        class103.field1350.method210(new class77(var6));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (class103.field1350 != null) {
                        class103.field1350.method208();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     class321.field3026.field975.method210(new class140(var6));
                     return 1;
                  } else if (var0 == 3657) {
                     var6 = class150.field1580[--class188.field1989] == 1;
                     if (class103.field1350 != null) {
                        class103.field1350.method210(new class140(var6));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = class150.field1580[--class188.field1989];
               if (class103.field1350 != null && var4 < class103.field1350.method188() && ((class221)class103.field1350.method196(var4)).method1137()) {
                  class150.field1580[++class188.field1989 - 1] = 1;
               } else {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
