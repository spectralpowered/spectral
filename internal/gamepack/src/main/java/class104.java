import java.util.Comparator;

final class class104 implements Comparator {
   public static int field1353;

   int method561(class87 var1, class87 var2) {
      return var1.field973.field229 < var2.field973.field229 ? -1 : (var2.field973.field229 == var1.field973.field229 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method561((class87)var1, (class87)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method562(class210 var0, int var1) {
      if (null == var0.field2295) {
         throw new RuntimeException();
      } else {
         if (var0.field2362 == null) {
            var0.field2362 = new int[var0.field2295.length];
         }

         var0.field2362[var1] = Integer.MAX_VALUE;
      }
   }
}
