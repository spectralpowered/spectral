import java.math.BigInteger;

public class class329 {
   public static class120[][] field2600;
   public static int field2598;
   static class38 field2596;
   static final BigInteger field2597 = new BigInteger("ad3d9ce586e8174849a64e9a4c026a0e0b9e654a319951144939f4cc7869cd5660e3ee34d1ef221b4c86970d1370225f8c5c1dd04f2182a7eeaa5227c04f38692a85384e06228c1bf5da9c76971ad9b891964f096fc3a8d2ab6cff41d20a678c81990dce1e9c587798d638f848ade22a1232d9c2452834ec87a43a26c325080f", 16);
   static final BigInteger field2599 = new BigInteger("10001", 16);

   static final void method1670(int var0, int var1, int var2, int var3) {
      for(int var5 = var1; var5 <= var3 + var1; ++var5) {
         for(int var6 = var0; var6 <= var0 + var2; ++var6) {
            if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               class36.field182[0][var6][var5] = 127;
               if (var6 == var0 && var6 > 0) {
                  class71.field636[0][var6][var5] = class71.field636[0][var6 - 1][var5];
               }

               if (var2 + var0 == var6 && var6 < 103) {
                  class71.field636[0][var6][var5] = class71.field636[0][var6 + 1][var5];
               }

               if (var1 == var5 && var5 > 0) {
                  class71.field636[0][var6][var5] = class71.field636[0][var6][var5 - 1];
               }

               if (var5 == var3 + var1 && var5 < 103) {
                  class71.field636[0][var6][var5] = class71.field636[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   static int method1671(int var0, class461 var1, boolean var2) {
      class120 var4 = var2 ? class108.field822 : class37.field183;
      if (var0 == 1500) {
         class386.field3248[++class161.field1227 - 1] = var4.field906;
         return 1;
      } else if (var0 == 1501) {
         class386.field3248[++class161.field1227 - 1] = var4.field907;
         return 1;
      } else if (var0 == 1502) {
         class386.field3248[++class161.field1227 - 1] = var4.field908;
         return 1;
      } else if (var0 == 1503) {
         class386.field3248[++class161.field1227 - 1] = var4.field967;
         return 1;
      } else if (var0 == 1504) {
         class386.field3248[++class161.field1227 - 1] = var4.field945 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         class386.field3248[++class161.field1227 - 1] = var4.field912;
         return 1;
      } else {
         return 2;
      }
   }
}
