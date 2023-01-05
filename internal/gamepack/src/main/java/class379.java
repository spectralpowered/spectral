import java.util.LinkedList;
import java.util.List;

public abstract class class379 implements class412 {
   class185 field3192;

   class379(int var1) {
   }

   abstract void method1865(class127 var1, int var2);

   public void method1864(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         class436 var4 = (class436)class2.method10(class339.method1705(), var3);
         if (var4 != null) {
            switch(var4.field3615) {
            case 0:
               class282[] var6 = new class282[]{class282.field2335, class282.field2338, class282.field2336, class282.field2339};
               class2.method10(var6, var1.method547());
               break;
            case 1:
            default:
               throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
            case 2:
               int var5 = var1.method547();
               this.field3192 = class374.method1849(var5);
               if (null != this.field3192) {
                  break;
               }

               throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
            case 3:
               var1.method556();
            }
         } else {
            this.method1865(var1, var3);
         }
      }
   }

   boolean method1866() {
      return null != this.field3192;
   }

   Object method1867() {
      if (class185.field1690 == this.field3192) {
         return Integer.valueOf(0);
      } else if (class185.field1687 == this.field3192) {
         return -1L;
      } else {
         return this.field3192 == class185.field1688 ? "" : null;
      }
   }

   static int method1868(int var0, class461 var1, boolean var2) {
      int var4;
      Object var5;
      int var6;
      class213 var7;
      int var8;
      if (var0 != 7500 && var0 != 7508) {
         if (var0 != 7501) {
            int var21;
            int var23;
            if (var0 == 7502) {
               class161.field1227 -= 3;
               var4 = class386.field3248[class161.field1227];
               var21 = class386.field3248[class161.field1227 + 1];
               var6 = class386.field3248[class161.field1227 + 2];
               var23 = class102.method413(var21);
               var8 = class106.method423(var21);
               int var25 = class277.method1386(var21);
               class11 var26 = class121.method515(var4);
               class106 var27 = class114.method451(var23);
               int[] var28 = var27.field820[var8];
               int var13 = 0;
               int var14 = var28.length;
               if (var25 >= 0) {
                  if (var25 >= var14) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
                  }

                  var13 = var25;
                  var14 = var25 + 1;
               }

               Object[] var15 = var26.method66(var8);
               if (var15 == null && null != var27.field817) {
                  var15 = var27.field817[var8];
               }

               int var16;
               int var17;
               if (null == var15) {
                  for(var16 = var13; var16 < var14; ++var16) {
                     var17 = var28[var16];
                     class185 var29 = class374.method1849(var17);
                     if (var29 == class185.field1688) {
                        class386.field3249[++class386.field3250 - 1] = "";
                     } else {
                        class386.field3248[++class161.field1227 - 1] = class362.method1806(var17);
                     }
                  }

                  return 1;
               } else {
                  var16 = var15.length / var28.length;
                  if (var6 >= 0 && var6 < var16) {
                     for(var17 = var13; var17 < var14; ++var17) {
                        int var18 = var6 * var28.length + var17;
                        class185 var19 = class374.method1849(var28[var17]);
                        if (class185.field1688 == var19) {
                           class386.field3249[++class386.field3250 - 1] = (String)var15[var18];
                        } else {
                           class386.field3248[++class161.field1227 - 1] = ((Integer)var15[var18]).intValue();
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else if (var0 == 7503) {
               class161.field1227 -= 2;
               var4 = class386.field3248[class161.field1227];
               var21 = class386.field3248[class161.field1227 + 1];
               var6 = 0;
               var23 = class102.method413(var21);
               var8 = class106.method423(var21);
               class11 var24 = class121.method515(var4);
               class106 var10 = class114.method451(var23);
               int[] var11 = var10.field820[var8];
               Object[] var12 = var24.method66(var8);
               if (var12 == null && var10.field817 != null) {
                  var12 = var10.field817[var8];
               }

               if (null != var12) {
                  var6 = var12.length / var11.length;
               }

               class386.field3248[++class161.field1227 - 1] = var6;
               return 1;
            } else if (var0 != 7504 && var0 != 7510) {
               if (var0 == 7505) {
                  var4 = class386.field3248[--class161.field1227];
                  class11 var22 = class121.method515(var4);
                  class386.field3248[++class161.field1227 - 1] = var22.field61;
                  return 1;
               } else if (var0 == 7506) {
                  var4 = class386.field3248[--class161.field1227];
                  var21 = -1;
                  if (class233.field1992 != null && var4 >= 0 && var4 < class233.field1992.size()) {
                     var21 = ((Integer)class233.field1992.get(var4)).intValue();
                  }

                  class386.field3248[++class161.field1227 - 1] = var21;
                  return 1;
               } else if (var0 != 7507 && var0 != 7509) {
                  return 2;
               } else {
                  var4 = class386.field3248[--class161.field1227];
                  var5 = class357.method1787(var4);
                  var6 = class386.field3248[--class161.field1227];
                  var7 = class397.method1963(var6);
                  if (null == var7) {
                     throw new RuntimeException();
                  } else if (class102.method413(var6) != client.field513) {
                     throw new RuntimeException();
                  } else if (null == class233.field1992 && class233.field1992.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var8 = class277.method1386(var6);
                     List var9 = var7.method921(var5, var8);
                     class233.field1992 = new LinkedList(class233.field1992);
                     if (null != var9) {
                        class233.field1992.retainAll(var9);
                     } else {
                        class233.field1992.clear();
                     }

                     class337.field2701 = class233.field1992.iterator();
                     if (var0 == 7507) {
                        class386.field3248[++class161.field1227 - 1] = class233.field1992.size();
                     }

                     return 1;
                  }
               }
            } else {
               --class161.field1227;
               var4 = class386.field3248[class161.field1227];
               class213 var20 = class322.method1650(var4);
               if (null == var20) {
                  throw new RuntimeException();
               } else {
                  class233.field1992 = var20.method921(Integer.valueOf(0), 0);
                  var6 = 0;
                  if (class233.field1992 != null) {
                     client.field513 = var4;
                     class337.field2701 = class233.field1992.iterator();
                     var6 = class233.field1992.size();
                  }

                  if (var0 == 7504) {
                     class386.field3248[++class161.field1227 - 1] = var6;
                  }

                  return 1;
               }
            }
         } else {
            if (class337.field2701 != null && class337.field2701.hasNext()) {
               class386.field3248[++class161.field1227 - 1] = ((Integer)class337.field2701.next()).intValue();
            } else {
               class386.field3248[++class161.field1227 - 1] = -1;
            }

            return 1;
         }
      } else {
         var4 = class386.field3248[--class161.field1227];
         var5 = class357.method1787(var4);
         var6 = class386.field3248[--class161.field1227];
         var7 = class397.method1963(var6);
         if (var7 == null) {
            throw new RuntimeException();
         } else {
            var8 = class277.method1386(var6);
            class233.field1992 = var7.method921(var5, var8);
            if (null != class233.field1992) {
               client.field513 = class102.method413(var6);
               class337.field2701 = class233.field1992.iterator();
               if (var0 == 7500) {
                  class386.field3248[++class161.field1227 - 1] = class233.field1992.size();
               }
            } else {
               client.field513 = -1;
               class337.field2701 = null;
               if (var0 == 7500) {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }
            }

            return 1;
         }
      }
   }
}
