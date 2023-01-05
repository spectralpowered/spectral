public abstract class class164 {
   static class409 field1715 = new class409();
   static int field1713 = 0;
   boolean field1711;
   boolean field1712;
   class225 field1702;
   class225[] field1706;
   int field1703;
   int[] field1699;
   int[] field1700;
   int[] field1701;
   int[] field1705;
   int[] field1709;
   int[][] field1704;
   int[][] field1714;
   Object[] field1707;
   Object[][] field1708;
   public int field1710;

   class164(boolean var1, boolean var2) {
      this.field1711 = var1;
      this.field1712 = var2;
   }

   void method867(byte[] var1) {
      this.field1710 = class92.method511(var1, var1.length);
      class134 var3 = new class134(class48.method258(var1));
      int var4 = var3.method669();
      if (var4 >= 5 && var4 <= 7) {
         if (var4 >= 6) {
            var3.method717();
         }

         int var5 = var3.method669();
         if (var4 >= 7) {
            this.field1703 = var3.method707();
         } else {
            this.field1703 = var3.method671();
         }

         int var6 = 0;
         int var7 = -1;
         this.field1699 = new int[this.field1703];
         int var8;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field1703; ++var8) {
               this.field1699[var8] = var6 += var3.method707();
               if (this.field1699[var8] > var7) {
                  var7 = this.field1699[var8];
               }
            }
         } else {
            for(var8 = 0; var8 < this.field1703; ++var8) {
               this.field1699[var8] = var6 += var3.method671();
               if (this.field1699[var8] > var7) {
                  var7 = this.field1699[var8];
               }
            }
         }

         this.field1705 = new int[var7 + 1];
         this.field1700 = new int[var7 + 1];
         this.field1709 = new int[var7 + 1];
         this.field1704 = new int[var7 + 1][];
         this.field1707 = new Object[var7 + 1];
         this.field1708 = new Object[var7 + 1][];
         if (var5 != 0) {
            this.field1701 = new int[var7 + 1];

            for(var8 = 0; var8 < this.field1703; ++var8) {
               this.field1701[this.field1699[var8]] = var3.method717();
            }

            this.field1702 = new class225(this.field1701);
         }

         for(var8 = 0; var8 < this.field1703; ++var8) {
            this.field1705[this.field1699[var8]] = var3.method717();
         }

         for(var8 = 0; var8 < this.field1703; ++var8) {
            this.field1700[this.field1699[var8]] = var3.method717();
         }

         for(var8 = 0; var8 < this.field1703; ++var8) {
            this.field1709[this.field1699[var8]] = var3.method671();
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field1703; ++var8) {
               var9 = this.field1699[var8];
               var10 = this.field1709[var9];
               var6 = 0;
               var11 = -1;
               this.field1704[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field1704[var9][var12] = var6 += var3.method707();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field1708[var9] = new Object[var11 + 1];
            }
         } else {
            for(var8 = 0; var8 < this.field1703; ++var8) {
               var9 = this.field1699[var8];
               var10 = this.field1709[var9];
               var6 = 0;
               var11 = -1;
               this.field1704[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field1704[var9][var12] = var6 += var3.method671();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field1708[var9] = new Object[var11 + 1];
            }
         }

         if (var5 != 0) {
            this.field1714 = new int[var7 + 1][];
            this.field1706 = new class225[var7 + 1];

            for(var8 = 0; var8 < this.field1703; ++var8) {
               var9 = this.field1699[var8];
               var10 = this.field1709[var9];
               this.field1714[var9] = new int[this.field1708[var9].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.field1714[var9][this.field1704[var9][var11]] = var3.method717();
               }

               this.field1706[var9] = new class225(this.field1714[var9]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method868(int var1) {
   }

   public byte[] method892(int var1, int var2) {
      return this.method869(var1, var2, (int[])null);
   }

   public byte[] method869(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field1708.length && null != this.field1708[var1] && var2 >= 0 && var2 < this.field1708[var1].length) {
         if (this.field1708[var1][var2] == null) {
            boolean var5 = this.method882(var1, var3);
            if (!var5) {
               this.method877(var1);
               var5 = this.method882(var1, var3);
               if (!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = class405.method1980(this.field1708[var1][var2], false);
         if (this.field1712) {
            this.field1708[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   public boolean method890(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field1708.length && null != this.field1708[var1] && var2 >= 0 && var2 < this.field1708[var1].length) {
         if (null != this.field1708[var1][var2]) {
            return true;
         } else if (this.field1707[var1] != null) {
            return true;
         } else {
            this.method877(var1);
            return this.field1707[var1] != null;
         }
      } else {
         return false;
      }
   }

   public boolean method888(int var1) {
      if (1 == this.field1708.length) {
         return this.method890(0, var1);
      } else if (this.field1708[var1].length == 1) {
         return this.method890(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean method871(int var1) {
      if (null != this.field1707[var1]) {
         return true;
      } else {
         this.method877(var1);
         return this.field1707[var1] != null;
      }
   }

   public boolean method872() {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.field1699.length; ++var3) {
         int var4 = this.field1699[var3];
         if (null == this.field1707[var4]) {
            this.method877(var4);
            if (this.field1707[var4] == null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   int method873(int var1) {
      return null != this.field1707[var1] ? 100 : 0;
   }

   public byte[] method874(int var1) {
      if (this.field1708.length == 1) {
         return this.method892(0, var1);
      } else if (this.field1708[var1].length == 1) {
         return this.method892(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] method875(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field1708.length && null != this.field1708[var1] && var2 >= 0 && var2 < this.field1708[var1].length) {
         if (this.field1708[var1][var2] == null) {
            boolean var4 = this.method882(var1, (int[])null);
            if (!var4) {
               this.method877(var1);
               var4 = this.method882(var1, (int[])null);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class405.method1980(this.field1708[var1][var2], false);
         return var5;
      } else {
         return null;
      }
   }

   public byte[] method876(int var1) {
      if (this.field1708.length == 1) {
         return this.method875(0, var1);
      } else if (this.field1708[var1].length == 1) {
         return this.method875(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   void method877(int var1) {
   }

   public int[] method878(int var1) {
      return var1 >= 0 && var1 < this.field1704.length ? this.field1704[var1] : null;
   }

   public int method887(int var1) {
      return this.field1708[var1].length;
   }

   public int method880() {
      return this.field1708.length;
   }

   public void method879() {
      for(int var2 = 0; var2 < this.field1707.length; ++var2) {
         this.field1707[var2] = null;
      }

   }

   public void method881(int var1) {
      for(int var3 = 0; var3 < this.field1708[var1].length; ++var3) {
         this.field1708[var1][var3] = null;
      }

   }

   public void method893() {
      for(int var2 = 0; var2 < this.field1708.length; ++var2) {
         if (null != this.field1708[var2]) {
            for(int var3 = 0; var3 < this.field1708[var2].length; ++var3) {
               this.field1708[var2][var3] = null;
            }
         }
      }

   }

   boolean method882(int var1, int[] var2) {
      if (null == this.field1707[var1]) {
         return false;
      } else {
         int var4 = this.field1709[var1];
         int[] var5 = this.field1704[var1];
         Object[] var6 = this.field1708[var1];
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
               var22 = class405.method1980(this.field1707[var1], false);
            } else {
               var22 = class405.method1980(this.field1707[var1], true);
               class134 var9 = new class134(var22);
               var9.method719(var2, 5, var9.field1489.length);
            }

            byte[] var23 = class48.method258(var22);
            if (this.field1711) {
               this.field1707[var1] = null;
            }

            int var11;
            if (var4 > 1) {
               int var10 = var23.length;
               --var10;
               var11 = var23[var10] & 255;
               var10 -= var11 * var4 * 4;
               class134 var12 = new class134(var23);
               int[] var13 = new int[var4];
               var12.field1487 = var10;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.method717();
                     var13[var16] += var15;
                  }
               }

               byte[][] var26 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var26[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.field1487 = var10;
               var15 = 0;

               int var18;
               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.method717();
                     System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < var4; ++var16) {
                  if (!this.field1712) {
                     var18 = var5[var16];
                     byte[] var20 = var26[var16];
                     Object var19;
                     if (var20 == null) {
                        var19 = null;
                     } else if (var20.length > 136) {
                        class65 var21 = new class65();
                        var21.method2096(var20);
                        var19 = var21;
                     } else {
                        var19 = var20;
                     }

                     var6[var18] = var19;
                  } else {
                     var6[var5[var16]] = var26[var16];
                  }
               }
            } else if (!this.field1712) {
               var11 = var5[0];
               Object var24;
               if (var23 == null) {
                  var24 = null;
               } else if (var23.length > 136) {
                  class65 var25 = new class65();
                  var25.method2096(var23);
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

   public int method883(String var1) {
      var1 = var1.toLowerCase();
      return this.field1702.method1142(class143.method778(var1));
   }

   public int method886(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field1706[var1].method1142(class143.method778(var2));
   }

   public boolean method889(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field1702.method1142(class143.method778(var1));
      if (var4 < 0) {
         return false;
      } else {
         int var5 = this.field1706[var4].method1142(class143.method778(var2));
         return var5 >= 0;
      }
   }

   public byte[] method884(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field1702.method1142(class143.method778(var1));
      int var5 = this.field1706[var4].method1142(class143.method778(var2));
      return this.method892(var4, var5);
   }

   public boolean method885(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field1702.method1142(class143.method778(var1));
      int var5 = this.field1706[var4].method1142(class143.method778(var2));
      return this.method890(var4, var5);
   }

   public boolean method891(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field1702.method1142(class143.method778(var1));
      return this.method871(var3);
   }

   public void method894(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field1702.method1142(class143.method778(var1));
      if (var3 >= 0) {
         this.method868(var3);
      }
   }

   public int method870(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field1702.method1142(class143.method778(var1));
      return this.method873(var3);
   }
}
