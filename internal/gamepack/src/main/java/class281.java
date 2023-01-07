import io.spectralpowered.ObfInfo;
import java.lang.ref.SoftReference;

@ObfInfo(
	name = "jt"
)
public class class281 extends class88 {
	@ObfInfo(
		owner = "jt",
		name = "h",
		desc = "Ljava/lang/ref/SoftReference;"
	)
	SoftReference field2334;

	@ObfInfo(
		owner = "jt",
		name = "<init>",
		desc = "(Ljava/lang/Object;I)V"
	)
	class281(Object var1, int var2) {
		super(var2);
		this.field2334 = new SoftReference(var1);
	}

	@ObfInfo(
		owner = "jt",
		name = "h",
		desc = "()Ljava/lang/Object;"
	)
	Object method375() {
		return this.field2334.get();
	}

	@ObfInfo(
		owner = "jt",
		name = "e",
		desc = "()Z"
	)
	boolean method376() {
		return true;
	}
}
