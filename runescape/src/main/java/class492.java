import java.util.Comparator;

public class class492 implements Comparator {
	final boolean field5068;

	public class492(boolean var1) {
		this.field5068 = var1;
	}

	int method8945(class412 var1, class412 var2) {
		return this.field5068 ? var1.method7628().method8779(var2.method7628()) : var2.method7628().method8779(var1.method7628());
	}

	public int compare(Object var1, Object var2) {
		return this.method8945((class412)var1, (class412)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
