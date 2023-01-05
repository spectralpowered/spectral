@ObfInfo(
   name = "cq"
)
public class class193 {
   @ObfInfo(
      owner = "cq",
      name = "x",
      desc = "I"
   )
   int field1721 = 0;
   @ObfInfo(
      owner = "cq",
      name = "e",
      desc = "Lln;"
   )
   final class38 field1722;
   @ObfInfo(
      owner = "cq",
      name = "v",
      desc = "I"
   )
   final int field1723;

   @ObfInfo(
      owner = "cq",
      name = "<init>",
      desc = "(Lln;Ljava/lang/String;)V"
   )
   class193(class38 var1, String var2) {
      this.field1722 = var1;
      this.field1723 = var1.method1353();
   }

   @ObfInfo(
      owner = "cq",
      name = "h",
      desc = "(B)Z"
   )
   boolean method869() {
      this.field1721 = 0;

      for(int var2 = 0; var2 < this.field1723; ++var2) {
         if (!this.field1722.method160(var2) || this.field1722.method157(var2)) {
            ++this.field1721;
         }
      }

      return this.field1721 >= this.field1723;
   }

   @ObfInfo(
      owner = "cq",
      name = "mm",
      desc = "(Lkd;I)Ljava/lang/String;"
   )
   static String method868(class120 var0) {
      if (class486.method2379(class203.method892(var0)) == 0) {
         return null;
      } else {
         return var0.field983 != null && var0.field983.trim().length() != 0 ? var0.field983 : null;
      }
   }

   @ObfInfo(
      owner = "cq",
      name = "mc",
      desc = "([BII)V"
   )
   static void method867(byte[] var0, int var1) {
      if (client.field273 == null) {
         client.field273 = new byte[24];
      }

      class165.method771(var0, var1, client.field273, 0, 24);
   }
}
