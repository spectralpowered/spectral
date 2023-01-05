import java.lang.ref.SoftReference;

public class class281 extends class88 {
   SoftReference field2334;

   class281(Object var1, int var2) {
      super(var2);
      this.field2334 = new SoftReference(var1);
   }

   Object method375() {
      return this.field2334.get();
   }

   boolean method376() {
      return true;
   }
}
