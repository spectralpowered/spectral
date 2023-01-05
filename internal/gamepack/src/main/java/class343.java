import java.util.Arrays;
import java.util.Date;

public final class class343 {
   public static final class343 field3153;
   static class319[] field3151;
   static class343[] field3150 = new class343[0];
   static int field3149;
   static int field3154 = 100;
   public float[] field3152 = new float[16];

   static {
      field3150 = new class343[100];
      field3149 = 0;
      field3153 = new class343();
   }

   public class343() {
      this.method1643();
   }

   public class343(class343 var1) {
      this.method1645(var1);
   }

   public class343(class134 var1, boolean var2) {
      this.method1640(var1, var2);
   }

   public void method1653() {
      class343[] var2 = field3150;
      synchronized(field3150) {
         if (field3149 < field3154 - 1) {
            field3150[++field3149 - 1] = this;
         }

      }
   }

   void method1640(class134 var1, boolean var2) {
      if (var2) {
         class181 var4 = new class181();
         int var7 = var1.method672();
         var7 &= 16383;
         float var6 = (float)((double)((float)var7 / 16384.0F) * 6.283185307179586D);
         var4.method947(var6);
         int var10 = var1.method672();
         var10 &= 16383;
         float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586D);
         var4.method948(var9);
         int var13 = var1.method672();
         var13 &= 16383;
         float var12 = (float)(6.283185307179586D * (double)((float)var13 / 16384.0F));
         var4.method951(var12);
         var4.method950((float)var1.method672(), (float)var1.method672(), (float)var1.method672());
         this.method1650(var4);
      } else {
         for(int var14 = 0; var14 < 16; ++var14) {
            this.field3152[var14] = var1.method674();
         }
      }

   }

   float[] method1641() {
      float[] var2 = new float[3];
      if ((double)this.field3152[2] < 0.999D && (double)this.field3152[2] > -0.999D) {
         var2[1] = (float)(-Math.asin((double)this.field3152[2]));
         double var3 = Math.cos((double)var2[1]);
         var2[0] = (float)Math.atan2((double)this.field3152[6] / var3, (double)this.field3152[10] / var3);
         var2[2] = (float)Math.atan2((double)this.field3152[1] / var3, (double)this.field3152[0] / var3);
      } else {
         var2[0] = 0.0F;
         var2[1] = (float)Math.atan2((double)this.field3152[2], 0.0D);
         var2[2] = (float)Math.atan2((double)(-this.field3152[9]), (double)this.field3152[5]);
      }

      return var2;
   }

   public float[] method1642() {
      float[] var2 = new float[]{(float)(-Math.asin((double)this.field3152[6])), 0.0F, 0.0F};
      double var3 = Math.cos((double)var2[0]);
      double var5;
      double var7;
      if (Math.abs(var3) > 0.005D) {
         var5 = (double)this.field3152[2];
         var7 = (double)this.field3152[10];
         double var9 = (double)this.field3152[4];
         double var11 = (double)this.field3152[5];
         var2[1] = (float)Math.atan2(var5, var7);
         var2[2] = (float)Math.atan2(var9, var11);
      } else {
         var5 = (double)this.field3152[1];
         var7 = (double)this.field3152[0];
         if (this.field3152[6] < 0.0F) {
            var2[1] = (float)Math.atan2(var5, var7);
         } else {
            var2[1] = (float)(-Math.atan2(var5, var7));
         }

         var2[2] = 0.0F;
      }

      return var2;
   }

   void method1643() {
      this.field3152[0] = 1.0F;
      this.field3152[1] = 0.0F;
      this.field3152[2] = 0.0F;
      this.field3152[3] = 0.0F;
      this.field3152[4] = 0.0F;
      this.field3152[5] = 1.0F;
      this.field3152[6] = 0.0F;
      this.field3152[7] = 0.0F;
      this.field3152[8] = 0.0F;
      this.field3152[9] = 0.0F;
      this.field3152[10] = 1.0F;
      this.field3152[11] = 0.0F;
      this.field3152[12] = 0.0F;
      this.field3152[13] = 0.0F;
      this.field3152[14] = 0.0F;
      this.field3152[15] = 1.0F;
   }

   public void method1644() {
      this.field3152[0] = 0.0F;
      this.field3152[1] = 0.0F;
      this.field3152[2] = 0.0F;
      this.field3152[3] = 0.0F;
      this.field3152[4] = 0.0F;
      this.field3152[5] = 0.0F;
      this.field3152[6] = 0.0F;
      this.field3152[7] = 0.0F;
      this.field3152[8] = 0.0F;
      this.field3152[9] = 0.0F;
      this.field3152[10] = 0.0F;
      this.field3152[11] = 0.0F;
      this.field3152[12] = 0.0F;
      this.field3152[13] = 0.0F;
      this.field3152[14] = 0.0F;
      this.field3152[15] = 0.0F;
   }

   public void method1645(class343 var1) {
      System.arraycopy(var1.field3152, 0, this.field3152, 0, 16);
   }

   public void method1646(float var1) {
      this.method1647(var1, var1, var1);
   }

   public void method1647(float var1, float var2, float var3) {
      this.method1643();
      this.field3152[0] = var1;
      this.field3152[5] = var2;
      this.field3152[10] = var3;
   }

   public void method1655(class343 var1) {
      for(int var3 = 0; var3 < this.field3152.length; ++var3) {
         this.field3152[var3] += var1.field3152[var3];
      }

   }

   public void method1648(class343 var1) {
      float var3 = this.field3152[3] * var1.field3152[12] + this.field3152[2] * var1.field3152[8] + var1.field3152[4] * this.field3152[1] + var1.field3152[0] * this.field3152[0];
      float var4 = this.field3152[1] * var1.field3152[5] + var1.field3152[1] * this.field3152[0] + var1.field3152[9] * this.field3152[2] + var1.field3152[13] * this.field3152[3];
      float var5 = this.field3152[1] * var1.field3152[6] + var1.field3152[2] * this.field3152[0] + var1.field3152[10] * this.field3152[2] + this.field3152[3] * var1.field3152[14];
      float var6 = this.field3152[3] * var1.field3152[15] + this.field3152[2] * var1.field3152[11] + var1.field3152[3] * this.field3152[0] + var1.field3152[7] * this.field3152[1];
      float var7 = var1.field3152[0] * this.field3152[4] + var1.field3152[4] * this.field3152[5] + var1.field3152[8] * this.field3152[6] + this.field3152[7] * var1.field3152[12];
      float var8 = var1.field3152[13] * this.field3152[7] + var1.field3152[1] * this.field3152[4] + this.field3152[5] * var1.field3152[5] + this.field3152[6] * var1.field3152[9];
      float var9 = var1.field3152[14] * this.field3152[7] + var1.field3152[10] * this.field3152[6] + var1.field3152[6] * this.field3152[5] + var1.field3152[2] * this.field3152[4];
      float var10 = this.field3152[5] * var1.field3152[7] + var1.field3152[3] * this.field3152[4] + this.field3152[6] * var1.field3152[11] + var1.field3152[15] * this.field3152[7];
      float var11 = var1.field3152[12] * this.field3152[11] + this.field3152[10] * var1.field3152[8] + var1.field3152[0] * this.field3152[8] + this.field3152[9] * var1.field3152[4];
      float var12 = this.field3152[11] * var1.field3152[13] + this.field3152[9] * var1.field3152[5] + var1.field3152[1] * this.field3152[8] + var1.field3152[9] * this.field3152[10];
      float var13 = this.field3152[9] * var1.field3152[6] + var1.field3152[2] * this.field3152[8] + var1.field3152[10] * this.field3152[10] + this.field3152[11] * var1.field3152[14];
      float var14 = var1.field3152[11] * this.field3152[10] + this.field3152[9] * var1.field3152[7] + this.field3152[8] * var1.field3152[3] + var1.field3152[15] * this.field3152[11];
      float var15 = this.field3152[15] * var1.field3152[12] + var1.field3152[8] * this.field3152[14] + var1.field3152[4] * this.field3152[13] + var1.field3152[0] * this.field3152[12];
      float var16 = this.field3152[12] * var1.field3152[1] + this.field3152[13] * var1.field3152[5] + this.field3152[14] * var1.field3152[9] + var1.field3152[13] * this.field3152[15];
      float var17 = var1.field3152[14] * this.field3152[15] + var1.field3152[10] * this.field3152[14] + var1.field3152[6] * this.field3152[13] + var1.field3152[2] * this.field3152[12];
      float var18 = var1.field3152[15] * this.field3152[15] + this.field3152[13] * var1.field3152[7] + var1.field3152[3] * this.field3152[12] + var1.field3152[11] * this.field3152[14];
      this.field3152[0] = var3;
      this.field3152[1] = var4;
      this.field3152[2] = var5;
      this.field3152[3] = var6;
      this.field3152[4] = var7;
      this.field3152[5] = var8;
      this.field3152[6] = var9;
      this.field3152[7] = var10;
      this.field3152[8] = var11;
      this.field3152[9] = var12;
      this.field3152[10] = var13;
      this.field3152[11] = var14;
      this.field3152[12] = var15;
      this.field3152[13] = var16;
      this.field3152[14] = var17;
      this.field3152[15] = var18;
   }

   public void method1649(class336 var1) {
      float var3 = var1.field3114 * var1.field3114;
      float var4 = var1.field3111 * var1.field3114;
      float var5 = var1.field3108 * var1.field3114;
      float var6 = var1.field3113 * var1.field3114;
      float var7 = var1.field3111 * var1.field3111;
      float var8 = var1.field3111 * var1.field3108;
      float var9 = var1.field3111 * var1.field3113;
      float var10 = var1.field3108 * var1.field3108;
      float var11 = var1.field3108 * var1.field3113;
      float var12 = var1.field3113 * var1.field3113;
      this.field3152[0] = var7 + var3 - var12 - var10;
      this.field3152[1] = var8 + var8 + var6 + var6;
      this.field3152[2] = var9 + (var9 - var5 - var5);
      this.field3152[4] = var8 + (var8 - var6 - var6);
      this.field3152[5] = var10 + var3 - var7 - var12;
      this.field3152[6] = var4 + var11 + var4 + var11;
      this.field3152[8] = var5 + var9 + var9 + var5;
      this.field3152[9] = var11 - var4 - var4 + var11;
      this.field3152[10] = var3 + var12 - var10 - var7;
   }

   void method1650(class181 var1) {
      this.field3152[0] = var1.field1945;
      this.field3152[1] = var1.field1938;
      this.field3152[2] = var1.field1939;
      this.field3152[3] = 0.0F;
      this.field3152[4] = var1.field1946;
      this.field3152[5] = var1.field1941;
      this.field3152[6] = var1.field1942;
      this.field3152[7] = 0.0F;
      this.field3152[8] = var1.field1943;
      this.field3152[9] = var1.field1944;
      this.field3152[10] = var1.field1937;
      this.field3152[11] = 0.0F;
      this.field3152[12] = var1.field1948;
      this.field3152[13] = var1.field1947;
      this.field3152[14] = var1.field1940;
      this.field3152[15] = 1.0F;
   }

   float method1654() {
      return this.field3152[12] * this.field3152[6] * this.field3152[3] * this.field3152[9] + (this.field3152[13] * this.field3152[3] * this.field3152[4] * this.field3152[10] + (this.field3152[11] * this.field3152[2] * this.field3152[5] * this.field3152[12] + (this.field3152[15] * this.field3152[2] * this.field3152[4] * this.field3152[9] + this.field3152[15] * this.field3152[10] * this.field3152[5] * this.field3152[0] - this.field3152[11] * this.field3152[5] * this.field3152[0] * this.field3152[14] - this.field3152[15] * this.field3152[9] * this.field3152[0] * this.field3152[6] + this.field3152[13] * this.field3152[0] * this.field3152[6] * this.field3152[11] + this.field3152[0] * this.field3152[7] * this.field3152[9] * this.field3152[14] - this.field3152[13] * this.field3152[10] * this.field3152[0] * this.field3152[7] - this.field3152[15] * this.field3152[4] * this.field3152[1] * this.field3152[10] + this.field3152[14] * this.field3152[4] * this.field3152[1] * this.field3152[11] + this.field3152[15] * this.field3152[8] * this.field3152[1] * this.field3152[6] - this.field3152[12] * this.field3152[11] * this.field3152[1] * this.field3152[6] - this.field3152[8] * this.field3152[1] * this.field3152[7] * this.field3152[14] + this.field3152[12] * this.field3152[7] * this.field3152[1] * this.field3152[10] - this.field3152[13] * this.field3152[11] * this.field3152[4] * this.field3152[2] - this.field3152[8] * this.field3152[5] * this.field3152[2] * this.field3152[15]) + this.field3152[7] * this.field3152[2] * this.field3152[8] * this.field3152[13] - this.field3152[7] * this.field3152[2] * this.field3152[9] * this.field3152[12] - this.field3152[3] * this.field3152[4] * this.field3152[9] * this.field3152[14]) + this.field3152[3] * this.field3152[5] * this.field3152[8] * this.field3152[14] - this.field3152[10] * this.field3152[5] * this.field3152[3] * this.field3152[12] - this.field3152[8] * this.field3152[3] * this.field3152[6] * this.field3152[13]);
   }

   public void method1651() {
      float var2 = 1.0F / this.method1654();
      float var3 = (this.field3152[14] * this.field3152[7] * this.field3152[9] + this.field3152[11] * this.field3152[6] * this.field3152[13] + (this.field3152[15] * this.field3152[10] * this.field3152[5] - this.field3152[14] * this.field3152[5] * this.field3152[11] - this.field3152[9] * this.field3152[6] * this.field3152[15]) - this.field3152[10] * this.field3152[7] * this.field3152[13]) * var2;
      float var4 = var2 * (this.field3152[10] * this.field3152[3] * this.field3152[13] + (this.field3152[15] * this.field3152[9] * this.field3152[2] + this.field3152[14] * this.field3152[1] * this.field3152[11] + this.field3152[15] * -this.field3152[1] * this.field3152[10] - this.field3152[13] * this.field3152[2] * this.field3152[11] - this.field3152[3] * this.field3152[9] * this.field3152[14]));
      float var5 = var2 * (this.field3152[13] * this.field3152[7] * this.field3152[2] + (this.field3152[6] * this.field3152[1] * this.field3152[15] - this.field3152[14] * this.field3152[1] * this.field3152[7] - this.field3152[2] * this.field3152[5] * this.field3152[15]) + this.field3152[5] * this.field3152[3] * this.field3152[14] - this.field3152[6] * this.field3152[3] * this.field3152[13]);
      float var6 = (this.field3152[6] * this.field3152[3] * this.field3152[9] + (this.field3152[11] * this.field3152[2] * this.field3152[5] + this.field3152[1] * this.field3152[7] * this.field3152[10] + -this.field3152[1] * this.field3152[6] * this.field3152[11] - this.field3152[9] * this.field3152[7] * this.field3152[2] - this.field3152[10] * this.field3152[5] * this.field3152[3])) * var2;
      float var7 = var2 * (this.field3152[7] * this.field3152[10] * this.field3152[12] + (-this.field3152[4] * this.field3152[10] * this.field3152[15] + this.field3152[4] * this.field3152[11] * this.field3152[14] + this.field3152[6] * this.field3152[8] * this.field3152[15] - this.field3152[6] * this.field3152[11] * this.field3152[12] - this.field3152[14] * this.field3152[7] * this.field3152[8]));
      float var8 = (this.field3152[10] * this.field3152[0] * this.field3152[15] - this.field3152[14] * this.field3152[0] * this.field3152[11] - this.field3152[15] * this.field3152[8] * this.field3152[2] + this.field3152[2] * this.field3152[11] * this.field3152[12] + this.field3152[14] * this.field3152[8] * this.field3152[3] - this.field3152[10] * this.field3152[3] * this.field3152[12]) * var2;
      float var9 = var2 * (this.field3152[12] * this.field3152[6] * this.field3152[3] + (this.field3152[14] * this.field3152[0] * this.field3152[7] + this.field3152[15] * -this.field3152[0] * this.field3152[6] + this.field3152[15] * this.field3152[2] * this.field3152[4] - this.field3152[7] * this.field3152[2] * this.field3152[12] - this.field3152[4] * this.field3152[3] * this.field3152[14]));
      float var10 = (this.field3152[4] * this.field3152[3] * this.field3152[10] + this.field3152[2] * this.field3152[7] * this.field3152[8] + (this.field3152[6] * this.field3152[0] * this.field3152[11] - this.field3152[0] * this.field3152[7] * this.field3152[10] - this.field3152[11] * this.field3152[4] * this.field3152[2]) - this.field3152[6] * this.field3152[3] * this.field3152[8]) * var2;
      float var11 = var2 * (this.field3152[11] * this.field3152[5] * this.field3152[12] + (this.field3152[15] * this.field3152[4] * this.field3152[9] - this.field3152[4] * this.field3152[11] * this.field3152[13] - this.field3152[15] * this.field3152[5] * this.field3152[8]) + this.field3152[7] * this.field3152[8] * this.field3152[13] - this.field3152[9] * this.field3152[7] * this.field3152[12]);
      float var12 = var2 * (this.field3152[9] * this.field3152[3] * this.field3152[12] + (this.field3152[9] * -this.field3152[0] * this.field3152[15] + this.field3152[0] * this.field3152[11] * this.field3152[13] + this.field3152[1] * this.field3152[8] * this.field3152[15] - this.field3152[12] * this.field3152[11] * this.field3152[1] - this.field3152[13] * this.field3152[8] * this.field3152[3]));
      float var13 = (this.field3152[13] * this.field3152[4] * this.field3152[3] + this.field3152[12] * this.field3152[7] * this.field3152[1] + (this.field3152[0] * this.field3152[5] * this.field3152[15] - this.field3152[7] * this.field3152[0] * this.field3152[13] - this.field3152[15] * this.field3152[1] * this.field3152[4]) - this.field3152[12] * this.field3152[5] * this.field3152[3]) * var2;
      float var14 = (this.field3152[5] * this.field3152[3] * this.field3152[8] + (this.field3152[4] * this.field3152[1] * this.field3152[11] + this.field3152[9] * this.field3152[0] * this.field3152[7] + this.field3152[5] * -this.field3152[0] * this.field3152[11] - this.field3152[8] * this.field3152[7] * this.field3152[1] - this.field3152[4] * this.field3152[3] * this.field3152[9])) * var2;
      float var15 = (this.field3152[12] * this.field3152[6] * this.field3152[9] + (this.field3152[14] * this.field3152[5] * this.field3152[8] + this.field3152[13] * this.field3152[10] * this.field3152[4] + -this.field3152[4] * this.field3152[9] * this.field3152[14] - this.field3152[12] * this.field3152[5] * this.field3152[10] - this.field3152[13] * this.field3152[6] * this.field3152[8])) * var2;
      float var16 = (this.field3152[14] * this.field3152[9] * this.field3152[0] - this.field3152[10] * this.field3152[0] * this.field3152[13] - this.field3152[1] * this.field3152[8] * this.field3152[14] + this.field3152[10] * this.field3152[1] * this.field3152[12] + this.field3152[13] * this.field3152[8] * this.field3152[2] - this.field3152[12] * this.field3152[2] * this.field3152[9]) * var2;
      float var17 = var2 * (this.field3152[14] * this.field3152[1] * this.field3152[4] + this.field3152[14] * -this.field3152[0] * this.field3152[5] + this.field3152[13] * this.field3152[0] * this.field3152[6] - this.field3152[12] * this.field3152[6] * this.field3152[1] - this.field3152[13] * this.field3152[2] * this.field3152[4] + this.field3152[5] * this.field3152[2] * this.field3152[12]);
      float var18 = (this.field3152[8] * this.field3152[1] * this.field3152[6] + (this.field3152[10] * this.field3152[5] * this.field3152[0] - this.field3152[0] * this.field3152[6] * this.field3152[9] - this.field3152[4] * this.field3152[1] * this.field3152[10]) + this.field3152[4] * this.field3152[2] * this.field3152[9] - this.field3152[2] * this.field3152[5] * this.field3152[8]) * var2;
      this.field3152[0] = var3;
      this.field3152[1] = var4;
      this.field3152[2] = var5;
      this.field3152[3] = var6;
      this.field3152[4] = var7;
      this.field3152[5] = var8;
      this.field3152[6] = var9;
      this.field3152[7] = var10;
      this.field3152[8] = var11;
      this.field3152[9] = var12;
      this.field3152[10] = var13;
      this.field3152[11] = var14;
      this.field3152[12] = var15;
      this.field3152[13] = var16;
      this.field3152[14] = var17;
      this.field3152[15] = var18;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method1642();
      this.method1641();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field3152[var3 + var2 * 4];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public int hashCode() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = var2 * 31 + Arrays.hashCode(this.field3152);
      return var3;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class343)) {
         return false;
      } else {
         class343 var2 = (class343)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (var2.field3152[var3] != this.field3152[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public float[] method1652() {
      float[] var2 = new float[3];
      class330 var3 = new class330(this.field3152[0], this.field3152[1], this.field3152[2]);
      class330 var4 = new class330(this.field3152[4], this.field3152[5], this.field3152[6]);
      class330 var5 = new class330(this.field3152[8], this.field3152[9], this.field3152[10]);
      var2[0] = var3.method1598();
      var2[1] = var4.method1598();
      var2[2] = var5.method1598();
      return var2;
   }

   static boolean method1656(Date var0) {
      Date var2 = class38.method211();
      return var0.after(var2);
   }
}
