@ObfInfo(
   name = "gm"
)
public class class473 extends class195 {
   @ObfInfo(
      owner = "gm",
      name = "v",
      desc = "Lly;"
   )
   public static class274 field3969;
   @ObfInfo(
      owner = "gm",
      name = "e",
      desc = "Lly;"
   )
   public static class274 field3973;
   @ObfInfo(
      owner = "gm",
      name = "ec",
      desc = "Lln;"
   )
   static class38 field3989;
   @ObfInfo(
      owner = "gm",
      name = "m",
      desc = "Ljv;"
   )
   static class99 field3971 = new class99(64);
   @ObfInfo(
      owner = "gm",
      name = "x",
      desc = "Ljv;"
   )
   static class99 field3981 = new class99(64);
   @ObfInfo(
      owner = "gm",
      name = "q",
      desc = "Ljv;"
   )
   static class99 field3986 = new class99(20);
   @ObfInfo(
      owner = "gm",
      name = "g",
      desc = "I"
   )
   int field3974 = -1;
   @ObfInfo(
      owner = "gm",
      name = "n",
      desc = "I"
   )
   int field3976 = -1;
   @ObfInfo(
      owner = "gm",
      name = "a",
      desc = "I"
   )
   int field3978 = -1;
   @ObfInfo(
      owner = "gm",
      name = "s",
      desc = "I"
   )
   int field3979 = -1;
   @ObfInfo(
      owner = "gm",
      name = "k",
      desc = "I"
   )
   int field3983 = -1;
   @ObfInfo(
      owner = "gm",
      name = "w",
      desc = "I"
   )
   int field3987 = -1;
   @ObfInfo(
      owner = "gm",
      name = "as",
      desc = "I"
   )
   int field3988 = -1;
   @ObfInfo(
      owner = "gm",
      name = "p",
      desc = "Ljava/lang/String;"
   )
   String field3968 = "";
   @ObfInfo(
      owner = "gm",
      name = "i",
      desc = "I"
   )
   public int field3970 = 16777215;
   @ObfInfo(
      owner = "gm",
      name = "o",
      desc = "I"
   )
   public int field3972 = 70;
   @ObfInfo(
      owner = "gm",
      name = "t",
      desc = "I"
   )
   public int field3975 = 0;
   @ObfInfo(
      owner = "gm",
      name = "l",
      desc = "I"
   )
   public int field3980 = 0;
   @ObfInfo(
      owner = "gm",
      name = "c",
      desc = "I"
   )
   public int field3982 = -1;
   @ObfInfo(
      owner = "gm",
      name = "d",
      desc = "I"
   )
   public int field3984 = -1;
   @ObfInfo(
      owner = "gm",
      name = "y",
      desc = "I"
   )
   public int field3985 = 0;
   @ObfInfo(
      owner = "gm",
      name = "z",
      desc = "[I"
   )
   public int[] field3977;

   @ObfInfo(
      owner = "gm",
      name = "e",
      desc = "(Lqy;I)V"
   )
   void method2348(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         this.method2345(var1, var3);
      }
   }

   @ObfInfo(
      owner = "gm",
      name = "v",
      desc = "(Lqy;IB)V"
   )
   void method2345(class127 var1, int var2) {
      if (var2 == 1) {
         this.field3974 = var1.method560();
      } else if (var2 == 2) {
         this.field3970 = var1.method551();
      } else if (var2 == 3) {
         this.field3976 = var1.method560();
      } else if (var2 == 4) {
         this.field3978 = var1.method560();
      } else if (var2 == 5) {
         this.field3983 = var1.method560();
      } else if (var2 == 6) {
         this.field3979 = var1.method560();
      } else if (var2 == 7) {
         this.field3980 = var1.method550();
      } else if (var2 == 8) {
         this.field3968 = var1.method556();
      } else if (var2 == 9) {
         this.field3972 = var1.method549();
      } else if (var2 == 10) {
         this.field3975 = var1.method550();
      } else if (var2 == 11) {
         this.field3982 = 0;
      } else if (var2 == 12) {
         this.field3984 = var1.method547();
      } else if (var2 == 13) {
         this.field3985 = var1.method550();
      } else if (var2 == 14) {
         this.field3982 = var1.method549();
      } else if (var2 == 17 || var2 == 18) {
         this.field3987 = var1.method549();
         if (this.field3987 == 65535) {
            this.field3987 = -1;
         }

         this.field3988 = var1.method549();
         if (this.field3988 == 65535) {
            this.field3988 = -1;
         }

         int var4 = -1;
         if (var2 == 18) {
            var4 = var1.method549();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         int var5 = var1.method547();
         this.field3977 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3977[var6] = var1.method549();
            if (this.field3977[var6] == 65535) {
               this.field3977[var6] = -1;
            }
         }

         this.field3977[var5 + 1] = var4;
      }

   }

   @ObfInfo(
      owner = "gm",
      name = "x",
      desc = "(B)Lgm;"
   )
   public final class473 method2340() {
      int var2 = -1;
      if (this.field3987 != -1) {
         var2 = class67.method300(this.field3987);
      } else if (this.field3988 != -1) {
         var2 = class291.field2373[this.field3988];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field3977.length - 1) {
         var3 = this.field3977[var2];
      } else {
         var3 = this.field3977[this.field3977.length - 1];
      }

      return var3 != -1 ? class444.method2198(var3) : null;
   }

   @ObfInfo(
      owner = "gm",
      name = "m",
      desc = "(II)Ljava/lang/String;"
   )
   public String method2341(int var1) {
      String var3 = this.field3968;

      while(true) {
         int var4 = var3.indexOf("%1");
         if (var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + class364.method1810(var1, false) + var3.substring(var4 + 2);
      }
   }

   @ObfInfo(
      owner = "gm",
      name = "q",
      desc = "(S)Lrx;"
   )
   public class266 method2342() {
      if (this.field3976 < 0) {
         return null;
      } else {
         class266 var2 = (class266)field3971.method394((long)this.field3976);
         if (null != var2) {
            return var2;
         } else {
            var2 = class84.method341(field3973, this.field3976, 0);
            if (null != var2) {
               field3971.method396(var2, (long)this.field3976);
            }

            return var2;
         }
      }
   }

   @ObfInfo(
      owner = "gm",
      name = "f",
      desc = "(S)Lrx;"
   )
   public class266 method2343() {
      if (this.field3983 < 0) {
         return null;
      } else {
         class266 var2 = (class266)field3971.method394((long)this.field3983);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class84.method341(field3973, this.field3983, 0);
            if (null != var2) {
               field3971.method396(var2, (long)this.field3983);
            }

            return var2;
         }
      }
   }

   @ObfInfo(
      owner = "gm",
      name = "r",
      desc = "(I)Lrx;"
   )
   public class266 method2350() {
      if (this.field3978 < 0) {
         return null;
      } else {
         class266 var2 = (class266)field3971.method394((long)this.field3978);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class84.method341(field3973, this.field3978, 0);
            if (null != var2) {
               field3971.method396(var2, (long)this.field3978);
            }

            return var2;
         }
      }
   }

   @ObfInfo(
      owner = "gm",
      name = "u",
      desc = "(B)Lrx;"
   )
   public class266 method2344() {
      if (this.field3979 < 0) {
         return null;
      } else {
         class266 var2 = (class266)field3971.method394((long)this.field3979);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class84.method341(field3973, this.field3979, 0);
            if (var2 != null) {
               field3971.method396(var2, (long)this.field3979);
            }

            return var2;
         }
      }
   }

   @ObfInfo(
      owner = "gm",
      name = "b",
      desc = "(B)Lnv;"
   )
   public class58 method2347() {
      if (-1 == this.field3974) {
         return null;
      } else {
         class58 var2 = (class58)field3986.method394((long)this.field3974);
         if (null != var2) {
            return var2;
         } else {
            var2 = class337.method1696(field3973, field3969, this.field3974, 0);
            if (null != var2) {
               field3986.method396(var2, (long)this.field3974);
            }

            return var2;
         }
      }
   }

   @ObfInfo(
      owner = "gm",
      name = "m",
      desc = "(IB)V"
   )
   public static void method2346(int var0) {
      if (var0 != -1) {
         if (class476.field4009[var0]) {
            class126.field1066.method1354(var0);
            if (null != class329.field2600[var0]) {
               boolean var2 = true;

               for(int var3 = 0; var3 < class329.field2600[var0].length; ++var3) {
                  if (class329.field2600[var0][var3] != null) {
                     if (2 != class329.field2600[var0][var3].field1026) {
                        class329.field2600[var0][var3] = null;
                     } else {
                        var2 = false;
                     }
                  }
               }

               if (var2) {
                  class329.field2600[var0] = null;
               }

               class476.field4009[var0] = false;
            }
         }
      }
   }

   @ObfInfo(
      owner = "gm",
      name = "ge",
      desc = "(S)Z"
   )
   static boolean method2339() {
      if (client.field515 != null && client.field443 < client.field515.size()) {
         while(client.field443 < client.field515.size()) {
            class193 var1 = (class193)client.field515.get(client.field443);
            if (!var1.method869()) {
               return false;
            }

            ++client.field443;
         }

         return true;
      } else {
         return true;
      }
   }

   @ObfInfo(
      owner = "gm",
      name = "ha",
      desc = "(I)V"
   )
   static final void method2349() {
      int var1 = class268.field2221;
      int[] var2 = class268.field2220;

      for(int var3 = 0; var3 < var1; ++var3) {
         class380 var4 = client.field347[var2[var3]];
         if (null != var4) {
            class340.method1707(var4, 1);
         }
      }

   }
}
