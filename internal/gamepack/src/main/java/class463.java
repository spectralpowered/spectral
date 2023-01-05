import java.util.Arrays;

public class class463 implements class271 {
   static class319 field3866;
   boolean[] field3855 = new boolean[112];
   boolean[] field3861 = new boolean[112];
   boolean[] field3862 = new boolean[112];
   char[] field3864 = new char[128];
   int field3854 = 0;
   int field3857 = 0;
   int field3858 = 0;
   int field3859 = 0;
   int[] field3853 = new int[128];
   int[] field3856 = new int[128];
   public char field3852;
   public int field3863 = 0;
   public int field3865;
   public int[] field3860 = new int[128];

   public boolean method1281(int var1) {
      this.method2269(var1);
      this.field3861[var1] = true;
      this.field3862[var1] = true;
      this.field3855[var1] = false;
      this.field3860[++this.field3863 - 1] = var1;
      return true;
   }

   public boolean method1282(int var1) {
      this.field3861[var1] = false;
      this.field3862[var1] = false;
      this.field3855[var1] = true;
      this.field3856[++this.field3857 - 1] = var1;
      return true;
   }

   public boolean method1279(char var1) {
      int var3 = 1 + this.field3859 & 127;
      if (this.field3858 != var3) {
         this.field3853[this.field3859] = -1;
         this.field3864[this.field3859] = var1;
         this.field3859 = var3;
      }

      return false;
   }

   void method2269(int var1) {
      int var3 = 1 + this.field3859 & 127;
      if (var3 != this.field3858) {
         this.field3853[this.field3859] = var1;
         this.field3864[this.field3859] = 0;
         this.field3859 = var3;
      }

   }

   public boolean method1280(boolean var1) {
      return false;
   }

   public void method2270() {
      this.field3858 = this.field3854;
      this.field3854 = this.field3859;
      this.field3863 = 0;
      this.field3857 = 0;
      Arrays.fill(this.field3862, false);
      Arrays.fill(this.field3855, false);
   }

   public final boolean method2276() {
      if (this.field3854 == this.field3858) {
         return false;
      } else {
         this.field3865 = this.field3853[this.field3858];
         this.field3852 = this.field3864[this.field3858];
         this.field3858 = this.field3858 + 1 & 127;
         return true;
      }
   }

   public boolean method2277(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field3862[var1] : false;
   }

   public boolean method2272(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field3861[var1] : false;
   }

   public boolean method2271(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field3855[var1] : false;
   }

   public int[] method2273() {
      int[] var2 = new int[this.field3863];

      for(int var3 = 0; var3 < this.field3863; ++var3) {
         var2[var3] = this.field3860[var3];
      }

      return var2;
   }

   public int[] method2274() {
      int[] var2 = new int[this.field3857];

      for(int var3 = 0; var3 < this.field3857; ++var3) {
         var2[var3] = this.field3856[var3];
      }

      return var2;
   }

   public static final int method2275(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (0.0D != var2) {
         double var12;
         if (var4 < 0.5D) {
            var12 = (var2 + 1.0D) * var4;
         } else {
            var12 = var4 + var2 - var2 * var4;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = var0 + 0.3333333333333333D;
         if (var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if (var20 < 0.0D) {
            ++var20;
         }

         if (var16 * 6.0D < 1.0D) {
            var6 = 6.0D * (var12 - var14) * var16 + var14;
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = var14 + 6.0D * (0.6666666666666666D - var16) * (var12 - var14);
         } else {
            var6 = var14;
         }

         if (var0 * 6.0D < 1.0D) {
            var8 = var0 * 6.0D * (var12 - var14) + var14;
         } else if (var0 * 2.0D < 1.0D) {
            var8 = var12;
         } else if (var0 * 3.0D < 2.0D) {
            var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14);
         } else {
            var8 = var14;
         }

         if (var20 * 6.0D < 1.0D) {
            var10 = 6.0D * (var12 - var14) * var20 + var14;
         } else if (var20 * 2.0D < 1.0D) {
            var10 = var12;
         } else if (var20 * 3.0D < 2.0D) {
            var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(var10 * 256.0D);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }
}
