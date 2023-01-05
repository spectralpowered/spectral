public class class292 {
   boolean field2806 = true;
   boolean field2807 = true;
   class343 field2803 = new class343();
   class343 field2804 = new class343();
   class343 field2809 = new class343();
   class343[] field2797;
   class343[] field2802;
   float[][] field2799;
   float[][] field2805;
   float[][] field2808;
   float[][] field2810;
   final class343[] field2800;
   public class292 field2798;
   public final int field2801;

   public class292(int var1, class134 var2, boolean var3) {
      this.field2801 = var2.method672();
      this.field2800 = new class343[var1];
      this.field2797 = new class343[this.field2800.length];
      this.field2802 = new class343[this.field2800.length];
      this.field2799 = new float[this.field2800.length][3];

      for(int var4 = 0; var4 < this.field2800.length; ++var4) {
         this.field2800[var4] = new class343(var2, var3);
         this.field2799[var4][0] = var2.method674();
         this.field2799[var4][1] = var2.method674();
         this.field2799[var4][2] = var2.method674();
      }

      this.method1370();
   }

   void method1370() {
      this.field2805 = new float[this.field2800.length][3];
      this.field2808 = new float[this.field2800.length][3];
      this.field2810 = new float[this.field2800.length][3];
      class343 var2 = class411.method1996();

      for(int var3 = 0; var3 < this.field2800.length; ++var3) {
         class343 var4 = this.method1380(var3);
         var2.method1645(var4);
         var2.method1651();
         this.field2805[var3] = var2.method1642();
         this.field2808[var3][0] = var4.field3152[12];
         this.field2808[var3][1] = var4.field3152[13];
         this.field2808[var3][2] = var4.field3152[14];
         this.field2810[var3] = var4.method1652();
      }

      var2.method1653();
   }

   class343 method1380(int var1) {
      return this.field2800[var1];
   }

   class343 method1371(int var1) {
      if (null == this.field2797[var1]) {
         this.field2797[var1] = new class343(this.method1380(var1));
         if (null != this.field2798) {
            this.field2797[var1].method1648(this.field2798.method1371(var1));
         } else {
            this.field2797[var1].method1648(class343.field3153);
         }
      }

      return this.field2797[var1];
   }

   class343 method1379(int var1) {
      if (null == this.field2802[var1]) {
         this.field2802[var1] = new class343(this.method1371(var1));
         this.field2802[var1].method1651();
      }

      return this.field2802[var1];
   }

   void method1374(class343 var1) {
      this.field2803.method1645(var1);
      this.field2807 = true;
      this.field2806 = true;
   }

   class343 method1373() {
      return this.field2803;
   }

   class343 method1378() {
      if (this.field2807) {
         this.field2809.method1645(this.method1373());
         if (null != this.field2798) {
            this.field2809.method1648(this.field2798.method1378());
         }

         this.field2807 = false;
      }

      return this.field2809;
   }

   public class343 method1372(int var1) {
      if (this.field2806) {
         this.field2804.method1645(this.method1379(var1));
         this.field2804.method1648(this.method1378());
         this.field2806 = false;
      }

      return this.field2804;
   }

   float[] method1375(int var1) {
      return this.field2805[var1];
   }

   float[] method1376(int var1) {
      return this.field2808[var1];
   }

   float[] method1377(int var1) {
      return this.field2810[var1];
   }
}
