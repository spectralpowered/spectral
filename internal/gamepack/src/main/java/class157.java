import java.util.List;

public class class157 {
   public static int field1636;
   static class414 field1625;
   static int[] field1637;
   static List field1643;
   boolean field1638 = true;
   class183 field1627;
   class183[] field1632 = new class183[8];
   class183[] field1641 = new class183[8];
   int field1624;
   int field1628 = 32;
   int field1630;
   int field1631;
   int field1634 = 0;
   int field1635 = 0;
   int field1639 = 0;
   int field1640 = 0;
   long field1626 = class154.method814();
   long field1629 = 0L;
   long field1633 = 0L;
   protected int[] field1642;

   public final synchronized void method821(class183 var1) {
      this.field1627 = var1;
   }

   public final synchronized void method833() {
      if (this.field1642 != null) {
         long var2 = class154.method814();

         try {
            if (0L != this.field1633) {
               if (var2 < this.field1633) {
                  return;
               }

               this.method834(this.field1630);
               this.field1633 = 0L;
               this.field1638 = true;
            }

            int var4 = this.method828();
            if (this.field1640 - var4 > this.field1634) {
               this.field1634 = this.field1640 - var4;
            }

            int var5 = this.field1624 + this.field1631;
            if (var5 + 256 > 16384) {
               var5 = 16128;
            }

            if (var5 + 256 > this.field1630) {
               this.field1630 += 1024;
               if (this.field1630 > 16384) {
                  this.field1630 = 16384;
               }

               this.method830();
               this.method834(this.field1630);
               var4 = 0;
               this.field1638 = true;
               if (var5 + 256 > this.field1630) {
                  var5 = this.field1630 - 256;
                  this.field1624 = var5 - this.field1631;
               }
            }

            while(var4 < var5) {
               this.method825(this.field1642, 256);
               this.method829();
               var4 += 256;
            }

            if (var2 > this.field1629) {
               if (!this.field1638) {
                  if (0 == this.field1634 && 0 == this.field1635) {
                     this.method830();
                     this.field1633 = var2 + 2000L;
                     return;
                  }

                  this.field1624 = Math.min(this.field1635, this.field1634);
                  this.field1635 = this.field1634;
               } else {
                  this.field1638 = false;
               }

               this.field1634 = 0;
               this.field1629 = var2 + 2000L;
            }

            this.field1640 = var4;
         } catch (Exception var7) {
            this.method830();
            this.field1633 = var2 + 2000L;
         }

         try {
            if (var2 > 500000L + this.field1626) {
               var2 = this.field1626;
            }

            while(var2 > 5000L + this.field1626) {
               this.method824(256);
               this.field1626 += (long)(256000 / field1636);
            }
         } catch (Exception var6) {
            this.field1626 = var2;
         }

      }
   }

   public final void method832() {
      this.field1638 = true;
   }

   public final synchronized void method822() {
      this.field1638 = true;

      try {
         this.method831();
      } catch (Exception var3) {
         this.method830();
         this.field1633 = class154.method814() + 2000L;
      }

   }

   public final synchronized void method823() {
      if (null != field1625) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (this == field1625.field3556[var3]) {
               field1625.field3556[var3] = null;
            }

            if (null != field1625.field3556[var3]) {
               var2 = false;
            }
         }

         if (var2) {
            class110.field1381.shutdownNow();
            class110.field1381 = null;
            field1625 = null;
         }
      }

      this.method830();
      this.field1642 = null;
   }

   final void method824(int var1) {
      this.field1639 -= var1;
      if (this.field1639 < 0) {
         this.field1639 = 0;
      }

      if (this.field1627 != null) {
         this.field1627.method959(var1);
      }

   }

   final void method825(int[] var1, int var2) {
      int var3 = var2;
      if (class126.field1464) {
         var3 = var2 << 1;
      }

      class364.method1760(var1, 0, var3);
      this.field1639 -= var2;
      if (null != this.field1627 && this.field1639 <= 0) {
         this.field1639 += field1636 >> 4;
         class231.method1160(this.field1627);
         this.method826(this.field1627, this.field1627.method954());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class183 var10;
         label103:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if (0 != (var9 & 1)) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class183 var11 = this.field1632[var7];

                  label97:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label97;
                        }

                        class203 var12 = var11.field1970;
                        if (null != var12 && var12.field2179 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field1971;
                        } else {
                           var11.field1972 = true;
                           int var13 = var11.method960();
                           var4 += var13;
                           if (null != var12) {
                              var12.field2179 += var13;
                           }

                           if (var4 >= this.field1628) {
                              break label103;
                           }

                           class183 var14 = var11.method955();
                           if (var14 != null) {
                              for(int var15 = var11.field1973; var14 != null; var14 = var11.method958()) {
                                 this.method826(var14, var15 * var14.method954() >> 8);
                              }
                           }

                           class183 var18 = var11.field1971;
                           var11.field1971 = null;
                           if (null == var10) {
                              this.field1632[var7] = var18;
                           } else {
                              var10.field1971 = var18;
                           }

                           if (null == var18) {
                              this.field1641[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class183 var16 = this.field1632[var6];
            class183[] var17 = this.field1632;
            this.field1641[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field1971;
               var16.field1971 = null;
            }
         }
      }

      if (this.field1639 < 0) {
         this.field1639 = 0;
      }

      if (this.field1627 != null) {
         this.field1627.method956(var1, 0, var2);
      }

      this.field1626 = class154.method814();
   }

   final void method826(class183 var1, int var2) {
      int var4 = var2 >> 5;
      class183 var5 = this.field1641[var4];
      if (null == var5) {
         this.field1632[var4] = var1;
      } else {
         var5.field1971 = var1;
      }

      this.field1641[var4] = var1;
      var1.field1973 = var2;
   }

   protected void method827() throws Exception {
   }

   protected void method834(int var1) throws Exception {
   }

   protected int method828() throws Exception {
      return this.field1630;
   }

   protected void method829() throws Exception {
   }

   protected void method830() {
   }

   protected void method831() throws Exception {
   }

   static void method835(int var0, String var1) {
      int var3 = class25.field180;
      int[] var4 = class25.field179;
      boolean var5 = false;
      class174 var6 = new class174(var1, class170.field1860);

      for(int var7 = 0; var7 < var3; ++var7) {
         class47 var8 = client.field551[var4[var7]];
         if (null != var8 && var8 != class89.field982 && null != var8.field401 && var8.field401.equals(var6)) {
            class81 var9;
            if (var0 == 1) {
               var9 = class189.method982(class165.field1760, client.field483.field3459);
               var9.field933.method666(0);
               var9.field933.method655(var4[var7]);
               client.field483.method1920(var9);
            } else if (var0 == 4) {
               var9 = class189.method982(class165.field1716, client.field483.field3459);
               var9.field933.method655(var4[var7]);
               var9.field933.method690(0);
               client.field483.method1920(var9);
            } else if (var0 == 6) {
               var9 = class189.method982(class165.field1735, client.field483.field3459);
               var9.field933.method690(0);
               var9.field933.method655(var4[var7]);
               client.field483.method1920(var9);
            } else if (var0 == 7) {
               var9 = class189.method982(class165.field1774, client.field483.field3459);
               var9.field933.method695(var4[var7]);
               var9.field933.method690(0);
               client.field483.method1920(var9);
            }

            var5 = true;
            break;
         }
      }

      if (!var5) {
         class237.method1197(4, "", class96.field1180 + var1);
      }

   }
}
