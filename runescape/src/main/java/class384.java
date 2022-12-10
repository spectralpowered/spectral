import java.util.Comparator;

class class384 implements Comparator {
	static int field4486;
	// $FF: synthetic field
	final class373 this$0;

	class384(class373 var1) {
		this.this$0 = var1;
	}

	int method7109(class390 var1, class390 var2) {
		if (var1.field4515 > var2.field4515) {
			return 1;
		} else {
			return var1.field4515 < var2.field4515 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method7109((class390)var1, (class390)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
