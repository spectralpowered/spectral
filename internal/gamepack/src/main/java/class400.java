import java.util.Iterator;
import java.util.LinkedList;

@ObfInfo(
   name = "in"
)
public abstract class class400 {
   @ObfInfo(
      owner = "in",
      name = "s",
      desc = "Z"
   )
   public static boolean field3373 = true;
   @ObfInfo(
      owner = "in",
      name = "hy",
      desc = "Lnv;"
   )
   static class58 field3376;
   @ObfInfo(
      owner = "in",
      name = "l",
      desc = "Z"
   )
   boolean field3374;
   @ObfInfo(
      owner = "in",
      name = "t",
      desc = "Z"
   )
   boolean field3375;
   @ObfInfo(
      owner = "in",
      name = "n",
      desc = "[[[B"
   )
   byte[][][] field3370;
   @ObfInfo(
      owner = "in",
      name = "k",
      desc = "[[[B"
   )
   byte[][][] field3371;
   @ObfInfo(
      owner = "in",
      name = "a",
      desc = "[[[[Liz;"
   )
   class387[][][][] field3366;
   @ObfInfo(
      owner = "in",
      name = "j",
      desc = "I"
   )
   int field3360 = -1;
   @ObfInfo(
      owner = "in",
      name = "q",
      desc = "I"
   )
   int field3361;
   @ObfInfo(
      owner = "in",
      name = "f",
      desc = "I"
   )
   int field3362;
   @ObfInfo(
      owner = "in",
      name = "m",
      desc = "I"
   )
   int field3364;
   @ObfInfo(
      owner = "in",
      name = "b",
      desc = "I"
   )
   int field3365;
   @ObfInfo(
      owner = "in",
      name = "g",
      desc = "I"
   )
   int field3367 = -1;
   @ObfInfo(
      owner = "in",
      name = "r",
      desc = "I"
   )
   int field3368;
   @ObfInfo(
      owner = "in",
      name = "u",
      desc = "I"
   )
   int field3372;
   @ObfInfo(
      owner = "in",
      name = "o",
      desc = "[[[S"
   )
   short[][][] field3363;
   @ObfInfo(
      owner = "in",
      name = "i",
      desc = "[[[S"
   )
   short[][][] field3369;

   @ObfInfo(
      owner = "in",
      name = "<init>",
      desc = "()V"
   )
   class400() {
      new LinkedList();
      this.field3374 = false;
      this.field3375 = false;
   }

   @ObfInfo(
      owner = "in",
      name = "e",
      desc = "(Lqy;I)V"
   )
   abstract void method1978(class127 var1);

   @ObfInfo(
      owner = "in",
      name = "w",
      desc = "(I)Z"
   )
   boolean method1973() {
      return this.field3374 && this.field3375;
   }

   @ObfInfo(
      owner = "in",
      name = "as",
      desc = "(Lly;I)V"
   )
   void method1974(class274 var1) {
      if (!this.method1973()) {
         byte[] var3 = var1.method1365(this.field3360, this.field3367);
         if (var3 != null) {
            this.method1978(new class127(var3));
            this.field3374 = true;
            this.field3375 = true;
         }

      }
   }

   @ObfInfo(
      owner = "in",
      name = "ad",
      desc = "(I)V"
   )
   void method1980() {
      this.field3369 = (short[][][])null;
      this.field3363 = (short[][][])null;
      this.field3370 = (byte[][][])null;
      this.field3371 = (byte[][][])null;
      this.field3366 = (class387[][][][])null;
      this.field3374 = false;
      this.field3375 = false;
   }

   @ObfInfo(
      owner = "in",
      name = "ao",
      desc = "(IILqy;I)V"
   )
   void method1975(int var1, int var2, class127 var3) {
      int var5 = var3.method547();
      if (var5 != 0) {
         if (0 != (var5 & 1)) {
            this.method1976(var1, var2, var3, var5);
         } else {
            this.method1977(var1, var2, var3, var5);
         }

      }
   }

   @ObfInfo(
      owner = "in",
      name = "am",
      desc = "(IILqy;II)V"
   )
   void method1976(int var1, int var2, class127 var3, int var4) {
      boolean var6 = (var4 & 2) != 0;
      if (var6) {
         this.field3363[0][var1][var2] = field3373 ? (short)var3.method549() : (short)var3.method547();
      }

      this.field3369[0][var1][var2] = field3373 ? (short)var3.method549() : (short)var3.method547();
   }

   @ObfInfo(
      owner = "in",
      name = "av",
      desc = "(IILqy;IB)V"
   )
   void method1977(int var1, int var2, class127 var3, int var4) {
      int var6 = ((var4 & 24) >> 3) + 1;
      boolean var7 = (var4 & 2) != 0;
      boolean var8 = 0 != (var4 & 4);
      this.field3369[0][var1][var2] = field3373 ? (short)var3.method549() : (short)var3.method547();
      int var9;
      int var10;
      int var12;
      if (var7) {
         var9 = var3.method547();

         for(var10 = 0; var10 < var9; ++var10) {
            int var11 = field3373 ? var3.method549() : var3.method547();
            if (var11 != 0) {
               this.field3363[var10][var1][var2] = (short)var11;
               var12 = var3.method547();
               this.field3370[var10][var1][var2] = (byte)(var12 >> 2);
               this.field3371[var10][var1][var2] = (byte)(var12 & 3);
            }
         }
      }

      if (var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.method547();
            if (var10 != 0) {
               class387[] var15 = this.field3366[var9][var1][var2] = new class387[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  int var13 = var3.method560();
                  int var14 = var3.method547();
                  var15[var12] = new class387(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   @ObfInfo(
      owner = "in",
      name = "au",
      desc = "(I)I"
   )
   int method1979() {
      return this.field3362;
   }

   @ObfInfo(
      owner = "in",
      name = "ar",
      desc = "(I)I"
   )
   int method1981() {
      return this.field3368;
   }

   @ObfInfo(
      owner = "in",
      name = "h",
      desc = "(Lly;IIB)[Lra;"
   )
   public static class344[] method1972(class274 var0, int var1, int var2) {
      byte[] var5 = var0.method1365(var1, var2);
      boolean var4;
      if (null == var5) {
         var4 = false;
      } else {
         class85.method354(var5);
         var4 = true;
      }

      return !var4 ? null : class196.method873();
   }

   @ObfInfo(
      owner = "in",
      name = "mk",
      desc = "(S)V"
   )
   static final void method1982() {
      Iterator var1 = class100.field795.iterator();

      while(var1.hasNext()) {
         class152 var2 = (class152)var1.next();
         var2.method705();
      }

      if (class228.field1933 != null) {
         class228.field1933.method83();
      }

   }
}
