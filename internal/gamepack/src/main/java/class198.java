import java.util.Comparator;

final class class198 implements Comparator {
   static class164 field2038;

   int method1006(class87 var1, class87 var2) {
      return var1.field971 < var2.field971 ? -1 : (var1.field971 == var2.field971 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1006((class87)var1, (class87)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
