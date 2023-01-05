@ObfInfo(
   name = "qh"
)
final class class80 implements class250 {
   @ObfInfo(
      owner = "qh",
      name = "b",
      desc = "(Ljava/lang/Long;Lqy;B)V"
   )
   void method333(Long var1, class127 var2) {
      var2.method536(var1.longValue());
   }

   @ObfInfo(
      owner = "qh",
      name = "e",
      desc = "(Lqy;I)Ljava/lang/Object;"
   )
   public Object method1082(class127 var1) {
      return var1.method598();
   }

   @ObfInfo(
      owner = "qh",
      name = "h",
      desc = "(Ljava/lang/Object;Lqy;I)V"
   )
   public void method1081(Object var1, class127 var2) {
      this.method333((Long)var1, var2);
   }
}
