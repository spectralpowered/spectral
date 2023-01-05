import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfInfo(
   name = "dw"
)
public class class342 extends class434 {
   @ObfInfo(
      owner = "dw",
      name = "f",
      desc = "I"
   )
   public static int field2747;
   @ObfInfo(
      owner = "dw",
      name = "g",
      desc = "[Lra;"
   )
   static class344[] field2746;
   @ObfInfo(
      owner = "dw",
      name = "tc",
      desc = "I"
   )
   static int field2745;
   @ObfInfo(
      owner = "dw",
      name = "m",
      desc = "Z"
   )
   final boolean field2748;

   @ObfInfo(
      owner = "dw",
      name = "<init>",
      desc = "(ZI)V"
   )
   public class342(boolean var1, int var2) {
      super(var2);
      this.field2748 = var1;
   }

   @ObfInfo(
      owner = "dw",
      name = "h",
      desc = "(Ldm;I)V"
   )
   void method2148(class140 var1) throws IOException {
      URLConnection var3 = null;

      try {
         try {
            String var4 = var1.field1137.getProtocol();
            if (var4.equals("http")) {
               var3 = this.method1737(var1);
            } else {
               if (!var4.equals("https")) {
                  var1.field1138 = true;
                  return;
               }

               var3 = this.method1736(var1);
            }

            this.method2152(var3, var1);
         } catch (IOException var8) {
            ;
         }

      } finally {
         var1.field1138 = true;
         if (var3 != null) {
            if (var3 instanceof HttpURLConnection) {
               ((HttpURLConnection)var3).disconnect();
            } else if (var3 instanceof HttpsURLConnection) {
               ((HttpsURLConnection)var3).disconnect();
            }
         }

      }
   }

   @ObfInfo(
      owner = "dw",
      name = "c",
      desc = "(Ldm;B)Ljava/net/URLConnection;"
   )
   URLConnection method1737(class140 var1) throws IOException {
      URLConnection var3 = var1.field1137.openConnection();
      this.method2149(var3);
      return var3;
   }

   @ObfInfo(
      owner = "dw",
      name = "p",
      desc = "(Ldm;B)Ljava/net/URLConnection;"
   )
   URLConnection method1736(class140 var1) throws IOException {
      HttpsURLConnection var3 = (HttpsURLConnection)var1.field1137.openConnection();
      if (!this.field2748) {
         if (null == class225.field1924) {
            class225.field1924 = new class225();
         }

         class225 var5 = class225.field1924;
         var3.setSSLSocketFactory(var5);
      }

      this.method2149(var3);
      return var3;
   }

   @ObfInfo(
      owner = "dw",
      name = "h",
      desc = "(II)Lfi;"
   )
   public static class85 method1738(int var0) {
      class85 var2 = (class85)class85.field700.method394((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class85.field699.method1365(16, var0);
         var2 = new class85();
         if (var3 != null) {
            var2.method353(new class127(var3));
         }

         class85.field700.method396(var2, (long)var0);
         return var2;
      }
   }

   @ObfInfo(
      owner = "dw",
      name = "h",
      desc = "(B)Ljx;"
   )
   public static class299 method1739() {
      return class299.field2404 == 0 ? new class299() : class299.field2401[--class299.field2404];
   }

   @ObfInfo(
      owner = "dw",
      name = "i",
      desc = "(Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static String method1740(String var0) {
      StringBuilder var2 = new StringBuilder(var0.length());
      int var3 = 0;
      int var4 = -1;

      for(int var5 = 0; var5 < var0.length(); ++var5) {
         char var6 = var0.charAt(var5);
         if (var6 == '<') {
            var2.append(var0.substring(var3, var5));
            var4 = var5;
         } else if (var6 == '>' && var4 != -1) {
            String var7 = var0.substring(var4 + 1, var5);
            var4 = -1;
            if (var7.equals("lt")) {
               var2.append("<");
            } else if (var7.equals("gt")) {
               var2.append(">");
            } else if (var7.equals("br")) {
               var2.append("\n");
            }

            var3 = var5 + 1;
         }
      }

      if (var3 < var0.length()) {
         var2.append(var0.substring(var3, var0.length()));
      }

      return var2.toString();
   }

   @ObfInfo(
      owner = "dw",
      name = "f",
      desc = "(Lbz;Lbz;IZI)I"
   )
   static int method1741(class2 var0, class2 var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var5 = var0.field17;
         int var6 = var1.field17;
         if (!var3) {
            if (var5 == -1) {
               var5 = 2001;
            }

            if (var6 == -1) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else if (var2 == 2) {
         return var0.field19 - var1.field19;
      } else if (var2 == 3) {
         if (var0.field13.equals("-")) {
            if (var1.field13.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field13.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field13.compareTo(var1.field13);
         }
      } else if (var2 == 4) {
         return var0.method5() ? (var1.method5() ? 0 : 1) : (var1.method5() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method8() ? (var1.method8() ? 0 : 1) : (var1.method8() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method4() ? (var1.method4() ? 0 : 1) : (var1.method4() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method3() ? (var1.method3() ? 0 : 1) : (var1.method3() ? -1 : 0);
      } else {
         return var0.field10 - var1.field10;
      }
   }
}
