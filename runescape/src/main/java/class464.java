import java.util.Iterator;

class class464 implements Iterator {
	int field4905;
	// $FF: synthetic field
	final class453 this$0;

	class464(class453 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field4905 < this.this$0.method7561();
	}

	public Object next() {
		int var1 = ++this.field4905 - 1;
		class421 var2 = (class421)this.this$0.field4866.method5280((long)var1);
		return var2 != null ? var2 : this.this$0.method8115(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
