public class class465 extends class108 {
   public static class164 field3867;
   public static class31 field3868 = new class31(64);
   static final int[] field3872 = new int[32];
   public int field3869;
   public int field3870;
   public int field3871;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field3872[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public void method2279(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method2280(var1, var3);
      }
   }

   void method2280(class134 var1, int var2) {
      if (var2 == 1) {
         this.field3869 = var1.method671();
         this.field3870 = var1.method669();
         this.field3871 = var1.method669();
      }

   }

   static class472 method2282(int var0) {
      class472 var2 = (class472)class472.field3918.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class71.field849.method892(var0, 0);
         if (null == var3) {
            return null;
         } else {
            var2 = class88.method490(var3);
            class472.field3918.method163(var2, (long)var0);
            return var2;
         }
      }
   }

   public static String method2281(String var0) {
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
