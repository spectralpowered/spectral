import java.util.Collection;
import java.util.Iterator;

public class class360 implements Iterable, Collection {
	class428 field4341;
	class428 field4342;

	public class360() {
		this.field4341 = new class428();
		this.field4341.field4771 = this.field4341;
		this.field4341.field4772 = this.field4341;
	}

	public void method6661() {
		while (this.field4341.field4771 != this.field4341) {
			this.field4341.field4771.method7951();
		}

	}

	public void method6672(class428 var1) {
		if (var1.field4772 != null) {
			var1.method7951();
		}

		var1.field4772 = this.field4341.field4772;
		var1.field4771 = this.field4341;
		var1.field4772.field4771 = var1;
		var1.field4771.field4772 = var1;
	}

	public void method6662(class428 var1) {
		if (var1.field4772 != null) {
			var1.method7951();
		}

		var1.field4772 = this.field4341;
		var1.field4771 = this.field4341.field4771;
		var1.field4772.field4771 = var1;
		var1.field4771.field4772 = var1;
	}

	public static void method6727(class428 var0, class428 var1) {
		if (var0.field4772 != null) {
			var0.method7951();
		}

		var0.field4772 = var1;
		var0.field4771 = var1.field4771;
		var0.field4772.field4771 = var0;
		var0.field4771.field4772 = var0;
	}

	public class428 method6705() {
		return this.method6664((class428)null);
	}

	class428 method6664(class428 var1) {
		class428 var2;
		if (var1 == null) {
			var2 = this.field4341.field4771;
		} else {
			var2 = var1;
		}

		if (var2 == this.field4341) {
			this.field4342 = null;
			return null;
		} else {
			this.field4342 = var2.field4771;
			return var2;
		}
	}

	public class428 method6665() {
		class428 var1 = this.field4342;
		if (var1 == this.field4341) {
			this.field4342 = null;
			return null;
		} else {
			this.field4342 = var1.field4771;
			return var1;
		}
	}

	int method6666() {
		int var1 = 0;

		for (class428 var2 = this.field4341.field4771; var2 != this.field4341; var2 = var2.field4771) {
			++var1;
		}

		return var1;
	}

	public boolean method6667() {
		return this.field4341.field4771 == this.field4341;
	}

	class428[] method6668() {
		class428[] var1 = new class428[this.method6666()];
		int var2 = 0;

		for (class428 var3 = this.field4341.field4771; var3 != this.field4341; var3 = var3.field4771) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public Iterator iterator() {
		return new class359(this);
	}

	public int size() {
		return this.method6666();
	}

	public boolean isEmpty() {
		return this.method6667();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method6668();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (class428 var3 = this.field4341.field4771; var3 != this.field4341; var3 = var3.field4771) {
			var1[var2++] = var3;
		}

		return var1;
	}

	boolean method6703(class428 var1) {
		this.method6672(var1);
		return true;
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.method6661();
	}

	public boolean add(Object var1) {
		return this.method6703((class428)var1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}
}
