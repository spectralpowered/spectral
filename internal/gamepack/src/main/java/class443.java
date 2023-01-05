import java.util.Comparator;

public class class443 implements Comparator {
   final boolean field3667;

   public class443(boolean var1) {
      this.field3667 = var1;
   }

   int method2196(class69 var1, class69 var2) {
      return this.field3667 ? var1.field629 - var2.field629 : var2.field629 - var1.field629;
   }

   public int compare(Object var1, Object var2) {
      return this.method2196((class69)var1, (class69)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method2197(class138 var0) {
      long var2 = 0L;
      int var4 = -1;
      int var5 = 0;
      int var6 = 0;
      if (var0.field1128 == 0) {
         var2 = class408.field3415.method1613(var0.field1122, var0.field1118, var0.field1129);
      }

      if (var0.field1128 == 1) {
         var2 = class408.field3415.method1608(var0.field1122, var0.field1118, var0.field1129);
      }

      if (2 == var0.field1128) {
         var2 = class408.field3415.method1611(var0.field1122, var0.field1118, var0.field1129);
      }

      if (3 == var0.field1128) {
         var2 = class408.field3415.method1581(var0.field1122, var0.field1118, var0.field1129);
      }

      if (var2 != 0L) {
         int var7 = class408.field3415.method1607(var0.field1122, var0.field1118, var0.field1129, var2);
         var4 = class174.method803(var2);
         var5 = var7 & 31;
         var6 = var7 >> 6 & 3;
      }

      var0.field1121 = var4;
      var0.field1124 = var5;
      var0.field1131 = var6;
   }
}
