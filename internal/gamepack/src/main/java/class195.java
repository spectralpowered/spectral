@ObfInfo(
   name = "pw"
)
public class class195 extends class139 {
   @ObfInfo(
      owner = "pw",
      name = "dv",
      desc = "Lpw;"
   )
   public class195 field1735;
   @ObfInfo(
      owner = "pw",
      name = "dm",
      desc = "Lpw;"
   )
   public class195 field1737;
   @ObfInfo(
      owner = "pw",
      name = "dw",
      desc = "J"
   )
   public long field1736;

   @ObfInfo(
      owner = "pw",
      name = "do",
      desc = "()V"
   )
   public void method870() {
      if (this.field1735 != null) {
         this.field1735.field1737 = this.field1737;
         this.field1737.field1735 = this.field1735;
         this.field1737 = null;
         this.field1735 = null;
      }
   }
}
