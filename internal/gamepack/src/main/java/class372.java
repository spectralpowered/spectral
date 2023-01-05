public class class372 extends class37 {
   final class468 field3295;

   public class372(class468 var1) {
      super(400);
      this.field3295 = var1;
   }

   class209 method203() {
      return new class423();
   }

   class209[] method206(int var1) {
      return new class423[var1];
   }

   public void method1783(class134 var1, int var2) {
      while(true) {
         if (var1.field1487 < var2) {
            int var4 = var1.method669();
            boolean var5 = (var4 & 1) == 1;
            class174 var6 = new class174(var1.method677(), this.field3295);
            class174 var7 = new class174(var1.method677(), this.field3295);
            var1.method677();
            if (var6 != null && var6.method930()) {
               class423 var8 = (class423)this.method204(var6);
               if (var5) {
                  class423 var9 = (class423)this.method204(var7);
                  if (null != var9 && var8 != var9) {
                     if (null != var8) {
                        this.method193(var9);
                     } else {
                        var8 = var9;
                     }
                  }
               }

               if (null != var8) {
                  this.method197(var8, var6, var7);
                  continue;
               }

               if (this.method188() < 400) {
                  int var10 = this.method188();
                  var8 = (class423)this.method195(var6, var7);
                  var8.field3576 = var10;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }
}
