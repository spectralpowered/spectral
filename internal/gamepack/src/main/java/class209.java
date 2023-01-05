import java.util.Comparator;

final class class209 implements Comparator {
   static class274 field1815;

   int method907(class258 var1, class258 var2) {
      return var1.field2106 < var2.field2106 ? -1 : (var1.field2106 == var2.field2106 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method907((class258)var1, (class258)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
