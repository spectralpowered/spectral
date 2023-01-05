public class class27 {
   boolean field200;
   boolean field201;
   class376 field222;
   int field205 = 0;
   int field223 = 0;
   int[] field212;
   int[] field213;
   long field202;
   long[] field215;
   long[] field221;
   public boolean field206;
   public boolean[] field203;
   public byte field207;
   public byte field208;
   public byte field209;
   public byte field211;
   public byte[] field220;
   public int field210;
   public int field216 = -1;
   public int field217 = -1;
   public int field218;
   public int[] field199;
   public String field204 = null;
   public String[] field214;
   public String[] field219;

   public class27(class134 var1) {
      this.method143(var1);
   }

   void method129(int var1) {
      if (this.field200) {
         if (this.field221 != null) {
            System.arraycopy(this.field221, 0, this.field221 = new long[var1], 0, this.field210);
         } else {
            this.field221 = new long[var1];
         }
      }

      if (this.field201) {
         if (null != this.field214) {
            System.arraycopy(this.field214, 0, this.field214 = new String[var1], 0, this.field210);
         } else {
            this.field214 = new String[var1];
         }
      }

      if (this.field220 != null) {
         System.arraycopy(this.field220, 0, this.field220 = new byte[var1], 0, this.field210);
      } else {
         this.field220 = new byte[var1];
      }

      if (this.field213 != null) {
         System.arraycopy(this.field213, 0, this.field213 = new int[var1], 0, this.field210);
      } else {
         this.field213 = new int[var1];
      }

      if (this.field199 != null) {
         System.arraycopy(this.field199, 0, this.field199 = new int[var1], 0, this.field210);
      } else {
         this.field199 = new int[var1];
      }

      if (this.field203 != null) {
         System.arraycopy(this.field203, 0, this.field203 = new boolean[var1], 0, this.field210);
      } else {
         this.field203 = new boolean[var1];
      }

   }

   void method130(int var1) {
      if (this.field200) {
         if (this.field215 != null) {
            System.arraycopy(this.field215, 0, this.field215 = new long[var1], 0, this.field218);
         } else {
            this.field215 = new long[var1];
         }
      }

      if (this.field201) {
         if (null != this.field219) {
            System.arraycopy(this.field219, 0, this.field219 = new String[var1], 0, this.field218);
         } else {
            this.field219 = new String[var1];
         }
      }

   }

   public int method128(String var1) {
      if (var1 != null && var1.length() != 0) {
         for(int var3 = 0; var3 < this.field210; ++var3) {
            if (this.field214[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int method131(int var1, int var2, int var3, byte var4) {
      int var10000;
      if (var3 == 31) {
         if (var4 <= -1) {
            throw new IllegalStateException();
         }

         var10000 = -1;
      } else {
         var10000 = (1 << var3 + 1) - 1;
      }

      int var5 = var10000;
      return (this.field213[var1] & var5) >>> var2;
   }

   public Integer method132(int var1) {
      if (null == this.field222) {
         return null;
      } else {
         class106 var3 = this.field222.method1794((long)var1);
         return var3 != null && var3 instanceof class258 ? new Integer(((class258)var3).field2645) : null;
      }
   }

   public int[] method146() {
      if (null == this.field212) {
         String[] var2 = new String[this.field210];
         this.field212 = new int[this.field210];

         for(int var3 = 0; var3 < this.field210; this.field212[var3] = var3++) {
            var2[var3] = this.field214[var3];
            if (var2[var3] != null) {
               var2[var3] = var2[var3].toLowerCase();
            }
         }

         class233.method1164(var2, this.field212);
      }

      return this.field212;
   }

   void method147(long var1, String var3, int var4) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.field200) {
         throw new RuntimeException("");
      } else if (this.field201 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field221 == null || this.field210 >= this.field221.length) || null != var3 && (this.field214 == null || this.field210 >= this.field214.length)) {
            this.method129(5 + this.field210);
         }

         if (null != this.field221) {
            this.field221[this.field210] = var1;
         }

         if (null != this.field214) {
            this.field214[this.field210] = var3;
         }

         if (this.field216 == -1) {
            this.field216 = this.field210;
            this.field220[this.field210] = 126;
         } else {
            this.field220[this.field210] = 0;
         }

         this.field213[this.field210] = 0;
         this.field199[this.field210] = var4;
         this.field203[this.field210] = false;
         ++this.field210;
         this.field212 = null;
      }
   }

   void method133(int var1) {
      if (var1 >= 0 && var1 < this.field210) {
         --this.field210;
         this.field212 = null;
         if (0 == this.field210) {
            this.field221 = null;
            this.field214 = null;
            this.field220 = null;
            this.field213 = null;
            this.field199 = null;
            this.field203 = null;
            this.field216 = -1;
            this.field217 = -1;
         } else {
            System.arraycopy(this.field220, var1 + 1, this.field220, var1, this.field210 - var1);
            System.arraycopy(this.field213, var1 + 1, this.field213, var1, this.field210 - var1);
            System.arraycopy(this.field199, var1 + 1, this.field199, var1, this.field210 - var1);
            System.arraycopy(this.field203, var1 + 1, this.field203, var1, this.field210 - var1);
            if (this.field221 != null) {
               System.arraycopy(this.field221, var1 + 1, this.field221, var1, this.field210 - var1);
            }

            if (null != this.field214) {
               System.arraycopy(this.field214, var1 + 1, this.field214, var1, this.field210 - var1);
            }

            this.method134();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method134() {
      if (0 == this.field210) {
         this.field216 = -1;
         this.field217 = -1;
      } else {
         this.field216 = -1;
         this.field217 = -1;
         int var2 = 0;
         byte var3 = this.field220[0];

         for(int var4 = 1; var4 < this.field210; ++var4) {
            if (this.field220[var4] > var3) {
               if (var3 == 125) {
                  this.field217 = var2;
               }

               var2 = var4;
               var3 = this.field220[var4];
            } else if (-1 == this.field217 && this.field220[var4] == 125) {
               this.field217 = var4;
            }
         }

         this.field216 = var2;
         if (-1 != this.field216) {
            this.field220[this.field216] = 126;
         }

      }
   }

   void method135(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.field200) {
         throw new RuntimeException("");
      } else if (this.field201 != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field215 == null || this.field218 >= this.field215.length) || var3 != null && (null == this.field219 || this.field218 >= this.field219.length)) {
            this.method130(5 + this.field218);
         }

         if (null != this.field215) {
            this.field215[this.field218] = var1;
         }

         if (this.field219 != null) {
            this.field219[this.field218] = var3;
         }

         ++this.field218;
      }
   }

   void method145(int var1) {
      --this.field218;
      if (this.field218 == 0) {
         this.field215 = null;
         this.field219 = null;
      } else {
         if (this.field215 != null) {
            System.arraycopy(this.field215, var1 + 1, this.field215, var1, this.field218 - var1);
         }

         if (null != this.field219) {
            System.arraycopy(this.field219, var1 + 1, this.field219, var1, this.field218 - var1);
         }
      }

   }

   int method136(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (this.field216 != var1 || this.field217 != -1 && this.field220[this.field217] >= 125) {
            if (var2 == this.field220[var1]) {
               return -1;
            } else {
               this.field220[var1] = var2;
               this.method134();
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   boolean method137(int var1) {
      if (var1 != this.field216 && 126 != this.field220[var1]) {
         this.field220[this.field216] = 125;
         this.field217 = this.field216;
         this.field220[var1] = 126;
         this.field216 = var1;
         return true;
      } else {
         return false;
      }
   }

   int method144(int var1, boolean var2) {
      if (var2 == this.field203[var1]) {
         return -1;
      } else {
         this.field203[var1] = var2;
         return var1;
      }
   }

   int method138(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.field213[var1];
      if (var2 == (var9 & var8)) {
         return -1;
      } else {
         var9 &= ~var8;
         this.field213[var1] = var9 | var2;
         return var1;
      }
   }

   boolean method139(int var1, int var2) {
      if (this.field222 != null) {
         class106 var4 = this.field222.method1794((long)var1);
         if (var4 != null) {
            if (var4 instanceof class258) {
               class258 var5 = (class258)var4;
               if (var5.field2645 == var2) {
                  return false;
               }

               var5.field2645 = var2;
               return true;
            }

            var4.method567();
         }
      } else {
         this.field222 = new class376(4);
      }

      this.field222.method1793(new class258(var2), (long)var1);
      return true;
   }

   boolean method140(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if (null != this.field222) {
         class106 var9 = this.field222.method1794((long)var1);
         if (var9 != null) {
            if (var9 instanceof class258) {
               class258 var10 = (class258)var9;
               if (var2 == (var10.field2645 & var8)) {
                  return false;
               }

               var10.field2645 &= ~var8;
               var10.field2645 |= var2;
               return true;
            }

            var9.method567();
         }
      } else {
         this.field222 = new class376(4);
      }

      this.field222.method1793(new class258(var2), (long)var1);
      return true;
   }

   boolean method141(int var1, long var2) {
      if (null != this.field222) {
         class106 var4 = this.field222.method1794((long)var1);
         if (null != var4) {
            if (var4 instanceof class60) {
               class60 var5 = (class60)var4;
               if (var2 == var5.field818) {
                  return false;
               }

               var5.field818 = var2;
               return true;
            }

            var4.method567();
         }
      } else {
         this.field222 = new class376(4);
      }

      this.field222.method1793(new class60(var2), (long)var1);
      return true;
   }

   boolean method142(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.field222 != null) {
         class106 var4 = this.field222.method1794((long)var1);
         if (null != var4) {
            if (var4 instanceof class232) {
               class232 var5 = (class232)var4;
               if (var5.field2518 instanceof String) {
                  if (var2.equals(var5.field2518)) {
                     return false;
                  }

                  var5.method567();
                  this.field222.method1793(new class232(var2), var5.field1361);
                  return true;
               }
            }

            var4.method567();
         }
      } else {
         this.field222 = new class376(4);
      }

      this.field222.method1793(new class232(var2), (long)var1);
      return true;
   }

   void method143(class134 var1) {
      int var3 = var1.method669();
      if (var3 >= 1 && var3 <= 6) {
         int var4 = var1.method669();
         if ((var4 & 1) != 0) {
            this.field200 = true;
         }

         if ((var4 & 2) != 0) {
            this.field201 = true;
         }

         if (!this.field200) {
            this.field221 = null;
            this.field215 = null;
         }

         if (!this.field201) {
            this.field214 = null;
            this.field219 = null;
         }

         this.field223 = var1.method717();
         this.field205 = var1.method717();
         if (var3 <= 3 && 0 != this.field205) {
            this.field205 += 16912800;
         }

         this.field210 = var1.method671();
         this.field218 = var1.method669();
         this.field204 = var1.method677();
         if (var3 >= 4) {
            var1.method717();
         }

         this.field206 = var1.method669() == 1;
         this.field207 = var1.method670();
         this.field208 = var1.method670();
         this.field211 = var1.method670();
         this.field209 = var1.method670();
         int var5;
         if (this.field210 > 0) {
            if (this.field200 && (this.field221 == null || this.field221.length < this.field210)) {
               this.field221 = new long[this.field210];
            }

            if (this.field201 && (this.field214 == null || this.field214.length < this.field210)) {
               this.field214 = new String[this.field210];
            }

            if (null == this.field220 || this.field220.length < this.field210) {
               this.field220 = new byte[this.field210];
            }

            if (null == this.field213 || this.field213.length < this.field210) {
               this.field213 = new int[this.field210];
            }

            if (this.field199 == null || this.field199.length < this.field210) {
               this.field199 = new int[this.field210];
            }

            if (null == this.field203 || this.field203.length < this.field210) {
               this.field203 = new boolean[this.field210];
            }

            for(var5 = 0; var5 < this.field210; ++var5) {
               if (this.field200) {
                  this.field221[var5] = var1.method720();
               }

               if (this.field201) {
                  this.field214[var5] = var1.method676();
               }

               this.field220[var5] = var1.method670();
               if (var3 >= 2) {
                  this.field213[var5] = var1.method717();
               }

               if (var3 >= 5) {
                  this.field199[var5] = var1.method671();
               } else {
                  this.field199[var5] = 0;
               }

               if (var3 >= 6) {
                  this.field203[var5] = var1.method669() == 1;
               } else {
                  this.field203[var5] = false;
               }
            }

            this.method134();
         }

         if (this.field218 > 0) {
            if (this.field200 && (this.field215 == null || this.field215.length < this.field218)) {
               this.field215 = new long[this.field218];
            }

            if (this.field201 && (null == this.field219 || this.field219.length < this.field218)) {
               this.field219 = new String[this.field218];
            }

            for(var5 = 0; var5 < this.field218; ++var5) {
               if (this.field200) {
                  this.field215[var5] = var1.method720();
               }

               if (this.field201) {
                  this.field219[var5] = var1.method676();
               }
            }
         }

         if (var3 >= 3) {
            var5 = var1.method671();
            if (var5 > 0) {
               this.field222 = new class376(var5 < 16 ? class476.method2306(var5) : 16);

               while(var5-- > 0) {
                  int var6 = var1.method717();
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if (var8 == 0) {
                     int var9 = var1.method717();
                     this.field222.method1793(new class258(var9), (long)var7);
                  } else if (var8 == 1) {
                     long var11 = var1.method720();
                     this.field222.method1793(new class60(var11), (long)var7);
                  } else if (var8 == 2) {
                     String var12 = var1.method677();
                     this.field222.method1793(new class232(var12), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }

   public static class192 method148(int var0) {
      class192 var2 = (class192)class192.field1995.method161((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class192.field1994.method892(13, var0);
         var2 = new class192();
         var2.field2006 = var0;
         if (var3 != null) {
            var2.method989(new class134(var3));
         }

         class192.field1995.method163(var2, (long)var0);
         return var2;
      }
   }
}
