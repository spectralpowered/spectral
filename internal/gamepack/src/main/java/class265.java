import java.util.Comparator;

public class class265 implements Comparator {
   final boolean field2688;

   public class265(boolean var1) {
      this.field2688 = var1;
   }

   int method1263(class185 var1, class185 var2) {
      return this.field2688 ? var1.field1980 - var2.field1980 : var2.field1980 - var1.field1980;
   }

   public int compare(Object var1, Object var2) {
      return this.method1263((class185)var1, (class185)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method1264(class474 var0) {
      long var2 = 0L;
      int var4 = -1;
      int var5 = 0;
      int var6 = 0;
      if (var0.field3940 == 0) {
         var2 = class13.field126.method83(var0.field3934, var0.field3930, var0.field3941);
      }

      if (var0.field3940 == 1) {
         var2 = class13.field126.method78(var0.field3934, var0.field3930, var0.field3941);
      }

      if (2 == var0.field3940) {
         var2 = class13.field126.method81(var0.field3934, var0.field3930, var0.field3941);
      }

      if (3 == var0.field3940) {
         var2 = class13.field126.method51(var0.field3934, var0.field3930, var0.field3941);
      }

      if (var2 != 0L) {
         int var7 = class13.field126.method77(var0.field3934, var0.field3930, var0.field3941, var2);
         var4 = class7.method24(var2);
         var5 = var7 & 31;
         var6 = var7 >> 6 & 3;
      }

      var0.field3933 = var4;
      var0.field3936 = var5;
      var0.field3943 = var6;
   }
}
