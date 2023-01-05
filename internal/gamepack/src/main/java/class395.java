import java.util.Collection;
import java.util.Iterator;

@ObfInfo(
   name = "mv"
)
public class class395 implements Iterable, Collection {
   @ObfInfo(
      owner = "mv",
      name = "h",
      desc = "Lpl;"
   )
   class139 field3309 = new class139();
   @ObfInfo(
      owner = "mv",
      name = "e",
      desc = "Lpl;"
   )
   class139 field3310;

   @ObfInfo(
      owner = "mv",
      name = "<init>",
      desc = "()V"
   )
   public class395() {
      this.field3309.field1132 = this.field3309;
      this.field3309.field1133 = this.field3309;
   }

   @ObfInfo(
      owner = "mv",
      name = "h",
      desc = "()V"
   )
   public void method1932() {
      while(this.field3309.field1132 != this.field3309) {
         this.field3309.field1132.method637();
      }

   }

   @ObfInfo(
      owner = "mv",
      name = "e",
      desc = "(Lpl;)V"
   )
   public void method1939(class139 var1) {
      if (var1.field1133 != null) {
         var1.method637();
      }

      var1.field1133 = this.field3309.field1133;
      var1.field1132 = this.field3309;
      var1.field1133.field1132 = var1;
      var1.field1132.field1133 = var1;
   }

   @ObfInfo(
      owner = "mv",
      name = "v",
      desc = "(Lpl;)V"
   )
   public void method1933(class139 var1) {
      if (var1.field1133 != null) {
         var1.method637();
      }

      var1.field1133 = this.field3309;
      var1.field1132 = this.field3309.field1132;
      var1.field1133.field1132 = var1;
      var1.field1132.field1133 = var1;
   }

   @ObfInfo(
      owner = "mv",
      name = "m",
      desc = "()Lpl;"
   )
   public class139 method1941() {
      return this.method1934((class139)null);
   }

   @ObfInfo(
      owner = "mv",
      name = "q",
      desc = "(Lpl;)Lpl;"
   )
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

   @ObfInfo(
      owner = "mv",
      name = "f",
      desc = "()Lpl;"
   )
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

   @ObfInfo(
      owner = "mv",
      name = "r",
      desc = "()I"
   )
   int method1936() {
      int var1 = 0;

      for(class139 var2 = this.field3309.field1132; var2 != this.field3309; var2 = var2.field1132) {
         ++var1;
      }

      return var1;
   }

   @ObfInfo(
      owner = "mv",
      name = "u",
      desc = "()Z"
   )
   public boolean method1937() {
      return this.field3309.field1132 == this.field3309;
   }

   @ObfInfo(
      owner = "mv",
      name = "b",
      desc = "()[Lpl;"
   )
   class139[] method1938() {
      class139[] var1 = new class139[this.method1936()];
      int var2 = 0;

      for(class139 var3 = this.field3309.field1132; var3 != this.field3309; var3 = var3.field1132) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfInfo(
      owner = "mv",
      name = "iterator",
      desc = "()Ljava/util/Iterator;"
   )
   public Iterator iterator() {
      return new class103(this);
   }

   @ObfInfo(
      owner = "mv",
      name = "size",
      desc = "()I"
   )
   public int size() {
      return this.method1936();
   }

   @ObfInfo(
      owner = "mv",
      name = "isEmpty",
      desc = "()Z"
   )
   public boolean isEmpty() {
      return this.method1937();
   }

   @ObfInfo(
      owner = "mv",
      name = "contains",
      desc = "(Ljava/lang/Object;)Z"
   )
   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   @ObfInfo(
      owner = "mv",
      name = "toArray",
      desc = "()[Ljava/lang/Object;"
   )
   public Object[] toArray() {
      return this.method1938();
   }

   @ObfInfo(
      owner = "mv",
      name = "toArray",
      desc = "([Ljava/lang/Object;)[Ljava/lang/Object;"
   )
   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class139 var3 = this.field3309.field1132; var3 != this.field3309; var3 = var3.field1132) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfInfo(
      owner = "mv",
      name = "j",
      desc = "(Lpl;)Z"
   )
   boolean method1940(class139 var1) {
      this.method1939(var1);
      return true;
   }

   @ObfInfo(
      owner = "mv",
      name = "remove",
      desc = "(Ljava/lang/Object;)Z"
   )
   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   @ObfInfo(
      owner = "mv",
      name = "containsAll",
      desc = "(Ljava/util/Collection;)Z"
   )
   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfInfo(
      owner = "mv",
      name = "addAll",
      desc = "(Ljava/util/Collection;)Z"
   )
   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfInfo(
      owner = "mv",
      name = "removeAll",
      desc = "(Ljava/util/Collection;)Z"
   )
   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfInfo(
      owner = "mv",
      name = "retainAll",
      desc = "(Ljava/util/Collection;)Z"
   )
   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfInfo(
      owner = "mv",
      name = "clear",
      desc = "()V"
   )
   public void clear() {
      this.method1932();
   }

   @ObfInfo(
      owner = "mv",
      name = "add",
      desc = "(Ljava/lang/Object;)Z"
   )
   public boolean add(Object var1) {
      return this.method1940((class139)var1);
   }

   @ObfInfo(
      owner = "mv",
      name = "equals",
      desc = "(Ljava/lang/Object;)Z"
   )
   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfInfo(
      owner = "mv",
      name = "hashCode",
      desc = "()I"
   )
   public int hashCode() {
      return super.hashCode();
   }

   @ObfInfo(
      owner = "mv",
      name = "x",
      desc = "(Lpl;Lpl;)V"
   )
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
