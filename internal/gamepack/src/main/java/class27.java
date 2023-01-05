@ObfInfo(
   name = "ng"
)
public class class27 extends class304 {
   @ObfInfo(
      owner = "ng",
      name = "x",
      desc = "I"
   )
   int field161 = 1;
   @ObfInfo(
      owner = "ng",
      name = "v",
      desc = "Lqi;"
   )
   final class194 field160;
   @ObfInfo(
      owner = "ng",
      name = "m",
      desc = "Lma;"
   )
   public class12 field159 = new class12();

   @ObfInfo(
      owner = "ng",
      name = "<init>",
      desc = "(Lqi;)V"
   )
   public class27(class194 var1) {
      super(400);
      this.field160 = var1;
   }

   @ObfInfo(
      owner = "ng",
      name = "h",
      desc = "(B)Lov;"
   )
   class368 method1482() {
      return new class336();
   }

   @ObfInfo(
      owner = "ng",
      name = "e",
      desc = "(II)[Lov;"
   )
   class368[] method1485(int var1) {
      return new class336[var1];
   }

   @ObfInfo(
      owner = "ng",
      name = "v",
      desc = "(Lrp;ZS)Z"
   )
   public boolean method131(class257 var1, boolean var2) {
      class336 var4 = (class336)this.method1484(var1);
      if (null == var4) {
         return false;
      } else {
         return !var2 || var4.field627 != 0;
      }
   }

   @ObfInfo(
      owner = "ng",
      name = "g",
      desc = "(Lqy;IB)V"
   )
   public void method129(class127 var1, int var2) {
      while(true) {
         if (var1.field1070 < var2) {
            boolean var4 = var1.method547() == 1;
            class257 var5 = new class257(var1.method555(), this.field160);
            class257 var6 = new class257(var1.method555(), this.field160);
            int var7 = var1.method549();
            int var8 = var1.method547();
            int var9 = var1.method547();
            boolean var10 = 0 != (var9 & 2);
            boolean var11 = 0 != (var9 & 1);
            if (var7 > 0) {
               var1.method555();
               var1.method547();
               var1.method595();
            }

            var1.method555();
            if (var5 != null && var5.method1103()) {
               class336 var12 = (class336)this.method1483(var5);
               if (var4) {
                  class336 var13 = (class336)this.method1483(var6);
                  if (var13 != null && var12 != var13) {
                     if (null != var12) {
                        this.method1472(var13);
                     } else {
                        var12 = var13;
                     }
                  }
               }

               if (null != var12) {
                  this.method1476(var12, var5, var6);
                  if (var12.field627 != var7) {
                     boolean var15 = true;

                     for(class326 var14 = (class326)this.field159.method67(); var14 != null; var14 = (class326)this.field159.method69()) {
                        if (var14.field2577.equals(var5)) {
                           if (var7 != 0 && var14.field2578 == 0) {
                              var14.method1514();
                              var15 = false;
                           } else if (var7 == 0 && var14.field2578 != 0) {
                              var14.method1514();
                              var15 = false;
                           }
                        }
                     }

                     if (var15) {
                        this.field159.method68(new class326(var5, var7));
                     }
                  }
               } else {
                  if (this.method1467() >= 400) {
                     continue;
                  }

                  var12 = (class336)this.method1474(var5, var6);
               }

               if (var7 != var12.field627) {
                  var12.field629 = ++this.field161 - 1;
                  if (-1 == var12.field627 && var7 == 0) {
                     var12.field629 = -(var12.field629 * -388257165) * 1595280059;
                  }

                  var12.field627 = var7;
               }

               var12.field628 = var8;
               var12.field2690 = var10;
               var12.field2689 = var11;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method1487();
         return;
      }
   }
}
