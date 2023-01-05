public final class class267 extends class334 {
   static int field2210 = 1;
   static int field2212 = 1;
   static int field2215;
   static int[] field2214;
   class207 field2209;
   class207 field2211;
   class423 field2213;
   class489 field2208;
   int field2207 = 31;
   String field2206 = "";

   void method1272(String var1) {
      this.field2206 = null == var1 ? "" : var1;
   }

   void method1256(int var1) {
      this.field2207 = var1;
   }

   boolean method1273(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field2207 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   final String method1259() {
      if (!this.field2206.isEmpty()) {
         return this.field2206;
      } else {
         class423 var2 = this.field2213;
         if (null != var2.field3493) {
            var2 = var2.method2054();
            if (null == var2) {
               var2 = this.field2213;
            }
         }

         return var2.field3460;
      }
   }

   final void method1257(int var1, class294 var2) {
      int var4 = super.field2633[0];
      int var5 = super.field2681[0];
      if (var1 == 0) {
         --var4;
         ++var5;
      }

      if (var1 == 1) {
         ++var5;
      }

      if (var1 == 2) {
         ++var4;
         ++var5;
      }

      if (var1 == 3) {
         --var4;
      }

      if (var1 == 4) {
         ++var4;
      }

      if (var1 == 5) {
         --var4;
         --var5;
      }

      if (var1 == 6) {
         --var5;
      }

      if (var1 == 7) {
         ++var4;
         --var5;
      }

      if (-1 != super.field2649 && class271.method1277(super.field2649).field2034 == 1) {
         super.field2649 = -1;
      }

      if (super.field2607 < 9) {
         ++super.field2607;
      }

      for(int var6 = super.field2607; var6 > 0; --var6) {
         super.field2633[var6] = super.field2633[var6 - 1];
         super.field2681[var6] = super.field2681[var6 - 1];
         super.field2661[var6] = super.field2661[var6 - 1];
      }

      super.field2633[0] = var4;
      super.field2681[0] = var5;
      super.field2661[0] = var2;
   }

   final void method1258(int var1, int var2, boolean var3) {
      if (super.field2649 != -1 && class271.method1277(super.field2649).field2034 == 1) {
         super.field2649 = -1;
      }

      if (!var3) {
         int var5 = var1 - super.field2633[0];
         int var6 = var2 - super.field2681[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (super.field2607 < 9) {
               ++super.field2607;
            }

            for(int var7 = super.field2607; var7 > 0; --var7) {
               super.field2633[var7] = super.field2633[var7 - 1];
               super.field2681[var7] = super.field2681[var7 - 1];
               super.field2661[var7] = super.field2661[var7 - 1];
            }

            super.field2633[0] = var1;
            super.field2681[0] = var2;
            super.field2661[0] = class294.field2386;
            return;
         }
      }

      super.field2607 = 0;
      super.field2682 = 0;
      super.field2669 = 0;
      super.field2633[0] = var1;
      super.field2681[0] = var2;
      super.field2672 = super.field2611 * 64 + 128 * super.field2633[0];
      super.field2608 = super.field2611 * 64 + super.field2681[0] * 128;
   }

   protected final class470 method1438() {
      if (this.field2213 == null) {
         return null;
      } else {
         class242 var2 = -1 != super.field2649 && super.field2652 == 0 ? class271.method1277(super.field2649) : null;
         class242 var3 = super.field2645 != -1 && (super.field2613 != super.field2645 || var2 == null) ? class271.method1277(super.field2645) : null;
         class470 var4 = this.field2213.method2066(var2, super.field2640, var3, super.field2646, this.field2209);
         if (null == var4) {
            return null;
         } else {
            var4.method2315();
            super.field2667 = var4.field2390;
            int var5 = var4.field3937;
            if (super.field2654 != -1 && super.field2655 != -1) {
               class470 var6 = class429.method2119(super.field2654).method1663(super.field2655);
               if (var6 != null) {
                  var6.method2313(0, -super.field2676, 0);
                  class470[] var7 = new class470[]{var4, var6};
                  var4 = new class470(var7, 2);
               }
            }

            if (this.field2213.field3470 == 1) {
               var4.field3920 = true;
            }

            if (super.field2673 != 0 && client.field231 >= super.field2668 && client.field231 < super.field2630) {
               var4.field3953 = super.field2670;
               var4.field3954 = super.field2650;
               var4.field3955 = super.field2662;
               var4.field3901 = super.field2673;
               var4.field3957 = (short)var5;
            } else {
               var4.field3901 = 0;
            }

            return var4;
         }
      }
   }

   final boolean method1678() {
      return null != this.field2213;
   }

   int[] method1267() {
      return null != this.field2208 ? this.field2208.method2397() : this.field2213.method2061();
   }

   short[] method1260() {
      return this.field2208 != null ? this.field2208.method2398() : this.field2213.method2064();
   }

   void method1261(int var1, int var2, short var3) {
      if (null == this.field2208) {
         this.field2208 = new class489(this.field2213);
      }

      this.field2208.method2399(var1, var2, var3);
   }

   void method1262(int[] var1, short[] var2) {
      if (this.field2208 == null) {
         this.field2208 = new class489(this.field2213);
      }

      this.field2208.method2400(var1, var2);
   }

   void method1263() {
      this.field2208 = null;
   }

   void method1264(class207 var1) {
      this.field2211 = var1;
   }

   class207 method1265() {
      return this.field2211;
   }

   void method1266(class207 var1) {
      this.field2209 = var1;
   }

   void method1268() {
      this.field2211 = null;
   }

   void method1269() {
      this.field2209 = null;
   }

   static int method1255(int var0, class461 var1, boolean var2) {
      int var5 = -1;
      class120 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class386.field3248[--class161.field1227];
         var4 = class67.method299(var5);
      } else {
         var4 = var2 ? class108.field822 : class37.field183;
      }

      int var14;
      if (var0 == 1100) {
         class161.field1227 -= 2;
         var14 = class386.field3248[class161.field1227];
         int var11 = class386.field3248[1 + class161.field1227];
         if (12 == var4.field1026) {
            class262 var8 = var4.method485();
            if (null != var8 && var8.method1126(var14, var11)) {
               class184.method836(var4);
            }
         } else {
            var4.field920 = var14;
            if (var4.field920 > var4.field915 - var4.field908) {
               var4.field920 = var4.field915 - var4.field908;
            }

            if (var4.field920 < 0) {
               var4.field920 = 0;
            }

            var4.field914 = var11;
            if (var4.field914 > var4.field916 - var4.field967) {
               var4.field914 = var4.field916 - var4.field967;
            }

            if (var4.field914 < 0) {
               var4.field914 = 0;
            }

            class184.method836(var4);
         }

         return 1;
      } else if (var0 == 1101) {
         var4.field917 = class386.field3248[--class161.field1227];
         class184.method836(var4);
         return 1;
      } else if (var0 == 1102) {
         var4.field921 = class386.field3248[--class161.field1227] == 1;
         class184.method836(var4);
         return 1;
      } else if (var0 == 1103) {
         var4.field1024 = class386.field3248[--class161.field1227];
         class184.method836(var4);
         return 1;
      } else if (var0 == 1104) {
         var4.field925 = class386.field3248[--class161.field1227];
         class184.method836(var4);
         return 1;
      } else if (var0 == 1105) {
         var4.field927 = class386.field3248[--class161.field1227];
         class184.method836(var4);
         return 1;
      } else if (var0 == 1106) {
         var4.field883 = class386.field3248[--class161.field1227];
         class184.method836(var4);
         return 1;
      } else if (var0 == 1107) {
         var4.field910 = class386.field3248[--class161.field1227] == 1;
         class184.method836(var4);
         return 1;
      } else if (var0 == 1108) {
         var4.field936 = 1;
         var4.field955 = class386.field3248[--class161.field1227];
         class184.method836(var4);
         return 1;
      } else if (var0 == 1109) {
         class161.field1227 -= 6;
         var4.field942 = class386.field3248[class161.field1227];
         var4.field1034 = class386.field3248[1 + class161.field1227];
         var4.field960 = class386.field3248[2 + class161.field1227];
         var4.field947 = class386.field3248[class161.field1227 + 3];
         var4.field946 = class386.field3248[4 + class161.field1227];
         var4.field882 = class386.field3248[class161.field1227 + 5];
         class184.method836(var4);
         return 1;
      } else if (var0 == 1110) {
         var14 = class386.field3248[--class161.field1227];
         if (var14 != var4.field975) {
            var4.field975 = var14;
            var4.field1029 = 0;
            var4.field1030 = 0;
            class184.method836(var4);
         }

         return 1;
      } else if (var0 == 1111) {
         var4.field950 = class386.field3248[--class161.field1227] == 1;
         class184.method836(var4);
         return 1;
      } else if (var0 == 1112) {
         String var15 = class386.field3249[--class386.field3250];
         if (!var15.equals(var4.field954)) {
            var4.field954 = var15;
            class184.method836(var4);
         }

         return 1;
      } else {
         class262 var9;
         if (var0 == 1113) {
            var4.field953 = class386.field3248[--class161.field1227];
            if (12 == var4.field1026) {
               var9 = var4.method485();
               if (null != var9) {
                  var9.method1131();
               }
            }

            class184.method836(var4);
            return 1;
         } else if (var0 == 1114) {
            class161.field1227 -= 3;
            if (12 == var4.field1026) {
               var9 = var4.method485();
               if (null != var9) {
                  var9.method1127(class386.field3248[class161.field1227], class386.field3248[1 + class161.field1227]);
                  var9.method1128(class386.field3248[class161.field1227 + 2]);
               }
            } else {
               var4.field957 = class386.field3248[class161.field1227];
               var4.field1018 = class386.field3248[class161.field1227 + 1];
               var4.field956 = class386.field3248[2 + class161.field1227];
            }

            class184.method836(var4);
            return 1;
         } else if (var0 == 1115) {
            var4.field959 = class386.field3248[--class161.field1227] == 1;
            class184.method836(var4);
            return 1;
         } else if (var0 == 1116) {
            var4.field932 = class386.field3248[--class161.field1227];
            class184.method836(var4);
            return 1;
         } else if (var0 == 1117) {
            var4.field997 = class386.field3248[--class161.field1227];
            class184.method836(var4);
            return 1;
         } else if (var0 == 1118) {
            var4.field934 = class386.field3248[--class161.field1227] == 1;
            class184.method836(var4);
            return 1;
         } else if (var0 == 1119) {
            var4.field1044 = class386.field3248[--class161.field1227] == 1;
            class184.method836(var4);
            return 1;
         } else if (var0 == 1120) {
            class161.field1227 -= 2;
            var4.field915 = class386.field3248[class161.field1227];
            var4.field916 = class386.field3248[1 + class161.field1227];
            class184.method836(var4);
            if (var5 != -1 && 0 == var4.field1026) {
               class378.method1862(class329.field2600[var5 >> 16], var4, false);
            }

            return 1;
         } else if (var0 == 1121) {
            class439.method2178(var4.field985, var4.field895);
            client.field399 = var4;
            class184.method836(var4);
            return 1;
         } else if (var0 == 1122) {
            var4.field990 = class386.field3248[--class161.field1227];
            class184.method836(var4);
            return 1;
         } else if (var0 == 1123) {
            var4.field1035 = class386.field3248[--class161.field1227];
            class184.method836(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.field924 = class386.field3248[--class161.field1227];
            class184.method836(var4);
            return 1;
         } else if (var0 == 1125) {
            var14 = class386.field3248[--class161.field1227];
            class7 var10 = (class7)class2.method10(class140.method641(), var14);
            if (null != var10) {
               var4.field939 = var10;
               class184.method836(var4);
            }

            return 1;
         } else {
            boolean var12;
            if (var0 == 1126) {
               var12 = class386.field3248[--class161.field1227] == 1;
               var4.field926 = var12;
               return 1;
            } else if (var0 == 1127) {
               var12 = class386.field3248[--class161.field1227] == 1;
               var4.field951 = var12;
               return 1;
            } else if (var0 == 1129) {
               var4.field929 = class386.field3249[--class386.field3250];
               class184.method836(var4);
               return 1;
            } else if (var0 == 1130) {
               var4.method507(class386.field3249[--class386.field3250], class300.field2410, class312.method1507());
               return 1;
            } else if (var0 == 1131) {
               class161.field1227 -= 2;
               var4.method486(class386.field3248[class161.field1227], class386.field3248[1 + class161.field1227]);
               return 1;
            } else if (var0 == 1132) {
               var4.method481(class386.field3249[--class386.field3250], class386.field3248[--class161.field1227]);
               return 1;
            } else {
               class146 var13;
               if (var0 == 1133) {
                  --class161.field1227;
                  var13 = var4.method509();
                  if (null != var13) {
                     var13.field1160 = class386.field3248[class161.field1227];
                     class184.method836(var4);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --class161.field1227;
                  var13 = var4.method509();
                  if (var13 != null) {
                     var13.field1162 = class386.field3248[class161.field1227];
                     class184.method836(var4);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --class386.field3250;
                  var9 = var4.method485();
                  if (var9 != null) {
                     var4.field995 = class386.field3249[class386.field3250];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --class161.field1227;
                  var13 = var4.method509();
                  if (var13 != null) {
                     var13.field1161 = class386.field3248[class161.field1227];
                     class184.method836(var4);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --class161.field1227;
                  var9 = var4.method485();
                  if (null != var9 && var9.method1123(class386.field3248[class161.field1227])) {
                     class184.method836(var4);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --class161.field1227;
                  var9 = var4.method485();
                  if (var9 != null && var9.method1124(class386.field3248[class161.field1227])) {
                     class184.method836(var4);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --class161.field1227;
                  var9 = var4.method485();
                  if (null != var9 && var9.method1125(class386.field3248[class161.field1227], (byte)-54)) {
                     class184.method836(var4);
                  }

                  return 1;
               } else {
                  class262 var7;
                  if (var0 == 1140) {
                     var12 = class386.field3248[--class161.field1227] == 1;
                     client.field285.method456();
                     var7 = var4.method485();
                     if (var7 != null && var7.method1118(var12)) {
                        if (var12) {
                           client.field285.method454(var4);
                        }

                        class184.method836(var4);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var12 = class386.field3248[--class161.field1227] == 1;
                     if (!var12 && client.field285.method455() == var4) {
                        client.field285.method456();
                        class184.method836(var4);
                     }

                     var7 = var4.method485();
                     if (null != var7) {
                        var7.method1119(var12);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     class161.field1227 -= 2;
                     var9 = var4.method485();
                     if (var9 != null && var9.method1139(class386.field3248[class161.field1227], class386.field3248[class161.field1227 + 1])) {
                        class184.method836(var4);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --class161.field1227;
                     var9 = var4.method485();
                     if (var9 != null && var9.method1139(class386.field3248[class161.field1227], class386.field3248[class161.field1227])) {
                        class184.method836(var4);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --class161.field1227;
                     var9 = var4.method485();
                     if (null != var9) {
                        var9.method1180(class386.field3248[class161.field1227]);
                        class184.method836(var4);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --class161.field1227;
                     var9 = var4.method485();
                     if (null != var9) {
                        var9.method1129(class386.field3248[class161.field1227]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --class161.field1227;
                     var9 = var4.method485();
                     if (var9 != null) {
                        var9.method1186(class386.field3248[class161.field1227]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --class161.field1227;
                     var9 = var4.method485();
                     if (var9 != null) {
                        var9.method1167(class386.field3248[class161.field1227]);
                        class184.method836(var4);
                     }

                     return 1;
                  } else {
                     class109 var6;
                     if (var0 == 1148) {
                        class161.field1227 -= 2;
                        var6 = var4.method498();
                        if (null != var6) {
                           var6.method431(class386.field3248[class161.field1227], class386.field3248[class161.field1227 + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        class161.field1227 -= 2;
                        var6 = var4.method498();
                        if (null != var6) {
                           var6.method428((char)class386.field3248[class161.field1227], class386.field3248[class161.field1227 + 1]);
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      }
   }

   static final boolean method1274(class120 var0) {
      int var2 = var0.field993;
      if (var2 == 205) {
         client.field280 = 250;
         return true;
      } else {
         int var3;
         int var4;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            client.field264.method1407(var3, var4 == 1);
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            client.field264.method1399(var3, var4 == 1);
         }

         if (var2 == 324) {
            client.field264.method1400(0);
         }

         if (var2 == 325) {
            client.field264.method1400(1);
         }

         if (var2 == 326) {
            class299 var5 = class480.method2370(class356.field2933, client.field279.field4042);
            client.field264.method1401(var5.field2403);
            client.field279.method2389(var5);
            return true;
         } else {
            return false;
         }
      }
   }
}
