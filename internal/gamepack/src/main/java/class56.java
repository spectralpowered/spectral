import java.io.IOException;
import java.net.Socket;

public class class56 extends class429 {
   static class161 field807;
   class107 field806;
   class312 field805;
   Socket field804;

   public class56(Socket var1, int var2, int var3) throws IOException {
      this.field804 = var1;
      this.field804.setSoTimeout(30000);
      this.field804.setTcpNoDelay(true);
      this.field804.setReceiveBufferSize(65536);
      this.field804.setSendBufferSize(65536);
      this.field806 = new class107(this.field804.getInputStream(), var2);
      this.field805 = new class312(this.field804.getOutputStream(), var3);
   }

   public boolean method2055(int var1) throws IOException {
      return this.field806.method568(var1);
   }

   public int method2052() throws IOException {
      return this.field806.method570();
   }

   public int method2053() throws IOException {
      return this.field806.method569();
   }

   public int method2050(byte[] var1, int var2, int var3) throws IOException {
      return this.field806.method572(var1, var2, var3);
   }

   public void method2051(byte[] var1, int var2, int var3) throws IOException {
      this.field805.method1516(var1, var2, var3);
   }

   public void method2054() {
      this.field805.method1515();

      try {
         this.field804.close();
      } catch (IOException var3) {
         ;
      }

      this.field806.method571();
   }

   protected void finalize() {
      this.method2054();
   }
}
