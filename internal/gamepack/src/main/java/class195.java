import java.util.Comparator;

class class195 implements Comparator {
   static int field2036;
   // $FF: synthetic field
   final class473 this$0;

   class195(class473 var1) {
      this.this$0 = var1;
   }

   int method1004(class433 var1, class433 var2) {
      if (var1.field3609 > var2.field3609) {
         return 1;
      } else {
         return var1.field3609 < var2.field3609 ? -1 : 0;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1004((class433)var1, (class433)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
