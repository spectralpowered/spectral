import io.spectralpowered.ObfInfo;
import java.util.Iterator;

@ObfInfo(
	name = "ql"
)
public final class class385 implements Iterable {
	@ObfInfo(
		owner = "ql",
		name = "v",
		desc = "Lpl;"
	)
	class139 field3242;
	@ObfInfo(
		owner = "ql",
		name = "x",
		desc = "Lpl;"
	)
	class139 field3243;
	@ObfInfo(
		owner = "ql",
		name = "e",
		desc = "[Lpl;"
	)
	class139[] field3241;
	@ObfInfo(
		owner = "ql",
		name = "m",
		desc = "I"
	)
	int field3240;
	@ObfInfo(
		owner = "ql",
		name = "h",
		desc = "I"
	)
	int field3244;

	@ObfInfo(
		owner = "ql",
		name = "<init>",
		desc = "(I)V"
	)
	public class385(int var1) {
		this.field3240 = 0;
		this.field3244 = var1;
		this.field3241 = new class139[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class139 var3 = this.field3241[var2] = new class139();
			var3.field1132 = var3;
			var3.field1133 = var3;
		}

	}

	@ObfInfo(
		owner = "ql",
		name = "h",
		desc = "(J)Lpl;"
	)
	public class139 method1897(long var1) {
		class139 var3 = this.field3241[(int)(var1 & (long)(this.field3244 - 1))];

		for (this.field3242 = var3.field1132; this.field3242 != var3; this.field3242 = this.field3242.field1132) {
			if (this.field3242.field1134 == var1) {
				class139 var4 = this.field3242;
				this.field3242 = this.field3242.field1132;
				return var4;
			}
		}

		this.field3242 = null;
		return null;
	}

	@ObfInfo(
		owner = "ql",
		name = "e",
		desc = "(Lpl;J)V"
	)
	public void method1896(class139 var1, long var2) {
		if (var1.field1133 != null) {
			var1.method637();
		}

		class139 var4 = this.field3241[(int)(var2 & (long)(this.field3244 - 1))];
		var1.field1133 = var4.field1133;
		var1.field1132 = var4;
		var1.field1133.field1132 = var1;
		var1.field1132.field1133 = var1;
		var1.field1134 = var2;
	}

	@ObfInfo(
		owner = "ql",
		name = "v",
		desc = "()V"
	)
	public void method1894() {
		for (int var1 = 0; var1 < this.field3244; ++var1) {
			class139 var2 = this.field3241[var1];

			while (true) {
				class139 var3 = var2.field1132;
				if (var3 == var2) {
					break;
				}

				var3.method637();
			}
		}

		this.field3242 = null;
		this.field3243 = null;
	}

	@ObfInfo(
		owner = "ql",
		name = "x",
		desc = "()Lpl;"
	)
	public class139 method1895() {
		this.field3240 = 0;
		return this.method1898();
	}

	@ObfInfo(
		owner = "ql",
		name = "m",
		desc = "()Lpl;"
	)
	public class139 method1898() {
		class139 var1;
		if (this.field3240 > 0 && this.field3243 != this.field3241[this.field3240 - 1]) {
			var1 = this.field3243;
			this.field3243 = var1.field1132;
			return var1;
		} else {
			do {
				if (this.field3240 >= this.field3244) {
					return null;
				}

				var1 = this.field3241[this.field3240++].field1132;
			} while(var1 == this.field3241[this.field3240 - 1]);

			this.field3243 = var1.field1132;
			return var1;
		}
	}

	@ObfInfo(
		owner = "ql",
		name = "iterator",
		desc = "()Ljava/util/Iterator;"
	)
	public Iterator iterator() {
		return new class358(this);
	}
}
