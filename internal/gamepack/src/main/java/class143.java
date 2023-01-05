import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class143 extends class203 {
   int field1144 = 256;
   int field1145;
   int field1147 = 0;
   int field1148 = 1;
   long field1146 = class152.method711();
   long[] field1143 = new long[10];

   public class143() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1143[var1] = this.field1146;
      }

   }

   public void method889() {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.field1143[var2] = 0L;
      }

   }

   public int method890(int var1, int var2) {
      int var4 = this.field1144;
      int var5 = this.field1148;
      this.field1144 = 300;
      this.field1148 = 1;
      this.field1146 = class152.method711();
      if (this.field1143[this.field1145] == 0L) {
         this.field1144 = var4;
         this.field1148 = var5;
      } else if (this.field1146 > this.field1143[this.field1145]) {
         this.field1144 = (int)((long)(var1 * 2560) / (this.field1146 - this.field1143[this.field1145]));
      }

      if (this.field1144 < 25) {
         this.field1144 = 25;
      }

      if (this.field1144 > 256) {
         this.field1144 = 256;
         this.field1148 = (int)((long)var1 - (this.field1146 - this.field1143[this.field1145]) / 10L);
      }

      if (this.field1148 > var1) {
         this.field1148 = var1;
      }

      this.field1143[this.field1145] = this.field1146;
      this.field1145 = (this.field1145 + 1) % 10;
      int var6;
      if (this.field1148 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if (this.field1143[var6] != 0L) {
               this.field1143[var6] += (long)this.field1148;
            }
         }
      }

      if (this.field1148 < var2) {
         this.field1148 = var2;
      }

      class286.method1421((long)this.field1148);

      for(var6 = 0; this.field1147 < 256; this.field1147 += this.field1144) {
         ++var6;
      }

      this.field1147 &= 255;
      return var6;
   }

   public static void method654(class127 var0, int var1) {
      class408 var3 = new class408();
      var3.field3413 = var0.method547();
      var3.field3409 = var0.method595();
      var3.field3412 = new int[var3.field3413];
      var3.field3410 = new int[var3.field3413];
      var3.field3411 = new Field[var3.field3413];
      var3.field3408 = new int[var3.field3413];
      var3.field3414 = new Method[var3.field3413];
      var3.field3407 = new byte[var3.field3413][][];

      for(int var4 = 0; var4 < var3.field3413; ++var4) {
         try {
            int var5 = var0.method547();
            String var6;
            String var7;
            int var8;
            if (var5 != 0 && var5 != 1 && var5 != 2) {
               if (var5 == 3 || var5 == 4) {
                  var6 = var0.method555();
                  var7 = var0.method555();
                  var8 = var0.method547();
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = var0.method555();
                  }

                  String var26 = var0.method555();
                  byte[][] var11 = new byte[var8][];
                  int var13;
                  if (var5 == 3) {
                     for(int var12 = 0; var12 < var8; ++var12) {
                        var13 = var0.method595();
                        var11[var12] = new byte[var13];
                        var0.method557(var11[var12], 0, var13);
                     }
                  }

                  var3.field3412[var4] = var5;
                  Class[] var27 = new Class[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var27[var13] = method652(var9[var13]);
                  }

                  Class var28 = method652(var26);
                  if (method652(var6).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = method652(var6).getDeclaredMethods();
                  Method[] var15 = var14;

                  for(int var16 = 0; var16 < var15.length; ++var16) {
                     Method var17 = var15[var16];
                     if (var17.getName().equals(var7)) {
                        Class[] var18 = var17.getParameterTypes();
                        if (var27.length == var18.length) {
                           boolean var19 = true;

                           for(int var20 = 0; var20 < var27.length; ++var20) {
                              if (var18[var20] != var27[var20]) {
                                 var19 = false;
                                 break;
                              }
                           }

                           if (var19 && var28 == var17.getReturnType()) {
                              var3.field3414[var4] = var17;
                           }
                        }
                     }
                  }

                  var3.field3407[var4] = var11;
               }
            } else {
               var6 = var0.method555();
               var7 = var0.method555();
               var8 = 0;
               if (var5 == 1) {
                  var8 = var0.method595();
               }

               var3.field3412[var4] = var5;
               var3.field3408[var4] = var8;
               if (method652(var6).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.field3411[var4] = method652(var6).getDeclaredField(var7);
            }
         } catch (ClassNotFoundException var21) {
            var3.field3410[var4] = -1;
         } catch (SecurityException var22) {
            var3.field3410[var4] = -2;
         } catch (NullPointerException var23) {
            var3.field3410[var4] = -3;
         } catch (Exception var24) {
            var3.field3410[var4] = -4;
         } catch (Throwable var25) {
            var3.field3410[var4] = -5;
         }
      }

      class323.field2565.method1939(var3);
   }

   static Class method652(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Class.forName(var0);
      }
   }
}
