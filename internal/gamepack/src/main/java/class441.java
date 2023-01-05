import java.util.Iterator;
import java.util.LinkedList;

public abstract class class441 {
   public static boolean field3648 = true;
   static class394 field3651;
   boolean field3649;
   boolean field3650;
   byte[][][] field3645;
   byte[][][] field3646;
   class50[][][][] field3641;
   int field3635 = -1;
   int field3636;
   int field3637;
   int field3639;
   int field3640;
   int field3642 = -1;
   int field3643;
   int field3647;
   short[][][] field3638;
   short[][][] field3644;

   class441() {
      new LinkedList();
      this.field3649 = false;
      this.field3650 = false;
   }

   abstract void method2103(class134 var1);

   boolean method2098() {
      return this.field3649 && this.field3650;
   }

   void method2099(class164 var1) {
      if (!this.method2098()) {
         byte[] var3 = var1.method892(this.field3635, this.field3642);
         if (var3 != null) {
            this.method2103(new class134(var3));
            this.field3649 = true;
            this.field3650 = true;
         }

      }
   }

   void method2105() {
      this.field3644 = (short[][][])null;
      this.field3638 = (short[][][])null;
      this.field3645 = (byte[][][])null;
      this.field3646 = (byte[][][])null;
      this.field3641 = (class50[][][][])null;
      this.field3649 = false;
      this.field3650 = false;
   }

   void method2100(int var1, int var2, class134 var3) {
      int var5 = var3.method669();
      if (var5 != 0) {
         if (0 != (var5 & 1)) {
            this.method2101(var1, var2, var3, var5);
         } else {
            this.method2102(var1, var2, var3, var5);
         }

      }
   }

   void method2101(int var1, int var2, class134 var3, int var4) {
      boolean var6 = (var4 & 2) != 0;
      if (var6) {
         this.field3638[0][var1][var2] = field3648 ? (short)var3.method671() : (short)var3.method669();
      }

      this.field3644[0][var1][var2] = field3648 ? (short)var3.method671() : (short)var3.method669();
   }

   void method2102(int var1, int var2, class134 var3, int var4) {
      int var6 = ((var4 & 24) >> 3) + 1;
      boolean var7 = (var4 & 2) != 0;
      boolean var8 = 0 != (var4 & 4);
      this.field3644[0][var1][var2] = field3648 ? (short)var3.method671() : (short)var3.method669();
      int var9;
      int var10;
      int var12;
      if (var7) {
         var9 = var3.method669();

         for(var10 = 0; var10 < var9; ++var10) {
            int var11 = field3648 ? var3.method671() : var3.method669();
            if (var11 != 0) {
               this.field3638[var10][var1][var2] = (short)var11;
               var12 = var3.method669();
               this.field3645[var10][var1][var2] = (byte)(var12 >> 2);
               this.field3646[var10][var1][var2] = (byte)(var12 & 3);
            }
         }
      }

      if (var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.method669();
            if (var10 != 0) {
               class50[] var15 = this.field3641[var9][var1][var2] = new class50[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  int var13 = var3.method682();
                  int var14 = var3.method669();
                  var15[var12] = new class50(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   int method2104() {
      return this.field3637;
   }

   int method2106() {
      return this.field3643;
   }

   public static class161[] method2097(class164 var0, int var1, int var2) {
      byte[] var5 = var0.method892(var1, var2);
      boolean var4;
      if (null == var5) {
         var4 = false;
      } else {
         class212.method1108(var5);
         var4 = true;
      }

      return !var4 ? null : class247.method1226();
   }

   static final void method2107() {
      Iterator var1 = class58.field815.iterator();

      while(var1.hasNext()) {
         class154 var2 = (class154)var1.next();
         var2.method808();
      }

      if (class103.field1350 != null) {
         class103.field1350.method466();
      }

   }
}
