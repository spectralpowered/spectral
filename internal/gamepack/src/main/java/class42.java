public class class42 extends class139 {
   int field525;
   public byte[] field523;
   public class20 field524;
   public class38 field522;

   static boolean method198(class6 var0, int var1) {
      int var3 = var0.method35(2);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (var3 == 0) {
         if (var0.method35(1) != 0) {
            method198(var0, var1);
         }

         var4 = var0.method35(13);
         var5 = var0.method35(13);
         boolean var12 = var0.method35(1) == 1;
         if (var12) {
            class268.field2227[++class268.field2223 - 1] = var1;
         }

         if (null != client.field347[var1]) {
            throw new RuntimeException();
         } else {
            class380 var13 = client.field347[var1] = new class380();
            var13.field3215 = var1;
            if (null != class268.field2218[var1]) {
               var13.method1882(class268.field2218[var1]);
            }

            var13.field2674 = class268.field2224[var1];
            var13.field2641 = class268.field2226[var1];
            var8 = class268.field2219[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var13.field2661[0] = class268.field2225[var1];
            var13.field3214 = (byte)var9;
            var13.method1879(var4 + (var10 << 13) - class312.field2465, var5 + (var11 << 13) - class325.field2575);
            var13.field3205 = false;
            return true;
         }
      } else if (var3 == 1) {
         var4 = var0.method35(2);
         var5 = class268.field2219[var1];
         class268.field2219[var1] = (var5 & 268435455) + ((var4 + (var5 >> 28) & 3) << 28);
         return false;
      } else {
         int var6;
         int var7;
         if (var3 == 2) {
            var4 = var0.method35(5);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var7 = class268.field2219[var1];
            var8 = (var7 >> 28) + var5 & 3;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            if (var6 == 0) {
               --var9;
               --var10;
            }

            if (var6 == 1) {
               --var10;
            }

            if (var6 == 2) {
               ++var9;
               --var10;
            }

            if (var6 == 3) {
               --var9;
            }

            if (var6 == 4) {
               ++var9;
            }

            if (var6 == 5) {
               --var9;
               ++var10;
            }

            if (var6 == 6) {
               ++var10;
            }

            if (var6 == 7) {
               ++var9;
               ++var10;
            }

            class268.field2219[var1] = var10 + (var9 << 14) + (var8 << 28);
            return false;
         } else {
            var4 = var0.method35(18);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 255;
            var8 = class268.field2219[var1];
            var9 = (var8 >> 28) + var5 & 3;
            var10 = (var8 >> 14) + var6 & 255;
            var11 = var7 + var8 & 255;
            class268.field2219[var1] = (var9 << 28) + (var10 << 14) + var11;
            return false;
         }
      }
   }
}
