import java.util.Comparator;

class class347 implements Comparator {
   static int field2878;
   // $FF: synthetic field
   final class255 this$0;

   class347(class255 var1) {
      this.this$0 = var1;
   }

   int method1754(class382 var1, class382 var2) {
      if (var1.field3224 > var2.field3224) {
         return 1;
      } else {
         return var1.field3224 < var2.field3224 ? -1 : 0;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1754((class382)var1, (class382)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
