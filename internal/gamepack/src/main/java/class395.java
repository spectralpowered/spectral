import java.util.Collection;
import java.util.Iterator;

public class class395 implements Iterable, Collection {
   class139 field3309 = new class139();
   class139 field3310;

   public class395() {
      this.field3309.field1132 = this.field3309;
      this.field3309.field1133 = this.field3309;
   }

   public void method1932() {
      while(this.field3309.field1132 != this.field3309) {
         this.field3309.field1132.method637();
      }

   }

   public void method1939(class139 var1) {
      if (var1.field1133 != null) {
         var1.method637();
      }

      var1.field1133 = this.field3309.field1133;
      var1.field1132 = this.field3309;
      var1.field1133.field1132 = var1;
      var1.field1132.field1133 = var1;
   }

   public void method1933(class139 var1) {
      if (var1.field1133 != null) {
         var1.method637();
      }

      var1.field1133 = this.field3309;
      var1.field1132 = this.field3309.field1132;
      var1.field1133.field1132 = var1;
      var1.field1132.field1133 = var1;
   }

   public class139 method1941() {
      return this.method1934((class139)null);
   }

   class139 method1934(class139 var1) {
      class139 var2;
      if (var1 == null) {
         var2 = this.field3309.field1132;
      } else {
         var2 = var1;
      }

      if (var2 == this.field3309) {
         this.field3310 = null;
         return null;
      } else {
         this.field3310 = var2.field1132;
         return var2;
      }
   }

   public class139 method1935() {
      class139 var1 = this.field3310;
      if (var1 == this.field3309) {
         this.field3310 = null;
         return null;
      } else {
         this.field3310 = var1.field1132;
         return var1;
      }
   }

   int method1936() {
      int var1 = 0;

      for(class139 var2 = this.field3309.field1132; var2 != this.field3309; var2 = var2.field1132) {
         ++var1;
      }

      return var1;
   }

   public boolean method1937() {
      return this.field3309.field1132 == this.field3309;
   }

   class139[] method1938() {
      class139[] var1 = new class139[this.method1936()];
      int var2 = 0;

      for(class139 var3 = this.field3309.field1132; var3 != this.field3309; var3 = var3.field1132) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class103(this);
   }

   public int size() {
      return this.method1936();
   }

   public boolean isEmpty() {
      return this.method1937();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method1938();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class139 var3 = this.field3309.field1132; var3 != this.field3309; var3 = var3.field1132) {
         var1[var2++] = var3;
      }

      return var1;
   }

   boolean method1940(class139 var1) {
      this.method1939(var1);
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
      this.method1932();
   }

   public boolean add(Object var1) {
      return this.method1940((class139)var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public static void method1942(class139 var0, class139 var1) {
      if (var0.field1133 != null) {
         var0.method637();
      }

      var0.field1133 = var1;
      var0.field1132 = var1.field1132;
      var0.field1133.field1132 = var0;
      var0.field1132.field1133 = var0;
   }
}
