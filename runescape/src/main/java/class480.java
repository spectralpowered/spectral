import java.util.Comparator;

public class class480 implements Comparator {
	final boolean field5017;

	public class480(boolean var1) {
		this.field5017 = var1;
	}

	int method8753(class412 var1, class412 var2) {
		return this.field5017 ? var1.method7627(var2) : var2.method7627(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method8753((class412)var1, (class412)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
