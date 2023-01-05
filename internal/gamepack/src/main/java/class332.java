import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class332 {
   boolean field3082 = false;
   boolean field3090 = false;
   class16 field3080;
   class161[] field3078;
   class319 field3081;
   class68[][] field3083;
   int field3087;
   int field3089;
   int field3091;
   int field3092;
   HashMap field3084 = new HashMap();
   HashMap field3085;
   final class164 field3079;
   final class164 field3086;
   final HashMap field3088;
   public int field3093 = 0;

   public class332(class161[] var1, HashMap var2, class164 var3, class164 var4) {
      this.field3078 = var1;
      this.field3088 = var2;
      this.field3086 = var3;
      this.field3079 = var4;
   }

   public void method1612(class164 var1, String var2, boolean var3) {
      if (!this.field3090) {
         this.field3082 = false;
         this.field3090 = true;
         System.nanoTime();
         int var5 = var1.method883(class48.field421.field419);
         int var6 = var1.method886(var5, var2);
         class134 var7 = new class134(var1.method884(class48.field421.field419, var2));
         class134 var8 = new class134(var1.method884(class48.field417.field419, var2));
         System.nanoTime();
         System.nanoTime();
         this.field3080 = new class16();

         try {
            this.field3080.method97(var7, var8, var6, var3);
         } catch (IllegalStateException var17) {
            return;
         }

         this.field3080.method2069();
         this.field3080.method2078();
         this.field3080.method2071();
         this.field3089 = this.field3080.method2072() * 64;
         this.field3087 = this.field3080.method2067() * 64;
         this.field3091 = (this.field3080.method2066() - this.field3080.method2072() + 1) * 64;
         this.field3092 = (this.field3080.method2068() - this.field3080.method2067() + 1) * 64;
         int var9 = this.field3080.method2066() - this.field3080.method2072() + 1;
         int var10 = this.field3080.method2068() - this.field3080.method2067() + 1;
         System.nanoTime();
         System.nanoTime();
         class68.field838.method1308();
         this.field3083 = new class68[var9][var10];
         Iterator var11 = this.field3080.field133.iterator();

         while(var11.hasNext()) {
            class226 var12 = (class226)var11.next();
            int var13 = var12.field3637;
            int var14 = var12.field3643;
            int var15 = var13 - this.field3080.method2072();
            int var16 = var14 - this.field3080.method2067();
            this.field3083[var15][var16] = new class68(var13, var14, this.field3080.method2070(), this.field3088);
            this.field3083[var15][var16].method354(var12, this.field3080.field135);
         }

         for(int var18 = 0; var18 < var9; ++var18) {
            for(int var20 = 0; var20 < var10; ++var20) {
               if (this.field3083[var18][var20] == null) {
                  this.field3083[var18][var20] = new class68(this.field3080.method2072() + var18, this.field3080.method2067() + var20, this.field3080.method2070(), this.field3088);
                  this.field3083[var18][var20].method382(this.field3080.field134, this.field3080.field135);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method889(class48.field420.field419, var2)) {
            byte[] var19 = var1.method884(class48.field420.field419, var2);
            this.field3081 = class22.method119(var19);
         }

         System.nanoTime();
         var1.method879();
         var1.method893();
         this.field3082 = true;
      }
   }

   public final void method1602() {
      this.field3085 = null;
   }

   public final void method1603(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var10 = class362.field3243;
      int var11 = class362.field3242;
      int var12 = class362.field3241;
      int[] var13 = new int[4];
      class362.method1734(var13);
      class57 var14 = this.method1607(var1, var2, var3, var4);
      float var15 = this.method1611(var7 - var5, var3 - var1);
      int var16 = (int)Math.ceil((double)var15);
      this.field3093 = var16;
      if (!this.field3084.containsKey(var16)) {
         class353 var17 = new class353(var16);
         var17.method1692();
         this.field3084.put(var16, var17);
      }

      int var24 = var14.field808 + var14.field809 - 1;
      int var18 = var14.field810 + var14.field811 - 1;

      int var19;
      int var20;
      for(var19 = var14.field808; var19 <= var24; ++var19) {
         for(var20 = var14.field810; var20 <= var18; ++var20) {
            this.field3083[var19][var20].method359(var16, (class353)this.field3084.get(var16), this.field3078, this.field3086, this.field3079);
         }
      }

      class362.method1738(var10, var11, var12);
      class362.method1735(var13);
      var19 = (int)(var15 * 64.0F);
      var20 = this.field3089 + var1;
      int var21 = var2 + this.field3087;

      for(int var22 = var14.field808; var22 < var14.field809 + var14.field808; ++var22) {
         for(int var23 = var14.field810; var23 < var14.field811 + var14.field810; ++var23) {
            this.field3083[var22][var23].method353(var19 * (this.field3083[var22][var23].field836 * 64 - var20) / 64 + var5, var8 - (64 + (this.field3083[var22][var23].field843 * 64 - var21)) * var19 / 64, var19);
         }
      }

   }

   public final void method1604(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class57 var15 = this.method1607(var1, var2, var3, var4);
      float var16 = this.method1611(var7 - var5, var3 - var1);
      int var17 = (int)(var16 * 64.0F);
      int var18 = var1 + this.field3089;
      int var19 = var2 + this.field3087;

      int var20;
      int var21;
      for(var20 = var15.field808; var20 < var15.field808 + var15.field809; ++var20) {
         for(var21 = var15.field810; var21 < var15.field810 + var15.field811; ++var21) {
            if (var13) {
               this.field3083[var20][var21].method362();
            }

            this.field3083[var20][var21].method360(var5 + (this.field3083[var20][var21].field836 * 64 - var18) * var17 / 64, var8 - (this.field3083[var20][var21].field843 * 64 - var19 + 64) * var17 / 64, var17, var9);
         }
      }

      if (null != var10 && var11 > 0) {
         for(var20 = var15.field808; var20 < var15.field808 + var15.field809; ++var20) {
            for(var21 = var15.field810; var21 < var15.field811 + var15.field810; ++var21) {
               this.field3083[var20][var21].method373(var10, var11, var12);
            }
         }
      }

   }

   public void method1605(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.field3081) {
         this.field3081.method1539(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field3085 == null) {
               this.method1610();
            }

            Iterator var9 = var5.iterator();

            while(true) {
               List var11;
               do {
                  if (!var9.hasNext()) {
                     return;
                  }

                  int var10 = ((Integer)var9.next()).intValue();
                  var11 = (List)this.field3085.get(var10);
               } while(null == var11);

               Iterator var12 = var11.iterator();

               while(var12.hasNext()) {
                  class428 var13 = (class428)var12.next();
                  int var14 = (var13.field3586.field2904 - this.field3089) * var3 / this.field3091;
                  int var15 = var4 - var4 * (var13.field3586.field2905 - this.field3087) / this.field3092;
                  class362.method1730(var14 + var1, var2 + var15, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public List method1606(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var12 = new LinkedList();
      if (!this.field3082) {
         return var12;
      } else {
         class57 var13 = this.method1607(var1, var2, var3, var4);
         float var14 = this.method1611(var7, var3 - var1);
         int var15 = (int)(var14 * 64.0F);
         int var16 = this.field3089 + var1;
         int var17 = this.field3087 + var2;

         for(int var18 = var13.field808; var18 < var13.field809 + var13.field808; ++var18) {
            for(int var19 = var13.field810; var19 < var13.field811 + var13.field810; ++var19) {
               List var20 = this.field3083[var18][var19].method380(var5 + var15 * (this.field3083[var18][var19].field836 * 64 - var16) / 64, var6 + var8 - (64 + (this.field3083[var18][var19].field843 * 64 - var17)) * var15 / 64, var15, var9, var10);
               if (!var20.isEmpty()) {
                  var12.addAll(var20);
               }
            }
         }

         return var12;
      }
   }

   class57 method1607(int var1, int var2, int var3, int var4) {
      class57 var6 = new class57(this);
      int var7 = this.field3089 + var1;
      int var8 = var2 + this.field3087;
      int var9 = this.field3089 + var3;
      int var10 = this.field3087 + var4;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      int var14 = var10 / 64;
      var6.field809 = var13 - var11 + 1;
      var6.field811 = var14 - var12 + 1;
      var6.field808 = var11 - this.field3080.method2072();
      var6.field810 = var12 - this.field3080.method2067();
      if (var6.field808 < 0) {
         var6.field809 += var6.field808;
         var6.field808 = 0;
      }

      if (var6.field808 > this.field3083.length - var6.field809) {
         var6.field809 = this.field3083.length - var6.field808;
      }

      if (var6.field810 < 0) {
         var6.field811 += var6.field810;
         var6.field810 = 0;
      }

      if (var6.field810 > this.field3083[0].length - var6.field811) {
         var6.field811 = this.field3083[0].length - var6.field810;
      }

      var6.field809 = Math.min(var6.field809, this.field3083.length);
      var6.field811 = Math.min(var6.field811, this.field3083[0].length);
      return var6;
   }

   public boolean method1608() {
      return this.field3082;
   }

   public HashMap method1609() {
      this.method1610();
      return this.field3085;
   }

   void method1610() {
      if (null == this.field3085) {
         this.field3085 = new HashMap();
      }

      this.field3085.clear();

      for(int var2 = 0; var2 < this.field3083.length; ++var2) {
         for(int var3 = 0; var3 < this.field3083[var2].length; ++var3) {
            List var4 = this.field3083[var2][var3].method376();
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               class428 var6 = (class428)var5.next();
               if (var6.method2046()) {
                  int var7 = var6.method2047();
                  if (!this.field3085.containsKey(var7)) {
                     LinkedList var8 = new LinkedList();
                     var8.add(var6);
                     this.field3085.put(var7, var8);
                  } else {
                     List var9 = (List)this.field3085.get(var7);
                     var9.add(var6);
                  }
               }
            }
         }
      }

   }

   float method1611(int var1, int var2) {
      float var4 = (float)var1 / (float)var2;
      if (var4 > 8.0F) {
         return 8.0F;
      } else if (var4 < 1.0F) {
         return 1.0F;
      } else {
         int var5 = Math.round(var4);
         return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
      }
   }
}
