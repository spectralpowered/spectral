import java.util.zip.Inflater;

public class class485 {
	Inflater field5035;

	public class485() {
		this(-1, 1000000);
	}

	class485(int var1, int var2) {
	}

	public void method8819(class467 var1, byte[] var2) {
		if (var1.field4917[var1.field4915] == 31 && -117 == var1.field4917[1 + var1.field4915]) {
			if (this.field5035 == null) {
				this.field5035 = new Inflater(true);
			}

			try {
				this.field5035.setInput(var1.field4917, var1.field4915 + 10, var1.field4917.length - (var1.field4915 + 10 + 8));
				this.field5035.inflate(var2);
			} catch (Exception var5) {
				this.field5035.reset();
				throw new RuntimeException("");
			}

			this.field5035.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
