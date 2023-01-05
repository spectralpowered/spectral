import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class333 extends class172 {
   int field3095 = 256;
   int field3096;
   int field3098 = 0;
   int field3099 = 1;
   long field3097 = class154.method814();
   long[] field3094 = new long[10];

   public class333() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field3094[var1] = this.field3097;
      }

   }

   public void method910() {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.field3094[var2] = 0L;
      }

   }

   public int method911(int var1, int var2) {
      int var4 = this.field3095;
      int var5 = this.field3099;
      this.field3095 = 300;
      this.field3099 = 1;
      this.field3097 = class154.method814();
      if (this.field3094[this.field3096] == 0L) {
         this.field3095 = var4;
         this.field3099 = var5;
      } else if (this.field3097 > this.field3094[this.field3096]) {
         this.field3095 = (int)((long)(var1 * 2560) / (this.field3097 - this.field3094[this.field3096]));
      }

      if (this.field3095 < 25) {
         this.field3095 = 25;
      }

      if (this.field3095 > 256) {
         this.field3095 = 256;
         this.field3099 = (int)((long)var1 - (this.field3097 - this.field3094[this.field3096]) / 10L);
      }

      if (this.field3099 > var1) {
         this.field3099 = var1;
      }

      this.field3094[this.field3096] = this.field3097;
      this.field3096 = (this.field3096 + 1) % 10;
      int var6;
      if (this.field3099 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if (this.field3094[var6] != 0L) {
               this.field3094[var6] += (long)this.field3099;
            }
         }
      }

      if (this.field3099 < var2) {
         this.field3099 = var2;
      }

      class324.method1571((long)this.field3099);

      for(var6 = 0; this.field3098 < 256; this.field3098 += this.field3095) {
         ++var6;
      }

      this.field3098 &= 255;
      return var6;
   }

   public static void method1614(class134 var0, int var1) {
      class13 var3 = new class13();
      var3.field124 = var0.method669();
      var3.field120 = var0.method717();
      var3.field123 = new int[var3.field124];
      var3.field121 = new int[var3.field124];
      var3.field122 = new Field[var3.field124];
      var3.field119 = new int[var3.field124];
      var3.field125 = new Method[var3.field124];
      var3.field118 = new byte[var3.field124][][];

      for(int var4 = 0; var4 < var3.field124; ++var4) {
         try {
            int var5 = var0.method669();
            String var6;
            String var7;
            int var8;
            if (var5 != 0 && var5 != 1 && var5 != 2) {
               if (var5 == 3 || var5 == 4) {
                  var6 = var0.method677();
                  var7 = var0.method677();
                  var8 = var0.method669();
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = var0.method677();
                  }

                  String var26 = var0.method677();
                  byte[][] var11 = new byte[var8][];
                  int var13;
                  if (var5 == 3) {
                     for(int var12 = 0; var12 < var8; ++var12) {
                        var13 = var0.method717();
                        var11[var12] = new byte[var13];
                        var0.method679(var11[var12], 0, var13);
                     }
                  }

                  var3.field123[var4] = var5;
                  Class[] var27 = new Class[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var27[var13] = method1613(var9[var13]);
                  }

                  Class var28 = method1613(var26);
                  if (method1613(var6).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = method1613(var6).getDeclaredMethods();
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
                              var3.field125[var4] = var17;
                           }
                        }
                     }
                  }

                  var3.field118[var4] = var11;
               }
            } else {
               var6 = var0.method677();
               var7 = var0.method677();
               var8 = 0;
               if (var5 == 1) {
                  var8 = var0.method717();
               }

               var3.field123[var4] = var5;
               var3.field119[var4] = var8;
               if (method1613(var6).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.field122[var4] = method1613(var6).getDeclaredField(var7);
            }
         } catch (ClassNotFoundException var21) {
            var3.field121[var4] = -1;
         } catch (SecurityException var22) {
            var3.field121[var4] = -2;
         } catch (NullPointerException var23) {
            var3.field121[var4] = -3;
         } catch (Exception var24) {
            var3.field121[var4] = -4;
         } catch (Throwable var25) {
            var3.field121[var4] = -5;
         }
      }

      class384.field3334.method325(var3);
   }

   static Class method1613(String var0) throws ClassNotFoundException {
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
