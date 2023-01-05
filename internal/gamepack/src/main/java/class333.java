import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfInfo(
   name = "qc"
)
public class class333 implements class264 {
   @ObfInfo(
      owner = "qc",
      name = "h",
      desc = "Ljava/util/Map;"
   )
   Map field2605;
   @ObfInfo(
      owner = "qc",
      name = "e",
      desc = "Lru;"
   )
   final class51 field2606;

   @ObfInfo(
      owner = "qc",
      name = "<init>",
      desc = "(Lru;)V"
   )
   public class333(class51 var1) {
      this.field2606 = var1;
   }

   @ObfInfo(
      owner = "qc",
      name = "h",
      desc = "(IB)I"
   )
   public int method1216(int var1) {
      if (null != this.field2605) {
         class331 var3 = (class331)this.field2605.get(var1);
         if (var3 != null) {
            return ((Integer)var3.field2602).intValue();
         }
      }

      return ((Integer)this.field2606.method259(var1)).intValue();
   }

   @ObfInfo(
      owner = "qc",
      name = "e",
      desc = "(ILjava/lang/Object;I)V"
   )
   public void method1215(int var1, Object var2) {
      if (null == this.field2605) {
         this.field2605 = new HashMap();
         this.field2605.put(var1, new class331(var1, var2));
      } else {
         class331 var4 = (class331)this.field2605.get(var1);
         if (var4 == null) {
            this.field2605.put(var1, new class331(var1, var2));
         } else {
            var4.field2602 = var2;
         }
      }

   }

   @ObfInfo(
      owner = "qc",
      name = "iterator",
      desc = "()Ljava/util/Iterator;"
   )
   public Iterator iterator() {
      return this.field2605 == null ? Collections.emptyList().iterator() : this.field2605.values().iterator();
   }
}
