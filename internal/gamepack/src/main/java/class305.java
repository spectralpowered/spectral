import java.util.Comparator;

public abstract class class305 implements Comparator {
   Comparator field2894;

   final void method1439(Comparator var1) {
      if (null == this.field2894) {
         this.field2894 = var1;
      } else if (this.field2894 instanceof class305) {
         ((class305)this.field2894).method1439(var1);
      }

   }

   protected final int method1440(class209 var1, class209 var2) {
      return null == this.field2894 ? 0 : this.field2894.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
