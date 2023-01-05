import java.util.Comparator;

@ObfInfo(
   name = "nt"
)
class class347 implements Comparator {
   @ObfInfo(
      owner = "nt",
      name = "lv",
      desc = "I"
   )
   static int field2878;
   // $FF: synthetic field
   @ObfInfo(
      owner = "nt",
      name = "this$0",
      desc = "Lni;"
   )
   final class255 this$0;

   @ObfInfo(
      owner = "nt",
      name = "<init>",
      desc = "(Lni;)V"
   )
   class347(class255 var1) {
      this.this$0 = var1;
   }

   @ObfInfo(
      owner = "nt",
      name = "h",
      desc = "(Lnz;Lnz;B)I"
   )
   int method1754(class382 var1, class382 var2) {
      if (var1.field3224 > var2.field3224) {
         return 1;
      } else {
         return var1.field3224 < var2.field3224 ? -1 : 0;
      }
   }

   @ObfInfo(
      owner = "nt",
      name = "compare",
      desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
   )
   public int compare(Object var1, Object var2) {
      return this.method1754((class382)var1, (class382)var2);
   }

   @ObfInfo(
      owner = "nt",
      name = "equals",
      desc = "(Ljava/lang/Object;)Z"
   )
   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
