@ObfInfo(
   name = "ly"
)
public abstract class class274 {
   @ObfInfo(
      owner = "ly",
      name = "am",
      desc = "Lrr;"
   )
   static class94 field2311 = new class94();
   @ObfInfo(
      owner = "ly",
      name = "at",
      desc = "I"
   )
   static int field2309 = 0;
   @ObfInfo(
      owner = "ly",
      name = "au",
      desc = "Z"
   )
   boolean field2307;
   @ObfInfo(
      owner = "ly",
      name = "ar",
      desc = "Z"
   )
   boolean field2308;
   @ObfInfo(
      owner = "ly",
      name = "c",
      desc = "Lrc;"
   )
   class479 field2298;
   @ObfInfo(
      owner = "ly",
      name = "as",
      desc = "[Lrc;"
   )
   class479[] field2302;
   @ObfInfo(
      owner = "ly",
      name = "s",
      desc = "I"
   )
   int field2299;
   @ObfInfo(
      owner = "ly",
      name = "l",
      desc = "[I"
   )
   int[] field2295;
   @ObfInfo(
      owner = "ly",
      name = "d",
      desc = "[I"
   )
   int[] field2296;
   @ObfInfo(
      owner = "ly",
      name = "t",
      desc = "[I"
   )
   int[] field2297;
   @ObfInfo(
      owner = "ly",
      name = "p",
      desc = "[I"
   )
   int[] field2301;
   @ObfInfo(
      owner = "ly",
      name = "y",
      desc = "[I"
   )
   int[] field2305;
   @ObfInfo(
      owner = "ly",
      name = "z",
      desc = "[[I"
   )
   int[][] field2300;
   @ObfInfo(
      owner = "ly",
      name = "w",
      desc = "[[I"
   )
   int[][] field2310;
   @ObfInfo(
      owner = "ly",
      name = "ad",
      desc = "[Ljava/lang/Object;"
   )
   Object[] field2303;
   @ObfInfo(
      owner = "ly",
      name = "ao",
      desc = "[[Ljava/lang/Object;"
   )
   Object[][] field2304;
   @ObfInfo(
      owner = "ly",
      name = "av",
      desc = "I"
   )
   public int field2306;

   @ObfInfo(
      owner = "ly",
      name = "<init>",
      desc = "(ZZ)V"
   )
   class274(boolean var1, boolean var2) {
      this.field2307 = var1;
      this.field2308 = var2;
   }

   @ObfInfo(
      owner = "ly",
      name = "af",
      desc = "([BI)V"
   )
   void method1340(byte[] var1) {
      this.field2306 = class426.method2081(var1, var1.length);
      class127 var3 = new class127(class430.method2120(var1));
      int var4 = var3.method547();
      if (var4 >= 5 && var4 <= 7) {
         if (var4 >= 6) {
            var3.method595();
         }

         int var5 = var3.method547();
         if (var4 >= 7) {
            this.field2299 = var3.method585();
         } else {
            this.field2299 = var3.method549();
         }

         int var6 = 0;
         int var7 = -1;
         this.field2295 = new int[this.field2299];
         int var8;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field2299; ++var8) {
               this.field2295[var8] = var6 += var3.method585();
               if (this.field2295[var8] > var7) {
                  var7 = this.field2295[var8];
               }
            }
         } else {
            for(var8 = 0; var8 < this.field2299; ++var8) {
               this.field2295[var8] = var6 += var3.method549();
               if (this.field2295[var8] > var7) {
                  var7 = this.field2295[var8];
               }
            }
         }

         this.field2301 = new int[var7 + 1];
         this.field2296 = new int[var7 + 1];
         this.field2305 = new int[var7 + 1];
         this.field2300 = new int[var7 + 1][];
         this.field2303 = new Object[var7 + 1];
         this.field2304 = new Object[var7 + 1][];
         if (var5 != 0) {
            this.field2297 = new int[var7 + 1];

            for(var8 = 0; var8 < this.field2299; ++var8) {
               this.field2297[this.field2295[var8]] = var3.method595();
            }

            this.field2298 = new class479(this.field2297);
         }

         for(var8 = 0; var8 < this.field2299; ++var8) {
            this.field2301[this.field2295[var8]] = var3.method595();
         }

         for(var8 = 0; var8 < this.field2299; ++var8) {
            this.field2296[this.field2295[var8]] = var3.method595();
         }

         for(var8 = 0; var8 < this.field2299; ++var8) {
            this.field2305[this.field2295[var8]] = var3.method549();
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field2299; ++var8) {
               var9 = this.field2295[var8];
               var10 = this.field2305[var9];
               var6 = 0;
               var11 = -1;
               this.field2300[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field2300[var9][var12] = var6 += var3.method585();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field2304[var9] = new Object[var11 + 1];
            }
         } else {
            for(var8 = 0; var8 < this.field2299; ++var8) {
               var9 = this.field2295[var8];
               var10 = this.field2305[var9];
               var6 = 0;
               var11 = -1;
               this.field2300[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field2300[var9][var12] = var6 += var3.method549();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field2304[var9] = new Object[var11 + 1];
            }
         }

         if (var5 != 0) {
            this.field2310 = new int[var7 + 1][];
            this.field2302 = new class479[var7 + 1];

            for(var8 = 0; var8 < this.field2299; ++var8) {
               var9 = this.field2295[var8];
               var10 = this.field2305[var9];
               this.field2310[var9] = new int[this.field2304[var9].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.field2310[var9][this.field2300[var9][var11]] = var3.method595();
               }

               this.field2302[var9] = new class479(this.field2310[var9]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "v",
      desc = "(IB)V"
   )
   void method1341(int var1) {
   }

   @ObfInfo(
      owner = "ly",
      name = "ai",
      desc = "(IIB)[B"
   )
   public byte[] method1365(int var1, int var2) {
      return this.method1342(var1, var2, (int[])null);
   }

   @ObfInfo(
      owner = "ly",
      name = "ax",
      desc = "(II[II)[B"
   )
   public byte[] method1342(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field2304.length && null != this.field2304[var1] && var2 >= 0 && var2 < this.field2304[var1].length) {
         if (this.field2304[var1][var2] == null) {
            boolean var5 = this.method1355(var1, var3);
            if (!var5) {
               this.method1350(var1);
               var5 = this.method1355(var1, var3);
               if (!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = class298.method1445(this.field2304[var1][var2], false);
         if (this.field2308) {
            this.field2304[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "ah",
      desc = "(IIB)Z"
   )
   public boolean method1363(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field2304.length && null != this.field2304[var1] && var2 >= 0 && var2 < this.field2304[var1].length) {
         if (null != this.field2304[var1][var2]) {
            return true;
         } else if (this.field2303[var1] != null) {
            return true;
         } else {
            this.method1350(var1);
            return this.field2303[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "aw",
      desc = "(II)Z"
   )
   public boolean method1361(int var1) {
      if (1 == this.field2304.length) {
         return this.method1363(0, var1);
      } else if (this.field2304[var1].length == 1) {
         return this.method1363(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "aj",
      desc = "(II)Z"
   )
   public boolean method1344(int var1) {
      if (null != this.field2303[var1]) {
         return true;
      } else {
         this.method1350(var1);
         return this.field2303[var1] != null;
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "aq",
      desc = "(I)Z"
   )
   public boolean method1345() {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.field2295.length; ++var3) {
         int var4 = this.field2295[var3];
         if (null == this.field2303[var4]) {
            this.method1350(var4);
            if (this.field2303[var4] == null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   @ObfInfo(
      owner = "ly",
      name = "b",
      desc = "(II)I"
   )
   int method1346(int var1) {
      return null != this.field2303[var1] ? 100 : 0;
   }

   @ObfInfo(
      owner = "ly",
      name = "ap",
      desc = "(II)[B"
   )
   public byte[] method1347(int var1) {
      if (this.field2304.length == 1) {
         return this.method1365(0, var1);
      } else if (this.field2304[var1].length == 1) {
         return this.method1365(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "aa",
      desc = "(III)[B"
   )
   public byte[] method1348(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field2304.length && null != this.field2304[var1] && var2 >= 0 && var2 < this.field2304[var1].length) {
         if (this.field2304[var1][var2] == null) {
            boolean var4 = this.method1355(var1, (int[])null);
            if (!var4) {
               this.method1350(var1);
               var4 = this.method1355(var1, (int[])null);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class298.method1445(this.field2304[var1][var2], false);
         return var5;
      } else {
         return null;
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "ae",
      desc = "(IB)[B"
   )
   public byte[] method1349(int var1) {
      if (this.field2304.length == 1) {
         return this.method1348(0, var1);
      } else if (this.field2304[var1].length == 1) {
         return this.method1348(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "x",
      desc = "(IB)V"
   )
   void method1350(int var1) {
   }

   @ObfInfo(
      owner = "ly",
      name = "ac",
      desc = "(II)[I"
   )
   public int[] method1351(int var1) {
      return var1 >= 0 && var1 < this.field2300.length ? this.field2300[var1] : null;
   }

   @ObfInfo(
      owner = "ly",
      name = "bh",
      desc = "(IB)I"
   )
   public int method1360(int var1) {
      return this.field2304[var1].length;
   }

   @ObfInfo(
      owner = "ly",
      name = "by",
      desc = "(I)I"
   )
   public int method1353() {
      return this.field2304.length;
   }

   @ObfInfo(
      owner = "ly",
      name = "bw",
      desc = "(B)V"
   )
   public void method1352() {
      for(int var2 = 0; var2 < this.field2303.length; ++var2) {
         this.field2303[var2] = null;
      }

   }

   @ObfInfo(
      owner = "ly",
      name = "bp",
      desc = "(IB)V"
   )
   public void method1354(int var1) {
      for(int var3 = 0; var3 < this.field2304[var1].length; ++var3) {
         this.field2304[var1][var3] = null;
      }

   }

   @ObfInfo(
      owner = "ly",
      name = "bc",
      desc = "(I)V"
   )
   public void method1366() {
      for(int var2 = 0; var2 < this.field2304.length; ++var2) {
         if (null != this.field2304[var2]) {
            for(int var3 = 0; var3 < this.field2304[var2].length; ++var3) {
               this.field2304[var2][var3] = null;
            }
         }
      }

   }

   @ObfInfo(
      owner = "ly",
      name = "bl",
      desc = "(I[IB)Z"
   )
   boolean method1355(int var1, int[] var2) {
      if (null == this.field2303[var1]) {
         return false;
      } else {
         int var4 = this.field2305[var1];
         int[] var5 = this.field2300[var1];
         Object[] var6 = this.field2304[var1];
         boolean var7 = true;

         for(int var8 = 0; var8 < var4; ++var8) {
            if (var6[var5[var8]] == null) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            return true;
         } else {
            byte[] var22;
            if (null == var2 || 0 == var2[0] && 0 == var2[1] && 0 == var2[2] && 0 == var2[3]) {
               var22 = class298.method1445(this.field2303[var1], false);
            } else {
               var22 = class298.method1445(this.field2303[var1], true);
               class127 var9 = new class127(var22);
               var9.method597(var2, 5, var9.field1072.length);
            }

            byte[] var23 = class430.method2120(var22);
            if (this.field2307) {
               this.field2303[var1] = null;
            }

            int var11;
            if (var4 > 1) {
               int var10 = var23.length;
               --var10;
               var11 = var23[var10] & 255;
               var10 -= var11 * var4 * 4;
               class127 var12 = new class127(var23);
               int[] var13 = new int[var4];
               var12.field1070 = var10;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.method595();
                     var13[var16] += var15;
                  }
               }

               byte[][] var26 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var26[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.field1070 = var10;
               var15 = 0;

               int var18;
               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.method595();
                     System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < var4; ++var16) {
                  if (!this.field2308) {
                     var18 = var5[var16];
                     byte[] var20 = var26[var16];
                     Object var19;
                     if (var20 == null) {
                        var19 = null;
                     } else if (var20.length > 136) {
                        class47 var21 = new class47();
                        var21.method261(var20);
                        var19 = var21;
                     } else {
                        var19 = var20;
                     }

                     var6[var18] = var19;
                  } else {
                     var6[var5[var16]] = var26[var16];
                  }
               }
            } else if (!this.field2308) {
               var11 = var5[0];
               Object var24;
               if (var23 == null) {
                  var24 = null;
               } else if (var23.length > 136) {
                  class47 var25 = new class47();
                  var25.method261(var23);
                  var24 = var25;
               } else {
                  var24 = var23;
               }

               var6[var11] = var24;
            } else {
               var6[var5[0]] = var23;
            }

            return true;
         }
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "bv",
      desc = "(Ljava/lang/String;B)I"
   )
   public int method1356(String var1) {
      var1 = var1.toLowerCase();
      return this.field2298.method2366(class25.method102(var1));
   }

   @ObfInfo(
      owner = "ly",
      name = "bx",
      desc = "(ILjava/lang/String;I)I"
   )
   public int method1359(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field2302[var1].method2366(class25.method102(var2));
   }

   @ObfInfo(
      owner = "ly",
      name = "bg",
      desc = "(Ljava/lang/String;Ljava/lang/String;S)Z"
   )
   public boolean method1362(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field2298.method2366(class25.method102(var1));
      if (var4 < 0) {
         return false;
      } else {
         int var5 = this.field2302[var4].method2366(class25.method102(var2));
         return var5 >= 0;
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "bz",
      desc = "(Ljava/lang/String;Ljava/lang/String;I)[B"
   )
   public byte[] method1357(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field2298.method2366(class25.method102(var1));
      int var5 = this.field2302[var4].method2366(class25.method102(var2));
      return this.method1365(var4, var5);
   }

   @ObfInfo(
      owner = "ly",
      name = "bi",
      desc = "(Ljava/lang/String;Ljava/lang/String;I)Z"
   )
   public boolean method1358(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field2298.method2366(class25.method102(var1));
      int var5 = this.field2302[var4].method2366(class25.method102(var2));
      return this.method1363(var4, var5);
   }

   @ObfInfo(
      owner = "ly",
      name = "br",
      desc = "(Ljava/lang/String;I)Z"
   )
   public boolean method1364(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field2298.method2366(class25.method102(var1));
      return this.method1344(var3);
   }

   @ObfInfo(
      owner = "ly",
      name = "bq",
      desc = "(Ljava/lang/String;I)V"
   )
   public void method1367(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field2298.method2366(class25.method102(var1));
      if (var3 >= 0) {
         this.method1341(var3);
      }
   }

   @ObfInfo(
      owner = "ly",
      name = "bn",
      desc = "(Ljava/lang/String;B)I"
   )
   public int method1343(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field2298.method2366(class25.method102(var1));
      return this.method1346(var3);
   }
}
