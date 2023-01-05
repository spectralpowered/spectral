import java.util.Comparator;

public class class24 implements Comparator {
   final boolean field111;

   public class24(boolean var1) {
      this.field111 = var1;
   }

   int method99(class368 var1, class368 var2) {
      return this.field111 ? var1.method1816(var2) : var2.method1816(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method99((class368)var1, (class368)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
