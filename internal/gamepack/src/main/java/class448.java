public final class class448 extends class106 {
   static int field3689;
   boolean field3682;
   boolean field3683;
   boolean field3688;
   class176 field3672;
   class211 field3666;
   class316 field3673;
   class323[] field3677 = new class323[5];
   class344 field3674;
   class395 field3675;
   class448 field3681;
   class49 field3671;
   int field3667;
   int field3668;
   int field3669;
   int field3676;
   int field3678;
   int field3679 = 0;
   int field3680;
   int field3684;
   int field3685;
   int field3686;
   int field3687;
   int[] field3670 = new int[5];

   class448(int var1, int var2, int var3) {
      this.field3669 = this.field3686 = var1;
      this.field3667 = var2;
      this.field3668 = var3;
   }

   public static String method2123(CharSequence[] var0, int var1, int var2) {
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

   static void method2122() {
      class476 var1 = null;

      try {
         var1 = class188.method976("", class451.field3700.field3137, true);
         class134 var2 = class111.field1385.method1316();
         var1.method2301(var2.field1489, 0, var2.field1487);
      } catch (Exception var4) {
         ;
      }

      try {
         if (var1 != null) {
            var1.method2303(true);
         }
      } catch (Exception var3) {
         ;
      }

   }
}
