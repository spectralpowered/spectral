import java.util.Comparator;

public abstract class class409 implements Comparator {
	Comparator field4617;

	protected class409() {
	}

	final void method7581(Comparator var1) {
		if (null == this.field4617) {
			this.field4617 = var1;
		} else if (this.field4617 instanceof class409) {
			((class409)this.field4617).method7581(var1);
		}

	}

	protected final int method7584(class412 var1, class412 var2) {
		return null == this.field4617 ? 0 : this.field4617.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
