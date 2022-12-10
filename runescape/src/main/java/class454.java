import java.util.Iterator;

public final class class454 implements Iterable {
	class428 field4869;
	class428 field4870;
	class428[] field4868;
	int field4867;
	int field4871;

	public class454(int var1) {
		this.field4867 = 0;
		this.field4871 = var1;
		this.field4868 = new class428[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class428 var3 = this.field4868[var2] = new class428();
			var3.field4771 = var3;
			var3.field4772 = var3;
		}

	}

	public class428 method8135(long var1) {
		class428 var3 = this.field4868[(int)(var1 & (long)(this.field4871 - 1))];

		for (this.field4869 = var3.field4771; this.field4869 != var3; this.field4869 = this.field4869.field4771) {
			if (this.field4869.field4773 == var1) {
				class428 var4 = this.field4869;
				this.field4869 = this.field4869.field4771;
				return var4;
			}
		}

		this.field4869 = null;
		return null;
	}

	public void method8133(class428 var1, long var2) {
		if (var1.field4772 != null) {
			var1.method7951();
		}

		class428 var4 = this.field4868[(int)(var2 & (long)(this.field4871 - 1))];
		var1.field4772 = var4.field4772;
		var1.field4771 = var4;
		var1.field4772.field4771 = var1;
		var1.field4771.field4772 = var1;
		var1.field4773 = var2;
	}

	public void method8122() {
		for (int var1 = 0; var1 < this.field4871; ++var1) {
			class428 var2 = this.field4868[var1];

			while (true) {
				class428 var3 = var2.field4771;
				if (var3 == var2) {
					break;
				}

				var3.method7951();
			}
		}

		this.field4869 = null;
		this.field4870 = null;
	}

	public class428 method8123() {
		this.field4867 = 0;
		return this.method8137();
	}

	public class428 method8137() {
		class428 var1;
		if (this.field4867 > 0 && this.field4870 != this.field4868[this.field4867 - 1]) {
			var1 = this.field4870;
			this.field4870 = var1.field4771;
			return var1;
		} else {
			do {
				if (this.field4867 >= this.field4871) {
					return null;
				}

				var1 = this.field4868[this.field4867++].field4771;
			} while(var1 == this.field4868[this.field4867 - 1]);

			this.field4870 = var1.field4771;
			return var1;
		}
	}

	public Iterator iterator() {
		return new class425(this);
	}
}
