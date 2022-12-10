import java.util.Iterator;

public class class372 {
	static Iterator field4437;
	int field4428;
	int field4430;
	int field4434;
	int field4436;
	long field4427;
	long field4431;
	long field4432;
	long field4433;
	long field4435;
	public boolean field4429;

	public class372() {
		this.field4435 = -1L;
		this.field4433 = -1L;
		this.field4429 = false;
		this.field4427 = 0L;
		this.field4431 = 0L;
		this.field4432 = 0L;
		this.field4430 = 0;
		this.field4434 = 0;
		this.field4428 = 0;
		this.field4436 = 0;
	}

	public void method6989() {
		this.field4435 = class74.method1493();
	}

	public void method6967() {
		if (-1L != this.field4435) {
			this.field4431 = class74.method1493() - this.field4435;
			this.field4435 = -1L;
		}

	}

	public void method6968(int var1) {
		this.field4433 = class74.method1493();
		this.field4430 = var1;
	}

	public void method6969() {
		if (this.field4433 != -1L) {
			this.field4427 = class74.method1493() - this.field4433;
			this.field4433 = -1L;
		}

		++this.field4428;
		this.field4429 = true;
	}

	public void method6970() {
		this.field4429 = false;
		this.field4434 = 0;
	}

	static int method6994(byte[] var0, int var1, int var2) {
		int var4 = -1;

		for (int var5 = var1; var5 < var2; ++var5) {
			var4 = var4 >>> 8 ^ class467.field4916[(var4 ^ var0[var5]) & 255];
		}

		var4 = ~var4;
		return var4;
	}

	public void method6965() {
		this.method6969();
	}

	public void method6972(class467 var1) {
		long var3 = this.field4431;
		var3 /= 10L;
		if (var3 < 0L) {
			var3 = 0L;
		} else if (var3 > 65535L) {
			var3 = 65535L;
		}

		var1.method8310((int)var3);
		long var5 = this.field4427;
		var5 /= 10L;
		if (var5 < 0L) {
			var5 = 0L;
		} else if (var5 > 65535L) {
			var5 = 65535L;
		}

		var1.method8310((int)var5);
		long var7 = this.field4432;
		var7 /= 10L;
		if (var7 < 0L) {
			var7 = 0L;
		} else if (var7 > 65535L) {
			var7 = 65535L;
		}

		var1.method8310((int)var7);
		var1.method8310(this.field4430);
		var1.method8310(this.field4434);
		var1.method8310(this.field4428);
		var1.method8310(this.field4436);
	}

	public static class386 method6995(class337 var0, class337 var1, int var2, int var3) {
		byte[] var6 = var0.method6374(var2, var3);
		boolean var5;
		if (null == var6) {
			var5 = false;
		} else {
			class165.method2776(var6);
			var5 = true;
		}

		if (!var5) {
			return null;
		} else {
			byte[] var7 = var1.method6374(var2, var3);
			class386 var9;
			if (null == var7) {
				var9 = null;
			} else {
				class386 var8 = new class386(var7, class477.field5009, class392.field4524, class7.field44, class186.field2042, class271.field3171, class227.field2749);
				class477.field5009 = null;
				class392.field4524 = null;
				class7.field44 = null;
				class186.field2042 = null;
				class271.field3171 = null;
				class227.field2749 = (byte[][])null;
				var9 = var8;
			}

			return var9;
		}
	}
}
