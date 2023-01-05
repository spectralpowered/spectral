public class class194 extends class108 {
   public static class164 field2031;
   public static class194[] field2013;
   public static class31 field2015 = new class31(256);
   public static int field2014;
   byte[] field2034;
   int field2021 = -1;
   int field2024 = Integer.MIN_VALUE;
   int field2028 = Integer.MAX_VALUE;
   int field2029 = Integer.MAX_VALUE;
   int field2030 = Integer.MIN_VALUE;
   int[] field2017;
   int[] field2020;
   public boolean field2023 = true;
   public boolean field2027 = false;
   public class205 field2032;
   public class383 field2018;
   public int field2012 = -1;
   public int field2022 = 0;
   public int field2033;
   public int field2035;
   public String field2019;
   public String field2026;
   public String[] field2025 = new String[5];
   public final int field2016;

   public class194(int var1) {
      this.field2018 = class383.field3329;
      this.field2032 = class205.field2185;
      this.field2035 = -1;
      this.field2016 = var1;
   }

   public void method995(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method996(var1, var3);
      }
   }

   void method996(class134 var1, int var2) {
      if (var2 == 1) {
         this.field2012 = var1.method682();
      } else if (var2 == 2) {
         this.field2021 = var1.method682();
      } else if (var2 == 3) {
         this.field2019 = var1.method677();
      } else if (var2 == 4) {
         this.field2033 = var1.method673();
      } else if (var2 == 5) {
         var1.method673();
      } else if (var2 == 6) {
         this.field2022 = var1.method669();
      } else {
         int var4;
         if (var2 == 7) {
            var4 = var1.method669();
            if (0 == (var4 & 1)) {
               this.field2023 = false;
            }

            if ((var4 & 2) == 2) {
               this.field2027 = true;
            }
         } else if (var2 == 8) {
            var1.method669();
         } else if (var2 >= 10 && var2 <= 14) {
            this.field2025[var2 - 10] = var1.method677();
         } else if (var2 == 15) {
            var4 = var1.method669();
            this.field2020 = new int[var4 * 2];

            int var5;
            for(var5 = 0; var5 < var4 * 2; ++var5) {
               this.field2020[var5] = var1.method672();
            }

            var1.method717();
            var5 = var1.method669();
            this.field2017 = new int[var5];

            int var6;
            for(var6 = 0; var6 < this.field2017.length; ++var6) {
               this.field2017[var6] = var1.method717();
            }

            this.field2034 = new byte[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               this.field2034[var6] = var1.method670();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.field2026 = var1.method677();
            } else if (var2 == 18) {
               var1.method682();
            } else if (var2 == 19) {
               this.field2035 = var1.method671();
            } else if (var2 == 21) {
               var1.method717();
            } else if (var2 == 22) {
               var1.method717();
            } else if (var2 == 23) {
               var1.method669();
               var1.method669();
               var1.method669();
            } else if (var2 == 24) {
               var1.method672();
               var1.method672();
            } else if (var2 == 25) {
               var1.method682();
            } else if (var2 == 28) {
               var1.method669();
            } else if (var2 == 29) {
               class383[] var7 = new class383[]{class383.field3332, class383.field3329, class383.field3330};
               this.field2018 = (class383)class296.method1399(var7, var1.method669());
            } else if (var2 == 30) {
               class205[] var8 = new class205[]{class205.field2188, class205.field2187, class205.field2185};
               this.field2032 = (class205)class296.method1399(var8, var1.method669());
            }
         }
      }

   }

   public void method997() {
      if (null != this.field2020) {
         for(int var2 = 0; var2 < this.field2020.length; var2 += 2) {
            if (this.field2020[var2] < this.field2028) {
               this.field2028 = this.field2020[var2];
            } else if (this.field2020[var2] > this.field2030) {
               this.field2030 = this.field2020[var2];
            }

            if (this.field2020[var2 + 1] < this.field2029) {
               this.field2029 = this.field2020[var2 + 1];
            } else if (this.field2020[var2 + 1] > this.field2024) {
               this.field2024 = this.field2020[var2 + 1];
            }
         }
      }

   }

   public class319 method998(boolean var1) {
      int var3 = var1 ? this.field2021 : this.field2012;
      return this.method999(var3);
   }

   class319 method999(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         class319 var3 = (class319)field2015.method161((long)var1);
         if (var3 != null) {
            return var3;
         } else {
            var3 = class360.method1714(field2031, var1, 0);
            if (null != var3) {
               field2015.method163(var3, (long)var1);
            }

            return var3;
         }
      }
   }

   public int method1000() {
      return this.field2016;
   }

   public static int method1003(CharSequence var0, int var1) {
      return class239.method1213(var0, var1, true);
   }

   static final boolean method1002() {
      return class245.field2601;
   }

   public static void method1001(class169 var0) {
      class360.method1723(var0, 500000, 475000);
   }
}
