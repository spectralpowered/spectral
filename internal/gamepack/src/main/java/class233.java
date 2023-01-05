import java.util.List;

@ObfInfo(
   name = "ax"
)
public class class233 {
   @ObfInfo(
      owner = "ax",
      name = "m",
      desc = "I"
   )
   public static int field1985;
   @ObfInfo(
      owner = "ax",
      name = "b",
      desc = "Law;"
   )
   static class492 field1974;
   @ObfInfo(
      owner = "ax",
      name = "j",
      desc = "[I"
   )
   static int[] field1986;
   @ObfInfo(
      owner = "ax",
      name = "vd",
      desc = "Ljava/util/List;"
   )
   static List field1992;
   @ObfInfo(
      owner = "ax",
      name = "w",
      desc = "Z"
   )
   boolean field1987 = true;
   @ObfInfo(
      owner = "ax",
      name = "n",
      desc = "Laa;"
   )
   class437 field1976;
   @ObfInfo(
      owner = "ax",
      name = "ar",
      desc = "[Laa;"
   )
   class437[] field1981 = new class437[8];
   @ObfInfo(
      owner = "ax",
      name = "at",
      desc = "[Laa;"
   )
   class437[] field1990 = new class437[8];
   @ObfInfo(
      owner = "ax",
      name = "t",
      desc = "I"
   )
   int field1973;
   @ObfInfo(
      owner = "ax",
      name = "k",
      desc = "I"
   )
   int field1977 = 32;
   @ObfInfo(
      owner = "ax",
      name = "s",
      desc = "I"
   )
   int field1979;
   @ObfInfo(
      owner = "ax",
      name = "l",
      desc = "I"
   )
   int field1980;
   @ObfInfo(
      owner = "ax",
      name = "p",
      desc = "I"
   )
   int field1983 = 0;
   @ObfInfo(
      owner = "ax",
      name = "d",
      desc = "I"
   )
   int field1984 = 0;
   @ObfInfo(
      owner = "ax",
      name = "au",
      desc = "I"
   )
   int field1988 = 0;
   @ObfInfo(
      owner = "ax",
      name = "y",
      desc = "I"
   )
   int field1989 = 0;
   @ObfInfo(
      owner = "ax",
      name = "a",
      desc = "J"
   )
   long field1975 = class152.method711();
   @ObfInfo(
      owner = "ax",
      name = "z",
      desc = "J"
   )
   long field1978 = 0L;
   @ObfInfo(
      owner = "ax",
      name = "c",
      desc = "J"
   )
   long field1982 = 0L;
   @ObfInfo(
      owner = "ax",
      name = "o",
      desc = "[I"
   )
   protected int[] field1991;

   @ObfInfo(
      owner = "ax",
      name = "am",
      desc = "(Laa;I)V"
   )
   public final synchronized void method1006(class437 var1) {
      this.field1976 = var1;
   }

   @ObfInfo(
      owner = "ax",
      name = "av",
      desc = "(I)V"
   )
   public final synchronized void method1018() {
      if (this.field1991 != null) {
         long var2 = class152.method711();

         try {
            if (0L != this.field1982) {
               if (var2 < this.field1982) {
                  return;
               }

               this.method1019(this.field1979);
               this.field1982 = 0L;
               this.field1987 = true;
            }

            int var4 = this.method1013();
            if (this.field1989 - var4 > this.field1983) {
               this.field1983 = this.field1989 - var4;
            }

            int var5 = this.field1973 + this.field1980;
            if (var5 + 256 > 16384) {
               var5 = 16128;
            }

            if (var5 + 256 > this.field1979) {
               this.field1979 += 1024;
               if (this.field1979 > 16384) {
                  this.field1979 = 16384;
               }

               this.method1015();
               this.method1019(this.field1979);
               var4 = 0;
               this.field1987 = true;
               if (var5 + 256 > this.field1979) {
                  var5 = this.field1979 - 256;
                  this.field1973 = var5 - this.field1980;
               }
            }

            while(var4 < var5) {
               this.method1010(this.field1991, 256);
               this.method1014();
               var4 += 256;
            }

            if (var2 > this.field1978) {
               if (!this.field1987) {
                  if (0 == this.field1983 && 0 == this.field1984) {
                     this.method1015();
                     this.field1982 = var2 + 2000L;
                     return;
                  }

                  this.field1973 = Math.min(this.field1984, this.field1983);
                  this.field1984 = this.field1983;
               } else {
                  this.field1987 = false;
               }

               this.field1983 = 0;
               this.field1978 = var2 + 2000L;
            }

            this.field1989 = var4;
         } catch (Exception var7) {
            this.method1015();
            this.field1982 = var2 + 2000L;
         }

         try {
            if (var2 > 500000L + this.field1975) {
               var2 = this.field1975;
            }

            while(var2 > 5000L + this.field1975) {
               this.method1009(256);
               this.field1975 += (long)(256000 / field1985);
            }
         } catch (Exception var6) {
            this.field1975 = var2;
         }

      }
   }

   @ObfInfo(
      owner = "ax",
      name = "au",
      desc = "(I)V"
   )
   public final void method1017() {
      this.field1987 = true;
   }

   @ObfInfo(
      owner = "ax",
      name = "ar",
      desc = "(B)V"
   )
   public final synchronized void method1007() {
      this.field1987 = true;

      try {
         this.method1016();
      } catch (Exception var3) {
         this.method1015();
         this.field1982 = class152.method711() + 2000L;
      }

   }

   @ObfInfo(
      owner = "ax",
      name = "at",
      desc = "(I)V"
   )
   public final synchronized void method1008() {
      if (null != field1974) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (this == field1974.field4110[var3]) {
               field1974.field4110[var3] = null;
            }

            if (null != field1974.field4110[var3]) {
               var2 = false;
            }
         }

         if (var2) {
            class418.field3432.shutdownNow();
            class418.field3432 = null;
            field1974 = null;
         }
      }

      this.method1015();
      this.field1991 = null;
   }

   @ObfInfo(
      owner = "ax",
      name = "ay",
      desc = "(II)V"
   )
   final void method1009(int var1) {
      this.field1988 -= var1;
      if (this.field1988 < 0) {
         this.field1988 = 0;
      }

      if (this.field1976 != null) {
         this.field1976.method2172(var1);
      }

   }

   @ObfInfo(
      owner = "ax",
      name = "an",
      desc = "([II)V"
   )
   final void method1010(int[] var1, int var2) {
      int var3 = var2;
      if (class40.field207) {
         var3 = var2 << 1;
      }

      class165.method772(var1, 0, var3);
      this.field1988 -= var2;
      if (null != this.field1976 && this.field1988 <= 0) {
         this.field1988 += field1985 >> 4;
         class348.method1755(this.field1976);
         this.method1011(this.field1976, this.field1976.method2167());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class437 var10;
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
                  class437 var11 = this.field1981[var7];

                  label97:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label97;
                        }

                        class490 var12 = var11.field3618;
                        if (null != var12 && var12.field4081 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field3619;
                        } else {
                           var11.field3620 = true;
                           int var13 = var11.method2173();
                           var4 += var13;
                           if (null != var12) {
                              var12.field4081 += var13;
                           }

                           if (var4 >= this.field1977) {
                              break label103;
                           }

                           class437 var14 = var11.method2168();
                           if (var14 != null) {
                              for(int var15 = var11.field3621; var14 != null; var14 = var11.method2171()) {
                                 this.method1011(var14, var15 * var14.method2167() >> 8);
                              }
                           }

                           class437 var18 = var11.field3619;
                           var11.field3619 = null;
                           if (null == var10) {
                              this.field1981[var7] = var18;
                           } else {
                              var10.field3619 = var18;
                           }

                           if (null == var18) {
                              this.field1990[var7] = var10;
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
            class437 var16 = this.field1981[var6];
            class437[] var17 = this.field1981;
            this.field1990[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field3619;
               var16.field3619 = null;
            }
         }
      }

      if (this.field1988 < 0) {
         this.field1988 = 0;
      }

      if (this.field1976 != null) {
         this.field1976.method2169(var1, 0, var2);
      }

      this.field1975 = class152.method711();
   }

   @ObfInfo(
      owner = "ax",
      name = "al",
      desc = "(Laa;II)V"
   )
   final void method1011(class437 var1, int var2) {
      int var4 = var2 >> 5;
      class437 var5 = this.field1990[var4];
      if (null == var5) {
         this.field1981[var4] = var1;
      } else {
         var5.field3619 = var1;
      }

      this.field1990[var4] = var1;
      var1.field3621 = var2;
   }

   @ObfInfo(
      owner = "ax",
      name = "h",
      desc = "(I)V"
   )
   protected void method1012() throws Exception {
   }

   @ObfInfo(
      owner = "ax",
      name = "e",
      desc = "(IB)V"
   )
   protected void method1019(int var1) throws Exception {
   }

   @ObfInfo(
      owner = "ax",
      name = "v",
      desc = "(B)I"
   )
   protected int method1013() throws Exception {
      return this.field1979;
   }

   @ObfInfo(
      owner = "ax",
      name = "x",
      desc = "()V"
   )
   protected void method1014() throws Exception {
   }

   @ObfInfo(
      owner = "ax",
      name = "m",
      desc = "(B)V"
   )
   protected void method1015() {
   }

   @ObfInfo(
      owner = "ax",
      name = "q",
      desc = "(I)V"
   )
   protected void method1016() throws Exception {
   }

   @ObfInfo(
      owner = "ax",
      name = "jo",
      desc = "(ILjava/lang/String;B)V"
   )
   static void method1020(int var0, String var1) {
      int var3 = class268.field2221;
      int[] var4 = class268.field2220;
      boolean var5 = false;
      class257 var6 = new class257(var1, class63.field619);

      for(int var7 = 0; var7 < var3; ++var7) {
         class380 var8 = client.field347[var4[var7]];
         if (null != var8 && var8 != class113.field846 && null != var8.field3207 && var8.field3207.equals(var6)) {
            class299 var9;
            if (var0 == 1) {
               var9 = class480.method2370(class356.field2974, client.field279.field4042);
               var9.field2403.method544(0);
               var9.field2403.method533(var4[var7]);
               client.field279.method2389(var9);
            } else if (var0 == 4) {
               var9 = class480.method2370(class356.field2930, client.field279.field4042);
               var9.field2403.method533(var4[var7]);
               var9.field2403.method568(0);
               client.field279.method2389(var9);
            } else if (var0 == 6) {
               var9 = class480.method2370(class356.field2949, client.field279.field4042);
               var9.field2403.method568(0);
               var9.field2403.method533(var4[var7]);
               client.field279.method2389(var9);
            } else if (var0 == 7) {
               var9 = class480.method2370(class356.field2988, client.field279.field4042);
               var9.field2403.method573(var4[var7]);
               var9.field2403.method568(0);
               client.field279.method2389(var9);
            }

            var5 = true;
            break;
         }
      }

      if (!var5) {
         class164.method765(4, "", class177.field1485 + var1);
      }

   }
}
