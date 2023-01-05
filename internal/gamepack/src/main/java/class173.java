public class class173 extends class108 {
   public static class31 field1865 = new class31(4096);
   public static class31 field1867 = new class31(30);
   public static class31 field1868 = new class31(30);
   public static class31 field1894 = new class31(500);
   static boolean field1876 = false;
   static class164 field1864;
   static class311[] field1869 = new class311[4];
   boolean field1884;
   boolean field1893;
   boolean field1898;
   class376 field1889;
   int field1863;
   int field1866;
   int field1880;
   int field1881;
   int field1896;
   int field1897;
   int field1900;
   int field1904;
   int field1905;
   int field1911;
   int field1913;
   int[] field1872;
   int[] field1912;
   short[] field1874;
   short[] field1877;
   short[] field1885;
   short[] field1906;
   public boolean field1888;
   public boolean field1895;
   public boolean field1899;
   public boolean field1901;
   public boolean field1907;
   public int field1870;
   public int field1875;
   public int field1878;
   public int field1879;
   public int field1882;
   public int field1883;
   public int field1886;
   public int field1887;
   public int field1891;
   public int field1892;
   public int field1902;
   public int field1908;
   public int field1909;
   public int field1910;
   public int[] field1871;
   public int[] field1903;
   public String field1873;
   public String[] field1890;

   class173() {
      this.field1873 = class96.field1020;
      this.field1878 = 1;
      this.field1879 = 1;
      this.field1875 = 2;
      this.field1888 = true;
      this.field1882 = -1;
      this.field1863 = -1;
      this.field1884 = false;
      this.field1899 = false;
      this.field1886 = -1;
      this.field1887 = 16;
      this.field1881 = 0;
      this.field1911 = 0;
      this.field1890 = new String[5];
      this.field1891 = -1;
      this.field1883 = -1;
      this.field1893 = false;
      this.field1907 = true;
      this.field1913 = 128;
      this.field1896 = 128;
      this.field1897 = 128;
      this.field1880 = 0;
      this.field1866 = 0;
      this.field1900 = 0;
      this.field1901 = false;
      this.field1898 = false;
      this.field1902 = -1;
      this.field1904 = -1;
      this.field1905 = -1;
      this.field1910 = -1;
      this.field1892 = 0;
      this.field1908 = 0;
      this.field1909 = 0;
      this.field1895 = true;
   }

   void method918() {
      if (this.field1882 == -1) {
         this.field1882 = 0;
         if (this.field1912 != null && (this.field1872 == null || 10 == this.field1872[0])) {
            this.field1882 = 1;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if (this.field1890[var2] != null) {
               this.field1882 = 1;
            }
         }
      }

      if (-1 == this.field1902) {
         this.field1902 = 0 != this.field1875 ? 1 : 0;
      }

   }

   void method915(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method916(var1, var3);
      }
   }

   void method916(class134 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method669();
         if (var4 > 0) {
            if (null != this.field1912 && !field1876) {
               var1.field1487 += var4 * 3;
            } else {
               this.field1872 = new int[var4];
               this.field1912 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field1912[var5] = var1.method671();
                  this.field1872[var5] = var1.method669();
               }
            }
         }
      } else if (var2 == 2) {
         this.field1873 = var1.method677();
      } else if (var2 == 5) {
         var4 = var1.method669();
         if (var4 > 0) {
            if (this.field1912 != null && !field1876) {
               var1.field1487 += var4 * 2;
            } else {
               this.field1872 = null;
               this.field1912 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field1912[var5] = var1.method671();
               }
            }
         }
      } else if (var2 == 14) {
         this.field1878 = var1.method669();
      } else if (var2 == 15) {
         this.field1879 = var1.method669();
      } else if (var2 == 17) {
         this.field1875 = 0;
         this.field1888 = false;
      } else if (var2 == 18) {
         this.field1888 = false;
      } else if (var2 == 19) {
         this.field1882 = var1.method669();
      } else if (var2 == 21) {
         this.field1863 = 0;
      } else if (var2 == 22) {
         this.field1884 = true;
      } else if (var2 == 23) {
         this.field1899 = true;
      } else if (var2 == 24) {
         this.field1886 = var1.method671();
         if (this.field1886 == 65535) {
            this.field1886 = -1;
         }
      } else if (var2 == 27) {
         this.field1875 = 1;
      } else if (var2 == 28) {
         this.field1887 = var1.method669();
      } else if (var2 == 29) {
         this.field1881 = var1.method670();
      } else if (var2 == 39) {
         this.field1911 = var1.method670() * 25;
      } else if (var2 >= 30 && var2 < 35) {
         this.field1890[var2 - 30] = var1.method677();
         if (this.field1890[var2 - 30].equalsIgnoreCase(class96.field1021)) {
            this.field1890[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.method669();
         this.field1874 = new short[var4];
         this.field1885 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1874[var5] = (short)var1.method671();
            this.field1885[var5] = (short)var1.method671();
         }
      } else if (var2 == 41) {
         var4 = var1.method669();
         this.field1906 = new short[var4];
         this.field1877 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1906[var5] = (short)var1.method671();
            this.field1877[var5] = (short)var1.method671();
         }
      } else if (var2 == 61) {
         var1.method671();
      } else if (var2 == 62) {
         this.field1893 = true;
      } else if (var2 == 64) {
         this.field1907 = false;
      } else if (var2 == 65) {
         this.field1913 = var1.method671();
      } else if (var2 == 66) {
         this.field1896 = var1.method671();
      } else if (var2 == 67) {
         this.field1897 = var1.method671();
      } else if (var2 == 68) {
         this.field1883 = var1.method671();
      } else if (var2 == 69) {
         var1.method669();
      } else if (var2 == 70) {
         this.field1880 = var1.method672();
      } else if (var2 == 71) {
         this.field1866 = var1.method672();
      } else if (var2 == 72) {
         this.field1900 = var1.method672();
      } else if (var2 == 73) {
         this.field1901 = true;
      } else if (var2 == 74) {
         this.field1898 = true;
      } else if (var2 == 75) {
         this.field1902 = var1.method669();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.field1910 = var1.method671();
            this.field1892 = var1.method669();
         } else if (var2 == 79) {
            this.field1908 = var1.method671();
            this.field1909 = var1.method671();
            this.field1892 = var1.method669();
            var4 = var1.method669();
            this.field1871 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1871[var5] = var1.method671();
            }
         } else if (var2 == 81) {
            this.field1863 = var1.method669() * 256;
         } else if (var2 == 82) {
            this.field1891 = var1.method671();
         } else if (var2 == 89) {
            this.field1895 = false;
         } else if (var2 == 249) {
            this.field1889 = class479.method2314(var1, this.field1889);
         }
      } else {
         this.field1904 = var1.method671();
         if (this.field1904 == 65535) {
            this.field1904 = -1;
         }

         this.field1905 = var1.method671();
         if (65535 == this.field1905) {
            this.field1905 = -1;
         }

         var4 = -1;
         if (var2 == 92) {
            var4 = var1.method671();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         var5 = var1.method669();
         this.field1903 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field1903[var6] = var1.method671();
            if (this.field1903[var6] == 65535) {
               this.field1903[var6] = -1;
            }
         }

         this.field1903[var5 + 1] = var4;
      }

   }

   public final boolean method917(int var1) {
      if (null != this.field1872) {
         for(int var5 = 0; var5 < this.field1872.length; ++var5) {
            if (this.field1872[var5] == var1) {
               return class414.field3555.method890(this.field1912[var5] & '\uffff', 0);
            }
         }

         return true;
      } else if (this.field1912 == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.field1912.length; ++var4) {
            var3 &= class414.field3555.method890(this.field1912[var4] & '\uffff', 0);
         }

         return var3;
      }
   }

   public final boolean method926() {
      if (null == this.field1912) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field1912.length; ++var3) {
            var2 &= class414.field3555.method890(this.field1912[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   public final class236 method919(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (null == this.field1872) {
         var8 = (long)((this.field1870 << 10) + var2);
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field1870 << 10));
      }

      Object var10 = (class236)field1867.method161(var8);
      if (var10 == null) {
         class311 var11 = this.method921(var1, var2);
         if (null == var11) {
            return null;
         }

         if (!this.field1884) {
            var10 = var11.method1507(64 + this.field1881, this.field1911 + 768, -50, -10, -50);
         } else {
            var11.field2953 = (short)(this.field1881 + 64);
            var11.field2961 = (short)(768 + this.field1911);
            var11.method1503();
            var10 = var11;
         }

         field1867.method163((class108)var10, var8);
      }

      if (this.field1884) {
         var10 = ((class311)var10).method1491();
      }

      if (this.field1863 >= 0) {
         if (var10 instanceof class491) {
            var10 = ((class491)var10).method2356(var3, var4, var5, var6, true, this.field1863);
         } else if (var10 instanceof class311) {
            var10 = ((class311)var10).method1493(var3, var4, var5, var6, true, this.field1863);
         }
      }

      return (class236)var10;
   }

   public final class491 method920(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (this.field1872 == null) {
         var8 = (long)((this.field1870 << 10) + var2);
      } else {
         var8 = (long)(var2 + (this.field1870 << 10) + (var1 << 3));
      }

      class491 var10 = (class491)field1868.method161(var8);
      if (var10 == null) {
         class311 var11 = this.method921(var1, var2);
         if (null == var11) {
            return null;
         }

         var10 = var11.method1507(this.field1881 + 64, 768 + this.field1911, -50, -10, -50);
         field1868.method163(var10, var8);
      }

      if (this.field1863 >= 0) {
         var10 = var10.method2356(var3, var4, var5, var6, true, this.field1863);
      }

      return var10;
   }

   public final class491 method914(int var1, int var2, int[][] var3, int var4, int var5, int var6, class79 var7, int var8) {
      long var10;
      if (this.field1872 == null) {
         var10 = (long)((this.field1870 << 10) + var2);
      } else {
         var10 = (long)(var2 + (var1 << 3) + (this.field1870 << 10));
      }

      class491 var12 = (class491)field1868.method161(var10);
      if (null == var12) {
         class311 var13 = this.method921(var1, var2);
         if (var13 == null) {
            return null;
         }

         var12 = var13.method1507(this.field1881 + 64, 768 + this.field1911, -50, -10, -50);
         field1868.method163(var12, var10);
      }

      if (var7 == null && this.field1863 == -1) {
         return var12;
      } else {
         if (null != var7) {
            var12 = var7.method424(var12, var8, var2);
         } else {
            var12 = var12.method2357(true);
         }

         if (this.field1863 >= 0) {
            var12 = var12.method2356(var3, var4, var5, var6, false, this.field1863);
         }

         return var12;
      }
   }

   final class311 method921(int var1, int var2) {
      class311 var4 = null;
      boolean var5;
      int var6;
      int var8;
      if (null == this.field1872) {
         if (var1 != 10) {
            return null;
         }

         if (null == this.field1912) {
            return null;
         }

         var5 = this.field1893;
         if (var1 == 2 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.field1912.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            var8 = this.field1912[var7];
            if (var5) {
               var8 += 65536;
            }

            var4 = (class311)field1894.method161((long)var8);
            if (null == var4) {
               var4 = class311.method1489(class414.field3555, var8 & '\uffff', 0);
               if (var4 == null) {
                  return null;
               }

               if (var5) {
                  var4.method1501();
               }

               field1894.method163(var4, (long)var8);
            }

            if (var6 > 1) {
               field1869[var7] = var4;
            }
         }

         if (var6 > 1) {
            var4 = new class311(field1869, var6);
         }
      } else {
         int var9 = -1;

         for(var6 = 0; var6 < this.field1872.length; ++var6) {
            if (var1 == this.field1872[var6]) {
               var9 = var6;
               break;
            }
         }

         if (var9 == -1) {
            return null;
         }

         var6 = this.field1912[var9];
         boolean var10 = this.field1893 ^ var2 > 3;
         if (var10) {
            var6 += 65536;
         }

         var4 = (class311)field1894.method161((long)var6);
         if (var4 == null) {
            var4 = class311.method1489(class414.field3555, var6 & '\uffff', 0);
            if (null == var4) {
               return null;
            }

            if (var10) {
               var4.method1501();
            }

            field1894.method163(var4, (long)var6);
         }
      }

      if (this.field1913 == 128 && this.field1896 == 128 && 128 == this.field1897) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var11;
      if (0 == this.field1880 && this.field1866 == 0 && this.field1900 == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      class311 var12 = new class311(var4, var2 == 0 && !var5 && !var11, null == this.field1874, null == this.field1906, true);
      if (var1 == 4 && var2 > 3) {
         var12.method1497(256);
         var12.method1498(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var12.method1495();
      } else if (var2 == 2) {
         var12.method1510();
      } else if (var2 == 3) {
         var12.method1496();
      }

      if (this.field1874 != null) {
         for(var8 = 0; var8 < this.field1874.length; ++var8) {
            var12.method1499(this.field1874[var8], this.field1885[var8]);
         }
      }

      if (this.field1906 != null) {
         for(var8 = 0; var8 < this.field1906.length; ++var8) {
            var12.method1500(this.field1906[var8], this.field1877[var8]);
         }
      }

      if (var5) {
         var12.method1502(this.field1913, this.field1896, this.field1897);
      }

      if (var11) {
         var12.method1498(this.field1880, this.field1866, this.field1900);
      }

      return var12;
   }

   public final class173 method925() {
      int var2 = -1;
      if (-1 != this.field1904) {
         var2 = class274.method1302(this.field1904);
      } else if (-1 != this.field1905) {
         var2 = class484.field3992[this.field1905];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field1903.length - 1) {
         var3 = this.field1903[var2];
      } else {
         var3 = this.field1903[this.field1903.length - 1];
      }

      return var3 != -1 ? class212.method1110(var3) : null;
   }

   public int method922(int var1, int var2) {
      return class175.method933(this.field1889, var1, var2);
   }

   public String method923(int var1, String var2) {
      class376 var5 = this.field1889;
      String var4;
      if (null == var5) {
         var4 = var2;
      } else {
         class232 var6 = (class232)var5.method1794((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field2518;
         }
      }

      return var4;
   }

   public boolean method924() {
      if (null == this.field1903) {
         return this.field1910 != -1 || this.field1871 != null;
      } else {
         for(int var2 = 0; var2 < this.field1903.length; ++var2) {
            if (this.field1903[var2] != -1) {
               class173 var3 = class212.method1110(this.field1903[var2]);
               if (var3.field1910 != -1 || null != var3.field1871) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static boolean method927(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
