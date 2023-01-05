import java.util.ArrayList;

public class class321 {
   static class120 field2562;
   boolean field2556 = true;
   boolean field2557 = true;
   class420 field2558;
   int field2554 = Integer.MAX_VALUE;
   int field2555 = 0;
   int field2560 = 0;
   int field2561 = 0;
   ArrayList field2559 = new ArrayList();

   public class45 method1617(int var1) {
      return (class45)this.field2559.get(var1);
   }

   class45 method1618() {
      return this.field2559.size() == 0 ? null : (class45)this.field2559.get(this.field2559.size() - 1);
   }

   public boolean method1642() {
      return this.field2559.size() == 0;
   }

   public int method1620() {
      return this.field2559.size();
   }

   public String method1640() {
      if (this.method1642()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method1620());

         for(int var3 = 0; var3 < this.method1620(); ++var3) {
            class45 var4 = this.method1617(var3);
            var2.append(var4.field544);
         }

         return var2.toString();
      }
   }

   public void method1621(int var1, boolean var2) {
      if (null != this.field2558 && var1 < this.field2558.field3442 * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (this.field2554 != var1 || var2 != this.field2556) {
         this.field2554 = var1;
         this.field2556 = var2;
         this.method1619(0, this.field2559.size(), false);
      }

   }

   public void method1622(int var1) {
      if (this.field2561 != var1) {
         this.field2561 = var1;
         this.method1619(0, this.field2559.size(), false);
      }

   }

   public void method1644(class420 var1) {
      if (var1 != this.field2558) {
         this.field2558 = var1;
         if (null != this.field2558) {
            if (this.field2555 == 0) {
               this.field2555 = this.field2558.field3442;
            }

            if (!this.method1642()) {
               this.method1619(0, this.field2559.size(), false);
            }
         }
      }

   }

   public void method1646(int var1) {
      if (this.field2560 != var1) {
         this.field2560 = var1;
         this.method1619(0, this.field2559.size(), false);
      }

   }

   public void method1645(int var1) {
      if (var1 != this.field2555) {
         this.field2555 = var1;
         this.method1619(0, this.field2559.size(), false);
      }

   }

   public class239 method1641(int var1, int var2) {
      if (var2 == var1) {
         return new class239(this, 0, 0);
      } else if (var1 <= this.field2559.size() && var2 <= this.field2559.size()) {
         return var2 < var1 ? new class239(this, var2, var1) : new class239(this, var1, var2);
      } else {
         return new class239(this, 0, 0);
      }
   }

   public class77 method1624(char var1, int var2, int var3, int var4) {
      return this.method1625(Character.toString(var1), var2, var3, var4);
   }

   public class77 method1625(String var1, int var2, int var3, int var4) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      if (this.field2559.size() >= var3) {
         return new class77(var2, true);
      } else {
         this.field2559.ensureCapacity(this.field2559.size() + var1.length());
         int var6 = var2;
         int var7 = 0;
         class45 var8 = this.method1637(var2);
         int var9 = this.method1638(var2);

         int var10;
         int var11;
         for(var10 = -1; var7 < var1.length() && this.field2559.size() < var3; ++var6) {
            class45 var12 = new class45();
            var12.field544 = var1.charAt(var7++);
            if (var12.field544 == '\n') {
               var12.field545 = var8.field545 + this.method1647();
               var11 = 0;
            } else {
               var12.field546 = var9 + var8.field546;
               var12.field545 = var8.field545;
               var11 = this.method1639(var12, false);
               if (this.field2556 && var11 + var12.field546 > this.field2554) {
                  if (this.field2560 == 0) {
                     var12.field546 = 0;
                     var12.field545 += this.method1647();
                  } else if (var10 == -1) {
                     var10 = var6;
                  }
               }
            }

            var8 = var12;
            var9 = var11;
            this.field2559.add(var6, var12);
         }

         var11 = var10 == -1 ? var6 : var10;
         this.method1619(var11, this.field2559.size(), true);
         if (var4 != 0 && this.method1648() > var4) {
            while(var2 != var6) {
               --var6;
               this.method1629(var6);
               if (this.method1648() <= var4) {
                  break;
               }
            }

            return new class77(var6, true);
         } else {
            return new class77(var6, false);
         }
      }
   }

   class77 method1626(String var1, int var2, int var3) {
      return this.method1625(var1, this.field2559.size(), var2, var3);
   }

   public class77 method1627(String var1) {
      this.method1628();
      return this.method1626(var1, 0, 0);
   }

   void method1628() {
      this.field2559.clear();
   }

   public int method1629(int var1) {
      return this.method1623(var1, var1 + 1);
   }

   public int method1623(int var1, int var2) {
      int var4;
      if (var2 < var1) {
         var4 = var2;
         var2 = var1;
         var1 = var4;
      }

      this.field2559.subList(var1, var2).clear();
      var4 = var1;
      if (this.field2556 && 1 == this.field2560) {
         label30: {
            int var5 = var1;

            char var6;
            do {
               if (var5 <= 0) {
                  break label30;
               }

               --var5;
               var6 = ((class45)this.field2559.get(var5)).field544;
            } while(var6 != ' ' && var6 != '\t');

            var4 = var5;
         }
      }

      this.method1619(var4, this.field2559.size(), true);
      return var1;
   }

   public int method1630(int var1, int var2) {
      if (null != this.field2558 && var1 >= 0 && var2 >= 0) {
         if (this.field2556 && var1 > this.field2554) {
            return this.field2559.size();
         } else {
            if (!this.field2559.isEmpty()) {
               for(int var4 = 0; var4 < this.field2559.size(); ++var4) {
                  class45 var5 = (class45)this.field2559.get(var4);
                  if (var2 <= var5.field545 + this.method1647()) {
                     if (var2 < var5.field545) {
                        break;
                     }

                     if (var1 < var5.field546) {
                        return var4 > 0 ? var4 - 1 : 0;
                     }

                     if (var4 + 1 != this.field2559.size() && ((class45)this.field2559.get(var4 + 1)).field545 != var5.field545) {
                        int var6 = this.method1639((class45)this.field2559.get(var4), false);
                        if (var1 < var5.field546 + var6) {
                           return var4;
                        }

                        if (var2 <= var5.field545 + this.method1647()) {
                           return var4 + 1;
                        }
                     }
                  }
               }

               class45 var7 = (class45)this.field2559.get(this.field2559.size() - 1);
               if (var1 >= var7.field546 && var1 <= var7.field546 + this.method1633() && var2 >= var7.field545 && var2 <= var7.field545 + this.method1647()) {
                  return this.field2559.size() - 1;
               }
            }

            return this.field2559.size();
         }
      } else {
         return 0;
      }
   }

   public int method1631(int var1, int var2) {
      if (null != this.field2558 && !this.method1642() && var1 <= this.field2559.size()) {
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
            class45 var7 = (class45)this.field2559.get(var1 - 1);
            var5 = var7.field546 + this.method1636(var1 - 1);
            var6 = var7.field545;
         } else if (var4 == -1 && var1 == 0) {
            return 0;
         }

         int var15 = 16777215;
         int var8 = 0;
         int var9 = var1;
         int var10 = 16777215;
         int var11 = var4 == 1 ? this.field2559.size() + 1 : 0;

         for(int var12 = var1 + var4; var12 != var11; var12 += var4) {
            class45 var13 = (class45)this.field2559.get(var12 - 1);
            if (var13.field545 != var6) {
               ++var8;
               var6 = var13.field545;
               if (var8 > var2) {
                  return var9;
               }
            }

            if (var8 == var2) {
               int var14 = Math.abs(var13.field546 + this.method1636(var12 - 1) - var5);
               if (var14 >= var10) {
                  return var9;
               }

               var9 = var12;
               var10 = var14;
            }
         }

         if (var4 == 1) {
            return this.field2559.size();
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

   public int method1632() {
      if (!this.field2559.isEmpty() && this.method1648() == 1) {
         return this.field2559.isEmpty() ? 0 : ((class45)this.field2559.get(this.field2559.size() - 1)).field546 + this.method1633();
      } else {
         int var2 = -1;
         int var3 = 0;

         for(int var4 = this.field2559.size() - 1; var4 >= 0; --var4) {
            class45 var5 = (class45)this.field2559.get(var4);
            if (var5.field545 != var2) {
               int var6 = this.method1639(var5, false) + var5.field546;
               var3 = Math.max(var6, var3);
               var2 = var5.field545;
            }
         }

         return var3;
      }
   }

   public int method1649() {
      return this.method1642() ? 0 : this.field2558.field3442 + ((class45)this.field2559.get(this.field2559.size() - 1)).field545;
   }

   public int method1647() {
      return this.field2555;
   }

   public int method1648() {
      return this.method1649() / this.field2558.field3442;
   }

   int method1633() {
      return this.method1642() ? 0 : this.method1639((class45)this.field2559.get(this.field2559.size() - 1), false);
   }

   public int method1634() {
      return this.field2554;
   }

   public int method1635() {
      return this.field2560;
   }

   public int method1643() {
      return this.field2561;
   }

   void method1619(int var1, int var2, boolean var3) {
      if (!this.method1642() && null != this.field2558) {
         class45 var5 = this.method1637(var1);
         int var6 = this.method1638(var1);

         for(int var7 = var1; var7 < var2; ++var7) {
            class45 var8 = (class45)this.field2559.get(var7);
            int var11;
            if (var8.field544 == '\n') {
               int var10 = var5.field545 + this.method1647();
               if (var3) {
                  if (var8.field545 != var10) {
                     var11 = var10 - var8.field545;

                     for(int var12 = var7; var12 < var2; ++var12) {
                        class45 var10000 = (class45)this.field2559.get(var12);
                        var10000.field545 += var11;
                     }
                  }
                  break;
               }

               var8.field545 = var10;
               boolean var9 = false;
            } else {
               var8.field546 = var6 + var5.field546;
               var8.field545 = var5.field545;
               int var18 = this.method1639(var8, false);
               if (this.field2556 && var8.field546 + var18 > this.field2554) {
                  boolean var19 = false;
                  if (1 == this.field2560) {
                     for(var11 = var7; var11 > 0; --var11) {
                        class45 var20 = (class45)this.field2559.get(var11 - 1);
                        if (var8.field545 != var20.field545) {
                           break;
                        }

                        if (var20.field544 == ' ' || var20.field544 == '\t') {
                           class45 var13 = (class45)this.field2559.get(var11);
                           int var14 = var13.field546;
                           int var15 = var13.field545 + this.method1647();

                           for(int var16 = var11; var16 <= var7; ++var16) {
                              class45 var17 = (class45)this.field2559.get(var16);
                              var17.field546 -= var14;
                              var17.field545 = var15;
                           }

                           var19 = true;
                           break;
                        }
                     }
                  }

                  if (!var19) {
                     var8.field546 = 0;
                     var8.field545 += this.method1647();
                  }
               }
            }

            var5 = (class45)this.field2559.get(var7);
            var6 = this.method1639(var5, false);
         }

      }
   }

   class45 method1637(int var1) {
      if (var1 > 0 && !this.field2559.isEmpty()) {
         return var1 >= this.field2559.size() ? (class45)this.field2559.get(this.field2559.size() - 1) : (class45)this.field2559.get(var1 - 1);
      } else {
         return new class45();
      }
   }

   int method1638(int var1) {
      if (var1 > 0 && !this.field2559.isEmpty()) {
         return var1 >= this.field2559.size() ? this.method1636(this.field2559.size() - 1) : this.method1636(var1 - 1);
      } else {
         return 0;
      }
   }

   int method1636(int var1) {
      return var1 < this.field2559.size() ? this.method1639((class45)this.field2559.get(var1), false) : 0;
   }

   int method1639(class45 var1, boolean var2) {
      if (var1.field544 == '\n') {
         return 0;
      } else if (!var2 && 0 != this.field2561) {
         return this.field2558.field3450[42];
      } else {
         int var4 = this.field2558.field3450[var1.field544];
         if (var4 == 0) {
            return var1.field544 == '\t' ? this.field2558.field3450[32] * 3 : this.field2558.field3450[32];
         } else {
            return var4;
         }
      }
   }
}
