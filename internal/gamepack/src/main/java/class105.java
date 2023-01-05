public class class105 {
   static class319 field1358;
   static String field1354;
   class55 field1356 = new class55();
   int field1355 = -1;
   long field1357;

   public class105(class134 var1) {
      this.method564(var1);
   }

   void method564(class134 var1) {
      this.field1357 = var1.method720();
      this.field1355 = var1.method717();

      for(int var3 = var1.method669(); var3 != 0; var3 = var1.method669()) {
         Object var4;
         if (var3 == 3) {
            var4 = new class408(this);
         } else if (var3 == 1) {
            var4 = new class306(this);
         } else if (var3 == 13) {
            var4 = new class248(this);
         } else if (var3 == 4) {
            var4 = new class250(this);
         } else if (var3 == 6) {
            var4 = new class374(this);
         } else if (var3 == 5) {
            var4 = new class54(this);
         } else if (var3 == 2) {
            var4 = new class72(this);
         } else if (var3 == 7) {
            var4 = new class243(this);
         } else if (var3 == 14) {
            var4 = new class33(this);
         } else if (var3 == 8) {
            var4 = new class381(this);
         } else if (var3 == 9) {
            var4 = new class75(this);
         } else if (var3 == 10) {
            var4 = new class299(this);
         } else if (var3 == 11) {
            var4 = new class492(this);
         } else if (var3 == 12) {
            var4 = new class342(this);
         } else {
            if (var3 != 15) {
               throw new RuntimeException("");
            }

            var4 = new class89(this);
         }

         ((class189)var4).method979(var1);
         this.field1356.method325((class106)var4);
      }

   }

   public void method565(class27 var1) {
      if (this.field1357 == var1.field202 && var1.field223 == this.field1355) {
         for(class189 var3 = (class189)this.field1356.method327(); null != var3; var3 = (class189)this.field1356.method321()) {
            var3.method980(var1);
         }

         ++var1.field223;
      } else {
         throw new RuntimeException("");
      }
   }

   static final void method563(byte[] var0, int var1, int var2, class12 var3, class391[] var4) {
      class134 var6 = new class134(var0);
      int var7 = -1;

      while(true) {
         int var8 = var6.method723();
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var10 = var6.method681();
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.method669();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var1 + var12;
            int var18 = var11 + var2;
            if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
               int var19 = var13;
               if (2 == (class74.field866[1][var17][var18] & 2)) {
                  var19 = var13 - 1;
               }

               class391 var20 = null;
               if (var19 >= 0) {
                  var20 = var4[var19];
               }

               class163.method866(var13, var17, var18, var7, var16, var15, var3, var20);
            }
         }
      }
   }
}
