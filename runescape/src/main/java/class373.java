import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class373 {
	final class377 field4441;
	final class377 field4443;
	final class383 field4440;
	final int field4444;
	final Comparator field4445;
	final Map field4439;
	final long field4442;

	public class373(int var1, class383 var2) {
		this(-1L, var1, var2);
	}

	class373(long var1, int var3, class383 var4) {
		this.field4445 = new class384(this);
		this.field4442 = var1;
		this.field4444 = var3;
		this.field4440 = var4;
		if (this.field4444 == -1) {
			this.field4439 = new HashMap(64);
			this.field4443 = new class377(64, this.field4445);
			this.field4441 = null;
		} else {
			if (null == this.field4440) {
				throw new IllegalArgumentException("");
			}

			this.field4439 = new HashMap(this.field4444);
			this.field4443 = new class377(this.field4444, this.field4445);
			this.field4441 = new class377(this.field4444);
		}

	}

	boolean method6998() {
		return -1 != this.field4444;
	}

	public Object method7012(Object var1) {
		synchronized(this) {
			if (this.field4442 != -1L) {
				this.method7016();
			}

			class390 var4 = (class390)this.field4439.get(var1);
			if (null == var4) {
				return null;
			} else {
				this.method7001(var4, false);
				return var4.field4517;
			}
		}
	}

	public Object method7000(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4442 != -1L) {
				this.method7016();
			}

			class390 var5 = (class390)this.field4439.get(var1);
			if (var5 != null) {
				Object var9 = var5.field4517;
				var5.field4517 = var2;
				this.method7001(var5, false);
				return var9;
			} else {
				class390 var6;
				if (this.method6998() && this.field4439.size() == this.field4444) {
					var6 = (class390)this.field4441.remove();
					this.field4439.remove(var6.field4516);
					this.field4443.remove(var6);
				}

				var6 = new class390(var2, var1);
				this.field4439.put(var1, var6);
				this.method7001(var6, true);
				return null;
			}
		}
	}

	void method7001(class390 var1, boolean var2) {
		if (!var2) {
			this.field4443.remove(var1);
			if (this.method6998() && !this.field4441.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4515 = System.currentTimeMillis();
		if (this.method6998()) {
			switch(this.field4440.field4481) {
			case 0:
				var1.field4518 = var1.field4515;
				break;
			case 1:
				++var1.field4518;
			}

			this.field4441.add(var1);
		}

		this.field4443.add(var1);
	}

	void method7016() {
		if (this.field4442 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.field4442;

			while (!this.field4443.isEmpty()) {
				class390 var4 = (class390)this.field4443.peek();
				if (var4.field4515 >= var2) {
					return;
				}

				this.field4439.remove(var4.field4516);
				this.field4443.remove(var4);
				if (this.method6998()) {
					this.field4441.remove(var4);
				}
			}

		}
	}

	public void method7013() {
		synchronized(this) {
			this.field4439.clear();
			this.field4443.clear();
			if (this.method6998()) {
				this.field4441.clear();
			}

		}
	}
}
