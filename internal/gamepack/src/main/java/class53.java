public final class class53 extends class30 {
   static int field795 = 1;
   static int field797 = 1;
   static int field800;
   static int[] field799;
   class219 field793;
   class272 field798;
   class490 field794;
   class490 field796;
   int field792 = 31;
   String field791 = "";

   void method312(String var1) {
      this.field791 = null == var1 ? "" : var1;
   }

   void method297(int var1) {
      this.field792 = var1;
   }

   boolean method313(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field792 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   final String method300() {
      if (!this.field791.isEmpty()) {
         return this.field791;
      } else {
         class272 var2 = this.field798;
         if (null != var2.field2743) {
            var2 = var2.method1286();
            if (null == var2) {
               var2 = this.field798;
            }
         }

         return var2.field2710;
      }
   }

   final void method298(int var1, class156 var2) {
      int var4 = super.field258[0];
      int var5 = super.field306[0];
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

      if (-1 != super.field274 && class242.method1218(super.field274).field905 == 1) {
         super.field274 = -1;
      }

      if (super.field232 < 9) {
         ++super.field232;
      }

      for(int var6 = super.field232; var6 > 0; --var6) {
         super.field258[var6] = super.field258[var6 - 1];
         super.field306[var6] = super.field306[var6 - 1];
         super.field286[var6] = super.field286[var6 - 1];
      }

      super.field258[0] = var4;
      super.field306[0] = var5;
      super.field286[0] = var2;
   }

   final void method299(int var1, int var2, boolean var3) {
      if (super.field274 != -1 && class242.method1218(super.field274).field905 == 1) {
         super.field274 = -1;
      }

      if (!var3) {
         int var5 = var1 - super.field258[0];
         int var6 = var2 - super.field306[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (super.field232 < 9) {
               ++super.field232;
            }

            for(int var7 = super.field232; var7 > 0; --var7) {
               super.field258[var7] = super.field258[var7 - 1];
               super.field306[var7] = super.field306[var7 - 1];
               super.field286[var7] = super.field286[var7 - 1];
            }

            super.field258[0] = var1;
            super.field306[0] = var2;
            super.field286[0] = class156.field1620;
            return;
         }
      }

      super.field232 = 0;
      super.field307 = 0;
      super.field294 = 0;
      super.field258[0] = var1;
      super.field306[0] = var2;
      super.field297 = super.field236 * 64 + 128 * super.field258[0];
      super.field233 = super.field236 * 64 + super.field306[0] * 128;
   }

   protected final class491 method1194() {
      if (this.field798 == null) {
         return null;
      } else {
         class79 var2 = -1 != super.field274 && super.field277 == 0 ? class242.method1218(super.field274) : null;
         class79 var3 = super.field270 != -1 && (super.field238 != super.field270 || var2 == null) ? class242.method1218(super.field270) : null;
         class491 var4 = this.field798.method1298(var2, super.field265, var3, super.field271, this.field794);
         if (null == var4) {
            return null;
         } else {
            var4.method2374();
            super.field292 = var4.field2554;
            int var5 = var4.field4091;
            if (super.field279 != -1 && super.field280 != -1) {
               class491 var6 = class27.method148(super.field279).method988(super.field280);
               if (var6 != null) {
                  var6.method2372(0, -super.field301, 0);
                  class491[] var7 = new class491[]{var4, var6};
                  var4 = new class491(var7, 2);
               }
            }

            if (this.field798.field2720 == 1) {
               var4.field4074 = true;
            }

            if (super.field298 != 0 && client.field435 >= super.field293 && client.field435 < super.field255) {
               var4.field4107 = super.field295;
               var4.field4108 = super.field275;
               var4.field4109 = super.field287;
               var4.field4055 = super.field298;
               var4.field4111 = (short)var5;
            } else {
               var4.field4055 = 0;
            }

            return var4;
         }
      }
   }

   final boolean method156() {
      return null != this.field798;
   }

   int[] method308() {
      return null != this.field793 ? this.field793.method1126() : this.field798.method1293();
   }

   short[] method301() {
      return this.field793 != null ? this.field793.method1127() : this.field798.method1296();
   }

   void method302(int var1, int var2, short var3) {
      if (null == this.field793) {
         this.field793 = new class219(this.field798);
      }

      this.field793.method1128(var1, var2, var3);
   }

   void method303(int[] var1, short[] var2) {
      if (this.field793 == null) {
         this.field793 = new class219(this.field798);
      }

      this.field793.method1129(var1, var2);
   }

   void method304() {
      this.field793 = null;
   }

   void method305(class490 var1) {
      this.field796 = var1;
   }

   class490 method306() {
      return this.field796;
   }

   void method307(class490 var1) {
      this.field794 = var1;
   }

   void method309() {
      this.field796 = null;
   }

   void method310() {
      this.field794 = null;
   }

   static int method296(int var0, class472 var1, boolean var2) {
      int var5 = -1;
      class210 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class150.field1580[--class188.field1989];
         var4 = class274.method1301(var5);
      } else {
         var4 = var2 ? class142.field1544 : class425.field3580;
      }

      int var14;
      if (var0 == 1100) {
         class188.field1989 -= 2;
         var14 = class150.field1580[class188.field1989];
         int var11 = class150.field1580[1 + class188.field1989];
         if (12 == var4.field2348) {
            class459 var8 = var4.method1076();
            if (null != var8 && var8.method2194(var14, var11)) {
               class214.method1117(var4);
            }
         } else {
            var4.field2242 = var14;
            if (var4.field2242 > var4.field2237 - var4.field2230) {
               var4.field2242 = var4.field2237 - var4.field2230;
            }

            if (var4.field2242 < 0) {
               var4.field2242 = 0;
            }

            var4.field2236 = var11;
            if (var4.field2236 > var4.field2238 - var4.field2289) {
               var4.field2236 = var4.field2238 - var4.field2289;
            }

            if (var4.field2236 < 0) {
               var4.field2236 = 0;
            }

            class214.method1117(var4);
         }

         return 1;
      } else if (var0 == 1101) {
         var4.field2239 = class150.field1580[--class188.field1989];
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1102) {
         var4.field2243 = class150.field1580[--class188.field1989] == 1;
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1103) {
         var4.field2346 = class150.field1580[--class188.field1989];
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1104) {
         var4.field2247 = class150.field1580[--class188.field1989];
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1105) {
         var4.field2249 = class150.field1580[--class188.field1989];
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1106) {
         var4.field2205 = class150.field1580[--class188.field1989];
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1107) {
         var4.field2232 = class150.field1580[--class188.field1989] == 1;
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1108) {
         var4.field2258 = 1;
         var4.field2277 = class150.field1580[--class188.field1989];
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1109) {
         class188.field1989 -= 6;
         var4.field2264 = class150.field1580[class188.field1989];
         var4.field2356 = class150.field1580[1 + class188.field1989];
         var4.field2282 = class150.field1580[2 + class188.field1989];
         var4.field2269 = class150.field1580[class188.field1989 + 3];
         var4.field2268 = class150.field1580[4 + class188.field1989];
         var4.field2204 = class150.field1580[class188.field1989 + 5];
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1110) {
         var14 = class150.field1580[--class188.field1989];
         if (var14 != var4.field2297) {
            var4.field2297 = var14;
            var4.field2351 = 0;
            var4.field2352 = 0;
            class214.method1117(var4);
         }

         return 1;
      } else if (var0 == 1111) {
         var4.field2272 = class150.field1580[--class188.field1989] == 1;
         class214.method1117(var4);
         return 1;
      } else if (var0 == 1112) {
         String var15 = class150.field1581[--class150.field1582];
         if (!var15.equals(var4.field2276)) {
            var4.field2276 = var15;
            class214.method1117(var4);
         }

         return 1;
      } else {
         class459 var9;
         if (var0 == 1113) {
            var4.field2275 = class150.field1580[--class188.field1989];
            if (12 == var4.field2348) {
               var9 = var4.method1076();
               if (null != var9) {
                  var9.method2199();
               }
            }

            class214.method1117(var4);
            return 1;
         } else if (var0 == 1114) {
            class188.field1989 -= 3;
            if (12 == var4.field2348) {
               var9 = var4.method1076();
               if (null != var9) {
                  var9.method2195(class150.field1580[class188.field1989], class150.field1580[1 + class188.field1989]);
                  var9.method2196(class150.field1580[class188.field1989 + 2]);
               }
            } else {
               var4.field2279 = class150.field1580[class188.field1989];
               var4.field2340 = class150.field1580[class188.field1989 + 1];
               var4.field2278 = class150.field1580[2 + class188.field1989];
            }

            class214.method1117(var4);
            return 1;
         } else if (var0 == 1115) {
            var4.field2281 = class150.field1580[--class188.field1989] == 1;
            class214.method1117(var4);
            return 1;
         } else if (var0 == 1116) {
            var4.field2254 = class150.field1580[--class188.field1989];
            class214.method1117(var4);
            return 1;
         } else if (var0 == 1117) {
            var4.field2319 = class150.field1580[--class188.field1989];
            class214.method1117(var4);
            return 1;
         } else if (var0 == 1118) {
            var4.field2256 = class150.field1580[--class188.field1989] == 1;
            class214.method1117(var4);
            return 1;
         } else if (var0 == 1119) {
            var4.field2366 = class150.field1580[--class188.field1989] == 1;
            class214.method1117(var4);
            return 1;
         } else if (var0 == 1120) {
            class188.field1989 -= 2;
            var4.field2237 = class150.field1580[class188.field1989];
            var4.field2238 = class150.field1580[1 + class188.field1989];
            class214.method1117(var4);
            if (var5 != -1 && 0 == var4.field2348) {
               class357.method1708(class71.field853[var5 >> 16], var4, false);
            }

            return 1;
         } else if (var0 == 1121) {
            class115.method599(var4.field2307, var4.field2217);
            client.field603 = var4;
            class214.method1117(var4);
            return 1;
         } else if (var0 == 1122) {
            var4.field2312 = class150.field1580[--class188.field1989];
            class214.method1117(var4);
            return 1;
         } else if (var0 == 1123) {
            var4.field2357 = class150.field1580[--class188.field1989];
            class214.method1117(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.field2246 = class150.field1580[--class188.field1989];
            class214.method1117(var4);
            return 1;
         } else if (var0 == 1125) {
            var14 = class150.field1580[--class188.field1989];
            class122 var10 = (class122)class296.method1399(class432.method2082(), var14);
            if (null != var10) {
               var4.field2261 = var10;
               class214.method1117(var4);
            }

            return 1;
         } else {
            boolean var12;
            if (var0 == 1126) {
               var12 = class150.field1580[--class188.field1989] == 1;
               var4.field2248 = var12;
               return 1;
            } else if (var0 == 1127) {
               var12 = class150.field1580[--class188.field1989] == 1;
               var4.field2273 = var12;
               return 1;
            } else if (var0 == 1129) {
               var4.field2251 = class150.field1581[--class150.field1582];
               class214.method1117(var4);
               return 1;
            } else if (var0 == 1130) {
               var4.method1098(class150.field1581[--class150.field1582], class20.field151, class381.method1812());
               return 1;
            } else if (var0 == 1131) {
               class188.field1989 -= 2;
               var4.method1077(class150.field1580[class188.field1989], class150.field1580[1 + class188.field1989]);
               return 1;
            } else if (var0 == 1132) {
               var4.method1072(class150.field1581[--class150.field1582], class150.field1580[--class188.field1989]);
               return 1;
            } else {
               class138 var13;
               if (var0 == 1133) {
                  --class188.field1989;
                  var13 = var4.method1100();
                  if (null != var13) {
                     var13.field1499 = class150.field1580[class188.field1989];
                     class214.method1117(var4);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --class188.field1989;
                  var13 = var4.method1100();
                  if (var13 != null) {
                     var13.field1501 = class150.field1580[class188.field1989];
                     class214.method1117(var4);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --class150.field1582;
                  var9 = var4.method1076();
                  if (var9 != null) {
                     var4.field2317 = class150.field1581[class150.field1582];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --class188.field1989;
                  var13 = var4.method1100();
                  if (var13 != null) {
                     var13.field1500 = class150.field1580[class188.field1989];
                     class214.method1117(var4);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --class188.field1989;
                  var9 = var4.method1076();
                  if (null != var9 && var9.method2191(class150.field1580[class188.field1989])) {
                     class214.method1117(var4);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --class188.field1989;
                  var9 = var4.method1076();
                  if (var9 != null && var9.method2192(class150.field1580[class188.field1989])) {
                     class214.method1117(var4);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --class188.field1989;
                  var9 = var4.method1076();
                  if (null != var9 && var9.method2193(class150.field1580[class188.field1989], (byte)-54)) {
                     class214.method1117(var4);
                  }

                  return 1;
               } else {
                  class459 var7;
                  if (var0 == 1140) {
                     var12 = class150.field1580[--class188.field1989] == 1;
                     client.field489.method1942();
                     var7 = var4.method1076();
                     if (var7 != null && var7.method2186(var12)) {
                        if (var12) {
                           client.field489.method1940(var4);
                        }

                        class214.method1117(var4);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var12 = class150.field1580[--class188.field1989] == 1;
                     if (!var12 && client.field489.method1941() == var4) {
                        client.field489.method1942();
                        class214.method1117(var4);
                     }

                     var7 = var4.method1076();
                     if (null != var7) {
                        var7.method2187(var12);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     class188.field1989 -= 2;
                     var9 = var4.method1076();
                     if (var9 != null && var9.method2207(class150.field1580[class188.field1989], class150.field1580[class188.field1989 + 1])) {
                        class214.method1117(var4);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --class188.field1989;
                     var9 = var4.method1076();
                     if (var9 != null && var9.method2207(class150.field1580[class188.field1989], class150.field1580[class188.field1989])) {
                        class214.method1117(var4);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --class188.field1989;
                     var9 = var4.method1076();
                     if (null != var9) {
                        var9.method2248(class150.field1580[class188.field1989]);
                        class214.method1117(var4);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --class188.field1989;
                     var9 = var4.method1076();
                     if (null != var9) {
                        var9.method2197(class150.field1580[class188.field1989]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --class188.field1989;
                     var9 = var4.method1076();
                     if (var9 != null) {
                        var9.method2254(class150.field1580[class188.field1989]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --class188.field1989;
                     var9 = var4.method1076();
                     if (var9 != null) {
                        var9.method2235(class150.field1580[class188.field1989]);
                        class214.method1117(var4);
                     }

                     return 1;
                  } else {
                     class402 var6;
                     if (var0 == 1148) {
                        class188.field1989 -= 2;
                        var6 = var4.method1089();
                        if (null != var6) {
                           var6.method1966(class150.field1580[class188.field1989], class150.field1580[class188.field1989 + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        class188.field1989 -= 2;
                        var6 = var4.method1089();
                        if (null != var6) {
                           var6.method1963((char)class150.field1580[class188.field1989], class150.field1580[class188.field1989 + 1]);
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

   static final boolean method314(class210 var0) {
      int var2 = var0.field2315;
      if (var2 == 205) {
         client.field484 = 250;
         return true;
      } else {
         int var3;
         int var4;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            client.field468.method1908(var3, var4 == 1);
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            client.field468.method1900(var3, var4 == 1);
         }

         if (var2 == 324) {
            client.field468.method1901(0);
         }

         if (var2 == 325) {
            client.field468.method1901(1);
         }

         if (var2 == 326) {
            class81 var5 = class189.method982(class165.field1719, client.field483.field3459);
            client.field468.method1902(var5.field933);
            client.field483.method1920(var5);
            return true;
         } else {
            return false;
         }
      }
   }
}
