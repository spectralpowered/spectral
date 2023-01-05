@ObfInfo(
   name = "ae"
)
public class class124 {
   @ObfInfo(
      owner = "ae",
      name = "e",
      desc = "I"
   )
   int field1063;
   @ObfInfo(
      owner = "ae",
      name = "h",
      desc = "I"
   )
   int field1064;
   @ObfInfo(
      owner = "ae",
      name = "x",
      desc = "[I"
   )
   int[] field1062;
   @ObfInfo(
      owner = "ae",
      name = "v",
      desc = "[I"
   )
   int[] field1065;

   @ObfInfo(
      owner = "ae",
      name = "<init>",
      desc = "()V"
   )
   class124() {
      class370.method1826(16);
      this.field1064 = class370.method1832() != 0 ? class370.method1826(4) + 1 : 1;
      if (class370.method1832() != 0) {
         class370.method1826(8);
      }

      class370.method1826(2);
      if (this.field1064 > 1) {
         this.field1063 = class370.method1826(4);
      }

      this.field1065 = new int[this.field1064];
      this.field1062 = new int[this.field1064];

      for(int var1 = 0; var1 < this.field1064; ++var1) {
         class370.method1826(8);
         this.field1065[var1] = class370.method1826(8);
         this.field1062[var1] = class370.method1826(8);
      }

   }
}
