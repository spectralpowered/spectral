import java.util.Random;

public abstract class class93 extends class362 {
   public static class161[] field1000;
   static int field1002 = -1;
   static int field1003 = 256;
   static int field1004 = 0;
   static int field1005 = -1;
   static int field1006 = 0;
   static int field1008 = -1;
   static int field1010 = 0;
   static int field991 = 0;
   static int field997 = -1;
   static String[] field1012 = new String[100];
   static Random field1011 = new Random();
   byte[] field1001;
   byte[][] field992 = new byte[256][];
   int[] field1007;
   int[] field993;
   int[] field994;
   int[] field995;
   int[] field996;
   public int field1009;
   public int field998;
   public int field999 = 0;

   class93(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field995 = var2;
      this.field996 = var3;
      this.field993 = var4;
      this.field994 = var5;
      this.method512(var1);
      this.field992 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if (this.field996[var10] < var8 && this.field994[var10] != 0) {
            var8 = this.field996[var10];
         }

         if (this.field996[var10] + this.field994[var10] > var9) {
            var9 = this.field996[var10] + this.field994[var10];
         }
      }

      this.field998 = this.field999 - var8;
      this.field1009 = var9 - this.field999;
   }

   class93(byte[] var1) {
      this.method512(var1);
   }

   abstract void method528(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void method529(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   void method512(byte[] var1) {
      this.field1007 = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.field1007.length; ++var2) {
            this.field1007[var2] = var1[var2] & 255;
         }

         this.field999 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field1007[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field1001 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if (var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.field1001[(var13 << 8) + var8] = (byte)method533(var11, var12, var4, this.field1007, var10, var13, var8);
                  }
               }
            }
         }

         this.field999 = var4[32] + var10[32];
      }

   }

   public int method513(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.field1007[class291.method1369(var1) & 255];
   }

   public int method538(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = class244.method1221(var7.substring(4));
                              var4 += field1000[var8].field1666;
                              var3 = -1;
                           } catch (Exception var9) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.field1007[(char)(class291.method1369(var6) & 255)];
                  if (this.field1001 != null && var3 != -1) {
                     var4 += this.field1001[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int method515(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.method513('<');
                     if (this.field1001 != null && var11 != -1) {
                        var4 += this.field1001[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.method513('>');
                     if (this.field1001 != null && var11 != -1) {
                        var4 += this.field1001[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = class244.method1221(var16.substring(4));
                        var4 += field1000[var17].field1666;
                        var11 = 0;
                     } catch (Exception var18) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.method513(var15);
                     if (this.field1001 != null && var11 != -1) {
                        var4 += this.field1001[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if (var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   public int method516(String var1, int var2) {
      int var3 = this.method515(var1, new int[]{var2}, field1012);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method538(field1012[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int method517(String var1, int var2) {
      return this.method515(var1, new int[]{var2}, field1012);
   }

   public class349 method523(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.method538(var3) / 2;
         var6 += this.method538(var3.substring(0, var1));
         int var7 = var5 - this.field998;
         int var8 = this.method538(var3.substring(var1, var1 + var2));
         int var9 = this.field998 + this.field1009;
         return new class349(var6, var7, var8, var9);
      } else {
         return new class349(var4, var5, 0, 0);
      }
   }

   public void method518(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method525(var4, var5);
         this.method530(var1, var2, var3);
      }
   }

   public void method539(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method525(var4, var5);
         field1003 = var6;
         this.method530(var1, var2, var3);
      }
   }

   public void method519(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method525(var4, var5);
         this.method530(var1, var2 - this.method538(var1), var3);
      }
   }

   public void method520(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method525(var4, var5);
         this.method530(var1, var2 - this.method538(var1) / 2, var3);
      }
   }

   public int method521(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var1 == null) {
         return 0;
      } else {
         this.method525(var6, var7);
         if (var10 == 0) {
            var10 = this.field999;
         }

         int[] var11 = new int[]{var4};
         if (var5 < this.field998 + this.field1009 + var10 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method515(var1, var11, field1012);
         if (var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if (var9 == 0) {
            var13 = var3 + this.field998;
         } else if (var9 == 1) {
            var13 = var3 + this.field998 + (var5 - this.field998 - this.field1009 - (var12 - 1) * var10) / 2;
         } else if (var9 == 2) {
            var13 = var3 + var5 - this.field1009 - (var12 - 1) * var10;
         } else {
            var14 = (var5 - this.field998 - this.field1009 - (var12 - 1) * var10) / (var12 + 1);
            if (var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + this.field998 + var14;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if (var8 == 0) {
               this.method530(field1012[var14], var2, var13);
            } else if (var8 == 1) {
               this.method530(field1012[var14], var2 + (var4 - this.method538(field1012[var14])) / 2, var13);
            } else if (var8 == 2) {
               this.method530(field1012[var14], var2 + var4 - this.method538(field1012[var14]), var13);
            } else if (var14 == var12 - 1) {
               this.method530(field1012[var14], var2, var13);
            } else {
               this.method541(field1012[var14], var4);
               this.method530(field1012[var14], var2, var13);
               field1010 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   public class28 method522(class424 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.method2031()) {
         this.method525(var4, var5);
         var3 -= this.field999;

         for(int var7 = 0; var7 < var1.method2035(); ++var7) {
            class314 var8 = var1.method2034(var7);
            if (var6 != -1 && var8.field2983 > var6) {
               return new class28(var8.field2984, var8.field2983);
            }

            char var9 = var8.field2982;
            if (var9 != '\n') {
               if (var1.method2030(var7)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.field2984;
                  int var11 = var3 + var8.field2983;
                  int var12 = this.field993[var9];
                  int var13 = this.field994[var9];
                  if (field1005 != -1) {
                     this.method528(this.field992[var9], var10 + this.field995[var9] + 1, var11 + this.field996[var9] + 1, var12, var13, field1005);
                  }

                  this.method528(this.field992[var9], var10 + this.field995[var9], var11 + this.field996[var9], var12, var13, field1004);
               }
            }
         }
      }

      return var1.method2033();
   }

   public void method514(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method525(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method527(var1, var2 - this.method538(var1) / 2, var3, (int[])null, var7);
      }
   }

   public void method540(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method525(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method527(var1, var2 - this.method538(var1) / 2, var3, var7, var8);
      }
   }

   public void method537(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null) {
         this.method525(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if (var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method527(var1, var2 - this.method538(var1) / 2, var3, (int[])null, var10);
      }
   }

   public void method524(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method525(var4, var5);
         field1011.setSeed((long)var6);
         field1003 = 192 + (field1011.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((field1011.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method527(var1, var2, var3, var7, (int[])null);
      }
   }

   void method525(int var1, int var2) {
      field1002 = -1;
      field1008 = -1;
      field997 = var2;
      field1005 = var2;
      field1006 = var1;
      field1004 = var1;
      field1003 = 256;
      field1010 = 0;
      field991 = 0;
   }

   void method526(String var1) {
      try {
         if (var1.startsWith("col=")) {
            field1004 = class194.method1003(var1.substring(4), 16);
         } else if (var1.equals("/col")) {
            field1004 = field1006;
         } else if (var1.startsWith("str=")) {
            field1002 = class194.method1003(var1.substring(4), 16);
         } else if (var1.equals("str")) {
            field1002 = 8388608;
         } else if (var1.equals("/str")) {
            field1002 = -1;
         } else if (var1.startsWith("u=")) {
            field1008 = class194.method1003(var1.substring(2), 16);
         } else if (var1.equals("u")) {
            field1008 = 0;
         } else if (var1.equals("/u")) {
            field1008 = -1;
         } else if (var1.startsWith("shad=")) {
            field1005 = class194.method1003(var1.substring(5), 16);
         } else if (var1.equals("shad")) {
            field1005 = 0;
         } else if (var1.equals("/shad")) {
            field1005 = field997;
         } else if (var1.equals("br")) {
            this.method525(field1006, field997);
         }
      } catch (Exception var3) {
         ;
      }

   }

   void method541(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         field1010 = (var2 - this.method538(var1) << 8) / var3;
      }

   }

   void method530(String var1, int var2, int var3) {
      var3 -= this.field999;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(class291.method1369(var1.charAt(var6)) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = class244.method1221(var8.substring(4));
                              class161 var13 = field1000[var9];
                              var13.method849(var2, var3 + this.field999 - var13.field1669);
                              var2 += var13.field1666;
                              var5 = -1;
                           } catch (Exception var11) {
                              ;
                           }
                        } else {
                           this.method526(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.field1001 != null && var5 != -1) {
                     var2 += this.field1001[(var5 << 8) + var7];
                  }

                  int var12 = this.field993[var7];
                  var9 = this.field994[var7];
                  if (var7 != ' ') {
                     if (field1003 == 256) {
                        if (field1005 != -1) {
                           method534(this.field992[var7], var2 + this.field995[var7] + 1, var3 + this.field996[var7] + 1, var12, var9, field1005);
                        }

                        this.method528(this.field992[var7], var2 + this.field995[var7], var3 + this.field996[var7], var12, var9, field1004);
                     } else {
                        if (field1005 != -1) {
                           method532(this.field992[var7], var2 + this.field995[var7] + 1, var3 + this.field996[var7] + 1, var12, var9, field1005, field1003);
                        }

                        this.method529(this.field992[var7], var2 + this.field995[var7], var3 + this.field996[var7], var12, var9, field1004, field1003);
                     }
                  } else if (field1010 > 0) {
                     field991 += field1010;
                     var2 += field991 >> 8;
                     field991 &= 255;
                  }

                  int var10 = this.field1007[var7];
                  if (field1002 != -1) {
                     method1742(var2, var3 + (int)((double)this.field999 * 0.7D), var10, field1002);
                  }

                  if (field1008 != -1) {
                     method1742(var2, var3 + this.field999 + 1, var10, field1008);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void method527(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field999;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            char var10 = (char)(class291.method1369(var1.charAt(var9)) & 255);
            if (var10 == '<') {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if (var10 == '>' && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if (var11.equals("lt")) {
                     var10 = '<';
                  } else {
                     if (!var11.equals("gt")) {
                        if (var11.startsWith("img=")) {
                           try {
                              if (var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if (var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class244.method1221(var11.substring(4));
                              class161 var18 = field1000[var14];
                              var18.method849(var2 + var12, var3 + this.field999 - var18.field1669 + var13);
                              var2 += var18.field1666;
                              var7 = -1;
                           } catch (Exception var16) {
                              ;
                           }
                        } else {
                           this.method526(var11);
                        }
                        continue;
                     }

                     var10 = '>';
                  }
               }

               if (var10 == 160) {
                  var10 = ' ';
               }

               if (var6 == -1) {
                  if (this.field1001 != null && var7 != -1) {
                     var2 += this.field1001[(var7 << 8) + var10];
                  }

                  int var17 = this.field993[var10];
                  var12 = this.field994[var10];
                  if (var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if (var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if (var10 != ' ') {
                     if (field1003 == 256) {
                        if (field1005 != -1) {
                           method534(this.field992[var10], var2 + this.field995[var10] + 1 + var13, var3 + this.field996[var10] + 1 + var14, var17, var12, field1005);
                        }

                        this.method528(this.field992[var10], var2 + this.field995[var10] + var13, var3 + this.field996[var10] + var14, var17, var12, field1004);
                     } else {
                        if (field1005 != -1) {
                           method532(this.field992[var10], var2 + this.field995[var10] + 1 + var13, var3 + this.field996[var10] + 1 + var14, var17, var12, field1005, field1003);
                        }

                        this.method529(this.field992[var10], var2 + this.field995[var10] + var13, var3 + this.field996[var10] + var14, var17, var12, field1004, field1003);
                     }
                  } else if (field1010 > 0) {
                     field991 += field1010;
                     var2 += field991 >> 8;
                     field991 &= 255;
                  }

                  int var15 = this.field1007[var10];
                  if (field1002 != -1) {
                     method1742(var2, var3 + (int)((double)this.field999 * 0.7D), var15, field1002);
                  }

                  if (field1008 != -1) {
                     method1742(var2, var3 + this.field999, var15, field1008);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   static int method533(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   public static String method535(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   static void method534(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class362.field3242;
      int var7 = class362.field3242 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < class362.field3244) {
         var10 = class362.field3244 - var2;
         var4 -= var10;
         var2 = class362.field3244;
         var9 += var10 * var3;
         var6 += var10 * class362.field3242;
      }

      if (var2 + var4 > class362.field3245) {
         var4 -= var2 + var4 - class362.field3245;
      }

      if (var1 < class362.field3246) {
         var10 = class362.field3246 - var1;
         var3 -= var10;
         var1 = class362.field3246;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > class362.field3247) {
         var10 = var1 + var3 - class362.field3247;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         method531(class362.field3243, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void method531(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method532(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class362.field3242;
      int var8 = class362.field3242 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < class362.field3244) {
         var11 = class362.field3244 - var2;
         var4 -= var11;
         var2 = class362.field3244;
         var10 += var11 * var3;
         var7 += var11 * class362.field3242;
      }

      if (var2 + var4 > class362.field3245) {
         var4 -= var2 + var4 - class362.field3245;
      }

      if (var1 < class362.field3246) {
         var11 = class362.field3246 - var1;
         var3 -= var11;
         var1 = class362.field3246;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > class362.field3247) {
         var11 = var1 + var3 - class362.field3247;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         method536(class362.field3243, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void method536(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
