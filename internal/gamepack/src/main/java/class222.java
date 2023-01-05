import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

class class222 implements SSLSession {
   static int field2433;
   static String field2434;
   // $FF: synthetic field
   final class324 this$1;

   class222(class324 var1) {
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
      return this.this$1.field3042;
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

   public static final void method1140() {
      class245.field2601 = false;
      class245.field2608 = 0;
   }

   static final void method1139(int var0, int var1, int var2, int var3) {
      if (0 == client.field590 && !client.field592) {
         class82.method442(class96.field1186, "", 23, 0, var0 - var2, var1 - var3);
      }

      long var5 = -1L;
      long var7 = -1L;
      int var9 = 0;

      while(true) {
         int var11 = class245.field2608;
         if (var9 >= var11) {
            if (-1L != var5) {
               var9 = class278.method1307(var5);
               int var10 = (int)(var5 >>> 7 & 127L);
               class47 var27 = client.field551[client.field563];
               class200.method1010(var27, client.field563, var9, var10);
            }

            return;
         }

         long var12 = class245.field2606[var9];
         if (var7 != var12) {
            label306: {
               var7 = var12;
               int var16 = class137.method733(var9);
               long var19 = class245.field2606[var9];
               int var18 = (int)(var19 >>> 7 & 127L);
               var18 = var18;
               int var28 = class208.method1059(var9);
               int var20 = class260.method1255(var9);
               int var24;
               if (var28 == 2 && class13.field126.method77(class195.field2036, var16, var18, var12) >= 0) {
                  class173 var21 = class212.method1110(var20);
                  if (var21.field1903 != null) {
                     var21 = var21.method925();
                  }

                  if (null == var21) {
                     break label306;
                  }

                  class474 var22 = null;

                  for(class474 var23 = (class474)client.field654.method1934(); var23 != null; var23 = (class474)client.field654.method1936()) {
                     if (class195.field2036 == var23.field3934 && var16 == var23.field3930 && var18 == var23.field3941 && var23.field3937 == var20) {
                        var22 = var23;
                        break;
                     }
                  }

                  if (1 == client.field590) {
                     class82.method442(class96.field1181, client.field687 + " " + class389.field3436 + " " + class334.method1616(65535) + var21.field1873, 1, var20, var16, var18);
                  } else if (client.field592) {
                     if ((class269.field2703 & 4) == 4) {
                        class82.method442(client.field595, client.field714 + " " + class389.field3436 + " " + class334.method1616(65535) + var21.field1873, 2, var20, var16, var18);
                     }
                  } else {
                     String[] var33 = var21.field1890;
                     if (var33 != null) {
                        for(var24 = 4; var24 >= 0; --var24) {
                           if ((null == var22 || var22.method2298(var24)) && var33[var24] != null) {
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

                              class82.method442(var33[var24], class334.method1616(65535) + var21.field1873, var25, var20, var16, var18);
                           }
                        }
                     }

                     class82.method442(class96.field1233, class334.method1616(65535) + var21.field1873, 1002, var21.field1870, var16, var18);
                  }
               }

               int var32;
               class53 var34;
               int[] var35;
               class47 var39;
               if (var28 == 1) {
                  class53 var29 = client.field669[var20];
                  if (null == var29) {
                     break label306;
                  }

                  if (1 == var29.field798.field2720 && 64 == (var29.field297 & 127) && (var29.field233 & 127) == 64) {
                     for(var32 = 0; var32 < client.field479; ++var32) {
                        var34 = client.field669[client.field635[var32]];
                        if (null != var34 && var34 != var29 && 1 == var34.field798.field2720 && var34.field297 == var29.field297 && var29.field233 == var34.field233) {
                           class13.method86(var34, client.field635[var32], var16, var18);
                        }
                     }

                     var32 = class25.field180;
                     var35 = class25.field179;

                     for(var24 = 0; var24 < var32; ++var24) {
                        var39 = client.field551[var35[var24]];
                        if (var39 != null && var39.field297 == var29.field297 && var29.field233 == var39.field233) {
                           class200.method1010(var39, var35[var24], var16, var18);
                        }
                     }
                  }

                  class13.method86(var29, var20, var16, var18);
               }

               if (var28 == 0) {
                  class47 var30 = client.field551[var20];
                  if (null == var30) {
                     break label306;
                  }

                  if (64 == (var30.field297 & 127) && (var30.field233 & 127) == 64) {
                     for(var32 = 0; var32 < client.field479; ++var32) {
                        var34 = client.field669[client.field635[var32]];
                        if (null != var34 && var34.field798.field2720 == 1 && var30.field297 == var34.field297 && var30.field233 == var34.field233) {
                           class13.method86(var34, client.field635[var32], var16, var18);
                        }
                     }

                     var32 = class25.field180;
                     var35 = class25.field179;

                     for(var24 = 0; var24 < var32; ++var24) {
                        var39 = client.field551[var35[var24]];
                        if (var39 != null && var39 != var30 && var30.field297 == var39.field297 && var39.field233 == var30.field233) {
                           class200.method1010(var39, var35[var24], var16, var18);
                        }
                     }
                  }

                  if (client.field563 != var20) {
                     class200.method1010(var30, var20, var16, var18);
                  } else {
                     var5 = var12;
                  }
               }

               if (var28 == 3) {
                  class397 var31 = client.field564[class195.field2036][var16][var18];
                  if (null != var31) {
                     for(class327 var36 = (class327)var31.method1935(); var36 != null; var36 = (class327)var31.method1938()) {
                        class458 var37 = class272.method1294(var36.field3053);
                        if (1 == client.field590) {
                           class82.method442(class96.field1181, client.field687 + " " + class389.field3436 + " " + class334.method1616(16748608) + var37.field3764, 16, var36.field3053, var16, var18);
                        } else if (client.field592) {
                           if ((class269.field2703 & 1) == 1) {
                              class82.method442(client.field595, client.field714 + " " + class389.field3436 + " " + class334.method1616(16748608) + var37.field3764, 17, var36.field3053, var16, var18);
                           }
                        } else {
                           String[] var38 = var37.field3762;

                           for(int var40 = 4; var40 >= 0; --var40) {
                              if (var36.method1581(var40)) {
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

                                    class82.method442(var38[var40], class334.method1616(16748608) + var37.field3764, var26, var36.field3053, var16, var18);
                                 } else if (var40 == 2) {
                                    class82.method442(class96.field1266, class334.method1616(16748608) + var37.field3764, 20, var36.field3053, var16, var18);
                                 }
                              }
                           }

                           class82.method442(class96.field1233, class334.method1616(16748608) + var37.field3764, 1004, var36.field3053, var16, var18);
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
