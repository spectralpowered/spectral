import java.util.concurrent.Future;

public class class20 {
	static class168 field116;
	static short[] field117;
	String field119;
	Future field122;

	class20(Future var1) {
		this.field122 = var1;
	}

	class20(String var1) {
		this.method288(var1);
	}

	void method288(String var1) {
		if (null == var1) {
			var1 = "";
		}

		this.field119 = var1;
		if (null != this.field122) {
			this.field122.cancel(true);
			this.field122 = null;
		}

	}

	public final String method289() {
		return this.field119;
	}

	public boolean method295() {
		return null != this.field119 || this.field122 == null;
	}

	public final boolean method293() {
		return this.method295() ? true : this.field122.isDone();
	}

	public final class16 method300() {
		if (this.method295()) {
			return new class16(this.field119);
		} else if (!this.method293()) {
			return null;
		} else {
			try {
				return (class16)this.field122.get();
			} catch (Exception var4) {
				String var3 = "Error retrieving REST request reply";
				System.err.println(var3 + "\r\n" + var4);
				this.method288(var3);
				return new class16(var3);
			}
		}
	}

	static final void method302(class466 var0, int var1) {
		int var3 = var0.field4915;
		class87.field820 = 0;
		class61.method1180(var0);
		class307.method6101(var0);
		if (var0.field4915 - var3 != var1) {
			throw new RuntimeException(var0.field4915 - var3 + " " + var1);
		}
	}
}
