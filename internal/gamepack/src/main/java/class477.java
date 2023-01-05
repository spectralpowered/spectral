import java.util.Iterator;

public class class477 implements Iterable {
   class195 field4011;
   public class195 field4010 = new class195();

   public class477() {
      this.field4010.field1737 = this.field4010;
      this.field4010.field1735 = this.field4010;
   }

   public void method2359() {
      while(this.field4010.field1737 != this.field4010) {
         this.field4010.field1737.method870();
      }

   }

   public void method2360(class195 var1) {
      if (var1.field1735 != null) {
         var1.method870();
      }

      var1.field1735 = this.field4010.field1735;
      var1.field1737 = this.field4010;
      var1.field1735.field1737 = var1;
      var1.field1737.field1735 = var1;
   }

   public class195 method2361() {
      class195 var1 = this.field4010.field1737;
      if (var1 == this.field4010) {
         return null;
      } else {
         var1.method870();
         return var1;
      }
   }

   public class195 method2362() {
      return this.method2363((class195)null);
   }

   class195 method2363(class195 var1) {
      class195 var2;
      if (var1 == null) {
         var2 = this.field4010.field1737;
      } else {
         var2 = var1;
      }

      if (var2 == this.field4010) {
         this.field4011 = null;
         return null;
      } else {
         this.field4011 = var2.field1737;
         return var2;
      }
   }

   public class195 method2365() {
      class195 var1 = this.field4011;
      if (var1 == this.field4010) {
         this.field4011 = null;
         return null;
      } else {
         this.field4011 = var1.field1737;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class64(this);
   }

   public static void method2364(class195 var0, class195 var1) {
      if (var0.field1735 != null) {
         var0.method870();
      }

      var0.field1735 = var1;
      var0.field1737 = var1.field1737;
      var0.field1735.field1737 = var0;
      var0.field1737.field1735 = var0;
   }
}
