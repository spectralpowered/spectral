@ObfInfo(
   name = "u"
)
public class class278 {
   @ObfInfo(
      owner = "u",
      name = "e",
      desc = "I"
   )
   final int field2330;
   @ObfInfo(
      owner = "u",
      name = "h",
      desc = "I"
   )
   final int field2331;
   @ObfInfo(
      owner = "u",
      name = "v",
      desc = "Ljava/lang/String;"
   )
   final String field2332;

   @ObfInfo(
      owner = "u",
      name = "<init>",
      desc = "(IILjava/lang/String;)V"
   )
   class278(int var1, int var2, String var3) {
      this.field2331 = var1;
      this.field2330 = var2;
      this.field2332 = var3;
   }

   @ObfInfo(
      owner = "u",
      name = "<init>",
      desc = "(Lqy;)V"
   )
   class278(class127 var1) {
      this(var1.method547(), var1.method547(), var1.method555());
   }

   @ObfInfo(
      owner = "u",
      name = "h",
      desc = "()Ljava/lang/String;"
   )
   String method1389() {
      return Integer.toHexString(this.field2331) + Integer.toHexString(this.field2330) + this.field2332;
   }

   @ObfInfo(
      owner = "u",
      name = "e",
      desc = "()I"
   )
   int method1390() {
      return this.field2330;
   }
}
