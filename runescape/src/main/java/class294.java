import java.nio.ByteBuffer;

public class class294 extends class309 {
	ByteBuffer field3566;

	public class294() {
	}

	byte[] method6113() {
		byte[] var2 = new byte[this.field3566.capacity()];
		this.field3566.position(0);
		this.field3566.get(var2);
		return var2;
	}

	public void method6114(byte[] var1) {
		this.field3566 = ByteBuffer.allocateDirect(var1.length);
		this.field3566.position(0);
		this.field3566.put(var1);
	}
}
