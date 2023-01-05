import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ObfInfo(
   name = "hk"
)
public class class119 {
   @ObfInfo(
      owner = "hk",
      name = "s",
      desc = "[I"
   )
   public static int[] field879;
   @ObfInfo(
      owner = "hk",
      name = "m",
      desc = "Lra;"
   )
   static class344 field878;

   @ObfInfo(
      owner = "hk",
      name = "h",
      desc = "(Lqx;B)V"
   )
   public static void method472(class6 var0) {
      class408 var2 = (class408)class323.field2565.method1941();
      if (var2 != null) {
         int var3 = var0.field1070;
         var0.method534(var2.field3409);

         for(int var4 = 0; var4 < var2.field3413; ++var4) {
            if (0 != var2.field3410[var4]) {
               var0.method544(var2.field3410[var4]);
            } else {
               try {
                  int var5 = var2.field3412[var4];
                  Field var6;
                  int var7;
                  if (var5 == 0) {
                     var6 = var2.field3411[var4];
                     var7 = var6.getInt((Object)null);
                     var0.method544(0);
                     var0.method534(var7);
                  } else if (var5 == 1) {
                     var6 = var2.field3411[var4];
                     var6.setInt((Object)null, var2.field3408[var4]);
                     var0.method544(0);
                  } else if (var5 == 2) {
                     var6 = var2.field3411[var4];
                     var7 = var6.getModifiers();
                     var0.method544(0);
                     var0.method534(var7);
                  }

                  Method var23;
                  if (var5 != 3) {
                     if (var5 == 4) {
                        var23 = var2.field3414[var4];
                        var7 = var23.getModifiers();
                        var0.method544(0);
                        var0.method534(var7);
                     }
                  } else {
                     var23 = var2.field3414[var4];
                     byte[][] var24 = var2.field3407[var4];
                     Object[] var8 = new Object[var24.length];

                     for(int var9 = 0; var9 < var24.length; ++var9) {
                        ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
                        var8[var9] = var10.readObject();
                     }

                     Object var25 = var23.invoke((Object)null, var8);
                     if (var25 == null) {
                        var0.method544(0);
                     } else if (var25 instanceof Number) {
                        var0.method544(1);
                        var0.method536(((Number)var25).longValue());
                     } else if (var25 instanceof String) {
                        var0.method544(2);
                        var0.method538((String)var25, (byte)117);
                     } else {
                        var0.method544(4);
                     }
                  }
               } catch (ClassNotFoundException var11) {
                  var0.method544(-10);
               } catch (InvalidClassException var12) {
                  var0.method544(-11);
               } catch (StreamCorruptedException var13) {
                  var0.method544(-12);
               } catch (OptionalDataException var14) {
                  var0.method544(-13);
               } catch (IllegalAccessException var15) {
                  var0.method544(-14);
               } catch (IllegalArgumentException var16) {
                  var0.method544(-15);
               } catch (InvocationTargetException var17) {
                  var0.method544(-16);
               } catch (SecurityException var18) {
                  var0.method544(-17);
               } catch (IOException var19) {
                  var0.method544(-18);
               } catch (NullPointerException var20) {
                  var0.method544(-19);
               } catch (Exception var21) {
                  var0.method544(-20);
               } catch (Throwable var22) {
                  var0.method544(-21);
               }
            }
         }

         var0.method564(var3);
         var2.method637();
      }
   }

   @ObfInfo(
      owner = "hk",
      name = "js",
      desc = "(IIIILjava/lang/String;I)V"
   )
   static void method473(int var0, int var1, int var2, int var3, String var4) {
      class120 var6 = class483.method2375(var1, var2);
      if (null != var6) {
         if (null != var6.field930) {
            class488 var7 = new class488();
            var7.field4067 = var6;
            var7.field4070 = var0;
            var7.field4073 = var4;
            var7.field4069 = var6.field930;
            class396.method1949(var7);
         }

         boolean var9 = true;
         if (var6.field993 > 0) {
            var9 = class267.method1274(var6);
         }

         if (var9) {
            if (class230.method999(class203.method892(var6), var0 - 1)) {
               class299 var8;
               if (var0 == 1) {
                  var8 = class480.method2370(class356.field2943, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

               if (var0 == 2) {
                  var8 = class480.method2370(class356.field3027, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

               if (var0 == 3) {
                  var8 = class480.method2370(class356.field2953, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

               if (var0 == 4) {
                  var8 = class480.method2370(class356.field3011, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

               if (var0 == 5) {
                  var8 = class480.method2370(class356.field2955, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

               if (var0 == 6) {
                  var8 = class480.method2370(class356.field2981, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

               if (var0 == 7) {
                  var8 = class480.method2370(class356.field2962, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

               if (var0 == 8) {
                  var8 = class480.method2370(class356.field2957, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

               if (var0 == 9) {
                  var8 = class480.method2370(class356.field2959, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

               if (var0 == 10) {
                  var8 = class480.method2370(class356.field2964, client.field279.field4042);
                  var8.field2403.method534(var1);
                  var8.field2403.method533(var2);
                  var8.field2403.method533(var3);
                  client.field279.method2389(var8);
               }

            }
         }
      }
   }
}
