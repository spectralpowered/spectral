import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class class120 extends class139 {
   public static boolean field892;
   static class255 field890;
   static class255 field891;
   static class274 field884;
   static class274 field913;
   static class99 field1020 = new class99(50);
   static class99 field888 = new class99(20);
   static class99 field889 = new class99(8);
   static class99 field943 = new class99(200);
   class16 field970;
   class277 field966;
   int field938;
   int field948;
   int field991;
   HashMap field968;
   HashMap field969;
   public boolean field1032;
   public boolean field1041;
   public boolean field1042;
   public boolean field1043;
   public boolean field1044;
   public boolean field893 = false;
   public boolean field910;
   public boolean field921 = false;
   public boolean field926;
   public boolean field934;
   public boolean field945 = false;
   public boolean field950;
   public boolean field951;
   public boolean field959;
   public boolean field961;
   public boolean field972;
   public boolean field977;
   public boolean field982;
   public byte[][] field973;
   public byte[][] field974;
   public class120 field979;
   public class120[] field1031;
   public class7 field939;
   public int field1008;
   public int field1010 = 1;
   public int field1011;
   public int field1017;
   public int field1018;
   public int field1023;
   public int field1024;
   public int field1026;
   public int field1028;
   public int field1029;
   public int field1030;
   public int field1034;
   public int field1035 = 0;
   public int field1036 = 0;
   public int field1038;
   public int field1039;
   public int field882;
   public int field883;
   public int field895 = -1;
   public int field897 = 0;
   public int field898;
   public int field899 = 0;
   public int field900 = 0;
   public int field901 = 0;
   public int field902 = 0;
   public int field903 = 0;
   public int field904 = 0;
   public int field906 = 0;
   public int field907 = 0;
   public int field908 = 0;
   public int field911 = 1;
   public int field912 = -1;
   public int field914 = 0;
   public int field915 = 0;
   public int field916 = 0;
   public int field917 = 0;
   public int field920 = 0;
   public int field922 = 0;
   public int field923;
   public int field924;
   public int field925;
   public int field927;
   public int field932;
   public int field933;
   public int field936;
   public int field940 = 0;
   public int field941;
   public int field942;
   public int field944;
   public int field946;
   public int field947;
   public int field949;
   public int field952;
   public int field953;
   public int field955;
   public int field956;
   public int field957;
   public int field958 = 0;
   public int field960;
   public int field967 = 0;
   public int field971;
   public int field975;
   public int field980;
   public int field985 = -1;
   public int field988;
   public int field990;
   public int field993 = 0;
   public int field996;
   public int field997;
   public int[] field1021;
   public int[] field1022;
   public int[] field1040;
   public int[] field881;
   public int[] field887;
   public int[] field896;
   public int[] field931;
   public int[] field937;
   public int[] field962;
   public int[] field964;
   public int[] field976;
   public int[] field981;
   public int[] field998;
   public int[][] field885;
   public Object[] field1001;
   public Object[] field1002;
   public Object[] field1003;
   public Object[] field1004;
   public Object[] field1005;
   public Object[] field1006;
   public Object[] field1007;
   public Object[] field1009;
   public Object[] field1012;
   public Object[] field1013;
   public Object[] field1014;
   public Object[] field1015;
   public Object[] field1016;
   public Object[] field1019;
   public Object[] field1027;
   public Object[] field1033;
   public Object[] field1037;
   public Object[] field880;
   public Object[] field886;
   public Object[] field905;
   public Object[] field909;
   public Object[] field918;
   public Object[] field919;
   public Object[] field928;
   public Object[] field930;
   public Object[] field935;
   public Object[] field963;
   public Object[] field984;
   public Object[] field986;
   public Object[] field987;
   public Object[] field989;
   public Object[] field992;
   public Object[] field994;
   public Object[] field999;
   public String field1000;
   public String field1025;
   public String field894;
   public String field929;
   public String field954;
   public String field983;
   public String field995;
   public String[] field965;
   public String[] field978;

   static {
      field890 = new class255(10, class237.field2007);
      field891 = new class255(10, class237.field2007);
      field892 = false;
   }

   public class120() {
      this.field939 = class7.field32;
      this.field1024 = 0;
      this.field924 = 0;
      this.field925 = 1;
      this.field926 = false;
      this.field927 = -1;
      this.field990 = -1;
      this.field883 = 0;
      this.field910 = false;
      this.field932 = 0;
      this.field997 = 0;
      this.field936 = 1;
      this.field955 = -1;
      this.field938 = 1;
      this.field991 = -1;
      this.field975 = -1;
      this.field941 = -1;
      this.field942 = 0;
      this.field1034 = 0;
      this.field960 = 0;
      this.field947 = 0;
      this.field946 = 0;
      this.field882 = 100;
      this.field1008 = 0;
      this.field949 = 0;
      this.field950 = false;
      this.field951 = false;
      this.field952 = 2;
      this.field953 = -1;
      this.field954 = "";
      this.field995 = "";
      this.field956 = 0;
      this.field957 = 0;
      this.field1018 = 0;
      this.field959 = false;
      this.field1011 = 0;
      this.field944 = 0;
      this.field948 = -1;
      this.field971 = 0;
      this.field972 = false;
      this.field894 = "";
      this.field979 = null;
      this.field980 = 0;
      this.field933 = 0;
      this.field982 = false;
      this.field983 = "";
      this.field977 = false;
      this.field1023 = -1;
      this.field1000 = "";
      this.field1025 = class177.field1327;
      this.field898 = -1;
      this.field1028 = 0;
      this.field1029 = 0;
      this.field1030 = 0;
      this.field1032 = false;
      this.field961 = false;
      this.field923 = -1;
      this.field996 = 0;
      this.field1017 = 0;
      this.field988 = 0;
      this.field1038 = -1;
      this.field1039 = -1;
      this.field1041 = false;
      this.field1042 = false;
      this.field1043 = false;
   }

   void method475(class127 var1) {
      this.field893 = false;
      this.field1026 = var1.method547();
      this.field897 = var1.method547();
      this.field993 = var1.method549();
      this.field902 = var1.method550();
      this.field903 = var1.method550();
      this.field904 = var1.method549();
      this.field922 = var1.method549();
      this.field1024 = var1.method547();
      this.field912 = var1.method549();
      if (this.field912 == 65535) {
         this.field912 = -1;
      } else {
         this.field912 += this.field985 & -65536;
      }

      this.field1023 = var1.method549();
      if (65535 == this.field1023) {
         this.field1023 = -1;
      }

      int var3 = var1.method547();
      int var4;
      if (var3 > 0) {
         this.field1021 = new int[var3];
         this.field1022 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field1021[var4] = var1.method547();
            this.field1022[var4] = var1.method549();
         }
      }

      var4 = var1.method547();
      int var5;
      int var6;
      int var7;
      if (var4 > 0) {
         this.field885 = new int[var4][];

         for(var5 = 0; var5 < var4; ++var5) {
            var6 = var1.method549();
            this.field885[var5] = new int[var6];

            for(var7 = 0; var7 < var6; ++var7) {
               this.field885[var5][var7] = var1.method549();
               if (65535 == this.field885[var5][var7]) {
                  this.field885[var5][var7] = -1;
               }
            }
         }
      }

      if (this.field1026 == 0) {
         this.field916 = var1.method549();
         this.field945 = var1.method547() == 1;
      }

      if (this.field1026 == 1) {
         var1.method549();
         var1.method547();
      }

      if (this.field1026 == 2) {
         this.field887 = new int[this.field922 * this.field904];
         this.field931 = new int[this.field904 * this.field922];
         var5 = var1.method547();
         if (var5 == 1) {
            this.field971 |= 268435456;
         }

         var6 = var1.method547();
         if (var6 == 1) {
            this.field971 |= 1073741824;
         }

         var7 = var1.method547();
         if (var7 == 1) {
            this.field971 |= Integer.MIN_VALUE;
         }

         int var8 = var1.method547();
         if (var8 == 1) {
            this.field971 |= 536870912;
         }

         this.field1011 = var1.method547();
         this.field944 = var1.method547();
         this.field962 = new int[20];
         this.field881 = new int[20];
         this.field964 = new int[20];

         int var9;
         for(var9 = 0; var9 < 20; ++var9) {
            int var10 = var1.method547();
            if (var10 == 1) {
               this.field962[var9] = var1.method550();
               this.field881[var9] = var1.method550();
               this.field964[var9] = var1.method595();
            } else {
               this.field964[var9] = -1;
            }
         }

         this.field965 = new String[5];

         for(var9 = 0; var9 < 5; ++var9) {
            String var12 = var1.method555();
            if (var12.length() > 0) {
               this.field965[var9] = var12;
               this.field971 |= 1 << var9 + 23;
            }
         }
      }

      if (this.field1026 == 3) {
         this.field921 = var1.method547() == 1;
      }

      if (4 == this.field1026 || this.field1026 == 1) {
         this.field957 = var1.method547();
         this.field1018 = var1.method547();
         this.field956 = var1.method547();
         this.field953 = var1.method549();
         if (65535 == this.field953) {
            this.field953 = -1;
         }

         this.field959 = var1.method547() == 1;
      }

      if (4 == this.field1026) {
         this.field954 = var1.method555();
         this.field995 = var1.method555();
      }

      if (this.field1026 == 1 || this.field1026 == 3 || 4 == this.field1026) {
         this.field917 = var1.method595();
      }

      if (3 == this.field1026 || this.field1026 == 4) {
         this.field1035 = var1.method595();
         this.field900 = var1.method595();
         this.field958 = var1.method595();
      }

      if (this.field1026 == 5) {
         this.field927 = var1.method595();
         this.field990 = var1.method595();
      }

      if (6 == this.field1026) {
         this.field936 = 1;
         this.field955 = var1.method549();
         if (this.field955 == 65535) {
            this.field955 = -1;
         }

         this.field938 = 1;
         this.field991 = var1.method549();
         if (65535 == this.field991) {
            this.field991 = -1;
         }

         this.field975 = var1.method549();
         if (65535 == this.field975) {
            this.field975 = -1;
         }

         this.field941 = var1.method549();
         if (65535 == this.field941) {
            this.field941 = -1;
         }

         this.field882 = var1.method549();
         this.field960 = var1.method549();
         this.field947 = var1.method549();
      }

      if (this.field1026 == 7) {
         this.field887 = new int[this.field904 * this.field922];
         this.field931 = new int[this.field904 * this.field922];
         this.field957 = var1.method547();
         this.field953 = var1.method549();
         if (this.field953 == 65535) {
            this.field953 = -1;
         }

         this.field959 = var1.method547() == 1;
         this.field917 = var1.method595();
         this.field1011 = var1.method550();
         this.field944 = var1.method550();
         var5 = var1.method547();
         if (var5 == 1) {
            this.field971 |= 1073741824;
         }

         this.field965 = new String[5];

         for(var6 = 0; var6 < 5; ++var6) {
            String var11 = var1.method555();
            if (var11.length() > 0) {
               this.field965[var6] = var11;
               this.field971 |= 1 << var6 + 23;
            }
         }
      }

      if (8 == this.field1026) {
         this.field954 = var1.method555();
      }

      if (this.field897 == 2 || this.field1026 == 2) {
         this.field983 = var1.method555();
         this.field1000 = var1.method555();
         var5 = var1.method549() & 63;
         this.field971 |= var5 << 11;
      }

      if (this.field897 == 1 || 4 == this.field897 || 5 == this.field897 || this.field897 == 6) {
         this.field1025 = var1.method555();
         if (this.field1025.length() == 0) {
            if (this.field897 == 1) {
               this.field1025 = class177.field1327;
            }

            if (4 == this.field897) {
               this.field1025 = class177.field1328;
            }

            if (5 == this.field897) {
               this.field1025 = class177.field1328;
            }

            if (this.field897 == 6) {
               this.field1025 = class177.field1329;
            }
         }
      }

      if (this.field897 == 1 || this.field897 == 4 || this.field897 == 5) {
         this.field971 |= 4194304;
      }

      if (this.field897 == 6) {
         this.field971 |= 1;
      }

   }

   void method494(class127 var1) {
      var1.method547();
      this.field893 = true;
      this.field1026 = var1.method547();
      this.field993 = var1.method549();
      this.field902 = var1.method550();
      this.field903 = var1.method550();
      this.field904 = var1.method549();
      if (this.field1026 == 9) {
         this.field922 = var1.method550();
      } else {
         this.field922 = var1.method549();
      }

      this.field899 = var1.method548();
      this.field901 = var1.method548();
      this.field940 = var1.method548();
      this.field1036 = var1.method548();
      this.field912 = var1.method549();
      if (this.field912 == 65535) {
         this.field912 = -1;
      } else {
         this.field912 += this.field985 & -65536;
      }

      this.field945 = var1.method547() == 1;
      if (0 == this.field1026) {
         this.field915 = var1.method549();
         this.field916 = var1.method549();
         this.field1041 = var1.method547() == 1;
      }

      if (5 == this.field1026) {
         this.field927 = var1.method595();
         this.field883 = var1.method549();
         this.field910 = var1.method547() == 1;
         this.field1024 = var1.method547();
         this.field932 = var1.method547();
         this.field997 = var1.method595();
         this.field934 = var1.method547() == 1;
         this.field1044 = var1.method547() == 1;
      }

      if (this.field1026 == 6) {
         this.field936 = 1;
         this.field955 = var1.method549();
         if (65535 == this.field955) {
            this.field955 = -1;
         }

         this.field942 = var1.method550();
         this.field1034 = var1.method550();
         this.field960 = var1.method549();
         this.field947 = var1.method549();
         this.field946 = var1.method549();
         this.field882 = var1.method549();
         this.field975 = var1.method549();
         if (65535 == this.field975) {
            this.field975 = -1;
         }

         this.field950 = var1.method547() == 1;
         var1.method549();
         if (0 != this.field899) {
            this.field1008 = var1.method549();
         }

         if (this.field901 != 0) {
            var1.method549();
         }
      }

      if (this.field1026 == 4) {
         this.field953 = var1.method549();
         if (this.field953 == 65535) {
            this.field953 = -1;
         }

         this.field954 = var1.method555();
         this.field956 = var1.method547();
         this.field957 = var1.method547();
         this.field1018 = var1.method547();
         this.field959 = var1.method547() == 1;
         this.field917 = var1.method595();
      }

      if (3 == this.field1026) {
         this.field917 = var1.method595();
         this.field921 = var1.method547() == 1;
         this.field1024 = var1.method547();
      }

      if (9 == this.field1026) {
         this.field925 = var1.method547();
         this.field917 = var1.method595();
         this.field926 = var1.method547() == 1;
      }

      this.field971 = var1.method551();
      this.field894 = var1.method555();
      int var3 = var1.method547();
      if (var3 > 0) {
         this.field978 = new String[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field978[var4] = var1.method555();
         }
      }

      this.field980 = var1.method547();
      this.field933 = var1.method547();
      this.field982 = var1.method547() == 1;
      this.field983 = var1.method555();
      this.field1027 = this.method474(var1);
      this.field986 = this.method474(var1);
      this.field992 = this.method474(var1);
      this.field909 = this.method474(var1);
      this.field984 = this.method474(var1);
      this.field935 = this.method474(var1);
      this.field886 = this.method474(var1);
      this.field999 = this.method474(var1);
      this.field1001 = this.method474(var1);
      this.field930 = this.method474(var1);
      this.field1033 = this.method474(var1);
      this.field919 = this.method474(var1);
      this.field987 = this.method474(var1);
      this.field928 = this.method474(var1);
      this.field989 = this.method474(var1);
      this.field1037 = this.method474(var1);
      this.field994 = this.method474(var1);
      this.field1004 = this.method474(var1);
      this.field998 = this.method477(var1);
      this.field937 = this.method477(var1);
      this.field896 = this.method477(var1);
   }

   Object[] method474(class127 var1) {
      int var3 = var1.method547();
      if (var3 == 0) {
         return null;
      } else {
         Object[] var4 = new Object[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = var1.method547();
            if (var6 == 0) {
               var4[var5] = new Integer(var1.method595());
            } else if (var6 == 1) {
               var4[var5] = var1.method555();
            }
         }

         this.field977 = true;
         return var4;
      }
   }

   int[] method477(class127 var1) {
      int var3 = var1.method547();
      if (var3 == 0) {
         return null;
      } else {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var1.method595();
         }

         return var4;
      }
   }

   public void method499(int var1, int var2) {
      int var4 = this.field887[var2];
      this.field887[var2] = this.field887[var1];
      this.field887[var1] = var4;
      var4 = this.field931[var2];
      this.field931[var2] = this.field931[var1];
      this.field931[var1] = var4;
   }

   public class266 method478(boolean var1, class434 var2) {
      field892 = false;
      if (null != this.field929) {
         class266 var4 = this.method479(var2);
         if (var4 != null) {
            return var4;
         }
      }

      int var8;
      if (var1) {
         var8 = this.field990;
      } else {
         var8 = this.field927;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((long)this.field932 << 36) + (long)var8 + ((this.field934 ? 1L : 0L) << 38) + ((this.field1044 ? 1L : 0L) << 39) + ((long)this.field997 << 40);
         class266 var7 = (class266)field943.method394(var5);
         if (null != var7) {
            return var7;
         } else {
            var7 = class84.method341(field913, var8, 0);
            if (var7 == null) {
               field892 = true;
               return null;
            } else {
               this.method476(var7);
               field943.method396(var7, var5);
               return var7;
            }
         }
      }
   }

   class266 method479(class434 var1) {
      if (!this.method480()) {
         return this.method497(var1);
      } else {
         String var3 = this.field929 + (this.field934 ? 1 : 0) + (this.field1044 ? 1 : 0) + this.field932 + this.field997;
         class266 var4 = (class266)field891.method1098(var3);
         if (null == var4) {
            class266 var5 = this.method497(var1);
            if (null != var5) {
               var4 = var5.method1223();
               this.method476(var4);
               field891.method1096(var3, var4);
            }
         }

         return var4;
      }
   }

   class266 method497(class434 var1) {
      if (this.field929 != null && var1 != null) {
         class102 var3 = (class102)field890.method1098(this.field929);
         if (var3 == null) {
            var3 = new class102(this.field929, var1);
            field890.method1096(this.field929, var3);
         }

         return var3.method408();
      } else {
         return null;
      }
   }

   boolean method480() {
      return this.field934 || this.field1044 || this.field932 != 0 || 0 != this.field997;
   }

   void method476(class266 var1) {
      if (this.field934) {
         var1.method1251();
      }

      if (this.field1044) {
         var1.method1227();
      }

      if (this.field932 > 0) {
         var1.method1226(this.field932);
      }

      if (this.field932 >= 1) {
         var1.method1228(1);
      }

      if (this.field932 >= 2) {
         var1.method1228(16777215);
      }

      if (0 != this.field997) {
         var1.method1253(this.field997);
      }

   }

   public class58 method505() {
      field892 = false;
      if (this.field953 == -1) {
         return null;
      } else {
         class58 var2 = (class58)field888.method394((long)this.field953);
         if (null != var2) {
            return var2;
         } else {
            var2 = class337.method1696(field913, class299.field2399, this.field953, 0);
            if (null != var2) {
               field888.method396(var2, (long)this.field953);
            } else {
               field892 = true;
            }

            return var2;
         }
      }
   }

   public class266 method482(int var1) {
      field892 = false;
      if (var1 >= 0 && var1 < this.field964.length) {
         int var3 = this.field964[var1];
         if (var3 == -1) {
            return null;
         } else {
            class266 var4 = (class266)field943.method394((long)var3);
            if (var4 != null) {
               return var4;
            } else {
               var4 = class84.method341(field913, var3, 0);
               if (null != var4) {
                  field943.method396(var4, (long)var3);
               } else {
                  field892 = true;
               }

               return var4;
            }
         }
      } else {
         return null;
      }
   }

   public class470 method502(class242 var1, int var2, boolean var3, class284 var4, class423 var5, class207 var6) {
      field892 = false;
      int var8;
      int var9;
      if (var3) {
         var8 = this.field938;
         var9 = this.field991;
      } else {
         var8 = this.field936;
         var9 = this.field955;
      }

      if (var8 == 6) {
         if (var5 == null) {
            return null;
         }

         var9 = var5.field3461;
      }

      if (var8 == 0) {
         return null;
      } else if (var8 == 1 && var9 == -1) {
         return null;
      } else {
         long var10 = (long)(var9 + (var8 << 16));
         if (var6 != null) {
            var10 |= var6.field1787 << 20;
         }

         class470 var12 = (class470)field1020.method394(var10);
         if (var12 == null) {
            class26 var13 = null;
            int var14 = 64;
            int var15 = 768;
            switch(var8) {
            case 1:
               var13 = class26.method103(field884, var9, 0);
               break;
            case 2:
               var13 = class421.method2049(var9, (byte)40).method2053((class207)null);
               break;
            case 3:
               var13 = var4 != null ? var4.method1406() : null;
               break;
            case 4:
               class263 var16 = class423.method2062(var9);
               var13 = var16.method1200(10);
               var14 += var16.field2142;
               var15 += var16.field2154;
            case 5:
            default:
               break;
            case 6:
               var13 = class421.method2049(var9, (byte)45).method2053(var6);
            }

            if (null == var13) {
               field892 = true;
               return null;
            }

            var12 = var13.method121(var14, var15, -50, -10, -50);
            field1020.method396(var12, var10);
         }

         if (var1 != null) {
            var12 = var1.method1057(var12, var2);
         }

         return var12;
      }
   }

   public class226 method483(boolean var1) {
      if (-1 == this.field990) {
         var1 = false;
      }

      int var3 = var1 ? this.field990 : this.field927;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((this.field1044 ? 1L : 0L) << 39) + ((this.field934 ? 1L : 0L) << 38) + ((long)this.field932 << 36) + (long)var3 + ((long)this.field997 << 40);
         class226 var6 = (class226)field889.method394(var4);
         if (null != var6) {
            return var6;
         } else {
            class266 var7 = this.method478(var1, (class434)null);
            if (null == var7) {
               return null;
            } else {
               class266 var8 = var7.method1254();
               int[] var9 = new int[var8.field2199];
               int[] var10 = new int[var8.field2199];

               for(int var11 = 0; var11 < var8.field2199; ++var11) {
                  int var12 = 0;
                  int var13 = var8.field2200;

                  int var14;
                  for(var14 = 0; var14 < var8.field2200; ++var14) {
                     if (var8.field2205[var14 + var8.field2200 * var11] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for(var14 = var8.field2200 - 1; var14 >= var12; --var14) {
                     if (0 == var8.field2205[var14 + var8.field2200 * var11]) {
                        var13 = var14 + 1;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new class226(var8.field2200, var8.field2199, var10, var9, var3);
               field889.method396(var6, var4);
               return var6;
            }
         }
      }
   }

   public void method484(int var1, String var2) {
      if (this.field978 == null || this.field978.length <= var1) {
         String[] var4 = new String[var1 + 1];
         if (this.field978 != null) {
            for(int var5 = 0; var5 < this.field978.length; ++var5) {
               var4[var5] = this.field978[var5];
            }
         }

         this.field978 = var4;
      }

      this.field978[var1] = var2;
   }

   public boolean method510() {
      return !this.field893 || 0 == this.field1026 || this.field1026 == 11 || this.field977 || this.field993 == 1338 || this.field1026 == 12;
   }

   public boolean method501() {
      return this.field1026 == 11 || 12 == this.field1026;
   }

   public void method507(String var1, class434 var2, long var3) {
      if (11 == this.field1026 && -1L != var3) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field966 = new class277();
         if (!this.field966.method1369(var1, var2)) {
            this.field966 = null;
         } else {
            if (this.field968 == null || null == this.field969) {
               this.method500();
            }

         }
      }
   }

   void method500() {
      this.field968 = new HashMap();
      this.field969 = new HashMap();
   }

   public void method486(int var1, int var2) {
      if (this.field1026 == 11) {
         if (null == this.field968) {
            this.method500();
         }

         this.field968.put(var1, var2);
      }
   }

   public void method481(String var1, int var2) {
      if (11 == this.field1026) {
         if (this.field969 == null) {
            this.method500();
         }

         this.field969.put(var1, var2);
      }
   }

   public boolean method488() {
      return 2 == this.field948;
   }

   public int method489(String var1) {
      return this.field1026 == 11 && null != this.field966 && this.method488() ? this.field966.method1372(var1) : -1;
   }

   public String method487(String var1) {
      return 11 == this.field1026 && null != this.field966 && this.method488() ? this.field966.method1373(var1) : null;
   }

   public int method490() {
      return this.field969 != null && this.field969.size() > 0 ? 1 : 0;
   }

   public int method491() {
      if (11 == this.field1026 && this.field966 != null && null != this.field969 && !this.field969.isEmpty()) {
         String var2 = this.field966.method1375();
         return null != var2 && this.field969.containsKey(this.field966.method1375()) ? ((Integer)this.field969.get(var2)).intValue() : -1;
      } else {
         return -1;
      }
   }

   public String method492() {
      if (this.field1026 == 11 && this.field966 != null) {
         String var2 = this.field966.method1375();
         Iterator var3 = this.field966.method1376().iterator();

         while(var3.hasNext()) {
            class235 var4 = (class235)var3.next();
            String var5 = String.format("%%%S%%", var4.method1022());
            if (var4.method1023() == 0) {
               var2.replaceAll(var5, Integer.toString(var4.method1025()));
            } else {
               var2.replaceAll(var5, var4.method1024());
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public int[] method493() {
      if (11 == this.field1026 && this.field966 != null) {
         int[] var2 = new int[3];
         int var3 = 0;
         Iterator var4 = this.field966.method1376().iterator();

         while(var4.hasNext()) {
            class235 var5 = (class235)var4.next();
            if (!var5.method1022().equals("user_id")) {
               if (var5.method1023() != 0) {
                  return null;
               }

               var2[var3++] = var5.method1025();
               if (var3 > 3) {
                  return null;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public boolean method506(class434 var1) {
      if (this.field1026 == 11 && null != this.field966) {
         this.field966.method1370(var1);
         if (this.field966.method1371() != this.field948) {
            this.field948 = this.field966.method1371();
            if (this.field948 >= 100) {
               return true;
            }

            if (2 == this.field948) {
               this.method495();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   void method495() {
      this.field1041 = true;
      ArrayList var2 = this.field966.method1380();
      ArrayList var3 = this.field966.method1374();
      int var4 = var2.size() + var3.size();
      this.field1031 = new class120[var4];
      int var5 = 0;

      Iterator var6;
      class120 var8;
      for(var6 = var2.iterator(); var6.hasNext(); this.field1031[var5++] = var8) {
         class459 var7 = (class459)var6.next();
         var8 = class89.method378(5, this, var5, 0, 0, 0, 0, var7.field3806);
         var8.field929 = var7.field3805.method639();
         class102 var9 = new class102(var7.field3805);
         field890.method1096(var8.field929, var9);
      }

      for(var6 = var3.iterator(); var6.hasNext(); this.field1031[var5++] = var8) {
         class378 var10 = (class378)var6.next();
         var8 = class89.method378(4, this, var5, 0, 0, 0, 0, var10.field3187);
         var8.field954 = var10.field3186;
         var8.field953 = ((Integer)this.field968.get(var10.field3188)).intValue();
         var8.field957 = var10.field3189;
         var8.field1018 = var10.field3190;
      }

   }

   public void method504() {
      this.field970 = new class16();

      for(int var2 = 1; var2 <= 12; ++var2) {
         this.field970.field75.method431(var2, 0);
      }

      for(char var3 = 0; var3 < ' '; ++var3) {
         this.field970.field75.method428(var3, 0);
      }

      this.field970.field75.method428('\u0080', 0);
      this.field970.field75.method431(82, 2);
      this.field970.field75.method431(81, 2);
      this.field970.field75.method431(86, 2);
   }

   public class262 method485() {
      return null != this.field970 ? this.field970.field78 : null;
   }

   public class146 method509() {
      return null != this.field970 ? this.field970.field76 : null;
   }

   public class109 method498() {
      return this.field970 != null ? this.field970.field75 : null;
   }

   public class16 method496() {
      return this.field970;
   }

   boolean method508(class262 var1) {
      boolean var3 = false;
      if (null != this.field954 && !this.field954.isEmpty()) {
         var3 |= var1.method1120(class342.method1740(this.field954));
         this.field954 = "";
      }

      if (null != this.field995 && !this.field995.isEmpty()) {
         var3 |= var1.method1194(class342.method1740(this.field995));
         this.field995 = "";
      }

      return var3;
   }

   public boolean method503() {
      class262 var2 = this.method485();
      if (var2 == null) {
         return false;
      } else {
         boolean var3 = false;
         if (!var2.method1189() && this.field953 != -1) {
            int var4 = var2.method1163();
            int var5 = var2.method1164();
            int var6 = var2.method1146();
            int var7 = var2.method1161();
            class58 var8 = this.method505();
            if (var8 != null) {
               var3 |= var2.method1121(var8);
               var3 |= this.method508(var2);
               var3 |= var2.method1126(var4, var5);
               var3 |= var2.method1139(var6, var7);
            }
         } else if (var2.method1189()) {
            var3 |= this.method508(var2);
         }

         var2.method1117();
         return var3;
      }
   }

   static String method511(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         if (var2 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / var1; var5 != 0; ++var4) {
               var5 /= var1;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var0;
               var0 /= var1;
               int var9 = var8 - var0 * var1;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            return new String(var6);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static void method512() {
      if (client.field388) {
         class120 var1 = class483.method2375(class471.field3960, client.field389);
         if (var1 != null && null != var1.field909) {
            class488 var2 = new class488();
            var2.field4067 = var1;
            var2.field4069 = var1.field909;
            class396.method1949(var2);
         }

         client.field390 = -1;
         client.field388 = false;
         class184.method836(var1);
      }
   }
}
