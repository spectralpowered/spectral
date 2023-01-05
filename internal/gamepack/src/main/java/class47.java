import java.nio.ByteBuffer;

public class class47 extends class53 {
   ByteBuffer field562;

   byte[] method260() {
      byte[] var2 = new byte[this.field562.capacity()];
      this.field562.position(0);
      this.field562.get(var2);
      return var2;
   }

   public void method261(byte[] var1) {
      this.field562 = ByteBuffer.allocateDirect(var1.length);
      this.field562.position(0);
      this.field562.put(var1);
   }
}
