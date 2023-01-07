import io.spectralpowered.ObfInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfInfo(
	name = "lr"
)
public class class348 {
	@ObfInfo(
		owner = "lr",
		name = "v",
		desc = "Ljava/util/Comparator;"
	)
	public static Comparator field2879;
	@ObfInfo(
		owner = "lr",
		name = "x",
		desc = "Ljava/util/Comparator;"
	)
	public static Comparator field2881;
	@ObfInfo(
		owner = "lr",
		name = "m",
		desc = "Ljava/util/Comparator;"
	)
	public static Comparator field2882;
	@ObfInfo(
		owner = "lr",
		name = "e",
		desc = "Ljava/util/Comparator;"
	)
	public static Comparator field2883;
	@ObfInfo(
		owner = "lr",
		name = "h",
		desc = "Ljava/util/List;"
	)
	public final List field2880;

	static {
		field2883 = new class452();
		new class209();
		field2879 = new class375();
		field2881 = new class350();
		field2882 = new class183();
	}

	@ObfInfo(
		owner = "lr",
		name = "<init>",
		desc = "(Lqy;Z)V"
	)
	public class348(class127 var1, boolean var2) {
		int var3 = var1.method549();
		boolean var4 = var1.method547() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.method549();
		this.field2880 = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.field2880.add(new class258(var1, var5, var3));
		}

	}

	@ObfInfo(
		owner = "lr",
		name = "h",
		desc = "(Ljava/util/Comparator;ZI)V"
	)
	public void method1756(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.field2880, var1);
		} else {
			Collections.sort(this.field2880, Collections.reverseOrder(var1));
		}

	}

	@ObfInfo(
		owner = "lr",
		name = "ab",
		desc = "(Laa;B)V"
	)
	static final void method1755(class437 var0) {
		var0.field3620 = false;
		if (var0.field3618 != null) {
			var0.field3618.field4081 = 0;
		}

		for (class437 var2 = var0.method2168(); null != var2; var2 = var0.method2171()) {
			method1755(var2);
		}

	}

	@ObfInfo(
		owner = "lr",
		name = "ak",
		desc = "(IB)I"
	)
	static int method1757(int var0) {
		return (int)((Math.log((double)var0) / class386.field3258 - 7.0D) * 256.0D);
	}
}
