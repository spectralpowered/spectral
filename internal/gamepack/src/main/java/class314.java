@ObfInfo(
   name = "nj"
)
public class class314 extends class304 {
   @ObfInfo(
      owner = "nj",
      name = "v",
      desc = "Lqi;"
   )
   final class194 field2475;

   @ObfInfo(
      owner = "nj",
      name = "<init>",
      desc = "(Lqi;)V"
   )
   public class314(class194 var1) {
      super(400);
      this.field2475 = var1;
   }

   @ObfInfo(
      owner = "nj",
      name = "h",
      desc = "(B)Lov;"
   )
   class368 method1482() {
      return new class187();
   }

   @ObfInfo(
      owner = "nj",
      name = "e",
      desc = "(II)[Lov;"
   )
   class368[] method1485(int var1) {
      return new class187[var1];
   }

   @ObfInfo(
      owner = "nj",
      name = "v",
      desc = "(Lqy;II)V"
   )
   public void method1513(class127 var1, int var2) {
      while(true) {
         if (var1.field1070 < var2) {
            int var4 = var1.method547();
            boolean var5 = (var4 & 1) == 1;
            class257 var6 = new class257(var1.method555(), this.field2475);
            class257 var7 = new class257(var1.method555(), this.field2475);
            var1.method555();
            if (var6 != null && var6.method1103()) {
               class187 var8 = (class187)this.method1483(var6);
               if (var5) {
                  class187 var9 = (class187)this.method1483(var7);
                  if (null != var9 && var8 != var9) {
                     if (null != var8) {
                        this.method1472(var9);
                     } else {
                        var8 = var9;
                     }
                  }
               }

               if (null != var8) {
                  this.method1476(var8, var6, var7);
                  continue;
               }

               if (this.method1467() < 400) {
                  int var10 = this.method1467();
                  var8 = (class187)this.method1474(var6, var7);
                  var8.field1698 = var10;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }
}
