public class class380 {
   int field3321;
   int field3322;
   int field3323;

   public static int method1807(String var0) {
      return var0.length() + 2;
   }

   static final void method1808() {
      if (client.field484 > 0) {
         class47.method255();
      } else {
         client.field429.method1204();
         class72.method402(40);
         class18.field139 = client.field483.method1915();
         client.field483.method1914();
      }
   }

   static final void method1809(int var0, int var1, boolean var2) {
      if (client.field549[var0] != null) {
         if (var1 >= 0 && var1 < client.field549[var0].method587()) {
            class278 var4 = (class278)client.field549[var0].field1397.get(var1);
            class81 var5 = class189.method982(class165.field1747, client.field483.field3459);
            var5.field933.method666(4 + class444.method2117(var4.field2757.method928()));
            var5.field933.method666(var0);
            var5.field933.method655(var1);
            var5.field933.method659(var2);
            var5.field933.method660(var4.field2757.method928(), (byte)41);
            client.field483.method1920(var5);
         }
      }
   }
}
