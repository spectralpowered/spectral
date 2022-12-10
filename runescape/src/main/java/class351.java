import java.util.Iterator;

public class class351 implements Iterable {
	class439 field4291;
	public class439 field4290;

	public class351() {
		this.field4290 = new class439();
		this.field4290.field4798 = this.field4290;
		this.field4290.field4796 = this.field4290;
	}

	public void method6517() {
		while (this.field4290.field4798 != this.field4290) {
			this.field4290.field4798.method7996();
		}

	}

	public void method6518(class439 var1) {
		if (var1.field4796 != null) {
			var1.method7996();
		}

		var1.field4796 = this.field4290.field4796;
		var1.field4798 = this.field4290;
		var1.field4796.field4798 = var1;
		var1.field4798.field4796 = var1;
	}

	public static void method6529(class439 var0, class439 var1) {
		if (var0.field4796 != null) {
			var0.method7996();
		}

		var0.field4796 = var1;
		var0.field4798 = var1.field4798;
		var0.field4796.field4798 = var0;
		var0.field4798.field4796 = var0;
	}

	public class439 method6520() {
		class439 var1 = this.field4290.field4798;
		if (var1 == this.field4290) {
			return null;
		} else {
			var1.method7996();
			return var1;
		}
	}

	public class439 method6521() {
		return this.method6522((class439)null);
	}

	class439 method6522(class439 var1) {
		class439 var2;
		if (var1 == null) {
			var2 = this.field4290.field4798;
		} else {
			var2 = var1;
		}

		if (var2 == this.field4290) {
			this.field4291 = null;
			return null;
		} else {
			this.field4291 = var2.field4798;
			return var2;
		}
	}

	public class439 method6530() {
		class439 var1 = this.field4291;
		if (var1 == this.field4290) {
			this.field4291 = null;
			return null;
		} else {
			this.field4291 = var1.field4798;
			return var1;
		}
	}

	public Iterator iterator() {
		return new class353(this);
	}
}
