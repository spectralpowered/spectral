public class class334 implements Runnable {
   static class146 field3105;
   boolean field3101 = true;
   int field3106 = 0;
   int[] field3102 = new int[500];
   int[] field3103 = new int[500];
   Object field3100 = new Object();
   long[] field3104 = new long[500];

   public void run() {
      for(; this.field3101; class324.method1571(50L)) {
         Object var1 = this.field3100;
         synchronized(this.field3100) {
            if (this.field3106 < 500) {
               this.field3102[this.field3106] = class182.field1957;
               this.field3103[this.field3106] = class182.field1952;
               this.field3104[this.field3106] = class182.field1959;
               ++this.field3106;
            }
         }
      }

   }

   static String method1616(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   static int method1615(int var0, class472 var1, boolean var2) {
      class210 var4;
      if (var0 == 2700) {
         var4 = class274.method1301(class150.field1580[--class188.field1989]);
         class150.field1580[++class188.field1989 - 1] = var4.field2220;
         return 1;
      } else if (var0 == 2701) {
         var4 = class274.method1301(class150.field1580[--class188.field1989]);
         if (var4.field2220 != -1) {
            class150.field1580[++class188.field1989 - 1] = var4.field2350;
         } else {
            class150.field1580[++class188.field1989 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var6 = class150.field1580[--class188.field1989];
         class240 var5 = (class240)client.field598.method545((long)var6);
         if (null != var5) {
            class150.field1580[++class188.field1989 - 1] = 1;
         } else {
            class150.field1580[++class188.field1989 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2706) {
         class150.field1580[++class188.field1989 - 1] = client.field597;
         return 1;
      } else if (var0 == 2707) {
         var4 = class274.method1301(class150.field1580[--class188.field1989]);
         class150.field1580[++class188.field1989 - 1] = var4.method1079() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var4 = class274.method1301(class150.field1580[--class188.field1989]);
         return class36.method185(var4);
      } else if (var0 == 2709) {
         var4 = class274.method1301(class150.field1580[--class188.field1989]);
         return class298.method1410(var4);
      } else {
         return 2;
      }
   }

   static final void method1617(int var0) {
      class189.method981();
      class44.method228();
      int var2 = class329.method1594(var0).field2376;
      if (var2 != 0) {
         int var3 = class484.field3992[var0];
         if (var2 == 1) {
            if (var3 == 1) {
               class51.method292(0.9D);
            }

            if (var3 == 2) {
               class51.method292(0.8D);
            }

            if (var3 == 3) {
               class51.method292(0.7D);
            }

            if (var3 == 4) {
               class51.method292(0.6D);
            }
         }

         if (var2 == 3) {
            if (var3 == 0) {
               class291.method1368(255);
            }

            if (var3 == 1) {
               class291.method1368(192);
            }

            if (var3 == 2) {
               class291.method1368(128);
            }

            if (var3 == 3) {
               class291.method1368(64);
            }

            if (var3 == 4) {
               class291.method1368(0);
            }
         }

         if (var2 == 4) {
            if (var3 == 0) {
               class285.method1356(127);
            }

            if (var3 == 1) {
               class285.method1356(96);
            }

            if (var3 == 2) {
               class285.method1356(64);
            }

            if (var3 == 3) {
               class285.method1356(32);
            }

            if (var3 == 4) {
               class285.method1356(0);
            }
         }

         if (var2 == 5) {
            client.field515 = var3 == 1;
         }

         if (var2 == 6) {
            client.field601 = var3;
         }

         if (var2 == 9) {
            client.field602 = var3;
         }

         if (var2 == 10) {
            if (var3 == 0) {
               class304.method1438(127);
            }

            if (var3 == 1) {
               class304.method1438(96);
            }

            if (var3 == 2) {
               class304.method1438(64);
            }

            if (var3 == 3) {
               class304.method1438(32);
            }

            if (var3 == 4) {
               class304.method1438(0);
            }
         }

         if (var2 == 17) {
            client.field617 = var3 & '\uffff';
         }

         class34[] var4;
         if (var2 == 18) {
            var4 = new class34[]{class34.field335, class34.field329, class34.field331, class34.field333, class34.field332};
            client.field450 = (class34)class296.method1399(var4, var3);
            if (null == client.field450) {
               client.field450 = class34.field335;
            }
         }

         if (var2 == 19) {
            if (var3 == -1) {
               client.field563 = -1;
            } else {
               client.field563 = var3 & 2047;
            }
         }

         if (var2 == 22) {
            var4 = new class34[]{class34.field335, class34.field329, class34.field331, class34.field333, class34.field332};
            client.field671 = (class34)class296.method1399(var4, var3);
            if (client.field671 == null) {
               client.field671 = class34.field335;
            }
         }

      }
   }
}
