@ObfInfo(
   name = "jb"
)
public class class405 {
   @ObfInfo(
      owner = "jb",
      name = "h",
      desc = "(ILoi;Lln;I)V"
   )
   static void method1991(int var0, class20 var1, class38 var2) {
      class42 var4 = new class42();
      var4.field525 = 1;
      var4.field1134 = (long)var0;
      var4.field524 = var1;
      var4.field522 = var2;
      class141 var5 = class254.field2094;
      synchronized(class254.field2094) {
         class254.field2094.method642(var4);
      }

      class312.method1506();
   }

   @ObfInfo(
      owner = "jb",
      name = "m",
      desc = "(J)Z"
   )
   public static boolean method1989(long var0) {
      return (int)(var0 >>> 16 & 1L) == 1;
   }

   @ObfInfo(
      owner = "jb",
      name = "nb",
      desc = "(II)V"
   )
   static void method1990(int var0) {
      client.field306 = var0;
   }
}
