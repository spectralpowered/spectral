import java.lang.ref.SoftReference;

public class class186 extends class294 {
   SoftReference field1981;

   class186(Object var1, int var2) {
      super(var2);
      this.field1981 = new SoftReference(var1);
   }

   Object method1385() {
      return this.field1981.get();
   }

   boolean method1386() {
      return true;
   }
}
