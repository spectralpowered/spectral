import java.util.Iterator;

public class class425 implements Iterator {
	class428 field4732;
	class428 field4734;
	class454 field4731;
	int field4733;

	class425(class454 var1) {
		this.field4734 = null;
		this.field4731 = var1;
		this.method7939();
	}

	void method7939() {
		this.field4732 = this.field4731.field4868[0].field4771;
		this.field4733 = 1;
		this.field4734 = null;
	}

	public Object next() {
		class428 var1;
		if (this.field4732 != this.field4731.field4868[this.field4733 - 1]) {
			var1 = this.field4732;
			this.field4732 = var1.field4771;
			this.field4734 = var1;
			return var1;
		} else {
			do {
				if (this.field4733 >= this.field4731.field4871) {
					return null;
				}

				var1 = this.field4731.field4868[this.field4733++].field4771;
			} while(var1 == this.field4731.field4868[this.field4733 - 1]);

			this.field4732 = var1.field4771;
			this.field4734 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.field4732 != this.field4731.field4868[this.field4733 - 1]) {
			return true;
		} else {
			while (this.field4733 < this.field4731.field4871) {
				if (this.field4731.field4868[this.field4733++].field4771 != this.field4731.field4868[this.field4733 - 1]) {
					this.field4732 = this.field4731.field4868[this.field4733 - 1].field4771;
					return true;
				}

				this.field4732 = this.field4731.field4868[this.field4733 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field4734 == null) {
			throw new IllegalStateException();
		} else {
			this.field4734.method7951();
			this.field4734 = null;
		}
	}
}
