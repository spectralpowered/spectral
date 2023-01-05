public class class414 implements Runnable {
   static class164 field3555;
   volatile class157[] field3556 = new class157[2];

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class157 var2 = this.field3556[var1];
            if (null != var2) {
               var2.method833();
            }
         }
      } catch (Exception var3) {
         class23.method122((String)null, var3);
      }

   }

   public static int method2002(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 <= 127) {
            ++var3;
         } else if (var5 <= 2047) {
            var3 += 2;
         } else {
            var3 += 3;
         }
      }

      return var3;
   }

   public static int method2005(int var0) {
      return class135.field1491[var0 & 16383];
   }

   static void method2004() {
      if (client.field472 && null != class52.field776 && class52.field776.length() > 0) {
         class52.field778 = 1;
      } else {
         class52.field778 = 0;
      }

   }

   static final void method2003(String var0, boolean var1) {
      if (client.field550) {
         byte var3 = 4;
         int var4 = var3 + 6;
         int var5 = var3 + 6;
         int var6 = class441.field3651.method516(var0, 250);
         int var7 = class441.field3651.method517(var0, 250) * 13;
         class362.method1739(var4 - var3, var5 - var3, var3 + var3 + var6, var7 + var3 + var3, 0);
         class362.method1731(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
         class441.field3651.method521(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         class13.method87(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3);
         if (var1) {
            class204.field2184.method1056(0, 0);
         } else {
            int var8 = var4;
            int var9 = var5;
            int var10 = var6;
            int var11 = var7;

            for(int var12 = 0; var12 < client.field646; ++var12) {
               if (client.field651[var12] + client.field639[var12] > var8 && client.field651[var12] < var10 + var8 && client.field451[var12] + client.field652[var12] > var9 && client.field652[var12] < var9 + var11) {
                  client.field649[var12] = true;
               }
            }
         }

      }
   }

   static final void method2001(class210 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (client.field606) {
         client.field503 = 32;
      } else {
         client.field503 = 0;
      }

      client.field606 = false;
      int var8;
      if (class182.field1956 == 1 || !class211.field2375 && class182.field1956 == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field2236 -= 4;
            class214.method1117(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.field2236 += 4;
            class214.method1117(var0);
         } else if (var5 >= var1 - client.field503 && var5 < var1 + 16 + client.field503 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
            var8 = var3 * (var3 - 32) / var4;
            if (var8 < 8) {
               var8 = 8;
            }

            int var9 = var6 - var2 - 16 - var8 / 2;
            int var10 = var3 - 32 - var8;
            var0.field2236 = var9 * (var4 - var3) / var10;
            class214.method1117(var0);
            client.field606 = true;
         }
      }

      if (client.field531 != 0) {
         var8 = var0.field2230;
         if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field2236 += client.field531 * 45;
            class214.method1117(var0);
         }
      }

   }
}
