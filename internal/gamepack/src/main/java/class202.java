import java.util.ArrayList;

public class class202 {
   static class210 field2178;
   boolean field2172 = true;
   boolean field2173 = true;
   class93 field2174;
   int field2170 = Integer.MAX_VALUE;
   int field2171 = 0;
   int field2176 = 0;
   int field2177 = 0;
   ArrayList field2175 = new ArrayList();

   public class314 method1017(int var1) {
      return (class314)this.field2175.get(var1);
   }

   class314 method1018() {
      return this.field2175.size() == 0 ? null : (class314)this.field2175.get(this.field2175.size() - 1);
   }

   public boolean method1042() {
      return this.field2175.size() == 0;
   }

   public int method1020() {
      return this.field2175.size();
   }

   public String method1040() {
      if (this.method1042()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method1020());

         for(int var3 = 0; var3 < this.method1020(); ++var3) {
            class314 var4 = this.method1017(var3);
            var2.append(var4.field2982);
         }

         return var2.toString();
      }
   }

   public void method1021(int var1, boolean var2) {
      if (null != this.field2174 && var1 < this.field2174.field999 * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (this.field2170 != var1 || var2 != this.field2172) {
         this.field2170 = var1;
         this.field2172 = var2;
         this.method1019(0, this.field2175.size(), false);
      }

   }

   public void method1022(int var1) {
      if (this.field2177 != var1) {
         this.field2177 = var1;
         this.method1019(0, this.field2175.size(), false);
      }

   }

   public void method1044(class93 var1) {
      if (var1 != this.field2174) {
         this.field2174 = var1;
         if (null != this.field2174) {
            if (this.field2171 == 0) {
               this.field2171 = this.field2174.field999;
            }

            if (!this.method1042()) {
               this.method1019(0, this.field2175.size(), false);
            }
         }
      }

   }

   public void method1046(int var1) {
      if (this.field2176 != var1) {
         this.field2176 = var1;
         this.method1019(0, this.field2175.size(), false);
      }

   }

   public void method1045(int var1) {
      if (var1 != this.field2171) {
         this.field2171 = var1;
         this.method1019(0, this.field2175.size(), false);
      }

   }

   public class424 method1041(int var1, int var2) {
      if (var2 == var1) {
         return new class424(this, 0, 0);
      } else if (var1 <= this.field2175.size() && var2 <= this.field2175.size()) {
         return var2 < var1 ? new class424(this, var2, var1) : new class424(this, var1, var2);
      } else {
         return new class424(this, 0, 0);
      }
   }

   public class114 method1024(char var1, int var2, int var3, int var4) {
      return this.method1025(Character.toString(var1), var2, var3, var4);
   }

   public class114 method1025(String var1, int var2, int var3, int var4) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      if (this.field2175.size() >= var3) {
         return new class114(var2, true);
      } else {
         this.field2175.ensureCapacity(this.field2175.size() + var1.length());
         int var6 = var2;
         int var7 = 0;
         class314 var8 = this.method1037(var2);
         int var9 = this.method1038(var2);

         int var10;
         int var11;
         for(var10 = -1; var7 < var1.length() && this.field2175.size() < var3; ++var6) {
            class314 var12 = new class314();
            var12.field2982 = var1.charAt(var7++);
            if (var12.field2982 == '\n') {
               var12.field2983 = var8.field2983 + this.method1047();
               var11 = 0;
            } else {
               var12.field2984 = var9 + var8.field2984;
               var12.field2983 = var8.field2983;
               var11 = this.method1039(var12, false);
               if (this.field2172 && var11 + var12.field2984 > this.field2170) {
                  if (this.field2176 == 0) {
                     var12.field2984 = 0;
                     var12.field2983 += this.method1047();
                  } else if (var10 == -1) {
                     var10 = var6;
                  }
               }
            }

            var8 = var12;
            var9 = var11;
            this.field2175.add(var6, var12);
         }

         var11 = var10 == -1 ? var6 : var10;
         this.method1019(var11, this.field2175.size(), true);
         if (var4 != 0 && this.method1048() > var4) {
            while(var2 != var6) {
               --var6;
               this.method1029(var6);
               if (this.method1048() <= var4) {
                  break;
               }
            }

            return new class114(var6, true);
         } else {
            return new class114(var6, false);
         }
      }
   }

   class114 method1026(String var1, int var2, int var3) {
      return this.method1025(var1, this.field2175.size(), var2, var3);
   }

   public class114 method1027(String var1) {
      this.method1028();
      return this.method1026(var1, 0, 0);
   }

   void method1028() {
      this.field2175.clear();
   }

   public int method1029(int var1) {
      return this.method1023(var1, var1 + 1);
   }

   public int method1023(int var1, int var2) {
      int var4;
      if (var2 < var1) {
         var4 = var2;
         var2 = var1;
         var1 = var4;
      }

      this.field2175.subList(var1, var2).clear();
      var4 = var1;
      if (this.field2172 && 1 == this.field2176) {
         label30: {
            int var5 = var1;

            char var6;
            do {
               if (var5 <= 0) {
                  break label30;
               }

               --var5;
               var6 = ((class314)this.field2175.get(var5)).field2982;
            } while(var6 != ' ' && var6 != '\t');

            var4 = var5;
         }
      }

      this.method1019(var4, this.field2175.size(), true);
      return var1;
   }

   public int method1030(int var1, int var2) {
      if (null != this.field2174 && var1 >= 0 && var2 >= 0) {
         if (this.field2172 && var1 > this.field2170) {
            return this.field2175.size();
         } else {
            if (!this.field2175.isEmpty()) {
               for(int var4 = 0; var4 < this.field2175.size(); ++var4) {
                  class314 var5 = (class314)this.field2175.get(var4);
                  if (var2 <= var5.field2983 + this.method1047()) {
                     if (var2 < var5.field2983) {
                        break;
                     }

                     if (var1 < var5.field2984) {
                        return var4 > 0 ? var4 - 1 : 0;
                     }

                     if (var4 + 1 != this.field2175.size() && ((class314)this.field2175.get(var4 + 1)).field2983 != var5.field2983) {
                        int var6 = this.method1039((class314)this.field2175.get(var4), false);
                        if (var1 < var5.field2984 + var6) {
                           return var4;
                        }

                        if (var2 <= var5.field2983 + this.method1047()) {
                           return var4 + 1;
                        }
                     }
                  }
               }

               class314 var7 = (class314)this.field2175.get(this.field2175.size() - 1);
               if (var1 >= var7.field2984 && var1 <= var7.field2984 + this.method1033() && var2 >= var7.field2983 && var2 <= var7.field2983 + this.method1047()) {
                  return this.field2175.size() - 1;
               }
            }

            return this.field2175.size();
         }
      } else {
         return 0;
      }
   }

   public int method1031(int var1, int var2) {
      if (null != this.field2174 && !this.method1042() && var1 <= this.field2175.size()) {
         byte var4;
         if (var2 > 0) {
            var4 = 1;
         } else {
            var4 = -1;
            var2 = -var2;
         }

         int var5 = 0;
         int var6 = 0;
         if (var1 > 0) {
            class314 var7 = (class314)this.field2175.get(var1 - 1);
            var5 = var7.field2984 + this.method1036(var1 - 1);
            var6 = var7.field2983;
         } else if (var4 == -1 && var1 == 0) {
            return 0;
         }

         int var15 = 16777215;
         int var8 = 0;
         int var9 = var1;
         int var10 = 16777215;
         int var11 = var4 == 1 ? this.field2175.size() + 1 : 0;

         for(int var12 = var1 + var4; var12 != var11; var12 += var4) {
            class314 var13 = (class314)this.field2175.get(var12 - 1);
            if (var13.field2983 != var6) {
               ++var8;
               var6 = var13.field2983;
               if (var8 > var2) {
                  return var9;
               }
            }

            if (var8 == var2) {
               int var14 = Math.abs(var13.field2984 + this.method1036(var12 - 1) - var5);
               if (var14 >= var10) {
                  return var9;
               }

               var9 = var12;
               var10 = var14;
            }
         }

         if (var4 == 1) {
            return this.field2175.size();
         } else {
            if (var6 != 0) {
               ++var8;
            }

            return var10 != 16777215 && (var8 != var2 || var5 >= var10) ? var9 : 0;
         }
      } else {
         return 0;
      }
   }

   public int method1032() {
      if (!this.field2175.isEmpty() && this.method1048() == 1) {
         return this.field2175.isEmpty() ? 0 : ((class314)this.field2175.get(this.field2175.size() - 1)).field2984 + this.method1033();
      } else {
         int var2 = -1;
         int var3 = 0;

         for(int var4 = this.field2175.size() - 1; var4 >= 0; --var4) {
            class314 var5 = (class314)this.field2175.get(var4);
            if (var5.field2983 != var2) {
               int var6 = this.method1039(var5, false) + var5.field2984;
               var3 = Math.max(var6, var3);
               var2 = var5.field2983;
            }
         }

         return var3;
      }
   }

   public int method1049() {
      return this.method1042() ? 0 : this.field2174.field999 + ((class314)this.field2175.get(this.field2175.size() - 1)).field2983;
   }

   public int method1047() {
      return this.field2171;
   }

   public int method1048() {
      return this.method1049() / this.field2174.field999;
   }

   int method1033() {
      return this.method1042() ? 0 : this.method1039((class314)this.field2175.get(this.field2175.size() - 1), false);
   }

   public int method1034() {
      return this.field2170;
   }

   public int method1035() {
      return this.field2176;
   }

   public int method1043() {
      return this.field2177;
   }

   void method1019(int var1, int var2, boolean var3) {
      if (!this.method1042() && null != this.field2174) {
         class314 var5 = this.method1037(var1);
         int var6 = this.method1038(var1);

         for(int var7 = var1; var7 < var2; ++var7) {
            class314 var8 = (class314)this.field2175.get(var7);
            int var11;
            if (var8.field2982 == '\n') {
               int var10 = var5.field2983 + this.method1047();
               if (var3) {
                  if (var8.field2983 != var10) {
                     var11 = var10 - var8.field2983;

                     for(int var12 = var7; var12 < var2; ++var12) {
                        class314 var10000 = (class314)this.field2175.get(var12);
                        var10000.field2983 += var11;
                     }
                  }
                  break;
               }

               var8.field2983 = var10;
               boolean var9 = false;
            } else {
               var8.field2984 = var6 + var5.field2984;
               var8.field2983 = var5.field2983;
               int var18 = this.method1039(var8, false);
               if (this.field2172 && var8.field2984 + var18 > this.field2170) {
                  boolean var19 = false;
                  if (1 == this.field2176) {
                     for(var11 = var7; var11 > 0; --var11) {
                        class314 var20 = (class314)this.field2175.get(var11 - 1);
                        if (var8.field2983 != var20.field2983) {
                           break;
                        }

                        if (var20.field2982 == ' ' || var20.field2982 == '\t') {
                           class314 var13 = (class314)this.field2175.get(var11);
                           int var14 = var13.field2984;
                           int var15 = var13.field2983 + this.method1047();

                           for(int var16 = var11; var16 <= var7; ++var16) {
                              class314 var17 = (class314)this.field2175.get(var16);
                              var17.field2984 -= var14;
                              var17.field2983 = var15;
                           }

                           var19 = true;
                           break;
                        }
                     }
                  }

                  if (!var19) {
                     var8.field2984 = 0;
                     var8.field2983 += this.method1047();
                  }
               }
            }

            var5 = (class314)this.field2175.get(var7);
            var6 = this.method1039(var5, false);
         }

      }
   }

   class314 method1037(int var1) {
      if (var1 > 0 && !this.field2175.isEmpty()) {
         return var1 >= this.field2175.size() ? (class314)this.field2175.get(this.field2175.size() - 1) : (class314)this.field2175.get(var1 - 1);
      } else {
         return new class314();
      }
   }

   int method1038(int var1) {
      if (var1 > 0 && !this.field2175.isEmpty()) {
         return var1 >= this.field2175.size() ? this.method1036(this.field2175.size() - 1) : this.method1036(var1 - 1);
      } else {
         return 0;
      }
   }

   int method1036(int var1) {
      return var1 < this.field2175.size() ? this.method1039((class314)this.field2175.get(var1), false) : 0;
   }

   int method1039(class314 var1, boolean var2) {
      if (var1.field2982 == '\n') {
         return 0;
      } else if (!var2 && 0 != this.field2177) {
         return this.field2174.field1007[42];
      } else {
         int var4 = this.field2174.field1007[var1.field2982];
         if (var4 == 0) {
            return var1.field2982 == '\t' ? this.field2174.field1007[32] * 3 : this.field2174.field1007[32];
         } else {
            return var4;
         }
      }
   }
}
