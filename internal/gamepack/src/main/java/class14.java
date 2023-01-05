@ObfInfo(
   name = "ph"
)
public class class14 {
   @ObfInfo(
      owner = "ph",
      name = "h",
      desc = "Lph;"
   )
   public static final class14 field67 = new class14("application/json");
   @ObfInfo(
      owner = "ph",
      name = "fz",
      desc = "I"
   )
   static int field70;
   @ObfInfo(
      owner = "ph",
      name = "e",
      desc = "Lph;"
   )
   static final class14 field68 = new class14("text/plain");
   @ObfInfo(
      owner = "ph",
      name = "v",
      desc = "Ljava/lang/String;"
   )
   String field69;

   @ObfInfo(
      owner = "ph",
      name = "<init>",
      desc = "(Ljava/lang/String;)V"
   )
   class14(String var1) {
      this.field69 = var1;
   }

   @ObfInfo(
      owner = "ph",
      name = "h",
      desc = "(I)Ljava/lang/String;"
   )
   public String method71() {
      return this.field69;
   }

   @ObfInfo(
      owner = "ph",
      name = "v",
      desc = "([Lbz;II[I[IB)V"
   )
   static void method72(class2[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var6 = var1 - 1;
         int var7 = var2 + 1;
         int var8 = (var1 + var2) / 2;
         class2 var9 = var0[var8];
         var0[var8] = var0[var1];
         var0[var1] = var9;

         while(var6 < var7) {
            boolean var10 = true;

            int var11;
            int var12;
            int var13;
            do {
               --var7;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (2 == var3[var11]) {
                     var12 = var0[var7].field20;
                     var13 = var9.field20;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var7].field17;
                     var13 = var9.field17;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && 1 == var4[var11]) {
                        var13 = 2001;
                     }
                  } else if (3 == var3[var11]) {
                     var12 = var0[var7].method3() ? 1 : 0;
                     var13 = var9.method3() ? 1 : 0;
                  } else {
                     var12 = var0[var7].field10;
                     var13 = var9.field10;
                  }

                  if (var12 != var13) {
                     if ((1 != var4[var11] || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            var10 = true;

            do {
               ++var6;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (2 == var3[var11]) {
                     var12 = var0[var6].field20;
                     var13 = var9.field20;
                  } else if (1 == var3[var11]) {
                     var12 = var0[var6].field17;
                     var13 = var9.field17;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var6].method3() ? 1 : 0;
                     var13 = var9.method3() ? 1 : 0;
                  } else {
                     var12 = var0[var6].field10;
                     var13 = var9.field10;
                  }

                  if (var12 != var13) {
                     if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            if (var6 < var7) {
               class2 var14 = var0[var6];
               var0[var6] = var0[var7];
               var0[var7] = var14;
            }
         }

         method72(var0, var1, var7, var3, var4);
         method72(var0, var7 + 1, var2, var3, var4);
      }

   }

   @ObfInfo(
      owner = "ph",
      name = "f",
      desc = "(I)V"
   )
   public static void method70() {
      class11.field60.method395();
   }
}
