import io.spectralpowered.ObfInfo;
import java.util.Iterator;

@ObfInfo(
	name = "qv"
)
class class279 implements Iterator {
	@ObfInfo(
		owner = "qv",
		name = "h",
		desc = "I"
	)
	int field2333;
	// $FF: synthetic field
	@ObfInfo(
		owner = "qv",
		name = "this$0",
		desc = "Lqk;"
	)
	final class449 this$0;

	@ObfInfo(
		owner = "qv",
		name = "<init>",
		desc = "(Lqk;)V"
	)
	class279(class449 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(
		owner = "qv",
		name = "hasNext",
		desc = "()Z"
	)
	public boolean hasNext() {
		return this.field2333 < this.this$0.method20();
	}

	@ObfInfo(
		owner = "qv",
		name = "next",
		desc = "()Ljava/lang/Object;"
	)
	public Object next() {
		int var1 = ++this.field2333 - 1;
		class481 var2 = (class481)this.this$0.field3740.method441((long)var1);
		return var2 != null ? var2 : this.this$0.method2236(var1);
	}

	@ObfInfo(
		owner = "qv",
		name = "remove",
		desc = "()V"
	)
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
