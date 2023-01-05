import java.util.Comparator;

final class class100 implements Comparator {
   int method553(class87 var1, class87 var2) {
      return var1.field970 < var2.field970 ? -1 : (var2.field970 == var1.field970 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method553((class87)var1, (class87)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method552(int var0, int var1) {
      if (class25.method126(var0)) {
         class133.method652(class71.field853[var0], var1);
      }
   }
}
