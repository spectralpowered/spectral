@ObfInfo(
   name = "ce"
)
public class class431 extends class139 {
   @ObfInfo(
      owner = "ce",
      name = "ex",
      desc = "Lln;"
   )
   static class38 field3575;
   @ObfInfo(
      owner = "ce",
      name = "x",
      desc = "Lmv;"
   )
   class395 field3576 = new class395();
   @ObfInfo(
      owner = "ce",
      name = "v",
      desc = "Lfw;"
   )
   class406 field3574;

   @ObfInfo(
      owner = "ce",
      name = "<init>",
      desc = "(Lfw;)V"
   )
   class431(class406 var1) {
      this.field3574 = var1;
   }

   @ObfInfo(
      owner = "ce",
      name = "h",
      desc = "(IIIIS)V"
   )
   void method2122(int var1, int var2, int var3, int var4) {
      class121 var6 = null;
      int var7 = 0;

      for(class121 var8 = (class121)this.field3576.method1941(); null != var8; var8 = (class121)this.field3576.method1935()) {
         ++var7;
         if (var8.field1048 == var1) {
            var8.method514(var1, var2, var3, var4);
            return;
         }

         if (var8.field1048 <= var1) {
            var6 = var8;
         }
      }

      if (null == var6) {
         if (var7 < 4) {
            this.field3576.method1933(new class121(var1, var2, var3, var4));
         }

      } else {
         class395.method1942(new class121(var1, var2, var3, var4), var6);
         if (var7 >= 4) {
            this.field3576.method1941().method637();
         }

      }
   }

   @ObfInfo(
      owner = "ce",
      name = "e",
      desc = "(II)Lcu;"
   )
   class121 method2123(int var1) {
      class121 var3 = (class121)this.field3576.method1941();
      if (null != var3 && var3.field1048 <= var1) {
         for(class121 var4 = (class121)this.field3576.method1935(); var4 != null && var4.field1048 <= var1; var4 = (class121)this.field3576.method1935()) {
            var3.method637();
            var3 = var4;
         }

         if (var3.field1049 + var3.field1048 + this.field3574.field3392 > var1) {
            return var3;
         } else {
            var3.method637();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfInfo(
      owner = "ce",
      name = "v",
      desc = "(I)Z"
   )
   boolean method2124() {
      return this.field3576.method1937();
   }

   @ObfInfo(
      owner = "ce",
      name = "h",
      desc = "(Lly;I)V"
   )
   public static void method2128(class274 var0) {
      class123.field1060 = var0;
   }

   @ObfInfo(
      owner = "ce",
      name = "e",
      desc = "(I)V"
   )
   static void method2127() {
      for(class156 var1 = (class156)class156.field1200.method646(); null != var1; var1 = (class156)class156.field1200.method648()) {
         if (null != var1.field1204) {
            var1.method719();
         }
      }

   }

   @ObfInfo(
      owner = "ce",
      name = "n",
      desc = "(CII)Ljava/lang/String;"
   )
   static String method2126(char var0, int var1) {
      char[] var3 = new char[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         var3[var4] = var0;
      }

      return new String(var3);
   }

   @ObfInfo(
      owner = "ce",
      name = "ke",
      desc = "(IIIIIIIII)V"
   )
   static final void method2125(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class268.method1275(var0)) {
         class466.field3875 = null;
         class189.method854(class329.field2600[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (null != class466.field3875) {
            class189.method854(class466.field3875, -1412584499, var1, var2, var3, var4, class168.field1265, class406.field3406, var7);
            class466.field3875 = null;
         }

      } else {
         if (var7 != -1) {
            client.field444[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               client.field444[var9] = true;
            }
         }

      }
   }
}
