public class class316 extends class437 {
   boolean field2488;
   int field2478;
   int field2479;
   int field2480;
   int field2481;
   int field2482;
   int field2483;
   int field2484;
   int field2485;
   int field2486;
   int field2487;
   int field2489;
   int field2490;
   int field2491;
   int field2492;

   class316(class82 var1, int var2, int var3) {
      super.field3618 = var1;
      this.field2486 = var1.field669;
      this.field2483 = var1.field667;
      this.field2488 = var1.field671;
      this.field2479 = var2;
      this.field2492 = var3;
      this.field2480 = 8192;
      this.field2478 = 0;
      this.method1517();
   }

   class316(class82 var1, int var2, int var3, int var4) {
      super.field3618 = var1;
      this.field2486 = var1.field669;
      this.field2483 = var1.field667;
      this.field2488 = var1.field671;
      this.field2479 = var2;
      this.field2492 = var3;
      this.field2480 = var4;
      this.field2478 = 0;
      this.method1517();
   }

   int method2167() {
      int var1 = this.field2482 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field2485 == 0) {
         var1 -= var1 * this.field2478 / (((class82)super.field3618).field668.length << 8);
      } else if (this.field2485 >= 0) {
         var1 -= var1 * this.field2486 / ((class82)super.field3618).field668.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   void method1517() {
      this.field2482 = this.field2492;
      this.field2481 = method1551(this.field2492, this.field2480);
      this.field2484 = method1555(this.field2492, this.field2480);
   }

   public synchronized void method1518(int var1) {
      this.field2485 = var1;
   }

   public synchronized void method1519(int var1) {
      this.method1520(var1 << 6, this.method1531());
   }

   synchronized void method1557(int var1) {
      this.method1520(var1, this.method1531());
   }

   synchronized void method1520(int var1, int var2) {
      this.field2492 = var1;
      this.field2480 = var2;
      this.field2489 = 0;
      this.method1517();
   }

   public synchronized int method1552() {
      return this.field2492 == Integer.MIN_VALUE ? 0 : this.field2492;
   }

   public synchronized int method1531() {
      return this.field2480 < 0 ? -1 : this.field2480;
   }

   public synchronized void method1523(int var1) {
      int var2 = ((class82)super.field3618).field668.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field2478 = var1;
   }

   public synchronized void method1524(boolean var1) {
      this.field2479 = (this.field2479 ^ this.field2479 >> 31) + (this.field2479 >>> 31);
      if (var1) {
         this.field2479 = -this.field2479;
      }

   }

   void method1550() {
      if (this.field2489 != 0) {
         if (this.field2492 == Integer.MIN_VALUE) {
            this.field2492 = 0;
         }

         this.field2489 = 0;
         this.method1517();
      }

   }

   public synchronized void method1525(int var1, int var2) {
      this.method1526(var1, var2, this.method1531());
   }

   public synchronized void method1526(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method1520(var2, var3);
      } else {
         int var4 = method1551(var2, var3);
         int var5 = method1555(var2, var3);
         if (this.field2481 == var4 && this.field2484 == var5) {
            this.field2489 = 0;
         } else {
            int var6 = var2 - this.field2482;
            if (this.field2482 - var2 > var6) {
               var6 = this.field2482 - var2;
            }

            if (var4 - this.field2481 > var6) {
               var6 = var4 - this.field2481;
            }

            if (this.field2481 - var4 > var6) {
               var6 = this.field2481 - var4;
            }

            if (var5 - this.field2484 > var6) {
               var6 = var5 - this.field2484;
            }

            if (this.field2484 - var5 > var6) {
               var6 = this.field2484 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field2489 = var1;
            this.field2492 = var2;
            this.field2480 = var3;
            this.field2490 = (var2 - this.field2482) / var1;
            this.field2491 = (var4 - this.field2481) / var1;
            this.field2487 = (var5 - this.field2484) / var1;
         }
      }
   }

   public synchronized void method1527(int var1) {
      if (var1 == 0) {
         this.method1557(0);
         this.method637();
      } else if (this.field2481 == 0 && this.field2484 == 0) {
         this.field2489 = 0;
         this.field2492 = 0;
         this.field2482 = 0;
         this.method637();
      } else {
         int var2 = -this.field2482;
         if (this.field2482 > var2) {
            var2 = this.field2482;
         }

         if (-this.field2481 > var2) {
            var2 = -this.field2481;
         }

         if (this.field2481 > var2) {
            var2 = this.field2481;
         }

         if (-this.field2484 > var2) {
            var2 = -this.field2484;
         }

         if (this.field2484 > var2) {
            var2 = this.field2484;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field2489 = var1;
         this.field2492 = Integer.MIN_VALUE;
         this.field2490 = -this.field2482 / var1;
         this.field2491 = -this.field2481 / var1;
         this.field2487 = -this.field2484 / var1;
      }
   }

   public synchronized void method1528(int var1) {
      if (this.field2479 < 0) {
         this.field2479 = -var1;
      } else {
         this.field2479 = var1;
      }

   }

   public synchronized int method1529() {
      return this.field2479 < 0 ? -this.field2479 : this.field2479;
   }

   public boolean method1530() {
      return this.field2478 < 0 || this.field2478 >= ((class82)super.field3618).field668.length << 8;
   }

   public boolean method1554() {
      return this.field2489 != 0;
   }

   protected class437 method2168() {
      return null;
   }

   protected class437 method2171() {
      return null;
   }

   protected int method2173() {
      return this.field2492 == 0 && this.field2489 == 0 ? 0 : 1;
   }

   public synchronized void method2169(int[] var1, int var2, int var3) {
      if (this.field2492 == 0 && this.field2489 == 0) {
         this.method2172(var3);
      } else {
         class82 var4 = (class82)super.field3618;
         int var5 = this.field2486 << 8;
         int var6 = this.field2483 << 8;
         int var7 = var4.field668.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field2485 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field2478 < 0) {
            if (this.field2479 <= 0) {
               this.method1550();
               this.method637();
               return;
            }

            this.field2478 = 0;
         }

         if (this.field2478 >= var7) {
            if (this.field2479 >= 0) {
               this.method1550();
               this.method637();
               return;
            }

            this.field2478 = var7 - 1;
         }

         if (this.field2485 < 0) {
            if (this.field2488) {
               if (this.field2479 < 0) {
                  var9 = this.method1536(var1, var2, var5, var3, var4.field668[this.field2486]);
                  if (this.field2478 >= var5) {
                     return;
                  }

                  this.field2478 = var5 + var5 - 1 - this.field2478;
                  this.field2479 = -this.field2479;
               }

               while(true) {
                  var9 = this.method1535(var1, var9, var6, var3, var4.field668[this.field2483 - 1]);
                  if (this.field2478 < var6) {
                     return;
                  }

                  this.field2478 = var6 + var6 - 1 - this.field2478;
                  this.field2479 = -this.field2479;
                  var9 = this.method1536(var1, var9, var5, var3, var4.field668[this.field2486]);
                  if (this.field2478 >= var5) {
                     return;
                  }

                  this.field2478 = var5 + var5 - 1 - this.field2478;
                  this.field2479 = -this.field2479;
               }
            } else if (this.field2479 < 0) {
               while(true) {
                  var9 = this.method1536(var1, var9, var5, var3, var4.field668[this.field2483 - 1]);
                  if (this.field2478 >= var5) {
                     return;
                  }

                  this.field2478 = var6 - 1 - (var6 - 1 - this.field2478) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method1535(var1, var9, var6, var3, var4.field668[this.field2486]);
                  if (this.field2478 < var6) {
                     return;
                  }

                  this.field2478 = var5 + (this.field2478 - var5) % var8;
               }
            }
         } else {
            if (this.field2485 > 0) {
               if (this.field2488) {
                  label130: {
                     if (this.field2479 < 0) {
                        var9 = this.method1536(var1, var2, var5, var3, var4.field668[this.field2486]);
                        if (this.field2478 >= var5) {
                           return;
                        }

                        this.field2478 = var5 + var5 - 1 - this.field2478;
                        this.field2479 = -this.field2479;
                        if (--this.field2485 == 0) {
                           break label130;
                        }
                     }

                     do {
                        var9 = this.method1535(var1, var9, var6, var3, var4.field668[this.field2483 - 1]);
                        if (this.field2478 < var6) {
                           return;
                        }

                        this.field2478 = var6 + var6 - 1 - this.field2478;
                        this.field2479 = -this.field2479;
                        if (--this.field2485 == 0) {
                           break;
                        }

                        var9 = this.method1536(var1, var9, var5, var3, var4.field668[this.field2486]);
                        if (this.field2478 >= var5) {
                           return;
                        }

                        this.field2478 = var5 + var5 - 1 - this.field2478;
                        this.field2479 = -this.field2479;
                     } while(--this.field2485 != 0);
                  }
               } else {
                  int var10;
                  if (this.field2479 < 0) {
                     while(true) {
                        var9 = this.method1536(var1, var9, var5, var3, var4.field668[this.field2483 - 1]);
                        if (this.field2478 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field2478) / var8;
                        if (var10 >= this.field2485) {
                           this.field2478 += var8 * this.field2485;
                           this.field2485 = 0;
                           break;
                        }

                        this.field2478 += var8 * var10;
                        this.field2485 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method1535(var1, var9, var6, var3, var4.field668[this.field2486]);
                        if (this.field2478 < var6) {
                           return;
                        }

                        var10 = (this.field2478 - var5) / var8;
                        if (var10 >= this.field2485) {
                           this.field2478 -= var8 * this.field2485;
                           this.field2485 = 0;
                           break;
                        }

                        this.field2478 -= var8 * var10;
                        this.field2485 -= var10;
                     }
                  }
               }
            }

            if (this.field2479 < 0) {
               this.method1536(var1, var9, 0, var3, 0);
               if (this.field2478 < 0) {
                  this.field2478 = -1;
                  this.method1550();
                  this.method637();
               }
            } else {
               this.method1535(var1, var9, var7, var3, 0);
               if (this.field2478 >= var7) {
                  this.field2478 = var7;
                  this.method1550();
                  this.method637();
               }
            }

         }
      }
   }

   public synchronized void method2172(int var1) {
      if (this.field2489 > 0) {
         if (var1 >= this.field2489) {
            if (this.field2492 == Integer.MIN_VALUE) {
               this.field2492 = 0;
               this.field2484 = 0;
               this.field2481 = 0;
               this.field2482 = 0;
               this.method637();
               var1 = this.field2489;
            }

            this.field2489 = 0;
            this.method1517();
         } else {
            this.field2482 += this.field2490 * var1;
            this.field2481 += this.field2491 * var1;
            this.field2484 += this.field2487 * var1;
            this.field2489 -= var1;
         }
      }

      class82 var2 = (class82)super.field3618;
      int var3 = this.field2486 << 8;
      int var4 = this.field2483 << 8;
      int var5 = var2.field668.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field2485 = 0;
      }

      if (this.field2478 < 0) {
         if (this.field2479 <= 0) {
            this.method1550();
            this.method637();
            return;
         }

         this.field2478 = 0;
      }

      if (this.field2478 >= var5) {
         if (this.field2479 >= 0) {
            this.method1550();
            this.method637();
            return;
         }

         this.field2478 = var5 - 1;
      }

      this.field2478 += this.field2479 * var1;
      if (this.field2485 < 0) {
         if (!this.field2488) {
            if (this.field2479 < 0) {
               if (this.field2478 >= var3) {
                  return;
               }

               this.field2478 = var4 - 1 - (var4 - 1 - this.field2478) % var6;
            } else {
               if (this.field2478 < var4) {
                  return;
               }

               this.field2478 = var3 + (this.field2478 - var3) % var6;
            }

         } else {
            if (this.field2479 < 0) {
               if (this.field2478 >= var3) {
                  return;
               }

               this.field2478 = var3 + var3 - 1 - this.field2478;
               this.field2479 = -this.field2479;
            }

            while(this.field2478 >= var4) {
               this.field2478 = var4 + var4 - 1 - this.field2478;
               this.field2479 = -this.field2479;
               if (this.field2478 >= var3) {
                  return;
               }

               this.field2478 = var3 + var3 - 1 - this.field2478;
               this.field2479 = -this.field2479;
            }

         }
      } else {
         if (this.field2485 > 0) {
            if (this.field2488) {
               label121: {
                  if (this.field2479 < 0) {
                     if (this.field2478 >= var3) {
                        return;
                     }

                     this.field2478 = var3 + var3 - 1 - this.field2478;
                     this.field2479 = -this.field2479;
                     if (--this.field2485 == 0) {
                        break label121;
                     }
                  }

                  do {
                     if (this.field2478 < var4) {
                        return;
                     }

                     this.field2478 = var4 + var4 - 1 - this.field2478;
                     this.field2479 = -this.field2479;
                     if (--this.field2485 == 0) {
                        break;
                     }

                     if (this.field2478 >= var3) {
                        return;
                     }

                     this.field2478 = var3 + var3 - 1 - this.field2478;
                     this.field2479 = -this.field2479;
                  } while(--this.field2485 != 0);
               }
            } else {
               label153: {
                  int var7;
                  if (this.field2479 < 0) {
                     if (this.field2478 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field2478) / var6;
                     if (var7 >= this.field2485) {
                        this.field2478 += var6 * this.field2485;
                        this.field2485 = 0;
                        break label153;
                     }

                     this.field2478 += var6 * var7;
                     this.field2485 -= var7;
                  } else {
                     if (this.field2478 < var4) {
                        return;
                     }

                     var7 = (this.field2478 - var3) / var6;
                     if (var7 >= this.field2485) {
                        this.field2478 -= var6 * this.field2485;
                        this.field2485 = 0;
                        break label153;
                     }

                     this.field2478 -= var6 * var7;
                     this.field2485 -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field2479 < 0) {
            if (this.field2478 < 0) {
               this.field2478 = -1;
               this.method1550();
               this.method637();
            }
         } else if (this.field2478 >= var5) {
            this.field2478 = var5;
            this.method1550();
            this.method637();
         }

      }
   }

   int method1535(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field2489 > 0) {
            int var6 = var2 + this.field2489;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field2489 += var2;
            if (this.field2479 == 256 && (this.field2478 & 255) == 0) {
               if (class40.field207) {
                  var2 = method1553(0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2481, this.field2484, this.field2491, this.field2487, 0, var6, var3, this);
               } else {
                  var2 = method1542(((class82)super.field3618).field668, var1, this.field2478, var2, this.field2482, this.field2490, 0, var6, var3, this);
               }
            } else if (class40.field207) {
               var2 = method1533(0, 0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2481, this.field2484, this.field2491, this.field2487, 0, var6, var3, this, this.field2479, var5);
            } else {
               var2 = method1545(0, 0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2482, this.field2490, 0, var6, var3, this, this.field2479, var5);
            }

            this.field2489 -= var2;
            if (this.field2489 != 0) {
               return var2;
            }

            if (!this.method1558()) {
               continue;
            }

            return var4;
         }

         if (this.field2479 == 256 && (this.field2478 & 255) == 0) {
            if (class40.field207) {
               return method1537(0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2481, this.field2484, 0, var4, var3, this);
            }

            return method1521(((class82)super.field3618).field668, var1, this.field2478, var2, this.field2482, 0, var4, var3, this);
         }

         if (class40.field207) {
            return method1539(0, 0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2481, this.field2484, 0, var4, var3, this, this.field2479, var5);
         }

         return method1559(0, 0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2482, 0, var4, var3, this, this.field2479, var5);
      }
   }

   int method1536(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field2489 > 0) {
            int var6 = var2 + this.field2489;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field2489 += var2;
            if (this.field2479 == -256 && (this.field2478 & 255) == 0) {
               if (class40.field207) {
                  var2 = method1544(0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2481, this.field2484, this.field2491, this.field2487, 0, var6, var3, this);
               } else {
                  var2 = method1543(((class82)super.field3618).field668, var1, this.field2478, var2, this.field2482, this.field2490, 0, var6, var3, this);
               }
            } else if (class40.field207) {
               var2 = method1547(0, 0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2481, this.field2484, this.field2491, this.field2487, 0, var6, var3, this, this.field2479, var5);
            } else {
               var2 = method1546(0, 0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2482, this.field2490, 0, var6, var3, this, this.field2479, var5);
            }

            this.field2489 -= var2;
            if (this.field2489 != 0) {
               return var2;
            }

            if (!this.method1558()) {
               continue;
            }

            return var4;
         }

         if (this.field2479 == -256 && (this.field2478 & 255) == 0) {
            if (class40.field207) {
               return method1538(0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2481, this.field2484, 0, var4, var3, this);
            }

            return method1556(((class82)super.field3618).field668, var1, this.field2478, var2, this.field2482, 0, var4, var3, this);
         }

         if (class40.field207) {
            return method1541(0, 0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2481, this.field2484, 0, var4, var3, this, this.field2479, var5);
         }

         return method1540(0, 0, ((class82)super.field3618).field668, var1, this.field2478, var2, this.field2482, 0, var4, var3, this, this.field2479, var5);
      }
   }

   boolean method1558() {
      int var1 = this.field2492;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method1551(var1, this.field2480);
         var3 = method1555(var1, this.field2480);
      }

      if (this.field2482 == var1 && this.field2481 == var2 && this.field2484 == var3) {
         if (this.field2492 == Integer.MIN_VALUE) {
            this.field2492 = 0;
            this.field2484 = 0;
            this.field2481 = 0;
            this.field2482 = 0;
            this.method637();
            return true;
         } else {
            this.method1517();
            return false;
         }
      } else {
         if (this.field2482 < var1) {
            this.field2490 = 1;
            this.field2489 = var1 - this.field2482;
         } else if (this.field2482 > var1) {
            this.field2490 = -1;
            this.field2489 = this.field2482 - var1;
         } else {
            this.field2490 = 0;
         }

         if (this.field2481 < var2) {
            this.field2491 = 1;
            if (this.field2489 == 0 || this.field2489 > var2 - this.field2481) {
               this.field2489 = var2 - this.field2481;
            }
         } else if (this.field2481 > var2) {
            this.field2491 = -1;
            if (this.field2489 == 0 || this.field2489 > this.field2481 - var2) {
               this.field2489 = this.field2481 - var2;
            }
         } else {
            this.field2491 = 0;
         }

         if (this.field2484 < var3) {
            this.field2487 = 1;
            if (this.field2489 == 0 || this.field2489 > var3 - this.field2484) {
               this.field2489 = var3 - this.field2484;
            }
         } else if (this.field2484 > var3) {
            this.field2487 = -1;
            if (this.field2489 == 0 || this.field2489 > this.field2484 - var3) {
               this.field2489 = this.field2484 - var3;
            }
         } else {
            this.field2487 = 0;
         }

         return false;
      }
   }

   static int method1551(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int method1555(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   public static class316 method1516(class82 var0, int var1, int var2) {
      return var0.field668 != null && var0.field668.length != 0 ? new class316(var0, (int)((long)var0.field670 * 256L * (long)var1 / (long)(class233.field1985 * 100)), var2 << 6) : null;
   }

   public static class316 method1560(class82 var0, int var1, int var2, int var3) {
      return var0.field668 != null && var0.field668.length != 0 ? new class316(var0, var1, var2, var3) : null;
   }

   static int method1521(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class316 var8) {
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

      var8.field2478 = var2 << 8;
      return var3;
   }

   static int method1537(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class316 var10) {
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

      var10.field2478 = var3 << 8;
      return var4 >> 1;
   }

   static int method1556(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class316 var8) {
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

      var8.field2478 = var2 << 8;
      return var3;
   }

   static int method1538(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class316 var10) {
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

      var10.field2478 = var3 << 8;
      return var4 >> 1;
   }

   static int method1559(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class316 var10, int var11, int var12) {
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

      var10.field2478 = var4;
      return var5;
   }

   static int method1539(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class316 var11, int var12, int var13) {
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

      var11.field2478 = var4;
      return var5 >> 1;
   }

   static int method1540(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class316 var10, int var11, int var12) {
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

      var10.field2478 = var4;
      return var5;
   }

   static int method1541(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class316 var11, int var12, int var13) {
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

      var11.field2478 = var4;
      return var5 >> 1;
   }

   static int method1542(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class316 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field2481 += var9.field2491 * (var6 - var3);
      var9.field2484 += var9.field2487 * (var6 - var3);

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

      var9.field2482 = var4 >> 2;
      var9.field2478 = var2 << 8;
      return var3;
   }

   static int method1553(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class316 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field2482 += var12.field2490 * (var9 - var4);
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

      var12.field2481 = var5 >> 2;
      var12.field2484 = var6 >> 2;
      var12.field2478 = var3 << 8;
      return var4 >> 1;
   }

   static int method1543(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class316 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field2481 += var9.field2491 * (var6 - var3);
      var9.field2484 += var9.field2487 * (var6 - var3);

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

      var9.field2482 = var4 >> 2;
      var9.field2478 = var2 << 8;
      return var3;
   }

   static int method1544(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class316 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field2482 += var12.field2490 * (var9 - var4);
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

      var12.field2481 = var5 >> 2;
      var12.field2484 = var6 >> 2;
      var12.field2478 = var3 << 8;
      return var4 >> 1;
   }

   static int method1545(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class316 var11, int var12, int var13) {
      var11.field2481 -= var11.field2491 * var5;
      var11.field2484 -= var11.field2487 * var5;
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

      var11.field2481 += var11.field2491 * var5;
      var11.field2484 += var11.field2487 * var5;
      var11.field2482 = var6;
      var11.field2478 = var4;
      return var5;
   }

   static int method1533(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class316 var13, int var14, int var15) {
      var13.field2482 -= var13.field2490 * var5;
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
      var13.field2482 += var13.field2490 * var5;
      var13.field2481 = var6;
      var13.field2484 = var7;
      var13.field2478 = var4;
      return var5;
   }

   static int method1546(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class316 var11, int var12, int var13) {
      var11.field2481 -= var11.field2491 * var5;
      var11.field2484 -= var11.field2487 * var5;
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

      var11.field2481 += var11.field2491 * var5;
      var11.field2484 += var11.field2487 * var5;
      var11.field2482 = var6;
      var11.field2478 = var4;
      return var5;
   }

   static int method1547(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class316 var13, int var14, int var15) {
      var13.field2482 -= var13.field2490 * var5;
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
      var13.field2482 += var13.field2490 * var5;
      var13.field2481 = var6;
      var13.field2484 = var7;
      var13.field2478 = var4;
      return var5;
   }
}
