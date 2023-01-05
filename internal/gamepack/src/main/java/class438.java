@ObfInfo(
   name = "he"
)
public final class class438 extends class139 {
   @ObfInfo(
      owner = "he",
      name = "tx",
      desc = "I"
   )
   static int field3645;
   @ObfInfo(
      owner = "he",
      name = "a",
      desc = "Z"
   )
   boolean field3638;
   @ObfInfo(
      owner = "he",
      name = "s",
      desc = "Z"
   )
   boolean field3639;
   @ObfInfo(
      owner = "he",
      name = "k",
      desc = "Z"
   )
   boolean field3644;
   @ObfInfo(
      owner = "he",
      name = "q",
      desc = "Lhy;"
   )
   class115 field3627;
   @ObfInfo(
      owner = "he",
      name = "m",
      desc = "Lhj;"
   )
   class151 field3622;
   @ObfInfo(
      owner = "he",
      name = "r",
      desc = "Lhb;"
   )
   class173 field3629;
   @ObfInfo(
      owner = "he",
      name = "g",
      desc = "[Lhp;"
   )
   class211[] field3633 = new class211[5];
   @ObfInfo(
      owner = "he",
      name = "u",
      desc = "Lhs;"
   )
   class340 field3630;
   @ObfInfo(
      owner = "he",
      name = "f",
      desc = "Lhq;"
   )
   class384 field3628;
   @ObfInfo(
      owner = "he",
      name = "d",
      desc = "Lhe;"
   )
   class438 field3637;
   @ObfInfo(
      owner = "he",
      name = "b",
      desc = "Lgy;"
   )
   class447 field3631;
   @ObfInfo(
      owner = "he",
      name = "e",
      desc = "I"
   )
   int field3623;
   @ObfInfo(
      owner = "he",
      name = "v",
      desc = "I"
   )
   int field3624;
   @ObfInfo(
      owner = "he",
      name = "x",
      desc = "I"
   )
   int field3625;
   @ObfInfo(
      owner = "he",
      name = "j",
      desc = "I"
   )
   int field3632;
   @ObfInfo(
      owner = "he",
      name = "c",
      desc = "I"
   )
   int field3634;
   @ObfInfo(
      owner = "he",
      name = "o",
      desc = "I"
   )
   int field3635 = 0;
   @ObfInfo(
      owner = "he",
      name = "n",
      desc = "I"
   )
   int field3636;
   @ObfInfo(
      owner = "he",
      name = "l",
      desc = "I"
   )
   int field3640;
   @ObfInfo(
      owner = "he",
      name = "t",
      desc = "I"
   )
   int field3641;
   @ObfInfo(
      owner = "he",
      name = "h",
      desc = "I"
   )
   int field3642;
   @ObfInfo(
      owner = "he",
      name = "p",
      desc = "I"
   )
   int field3643;
   @ObfInfo(
      owner = "he",
      name = "i",
      desc = "[I"
   )
   int[] field3626 = new int[5];

   @ObfInfo(
      owner = "he",
      name = "<init>",
      desc = "(III)V"
   )
   class438(int var1, int var2, int var3) {
      this.field3625 = this.field3642 = var1;
      this.field3623 = var2;
      this.field3624 = var3;
   }

   @ObfInfo(
      owner = "he",
      name = "h",
      desc = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;"
   )
   public static String method2175(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var9 = var0[var1];
         return var9 == null ? "null" : var9.toString();
      } else {
         int var4 = var2 + var1;
         int var5 = 0;

         for(int var6 = var1; var6 < var4; ++var6) {
            CharSequence var7 = var0[var6];
            if (null == var7) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var10 = new StringBuilder(var5);

         for(int var11 = var1; var11 < var4; ++var11) {
            CharSequence var8 = var0[var11];
            if (var8 == null) {
               var10.append("null");
            } else {
               var10.append(var8);
            }
         }

         return var10.toString();
      }
   }

   @ObfInfo(
      owner = "he",
      name = "x",
      desc = "(I)V"
   )
   static void method2174() {
      class455 var1 = null;

      try {
         var1 = class161.method737("", class41.field210.field4117, true);
         class127 var2 = class50.field574.method2201();
         var1.method2247(var2.field1072, 0, var2.field1070);
      } catch (Exception var4) {
         ;
      }

      try {
         if (var1 != null) {
            var1.method2249(true);
         }
      } catch (Exception var3) {
         ;
      }

   }
}
