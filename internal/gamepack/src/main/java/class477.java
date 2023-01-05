import java.util.Iterator;

@ObfInfo(
   name = "mm"
)
public class class477 implements Iterable {
   @ObfInfo(
      owner = "mm",
      name = "e",
      desc = "Lpw;"
   )
   class195 field4011;
   @ObfInfo(
      owner = "mm",
      name = "h",
      desc = "Lpw;"
   )
   public class195 field4010 = new class195();

   @ObfInfo(
      owner = "mm",
      name = "<init>",
      desc = "()V"
   )
   public class477() {
      this.field4010.field1737 = this.field4010;
      this.field4010.field1735 = this.field4010;
   }

   @ObfInfo(
      owner = "mm",
      name = "h",
      desc = "()V"
   )
   public void method2359() {
      while(this.field4010.field1737 != this.field4010) {
         this.field4010.field1737.method870();
      }

   }

   @ObfInfo(
      owner = "mm",
      name = "e",
      desc = "(Lpw;)V"
   )
   public void method2360(class195 var1) {
      if (var1.field1735 != null) {
         var1.method870();
      }

      var1.field1735 = this.field4010.field1735;
      var1.field1737 = this.field4010;
      var1.field1735.field1737 = var1;
      var1.field1737.field1735 = var1;
   }

   @ObfInfo(
      owner = "mm",
      name = "x",
      desc = "()Lpw;"
   )
   public class195 method2361() {
      class195 var1 = this.field4010.field1737;
      if (var1 == this.field4010) {
         return null;
      } else {
         var1.method870();
         return var1;
      }
   }

   @ObfInfo(
      owner = "mm",
      name = "m",
      desc = "()Lpw;"
   )
   public class195 method2362() {
      return this.method2363((class195)null);
   }

   @ObfInfo(
      owner = "mm",
      name = "q",
      desc = "(Lpw;)Lpw;"
   )
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

   @ObfInfo(
      owner = "mm",
      name = "f",
      desc = "()Lpw;"
   )
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

   @ObfInfo(
      owner = "mm",
      name = "iterator",
      desc = "()Ljava/util/Iterator;"
   )
   public Iterator iterator() {
      return new class64(this);
   }

   @ObfInfo(
      owner = "mm",
      name = "v",
      desc = "(Lpw;Lpw;)V"
   )
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
