import io.spectralpowered.ObfInfo;
import java.util.HashMap;

@ObfInfo(
	name = "ml"
)
public class class154 {
	static {
		new HashMap();
	}

	@ObfInfo(
		owner = "ml",
		name = "e",
		desc = "(Ljava/lang/CharSequence;I)Z"
	)
	public static boolean method715(CharSequence var0) {
		return class108.method426(var0, 10, true);
	}

	@ObfInfo(
		owner = "ml",
		name = "h",
		desc = "(Lly;Lly;ZLnv;I)V"
	)
	public static void method717(class274 var0, class274 var1, boolean var2, class58 var3) {
		class263.field2140 = var0;
		class328.field2595 = var1;
		class203.field1759 = var2;
		class263.field2179 = class263.field2140.method1360(10);
		class439.field3647 = var3;
	}

	@ObfInfo(
		owner = "ml",
		name = "bp",
		desc = "(Lqr;B)Ljava/lang/Object;"
	)
	static Object method716(class185 var0) {
		if (null == var0) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field1689) {
			case 0:
				return class386.field3248[--class161.field1227];
			case 1:
				return class386.field3249[--class386.field3250];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
