public class class85 extends class37 {
   int field967 = 1;
   final class435 field963;
   final class468 field962;
   public byte field966;
   public int field965;
   public String field964 = null;
   public String field968 = null;

   public class85(class468 var1, class435 var2) {
      super(500);
      this.field962 = var1;
      this.field963 = var2;
   }

   class209 method203() {
      return new class221();
   }

   class209[] method206(int var1) {
      return new class221[var1];
   }

   final void method460(String var1) {
      String var4 = class213.method1114(class363.method1754(var1));
      if (null == var4) {
         var4 = "";
      }

      this.field964 = var4;
   }

   final void method461(String var1) {
      String var4 = class213.method1114(class363.method1754(var1));
      if (var4 == null) {
         var4 = "";
      }

      this.field968 = var4;
   }

   public final void method465(class134 var1, int var2) {
      this.method461(var1.method677());
      long var4 = var1.method720();
      long var7 = var4;
      String var6;
      int var9;
      if (var4 > 0L && var4 < 6582952005840035281L) {
         if (var4 % 37L == 0L) {
            var6 = null;
         } else {
            var9 = 0;

            for(long var10 = var4; var10 != 0L; var10 /= 37L) {
               ++var9;
            }

            StringBuilder var12 = new StringBuilder(var9);

            while(var7 != 0L) {
               long var13 = var7;
               var7 /= 37L;
               var12.append(class413.field3553[(int)(var13 - var7 * 37L)]);
            }

            var6 = var12.reverse().toString();
         }
      } else {
         var6 = null;
      }

      this.method460(var6);
      this.field966 = var1.method670();
      short var15;
      if (var2 == 1) {
         var9 = var1.method669();
         var15 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var9 = var1.method727();
         var15 = -1;
      }

      if (var15 != var9) {
         int var11 = var9;
         this.method187();

         for(int var16 = 0; var16 < var11; ++var16) {
            class221 var17 = (class221)this.method194(new class174(var1.method677(), this.field962));
            int var14 = var1.method671();
            var17.method966(var14, ++this.field967 - 1);
            var17.field1979 = var1.method670();
            var1.method677();
            this.method464(var17);
         }

      }
   }

   public final void method462(class134 var1) {
      class174 var3 = new class174(var1.method677(), this.field962);
      int var4 = var1.method671();
      byte var5 = var1.method670();
      boolean var6 = false;
      if (var5 == -128) {
         var6 = true;
      }

      class221 var7;
      if (var6) {
         if (this.method188() == 0) {
            return;
         }

         var7 = (class221)this.method204(var3);
         if (var7 != null && var7.method968() == var4) {
            this.method193(var7);
         }
      } else {
         var1.method677();
         var7 = (class221)this.method204(var3);
         if (null == var7) {
            if (this.method188() > super.field357) {
               return;
            }

            var7 = (class221)this.method194(var3);
         }

         var7.method966(var4, ++this.field967 - 1);
         var7.field1979 = var5;
         this.method464(var7);
      }

   }

   public final void method463() {
      for(int var2 = 0; var2 < this.method188(); ++var2) {
         ((class221)this.method196(var2)).method1138();
      }

   }

   public final void method466() {
      for(int var2 = 0; var2 < this.method188(); ++var2) {
         ((class221)this.method196(var2)).method1135();
      }

   }

   final void method464(class221 var1) {
      if (var1.method1063().equals(this.field963.method2086())) {
         this.field965 = var1.field1979;
      }

   }

   static void method467(class79 var0, int var1, int var2, int var3) {
      if (client.field682 < 50 && class111.field1385.method1345() != 0) {
         if (var0.field909 != null && var1 < var0.field909.length) {
            int var5 = var0.field909[var1];
            if (var5 != 0) {
               int var8 = var5 >> 8;
               int var9 = var5 >> 4 & 7;
               int var10 = var5 & 15;
               client.field683[client.field682] = var8;
               client.field684[client.field682] = var9;
               client.field712[client.field682] = 0;
               client.field492[client.field682] = null;
               int var11 = (var2 - 64) / 128;
               int var12 = (var3 - 64) / 128;
               client.field538[client.field682] = (var12 << 8) + (var11 << 16) + var10;
               ++client.field682;
            }

         }
      }
   }

   static void method468() {
      class341.method1634();
      client.field579[0] = class96.field1101;
      client.field460[0] = "";
      client.field667[0] = 1006;
      client.field581[0] = false;
      client.field573 = 1;
   }
}
