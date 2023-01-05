import java.util.Comparator;

public abstract class class392 implements Comparator {
   Comparator field3281;

   final void method1917(Comparator var1) {
      if (null == this.field3281) {
         this.field3281 = var1;
      } else if (this.field3281 instanceof class392) {
         ((class392)this.field3281).method1917(var1);
      }

   }

   protected final int method1918(class368 var1, class368 var2) {
      return null == this.field3281 ? 0 : this.field3281.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
