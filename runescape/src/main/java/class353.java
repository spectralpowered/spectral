import java.util.Iterator;

public class class353 implements Iterator {
	class351 field4297;
	class439 field4298;
	class439 field4299;

	class353(class351 var1) {
		this.field4299 = null;
		this.field4297 = var1;
		this.field4298 = this.field4297.field4290.field4798;
		this.field4299 = null;
	}

	public Object next() {
		class439 var1 = this.field4298;
		if (var1 == this.field4297.field4290) {
			var1 = null;
			this.field4298 = null;
		} else {
			this.field4298 = var1.field4798;
		}

		this.field4299 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field4298 != this.field4297.field4290;
	}

	public void remove() {
		if (this.field4299 == null) {
			throw new IllegalStateException();
		} else {
			this.field4299.method7996();
			this.field4299 = null;
		}
	}
}
