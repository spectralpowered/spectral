public class class219 {
   public static int field2420;
   int[] field2422 = new int[8];
   short[] field2421 = new short[8];

   public class219(class272 var1) {
      int var2 = 0;
      if (var1.method1290()) {
         var2 = var1.method1293().length;
         System.arraycopy(var1.method1293(), 0, this.field2422, 0, var2);
         System.arraycopy(var1.method1296(), 0, this.field2421, 0, var2);
      }

      for(int var3 = var2; var3 < 8; ++var3) {
         this.field2422[var3] = -1;
         this.field2421[var3] = -1;
      }

   }

   public int[] method1126() {
      return this.field2422;
   }

   public short[] method1127() {
      return this.field2421;
   }

   public void method1128(int var1, int var2, short var3) {
      this.field2422[var1] = var2;
      this.field2421[var1] = var3;
   }

   public void method1129(int[] var1, short[] var2) {
      this.field2422 = var1;
      this.field2421 = var2;
   }

   public static class81 method1130(int var0, String var1, class22 var2, int var3) {
      class81 var5 = class189.method982(class165.field1734, client.field483.field3459);
      var5.field933.method666(0);
      int var6 = var5.field933.field1487;
      var5.field933.method666(var0);
      String var7 = var1.toLowerCase();
      byte var8 = 0;
      if (var7.startsWith(class96.field1312)) {
         var8 = 0;
         var1 = var1.substring(class96.field1312.length());
      } else if (var7.startsWith(class96.field1209)) {
         var8 = 1;
         var1 = var1.substring(class96.field1209.length());
      } else if (var7.startsWith(class96.field1318)) {
         var8 = 2;
         var1 = var1.substring(class96.field1318.length());
      } else if (var7.startsWith(class96.field1213)) {
         var8 = 3;
         var1 = var1.substring(class96.field1213.length());
      } else if (var7.startsWith(class96.field1230)) {
         var8 = 4;
         var1 = var1.substring(class96.field1230.length());
      } else if (var7.startsWith(class96.field1217)) {
         var8 = 5;
         var1 = var1.substring(class96.field1217.length());
      } else if (var7.startsWith(class96.field1219)) {
         var8 = 6;
         var1 = var1.substring(class96.field1219.length());
      } else if (var7.startsWith(class96.field1221)) {
         var8 = 7;
         var1 = var1.substring(class96.field1221.length());
      } else if (var7.startsWith(class96.field1223)) {
         var8 = 8;
         var1 = var1.substring(class96.field1223.length());
      } else if (var7.startsWith(class96.field1225)) {
         var8 = 9;
         var1 = var1.substring(class96.field1225.length());
      } else if (var7.startsWith(class96.field1227)) {
         var8 = 10;
         var1 = var1.substring(class96.field1227.length());
      } else if (var7.startsWith(class96.field1142)) {
         var8 = 11;
         var1 = var1.substring(class96.field1142.length());
      } else if (var2 != class22.field155) {
         if (var7.startsWith(class96.field1208)) {
            var8 = 0;
            var1 = var1.substring(class96.field1208.length());
         } else if (var7.startsWith(class96.field1141)) {
            var8 = 1;
            var1 = var1.substring(class96.field1141.length());
         } else if (var7.startsWith(class96.field1062)) {
            var8 = 2;
            var1 = var1.substring(class96.field1062.length());
         } else if (var7.startsWith(class96.field1214)) {
            var8 = 3;
            var1 = var1.substring(class96.field1214.length());
         } else if (var7.startsWith(class96.field1216)) {
            var8 = 4;
            var1 = var1.substring(class96.field1216.length());
         } else if (var7.startsWith(class96.field1218)) {
            var8 = 5;
            var1 = var1.substring(class96.field1218.length());
         } else if (var7.startsWith(class96.field1131)) {
            var8 = 6;
            var1 = var1.substring(class96.field1131.length());
         } else if (var7.startsWith(class96.field1054)) {
            var8 = 7;
            var1 = var1.substring(class96.field1054.length());
         } else if (var7.startsWith(class96.field1261)) {
            var8 = 8;
            var1 = var1.substring(class96.field1261.length());
         } else if (var7.startsWith(class96.field1226)) {
            var8 = 9;
            var1 = var1.substring(class96.field1226.length());
         } else if (var7.startsWith(class96.field1064)) {
            var8 = 10;
            var1 = var1.substring(class96.field1064.length());
         } else if (var7.startsWith(class96.field1243)) {
            var8 = 11;
            var1 = var1.substring(class96.field1243.length());
         }
      }

      var7 = var1.toLowerCase();
      byte var9 = 0;
      if (var7.startsWith(class96.field1231)) {
         var9 = 1;
         var1 = var1.substring(class96.field1231.length());
      } else if (var7.startsWith(class96.field1158)) {
         var9 = 2;
         var1 = var1.substring(class96.field1158.length());
      } else if (var7.startsWith(class96.field1235)) {
         var9 = 3;
         var1 = var1.substring(class96.field1235.length());
      } else if (var7.startsWith(class96.field1154)) {
         var9 = 4;
         var1 = var1.substring(class96.field1154.length());
      } else if (var7.startsWith(class96.field1239)) {
         var9 = 5;
         var1 = var1.substring(class96.field1239.length());
      } else if (var2 != class22.field155) {
         if (var7.startsWith(class96.field1232)) {
            var9 = 1;
            var1 = var1.substring(class96.field1232.length());
         } else if (var7.startsWith(class96.field1170)) {
            var9 = 2;
            var1 = var1.substring(class96.field1170.length());
         } else if (var7.startsWith(class96.field1211)) {
            var9 = 3;
            var1 = var1.substring(class96.field1211.length());
         } else if (var7.startsWith(class96.field1123)) {
            var9 = 4;
            var1 = var1.substring(class96.field1123.length());
         } else if (var7.startsWith(class96.field1240)) {
            var9 = 5;
            var1 = var1.substring(class96.field1240.length());
         }
      }

      var5.field933.method666(var8);
      var5.field933.method666(var9);
      class107.method573(var5.field933, var1);
      if (var0 == class127.field1467.method2118()) {
         var5.field933.method666(var3);
      }

      var5.field933.method708(var5.field933.field1487 - var6);
      return var5;
   }
}
