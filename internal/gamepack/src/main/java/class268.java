@ObfInfo(
   name = "ci"
)
public class class268 {
   @ObfInfo(
      owner = "ci",
      name = "v",
      desc = "[B"
   )
   static byte[] field2217 = new byte[2048];
   @ObfInfo(
      owner = "ci",
      name = "n",
      desc = "Lqy;"
   )
   static class127 field2228 = new class127(new byte[5000]);
   @ObfInfo(
      owner = "ci",
      name = "m",
      desc = "[Lqy;"
   )
   static class127[] field2218 = new class127[2048];
   @ObfInfo(
      owner = "ci",
      name = "x",
      desc = "[Lgs;"
   )
   static class294[] field2225 = new class294[2048];
   @ObfInfo(
      owner = "ci",
      name = "r",
      desc = "I"
   )
   static int field2216 = 0;
   @ObfInfo(
      owner = "ci",
      name = "q",
      desc = "I"
   )
   static int field2221 = 0;
   @ObfInfo(
      owner = "ci",
      name = "i",
      desc = "I"
   )
   static int field2223 = 0;
   @ObfInfo(
      owner = "ci",
      name = "b",
      desc = "[I"
   )
   static int[] field2219 = new int[2048];
   @ObfInfo(
      owner = "ci",
      name = "f",
      desc = "[I"
   )
   static int[] field2220 = new int[2048];
   @ObfInfo(
      owner = "ci",
      name = "u",
      desc = "[I"
   )
   static int[] field2222 = new int[2048];
   @ObfInfo(
      owner = "ci",
      name = "j",
      desc = "[I"
   )
   static int[] field2224 = new int[2048];
   @ObfInfo(
      owner = "ci",
      name = "g",
      desc = "[I"
   )
   static int[] field2226 = new int[2048];
   @ObfInfo(
      owner = "ci",
      name = "o",
      desc = "[I"
   )
   static int[] field2227 = new int[2048];

   @ObfInfo(
      owner = "ci",
      name = "x",
      desc = "(II)Z"
   )
   public static boolean method1275(int var0) {
      if (class476.field4009[var0]) {
         return true;
      } else if (!class126.field1066.method1344(var0)) {
         return false;
      } else {
         int var2 = class126.field1066.method1360(var0);
         if (var2 == 0) {
            class476.field4009[var0] = true;
            return true;
         } else {
            if (null == class329.field2600[var0]) {
               class329.field2600[var0] = new class120[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (null == class329.field2600[var0][var3]) {
                  byte[] var4 = class126.field1066.method1365(var0, var3);
                  if (null != var4) {
                     class329.field2600[var0][var3] = new class120();
                     class329.field2600[var0][var3].field985 = (var0 << 16) + var3;
                     if (-1 == var4[0]) {
                        class329.field2600[var0][var3].method494(new class127(var4));
                     } else {
                        class329.field2600[var0][var3].method475(new class127(var4));
                     }
                  }
               }
            }

            class476.field4009[var0] = true;
            return true;
         }
      }
   }
}
