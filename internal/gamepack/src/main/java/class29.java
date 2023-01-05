public class class29 {
   byte field230;
   public int field226;
   public int field227;
   public int field228;
   public int field229;
   public int field231;

   public class29() {
   }

   public class29(class134 var1, boolean var2) {
      this.field230 = var1.method670();
      this.field227 = var1.method671();
      this.field228 = var1.method717();
      this.field229 = var1.method717();
      this.field231 = var1.method717();
      this.field226 = var1.method717();
      if (var2) {
         int var4 = 0;
         boolean var5 = false;

         while(true) {
            int var6 = var1.method669();
            if (var6 == 255) {
               Integer var3 = var5 ? var4 : null;
               this.method149(var3);
               break;
            }

            if (var6 != 0) {
               throw new IllegalStateException("");
            }

            while(true) {
               int var7 = var1.method669();
               if (var7 == 255) {
                  break;
               }

               --var1.field1487;
               if (var1.method671() != 0) {
                  throw new IllegalStateException("");
               }

               if (var5) {
                  throw new IllegalStateException("");
               }

               var4 = var1.method717();
               var5 = true;
            }
         }
      }

   }

   void method149(Integer var1) {
   }

   public int method150() {
      return this.field230 & 7;
   }

   public int method152() {
      return (this.field230 & 8) == 8 ? 1 : 0;
   }

   void method153(int var1) {
      this.field230 &= -8;
      this.field230 = (byte)(this.field230 | var1 & 7);
   }

   void method151(int var1) {
      this.field230 &= -9;
      if (var1 == 1) {
         this.field230 = (byte)(this.field230 | 8);
      }

   }
}
