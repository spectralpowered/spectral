public class class84 {
   static final byte[] field955 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   class134 field960 = new class134((byte[])null);
   int field953;
   int field954;
   int[] field956;
   int[] field957;
   int[] field959;
   int[] field961;
   long field958;

   class84() {
   }

   class84(byte[] var1) {
      this.method445(var1);
   }

   void method445(byte[] var1) {
      this.field960.field1489 = var1;
      this.field960.field1487 = 10;
      int var2 = this.field960.method671();
      this.field954 = this.field960.method671();
      this.field953 = 500000;
      this.field956 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field960.field1487 += var5) {
         int var4 = this.field960.method717();
         var5 = this.field960.method717();
         if (var4 == 1297379947) {
            this.field956[var3] = this.field960.field1487;
            ++var3;
         }
      }

      this.field958 = 0L;
      this.field961 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field961[var3] = this.field956[var3];
      }

      this.field959 = new int[var2];
      this.field957 = new int[var2];
   }

   void method446() {
      this.field960.field1489 = null;
      this.field956 = null;
      this.field961 = null;
      this.field959 = null;
      this.field957 = null;
   }

   boolean method447() {
      return this.field960.field1489 != null;
   }

   int method448() {
      return this.field961.length;
   }

   void method449(int var1) {
      this.field960.field1487 = this.field961[var1];
   }

   void method450(int var1) {
      this.field961[var1] = this.field960.field1487;
   }

   void method451() {
      this.field960.field1487 = -1;
   }

   void method456(int var1) {
      int var2 = this.field960.method710();
      this.field959[var1] += var2;
   }

   int method452(int var1) {
      int var2 = this.method453(var1);
      return var2;
   }

   int method453(int var1) {
      byte var2 = this.field960.field1489[this.field960.field1487];
      int var5;
      if (var2 < 0) {
         var5 = var2 & 255;
         this.field957[var1] = var5;
         ++this.field960.field1487;
      } else {
         var5 = this.field957[var1];
      }

      if (var5 != 240 && var5 != 247) {
         return this.method458(var1, var5);
      } else {
         int var3 = this.field960.method710();
         if (var5 == 247 && var3 > 0) {
            int var4 = this.field960.field1489[this.field960.field1487] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field960.field1487;
               this.field957[var1] = var4;
               return this.method458(var1, var4);
            }
         }

         this.field960.field1487 += var3;
         return 0;
      }
   }

   int method458(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.field960.method669();
         var4 = this.field960.method710();
         if (var7 == 47) {
            this.field960.field1487 += var4;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.field960.method673();
            var4 -= 3;
            int var6 = this.field959[var1];
            this.field958 += (long)var6 * (long)(this.field953 - var5);
            this.field953 = var5;
            this.field960.field1487 += var4;
            return 2;
         } else {
            this.field960.field1487 += var4;
            return 3;
         }
      } else {
         byte var3 = field955[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.field960.method669() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.field960.method669() << 16;
         }

         return var4;
      }
   }

   long method457(int var1) {
      return this.field958 + (long)var1 * (long)this.field953;
   }

   int method454() {
      int var1 = this.field961.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field961[var4] >= 0 && this.field959[var4] < var3) {
            var2 = var4;
            var3 = this.field959[var4];
         }
      }

      return var2;
   }

   boolean method459() {
      int var1 = this.field961.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field961[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void method455(long var1) {
      this.field958 = var1;
      int var3 = this.field961.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field959[var4] = 0;
         this.field957[var4] = 0;
         this.field960.field1487 = this.field956[var4];
         this.method456(var4);
         this.field961[var4] = this.field960.field1487;
      }

   }
}
