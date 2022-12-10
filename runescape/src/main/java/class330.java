import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class330 {
	public static Comparator field4166;
	public static Comparator field4169;
	public static Comparator field4170;
	public static Comparator field4171;
	public final List field4167;

	static {
		field4171 = new class327();
		new class358();
		field4166 = new class362();
		field4169 = new class313();
		field4170 = new class336();
	}

	public class330(class467 var1, boolean var2) {
		int var3 = var1.method8328();
		boolean var4 = var1.method8326() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.method8328();
		this.field4167 = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.field4167.add(new class345(var1, var5, var3));
		}

	}

	public void method6265(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.field4167, var1);
		} else {
			Collections.sort(this.field4167, Collections.reverseOrder(var1));
		}

	}

	static final void method6264(class27 var0) {
		var0.field146 = false;
		if (var0.field144 != null) {
			var0.field144.field408 = 0;
		}

		for (class27 var2 = var0.method355(); null != var2; var2 = var0.method359()) {
			method6264(var2);
		}

	}
}
