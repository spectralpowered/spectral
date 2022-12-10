import java.io.IOException;
import java.net.Socket;

public class class410 extends class411 {
	static class469 field4623;
	class402 field4622;
	class414 field4621;
	Socket field4619;

	public class410(Socket var1, int var2, int var3) throws IOException {
		this.field4619 = var1;
		this.field4619.setSoTimeout(30000);
		this.field4619.setTcpNoDelay(true);
		this.field4619.setReceiveBufferSize(65536);
		this.field4619.setSendBufferSize(65536);
		this.field4622 = new class402(this.field4619.getInputStream(), var2);
		this.field4621 = new class414(this.field4619.getOutputStream(), var3);
	}

	public boolean method7616(int var1) throws IOException {
		return this.field4622.method7498(var1);
	}

	public int method7606() throws IOException {
		return this.field4622.method7501();
	}

	public int method7608() throws IOException {
		return this.field4622.method7500();
	}

	public int method7604(byte[] var1, int var2, int var3) throws IOException {
		return this.field4622.method7510(var1, var2, var3);
	}

	public void method7605(byte[] var1, int var2, int var3) throws IOException {
		this.field4621.method7662(var1, var2, var3);
	}

	public void method7609() {
		this.field4621.method7653();

		try {
			this.field4619.close();
		} catch (IOException var3) {
		}

		this.field4622.method7502();
	}

	protected void finalize() {
		this.method7609();
	}
}
