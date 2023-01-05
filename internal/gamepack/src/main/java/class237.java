public class class237 extends class108 {
   public static class164 field2556;
   public static class164 field2564;
   static class31 field2557 = new class31(64);
   static class386 field2566;
   int[] field2559;
   int[] field2560 = new int[]{-1, -1, -1, -1, -1};
   short[] field2555;
   short[] field2561;
   short[] field2562;
   short[] field2563;
   public boolean field2565 = false;
   public int field2558 = -1;

   void method1200(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method1196(var1, var3);
      }
   }

   void method1196(class134 var1, int var2) {
      if (var2 == 1) {
         this.field2558 = var1.method669();
      } else {
         int var4;
         int var5;
         if (var2 == 2) {
            var4 = var1.method669();
            this.field2559 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2559[var5] = var1.method671();
            }
         } else if (var2 == 3) {
            this.field2565 = true;
         } else if (var2 == 40) {
            var4 = var1.method669();
            this.field2561 = new short[var4];
            this.field2555 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2561[var5] = (short)var1.method671();
               this.field2555[var5] = (short)var1.method671();
            }
         } else if (var2 == 41) {
            var4 = var1.method669();
            this.field2562 = new short[var4];
            this.field2563 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2562[var5] = (short)var1.method671();
               this.field2563[var5] = (short)var1.method671();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field2560[var2 - 60] = var1.method671();
         }
      }

   }

   public boolean method1202() {
      if (null == this.field2559) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field2559.length; ++var3) {
            if (!field2564.method890(this.field2559[var3], 0)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public class311 method1201() {
      if (null == this.field2559) {
         return null;
      } else {
         class311[] var2 = new class311[this.field2559.length];

         for(int var3 = 0; var3 < this.field2559.length; ++var3) {
            var2[var3] = class311.method1489(field2564, this.field2559[var3], 0);
         }

         class311 var5;
         if (1 == var2.length) {
            var5 = var2[0];
         } else {
            var5 = new class311(var2, var2.length);
         }

         int var4;
         if (null != this.field2561) {
            for(var4 = 0; var4 < this.field2561.length; ++var4) {
               var5.method1499(this.field2561[var4], this.field2555[var4]);
            }
         }

         if (null != this.field2562) {
            for(var4 = 0; var4 < this.field2562.length; ++var4) {
               var5.method1500(this.field2562[var4], this.field2563[var4]);
            }
         }

         return var5;
      }
   }

   public boolean method1198() {
      boolean var2 = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.field2560[var3] != -1 && !field2564.method890(this.field2560[var3], 0)) {
            var2 = false;
         }
      }

      return var2;
   }

   public class311 method1199() {
      class311[] var2 = new class311[5];
      int var3 = 0;

      for(int var4 = 0; var4 < 5; ++var4) {
         if (this.field2560[var4] != -1) {
            var2[var3++] = class311.method1489(field2564, this.field2560[var4], 0);
         }
      }

      class311 var6 = new class311(var2, var3);
      int var5;
      if (null != this.field2561) {
         for(var5 = 0; var5 < this.field2561.length; ++var5) {
            var6.method1499(this.field2561[var5], this.field2555[var5]);
         }
      }

      if (null != this.field2562) {
         for(var5 = 0; var5 < this.field2562.length; ++var5) {
            var6.method1500(this.field2562[var5], this.field2563[var5]);
         }
      }

      return var6;
   }

   static void method1197(int var0, String var1, String var2) {
      class43.method222(var0, var1, var2, (String)null);
   }
}
