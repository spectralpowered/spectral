import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class83 {
   public static int[] field952;
   static class161 field951;

   public static void method443(class421 var0) {
      class13 var2 = (class13)class384.field3334.method327();
      if (var2 != null) {
         int var3 = var0.field1487;
         var0.method656(var2.field120);

         for(int var4 = 0; var4 < var2.field124; ++var4) {
            if (0 != var2.field121[var4]) {
               var0.method666(var2.field121[var4]);
            } else {
               try {
                  int var5 = var2.field123[var4];
                  Field var6;
                  int var7;
                  if (var5 == 0) {
                     var6 = var2.field122[var4];
                     var7 = var6.getInt((Object)null);
                     var0.method666(0);
                     var0.method656(var7);
                  } else if (var5 == 1) {
                     var6 = var2.field122[var4];
                     var6.setInt((Object)null, var2.field119[var4]);
                     var0.method666(0);
                  } else if (var5 == 2) {
                     var6 = var2.field122[var4];
                     var7 = var6.getModifiers();
                     var0.method666(0);
                     var0.method656(var7);
                  }

                  Method var23;
                  if (var5 != 3) {
                     if (var5 == 4) {
                        var23 = var2.field125[var4];
                        var7 = var23.getModifiers();
                        var0.method666(0);
                        var0.method656(var7);
                     }
                  } else {
                     var23 = var2.field125[var4];
                     byte[][] var24 = var2.field118[var4];
                     Object[] var8 = new Object[var24.length];

                     for(int var9 = 0; var9 < var24.length; ++var9) {
                        ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
                        var8[var9] = var10.readObject();
                     }

                     Object var25 = var23.invoke((Object)null, var8);
                     if (var25 == null) {
                        var0.method666(0);
                     } else if (var25 instanceof Number) {
                        var0.method666(1);
                        var0.method658(((Number)var25).longValue());
                     } else if (var25 instanceof String) {
                        var0.method666(2);
                        var0.method660((String)var25, (byte)117);
                     } else {
                        var0.method666(4);
                     }
                  }
               } catch (ClassNotFoundException var11) {
                  var0.method666(-10);
               } catch (InvalidClassException var12) {
                  var0.method666(-11);
               } catch (StreamCorruptedException var13) {
                  var0.method666(-12);
               } catch (OptionalDataException var14) {
                  var0.method666(-13);
               } catch (IllegalAccessException var15) {
                  var0.method666(-14);
               } catch (IllegalArgumentException var16) {
                  var0.method666(-15);
               } catch (InvocationTargetException var17) {
                  var0.method666(-16);
               } catch (SecurityException var18) {
                  var0.method666(-17);
               } catch (IOException var19) {
                  var0.method666(-18);
               } catch (NullPointerException var20) {
                  var0.method666(-19);
               } catch (Exception var21) {
                  var0.method666(-20);
               } catch (Throwable var22) {
                  var0.method666(-21);
               }
            }
         }

         var0.method686(var3);
         var2.method567();
      }
   }

   static void method444(int var0, int var1, int var2, int var3, String var4) {
      class210 var6 = class34.method169(var1, var2);
      if (null != var6) {
         if (null != var6.field2252) {
            class169 var7 = new class169();
            var7.field1848 = var6;
            var7.field1851 = var0;
            var7.field1854 = var4;
            var7.field1850 = var6.field2252;
            class194.method1001(var7);
         }

         boolean var9 = true;
         if (var6.field2315 > 0) {
            var9 = class53.method314(var6);
         }

         if (var9) {
            if (class158.method836(class172.method913(var6), var0 - 1)) {
               class81 var8;
               if (var0 == 1) {
                  var8 = class189.method982(class165.field1729, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

               if (var0 == 2) {
                  var8 = class189.method982(class165.field1813, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

               if (var0 == 3) {
                  var8 = class189.method982(class165.field1739, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

               if (var0 == 4) {
                  var8 = class189.method982(class165.field1797, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

               if (var0 == 5) {
                  var8 = class189.method982(class165.field1741, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

               if (var0 == 6) {
                  var8 = class189.method982(class165.field1767, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

               if (var0 == 7) {
                  var8 = class189.method982(class165.field1748, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

               if (var0 == 8) {
                  var8 = class189.method982(class165.field1743, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

               if (var0 == 9) {
                  var8 = class189.method982(class165.field1745, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

               if (var0 == 10) {
                  var8 = class189.method982(class165.field1750, client.field483.field3459);
                  var8.field933.method656(var1);
                  var8.field933.method655(var2);
                  var8.field933.method655(var3);
                  client.field483.method1920(var8);
               }

            }
         }
      }
   }
}
