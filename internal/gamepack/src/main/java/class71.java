import java.math.BigInteger;

public class class71 {
   public static class210[][] field853;
   public static int field851;
   static class230 field849;
   static final BigInteger field850 = new BigInteger("ad3d9ce586e8174849a64e9a4c026a0e0b9e654a319951144939f4cc7869cd5660e3ee34d1ef221b4c86970d1370225f8c5c1dd04f2182a7eeaa5227c04f38692a85384e06228c1bf5da9c76971ad9b891964f096fc3a8d2ab6cff41d20a678c81990dce1e9c587798d638f848ade22a1232d9c2452834ec87a43a26c325080f", 16);
   static final BigInteger field852 = new BigInteger("10001", 16);

   static final void method396(int var0, int var1, int var2, int var3) {
      for(int var5 = var1; var5 <= var3 + var1; ++var5) {
         for(int var6 = var0; var6 <= var0 + var2; ++var6) {
            if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               class431.field3603[0][var6][var5] = 127;
               if (var6 == var0 && var6 > 0) {
                  class74.field858[0][var6][var5] = class74.field858[0][var6 - 1][var5];
               }

               if (var2 + var0 == var6 && var6 < 103) {
                  class74.field858[0][var6][var5] = class74.field858[0][var6 + 1][var5];
               }

               if (var1 == var5 && var5 > 0) {
                  class74.field858[0][var6][var5] = class74.field858[0][var6][var5 - 1];
               }

               if (var5 == var3 + var1 && var5 < 103) {
                  class74.field858[0][var6][var5] = class74.field858[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   static int method397(int var0, class472 var1, boolean var2) {
      class210 var4 = var2 ? class142.field1544 : class425.field3580;
      if (var0 == 1500) {
         class150.field1580[++class188.field1989 - 1] = var4.field2228;
         return 1;
      } else if (var0 == 1501) {
         class150.field1580[++class188.field1989 - 1] = var4.field2229;
         return 1;
      } else if (var0 == 1502) {
         class150.field1580[++class188.field1989 - 1] = var4.field2230;
         return 1;
      } else if (var0 == 1503) {
         class150.field1580[++class188.field1989 - 1] = var4.field2289;
         return 1;
      } else if (var0 == 1504) {
         class150.field1580[++class188.field1989 - 1] = var4.field2267 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         class150.field1580[++class188.field1989 - 1] = var4.field2234;
         return 1;
      } else {
         return 2;
      }
   }
}
