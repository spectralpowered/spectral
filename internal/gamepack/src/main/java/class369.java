import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfInfo(
   name = "q"
)
public class class369 implements class377 {
   @ObfInfo(
      owner = "q",
      name = "h",
      desc = "Ljava/security/MessageDigest;"
   )
   final MessageDigest field3129 = this.method1822();

   @ObfInfo(
      owner = "q",
      name = "<init>",
      desc = "(Lu;)V"
   )
   class369(class278 var1) {
   }

   @ObfInfo(
      owner = "q",
      name = "h",
      desc = "(ILjava/lang/String;J)Z"
   )
   boolean method1819(int var1, String var2, long var3) {
      byte[] var5 = this.method1820(var2, var3);
      return method1823(var5) >= var1;
   }

   @ObfInfo(
      owner = "q",
      name = "x",
      desc = "(Ljava/lang/String;J)[B"
   )
   byte[] method1820(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field3129.reset();

      try {
         this.field3129.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field3129.digest();
   }

   @ObfInfo(
      owner = "q",
      name = "m",
      desc = "()Ljava/security/MessageDigest;"
   )
   MessageDigest method1822() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   @ObfInfo(
      owner = "q",
      name = "e",
      desc = "([B)I"
   )
   static int method1823(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         byte var4 = var2[var3];
         int var5 = method1821(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ObfInfo(
      owner = "q",
      name = "v",
      desc = "(B)I"
   )
   static int method1821(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for(int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            ++var1;
         }
      }

      return var1;
   }
}
