public class class310 extends class183 {
   boolean field2919;
   int field2909;
   int field2910;
   int field2911;
   int field2912;
   int field2913;
   int field2914;
   int field2915;
   int field2916;
   int field2917;
   int field2918;
   int field2920;
   int field2921;
   int field2922;
   int field2923;

   class310(class388 var1, int var2, int var3) {
      super.field1970 = var1;
      this.field2917 = var1.field3427;
      this.field2914 = var1.field3425;
      this.field2919 = var1.field3429;
      this.field2910 = var2;
      this.field2923 = var3;
      this.field2911 = 8192;
      this.field2909 = 0;
      this.method1450();
   }

   class310(class388 var1, int var2, int var3, int var4) {
      super.field1970 = var1;
      this.field2917 = var1.field3427;
      this.field2914 = var1.field3425;
      this.field2919 = var1.field3429;
      this.field2910 = var2;
      this.field2923 = var3;
      this.field2911 = var4;
      this.field2909 = 0;
      this.method1450();
   }

   int method954() {
      int var1 = this.field2913 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field2916 == 0) {
         var1 -= var1 * this.field2909 / (((class388)super.field1970).field3426.length << 8);
      } else if (this.field2916 >= 0) {
         var1 -= var1 * this.field2917 / ((class388)super.field1970).field3426.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   void method1450() {
      this.field2913 = this.field2923;
      this.field2912 = method1479(this.field2923, this.field2911);
      this.field2915 = method1483(this.field2923, this.field2911);
   }

   public synchronized void method1451(int var1) {
      this.field2916 = var1;
   }

   public synchronized void method1452(int var1) {
      this.method1453(var1 << 6, this.method1463());
   }

   synchronized void method1485(int var1) {
      this.method1453(var1, this.method1463());
   }

   synchronized void method1453(int var1, int var2) {
      this.field2923 = var1;
      this.field2911 = var2;
      this.field2920 = 0;
      this.method1450();
   }

   public synchronized int method1480() {
      return this.field2923 == Integer.MIN_VALUE ? 0 : this.field2923;
   }

   public synchronized int method1463() {
      return this.field2911 < 0 ? -1 : this.field2911;
   }

   public synchronized void method1455(int var1) {
      int var2 = ((class388)super.field1970).field3426.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field2909 = var1;
   }

   public synchronized void method1456(boolean var1) {
      this.field2910 = (this.field2910 ^ this.field2910 >> 31) + (this.field2910 >>> 31);
      if (var1) {
         this.field2910 = -this.field2910;
      }

   }

   void method1478() {
      if (this.field2920 != 0) {
         if (this.field2923 == Integer.MIN_VALUE) {
            this.field2923 = 0;
         }

         this.field2920 = 0;
         this.method1450();
      }

   }

   public synchronized void method1457(int var1, int var2) {
      this.method1458(var1, var2, this.method1463());
   }

   public synchronized void method1458(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method1453(var2, var3);
      } else {
         int var4 = method1479(var2, var3);
         int var5 = method1483(var2, var3);
         if (this.field2912 == var4 && this.field2915 == var5) {
            this.field2920 = 0;
         } else {
            int var6 = var2 - this.field2913;
            if (this.field2913 - var2 > var6) {
               var6 = this.field2913 - var2;
            }

            if (var4 - this.field2912 > var6) {
               var6 = var4 - this.field2912;
            }

            if (this.field2912 - var4 > var6) {
               var6 = this.field2912 - var4;
            }

            if (var5 - this.field2915 > var6) {
               var6 = var5 - this.field2915;
            }

            if (this.field2915 - var5 > var6) {
               var6 = this.field2915 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field2920 = var1;
            this.field2923 = var2;
            this.field2911 = var3;
            this.field2921 = (var2 - this.field2913) / var1;
            this.field2922 = (var4 - this.field2912) / var1;
            this.field2918 = (var5 - this.field2915) / var1;
         }
      }
   }

   public synchronized void method1459(int var1) {
      if (var1 == 0) {
         this.method1485(0);
         this.method567();
      } else if (this.field2912 == 0 && this.field2915 == 0) {
         this.field2920 = 0;
         this.field2923 = 0;
         this.field2913 = 0;
         this.method567();
      } else {
         int var2 = -this.field2913;
         if (this.field2913 > var2) {
            var2 = this.field2913;
         }

         if (-this.field2912 > var2) {
            var2 = -this.field2912;
         }

         if (this.field2912 > var2) {
            var2 = this.field2912;
         }

         if (-this.field2915 > var2) {
            var2 = -this.field2915;
         }

         if (this.field2915 > var2) {
            var2 = this.field2915;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field2920 = var1;
         this.field2923 = Integer.MIN_VALUE;
         this.field2921 = -this.field2913 / var1;
         this.field2922 = -this.field2912 / var1;
         this.field2918 = -this.field2915 / var1;
      }
   }

   public synchronized void method1460(int var1) {
      if (this.field2910 < 0) {
         this.field2910 = -var1;
      } else {
         this.field2910 = var1;
      }

   }

   public synchronized int method1461() {
      return this.field2910 < 0 ? -this.field2910 : this.field2910;
   }

   public boolean method1462() {
      return this.field2909 < 0 || this.field2909 >= ((class388)super.field1970).field3426.length << 8;
   }

   public boolean method1482() {
      return this.field2920 != 0;
   }

   protected class183 method955() {
      return null;
   }

   protected class183 method958() {
      return null;
   }

   protected int method960() {
      return this.field2923 == 0 && this.field2920 == 0 ? 0 : 1;
   }

   public synchronized void method956(int[] var1, int var2, int var3) {
      if (this.field2923 == 0 && this.field2920 == 0) {
         this.method959(var3);
      } else {
         class388 var4 = (class388)super.field1970;
         int var5 = this.field2917 << 8;
         int var6 = this.field2914 << 8;
         int var7 = var4.field3426.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field2916 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field2909 < 0) {
            if (this.field2910 <= 0) {
               this.method1478();
               this.method567();
               return;
            }

            this.field2909 = 0;
         }

         if (this.field2909 >= var7) {
            if (this.field2910 >= 0) {
               this.method1478();
               this.method567();
               return;
            }

            this.field2909 = var7 - 1;
         }

         if (this.field2916 < 0) {
            if (this.field2919) {
               if (this.field2910 < 0) {
                  var9 = this.method1466(var1, var2, var5, var3, var4.field3426[this.field2917]);
                  if (this.field2909 >= var5) {
                     return;
                  }

                  this.field2909 = var5 + var5 - 1 - this.field2909;
                  this.field2910 = -this.field2910;
               }

               while(true) {
                  var9 = this.method1465(var1, var9, var6, var3, var4.field3426[this.field2914 - 1]);
                  if (this.field2909 < var6) {
                     return;
                  }

                  this.field2909 = var6 + var6 - 1 - this.field2909;
                  this.field2910 = -this.field2910;
                  var9 = this.method1466(var1, var9, var5, var3, var4.field3426[this.field2917]);
                  if (this.field2909 >= var5) {
                     return;
                  }

                  this.field2909 = var5 + var5 - 1 - this.field2909;
                  this.field2910 = -this.field2910;
               }
            } else if (this.field2910 < 0) {
               while(true) {
                  var9 = this.method1466(var1, var9, var5, var3, var4.field3426[this.field2914 - 1]);
                  if (this.field2909 >= var5) {
                     return;
                  }

                  this.field2909 = var6 - 1 - (var6 - 1 - this.field2909) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method1465(var1, var9, var6, var3, var4.field3426[this.field2917]);
                  if (this.field2909 < var6) {
                     return;
                  }

                  this.field2909 = var5 + (this.field2909 - var5) % var8;
               }
            }
         } else {
            if (this.field2916 > 0) {
               if (this.field2919) {
                  label130: {
                     if (this.field2910 < 0) {
                        var9 = this.method1466(var1, var2, var5, var3, var4.field3426[this.field2917]);
                        if (this.field2909 >= var5) {
                           return;
                        }

                        this.field2909 = var5 + var5 - 1 - this.field2909;
                        this.field2910 = -this.field2910;
                        if (--this.field2916 == 0) {
                           break label130;
                        }
                     }

                     do {
                        var9 = this.method1465(var1, var9, var6, var3, var4.field3426[this.field2914 - 1]);
                        if (this.field2909 < var6) {
                           return;
                        }

                        this.field2909 = var6 + var6 - 1 - this.field2909;
                        this.field2910 = -this.field2910;
                        if (--this.field2916 == 0) {
                           break;
                        }

                        var9 = this.method1466(var1, var9, var5, var3, var4.field3426[this.field2917]);
                        if (this.field2909 >= var5) {
                           return;
                        }

                        this.field2909 = var5 + var5 - 1 - this.field2909;
                        this.field2910 = -this.field2910;
                     } while(--this.field2916 != 0);
                  }
               } else {
                  int var10;
                  if (this.field2910 < 0) {
                     while(true) {
                        var9 = this.method1466(var1, var9, var5, var3, var4.field3426[this.field2914 - 1]);
                        if (this.field2909 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field2909) / var8;
                        if (var10 >= this.field2916) {
                           this.field2909 += var8 * this.field2916;
                           this.field2916 = 0;
                           break;
                        }

                        this.field2909 += var8 * var10;
                        this.field2916 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method1465(var1, var9, var6, var3, var4.field3426[this.field2917]);
                        if (this.field2909 < var6) {
                           return;
                        }

                        var10 = (this.field2909 - var5) / var8;
                        if (var10 >= this.field2916) {
                           this.field2909 -= var8 * this.field2916;
                           this.field2916 = 0;
                           break;
                        }

                        this.field2909 -= var8 * var10;
                        this.field2916 -= var10;
                     }
                  }
               }
            }

            if (this.field2910 < 0) {
               this.method1466(var1, var9, 0, var3, 0);
               if (this.field2909 < 0) {
                  this.field2909 = -1;
                  this.method1478();
                  this.method567();
               }
            } else {
               this.method1465(var1, var9, var7, var3, 0);
               if (this.field2909 >= var7) {
                  this.field2909 = var7;
                  this.method1478();
                  this.method567();
               }
            }

         }
      }
   }

   public synchronized void method959(int var1) {
      if (this.field2920 > 0) {
         if (var1 >= this.field2920) {
            if (this.field2923 == Integer.MIN_VALUE) {
               this.field2923 = 0;
               this.field2915 = 0;
               this.field2912 = 0;
               this.field2913 = 0;
               this.method567();
               var1 = this.field2920;
            }

            this.field2920 = 0;
            this.method1450();
         } else {
            this.field2913 += this.field2921 * var1;
            this.field2912 += this.field2922 * var1;
            this.field2915 += this.field2918 * var1;
            this.field2920 -= var1;
         }
      }

      class388 var2 = (class388)super.field1970;
      int var3 = this.field2917 << 8;
      int var4 = this.field2914 << 8;
      int var5 = var2.field3426.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field2916 = 0;
      }

      if (this.field2909 < 0) {
         if (this.field2910 <= 0) {
            this.method1478();
            this.method567();
            return;
         }

         this.field2909 = 0;
      }

      if (this.field2909 >= var5) {
         if (this.field2910 >= 0) {
            this.method1478();
            this.method567();
            return;
         }

         this.field2909 = var5 - 1;
      }

      this.field2909 += this.field2910 * var1;
      if (this.field2916 < 0) {
         if (!this.field2919) {
            if (this.field2910 < 0) {
               if (this.field2909 >= var3) {
                  return;
               }

               this.field2909 = var4 - 1 - (var4 - 1 - this.field2909) % var6;
            } else {
               if (this.field2909 < var4) {
                  return;
               }

               this.field2909 = var3 + (this.field2909 - var3) % var6;
            }

         } else {
            if (this.field2910 < 0) {
               if (this.field2909 >= var3) {
                  return;
               }

               this.field2909 = var3 + var3 - 1 - this.field2909;
               this.field2910 = -this.field2910;
            }

            while(this.field2909 >= var4) {
               this.field2909 = var4 + var4 - 1 - this.field2909;
               this.field2910 = -this.field2910;
               if (this.field2909 >= var3) {
                  return;
               }

               this.field2909 = var3 + var3 - 1 - this.field2909;
               this.field2910 = -this.field2910;
            }

         }
      } else {
         if (this.field2916 > 0) {
            if (this.field2919) {
               label121: {
                  if (this.field2910 < 0) {
                     if (this.field2909 >= var3) {
                        return;
                     }

                     this.field2909 = var3 + var3 - 1 - this.field2909;
                     this.field2910 = -this.field2910;
                     if (--this.field2916 == 0) {
                        break label121;
                     }
                  }

                  do {
                     if (this.field2909 < var4) {
                        return;
                     }

                     this.field2909 = var4 + var4 - 1 - this.field2909;
                     this.field2910 = -this.field2910;
                     if (--this.field2916 == 0) {
                        break;
                     }

                     if (this.field2909 >= var3) {
                        return;
                     }

                     this.field2909 = var3 + var3 - 1 - this.field2909;
                     this.field2910 = -this.field2910;
                  } while(--this.field2916 != 0);
               }
            } else {
               label153: {
                  int var7;
                  if (this.field2910 < 0) {
                     if (this.field2909 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field2909) / var6;
                     if (var7 >= this.field2916) {
                        this.field2909 += var6 * this.field2916;
                        this.field2916 = 0;
                        break label153;
                     }

                     this.field2909 += var6 * var7;
                     this.field2916 -= var7;
                  } else {
                     if (this.field2909 < var4) {
                        return;
                     }

                     var7 = (this.field2909 - var3) / var6;
                     if (var7 >= this.field2916) {
                        this.field2909 -= var6 * this.field2916;
                        this.field2916 = 0;
                        break label153;
                     }

                     this.field2909 -= var6 * var7;
                     this.field2916 -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field2910 < 0) {
            if (this.field2909 < 0) {
               this.field2909 = -1;
               this.method1478();
               this.method567();
            }
         } else if (this.field2909 >= var5) {
            this.field2909 = var5;
            this.method1478();
            this.method567();
         }

      }
   }

   int method1465(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field2920 > 0) {
            int var6 = var2 + this.field2920;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field2920 += var2;
            if (this.field2910 == 256 && (this.field2909 & 255) == 0) {
               if (class126.field1464) {
                  var2 = method1481(0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2912, this.field2915, this.field2922, this.field2918, 0, var6, var3, this);
               } else {
                  var2 = method1472(((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2913, this.field2921, 0, var6, var3, this);
               }
            } else if (class126.field1464) {
               var2 = method1464(0, 0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2912, this.field2915, this.field2922, this.field2918, 0, var6, var3, this, this.field2910, var5);
            } else {
               var2 = method1475(0, 0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2913, this.field2921, 0, var6, var3, this, this.field2910, var5);
            }

            this.field2920 -= var2;
            if (this.field2920 != 0) {
               return var2;
            }

            if (!this.method1486()) {
               continue;
            }

            return var4;
         }

         if (this.field2910 == 256 && (this.field2909 & 255) == 0) {
            if (class126.field1464) {
               return method1467(0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2912, this.field2915, 0, var4, var3, this);
            }

            return method1454(((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2913, 0, var4, var3, this);
         }

         if (class126.field1464) {
            return method1469(0, 0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2912, this.field2915, 0, var4, var3, this, this.field2910, var5);
         }

         return method1487(0, 0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2913, 0, var4, var3, this, this.field2910, var5);
      }
   }

   int method1466(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field2920 > 0) {
            int var6 = var2 + this.field2920;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field2920 += var2;
            if (this.field2910 == -256 && (this.field2909 & 255) == 0) {
               if (class126.field1464) {
                  var2 = method1474(0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2912, this.field2915, this.field2922, this.field2918, 0, var6, var3, this);
               } else {
                  var2 = method1473(((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2913, this.field2921, 0, var6, var3, this);
               }
            } else if (class126.field1464) {
               var2 = method1477(0, 0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2912, this.field2915, this.field2922, this.field2918, 0, var6, var3, this, this.field2910, var5);
            } else {
               var2 = method1476(0, 0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2913, this.field2921, 0, var6, var3, this, this.field2910, var5);
            }

            this.field2920 -= var2;
            if (this.field2920 != 0) {
               return var2;
            }

            if (!this.method1486()) {
               continue;
            }

            return var4;
         }

         if (this.field2910 == -256 && (this.field2909 & 255) == 0) {
            if (class126.field1464) {
               return method1468(0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2912, this.field2915, 0, var4, var3, this);
            }

            return method1484(((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2913, 0, var4, var3, this);
         }

         if (class126.field1464) {
            return method1471(0, 0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2912, this.field2915, 0, var4, var3, this, this.field2910, var5);
         }

         return method1470(0, 0, ((class388)super.field1970).field3426, var1, this.field2909, var2, this.field2913, 0, var4, var3, this, this.field2910, var5);
      }
   }

   boolean method1486() {
      int var1 = this.field2923;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method1479(var1, this.field2911);
         var3 = method1483(var1, this.field2911);
      }

      if (this.field2913 == var1 && this.field2912 == var2 && this.field2915 == var3) {
         if (this.field2923 == Integer.MIN_VALUE) {
            this.field2923 = 0;
            this.field2915 = 0;
            this.field2912 = 0;
            this.field2913 = 0;
            this.method567();
            return true;
         } else {
            this.method1450();
            return false;
         }
      } else {
         if (this.field2913 < var1) {
            this.field2921 = 1;
            this.field2920 = var1 - this.field2913;
         } else if (this.field2913 > var1) {
            this.field2921 = -1;
            this.field2920 = this.field2913 - var1;
         } else {
            this.field2921 = 0;
         }

         if (this.field2912 < var2) {
            this.field2922 = 1;
            if (this.field2920 == 0 || this.field2920 > var2 - this.field2912) {
               this.field2920 = var2 - this.field2912;
            }
         } else if (this.field2912 > var2) {
            this.field2922 = -1;
            if (this.field2920 == 0 || this.field2920 > this.field2912 - var2) {
               this.field2920 = this.field2912 - var2;
            }
         } else {
            this.field2922 = 0;
         }

         if (this.field2915 < var3) {
            this.field2918 = 1;
            if (this.field2920 == 0 || this.field2920 > var3 - this.field2915) {
               this.field2920 = var3 - this.field2915;
            }
         } else if (this.field2915 > var3) {
            this.field2918 = -1;
            if (this.field2920 == 0 || this.field2920 > this.field2915 - var3) {
               this.field2920 = this.field2915 - var3;
            }
         } else {
            this.field2918 = 0;
         }

         return false;
      }
   }

   static int method1479(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int method1483(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   public static class310 method1449(class388 var0, int var1, int var2) {
      return var0.field3426 != null && var0.field3426.length != 0 ? new class310(var0, (int)((long)var0.field3428 * 256L * (long)var1 / (long)(class157.field1636 * 100)), var2 << 6) : null;
   }

   public static class310 method1488(class388 var0, int var1, int var2, int var3) {
      return var0.field3426 != null && var0.field3426.length != 0 ? new class310(var0, var1, var2, var3) : null;
   }

   static int method1454(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class310 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field2909 = var2 << 8;
      return var3;
   }

   static int method1467(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class310 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field2909 = var3 << 8;
      return var4 >> 1;
   }

   static int method1484(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class310 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field2909 = var2 << 8;
      return var3;
   }

   static int method1468(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class310 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field2909 = var3 << 8;
      return var4 >> 1;
   }

   static int method1487(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class310 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field2909 = var4;
      return var5;
   }

   static int method1469(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class310 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field2909 = var4;
      return var5 >> 1;
   }

   static int method1470(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class310 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field2909 = var4;
      return var5;
   }

   static int method1471(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class310 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field2909 = var4;
      return var5 >> 1;
   }

   static int method1472(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class310 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field2912 += var9.field2922 * (var6 - var3);
      var9.field2915 += var9.field2918 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field2913 = var4 >> 2;
      var9.field2909 = var2 << 8;
      return var3;
   }

   static int method1481(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class310 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field2913 += var12.field2921 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field2912 = var5 >> 2;
      var12.field2915 = var6 >> 2;
      var12.field2909 = var3 << 8;
      return var4 >> 1;
   }

   static int method1473(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class310 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field2912 += var9.field2922 * (var6 - var3);
      var9.field2915 += var9.field2918 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field2913 = var4 >> 2;
      var9.field2909 = var2 << 8;
      return var3;
   }

   static int method1474(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class310 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field2913 += var12.field2921 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field2912 = var5 >> 2;
      var12.field2915 = var6 >> 2;
      var12.field2909 = var3 << 8;
      return var4 >> 1;
   }

   static int method1475(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class310 var11, int var12, int var13) {
      var11.field2912 -= var11.field2922 * var5;
      var11.field2915 -= var11.field2918 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field2912 += var11.field2922 * var5;
      var11.field2915 += var11.field2918 * var5;
      var11.field2913 = var6;
      var11.field2909 = var4;
      return var5;
   }

   static int method1464(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class310 var13, int var14, int var15) {
      var13.field2913 -= var13.field2921 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field2913 += var13.field2921 * var5;
      var13.field2912 = var6;
      var13.field2915 = var7;
      var13.field2909 = var4;
      return var5;
   }

   static int method1476(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class310 var11, int var12, int var13) {
      var11.field2912 -= var11.field2922 * var5;
      var11.field2915 -= var11.field2918 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field2912 += var11.field2922 * var5;
      var11.field2915 += var11.field2918 * var5;
      var11.field2913 = var6;
      var11.field2909 = var4;
      return var5;
   }

   static int method1477(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class310 var13, int var14, int var15) {
      var13.field2913 -= var13.field2921 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field2913 += var13.field2921 * var5;
      var13.field2912 = var6;
      var13.field2915 = var7;
      var13.field2909 = var4;
      return var5;
   }
}
