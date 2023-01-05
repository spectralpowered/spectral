import java.util.Comparator;

@ObfInfo(
   name = "lo"
)
final class class452 implements Comparator {
   @ObfInfo(
      owner = "lo",
      name = "h",
      desc = "(Lmg;Lmg;B)I"
   )
   int method2241(class258 var1, class258 var2) {
      return var1.field2105 < var2.field2105 ? -1 : (var2.field2105 == var1.field2105 ? 0 : 1);
   }

   @ObfInfo(
      owner = "lo",
      name = "compare",
      desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
   )
   public int compare(Object var1, Object var2) {
      return this.method2241((class258)var1, (class258)var2);
   }

   @ObfInfo(
      owner = "lo",
      name = "equals",
      desc = "(Ljava/lang/Object;)Z"
   )
   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfInfo(
      owner = "lo",
      name = "lu",
      desc = "(III)V"
   )
   static final void method2240(int var0, int var1) {
      if (class268.method1275(var0)) {
         class23.method98(class329.field2600[var0], var1);
      }
   }
}
