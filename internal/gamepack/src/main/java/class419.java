import java.util.LinkedList;
import java.util.List;

public abstract class class419 implements class379 {
   class180 field3565;

   class419(int var1) {
   }

   abstract void method2012(class134 var1, int var2);

   public void method2011(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         class199 var4 = (class199)class296.method1399(class378.method1806(), var3);
         if (var4 != null) {
            switch(var4.field2042) {
            case 0:
               class411[] var6 = new class411[]{class411.field3547, class411.field3550, class411.field3548, class411.field3551};
               class296.method1399(var6, var1.method669());
               break;
            case 1:
            default:
               throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
            case 2:
               int var5 = var1.method669();
               this.field3565 = class328.method1591(var5);
               if (null != this.field3565) {
                  break;
               }

               throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
            case 3:
               var1.method678();
            }
         } else {
            this.method2012(var1, var3);
         }
      }
   }

   boolean method2013() {
      return null != this.field3565;
   }

   Object method2014() {
      if (class180.field1934 == this.field3565) {
         return Integer.valueOf(0);
      } else if (class180.field1931 == this.field3565) {
         return -1L;
      } else {
         return this.field3565 == class180.field1932 ? "" : null;
      }
   }

   static int method2015(int var0, class472 var1, boolean var2) {
      int var4;
      Object var5;
      int var6;
      class466 var7;
      int var8;
      if (var0 != 7500 && var0 != 7508) {
         if (var0 != 7501) {
            int var21;
            int var23;
            if (var0 == 7502) {
               class188.field1989 -= 3;
               var4 = class150.field1580[class188.field1989];
               var21 = class150.field1580[class188.field1989 + 1];
               var6 = class150.field1580[class188.field1989 + 2];
               var23 = class36.method186(var21);
               var8 = class301.method1425(var21);
               int var25 = class452.method2147(var21);
               class120 var26 = class132.method649(var4);
               class301 var27 = class299.method1416(var23);
               int[] var28 = var27.field2890[var8];
               int var13 = 0;
               int var14 = var28.length;
               if (var25 >= 0) {
                  if (var25 >= var14) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
                  }

                  var13 = var25;
                  var14 = var25 + 1;
               }

               Object[] var15 = var26.method627(var8);
               if (var15 == null && null != var27.field2887) {
                  var15 = var27.field2887[var8];
               }

               int var16;
               int var17;
               if (null == var15) {
                  for(var16 = var13; var16 < var14; ++var16) {
                     var17 = var28[var16];
                     class180 var29 = class328.method1591(var17);
                     if (var29 == class180.field1932) {
                        class150.field1581[++class150.field1582 - 1] = "";
                     } else {
                        class150.field1580[++class188.field1989 - 1] = class304.method1437(var17);
                     }
                  }

                  return 1;
               } else {
                  var16 = var15.length / var28.length;
                  if (var6 >= 0 && var6 < var16) {
                     for(var17 = var13; var17 < var14; ++var17) {
                        int var18 = var6 * var28.length + var17;
                        class180 var19 = class328.method1591(var28[var17]);
                        if (class180.field1932 == var19) {
                           class150.field1581[++class150.field1582 - 1] = (String)var15[var18];
                        } else {
                           class150.field1580[++class188.field1989 - 1] = ((Integer)var15[var18]).intValue();
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else if (var0 == 7503) {
               class188.field1989 -= 2;
               var4 = class150.field1580[class188.field1989];
               var21 = class150.field1580[class188.field1989 + 1];
               var6 = 0;
               var23 = class36.method186(var21);
               var8 = class301.method1425(var21);
               class120 var24 = class132.method649(var4);
               class301 var10 = class299.method1416(var23);
               int[] var11 = var10.field2890[var8];
               Object[] var12 = var24.method627(var8);
               if (var12 == null && var10.field2887 != null) {
                  var12 = var10.field2887[var8];
               }

               if (null != var12) {
                  var6 = var12.length / var11.length;
               }

               class150.field1580[++class188.field1989 - 1] = var6;
               return 1;
            } else if (var0 != 7504 && var0 != 7510) {
               if (var0 == 7505) {
                  var4 = class150.field1580[--class188.field1989];
                  class120 var22 = class132.method649(var4);
                  class150.field1580[++class188.field1989 - 1] = var22.field1435;
                  return 1;
               } else if (var0 == 7506) {
                  var4 = class150.field1580[--class188.field1989];
                  var21 = -1;
                  if (class157.field1643 != null && var4 >= 0 && var4 < class157.field1643.size()) {
                     var21 = ((Integer)class157.field1643.get(var4)).intValue();
                  }

                  class150.field1580[++class188.field1989 - 1] = var21;
                  return 1;
               } else if (var0 != 7507 && var0 != 7509) {
                  return 2;
               } else {
                  var4 = class150.field1580[--class188.field1989];
                  var5 = class159.method846(var4);
                  var6 = class150.field1580[--class188.field1989];
                  var7 = class298.method1415(var6);
                  if (null == var7) {
                     throw new RuntimeException();
                  } else if (class36.method186(var6) != client.field717) {
                     throw new RuntimeException();
                  } else if (null == class157.field1643 && class157.field1643.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var8 = class452.method2147(var6);
                     List var9 = var7.method2284(var5, var8);
                     class157.field1643 = new LinkedList(class157.field1643);
                     if (null != var9) {
                        class157.field1643.retainAll(var9);
                     } else {
                        class157.field1643.clear();
                     }

                     class238.field2577 = class157.field1643.iterator();
                     if (var0 == 7507) {
                        class150.field1580[++class188.field1989 - 1] = class157.field1643.size();
                     }

                     return 1;
                  }
               }
            } else {
               --class188.field1989;
               var4 = class150.field1580[class188.field1989];
               class466 var20 = class244.method1220(var4);
               if (null == var20) {
                  throw new RuntimeException();
               } else {
                  class157.field1643 = var20.method2284(Integer.valueOf(0), 0);
                  var6 = 0;
                  if (class157.field1643 != null) {
                     client.field717 = var4;
                     class238.field2577 = class157.field1643.iterator();
                     var6 = class157.field1643.size();
                  }

                  if (var0 == 7504) {
                     class150.field1580[++class188.field1989 - 1] = var6;
                  }

                  return 1;
               }
            }
         } else {
            if (class238.field2577 != null && class238.field2577.hasNext()) {
               class150.field1580[++class188.field1989 - 1] = ((Integer)class238.field2577.next()).intValue();
            } else {
               class150.field1580[++class188.field1989 - 1] = -1;
            }

            return 1;
         }
      } else {
         var4 = class150.field1580[--class188.field1989];
         var5 = class159.method846(var4);
         var6 = class150.field1580[--class188.field1989];
         var7 = class298.method1415(var6);
         if (var7 == null) {
            throw new RuntimeException();
         } else {
            var8 = class452.method2147(var6);
            class157.field1643 = var7.method2284(var5, var8);
            if (null != class157.field1643) {
               client.field717 = class36.method186(var6);
               class238.field2577 = class157.field1643.iterator();
               if (var0 == 7500) {
                  class150.field1580[++class188.field1989 - 1] = class157.field1643.size();
               }
            } else {
               client.field717 = -1;
               class238.field2577 = null;
               if (var0 == 7500) {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }
            }

            return 1;
         }
      }
   }
}
