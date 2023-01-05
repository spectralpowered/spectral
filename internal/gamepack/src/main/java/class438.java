public final class class438 extends class139 {
   static int field3645;
   boolean field3638;
   boolean field3639;
   boolean field3644;
   class115 field3627;
   class151 field3622;
   class173 field3629;
   class211[] field3633 = new class211[5];
   class340 field3630;
   class384 field3628;
   class438 field3637;
   class447 field3631;
   int field3623;
   int field3624;
   int field3625;
   int field3632;
   int field3634;
   int field3635 = 0;
   int field3636;
   int field3640;
   int field3641;
   int field3642;
   int field3643;
   int[] field3626 = new int[5];

   class438(int var1, int var2, int var3) {
      this.field3625 = this.field3642 = var1;
      this.field3623 = var2;
      this.field3624 = var3;
   }

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
