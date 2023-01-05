@ObfInfo(
   name = "le"
)
public class class282 implements class78 {
   @ObfInfo(
      owner = "le",
      name = "e",
      desc = "Lle;"
   )
   public static final class282 field2335 = new class282(0);
   @ObfInfo(
      owner = "le",
      name = "x",
      desc = "Lle;"
   )
   public static final class282 field2336 = new class282(2);
   @ObfInfo(
      owner = "le",
      name = "h",
      desc = "Lle;"
   )
   public static final class282 field2338 = new class282(-1);
   @ObfInfo(
      owner = "le",
      name = "v",
      desc = "Lle;"
   )
   public static final class282 field2339 = new class282(1);
   @ObfInfo(
      owner = "le",
      name = "m",
      desc = "I"
   )
   final int field2337;

   @ObfInfo(
      owner = "le",
      name = "<init>",
      desc = "(I)V"
   )
   class282(int var1) {
      this.field2337 = var1;
   }

   @ObfInfo(
      owner = "le",
      name = "e",
      desc = "(B)I"
   )
   public int method330() {
      return this.field2337;
   }

   @ObfInfo(
      owner = "le",
      name = "h",
      desc = "(B)Loj;"
   )
   public static class44 method1391() {
      class44[] var1 = class44.field539;
      synchronized(class44.field539) {
         if (class44.field538 == 0) {
            return new class44();
         } else {
            class44.field539[--class44.field538].method207();
            return class44.field539[class44.field538];
         }
      }
   }
}
