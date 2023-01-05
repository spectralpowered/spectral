@ObfInfo(
   name = "df"
)
public class class134 extends class392 {
   @ObfInfo(
      owner = "df",
      name = "d",
      desc = "Ljava/lang/String;"
   )
   public static String field1109;
   @ObfInfo(
      owner = "df",
      name = "h",
      desc = "Z"
   )
   final boolean field1110;

   @ObfInfo(
      owner = "df",
      name = "<init>",
      desc = "(Z)V"
   )
   public class134(boolean var1) {
      this.field1110 = var1;
   }

   @ObfInfo(
      owner = "df",
      name = "h",
      desc = "(Loa;Loa;I)I"
   )
   int method627(class69 var1, class69 var2) {
      if (var1.field627 != var2.field627) {
         return this.field1110 ? var1.field627 - var2.field627 : var2.field627 - var1.field627;
      } else {
         return this.method1918(var1, var2);
      }
   }

   @ObfInfo(
      owner = "df",
      name = "compare",
      desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
   )
   public int compare(Object var1, Object var2) {
      return this.method627((class69)var1, (class69)var2);
   }

   @ObfInfo(
      owner = "df",
      name = "h",
      desc = "(II)Lgd;"
   )
   public static class50 method628(int var0) {
      class50 var2 = (class50)class50.field572.method394((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class50.field575.method1365(34, var0);
         var2 = new class50();
         if (null != var3) {
            var2.method258(new class127(var3));
         }

         var2.method256();
         class50.field572.method396(var2, (long)var0);
         return var2;
      }
   }

   @ObfInfo(
      owner = "df",
      name = "hu",
      desc = "(B)V"
   )
   static void method629() {
      if (client.field258) {
         class200.method883(class113.field846, false);
      }

   }
}
