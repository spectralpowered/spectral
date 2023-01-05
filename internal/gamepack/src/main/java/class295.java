public class class295 extends class108 {
   static boolean field2829;
   static class164 field2828;
   static class31 field2824 = new class31(64);
   boolean field2826 = true;
   char field2823;
   public int field2827;
   public String field2825;

   void method1390() {
   }

   void method1387(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method1388(var1, var3);
      }
   }

   void method1388(class134 var1, int var2) {
      if (var2 == 1) {
         byte var5 = var1.method670();
         int var6 = var5 & 255;
         if (var6 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var6, 16));
         }

         if (var6 >= 128 && var6 < 160) {
            char var7 = class307.field2898[var6 - 128];
            if (var7 == 0) {
               var7 = '?';
            }

            var6 = var7;
         }

         char var4 = (char)var6;
         this.field2823 = var4;
      } else if (var2 == 2) {
         this.field2827 = var1.method717();
      } else if (var2 == 4) {
         this.field2826 = false;
      } else if (var2 == 5) {
         this.field2825 = var1.method677();
      }

   }

   public boolean method1389() {
      return this.field2823 == 's';
   }

   static int method1391(int var0, class472 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 4000) {
         class188.field1989 -= 2;
         var4 = class150.field1580[class188.field1989];
         var5 = class150.field1580[1 + class188.field1989];
         class150.field1580[++class188.field1989 - 1] = var5 + var4;
         return 1;
      } else if (var0 == 4001) {
         class188.field1989 -= 2;
         var4 = class150.field1580[class188.field1989];
         var5 = class150.field1580[class188.field1989 + 1];
         class150.field1580[++class188.field1989 - 1] = var4 - var5;
         return 1;
      } else if (var0 == 4002) {
         class188.field1989 -= 2;
         var4 = class150.field1580[class188.field1989];
         var5 = class150.field1580[class188.field1989 + 1];
         class150.field1580[++class188.field1989 - 1] = var5 * var4;
         return 1;
      } else if (var0 == 4003) {
         class188.field1989 -= 2;
         var4 = class150.field1580[class188.field1989];
         var5 = class150.field1580[class188.field1989 + 1];
         class150.field1580[++class188.field1989 - 1] = var4 / var5;
         return 1;
      } else if (var0 == 4004) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = (int)(Math.random() * (double)var4);
         return 1;
      } else if (var0 == 4005) {
         var4 = class150.field1580[--class188.field1989];
         class150.field1580[++class188.field1989 - 1] = (int)(Math.random() * (double)(var4 + 1));
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         if (var0 == 4006) {
            class188.field1989 -= 5;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            var6 = class150.field1580[class188.field1989 + 2];
            var7 = class150.field1580[class188.field1989 + 3];
            var8 = class150.field1580[4 + class188.field1989];
            class150.field1580[++class188.field1989 - 1] = (var8 - var6) * (var5 - var4) / (var7 - var6) + var4;
            return 1;
         } else if (var0 == 4007) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            class150.field1580[++class188.field1989 - 1] = var4 * var5 / 100 + var4;
            return 1;
         } else if (var0 == 4008) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            class150.field1580[++class188.field1989 - 1] = var4 | 1 << var5;
            return 1;
         } else if (var0 == 4009) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            class150.field1580[++class188.field1989 - 1] = var4 & -1 - (1 << var5);
            return 1;
         } else if (var0 == 4010) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            class150.field1580[++class188.field1989 - 1] = 0 != (var4 & 1 << var5) ? 1 : 0;
            return 1;
         } else if (var0 == 4011) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            class150.field1580[++class188.field1989 - 1] = var4 % var5;
            return 1;
         } else if (var0 == 4012) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            if (var4 == 0) {
               class150.field1580[++class188.field1989 - 1] = 0;
            } else {
               class150.field1580[++class188.field1989 - 1] = (int)Math.pow((double)var4, (double)var5);
            }

            return 1;
         } else if (var0 == 4013) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            if (var4 == 0) {
               class150.field1580[++class188.field1989 - 1] = 0;
               return 1;
            } else {
               switch(var5) {
               case 0:
                  class150.field1580[++class188.field1989 - 1] = Integer.MAX_VALUE;
                  break;
               case 1:
                  class150.field1580[++class188.field1989 - 1] = var4;
                  break;
               case 2:
                  class150.field1580[++class188.field1989 - 1] = (int)Math.sqrt((double)var4);
                  break;
               case 3:
                  class150.field1580[++class188.field1989 - 1] = (int)Math.cbrt((double)var4);
                  break;
               case 4:
                  class150.field1580[++class188.field1989 - 1] = (int)Math.sqrt(Math.sqrt((double)var4));
                  break;
               default:
                  class150.field1580[++class188.field1989 - 1] = (int)Math.pow((double)var4, 1.0D / (double)var5);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            class150.field1580[++class188.field1989 - 1] = var4 & var5;
            return 1;
         } else if (var0 == 4015) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            class150.field1580[++class188.field1989 - 1] = var4 | var5;
            return 1;
         } else if (var0 == 4018) {
            class188.field1989 -= 3;
            long var10 = (long)class150.field1580[class188.field1989];
            long var11 = (long)class150.field1580[1 + class188.field1989];
            long var12 = (long)class150.field1580[class188.field1989 + 2];
            class150.field1580[++class188.field1989 - 1] = (int)(var10 * var12 / var11);
            return 1;
         } else if (var0 == 4025) {
            var4 = class102.method555(class150.field1580[--class188.field1989]);
            class150.field1580[++class188.field1989 - 1] = var4;
            return 1;
         } else if (var0 == 4026) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            class150.field1580[++class188.field1989 - 1] = var4 ^ 1 << var5;
            return 1;
         } else if (var0 == 4027) {
            class188.field1989 -= 3;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            var6 = class150.field1580[2 + class188.field1989];
            class150.field1580[++class188.field1989 - 1] = class482.method2317(var4, var5, var6);
            return 1;
         } else if (var0 == 4028) {
            class188.field1989 -= 3;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            var6 = class150.field1580[class188.field1989 + 2];
            class150.field1580[++class188.field1989 - 1] = class15.method95(var4, var5, var6);
            return 1;
         } else if (var0 == 4029) {
            class188.field1989 -= 3;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            var6 = class150.field1580[class188.field1989 + 2];
            var7 = 31 - var6;
            class150.field1580[++class188.field1989 - 1] = var4 << var7 >>> var7 + var5;
            return 1;
         } else if (var0 == 4030) {
            class188.field1989 -= 4;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            var6 = class150.field1580[class188.field1989 + 2];
            var7 = class150.field1580[3 + class188.field1989];
            var4 = class15.method95(var4, var6, var7);
            var8 = class30.method159(1 + (var7 - var6));
            if (var5 > var8) {
               var5 = var8;
            }

            class150.field1580[++class188.field1989 - 1] = var4 | var5 << var6;
            return 1;
         } else if (var0 == 4032) {
            class150.field1580[class188.field1989 - 1] = class452.method2146(class150.field1580[class188.field1989 - 1]);
            return 1;
         } else if (var0 == 4033) {
            class150.field1580[class188.field1989 - 1] = class414.method2005(class150.field1580[class188.field1989 - 1]);
            return 1;
         } else if (var0 == 4034) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            var6 = class423.method2029(var4, var5);
            class150.field1580[++class188.field1989 - 1] = var6;
            return 1;
         } else if (var0 == 4035) {
            class150.field1580[class188.field1989 - 1] = Math.abs(class150.field1580[class188.field1989 - 1]);
            return 1;
         } else {
            return 2;
         }
      }
   }
}
