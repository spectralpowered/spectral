import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class377 extends AbstractQueue {
	class366[] field4459;
	int field4455;
	int field4458;
	Map field4454;
	final Comparator field4457;

	public class377(int var1) {
		this(var1, (Comparator)null);
	}

	public class377(int var1, Comparator var2) {
		this.field4458 = 0;
		this.field4459 = new class366[var1];
		this.field4454 = new HashMap();
		this.field4457 = var2;
	}

	void method7085() {
		int var2 = 1 + (this.field4459.length << 1);
		this.field4459 = (class366[])((class366[])Arrays.copyOf(this.field4459, var2));
	}

	public int size() {
		return this.field4455;
	}

	public boolean offer(Object var1) {
		if (this.field4454.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4458;
			int var2 = this.field4455;
			if (var2 >= this.field4459.length) {
				this.method7085();
			}

			++this.field4455;
			if (var2 == 0) {
				this.field4459[0] = new class366(var1, 0);
				this.field4454.put(var1, this.field4459[0]);
			} else {
				this.field4459[var2] = new class366(var1, var2);
				this.field4454.put(var1, this.field4459[var2]);
				this.method7077(var2);
			}

			return true;
		}
	}

	public Object peek() {
		return this.field4455 == 0 ? null : this.field4459[0].field4368;
	}

	public Object poll() {
		if (0 == this.field4455) {
			return null;
		} else {
			++this.field4458;
			Object var1 = this.field4459[0].field4368;
			this.field4454.remove(var1);
			--this.field4455;
			if (this.field4455 == 0) {
				this.field4459[this.field4455] = null;
			} else {
				this.field4459[0] = this.field4459[this.field4455];
				this.field4459[0].field4369 = 0;
				this.field4459[this.field4455] = null;
				this.method7078(0);
			}

			return var1;
		}
	}

	public boolean remove(Object var1) {
		class366 var2 = (class366)this.field4454.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4458;
			--this.field4455;
			if (this.field4455 == var2.field4369) {
				this.field4459[this.field4455] = null;
				return true;
			} else {
				class366 var3 = this.field4459[this.field4455];
				this.field4459[this.field4455] = null;
				this.field4459[var2.field4369] = var3;
				this.field4459[var2.field4369].field4369 = var2.field4369;
				this.method7078(var2.field4369);
				if (var3 == this.field4459[var2.field4369]) {
					this.method7077(var2.field4369);
				}

				return true;
			}
		}
	}

	void method7077(int var1) {
		class366 var3;
		int var4;
		for (var3 = this.field4459[var1]; var1 > 0; var1 = var4) {
			var4 = var1 - 1 >>> 1;
			class366 var5 = this.field4459[var4];
			if (this.field4457 != null) {
				if (this.field4457.compare(var3.field4368, var5.field4368) >= 0) {
					break;
				}
			} else if (((Comparable)var3.field4368).compareTo(var5.field4368) >= 0) {
				break;
			}

			this.field4459[var1] = var5;
			this.field4459[var1].field4369 = var1;
		}

		this.field4459[var1] = var3;
		this.field4459[var1].field4369 = var1;
	}

	void method7078(int var1) {
		class366 var3 = this.field4459[var1];

		int var9;
		for (int var4 = this.field4455 >>> 1; var1 < var4; var1 = var9) {
			int var5 = 1 + (var1 << 1);
			class366 var6 = this.field4459[var5];
			int var7 = 2 + (var1 << 1);
			class366 var8 = this.field4459[var7];
			if (this.field4457 != null) {
				if (var7 < this.field4455 && this.field4457.compare(var6.field4368, var8.field4368) > 0) {
					var9 = var7;
				} else {
					var9 = var5;
				}
			} else if (var7 < this.field4455 && ((Comparable)var6.field4368).compareTo(var8.field4368) > 0) {
				var9 = var7;
			} else {
				var9 = var5;
			}

			if (null != this.field4457) {
				if (this.field4457.compare(var3.field4368, this.field4459[var9].field4368) <= 0) {
					break;
				}
			} else if (((Comparable)var3.field4368).compareTo(this.field4459[var9].field4368) <= 0) {
				break;
			}

			this.field4459[var1] = this.field4459[var9];
			this.field4459[var1].field4369 = var1;
		}

		this.field4459[var1] = var3;
		this.field4459[var1].field4369 = var1;
	}

	public boolean contains(Object var1) {
		return this.field4454.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (null != this.field4457) {
			Arrays.sort(var1, this.field4457);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class388(this);
	}
}
