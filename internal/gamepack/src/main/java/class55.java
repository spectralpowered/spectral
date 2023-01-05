import java.util.Collection;
import java.util.Iterator;

public class class55 implements Iterable, Collection {
   class106 field802 = new class106();
   class106 field803;

   public class55() {
      this.field802.field1359 = this.field802;
      this.field802.field1360 = this.field802;
   }

   public void method318() {
      while(this.field802.field1359 != this.field802) {
         this.field802.field1359.method567();
      }

   }

   public void method325(class106 var1) {
      if (var1.field1360 != null) {
         var1.method567();
      }

      var1.field1360 = this.field802.field1360;
      var1.field1359 = this.field802;
      var1.field1360.field1359 = var1;
      var1.field1359.field1360 = var1;
   }

   public void method319(class106 var1) {
      if (var1.field1360 != null) {
         var1.method567();
      }

      var1.field1360 = this.field802;
      var1.field1359 = this.field802.field1359;
      var1.field1360.field1359 = var1;
      var1.field1359.field1360 = var1;
   }

   public class106 method327() {
      return this.method320((class106)null);
   }

   class106 method320(class106 var1) {
      class106 var2;
      if (var1 == null) {
         var2 = this.field802.field1359;
      } else {
         var2 = var1;
      }

      if (var2 == this.field802) {
         this.field803 = null;
         return null;
      } else {
         this.field803 = var2.field1359;
         return var2;
      }
   }

   public class106 method321() {
      class106 var1 = this.field803;
      if (var1 == this.field802) {
         this.field803 = null;
         return null;
      } else {
         this.field803 = var1.field1359;
         return var1;
      }
   }

   int method322() {
      int var1 = 0;

      for(class106 var2 = this.field802.field1359; var2 != this.field802; var2 = var2.field1359) {
         ++var1;
      }

      return var1;
   }

   public boolean method323() {
      return this.field802.field1359 == this.field802;
   }

   class106[] method324() {
      class106[] var1 = new class106[this.method322()];
      int var2 = 0;

      for(class106 var3 = this.field802.field1359; var3 != this.field802; var3 = var3.field1359) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class145(this);
   }

   public int size() {
      return this.method322();
   }

   public boolean isEmpty() {
      return this.method323();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method324();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class106 var3 = this.field802.field1359; var3 != this.field802; var3 = var3.field1359) {
         var1[var2++] = var3;
      }

      return var1;
   }

   boolean method326(class106 var1) {
      this.method325(var1);
      return true;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.method318();
   }

   public boolean add(Object var1) {
      return this.method326((class106)var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public static void method328(class106 var0, class106 var1) {
      if (var0.field1360 != null) {
         var0.method567();
      }

      var0.field1360 = var1;
      var0.field1359 = var1.field1359;
      var0.field1360.field1359 = var0;
      var0.field1359.field1360 = var0;
   }
}
