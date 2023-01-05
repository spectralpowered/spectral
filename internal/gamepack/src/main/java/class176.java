@ObfInfo(
   name = "hn"
)
public class class176 extends class139 {
   @ObfInfo(
      owner = "hn",
      name = "lf",
      desc = "Lht;"
   )
   static class251 field1322;
   @ObfInfo(
      owner = "hn",
      name = "b",
      desc = "Lhi;"
   )
   class372 field1321;
   @ObfInfo(
      owner = "hn",
      name = "q",
      desc = "I"
   )
   int field1317;
   @ObfInfo(
      owner = "hn",
      name = "f",
      desc = "I"
   )
   int field1318;
   @ObfInfo(
      owner = "hn",
      name = "r",
      desc = "[I"
   )
   int[] field1319;
   @ObfInfo(
      owner = "hn",
      name = "u",
      desc = "[[I"
   )
   int[][] field1320;

   @ObfInfo(
      owner = "hn",
      name = "<init>",
      desc = "(I[B)V"
   )
   public class176(int var1, byte[] var2) {
      this.field1317 = var1;
      class127 var3 = new class127(var2);
      this.field1318 = var3.method547();
      this.field1319 = new int[this.field1318];
      this.field1320 = new int[this.field1318][];

      int var4;
      for(var4 = 0; var4 < this.field1318; ++var4) {
         this.field1319[var4] = var3.method547();
      }

      for(var4 = 0; var4 < this.field1318; ++var4) {
         this.field1320[var4] = new int[var3.method547()];
      }

      for(var4 = 0; var4 < this.field1318; ++var4) {
         for(int var5 = 0; var5 < this.field1320[var4].length; ++var5) {
            this.field1320[var4][var5] = var3.method547();
         }
      }

      if (var3.field1070 < var3.field1072.length) {
         var4 = var3.method549();
         if (var4 > 0) {
            this.field1321 = new class372(var3, var4);
         }
      }

   }

   @ObfInfo(
      owner = "hn",
      name = "h",
      desc = "(I)I"
   )
   public int method811() {
      return this.field1318;
   }

   @ObfInfo(
      owner = "hn",
      name = "e",
      desc = "(I)Lhi;"
   )
   public class372 method810() {
      return this.field1321;
   }

   @ObfInfo(
      owner = "hn",
      name = "j",
      desc = "(B)V"
   )
   static final void method812() {
      class177 var10000 = (class177)null;
      String var1 = class177.field1506;
      class164.method765(30, "", var1);
   }
}
