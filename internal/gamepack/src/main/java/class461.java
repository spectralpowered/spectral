@ObfInfo(
   name = "bm"
)
public class class461 extends class195 {
   @ObfInfo(
      owner = "bm",
      name = "h",
      desc = "Ljv;"
   )
   static class99 field3821 = new class99(128);
   @ObfInfo(
      owner = "bm",
      name = "tp",
      desc = "I"
   )
   static int field3825;
   @ObfInfo(
      owner = "bm",
      name = "b",
      desc = "[Lql;"
   )
   class385[] field3823;
   @ObfInfo(
      owner = "bm",
      name = "q",
      desc = "I"
   )
   int field3818;
   @ObfInfo(
      owner = "bm",
      name = "u",
      desc = "I"
   )
   int field3819;
   @ObfInfo(
      owner = "bm",
      name = "f",
      desc = "I"
   )
   int field3820;
   @ObfInfo(
      owner = "bm",
      name = "r",
      desc = "I"
   )
   int field3824;
   @ObfInfo(
      owner = "bm",
      name = "v",
      desc = "[I"
   )
   int[] field3816;
   @ObfInfo(
      owner = "bm",
      name = "x",
      desc = "[I"
   )
   int[] field3817;
   @ObfInfo(
      owner = "bm",
      name = "e",
      desc = "Ljava/lang/String;"
   )
   String field3815;
   @ObfInfo(
      owner = "bm",
      name = "m",
      desc = "[Ljava/lang/String;"
   )
   String[] field3822;

   @ObfInfo(
      owner = "bm",
      name = "x",
      desc = "(II)[Lql;"
   )
   class385[] method2270(int var1) {
      return new class385[var1];
   }

   @ObfInfo(
      owner = "bm",
      name = "x",
      desc = "(II)Lbv;"
   )
   static class152 method2272(int var0) {
      return (class152)class100.field795.method1897((long)var0);
   }

   @ObfInfo(
      owner = "bm",
      name = "m",
      desc = "(IB)V"
   )
   static void method2271(int var0) {
      class201 var2 = (class201)class201.field1755.method791((long)var0);
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.field1753.length; ++var3) {
            var2.field1753[var3] = -1;
            var2.field1754[var3] = 0;
         }

      }
   }
}
