@ObfInfo(
   name = "pr"
)
public class class315 {
   @ObfInfo(
      owner = "pr",
      name = "m",
      desc = "Lpr;"
   )
   public class315 field2476;
   @ObfInfo(
      owner = "pr",
      name = "x",
      desc = "Lpr;"
   )
   public class315 field2477;

   @ObfInfo(
      owner = "pr",
      name = "h",
      desc = "()V"
   )
   public void method1514() {
      if (this.field2476 != null) {
         this.field2476.field2477 = this.field2477;
         this.field2477.field2476 = this.field2476;
         this.field2477 = null;
         this.field2476 = null;
      }
   }
}
