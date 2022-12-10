import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class445 implements class456 {
	Map field4834;
	final class488 field4835;

	public class445(class488 var1) {
		this.field4835 = var1;
	}

	public int method8162(int var1) {
		if (null != this.field4834) {
			class493 var3 = (class493)this.field4834.get(var1);
			if (var3 != null) {
				return (Integer)var3.field5070;
			}
		}

		return (Integer)this.field4835.method8824(var1);
	}

	public void method8159(int var1, Object var2) {
		if (null == this.field4834) {
			this.field4834 = new HashMap();
			this.field4834.put(var1, new class493(var1, var2));
		} else {
			class493 var4 = (class493)this.field4834.get(var1);
			if (var4 == null) {
				this.field4834.put(var1, new class493(var1, var2));
			} else {
				var4.field5070 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4834 == null ? Collections.emptyList().iterator() : this.field4834.values().iterator();
	}
}
