public class class212 extends class108 {
   public static class164 field2377;
   public static int field2379;
   static class230 field2380;
   static class31 field2378 = new class31(64);
   public int field2376 = 0;

   void method1107(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method1111(var1, var3);
      }
   }

   void method1111(class134 var1, int var2) {
      if (var2 == 5) {
         this.field2376 = var1.method671();
      }

   }

   public static class173 method1110(int var0) {
      class173 var2 = (class173)class173.field1865.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class173.field1864.method892(6, var0);
         var2 = new class173();
         var2.field1870 = var0;
         if (var3 != null) {
            var2.method915(new class134(var3));
         }

         var2.method918();
         if (var2.field1898) {
            var2.field1875 = 0;
            var2.field1888 = false;
         }

         class173.field1865.method163(var2, (long)var0);
         return var2;
      }
   }

   public static void method1108(byte[] var0) {
      class134 var2 = new class134(var0);
      var2.field1487 = var0.length - 2;
      class207.field2197 = var2.method671();
      class207.field2198 = new int[class207.field2197];
      class318.field3011 = new int[class207.field2197];
      class110.field1380 = new int[class207.field2197];
      class111.field1387 = new int[class207.field2197];
      class344.field3162 = new byte[class207.field2197][];
      var2.field1487 = var0.length - 7 - class207.field2197 * 8;
      class104.field1353 = var2.method671();
      class207.field2196 = var2.method671();
      int var3 = (var2.method669() & 255) + 1;

      int var4;
      for(var4 = 0; var4 < class207.field2197; ++var4) {
         class207.field2198[var4] = var2.method671();
      }

      for(var4 = 0; var4 < class207.field2197; ++var4) {
         class318.field3011[var4] = var2.method671();
      }

      for(var4 = 0; var4 < class207.field2197; ++var4) {
         class110.field1380[var4] = var2.method671();
      }

      for(var4 = 0; var4 < class207.field2197; ++var4) {
         class111.field1387[var4] = var2.method671();
      }

      var2.field1487 = var0.length - 7 - class207.field2197 * 8 - 3 * (var3 - 1);
      class482.field3990 = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         class482.field3990[var4] = var2.method673();
         if (0 == class482.field3990[var4]) {
            class482.field3990[var4] = 1;
         }
      }

      var2.field1487 = 0;

      for(var4 = 0; var4 < class207.field2197; ++var4) {
         int var5 = class110.field1380[var4];
         int var6 = class111.field1387[var4];
         int var7 = var6 * var5;
         byte[] var8 = new byte[var7];
         class344.field3162[var4] = var8;
         int var9 = var2.method669();
         int var10;
         if (var9 == 0) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.method670();
            }
         } else if (var9 == 1) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var10 + var5 * var11] = var2.method670();
               }
            }
         }
      }

   }

   static void method1106(class230 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var7 = (long)(var2 + (var1 << 16));
      class289 var9 = (class289)class475.field3955.method545(var7);
      if (var9 == null) {
         var9 = (class289)class475.field3949.method545(var7);
         if (null == var9) {
            var9 = (class289)class475.field3952.method545(var7);
            if (null != var9) {
               if (var5) {
                  var9.method574();
                  class475.field3955.method542(var9, var7);
                  --class475.field3953;
                  ++class475.field3948;
               }

            } else {
               if (!var5) {
                  var9 = (class289)class475.field3954.method545(var7);
                  if (null != var9) {
                     return;
                  }
               }

               var9 = new class289();
               var9.field2792 = var0;
               var9.field2793 = var3;
               var9.field2794 = var4;
               if (var5) {
                  class475.field3955.method542(var9, var7);
                  ++class475.field3948;
               } else {
                  class475.field3947.method28(var9);
                  class475.field3952.method542(var9, var7);
                  ++class475.field3953;
               }

            }
         }
      }
   }

   static void method1109(int var0) {
      for(class258 var2 = (class258)client.field475.method543(); null != var2; var2 = (class258)client.field475.method544()) {
         if ((var2.field1361 >> 48 & 65535L) == (long)var0) {
            var2.method567();
         }
      }

   }
}
