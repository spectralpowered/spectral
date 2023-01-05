import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class287 implements class99 {
   Map field2788;
   final class4 field2789;

   public class287(class4 var1) {
      this.field2789 = var1;
   }

   public int method551(int var1) {
      if (null != this.field2788) {
         class426 var3 = (class426)this.field2788.get(var1);
         if (var3 != null) {
            return ((Integer)var3.field3582).intValue();
         }
      }

      return ((Integer)this.field2789.method13(var1)).intValue();
   }

   public void method550(int var1, Object var2) {
      if (null == this.field2788) {
         this.field2788 = new HashMap();
         this.field2788.put(var1, new class426(var1, var2));
      } else {
         class426 var4 = (class426)this.field2788.get(var1);
         if (var4 == null) {
            this.field2788.put(var1, new class426(var1, var2));
         } else {
            var4.field3582 = var2;
         }
      }

   }

   public Iterator iterator() {
      return this.field2788 == null ? Collections.emptyList().iterator() : this.field2788.values().iterator();
   }
}
