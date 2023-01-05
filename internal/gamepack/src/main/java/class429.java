public class class429 {
   boolean field3544;
   boolean field3545;
   class385 field3566;
   int field3549 = 0;
   int field3567 = 0;
   int[] field3556;
   int[] field3557;
   long field3546;
   long[] field3559;
   long[] field3565;
   public boolean field3550;
   public boolean[] field3547;
   public byte field3551;
   public byte field3552;
   public byte field3553;
   public byte field3555;
   public byte[] field3564;
   public int field3554;
   public int field3560 = -1;
   public int field3561 = -1;
   public int field3562;
   public int[] field3543;
   public String field3548 = null;
   public String[] field3558;
   public String[] field3563;

   public class429(class127 var1) {
      this.method2114(var1);
   }

   void method2100(int var1) {
      if (this.field3544) {
         if (this.field3565 != null) {
            System.arraycopy(this.field3565, 0, this.field3565 = new long[var1], 0, this.field3554);
         } else {
            this.field3565 = new long[var1];
         }
      }

      if (this.field3545) {
         if (null != this.field3558) {
            System.arraycopy(this.field3558, 0, this.field3558 = new String[var1], 0, this.field3554);
         } else {
            this.field3558 = new String[var1];
         }
      }

      if (this.field3564 != null) {
         System.arraycopy(this.field3564, 0, this.field3564 = new byte[var1], 0, this.field3554);
      } else {
         this.field3564 = new byte[var1];
      }

      if (this.field3557 != null) {
         System.arraycopy(this.field3557, 0, this.field3557 = new int[var1], 0, this.field3554);
      } else {
         this.field3557 = new int[var1];
      }

      if (this.field3543 != null) {
         System.arraycopy(this.field3543, 0, this.field3543 = new int[var1], 0, this.field3554);
      } else {
         this.field3543 = new int[var1];
      }

      if (this.field3547 != null) {
         System.arraycopy(this.field3547, 0, this.field3547 = new boolean[var1], 0, this.field3554);
      } else {
         this.field3547 = new boolean[var1];
      }

   }

   void method2101(int var1) {
      if (this.field3544) {
         if (this.field3559 != null) {
            System.arraycopy(this.field3559, 0, this.field3559 = new long[var1], 0, this.field3562);
         } else {
            this.field3559 = new long[var1];
         }
      }

      if (this.field3545) {
         if (null != this.field3563) {
            System.arraycopy(this.field3563, 0, this.field3563 = new String[var1], 0, this.field3562);
         } else {
            this.field3563 = new String[var1];
         }
      }

   }

   public int method2099(String var1) {
      if (var1 != null && var1.length() != 0) {
         for(int var3 = 0; var3 < this.field3554; ++var3) {
            if (this.field3558[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int method2102(int var1, int var2, int var3, byte var4) {
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
      return (this.field3557[var1] & var5) >>> var2;
   }

   public Integer method2103(int var1) {
      if (null == this.field3566) {
         return null;
      } else {
         class139 var3 = this.field3566.method1897((long)var1);
         return var3 != null && var3 instanceof class245 ? new Integer(((class245)var3).field2057) : null;
      }
   }

   public int[] method2117() {
      if (null == this.field3556) {
         String[] var2 = new String[this.field3554];
         this.field3556 = new int[this.field3554];

         for(int var3 = 0; var3 < this.field3554; this.field3556[var3] = var3++) {
            var2[var3] = this.field3558[var3];
            if (var2[var3] != null) {
               var2[var3] = var2[var3].toLowerCase();
            }
         }

         class201.method885(var2, this.field3556);
      }

      return this.field3556;
   }

   void method2118(long var1, String var3, int var4) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.field3544) {
         throw new RuntimeException("");
      } else if (this.field3545 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field3565 == null || this.field3554 >= this.field3565.length) || null != var3 && (this.field3558 == null || this.field3554 >= this.field3558.length)) {
            this.method2100(5 + this.field3554);
         }

         if (null != this.field3565) {
            this.field3565[this.field3554] = var1;
         }

         if (null != this.field3558) {
            this.field3558[this.field3554] = var3;
         }

         if (this.field3560 == -1) {
            this.field3560 = this.field3554;
            this.field3564[this.field3554] = 126;
         } else {
            this.field3564[this.field3554] = 0;
         }

         this.field3557[this.field3554] = 0;
         this.field3543[this.field3554] = var4;
         this.field3547[this.field3554] = false;
         ++this.field3554;
         this.field3556 = null;
      }
   }

   void method2104(int var1) {
      if (var1 >= 0 && var1 < this.field3554) {
         --this.field3554;
         this.field3556 = null;
         if (0 == this.field3554) {
            this.field3565 = null;
            this.field3558 = null;
            this.field3564 = null;
            this.field3557 = null;
            this.field3543 = null;
            this.field3547 = null;
            this.field3560 = -1;
            this.field3561 = -1;
         } else {
            System.arraycopy(this.field3564, var1 + 1, this.field3564, var1, this.field3554 - var1);
            System.arraycopy(this.field3557, var1 + 1, this.field3557, var1, this.field3554 - var1);
            System.arraycopy(this.field3543, var1 + 1, this.field3543, var1, this.field3554 - var1);
            System.arraycopy(this.field3547, var1 + 1, this.field3547, var1, this.field3554 - var1);
            if (this.field3565 != null) {
               System.arraycopy(this.field3565, var1 + 1, this.field3565, var1, this.field3554 - var1);
            }

            if (null != this.field3558) {
               System.arraycopy(this.field3558, var1 + 1, this.field3558, var1, this.field3554 - var1);
            }

            this.method2105();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method2105() {
      if (0 == this.field3554) {
         this.field3560 = -1;
         this.field3561 = -1;
      } else {
         this.field3560 = -1;
         this.field3561 = -1;
         int var2 = 0;
         byte var3 = this.field3564[0];

         for(int var4 = 1; var4 < this.field3554; ++var4) {
            if (this.field3564[var4] > var3) {
               if (var3 == 125) {
                  this.field3561 = var2;
               }

               var2 = var4;
               var3 = this.field3564[var4];
            } else if (-1 == this.field3561 && this.field3564[var4] == 125) {
               this.field3561 = var4;
            }
         }

         this.field3560 = var2;
         if (-1 != this.field3560) {
            this.field3564[this.field3560] = 126;
         }

      }
   }

   void method2106(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.field3544) {
         throw new RuntimeException("");
      } else if (this.field3545 != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field3559 == null || this.field3562 >= this.field3559.length) || var3 != null && (null == this.field3563 || this.field3562 >= this.field3563.length)) {
            this.method2101(5 + this.field3562);
         }

         if (null != this.field3559) {
            this.field3559[this.field3562] = var1;
         }

         if (this.field3563 != null) {
            this.field3563[this.field3562] = var3;
         }

         ++this.field3562;
      }
   }

   void method2116(int var1) {
      --this.field3562;
      if (this.field3562 == 0) {
         this.field3559 = null;
         this.field3563 = null;
      } else {
         if (this.field3559 != null) {
            System.arraycopy(this.field3559, var1 + 1, this.field3559, var1, this.field3562 - var1);
         }

         if (null != this.field3563) {
            System.arraycopy(this.field3563, var1 + 1, this.field3563, var1, this.field3562 - var1);
         }
      }

   }

   int method2107(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (this.field3560 != var1 || this.field3561 != -1 && this.field3564[this.field3561] >= 125) {
            if (var2 == this.field3564[var1]) {
               return -1;
            } else {
               this.field3564[var1] = var2;
               this.method2105();
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   boolean method2108(int var1) {
      if (var1 != this.field3560 && 126 != this.field3564[var1]) {
         this.field3564[this.field3560] = 125;
         this.field3561 = this.field3560;
         this.field3564[var1] = 126;
         this.field3560 = var1;
         return true;
      } else {
         return false;
      }
   }

   int method2115(int var1, boolean var2) {
      if (var2 == this.field3547[var1]) {
         return -1;
      } else {
         this.field3547[var1] = var2;
         return var1;
      }
   }

   int method2109(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.field3557[var1];
      if (var2 == (var9 & var8)) {
         return -1;
      } else {
         var9 &= ~var8;
         this.field3557[var1] = var9 | var2;
         return var1;
      }
   }

   boolean method2110(int var1, int var2) {
      if (this.field3566 != null) {
         class139 var4 = this.field3566.method1897((long)var1);
         if (var4 != null) {
            if (var4 instanceof class245) {
               class245 var5 = (class245)var4;
               if (var5.field2057 == var2) {
                  return false;
               }

               var5.field2057 = var2;
               return true;
            }

            var4.method637();
         }
      } else {
         this.field3566 = new class385(4);
      }

      this.field3566.method1896(new class245(var2), (long)var1);
      return true;
   }

   boolean method2111(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if (null != this.field3566) {
         class139 var9 = this.field3566.method1897((long)var1);
         if (var9 != null) {
            if (var9 instanceof class245) {
               class245 var10 = (class245)var9;
               if (var2 == (var10.field2057 & var8)) {
                  return false;
               }

               var10.field2057 &= ~var8;
               var10.field2057 |= var2;
               return true;
            }

            var9.method637();
         }
      } else {
         this.field3566 = new class385(4);
      }

      this.field3566.method1896(new class245(var2), (long)var1);
      return true;
   }

   boolean method2112(int var1, long var2) {
      if (null != this.field3566) {
         class139 var4 = this.field3566.method1897((long)var1);
         if (null != var4) {
            if (var4 instanceof class142) {
               class142 var5 = (class142)var4;
               if (var2 == var5.field1142) {
                  return false;
               }

               var5.field1142 = var2;
               return true;
            }

            var4.method637();
         }
      } else {
         this.field3566 = new class385(4);
      }

      this.field3566.method1896(new class142(var2), (long)var1);
      return true;
   }

   boolean method2113(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.field3566 != null) {
         class139 var4 = this.field3566.method1897((long)var1);
         if (null != var4) {
            if (var4 instanceof class135) {
               class135 var5 = (class135)var4;
               if (var5.field1111 instanceof String) {
                  if (var2.equals(var5.field1111)) {
                     return false;
                  }

                  var5.method637();
                  this.field3566.method1896(new class135(var2), var5.field1134);
                  return true;
               }
            }

            var4.method637();
         }
      } else {
         this.field3566 = new class385(4);
      }

      this.field3566.method1896(new class135(var2), (long)var1);
      return true;
   }

   void method2114(class127 var1) {
      int var3 = var1.method547();
      if (var3 >= 1 && var3 <= 6) {
         int var4 = var1.method547();
         if ((var4 & 1) != 0) {
            this.field3544 = true;
         }

         if ((var4 & 2) != 0) {
            this.field3545 = true;
         }

         if (!this.field3544) {
            this.field3565 = null;
            this.field3559 = null;
         }

         if (!this.field3545) {
            this.field3558 = null;
            this.field3563 = null;
         }

         this.field3567 = var1.method595();
         this.field3549 = var1.method595();
         if (var3 <= 3 && 0 != this.field3549) {
            this.field3549 += 16912800;
         }

         this.field3554 = var1.method549();
         this.field3562 = var1.method547();
         this.field3548 = var1.method555();
         if (var3 >= 4) {
            var1.method595();
         }

         this.field3550 = var1.method547() == 1;
         this.field3551 = var1.method548();
         this.field3552 = var1.method548();
         this.field3555 = var1.method548();
         this.field3553 = var1.method548();
         int var5;
         if (this.field3554 > 0) {
            if (this.field3544 && (this.field3565 == null || this.field3565.length < this.field3554)) {
               this.field3565 = new long[this.field3554];
            }

            if (this.field3545 && (this.field3558 == null || this.field3558.length < this.field3554)) {
               this.field3558 = new String[this.field3554];
            }

            if (null == this.field3564 || this.field3564.length < this.field3554) {
               this.field3564 = new byte[this.field3554];
            }

            if (null == this.field3557 || this.field3557.length < this.field3554) {
               this.field3557 = new int[this.field3554];
            }

            if (this.field3543 == null || this.field3543.length < this.field3554) {
               this.field3543 = new int[this.field3554];
            }

            if (null == this.field3547 || this.field3547.length < this.field3554) {
               this.field3547 = new boolean[this.field3554];
            }

            for(var5 = 0; var5 < this.field3554; ++var5) {
               if (this.field3544) {
                  this.field3565[var5] = var1.method598();
               }

               if (this.field3545) {
                  this.field3558[var5] = var1.method554();
               }

               this.field3564[var5] = var1.method548();
               if (var3 >= 2) {
                  this.field3557[var5] = var1.method595();
               }

               if (var3 >= 5) {
                  this.field3543[var5] = var1.method549();
               } else {
                  this.field3543[var5] = 0;
               }

               if (var3 >= 6) {
                  this.field3547[var5] = var1.method547() == 1;
               } else {
                  this.field3547[var5] = false;
               }
            }

            this.method2105();
         }

         if (this.field3562 > 0) {
            if (this.field3544 && (this.field3559 == null || this.field3559.length < this.field3562)) {
               this.field3559 = new long[this.field3562];
            }

            if (this.field3545 && (null == this.field3563 || this.field3563.length < this.field3562)) {
               this.field3563 = new String[this.field3562];
            }

            for(var5 = 0; var5 < this.field3562; ++var5) {
               if (this.field3544) {
                  this.field3559[var5] = var1.method598();
               }

               if (this.field3545) {
                  this.field3563[var5] = var1.method554();
               }
            }
         }

         if (var3 >= 3) {
            var5 = var1.method549();
            if (var5 > 0) {
               this.field3566 = new class385(var5 < 16 ? class455.method2252(var5) : 16);

               while(var5-- > 0) {
                  int var6 = var1.method595();
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if (var8 == 0) {
                     int var9 = var1.method595();
                     this.field3566.method1896(new class245(var9), (long)var7);
                  } else if (var8 == 1) {
                     long var11 = var1.method598();
                     this.field3566.method1896(new class142(var11), (long)var7);
                  } else if (var8 == 2) {
                     String var12 = var1.method555();
                     this.field3566.method1896(new class135(var12), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }

   public static class327 method2119(int var0) {
      class327 var2 = (class327)class327.field2581.method394((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class327.field2580.method1365(13, var0);
         var2 = new class327();
         var2.field2592 = var0;
         if (var3 != null) {
            var2.method1664(new class127(var3));
         }

         class327.field2581.method396(var2, (long)var0);
         return var2;
      }
   }
}
