public class class241 extends class37 {
   int field2583 = 1;
   final class468 field2582;
   public class276 field2581 = new class276();

   public class241(class468 var1) {
      super(400);
      this.field2582 = var1;
   }

   class209 method203() {
      return new class317();
   }

   class209[] method206(int var1) {
      return new class317[var1];
   }

   public boolean method1217(class174 var1, boolean var2) {
      class317 var4 = (class317)this.method205(var1);
      if (null == var4) {
         return false;
      } else {
         return !var2 || var4.field1978 != 0;
      }
   }

   public void method1216(class134 var1, int var2) {
      while(true) {
         if (var1.field1487 < var2) {
            boolean var4 = var1.method669() == 1;
            class174 var5 = new class174(var1.method677(), this.field2582);
            class174 var6 = new class174(var1.method677(), this.field2582);
            int var7 = var1.method671();
            int var8 = var1.method669();
            int var9 = var1.method669();
            boolean var10 = 0 != (var9 & 2);
            boolean var11 = 0 != (var9 & 1);
            if (var7 > 0) {
               var1.method677();
               var1.method669();
               var1.method717();
            }

            var1.method677();
            if (var5 != null && var5.method930()) {
               class317 var12 = (class317)this.method204(var5);
               if (var4) {
                  class317 var13 = (class317)this.method204(var6);
                  if (var13 != null && var12 != var13) {
                     if (null != var12) {
                        this.method193(var13);
                     } else {
                        var12 = var13;
                     }
                  }
               }

               if (null != var12) {
                  this.method197(var12, var5, var6);
                  if (var12.field1978 != var7) {
                     boolean var15 = true;

                     for(class470 var14 = (class470)this.field2581.method1304(); var14 != null; var14 = (class470)this.field2581.method1306()) {
                        if (var14.field3909.equals(var5)) {
                           if (var7 != 0 && var14.field3910 == 0) {
                              var14.method219();
                              var15 = false;
                           } else if (var7 == 0 && var14.field3910 != 0) {
                              var14.method219();
                              var15 = false;
                           }
                        }
                     }

                     if (var15) {
                        this.field2581.method1305(new class470(var5, var7));
                     }
                  }
               } else {
                  if (this.method188() >= 400) {
                     continue;
                  }

                  var12 = (class317)this.method195(var5, var6);
               }

               if (var7 != var12.field1978) {
                  var12.field1980 = ++this.field2583 - 1;
                  if (-1 == var12.field1978 && var7 == 0) {
                     var12.field1980 = -(var12.field1980 * -388257165) * 1595280059;
                  }

                  var12.field1978 = var7;
               }

               var12.field1979 = var8;
               var12.field3009 = var10;
               var12.field3008 = var11;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method208();
         return;
      }
   }
}
