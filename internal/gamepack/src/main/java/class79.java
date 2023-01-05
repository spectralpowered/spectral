import java.util.HashMap;
import java.util.Map;

public class class79 extends class108 {
   public static class31 field900 = new class31(64);
   public static class31 field901 = new class31(100);
   public static class31 field913 = new class31(100);
   static boolean field922 = false;
   static class164 field898;
   static class164 field899;
   boolean[] field912;
   int field906 = 0;
   int field919 = 0;
   int[] field907;
   int[] field911;
   public boolean field902 = false;
   public boolean field918 = false;
   public int field897 = 2;
   public int field903 = -1;
   public int field905 = -1;
   public int field910 = -1;
   public int field915 = -1;
   public int field916 = -1;
   public int field917 = -1;
   public int field920 = 5;
   public int field921 = 99;
   public int[] field908;
   public int[] field909;
   public int[] field914;
   public Map field904;

   void method421(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method431(var1, var3);
      }
   }

   void method431(class134 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method671();
         this.field908 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field908[var5] = var1.method671();
         }

         this.field914 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field914[var5] = var1.method671();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field914[var5] += var1.method671() << 16;
         }
      } else if (var2 == 2) {
         this.field917 = var1.method671();
      } else if (var2 == 3) {
         var4 = var1.method669();
         this.field911 = new int[var4 + 1];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field911[var5] = var1.method669();
         }

         this.field911[var4] = 9999999;
      } else if (var2 == 4) {
         this.field902 = true;
      } else if (var2 == 5) {
         this.field920 = var1.method669();
      } else if (var2 == 6) {
         this.field915 = var1.method671();
      } else if (var2 == 7) {
         this.field916 = var1.method671();
      } else if (var2 == 8) {
         this.field921 = var1.method669();
         this.field918 = true;
      } else if (var2 == 9) {
         this.field910 = var1.method669();
      } else if (var2 == 10) {
         this.field905 = var1.method669();
      } else if (var2 == 11) {
         this.field897 = var1.method669();
      } else if (var2 == 12) {
         var4 = var1.method669();
         this.field907 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field907[var5] = var1.method671();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field907[var5] += var1.method671() << 16;
         }
      } else if (var2 == 13) {
         var4 = var1.method669();
         this.field909 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field909[var5] = var1.method673();
         }
      } else if (var2 == 14) {
         this.field903 = var1.method717();
      } else if (var2 == 15) {
         var4 = var1.method671();
         this.field904 = new HashMap();

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.method671();
            int var7 = var1.method673();
            this.field904.put(var6, var7);
         }
      } else if (var2 == 16) {
         this.field919 = var1.method671();
         this.field906 = var1.method671();
      } else if (var2 == 17) {
         this.field912 = new boolean[256];

         for(var4 = 0; var4 < this.field912.length; ++var4) {
            this.field912[var4] = false;
         }

         var4 = var1.method669();

         for(var5 = 0; var5 < var4; ++var5) {
            this.field912[var1.method669()] = true;
         }
      }

   }

   void method422() {
      if (-1 == this.field910) {
         if (null == this.field911 && this.field912 == null) {
            this.field910 = 0;
         } else {
            this.field910 = 2;
         }
      }

      if (this.field905 == -1) {
         if (null == this.field911 && this.field912 == null) {
            this.field905 = 0;
         } else {
            this.field905 = 2;
         }
      }

   }

   public class491 method423(class491 var1, int var2) {
      class491 var5;
      if (!this.method426()) {
         var2 = this.field914[var2];
         class405 var6 = class335.method1618(var2 >> 16);
         var2 &= 65535;
         if (var6 == null) {
            return var1.method2357(true);
         } else {
            var5 = var1.method2357(!var6.method1979(var2));
            var5.method2361(var6, var2);
            return var5;
         }
      } else {
         class159 var4 = class52.method295(this.field903);
         if (null == var4) {
            return var1.method2357(true);
         } else {
            var5 = var1.method2357(!var4.method839());
            var5.method2378(var4, var2);
            return var5;
         }
      }
   }

   class491 method424(class491 var1, int var2, int var3) {
      class491 var6;
      if (!this.method426()) {
         var2 = this.field914[var2];
         class405 var7 = class335.method1618(var2 >> 16);
         var2 &= 65535;
         if (var7 == null) {
            return var1.method2357(true);
         } else {
            var6 = var1.method2357(!var7.method1979(var2));
            var3 &= 3;
            if (var3 == 1) {
               var6.method2385();
            } else if (var3 == 2) {
               var6.method2367();
            } else if (var3 == 3) {
               var6.method2366();
            }

            var6.method2361(var7, var2);
            if (var3 == 1) {
               var6.method2366();
            } else if (var3 == 2) {
               var6.method2367();
            } else if (var3 == 3) {
               var6.method2385();
            }

            return var6;
         }
      } else {
         class159 var5 = class52.method295(this.field903);
         if (null == var5) {
            return var1.method2357(true);
         } else {
            var6 = var1.method2357(!var5.method839());
            var3 &= 3;
            if (var3 == 1) {
               var6.method2385();
            } else if (var3 == 2) {
               var6.method2367();
            } else if (var3 == 3) {
               var6.method2366();
            }

            var6.method2378(var5, var2);
            if (var3 == 1) {
               var6.method2366();
            } else if (var3 == 2) {
               var6.method2367();
            } else if (var3 == 3) {
               var6.method2385();
            }

            return var6;
         }
      }
   }

   class491 method425(class491 var1, int var2) {
      class491 var5;
      if (!this.method426()) {
         var2 = this.field914[var2];
         class405 var6 = class335.method1618(var2 >> 16);
         var2 &= 65535;
         if (var6 == null) {
            return var1.method2358(true);
         } else {
            var5 = var1.method2358(!var6.method1979(var2));
            var5.method2361(var6, var2);
            return var5;
         }
      } else {
         class159 var4 = class52.method295(this.field903);
         if (null == var4) {
            return var1.method2358(true);
         } else {
            var5 = var1.method2358(!var4.method839());
            var5.method2378(var4, var2);
            return var5;
         }
      }
   }

   public class491 method432(class491 var1, int var2, class79 var3, int var4) {
      if (field922 && !this.method426() && !var3.method426()) {
         return this.method430(var1, var2, var3, var4);
      } else {
         class491 var6 = var1.method2357(false);
         boolean var7 = false;
         class405 var8 = null;
         class268 var9 = null;
         class159 var10;
         if (this.method426()) {
            var10 = this.method429();
            if (var10 == null) {
               return var6;
            }

            if (var3.method426() && null == this.field912) {
               var6.method2378(var10, var2);
               return var6;
            }

            var9 = var10.field1648;
            var6.method2383(var9, var10, var2, this.field912, false, !var3.method426());
         } else {
            var2 = this.field914[var2];
            var8 = class335.method1618(var2 >> 16);
            var2 &= 65535;
            if (null == var8) {
               return var3.method423(var1, var4);
            }

            if (!var3.method426() && (null == this.field911 || var4 == -1)) {
               var6.method2361(var8, var2);
               return var6;
            }

            if (this.field911 == null || var4 == -1) {
               var6.method2361(var8, var2);
               return var6;
            }

            var7 = var3.method426();
            if (!var7) {
               var6.method2365(var8, var2, this.field911, false);
            }
         }

         if (var3.method426()) {
            var10 = var3.method429();
            if (null == var10) {
               return var6;
            }

            if (var9 == null) {
               var9 = var10.field1648;
            }

            var6.method2383(var9, var10, var4, this.field912, true, true);
         } else {
            var4 = var3.field914[var4];
            class405 var11 = class335.method1618(var4 >> 16);
            var4 &= 65535;
            if (null == var11) {
               return this.method423(var1, var2);
            }

            var6.method2365(var11, var4, this.field911, true);
         }

         if (var7 && null != var8) {
            var6.method2365(var8, var2, this.field911, false);
         }

         var6.method2384();
         return var6;
      }
   }

   class491 method430(class491 var1, int var2, class79 var3, int var4) {
      var2 = this.field914[var2];
      class405 var6 = class335.method1618(var2 >> 16);
      var2 &= 65535;
      if (null == var6) {
         return var3.method423(var1, var4);
      } else {
         var4 = var3.field914[var4];
         class405 var7 = class335.method1618(var4 >> 16);
         var4 &= 65535;
         class491 var8;
         if (var7 == null) {
            var8 = var1.method2357(!var6.method1979(var2));
            var8.method2361(var6, var2);
            return var8;
         } else {
            var8 = var1.method2357(!var6.method1979(var2) & !var7.method1979(var4));
            var8.method2370(var6, var2, var7, var4, this.field911);
            return var8;
         }
      }
   }

   public class491 method427(class491 var1, int var2) {
      if (!this.method426()) {
         int var4 = this.field914[var2];
         class405 var5 = class335.method1618(var4 >> 16);
         var4 &= 65535;
         if (var5 == null) {
            return var1.method2357(true);
         } else {
            class405 var6 = null;
            int var7 = 0;
            if (null != this.field907 && var2 < this.field907.length) {
               var7 = this.field907[var2];
               var6 = class335.method1618(var7 >> 16);
               var7 &= 65535;
            }

            class491 var8;
            if (null != var6 && var7 != 65535) {
               var8 = var1.method2357(!var5.method1979(var4) & !var6.method1979(var7));
               var8.method2361(var5, var4);
               var8.method2361(var6, var7);
               return var8;
            } else {
               var8 = var1.method2357(!var5.method1979(var4));
               var8.method2361(var5, var4);
               return var8;
            }
         }
      } else {
         return this.method423(var1, var2);
      }
   }

   public boolean method426() {
      return this.field903 >= 0;
   }

   public int method428() {
      return this.field906 - this.field919;
   }

   class159 method429() {
      return this.method426() ? class52.method295(this.field903) : null;
   }

   public static class319[] method434(class164 var0, int var1, int var2) {
      byte[] var5 = var0.method892(var1, var2);
      boolean var4;
      if (null == var5) {
         var4 = false;
      } else {
         class212.method1108(var5);
         var4 = true;
      }

      return !var4 ? null : class331.method1601();
   }

   public static void method433(class164 var0, class164 var1, class164 var2, class164 var3) {
      class477.field3968 = var0;
      class210.field2206 = var1;
      class210.field2235 = var2;
      class81.field929 = var3;
      class71.field853 = new class210[class477.field3968.method880()][];
      class22.field167 = new boolean[class477.field3968.method880()];
   }
}
