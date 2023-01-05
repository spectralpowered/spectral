public class class282 implements class78 {
   public static final class282 field2335 = new class282(0);
   public static final class282 field2336 = new class282(2);
   public static final class282 field2338 = new class282(-1);
   public static final class282 field2339 = new class282(1);
   final int field2337;

   class282(int var1) {
      this.field2337 = var1;
   }

   public int method330() {
      return this.field2337;
   }

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
