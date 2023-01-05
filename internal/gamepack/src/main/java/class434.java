import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfInfo(
   name = "dl"
)
public abstract class class434 implements Runnable {
   @ObfInfo(
      owner = "dl",
      name = "x",
      desc = "I"
   )
   int field3597;
   @ObfInfo(
      owner = "dl",
      name = "v",
      desc = "Ljava/util/Queue;"
   )
   Queue field3599 = new LinkedList();
   @ObfInfo(
      owner = "dl",
      name = "h",
      desc = "Ljava/lang/Thread;"
   )
   final Thread field3600 = new Thread(this);
   @ObfInfo(
      owner = "dl",
      name = "e",
      desc = "Z"
   )
   volatile boolean field3598;

   @ObfInfo(
      owner = "dl",
      name = "<init>",
      desc = "(I)V"
   )
   class434(int var1) {
      this.field3600.setPriority(1);
      this.field3600.start();
      this.field3597 = var1;
   }

   @ObfInfo(
      owner = "dl",
      name = "h",
      desc = "(Ldm;I)V"
   )
   abstract void method2148(class140 var1) throws IOException;

   @ObfInfo(
      owner = "dl",
      name = "run",
      desc = "()V"
   )
   public void run() {
      while(!this.field3598) {
         try {
            class140 var1;
            synchronized(this) {
               var1 = (class140)this.field3599.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                     ;
                  }
                  continue;
               }
            }

            this.method2148(var1);
         } catch (Exception var7) {
            class445.method2199((String)null, var7);
         }
      }

   }

   @ObfInfo(
      owner = "dl",
      name = "e",
      desc = "(Ljava/net/URLConnection;I)V"
   )
   void method2149(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field3597);
   }

   @ObfInfo(
      owner = "dl",
      name = "v",
      desc = "(Ljava/net/URLConnection;Ldm;B)V"
   )
   void method2152(URLConnection var1, class140 var2) {
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
            byte[] var7 = class201.method884(5000);

            byte[] var9;
            for(int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
               var9 = new byte[var8 + var5.length];
               System.arraycopy(var5, 0, var9, 0, var5.length);
               System.arraycopy(var7, 0, var9, var5.length, var8);
            }

            class70.method308(var7);
         }

         var2.field1135 = var5;
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

   @ObfInfo(
      owner = "dl",
      name = "x",
      desc = "(Ljava/net/URL;B)Ldm;"
   )
   public class140 method2151(URL var1) {
      class140 var3 = new class140(var1);
      synchronized(this) {
         this.field3599.add(var3);
         this.notify();
         return var3;
      }
   }

   @ObfInfo(
      owner = "dl",
      name = "m",
      desc = "(I)V"
   )
   public void method2153() {
      this.field3598 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field3600.join();
      } catch (InterruptedException var5) {
         ;
      }

   }

   @ObfInfo(
      owner = "dl",
      name = "h",
      desc = "(B)V"
   )
   static void method2154() {
      for(class156 var1 = (class156)class156.field1200.method646(); var1 != null; var1 = (class156)class156.field1200.method648()) {
         if (var1.field1198 != null) {
            class197.field1739.method1066(var1.field1198);
            var1.field1198 = null;
         }

         if (var1.field1203 != null) {
            class197.field1739.method1066(var1.field1203);
            var1.field1203 = null;
         }
      }

      class156.field1200.method649();
   }

   @ObfInfo(
      owner = "dl",
      name = "h",
      desc = "(Lly;Lly;ZI)V"
   )
   public static void method2155(class274 var0, class274 var1, boolean var2) {
      class87.field706 = var0;
      class492.field4109 = var1;
      class87.field718 = var2;
   }

   @ObfInfo(
      owner = "dl",
      name = "j",
      desc = "(IIIIIILhc;Lgw;I)V"
   )
   static final void method2156(int var0, int var1, int var2, int var3, int var4, int var5, class318 var6, class427 var7) {
      if (!client.field274 || 0 != (class71.field644[0][var1][var2] & 2) || 0 == (class71.field644[var0][var1][var2] & 16)) {
         if (var0 < class71.field637) {
            class71.field637 = var0;
         }

         class87 var9 = class85.method356(var3);
         int var10;
         int var11;
         if (var4 != 1 && var4 != 3) {
            var10 = var9.field720;
            var11 = var9.field721;
         } else {
            var10 = var9.field721;
            var11 = var9.field720;
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

         int[][] var16 = class71.field636[var0];
         int var17 = var16[var12][var15] + var16[var13][var14] + var16[var12][var14] + var16[var13][var15] >> 2;
         int var18 = (var1 << 7) + (var10 << 6);
         int var19 = (var2 << 7) + (var11 << 6);
         long var20 = class214.method949(var1, var2, 2, 0 == var9.field724, var3);
         int var22 = (var4 << 6) + var5;
         if (1 == var9.field744) {
            var22 += 256;
         }

         int var24;
         int var25;
         if (var9.method371()) {
            class156 var23 = new class156();
            var23.field1196 = var0;
            var23.field1192 = var1 * 128;
            var23.field1190 = var2 * 128;
            var24 = var9.field720;
            var25 = var9.field721;
            if (var4 == 1 || var4 == 3) {
               var24 = var9.field721;
               var25 = var9.field720;
            }

            var23.field1193 = (var24 + var1) * 128;
            var23.field1195 = (var25 + var2) * 128;
            var23.field1197 = var9.field752;
            var23.field1199 = var9.field734 * 128;
            var23.field1194 = var9.field750;
            var23.field1191 = var9.field751;
            var23.field1201 = var9.field713;
            if (null != var9.field745) {
               var23.field1204 = var9;
               var23.method719();
            }

            class156.field1200.method642(var23);
            if (null != var23.field1201) {
               var23.field1202 = var23.field1194 + (int)(Math.random() * (double)(var23.field1191 - var23.field1194));
            }
         }

         Object var29;
         if (var5 == 22) {
            if (!client.field274 || var9.field724 != 0 || var9.field717 == 1 || var9.field743) {
               if (-1 == var9.field728 && var9.field745 == null) {
                  var29 = var9.method366(22, var4, var16, var18, var17, var19);
               } else {
                  var29 = new class89(var3, 22, var4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
               }

               var6.method1565(var0, var1, var2, var17, (class295)var29, var20, var22);
               if (1 == var9.field717 && var7 != null) {
                  var7.method2085(var1, var2);
               }

            }
         } else if (var5 != 10 && var5 != 11) {
            if (var5 >= 12) {
               if (var9.field728 == -1 && var9.field745 == null) {
                  var29 = var9.method366(var5, var4, var16, var18, var17, var19);
               } else {
                  var29 = new class89(var3, var5, var4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
               }

               var6.method1569(var0, var1, var2, var17, 1, 1, (class295)var29, 0, var20, var22);
               if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  class210.field1819[var0][var1][var2] |= 2340;
               }

               if (0 != var9.field717 && null != var7) {
                  var7.method2093(var1, var2, var10, var11, var9.field730);
               }

            } else if (var5 == 0) {
               if (var9.field728 == -1 && var9.field745 == null) {
                  var29 = var9.method366(0, var4, var16, var18, var17, var19);
               } else {
                  var29 = new class89(var3, 0, var4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
               }

               var6.method1567(var0, var1, var2, var17, (class295)var29, (class295)null, class71.field642[var4], 0, var20, var22);
               if (var4 == 0) {
                  if (var9.field749) {
                     class36.field182[var0][var1][var2] = 50;
                     class36.field182[var0][var1][var2 + 1] = 50;
                  }

                  if (var9.field741) {
                     class210.field1819[var0][var1][var2] |= 585;
                  }
               } else if (var4 == 1) {
                  if (var9.field749) {
                     class36.field182[var0][var1][var2 + 1] = 50;
                     class36.field182[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var9.field741) {
                     class210.field1819[var0][var1][var2 + 1] |= 1170;
                  }
               } else if (var4 == 2) {
                  if (var9.field749) {
                     class36.field182[var0][var1 + 1][var2] = 50;
                     class36.field182[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var9.field741) {
                     class210.field1819[var0][var1 + 1][var2] |= 585;
                  }
               } else if (var4 == 3) {
                  if (var9.field749) {
                     class36.field182[var0][var1][var2] = 50;
                     class36.field182[var0][var1 + 1][var2] = 50;
                  }

                  if (var9.field741) {
                     class210.field1819[var0][var1][var2] |= 1170;
                  }
               }

               if (0 != var9.field717 && var7 != null) {
                  var7.method2083(var1, var2, var5, var4, var9.field730);
               }

               if (var9.field729 != 16) {
                  var6.method1574(var0, var1, var2, var9.field729);
               }

            } else if (var5 == 1) {
               if (-1 == var9.field728 && var9.field745 == null) {
                  var29 = var9.method366(1, var4, var16, var18, var17, var19);
               } else {
                  var29 = new class89(var3, 1, var4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
               }

               var6.method1567(var0, var1, var2, var17, (class295)var29, (class295)null, class71.field646[var4], 0, var20, var22);
               if (var9.field749) {
                  if (var4 == 0) {
                     class36.field182[var0][var1][var2 + 1] = 50;
                  } else if (var4 == 1) {
                     class36.field182[var0][var1 + 1][var2 + 1] = 50;
                  } else if (var4 == 2) {
                     class36.field182[var0][var1 + 1][var2] = 50;
                  } else if (var4 == 3) {
                     class36.field182[var0][var1][var2] = 50;
                  }
               }

               if (0 != var9.field717 && null != var7) {
                  var7.method2083(var1, var2, var5, var4, var9.field730);
               }

            } else {
               int var30;
               if (var5 == 2) {
                  var30 = var4 + 1 & 3;
                  Object var32;
                  Object var34;
                  if (-1 == var9.field728 && null == var9.field745) {
                     var34 = var9.method366(2, var4 + 4, var16, var18, var17, var19);
                     var32 = var9.method366(2, var30, var16, var18, var17, var19);
                  } else {
                     var34 = new class89(var3, 2, var4 + 4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                     var32 = new class89(var3, 2, var30, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                  }

                  var6.method1567(var0, var1, var2, var17, (class295)var34, (class295)var32, class71.field642[var4], class71.field642[var30], var20, var22);
                  if (var9.field741) {
                     if (var4 == 0) {
                        class210.field1819[var0][var1][var2] |= 585;
                        class210.field1819[var0][var1][var2 + 1] |= 1170;
                     } else if (var4 == 1) {
                        class210.field1819[var0][var1][var2 + 1] |= 1170;
                        class210.field1819[var0][var1 + 1][var2] |= 585;
                     } else if (var4 == 2) {
                        class210.field1819[var0][var1 + 1][var2] |= 585;
                        class210.field1819[var0][var1][var2] |= 1170;
                     } else if (var4 == 3) {
                        class210.field1819[var0][var1][var2] |= 1170;
                        class210.field1819[var0][var1][var2] |= 585;
                     }
                  }

                  if (var9.field717 != 0 && null != var7) {
                     var7.method2083(var1, var2, var5, var4, var9.field730);
                  }

                  if (var9.field729 != 16) {
                     var6.method1574(var0, var1, var2, var9.field729);
                  }

               } else if (var5 == 3) {
                  if (-1 == var9.field728 && null == var9.field745) {
                     var29 = var9.method366(3, var4, var16, var18, var17, var19);
                  } else {
                     var29 = new class89(var3, 3, var4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                  }

                  var6.method1567(var0, var1, var2, var17, (class295)var29, (class295)null, class71.field646[var4], 0, var20, var22);
                  if (var9.field749) {
                     if (var4 == 0) {
                        class36.field182[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        class36.field182[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        class36.field182[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        class36.field182[var0][var1][var2] = 50;
                     }
                  }

                  if (0 != var9.field717 && var7 != null) {
                     var7.method2083(var1, var2, var5, var4, var9.field730);
                  }

               } else if (var5 == 9) {
                  if (var9.field728 == -1 && var9.field745 == null) {
                     var29 = var9.method366(var5, var4, var16, var18, var17, var19);
                  } else {
                     var29 = new class89(var3, var5, var4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                  }

                  var6.method1569(var0, var1, var2, var17, 1, 1, (class295)var29, 0, var20, var22);
                  if (0 != var9.field717 && null != var7) {
                     var7.method2093(var1, var2, var10, var11, var9.field730);
                  }

                  if (16 != var9.field729) {
                     var6.method1574(var0, var1, var2, var9.field729);
                  }

               } else if (var5 == 4) {
                  if (var9.field728 == -1 && var9.field745 == null) {
                     var29 = var9.method366(4, var4, var16, var18, var17, var19);
                  } else {
                     var29 = new class89(var3, 4, var4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                  }

                  var6.method1568(var0, var1, var2, var17, (class295)var29, (class295)null, class71.field642[var4], 0, 0, 0, var20, var22);
               } else {
                  long var31;
                  Object var33;
                  if (var5 == 5) {
                     var30 = 16;
                     var31 = var6.method1613(var0, var1, var2);
                     if (var31 != 0L) {
                        var30 = class85.method356(class174.method803(var31)).field729;
                     }

                     if (-1 == var9.field728 && var9.field745 == null) {
                        var33 = var9.method366(4, var4, var16, var18, var17, var19);
                     } else {
                        var33 = new class89(var3, 4, var4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                     }

                     var6.method1568(var0, var1, var2, var17, (class295)var33, (class295)null, class71.field642[var4], 0, var30 * class71.field645[var4], var30 * class71.field639[var4], var20, var22);
                  } else if (var5 == 6) {
                     var30 = 8;
                     var31 = var6.method1613(var0, var1, var2);
                     if (0L != var31) {
                        var30 = class85.method356(class174.method803(var31)).field729 / 2;
                     }

                     if (-1 == var9.field728 && var9.field745 == null) {
                        var33 = var9.method366(4, var4 + 4, var16, var18, var17, var19);
                     } else {
                        var33 = new class89(var3, 4, var4 + 4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                     }

                     var6.method1568(var0, var1, var2, var17, (class295)var33, (class295)null, 256, var4, var30 * class71.field647[var4], var30 * class71.field635[var4], var20, var22);
                  } else if (var5 == 7) {
                     var24 = var4 + 2 & 3;
                     if (var9.field728 == -1 && var9.field745 == null) {
                        var29 = var9.method366(4, var24 + 4, var16, var18, var17, var19);
                     } else {
                        var29 = new class89(var3, 4, var24 + 4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                     }

                     var6.method1568(var0, var1, var2, var17, (class295)var29, (class295)null, 256, var24, 0, 0, var20, var22);
                  } else if (var5 == 8) {
                     var30 = 8;
                     var31 = var6.method1613(var0, var1, var2);
                     if (0L != var31) {
                        var30 = class85.method356(class174.method803(var31)).field729 / 2;
                     }

                     int var28 = var4 + 2 & 3;
                     Object var27;
                     if (var9.field728 == -1 && var9.field745 == null) {
                        var33 = var9.method366(4, var4 + 4, var16, var18, var17, var19);
                        var27 = var9.method366(4, var28 + 4, var16, var18, var17, var19);
                     } else {
                        var33 = new class89(var3, 4, var4 + 4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                        var27 = new class89(var3, 4, var28 + 4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
                     }

                     var6.method1568(var0, var1, var2, var17, (class295)var33, (class295)var27, 256, var4, class71.field647[var4] * var30, var30 * class71.field635[var4], var20, var22);
                  }
               }
            }
         } else {
            if (-1 == var9.field728 && null == var9.field745) {
               var29 = var9.method366(10, var4, var16, var18, var17, var19);
            } else {
               var29 = new class89(var3, 10, var4, var0, var1, var2, var9.field728, var9.field737, (class295)null);
            }

            if (null != var29 && var6.method1569(var0, var1, var2, var17, var10, var11, (class295)var29, var5 == 11 ? 256 : 0, var20, var22) && var9.field749) {
               var24 = 15;
               if (var29 instanceof class470) {
                  var24 = ((class470)var29).method2301() / 4;
                  if (var24 > 30) {
                     var24 = 30;
                  }
               }

               for(var25 = 0; var25 <= var10; ++var25) {
                  for(int var26 = 0; var26 <= var11; ++var26) {
                     if (var24 > class36.field182[var0][var1 + var25][var26 + var2]) {
                        class36.field182[var0][var1 + var25][var2 + var26] = (byte)var24;
                     }
                  }
               }
            }

            if (0 != var9.field717 && null != var7) {
               var7.method2093(var1, var2, var10, var11, var9.field730);
            }

         }
      }
   }

   @ObfInfo(
      owner = "dl",
      name = "my",
      desc = "(Ljava/lang/String;B)V"
   )
   static void method2150(String var0) {
      class467.field3879 = var0;

      try {
         String var2 = class309.field2461.getParameter(Integer.toString(18));
         String var3 = class309.field2461.getParameter(Integer.toString(13));
         String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
         if (var0.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var4 = var4 + "; Expires=" + class25.method101(class152.method711() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         class273.method1338(class309.field2461, "document.cookie=\"" + var4 + "\"");
      } catch (Throwable var5) {
         ;
      }

   }
}
