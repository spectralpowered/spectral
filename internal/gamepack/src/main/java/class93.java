import java.util.Comparator;

public class class93 implements Comparator {
   final boolean field780;

   public class93(boolean var1) {
      this.field780 = var1;
   }

   int method385(class368 var1, class368 var2) {
      return this.field780 ? var1.method1817().method1104(var2.method1817()) : var2.method1817().method1104(var1.method1817());
   }

   public int compare(Object var1, Object var2) {
      return this.method385((class368)var1, (class368)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
