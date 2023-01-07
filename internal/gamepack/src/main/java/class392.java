import io.spectralpowered.ObfInfo;
import java.util.Comparator;

@ObfInfo(
	name = "os"
)
public abstract class class392 implements Comparator {
	@ObfInfo(
		owner = "os",
		name = "e",
		desc = "Ljava/util/Comparator;"
	)
	Comparator field3281;

	@ObfInfo(
		owner = "os",
		name = "<init>",
		desc = "()V"
	)
	protected class392() {
	}

	@ObfInfo(
		owner = "os",
		name = "b",
		desc = "(Ljava/util/Comparator;I)V"
	)
	final void method1917(Comparator var1) {
		if (null == this.field3281) {
			this.field3281 = var1;
		} else if (this.field3281 instanceof class392) {
			((class392)this.field3281).method1917(var1);
		}

	}

	@ObfInfo(
		owner = "os",
		name = "j",
		desc = "(Lov;Lov;I)I"
	)
	protected final int method1918(class368 var1, class368 var2) {
		return null == this.field3281 ? 0 : this.field3281.compare(var1, var2);
	}

	@ObfInfo(
		owner = "os",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
