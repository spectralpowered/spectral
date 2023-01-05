public class class159 extends class108 {
   boolean field1651;
   class360[][] field1650 = (class360[][])null;
   int field1652;
   int field1653 = 0;
   public class268 field1648;
   public class360[][] field1649 = (class360[][])null;

   public class159(class164 var1, class164 var2, int var3, boolean var4) {
      this.field1652 = var3;
      byte[] var5 = var1.method892(this.field1652 >> 16 & '\uffff', this.field1652 & '\uffff');
      class134 var6 = new class134(var5);
      int var7 = var6.method669();
      int var8 = var6.method671();
      byte[] var9;
      if (var4) {
         var9 = var2.method875(0, var8);
      } else {
         var9 = var2.method875(var8, 0);
      }

      this.field1648 = new class268(var8, var9);
      this.method838(var6, var7);
   }

   void method838(class134 var1, int var2) {
      var1.method671();
      var1.method671();
      this.field1653 = var1.method669();
      int var4 = var1.method671();
      this.field1650 = new class360[this.field1648.method1273().method1669()][];
      this.field1649 = new class360[this.field1648.method1274()][];

      for(int var5 = 0; var5 < var4; ++var5) {
         class293 var6 = class92.method506(var1.method669());
         int var7 = var1.method680();
         class467 var8 = class352.method1688(var1.method669());
         class360 var9 = new class360();
         var9.method1716(var1, var2);
         int var10 = var6.method1381();
         class360[][] var11;
         if (class293.field2812 == var6) {
            var11 = this.field1650;
         } else {
            var11 = this.field1649;
         }

         if (var11[var7] == null) {
            var11[var7] = new class360[var10];
         }

         var11[var7][var8.method2285()] = var9;
         if (class293.field2815 == var6) {
            this.field1651 = true;
         }
      }

   }

   public int method844() {
      return this.field1653;
   }

   public boolean method839() {
      return this.field1651;
   }

   public void method837(int var1, class292 var2, int var3, int var4) {
      class343 var6 = class411.method1996();
      this.method840(var6, var3, var2, var1);
      this.method842(var6, var3, var2, var1);
      this.method841(var6, var3, var2, var1);
      var2.method1374(var6);
      var6.method1653();
   }

   void method840(class343 var1, int var2, class292 var3, int var4) {
      float[] var6 = var3.method1375(this.field1653);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (null != this.field1650[var2]) {
         class360 var10 = this.field1650[var2][0];
         class360 var11 = this.field1650[var2][1];
         class360 var12 = this.field1650[var2][2];
         if (null != var10) {
            var7 = var10.method1722(var4);
         }

         if (var11 != null) {
            var8 = var11.method1722(var4);
         }

         if (var12 != null) {
            var9 = var12.method1722(var4);
         }
      }

      class336 var15 = class192.method992();
      var15.method1620(1.0F, 0.0F, 0.0F, var7);
      class336 var16 = class192.method992();
      var16.method1620(0.0F, 1.0F, 0.0F, var8);
      class336 var17 = class192.method992();
      var17.method1620(0.0F, 0.0F, 1.0F, var9);
      class336 var13 = class192.method992();
      var13.method1621(var17);
      var13.method1621(var15);
      var13.method1621(var16);
      class343 var14 = class411.method1996();
      var14.method1649(var13);
      var1.method1648(var14);
      var15.method1623();
      var16.method1623();
      var17.method1623();
      var13.method1623();
      var14.method1653();
   }

   void method841(class343 var1, int var2, class292 var3, int var4) {
      float[] var6 = var3.method1376(this.field1653);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (null != this.field1650[var2]) {
         class360 var10 = this.field1650[var2][3];
         class360 var11 = this.field1650[var2][4];
         class360 var12 = this.field1650[var2][5];
         if (var10 != null) {
            var7 = var10.method1722(var4);
         }

         if (var11 != null) {
            var8 = var11.method1722(var4);
         }

         if (null != var12) {
            var9 = var12.method1722(var4);
         }
      }

      var1.field3152[12] = var7;
      var1.field3152[13] = var8;
      var1.field3152[14] = var9;
   }

   void method842(class343 var1, int var2, class292 var3, int var4) {
      float[] var6 = var3.method1377(this.field1653);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (null != this.field1650[var2]) {
         class360 var10 = this.field1650[var2][6];
         class360 var11 = this.field1650[var2][7];
         class360 var12 = this.field1650[var2][8];
         if (null != var10) {
            var7 = var10.method1722(var4);
         }

         if (null != var11) {
            var8 = var11.method1722(var4);
         }

         if (var12 != null) {
            var9 = var12.method1722(var4);
         }
      }

      class343 var13 = class411.method1996();
      var13.method1647(var7, var8, var9);
      var1.method1648(var13);
      var13.method1653();
   }

   static class154 method843(int var0, int var1) {
      class365 var3 = (class365)class58.field812.get(var0);
      return var3.method1761(var1);
   }

   static final void method845() {
      for(int var1 = 0; var1 < client.field682; ++var1) {
         --client.field712[var1];
         if (client.field712[var1] >= -10) {
            class136 var10 = client.field492[var1];
            if (var10 == null) {
               class136 var10000 = (class136)null;
               var10 = class136.method728(class35.field350, client.field683[var1], 0);
               if (null == var10) {
                  continue;
               }

               client.field712[var1] += var10.method730();
               client.field492[var1] = var10;
            }

            if (client.field712[var1] < 0) {
               int var3;
               if (client.field538[var1] != 0) {
                  int var4 = (client.field538[var1] & 255) * 128;
                  int var5 = client.field538[var1] >> 16 & 255;
                  int var6 = 64 + var5 * 128 - class89.field982.field297;
                  if (var6 < 0) {
                     var6 = -var6;
                  }

                  int var7 = client.field538[var1] >> 8 & 255;
                  int var8 = var7 * 128 + 64 - class89.field982.field233;
                  if (var8 < 0) {
                     var8 = -var8;
                  }

                  int var9 = var8 + var6 - 128;
                  if (var9 > var4) {
                     client.field712[var1] = -100;
                     continue;
                  }

                  if (var9 < 0) {
                     var9 = 0;
                  }

                  var3 = (var4 - var9) * class111.field1385.method1345() / var4;
               } else {
                  var3 = class111.field1385.method1326();
               }

               if (var3 > 0) {
                  class388 var11 = var10.method729().method1884(class412.field3552);
                  class310 var12 = class310.method1449(var11, 100, var3);
                  var12.method1451(client.field684[var1] - 1);
                  class488.field4008.method1923(var12);
               }

               client.field712[var1] = -100;
            }
         } else {
            --client.field682;

            for(int var2 = var1; var2 < client.field682; ++var2) {
               client.field683[var2] = client.field683[var2 + 1];
               client.field492[var2] = client.field492[var2 + 1];
               client.field684[var2] = client.field684[var2 + 1];
               client.field712[var2] = client.field712[var2 + 1];
               client.field538[var2] = client.field538[var2 + 1];
            }

            --var1;
         }
      }

      if (client.field681 && !class15.method94()) {
         if (class111.field1385.method1325() != 0 && -1 != client.field680) {
            class377.method1796(class417.field3564, client.field680, 0, class111.field1385.method1325(), false);
         }

         client.field681 = false;
      }

   }

   static Object method846(int var0) {
      return class427.method2040((class180)class296.method1399(class180.method943(), var0));
   }
}
