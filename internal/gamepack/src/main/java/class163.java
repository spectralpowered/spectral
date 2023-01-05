import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class163 implements Runnable {
   int field1695;
   Queue field1697 = new LinkedList();
   final Thread field1698 = new Thread(this);
   volatile boolean field1696;

   class163(int var1) {
      this.field1698.setPriority(1);
      this.field1698.start();
      this.field1695 = var1;
   }

   abstract void method858(class432 var1) throws IOException;

   public void run() {
      while(!this.field1696) {
         try {
            class432 var1;
            synchronized(this) {
               var1 = (class432)this.field1697.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                     ;
                  }
                  continue;
               }
            }

            this.method858(var1);
         } catch (Exception var7) {
            class23.method122((String)null, var7);
         }
      }

   }

   void method859(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1695);
   }

   void method862(URLConnection var1, class432 var2) {
      DataInputStream var4 = null;

      try {
         int var6 = var1.getContentLength();
         var4 = new DataInputStream(var1.getInputStream());
         byte[] var5;
         if (var6 >= 0) {
            var5 = new byte[var6];
            var4.readFully(var5);
         } else {
            var5 = new byte[0];
            byte[] var7 = class233.method1163(5000);

            byte[] var9;
            for(int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
               var9 = new byte[var8 + var5.length];
               System.arraycopy(var5, 0, var9, 0, var5.length);
               System.arraycopy(var7, 0, var9, var5.length, var8);
            }

            class38.method212(var7);
         }

         var2.field3604 = var5;
      } catch (IOException var11) {
         ;
      }

      if (null != var4) {
         try {
            var4.close();
         } catch (IOException var10) {
            ;
         }
      }

   }

   public class432 method861(URL var1) {
      class432 var3 = new class432(var1);
      synchronized(this) {
         this.field1697.add(var3);
         this.notify();
         return var3;
      }
   }

   public void method863() {
      this.field1696 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1698.join();
      } catch (InterruptedException var5) {
         ;
      }

   }

   static void method864() {
      for(class82 var1 = (class82)class82.field946.method1934(); var1 != null; var1 = (class82)class82.field946.method1936()) {
         if (var1.field944 != null) {
            class488.field4008.method1924(var1.field944);
            var1.field944 = null;
         }

         if (var1.field949 != null) {
            class488.field4008.method1924(var1.field949);
            var1.field949 = null;
         }
      }

      class82.field946.method1937();
   }

   public static void method865(class164 var0, class164 var1, boolean var2) {
      class173.field1864 = var0;
      class414.field3555 = var1;
      class173.field1876 = var2;
   }

   static final void method866(int var0, int var1, int var2, int var3, int var4, int var5, class12 var6, class391 var7) {
      if (!client.field478 || 0 != (class74.field866[0][var1][var2] & 2) || 0 == (class74.field866[var0][var1][var2] & 16)) {
         if (var0 < class74.field859) {
            class74.field859 = var0;
         }

         class173 var9 = class212.method1110(var3);
         int var10;
         int var11;
         if (var4 != 1 && var4 != 3) {
            var10 = var9.field1878;
            var11 = var9.field1879;
         } else {
            var10 = var9.field1879;
            var11 = var9.field1878;
         }

         int var12;
         int var13;
         if (var10 + var1 <= 104) {
            var12 = var1 + (var10 >> 1);
            var13 = var1 + (var10 + 1 >> 1);
         } else {
            var12 = var1;
            var13 = var1 + 1;
         }

         int var14;
         int var15;
         if (var11 + var2 <= 104) {
            var14 = var2 + (var11 >> 1);
            var15 = (var11 + 1 >> 1) + var2;
         } else {
            var14 = var2;
            var15 = var2 + 1;
         }

         int[][] var16 = class74.field858[var0];
         int var17 = var16[var12][var15] + var16[var13][var14] + var16[var12][var14] + var16[var13][var15] >> 2;
         int var18 = (var1 << 7) + (var10 << 6);
         int var19 = (var2 << 7) + (var11 << 6);
         long var20 = class141.method764(var1, var2, 2, 0 == var9.field1882, var3);
         int var22 = (var4 << 6) + var5;
         if (1 == var9.field1902) {
            var22 += 256;
         }

         int var24;
         int var25;
         if (var9.method924()) {
            class82 var23 = new class82();
            var23.field942 = var0;
            var23.field938 = var1 * 128;
            var23.field936 = var2 * 128;
            var24 = var9.field1878;
            var25 = var9.field1879;
            if (var4 == 1 || var4 == 3) {
               var24 = var9.field1879;
               var25 = var9.field1878;
            }

            var23.field939 = (var24 + var1) * 128;
            var23.field941 = (var25 + var2) * 128;
            var23.field943 = var9.field1910;
            var23.field945 = var9.field1892 * 128;
            var23.field940 = var9.field1908;
            var23.field937 = var9.field1909;
            var23.field947 = var9.field1871;
            if (null != var9.field1903) {
               var23.field950 = var9;
               var23.method440();
            }

            class82.field946.method1930(var23);
            if (null != var23.field947) {
               var23.field948 = var23.field940 + (int)(Math.random() * (double)(var23.field937 - var23.field940));
            }
         }

         Object var29;
         if (var5 == 22) {
            if (!client.field478 || var9.field1882 != 0 || var9.field1875 == 1 || var9.field1901) {
               if (-1 == var9.field1886 && var9.field1903 == null) {
                  var29 = var9.method919(22, var4, var16, var18, var17, var19);
               } else {
                  var29 = new class479(var3, 22, var4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
               }

               var6.method35(var0, var1, var2, var17, (class236)var29, var20, var22);
               if (1 == var9.field1875 && var7 != null) {
                  var7.method1889(var1, var2);
               }

            }
         } else if (var5 != 10 && var5 != 11) {
            if (var5 >= 12) {
               if (var9.field1886 == -1 && var9.field1903 == null) {
                  var29 = var9.method919(var5, var4, var16, var18, var17, var19);
               } else {
                  var29 = new class479(var3, var5, var4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
               }

               var6.method39(var0, var1, var2, var17, 1, 1, (class236)var29, 0, var20, var22);
               if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  class15.field132[var0][var1][var2] |= 2340;
               }

               if (0 != var9.field1875 && null != var7) {
                  var7.method1897(var1, var2, var10, var11, var9.field1888);
               }

            } else if (var5 == 0) {
               if (var9.field1886 == -1 && var9.field1903 == null) {
                  var29 = var9.method919(0, var4, var16, var18, var17, var19);
               } else {
                  var29 = new class479(var3, 0, var4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
               }

               var6.method37(var0, var1, var2, var17, (class236)var29, (class236)null, class74.field864[var4], 0, var20, var22);
               if (var4 == 0) {
                  if (var9.field1907) {
                     class431.field3603[var0][var1][var2] = 50;
                     class431.field3603[var0][var1][var2 + 1] = 50;
                  }

                  if (var9.field1899) {
                     class15.field132[var0][var1][var2] |= 585;
                  }
               } else if (var4 == 1) {
                  if (var9.field1907) {
                     class431.field3603[var0][var1][var2 + 1] = 50;
                     class431.field3603[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var9.field1899) {
                     class15.field132[var0][var1][var2 + 1] |= 1170;
                  }
               } else if (var4 == 2) {
                  if (var9.field1907) {
                     class431.field3603[var0][var1 + 1][var2] = 50;
                     class431.field3603[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var9.field1899) {
                     class15.field132[var0][var1 + 1][var2] |= 585;
                  }
               } else if (var4 == 3) {
                  if (var9.field1907) {
                     class431.field3603[var0][var1][var2] = 50;
                     class431.field3603[var0][var1 + 1][var2] = 50;
                  }

                  if (var9.field1899) {
                     class15.field132[var0][var1][var2] |= 1170;
                  }
               }

               if (0 != var9.field1875 && var7 != null) {
                  var7.method1887(var1, var2, var5, var4, var9.field1888);
               }

               if (var9.field1887 != 16) {
                  var6.method44(var0, var1, var2, var9.field1887);
               }

            } else if (var5 == 1) {
               if (-1 == var9.field1886 && var9.field1903 == null) {
                  var29 = var9.method919(1, var4, var16, var18, var17, var19);
               } else {
                  var29 = new class479(var3, 1, var4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
               }

               var6.method37(var0, var1, var2, var17, (class236)var29, (class236)null, class74.field868[var4], 0, var20, var22);
               if (var9.field1907) {
                  if (var4 == 0) {
                     class431.field3603[var0][var1][var2 + 1] = 50;
                  } else if (var4 == 1) {
                     class431.field3603[var0][var1 + 1][var2 + 1] = 50;
                  } else if (var4 == 2) {
                     class431.field3603[var0][var1 + 1][var2] = 50;
                  } else if (var4 == 3) {
                     class431.field3603[var0][var1][var2] = 50;
                  }
               }

               if (0 != var9.field1875 && null != var7) {
                  var7.method1887(var1, var2, var5, var4, var9.field1888);
               }

            } else {
               int var30;
               if (var5 == 2) {
                  var30 = var4 + 1 & 3;
                  Object var32;
                  Object var34;
                  if (-1 == var9.field1886 && null == var9.field1903) {
                     var34 = var9.method919(2, var4 + 4, var16, var18, var17, var19);
                     var32 = var9.method919(2, var30, var16, var18, var17, var19);
                  } else {
                     var34 = new class479(var3, 2, var4 + 4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                     var32 = new class479(var3, 2, var30, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                  }

                  var6.method37(var0, var1, var2, var17, (class236)var34, (class236)var32, class74.field864[var4], class74.field864[var30], var20, var22);
                  if (var9.field1899) {
                     if (var4 == 0) {
                        class15.field132[var0][var1][var2] |= 585;
                        class15.field132[var0][var1][var2 + 1] |= 1170;
                     } else if (var4 == 1) {
                        class15.field132[var0][var1][var2 + 1] |= 1170;
                        class15.field132[var0][var1 + 1][var2] |= 585;
                     } else if (var4 == 2) {
                        class15.field132[var0][var1 + 1][var2] |= 585;
                        class15.field132[var0][var1][var2] |= 1170;
                     } else if (var4 == 3) {
                        class15.field132[var0][var1][var2] |= 1170;
                        class15.field132[var0][var1][var2] |= 585;
                     }
                  }

                  if (var9.field1875 != 0 && null != var7) {
                     var7.method1887(var1, var2, var5, var4, var9.field1888);
                  }

                  if (var9.field1887 != 16) {
                     var6.method44(var0, var1, var2, var9.field1887);
                  }

               } else if (var5 == 3) {
                  if (-1 == var9.field1886 && null == var9.field1903) {
                     var29 = var9.method919(3, var4, var16, var18, var17, var19);
                  } else {
                     var29 = new class479(var3, 3, var4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                  }

                  var6.method37(var0, var1, var2, var17, (class236)var29, (class236)null, class74.field868[var4], 0, var20, var22);
                  if (var9.field1907) {
                     if (var4 == 0) {
                        class431.field3603[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        class431.field3603[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        class431.field3603[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        class431.field3603[var0][var1][var2] = 50;
                     }
                  }

                  if (0 != var9.field1875 && var7 != null) {
                     var7.method1887(var1, var2, var5, var4, var9.field1888);
                  }

               } else if (var5 == 9) {
                  if (var9.field1886 == -1 && var9.field1903 == null) {
                     var29 = var9.method919(var5, var4, var16, var18, var17, var19);
                  } else {
                     var29 = new class479(var3, var5, var4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                  }

                  var6.method39(var0, var1, var2, var17, 1, 1, (class236)var29, 0, var20, var22);
                  if (0 != var9.field1875 && null != var7) {
                     var7.method1897(var1, var2, var10, var11, var9.field1888);
                  }

                  if (16 != var9.field1887) {
                     var6.method44(var0, var1, var2, var9.field1887);
                  }

               } else if (var5 == 4) {
                  if (var9.field1886 == -1 && var9.field1903 == null) {
                     var29 = var9.method919(4, var4, var16, var18, var17, var19);
                  } else {
                     var29 = new class479(var3, 4, var4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                  }

                  var6.method38(var0, var1, var2, var17, (class236)var29, (class236)null, class74.field864[var4], 0, 0, 0, var20, var22);
               } else {
                  long var31;
                  Object var33;
                  if (var5 == 5) {
                     var30 = 16;
                     var31 = var6.method83(var0, var1, var2);
                     if (var31 != 0L) {
                        var30 = class212.method1110(class7.method24(var31)).field1887;
                     }

                     if (-1 == var9.field1886 && var9.field1903 == null) {
                        var33 = var9.method919(4, var4, var16, var18, var17, var19);
                     } else {
                        var33 = new class479(var3, 4, var4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                     }

                     var6.method38(var0, var1, var2, var17, (class236)var33, (class236)null, class74.field864[var4], 0, var30 * class74.field867[var4], var30 * class74.field861[var4], var20, var22);
                  } else if (var5 == 6) {
                     var30 = 8;
                     var31 = var6.method83(var0, var1, var2);
                     if (0L != var31) {
                        var30 = class212.method1110(class7.method24(var31)).field1887 / 2;
                     }

                     if (-1 == var9.field1886 && var9.field1903 == null) {
                        var33 = var9.method919(4, var4 + 4, var16, var18, var17, var19);
                     } else {
                        var33 = new class479(var3, 4, var4 + 4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                     }

                     var6.method38(var0, var1, var2, var17, (class236)var33, (class236)null, 256, var4, var30 * class74.field869[var4], var30 * class74.field857[var4], var20, var22);
                  } else if (var5 == 7) {
                     var24 = var4 + 2 & 3;
                     if (var9.field1886 == -1 && var9.field1903 == null) {
                        var29 = var9.method919(4, var24 + 4, var16, var18, var17, var19);
                     } else {
                        var29 = new class479(var3, 4, var24 + 4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                     }

                     var6.method38(var0, var1, var2, var17, (class236)var29, (class236)null, 256, var24, 0, 0, var20, var22);
                  } else if (var5 == 8) {
                     var30 = 8;
                     var31 = var6.method83(var0, var1, var2);
                     if (0L != var31) {
                        var30 = class212.method1110(class7.method24(var31)).field1887 / 2;
                     }

                     int var28 = var4 + 2 & 3;
                     Object var27;
                     if (var9.field1886 == -1 && var9.field1903 == null) {
                        var33 = var9.method919(4, var4 + 4, var16, var18, var17, var19);
                        var27 = var9.method919(4, var28 + 4, var16, var18, var17, var19);
                     } else {
                        var33 = new class479(var3, 4, var4 + 4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                        var27 = new class479(var3, 4, var28 + 4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
                     }

                     var6.method38(var0, var1, var2, var17, (class236)var33, (class236)var27, 256, var4, class74.field869[var4] * var30, var30 * class74.field857[var4], var20, var22);
                  }
               }
            }
         } else {
            if (-1 == var9.field1886 && null == var9.field1903) {
               var29 = var9.method919(10, var4, var16, var18, var17, var19);
            } else {
               var29 = new class479(var3, 10, var4, var0, var1, var2, var9.field1886, var9.field1895, (class236)null);
            }

            if (null != var29 && var6.method39(var0, var1, var2, var17, var10, var11, (class236)var29, var5 == 11 ? 256 : 0, var20, var22) && var9.field1907) {
               var24 = 15;
               if (var29 instanceof class491) {
                  var24 = ((class491)var29).method2360() / 4;
                  if (var24 > 30) {
                     var24 = 30;
                  }
               }

               for(var25 = 0; var25 <= var10; ++var25) {
                  for(int var26 = 0; var26 <= var11; ++var26) {
                     if (var24 > class431.field3603[var0][var1 + var25][var26 + var2]) {
                        class431.field3603[var0][var1 + var25][var2 + var26] = (byte)var24;
                     }
                  }
               }
            }

            if (0 != var9.field1875 && null != var7) {
               var7.method1897(var1, var2, var10, var11, var9.field1888);
            }

         }
      }
   }

   static void method860(String var0) {
      class243.field2593 = var0;

      try {
         String var2 = class140.field1508.getParameter(Integer.toString(18));
         String var3 = class140.field1508.getParameter(Integer.toString(13));
         String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
         if (var0.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var4 = var4 + "; Expires=" + class143.method777(class154.method814() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         class178.method936(class140.field1508, "document.cookie=\"" + var4 + "\"");
      } catch (Throwable var5) {
         ;
      }

   }
}
