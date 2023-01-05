public class class25 {
   static byte[] field176 = new byte[2048];
   static class134 field187 = new class134(new byte[5000]);
   static class134[] field177 = new class134[2048];
   static class156[] field184 = new class156[2048];
   static int field175 = 0;
   static int field180 = 0;
   static int field182 = 0;
   static int[] field178 = new int[2048];
   static int[] field179 = new int[2048];
   static int[] field181 = new int[2048];
   static int[] field183 = new int[2048];
   static int[] field185 = new int[2048];
   static int[] field186 = new int[2048];

   public static boolean method126(int var0) {
      if (class22.field167[var0]) {
         return true;
      } else if (!class477.field3968.method871(var0)) {
         return false;
      } else {
         int var2 = class477.field3968.method887(var0);
         if (var2 == 0) {
            class22.field167[var0] = true;
            return true;
         } else {
            if (null == class71.field853[var0]) {
               class71.field853[var0] = new class210[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (null == class71.field853[var0][var3]) {
                  byte[] var4 = class477.field3968.method892(var0, var3);
                  if (null != var4) {
                     class71.field853[var0][var3] = new class210();
                     class71.field853[var0][var3].field2307 = (var0 << 16) + var3;
                     if (-1 == var4[0]) {
                        class71.field853[var0][var3].method1085(new class134(var4));
                     } else {
                        class71.field853[var0][var3].method1066(new class134(var4));
                     }
                  }
               }
            }

            class22.field167[var0] = true;
            return true;
         }
      }
   }
}
