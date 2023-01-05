public class class399 extends class108 {
   public static class164 field3489;
   public static class164 field3493;
   static class230 field3509;
   static class31 field3491 = new class31(64);
   static class31 field3501 = new class31(64);
   static class31 field3506 = new class31(20);
   int field3494 = -1;
   int field3496 = -1;
   int field3498 = -1;
   int field3499 = -1;
   int field3503 = -1;
   int field3507 = -1;
   int field3508 = -1;
   String field3488 = "";
   public int field3490 = 16777215;
   public int field3492 = 70;
   public int field3495 = 0;
   public int field3500 = 0;
   public int field3502 = -1;
   public int field3504 = -1;
   public int field3505 = 0;
   public int[] field3497;

   void method1955(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method1952(var1, var3);
      }
   }

   void method1952(class134 var1, int var2) {
      if (var2 == 1) {
         this.field3494 = var1.method682();
      } else if (var2 == 2) {
         this.field3490 = var1.method673();
      } else if (var2 == 3) {
         this.field3496 = var1.method682();
      } else if (var2 == 4) {
         this.field3498 = var1.method682();
      } else if (var2 == 5) {
         this.field3503 = var1.method682();
      } else if (var2 == 6) {
         this.field3499 = var1.method682();
      } else if (var2 == 7) {
         this.field3500 = var1.method672();
      } else if (var2 == 8) {
         this.field3488 = var1.method678();
      } else if (var2 == 9) {
         this.field3492 = var1.method671();
      } else if (var2 == 10) {
         this.field3495 = var1.method672();
      } else if (var2 == 11) {
         this.field3502 = 0;
      } else if (var2 == 12) {
         this.field3504 = var1.method669();
      } else if (var2 == 13) {
         this.field3505 = var1.method672();
      } else if (var2 == 14) {
         this.field3502 = var1.method671();
      } else if (var2 == 17 || var2 == 18) {
         this.field3507 = var1.method671();
         if (this.field3507 == 65535) {
            this.field3507 = -1;
         }

         this.field3508 = var1.method671();
         if (this.field3508 == 65535) {
            this.field3508 = -1;
         }

         int var4 = -1;
         if (var2 == 18) {
            var4 = var1.method671();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         int var5 = var1.method669();
         this.field3497 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3497[var6] = var1.method671();
            if (this.field3497[var6] == 65535) {
               this.field3497[var6] = -1;
            }
         }

         this.field3497[var5 + 1] = var4;
      }

   }

   public final class399 method1947() {
      int var2 = -1;
      if (this.field3507 != -1) {
         var2 = class274.method1302(this.field3507);
      } else if (this.field3508 != -1) {
         var2 = class484.field3992[this.field3508];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field3497.length - 1) {
         var3 = this.field3497[var2];
      } else {
         var3 = this.field3497[this.field3497.length - 1];
      }

      return var3 != -1 ? class246.method1223(var3) : null;
   }

   public String method1948(int var1) {
      String var3 = this.field3488;

      while(true) {
         int var4 = var3.indexOf("%1");
         if (var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + class369.method1782(var1, false) + var3.substring(var4 + 2);
      }
   }

   public class319 method1949() {
      if (this.field3496 < 0) {
         return null;
      } else {
         class319 var2 = (class319)field3491.method161((long)this.field3496);
         if (null != var2) {
            return var2;
         } else {
            var2 = class360.method1714(field3493, this.field3496, 0);
            if (null != var2) {
               field3491.method163(var2, (long)this.field3496);
            }

            return var2;
         }
      }
   }

   public class319 method1950() {
      if (this.field3503 < 0) {
         return null;
      } else {
         class319 var2 = (class319)field3491.method161((long)this.field3503);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class360.method1714(field3493, this.field3503, 0);
            if (null != var2) {
               field3491.method163(var2, (long)this.field3503);
            }

            return var2;
         }
      }
   }

   public class319 method1957() {
      if (this.field3498 < 0) {
         return null;
      } else {
         class319 var2 = (class319)field3491.method161((long)this.field3498);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class360.method1714(field3493, this.field3498, 0);
            if (null != var2) {
               field3491.method163(var2, (long)this.field3498);
            }

            return var2;
         }
      }
   }

   public class319 method1951() {
      if (this.field3499 < 0) {
         return null;
      } else {
         class319 var2 = (class319)field3491.method161((long)this.field3499);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class360.method1714(field3493, this.field3499, 0);
            if (var2 != null) {
               field3491.method163(var2, (long)this.field3499);
            }

            return var2;
         }
      }
   }

   public class394 method1954() {
      if (-1 == this.field3494) {
         return null;
      } else {
         class394 var2 = (class394)field3506.method161((long)this.field3494);
         if (null != var2) {
            return var2;
         } else {
            var2 = class238.method1211(field3493, field3489, this.field3494, 0);
            if (null != var2) {
               field3506.method163(var2, (long)this.field3494);
            }

            return var2;
         }
      }
   }

   public static void method1953(int var0) {
      if (var0 != -1) {
         if (class22.field167[var0]) {
            class477.field3968.method881(var0);
            if (null != class71.field853[var0]) {
               boolean var2 = true;

               for(int var3 = 0; var3 < class71.field853[var0].length; ++var3) {
                  if (class71.field853[var0][var3] != null) {
                     if (2 != class71.field853[var0][var3].field2348) {
                        class71.field853[var0][var3] = null;
                     } else {
                        var2 = false;
                     }
                  }
               }

               if (var2) {
                  class71.field853[var0] = null;
               }

               class22.field167[var0] = false;
            }
         }
      }
   }

   static boolean method1946() {
      if (client.field719 != null && client.field647 < client.field719.size()) {
         while(client.field647 < client.field719.size()) {
            class97 var1 = (class97)client.field719.get(client.field647);
            if (!var1.method548()) {
               return false;
            }

            ++client.field647;
         }

         return true;
      } else {
         return true;
      }
   }

   static final void method1956() {
      int var1 = class25.field180;
      int[] var2 = class25.field179;

      for(int var3 = 0; var3 < var1; ++var3) {
         class47 var4 = client.field551[var2[var3]];
         if (null != var4) {
            class344.method1658(var4, 1);
         }
      }

   }
}
