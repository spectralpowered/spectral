import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class388 implements Iterator {
	static int field4509;
	class377 field4506;
	int field4507;
	int field4508;

	class388(class377 var1) {
		this.field4507 = 0;
		this.field4508 = this.field4506.field4458;
		this.field4506 = var1;
	}

	public boolean hasNext() {
		return this.field4507 < this.field4506.field4455;
	}

	public Object next() {
		if (this.field4506.field4458 != this.field4508) {
			throw new ConcurrentModificationException();
		} else if (this.field4507 < this.field4506.field4455) {
			Object var1 = this.field4506.field4459[this.field4507].field4368;
			++this.field4507;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	static int method7237(int var0, class65 var1, boolean var2) {
		class290 var4;
		if (var0 != CS2Opcodes.CC_CALLONRESIZE && var0 != CS2Opcodes.IF_CALLONRESIZE) {
			int var8;
			if (var0 == CS2Opcodes.CC_TRIGGEROP) {
				var4 = var2 ? class187.field2044 : class341.field4273;
				var8 = class69.field579[--class94.field920];
				if (var8 >= 1 && var8 <= 10) {
					class100 var6 = new class100(var8, var4.field3492, var4.field3400, var4.field3404);
					class69.field586.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == CS2Opcodes.IF_TRIGGEROP) {
				class94.field920 -= 3;
				int var9 = class69.field579[class94.field920];
				var8 = class69.field579[1 + class94.field920];
				int var10 = class69.field579[class94.field920 + 2];
				if (var10 >= 1 && var10 <= 10) {
					class100 var7 = new class100(var10, var9, var8, class180.method2988(var9).field3404);
					class69.field586.add(var7);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (class69.field593 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var4 = class180.method2988(class69.field579[--class94.field920]);
			} else {
				var4 = var2 ? class187.field2044 : class341.field4273;
			}

			if (var4.field3525 == null) {
				return 0;
			} else {
				class80 var5 = new class80();
				var5.field733 = var4;
				var5.field735 = var4.field3525;
				var5.field741 = 1 + class69.field593;
				client.field1764.method6572(var5);
				return 1;
			}
		}
	}
}
