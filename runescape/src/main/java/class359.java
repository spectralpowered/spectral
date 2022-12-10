import java.util.Iterator;

public class class359 implements Iterator {
	class360 field4340;
	class428 field4338;
	class428 field4339;

	class359(class360 var1) {
		this.field4338 = null;
		this.method6640(var1);
	}

	void method6640(class360 var1) {
		this.field4340 = var1;
		this.method6644();
	}

	void method6644() {
		this.field4339 = this.field4340 != null ? this.field4340.field4341.field4771 : null;
		this.field4338 = null;
	}

	public Object next() {
		class428 var1 = this.field4339;
		if (var1 == this.field4340.field4341) {
			var1 = null;
			this.field4339 = null;
		} else {
			this.field4339 = var1.field4771;
		}

		this.field4338 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field4339 != this.field4340.field4341 && this.field4339 != null;
	}

	public void remove() {
		if (this.field4338 == null) {
			throw new IllegalStateException();
		} else {
			this.field4338.method7951();
			this.field4338 = null;
		}
	}
}
