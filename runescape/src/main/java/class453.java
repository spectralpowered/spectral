import java.util.Iterator;

public class class453 extends class408 implements class272 {
	final class270 field4866;
	final class337 field4865;
	final int field4864;

	public class453(class335 var1, int var2, class340 var3, class337 var4) {
		super(var1, var3, null != var4 ? var4.method6330(var2) : 0);
		this.field4866 = new class270(64);
		this.field4865 = var4;
		this.field4864 = var2;
	}

	protected class438 method7563(int var1) {
		synchronized(this.field4866) {
			class421 var3 = (class421)this.field4866.method5280((long)var1);
			if (var3 == null) {
				var3 = this.method8115(var1);
				this.field4866.method5283(var3, (long)var1);
			}

			return var3;
		}
	}

	class421 method8115(int var1) {
		byte[] var3 = this.field4865.method6374(this.field4864, var1);
		class421 var4 = new class421(var1);
		if (null != var3) {
			var4.method7983(new class467(var3));
		}

		return var4;
	}

	public void method8109() {
		synchronized(this.field4866) {
			this.field4866.method5279();
		}
	}

	public Iterator iterator() {
		return new class464(this);
	}
}
