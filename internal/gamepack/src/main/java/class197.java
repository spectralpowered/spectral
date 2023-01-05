import java.util.Comparator;

public class class197 implements Comparator {
   final boolean field2037;

   public class197(boolean var1) {
      this.field2037 = var1;
   }

   int method1005(class209 var1, class209 var2) {
      return this.field2037 ? var1.method1063().method931(var2.method1063()) : var2.method1063().method931(var1.method1063());
   }

   public int compare(Object var1, Object var2) {
      return this.method1005((class209)var1, (class209)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
