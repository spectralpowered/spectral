import java.util.Arrays;

public class class402 {
   int[] field3516 = new int[112];
   int[] field3517 = new int[192];

   public class402() {
      Arrays.fill(this.field3516, 3);
      Arrays.fill(this.field3517, 3);
   }

   public void method1966(int var1, int var2) {
      if (this.method1968(var1) && this.method1969(var2)) {
         this.field3516[var1] = var2;
      }

   }

   public void method1963(char var1, int var2) {
      if (this.method1970(var1, (byte)-1) && this.method1969(var2)) {
         this.field3517[var1] = var2;
      }

   }

   public int method1962(int var1) {
      return this.method1968(var1) ? this.field3516[var1] : 0;
   }

   public int method1964(char var1) {
      return this.method1970(var1, (byte)-1) ? this.field3517[var1] : 0;
   }

   public boolean method1972(int var1) {
      return this.method1968(var1) && (1 == this.field3516[var1] || this.field3516[var1] == 3);
   }

   public boolean method1965(char var1) {
      return this.method1970(var1, (byte)-1) && (1 == this.field3517[var1] || 3 == this.field3517[var1]);
   }

   public boolean method1967(int var1) {
      return this.method1968(var1) && (2 == this.field3516[var1] || this.field3516[var1] == 3);
   }

   public boolean method1971(char var1) {
      return this.method1970(var1, (byte)-1) && (2 == this.field3517[var1] || 3 == this.field3517[var1]);
   }

   boolean method1968(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   boolean method1970(char var1, byte var2) {
      if (var1 >= 0) {
         if (var2 != -1) {
            throw new IllegalStateException();
         }

         if (var1 < 192) {
            return true;
         }

         if (var2 != -1) {
            throw new IllegalStateException();
         }
      }

      System.out.println("Invalid keychar: " + var1);
      return false;
   }

   boolean method1969(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   static float method1973(class360 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var3;
         if (var0.field3216 == var1) {
            var3 = 0.0F;
         } else if (var1 == var0.field3217) {
            var3 = 1.0F;
         } else {
            var3 = (var1 - var0.field3216) / (var0.field3217 - var0.field3216);
         }

         float var4;
         if (var0.field3230) {
            var4 = var3;
         } else {
            class257.field2641[3] = var0.field3221;
            class257.field2641[2] = var0.field3210;
            class257.field2641[1] = var0.field3232;
            class257.field2641[0] = var0.field3218 - var3;
            class257.field2644[0] = 0.0F;
            class257.field2644[1] = 0.0F;
            class257.field2644[2] = 0.0F;
            class257.field2644[3] = 0.0F;
            class257.field2644[4] = 0.0F;
            int var5 = class184.method965(class257.field2641, 3, 0.0F, true, 1.0F, true, class257.field2644);
            if (var5 == 1) {
               var4 = class257.field2644[0];
            } else {
               var4 = 0.0F;
            }
         }

         return var0.field3222 + var4 * (var0.field3223 + (var4 * var0.field3225 + var0.field3224) * var4);
      }
   }
}
