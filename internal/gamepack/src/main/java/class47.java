import java.nio.ByteBuffer;

@ObfInfo(
   name = "kh"
)
public class class47 extends class53 {
   @ObfInfo(
      owner = "kh",
      name = "h",
      desc = "Ljava/nio/ByteBuffer;"
   )
   ByteBuffer field562;

   @ObfInfo(
      owner = "kh",
      name = "v",
      desc = "(B)[B"
   )
   byte[] method260() {
      byte[] var2 = new byte[this.field562.capacity()];
      this.field562.position(0);
      this.field562.get(var2);
      return var2;
   }

   @ObfInfo(
      owner = "kh",
      name = "x",
      desc = "([BI)V"
   )
   public void method261(byte[] var1) {
      this.field562 = ByteBuffer.allocateDirect(var1.length);
      this.field562.position(0);
      this.field562.put(var1);
   }
}
