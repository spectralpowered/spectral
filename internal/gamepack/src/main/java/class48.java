import java.io.IOException;
import java.net.Socket;

@ObfInfo(
   name = "ot"
)
public class class48 extends class160 {
   @ObfInfo(
      owner = "ot",
      name = "cy",
      desc = "Lra;"
   )
   static class344 field566;
   @ObfInfo(
      owner = "ot",
      name = "e",
      desc = "Lol;"
   )
   class157 field565;
   @ObfInfo(
      owner = "ot",
      name = "v",
      desc = "Lox;"
   )
   class454 field564;
   @ObfInfo(
      owner = "ot",
      name = "h",
      desc = "Ljava/net/Socket;"
   )
   Socket field563;

   @ObfInfo(
      owner = "ot",
      name = "<init>",
      desc = "(Ljava/net/Socket;II)V"
   )
   public class48(Socket var1, int var2, int var3) throws IOException {
      this.field563 = var1;
      this.field563.setSoTimeout(30000);
      this.field563.setTcpNoDelay(true);
      this.field563.setReceiveBufferSize(65536);
      this.field563.setSendBufferSize(65536);
      this.field565 = new class157(this.field563.getInputStream(), var2);
      this.field564 = new class454(this.field563.getOutputStream(), var3);
   }

   @ObfInfo(
      owner = "ot",
      name = "h",
      desc = "(II)Z"
   )
   public boolean method735(int var1) throws IOException {
      return this.field565.method722(var1);
   }

   @ObfInfo(
      owner = "ot",
      name = "e",
      desc = "(B)I"
   )
   public int method732() throws IOException {
      return this.field565.method724();
   }

   @ObfInfo(
      owner = "ot",
      name = "v",
      desc = "(I)I"
   )
   public int method733() throws IOException {
      return this.field565.method723();
   }

   @ObfInfo(
      owner = "ot",
      name = "x",
      desc = "([BIII)I"
   )
   public int method730(byte[] var1, int var2, int var3) throws IOException {
      return this.field565.method726(var1, var2, var3);
   }

   @ObfInfo(
      owner = "ot",
      name = "m",
      desc = "([BIIB)V"
   )
   public void method731(byte[] var1, int var2, int var3) throws IOException {
      this.field564.method2245(var1, var2, var3);
   }

   @ObfInfo(
      owner = "ot",
      name = "q",
      desc = "(I)V"
   )
   public void method734() {
      this.field564.method2244();

      try {
         this.field563.close();
      } catch (IOException var3) {
         ;
      }

      this.field565.method725();
   }

   @ObfInfo(
      owner = "ot",
      name = "finalize",
      desc = "()V"
   )
   protected void finalize() {
      this.method734();
   }
}
