public class class412 implements Comparable {
	class483 field4625;
	class483 field4626;

	class412() {
	}

	public class483 method7628() {
		return this.field4625;
	}

	public String method7624() {
		return null == this.field4625 ? "" : this.field4625.method8771();
	}

	public String method7636() {
		return this.field4626 == null ? "" : this.field4626.method8771();
	}

	void method7626(class483 var1, class483 var2) {
		if (null == var1) {
			throw new NullPointerException();
		} else {
			this.field4625 = var1;
			this.field4626 = var2;
		}
	}

	public int method7627(class412 var1) {
		return this.field4625.method8779(var1.field4625);
	}

	public int compareTo(Object var1) {
		return this.method7627((class412)var1);
	}
}
