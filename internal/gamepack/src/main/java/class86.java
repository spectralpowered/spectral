public class class86 {
   public static void method470(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         short var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method470(var0, var1, var2, var6 - 1);
         method470(var0, var1, var6 + 1, var3);
      }

   }

   static int method469(int var0, class472 var1, boolean var2) {
      int var4;
      if (var0 == 5504) {
         class188.field1989 -= 2;
         var4 = class150.field1580[class188.field1989];
         int var5 = class150.field1580[class188.field1989 + 1];
         if (!client.field688) {
            client.field504 = var4;
            client.field505 = var5;
         }

         return 1;
      } else if (var0 == 5505) {
         class150.field1580[++class188.field1989 - 1] = client.field504;
         return 1;
      } else if (var0 == 5506) {
         class150.field1580[++class188.field1989 - 1] = client.field505;
         return 1;
      } else if (var0 == 5530) {
         var4 = class150.field1580[--class188.field1989];
         if (var4 < 0) {
            var4 = 0;
         }

         client.field666 = var4;
         return 1;
      } else if (var0 == 5531) {
         class150.field1580[++class188.field1989 - 1] = client.field666;
         return 1;
      } else {
         return 2;
      }
   }
}
