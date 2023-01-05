import java.nio.ByteBuffer;

public class class65 extends class440 {
   ByteBuffer field834;

   byte[] method2095() {
      byte[] var2 = new byte[this.field834.capacity()];
      this.field834.position(0);
      this.field834.get(var2);
      return var2;
   }

   public void method2096(byte[] var1) {
      this.field834 = ByteBuffer.allocateDirect(var1.length);
      this.field834.position(0);
      this.field834.put(var1);
   }
}
