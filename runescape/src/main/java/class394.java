import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class394 {
	class412[] field4542;
	int field4540;
	Comparator field4539;
	HashMap field4541;
	HashMap field4544;
	final int field4543;

	class394(int var1) {
		this.field4540 = 0;
		this.field4539 = null;
		this.field4543 = var1;
		this.field4542 = this.method7316(var1);
		this.field4544 = new HashMap(var1 / 8);
		this.field4541 = new HashMap(var1 / 8);
	}

	public void method7290() {
		this.field4540 = 0;
		Arrays.fill(this.field4542, (Object)null);
		this.field4544.clear();
		this.field4541.clear();
	}

	public int method7291() {
		return this.field4540;
	}

	public boolean method7292() {
		return this.field4543 == this.field4540;
	}

	public boolean method7293(class483 var1) {
		if (!var1.method8773()) {
			return false;
		} else {
			return this.field4544.containsKey(var1) ? true : this.field4541.containsKey(var1);
		}
	}

	public class412 method7314(class483 var1) {
		class412 var3 = this.method7311(var1);
		return var3 != null ? var3 : this.method7296(var1);
	}

	class412 method7311(class483 var1) {
		return !var1.method8773() ? null : (class412)this.field4544.get(var1);
	}

	class412 method7296(class483 var1) {
		return !var1.method8773() ? null : (class412)this.field4541.get(var1);
	}

	public final boolean method7354(class483 var1) {
		class412 var3 = this.method7311(var1);
		if (null == var3) {
			return false;
		} else {
			this.method7298(var3);
			return true;
		}
	}

	final void method7298(class412 var1) {
		int var3 = this.method7304(var1);
		if (var3 != -1) {
			this.method7308(var3);
			this.method7305(var1);
		}
	}

	class412 method7299(class483 var1) {
		return this.method7300(var1, (class483)null);
	}

	class412 method7300(class483 var1, class483 var2) {
		if (this.method7311(var1) != null) {
			throw new IllegalStateException();
		} else {
			class412 var4 = this.method7309();
			var4.method7626(var1, var2);
			this.method7306(var4);
			this.method7307(var4);
			return var4;
		}
	}

	public final class412 method7301(int var1) {
		if (var1 >= 0 && var1 < this.field4540) {
			return this.field4542[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	public final void method7353() {
		if (this.field4539 == null) {
			Arrays.sort(this.field4542, 0, this.field4540);
		} else {
			Arrays.sort(this.field4542, 0, this.field4540, this.field4539);
		}

	}

	final void method7303(class412 var1, class483 var2, class483 var3) {
		this.method7305(var1);
		var1.method7626(var2, var3);
		this.method7307(var1);
	}

	final int method7304(class412 var1) {
		for (int var3 = 0; var3 < this.field4540; ++var3) {
			if (this.field4542[var3] == var1) {
				return var3;
			}
		}

		return -1;
	}

	final void method7305(class412 var1) {
		if (this.field4544.remove(var1.field4625) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.field4626 != null) {
				this.field4541.remove(var1.field4626);
			}

		}
	}

	final void method7306(class412 var1) {
		this.field4542[++this.field4540 - 1] = var1;
	}

	final void method7307(class412 var1) {
		this.field4544.put(var1.field4625, var1);
		if (null != var1.field4626) {
			class412 var3 = (class412)this.field4541.put(var1.field4626, var1);
			if (var3 != null && var3 != var1) {
				var3.field4626 = null;
			}
		}

	}

	final void method7308(int var1) {
		--this.field4540;
		if (var1 < this.field4540) {
			System.arraycopy(this.field4542, var1 + 1, this.field4542, var1, this.field4540 - var1);
		}

	}

	public final void method7294() {
		this.field4539 = null;
	}

	public final void method7355(Comparator var1) {
		if (null == this.field4539) {
			this.field4539 = var1;
		} else if (this.field4539 instanceof class409) {
			((class409)this.field4539).method7581(var1);
		}

	}

	abstract class412 method7309();

	abstract class412[] method7316(int var1);
}
