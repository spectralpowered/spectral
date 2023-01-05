import java.awt.Font;
import java.io.IOException;
import java.util.concurrent.Callable;

public class class91 implements Callable {
   public static class289 field772;
   static class429 field770;
   static Font field771;
   // $FF: synthetic field
   final class19 this$0;
   final class192 field773;

   class91(class19 var1, class192 var2) {
      this.this$0 = var1;
      this.field773 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field773.method864()) {
            class286.method1421(10L);
         }
      } catch (IOException var2) {
         return new class32("Error servicing REST query: " + var2.getMessage());
      }

      return this.field773.method865();
   }

   static int method382(int var0, class461 var1, boolean var2) {
      return 2;
   }

   static void method383(class242 var0, int var1, int var2, int var3) {
      if (client.field478 < 50 && class50.field574.method2230() != 0) {
         if (var0.field2033 != null && var0.field2033.containsKey(var1)) {
            int var5 = ((Integer)var0.field2033.get(var1)).intValue();
            if (var5 != 0) {
               int var8 = var5 >> 8;
               int var9 = var5 >> 4 & 7;
               int var10 = var5 & 15;
               client.field479[client.field478] = var8;
               client.field480[client.field478] = var9;
               client.field508[client.field478] = 0;
               client.field288[client.field478] = null;
               int var11 = (var2 - 64) / 128;
               int var12 = (var3 - 64) / 128;
               client.field334[client.field478] = var10 + (var12 << 8) + (var11 << 16);
               ++client.field478;
            }

         }
      }
   }

   static int method384(int var0, class461 var1, boolean var2) {
      int var4;
      if (var0 == 4200) {
         var4 = class386.field3248[--class161.field1227];
         class386.field3249[++class386.field3250 - 1] = class423.method2062(var4).field2147;
         return 1;
      } else {
         class263 var6;
         int var7;
         if (var0 == 4201) {
            class161.field1227 -= 2;
            var4 = class386.field3248[class161.field1227];
            var7 = class386.field3248[class161.field1227 + 1];
            var6 = class423.method2062(var4);
            if (var7 >= 1 && var7 <= 5 && null != var6.field2145[var7 - 1]) {
               class386.field3249[++class386.field3250 - 1] = var6.field2145[var7 - 1];
            } else {
               class386.field3249[++class386.field3250 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            class161.field1227 -= 2;
            var4 = class386.field3248[class161.field1227];
            var7 = class386.field3248[1 + class161.field1227];
            var6 = class423.method2062(var4);
            if (var7 >= 1 && var7 <= 5 && null != var6.field2164[var7 - 1]) {
               class386.field3249[++class386.field3250 - 1] = var6.field2164[var7 - 1];
            } else {
               class386.field3249[++class386.field3250 - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var4 = class386.field3248[--class161.field1227];
            class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2158;
            return 1;
         } else if (var0 == 4204) {
            var4 = class386.field3248[--class161.field1227];
            class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2157 == 1 ? 1 : 0;
            return 1;
         } else {
            class263 var5;
            if (var0 == 4205) {
               var4 = class386.field3248[--class161.field1227];
               var5 = class423.method2062(var4);
               if (-1 == var5.field2181 && var5.field2185 >= 0) {
                  class386.field3248[++class161.field1227 - 1] = var5.field2185;
               } else {
                  class386.field3248[++class161.field1227 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4206) {
               var4 = class386.field3248[--class161.field1227];
               var5 = class423.method2062(var4);
               if (var5.field2181 >= 0 && var5.field2185 >= 0) {
                  class386.field3248[++class161.field1227 - 1] = var5.field2185;
               } else {
                  class386.field3248[++class161.field1227 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4207) {
               var4 = class386.field3248[--class161.field1227];
               class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2162 ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var4 = class386.field3248[--class161.field1227];
               var5 = class423.method2062(var4);
               if (var5.field2193 == -1 && var5.field2170 >= 0) {
                  class386.field3248[++class161.field1227 - 1] = var5.field2170;
               } else {
                  class386.field3248[++class161.field1227 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4209) {
               var4 = class386.field3248[--class161.field1227];
               var5 = class423.method2062(var4);
               if (var5.field2193 >= 0 && var5.field2170 >= 0) {
                  class386.field3248[++class161.field1227 - 1] = var5.field2170;
               } else {
                  class386.field3248[++class161.field1227 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4210) {
               String var8 = class386.field3249[--class386.field3250];
               var7 = class386.field3248[--class161.field1227];
               class146.method693(var8, var7 == 1);
               class386.field3248[++class161.field1227 - 1] = class488.field4076;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  class61.field605 = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var4 = class386.field3248[--class161.field1227];
                  var7 = class423.method2062(var4).method1210();
                  if (var7 == -1) {
                     class386.field3248[++class161.field1227 - 1] = var7;
                  } else {
                     class386.field3248[++class161.field1227 - 1] = var7 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var4 = class386.field3248[--class161.field1227];
                  class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2159;
                  return 1;
               } else if (var0 == 4215) {
                  var4 = class386.field3248[--class161.field1227];
                  class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2180;
                  return 1;
               } else if (var0 == 4216) {
                  var4 = class386.field3248[--class161.field1227];
                  class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2150;
                  return 1;
               } else if (var0 == 4217) {
                  var4 = class386.field3248[--class161.field1227];
                  var5 = class423.method2062(var4);
                  class386.field3248[++class161.field1227 - 1] = var5.field2156;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class3.field22 != null && class61.field605 < class488.field4076) {
                  class386.field3248[++class161.field1227 - 1] = class3.field22[++class61.field605 - 1] & '\uffff';
               } else {
                  class386.field3248[++class161.field1227 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
