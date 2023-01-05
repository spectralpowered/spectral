import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

class class391 implements SSLSession {
   static int field3279;
   static String field3280;
   // $FF: synthetic field
   final class286 this$1;

   class391(class286 var1) {
      this.this$1 = var1;
   }

   public int getApplicationBufferSize() {
      return 0;
   }

   public String getCipherSuite() {
      throw new UnsupportedOperationException();
   }

   public long getCreationTime() {
      throw new UnsupportedOperationException();
   }

   public byte[] getId() {
      throw new UnsupportedOperationException();
   }

   public long getLastAccessedTime() {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getLocalCertificates() {
      throw new UnsupportedOperationException();
   }

   public Principal getLocalPrincipal() {
      throw new UnsupportedOperationException();
   }

   public int getPacketBufferSize() {
      throw new UnsupportedOperationException();
   }

   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      return null;
   }

   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      return this.this$1.field2365;
   }

   public String getPeerHost() {
      throw new UnsupportedOperationException();
   }

   public int getPeerPort() {
      return 0;
   }

   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      return null;
   }

   public String getProtocol() {
      throw new UnsupportedOperationException();
   }

   public SSLSessionContext getSessionContext() {
      throw new UnsupportedOperationException();
   }

   public Object getValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public String[] getValueNames() {
      throw new UnsupportedOperationException();
   }

   public void invalidate() {
      throw new UnsupportedOperationException();
   }

   public boolean isValid() {
      throw new UnsupportedOperationException();
   }

   public void putValue(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public void removeValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public static final void method1916() {
      class105.field809 = false;
      class105.field816 = 0;
   }

   static final void method1915(int var0, int var1, int var2, int var3) {
      if (0 == client.field386 && !client.field388) {
         class156.method721(class177.field1491, "", 23, 0, var0 - var2, var1 - var3);
      }

      long var5 = -1L;
      long var7 = -1L;
      int var9 = 0;

      while(true) {
         int var11 = class105.field816;
         if (var9 >= var11) {
            if (-1L != var5) {
               var9 = class49.method251(var5);
               int var10 = (int)(var5 >>> 7 & 127L);
               class380 var27 = client.field347[client.field359];
               class346.method1753(var27, client.field359, var9, var10);
            }

            return;
         }

         long var12 = class105.field814[var9];
         if (var7 != var12) {
            label306: {
               var7 = var12;
               int var16 = class306.method1492(var9);
               long var19 = class105.field814[var9];
               int var18 = (int)(var19 >>> 7 & 127L);
               var18 = var18;
               int var28 = class104.method417(var9);
               int var20 = class208.method905(var9);
               int var24;
               if (var28 == 2 && class408.field3415.method1607(class347.field2878, var16, var18, var12) >= 0) {
                  class87 var21 = class85.method356(var20);
                  if (var21.field745 != null) {
                     var21 = var21.method372();
                  }

                  if (null == var21) {
                     break label306;
                  }

                  class138 var22 = null;

                  for(class138 var23 = (class138)client.field450.method646(); var23 != null; var23 = (class138)client.field450.method648()) {
                     if (class347.field2878 == var23.field1122 && var16 == var23.field1118 && var18 == var23.field1129 && var23.field1125 == var20) {
                        var22 = var23;
                        break;
                     }
                  }

                  if (1 == client.field386) {
                     class156.method721(class177.field1486, client.field483 + " " + class442.field3664 + " " + class238.method1032(65535) + var21.field715, 1, var20, var16, var18);
                  } else if (client.field388) {
                     if ((class32.field177 & 4) == 4) {
                        class156.method721(client.field391, client.field510 + " " + class442.field3664 + " " + class238.method1032(65535) + var21.field715, 2, var20, var16, var18);
                     }
                  } else {
                     String[] var33 = var21.field732;
                     if (var33 != null) {
                        for(var24 = 4; var24 >= 0; --var24) {
                           if ((null == var22 || var22.method635(var24)) && var33[var24] != null) {
                              short var25 = 0;
                              if (var24 == 0) {
                                 var25 = 3;
                              }

                              if (var24 == 1) {
                                 var25 = 4;
                              }

                              if (var24 == 2) {
                                 var25 = 5;
                              }

                              if (var24 == 3) {
                                 var25 = 6;
                              }

                              if (var24 == 4) {
                                 var25 = 1001;
                              }

                              class156.method721(var33[var24], class238.method1032(65535) + var21.field715, var25, var20, var16, var18);
                           }
                        }
                     }

                     class156.method721(class177.field1538, class238.method1032(65535) + var21.field715, 1002, var21.field712, var16, var18);
                  }
               }

               int var32;
               class267 var34;
               int[] var35;
               class380 var39;
               if (var28 == 1) {
                  class267 var29 = client.field465[var20];
                  if (null == var29) {
                     break label306;
                  }

                  if (1 == var29.field2213.field3470 && 64 == (var29.field2672 & 127) && (var29.field2608 & 127) == 64) {
                     for(var32 = 0; var32 < client.field275; ++var32) {
                        var34 = client.field465[client.field431[var32]];
                        if (null != var34 && var34 != var29 && 1 == var34.field2213.field3470 && var34.field2672 == var29.field2672 && var29.field2608 == var34.field2608) {
                           class408.method2000(var34, client.field431[var32], var16, var18);
                        }
                     }

                     var32 = class268.field2221;
                     var35 = class268.field2220;

                     for(var24 = 0; var24 < var32; ++var24) {
                        var39 = client.field347[var35[var24]];
                        if (var39 != null && var39.field2672 == var29.field2672 && var29.field2608 == var39.field2608) {
                           class346.method1753(var39, var35[var24], var16, var18);
                        }
                     }
                  }

                  class408.method2000(var29, var20, var16, var18);
               }

               if (var28 == 0) {
                  class380 var30 = client.field347[var20];
                  if (null == var30) {
                     break label306;
                  }

                  if (64 == (var30.field2672 & 127) && (var30.field2608 & 127) == 64) {
                     for(var32 = 0; var32 < client.field275; ++var32) {
                        var34 = client.field465[client.field431[var32]];
                        if (null != var34 && var34.field2213.field3470 == 1 && var30.field2672 == var34.field2672 && var30.field2608 == var34.field2608) {
                           class408.method2000(var34, client.field431[var32], var16, var18);
                        }
                     }

                     var32 = class268.field2221;
                     var35 = class268.field2220;

                     for(var24 = 0; var24 < var32; ++var24) {
                        var39 = client.field347[var35[var24]];
                        if (var39 != null && var39 != var30 && var30.field2672 == var39.field2672 && var39.field2608 == var30.field2608) {
                           class346.method1753(var39, var35[var24], var16, var18);
                        }
                     }
                  }

                  if (client.field359 != var20) {
                     class346.method1753(var30, var20, var16, var18);
                  } else {
                     var5 = var12;
                  }
               }

               if (var28 == 3) {
                  class141 var31 = client.field360[class347.field2878][var16][var18];
                  if (null != var31) {
                     for(class402 var36 = (class402)var31.method647(); var36 != null; var36 = (class402)var31.method650()) {
                        class263 var37 = class423.method2062(var36.field3387);
                        if (1 == client.field386) {
                           class156.method721(class177.field1486, client.field483 + " " + class442.field3664 + " " + class238.method1032(16748608) + var37.field2147, 16, var36.field3387, var16, var18);
                        } else if (client.field388) {
                           if ((class32.field177 & 1) == 1) {
                              class156.method721(client.field391, client.field510 + " " + class442.field3664 + " " + class238.method1032(16748608) + var37.field2147, 17, var36.field3387, var16, var18);
                           }
                        } else {
                           String[] var38 = var37.field2145;

                           for(int var40 = 4; var40 >= 0; --var40) {
                              if (var36.method1986(var40)) {
                                 if (var38 != null && null != var38[var40]) {
                                    byte var26 = 0;
                                    if (var40 == 0) {
                                       var26 = 18;
                                    }

                                    if (var40 == 1) {
                                       var26 = 19;
                                    }

                                    if (var40 == 2) {
                                       var26 = 20;
                                    }

                                    if (var40 == 3) {
                                       var26 = 21;
                                    }

                                    if (var40 == 4) {
                                       var26 = 22;
                                    }

                                    class156.method721(var38[var40], class238.method1032(16748608) + var37.field2147, var26, var36.field3387, var16, var18);
                                 } else if (var40 == 2) {
                                    class156.method721(class177.field1571, class238.method1032(16748608) + var37.field2147, 20, var36.field3387, var16, var18);
                                 }
                              }
                           }

                           class156.method721(class177.field1538, class238.method1032(16748608) + var37.field2147, 1004, var36.field3387, var16, var18);
                        }
                     }
                  }
               }
            }
         }

         ++var9;
      }
   }
}
