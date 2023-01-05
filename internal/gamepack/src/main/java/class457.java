public class class457 extends class195 {
   public static class274 field3778;
   public static class99 field3779 = new class99(64);
   static final int[] field3783 = new int[32];
   public int field3780;
   public int field3781;
   public int field3782;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field3783[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public void method2256(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         this.method2257(var1, var3);
      }
   }

   void method2257(class127 var1, int var2) {
      if (var2 == 1) {
         this.field3780 = var1.method549();
         this.field3781 = var1.method547();
         this.field3782 = var1.method547();
      }

   }

   static class461 method2259(int var0) {
      class461 var2 = (class461)class461.field3821.method394((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class329.field2596.method1365(var0, 0);
         if (null == var3) {
            return null;
         } else {
            var2 = class9.method56(var3);
            class461.field3821.method396(var2, (long)var0);
            return var2;
         }
      }
   }

   public static String method2258(String var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];
      byte var4 = 2;

      for(int var5 = 0; var5 < var2; ++var5) {
         char var6 = var0.charAt(var5);
         if (var4 == 0) {
            var6 = Character.toLowerCase(var6);
         } else if (var4 == 2 || Character.isUpperCase(var6)) {
            char var7;
            if (var6 != 181 && var6 != 402) {
               var7 = Character.toTitleCase(var6);
            } else {
               var7 = var6;
            }

            var6 = var7;
         }

         if (Character.isLetter(var6)) {
            var4 = 0;
         } else if (var6 != '.' && var6 != '?' && var6 != '!') {
            if (Character.isSpaceChar(var6)) {
               if (var4 != 2) {
                  var4 = 1;
               }
            } else {
               var4 = 1;
            }
         } else {
            var4 = 2;
         }

         var3[var5] = var6;
      }

      return new String(var3);
   }
}
