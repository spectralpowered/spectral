import java.util.Iterator;

public class class148 implements Iterable {
   class108 field1565;
   public class108 field1564 = new class108();

   public class148() {
      this.field1564.field1371 = this.field1564;
      this.field1564.field1369 = this.field1564;
   }

   public void method785() {
      while(this.field1564.field1371 != this.field1564) {
         this.field1564.field1371.method574();
      }

   }

   public void method786(class108 var1) {
      if (var1.field1369 != null) {
         var1.method574();
      }

      var1.field1369 = this.field1564.field1369;
      var1.field1371 = this.field1564;
      var1.field1369.field1371 = var1;
      var1.field1371.field1369 = var1;
   }

   public class108 method787() {
      class108 var1 = this.field1564.field1371;
      if (var1 == this.field1564) {
         return null;
      } else {
         var1.method574();
         return var1;
      }
   }

   public class108 method788() {
      return this.method789((class108)null);
   }

   class108 method789(class108 var1) {
      class108 var2;
      if (var1 == null) {
         var2 = this.field1564.field1371;
      } else {
         var2 = var1;
      }

      if (var2 == this.field1564) {
         this.field1565 = null;
         return null;
      } else {
         this.field1565 = var2.field1371;
         return var2;
      }
   }

   public class108 method791() {
      class108 var1 = this.field1565;
      if (var1 == this.field1564) {
         this.field1565 = null;
         return null;
      } else {
         this.field1565 = var1.field1371;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class355(this);
   }

   public static void method790(class108 var0, class108 var1) {
      if (var0.field1369 != null) {
         var0.method574();
      }

      var0.field1369 = var1;
      var0.field1371 = var1.field1371;
      var0.field1369.field1371 = var0;
      var0.field1371.field1369 = var0;
   }
}
