import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class68 {
   public static class279 field838 = new class279(37748736, 256);
   class226 field839;
   int field835;
   int field836;
   int field841;
   int field843;
   HashMap field837;
   LinkedList field840;
   List field842;
   final HashMap field844;

   class68(int var1, int var2, int var3, HashMap var4) {
      this.field836 = var1;
      this.field843 = var2;
      this.field840 = new LinkedList();
      this.field842 = new LinkedList();
      this.field837 = new HashMap();
      this.field841 = var3 | -16777216;
      this.field844 = var4;
   }

   void method353(int var1, int var2, int var3) {
      class319 var5 = class395.method1921(this.field836, this.field843, this.field835);
      if (null != var5) {
         if (var3 == this.field835 * 64) {
            var5.method1537(var1, var2);
         } else {
            var5.method1551(var1, var2, var3, var3);
         }

      }
   }

   void method354(class226 var1, List var2) {
      this.field837.clear();
      this.field839 = var1;
      this.method357(var2);
   }

   void method382(HashSet var1, List var2) {
      this.field837.clear();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         class259 var5 = (class259)var4.next();
         if (var5.method2104() == this.field836 && var5.method2106() == this.field843) {
            this.field840.add(var5);
         }
      }

      this.method357(var2);
   }

   void method355(int var1, int var2, int var3, int var4, class441 var5) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         label44:
         for(int var8 = var2; var8 < var2 + var4; ++var8) {
            for(int var9 = 0; var9 < var5.field3640; ++var9) {
               class50[] var10 = var5.field3641[var9][var7][var8];
               if (var10 != null && var10.length != 0) {
                  class50[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     class50 var13 = var11[var12];
                     class173 var14 = class212.method1110(var13.field750);
                     if (class356.method1706(var14)) {
                        this.method356(var14, var9, var7, var8, var5);
                        continue label44;
                     }
                  }
               }
            }
         }
      }

   }

   void method356(class173 var1, int var2, int var3, int var4, class441 var5) {
      class308 var7 = new class308(var2, var3 + this.field836 * 64, var4 + this.field843 * 64);
      class308 var8 = null;
      if (null != this.field839) {
         var8 = new class308(var2 + this.field839.field3647, this.field839.field3639 * 64 + var3, var4 + this.field839.field3636 * 64);
      } else {
         class259 var9 = (class259)var5;
         var8 = new class308(var9.field3647 + var2, var9.field3639 * 64 + var3 + var9.method1246() * 8, var4 + var9.field3636 * 64 + var9.method1247() * 8);
      }

      class194 var10;
      Object var11;
      if (var1.field1903 != null) {
         var11 = new class406(var8, var7, var1.field1870, this);
      } else {
         var10 = class143.method776(var1.field1891);
         var11 = new class153(var8, var7, var10.field2016, this.method386(var10));
      }

      var10 = class143.method776(((class428)var11).method2047());
      if (var10.field2023) {
         this.field837.put(new class308(0, var3, var4), var11);
      }

   }

   void method362() {
      Iterator var2 = this.field837.values().iterator();

      while(var2.hasNext()) {
         class428 var3 = (class428)var2.next();
         if (var3 instanceof class406) {
            ((class406)var3).method1981();
         }
      }

   }

   void method357(List var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class153 var4 = (class153)var3.next();
         if (class143.method776(var4.field1608).field2023 && var4.field3586.field2904 >> 6 == this.field836 && this.field843 == var4.field3586.field2905 >> 6) {
            class153 var5 = new class153(var4.field3586, var4.field3586, var4.field1608, this.method374(var4.field1608));
            this.field842.add(var5);
         }
      }

   }

   void method385() {
      if (this.field839 != null) {
         this.field839.method2105();
      } else {
         Iterator var2 = this.field840.iterator();

         while(var2.hasNext()) {
            class259 var3 = (class259)var2.next();
            var3.method2105();
         }
      }

   }

   boolean method358(class164 var1, byte var2) {
      this.field837.clear();
      if (null != this.field839) {
         if (var2 <= -1) {
            throw new IllegalStateException();
         } else {
            this.field839.method2099(var1);
            if (this.field839.method2098()) {
               if (var2 <= -1) {
                  throw new IllegalStateException();
               } else {
                  this.method355(0, 0, 64, 64, this.field839);
                  return true;
               }
            } else {
               return false;
            }
         }
      } else {
         boolean var3 = true;

         Iterator var4;
         class259 var5;
         for(var4 = this.field840.iterator(); var4.hasNext(); var3 &= var5.method2098()) {
            if (var2 <= -1) {
               throw new IllegalStateException();
            }

            var5 = (class259)var4.next();
            var5.method2099(var1);
         }

         if (var3) {
            if (var2 <= -1) {
               throw new IllegalStateException();
            }

            var4 = this.field840.iterator();

            while(var4.hasNext()) {
               if (var2 <= -1) {
                  throw new IllegalStateException();
               }

               var5 = (class259)var4.next();
               this.method355(var5.method1248() * 8, var5.method1245() * 8, 8, 8, var5);
            }
         }

         return var3;
      }
   }

   void method359(int var1, class353 var2, class161[] var3, class164 var4, class164 var5) {
      this.field835 = var1;
      if (this.field839 != null || !this.field840.isEmpty()) {
         if (class395.method1921(this.field836, this.field843, var1) == null) {
            boolean var7 = true;
            var7 &= this.method358(var4, (byte)21);
            int var9;
            if (null != this.field839) {
               var9 = this.field839.field3635;
            } else {
               var9 = ((class441)this.field840.getFirst()).field3635;
            }

            var7 &= var5.method871(var9);
            if (var7) {
               byte[] var8 = var5.method874(var9);
               class208 var10;
               if (var8 == null) {
                  var10 = new class208();
               } else {
                  var10 = new class208(class22.method119(var8).field3019);
               }

               class319 var12 = new class319(this.field835 * 64, this.field835 * 64);
               var12.method1541();
               if (null != this.field839) {
                  this.method361(var2, var3, var10);
               } else {
                  this.method378(var2, var3, var10);
               }

               class205.method1053(var12, this.field836, this.field843, this.field835);
               this.method385();
            }
         }
      }
   }

   void method360(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.method368(var1, var2, var4, var3);
      this.method372(var1, var2, var4, var3);
   }

   void method373(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field837.values().iterator();

      while(var5.hasNext()) {
         class428 var6 = (class428)var5.next();
         if (var6.method2046()) {
            int var7 = var6.method2047();
            if (var1.contains(var7)) {
               class194 var8 = class143.method776(var7);
               this.method370(var8, var6.field3585, var6.field3584, var2, var3);
            }
         }
      }

      this.method379(var1, var2, var3);
   }

   void method361(class353 var1, class161[] var2, class208 var3) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method364(var5, var6, this.field839, var1, var3);
            this.method365(var5, var6, this.field839, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method363(var5, var6, this.field839, var1, var2);
         }
      }

   }

   void method378(class353 var1, class161[] var2, class208 var3) {
      Iterator var5 = this.field840.iterator();

      class259 var6;
      int var7;
      int var8;
      while(var5.hasNext()) {
         var6 = (class259)var5.next();

         for(var7 = var6.method1248() * 8; var7 < var6.method1248() * 8 + 8; ++var7) {
            for(var8 = var6.method1245() * 8; var8 < var6.method1245() * 8 + 8; ++var8) {
               this.method364(var7, var8, var6, var1, var3);
               this.method365(var7, var8, var6, var1);
            }
         }
      }

      var5 = this.field840.iterator();

      while(var5.hasNext()) {
         var6 = (class259)var5.next();

         for(var7 = var6.method1248() * 8; var7 < var6.method1248() * 8 + 8; ++var7) {
            for(var8 = var6.method1245() * 8; var8 < var6.method1245() * 8 + 8; ++var8) {
               this.method363(var7, var8, var6, var1, var2);
            }
         }
      }

   }

   void method363(int var1, int var2, class441 var3, class353 var4, class161[] var5) {
      this.method367(var1, var2, var3);
      this.method375(var1, var2, var3, var5);
   }

   void method364(int var1, int var2, class441 var3, class353 var4, class208 var5) {
      int var7 = var3.field3644[0][var1][var2] - 1;
      int var8 = var3.field3638[0][var1][var2] - 1;
      if (var7 == -1 && var8 == -1) {
         class362.method1739(var1 * this.field835, this.field835 * (63 - var2), this.field835, this.field835, this.field841);
      }

      int var9 = 16711935;
      if (var8 != -1) {
         var9 = class150.method794(var8, this.field841);
      }

      if (var8 > -1 && 0 == var3.field3645[0][var1][var2]) {
         class362.method1739(this.field835 * var1, (63 - var2) * this.field835, this.field835, this.field835, var9);
      } else {
         int var10 = this.method366(var1, var2, var3, var5);
         if (var8 == -1) {
            class362.method1739(var1 * this.field835, this.field835 * (63 - var2), this.field835, this.field835, var10);
         } else {
            var4.method1690(this.field835 * var1, (63 - var2) * this.field835, var10, var9, this.field835, this.field835, var3.field3645[0][var1][var2], var3.field3646[0][var1][var2]);
         }
      }
   }

   void method365(int var1, int var2, class441 var3, class353 var4) {
      for(int var6 = 1; var6 < var3.field3640; ++var6) {
         int var7 = var3.field3638[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var8 = class150.method794(var7, this.field841);
            if (var3.field3645[var6][var1][var2] == 0) {
               class362.method1739(this.field835 * var1, (63 - var2) * this.field835, this.field835, this.field835, var8);
            } else {
               var4.method1690(this.field835 * var1, (63 - var2) * this.field835, 0, var8, this.field835, this.field835, var3.field3645[var6][var1][var2], var3.field3646[var6][var1][var2]);
            }
         }
      }

   }

   int method366(int var1, int var2, class441 var3, class208 var4) {
      return 0 == var3.field3644[0][var1][var2] ? this.field841 : var4.method1058(var1, var2);
   }

   void method375(int var1, int var2, class441 var3, class161[] var4) {
      for(int var6 = 0; var6 < var3.field3640; ++var6) {
         class50[] var7 = var3.field3641[var6][var1][var2];
         if (var7 != null && var7.length != 0) {
            class50[] var8 = var7;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class50 var10 = var8[var9];
               int var12 = var10.field749;
               boolean var11 = var12 >= class366.field3273.field3276 && var12 <= class366.field3274.field3276;
               if (var11 || class374.method1787(var10.field749)) {
                  class173 var13 = class212.method1110(var10.field750);
                  if (-1 != var13.field1883) {
                     if (46 != var13.field1883 && var13.field1883 != 52) {
                        var4[var13.field1883].method854(var1 * this.field835, this.field835 * (63 - var2), this.field835 * 2, this.field835 * 2);
                     } else {
                        var4[var13.field1883].method854(this.field835 * var1, (63 - var2) * this.field835, this.field835 * 2 + 1, this.field835 * 2 + 1);
                     }
                  }
               }
            }
         }
      }

   }

   void method367(int var1, int var2, class441 var3) {
      for(int var5 = 0; var5 < var3.field3640; ++var5) {
         class50[] var6 = var3.field3641[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            class50[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class50 var9 = var7[var8];
               int var11 = var9.field749;
               boolean var10 = var11 >= class366.field3254.field3276 && var11 <= class366.field3262.field3276 || var11 == class366.field3268.field3276;
               if (var10) {
                  class173 var12 = class212.method1110(var9.field750);
                  int var13 = var12.field1882 != 0 ? -3407872 : -3355444;
                  if (class366.field3254.field3276 == var9.field749) {
                     this.method377(var1, var2, var9.field748, var13);
                  }

                  if (var9.field749 == class366.field3256.field3276) {
                     this.method377(var1, var2, var9.field748, -3355444);
                     this.method377(var1, var2, 1 + var9.field748, var13);
                  }

                  if (class366.field3262.field3276 == var9.field749) {
                     if (0 == var9.field748) {
                        class362.method1742(this.field835 * var1, (63 - var2) * this.field835, 1, var13);
                     }

                     if (var9.field748 == 1) {
                        class362.method1742(var1 * this.field835 + this.field835 - 1, this.field835 * (63 - var2), 1, var13);
                     }

                     if (2 == var9.field748) {
                        class362.method1742(this.field835 + var1 * this.field835 - 1, this.field835 + (63 - var2) * this.field835 - 1, 1, var13);
                     }

                     if (var9.field748 == 3) {
                        class362.method1742(var1 * this.field835, this.field835 * (63 - var2) + this.field835 - 1, 1, var13);
                     }
                  }

                  if (var9.field749 == class366.field3268.field3276) {
                     int var14 = var9.field748 % 2;
                     int var15;
                     if (var14 == 0) {
                        for(var15 = 0; var15 < this.field835; ++var15) {
                           class362.method1742(var15 + this.field835 * var1, (64 - var2) * this.field835 - 1 - var15, 1, var13);
                        }
                     } else {
                        for(var15 = 0; var15 < this.field835; ++var15) {
                           class362.method1742(var15 + var1 * this.field835, var15 + (63 - var2) * this.field835, 1, var13);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method368(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      float var7 = var6 / 2.0F;
      Iterator var8 = this.field837.entrySet().iterator();

      while(var8.hasNext()) {
         Entry var9 = (Entry)var8.next();
         class308 var10 = (class308)var9.getKey();
         int var11 = (int)((float)var10.field2904 * var6 + (float)var1 - var7);
         int var12 = (int)((float)(var2 + var4) - var6 * (float)var10.field2905 - var7);
         class428 var13 = (class428)var9.getValue();
         if (var13 != null && var13.method2046()) {
            var13.field3585 = var11;
            var13.field3584 = var12;
            class194 var14 = class143.method776(var13.method2047());
            if (!var3.contains(var14.method1000())) {
               this.method381(var13, var11, var12, var6);
            }
         }
      }

   }

   void method379(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field842.iterator();

      while(var5.hasNext()) {
         class428 var6 = (class428)var5.next();
         if (var6.method2046()) {
            class194 var7 = class143.method776(var6.method2047());
            if (var7 != null && var1.contains(var7.method1000())) {
               this.method370(var7, var6.field3585, var6.field3584, var2, var3);
            }
         }
      }

   }

   void method370(class194 var1, int var2, int var3, int var4, int var5) {
      class319 var7 = var1.method998(false);
      if (null != var7) {
         var7.method1548(var2 - var7.field3014 / 2, var3 - var7.field3013 / 2);
         if (var4 % var5 < var5 / 2) {
            class362.method1730(var2, var3, 15, 16776960, 128);
            class362.method1730(var2, var3, 7, 16777215, 256);
         }

      }
   }

   void method381(class428 var1, int var2, int var3, float var4) {
      class194 var6 = class143.method776(var1.method2047());
      this.method384(var6, var2, var3);
      this.method371(var1, var6, var2, var3, var4);
   }

   void method384(class194 var1, int var2, int var3) {
      class319 var5 = var1.method998(false);
      if (null != var5) {
         int var6 = this.method383(var5, var1.field2018);
         int var7 = this.method369(var5, var1.field2032);
         var5.method1548(var6 + var2, var7 + var3);
      }

   }

   void method371(class428 var1, class194 var2, int var3, int var4, float var5) {
      class133 var7 = var1.method2048();
      if (null != var7) {
         if (var7.field1484.method8(var5)) {
            class394 var8 = (class394)this.field844.get(var7.field1484);
            var8.method521(var7.field1483, var3 - var7.field1482 / 2, var4, var7.field1482, var7.field1481, -16777216 | var2.field2033, 0, 1, 0, var8.field999 / 2);
         }
      }
   }

   void method372(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      Iterator var7 = this.field842.iterator();

      while(var7.hasNext()) {
         class428 var8 = (class428)var7.next();
         if (var8.method2046()) {
            int var9 = var8.field3586.field2904 % 64;
            int var10 = var8.field3586.field2905 % 64;
            var8.field3585 = (int)((float)var1 + var6 * (float)var9);
            var8.field3584 = (int)((float)(63 - var10) * var6 + (float)var2);
            if (!var3.contains(var8.method2047())) {
               this.method381(var8, var8.field3585, var8.field3584, var6);
            }
         }
      }

   }

   int method383(class319 var1, class383 var2) {
      switch(var2.field3331) {
      case 1:
         return -var1.field3014 / 2;
      case 2:
         return 0;
      default:
         return -var1.field3014;
      }
   }

   int method369(class319 var1, class205 var2) {
      switch(var2.field2186) {
      case 0:
         return 0;
      case 2:
         return -var1.field3013 / 2;
      default:
         return -var1.field3013;
      }
   }

   class133 method374(int var1) {
      class194 var3 = class143.method776(var1);
      return this.method386(var3);
   }

   class133 method386(class194 var1) {
      if (var1.field2019 != null && this.field844 != null && this.field844.get(class2.field9) != null) {
         int var4 = var1.field2022;
         class2[] var5 = class2.method5();
         int var6 = 0;

         class2 var3;
         while(true) {
            if (var6 >= var5.length) {
               var3 = null;
               break;
            }

            class2 var7 = var5[var6];
            if (var4 == var7.field11) {
               var3 = var7;
               break;
            }

            ++var6;
         }

         if (null == var3) {
            return null;
         } else {
            class394 var15 = (class394)this.field844.get(var3);
            if (var15 == null) {
               return null;
            } else {
               int var16 = var15.method517(var1.field2019, 1000000);
               String[] var8 = new String[var16];
               var15.method515(var1.field2019, (int[])null, var8);
               int var9 = var8.length * var15.field999 / 2;
               int var10 = 0;
               String[] var11 = var8;

               for(int var12 = 0; var12 < var11.length; ++var12) {
                  String var13 = var11[var12];
                  int var14 = var15.method538(var13);
                  if (var14 > var10) {
                     var10 = var14;
                  }
               }

               return new class133(var1.field2019, var10, var9, var3);
            }
         }
      } else {
         return null;
      }
   }

   List method380(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var7 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var2 + var3) {
            Iterator var8 = this.field837.values().iterator();

            class428 var9;
            while(var8.hasNext()) {
               var9 = (class428)var8.next();
               if (var9.method2046() && var9.method2042(var4, var5)) {
                  var7.add(var9);
               }
            }

            var8 = this.field842.iterator();

            while(var8.hasNext()) {
               var9 = (class428)var8.next();
               if (var9.method2046() && var9.method2042(var4, var5)) {
                  var7.add(var9);
               }
            }

            return var7;
         } else {
            return var7;
         }
      } else {
         return var7;
      }
   }

   List method376() {
      LinkedList var2 = new LinkedList();
      var2.addAll(this.field842);
      var2.addAll(this.field837.values());
      return var2;
   }

   void method377(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         class362.method1743(var1 * this.field835, this.field835 * (63 - var2), this.field835, var4);
      }

      if (var3 == 1) {
         class362.method1742(this.field835 * var1, this.field835 * (63 - var2), this.field835, var4);
      }

      if (var3 == 2) {
         class362.method1743(this.field835 + var1 * this.field835 - 1, (63 - var2) * this.field835, this.field835, var4);
      }

      if (var3 == 3) {
         class362.method1742(this.field835 * var1, (63 - var2) * this.field835 + this.field835 - 1, this.field835, var4);
      }

   }
}
