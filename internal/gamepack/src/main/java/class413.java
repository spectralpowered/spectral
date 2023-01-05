@ObfInfo(
   name = "jk"
)
public class class413 {
   @ObfInfo(
      owner = "jk",
      name = "r",
      desc = "[I"
   )
   public static int[] field3422;
   @ObfInfo(
      owner = "jk",
      name = "gb",
      desc = "[I"
   )
   static int[] field3421;
   @ObfInfo(
      owner = "jk",
      name = "e",
      desc = "Lky;"
   )
   public class464 field3418;
   @ObfInfo(
      owner = "jk",
      name = "v",
      desc = "Lky;"
   )
   public class464 field3419;
   @ObfInfo(
      owner = "jk",
      name = "h",
      desc = "I"
   )
   public int field3420;

   @ObfInfo(
      owner = "jk",
      name = "<init>",
      desc = "(ILky;Lky;)V"
   )
   public class413(int var1, class464 var2, class464 var3) {
      this.field3420 = var1;
      this.field3418 = var2;
      this.field3419 = var3;
   }

   @ObfInfo(
      owner = "jk",
      name = "h",
      desc = "(I)[Lcy;"
   )
   static class112[] method2011() {
      return new class112[]{class112.field836, class112.field834, class112.field841, class112.field837, class112.field833};
   }

   @ObfInfo(
      owner = "jk",
      name = "x",
      desc = "(IIII)I"
   )
   public static int method2012(int var0, int var1, int var2) {
      int var4 = class334.method1681(1 + (var2 - var1));
      var4 <<= var1;
      var0 |= var4;
      return var0;
   }
}
