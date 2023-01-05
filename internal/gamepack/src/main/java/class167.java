import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class class167 {
   public static final class167 field1828 = new class167();
   public static final class167 field1829 = new class167();
   public static final class167 field1830 = new class167();
   public static final class167 field1831 = new class167();
   public static final class167 field1832 = new class167();
   public static final class167 field1833 = new class167();
   public static final class167 field1834 = new class167();
   public static final class167 field1835 = new class167();
   public static final class167 field1836 = new class167();
   public static final class167 field1837 = new class167();
   public static final class167 field1838 = new class167();
   public static final class167 field1839 = new class167();
   public static final class167 field1840 = new class167();
   public static final class167 field1841 = new class167();

   protected static int method899() {
      int var1 = 0;
      if (class260.field2675 == null || !class260.field2675.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if (var3.isValid()) {
                  class260.field2675 = var3;
                  class141.field1541 = -1L;
                  class141.field1539 = -1L;
               }
            }
         } catch (Throwable var10) {
            ;
         }
      }

      if (class260.field2675 != null) {
         long var11 = class154.method814();
         long var4 = class260.field2675.getCollectionTime();
         if (class141.field1539 != -1L) {
            long var6 = var4 - class141.field1539;
            long var8 = var11 - class141.field1541;
            if (0L != var8) {
               var1 = (int)(var6 * 100L / var8);
            }
         }

         class141.field1539 = var4;
         class141.field1541 = var11;
      }

      return var1;
   }

   static final void method898(class387 var0, int var1, int var2) {
      if (var0 != null) {
         class226.method1145(var0.field3424, var0.field3420, var0.field3418, var0.field3419, var0.field3422, var0.field3421, var0.field3417, var1, var2);
      }

   }
}
