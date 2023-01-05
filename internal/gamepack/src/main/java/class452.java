import java.util.Comparator;

final class class452 implements Comparator {
   int method2241(class258 var1, class258 var2) {
      return var1.field2105 < var2.field2105 ? -1 : (var2.field2105 == var1.field2105 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method2241((class258)var1, (class258)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method2240(int var0, int var1) {
      if (class268.method1275(var0)) {
         class23.method98(class329.field2600[var0], var1);
      }
   }
}
