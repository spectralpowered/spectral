import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "h"
)
public class class399 implements class269 {
	@ObfInfo(
		owner = "h",
		name = "<init>",
		desc = "()V"
	)
	class399() {
	}

	@ObfInfo(
		owner = "h",
		name = "h",
		desc = "(Lqy;)Lqy;"
	)
	public class127 method1276(class127 var1) {
		class127 var2 = new class127(100);
		this.method1971(var1, var2);
		return var2;
	}

	@ObfInfo(
		owner = "h",
		name = "e",
		desc = "(Lqy;Lqy;)V"
	)
	void method1971(class127 var1, class127 var2) {
		class278 var3 = new class278(var1);
		class369 var4 = new class369(var3);

		long var5;
		for (var5 = 0L; !var4.method1819(var3.method1390(), var3.method1389(), var5); ++var5) {
		}

		var2.method536(var5);
	}
}
