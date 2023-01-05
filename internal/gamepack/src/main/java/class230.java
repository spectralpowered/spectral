import java.util.zip.CRC32;

public class class230 extends class164 {
   static CRC32 field2508 = new CRC32();
   boolean field2502 = false;
   boolean field2512 = false;
   class416 field2504;
   class416 field2506;
   int field2503;
   int field2505;
   int field2509;
   int field2511 = -1;
   volatile boolean[] field2507;
   volatile int field2510 = 0;

   public class230(class416 var1, class416 var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      super(var4, var5);
      this.field2506 = var1;
      this.field2504 = var2;
      this.field2505 = var3;
      this.field2502 = var6;
      this.field2512 = var7;
      class36.method184(this, this.field2505);
   }

   public boolean method1148() {
      return this.field2510 == 1;
   }

   public int method1149() {
      if (1 != this.field2510 && (!this.field2512 || this.field2510 != 2)) {
         if (super.field1707 != null) {
            return 99;
         } else {
            int var3 = this.field2505;
            long var4 = (long)(var3 + 16711680);
            int var2;
            if (class490.field4042 != null && class490.field4042.field1361 == var4) {
               var2 = class213.field2384.field1487 * 99 / (class213.field2384.field1489.length - class490.field4042.field2794) + 1;
            } else {
               var2 = 0;
            }

            int var6 = var2;
            if (var2 >= 100) {
               var6 = 99;
            }

            return var6;
         }
      } else {
         return 100;
      }
   }

   void method868(int var1) {
      int var3 = this.field2505;
      long var4 = (long)(var1 + (var3 << 16));
      class289 var6 = (class289)class475.field3952.method545(var4);
      if (var6 != null) {
         class475.field3947.method29(var6);
      }

   }

   void method877(int var1) {
      if (null != this.field2506 && this.field2507 != null && this.field2507[var1]) {
         class416 var3 = this.field2506;
         byte[] var5 = null;
         class397 var6 = class267.field2693;
         synchronized(class267.field2693) {
            for(class19 var7 = (class19)class267.field2693.method1934(); null != var7; var7 = (class19)class267.field2693.method1936()) {
               if ((long)var1 == var7.field1361 && var7.field145 == var3 && 0 == var7.field146) {
                  var5 = var7.field144;
                  break;
               }
            }
         }

         if (var5 != null) {
            this.method1151(var3, var1, var5, true);
         } else {
            byte[] var10 = var3.method2006(var1);
            this.method1151(var3, var1, var10, true);
         }
      } else {
         class212.method1106(this, this.field2505, var1, super.field1705[var1], (byte)2, true);
      }

   }

   void method1150() {
      this.field2510 = 2;
      super.field1699 = new int[0];
      super.field1705 = new int[0];
      super.field1700 = new int[0];
      super.field1709 = new int[0];
      super.field1704 = new int[0][];
      super.field1707 = new Object[0];
      super.field1708 = new Object[0][];
   }

   void method1159(int var1, int var2) {
      this.field2509 = var1;
      this.field2503 = var2;
      if (null != this.field2504) {
         int var4 = this.field2505;
         class416 var5 = this.field2504;
         byte[] var7 = null;
         class397 var8 = class267.field2693;
         synchronized(class267.field2693) {
            for(class19 var9 = (class19)class267.field2693.method1934(); var9 != null; var9 = (class19)class267.field2693.method1936()) {
               if (var9.field1361 == (long)var4 && var5 == var9.field145 && var9.field146 == 0) {
                  var7 = var9.field144;
                  break;
               }
            }
         }

         if (var7 != null) {
            this.method1151(var5, var4, var7, true);
         } else {
            byte[] var12 = var5.method2006(var4);
            this.method1151(var5, var4, var12, true);
         }
      } else {
         class212.method1106(this, 255, this.field2505, this.field2509, (byte)0, true);
      }

   }

   void method1156(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field2510 == 1) {
            throw new RuntimeException();
         }

         if (this.field2504 != null) {
            int var6 = this.field2505;
            class416 var7 = this.field2504;
            class19 var8 = new class19();
            var8.field146 = 0;
            var8.field1361 = (long)var6;
            var8.field144 = var2;
            var8.field145 = var7;
            class397 var9 = class267.field2693;
            synchronized(class267.field2693) {
               class267.field2693.method1930(var8);
            }

            class381.method1811();
         }

         this.method867(var2);
         this.method1157();
      } else {
         var2[var2.length - 2] = (byte)(super.field1700[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field1700[var1];
         if (null != this.field2506) {
            class416 var14 = this.field2506;
            class19 var16 = new class19();
            var16.field146 = 0;
            var16.field1361 = (long)var1;
            var16.field144 = var2;
            var16.field145 = var14;
            class397 var17 = class267.field2693;
            synchronized(class267.field2693) {
               class267.field2693.method1930(var16);
            }

            class381.method1811();
            this.field2507[var1] = true;
         }

         if (var4) {
            Object[] var15 = super.field1707;
            Object var18;
            if (var2 == null) {
               var18 = null;
            } else if (var2.length > 136) {
               class65 var19 = new class65();
               var19.method2096(var2);
               var18 = var19;
            } else {
               var18 = var2;
            }

            var15[var1] = var18;
         }
      }

   }

   public void method1151(class416 var1, int var2, byte[] var3, boolean var4) {
      int var6;
      if (var1 == this.field2504) {
         if (1 == this.field2510) {
            throw new RuntimeException();
         } else if (var3 == null) {
            class212.method1106(this, 255, this.field2505, this.field2509, (byte)0, true);
         } else {
            field2508.reset();
            field2508.update(var3, 0, var3.length);
            var6 = (int)field2508.getValue();
            if (var6 != this.field2509) {
               class212.method1106(this, 255, this.field2505, this.field2509, (byte)0, true);
            } else {
               class134 var12 = new class134(class48.method258(var3));
               int var13 = var12.method669();
               if (var13 != 5 && var13 != 6) {
                  throw new RuntimeException(var13 + "," + this.field2505 + "," + var2);
               } else {
                  int var9 = 0;
                  if (var13 >= 6) {
                     var9 = var12.method717();
                  }

                  if (var9 != this.field2503) {
                     class212.method1106(this, 255, this.field2505, this.field2509, (byte)0, true);
                  } else {
                     this.method867(var3);
                     this.method1157();
                  }
               }
            }
         }
      } else {
         if (!var4 && var2 == this.field2511) {
            this.field2510 = 1;
         }

         if (var3 != null && var3.length > 2) {
            field2508.reset();
            field2508.update(var3, 0, var3.length - 2);
            var6 = (int)field2508.getValue();
            int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if (var6 == super.field1705[var2] && var7 == super.field1700[var2]) {
               this.field2507[var2] = true;
               if (var4) {
                  Object[] var8 = super.field1707;
                  Object var10;
                  if (var3 == null) {
                     var10 = null;
                  } else if (var3.length > 136) {
                     class65 var11 = new class65();
                     var11.method2096(var3);
                     var10 = var11;
                  } else {
                     var10 = var3;
                  }

                  var8[var2] = var10;
               }

            } else {
               this.field2507[var2] = false;
               if (this.field2502 || var4) {
                  class212.method1106(this, this.field2505, var2, super.field1705[var2], (byte)2, var4);
               }

            }
         } else {
            this.field2507[var2] = false;
            if (this.field2502 || var4) {
               class212.method1106(this, this.field2505, var2, super.field1705[var2], (byte)2, var4);
            }

         }
      }
   }

   void method1157() {
      this.field2507 = new boolean[super.field1707.length];

      int var2;
      for(var2 = 0; var2 < this.field2507.length; ++var2) {
         this.field2507[var2] = false;
      }

      if (null == this.field2506) {
         this.field2510 = 1;
      } else {
         this.field2511 = -1;

         for(var2 = 0; var2 < this.field2507.length; ++var2) {
            if (super.field1709[var2] > 0) {
               class456.method2162(var2, this.field2506, this);
               this.field2511 = var2;
            }
         }

         if (-1 == this.field2511) {
            this.field2510 = 1;
         }

      }
   }

   int method873(int var1) {
      if (null != super.field1707[var1]) {
         return 100;
      } else if (this.field2507[var1]) {
         return 100;
      } else {
         int var4 = this.field2505;
         long var5 = (long)((var4 << 16) + var1);
         int var3;
         if (class490.field4042 != null && var5 == class490.field4042.field1361) {
            var3 = 1 + class213.field2384.field1487 * 99 / (class213.field2384.field1489.length - class490.field4042.field2794);
         } else {
            var3 = 0;
         }

         return var3;
      }
   }

   public boolean method1152(int var1) {
      return this.field2507[var1];
   }

   public boolean method1155(int var1) {
      return this.method878(var1) != null;
   }

   public int method1154() {
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < super.field1707.length; ++var4) {
         if (super.field1709[var4] > 0) {
            var2 += 100;
            var3 += this.method873(var4);
         }
      }

      if (var2 == 0) {
         return 100;
      } else {
         var4 = var3 * 100 / var2;
         return var4;
      }
   }

   static final boolean method1153(int var0, int var1) {
      class173 var3 = class212.method1110(var0);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var3.method917(var1);
   }

   static final void method1158(int var0, int var1) {
      if (null != client.field549[var0]) {
         if (var1 >= 0 && var1 < client.field549[var0].method587()) {
            class278 var3 = (class278)client.field549[var0].field1397.get(var1);
            if (var3.field2759 == -1) {
               class81 var4 = class189.method982(class165.field1724, client.field483.field3459);
               var4.field933.method666(3 + class444.method2117(var3.field2757.method928()));
               var4.field933.method666(var0);
               var4.field933.method655(var1);
               var4.field933.method660(var3.field2757.method928(), (byte)127);
               client.field483.method1920(var4);
            }
         }
      }
   }
}
