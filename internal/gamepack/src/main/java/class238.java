@ObfInfo(
   name = "cs"
)
public class class238 implements Runnable {
   @ObfInfo(
      owner = "cs",
      name = "hv",
      desc = "Lpz;"
   )
   static class180 field2014;
   @ObfInfo(
      owner = "cs",
      name = "h",
      desc = "Z"
   )
   boolean field2010 = true;
   @ObfInfo(
      owner = "cs",
      name = "v",
      desc = "I"
   )
   int field2015 = 0;
   @ObfInfo(
      owner = "cs",
      name = "x",
      desc = "[I"
   )
   int[] field2011 = new int[500];
   @ObfInfo(
      owner = "cs",
      name = "m",
      desc = "[I"
   )
   int[] field2012 = new int[500];
   @ObfInfo(
      owner = "cs",
      name = "e",
      desc = "Ljava/lang/Object;"
   )
   Object field2009 = new Object();
   @ObfInfo(
      owner = "cs",
      name = "q",
      desc = "[J"
   )
   long[] field2013 = new long[500];

   @ObfInfo(
      owner = "cs",
      name = "run",
      desc = "()V"
   )
   public void run() {
      for(; this.field2010; class286.method1421(50L)) {
         Object var1 = this.field2009;
         synchronized(this.field2009) {
            if (this.field2015 < 500) {
               this.field2011[this.field2015] = class466.field3863;
               this.field2012[this.field2015] = class466.field3858;
               this.field2013[this.field2015] = class466.field3865;
               ++this.field2015;
            }
         }
      }

   }

   @ObfInfo(
      owner = "cs",
      name = "e",
      desc = "(IB)Ljava/lang/String;"
   )
   static String method1032(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ObfInfo(
      owner = "cs",
      name = "p",
      desc = "(ILbm;ZI)I"
   )
   static int method1031(int var0, class461 var1, boolean var2) {
      class120 var4;
      if (var0 == 2700) {
         var4 = class67.method299(class386.field3248[--class161.field1227]);
         class386.field3248[++class161.field1227 - 1] = var4.field898;
         return 1;
      } else if (var0 == 2701) {
         var4 = class67.method299(class386.field3248[--class161.field1227]);
         if (var4.field898 != -1) {
            class386.field3248[++class161.field1227 - 1] = var4.field1028;
         } else {
            class386.field3248[++class161.field1227 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var6 = class386.field3248[--class161.field1227];
         class415 var5 = (class415)client.field394.method791((long)var6);
         if (null != var5) {
            class386.field3248[++class161.field1227 - 1] = 1;
         } else {
            class386.field3248[++class161.field1227 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2706) {
         class386.field3248[++class161.field1227 - 1] = client.field393;
         return 1;
      } else if (var0 == 2707) {
         var4 = class67.method299(class386.field3248[--class161.field1227]);
         class386.field3248[++class161.field1227 - 1] = var4.method488() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var4 = class67.method299(class386.field3248[--class161.field1227]);
         return class102.method412(var4);
      } else if (var0 == 2709) {
         var4 = class67.method299(class386.field3248[--class161.field1227]);
         return class397.method1958(var4);
      } else {
         return 2;
      }
   }

   @ObfInfo(
      owner = "cs",
      name = "lv",
      desc = "(IB)V"
   )
   static final void method1033(int var0) {
      class480.method2369();
      class431.method2127();
      int var2 = class342.method1738(var0).field698;
      if (var2 != 0) {
         int var3 = class291.field2373[var0];
         if (var2 == 1) {
            if (var3 == 1) {
               class229.method998(0.9D);
            }

            if (var3 == 2) {
               class229.method998(0.8D);
            }

            if (var3 == 3) {
               class229.method998(0.7D);
            }

            if (var3 == 4) {
               class229.method998(0.6D);
            }
         }

         if (var2 == 3) {
            if (var3 == 0) {
               class72.method314(255);
            }

            if (var3 == 1) {
               class72.method314(192);
            }

            if (var3 == 2) {
               class72.method314(128);
            }

            if (var3 == 3) {
               class72.method314(64);
            }

            if (var3 == 4) {
               class72.method314(0);
            }
         }

         if (var2 == 4) {
            if (var3 == 0) {
               class472.method2331(127);
            }

            if (var3 == 1) {
               class472.method2331(96);
            }

            if (var3 == 2) {
               class472.method2331(64);
            }

            if (var3 == 3) {
               class472.method2331(32);
            }

            if (var3 == 4) {
               class472.method2331(0);
            }
         }

         if (var2 == 5) {
            client.field311 = var3 == 1;
         }

         if (var2 == 6) {
            client.field397 = var3;
         }

         if (var2 == 9) {
            client.field398 = var3;
         }

         if (var2 == 10) {
            if (var3 == 0) {
               class362.method1807(127);
            }

            if (var3 == 1) {
               class362.method1807(96);
            }

            if (var3 == 2) {
               class362.method1807(64);
            }

            if (var3 == 3) {
               class362.method1807(32);
            }

            if (var3 == 4) {
               class362.method1807(0);
            }
         }

         if (var2 == 17) {
            client.field413 = var3 & '\uffff';
         }

         class483[] var4;
         if (var2 == 18) {
            var4 = new class483[]{class483.field4028, class483.field4022, class483.field4024, class483.field4026, class483.field4025};
            client.field246 = (class483)class2.method10(var4, var3);
            if (null == client.field246) {
               client.field246 = class483.field4028;
            }
         }

         if (var2 == 19) {
            if (var3 == -1) {
               client.field359 = -1;
            } else {
               client.field359 = var3 & 2047;
            }
         }

         if (var2 == 22) {
            var4 = new class483[]{class483.field4028, class483.field4022, class483.field4024, class483.field4026, class483.field4025};
            client.field467 = (class483)class2.method10(var4, var3);
            if (client.field467 == null) {
               client.field467 = class483.field4028;
            }
         }

      }
   }
}
