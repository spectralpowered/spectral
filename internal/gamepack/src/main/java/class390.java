import java.util.Comparator;

public class class390 implements Comparator {
   final boolean field3439;

   public class390(boolean var1) {
      this.field3439 = var1;
   }

   int method1885(class209 var1, class209 var2) {
      return this.field3439 ? var1.method1062(var2) : var2.method1062(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1885((class209)var1, (class209)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
