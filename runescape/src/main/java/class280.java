import java.lang.ref.SoftReference;

public class class280 extends class264 {
	SoftReference field3305;

	class280(Object var1, int var2) {
		super(var2);
		this.field3305 = new SoftReference(var1);
	}

	Object method5262() {
		return this.field3305.get();
	}

	boolean method5266() {
		return true;
	}
}
