public class class192 extends class108 {
   static class164 field1994;
   static class164 field2005;
   static class31 field1995 = new class31(64);
   static class31 field1996 = new class31(30);
   int field1997 = 128;
   int field1998;
   int field2001 = 0;
   int field2004 = 128;
   int field2006;
   int field2007 = 0;
   int field2008 = 0;
   short[] field1993;
   short[] field2000;
   short[] field2002;
   short[] field2003;
   public int field1999 = -1;

   void method989(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method986(var1, var3);
      }
   }

   void method986(class134 var1, int var2) {
      if (var2 == 1) {
         this.field1998 = var1.method671();
      } else if (var2 == 2) {
         this.field1999 = var1.method671();
      } else if (var2 == 4) {
         this.field1997 = var1.method671();
      } else if (var2 == 5) {
         this.field2004 = var1.method671();
      } else if (var2 == 6) {
         this.field2007 = var1.method671();
      } else if (var2 == 7) {
         this.field2001 = var1.method669();
      } else if (var2 == 8) {
         this.field2008 = var1.method669();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.method669();
            this.field2000 = new short[var4];
            this.field1993 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2000[var5] = (short)var1.method671();
               this.field1993[var5] = (short)var1.method671();
            }
         } else if (var2 == 41) {
            var4 = var1.method669();
            this.field2002 = new short[var4];
            this.field2003 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2002[var5] = (short)var1.method671();
               this.field2003[var5] = (short)var1.method671();
            }
         }
      }

   }

   public final class491 method988(int var1) {
      class491 var3 = (class491)field1996.method161((long)this.field2006);
      if (var3 == null) {
         class311 var4 = class311.method1489(field2005, this.field1998, 0);
         if (null == var4) {
            return null;
         }

         int var5;
         if (null != this.field2000) {
            for(var5 = 0; var5 < this.field2000.length; ++var5) {
               var4.method1499(this.field2000[var5], this.field1993[var5]);
            }
         }

         if (null != this.field2002) {
            for(var5 = 0; var5 < this.field2002.length; ++var5) {
               var4.method1500(this.field2002[var5], this.field2003[var5]);
            }
         }

         var3 = var4.method1507(64 + this.field2001, 850 + this.field2008, -30, -50, -30);
         field1996.method163(var3, (long)this.field2006);
      }

      class491 var6;
      if (this.field1999 != -1 && var1 != -1) {
         var6 = class242.method1218(this.field1999).method425(var3, var1);
      } else {
         var6 = var3.method2358(true);
      }

      if (this.field1997 != 128 || 128 != this.field2004) {
         var6.method2379(this.field1997, this.field2004, this.field1997);
      }

      if (0 != this.field2007) {
         if (this.field2007 == 90) {
            var6.method2366();
         }

         if (180 == this.field2007) {
            var6.method2366();
            var6.method2366();
         }

         if (this.field2007 == 270) {
            var6.method2366();
            var6.method2366();
            var6.method2366();
         }
      }

      return var6;
   }

   public static class167[] method987() {
      return new class167[]{class167.field1840, class167.field1829, class167.field1830, class167.field1841, class167.field1832, class167.field1836, class167.field1838, class167.field1834, class167.field1835, class167.field1828, class167.field1837, class167.field1831, class167.field1839, class167.field1833};
   }

   static void method990() {
      class111.field1382 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var4;
      for(byte var3 = 12; var1 < 16; var2 -= var3) {
         var4 = class463.method2275((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F));
         class111.field1382[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(int var6 = var2 / 6; var1 < class111.field1382.length; var2 -= var6) {
         var4 = var1 * 2;

         for(int var5 = class463.method2275((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class111.field1382.length; ++var1) {
            class111.field1382[var1] = var5;
         }
      }

   }

   public static class336 method992() {
      class336[] var1 = class336.field3109;
      synchronized(class336.field3109) {
         if (class336.field3112 == 0) {
            return new class336();
         } else {
            class336.field3109[--class336.field3112].method1622();
            return class336.field3109[class336.field3112];
         }
      }
   }

   static final int method991(int var0, int var1, int var2) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var2;
         if (var2 < 3 && 2 == (class74.field866[1][var4][var5] & 2)) {
            var6 = var2 + 1;
         }

         int var7 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = var7 * class74.field858[var6][var4 + 1][var5] + (128 - var7) * class74.field858[var6][var4][var5] >> 7;
         int var10 = class74.field858[var6][var4][var5 + 1] * (128 - var7) + var7 * class74.field858[var6][var4 + 1][var5 + 1] >> 7;
         return var9 * (128 - var8) + var8 * var10 >> 7;
      } else {
         return 0;
      }
   }
}
