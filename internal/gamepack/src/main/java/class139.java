@ObfInfo(
   name = "pl"
)
public class class139 {
   @ObfInfo(
      owner = "pl",
      name = "gc",
      desc = "Lpl;"
   )
   public class139 field1132;
   @ObfInfo(
      owner = "pl",
      name = "gw",
      desc = "Lpl;"
   )
   public class139 field1133;
   @ObfInfo(
      owner = "pl",
      name = "gt",
      desc = "J"
   )
   public long field1134;

   @ObfInfo(
      owner = "pl",
      name = "fd",
      desc = "()V"
   )
   public void method637() {
      if (this.field1133 != null) {
         this.field1133.field1132 = this.field1132;
         this.field1132.field1133 = this.field1133;
         this.field1132 = null;
         this.field1133 = null;
      }
   }

   @ObfInfo(
      owner = "pl",
      name = "fr",
      desc = "()Z"
   )
   public boolean method636() {
      return this.field1133 != null;
   }
}
